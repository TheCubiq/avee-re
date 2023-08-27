package com.daaw.avee.comp.Shoutcast;

import android.util.Xml;
import com.daaw.avee.Common.Func.Func;
import com.daaw.avee.Common.Func.Func1;
import com.daaw.avee.Common.StatusMsg;
import com.daaw.avee.Common.Utils;
import com.google.android.exoplayer2.text.ttml.TtmlNode;
import com.google.android.exoplayer2.upstream.DataSchemeDataSource;
import com.google.android.gms.measurement.api.AppMeasurementSdk;
import java.io.IOException;
import java.io.InputStream;
import java.io.StringReader;
import java.util.List;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;
/* loaded from: classes.dex */
public class ShoutcastYpXmlParser<G, GList extends List<G>, TStation, VStation extends List<TStation>> {
    static boolean debug = false;
    private static final String ns = null;
    private EntryFactory<G> entryFactory;
    private EntryFactoryStation<TStation> entryFactoryStation;
    private Func1<G, GList> listFactory;
    private Func<VStation> listFactoryStation;

    /* loaded from: classes.dex */
    public interface EntryFactory<T> {
        T createEntry(String str, String str2);
    }

    /* loaded from: classes.dex */
    public interface EntryFactoryStation<TStation> {
        TStation createEntry(String str, String str2, int i, String str3, String str4, String[] strArr);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes.dex */
    public interface ReadElementListener<T1, T2, R> {
        R Invoke(T1 t1, T2 t2) throws XmlPullParserException, IOException;
    }

    public ShoutcastYpXmlParser(EntryFactory<G> entryFactory, Func1<G, GList> func1, EntryFactoryStation<TStation> entryFactoryStation, Func<VStation> func) {
        this.entryFactory = entryFactory;
        this.listFactory = func1;
        this.entryFactoryStation = entryFactoryStation;
        this.listFactoryStation = func;
    }

    public GList parsePrimary(InputStream inputStream, StatusMsg statusMsg) throws XmlPullParserException, IOException {
        try {
            XmlPullParser newPullParser = Xml.newPullParser();
            newPullParser.setFeature("http://xmlpull.org/v1/doc/features.html#process-namespaces", false);
            if (debug) {
                newPullParser.setInput(new StringReader("<response>\n <statusCode>200</statusCode>\n <statusText>Ok</statusText>\n <data>\n  <genrelist> \n   <genre name=\"Alternative\" id=\"1\" parentid=\"0\" haschildren=\"true\"/>\n   <genre name=\"Blues\" id=\"24\" parentid=\"0\" haschildren=\"true\"/>\n  </genrelist> \n </data>\n</response>"));
            } else {
                newPullParser.setInput(inputStream, null);
            }
            newPullParser.nextTag();
            final GList onInvoke = this.listFactory.onInvoke(null);
            readResponse(newPullParser, statusMsg, new ReadElementListener<String, XmlPullParser, Boolean>() { // from class: com.daaw.avee.comp.Shoutcast.ShoutcastYpXmlParser.1
                @Override // com.daaw.avee.comp.Shoutcast.ShoutcastYpXmlParser.ReadElementListener
                public Boolean Invoke(String str, XmlPullParser xmlPullParser) throws XmlPullParserException, IOException {
                    ShoutcastYpXmlParser.this.readGenrelist(xmlPullParser, onInvoke, null);
                    return true;
                }
            });
            return onInvoke;
        } finally {
            inputStream.close();
        }
    }

    public GList parseSecondary(InputStream inputStream, StatusMsg statusMsg) throws XmlPullParserException, IOException {
        try {
            XmlPullParser newPullParser = Xml.newPullParser();
            newPullParser.setFeature("http://xmlpull.org/v1/doc/features.html#process-namespaces", false);
            if (debug) {
                newPullParser.setInput(new StringReader("<response>\n <statusCode>200</statusCode>\n <statusText>Ok</statusText>\n <data>\n  <genrelist>\n   <genre name=\"Alternative\" id=\"1\" parentid=\"0\" haschildren=\"true\">\n    <genrelist>\n     <genre name=\"Adult Alternative\" id=\"2\" parentid=\"1\" haschildren=\"false\"/>\n     <genre name=\"Britpop\" id=\"3\" parentid=\"1\" haschildren=\"false\"/>\n     <genre name=\"Classic Alternative\" id=\"4\" parentid=\"1\" haschildren=\"false\"/> \n    </genrelist>\n   </genre>\n  </genrelist>\n </data>\n</response>"));
            } else {
                newPullParser.setInput(inputStream, null);
            }
            newPullParser.nextTag();
            final GList onInvoke = this.listFactory.onInvoke(null);
            readResponse(newPullParser, statusMsg, new ReadElementListener<String, XmlPullParser, Boolean>() { // from class: com.daaw.avee.comp.Shoutcast.ShoutcastYpXmlParser.2
                @Override // com.daaw.avee.comp.Shoutcast.ShoutcastYpXmlParser.ReadElementListener
                public Boolean Invoke(String str, XmlPullParser xmlPullParser) throws XmlPullParserException, IOException {
                    ShoutcastYpXmlParser.this.readGenrelist(xmlPullParser, onInvoke, null);
                    return true;
                }
            });
            return onInvoke;
        } finally {
            inputStream.close();
        }
    }

    public VStation parseStations(InputStream inputStream, StatusMsg statusMsg) throws XmlPullParserException, IOException {
        try {
            XmlPullParser newPullParser = Xml.newPullParser();
            newPullParser.setFeature("http://xmlpull.org/v1/doc/features.html#process-namespaces", false);
            if (debug) {
                newPullParser.setInput(new StringReader("<response>\n <statusCode>200</statusCode>\n <statusText>Ok</statusText>\n <data>\n  <stationlist>\n   <tunein base=\"/sbin/tunein-station.pls\"/>\n   <station name=\".977 The Hitz Channel\" mt=\"audio/mpeg\" id=\"9907\" \n    br=\"128\" genre=\"Pop Rock Top 40\"\n    ct=\"Chingy - Balla Baby\" lc=\"11576\"/>\n   <station name=\"TechnoBase.FM - 24h Techno, Dance, Trance, House and More - 128k MP3-[SHOUTcast.com]\"\n    mt=\"audio/mpeg\"id=\"7429\" br=\"128\"genre=\"Techno Trance  Dance House\"\n    ct=\"We aRe oNe\" lc=\"8308\" ml=\"8500\" nsc=\"No\" cst=\"\"/>\n   <station name=\"Absolutely Smooth Jazz - S K Y . F M - the world's smoothest\n    jazz 24 hours a day-[SHOUTcast.com]\" mt=\"audio/mpeg\" id=\"948\"br=\"96\" genre=\"Soft Smooth Jazz\"\n    ct=\"Jonathan Butler/Kirk Whalum - Dancing on the Shore\" lc=\"6801\" ml=\"10023\" nsc=\"No\" cst=\"\"/>\n  </stationlist> \n </data>\n</response>"));
            } else {
                newPullParser.setInput(inputStream, null);
            }
            newPullParser.nextTag();
            final VStation onInvoke = this.listFactoryStation.onInvoke();
            readResponse(newPullParser, statusMsg, new ReadElementListener<String, XmlPullParser, Boolean>() { // from class: com.daaw.avee.comp.Shoutcast.ShoutcastYpXmlParser.3
                @Override // com.daaw.avee.comp.Shoutcast.ShoutcastYpXmlParser.ReadElementListener
                public Boolean Invoke(String str, XmlPullParser xmlPullParser) throws XmlPullParserException, IOException {
                    ShoutcastYpXmlParser.this.readStationlist(xmlPullParser, onInvoke);
                    return true;
                }
            });
            return onInvoke;
        } finally {
            inputStream.close();
        }
    }

    private void readResponse(XmlPullParser xmlPullParser, StatusMsg statusMsg, ReadElementListener<String, XmlPullParser, Boolean> readElementListener) throws XmlPullParserException, IOException {
        xmlPullParser.require(2, ns, "response");
        String str = null;
        String str2 = null;
        while (xmlPullParser.next() != 3) {
            if (xmlPullParser.getEventType() == 2) {
                String name = xmlPullParser.getName();
                if (name.equals("statusCode")) {
                    str = readTitle(xmlPullParser, name);
                } else if (name.equals("statusText")) {
                    str2 = readTitle(xmlPullParser, name);
                } else if (name.equals(DataSchemeDataSource.SCHEME_DATA)) {
                    readData(xmlPullParser, readElementListener);
                } else {
                    skip(xmlPullParser);
                }
            }
        }
        if (str == null || str.equals("200")) {
            return;
        }
        statusMsg.addCriticalError(str2);
    }

    private void readData(XmlPullParser xmlPullParser, ReadElementListener<String, XmlPullParser, Boolean> readElementListener) throws XmlPullParserException, IOException {
        xmlPullParser.require(2, ns, DataSchemeDataSource.SCHEME_DATA);
        while (xmlPullParser.next() != 3) {
            if (xmlPullParser.getEventType() == 2 && !readElementListener.Invoke(xmlPullParser.getName(), xmlPullParser).booleanValue()) {
                skip(xmlPullParser);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void readGenrelist(XmlPullParser xmlPullParser, GList glist, GList glist2) throws XmlPullParserException, IOException {
        xmlPullParser.require(2, ns, "genrelist");
        while (xmlPullParser.next() != 3) {
            if (xmlPullParser.getEventType() == 2) {
                if (xmlPullParser.getName().equals("genre")) {
                    G readEntry = readEntry(xmlPullParser, null);
                    if (glist != null) {
                        glist.add(readEntry);
                    }
                } else {
                    skip(xmlPullParser);
                }
            }
        }
    }

    private G readEntry(XmlPullParser xmlPullParser, GList glist) throws XmlPullParserException, IOException {
        xmlPullParser.require(2, ns, "genre");
        G createEntry = this.entryFactory.createEntry(xmlPullParser.getAttributeValue(ns, AppMeasurementSdk.ConditionalUserProperty.NAME), xmlPullParser.getAttributeValue(ns, TtmlNode.ATTR_ID));
        GList onInvoke = this.listFactory.onInvoke(createEntry);
        while (xmlPullParser.next() != 3) {
            if (xmlPullParser.getEventType() == 2) {
                if (xmlPullParser.getName().equals("genrelist") && onInvoke != null) {
                    readGenrelist(xmlPullParser, onInvoke, null);
                } else {
                    skip(xmlPullParser);
                }
            }
        }
        return createEntry;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void readStationlist(XmlPullParser xmlPullParser, VStation vstation) throws XmlPullParserException, IOException {
        String[] strArr = {""};
        xmlPullParser.require(2, ns, "stationlist");
        while (xmlPullParser.next() != 3) {
            if (xmlPullParser.getEventType() == 2) {
                String name = xmlPullParser.getName();
                if (name.equals("tunein")) {
                    strArr[0] = readTunein(xmlPullParser);
                } else if (name.equals("station")) {
                    TStation readStation = readStation(xmlPullParser, strArr);
                    if (vstation != null) {
                        vstation.add(readStation);
                    }
                } else {
                    skip(xmlPullParser);
                }
            }
        }
    }

    private TStation readStation(XmlPullParser xmlPullParser, String[] strArr) throws XmlPullParserException, IOException {
        xmlPullParser.require(2, ns, "station");
        String attributeValue = xmlPullParser.getAttributeValue(ns, AppMeasurementSdk.ConditionalUserProperty.NAME);
        String attributeValue2 = xmlPullParser.getAttributeValue(ns, TtmlNode.ATTR_ID);
        int strToIntSafe = Utils.strToIntSafe(xmlPullParser.getAttributeValue(ns, TtmlNode.TAG_BR), 0);
        String attributeValue3 = xmlPullParser.getAttributeValue(ns, "genre");
        String attributeValue4 = xmlPullParser.getAttributeValue(ns, "ct");
        xmlPullParser.nextTag();
        xmlPullParser.require(3, ns, "station");
        return this.entryFactoryStation.createEntry(attributeValue, attributeValue2, strToIntSafe, attributeValue3, attributeValue4, strArr);
    }

    private String readTunein(XmlPullParser xmlPullParser) throws XmlPullParserException, IOException {
        xmlPullParser.require(2, ns, "tunein");
        String attributeValue = xmlPullParser.getAttributeValue(ns, "base");
        xmlPullParser.nextTag();
        xmlPullParser.require(3, ns, "tunein");
        return attributeValue;
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
