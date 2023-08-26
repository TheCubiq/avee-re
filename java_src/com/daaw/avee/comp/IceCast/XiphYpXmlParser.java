package com.daaw.avee.comp.IceCast;

import android.util.Xml;
import com.daaw.avee.Common.Func.Func;
import com.daaw.avee.Common.StatusMsg;
import com.daaw.avee.Common.Utils;
import java.io.IOException;
import java.io.InputStream;
import java.util.List;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;
/* loaded from: classes.dex */
public class XiphYpXmlParser<T, V extends List<T>> {
    private static final String ns = null;
    private EntryFactory<T> entryFactory;
    private Func<V> listFactory;

    /* loaded from: classes.dex */
    public interface EntryFactory<T> {
        T createEntry(String str, String str2, int i, String str3);
    }

    public XiphYpXmlParser(EntryFactory<T> entryFactory, Func<V> func) {
        this.entryFactory = entryFactory;
        this.listFactory = func;
    }

    public V parse(InputStream inputStream, StatusMsg statusMsg) throws XmlPullParserException, IOException {
        try {
            XmlPullParser newPullParser = Xml.newPullParser();
            newPullParser.setFeature("http://xmlpull.org/v1/doc/features.html#process-namespaces", false);
            newPullParser.setInput(inputStream, null);
            newPullParser.nextTag();
            return readFeed(newPullParser);
        } finally {
            inputStream.close();
        }
    }

    private V readFeed(XmlPullParser xmlPullParser) throws XmlPullParserException, IOException {
        V onInvoke = this.listFactory.onInvoke();
        xmlPullParser.require(2, ns, "directory");
        while (xmlPullParser.next() != 3) {
            if (xmlPullParser.getEventType() == 2) {
                if (xmlPullParser.getName().equals("entry")) {
                    onInvoke.add(readEntry(xmlPullParser));
                } else {
                    skip(xmlPullParser);
                }
            }
        }
        return onInvoke;
    }

    private T readEntry(XmlPullParser xmlPullParser) throws XmlPullParserException, IOException {
        xmlPullParser.require(2, ns, "entry");
        String str = null;
        String str2 = null;
        String str3 = null;
        String str4 = null;
        while (xmlPullParser.next() != 3) {
            if (xmlPullParser.getEventType() == 2) {
                String name = xmlPullParser.getName();
                if (name.equals("server_name")) {
                    str = readTitle(xmlPullParser, name);
                } else if (name.equals("listen_url")) {
                    str2 = readTitle(xmlPullParser, name);
                } else if (name.equals("bitrate")) {
                    str3 = readTitle(xmlPullParser, name);
                } else if (name.equals("genre")) {
                    str4 = readTitle(xmlPullParser, name);
                } else {
                    skip(xmlPullParser);
                }
            }
        }
        return this.entryFactory.createEntry(str, str2, Utils.strToIntSafe(str3), str4);
    }

    private String readTitle(XmlPullParser xmlPullParser, String str) throws IOException, XmlPullParserException {
        xmlPullParser.require(2, ns, str);
        String readText = readText(xmlPullParser);
        xmlPullParser.require(3, ns, str);
        return readText;
    }

    private String readText(XmlPullParser xmlPullParser) throws IOException, XmlPullParserException {
        if (xmlPullParser.next() == 4) {
            String text = xmlPullParser.getText();
            xmlPullParser.nextTag();
            return text;
        }
        return "";
    }

    private void skip(XmlPullParser xmlPullParser) throws XmlPullParserException, IOException {
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
