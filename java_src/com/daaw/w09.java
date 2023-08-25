package com.daaw;

import com.google.android.gms.internal.ads.zzbq;
import java.util.Collections;
import java.util.List;
/* loaded from: classes.dex */
public final class w09 {

    /* renamed from: a */
    public final int f30772a;

    /* renamed from: b */
    public final int f30773b;

    /* renamed from: c */
    public final int f30774c;

    /* renamed from: d */
    public final int f30775d;

    /* renamed from: e */
    public final int f30776e;

    /* renamed from: f */
    public final int f30777f;

    /* renamed from: g */
    public final int f30778g;

    /* renamed from: h */
    public final int f30779h;

    /* renamed from: i */
    public final int f30780i;

    /* renamed from: j */
    public final long f30781j;

    /* renamed from: k */
    public final v09 f30782k;

    /* renamed from: l */
    public final zzbq f30783l;

    public w09(int i, int i2, int i3, int i4, int i5, int i6, int i7, long j, v09 v09Var, zzbq zzbqVar) {
        this.f30772a = i;
        this.f30773b = i2;
        this.f30774c = i3;
        this.f30775d = i4;
        this.f30776e = i5;
        this.f30777f = m6593i(i5);
        this.f30778g = i6;
        this.f30779h = i7;
        this.f30780i = m6594h(i7);
        this.f30781j = j;
        this.f30782k = v09Var;
        this.f30783l = zzbqVar;
    }

    public w09(byte[] bArr, int i) {
        cj5 cj5Var = new cj5(bArr, bArr.length);
        cj5Var.m25324h(i * 8);
        this.f30772a = cj5Var.m25329c(16);
        this.f30773b = cj5Var.m25329c(16);
        this.f30774c = cj5Var.m25329c(24);
        this.f30775d = cj5Var.m25329c(24);
        int m25329c = cj5Var.m25329c(20);
        this.f30776e = m25329c;
        this.f30777f = m6593i(m25329c);
        this.f30778g = cj5Var.m25329c(3) + 1;
        int m25329c2 = cj5Var.m25329c(5) + 1;
        this.f30779h = m25329c2;
        this.f30780i = m6594h(m25329c2);
        this.f30781j = it5.m19388i0(cj5Var.m25329c(4), cj5Var.m25329c(32));
        this.f30782k = null;
        this.f30783l = null;
    }

    /* renamed from: h */
    public static int m6594h(int i) {
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

    /* renamed from: i */
    public static int m6593i(int i) {
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

    /* renamed from: a */
    public final long m6601a() {
        long j = this.f30781j;
        if (j == 0) {
            return -9223372036854775807L;
        }
        return (j * 1000000) / this.f30776e;
    }

    /* renamed from: b */
    public final long m6600b(long j) {
        return it5.m19402b0((j * this.f30776e) / 1000000, 0L, this.f30781j - 1);
    }

    /* renamed from: c */
    public final f92 m6599c(byte[] bArr, zzbq zzbqVar) {
        bArr[4] = Byte.MIN_VALUE;
        int i = this.f30775d;
        if (i <= 0) {
            i = -1;
        }
        zzbq m6598d = m6598d(zzbqVar);
        b72 b72Var = new b72();
        b72Var.m26372s("audio/flac");
        b72Var.m26379l(i);
        b72Var.m26389e0(this.f30778g);
        b72Var.m26371t(this.f30776e);
        b72Var.m26382i(Collections.singletonList(bArr));
        b72Var.m26378m(m6598d);
        return b72Var.m26366y();
    }

    /* renamed from: d */
    public final zzbq m6598d(zzbq zzbqVar) {
        zzbq zzbqVar2 = this.f30783l;
        return zzbqVar2 == null ? zzbqVar : zzbqVar2.m1100g(zzbqVar);
    }

    /* renamed from: e */
    public final w09 m6597e(List list) {
        return new w09(this.f30772a, this.f30773b, this.f30774c, this.f30775d, this.f30776e, this.f30778g, this.f30779h, this.f30781j, this.f30782k, m6598d(new zzbq(list)));
    }

    /* renamed from: f */
    public final w09 m6596f(v09 v09Var) {
        return new w09(this.f30772a, this.f30773b, this.f30774c, this.f30775d, this.f30776e, this.f30778g, this.f30779h, this.f30781j, v09Var, this.f30783l);
    }

    /* renamed from: g */
    public final w09 m6595g(List list) {
        return new w09(this.f30772a, this.f30773b, this.f30774c, this.f30775d, this.f30776e, this.f30778g, this.f30779h, this.f30781j, this.f30782k, m6598d(s42.m10718b(list)));
    }
}
