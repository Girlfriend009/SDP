package Assignment2.Flyweight;

import Assignment2.Document;
import Assignment2.RealDocument;

import java.util.HashMap;
import java.util.Map;

// Фабрика для создания и переиспользования документов
public class DocumentFactory {
    private static final Map<String, Document> documentMap = new HashMap<>();

    public static Document getDocument(String title) {
        Document document = documentMap.get(title);
        if (document == null) {
            document = new RealDocument(title); // Здесь используется RealDocument
            documentMap.put(title, document);
        }
        return document;
    }
}
