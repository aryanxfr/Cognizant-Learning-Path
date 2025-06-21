package factory;

import word.WordDocument;
import word.WordDocumentImplementation;

public class WordDocumentFactory extends DocumentFactory{
    public WordDocument createDocument(){
        return new WordDocumentImplementation();
    }
}
