package com.daaw;

import com.google.android.exoplayer2.metadata.Metadata;
import com.google.android.exoplayer2.metadata.id3.ApicFrame;
import com.google.android.exoplayer2.metadata.id3.BinaryFrame;
import com.google.android.exoplayer2.metadata.id3.ChapterFrame;
import com.google.android.exoplayer2.metadata.id3.ChapterTocFrame;
import com.google.android.exoplayer2.metadata.id3.CommentFrame;
import com.google.android.exoplayer2.metadata.id3.GeobFrame;
import com.google.android.exoplayer2.metadata.id3.Id3Frame;
import com.google.android.exoplayer2.metadata.id3.PrivFrame;
import com.google.android.exoplayer2.metadata.id3.TextInformationFrame;
import com.google.android.exoplayer2.metadata.id3.UrlLinkFrame;
import java.io.UnsupportedEncodingException;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Locale;
/* loaded from: classes.dex */
public final class qe0 implements rp0 {

    /* renamed from: b */
    public static final InterfaceC2708b f23884b = new C2707a();

    /* renamed from: c */
    public static final int f23885c = sq1.m9994v("ID3");

    /* renamed from: a */
    public final InterfaceC2708b f23886a;

    /* renamed from: com.daaw.qe0$a */
    /* loaded from: classes.dex */
    public static class C2707a implements InterfaceC2708b {
        @Override // com.daaw.qe0.InterfaceC2708b
        /* renamed from: a */
        public boolean mo4098a(int i, int i2, int i3, int i4, int i5) {
            return false;
        }
    }

    /* renamed from: com.daaw.qe0$b */
    /* loaded from: classes.dex */
    public interface InterfaceC2708b {
        /* renamed from: a */
        boolean mo4098a(int i, int i2, int i3, int i4, int i5);
    }

    /* renamed from: com.daaw.qe0$c */
    /* loaded from: classes.dex */
    public static final class C2709c {

        /* renamed from: a */
        public final int f23887a;

        /* renamed from: b */
        public final boolean f23888b;

        /* renamed from: c */
        public final int f23889c;

        public C2709c(int i, boolean z, int i2) {
            this.f23887a = i;
            this.f23888b = z;
            this.f23889c = i2;
        }
    }

    public qe0() {
        this(null);
    }

    public qe0(InterfaceC2708b interfaceC2708b) {
        this.f23886a = interfaceC2708b;
    }

    /* renamed from: b */
    public static byte[] m12601b(byte[] bArr, int i, int i2) {
        return i2 <= i ? new byte[0] : Arrays.copyOfRange(bArr, i, i2);
    }

    /* renamed from: d */
    public static ApicFrame m12599d(rv0 rv0Var, int i, int i2) {
        int m12581v;
        String str;
        int m10896x = rv0Var.m10896x();
        String m12584s = m12584s(m10896x);
        int i3 = i - 1;
        byte[] bArr = new byte[i3];
        rv0Var.m10913g(bArr, 0, i3);
        if (i2 == 2) {
            str = "image/" + sq1.m10017a0(new String(bArr, 0, 3, "ISO-8859-1"));
            if ("image/jpg".equals(str)) {
                str = "image/jpeg";
            }
            m12581v = 2;
        } else {
            m12581v = m12581v(bArr, 0);
            String m10017a0 = sq1.m10017a0(new String(bArr, 0, m12581v, "ISO-8859-1"));
            if (m10017a0.indexOf(47) == -1) {
                str = "image/" + m10017a0;
            } else {
                str = m10017a0;
            }
        }
        int i4 = m12581v + 2;
        int m12582u = m12582u(bArr, i4, m10896x);
        return new ApicFrame(str, new String(bArr, i4, m12582u - i4, m12584s), bArr[m12581v + 1] & 255, m12601b(bArr, m12582u + m12585r(m10896x), i3));
    }

    /* renamed from: e */
    public static BinaryFrame m12598e(rv0 rv0Var, int i, String str) {
        byte[] bArr = new byte[i];
        rv0Var.m10913g(bArr, 0, i);
        return new BinaryFrame(str, bArr);
    }

    /* renamed from: f */
    public static ChapterFrame m12597f(rv0 rv0Var, int i, int i2, boolean z, int i3, InterfaceC2708b interfaceC2708b) {
        int m10917c = rv0Var.m10917c();
        int m12581v = m12581v(rv0Var.f25637a, m10917c);
        String str = new String(rv0Var.f25637a, m10917c, m12581v - m10917c, "ISO-8859-1");
        rv0Var.m10921J(m12581v + 1);
        int m10911i = rv0Var.m10911i();
        int m10911i2 = rv0Var.m10911i();
        long m10894z = rv0Var.m10894z();
        long j = m10894z == 4294967295L ? -1L : m10894z;
        long m10894z2 = rv0Var.m10894z();
        long j2 = m10894z2 == 4294967295L ? -1L : m10894z2;
        ArrayList arrayList = new ArrayList();
        int i4 = m10917c + i;
        while (rv0Var.m10917c() < i4) {
            Id3Frame m12594i = m12594i(i2, rv0Var, z, i3, interfaceC2708b);
            if (m12594i != null) {
                arrayList.add(m12594i);
            }
        }
        Id3Frame[] id3FrameArr = new Id3Frame[arrayList.size()];
        arrayList.toArray(id3FrameArr);
        return new ChapterFrame(str, m10911i, m10911i2, j, j2, id3FrameArr);
    }

    /* renamed from: g */
    public static ChapterTocFrame m12596g(rv0 rv0Var, int i, int i2, boolean z, int i3, InterfaceC2708b interfaceC2708b) {
        int m10917c = rv0Var.m10917c();
        int m12581v = m12581v(rv0Var.f25637a, m10917c);
        String str = new String(rv0Var.f25637a, m10917c, m12581v - m10917c, "ISO-8859-1");
        rv0Var.m10921J(m12581v + 1);
        int m10896x = rv0Var.m10896x();
        boolean z2 = (m10896x & 2) != 0;
        boolean z3 = (m10896x & 1) != 0;
        int m10896x2 = rv0Var.m10896x();
        String[] strArr = new String[m10896x2];
        for (int i4 = 0; i4 < m10896x2; i4++) {
            int m10917c2 = rv0Var.m10917c();
            int m12581v2 = m12581v(rv0Var.f25637a, m10917c2);
            strArr[i4] = new String(rv0Var.f25637a, m10917c2, m12581v2 - m10917c2, "ISO-8859-1");
            rv0Var.m10921J(m12581v2 + 1);
        }
        ArrayList arrayList = new ArrayList();
        int i5 = m10917c + i;
        while (rv0Var.m10917c() < i5) {
            Id3Frame m12594i = m12594i(i2, rv0Var, z, i3, interfaceC2708b);
            if (m12594i != null) {
                arrayList.add(m12594i);
            }
        }
        Id3Frame[] id3FrameArr = new Id3Frame[arrayList.size()];
        arrayList.toArray(id3FrameArr);
        return new ChapterTocFrame(str, z2, z3, strArr, id3FrameArr);
    }

    /* renamed from: h */
    public static CommentFrame m12595h(rv0 rv0Var, int i) {
        if (i < 4) {
            return null;
        }
        int m10896x = rv0Var.m10896x();
        String m12584s = m12584s(m10896x);
        byte[] bArr = new byte[3];
        rv0Var.m10913g(bArr, 0, 3);
        String str = new String(bArr, 0, 3);
        int i2 = i - 4;
        byte[] bArr2 = new byte[i2];
        rv0Var.m10913g(bArr2, 0, i2);
        int m12582u = m12582u(bArr2, 0, m10896x);
        String str2 = new String(bArr2, 0, m12582u, m12584s);
        int m12585r = m12582u + m12585r(m10896x);
        return new CommentFrame(str, str2, m12590m(bArr2, m12585r, m12582u(bArr2, m12585r, m10896x), m12584s));
    }

    /* JADX WARN: Code restructure failed: missing block: B:130:0x017f, code lost:
        if (r13 == 67) goto L96;
     */
    /* renamed from: i */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static Id3Frame m12594i(int i, rv0 rv0Var, boolean z, int i2, InterfaceC2708b interfaceC2708b) {
        int m10929B;
        int m10917c;
        int i3;
        int i4;
        boolean z2;
        boolean z3;
        boolean z4;
        boolean z5;
        boolean z6;
        Id3Frame m12595h;
        int m10896x = rv0Var.m10896x();
        int m10896x2 = rv0Var.m10896x();
        int m10896x3 = rv0Var.m10896x();
        int m10896x4 = i >= 3 ? rv0Var.m10896x() : 0;
        if (i == 4) {
            m10929B = rv0Var.m10929B();
            if (!z) {
                m10929B = (((m10929B >> 24) & 255) << 21) | (m10929B & 255) | (((m10929B >> 8) & 255) << 7) | (((m10929B >> 16) & 255) << 14);
            }
        } else {
            m10929B = i == 3 ? rv0Var.m10929B() : rv0Var.m10930A();
        }
        int i5 = m10929B;
        int m10927D = i >= 3 ? rv0Var.m10927D() : 0;
        if ((m10896x == 0 && m10896x2 == 0 && m10896x3 == 0 && m10896x4 == 0 && i5 == 0 && m10927D == 0) || (m10917c = rv0Var.m10917c() + i5) > rv0Var.m10916d()) {
            rv0Var.m10921J(rv0Var.m10916d());
            return null;
        }
        if (interfaceC2708b != null) {
            i3 = m10917c;
            i4 = m10927D;
            if (!interfaceC2708b.mo4098a(i, m10896x, m10896x2, m10896x3, m10896x4)) {
                rv0Var.m10921J(i3);
                return null;
            }
        } else {
            i3 = m10917c;
            i4 = m10927D;
        }
        if (i == 3) {
            boolean z7 = (i4 & 128) != 0;
            z3 = (i4 & 64) != 0;
            z6 = z7;
            z5 = false;
            z2 = (i4 & 32) != 0;
            z4 = z6;
        } else if (i == 4) {
            z2 = (i4 & 64) != 0;
            boolean z8 = (i4 & 8) != 0;
            boolean z9 = (i4 & 4) != 0;
            z5 = (i4 & 2) != 0;
            z6 = z8;
            z3 = z9;
            z4 = (i4 & 1) != 0;
        } else {
            z2 = false;
            z3 = false;
            z4 = false;
            z5 = false;
            z6 = false;
        }
        if (z6 || z3) {
            rv0Var.m10921J(i3);
            return null;
        }
        if (z2) {
            i5--;
            rv0Var.m10920K(1);
        }
        if (z4) {
            i5 -= 4;
            rv0Var.m10920K(4);
        }
        if (z5) {
            i5 = m12580w(rv0Var, i5);
        }
        try {
            if (m10896x == 84 && m10896x2 == 88 && m10896x3 == 88 && (i == 2 || m10896x4 == 88)) {
                m12595h = m12588o(rv0Var, i5);
            } else if (m10896x == 84) {
                m12595h = m12589n(rv0Var, i5, m12583t(i, m10896x, m10896x2, m10896x3, m10896x4));
            } else if (m10896x == 87 && m10896x2 == 88 && m10896x3 == 88 && (i == 2 || m10896x4 == 88)) {
                m12595h = m12586q(rv0Var, i5);
            } else if (m10896x == 87) {
                m12595h = m12587p(rv0Var, i5, m12583t(i, m10896x, m10896x2, m10896x3, m10896x4));
            } else if (m10896x == 80 && m10896x2 == 82 && m10896x3 == 73 && m10896x4 == 86) {
                m12595h = m12591l(rv0Var, i5);
            } else if (m10896x == 71 && m10896x2 == 69 && m10896x3 == 79 && (m10896x4 == 66 || i == 2)) {
                m12595h = m12593j(rv0Var, i5);
            } else if (i == 2) {
                if (m10896x == 80 && m10896x2 == 73 && m10896x3 == 67) {
                    m12595h = m12599d(rv0Var, i5, i);
                }
                m12595h = (m10896x != 67 && m10896x2 == 79 && m10896x3 == 77 && (m10896x4 == 77 || i == 2)) ? m12595h(rv0Var, i5) : (m10896x != 67 && m10896x2 == 72 && m10896x3 == 65 && m10896x4 == 80) ? m12597f(rv0Var, i5, i, z, i2, interfaceC2708b) : (m10896x != 67 && m10896x2 == 84 && m10896x3 == 79 && m10896x4 == 67) ? m12596g(rv0Var, i5, i, z, i2, interfaceC2708b) : m12598e(rv0Var, i5, m12583t(i, m10896x, m10896x2, m10896x3, m10896x4));
            } else {
                if (m10896x == 65) {
                    if (m10896x2 == 80) {
                        if (m10896x3 == 73) {
                        }
                    }
                }
                if (m10896x != 67) {
                }
            }
            if (m12595h == null) {
                StringBuilder sb = new StringBuilder();
                sb.append("Failed to decode frame: id=");
                sb.append(m12583t(i, m10896x, m10896x2, m10896x3, m10896x4));
                sb.append(", frameSize=");
                sb.append(i5);
            }
            rv0Var.m10921J(i3);
            return m12595h;
        } catch (UnsupportedEncodingException unused) {
            rv0Var.m10921J(i3);
            return null;
        } catch (Throwable th) {
            rv0Var.m10921J(i3);
            throw th;
        }
    }

    /* renamed from: j */
    public static GeobFrame m12593j(rv0 rv0Var, int i) {
        int m10896x = rv0Var.m10896x();
        String m12584s = m12584s(m10896x);
        int i2 = i - 1;
        byte[] bArr = new byte[i2];
        rv0Var.m10913g(bArr, 0, i2);
        int m12581v = m12581v(bArr, 0);
        String str = new String(bArr, 0, m12581v, "ISO-8859-1");
        int i3 = m12581v + 1;
        int m12582u = m12582u(bArr, i3, m10896x);
        String m12590m = m12590m(bArr, i3, m12582u, m12584s);
        int m12585r = m12582u + m12585r(m10896x);
        int m12582u2 = m12582u(bArr, m12585r, m10896x);
        return new GeobFrame(str, m12590m, m12590m(bArr, m12585r, m12582u2, m12584s), m12601b(bArr, m12582u2 + m12585r(m10896x), i2));
    }

    /* renamed from: k */
    public static C2709c m12592k(rv0 rv0Var) {
        StringBuilder sb;
        String str;
        if (rv0Var.m10919a() < 10) {
            return null;
        }
        int m10930A = rv0Var.m10930A();
        if (m10930A == f23885c) {
            m10930A = rv0Var.m10896x();
            boolean z = true;
            rv0Var.m10920K(1);
            int m10896x = rv0Var.m10896x();
            int m10897w = rv0Var.m10897w();
            if (m10930A == 2) {
                if ((m10896x & 64) != 0) {
                    return null;
                }
            } else if (m10930A == 3) {
                if ((m10896x & 64) != 0) {
                    int m10911i = rv0Var.m10911i();
                    rv0Var.m10920K(m10911i);
                    m10897w -= m10911i + 4;
                }
            } else if (m10930A == 4) {
                if ((m10896x & 64) != 0) {
                    int m10897w2 = rv0Var.m10897w();
                    rv0Var.m10920K(m10897w2 - 4);
                    m10897w -= m10897w2;
                }
                if ((m10896x & 16) != 0) {
                    m10897w -= 10;
                }
            } else {
                sb = new StringBuilder();
                str = "Skipped ID3 tag with unsupported majorVersion=";
            }
            return new C2709c(m10930A, (m10930A >= 4 || (m10896x & 128) == 0) ? false : false, m10897w);
        }
        sb = new StringBuilder();
        str = "Unexpected first three bytes of ID3 tag header: ";
        sb.append(str);
        sb.append(m10930A);
        return null;
    }

    /* renamed from: l */
    public static PrivFrame m12591l(rv0 rv0Var, int i) {
        byte[] bArr = new byte[i];
        rv0Var.m10913g(bArr, 0, i);
        int m12581v = m12581v(bArr, 0);
        return new PrivFrame(new String(bArr, 0, m12581v, "ISO-8859-1"), m12601b(bArr, m12581v + 1, i));
    }

    /* renamed from: m */
    public static String m12590m(byte[] bArr, int i, int i2, String str) {
        return (i2 <= i || i2 > bArr.length) ? "" : new String(bArr, i, i2 - i, str);
    }

    /* renamed from: n */
    public static TextInformationFrame m12589n(rv0 rv0Var, int i, String str) {
        if (i < 1) {
            return null;
        }
        int m10896x = rv0Var.m10896x();
        String m12584s = m12584s(m10896x);
        int i2 = i - 1;
        byte[] bArr = new byte[i2];
        rv0Var.m10913g(bArr, 0, i2);
        return new TextInformationFrame(str, null, new String(bArr, 0, m12582u(bArr, 0, m10896x), m12584s));
    }

    /* renamed from: o */
    public static TextInformationFrame m12588o(rv0 rv0Var, int i) {
        if (i < 1) {
            return null;
        }
        int m10896x = rv0Var.m10896x();
        String m12584s = m12584s(m10896x);
        int i2 = i - 1;
        byte[] bArr = new byte[i2];
        rv0Var.m10913g(bArr, 0, i2);
        int m12582u = m12582u(bArr, 0, m10896x);
        String str = new String(bArr, 0, m12582u, m12584s);
        int m12585r = m12582u + m12585r(m10896x);
        return new TextInformationFrame("TXXX", str, m12590m(bArr, m12585r, m12582u(bArr, m12585r, m10896x), m12584s));
    }

    /* renamed from: p */
    public static UrlLinkFrame m12587p(rv0 rv0Var, int i, String str) {
        byte[] bArr = new byte[i];
        rv0Var.m10913g(bArr, 0, i);
        return new UrlLinkFrame(str, null, new String(bArr, 0, m12581v(bArr, 0), "ISO-8859-1"));
    }

    /* renamed from: q */
    public static UrlLinkFrame m12586q(rv0 rv0Var, int i) {
        if (i < 1) {
            return null;
        }
        int m10896x = rv0Var.m10896x();
        String m12584s = m12584s(m10896x);
        int i2 = i - 1;
        byte[] bArr = new byte[i2];
        rv0Var.m10913g(bArr, 0, i2);
        int m12582u = m12582u(bArr, 0, m10896x);
        String str = new String(bArr, 0, m12582u, m12584s);
        int m12585r = m12582u + m12585r(m10896x);
        return new UrlLinkFrame("WXXX", str, m12590m(bArr, m12585r, m12581v(bArr, m12585r), "ISO-8859-1"));
    }

    /* renamed from: r */
    public static int m12585r(int i) {
        return (i == 0 || i == 3) ? 1 : 2;
    }

    /* renamed from: s */
    public static String m12584s(int i) {
        return i != 1 ? i != 2 ? i != 3 ? "ISO-8859-1" : "UTF-8" : "UTF-16BE" : "UTF-16";
    }

    /* renamed from: t */
    public static String m12583t(int i, int i2, int i3, int i4, int i5) {
        return i == 2 ? String.format(Locale.US, "%c%c%c", Integer.valueOf(i2), Integer.valueOf(i3), Integer.valueOf(i4)) : String.format(Locale.US, "%c%c%c%c", Integer.valueOf(i2), Integer.valueOf(i3), Integer.valueOf(i4), Integer.valueOf(i5));
    }

    /* renamed from: u */
    public static int m12582u(byte[] bArr, int i, int i2) {
        int m12581v = m12581v(bArr, i);
        if (i2 == 0 || i2 == 3) {
            return m12581v;
        }
        while (m12581v < bArr.length - 1) {
            if (m12581v % 2 == 0 && bArr[m12581v + 1] == 0) {
                return m12581v;
            }
            m12581v = m12581v(bArr, m12581v + 1);
        }
        return bArr.length;
    }

    /* renamed from: v */
    public static int m12581v(byte[] bArr, int i) {
        while (i < bArr.length) {
            if (bArr[i] == 0) {
                return i;
            }
            i++;
        }
        return bArr.length;
    }

    /* renamed from: w */
    public static int m12580w(rv0 rv0Var, int i) {
        byte[] bArr = rv0Var.f25637a;
        int m10917c = rv0Var.m10917c();
        while (true) {
            int i2 = m10917c + 1;
            if (i2 >= i) {
                return i;
            }
            if ((bArr[m10917c] & 255) == 255 && bArr[i2] == 0) {
                System.arraycopy(bArr, m10917c + 2, bArr, i2, (i - m10917c) - 2);
                i--;
            }
            m10917c = i2;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:31:0x0076, code lost:
        if ((r10 & 1) != 0) goto L33;
     */
    /* JADX WARN: Code restructure failed: missing block: B:40:0x0086, code lost:
        if ((r10 & 128) != 0) goto L33;
     */
    /* renamed from: x */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static boolean m12579x(rv0 rv0Var, int i, int i2, boolean z) {
        int m10930A;
        long m10930A2;
        int i3;
        int i4;
        int m10917c = rv0Var.m10917c();
        while (true) {
            try {
                boolean z2 = true;
                if (rv0Var.m10919a() < i2) {
                    return true;
                }
                if (i >= 3) {
                    m10930A = rv0Var.m10911i();
                    m10930A2 = rv0Var.m10894z();
                    i3 = rv0Var.m10927D();
                } else {
                    m10930A = rv0Var.m10930A();
                    m10930A2 = rv0Var.m10930A();
                    i3 = 0;
                }
                if (m10930A == 0 && m10930A2 == 0 && i3 == 0) {
                    return true;
                }
                if (i == 4 && !z) {
                    if ((8421504 & m10930A2) != 0) {
                        return false;
                    }
                    m10930A2 = (((m10930A2 >> 24) & 255) << 21) | (m10930A2 & 255) | (((m10930A2 >> 8) & 255) << 7) | (((m10930A2 >> 16) & 255) << 14);
                }
                if (i == 4) {
                    i4 = (i3 & 64) != 0 ? 1 : 0;
                } else {
                    if (i == 3) {
                        i4 = (i3 & 32) != 0 ? 1 : 0;
                    } else {
                        i4 = 0;
                    }
                    z2 = false;
                    if (z2) {
                        i4 += 4;
                    }
                    if (m10930A2 < i4) {
                        return false;
                    }
                    if (rv0Var.m10919a() < m10930A2) {
                        return false;
                    }
                    rv0Var.m10920K((int) m10930A2);
                }
            } finally {
                rv0Var.m10921J(m10917c);
            }
        }
    }

    @Override // com.daaw.rp0
    /* renamed from: a */
    public Metadata mo11098a(tp0 tp0Var) {
        ByteBuffer byteBuffer = tp0Var.f11565r;
        return m12600c(byteBuffer.array(), byteBuffer.limit());
    }

    /* renamed from: c */
    public Metadata m12600c(byte[] bArr, int i) {
        ArrayList arrayList = new ArrayList();
        rv0 rv0Var = new rv0(bArr, i);
        C2709c m12592k = m12592k(rv0Var);
        if (m12592k == null) {
            return null;
        }
        int m10917c = rv0Var.m10917c();
        int i2 = m12592k.f23887a == 2 ? 6 : 10;
        int i3 = m12592k.f23889c;
        if (m12592k.f23888b) {
            i3 = m12580w(rv0Var, m12592k.f23889c);
        }
        rv0Var.m10922I(m10917c + i3);
        boolean z = false;
        if (!m12579x(rv0Var, m12592k.f23887a, i2, false)) {
            if (m12592k.f23887a != 4 || !m12579x(rv0Var, 4, i2, true)) {
                StringBuilder sb = new StringBuilder();
                sb.append("Failed to validate ID3 tag with majorVersion=");
                sb.append(m12592k.f23887a);
                return null;
            }
            z = true;
        }
        while (rv0Var.m10919a() >= i2) {
            Id3Frame m12594i = m12594i(m12592k.f23887a, rv0Var, z, i2, this.f23886a);
            if (m12594i != null) {
                arrayList.add(m12594i);
            }
        }
        return new Metadata(arrayList);
    }
}
