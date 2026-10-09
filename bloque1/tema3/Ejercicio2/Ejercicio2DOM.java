import javax.xml.parsers.*;
import org.w3c.dom.*;

public class Ejercicio2DOM {
    public static void main(String[] args) {
        try {
            DocumentBuilderFactory factory = DocumentBuilderFactory.newInstance(); //Abrimos y leemos el XML
            DocumentBuilder builder = factory.newDocumentBuilder();
            Document doc = builder.parse("ordenadores.xml");

            // Buscamos todos los ordenadores
            NodeList lista = doc.getElementsByTagName("ordenador");

            for (int i = 0; i < lista.getLength(); i++) {    // Recorremos cada ordenador
                Element ordenador = (Element) lista.item(i);

                System.out.println("Ordenador "
                        + ordenador.getAttribute("id"));

                // obtener hijos
                NodeList hijos = ordenador.getChildNodes();
                int total = 0;

                // Recorremos hijos
                for (int j = 0; j < hijos.getLength(); j++) {
                    Node nodo = hijos.item(j);

                    // Solo mostramos etiquetas XML
                    if (nodo.getNodeType() == Node.ELEMENT_NODE) {
                        System.out.println(nodo.getNodeName() + ": "
                                + nodo.getTextContent());
                        total++;
                    }
                }

                // Mostrar num hijos
                System.out.println("Total de hijos: " + total);
                System.out.println();
            }

            // final
            System.out.println("Total de ordenadores: "
                    + lista.getLength());

        } catch (Exception e) {
            System.out.println("Error al leer el XML");
        }
    }
}