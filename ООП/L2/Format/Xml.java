package ООП.L2.Format;

import java.io.FileWriter;
import java.io.IOException;

import ООП.L2.Document.TextDocument;

public class Xml extends TextFormat {

    @Override
    public void SaveAs(TextDocument document, String path) {
        try (FileWriter writer = new FileWriter(path + ".doc", false)) {
            writer.write("<XML Format>\n");
            writer.write(document.getDataXml());
            writer.flush();
        } catch (IOException ex) {

            System.out.println(ex.getMessage());
        }
    }
}
