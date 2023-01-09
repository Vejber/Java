package ООП.L2.Interface;

import ООП.L2.Document.TextDocument;

public interface Saveable {
    void SaveAs(TextDocument document, String path);
}
