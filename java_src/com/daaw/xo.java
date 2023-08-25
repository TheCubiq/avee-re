package com.daaw;

import android.net.Uri;
import android.text.TextUtils;
import android.util.Pair;
import android.util.Xml;
import com.daaw.ka1;
import com.daaw.vv0;
import com.google.android.exoplayer2.Format;
import com.google.android.exoplayer2.drm.DrmInitData;
import com.google.android.exoplayer2.metadata.emsg.EventMessage;
import java.io.ByteArrayOutputStream;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import org.xml.sax.helpers.DefaultHandler;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;
import org.xmlpull.v1.XmlPullParserFactory;
import org.xmlpull.v1.XmlSerializer;
/* loaded from: classes.dex */
public class xo extends DefaultHandler implements vv0.a<wo> {
    public static final Pattern c = Pattern.compile("(\\d+)(?:/(\\d+))?");
    public static final Pattern d = Pattern.compile("CC([1-4])=.*");
    public static final Pattern e = Pattern.compile("([1-9]|[1-5][0-9]|6[0-3])=.*");
    public final String a;
    public final XmlPullParserFactory b;

    /* loaded from: classes.dex */
    public static final class a {
        public final Format a;
        public final String b;
        public final ka1 c;
        public final String d;
        public final ArrayList<DrmInitData.SchemeData> e;
        public final ArrayList<jt> f;
        public final long g;

        public a(Format format, String str, ka1 ka1Var, String str2, ArrayList<DrmInitData.SchemeData> arrayList, ArrayList<jt> arrayList2, long j) {
            this.a = format;
            this.b = str;
            this.c = ka1Var;
            this.d = str2;
            this.e = arrayList;
            this.f = arrayList2;
            this.g = j;
        }
    }

    public xo() {
        this(null);
    }

    public xo(String str) {
        this.a = str;
        try {
            this.b = XmlPullParserFactory.newInstance();
        } catch (XmlPullParserException e2) {
            throw new RuntimeException("Couldn't create XmlPullParserFactory instance", e2);
        }
    }

    public static int A(List<jt> list) {
        String str;
        for (int i = 0; i < list.size(); i++) {
            jt jtVar = list.get(i);
            if ("urn:scte:dash:cc:cea-708:2015".equals(jtVar.a) && (str = jtVar.b) != null) {
                Matcher matcher = e.matcher(str);
                if (matcher.matches()) {
                    return Integer.parseInt(matcher.group(1));
                }
                StringBuilder sb = new StringBuilder();
                sb.append("Unable to parse CEA-708 service block number from: ");
                sb.append(jtVar.b);
            }
        }
        return -1;
    }

    public static long D(XmlPullParser xmlPullParser, String str, long j) {
        String attributeValue = xmlPullParser.getAttributeValue(null, str);
        return attributeValue == null ? j : sq1.O(attributeValue);
    }

    public static jt E(XmlPullParser xmlPullParser, String str) {
        String Z = Z(xmlPullParser, "schemeIdUri", "");
        String Z2 = Z(xmlPullParser, "value", null);
        String Z3 = Z(xmlPullParser, "id", null);
        do {
            xmlPullParser.next();
        } while (!iz1.c(xmlPullParser, str));
        return new jt(Z, Z2, Z3);
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    public static int F(XmlPullParser xmlPullParser) {
        char c2;
        String a0 = sq1.a0(xmlPullParser.getAttributeValue(null, "value"));
        if (a0 == null) {
            return -1;
        }
        switch (a0.hashCode()) {
            case 1596796:
                if (a0.equals("4000")) {
                    c2 = 0;
                    break;
                }
                c2 = 65535;
                break;
            case 2937391:
                if (a0.equals("a000")) {
                    c2 = 1;
                    break;
                }
                c2 = 65535;
                break;
            case 3094035:
                if (a0.equals("f801")) {
                    c2 = 2;
                    break;
                }
                c2 = 65535;
                break;
            case 3133436:
                if (a0.equals("fa01")) {
                    c2 = 3;
                    break;
                }
                c2 = 65535;
                break;
            default:
                c2 = 65535;
                break;
        }
        switch (c2) {
            case 0:
                return 1;
            case 1:
                return 2;
            case 2:
                return 6;
            case 3:
                return 8;
            default:
                return -1;
        }
    }

    public static long G(XmlPullParser xmlPullParser, String str, long j) {
        String attributeValue = xmlPullParser.getAttributeValue(null, str);
        return attributeValue == null ? j : sq1.P(attributeValue);
    }

    public static String H(List<jt> list) {
        for (int i = 0; i < list.size(); i++) {
            jt jtVar = list.get(i);
            if ("tag:dolby.com,2014:dash:DolbyDigitalPlusExtensionType:2014".equals(jtVar.a) && "ec+3".equals(jtVar.b)) {
                return "audio/eac3-joc";
            }
        }
        return "audio/eac3";
    }

    public static float L(XmlPullParser xmlPullParser, float f) {
        String group;
        String attributeValue = xmlPullParser.getAttributeValue(null, "frameRate");
        if (attributeValue != null) {
            Matcher matcher = c.matcher(attributeValue);
            if (matcher.matches()) {
                int parseInt = Integer.parseInt(matcher.group(1));
                float f2 = parseInt;
                return !TextUtils.isEmpty(matcher.group(2)) ? f2 / Integer.parseInt(group) : f2;
            }
            return f;
        }
        return f;
    }

    public static int N(XmlPullParser xmlPullParser, String str, int i) {
        String attributeValue = xmlPullParser.getAttributeValue(null, str);
        return attributeValue == null ? i : Integer.parseInt(attributeValue);
    }

    public static long O(XmlPullParser xmlPullParser, String str, long j) {
        String attributeValue = xmlPullParser.getAttributeValue(null, str);
        return attributeValue == null ? j : Long.parseLong(attributeValue);
    }

    public static String Z(XmlPullParser xmlPullParser, String str, String str2) {
        String attributeValue = xmlPullParser.getAttributeValue(null, str);
        return attributeValue == null ? str2 : attributeValue;
    }

    public static int o(int i, int i2) {
        if (i == -1) {
            return i2;
        }
        if (i2 == -1) {
            return i;
        }
        s6.f(i == i2);
        return i;
    }

    public static String p(String str, String str2) {
        if (str == null) {
            return str2;
        }
        if (str2 == null) {
            return str;
        }
        s6.f(str.equals(str2));
        return str;
    }

    public static void q(ArrayList<DrmInitData.SchemeData> arrayList) {
        for (int size = arrayList.size() - 1; size >= 0; size--) {
            DrmInitData.SchemeData schemeData = arrayList.get(size);
            if (!schemeData.c()) {
                int i = 0;
                while (true) {
                    if (i >= arrayList.size()) {
                        break;
                    } else if (arrayList.get(i).b(schemeData)) {
                        arrayList.remove(size);
                        break;
                    } else {
                        i++;
                    }
                }
            }
        }
    }

    public static String s(String str, String str2) {
        if (hq0.k(str)) {
            return hq0.a(str2);
        }
        if (hq0.m(str)) {
            return hq0.j(str2);
        }
        if (t(str)) {
            return str;
        }
        if ("application/mp4".equals(str)) {
            if ("stpp".equals(str2)) {
                return "application/ttml+xml";
            }
            if ("wvtt".equals(str2)) {
                return "application/x-mp4-vtt";
            }
        } else if ("application/x-rawcc".equals(str) && str2 != null) {
            if (str2.contains("cea708")) {
                return "application/cea-708";
            }
            if (str2.contains("eia608") || str2.contains("cea608")) {
                return "application/cea-608";
            }
        }
        return null;
    }

    public static boolean t(String str) {
        return hq0.l(str) || "application/ttml+xml".equals(str) || "application/x-mp4-vtt".equals(str) || "application/cea-708".equals(str) || "application/cea-608".equals(str);
    }

    public static String y(XmlPullParser xmlPullParser, String str) {
        xmlPullParser.next();
        return iq1.c(str, xmlPullParser.getText());
    }

    public static int z(List<jt> list) {
        String str;
        for (int i = 0; i < list.size(); i++) {
            jt jtVar = list.get(i);
            if ("urn:scte:dash:cc:cea-608:2015".equals(jtVar.a) && (str = jtVar.b) != null) {
                Matcher matcher = d.matcher(str);
                if (matcher.matches()) {
                    return Integer.parseInt(matcher.group(1));
                }
                StringBuilder sb = new StringBuilder();
                sb.append("Unable to parse CEA-608 channel number from: ");
                sb.append(jtVar.b);
            }
        }
        return -1;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:39:0x0091  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x00a5  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x00f7  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public android.util.Pair<java.lang.String, com.google.android.exoplayer2.drm.DrmInitData.SchemeData> B(org.xmlpull.v1.XmlPullParser r12) {
        /*
            Method dump skipped, instructions count: 284
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.daaw.xo.B(org.xmlpull.v1.XmlPullParser):android.util.Pair");
    }

    public int C(XmlPullParser xmlPullParser) {
        String attributeValue = xmlPullParser.getAttributeValue(null, "contentType");
        if (TextUtils.isEmpty(attributeValue)) {
            return -1;
        }
        if ("audio".equals(attributeValue)) {
            return 1;
        }
        if ("video".equals(attributeValue)) {
            return 2;
        }
        return "text".equals(attributeValue) ? 3 : -1;
    }

    public EventMessage I(XmlPullParser xmlPullParser, String str, String str2, long j, ByteArrayOutputStream byteArrayOutputStream) {
        long O = O(xmlPullParser, "id", 0L);
        long O2 = O(xmlPullParser, "duration", -9223372036854775807L);
        long O3 = O(xmlPullParser, "presentationTime", 0L);
        return c(str, str2, O, sq1.T(O2, 1000L, j), J(xmlPullParser, byteArrayOutputStream), sq1.T(O3, 1000000L, j));
    }

    public byte[] J(XmlPullParser xmlPullParser, ByteArrayOutputStream byteArrayOutputStream) {
        byteArrayOutputStream.reset();
        XmlSerializer newSerializer = Xml.newSerializer();
        newSerializer.setOutput(byteArrayOutputStream, null);
        while (true) {
            xmlPullParser.nextToken();
            if (iz1.c(xmlPullParser, "Event")) {
                newSerializer.flush();
                return byteArrayOutputStream.toByteArray();
            }
            switch (xmlPullParser.getEventType()) {
                case 0:
                    newSerializer.startDocument(null, Boolean.FALSE);
                    break;
                case 1:
                    newSerializer.endDocument();
                    break;
                case 2:
                    newSerializer.startTag(xmlPullParser.getNamespace(), xmlPullParser.getName());
                    for (int i = 0; i < xmlPullParser.getAttributeCount(); i++) {
                        newSerializer.attribute(xmlPullParser.getAttributeNamespace(i), xmlPullParser.getAttributeName(i), xmlPullParser.getAttributeValue(i));
                    }
                    break;
                case 3:
                    newSerializer.endTag(xmlPullParser.getNamespace(), xmlPullParser.getName());
                    break;
                case 4:
                    newSerializer.text(xmlPullParser.getText());
                    break;
                case 5:
                    newSerializer.cdsect(xmlPullParser.getText());
                    break;
                case 6:
                    newSerializer.entityRef(xmlPullParser.getText());
                    break;
                case 7:
                    newSerializer.ignorableWhitespace(xmlPullParser.getText());
                    break;
                case 8:
                    newSerializer.processingInstruction(xmlPullParser.getText());
                    break;
                case 9:
                    newSerializer.comment(xmlPullParser.getText());
                    break;
                case 10:
                    newSerializer.docdecl(xmlPullParser.getText());
                    break;
            }
        }
    }

    public sy K(XmlPullParser xmlPullParser) {
        String Z = Z(xmlPullParser, "schemeIdUri", "");
        String Z2 = Z(xmlPullParser, "value", "");
        long O = O(xmlPullParser, "timescale", 1L);
        ArrayList arrayList = new ArrayList();
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream(512);
        do {
            xmlPullParser.next();
            if (iz1.e(xmlPullParser, "Event")) {
                arrayList.add(I(xmlPullParser, Z, Z2, O, byteArrayOutputStream));
            }
        } while (!iz1.c(xmlPullParser, "EventStream"));
        long[] jArr = new long[arrayList.size()];
        EventMessage[] eventMessageArr = new EventMessage[arrayList.size()];
        for (int i = 0; i < arrayList.size(); i++) {
            EventMessage eventMessage = (EventMessage) arrayList.get(i);
            jArr[i] = eventMessage.s;
            eventMessageArr[i] = eventMessage;
        }
        return d(Z, Z2, O, jArr, eventMessageArr);
    }

    public d31 M(XmlPullParser xmlPullParser) {
        return R(xmlPullParser, "sourceURL", "range");
    }

    public wo P(XmlPullParser xmlPullParser, String str) {
        pq1 pq1Var;
        long D = D(xmlPullParser, "availabilityStartTime", -9223372036854775807L);
        long G = G(xmlPullParser, "mediaPresentationDuration", -9223372036854775807L);
        long G2 = G(xmlPullParser, "minBufferTime", -9223372036854775807L);
        String attributeValue = xmlPullParser.getAttributeValue(null, "type");
        boolean z = attributeValue != null && "dynamic".equals(attributeValue);
        long G3 = z ? G(xmlPullParser, "minimumUpdatePeriod", -9223372036854775807L) : -9223372036854775807L;
        long G4 = z ? G(xmlPullParser, "timeShiftBufferDepth", -9223372036854775807L) : -9223372036854775807L;
        long G5 = z ? G(xmlPullParser, "suggestedPresentationDelay", -9223372036854775807L) : -9223372036854775807L;
        long D2 = D(xmlPullParser, "publishTime", -9223372036854775807L);
        ArrayList arrayList = new ArrayList();
        long j = z ? -9223372036854775807L : 0L;
        boolean z2 = false;
        boolean z3 = false;
        Uri uri = null;
        String str2 = str;
        pq1 pq1Var2 = null;
        while (true) {
            xmlPullParser.next();
            if (iz1.e(xmlPullParser, "BaseURL")) {
                if (!z2) {
                    str2 = y(xmlPullParser, str2);
                    pq1Var = pq1Var2;
                    z2 = true;
                }
                pq1Var = pq1Var2;
                str2 = str2;
                j = j;
            } else if (iz1.e(xmlPullParser, "UTCTiming")) {
                pq1Var = b0(xmlPullParser);
            } else {
                if (iz1.e(xmlPullParser, "Location")) {
                    uri = Uri.parse(xmlPullParser.nextText());
                } else {
                    if (iz1.e(xmlPullParser, "Period") && !z3) {
                        Pair<gw0, Long> Q = Q(xmlPullParser, str2, j);
                        String str3 = str2;
                        gw0 gw0Var = (gw0) Q.first;
                        long j2 = j;
                        if (gw0Var.b != -9223372036854775807L) {
                            long longValue = ((Long) Q.second).longValue();
                            long j3 = longValue == -9223372036854775807L ? -9223372036854775807L : gw0Var.b + longValue;
                            arrayList.add(gw0Var);
                            j = j3;
                            str2 = str3;
                        } else if (!z) {
                            throw new tv0("Unable to determine start of period " + arrayList.size());
                        } else {
                            pq1Var = pq1Var2;
                            str2 = str3;
                            j = j2;
                            z3 = true;
                        }
                    }
                    pq1Var = pq1Var2;
                    str2 = str2;
                    j = j;
                }
                pq1Var = pq1Var2;
            }
            if (iz1.c(xmlPullParser, "MPD")) {
                if (G == -9223372036854775807L) {
                    if (j != -9223372036854775807L) {
                        G = j;
                    } else if (!z) {
                        throw new tv0("Unable to determine duration of static manifest.");
                    }
                }
                if (arrayList.isEmpty()) {
                    throw new tv0("No periods found.");
                }
                return f(D, G, G2, z, G3, G4, G5, D2, pq1Var, uri, arrayList);
            }
            pq1Var2 = pq1Var;
        }
    }

    public Pair<gw0, Long> Q(XmlPullParser xmlPullParser, String str, long j) {
        String attributeValue = xmlPullParser.getAttributeValue(null, "id");
        long G = G(xmlPullParser, "start", j);
        long G2 = G(xmlPullParser, "duration", -9223372036854775807L);
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        boolean z = false;
        ka1 ka1Var = null;
        do {
            xmlPullParser.next();
            if (iz1.e(xmlPullParser, "BaseURL")) {
                if (!z) {
                    str = y(xmlPullParser, str);
                    z = true;
                }
            } else if (iz1.e(xmlPullParser, "AdaptationSet")) {
                arrayList.add(v(xmlPullParser, str, ka1Var));
            } else if (iz1.e(xmlPullParser, "EventStream")) {
                arrayList2.add(K(xmlPullParser));
            } else if (iz1.e(xmlPullParser, "SegmentBase")) {
                ka1Var = U(xmlPullParser, null);
            } else if (iz1.e(xmlPullParser, "SegmentList")) {
                ka1Var = V(xmlPullParser, null);
            } else if (iz1.e(xmlPullParser, "SegmentTemplate")) {
                ka1Var = W(xmlPullParser, null);
            }
        } while (!iz1.c(xmlPullParser, "Period"));
        return Pair.create(g(attributeValue, G, arrayList, arrayList2), Long.valueOf(G2));
    }

    public d31 R(XmlPullParser xmlPullParser, String str, String str2) {
        long j;
        long j2;
        String attributeValue = xmlPullParser.getAttributeValue(null, str);
        String attributeValue2 = xmlPullParser.getAttributeValue(null, str2);
        if (attributeValue2 != null) {
            String[] split = attributeValue2.split("-");
            j = Long.parseLong(split[0]);
            if (split.length == 2) {
                j2 = (Long.parseLong(split[1]) - j) + 1;
                return h(attributeValue, j, j2);
            }
        } else {
            j = 0;
        }
        j2 = -1;
        return h(attributeValue, j, j2);
    }

    /* JADX WARN: Removed duplicated region for block: B:45:0x0154 A[LOOP:0: B:3:0x005a->B:45:0x0154, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:46:0x011a A[EDGE_INSN: B:46:0x011a->B:39:0x011a ?: BREAK  , SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public com.daaw.xo.a S(org.xmlpull.v1.XmlPullParser r22, java.lang.String r23, java.lang.String r24, java.lang.String r25, int r26, int r27, float r28, int r29, int r30, java.lang.String r31, int r32, java.util.List<com.daaw.jt> r33, com.daaw.ka1 r34) {
        /*
            Method dump skipped, instructions count: 350
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.daaw.xo.S(org.xmlpull.v1.XmlPullParser, java.lang.String, java.lang.String, java.lang.String, int, int, float, int, int, java.lang.String, int, java.util.List, com.daaw.ka1):com.daaw.xo$a");
    }

    public int T(XmlPullParser xmlPullParser) {
        String Z = Z(xmlPullParser, "schemeIdUri", null);
        String Z2 = Z(xmlPullParser, "value", null);
        do {
            xmlPullParser.next();
        } while (!iz1.c(xmlPullParser, "Role"));
        return ("urn:mpeg:dash:role:2011".equals(Z) && "main".equals(Z2)) ? 1 : 0;
    }

    public ka1.e U(XmlPullParser xmlPullParser, ka1.e eVar) {
        long j;
        long j2;
        long O = O(xmlPullParser, "timescale", eVar != null ? eVar.b : 1L);
        long O2 = O(xmlPullParser, "presentationTimeOffset", eVar != null ? eVar.c : 0L);
        long j3 = eVar != null ? eVar.d : 0L;
        long j4 = eVar != null ? eVar.e : 0L;
        String attributeValue = xmlPullParser.getAttributeValue(null, "indexRange");
        if (attributeValue != null) {
            String[] split = attributeValue.split("-");
            long parseLong = Long.parseLong(split[0]);
            j = (Long.parseLong(split[1]) - parseLong) + 1;
            j2 = parseLong;
        } else {
            j = j4;
            j2 = j3;
        }
        d31 d31Var = eVar != null ? eVar.a : null;
        do {
            xmlPullParser.next();
            if (iz1.e(xmlPullParser, "Initialization")) {
                d31Var = M(xmlPullParser);
            }
        } while (!iz1.c(xmlPullParser, "SegmentBase"));
        return m(d31Var, O, O2, j2, j);
    }

    public ka1.b V(XmlPullParser xmlPullParser, ka1.b bVar) {
        long O = O(xmlPullParser, "timescale", bVar != null ? bVar.b : 1L);
        long O2 = O(xmlPullParser, "presentationTimeOffset", bVar != null ? bVar.c : 0L);
        long O3 = O(xmlPullParser, "duration", bVar != null ? bVar.e : -9223372036854775807L);
        long O4 = O(xmlPullParser, "startNumber", bVar != null ? bVar.d : 1L);
        List<d31> list = null;
        d31 d31Var = null;
        List<ka1.d> list2 = null;
        do {
            xmlPullParser.next();
            if (iz1.e(xmlPullParser, "Initialization")) {
                d31Var = M(xmlPullParser);
            } else if (iz1.e(xmlPullParser, "SegmentTimeline")) {
                list2 = X(xmlPullParser);
            } else if (iz1.e(xmlPullParser, "SegmentURL")) {
                if (list == null) {
                    list = new ArrayList<>();
                }
                list.add(Y(xmlPullParser));
            }
        } while (!iz1.c(xmlPullParser, "SegmentList"));
        if (bVar != null) {
            if (d31Var == null) {
                d31Var = bVar.a;
            }
            if (list2 == null) {
                list2 = bVar.f;
            }
            if (list == null) {
                list = bVar.g;
            }
        }
        return j(d31Var, O, O2, O4, O3, list2, list);
    }

    public ka1.c W(XmlPullParser xmlPullParser, ka1.c cVar) {
        long O = O(xmlPullParser, "timescale", cVar != null ? cVar.b : 1L);
        long O2 = O(xmlPullParser, "presentationTimeOffset", cVar != null ? cVar.c : 0L);
        long O3 = O(xmlPullParser, "duration", cVar != null ? cVar.e : -9223372036854775807L);
        long O4 = O(xmlPullParser, "startNumber", cVar != null ? cVar.d : 1L);
        d31 d31Var = null;
        kq1 a0 = a0(xmlPullParser, "media", cVar != null ? cVar.h : null);
        kq1 a02 = a0(xmlPullParser, "initialization", cVar != null ? cVar.g : null);
        List<ka1.d> list = null;
        do {
            xmlPullParser.next();
            if (iz1.e(xmlPullParser, "Initialization")) {
                d31Var = M(xmlPullParser);
            } else if (iz1.e(xmlPullParser, "SegmentTimeline")) {
                list = X(xmlPullParser);
            }
        } while (!iz1.c(xmlPullParser, "SegmentTemplate"));
        if (cVar != null) {
            if (d31Var == null) {
                d31Var = cVar.a;
            }
            if (list == null) {
                list = cVar.f;
            }
        }
        return k(d31Var, O, O2, O4, O3, list, a02, a0);
    }

    public List<ka1.d> X(XmlPullParser xmlPullParser) {
        ArrayList arrayList = new ArrayList();
        long j = 0;
        do {
            xmlPullParser.next();
            if (iz1.e(xmlPullParser, "S")) {
                j = O(xmlPullParser, "t", j);
                long O = O(xmlPullParser, "d", -9223372036854775807L);
                int N = N(xmlPullParser, "r", 0) + 1;
                for (int i = 0; i < N; i++) {
                    arrayList.add(l(j, O));
                    j += O;
                }
            }
        } while (!iz1.c(xmlPullParser, "SegmentTimeline"));
        return arrayList;
    }

    public d31 Y(XmlPullParser xmlPullParser) {
        return R(xmlPullParser, "media", "mediaRange");
    }

    public kq1 a0(XmlPullParser xmlPullParser, String str, kq1 kq1Var) {
        String attributeValue = xmlPullParser.getAttributeValue(null, str);
        return attributeValue != null ? kq1.b(attributeValue) : kq1Var;
    }

    public e1 b(int i, int i2, List<j41> list, List<jt> list2, List<jt> list3) {
        return new e1(i, i2, list, list2, list3);
    }

    public pq1 b0(XmlPullParser xmlPullParser) {
        return n(xmlPullParser.getAttributeValue(null, "schemeIdUri"), xmlPullParser.getAttributeValue(null, "value"));
    }

    public EventMessage c(String str, String str2, long j, long j2, byte[] bArr, long j3) {
        return new EventMessage(str, str2, j2, j, bArr, j3);
    }

    public sy d(String str, String str2, long j, long[] jArr, EventMessage[] eventMessageArr) {
        return new sy(str, str2, j, jArr, eventMessageArr);
    }

    public Format e(String str, String str2, int i, int i2, float f, int i3, int i4, int i5, String str3, int i6, List<jt> list, String str4, List<jt> list2) {
        String str5;
        int i7;
        int A;
        String s = s(str2, str4);
        if (s != null) {
            if ("audio/eac3".equals(s)) {
                s = H(list2);
            }
            str5 = s;
            if (hq0.m(str5)) {
                return Format.G(str, str2, str5, str4, i5, i, i2, f, null, i6);
            }
            if (hq0.k(str5)) {
                return Format.q(str, str2, str5, str4, i5, i3, i4, null, i6, str3);
            }
            if (t(str5)) {
                if ("application/cea-608".equals(str5)) {
                    A = z(list);
                } else if (!"application/cea-708".equals(str5)) {
                    i7 = -1;
                    return Format.A(str, str2, str5, str4, i5, i6, str3, i7);
                } else {
                    A = A(list);
                }
                i7 = A;
                return Format.A(str, str2, str5, str4, i5, i6, str3, i7);
            }
        } else {
            str5 = s;
        }
        return Format.v(str, str2, str5, str4, i5, i6, str3);
    }

    public wo f(long j, long j2, long j3, boolean z, long j4, long j5, long j6, long j7, pq1 pq1Var, Uri uri, List<gw0> list) {
        return new wo(j, j2, j3, z, j4, j5, j6, j7, pq1Var, uri, list);
    }

    public gw0 g(String str, long j, List<e1> list, List<sy> list2) {
        return new gw0(str, j, list, list2);
    }

    public d31 h(String str, long j, long j2) {
        return new d31(str, j, j2);
    }

    public j41 i(a aVar, String str, String str2, ArrayList<DrmInitData.SchemeData> arrayList, ArrayList<jt> arrayList2) {
        Format format = aVar.a;
        String str3 = aVar.d;
        if (str3 != null) {
            str2 = str3;
        }
        ArrayList<DrmInitData.SchemeData> arrayList3 = aVar.e;
        arrayList3.addAll(arrayList);
        if (!arrayList3.isEmpty()) {
            q(arrayList3);
            format = format.b(new DrmInitData(str2, arrayList3));
        }
        ArrayList<jt> arrayList4 = aVar.f;
        arrayList4.addAll(arrayList2);
        return j41.l(str, aVar.g, format, aVar.b, aVar.c, arrayList4);
    }

    public ka1.b j(d31 d31Var, long j, long j2, long j3, long j4, List<ka1.d> list, List<d31> list2) {
        return new ka1.b(d31Var, j, j2, j3, j4, list, list2);
    }

    public ka1.c k(d31 d31Var, long j, long j2, long j3, long j4, List<ka1.d> list, kq1 kq1Var, kq1 kq1Var2) {
        return new ka1.c(d31Var, j, j2, j3, j4, list, kq1Var, kq1Var2);
    }

    public ka1.d l(long j, long j2) {
        return new ka1.d(j, j2);
    }

    public ka1.e m(d31 d31Var, long j, long j2, long j3, long j4) {
        return new ka1.e(d31Var, j, j2, j3, j4);
    }

    public pq1 n(String str, String str2) {
        return new pq1(str, str2);
    }

    public int r(Format format) {
        String str = format.u;
        if (TextUtils.isEmpty(str)) {
            return -1;
        }
        if (hq0.m(str)) {
            return 2;
        }
        if (hq0.k(str)) {
            return 1;
        }
        return t(str) ? 3 : -1;
    }

    @Override // com.daaw.vv0.a
    /* renamed from: u */
    public wo a(Uri uri, InputStream inputStream) {
        try {
            XmlPullParser newPullParser = this.b.newPullParser();
            newPullParser.setInput(inputStream, null);
            if (newPullParser.next() == 2 && "MPD".equals(newPullParser.getName())) {
                return P(newPullParser, uri.toString());
            }
            throw new tv0("inputStream does not contain a valid media presentation description");
        } catch (XmlPullParserException e2) {
            throw new tv0(e2);
        }
    }

    /* JADX WARN: Type inference failed for: r0v44, types: [java.lang.Object] */
    public e1 v(XmlPullParser xmlPullParser, String str, ka1 ka1Var) {
        String str2;
        String str3;
        ArrayList arrayList;
        ArrayList arrayList2;
        ArrayList arrayList3;
        ArrayList<DrmInitData.SchemeData> arrayList4;
        String str4;
        String str5;
        XmlPullParser xmlPullParser2;
        int i;
        ArrayList<jt> arrayList5;
        ka1 W;
        int i2;
        XmlPullParser xmlPullParser3 = xmlPullParser;
        int N = N(xmlPullParser3, "id", -1);
        int C = C(xmlPullParser);
        String str6 = null;
        String attributeValue = xmlPullParser3.getAttributeValue(null, "mimeType");
        String attributeValue2 = xmlPullParser3.getAttributeValue(null, "codecs");
        int N2 = N(xmlPullParser3, "width", -1);
        int N3 = N(xmlPullParser3, "height", -1);
        float L = L(xmlPullParser3, -1.0f);
        int N4 = N(xmlPullParser3, "audioSamplingRate", -1);
        String str7 = "lang";
        String attributeValue3 = xmlPullParser3.getAttributeValue(null, "lang");
        ArrayList<DrmInitData.SchemeData> arrayList6 = new ArrayList<>();
        ArrayList<jt> arrayList7 = new ArrayList<>();
        ArrayList arrayList8 = new ArrayList();
        ArrayList arrayList9 = new ArrayList();
        ArrayList arrayList10 = new ArrayList();
        String str8 = str;
        ka1 ka1Var2 = ka1Var;
        int i3 = C;
        String str9 = attributeValue3;
        String str10 = null;
        int i4 = -1;
        boolean z = false;
        int i5 = 0;
        while (true) {
            xmlPullParser.next();
            if (iz1.e(xmlPullParser3, "BaseURL")) {
                if (!z) {
                    z = true;
                    str3 = y(xmlPullParser3, str8);
                    arrayList = arrayList10;
                    arrayList2 = arrayList9;
                    arrayList3 = arrayList8;
                    arrayList5 = arrayList7;
                    arrayList4 = arrayList6;
                    str4 = str7;
                    str5 = str6;
                    xmlPullParser2 = xmlPullParser3;
                    i2 = i3;
                }
                str2 = str9;
                i = i3;
                str3 = str8;
                arrayList = arrayList10;
                arrayList2 = arrayList9;
                arrayList3 = arrayList8;
                arrayList5 = arrayList7;
                arrayList4 = arrayList6;
                str4 = str7;
                str5 = str6;
                xmlPullParser2 = xmlPullParser3;
                i2 = i;
                str9 = str2;
            } else {
                if (iz1.e(xmlPullParser3, "ContentProtection")) {
                    Pair<String, DrmInitData.SchemeData> B = B(xmlPullParser);
                    Object obj = B.first;
                    if (obj != null) {
                        str10 = (String) obj;
                    }
                    ?? r0 = B.second;
                    if (r0 != 0) {
                        arrayList6.add(r0);
                    }
                } else if (iz1.e(xmlPullParser3, "ContentComponent")) {
                    str9 = p(str9, xmlPullParser3.getAttributeValue(str6, str7));
                    str3 = str8;
                    arrayList = arrayList10;
                    arrayList2 = arrayList9;
                    arrayList3 = arrayList8;
                    arrayList5 = arrayList7;
                    arrayList4 = arrayList6;
                    str4 = str7;
                    str5 = str6;
                    i2 = o(i3, C(xmlPullParser));
                    xmlPullParser2 = xmlPullParser3;
                } else if (iz1.e(xmlPullParser3, "Role")) {
                    i5 |= T(xmlPullParser);
                } else if (iz1.e(xmlPullParser3, "AudioChannelConfiguration")) {
                    i4 = x(xmlPullParser);
                } else {
                    if (iz1.e(xmlPullParser3, "Accessibility")) {
                        arrayList8.add(E(xmlPullParser3, "Accessibility"));
                    } else if (iz1.e(xmlPullParser3, "SupplementalProperty")) {
                        arrayList9.add(E(xmlPullParser3, "SupplementalProperty"));
                    } else if (iz1.e(xmlPullParser3, "Representation")) {
                        String str11 = str9;
                        str3 = str8;
                        arrayList2 = arrayList9;
                        arrayList3 = arrayList8;
                        arrayList4 = arrayList6;
                        str4 = str7;
                        str5 = str6;
                        a S = S(xmlPullParser, str8, attributeValue, attributeValue2, N2, N3, L, i4, N4, str11, i5, arrayList3, ka1Var2);
                        int o = o(i3, r(S.a));
                        arrayList = arrayList10;
                        arrayList.add(S);
                        i2 = o;
                        str9 = str11;
                        arrayList5 = arrayList7;
                        xmlPullParser2 = xmlPullParser;
                    } else {
                        str2 = str9;
                        str3 = str8;
                        arrayList = arrayList10;
                        arrayList2 = arrayList9;
                        arrayList3 = arrayList8;
                        ArrayList<jt> arrayList11 = arrayList7;
                        arrayList4 = arrayList6;
                        str4 = str7;
                        str5 = str6;
                        xmlPullParser2 = xmlPullParser;
                        i = i3;
                        if (iz1.e(xmlPullParser2, "SegmentBase")) {
                            W = U(xmlPullParser2, (ka1.e) ka1Var2);
                        } else if (iz1.e(xmlPullParser2, "SegmentList")) {
                            W = V(xmlPullParser2, (ka1.b) ka1Var2);
                        } else if (iz1.e(xmlPullParser2, "SegmentTemplate")) {
                            W = W(xmlPullParser2, (ka1.c) ka1Var2);
                        } else {
                            if (iz1.e(xmlPullParser2, "InbandEventStream")) {
                                arrayList5 = arrayList11;
                                arrayList5.add(E(xmlPullParser2, "InbandEventStream"));
                            } else {
                                arrayList5 = arrayList11;
                                if (iz1.d(xmlPullParser)) {
                                    w(xmlPullParser);
                                }
                            }
                            i2 = i;
                            str9 = str2;
                        }
                        ka1Var2 = W;
                        i2 = i;
                        str9 = str2;
                        arrayList5 = arrayList11;
                    }
                    str2 = str9;
                    i = i3;
                    str3 = str8;
                    arrayList = arrayList10;
                    arrayList2 = arrayList9;
                    arrayList3 = arrayList8;
                    arrayList5 = arrayList7;
                    arrayList4 = arrayList6;
                    str4 = str7;
                    str5 = str6;
                    xmlPullParser2 = xmlPullParser3;
                    i2 = i;
                    str9 = str2;
                }
                str3 = str8;
                arrayList = arrayList10;
                arrayList2 = arrayList9;
                arrayList3 = arrayList8;
                arrayList5 = arrayList7;
                arrayList4 = arrayList6;
                str4 = str7;
                str5 = str6;
                xmlPullParser2 = xmlPullParser3;
                i2 = i3;
            }
            if (iz1.c(xmlPullParser2, "AdaptationSet")) {
                break;
            }
            xmlPullParser3 = xmlPullParser2;
            arrayList7 = arrayList5;
            i3 = i2;
            arrayList9 = arrayList2;
            arrayList8 = arrayList3;
            arrayList6 = arrayList4;
            str7 = str4;
            str6 = str5;
            arrayList10 = arrayList;
            str8 = str3;
        }
        ArrayList arrayList12 = new ArrayList(arrayList.size());
        for (int i6 = 0; i6 < arrayList.size(); i6++) {
            arrayList12.add(i((a) arrayList.get(i6), this.a, str10, arrayList4, arrayList5));
        }
        return b(N, i2, arrayList12, arrayList3, arrayList2);
    }

    public void w(XmlPullParser xmlPullParser) {
    }

    public int x(XmlPullParser xmlPullParser) {
        String Z = Z(xmlPullParser, "schemeIdUri", null);
        int i = -1;
        if ("urn:mpeg:dash:23003:3:audio_channel_configuration:2011".equals(Z)) {
            i = N(xmlPullParser, "value", -1);
        } else if ("tag:dolby.com,2014:dash:audio_channel_configuration:2011".equals(Z)) {
            i = F(xmlPullParser);
        }
        do {
            xmlPullParser.next();
        } while (!iz1.c(xmlPullParser, "AudioChannelConfiguration"));
        return i;
    }
}
