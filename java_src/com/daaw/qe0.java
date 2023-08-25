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
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Locale;
/* loaded from: classes.dex */
public final class qe0 implements rp0 {
    public static final b b = new a();
    public static final int c = sq1.v("ID3");
    public final b a;

    /* loaded from: classes.dex */
    public static class a implements b {
        @Override // com.daaw.qe0.b
        public boolean a(int i, int i2, int i3, int i4, int i5) {
            return false;
        }
    }

    /* loaded from: classes.dex */
    public interface b {
        boolean a(int i, int i2, int i3, int i4, int i5);
    }

    /* loaded from: classes.dex */
    public static final class c {
        public final int a;
        public final boolean b;
        public final int c;

        public c(int i, boolean z, int i2) {
            this.a = i;
            this.b = z;
            this.c = i2;
        }
    }

    public qe0() {
        this(null);
    }

    public qe0(b bVar) {
        this.a = bVar;
    }

    public static byte[] b(byte[] bArr, int i, int i2) {
        return i2 <= i ? new byte[0] : Arrays.copyOfRange(bArr, i, i2);
    }

    public static ApicFrame d(rv0 rv0Var, int i, int i2) {
        int v;
        String str;
        int x = rv0Var.x();
        String s = s(x);
        int i3 = i - 1;
        byte[] bArr = new byte[i3];
        rv0Var.g(bArr, 0, i3);
        if (i2 == 2) {
            str = "image/" + sq1.a0(new String(bArr, 0, 3, "ISO-8859-1"));
            if ("image/jpg".equals(str)) {
                str = "image/jpeg";
            }
            v = 2;
        } else {
            v = v(bArr, 0);
            String a0 = sq1.a0(new String(bArr, 0, v, "ISO-8859-1"));
            if (a0.indexOf(47) == -1) {
                str = "image/" + a0;
            } else {
                str = a0;
            }
        }
        int i4 = v + 2;
        int u = u(bArr, i4, x);
        return new ApicFrame(str, new String(bArr, i4, u - i4, s), bArr[v + 1] & 255, b(bArr, u + r(x), i3));
    }

    public static BinaryFrame e(rv0 rv0Var, int i, String str) {
        byte[] bArr = new byte[i];
        rv0Var.g(bArr, 0, i);
        return new BinaryFrame(str, bArr);
    }

    public static ChapterFrame f(rv0 rv0Var, int i, int i2, boolean z, int i3, b bVar) {
        int c2 = rv0Var.c();
        int v = v(rv0Var.a, c2);
        String str = new String(rv0Var.a, c2, v - c2, "ISO-8859-1");
        rv0Var.J(v + 1);
        int i4 = rv0Var.i();
        int i5 = rv0Var.i();
        long z2 = rv0Var.z();
        long j = z2 == 4294967295L ? -1L : z2;
        long z3 = rv0Var.z();
        long j2 = z3 == 4294967295L ? -1L : z3;
        ArrayList arrayList = new ArrayList();
        int i6 = c2 + i;
        while (rv0Var.c() < i6) {
            Id3Frame i7 = i(i2, rv0Var, z, i3, bVar);
            if (i7 != null) {
                arrayList.add(i7);
            }
        }
        Id3Frame[] id3FrameArr = new Id3Frame[arrayList.size()];
        arrayList.toArray(id3FrameArr);
        return new ChapterFrame(str, i4, i5, j, j2, id3FrameArr);
    }

    public static ChapterTocFrame g(rv0 rv0Var, int i, int i2, boolean z, int i3, b bVar) {
        int c2 = rv0Var.c();
        int v = v(rv0Var.a, c2);
        String str = new String(rv0Var.a, c2, v - c2, "ISO-8859-1");
        rv0Var.J(v + 1);
        int x = rv0Var.x();
        boolean z2 = (x & 2) != 0;
        boolean z3 = (x & 1) != 0;
        int x2 = rv0Var.x();
        String[] strArr = new String[x2];
        for (int i4 = 0; i4 < x2; i4++) {
            int c3 = rv0Var.c();
            int v2 = v(rv0Var.a, c3);
            strArr[i4] = new String(rv0Var.a, c3, v2 - c3, "ISO-8859-1");
            rv0Var.J(v2 + 1);
        }
        ArrayList arrayList = new ArrayList();
        int i5 = c2 + i;
        while (rv0Var.c() < i5) {
            Id3Frame i6 = i(i2, rv0Var, z, i3, bVar);
            if (i6 != null) {
                arrayList.add(i6);
            }
        }
        Id3Frame[] id3FrameArr = new Id3Frame[arrayList.size()];
        arrayList.toArray(id3FrameArr);
        return new ChapterTocFrame(str, z2, z3, strArr, id3FrameArr);
    }

    public static CommentFrame h(rv0 rv0Var, int i) {
        if (i < 4) {
            return null;
        }
        int x = rv0Var.x();
        String s = s(x);
        byte[] bArr = new byte[3];
        rv0Var.g(bArr, 0, 3);
        String str = new String(bArr, 0, 3);
        int i2 = i - 4;
        byte[] bArr2 = new byte[i2];
        rv0Var.g(bArr2, 0, i2);
        int u = u(bArr2, 0, x);
        String str2 = new String(bArr2, 0, u, s);
        int r = u + r(x);
        return new CommentFrame(str, str2, m(bArr2, r, u(bArr2, r, x), s));
    }

    /* JADX WARN: Code restructure failed: missing block: B:130:0x017f, code lost:
        if (r13 == 67) goto L96;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static com.google.android.exoplayer2.metadata.id3.Id3Frame i(int r19, com.daaw.rv0 r20, boolean r21, int r22, com.daaw.qe0.b r23) {
        /*
            Method dump skipped, instructions count: 508
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.daaw.qe0.i(int, com.daaw.rv0, boolean, int, com.daaw.qe0$b):com.google.android.exoplayer2.metadata.id3.Id3Frame");
    }

    public static GeobFrame j(rv0 rv0Var, int i) {
        int x = rv0Var.x();
        String s = s(x);
        int i2 = i - 1;
        byte[] bArr = new byte[i2];
        rv0Var.g(bArr, 0, i2);
        int v = v(bArr, 0);
        String str = new String(bArr, 0, v, "ISO-8859-1");
        int i3 = v + 1;
        int u = u(bArr, i3, x);
        String m = m(bArr, i3, u, s);
        int r = u + r(x);
        int u2 = u(bArr, r, x);
        return new GeobFrame(str, m, m(bArr, r, u2, s), b(bArr, u2 + r(x), i2));
    }

    public static c k(rv0 rv0Var) {
        StringBuilder sb;
        String str;
        if (rv0Var.a() < 10) {
            return null;
        }
        int A = rv0Var.A();
        if (A == c) {
            A = rv0Var.x();
            boolean z = true;
            rv0Var.K(1);
            int x = rv0Var.x();
            int w = rv0Var.w();
            if (A == 2) {
                if ((x & 64) != 0) {
                    return null;
                }
            } else if (A == 3) {
                if ((x & 64) != 0) {
                    int i = rv0Var.i();
                    rv0Var.K(i);
                    w -= i + 4;
                }
            } else if (A == 4) {
                if ((x & 64) != 0) {
                    int w2 = rv0Var.w();
                    rv0Var.K(w2 - 4);
                    w -= w2;
                }
                if ((x & 16) != 0) {
                    w -= 10;
                }
            } else {
                sb = new StringBuilder();
                str = "Skipped ID3 tag with unsupported majorVersion=";
            }
            return new c(A, (A >= 4 || (x & 128) == 0) ? false : false, w);
        }
        sb = new StringBuilder();
        str = "Unexpected first three bytes of ID3 tag header: ";
        sb.append(str);
        sb.append(A);
        return null;
    }

    public static PrivFrame l(rv0 rv0Var, int i) {
        byte[] bArr = new byte[i];
        rv0Var.g(bArr, 0, i);
        int v = v(bArr, 0);
        return new PrivFrame(new String(bArr, 0, v, "ISO-8859-1"), b(bArr, v + 1, i));
    }

    public static String m(byte[] bArr, int i, int i2, String str) {
        return (i2 <= i || i2 > bArr.length) ? "" : new String(bArr, i, i2 - i, str);
    }

    public static TextInformationFrame n(rv0 rv0Var, int i, String str) {
        if (i < 1) {
            return null;
        }
        int x = rv0Var.x();
        String s = s(x);
        int i2 = i - 1;
        byte[] bArr = new byte[i2];
        rv0Var.g(bArr, 0, i2);
        return new TextInformationFrame(str, null, new String(bArr, 0, u(bArr, 0, x), s));
    }

    public static TextInformationFrame o(rv0 rv0Var, int i) {
        if (i < 1) {
            return null;
        }
        int x = rv0Var.x();
        String s = s(x);
        int i2 = i - 1;
        byte[] bArr = new byte[i2];
        rv0Var.g(bArr, 0, i2);
        int u = u(bArr, 0, x);
        String str = new String(bArr, 0, u, s);
        int r = u + r(x);
        return new TextInformationFrame("TXXX", str, m(bArr, r, u(bArr, r, x), s));
    }

    public static UrlLinkFrame p(rv0 rv0Var, int i, String str) {
        byte[] bArr = new byte[i];
        rv0Var.g(bArr, 0, i);
        return new UrlLinkFrame(str, null, new String(bArr, 0, v(bArr, 0), "ISO-8859-1"));
    }

    public static UrlLinkFrame q(rv0 rv0Var, int i) {
        if (i < 1) {
            return null;
        }
        int x = rv0Var.x();
        String s = s(x);
        int i2 = i - 1;
        byte[] bArr = new byte[i2];
        rv0Var.g(bArr, 0, i2);
        int u = u(bArr, 0, x);
        String str = new String(bArr, 0, u, s);
        int r = u + r(x);
        return new UrlLinkFrame("WXXX", str, m(bArr, r, v(bArr, r), "ISO-8859-1"));
    }

    public static int r(int i) {
        return (i == 0 || i == 3) ? 1 : 2;
    }

    public static String s(int i) {
        return i != 1 ? i != 2 ? i != 3 ? "ISO-8859-1" : "UTF-8" : "UTF-16BE" : "UTF-16";
    }

    public static String t(int i, int i2, int i3, int i4, int i5) {
        return i == 2 ? String.format(Locale.US, "%c%c%c", Integer.valueOf(i2), Integer.valueOf(i3), Integer.valueOf(i4)) : String.format(Locale.US, "%c%c%c%c", Integer.valueOf(i2), Integer.valueOf(i3), Integer.valueOf(i4), Integer.valueOf(i5));
    }

    public static int u(byte[] bArr, int i, int i2) {
        int v = v(bArr, i);
        if (i2 == 0 || i2 == 3) {
            return v;
        }
        while (v < bArr.length - 1) {
            if (v % 2 == 0 && bArr[v + 1] == 0) {
                return v;
            }
            v = v(bArr, v + 1);
        }
        return bArr.length;
    }

    public static int v(byte[] bArr, int i) {
        while (i < bArr.length) {
            if (bArr[i] == 0) {
                return i;
            }
            i++;
        }
        return bArr.length;
    }

    public static int w(rv0 rv0Var, int i) {
        byte[] bArr = rv0Var.a;
        int c2 = rv0Var.c();
        while (true) {
            int i2 = c2 + 1;
            if (i2 >= i) {
                return i;
            }
            if ((bArr[c2] & 255) == 255 && bArr[i2] == 0) {
                System.arraycopy(bArr, c2 + 2, bArr, i2, (i - c2) - 2);
                i--;
            }
            c2 = i2;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:31:0x0076, code lost:
        if ((r10 & 1) != 0) goto L33;
     */
    /* JADX WARN: Code restructure failed: missing block: B:40:0x0086, code lost:
        if ((r10 & 128) != 0) goto L33;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static boolean x(com.daaw.rv0 r18, int r19, int r20, boolean r21) {
        /*
            r1 = r18
            r0 = r19
            int r2 = r18.c()
        L8:
            int r3 = r18.a()     // Catch: java.lang.Throwable -> Laf
            r4 = 1
            r5 = r20
            if (r3 < r5) goto Lab
            r3 = 3
            r6 = 0
            if (r0 < r3) goto L22
            int r7 = r18.i()     // Catch: java.lang.Throwable -> Laf
            long r8 = r18.z()     // Catch: java.lang.Throwable -> Laf
            int r10 = r18.D()     // Catch: java.lang.Throwable -> Laf
            goto L2c
        L22:
            int r7 = r18.A()     // Catch: java.lang.Throwable -> Laf
            int r8 = r18.A()     // Catch: java.lang.Throwable -> Laf
            long r8 = (long) r8
            r10 = 0
        L2c:
            r11 = 0
            if (r7 != 0) goto L3a
            int r7 = (r8 > r11 ? 1 : (r8 == r11 ? 0 : -1))
            if (r7 != 0) goto L3a
            if (r10 != 0) goto L3a
            r1.J(r2)
            return r4
        L3a:
            r7 = 4
            if (r0 != r7) goto L6b
            if (r21 != 0) goto L6b
            r13 = 8421504(0x808080, double:4.160776E-317)
            long r13 = r13 & r8
            int r15 = (r13 > r11 ? 1 : (r13 == r11 ? 0 : -1))
            if (r15 == 0) goto L4b
            r1.J(r2)
            return r6
        L4b:
            r11 = 255(0xff, double:1.26E-321)
            long r13 = r8 & r11
            r15 = 8
            long r15 = r8 >> r15
            long r15 = r15 & r11
            r17 = 7
            long r15 = r15 << r17
            long r13 = r13 | r15
            r15 = 16
            long r15 = r8 >> r15
            long r15 = r15 & r11
            r17 = 14
            long r15 = r15 << r17
            long r13 = r13 | r15
            r15 = 24
            long r8 = r8 >> r15
            long r8 = r8 & r11
            r11 = 21
            long r8 = r8 << r11
            long r8 = r8 | r13
        L6b:
            if (r0 != r7) goto L7b
            r3 = r10 & 64
            if (r3 == 0) goto L73
            r3 = 1
            goto L74
        L73:
            r3 = 0
        L74:
            r7 = r10 & 1
            if (r7 == 0) goto L79
            goto L8b
        L79:
            r4 = 0
            goto L8b
        L7b:
            if (r0 != r3) goto L89
            r3 = r10 & 32
            if (r3 == 0) goto L83
            r3 = 1
            goto L84
        L83:
            r3 = 0
        L84:
            r7 = r10 & 128(0x80, float:1.794E-43)
            if (r7 == 0) goto L79
            goto L8b
        L89:
            r3 = 0
            goto L79
        L8b:
            if (r4 == 0) goto L8f
            int r3 = r3 + 4
        L8f:
            long r3 = (long) r3
            int r7 = (r8 > r3 ? 1 : (r8 == r3 ? 0 : -1))
            if (r7 >= 0) goto L98
            r1.J(r2)
            return r6
        L98:
            int r3 = r18.a()     // Catch: java.lang.Throwable -> Laf
            long r3 = (long) r3
            int r7 = (r3 > r8 ? 1 : (r3 == r8 ? 0 : -1))
            if (r7 >= 0) goto La5
            r1.J(r2)
            return r6
        La5:
            int r3 = (int) r8
            r1.K(r3)     // Catch: java.lang.Throwable -> Laf
            goto L8
        Lab:
            r1.J(r2)
            return r4
        Laf:
            r0 = move-exception
            r1.J(r2)
            goto Lb5
        Lb4:
            throw r0
        Lb5:
            goto Lb4
        */
        throw new UnsupportedOperationException("Method not decompiled: com.daaw.qe0.x(com.daaw.rv0, int, int, boolean):boolean");
    }

    @Override // com.daaw.rp0
    public Metadata a(tp0 tp0Var) {
        ByteBuffer byteBuffer = tp0Var.r;
        return c(byteBuffer.array(), byteBuffer.limit());
    }

    public Metadata c(byte[] bArr, int i) {
        ArrayList arrayList = new ArrayList();
        rv0 rv0Var = new rv0(bArr, i);
        c k = k(rv0Var);
        if (k == null) {
            return null;
        }
        int c2 = rv0Var.c();
        int i2 = k.a == 2 ? 6 : 10;
        int i3 = k.c;
        if (k.b) {
            i3 = w(rv0Var, k.c);
        }
        rv0Var.I(c2 + i3);
        boolean z = false;
        if (!x(rv0Var, k.a, i2, false)) {
            if (k.a != 4 || !x(rv0Var, 4, i2, true)) {
                StringBuilder sb = new StringBuilder();
                sb.append("Failed to validate ID3 tag with majorVersion=");
                sb.append(k.a);
                return null;
            }
            z = true;
        }
        while (rv0Var.a() >= i2) {
            Id3Frame i4 = i(k.a, rv0Var, z, i2, this.a);
            if (i4 != null) {
                arrayList.add(i4);
            }
        }
        return new Metadata(arrayList);
    }
}
