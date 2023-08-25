package com.daaw;

import android.util.Xml;
import java.io.InputStream;
import java.io.StringReader;
import java.util.List;
import org.xmlpull.v1.XmlPullParser;
/* loaded from: classes.dex */
public class uc1<G, GList extends List<G>, TStation, VStation extends List<TStation>> {
    public static boolean e;
    public static final String f = null;
    public c<G> a;
    public r40<G, GList> b;
    public d<TStation> c;
    public w40<VStation> d;

    /* loaded from: classes.dex */
    public class a implements e<String, XmlPullParser, Boolean> {
        public final /* synthetic */ List a;

        public a(List list) {
            this.a = list;
        }

        @Override // com.daaw.uc1.e
        /* renamed from: b */
        public Boolean a(String str, XmlPullParser xmlPullParser) {
            uc1.this.g(xmlPullParser, this.a, null);
            return Boolean.TRUE;
        }
    }

    /* loaded from: classes.dex */
    public class b implements e<String, XmlPullParser, Boolean> {
        public final /* synthetic */ List a;

        public b(List list) {
            this.a = list;
        }

        @Override // com.daaw.uc1.e
        /* renamed from: b */
        public Boolean a(String str, XmlPullParser xmlPullParser) {
            uc1.this.j(xmlPullParser, this.a);
            return Boolean.TRUE;
        }
    }

    /* loaded from: classes.dex */
    public interface c<T> {
        T a(String str, String str2);
    }

    /* loaded from: classes.dex */
    public interface d<TStation> {
        TStation a(String str, String str2, int i, String str3, String str4, String[] strArr);
    }

    /* loaded from: classes.dex */
    public interface e<T1, T2, R> {
        R a(T1 t1, T2 t2);
    }

    public uc1(c<G> cVar, r40<G, GList> r40Var, d<TStation> dVar, w40<VStation> w40Var) {
        this.a = cVar;
        this.b = r40Var;
        this.c = dVar;
        this.d = w40Var;
    }

    public GList c(InputStream inputStream, wf1 wf1Var) {
        try {
            XmlPullParser newPullParser = Xml.newPullParser();
            newPullParser.setFeature("http://xmlpull.org/v1/doc/features.html#process-namespaces", false);
            if (e) {
                newPullParser.setInput(new StringReader("<response>\n <statusCode>200</statusCode>\n <statusText>Ok</statusText>\n <data>\n  <genrelist>\n   <genre name=\"Alternative\" id=\"1\" parentid=\"0\" haschildren=\"true\">\n    <genrelist>\n     <genre name=\"Adult Alternative\" id=\"2\" parentid=\"1\" haschildren=\"false\"/>\n     <genre name=\"Britpop\" id=\"3\" parentid=\"1\" haschildren=\"false\"/>\n     <genre name=\"Classic Alternative\" id=\"4\" parentid=\"1\" haschildren=\"false\"/> \n    </genrelist>\n   </genre>\n  </genrelist>\n </data>\n</response>"));
            } else {
                newPullParser.setInput(inputStream, null);
            }
            newPullParser.nextTag();
            GList a2 = this.b.a(null);
            h(newPullParser, wf1Var, new a(a2));
            return a2;
        } finally {
            inputStream.close();
        }
    }

    public VStation d(InputStream inputStream, wf1 wf1Var) {
        try {
            XmlPullParser newPullParser = Xml.newPullParser();
            newPullParser.setFeature("http://xmlpull.org/v1/doc/features.html#process-namespaces", false);
            if (e) {
                newPullParser.setInput(new StringReader("<response>\n <statusCode>200</statusCode>\n <statusText>Ok</statusText>\n <data>\n  <stationlist>\n   <tunein base=\"/sbin/tunein-station.pls\"/>\n   <station name=\".977 The Hitz Channel\" mt=\"audio/mpeg\" id=\"9907\" \n    br=\"128\" genre=\"Pop Rock Top 40\"\n    ct=\"Chingy - Balla Baby\" lc=\"11576\"/>\n   <station name=\"TechnoBase.FM - 24h Techno, Dance, Trance, House and More - 128k MP3-[SHOUTcast.com]\"\n    mt=\"audio/mpeg\"id=\"7429\" br=\"128\"genre=\"Techno Trance  Dance House\"\n    ct=\"We aRe oNe\" lc=\"8308\" ml=\"8500\" nsc=\"No\" cst=\"\"/>\n   <station name=\"Absolutely Smooth Jazz - S K Y . F M - the world's smoothest\n    jazz 24 hours a day-[SHOUTcast.com]\" mt=\"audio/mpeg\" id=\"948\"br=\"96\" genre=\"Soft Smooth Jazz\"\n    ct=\"Jonathan Butler/Kirk Whalum - Dancing on the Shore\" lc=\"6801\" ml=\"10023\" nsc=\"No\" cst=\"\"/>\n  </stationlist> \n </data>\n</response>"));
            } else {
                newPullParser.setInput(inputStream, null);
            }
            newPullParser.nextTag();
            VStation a2 = this.d.a();
            h(newPullParser, wf1Var, new b(a2));
            return a2;
        } finally {
            inputStream.close();
        }
    }

    public final void e(XmlPullParser xmlPullParser, e<String, XmlPullParser, Boolean> eVar) {
        xmlPullParser.require(2, f, "data");
        while (xmlPullParser.next() != 3) {
            if (xmlPullParser.getEventType() == 2 && !eVar.a(xmlPullParser.getName(), xmlPullParser).booleanValue()) {
                n(xmlPullParser);
            }
        }
    }

    public final G f(XmlPullParser xmlPullParser, GList glist) {
        String str = f;
        xmlPullParser.require(2, str, "genre");
        G a2 = this.a.a(xmlPullParser.getAttributeValue(str, "name"), xmlPullParser.getAttributeValue(str, "id"));
        GList a3 = this.b.a(a2);
        while (xmlPullParser.next() != 3) {
            if (xmlPullParser.getEventType() == 2) {
                if (!xmlPullParser.getName().equals("genrelist") || a3 == null) {
                    n(xmlPullParser);
                } else {
                    g(xmlPullParser, a3, null);
                }
            }
        }
        return a2;
    }

    public final void g(XmlPullParser xmlPullParser, GList glist, GList glist2) {
        xmlPullParser.require(2, f, "genrelist");
        while (xmlPullParser.next() != 3) {
            if (xmlPullParser.getEventType() == 2) {
                if (xmlPullParser.getName().equals("genre")) {
                    G f2 = f(xmlPullParser, null);
                    if (glist != null) {
                        glist.add(f2);
                    }
                } else {
                    n(xmlPullParser);
                }
            }
        }
    }

    public final void h(XmlPullParser xmlPullParser, wf1 wf1Var, e<String, XmlPullParser, Boolean> eVar) {
        xmlPullParser.require(2, f, "response");
        String str = null;
        String str2 = null;
        while (xmlPullParser.next() != 3) {
            if (xmlPullParser.getEventType() == 2) {
                String name = xmlPullParser.getName();
                if (name.equals("statusCode")) {
                    str = l(xmlPullParser, name);
                } else if (name.equals("statusText")) {
                    str2 = l(xmlPullParser, name);
                } else if (name.equals("data")) {
                    e(xmlPullParser, eVar);
                } else {
                    n(xmlPullParser);
                }
            }
        }
        if (str == null || str.equals("200")) {
            return;
        }
        wf1Var.a(str2);
    }

    public final TStation i(XmlPullParser xmlPullParser, String[] strArr) {
        String str = f;
        xmlPullParser.require(2, str, "station");
        String attributeValue = xmlPullParser.getAttributeValue(str, "name");
        String attributeValue2 = xmlPullParser.getAttributeValue(str, "id");
        int x = br1.x(xmlPullParser.getAttributeValue(str, "br"), 0);
        String attributeValue3 = xmlPullParser.getAttributeValue(str, "genre");
        String attributeValue4 = xmlPullParser.getAttributeValue(str, "ct");
        xmlPullParser.nextTag();
        xmlPullParser.require(3, str, "station");
        return this.c.a(attributeValue, attributeValue2, x, attributeValue3, attributeValue4, strArr);
    }

    public final void j(XmlPullParser xmlPullParser, VStation vstation) {
        String[] strArr = {""};
        xmlPullParser.require(2, f, "stationlist");
        while (xmlPullParser.next() != 3) {
            if (xmlPullParser.getEventType() == 2) {
                String name = xmlPullParser.getName();
                if (name.equals("tunein")) {
                    strArr[0] = m(xmlPullParser);
                } else if (name.equals("station")) {
                    TStation i = i(xmlPullParser, strArr);
                    if (vstation != null) {
                        vstation.add(i);
                    }
                } else {
                    n(xmlPullParser);
                }
            }
        }
    }

    public final String k(XmlPullParser xmlPullParser) {
        if (xmlPullParser.next() == 4) {
            String text = xmlPullParser.getText();
            xmlPullParser.nextTag();
            return text;
        }
        return "";
    }

    public final String l(XmlPullParser xmlPullParser, String str) {
        String str2 = f;
        xmlPullParser.require(2, str2, str);
        String k = k(xmlPullParser);
        xmlPullParser.require(3, str2, str);
        return k;
    }

    public final String m(XmlPullParser xmlPullParser) {
        String str = f;
        xmlPullParser.require(2, str, "tunein");
        String attributeValue = xmlPullParser.getAttributeValue(str, "base");
        xmlPullParser.nextTag();
        xmlPullParser.require(3, str, "tunein");
        return attributeValue;
    }

    public final void n(XmlPullParser xmlPullParser) {
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
