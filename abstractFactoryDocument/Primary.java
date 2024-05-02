package org.example.abstractFactoryDocument;

public class Primary {

    public DocumentFactory createFactoryObject(DocumentType documentType)
    {
        return switch (documentType)
        {
            case TEXT -> new TextDocumentFactory();
            case SPREAD_SHEET -> new SpreadsheetDocumentFactory();
            default -> throw new IllegalArgumentException("Unsupported Document");
        };
    }
}
