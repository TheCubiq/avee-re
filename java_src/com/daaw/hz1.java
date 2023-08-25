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

    /* renamed from: a */
    public transient pe1 f13069a = null;

    /* renamed from: b */
    public final List<C2486ox> f13070b = new ArrayList();

    /* renamed from: c */
    public final tf0 f13071c = new tf0();

    @Override // com.daaw.oe1
    /* renamed from: a */
    public pe1 mo2137a() {
        return this.f13069a;
    }

    @Override // com.daaw.oe1
    /* renamed from: b */
    public void mo2136b(OutputStream outputStream, String str) {
        Document newDocument = DocumentBuilderFactory.newInstance().newDocumentBuilder().newDocument();
        int i = 0;
        newDocument.setStrictErrorChecking(false);
        Element createElement = newDocument.createElement("xml");
        newDocument.appendChild(createElement);
        for (C2486ox c2486ox : this.f13070b) {
            if (c2486ox.m13901a() != null) {
                Element createElement2 = newDocument.createElement(Integer.toString(i));
                createElement2.setAttribute("filename", c2486ox.m13901a());
                createElement.appendChild(createElement2);
                c2486ox.m13900b();
                i++;
            }
        }
        Element createElement3 = newDocument.createElement("info");
        createElement3.setAttribute("creation_day", this.f13071c.m9211b());
        createElement3.setAttribute("modified_day", this.f13071c.m9209d());
        createElement3.setAttribute("author", this.f13071c.m9212a());
        createElement3.setAttribute("player", this.f13071c.m9208e());
        createElement3.setAttribute("player_version", this.f13071c.m9207f());
        createElement3.setAttribute("kpl_version", this.f13071c.m9210c());
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

    /* renamed from: c */
    public List<C2486ox> m20321c() {
        return this.f13070b;
    }
}
