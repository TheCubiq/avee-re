package com.daaw;
/* loaded from: classes.dex */
public final class yq0 {

    /* renamed from: h */
    public static final String[] f33938h = {"audio/mpeg-L1", "audio/mpeg-L2", "audio/mpeg"};

    /* renamed from: i */
    public static final int[] f33939i = {44100, 48000, 32000};

    /* renamed from: j */
    public static final int[] f33940j = {32, 64, 96, 128, 160, 192, 224, 256, 288, 320, 352, 384, 416, 448};

    /* renamed from: k */
    public static final int[] f33941k = {32, 48, 56, 64, 80, 96, 112, 128, 144, 160, 176, 192, 224, 256};

    /* renamed from: l */
    public static final int[] f33942l = {32, 48, 56, 64, 80, 96, 112, 128, 160, 192, 224, 256, 320, 384};

    /* renamed from: m */
    public static final int[] f33943m = {32, 40, 48, 56, 64, 80, 96, 112, 128, 160, 192, 224, 256, 320};

    /* renamed from: n */
    public static final int[] f33944n = {8, 16, 24, 32, 40, 48, 56, 64, 80, 96, 112, 128, 144, 160};

    /* renamed from: a */
    public int f33945a;

    /* renamed from: b */
    public String f33946b;

    /* renamed from: c */
    public int f33947c;

    /* renamed from: d */
    public int f33948d;

    /* renamed from: e */
    public int f33949e;

    /* renamed from: f */
    public int f33950f;

    /* renamed from: g */
    public int f33951g;

    /* renamed from: a */
    public static int m3450a(int i) {
        int i2;
        int i3;
        int i4;
        int i5;
        if ((i & (-2097152)) != -2097152 || (i2 = (i >>> 19) & 3) == 1 || (i3 = (i >>> 17) & 3) == 0 || (i4 = (i >>> 12) & 15) == 0 || i4 == 15 || (i5 = (i >>> 10) & 3) == 3) {
            return -1;
        }
        int i6 = f33939i[i5];
        if (i2 == 2) {
            i6 /= 2;
        } else if (i2 == 0) {
            i6 /= 4;
        }
        int i7 = (i >>> 9) & 1;
        if (i3 == 3) {
            return ((((i2 == 3 ? f33940j[i4 - 1] : f33941k[i4 - 1]) * 12000) / i6) + i7) * 4;
        }
        int i8 = i2 == 3 ? i3 == 2 ? f33942l[i4 - 1] : f33943m[i4 - 1] : f33944n[i4 - 1];
        if (i2 == 3) {
            return ((i8 * 144000) / i6) + i7;
        }
        return (((i3 == 1 ? 72000 : 144000) * i8) / i6) + i7;
    }

    /* renamed from: b */
    public static boolean m3449b(int i, yq0 yq0Var) {
        int i2;
        int i3;
        int i4;
        int i5;
        int i6;
        int i7;
        int i8;
        if ((i & (-2097152)) != -2097152 || (i2 = (i >>> 19) & 3) == 1 || (i3 = (i >>> 17) & 3) == 0 || (i4 = (i >>> 12) & 15) == 0 || i4 == 15 || (i5 = (i >>> 10) & 3) == 3) {
            return false;
        }
        int i9 = f33939i[i5];
        if (i2 == 2) {
            i9 /= 2;
        } else if (i2 == 0) {
            i9 /= 4;
        }
        int i10 = i9;
        int i11 = (i >>> 9) & 1;
        if (i3 == 3) {
            i6 = i2 == 3 ? f33940j[i4 - 1] : f33941k[i4 - 1];
            i7 = (((i6 * 12000) / i10) + i11) * 4;
            i8 = 384;
        } else {
            if (i2 == 3) {
                i6 = i3 == 2 ? f33942l[i4 - 1] : f33943m[i4 - 1];
                i7 = ((144000 * i6) / i10) + i11;
                i8 = 1152;
            } else {
                i6 = f33944n[i4 - 1];
                int i12 = i3 == 1 ? 576 : 1152;
                i7 = (((i3 == 1 ? 72000 : 144000) * i6) / i10) + i11;
                i8 = i12;
            }
        }
        yq0Var.m3448c(i2, f33938h[3 - i3], i7, i10, ((i >> 6) & 3) == 3 ? 1 : 2, i6 * 1000, i8);
        return true;
    }

    /* renamed from: c */
    public final void m3448c(int i, String str, int i2, int i3, int i4, int i5, int i6) {
        this.f33945a = i;
        this.f33946b = str;
        this.f33947c = i2;
        this.f33948d = i3;
        this.f33949e = i4;
        this.f33950f = i5;
        this.f33951g = i6;
    }
}
