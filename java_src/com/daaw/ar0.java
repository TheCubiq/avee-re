package com.daaw;
/* loaded from: classes2.dex */
public class ar0 {

    /* renamed from: m */
    public static final String[] f3480m = {null, "I", "II", "III"};

    /* renamed from: a */
    public String f3481a;

    /* renamed from: b */
    public int f3482b;

    /* renamed from: c */
    public boolean f3483c;

    /* renamed from: d */
    public int f3484d;

    /* renamed from: e */
    public int f3485e;

    /* renamed from: f */
    public boolean f3486f;

    /* renamed from: g */
    public boolean f3487g;

    /* renamed from: h */
    public String f3488h;

    /* renamed from: i */
    public String f3489i;

    /* renamed from: j */
    public boolean f3490j;

    /* renamed from: k */
    public boolean f3491k;

    /* renamed from: l */
    public String f3492l;

    public ar0(byte b, byte b2, byte b3, byte b4) {
        m27149p(C3419wc.m6192l(b, b2, b3, b4));
    }

    /* renamed from: a */
    public int m27164a(long j, long j2) {
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

    /* renamed from: b */
    public int m27163b() {
        return this.f3484d;
    }

    /* renamed from: c */
    public String m27162c() {
        return this.f3488h;
    }

    /* renamed from: d */
    public String m27161d() {
        return this.f3492l;
    }

    /* renamed from: e */
    public String m27160e() {
        return f3480m[this.f3482b];
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [boolean, int] */
    /* renamed from: f */
    public int m27159f() {
        int i;
        int i2;
        ?? r0 = this.f3486f;
        if (this.f3482b == 1) {
            i = (this.f3484d * 48000) / this.f3485e;
            i2 = r0 * 4;
        } else {
            i = (this.f3484d * 144000) / this.f3485e;
            i2 = r0;
        }
        return i + i2;
    }

    /* renamed from: g */
    public String m27158g() {
        return this.f3489i;
    }

    /* renamed from: h */
    public int m27157h() {
        return this.f3485e;
    }

    /* renamed from: i */
    public String m27156i() {
        return this.f3481a;
    }

    /* renamed from: j */
    public boolean m27155j() {
        return this.f3490j;
    }

    /* renamed from: k */
    public boolean m27154k() {
        return this.f3491k;
    }

    /* JADX WARN: Removed duplicated region for block: B:59:0x0083  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x0086  */
    /* JADX WARN: Removed duplicated region for block: B:87:0x00b2  */
    /* renamed from: l */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void m27153l(int i) {
        int i2;
        if (!"1.0".equals(this.f3481a)) {
            if ("2.0".equals(this.f3481a) || "2.5".equals(this.f3481a)) {
                int i3 = this.f3482b;
                if (i3 == 1) {
                    switch (i) {
                        case 1:
                            this.f3484d = 32;
                            return;
                        case 4:
                            this.f3484d = 64;
                            return;
                        case 5:
                            this.f3484d = 80;
                            return;
                        case 6:
                            this.f3484d = 96;
                            return;
                        case 7:
                            this.f3484d = 112;
                            return;
                        case 8:
                            this.f3484d = 128;
                            return;
                        case 9:
                            this.f3484d = 144;
                            return;
                        case 10:
                            this.f3484d = 160;
                            return;
                        case 11:
                            i2 = 176;
                            break;
                        case 12:
                            this.f3484d = 192;
                            return;
                        case 13:
                            this.f3484d = 224;
                            return;
                        case 14:
                            this.f3484d = 256;
                            return;
                    }
                } else if (i3 == 2 || i3 == 3) {
                    switch (i) {
                        case 1:
                            i2 = 8;
                            break;
                        case 2:
                            i2 = 16;
                            break;
                        case 3:
                            i2 = 24;
                            break;
                        case 4:
                            this.f3484d = 32;
                            return;
                        case 8:
                            this.f3484d = 64;
                            return;
                        case 9:
                            this.f3484d = 80;
                            return;
                        case 10:
                            this.f3484d = 96;
                            return;
                        case 11:
                            this.f3484d = 112;
                            return;
                        case 12:
                            this.f3484d = 128;
                            return;
                        case 13:
                            this.f3484d = 144;
                            return;
                        case 14:
                            this.f3484d = 160;
                            return;
                    }
                }
            }
            throw new xg0("Invalid bitrate in frame header");
        }
        int i4 = this.f3482b;
        if (i4 == 1) {
            switch (i) {
                case 1:
                    this.f3484d = 32;
                    return;
                case 2:
                    this.f3484d = 64;
                    return;
                case 3:
                    this.f3484d = 96;
                    return;
                case 4:
                    this.f3484d = 128;
                    return;
                case 5:
                    this.f3484d = 160;
                    return;
                case 6:
                    this.f3484d = 192;
                    return;
                case 7:
                    this.f3484d = 224;
                    return;
                case 8:
                    this.f3484d = 256;
                    return;
                case 9:
                    i2 = 288;
                    break;
                case 10:
                    this.f3484d = 320;
                    return;
                case 11:
                    i2 = 352;
                    break;
                case 12:
                    this.f3484d = 384;
                    return;
                case 13:
                    i2 = 416;
                    break;
                case 14:
                    i2 = 448;
                    break;
            }
        } else if (i4 == 2) {
            switch (i) {
                case 1:
                    this.f3484d = 32;
                    return;
                case 2:
                    i2 = 48;
                    break;
                case 3:
                    i2 = 56;
                    break;
                case 4:
                    this.f3484d = 64;
                    return;
                case 5:
                    this.f3484d = 80;
                    return;
                case 6:
                    this.f3484d = 96;
                    return;
                case 7:
                    this.f3484d = 112;
                    return;
                case 8:
                    this.f3484d = 128;
                    return;
                case 9:
                    this.f3484d = 160;
                    return;
                case 10:
                    this.f3484d = 192;
                    return;
                case 11:
                    this.f3484d = 224;
                    return;
                case 12:
                    this.f3484d = 256;
                    return;
                case 13:
                    this.f3484d = 320;
                    return;
                case 14:
                    this.f3484d = 384;
                    return;
            }
        } else if (i4 == 3) {
            switch (i) {
                case 1:
                    this.f3484d = 32;
                    return;
                case 2:
                    i2 = 40;
                    break;
                case 5:
                    this.f3484d = 64;
                    return;
                case 6:
                    this.f3484d = 80;
                    return;
                case 7:
                    this.f3484d = 96;
                    return;
                case 8:
                    this.f3484d = 112;
                    return;
                case 9:
                    this.f3484d = 128;
                    return;
                case 10:
                    this.f3484d = 160;
                    return;
                case 11:
                    this.f3484d = 192;
                    return;
                case 12:
                    this.f3484d = 224;
                    return;
                case 13:
                    this.f3484d = 256;
                    return;
                case 14:
                    this.f3484d = 320;
                    return;
            }
        }
        throw new xg0("Invalid bitrate in frame header");
        this.f3484d = i2;
    }

    /* renamed from: m */
    public final void m27152m(int i) {
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
        this.f3488h = str;
    }

    /* renamed from: n */
    public final void m27151n(int i) {
        this.f3490j = i == 1;
    }

    /* renamed from: o */
    public final void m27150o(int i) {
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
        this.f3492l = str;
    }

    /* renamed from: p */
    public final void m27149p(long j) {
        if (m27164a(j, 4292870144L) != 2047) {
            throw new xg0("Frame sync missing");
        }
        m27141x(m27164a(j, 1572864L));
        m27148q(m27164a(j, 393216L));
        m27143v(m27164a(j, 65536L));
        m27153l(m27164a(j, 61440L));
        m27142w(m27164a(j, 3072L));
        m27145t(m27164a(j, 512L));
        m27144u(m27164a(j, 256L));
        m27152m(m27164a(j, 192L));
        m27147r(m27164a(j, 48L));
        m27151n(m27164a(j, 8L));
        m27146s(m27164a(j, 4L));
        m27150o(m27164a(j, 3L));
    }

    /* renamed from: q */
    public final void m27148q(int i) {
        if (i == 1) {
            this.f3482b = 3;
        } else if (i == 2) {
            this.f3482b = 2;
        } else if (i != 3) {
            throw new xg0("Invalid mpeg layer description in frame header");
        } else {
            this.f3482b = 1;
        }
    }

    /* renamed from: r */
    public final void m27147r(int i) {
        String str;
        if (!"Joint stereo".equals(this.f3488h)) {
            this.f3489i = "n/a";
            return;
        }
        int i2 = this.f3482b;
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
            this.f3489i = str;
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
            this.f3489i = str;
            return;
        }
        throw new xg0("Invalid mode extension in frame header");
    }

    /* renamed from: s */
    public final void m27146s(int i) {
        this.f3491k = i == 1;
    }

    /* renamed from: t */
    public final void m27145t(int i) {
        this.f3486f = i == 1;
    }

    /* renamed from: u */
    public final void m27144u(int i) {
        this.f3487g = i == 1;
    }

    /* renamed from: v */
    public final void m27143v(int i) {
        this.f3483c = i == 1;
    }

    /* renamed from: w */
    public final void m27142w(int i) {
        int i2;
        if ("1.0".equals(this.f3481a)) {
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
            this.f3485e = i2;
        } else if ("2.0".equals(this.f3481a)) {
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
            this.f3485e = i2;
        } else {
            if ("2.5".equals(this.f3481a)) {
                if (i == 0) {
                    i2 = 11025;
                } else if (i == 1) {
                    i2 = 12000;
                } else if (i == 2) {
                    i2 = 8000;
                }
                this.f3485e = i2;
            }
            throw new xg0("Invalid sample rate in frame header");
        }
    }

    /* renamed from: x */
    public final void m27141x(int i) {
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
        this.f3481a = str;
    }
}
