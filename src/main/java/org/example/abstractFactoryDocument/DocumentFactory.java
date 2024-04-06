package org.example.abstractFactoryDocument;

import org.example.abstractFactoryDocument.parser.DocumentParser;
import org.example.abstractFactoryDocument.printer.DocumentPrinter;
import org.example.abstractFactoryDocument.processor.DocumentProcessor;

public abstract class DocumentFactory {
    public abstract DocumentType supportsType();

    //Define the factory methods which will be overridden in the specific Factory beans
    public abstract DocumentParser createDocumentParser(String path);
    public abstract DocumentPrinter createDocumentPrinter(DocumentProcessor processor);
    public abstract DocumentProcessor createDocumentProcessor(String documentName);
}
