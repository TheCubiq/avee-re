package com.daaw;
/* loaded from: classes.dex */
public final class y32 {

    /* renamed from: a */
    public int f33311a;

    /* renamed from: b */
    public String f33312b;

    /* renamed from: c */
    public int f33313c;

    /* renamed from: d */
    public int f33314d;

    /* renamed from: e */
    public int f33315e;

    /* renamed from: f */
    public int f33316f;

    /* renamed from: g */
    public int f33317g;

    /* JADX WARN: Removed duplicated region for block: B:26:0x0053  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x0071  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x00a8  */
    /* renamed from: a */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean m4159a(int i) {
        boolean m2852m;
        int i2;
        int i3;
        int i4;
        int i5;
        String[] strArr;
        int[] iArr;
        int m2853l;
        int[] iArr2;
        int[] iArr3;
        int i6;
        int i7;
        int[] iArr4;
        int[] iArr5;
        int i8;
        int[] iArr6;
        m2852m = z32.m2852m(i);
        if (!m2852m || (i2 = (i >>> 19) & 3) == 1 || (i3 = (i >>> 17) & 3) == 0 || (i4 = (i >>> 12) & 15) == 0 || i4 == 15 || (i5 = (i >>> 10) & 3) == 3) {
            return false;
        }
        this.f33311a = i2;
        strArr = z32.f34416a;
        this.f33312b = strArr[3 - i3];
        iArr = z32.f34417b;
        int i9 = iArr[i5];
        this.f33314d = i9;
        if (i2 != 2) {
            if (i2 == 0) {
                i9 /= 4;
            }
            int i10 = (i >>> 9) & 1;
            m2853l = z32.m2853l(i2, i3);
            this.f33317g = m2853l;
            if (i3 != 3) {
                if (i2 == 3) {
                    iArr6 = z32.f34418c;
                    i8 = iArr6[i4 - 1];
                } else {
                    iArr5 = z32.f34419d;
                    i8 = iArr5[i4 - 1];
                }
                this.f33316f = i8;
                i7 = (((i8 * 12) / i9) + i10) * 4;
            } else {
                if (i2 != 3) {
                    iArr2 = z32.f34422g;
                    int i11 = iArr2[i4 - 1];
                    this.f33316f = i11;
                    this.f33313c = (((i3 == 1 ? 72 : 144) * i11) / i9) + i10;
                    this.f33315e = ((i >> 6) & 3) == 3 ? 1 : 2;
                    return true;
                }
                if (i3 == 2) {
                    iArr4 = z32.f34420e;
                    i6 = iArr4[i4 - 1];
                } else {
                    iArr3 = z32.f34421f;
                    i6 = iArr3[i4 - 1];
                }
                this.f33316f = i6;
                i7 = ((i6 * 144) / i9) + i10;
            }
            this.f33313c = i7;
            this.f33315e = ((i >> 6) & 3) == 3 ? 1 : 2;
            return true;
        }
        i9 /= 2;
        this.f33314d = i9;
        int i102 = (i >>> 9) & 1;
        m2853l = z32.m2853l(i2, i3);
        this.f33317g = m2853l;
        if (i3 != 3) {
        }
        this.f33313c = i7;
        this.f33315e = ((i >> 6) & 3) == 3 ? 1 : 2;
        return true;
    }
}
