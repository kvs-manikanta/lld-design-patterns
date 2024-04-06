package org.example.abstractFactoryDocument.printer;

import org.example.abstractFactoryDocument.DocumentType;
import org.example.abstractFactoryDocument.processor.DocumentProcessor;

public abstract class DocumentPrinter {

    private final DocumentProcessor processor;

    public DocumentPrinter(DocumentProcessor processor) {
        this.processor = processor;
    }

    public DocumentProcessor getProcessor() {
        return processor;
    }

    public abstract void printDocument();

    public abstract DocumentType supportsType();

}