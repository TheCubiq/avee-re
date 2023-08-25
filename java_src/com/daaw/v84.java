package com.daaw;

import com.google.android.gms.ads.internal.client.zzq;
/* loaded from: classes.dex */
public final class v84 {
    public final int a;
    public final int b;
    public final int c;

    public v84(int i, int i2, int i3) {
        this.a = i;
        this.c = i2;
        this.b = i3;
    }

    public static v84 a() {
        return new v84(0, 0, 0);
    }

    public static v84 b(int i, int i2) {
        return new v84(1, i, i2);
    }

    public static v84 c(zzq zzqVar) {
        return zzqVar.zzd ? new v84(3, 0, 0) : zzqVar.zzi ? new v84(2, 0, 0) : zzqVar.zzh ? a() : b(zzqVar.zzf, zzqVar.zzc);
    }

    public static v84 d() {
        return new v84(5, 0, 0);
    }

    public static v84 e() {
        return new v84(4, 0, 0);
    }

    public final boolean f() {
        return this.a == 0;
    }

    public final boolean g() {
        return this.a == 2;
    }

    public final boolean h() {
        return this.a == 5;
    }

    public final boolean i() {
        return this.a == 3;
    }

    public final boolean j() {
        return this.a == 4;
    }
}
