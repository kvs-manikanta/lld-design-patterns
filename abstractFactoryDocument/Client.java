package org.example.abstractFactoryDocument;

import org.example.abstractFactoryDocument.processor.DocumentProcessor;

public class Client {
    public static void main(String[] args) {
        Primary primary=new Primary();
        DocumentFactory documentFactory= primary.createFactoryObject(DocumentType.TEXT);

        DocumentProcessor documentProcessor=documentFactory.createDocumentProcessor("Project Document");

        documentProcessor.processDocument();
    }
}
