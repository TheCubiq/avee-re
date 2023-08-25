package com.daaw;

import com.google.android.gms.ads.internal.client.zzq;
/* loaded from: classes.dex */
public final class v84 {

    /* renamed from: a */
    public final int f30026a;

    /* renamed from: b */
    public final int f30027b;

    /* renamed from: c */
    public final int f30028c;

    public v84(int i, int i2, int i3) {
        this.f30026a = i;
        this.f30028c = i2;
        this.f30027b = i3;
    }

    /* renamed from: a */
    public static v84 m7337a() {
        return new v84(0, 0, 0);
    }

    /* renamed from: b */
    public static v84 m7336b(int i, int i2) {
        return new v84(1, i, i2);
    }

    /* renamed from: c */
    public static v84 m7335c(zzq zzqVar) {
        return zzqVar.zzd ? new v84(3, 0, 0) : zzqVar.zzi ? new v84(2, 0, 0) : zzqVar.zzh ? m7337a() : m7336b(zzqVar.zzf, zzqVar.zzc);
    }

    /* renamed from: d */
    public static v84 m7334d() {
        return new v84(5, 0, 0);
    }

    /* renamed from: e */
    public static v84 m7333e() {
        return new v84(4, 0, 0);
    }

    /* renamed from: f */
    public final boolean m7332f() {
        return this.f30026a == 0;
    }

    /* renamed from: g */
    public final boolean m7331g() {
        return this.f30026a == 2;
    }

    /* renamed from: h */
    public final boolean m7330h() {
        return this.f30026a == 5;
    }

    /* renamed from: i */
    public final boolean m7329i() {
        return this.f30026a == 3;
    }

    /* renamed from: j */
    public final boolean m7328j() {
        return this.f30026a == 4;
    }
}
