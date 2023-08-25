package com.daaw;

import android.text.Layout;
import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.util.ArrayDeque;
import java.util.HashMap;
import java.util.Map;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;
import org.xmlpull.v1.XmlPullParserFactory;
/* loaded from: classes.dex */
public final class fo1 extends jd1 {

    /* renamed from: p */
    public static final Pattern f9725p = Pattern.compile("^([0-9][0-9]+):([0-9][0-9]):([0-9][0-9])(?:(\\.[0-9]+)|:([0-9][0-9])(?:\\.([0-9]+))?)?$");

    /* renamed from: q */
    public static final Pattern f9726q = Pattern.compile("^([0-9]+(?:\\.[0-9]+)?)(h|m|s|ms|f|t)$");

    /* renamed from: r */
    public static final Pattern f9727r = Pattern.compile("^(([0-9]*.)?[0-9]+)(px|em|%)$");

    /* renamed from: s */
    public static final Pattern f9728s = Pattern.compile("^(\\d+\\.?\\d*?)% (\\d+\\.?\\d*?)%$");

    /* renamed from: t */
    public static final Pattern f9729t = Pattern.compile("^(\\d+) (\\d+)$");

    /* renamed from: u */
    public static final C1317b f9730u = new C1317b(30.0f, 1, 1);

    /* renamed from: v */
    public static final C1316a f9731v = new C1316a(32, 15);

    /* renamed from: o */
    public final XmlPullParserFactory f9732o;

    /* renamed from: com.daaw.fo1$a */
    /* loaded from: classes.dex */
    public static final class C1316a {

        /* renamed from: a */
        public final int f9733a;

        /* renamed from: b */
        public final int f9734b;

        public C1316a(int i, int i2) {
            this.f9733a = i;
            this.f9734b = i2;
        }
    }

    /* renamed from: com.daaw.fo1$b */
    /* loaded from: classes.dex */
    public static final class C1317b {

        /* renamed from: a */
        public final float f9735a;

        /* renamed from: b */
        public final int f9736b;

        /* renamed from: c */
        public final int f9737c;

        public C1317b(float f, int i, int i2) {
            this.f9735a = f;
            this.f9736b = i;
            this.f9737c = i2;
        }
    }

    public fo1() {
        super("TtmlDecoder");
        try {
            XmlPullParserFactory newInstance = XmlPullParserFactory.newInstance();
            this.f9732o = newInstance;
            newInstance.setNamespaceAware(true);
        } catch (XmlPullParserException e) {
            throw new RuntimeException("Couldn't create XmlPullParserFactory instance", e);
        }
    }

    /* renamed from: E */
    public static boolean m22455E(String str) {
        return str.equals("tt") || str.equals("head") || str.equals("body") || str.equals("div") || str.equals("p") || str.equals("span") || str.equals("br") || str.equals("style") || str.equals("styling") || str.equals("layout") || str.equals("region") || str.equals("metadata") || str.equals("smpte:image") || str.equals("smpte:data") || str.equals("smpte:information");
    }

    /* renamed from: G */
    public static void m22453G(String str, jo1 jo1Var) {
        Matcher matcher;
        String[] m10022W = sq1.m10022W(str, "\\s+");
        if (m10022W.length == 1) {
            matcher = f9727r.matcher(str);
        } else if (m10022W.length != 2) {
            throw new vh1("Invalid number of entries for fontSize: " + m10022W.length + ".");
        } else {
            matcher = f9727r.matcher(m10022W[1]);
        }
        if (!matcher.matches()) {
            throw new vh1("Invalid expression for fontSize: '" + str + "'.");
        }
        String group = matcher.group(3);
        group.hashCode();
        char c = 65535;
        switch (group.hashCode()) {
            case 37:
                if (group.equals("%")) {
                    c = 0;
                    break;
                }
                break;
            case 3240:
                if (group.equals("em")) {
                    c = 1;
                    break;
                }
                break;
            case 3592:
                if (group.equals("px")) {
                    c = 2;
                    break;
                }
                break;
        }
        switch (c) {
            case 0:
                jo1Var.m18357t(3);
                break;
            case 1:
                jo1Var.m18357t(2);
                break;
            case 2:
                jo1Var.m18357t(1);
                break;
            default:
                throw new vh1("Invalid unit for fontSize: '" + group + "'.");
        }
        jo1Var.m18358s(Float.valueOf(matcher.group(1)).floatValue());
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x00b3, code lost:
        if (r13.equals("ms") == false) goto L21;
     */
    /* renamed from: N */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static long m22446N(String str, C1317b c1317b) {
        double d;
        double d2;
        String group;
        Matcher matcher = f9725p.matcher(str);
        char c = 4;
        if (matcher.matches()) {
            double parseLong = Long.parseLong(matcher.group(1)) * 3600;
            double parseLong2 = Long.parseLong(matcher.group(2)) * 60;
            Double.isNaN(parseLong);
            Double.isNaN(parseLong2);
            double parseLong3 = Long.parseLong(matcher.group(3));
            Double.isNaN(parseLong3);
            double d3 = parseLong + parseLong2 + parseLong3;
            String group2 = matcher.group(4);
            double d4 = 0.0d;
            double parseDouble = d3 + (group2 != null ? Double.parseDouble(group2) : 0.0d) + (matcher.group(5) != null ? ((float) Long.parseLong(group)) / c1317b.f9735a : 0.0d);
            String group3 = matcher.group(6);
            if (group3 != null) {
                double parseLong4 = Long.parseLong(group3);
                double d5 = c1317b.f9736b;
                Double.isNaN(parseLong4);
                Double.isNaN(d5);
                double d6 = c1317b.f9735a;
                Double.isNaN(d6);
                d4 = (parseLong4 / d5) / d6;
            }
            return (long) ((parseDouble + d4) * 1000000.0d);
        }
        Matcher matcher2 = f9726q.matcher(str);
        if (!matcher2.matches()) {
            throw new vh1("Malformed time expression: " + str);
        }
        double parseDouble2 = Double.parseDouble(matcher2.group(1));
        String group4 = matcher2.group(2);
        group4.hashCode();
        switch (group4.hashCode()) {
            case p21.f22334U0 /* 102 */:
                if (group4.equals("f")) {
                    c = 0;
                    break;
                }
                c = 65535;
                break;
            case p21.f22346W0 /* 104 */:
                if (group4.equals("h")) {
                    c = 1;
                    break;
                }
                c = 65535;
                break;
            case 109:
                if (group4.equals("m")) {
                    c = 2;
                    break;
                }
                c = 65535;
                break;
            case x21.f31769C0 /* 116 */:
                if (group4.equals("t")) {
                    c = 3;
                    break;
                }
                c = 65535;
                break;
            case 3494:
                break;
            default:
                c = 65535;
                break;
        }
        switch (c) {
            case 0:
                d = c1317b.f9735a;
                Double.isNaN(d);
                parseDouble2 /= d;
                return (long) (parseDouble2 * 1000000.0d);
            case 1:
                d2 = 3600.0d;
                parseDouble2 *= d2;
                return (long) (parseDouble2 * 1000000.0d);
            case 2:
                d2 = 60.0d;
                parseDouble2 *= d2;
                return (long) (parseDouble2 * 1000000.0d);
            case 3:
                d = c1317b.f9737c;
                Double.isNaN(d);
                parseDouble2 /= d;
                return (long) (parseDouble2 * 1000000.0d);
            case 4:
                d = 1000.0d;
                parseDouble2 /= d;
                return (long) (parseDouble2 * 1000000.0d);
            default:
                return (long) (parseDouble2 * 1000000.0d);
        }
    }

    /* renamed from: C */
    public final jo1 m22457C(jo1 jo1Var) {
        return jo1Var == null ? new jo1() : jo1Var;
    }

    @Override // com.daaw.jd1
    /* renamed from: D */
    public ko1 mo5845z(byte[] bArr, int i, boolean z) {
        try {
            XmlPullParser newPullParser = this.f9732o.newPullParser();
            HashMap hashMap = new HashMap();
            HashMap hashMap2 = new HashMap();
            ko1 ko1Var = null;
            hashMap2.put("", new ho1(null));
            int i2 = 0;
            newPullParser.setInput(new ByteArrayInputStream(bArr, 0, i), null);
            ArrayDeque arrayDeque = new ArrayDeque();
            C1317b c1317b = f9730u;
            C1316a c1316a = f9731v;
            for (int eventType = newPullParser.getEventType(); eventType != 1; eventType = newPullParser.getEventType()) {
                go1 go1Var = (go1) arrayDeque.peek();
                if (i2 == 0) {
                    String name = newPullParser.getName();
                    if (eventType == 2) {
                        if ("tt".equals(name)) {
                            c1317b = m22452H(newPullParser);
                            c1316a = m22454F(newPullParser, f9731v);
                        }
                        if (!m22455E(name)) {
                            StringBuilder sb = new StringBuilder();
                            sb.append("Ignoring unsupported tag: ");
                            sb.append(newPullParser.getName());
                        } else if ("head".equals(name)) {
                            m22451I(newPullParser, hashMap, hashMap2, c1316a);
                        } else {
                            try {
                                go1 m22450J = m22450J(newPullParser, go1Var, hashMap2, c1317b);
                                arrayDeque.push(m22450J);
                                if (go1Var != null) {
                                    go1Var.m21386a(m22450J);
                                }
                            } catch (vh1 unused) {
                            }
                        }
                        i2++;
                    } else if (eventType == 4) {
                        go1Var.m21386a(go1.m21383d(newPullParser.getText()));
                    } else if (eventType == 3) {
                        if (newPullParser.getName().equals("tt")) {
                            ko1Var = new ko1((go1) arrayDeque.peek(), hashMap, hashMap2);
                        }
                        arrayDeque.pop();
                    }
                } else {
                    if (eventType != 2) {
                        if (eventType == 3) {
                            i2--;
                        }
                    }
                    i2++;
                }
                newPullParser.next();
            }
            return ko1Var;
        } catch (IOException e) {
            throw new IllegalStateException("Unexpected error when reading input.", e);
        } catch (XmlPullParserException e2) {
            throw new vh1("Unable to decode source", e2);
        }
    }

    /* renamed from: F */
    public final C1316a m22454F(XmlPullParser xmlPullParser, C1316a c1316a) {
        StringBuilder sb;
        String attributeValue = xmlPullParser.getAttributeValue("http://www.w3.org/ns/ttml#parameter", "cellResolution");
        if (attributeValue == null) {
            return c1316a;
        }
        Matcher matcher = f9729t.matcher(attributeValue);
        if (matcher.matches()) {
            try {
                int parseInt = Integer.parseInt(matcher.group(1));
                int parseInt2 = Integer.parseInt(matcher.group(2));
                if (parseInt == 0 || parseInt2 == 0) {
                    throw new vh1("Invalid cell resolution " + parseInt + " " + parseInt2);
                }
                return new C1316a(parseInt, parseInt2);
            } catch (NumberFormatException unused) {
                sb = new StringBuilder();
            }
        } else {
            sb = new StringBuilder();
        }
        sb.append("Ignoring malformed cell resolution: ");
        sb.append(attributeValue);
        return c1316a;
    }

    /* renamed from: H */
    public final C1317b m22452H(XmlPullParser xmlPullParser) {
        String attributeValue = xmlPullParser.getAttributeValue("http://www.w3.org/ns/ttml#parameter", "frameRate");
        int parseInt = attributeValue != null ? Integer.parseInt(attributeValue) : 30;
        float f = 1.0f;
        String attributeValue2 = xmlPullParser.getAttributeValue("http://www.w3.org/ns/ttml#parameter", "frameRateMultiplier");
        if (attributeValue2 != null) {
            String[] m10022W = sq1.m10022W(attributeValue2, " ");
            if (m10022W.length != 2) {
                throw new vh1("frameRateMultiplier doesn't have 2 parts");
            }
            f = Integer.parseInt(m10022W[0]) / Integer.parseInt(m10022W[1]);
        }
        C1317b c1317b = f9730u;
        int i = c1317b.f9736b;
        String attributeValue3 = xmlPullParser.getAttributeValue("http://www.w3.org/ns/ttml#parameter", "subFrameRate");
        if (attributeValue3 != null) {
            i = Integer.parseInt(attributeValue3);
        }
        int i2 = c1317b.f9737c;
        String attributeValue4 = xmlPullParser.getAttributeValue("http://www.w3.org/ns/ttml#parameter", "tickRate");
        if (attributeValue4 != null) {
            i2 = Integer.parseInt(attributeValue4);
        }
        return new C1317b(parseInt * f, i, i2);
    }

    /* renamed from: I */
    public final Map<String, jo1> m22451I(XmlPullParser xmlPullParser, Map<String, jo1> map, Map<String, ho1> map2, C1316a c1316a) {
        ho1 m22449K;
        do {
            xmlPullParser.next();
            if (iz1.m19247e(xmlPullParser, "style")) {
                String m19251a = iz1.m19251a(xmlPullParser, "style");
                jo1 m22448L = m22448L(xmlPullParser, new jo1());
                if (m19251a != null) {
                    for (String str : m22447M(m19251a)) {
                        m22448L.m18376a(map.get(str));
                    }
                }
                if (m22448L.m18370g() != null) {
                    map.put(m22448L.m18370g(), m22448L);
                }
            } else if (iz1.m19247e(xmlPullParser, "region") && (m22449K = m22449K(xmlPullParser, c1316a)) != null) {
                map2.put(m22449K.f12746a, m22449K);
            }
        } while (!iz1.m19249c(xmlPullParser, "head"));
        return map;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* renamed from: J */
    public final go1 m22450J(XmlPullParser xmlPullParser, go1 go1Var, Map<String, ho1> map, C1317b c1317b) {
        long j;
        long j2;
        char c;
        int attributeCount = xmlPullParser.getAttributeCount();
        jo1 m22448L = m22448L(xmlPullParser, null);
        String[] strArr = null;
        String str = "";
        long j3 = -9223372036854775807L;
        long j4 = -9223372036854775807L;
        long j5 = -9223372036854775807L;
        for (int i = 0; i < attributeCount; i++) {
            String attributeName = xmlPullParser.getAttributeName(i);
            String attributeValue = xmlPullParser.getAttributeValue(i);
            attributeName.hashCode();
            switch (attributeName.hashCode()) {
                case -934795532:
                    if (attributeName.equals("region")) {
                        c = 0;
                        break;
                    }
                    c = 65535;
                    break;
                case 99841:
                    if (attributeName.equals("dur")) {
                        c = 1;
                        break;
                    }
                    c = 65535;
                    break;
                case 100571:
                    if (attributeName.equals("end")) {
                        c = 2;
                        break;
                    }
                    c = 65535;
                    break;
                case 93616297:
                    if (attributeName.equals("begin")) {
                        c = 3;
                        break;
                    }
                    c = 65535;
                    break;
                case 109780401:
                    if (attributeName.equals("style")) {
                        c = 4;
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
                    if (map.containsKey(attributeValue)) {
                        str = attributeValue;
                        continue;
                    }
                case 1:
                    j5 = m22446N(attributeValue, c1317b);
                    break;
                case 2:
                    j4 = m22446N(attributeValue, c1317b);
                    break;
                case 3:
                    j3 = m22446N(attributeValue, c1317b);
                    break;
                case 4:
                    String[] m22447M = m22447M(attributeValue);
                    if (m22447M.length > 0) {
                        strArr = m22447M;
                        break;
                    }
                    break;
            }
        }
        if (go1Var != null) {
            long j6 = go1Var.f11531d;
            j = -9223372036854775807L;
            if (j6 != -9223372036854775807L) {
                if (j3 != -9223372036854775807L) {
                    j3 += j6;
                }
                if (j4 != -9223372036854775807L) {
                    j4 += j6;
                }
            }
        } else {
            j = -9223372036854775807L;
        }
        long j7 = j3;
        if (j4 == j) {
            if (j5 != j) {
                j2 = j7 + j5;
            } else if (go1Var != null) {
                long j8 = go1Var.f11532e;
                if (j8 != j) {
                    j2 = j8;
                }
            }
            return go1.m21384c(xmlPullParser.getName(), j7, j2, m22448L, strArr, str);
        }
        j2 = j4;
        return go1.m21384c(xmlPullParser.getName(), j7, j2, m22448L, strArr, str);
    }

    /* renamed from: K */
    public final ho1 m22449K(XmlPullParser xmlPullParser, C1316a c1316a) {
        String m19251a;
        StringBuilder sb;
        String str;
        String m19251a2 = iz1.m19251a(xmlPullParser, "id");
        if (m19251a2 == null || (m19251a = iz1.m19251a(xmlPullParser, "origin")) == null) {
            return null;
        }
        Pattern pattern = f9728s;
        Matcher matcher = pattern.matcher(m19251a);
        if (matcher.matches()) {
            try {
                float parseFloat = Float.parseFloat(matcher.group(1)) / 100.0f;
                int i = 2;
                float parseFloat2 = Float.parseFloat(matcher.group(2)) / 100.0f;
                String m19251a3 = iz1.m19251a(xmlPullParser, "extent");
                if (m19251a3 == null) {
                    return null;
                }
                Matcher matcher2 = pattern.matcher(m19251a3);
                if (matcher2.matches()) {
                    try {
                        float parseFloat3 = Float.parseFloat(matcher2.group(1)) / 100.0f;
                        float parseFloat4 = Float.parseFloat(matcher2.group(2)) / 100.0f;
                        String m19251a4 = iz1.m19251a(xmlPullParser, "displayAlign");
                        if (m19251a4 != null) {
                            String m10017a0 = sq1.m10017a0(m19251a4);
                            m10017a0.hashCode();
                            if (m10017a0.equals("center")) {
                                parseFloat2 += parseFloat4 / 2.0f;
                                i = 1;
                            } else if (m10017a0.equals("after")) {
                                parseFloat2 += parseFloat4;
                            }
                            return new ho1(m19251a2, parseFloat, parseFloat2, 0, i, parseFloat3, 1, 1.0f / c1316a.f9734b);
                        }
                        i = 0;
                        return new ho1(m19251a2, parseFloat, parseFloat2, 0, i, parseFloat3, 1, 1.0f / c1316a.f9734b);
                    } catch (NumberFormatException unused) {
                        sb = new StringBuilder();
                        str = "Ignoring region with malformed extent: ";
                    }
                } else {
                    sb = new StringBuilder();
                    str = "Ignoring region with unsupported extent: ";
                }
            } catch (NumberFormatException unused2) {
                sb = new StringBuilder();
                str = "Ignoring region with malformed origin: ";
            }
        } else {
            sb = new StringBuilder();
            str = "Ignoring region with unsupported origin: ";
        }
        sb.append(str);
        sb.append(m19251a);
        return null;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:65:0x0109, code lost:
        if (r3.equals("linethrough") == false) goto L31;
     */
    /* JADX WARN: Code restructure failed: missing block: B:89:0x016f, code lost:
        if (r3.equals("start") == false) goto L55;
     */
    /* renamed from: L */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final jo1 m22448L(XmlPullParser xmlPullParser, jo1 jo1Var) {
        char c;
        StringBuilder sb;
        String str;
        jo1 m22457C;
        Layout.Alignment alignment;
        int attributeCount = xmlPullParser.getAttributeCount();
        for (int i = 0; i < attributeCount; i++) {
            String attributeValue = xmlPullParser.getAttributeValue(i);
            String attributeName = xmlPullParser.getAttributeName(i);
            attributeName.hashCode();
            char c2 = 4;
            char c3 = 3;
            switch (attributeName.hashCode()) {
                case -1550943582:
                    if (attributeName.equals("fontStyle")) {
                        c = 0;
                        break;
                    }
                    c = 65535;
                    break;
                case -1224696685:
                    if (attributeName.equals("fontFamily")) {
                        c = 1;
                        break;
                    }
                    c = 65535;
                    break;
                case -1065511464:
                    if (attributeName.equals("textAlign")) {
                        c = 2;
                        break;
                    }
                    c = 65535;
                    break;
                case -879295043:
                    if (attributeName.equals("textDecoration")) {
                        c = 3;
                        break;
                    }
                    c = 65535;
                    break;
                case -734428249:
                    if (attributeName.equals("fontWeight")) {
                        c = 4;
                        break;
                    }
                    c = 65535;
                    break;
                case 3355:
                    if (attributeName.equals("id")) {
                        c = 5;
                        break;
                    }
                    c = 65535;
                    break;
                case 94842723:
                    if (attributeName.equals("color")) {
                        c = 6;
                        break;
                    }
                    c = 65535;
                    break;
                case 365601008:
                    if (attributeName.equals("fontSize")) {
                        c = 7;
                        break;
                    }
                    c = 65535;
                    break;
                case 1287124693:
                    if (attributeName.equals("backgroundColor")) {
                        c = '\b';
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
                    jo1Var = m22457C(jo1Var).m18355v("italic".equalsIgnoreCase(attributeValue));
                    continue;
                case 1:
                    jo1Var = m22457C(jo1Var).m18359r(attributeValue);
                    continue;
                case 2:
                    String m10017a0 = sq1.m10017a0(attributeValue);
                    m10017a0.hashCode();
                    switch (m10017a0.hashCode()) {
                        case -1364013995:
                            if (m10017a0.equals("center")) {
                                c2 = 0;
                                break;
                            }
                            c2 = 65535;
                            break;
                        case 100571:
                            if (m10017a0.equals("end")) {
                                c2 = 1;
                                break;
                            }
                            c2 = 65535;
                            break;
                        case 3317767:
                            if (m10017a0.equals("left")) {
                                c2 = 2;
                                break;
                            }
                            c2 = 65535;
                            break;
                        case 108511772:
                            if (m10017a0.equals("right")) {
                                c2 = 3;
                                break;
                            }
                            c2 = 65535;
                            break;
                        case 109757538:
                            break;
                        default:
                            c2 = 65535;
                            break;
                    }
                    switch (c2) {
                        case 0:
                            m22457C = m22457C(jo1Var);
                            alignment = Layout.Alignment.ALIGN_CENTER;
                            jo1Var = m22457C.m18353x(alignment);
                            continue;
                        case 1:
                        case 3:
                            m22457C = m22457C(jo1Var);
                            alignment = Layout.Alignment.ALIGN_OPPOSITE;
                            jo1Var = m22457C.m18353x(alignment);
                            continue;
                        case 2:
                        case 4:
                            m22457C = m22457C(jo1Var);
                            alignment = Layout.Alignment.ALIGN_NORMAL;
                            jo1Var = m22457C.m18353x(alignment);
                            continue;
                    }
                    break;
                case 3:
                    String m10017a02 = sq1.m10017a0(attributeValue);
                    m10017a02.hashCode();
                    switch (m10017a02.hashCode()) {
                        case -1461280213:
                            if (m10017a02.equals("nounderline")) {
                                c3 = 0;
                                break;
                            }
                            c3 = 65535;
                            break;
                        case -1026963764:
                            if (m10017a02.equals("underline")) {
                                c3 = 1;
                                break;
                            }
                            c3 = 65535;
                            break;
                        case 913457136:
                            if (m10017a02.equals("nolinethrough")) {
                                c3 = 2;
                                break;
                            }
                            c3 = 65535;
                            break;
                        case 1679736913:
                            break;
                        default:
                            c3 = 65535;
                            break;
                    }
                    switch (c3) {
                        case 0:
                            jo1Var = m22457C(jo1Var).m18352y(false);
                            continue;
                        case 1:
                            jo1Var = m22457C(jo1Var).m18352y(true);
                            continue;
                        case 2:
                            jo1Var = m22457C(jo1Var).m18354w(false);
                            continue;
                        case 3:
                            jo1Var = m22457C(jo1Var).m18354w(true);
                            continue;
                            continue;
                    }
                    break;
                case 4:
                    jo1Var = m22457C(jo1Var).m18361p("bold".equalsIgnoreCase(attributeValue));
                    continue;
                case 5:
                    if ("style".equals(xmlPullParser.getName())) {
                        jo1Var = m22457C(jo1Var).m18356u(attributeValue);
                    } else {
                        continue;
                    }
                case 6:
                    jo1Var = m22457C(jo1Var);
                    try {
                        jo1Var.m18360q(C3437wg.m6078d(attributeValue));
                        continue;
                    } catch (IllegalArgumentException unused) {
                        sb = new StringBuilder();
                        str = "Failed parsing color value: ";
                        break;
                    }
                case 7:
                    try {
                        jo1Var = m22457C(jo1Var);
                        m22453G(attributeValue, jo1Var);
                        continue;
                    } catch (vh1 unused2) {
                        sb = new StringBuilder();
                        str = "Failed parsing fontSize value: ";
                        break;
                    }
                case '\b':
                    jo1Var = m22457C(jo1Var);
                    try {
                        jo1Var.m18362o(C3437wg.m6078d(attributeValue));
                        continue;
                    } catch (IllegalArgumentException unused3) {
                        sb = new StringBuilder();
                        str = "Failed parsing background value: ";
                        break;
                    }
                default:
            }
            sb.append(str);
            sb.append(attributeValue);
        }
        return jo1Var;
    }

    /* renamed from: M */
    public final String[] m22447M(String str) {
        String trim = str.trim();
        return trim.isEmpty() ? new String[0] : sq1.m10022W(trim, "\\s+");
    }
}
