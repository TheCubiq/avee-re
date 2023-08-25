package com.daaw;

import android.util.Xml;
import java.io.InputStream;
import java.util.List;
import org.xmlpull.v1.XmlPullParser;
/* loaded from: classes.dex */
public class gz1<T, V extends List<T>> {
    public static final String c = null;
    public a<T> a;
    public w40<V> b;

    /* loaded from: classes.dex */
    public interface a<T> {
        T a(String str, String str2, int i, String str3);
    }

    public gz1(a<T> aVar, w40<V> w40Var) {
        this.a = aVar;
        this.b = w40Var;
    }

    public V a(InputStream inputStream, wf1 wf1Var) {
        try {
            XmlPullParser newPullParser = Xml.newPullParser();
            newPullParser.setFeature("http://xmlpull.org/v1/doc/features.html#process-namespaces", false);
            newPullParser.setInput(inputStream, null);
            newPullParser.nextTag();
            return c(newPullParser);
        } finally {
            inputStream.close();
        }
    }

    public final T b(XmlPullParser xmlPullParser) {
        xmlPullParser.require(2, c, "entry");
        String str = null;
        String str2 = null;
        String str3 = null;
        String str4 = null;
        while (xmlPullParser.next() != 3) {
            if (xmlPullParser.getEventType() == 2) {
                String name = xmlPullParser.getName();
                if (name.equals("server_name")) {
                    str = e(xmlPullParser, name);
                } else if (name.equals("listen_url")) {
                    str2 = e(xmlPullParser, name);
                } else if (name.equals("bitrate")) {
                    str3 = e(xmlPullParser, name);
                } else if (name.equals("genre")) {
                    str4 = e(xmlPullParser, name);
                } else {
                    f(xmlPullParser);
                }
            }
        }
        return this.a.a(str, str2, br1.w(str3), str4);
    }

    public final V c(XmlPullParser xmlPullParser) {
        V a2 = this.b.a();
        xmlPullParser.require(2, c, "directory");
        while (xmlPullParser.next() != 3) {
            if (xmlPullParser.getEventType() == 2) {
                if (xmlPullParser.getName().equals("entry")) {
                    a2.add(b(xmlPullParser));
                } else {
                    f(xmlPullParser);
                }
            }
        }
        return a2;
    }

    public final String d(XmlPullParser xmlPullParser) {
        if (xmlPullParser.next() == 4) {
            String text = xmlPullParser.getText();
            xmlPullParser.nextTag();
            return text;
        }
        return "";
    }

    public final String e(XmlPullParser xmlPullParser, String str) {
        String str2 = c;
        xmlPullParser.require(2, str2, str);
        String d = d(xmlPullParser);
        xmlPullParser.require(3, str2, str);
        return d;
    }

    public final void f(XmlPullParser xmlPullParser) {
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
