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
public class ye1 implements vv0.InterfaceC3379a<xe1> {

    /* renamed from: a */
    public final XmlPullParserFactory f33568a;

    /* renamed from: com.daaw.ye1$a */
    /* loaded from: classes.dex */
    public static abstract class AbstractC3698a {

        /* renamed from: a */
        public final String f33569a;

        /* renamed from: b */
        public final String f33570b;

        /* renamed from: c */
        public final AbstractC3698a f33571c;

        /* renamed from: d */
        public final List<Pair<String, Object>> f33572d = new LinkedList();

        public AbstractC3698a(AbstractC3698a abstractC3698a, String str, String str2) {
            this.f33571c = abstractC3698a;
            this.f33569a = str;
            this.f33570b = str2;
        }

        /* renamed from: a */
        public void mo3817a(Object obj) {
        }

        /* renamed from: b */
        public abstract Object mo3816b();

        /* renamed from: c */
        public final Object m3832c(String str) {
            for (int i = 0; i < this.f33572d.size(); i++) {
                Pair<String, Object> pair = this.f33572d.get(i);
                if (((String) pair.first).equals(str)) {
                    return pair.second;
                }
            }
            AbstractC3698a abstractC3698a = this.f33571c;
            if (abstractC3698a == null) {
                return null;
            }
            return abstractC3698a.m3832c(str);
        }

        /* renamed from: d */
        public boolean mo3815d(String str) {
            return false;
        }

        /* renamed from: e */
        public final AbstractC3698a m3831e(AbstractC3698a abstractC3698a, String str, String str2) {
            if ("QualityLevel".equals(str)) {
                return new C3701d(abstractC3698a, str2);
            }
            if ("Protection".equals(str)) {
                return new C3700c(abstractC3698a, str2);
            }
            if ("StreamIndex".equals(str)) {
                return new C3703f(abstractC3698a, str2);
            }
            return null;
        }

        /* renamed from: f */
        public final Object m3830f(XmlPullParser xmlPullParser) {
            boolean z = false;
            int i = 0;
            while (true) {
                int eventType = xmlPullParser.getEventType();
                if (eventType == 1) {
                    return null;
                }
                if (eventType == 2) {
                    String name = xmlPullParser.getName();
                    if (this.f33570b.equals(name)) {
                        mo3814n(xmlPullParser);
                        z = true;
                    } else if (z) {
                        if (i > 0) {
                            i++;
                        } else if (mo3815d(name)) {
                            mo3814n(xmlPullParser);
                        } else {
                            AbstractC3698a m3831e = m3831e(this, name, this.f33569a);
                            if (m3831e == null) {
                                i = 1;
                            } else {
                                mo3817a(m3831e.m3830f(xmlPullParser));
                            }
                        }
                    }
                } else if (eventType != 3) {
                    if (eventType == 4 && z && i == 0) {
                        mo3821o(xmlPullParser);
                    }
                } else if (!z) {
                    continue;
                } else if (i > 0) {
                    i--;
                } else {
                    String name2 = xmlPullParser.getName();
                    mo3822h(xmlPullParser);
                    if (!mo3815d(name2)) {
                        return mo3816b();
                    }
                }
                xmlPullParser.next();
            }
        }

        /* renamed from: g */
        public final boolean m3829g(XmlPullParser xmlPullParser, String str, boolean z) {
            String attributeValue = xmlPullParser.getAttributeValue(null, str);
            return attributeValue != null ? Boolean.parseBoolean(attributeValue) : z;
        }

        /* renamed from: h */
        public void mo3822h(XmlPullParser xmlPullParser) {
        }

        /* renamed from: i */
        public final int m3828i(XmlPullParser xmlPullParser, String str, int i) {
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

        /* renamed from: j */
        public final long m3827j(XmlPullParser xmlPullParser, String str, long j) {
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

        /* renamed from: k */
        public final int m3826k(XmlPullParser xmlPullParser, String str) {
            String attributeValue = xmlPullParser.getAttributeValue(null, str);
            if (attributeValue != null) {
                try {
                    return Integer.parseInt(attributeValue);
                } catch (NumberFormatException e) {
                    throw new tv0(e);
                }
            }
            throw new C3699b(str);
        }

        /* renamed from: l */
        public final long m3825l(XmlPullParser xmlPullParser, String str) {
            String attributeValue = xmlPullParser.getAttributeValue(null, str);
            if (attributeValue != null) {
                try {
                    return Long.parseLong(attributeValue);
                } catch (NumberFormatException e) {
                    throw new tv0(e);
                }
            }
            throw new C3699b(str);
        }

        /* renamed from: m */
        public final String m3824m(XmlPullParser xmlPullParser, String str) {
            String attributeValue = xmlPullParser.getAttributeValue(null, str);
            if (attributeValue != null) {
                return attributeValue;
            }
            throw new C3699b(str);
        }

        /* renamed from: n */
        public abstract void mo3814n(XmlPullParser xmlPullParser);

        /* renamed from: o */
        public void mo3821o(XmlPullParser xmlPullParser) {
        }

        /* renamed from: p */
        public final void m3823p(String str, Object obj) {
            this.f33572d.add(Pair.create(str, obj));
        }
    }

    /* renamed from: com.daaw.ye1$b */
    /* loaded from: classes.dex */
    public static class C3699b extends tv0 {
        public C3699b(String str) {
            super("Missing required field: " + str);
        }
    }

    /* renamed from: com.daaw.ye1$c */
    /* loaded from: classes.dex */
    public static class C3700c extends AbstractC3698a {

        /* renamed from: e */
        public boolean f33573e;

        /* renamed from: f */
        public UUID f33574f;

        /* renamed from: g */
        public byte[] f33575g;

        public C3700c(AbstractC3698a abstractC3698a, String str) {
            super(abstractC3698a, str, "Protection");
        }

        /* renamed from: q */
        public static String m3820q(String str) {
            return (str.charAt(0) == '{' && str.charAt(str.length() - 1) == '}') ? str.substring(1, str.length() - 1) : str;
        }

        @Override // com.daaw.ye1.AbstractC3698a
        /* renamed from: b */
        public Object mo3816b() {
            UUID uuid = this.f33574f;
            return new xe1.C3534a(uuid, d01.m24845a(uuid, this.f33575g));
        }

        @Override // com.daaw.ye1.AbstractC3698a
        /* renamed from: d */
        public boolean mo3815d(String str) {
            return "ProtectionHeader".equals(str);
        }

        @Override // com.daaw.ye1.AbstractC3698a
        /* renamed from: h */
        public void mo3822h(XmlPullParser xmlPullParser) {
            if ("ProtectionHeader".equals(xmlPullParser.getName())) {
                this.f33573e = false;
            }
        }

        @Override // com.daaw.ye1.AbstractC3698a
        /* renamed from: n */
        public void mo3814n(XmlPullParser xmlPullParser) {
            if ("ProtectionHeader".equals(xmlPullParser.getName())) {
                this.f33573e = true;
                this.f33574f = UUID.fromString(m3820q(xmlPullParser.getAttributeValue(null, "SystemID")));
            }
        }

        @Override // com.daaw.ye1.AbstractC3698a
        /* renamed from: o */
        public void mo3821o(XmlPullParser xmlPullParser) {
            if (this.f33573e) {
                this.f33575g = Base64.decode(xmlPullParser.getText(), 0);
            }
        }
    }

    /* renamed from: com.daaw.ye1$d */
    /* loaded from: classes.dex */
    public static class C3701d extends AbstractC3698a {

        /* renamed from: e */
        public Format f33576e;

        public C3701d(AbstractC3698a abstractC3698a, String str) {
            super(abstractC3698a, str, "QualityLevel");
        }

        /* renamed from: q */
        public static List<byte[]> m3819q(String str) {
            ArrayList arrayList = new ArrayList();
            if (!TextUtils.isEmpty(str)) {
                byte[] m9998r = sq1.m9998r(str);
                byte[][] m23483k = C1183eg.m23483k(m9998r);
                if (m23483k == null) {
                    arrayList.add(m9998r);
                } else {
                    Collections.addAll(arrayList, m23483k);
                }
            }
            return arrayList;
        }

        /* renamed from: r */
        public static String m3818r(String str) {
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

        @Override // com.daaw.ye1.AbstractC3698a
        /* renamed from: b */
        public Object mo3816b() {
            return this.f33576e;
        }

        @Override // com.daaw.ye1.AbstractC3698a
        /* renamed from: n */
        public void mo3814n(XmlPullParser xmlPullParser) {
            Format m1717z;
            int intValue = ((Integer) m3832c("Type")).intValue();
            String attributeValue = xmlPullParser.getAttributeValue(null, "Index");
            int m3826k = m3826k(xmlPullParser, "Bitrate");
            String m3818r = m3818r(m3824m(xmlPullParser, "FourCC"));
            if (intValue == 2) {
                m1717z = Format.m1739G(attributeValue, "video/mp4", m3818r, null, m3826k, m3826k(xmlPullParser, "MaxWidth"), m3826k(xmlPullParser, "MaxHeight"), -1.0f, m3819q(xmlPullParser.getAttributeValue(null, "CodecPrivateData")), 0);
            } else if (intValue == 1) {
                if (m3818r == null) {
                    m3818r = "audio/mp4a-latm";
                }
                int m3826k2 = m3826k(xmlPullParser, "Channels");
                int m3826k3 = m3826k(xmlPullParser, "SamplingRate");
                List<byte[]> m3819q = m3819q(xmlPullParser.getAttributeValue(null, "CodecPrivateData"));
                if (m3819q.isEmpty() && "audio/mp4a-latm".equals(m3818r)) {
                    m3819q = Collections.singletonList(C1183eg.m23492b(m3826k3, m3826k2));
                }
                m1717z = Format.m1725q(attributeValue, "audio/mp4", m3818r, null, m3826k, m3826k2, m3826k3, m3819q, 0, (String) m3832c("Language"));
            } else {
                m1717z = intValue == 3 ? Format.m1717z(attributeValue, "application/mp4", m3818r, null, m3826k, 0, (String) m3832c("Language")) : Format.m1721v(attributeValue, "application/mp4", m3818r, null, m3826k, 0, null);
            }
            this.f33576e = m1717z;
        }
    }

    /* renamed from: com.daaw.ye1$e */
    /* loaded from: classes.dex */
    public static class C3702e extends AbstractC3698a {

        /* renamed from: e */
        public final List<xe1.C3535b> f33577e;

        /* renamed from: f */
        public int f33578f;

        /* renamed from: g */
        public int f33579g;

        /* renamed from: h */
        public long f33580h;

        /* renamed from: i */
        public long f33581i;

        /* renamed from: j */
        public long f33582j;

        /* renamed from: k */
        public int f33583k;

        /* renamed from: l */
        public boolean f33584l;

        /* renamed from: m */
        public xe1.C3534a f33585m;

        public C3702e(AbstractC3698a abstractC3698a, String str) {
            super(abstractC3698a, str, "SmoothStreamingMedia");
            this.f33583k = -1;
            this.f33585m = null;
            this.f33577e = new LinkedList();
        }

        @Override // com.daaw.ye1.AbstractC3698a
        /* renamed from: a */
        public void mo3817a(Object obj) {
            if (obj instanceof xe1.C3535b) {
                this.f33577e.add((xe1.C3535b) obj);
            } else if (obj instanceof xe1.C3534a) {
                C2914s6.m10685f(this.f33585m == null);
                this.f33585m = (xe1.C3534a) obj;
            }
        }

        @Override // com.daaw.ye1.AbstractC3698a
        /* renamed from: b */
        public Object mo3816b() {
            int size = this.f33577e.size();
            xe1.C3535b[] c3535bArr = new xe1.C3535b[size];
            this.f33577e.toArray(c3535bArr);
            if (this.f33585m != null) {
                xe1.C3534a c3534a = this.f33585m;
                DrmInitData drmInitData = new DrmInitData(new DrmInitData.SchemeData(c3534a.f32614a, "video/mp4", c3534a.f32615b));
                for (int i = 0; i < size; i++) {
                    xe1.C3535b c3535b = c3535bArr[i];
                    int i2 = 0;
                    while (true) {
                        Format[] formatArr = c3535b.f32625j;
                        if (i2 < formatArr.length) {
                            formatArr[i2] = formatArr[i2].m1731b(drmInitData);
                            i2++;
                        }
                    }
                }
            }
            return new xe1(this.f33578f, this.f33579g, this.f33580h, this.f33581i, this.f33582j, this.f33583k, this.f33584l, this.f33585m, c3535bArr);
        }

        @Override // com.daaw.ye1.AbstractC3698a
        /* renamed from: n */
        public void mo3814n(XmlPullParser xmlPullParser) {
            this.f33578f = m3826k(xmlPullParser, "MajorVersion");
            this.f33579g = m3826k(xmlPullParser, "MinorVersion");
            this.f33580h = m3827j(xmlPullParser, "TimeScale", 10000000L);
            this.f33581i = m3825l(xmlPullParser, "Duration");
            this.f33582j = m3827j(xmlPullParser, "DVRWindowLength", 0L);
            this.f33583k = m3828i(xmlPullParser, "LookaheadCount", -1);
            this.f33584l = m3829g(xmlPullParser, "IsLive", false);
            m3823p("TimeScale", Long.valueOf(this.f33580h));
        }
    }

    /* renamed from: com.daaw.ye1$f */
    /* loaded from: classes.dex */
    public static class C3703f extends AbstractC3698a {

        /* renamed from: e */
        public final String f33586e;

        /* renamed from: f */
        public final List<Format> f33587f;

        /* renamed from: g */
        public int f33588g;

        /* renamed from: h */
        public String f33589h;

        /* renamed from: i */
        public long f33590i;

        /* renamed from: j */
        public String f33591j;

        /* renamed from: k */
        public String f33592k;

        /* renamed from: l */
        public int f33593l;

        /* renamed from: m */
        public int f33594m;

        /* renamed from: n */
        public int f33595n;

        /* renamed from: o */
        public int f33596o;

        /* renamed from: p */
        public String f33597p;

        /* renamed from: q */
        public ArrayList<Long> f33598q;

        /* renamed from: r */
        public long f33599r;

        public C3703f(AbstractC3698a abstractC3698a, String str) {
            super(abstractC3698a, str, "StreamIndex");
            this.f33586e = str;
            this.f33587f = new LinkedList();
        }

        @Override // com.daaw.ye1.AbstractC3698a
        /* renamed from: a */
        public void mo3817a(Object obj) {
            if (obj instanceof Format) {
                this.f33587f.add((Format) obj);
            }
        }

        @Override // com.daaw.ye1.AbstractC3698a
        /* renamed from: b */
        public Object mo3816b() {
            Format[] formatArr = new Format[this.f33587f.size()];
            this.f33587f.toArray(formatArr);
            return new xe1.C3535b(this.f33586e, this.f33592k, this.f33588g, this.f33589h, this.f33590i, this.f33591j, this.f33593l, this.f33594m, this.f33595n, this.f33596o, this.f33597p, formatArr, this.f33598q, this.f33599r);
        }

        @Override // com.daaw.ye1.AbstractC3698a
        /* renamed from: d */
        public boolean mo3815d(String str) {
            return "c".equals(str);
        }

        @Override // com.daaw.ye1.AbstractC3698a
        /* renamed from: n */
        public void mo3814n(XmlPullParser xmlPullParser) {
            if ("c".equals(xmlPullParser.getName())) {
                m3812r(xmlPullParser);
            } else {
                m3813q(xmlPullParser);
            }
        }

        /* renamed from: q */
        public final void m3813q(XmlPullParser xmlPullParser) {
            int m3811s = m3811s(xmlPullParser);
            this.f33588g = m3811s;
            m3823p("Type", Integer.valueOf(m3811s));
            this.f33589h = this.f33588g == 3 ? m3824m(xmlPullParser, "Subtype") : xmlPullParser.getAttributeValue(null, "Subtype");
            this.f33591j = xmlPullParser.getAttributeValue(null, "Name");
            this.f33592k = m3824m(xmlPullParser, "Url");
            this.f33593l = m3828i(xmlPullParser, "MaxWidth", -1);
            this.f33594m = m3828i(xmlPullParser, "MaxHeight", -1);
            this.f33595n = m3828i(xmlPullParser, "DisplayWidth", -1);
            this.f33596o = m3828i(xmlPullParser, "DisplayHeight", -1);
            String attributeValue = xmlPullParser.getAttributeValue(null, "Language");
            this.f33597p = attributeValue;
            m3823p("Language", attributeValue);
            long m3828i = m3828i(xmlPullParser, "TimeScale", -1);
            this.f33590i = m3828i;
            if (m3828i == -1) {
                this.f33590i = ((Long) m3832c("TimeScale")).longValue();
            }
            this.f33598q = new ArrayList<>();
        }

        /* renamed from: r */
        public final void m3812r(XmlPullParser xmlPullParser) {
            int size = this.f33598q.size();
            long m3827j = m3827j(xmlPullParser, "t", -9223372036854775807L);
            int i = 1;
            if (m3827j == -9223372036854775807L) {
                if (size == 0) {
                    m3827j = 0;
                } else if (this.f33599r == -1) {
                    throw new tv0("Unable to infer start time");
                } else {
                    m3827j = this.f33598q.get(size - 1).longValue() + this.f33599r;
                }
            }
            this.f33598q.add(Long.valueOf(m3827j));
            this.f33599r = m3827j(xmlPullParser, "d", -9223372036854775807L);
            long m3827j2 = m3827j(xmlPullParser, "r", 1L);
            if (m3827j2 > 1 && this.f33599r == -9223372036854775807L) {
                throw new tv0("Repeated chunk with unspecified duration");
            }
            while (true) {
                long j = i;
                if (j >= m3827j2) {
                    return;
                }
                this.f33598q.add(Long.valueOf((this.f33599r * j) + m3827j));
                i++;
            }
        }

        /* renamed from: s */
        public final int m3811s(XmlPullParser xmlPullParser) {
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
            throw new C3699b("Type");
        }
    }

    public ye1() {
        try {
            this.f33568a = XmlPullParserFactory.newInstance();
        } catch (XmlPullParserException e) {
            throw new RuntimeException("Couldn't create XmlPullParserFactory instance", e);
        }
    }

    @Override // com.daaw.vv0.InterfaceC3379a
    /* renamed from: b */
    public xe1 mo3834a(Uri uri, InputStream inputStream) {
        try {
            XmlPullParser newPullParser = this.f33568a.newPullParser();
            newPullParser.setInput(inputStream, null);
            return (xe1) new C3702e(null, uri.toString()).m3830f(newPullParser);
        } catch (XmlPullParserException e) {
            throw new tv0(e);
        }
    }
}
