package com.daaw;

import android.net.Uri;
import android.text.TextUtils;
import android.util.Base64;
import android.util.Pair;
import com.daaw.vv0;
import com.daaw.xe1;
import com.google.android.exoplayer2.Format;
import com.google.android.exoplayer2.drm.DrmInitData;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;
import java.util.UUID;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;
import org.xmlpull.v1.XmlPullParserFactory;
/* loaded from: classes.dex */
public class ye1 implements vv0.a<xe1> {
    public final XmlPullParserFactory a;

    /* loaded from: classes.dex */
    public static abstract class a {
        public final String a;
        public final String b;
        public final a c;
        public final List<Pair<String, Object>> d = new LinkedList();

        public a(a aVar, String str, String str2) {
            this.c = aVar;
            this.a = str;
            this.b = str2;
        }

        public void a(Object obj) {
        }

        public abstract Object b();

        public final Object c(String str) {
            for (int i = 0; i < this.d.size(); i++) {
                Pair<String, Object> pair = this.d.get(i);
                if (((String) pair.first).equals(str)) {
                    return pair.second;
                }
            }
            a aVar = this.c;
            if (aVar == null) {
                return null;
            }
            return aVar.c(str);
        }

        public boolean d(String str) {
            return false;
        }

        public final a e(a aVar, String str, String str2) {
            if ("QualityLevel".equals(str)) {
                return new d(aVar, str2);
            }
            if ("Protection".equals(str)) {
                return new c(aVar, str2);
            }
            if ("StreamIndex".equals(str)) {
                return new f(aVar, str2);
            }
            return null;
        }

        public final Object f(XmlPullParser xmlPullParser) {
            boolean z = false;
            int i = 0;
            while (true) {
                int eventType = xmlPullParser.getEventType();
                if (eventType == 1) {
                    return null;
                }
                if (eventType == 2) {
                    String name = xmlPullParser.getName();
                    if (this.b.equals(name)) {
                        n(xmlPullParser);
                        z = true;
                    } else if (z) {
                        if (i > 0) {
                            i++;
                        } else if (d(name)) {
                            n(xmlPullParser);
                        } else {
                            a e = e(this, name, this.a);
                            if (e == null) {
                                i = 1;
                            } else {
                                a(e.f(xmlPullParser));
                            }
                        }
                    }
                } else if (eventType != 3) {
                    if (eventType == 4 && z && i == 0) {
                        o(xmlPullParser);
                    }
                } else if (!z) {
                    continue;
                } else if (i > 0) {
                    i--;
                } else {
                    String name2 = xmlPullParser.getName();
                    h(xmlPullParser);
                    if (!d(name2)) {
                        return b();
                    }
                }
                xmlPullParser.next();
            }
        }

        public final boolean g(XmlPullParser xmlPullParser, String str, boolean z) {
            String attributeValue = xmlPullParser.getAttributeValue(null, str);
            return attributeValue != null ? Boolean.parseBoolean(attributeValue) : z;
        }

        public void h(XmlPullParser xmlPullParser) {
        }

        public final int i(XmlPullParser xmlPullParser, String str, int i) {
            String attributeValue = xmlPullParser.getAttributeValue(null, str);
            if (attributeValue != null) {
                try {
                    return Integer.parseInt(attributeValue);
                } catch (NumberFormatException e) {
                    throw new tv0(e);
                }
            }
            return i;
        }

        public final long j(XmlPullParser xmlPullParser, String str, long j) {
            String attributeValue = xmlPullParser.getAttributeValue(null, str);
            if (attributeValue != null) {
                try {
                    return Long.parseLong(attributeValue);
                } catch (NumberFormatException e) {
                    throw new tv0(e);
                }
            }
            return j;
        }

        public final int k(XmlPullParser xmlPullParser, String str) {
            String attributeValue = xmlPullParser.getAttributeValue(null, str);
            if (attributeValue != null) {
                try {
                    return Integer.parseInt(attributeValue);
                } catch (NumberFormatException e) {
                    throw new tv0(e);
                }
            }
            throw new b(str);
        }

        public final long l(XmlPullParser xmlPullParser, String str) {
            String attributeValue = xmlPullParser.getAttributeValue(null, str);
            if (attributeValue != null) {
                try {
                    return Long.parseLong(attributeValue);
                } catch (NumberFormatException e) {
                    throw new tv0(e);
                }
            }
            throw new b(str);
        }

        public final String m(XmlPullParser xmlPullParser, String str) {
            String attributeValue = xmlPullParser.getAttributeValue(null, str);
            if (attributeValue != null) {
                return attributeValue;
            }
            throw new b(str);
        }

        public abstract void n(XmlPullParser xmlPullParser);

        public void o(XmlPullParser xmlPullParser) {
        }

        public final void p(String str, Object obj) {
            this.d.add(Pair.create(str, obj));
        }
    }

    /* loaded from: classes.dex */
    public static class b extends tv0 {
        public b(String str) {
            super("Missing required field: " + str);
        }
    }

    /* loaded from: classes.dex */
    public static class c extends a {
        public boolean e;
        public UUID f;
        public byte[] g;

        public c(a aVar, String str) {
            super(aVar, str, "Protection");
        }

        public static String q(String str) {
            return (str.charAt(0) == '{' && str.charAt(str.length() - 1) == '}') ? str.substring(1, str.length() - 1) : str;
        }

        @Override // com.daaw.ye1.a
        public Object b() {
            UUID uuid = this.f;
            return new xe1.a(uuid, d01.a(uuid, this.g));
        }

        @Override // com.daaw.ye1.a
        public boolean d(String str) {
            return "ProtectionHeader".equals(str);
        }

        @Override // com.daaw.ye1.a
        public void h(XmlPullParser xmlPullParser) {
            if ("ProtectionHeader".equals(xmlPullParser.getName())) {
                this.e = false;
            }
        }

        @Override // com.daaw.ye1.a
        public void n(XmlPullParser xmlPullParser) {
            if ("ProtectionHeader".equals(xmlPullParser.getName())) {
                this.e = true;
                this.f = UUID.fromString(q(xmlPullParser.getAttributeValue(null, "SystemID")));
            }
        }

        @Override // com.daaw.ye1.a
        public void o(XmlPullParser xmlPullParser) {
            if (this.e) {
                this.g = Base64.decode(xmlPullParser.getText(), 0);
            }
        }
    }

    /* loaded from: classes.dex */
    public static class d extends a {
        public Format e;

        public d(a aVar, String str) {
            super(aVar, str, "QualityLevel");
        }

        public static List<byte[]> q(String str) {
            ArrayList arrayList = new ArrayList();
            if (!TextUtils.isEmpty(str)) {
                byte[] r = sq1.r(str);
                byte[][] k = eg.k(r);
                if (k == null) {
                    arrayList.add(r);
                } else {
                    Collections.addAll(arrayList, k);
                }
            }
            return arrayList;
        }

        public static String r(String str) {
            if (str.equalsIgnoreCase("H264") || str.equalsIgnoreCase("X264") || str.equalsIgnoreCase("AVC1") || str.equalsIgnoreCase("DAVC")) {
                return "video/avc";
            }
            if (str.equalsIgnoreCase("AAC") || str.equalsIgnoreCase("AACL") || str.equalsIgnoreCase("AACH") || str.equalsIgnoreCase("AACP")) {
                return "audio/mp4a-latm";
            }
            if (str.equalsIgnoreCase("TTML")) {
                return "application/ttml+xml";
            }
            if (str.equalsIgnoreCase("ac-3") || str.equalsIgnoreCase("dac3")) {
                return "audio/ac3";
            }
            if (str.equalsIgnoreCase("ec-3") || str.equalsIgnoreCase("dec3")) {
                return "audio/eac3";
            }
            if (str.equalsIgnoreCase("dtsc")) {
                return "audio/vnd.dts";
            }
            if (str.equalsIgnoreCase("dtsh") || str.equalsIgnoreCase("dtsl")) {
                return "audio/vnd.dts.hd";
            }
            if (str.equalsIgnoreCase("dtse")) {
                return "audio/vnd.dts.hd;profile=lbr";
            }
            if (str.equalsIgnoreCase("opus")) {
                return "audio/opus";
            }
            return null;
        }

        @Override // com.daaw.ye1.a
        public Object b() {
            return this.e;
        }

        @Override // com.daaw.ye1.a
        public void n(XmlPullParser xmlPullParser) {
            Format z;
            int intValue = ((Integer) c("Type")).intValue();
            String attributeValue = xmlPullParser.getAttributeValue(null, "Index");
            int k = k(xmlPullParser, "Bitrate");
            String r = r(m(xmlPullParser, "FourCC"));
            if (intValue == 2) {
                z = Format.G(attributeValue, "video/mp4", r, null, k, k(xmlPullParser, "MaxWidth"), k(xmlPullParser, "MaxHeight"), -1.0f, q(xmlPullParser.getAttributeValue(null, "CodecPrivateData")), 0);
            } else if (intValue == 1) {
                if (r == null) {
                    r = "audio/mp4a-latm";
                }
                int k2 = k(xmlPullParser, "Channels");
                int k3 = k(xmlPullParser, "SamplingRate");
                List<byte[]> q = q(xmlPullParser.getAttributeValue(null, "CodecPrivateData"));
                if (q.isEmpty() && "audio/mp4a-latm".equals(r)) {
                    q = Collections.singletonList(eg.b(k3, k2));
                }
                z = Format.q(attributeValue, "audio/mp4", r, null, k, k2, k3, q, 0, (String) c("Language"));
            } else {
                z = intValue == 3 ? Format.z(attributeValue, "application/mp4", r, null, k, 0, (String) c("Language")) : Format.v(attributeValue, "application/mp4", r, null, k, 0, null);
            }
            this.e = z;
        }
    }

    /* loaded from: classes.dex */
    public static class e extends a {
        public final List<xe1.b> e;
        public int f;
        public int g;
        public long h;
        public long i;
        public long j;
        public int k;
        public boolean l;
        public xe1.a m;

        public e(a aVar, String str) {
            super(aVar, str, "SmoothStreamingMedia");
            this.k = -1;
            this.m = null;
            this.e = new LinkedList();
        }

        @Override // com.daaw.ye1.a
        public void a(Object obj) {
            if (obj instanceof xe1.b) {
                this.e.add((xe1.b) obj);
            } else if (obj instanceof xe1.a) {
                s6.f(this.m == null);
                this.m = (xe1.a) obj;
            }
        }

        @Override // com.daaw.ye1.a
        public Object b() {
            int size = this.e.size();
            xe1.b[] bVarArr = new xe1.b[size];
            this.e.toArray(bVarArr);
            if (this.m != null) {
                xe1.a aVar = this.m;
                DrmInitData drmInitData = new DrmInitData(new DrmInitData.SchemeData(aVar.a, "video/mp4", aVar.b));
                for (int i = 0; i < size; i++) {
                    xe1.b bVar = bVarArr[i];
                    int i2 = 0;
                    while (true) {
                        Format[] formatArr = bVar.j;
                        if (i2 < formatArr.length) {
                            formatArr[i2] = formatArr[i2].b(drmInitData);
                            i2++;
                        }
                    }
                }
            }
            return new xe1(this.f, this.g, this.h, this.i, this.j, this.k, this.l, this.m, bVarArr);
        }

        @Override // com.daaw.ye1.a
        public void n(XmlPullParser xmlPullParser) {
            this.f = k(xmlPullParser, "MajorVersion");
            this.g = k(xmlPullParser, "MinorVersion");
            this.h = j(xmlPullParser, "TimeScale", 10000000L);
            this.i = l(xmlPullParser, "Duration");
            this.j = j(xmlPullParser, "DVRWindowLength", 0L);
            this.k = i(xmlPullParser, "LookaheadCount", -1);
            this.l = g(xmlPullParser, "IsLive", false);
            p("TimeScale", Long.valueOf(this.h));
        }
    }

    /* loaded from: classes.dex */
    public static class f extends a {
        public final String e;
        public final List<Format> f;
        public int g;
        public String h;
        public long i;
        public String j;
        public String k;
        public int l;
        public int m;
        public int n;
        public int o;
        public String p;
        public ArrayList<Long> q;
        public long r;

        public f(a aVar, String str) {
            super(aVar, str, "StreamIndex");
            this.e = str;
            this.f = new LinkedList();
        }

        @Override // com.daaw.ye1.a
        public void a(Object obj) {
            if (obj instanceof Format) {
                this.f.add((Format) obj);
            }
        }

        @Override // com.daaw.ye1.a
        public Object b() {
            Format[] formatArr = new Format[this.f.size()];
            this.f.toArray(formatArr);
            return new xe1.b(this.e, this.k, this.g, this.h, this.i, this.j, this.l, this.m, this.n, this.o, this.p, formatArr, this.q, this.r);
        }

        @Override // com.daaw.ye1.a
        public boolean d(String str) {
            return "c".equals(str);
        }

        @Override // com.daaw.ye1.a
        public void n(XmlPullParser xmlPullParser) {
            if ("c".equals(xmlPullParser.getName())) {
                r(xmlPullParser);
            } else {
                q(xmlPullParser);
            }
        }

        public final void q(XmlPullParser xmlPullParser) {
            int s = s(xmlPullParser);
            this.g = s;
            p("Type", Integer.valueOf(s));
            this.h = this.g == 3 ? m(xmlPullParser, "Subtype") : xmlPullParser.getAttributeValue(null, "Subtype");
            this.j = xmlPullParser.getAttributeValue(null, "Name");
            this.k = m(xmlPullParser, "Url");
            this.l = i(xmlPullParser, "MaxWidth", -1);
            this.m = i(xmlPullParser, "MaxHeight", -1);
            this.n = i(xmlPullParser, "DisplayWidth", -1);
            this.o = i(xmlPullParser, "DisplayHeight", -1);
            String attributeValue = xmlPullParser.getAttributeValue(null, "Language");
            this.p = attributeValue;
            p("Language", attributeValue);
            long i = i(xmlPullParser, "TimeScale", -1);
            this.i = i;
            if (i == -1) {
                this.i = ((Long) c("TimeScale")).longValue();
            }
            this.q = new ArrayList<>();
        }

        public final void r(XmlPullParser xmlPullParser) {
            int size = this.q.size();
            long j = j(xmlPullParser, "t", -9223372036854775807L);
            int i = 1;
            if (j == -9223372036854775807L) {
                if (size == 0) {
                    j = 0;
                } else if (this.r == -1) {
                    throw new tv0("Unable to infer start time");
                } else {
                    j = this.q.get(size - 1).longValue() + this.r;
                }
            }
            this.q.add(Long.valueOf(j));
            this.r = j(xmlPullParser, "d", -9223372036854775807L);
            long j2 = j(xmlPullParser, "r", 1L);
            if (j2 > 1 && this.r == -9223372036854775807L) {
                throw new tv0("Repeated chunk with unspecified duration");
            }
            while (true) {
                long j3 = i;
                if (j3 >= j2) {
                    return;
                }
                this.q.add(Long.valueOf((this.r * j3) + j));
                i++;
            }
        }

        public final int s(XmlPullParser xmlPullParser) {
            String attributeValue = xmlPullParser.getAttributeValue(null, "Type");
            if (attributeValue != null) {
                if ("audio".equalsIgnoreCase(attributeValue)) {
                    return 1;
                }
                if ("video".equalsIgnoreCase(attributeValue)) {
                    return 2;
                }
                if ("text".equalsIgnoreCase(attributeValue)) {
                    return 3;
                }
                throw new tv0("Invalid key value[" + attributeValue + "]");
            }
            throw new b("Type");
        }
    }

    public ye1() {
        try {
            this.a = XmlPullParserFactory.newInstance();
        } catch (XmlPullParserException e2) {
            throw new RuntimeException("Couldn't create XmlPullParserFactory instance", e2);
        }
    }

    @Override // com.daaw.vv0.a
    /* renamed from: b */
    public xe1 a(Uri uri, InputStream inputStream) {
        try {
            XmlPullParser newPullParser = this.a.newPullParser();
            newPullParser.setInput(inputStream, null);
            return (xe1) new e(null, uri.toString()).f(newPullParser);
        } catch (XmlPullParserException e2) {
            throw new tv0(e2);
        }
    }
}
