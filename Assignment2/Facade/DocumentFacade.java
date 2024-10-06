package Assignment2.Facade;

import Assignment2.Bridge.RenderEngine;
import Assignment2.Bridge.SimpleDocumentRenderer;
import Assignment2.Decorator.WatermarkDecorator;
import Assignment2.Document;
import Assignment2.Flyweight.DocumentFactory;

public class DocumentFacade {

    public void displayDocument(String title) {
        Document document = DocumentFactory.getDocument(title);
        document.display();
    }

    public void displayDocumentWithWatermark(String title) {
        Document document = DocumentFactory.getDocument(title);
        Document watermarkedDocument = new WatermarkDecorator(document);
        watermarkedDocument.display();
    }

    public void renderDocument(String title, RenderEngine engine) {
        Document document = DocumentFactory.getDocument(title);
        SimpleDocumentRenderer renderer = new SimpleDocumentRenderer(engine);
        renderer.render(title);
    }
}
