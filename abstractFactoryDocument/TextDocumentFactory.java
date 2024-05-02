package org.example.abstractFactoryDocument;

import org.example.abstractFactoryDocument.parser.DocumentParser;
import org.example.abstractFactoryDocument.parser.TextDocumentParser;
import org.example.abstractFactoryDocument.printer.DocumentPrinter;
import org.example.abstractFactoryDocument.printer.TextDocumentPrinter;
import org.example.abstractFactoryDocument.processor.DocumentProcessor;
import org.example.abstractFactoryDocument.processor.TextDocumentProcessor;

public class TextDocumentFactory extends DocumentFactory{

    @Override
    public DocumentType supportsType()
    {
        return DocumentType.TEXT;
    }

    @Override
    public DocumentParser createDocumentParser(String path)
    {
        return new TextDocumentParser(path);
    }

    @Override
    public DocumentPrinter createDocumentPrinter(DocumentProcessor processor)
    {
        return new TextDocumentPrinter(processor);
    }

    @Override
    public DocumentProcessor createDocumentProcessor(String documentName)
    {
        return new TextDocumentProcessor(documentName);
    }
}
