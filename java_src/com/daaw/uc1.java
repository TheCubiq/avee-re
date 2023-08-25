package com.daaw;

import android.util.Xml;
import java.io.InputStream;
import java.io.StringReader;
import java.util.List;
import org.xmlpull.v1.XmlPullParser;
/* loaded from: classes.dex */
public class uc1<G, GList extends List<G>, TStation, VStation extends List<TStation>> {

    /* renamed from: e */
    public static boolean f28872e;

    /* renamed from: f */
    public static final String f28873f = null;

    /* renamed from: a */
    public InterfaceC3197c<G> f28874a;

    /* renamed from: b */
    public r40<G, GList> f28875b;

    /* renamed from: c */
    public InterfaceC3198d<TStation> f28876c;

    /* renamed from: d */
    public w40<VStation> f28877d;

    /* renamed from: com.daaw.uc1$a */
    /* loaded from: classes.dex */
    public class C3195a implements InterfaceC3199e<String, XmlPullParser, Boolean> {

        /* renamed from: a */
        public final /* synthetic */ List f28878a;

        public C3195a(List list) {
            this.f28878a = list;
        }

        @Override // com.daaw.uc1.InterfaceC3199e
        /* renamed from: b */
        public Boolean mo8322a(String str, XmlPullParser xmlPullParser) {
            uc1.this.m8334g(xmlPullParser, this.f28878a, null);
            return Boolean.TRUE;
        }
    }

    /* renamed from: com.daaw.uc1$b */
    /* loaded from: classes.dex */
    public class C3196b implements InterfaceC3199e<String, XmlPullParser, Boolean> {

        /* renamed from: a */
        public final /* synthetic */ List f28880a;

        public C3196b(List list) {
            this.f28880a = list;
        }

        @Override // com.daaw.uc1.InterfaceC3199e
        /* renamed from: b */
        public Boolean mo8322a(String str, XmlPullParser xmlPullParser) {
            uc1.this.m8331j(xmlPullParser, this.f28880a);
            return Boolean.TRUE;
        }
    }

    /* renamed from: com.daaw.uc1$c */
    /* loaded from: classes.dex */
    public interface InterfaceC3197c<T> {
        /* renamed from: a */
        T mo8324a(String str, String str2);
    }

    /* renamed from: com.daaw.uc1$d */
    /* loaded from: classes.dex */
    public interface InterfaceC3198d<TStation> {
        /* renamed from: a */
        TStation mo8323a(String str, String str2, int i, String str3, String str4, String[] strArr);
    }

    /* renamed from: com.daaw.uc1$e */
    /* loaded from: classes.dex */
    public interface InterfaceC3199e<T1, T2, R> {
        /* renamed from: a */
        R mo8322a(T1 t1, T2 t2);
    }

    public uc1(InterfaceC3197c<G> interfaceC3197c, r40<G, GList> r40Var, InterfaceC3198d<TStation> interfaceC3198d, w40<VStation> w40Var) {
        this.f28874a = interfaceC3197c;
        this.f28875b = r40Var;
        this.f28876c = interfaceC3198d;
        this.f28877d = w40Var;
    }

    /* renamed from: c */
    public GList m8338c(InputStream inputStream, wf1 wf1Var) {
        try {
            XmlPullParser newPullParser = Xml.newPullParser();
            newPullParser.setFeature("http://xmlpull.org/v1/doc/features.html#process-namespaces", false);
            if (f28872e) {
                newPullParser.setInput(new StringReader("<response>\n <statusCode>200</statusCode>\n <statusText>Ok</statusText>\n <data>\n  <genrelist>\n   <genre name=\"Alternative\" id=\"1\" parentid=\"0\" haschildren=\"true\">\n    <genrelist>\n     <genre name=\"Adult Alternative\" id=\"2\" parentid=\"1\" haschildren=\"false\"/>\n     <genre name=\"Britpop\" id=\"3\" parentid=\"1\" haschildren=\"false\"/>\n     <genre name=\"Classic Alternative\" id=\"4\" parentid=\"1\" haschildren=\"false\"/> \n    </genrelist>\n   </genre>\n  </genrelist>\n </data>\n</response>"));
            } else {
                newPullParser.setInput(inputStream, null);
            }
            newPullParser.nextTag();
            GList mo5050a = this.f28875b.mo5050a(null);
            m8333h(newPullParser, wf1Var, new C3195a(mo5050a));
            return mo5050a;
        } finally {
            inputStream.close();
        }
    }

    /* renamed from: d */
    public VStation m8337d(InputStream inputStream, wf1 wf1Var) {
        try {
            XmlPullParser newPullParser = Xml.newPullParser();
            newPullParser.setFeature("http://xmlpull.org/v1/doc/features.html#process-namespaces", false);
            if (f28872e) {
                newPullParser.setInput(new StringReader("<response>\n <statusCode>200</statusCode>\n <statusText>Ok</statusText>\n <data>\n  <stationlist>\n   <tunein base=\"/sbin/tunein-station.pls\"/>\n   <station name=\".977 The Hitz Channel\" mt=\"audio/mpeg\" id=\"9907\" \n    br=\"128\" genre=\"Pop Rock Top 40\"\n    ct=\"Chingy - Balla Baby\" lc=\"11576\"/>\n   <station name=\"TechnoBase.FM - 24h Techno, Dance, Trance, House and More - 128k MP3-[SHOUTcast.com]\"\n    mt=\"audio/mpeg\"id=\"7429\" br=\"128\"genre=\"Techno Trance  Dance House\"\n    ct=\"We aRe oNe\" lc=\"8308\" ml=\"8500\" nsc=\"No\" cst=\"\"/>\n   <station name=\"Absolutely Smooth Jazz - S K Y . F M - the world's smoothest\n    jazz 24 hours a day-[SHOUTcast.com]\" mt=\"audio/mpeg\" id=\"948\"br=\"96\" genre=\"Soft Smooth Jazz\"\n    ct=\"Jonathan Butler/Kirk Whalum - Dancing on the Shore\" lc=\"6801\" ml=\"10023\" nsc=\"No\" cst=\"\"/>\n  </stationlist> \n </data>\n</response>"));
            } else {
                newPullParser.setInput(inputStream, null);
            }
            newPullParser.nextTag();
            VStation mo3478a = this.f28877d.mo3478a();
            m8333h(newPullParser, wf1Var, new C3196b(mo3478a));
            return mo3478a;
        } finally {
            inputStream.close();
        }
    }

    /* renamed from: e */
    public final void m8336e(XmlPullParser xmlPullParser, InterfaceC3199e<String, XmlPullParser, Boolean> interfaceC3199e) {
        xmlPullParser.require(2, f28873f, "data");
        while (xmlPullParser.next() != 3) {
            if (xmlPullParser.getEventType() == 2 && !interfaceC3199e.mo8322a(xmlPullParser.getName(), xmlPullParser).booleanValue()) {
                m8327n(xmlPullParser);
            }
        }
    }

    /* renamed from: f */
    public final G m8335f(XmlPullParser xmlPullParser, GList glist) {
        String str = f28873f;
        xmlPullParser.require(2, str, "genre");
        G mo8324a = this.f28874a.mo8324a(xmlPullParser.getAttributeValue(str, "name"), xmlPullParser.getAttributeValue(str, "id"));
        GList mo5050a = this.f28875b.mo5050a(mo8324a);
        while (xmlPullParser.next() != 3) {
            if (xmlPullParser.getEventType() == 2) {
                if (!xmlPullParser.getName().equals("genrelist") || mo5050a == null) {
                    m8327n(xmlPullParser);
                } else {
                    m8334g(xmlPullParser, mo5050a, null);
                }
            }
        }
        return mo8324a;
    }

    /* renamed from: g */
    public final void m8334g(XmlPullParser xmlPullParser, GList glist, GList glist2) {
        xmlPullParser.require(2, f28873f, "genrelist");
        while (xmlPullParser.next() != 3) {
            if (xmlPullParser.getEventType() == 2) {
                if (xmlPullParser.getName().equals("genre")) {
                    G m8335f = m8335f(xmlPullParser, null);
                    if (glist != null) {
                        glist.add(m8335f);
                    }
                } else {
                    m8327n(xmlPullParser);
                }
            }
        }
    }

    /* renamed from: h */
    public final void m8333h(XmlPullParser xmlPullParser, wf1 wf1Var, InterfaceC3199e<String, XmlPullParser, Boolean> interfaceC3199e) {
        xmlPullParser.require(2, f28873f, "response");
        String str = null;
        String str2 = null;
        while (xmlPullParser.next() != 3) {
            if (xmlPullParser.getEventType() == 2) {
                String name = xmlPullParser.getName();
                if (name.equals("statusCode")) {
                    str = m8329l(xmlPullParser, name);
                } else if (name.equals("statusText")) {
                    str2 = m8329l(xmlPullParser, name);
                } else if (name.equals("data")) {
                    m8336e(xmlPullParser, interfaceC3199e);
                } else {
                    m8327n(xmlPullParser);
                }
            }
        }
        if (str == null || str.equals("200")) {
            return;
        }
        wf1Var.m6096a(str2);
    }

    /* renamed from: i */
    public final TStation m8332i(XmlPullParser xmlPullParser, String[] strArr) {
        String str = f28873f;
        xmlPullParser.require(2, str, "station");
        String attributeValue = xmlPullParser.getAttributeValue(str, "name");
        String attributeValue2 = xmlPullParser.getAttributeValue(str, "id");
        int m25885x = br1.m25885x(xmlPullParser.getAttributeValue(str, "br"), 0);
        String attributeValue3 = xmlPullParser.getAttributeValue(str, "genre");
        String attributeValue4 = xmlPullParser.getAttributeValue(str, "ct");
        xmlPullParser.nextTag();
        xmlPullParser.require(3, str, "station");
        return this.f28876c.mo8323a(attributeValue, attributeValue2, m25885x, attributeValue3, attributeValue4, strArr);
    }

    /* renamed from: j */
    public final void m8331j(XmlPullParser xmlPullParser, VStation vstation) {
        String[] strArr = {""};
        xmlPullParser.require(2, f28873f, "stationlist");
        while (xmlPullParser.next() != 3) {
            if (xmlPullParser.getEventType() == 2) {
                String name = xmlPullParser.getName();
                if (name.equals("tunein")) {
                    strArr[0] = m8328m(xmlPullParser);
                } else if (name.equals("station")) {
                    TStation m8332i = m8332i(xmlPullParser, strArr);
                    if (vstation != null) {
                        vstation.add(m8332i);
                    }
                } else {
                    m8327n(xmlPullParser);
                }
            }
        }
    }

    /* renamed from: k */
    public final String m8330k(XmlPullParser xmlPullParser) {
        if (xmlPullParser.next() == 4) {
            String text = xmlPullParser.getText();
            xmlPullParser.nextTag();
            return text;
        }
        return "";
    }

    /* renamed from: l */
    public final String m8329l(XmlPullParser xmlPullParser, String str) {
        String str2 = f28873f;
        xmlPullParser.require(2, str2, str);
        String m8330k = m8330k(xmlPullParser);
        xmlPullParser.require(3, str2, str);
        return m8330k;
    }

    /* renamed from: m */
    public final String m8328m(XmlPullParser xmlPullParser) {
        String str = f28873f;
        xmlPullParser.require(2, str, "tunein");
        String attributeValue = xmlPullParser.getAttributeValue(str, "base");
        xmlPullParser.nextTag();
        xmlPullParser.require(3, str, "tunein");
        return attributeValue;
    }

    /* renamed from: n */
    public final void m8327n(XmlPullParser xmlPullParser) {
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
