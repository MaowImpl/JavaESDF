package maow.esdf.api.io;

import maow.esdf.api.model.Document;
import maow.esdf.internal.ESDFLexer;
import maow.esdf.internal.ESDFParser;
import maow.esdf.internal.visitor.DocumentVisitor;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.CharStreams;
import org.antlr.v4.runtime.CommonTokenStream;

import java.io.*;
import java.nio.file.Path;

public class ESDFReader {
    private final ESDFParser.DocContext ctx;

    public ESDFReader(InputStream is) throws IOException {
        final CharStream stream = CharStreams.fromStream(is);
        final ESDFLexer lexer = new ESDFLexer(stream);
        final CommonTokenStream tokens = new CommonTokenStream(lexer);
        final ESDFParser parser = new ESDFParser(tokens);
        this.ctx = parser.doc();
    }

    public ESDFReader(File file) throws IOException {
        this(new FileInputStream(file));
    }

    public ESDFReader(Path path) throws IOException {
        this(path.toFile());
    }

    public ESDFReader(String filepath) throws IOException {
        this(new File(filepath));
    }

    public Document getDocument() {
        final DocumentVisitor dv = new DocumentVisitor();
        return dv.visitDoc(ctx);
    }
}
