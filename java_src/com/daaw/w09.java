package com.daaw;

import com.google.android.gms.internal.ads.zzbq;
import java.util.Collections;
import java.util.List;
/* loaded from: classes.dex */
public final class w09 {
    public final int a;
    public final int b;
    public final int c;
    public final int d;
    public final int e;
    public final int f;
    public final int g;
    public final int h;
    public final int i;
    public final long j;
    public final v09 k;
    public final zzbq l;

    public w09(int i, int i2, int i3, int i4, int i5, int i6, int i7, long j, v09 v09Var, zzbq zzbqVar) {
        this.a = i;
        this.b = i2;
        this.c = i3;
        this.d = i4;
        this.e = i5;
        this.f = i(i5);
        this.g = i6;
        this.h = i7;
        this.i = h(i7);
        this.j = j;
        this.k = v09Var;
        this.l = zzbqVar;
    }

    public w09(byte[] bArr, int i) {
        cj5 cj5Var = new cj5(bArr, bArr.length);
        cj5Var.h(i * 8);
        this.a = cj5Var.c(16);
        this.b = cj5Var.c(16);
        this.c = cj5Var.c(24);
        this.d = cj5Var.c(24);
        int c = cj5Var.c(20);
        this.e = c;
        this.f = i(c);
        this.g = cj5Var.c(3) + 1;
        int c2 = cj5Var.c(5) + 1;
        this.h = c2;
        this.i = h(c2);
        this.j = it5.i0(cj5Var.c(4), cj5Var.c(32));
        this.k = null;
        this.l = null;
    }

    public static int h(int i) {
        if (i != 8) {
            if (i != 12) {
                if (i != 16) {
                    if (i != 20) {
                        return i != 24 ? -1 : 6;
                    }
                    return 5;
                }
                return 4;
            }
            return 2;
        }
        return 1;
    }

    public static int i(int i) {
        switch (i) {
            case 8000:
                return 4;
            case 16000:
                return 5;
            case 22050:
                return 6;
            case 24000:
                return 7;
            case 32000:
                return 8;
            case 44100:
                return 9;
            case 48000:
                return 10;
            case 88200:
                return 1;
            case 96000:
                return 11;
            case 176400:
                return 2;
            case 192000:
                return 3;
            default:
                return -1;
        }
    }

    public final long a() {
        long j = this.j;
        if (j == 0) {
            return -9223372036854775807L;
        }
        return (j * 1000000) / this.e;
    }

    public final long b(long j) {
        return it5.b0((j * this.e) / 1000000, 0L, this.j - 1);
    }

    public final f92 c(byte[] bArr, zzbq zzbqVar) {
        bArr[4] = Byte.MIN_VALUE;
        int i = this.d;
        if (i <= 0) {
            i = -1;
        }
        zzbq d = d(zzbqVar);
        b72 b72Var = new b72();
        b72Var.s("audio/flac");
        b72Var.l(i);
        b72Var.e0(this.g);
        b72Var.t(this.e);
        b72Var.i(Collections.singletonList(bArr));
        b72Var.m(d);
        return b72Var.y();
    }

    public final zzbq d(zzbq zzbqVar) {
        zzbq zzbqVar2 = this.l;
        return zzbqVar2 == null ? zzbqVar : zzbqVar2.g(zzbqVar);
    }

    public final w09 e(List list) {
        return new w09(this.a, this.b, this.c, this.d, this.e, this.g, this.h, this.j, this.k, d(new zzbq(list)));
    }

    public final w09 f(v09 v09Var) {
        return new w09(this.a, this.b, this.c, this.d, this.e, this.g, this.h, this.j, v09Var, this.l);
    }

    public final w09 g(List list) {
        return new w09(this.a, this.b, this.c, this.d, this.e, this.g, this.h, this.j, this.k, d(s42.b(list)));
    }
}
