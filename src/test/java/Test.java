import maow.esdf.api.io.ESDFReader;
import maow.esdf.api.io.ESDFWriter;
import maow.esdf.api.model.Document;

import java.io.IOException;

public class Test {
    public static void main(String[] args) throws IOException {
        final ESDFReader er = new ESDFReader("Test.esdf");
        final Document doc = er.getDocument();
        final ESDFWriter ew = new ESDFWriter("TestWritten.esdf");
        ew.writeDocument(doc);
        ew.flush();
        ew.close();
    }
}
