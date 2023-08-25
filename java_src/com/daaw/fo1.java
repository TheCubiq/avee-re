package com.daaw;

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
    public static final Pattern p = Pattern.compile("^([0-9][0-9]+):([0-9][0-9]):([0-9][0-9])(?:(\\.[0-9]+)|:([0-9][0-9])(?:\\.([0-9]+))?)?$");
    public static final Pattern q = Pattern.compile("^([0-9]+(?:\\.[0-9]+)?)(h|m|s|ms|f|t)$");
    public static final Pattern r = Pattern.compile("^(([0-9]*.)?[0-9]+)(px|em|%)$");
    public static final Pattern s = Pattern.compile("^(\\d+\\.?\\d*?)% (\\d+\\.?\\d*?)%$");
    public static final Pattern t = Pattern.compile("^(\\d+) (\\d+)$");
    public static final b u = new b(30.0f, 1, 1);
    public static final a v = new a(32, 15);
    public final XmlPullParserFactory o;

    /* loaded from: classes.dex */
    public static final class a {
        public final int a;
        public final int b;

        public a(int i, int i2) {
            this.a = i;
            this.b = i2;
        }
    }

    /* loaded from: classes.dex */
    public static final class b {
        public final float a;
        public final int b;
        public final int c;

        public b(float f, int i, int i2) {
            this.a = f;
            this.b = i;
            this.c = i2;
        }
    }

    public fo1() {
        super("TtmlDecoder");
        try {
            XmlPullParserFactory newInstance = XmlPullParserFactory.newInstance();
            this.o = newInstance;
            newInstance.setNamespaceAware(true);
        } catch (XmlPullParserException e) {
            throw new RuntimeException("Couldn't create XmlPullParserFactory instance", e);
        }
    }

    public static boolean E(String str) {
        return str.equals("tt") || str.equals("head") || str.equals("body") || str.equals("div") || str.equals("p") || str.equals("span") || str.equals("br") || str.equals("style") || str.equals("styling") || str.equals("layout") || str.equals("region") || str.equals("metadata") || str.equals("smpte:image") || str.equals("smpte:data") || str.equals("smpte:information");
    }

    public static void G(String str, jo1 jo1Var) {
        Matcher matcher;
        String[] W = sq1.W(str, "\\s+");
        if (W.length == 1) {
            matcher = r.matcher(str);
        } else if (W.length != 2) {
            throw new vh1("Invalid number of entries for fontSize: " + W.length + ".");
        } else {
            matcher = r.matcher(W[1]);
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
                jo1Var.t(3);
                break;
            case 1:
                jo1Var.t(2);
                break;
            case 2:
                jo1Var.t(1);
                break;
            default:
                throw new vh1("Invalid unit for fontSize: '" + group + "'.");
        }
        jo1Var.s(Float.valueOf(matcher.group(1)).floatValue());
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x00b3, code lost:
        if (r13.equals("ms") == false) goto L21;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static long N(java.lang.String r13, com.daaw.fo1.b r14) {
        /*
            Method dump skipped, instructions count: 324
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.daaw.fo1.N(java.lang.String, com.daaw.fo1$b):long");
    }

    public final jo1 C(jo1 jo1Var) {
        return jo1Var == null ? new jo1() : jo1Var;
    }

    @Override // com.daaw.jd1
    /* renamed from: D */
    public ko1 z(byte[] bArr, int i, boolean z) {
        try {
            XmlPullParser newPullParser = this.o.newPullParser();
            HashMap hashMap = new HashMap();
            HashMap hashMap2 = new HashMap();
            ko1 ko1Var = null;
            hashMap2.put("", new ho1(null));
            int i2 = 0;
            newPullParser.setInput(new ByteArrayInputStream(bArr, 0, i), null);
            ArrayDeque arrayDeque = new ArrayDeque();
            b bVar = u;
            a aVar = v;
            for (int eventType = newPullParser.getEventType(); eventType != 1; eventType = newPullParser.getEventType()) {
                go1 go1Var = (go1) arrayDeque.peek();
                if (i2 == 0) {
                    String name = newPullParser.getName();
                    if (eventType == 2) {
                        if ("tt".equals(name)) {
                            bVar = H(newPullParser);
                            aVar = F(newPullParser, v);
                        }
                        if (!E(name)) {
                            StringBuilder sb = new StringBuilder();
                            sb.append("Ignoring unsupported tag: ");
                            sb.append(newPullParser.getName());
                        } else if ("head".equals(name)) {
                            I(newPullParser, hashMap, hashMap2, aVar);
                        } else {
                            try {
                                go1 J = J(newPullParser, go1Var, hashMap2, bVar);
                                arrayDeque.push(J);
                                if (go1Var != null) {
                                    go1Var.a(J);
                                }
                            } catch (vh1 unused) {
                            }
                        }
                        i2++;
                    } else if (eventType == 4) {
                        go1Var.a(go1.d(newPullParser.getText()));
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

    public final a F(XmlPullParser xmlPullParser, a aVar) {
        StringBuilder sb;
        String attributeValue = xmlPullParser.getAttributeValue("http://www.w3.org/ns/ttml#parameter", "cellResolution");
        if (attributeValue == null) {
            return aVar;
        }
        Matcher matcher = t.matcher(attributeValue);
        if (matcher.matches()) {
            try {
                int parseInt = Integer.parseInt(matcher.group(1));
                int parseInt2 = Integer.parseInt(matcher.group(2));
                if (parseInt == 0 || parseInt2 == 0) {
                    throw new vh1("Invalid cell resolution " + parseInt + " " + parseInt2);
                }
                return new a(parseInt, parseInt2);
            } catch (NumberFormatException unused) {
                sb = new StringBuilder();
            }
        } else {
            sb = new StringBuilder();
        }
        sb.append("Ignoring malformed cell resolution: ");
        sb.append(attributeValue);
        return aVar;
    }

    public final b H(XmlPullParser xmlPullParser) {
        String attributeValue = xmlPullParser.getAttributeValue("http://www.w3.org/ns/ttml#parameter", "frameRate");
        int parseInt = attributeValue != null ? Integer.parseInt(attributeValue) : 30;
        float f = 1.0f;
        String attributeValue2 = xmlPullParser.getAttributeValue("http://www.w3.org/ns/ttml#parameter", "frameRateMultiplier");
        if (attributeValue2 != null) {
            String[] W = sq1.W(attributeValue2, " ");
            if (W.length != 2) {
                throw new vh1("frameRateMultiplier doesn't have 2 parts");
            }
            f = Integer.parseInt(W[0]) / Integer.parseInt(W[1]);
        }
        b bVar = u;
        int i = bVar.b;
        String attributeValue3 = xmlPullParser.getAttributeValue("http://www.w3.org/ns/ttml#parameter", "subFrameRate");
        if (attributeValue3 != null) {
            i = Integer.parseInt(attributeValue3);
        }
        int i2 = bVar.c;
        String attributeValue4 = xmlPullParser.getAttributeValue("http://www.w3.org/ns/ttml#parameter", "tickRate");
        if (attributeValue4 != null) {
            i2 = Integer.parseInt(attributeValue4);
        }
        return new b(parseInt * f, i, i2);
    }

    public final Map<String, jo1> I(XmlPullParser xmlPullParser, Map<String, jo1> map, Map<String, ho1> map2, a aVar) {
        ho1 K;
        do {
            xmlPullParser.next();
            if (iz1.e(xmlPullParser, "style")) {
                String a2 = iz1.a(xmlPullParser, "style");
                jo1 L = L(xmlPullParser, new jo1());
                if (a2 != null) {
                    for (String str : M(a2)) {
                        L.a(map.get(str));
                    }
                }
                if (L.g() != null) {
                    map.put(L.g(), L);
                }
            } else if (iz1.e(xmlPullParser, "region") && (K = K(xmlPullParser, aVar)) != null) {
                map2.put(K.a, K);
            }
        } while (!iz1.c(xmlPullParser, "head"));
        return map;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    public final go1 J(XmlPullParser xmlPullParser, go1 go1Var, Map<String, ho1> map, b bVar) {
        long j;
        long j2;
        char c;
        int attributeCount = xmlPullParser.getAttributeCount();
        jo1 L = L(xmlPullParser, null);
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
                    j5 = N(attributeValue, bVar);
                    break;
                case 2:
                    j4 = N(attributeValue, bVar);
                    break;
                case 3:
                    j3 = N(attributeValue, bVar);
                    break;
                case 4:
                    String[] M = M(attributeValue);
                    if (M.length > 0) {
                        strArr = M;
                        break;
                    }
                    break;
            }
        }
        if (go1Var != null) {
            long j6 = go1Var.d;
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
                long j8 = go1Var.e;
                if (j8 != j) {
                    j2 = j8;
                }
            }
            return go1.c(xmlPullParser.getName(), j7, j2, L, strArr, str);
        }
        j2 = j4;
        return go1.c(xmlPullParser.getName(), j7, j2, L, strArr, str);
    }

    public final ho1 K(XmlPullParser xmlPullParser, a aVar) {
        String a2;
        StringBuilder sb;
        String str;
        String a3 = iz1.a(xmlPullParser, "id");
        if (a3 == null || (a2 = iz1.a(xmlPullParser, "origin")) == null) {
            return null;
        }
        Pattern pattern = s;
        Matcher matcher = pattern.matcher(a2);
        if (matcher.matches()) {
            try {
                float parseFloat = Float.parseFloat(matcher.group(1)) / 100.0f;
                int i = 2;
                float parseFloat2 = Float.parseFloat(matcher.group(2)) / 100.0f;
                String a4 = iz1.a(xmlPullParser, "extent");
                if (a4 == null) {
                    return null;
                }
                Matcher matcher2 = pattern.matcher(a4);
                if (matcher2.matches()) {
                    try {
                        float parseFloat3 = Float.parseFloat(matcher2.group(1)) / 100.0f;
                        float parseFloat4 = Float.parseFloat(matcher2.group(2)) / 100.0f;
                        String a5 = iz1.a(xmlPullParser, "displayAlign");
                        if (a5 != null) {
                            String a0 = sq1.a0(a5);
                            a0.hashCode();
                            if (a0.equals("center")) {
                                parseFloat2 += parseFloat4 / 2.0f;
                                i = 1;
                            } else if (a0.equals("after")) {
                                parseFloat2 += parseFloat4;
                            }
                            return new ho1(a3, parseFloat, parseFloat2, 0, i, parseFloat3, 1, 1.0f / aVar.b);
                        }
                        i = 0;
                        return new ho1(a3, parseFloat, parseFloat2, 0, i, parseFloat3, 1, 1.0f / aVar.b);
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
        sb.append(a2);
        return null;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:65:0x0109, code lost:
        if (r3.equals("linethrough") == false) goto L31;
     */
    /* JADX WARN: Code restructure failed: missing block: B:89:0x016f, code lost:
        if (r3.equals("start") == false) goto L55;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final com.daaw.jo1 L(org.xmlpull.v1.XmlPullParser r12, com.daaw.jo1 r13) {
        /*
            Method dump skipped, instructions count: 596
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.daaw.fo1.L(org.xmlpull.v1.XmlPullParser, com.daaw.jo1):com.daaw.jo1");
    }

    public final String[] M(String str) {
        String trim = str.trim();
        return trim.isEmpty() ? new String[0] : sq1.W(trim, "\\s+");
    }
}
