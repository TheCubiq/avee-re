package com.daaw;
/* loaded from: classes2.dex */
public class ar0 {
    public static final String[] m = {null, "I", "II", "III"};
    public String a;
    public int b;
    public boolean c;
    public int d;
    public int e;
    public boolean f;
    public boolean g;
    public String h;
    public String i;
    public boolean j;
    public boolean k;
    public String l;

    public ar0(byte b, byte b2, byte b3, byte b4) {
        p(wc.l(b, b2, b3, b4));
    }

    public int a(long j, long j2) {
        int i = 0;
        int i2 = 0;
        while (true) {
            if (i2 > 31) {
                break;
            } else if (((j2 >> i2) & 1) != 0) {
                i = i2;
                break;
            } else {
                i2++;
            }
        }
        return (int) ((j >> i) & (j2 >> i));
    }

    public int b() {
        return this.d;
    }

    public String c() {
        return this.h;
    }

    public String d() {
        return this.l;
    }

    public String e() {
        return m[this.b];
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [boolean, int] */
    public int f() {
        int i;
        int i2;
        ?? r0 = this.f;
        if (this.b == 1) {
            i = (this.d * 48000) / this.e;
            i2 = r0 * 4;
        } else {
            i = (this.d * 144000) / this.e;
            i2 = r0;
        }
        return i + i2;
    }

    public String g() {
        return this.i;
    }

    public int h() {
        return this.e;
    }

    public String i() {
        return this.a;
    }

    public boolean j() {
        return this.j;
    }

    public boolean k() {
        return this.k;
    }

    /* JADX WARN: Removed duplicated region for block: B:59:0x0083  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x0086  */
    /* JADX WARN: Removed duplicated region for block: B:87:0x00b2  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void l(int r17) {
        /*
            Method dump skipped, instructions count: 468
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.daaw.ar0.l(int):void");
    }

    public final void m(int i) {
        String str;
        if (i == 0) {
            str = "Stereo";
        } else if (i == 1) {
            str = "Joint stereo";
        } else if (i == 2) {
            str = "Dual mono";
        } else if (i != 3) {
            throw new xg0("Invalid channel mode in frame header");
        } else {
            str = "Mono";
        }
        this.h = str;
    }

    public final void n(int i) {
        this.j = i == 1;
    }

    public final void o(int i) {
        String str;
        if (i == 0) {
            str = "None";
        } else if (i == 1) {
            str = "50/15 ms";
        } else if (i != 3) {
            throw new xg0("Invalid emphasis in frame header");
        } else {
            str = "CCITT J.17";
        }
        this.l = str;
    }

    public final void p(long j) {
        if (a(j, 4292870144L) != 2047) {
            throw new xg0("Frame sync missing");
        }
        x(a(j, 1572864L));
        q(a(j, 393216L));
        v(a(j, 65536L));
        l(a(j, 61440L));
        w(a(j, 3072L));
        t(a(j, 512L));
        u(a(j, 256L));
        m(a(j, 192L));
        r(a(j, 48L));
        n(a(j, 8L));
        s(a(j, 4L));
        o(a(j, 3L));
    }

    public final void q(int i) {
        if (i == 1) {
            this.b = 3;
        } else if (i == 2) {
            this.b = 2;
        } else if (i != 3) {
            throw new xg0("Invalid mpeg layer description in frame header");
        } else {
            this.b = 1;
        }
    }

    public final void r(int i) {
        String str;
        if (!"Joint stereo".equals(this.h)) {
            this.i = "n/a";
            return;
        }
        int i2 = this.b;
        if (i2 == 1 || i2 == 2) {
            if (i == 0) {
                str = "Bands 4-31";
            } else if (i == 1) {
                str = "Bands 8-31";
            } else if (i != 2) {
                if (i == 3) {
                    str = "Bands 16-31";
                }
                throw new xg0("Invalid mode extension in frame header");
            } else {
                str = "Bands 12-31";
            }
            this.i = str;
            return;
        }
        if (i2 == 3) {
            if (i == 0) {
                str = "None";
            } else if (i == 1) {
                str = "Intensity stereo";
            } else if (i == 2) {
                str = "M/S stereo";
            } else if (i == 3) {
                str = "Intensity & M/S stereo";
            }
            this.i = str;
            return;
        }
        throw new xg0("Invalid mode extension in frame header");
    }

    public final void s(int i) {
        this.k = i == 1;
    }

    public final void t(int i) {
        this.f = i == 1;
    }

    public final void u(int i) {
        this.g = i == 1;
    }

    public final void v(int i) {
        this.c = i == 1;
    }

    public final void w(int i) {
        int i2;
        if ("1.0".equals(this.a)) {
            if (i == 0) {
                i2 = 44100;
            } else if (i != 1) {
                if (i == 2) {
                    i2 = 32000;
                }
                throw new xg0("Invalid sample rate in frame header");
            } else {
                i2 = 48000;
            }
            this.e = i2;
        } else if ("2.0".equals(this.a)) {
            if (i == 0) {
                i2 = 22050;
            } else if (i != 1) {
                if (i == 2) {
                    i2 = 16000;
                }
                throw new xg0("Invalid sample rate in frame header");
            } else {
                i2 = 24000;
            }
            this.e = i2;
        } else {
            if ("2.5".equals(this.a)) {
                if (i == 0) {
                    i2 = 11025;
                } else if (i == 1) {
                    i2 = 12000;
                } else if (i == 2) {
                    i2 = 8000;
                }
                this.e = i2;
            }
            throw new xg0("Invalid sample rate in frame header");
        }
    }

    public final void x(int i) {
        String str;
        if (i == 0) {
            str = "2.5";
        } else if (i == 2) {
            str = "2.0";
        } else if (i != 3) {
            throw new xg0("Invalid mpeg audio version in frame header");
        } else {
            str = "1.0";
        }
        this.a = str;
    }
}
