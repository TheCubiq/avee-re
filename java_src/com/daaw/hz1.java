package com.daaw;

import java.io.OutputStream;
import java.util.ArrayList;
import java.util.List;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.transform.Transformer;
import javax.xml.transform.TransformerFactory;
import javax.xml.transform.dom.DOMSource;
import javax.xml.transform.stream.StreamResult;
import org.w3c.dom.Document;
import org.w3c.dom.Element;
/* loaded from: classes.dex */
public class hz1 implements oe1 {
    public transient pe1 a = null;
    public final List<ox> b = new ArrayList();
    public final tf0 c = new tf0();

    @Override // com.daaw.oe1
    public pe1 a() {
        return this.a;
    }

    @Override // com.daaw.oe1
    public void b(OutputStream outputStream, String str) {
        Document newDocument = DocumentBuilderFactory.newInstance().newDocumentBuilder().newDocument();
        int i = 0;
        newDocument.setStrictErrorChecking(false);
        Element createElement = newDocument.createElement("xml");
        newDocument.appendChild(createElement);
        for (ox oxVar : this.b) {
            if (oxVar.a() != null) {
                Element createElement2 = newDocument.createElement(Integer.toString(i));
                createElement2.setAttribute("filename", oxVar.a());
                createElement.appendChild(createElement2);
                oxVar.b();
                i++;
            }
        }
        Element createElement3 = newDocument.createElement("info");
        createElement3.setAttribute("creation_day", this.c.b());
        createElement3.setAttribute("modified_day", this.c.d());
        createElement3.setAttribute("author", this.c.a());
        createElement3.setAttribute("player", this.c.e());
        createElement3.setAttribute("player_version", this.c.f());
        createElement3.setAttribute("kpl_version", this.c.c());
        createElement.appendChild(createElement3);
        DOMSource dOMSource = new DOMSource(newDocument);
        StreamResult streamResult = new StreamResult(outputStream);
        Transformer newTransformer = TransformerFactory.newInstance().newTransformer();
        newTransformer.setOutputProperty("omit-xml-declaration", "yes");
        newTransformer.setOutputProperty("indent", "yes");
        if (str != null) {
            newTransformer.setOutputProperty("encoding", str);
        }
        newTransformer.transform(dOMSource, streamResult);
        outputStream.flush();
    }

    public List<ox> c() {
        return this.b;
    }
}
