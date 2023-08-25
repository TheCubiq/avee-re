package com.daaw;

import android.util.Xml;
import java.io.InputStream;
import java.util.List;
import org.xmlpull.v1.XmlPullParser;
/* loaded from: classes.dex */
public class gz1<T, V extends List<T>> {

    /* renamed from: c */
    public static final String f11860c = null;

    /* renamed from: a */
    public InterfaceC1490a<T> f11861a;

    /* renamed from: b */
    public w40<V> f11862b;

    /* renamed from: com.daaw.gz1$a */
    /* loaded from: classes.dex */
    public interface InterfaceC1490a<T> {
        /* renamed from: a */
        T mo13429a(String str, String str2, int i, String str3);
    }

    public gz1(InterfaceC1490a<T> interfaceC1490a, w40<V> w40Var) {
        this.f11861a = interfaceC1490a;
        this.f11862b = w40Var;
    }

    /* renamed from: a */
    public V m21135a(InputStream inputStream, wf1 wf1Var) {
        try {
            XmlPullParser newPullParser = Xml.newPullParser();
            newPullParser.setFeature("http://xmlpull.org/v1/doc/features.html#process-namespaces", false);
            newPullParser.setInput(inputStream, null);
            newPullParser.nextTag();
            return m21133c(newPullParser);
        } finally {
            inputStream.close();
        }
    }

    /* renamed from: b */
    public final T m21134b(XmlPullParser xmlPullParser) {
        xmlPullParser.require(2, f11860c, "entry");
        String str = null;
        String str2 = null;
        String str3 = null;
        String str4 = null;
        while (xmlPullParser.next() != 3) {
            if (xmlPullParser.getEventType() == 2) {
                String name = xmlPullParser.getName();
                if (name.equals("server_name")) {
                    str = m21131e(xmlPullParser, name);
                } else if (name.equals("listen_url")) {
                    str2 = m21131e(xmlPullParser, name);
                } else if (name.equals("bitrate")) {
                    str3 = m21131e(xmlPullParser, name);
                } else if (name.equals("genre")) {
                    str4 = m21131e(xmlPullParser, name);
                } else {
                    m21130f(xmlPullParser);
                }
            }
        }
        return this.f11861a.mo13429a(str, str2, br1.m25886w(str3), str4);
    }

    /* renamed from: c */
    public final V m21133c(XmlPullParser xmlPullParser) {
        V mo3478a = this.f11862b.mo3478a();
        xmlPullParser.require(2, f11860c, "directory");
        while (xmlPullParser.next() != 3) {
            if (xmlPullParser.getEventType() == 2) {
                if (xmlPullParser.getName().equals("entry")) {
                    mo3478a.add(m21134b(xmlPullParser));
                } else {
                    m21130f(xmlPullParser);
                }
            }
        }
        return mo3478a;
    }

    /* renamed from: d */
    public final String m21132d(XmlPullParser xmlPullParser) {
        if (xmlPullParser.next() == 4) {
            String text = xmlPullParser.getText();
            xmlPullParser.nextTag();
            return text;
        }
        return "";
    }

    /* renamed from: e */
    public final String m21131e(XmlPullParser xmlPullParser, String str) {
        String str2 = f11860c;
        xmlPullParser.require(2, str2, str);
        String m21132d = m21132d(xmlPullParser);
        xmlPullParser.require(3, str2, str);
        return m21132d;
    }

    /* renamed from: f */
    public final void m21130f(XmlPullParser xmlPullParser) {
        if (xmlPullParser.getEventType() != 2) {
            throw new IllegalStateException();
        }
        int i = 1;
        while (i != 0) {
            int next = xmlPullParser.next();
            if (next == 2) {
                i++;
            } else if (next == 3) {
                i--;
            }
        }
    }
}
