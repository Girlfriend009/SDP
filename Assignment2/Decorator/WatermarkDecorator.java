package Assignment2.Decorator;

import Assignment2.Document;

public class WatermarkDecorator extends DocumentDecorator {
    public WatermarkDecorator(Document decoratedDocument) {
        super(decoratedDocument);
    }

    @Override
    public void display() {
        decoratedDocument.display();
        addWatermark();
    }

    private void addWatermark() {
        System.out.println("Adding watermark to the document.");
    }
}
