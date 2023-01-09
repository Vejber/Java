package ООП.L2.Document;

public class TextDocument {

    StringBuilder sb;

    public TextDocument() {
        sb = new StringBuilder();
    }

    public TextDocument(String data) {
        this();
        addAllText(data);
    }

    public void addAllText(String text) {
        sb.append(text + "\n");
    }

    public void addAllLines(String[] lines) {
        for (String line : lines) {
            addAllText(line);
            // sb.append(line);
        }
    }

    // public void addAllText(String ... data){
    // for (String line : data) {
    // sb.append(line);
    // //addAllText(line);
    // }
    // }

    public String getData() {
        // String txtStr = sb.toString();
        // sb.delete(0, sb.length());
        // return txtStr;
        return sb.toString();
    }

    public String getDataJSON() {
        String[] str = sb.toString().split(",");
        sb.append("{\n");
        for (String i : str) {
            String[] keyValue = i.split("=");
            if (i.equals(str[str.length - 1])) {
                sb.append('"');
                sb.append(keyValue[0]);
                sb.append('"');
                sb.append(':');
                sb.append(' ');
                sb.append(keyValue[1]);
            } else {
                sb.append('"');
                sb.append(keyValue[0]);
                sb.append('"');
                sb.append(':');
                sb.append(' ');
                sb.append(keyValue[1]);
                sb.append(',');
                sb.append('\n');
            }
        }
        sb.append("}\n");
        // String jsonStr = sb.toString();
        // sb.delete(0, sb.length());
        // return jsonStr;
        return sb.toString();
    }

    // <?xml version="1.0" encoding="utf-8" ?>
    // <students>
    // <student>
    // <name>Иван Иванов</name>
    // <grade>4.8</grade>
    // </student>
    // <student>
    // <name>Мария Кузнецова</name>
    // <grade>5.0</grade>
    // </student>
    // <student>
    // <name>Степан Кузьмин</name>
    // <grade>3.6</grade>
    // </student>
    // </students>
    public String getDataXml() {
        // sb.append(getDataXml());
        String[] str = sb.toString().split(","); // [Иван Иванов=4.8, Мария Кузнецова=5.0, Степан Кузьмин=3.6];
        sb.append("<?xml version='1.0' encoding='utf-8' ?>\n");
        sb.append("<students>");
        for (String i : str) { // [Иван Иванов=4.8]
            String[] keyValue = i.split("="); // [Иван Иванов, 4.8]
            sb.append("<student>\n");
            sb.append("<name>");
            sb.append(keyValue[0]);
            sb.append("</name>\n");
            sb.append("<grade>");
            // if (keyValue.length >= 2) {
            sb.append(keyValue[1]);
            // }
            sb.append("</grade>\n");
            sb.append("</student>\n");
        }
        sb.append("</students>\n");
        // String xmlStr = sb.toString();
        // sb.delete(0, sb.length());
        // return xmlStr;
        return sb.toString();
    }

}
