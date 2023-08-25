package com.daaw;

import android.net.Uri;
import android.text.TextUtils;
import android.util.Base64;
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
import java.util.UUID;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import org.xml.sax.helpers.DefaultHandler;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;
import org.xmlpull.v1.XmlPullParserFactory;
import org.xmlpull.v1.XmlSerializer;
/* renamed from: com.daaw.xo */
/* loaded from: classes.dex */
public class C3561xo extends DefaultHandler implements vv0.InterfaceC3379a<C3456wo> {

    /* renamed from: c */
    public static final Pattern f32841c = Pattern.compile("(\\d+)(?:/(\\d+))?");

    /* renamed from: d */
    public static final Pattern f32842d = Pattern.compile("CC([1-4])=.*");

    /* renamed from: e */
    public static final Pattern f32843e = Pattern.compile("([1-9]|[1-5][0-9]|6[0-3])=.*");

    /* renamed from: a */
    public final String f32844a;

    /* renamed from: b */
    public final XmlPullParserFactory f32845b;

    /* renamed from: com.daaw.xo$a */
    /* loaded from: classes.dex */
    public static final class C3562a {

        /* renamed from: a */
        public final Format f32846a;

        /* renamed from: b */
        public final String f32847b;

        /* renamed from: c */
        public final ka1 f32848c;

        /* renamed from: d */
        public final String f32849d;

        /* renamed from: e */
        public final ArrayList<DrmInitData.SchemeData> f32850e;

        /* renamed from: f */
        public final ArrayList<C1860jt> f32851f;

        /* renamed from: g */
        public final long f32852g;

        public C3562a(Format format, String str, ka1 ka1Var, String str2, ArrayList<DrmInitData.SchemeData> arrayList, ArrayList<C1860jt> arrayList2, long j) {
            this.f32846a = format;
            this.f32847b = str;
            this.f32848c = ka1Var;
            this.f32849d = str2;
            this.f32850e = arrayList;
            this.f32851f = arrayList2;
            this.f32852g = j;
        }
    }

    public C3561xo() {
        this(null);
    }

    public C3561xo(String str) {
        this.f32844a = str;
        try {
            this.f32845b = XmlPullParserFactory.newInstance();
        } catch (XmlPullParserException e) {
            throw new RuntimeException("Couldn't create XmlPullParserFactory instance", e);
        }
    }

    /* renamed from: A */
    public static int m4937A(List<C1860jt> list) {
        String str;
        for (int i = 0; i < list.size(); i++) {
            C1860jt c1860jt = list.get(i);
            if ("urn:scte:dash:cc:cea-708:2015".equals(c1860jt.f15376a) && (str = c1860jt.f15377b) != null) {
                Matcher matcher = f32843e.matcher(str);
                if (matcher.matches()) {
                    return Integer.parseInt(matcher.group(1));
                }
                StringBuilder sb = new StringBuilder();
                sb.append("Unable to parse CEA-708 service block number from: ");
                sb.append(c1860jt.f15377b);
            }
        }
        return -1;
    }

    /* renamed from: D */
    public static long m4934D(XmlPullParser xmlPullParser, String str, long j) {
        String attributeValue = xmlPullParser.getAttributeValue(null, str);
        return attributeValue == null ? j : sq1.m10030O(attributeValue);
    }

    /* renamed from: E */
    public static C1860jt m4933E(XmlPullParser xmlPullParser, String str) {
        String m4912Z = m4912Z(xmlPullParser, "schemeIdUri", "");
        String m4912Z2 = m4912Z(xmlPullParser, "value", null);
        String m4912Z3 = m4912Z(xmlPullParser, "id", null);
        do {
            xmlPullParser.next();
        } while (!iz1.m19249c(xmlPullParser, str));
        return new C1860jt(m4912Z, m4912Z2, m4912Z3);
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* renamed from: F */
    public static int m4932F(XmlPullParser xmlPullParser) {
        char c;
        String m10017a0 = sq1.m10017a0(xmlPullParser.getAttributeValue(null, "value"));
        if (m10017a0 == null) {
            return -1;
        }
        switch (m10017a0.hashCode()) {
            case 1596796:
                if (m10017a0.equals("4000")) {
                    c = 0;
                    break;
                }
                c = 65535;
                break;
            case 2937391:
                if (m10017a0.equals("a000")) {
                    c = 1;
                    break;
                }
                c = 65535;
                break;
            case 3094035:
                if (m10017a0.equals("f801")) {
                    c = 2;
                    break;
                }
                c = 65535;
                break;
            case 3133436:
                if (m10017a0.equals("fa01")) {
                    c = 3;
                    break;
                }
                c = 65535;
                break;
            default:
                c = 65535;
                break;
        }
        switch (c) {
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

    /* renamed from: G */
    public static long m4931G(XmlPullParser xmlPullParser, String str, long j) {
        String attributeValue = xmlPullParser.getAttributeValue(null, str);
        return attributeValue == null ? j : sq1.m10029P(attributeValue);
    }

    /* renamed from: H */
    public static String m4930H(List<C1860jt> list) {
        for (int i = 0; i < list.size(); i++) {
            C1860jt c1860jt = list.get(i);
            if ("tag:dolby.com,2014:dash:DolbyDigitalPlusExtensionType:2014".equals(c1860jt.f15376a) && "ec+3".equals(c1860jt.f15377b)) {
                return "audio/eac3-joc";
            }
        }
        return "audio/eac3";
    }

    /* renamed from: L */
    public static float m4926L(XmlPullParser xmlPullParser, float f) {
        String group;
        String attributeValue = xmlPullParser.getAttributeValue(null, "frameRate");
        if (attributeValue != null) {
            Matcher matcher = f32841c.matcher(attributeValue);
            if (matcher.matches()) {
                int parseInt = Integer.parseInt(matcher.group(1));
                float f2 = parseInt;
                return !TextUtils.isEmpty(matcher.group(2)) ? f2 / Integer.parseInt(group) : f2;
            }
            return f;
        }
        return f;
    }

    /* renamed from: N */
    public static int m4924N(XmlPullParser xmlPullParser, String str, int i) {
        String attributeValue = xmlPullParser.getAttributeValue(null, str);
        return attributeValue == null ? i : Integer.parseInt(attributeValue);
    }

    /* renamed from: O */
    public static long m4923O(XmlPullParser xmlPullParser, String str, long j) {
        String attributeValue = xmlPullParser.getAttributeValue(null, str);
        return attributeValue == null ? j : Long.parseLong(attributeValue);
    }

    /* renamed from: Z */
    public static String m4912Z(XmlPullParser xmlPullParser, String str, String str2) {
        String attributeValue = xmlPullParser.getAttributeValue(null, str);
        return attributeValue == null ? str2 : attributeValue;
    }

    /* renamed from: o */
    public static int m4896o(int i, int i2) {
        if (i == -1) {
            return i2;
        }
        if (i2 == -1) {
            return i;
        }
        C2914s6.m10685f(i == i2);
        return i;
    }

    /* renamed from: p */
    public static String m4895p(String str, String str2) {
        if (str == null) {
            return str2;
        }
        if (str2 == null) {
            return str;
        }
        C2914s6.m10685f(str.equals(str2));
        return str;
    }

    /* renamed from: q */
    public static void m4894q(ArrayList<DrmInitData.SchemeData> arrayList) {
        for (int size = arrayList.size() - 1; size >= 0; size--) {
            DrmInitData.SchemeData schemeData = arrayList.get(size);
            if (!schemeData.m1707c()) {
                int i = 0;
                while (true) {
                    if (i >= arrayList.size()) {
                        break;
                    } else if (arrayList.get(i).m1708b(schemeData)) {
                        arrayList.remove(size);
                        break;
                    } else {
                        i++;
                    }
                }
            }
        }
    }

    /* renamed from: s */
    public static String m4892s(String str, String str2) {
        if (hq0.m20494k(str)) {
            return hq0.m20504a(str2);
        }
        if (hq0.m20492m(str)) {
            return hq0.m20495j(str2);
        }
        if (m4891t(str)) {
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

    /* renamed from: t */
    public static boolean m4891t(String str) {
        return hq0.m20493l(str) || "application/ttml+xml".equals(str) || "application/x-mp4-vtt".equals(str) || "application/cea-708".equals(str) || "application/cea-608".equals(str);
    }

    /* renamed from: y */
    public static String m4886y(XmlPullParser xmlPullParser, String str) {
        xmlPullParser.next();
        return iq1.m19492c(str, xmlPullParser.getText());
    }

    /* renamed from: z */
    public static int m4885z(List<C1860jt> list) {
        String str;
        for (int i = 0; i < list.size(); i++) {
            C1860jt c1860jt = list.get(i);
            if ("urn:scte:dash:cc:cea-608:2015".equals(c1860jt.f15376a) && (str = c1860jt.f15377b) != null) {
                Matcher matcher = f32842d.matcher(str);
                if (matcher.matches()) {
                    return Integer.parseInt(matcher.group(1));
                }
                StringBuilder sb = new StringBuilder();
                sb.append("Unable to parse CEA-608 channel number from: ");
                sb.append(c1860jt.f15377b);
            }
        }
        return -1;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:39:0x0091  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x00a5  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x00f7  */
    /* renamed from: B */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Pair<String, DrmInitData.SchemeData> m4936B(XmlPullParser xmlPullParser) {
        String str;
        UUID uuid;
        UUID uuid2;
        UUID uuid3;
        byte[] bArr;
        String attributeValue = xmlPullParser.getAttributeValue(null, "schemeIdUri");
        if (attributeValue != null) {
            String m10017a0 = sq1.m10017a0(attributeValue);
            m10017a0.hashCode();
            char c = 65535;
            switch (m10017a0.hashCode()) {
                case 489446379:
                    if (m10017a0.equals("urn:uuid:9a04f079-9840-4286-ab92-e65be0885f95")) {
                        c = 0;
                        break;
                    }
                    break;
                case 755418770:
                    if (m10017a0.equals("urn:uuid:edef8ba9-79d6-4ace-a3c8-27dcd51d21ed")) {
                        c = 1;
                        break;
                    }
                    break;
                case 1812765994:
                    if (m10017a0.equals("urn:mpeg:dash:mp4protection:2011")) {
                        c = 2;
                        break;
                    }
                    break;
            }
            switch (c) {
                case 0:
                    uuid = C1075dd.f6946f;
                    str = null;
                    uuid2 = null;
                    break;
                case 1:
                    uuid = C1075dd.f6945e;
                    str = null;
                    uuid2 = null;
                    break;
                case 2:
                    str = xmlPullParser.getAttributeValue(null, "value");
                    String attributeValue2 = xmlPullParser.getAttributeValue(null, "cenc:default_KID");
                    if (!TextUtils.isEmpty(attributeValue2) && !"00000000-0000-0000-0000-000000000000".equals(attributeValue2)) {
                        String[] split = attributeValue2.split("\\s+");
                        UUID[] uuidArr = new UUID[split.length];
                        for (int i = 0; i < split.length; i++) {
                            uuidArr[i] = UUID.fromString(split[i]);
                        }
                        uuid = C1075dd.f6943c;
                        uuid2 = d01.m24844b(uuid, uuidArr, null);
                        break;
                    } else {
                        uuid = null;
                        uuid2 = uuid;
                        break;
                    }
            }
            boolean z = false;
            uuid3 = uuid2;
            do {
                xmlPullParser.next();
                bArr = uuid3;
                if (!iz1.m19247e(xmlPullParser, "widevine:license")) {
                    String attributeValue3 = xmlPullParser.getAttributeValue(null, "robustness_level");
                    if (attributeValue3 == null || !attributeValue3.startsWith("HW")) {
                        z = false;
                        bArr = uuid3;
                    } else {
                        z = true;
                        bArr = uuid3;
                    }
                } else if (uuid3 == null) {
                    if (iz1.m19247e(xmlPullParser, "cenc:pssh") && xmlPullParser.next() == 4) {
                        byte[] decode = Base64.decode(xmlPullParser.getText(), 0);
                        UUID m24841e = d01.m24841e(decode);
                        if (m24841e == null) {
                            uuid = m24841e;
                            bArr = 0;
                        } else {
                            bArr = decode;
                            uuid = m24841e;
                        }
                    } else {
                        UUID uuid4 = C1075dd.f6946f;
                        bArr = uuid3;
                        if (uuid4.equals(uuid)) {
                            bArr = uuid3;
                            if (iz1.m19247e(xmlPullParser, "mspr:pro")) {
                                bArr = uuid3;
                                if (xmlPullParser.next() == 4) {
                                    bArr = d01.m24845a(uuid4, Base64.decode(xmlPullParser.getText(), 0));
                                }
                            }
                        }
                    }
                }
                uuid3 = bArr;
            } while (!iz1.m19249c(xmlPullParser, "ContentProtection"));
            return Pair.create(str, uuid != null ? new DrmInitData.SchemeData(uuid, "video/mp4", bArr, z) : null);
        }
        str = null;
        uuid = null;
        uuid2 = uuid;
        boolean z2 = false;
        uuid3 = uuid2;
        do {
            xmlPullParser.next();
            bArr = uuid3;
            if (!iz1.m19247e(xmlPullParser, "widevine:license")) {
            }
            uuid3 = bArr;
        } while (!iz1.m19249c(xmlPullParser, "ContentProtection"));
        return Pair.create(str, uuid != null ? new DrmInitData.SchemeData(uuid, "video/mp4", bArr, z2) : null);
    }

    /* renamed from: C */
    public int m4935C(XmlPullParser xmlPullParser) {
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

    /* renamed from: I */
    public EventMessage m4929I(XmlPullParser xmlPullParser, String str, String str2, long j, ByteArrayOutputStream byteArrayOutputStream) {
        long m4923O = m4923O(xmlPullParser, "id", 0L);
        long m4923O2 = m4923O(xmlPullParser, "duration", -9223372036854775807L);
        long m4923O3 = m4923O(xmlPullParser, "presentationTime", 0L);
        return m4908c(str, str2, m4923O, sq1.m10025T(m4923O2, 1000L, j), m4928J(xmlPullParser, byteArrayOutputStream), sq1.m10025T(m4923O3, 1000000L, j));
    }

    /* renamed from: J */
    public byte[] m4928J(XmlPullParser xmlPullParser, ByteArrayOutputStream byteArrayOutputStream) {
        byteArrayOutputStream.reset();
        XmlSerializer newSerializer = Xml.newSerializer();
        newSerializer.setOutput(byteArrayOutputStream, null);
        while (true) {
            xmlPullParser.nextToken();
            if (iz1.m19249c(xmlPullParser, "Event")) {
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

    /* renamed from: K */
    public C2989sy m4927K(XmlPullParser xmlPullParser) {
        String m4912Z = m4912Z(xmlPullParser, "schemeIdUri", "");
        String m4912Z2 = m4912Z(xmlPullParser, "value", "");
        long m4923O = m4923O(xmlPullParser, "timescale", 1L);
        ArrayList arrayList = new ArrayList();
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream(512);
        do {
            xmlPullParser.next();
            if (iz1.m19247e(xmlPullParser, "Event")) {
                arrayList.add(m4929I(xmlPullParser, m4912Z, m4912Z2, m4923O, byteArrayOutputStream));
            }
        } while (!iz1.m19249c(xmlPullParser, "EventStream"));
        long[] jArr = new long[arrayList.size()];
        EventMessage[] eventMessageArr = new EventMessage[arrayList.size()];
        for (int i = 0; i < arrayList.size(); i++) {
            EventMessage eventMessage = (EventMessage) arrayList.get(i);
            jArr[i] = eventMessage.f35775s;
            eventMessageArr[i] = eventMessage;
        }
        return m4907d(m4912Z, m4912Z2, m4923O, jArr, eventMessageArr);
    }

    /* renamed from: M */
    public d31 m4925M(XmlPullParser xmlPullParser) {
        return m4920R(xmlPullParser, "sourceURL", "range");
    }

    /* renamed from: P */
    public C3456wo m4922P(XmlPullParser xmlPullParser, String str) {
        pq1 pq1Var;
        long m4934D = m4934D(xmlPullParser, "availabilityStartTime", -9223372036854775807L);
        long m4931G = m4931G(xmlPullParser, "mediaPresentationDuration", -9223372036854775807L);
        long m4931G2 = m4931G(xmlPullParser, "minBufferTime", -9223372036854775807L);
        String attributeValue = xmlPullParser.getAttributeValue(null, "type");
        boolean z = attributeValue != null && "dynamic".equals(attributeValue);
        long m4931G3 = z ? m4931G(xmlPullParser, "minimumUpdatePeriod", -9223372036854775807L) : -9223372036854775807L;
        long m4931G4 = z ? m4931G(xmlPullParser, "timeShiftBufferDepth", -9223372036854775807L) : -9223372036854775807L;
        long m4931G5 = z ? m4931G(xmlPullParser, "suggestedPresentationDelay", -9223372036854775807L) : -9223372036854775807L;
        long m4934D2 = m4934D(xmlPullParser, "publishTime", -9223372036854775807L);
        ArrayList arrayList = new ArrayList();
        long j = z ? -9223372036854775807L : 0L;
        boolean z2 = false;
        boolean z3 = false;
        Uri uri = null;
        String str2 = str;
        pq1 pq1Var2 = null;
        while (true) {
            xmlPullParser.next();
            if (iz1.m19247e(xmlPullParser, "BaseURL")) {
                if (!z2) {
                    str2 = m4886y(xmlPullParser, str2);
                    pq1Var = pq1Var2;
                    z2 = true;
                }
                pq1Var = pq1Var2;
                str2 = str2;
                j = j;
            } else if (iz1.m19247e(xmlPullParser, "UTCTiming")) {
                pq1Var = m4909b0(xmlPullParser);
            } else {
                if (iz1.m19247e(xmlPullParser, "Location")) {
                    uri = Uri.parse(xmlPullParser.nextText());
                } else {
                    if (iz1.m19247e(xmlPullParser, "Period") && !z3) {
                        Pair<gw0, Long> m4921Q = m4921Q(xmlPullParser, str2, j);
                        String str3 = str2;
                        gw0 gw0Var = (gw0) m4921Q.first;
                        long j2 = j;
                        if (gw0Var.f11773b != -9223372036854775807L) {
                            long longValue = ((Long) m4921Q.second).longValue();
                            long j3 = longValue == -9223372036854775807L ? -9223372036854775807L : gw0Var.f11773b + longValue;
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
            if (iz1.m19249c(xmlPullParser, "MPD")) {
                if (m4931G == -9223372036854775807L) {
                    if (j != -9223372036854775807L) {
                        m4931G = j;
                    } else if (!z) {
                        throw new tv0("Unable to determine duration of static manifest.");
                    }
                }
                if (arrayList.isEmpty()) {
                    throw new tv0("No periods found.");
                }
                return m4905f(m4934D, m4931G, m4931G2, z, m4931G3, m4931G4, m4931G5, m4934D2, pq1Var, uri, arrayList);
            }
            pq1Var2 = pq1Var;
        }
    }

    /* renamed from: Q */
    public Pair<gw0, Long> m4921Q(XmlPullParser xmlPullParser, String str, long j) {
        String attributeValue = xmlPullParser.getAttributeValue(null, "id");
        long m4931G = m4931G(xmlPullParser, "start", j);
        long m4931G2 = m4931G(xmlPullParser, "duration", -9223372036854775807L);
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        boolean z = false;
        ka1 ka1Var = null;
        do {
            xmlPullParser.next();
            if (iz1.m19247e(xmlPullParser, "BaseURL")) {
                if (!z) {
                    str = m4886y(xmlPullParser, str);
                    z = true;
                }
            } else if (iz1.m19247e(xmlPullParser, "AdaptationSet")) {
                arrayList.add(m4889v(xmlPullParser, str, ka1Var));
            } else if (iz1.m19247e(xmlPullParser, "EventStream")) {
                arrayList2.add(m4927K(xmlPullParser));
            } else if (iz1.m19247e(xmlPullParser, "SegmentBase")) {
                ka1Var = m4917U(xmlPullParser, null);
            } else if (iz1.m19247e(xmlPullParser, "SegmentList")) {
                ka1Var = m4916V(xmlPullParser, null);
            } else if (iz1.m19247e(xmlPullParser, "SegmentTemplate")) {
                ka1Var = m4915W(xmlPullParser, null);
            }
        } while (!iz1.m19249c(xmlPullParser, "Period"));
        return Pair.create(m4904g(attributeValue, m4931G, arrayList, arrayList2), Long.valueOf(m4931G2));
    }

    /* renamed from: R */
    public d31 m4920R(XmlPullParser xmlPullParser, String str, String str2) {
        long j;
        long j2;
        String attributeValue = xmlPullParser.getAttributeValue(null, str);
        String attributeValue2 = xmlPullParser.getAttributeValue(null, str2);
        if (attributeValue2 != null) {
            String[] split = attributeValue2.split("-");
            j = Long.parseLong(split[0]);
            if (split.length == 2) {
                j2 = (Long.parseLong(split[1]) - j) + 1;
                return m4903h(attributeValue, j, j2);
            }
        } else {
            j = 0;
        }
        j2 = -1;
        return m4903h(attributeValue, j, j2);
    }

    /* JADX WARN: Removed duplicated region for block: B:45:0x0154 A[LOOP:0: B:3:0x005a->B:45:0x0154, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:46:0x011a A[EDGE_INSN: B:46:0x011a->B:39:0x011a ?: BREAK  , SYNTHETIC] */
    /* renamed from: S */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public C3562a m4919S(XmlPullParser xmlPullParser, String str, String str2, String str3, int i, int i2, float f, int i3, int i4, String str4, int i5, List<C1860jt> list, ka1 ka1Var) {
        String str5;
        ka1 m4915W;
        String str6;
        String str7;
        boolean z;
        ka1 ka1Var2;
        String attributeValue = xmlPullParser.getAttributeValue(null, "id");
        int m4924N = m4924N(xmlPullParser, "bandwidth", -1);
        String m4912Z = m4912Z(xmlPullParser, "mimeType", str2);
        String m4912Z2 = m4912Z(xmlPullParser, "codecs", str3);
        int m4924N2 = m4924N(xmlPullParser, "width", i);
        int m4924N3 = m4924N(xmlPullParser, "height", i2);
        float m4926L = m4926L(xmlPullParser, f);
        int m4924N4 = m4924N(xmlPullParser, "audioSamplingRate", i4);
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        ArrayList arrayList3 = new ArrayList();
        int i6 = i3;
        ka1 ka1Var3 = ka1Var;
        String str8 = null;
        boolean z2 = false;
        String str9 = str;
        while (true) {
            xmlPullParser.next();
            int i7 = i6;
            if (iz1.m19247e(xmlPullParser, "BaseURL")) {
                if (z2) {
                    str5 = str9;
                    i6 = i7;
                    str6 = str8;
                    z = z2;
                    str7 = str5;
                } else {
                    i6 = i7;
                    ka1Var2 = ka1Var3;
                    str6 = str8;
                    str7 = m4886y(xmlPullParser, str9);
                    z = true;
                    if (iz1.m19249c(xmlPullParser, "Representation")) {
                        break;
                    }
                    ka1Var3 = ka1Var2;
                    z2 = z;
                    str9 = str7;
                    str8 = str6;
                }
            } else if (iz1.m19247e(xmlPullParser, "AudioChannelConfiguration")) {
                i6 = m4887x(xmlPullParser);
                str6 = str8;
                str7 = str9;
                z = z2;
            } else {
                if (iz1.m19247e(xmlPullParser, "SegmentBase")) {
                    m4915W = m4917U(xmlPullParser, (ka1.C1931e) ka1Var3);
                } else if (iz1.m19247e(xmlPullParser, "SegmentList")) {
                    m4915W = m4916V(xmlPullParser, (ka1.C1928b) ka1Var3);
                } else if (iz1.m19247e(xmlPullParser, "SegmentTemplate")) {
                    m4915W = m4915W(xmlPullParser, (ka1.C1929c) ka1Var3);
                } else {
                    if (iz1.m19247e(xmlPullParser, "ContentProtection")) {
                        Pair<String, DrmInitData.SchemeData> m4936B = m4936B(xmlPullParser);
                        str5 = str9;
                        Object obj = m4936B.first;
                        if (obj != null) {
                            str8 = (String) obj;
                        }
                        Object obj2 = m4936B.second;
                        if (obj2 != null) {
                            arrayList.add(obj2);
                        }
                    } else {
                        str5 = str9;
                        if (iz1.m19247e(xmlPullParser, "InbandEventStream")) {
                            arrayList2.add(m4933E(xmlPullParser, "InbandEventStream"));
                        } else if (iz1.m19247e(xmlPullParser, "SupplementalProperty")) {
                            arrayList3.add(m4933E(xmlPullParser, "SupplementalProperty"));
                        }
                    }
                    i6 = i7;
                    str6 = str8;
                    z = z2;
                    str7 = str5;
                }
                str6 = str8;
                str7 = str9;
                z = z2;
                ka1Var2 = m4915W;
                i6 = i7;
                if (iz1.m19249c(xmlPullParser, "Representation")) {
                }
            }
            ka1Var2 = ka1Var3;
            if (iz1.m19249c(xmlPullParser, "Representation")) {
            }
        }
        return new C3562a(m4906e(attributeValue, m4912Z, m4924N2, m4924N3, m4926L, i6, m4924N4, m4924N, str4, i5, list, m4912Z2, arrayList3), str7, ka1Var2 != null ? ka1Var2 : new ka1.C1931e(), str6, arrayList, arrayList2, -1L);
    }

    /* renamed from: T */
    public int m4918T(XmlPullParser xmlPullParser) {
        String m4912Z = m4912Z(xmlPullParser, "schemeIdUri", null);
        String m4912Z2 = m4912Z(xmlPullParser, "value", null);
        do {
            xmlPullParser.next();
        } while (!iz1.m19249c(xmlPullParser, "Role"));
        return ("urn:mpeg:dash:role:2011".equals(m4912Z) && "main".equals(m4912Z2)) ? 1 : 0;
    }

    /* renamed from: U */
    public ka1.C1931e m4917U(XmlPullParser xmlPullParser, ka1.C1931e c1931e) {
        long j;
        long j2;
        long m4923O = m4923O(xmlPullParser, "timescale", c1931e != null ? c1931e.f15832b : 1L);
        long m4923O2 = m4923O(xmlPullParser, "presentationTimeOffset", c1931e != null ? c1931e.f15833c : 0L);
        long j3 = c1931e != null ? c1931e.f15842d : 0L;
        long j4 = c1931e != null ? c1931e.f15843e : 0L;
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
        d31 d31Var = c1931e != null ? c1931e.f15831a : null;
        do {
            xmlPullParser.next();
            if (iz1.m19247e(xmlPullParser, "Initialization")) {
                d31Var = m4925M(xmlPullParser);
            }
        } while (!iz1.m19249c(xmlPullParser, "SegmentBase"));
        return m4898m(d31Var, m4923O, m4923O2, j2, j);
    }

    /* renamed from: V */
    public ka1.C1928b m4916V(XmlPullParser xmlPullParser, ka1.C1928b c1928b) {
        long m4923O = m4923O(xmlPullParser, "timescale", c1928b != null ? c1928b.f15832b : 1L);
        long m4923O2 = m4923O(xmlPullParser, "presentationTimeOffset", c1928b != null ? c1928b.f15833c : 0L);
        long m4923O3 = m4923O(xmlPullParser, "duration", c1928b != null ? c1928b.f15835e : -9223372036854775807L);
        long m4923O4 = m4923O(xmlPullParser, "startNumber", c1928b != null ? c1928b.f15834d : 1L);
        List<d31> list = null;
        d31 d31Var = null;
        List<ka1.C1930d> list2 = null;
        do {
            xmlPullParser.next();
            if (iz1.m19247e(xmlPullParser, "Initialization")) {
                d31Var = m4925M(xmlPullParser);
            } else if (iz1.m19247e(xmlPullParser, "SegmentTimeline")) {
                list2 = m4914X(xmlPullParser);
            } else if (iz1.m19247e(xmlPullParser, "SegmentURL")) {
                if (list == null) {
                    list = new ArrayList<>();
                }
                list.add(m4913Y(xmlPullParser));
            }
        } while (!iz1.m19249c(xmlPullParser, "SegmentList"));
        if (c1928b != null) {
            if (d31Var == null) {
                d31Var = c1928b.f15831a;
            }
            if (list2 == null) {
                list2 = c1928b.f15836f;
            }
            if (list == null) {
                list = c1928b.f15837g;
            }
        }
        return m4901j(d31Var, m4923O, m4923O2, m4923O4, m4923O3, list2, list);
    }

    /* renamed from: W */
    public ka1.C1929c m4915W(XmlPullParser xmlPullParser, ka1.C1929c c1929c) {
        long m4923O = m4923O(xmlPullParser, "timescale", c1929c != null ? c1929c.f15832b : 1L);
        long m4923O2 = m4923O(xmlPullParser, "presentationTimeOffset", c1929c != null ? c1929c.f15833c : 0L);
        long m4923O3 = m4923O(xmlPullParser, "duration", c1929c != null ? c1929c.f15835e : -9223372036854775807L);
        long m4923O4 = m4923O(xmlPullParser, "startNumber", c1929c != null ? c1929c.f15834d : 1L);
        d31 d31Var = null;
        kq1 m4911a0 = m4911a0(xmlPullParser, "media", c1929c != null ? c1929c.f15839h : null);
        kq1 m4911a02 = m4911a0(xmlPullParser, "initialization", c1929c != null ? c1929c.f15838g : null);
        List<ka1.C1930d> list = null;
        do {
            xmlPullParser.next();
            if (iz1.m19247e(xmlPullParser, "Initialization")) {
                d31Var = m4925M(xmlPullParser);
            } else if (iz1.m19247e(xmlPullParser, "SegmentTimeline")) {
                list = m4914X(xmlPullParser);
            }
        } while (!iz1.m19249c(xmlPullParser, "SegmentTemplate"));
        if (c1929c != null) {
            if (d31Var == null) {
                d31Var = c1929c.f15831a;
            }
            if (list == null) {
                list = c1929c.f15836f;
            }
        }
        return m4900k(d31Var, m4923O, m4923O2, m4923O4, m4923O3, list, m4911a02, m4911a0);
    }

    /* renamed from: X */
    public List<ka1.C1930d> m4914X(XmlPullParser xmlPullParser) {
        ArrayList arrayList = new ArrayList();
        long j = 0;
        do {
            xmlPullParser.next();
            if (iz1.m19247e(xmlPullParser, "S")) {
                j = m4923O(xmlPullParser, "t", j);
                long m4923O = m4923O(xmlPullParser, "d", -9223372036854775807L);
                int m4924N = m4924N(xmlPullParser, "r", 0) + 1;
                for (int i = 0; i < m4924N; i++) {
                    arrayList.add(m4899l(j, m4923O));
                    j += m4923O;
                }
            }
        } while (!iz1.m19249c(xmlPullParser, "SegmentTimeline"));
        return arrayList;
    }

    /* renamed from: Y */
    public d31 m4913Y(XmlPullParser xmlPullParser) {
        return m4920R(xmlPullParser, "media", "mediaRange");
    }

    /* renamed from: a0 */
    public kq1 m4911a0(XmlPullParser xmlPullParser, String str, kq1 kq1Var) {
        String attributeValue = xmlPullParser.getAttributeValue(null, str);
        return attributeValue != null ? kq1.m17487b(attributeValue) : kq1Var;
    }

    /* renamed from: b */
    public C1154e1 m4910b(int i, int i2, List<j41> list, List<C1860jt> list2, List<C1860jt> list3) {
        return new C1154e1(i, i2, list, list2, list3);
    }

    /* renamed from: b0 */
    public pq1 m4909b0(XmlPullParser xmlPullParser) {
        return m4897n(xmlPullParser.getAttributeValue(null, "schemeIdUri"), xmlPullParser.getAttributeValue(null, "value"));
    }

    /* renamed from: c */
    public EventMessage m4908c(String str, String str2, long j, long j2, byte[] bArr, long j3) {
        return new EventMessage(str, str2, j2, j, bArr, j3);
    }

    /* renamed from: d */
    public C2989sy m4907d(String str, String str2, long j, long[] jArr, EventMessage[] eventMessageArr) {
        return new C2989sy(str, str2, j, jArr, eventMessageArr);
    }

    /* renamed from: e */
    public Format m4906e(String str, String str2, int i, int i2, float f, int i3, int i4, int i5, String str3, int i6, List<C1860jt> list, String str4, List<C1860jt> list2) {
        String str5;
        int i7;
        int m4937A;
        String m4892s = m4892s(str2, str4);
        if (m4892s != null) {
            if ("audio/eac3".equals(m4892s)) {
                m4892s = m4930H(list2);
            }
            str5 = m4892s;
            if (hq0.m20492m(str5)) {
                return Format.m1739G(str, str2, str5, str4, i5, i, i2, f, null, i6);
            }
            if (hq0.m20494k(str5)) {
                return Format.m1725q(str, str2, str5, str4, i5, i3, i4, null, i6, str3);
            }
            if (m4891t(str5)) {
                if ("application/cea-608".equals(str5)) {
                    m4937A = m4885z(list);
                } else if (!"application/cea-708".equals(str5)) {
                    i7 = -1;
                    return Format.m1745A(str, str2, str5, str4, i5, i6, str3, i7);
                } else {
                    m4937A = m4937A(list);
                }
                i7 = m4937A;
                return Format.m1745A(str, str2, str5, str4, i5, i6, str3, i7);
            }
        } else {
            str5 = m4892s;
        }
        return Format.m1721v(str, str2, str5, str4, i5, i6, str3);
    }

    /* renamed from: f */
    public C3456wo m4905f(long j, long j2, long j3, boolean z, long j4, long j5, long j6, long j7, pq1 pq1Var, Uri uri, List<gw0> list) {
        return new C3456wo(j, j2, j3, z, j4, j5, j6, j7, pq1Var, uri, list);
    }

    /* renamed from: g */
    public gw0 m4904g(String str, long j, List<C1154e1> list, List<C2989sy> list2) {
        return new gw0(str, j, list, list2);
    }

    /* renamed from: h */
    public d31 m4903h(String str, long j, long j2) {
        return new d31(str, j, j2);
    }

    /* renamed from: i */
    public j41 m4902i(C3562a c3562a, String str, String str2, ArrayList<DrmInitData.SchemeData> arrayList, ArrayList<C1860jt> arrayList2) {
        Format format = c3562a.f32846a;
        String str3 = c3562a.f32849d;
        if (str3 != null) {
            str2 = str3;
        }
        ArrayList<DrmInitData.SchemeData> arrayList3 = c3562a.f32850e;
        arrayList3.addAll(arrayList);
        if (!arrayList3.isEmpty()) {
            m4894q(arrayList3);
            format = format.m1731b(new DrmInitData(str2, arrayList3));
        }
        ArrayList<C1860jt> arrayList4 = c3562a.f32851f;
        arrayList4.addAll(arrayList2);
        return j41.m19089l(str, c3562a.f32852g, format, c3562a.f32847b, c3562a.f32848c, arrayList4);
    }

    /* renamed from: j */
    public ka1.C1928b m4901j(d31 d31Var, long j, long j2, long j3, long j4, List<ka1.C1930d> list, List<d31> list2) {
        return new ka1.C1928b(d31Var, j, j2, j3, j4, list, list2);
    }

    /* renamed from: k */
    public ka1.C1929c m4900k(d31 d31Var, long j, long j2, long j3, long j4, List<ka1.C1930d> list, kq1 kq1Var, kq1 kq1Var2) {
        return new ka1.C1929c(d31Var, j, j2, j3, j4, list, kq1Var, kq1Var2);
    }

    /* renamed from: l */
    public ka1.C1930d m4899l(long j, long j2) {
        return new ka1.C1930d(j, j2);
    }

    /* renamed from: m */
    public ka1.C1931e m4898m(d31 d31Var, long j, long j2, long j3, long j4) {
        return new ka1.C1931e(d31Var, j, j2, j3, j4);
    }

    /* renamed from: n */
    public pq1 m4897n(String str, String str2) {
        return new pq1(str, str2);
    }

    /* renamed from: r */
    public int m4893r(Format format) {
        String str = format.f35721u;
        if (TextUtils.isEmpty(str)) {
            return -1;
        }
        if (hq0.m20492m(str)) {
            return 2;
        }
        if (hq0.m20494k(str)) {
            return 1;
        }
        return m4891t(str) ? 3 : -1;
    }

    @Override // com.daaw.vv0.InterfaceC3379a
    /* renamed from: u */
    public C3456wo mo3834a(Uri uri, InputStream inputStream) {
        try {
            XmlPullParser newPullParser = this.f32845b.newPullParser();
            newPullParser.setInput(inputStream, null);
            if (newPullParser.next() == 2 && "MPD".equals(newPullParser.getName())) {
                return m4922P(newPullParser, uri.toString());
            }
            throw new tv0("inputStream does not contain a valid media presentation description");
        } catch (XmlPullParserException e) {
            throw new tv0(e);
        }
    }

    /* JADX WARN: Type inference failed for: r0v44, types: [java.lang.Object] */
    /* renamed from: v */
    public C1154e1 m4889v(XmlPullParser xmlPullParser, String str, ka1 ka1Var) {
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
        ArrayList<C1860jt> arrayList5;
        ka1 m4915W;
        int i2;
        XmlPullParser xmlPullParser3 = xmlPullParser;
        int m4924N = m4924N(xmlPullParser3, "id", -1);
        int m4935C = m4935C(xmlPullParser);
        String str6 = null;
        String attributeValue = xmlPullParser3.getAttributeValue(null, "mimeType");
        String attributeValue2 = xmlPullParser3.getAttributeValue(null, "codecs");
        int m4924N2 = m4924N(xmlPullParser3, "width", -1);
        int m4924N3 = m4924N(xmlPullParser3, "height", -1);
        float m4926L = m4926L(xmlPullParser3, -1.0f);
        int m4924N4 = m4924N(xmlPullParser3, "audioSamplingRate", -1);
        String str7 = "lang";
        String attributeValue3 = xmlPullParser3.getAttributeValue(null, "lang");
        ArrayList<DrmInitData.SchemeData> arrayList6 = new ArrayList<>();
        ArrayList<C1860jt> arrayList7 = new ArrayList<>();
        ArrayList arrayList8 = new ArrayList();
        ArrayList arrayList9 = new ArrayList();
        ArrayList arrayList10 = new ArrayList();
        String str8 = str;
        ka1 ka1Var2 = ka1Var;
        int i3 = m4935C;
        String str9 = attributeValue3;
        String str10 = null;
        int i4 = -1;
        boolean z = false;
        int i5 = 0;
        while (true) {
            xmlPullParser.next();
            if (iz1.m19247e(xmlPullParser3, "BaseURL")) {
                if (!z) {
                    z = true;
                    str3 = m4886y(xmlPullParser3, str8);
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
                if (iz1.m19247e(xmlPullParser3, "ContentProtection")) {
                    Pair<String, DrmInitData.SchemeData> m4936B = m4936B(xmlPullParser);
                    Object obj = m4936B.first;
                    if (obj != null) {
                        str10 = (String) obj;
                    }
                    ?? r0 = m4936B.second;
                    if (r0 != 0) {
                        arrayList6.add(r0);
                    }
                } else if (iz1.m19247e(xmlPullParser3, "ContentComponent")) {
                    str9 = m4895p(str9, xmlPullParser3.getAttributeValue(str6, str7));
                    str3 = str8;
                    arrayList = arrayList10;
                    arrayList2 = arrayList9;
                    arrayList3 = arrayList8;
                    arrayList5 = arrayList7;
                    arrayList4 = arrayList6;
                    str4 = str7;
                    str5 = str6;
                    i2 = m4896o(i3, m4935C(xmlPullParser));
                    xmlPullParser2 = xmlPullParser3;
                } else if (iz1.m19247e(xmlPullParser3, "Role")) {
                    i5 |= m4918T(xmlPullParser);
                } else if (iz1.m19247e(xmlPullParser3, "AudioChannelConfiguration")) {
                    i4 = m4887x(xmlPullParser);
                } else {
                    if (iz1.m19247e(xmlPullParser3, "Accessibility")) {
                        arrayList8.add(m4933E(xmlPullParser3, "Accessibility"));
                    } else if (iz1.m19247e(xmlPullParser3, "SupplementalProperty")) {
                        arrayList9.add(m4933E(xmlPullParser3, "SupplementalProperty"));
                    } else if (iz1.m19247e(xmlPullParser3, "Representation")) {
                        String str11 = str9;
                        str3 = str8;
                        arrayList2 = arrayList9;
                        arrayList3 = arrayList8;
                        arrayList4 = arrayList6;
                        str4 = str7;
                        str5 = str6;
                        C3562a m4919S = m4919S(xmlPullParser, str8, attributeValue, attributeValue2, m4924N2, m4924N3, m4926L, i4, m4924N4, str11, i5, arrayList3, ka1Var2);
                        int m4896o = m4896o(i3, m4893r(m4919S.f32846a));
                        arrayList = arrayList10;
                        arrayList.add(m4919S);
                        i2 = m4896o;
                        str9 = str11;
                        arrayList5 = arrayList7;
                        xmlPullParser2 = xmlPullParser;
                    } else {
                        str2 = str9;
                        str3 = str8;
                        arrayList = arrayList10;
                        arrayList2 = arrayList9;
                        arrayList3 = arrayList8;
                        ArrayList<C1860jt> arrayList11 = arrayList7;
                        arrayList4 = arrayList6;
                        str4 = str7;
                        str5 = str6;
                        xmlPullParser2 = xmlPullParser;
                        i = i3;
                        if (iz1.m19247e(xmlPullParser2, "SegmentBase")) {
                            m4915W = m4917U(xmlPullParser2, (ka1.C1931e) ka1Var2);
                        } else if (iz1.m19247e(xmlPullParser2, "SegmentList")) {
                            m4915W = m4916V(xmlPullParser2, (ka1.C1928b) ka1Var2);
                        } else if (iz1.m19247e(xmlPullParser2, "SegmentTemplate")) {
                            m4915W = m4915W(xmlPullParser2, (ka1.C1929c) ka1Var2);
                        } else {
                            if (iz1.m19247e(xmlPullParser2, "InbandEventStream")) {
                                arrayList5 = arrayList11;
                                arrayList5.add(m4933E(xmlPullParser2, "InbandEventStream"));
                            } else {
                                arrayList5 = arrayList11;
                                if (iz1.m19248d(xmlPullParser)) {
                                    m4888w(xmlPullParser);
                                }
                            }
                            i2 = i;
                            str9 = str2;
                        }
                        ka1Var2 = m4915W;
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
            if (iz1.m19249c(xmlPullParser2, "AdaptationSet")) {
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
            arrayList12.add(m4902i((C3562a) arrayList.get(i6), this.f32844a, str10, arrayList4, arrayList5));
        }
        return m4910b(m4924N, i2, arrayList12, arrayList3, arrayList2);
    }

    /* renamed from: w */
    public void m4888w(XmlPullParser xmlPullParser) {
    }

    /* renamed from: x */
    public int m4887x(XmlPullParser xmlPullParser) {
        String m4912Z = m4912Z(xmlPullParser, "schemeIdUri", null);
        int i = -1;
        if ("urn:mpeg:dash:23003:3:audio_channel_configuration:2011".equals(m4912Z)) {
            i = m4924N(xmlPullParser, "value", -1);
        } else if ("tag:dolby.com,2014:dash:audio_channel_configuration:2011".equals(m4912Z)) {
            i = m4932F(xmlPullParser);
        }
        do {
            xmlPullParser.next();
        } while (!iz1.m19249c(xmlPullParser, "AudioChannelConfiguration"));
        return i;
    }
}
