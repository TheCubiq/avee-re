package com.daaw;

import com.google.android.gms.ads.internal.client.zzba;
import com.google.android.gms.ads.internal.client.zze;
import com.google.android.gms.ads.internal.util.zzg;
/* loaded from: classes.dex */
public final class xo5 implements fs4, oq4 {

    /* renamed from: r */
    public static final Object f32856r = new Object();

    /* renamed from: s */
    public static int f32857s;

    /* renamed from: p */
    public final zzg f32858p;

    /* renamed from: q */
    public final hp5 f32859q;

    public xo5(hp5 hp5Var, zzg zzgVar) {
        this.f32859q = hp5Var;
        this.f32858p = zzgVar;
    }

    /* renamed from: a */
    public final void m4875a(boolean z) {
        int i;
        int intValue;
        if (((Boolean) zzba.zzc().m23658b(g93.f10407E5)).booleanValue() && !this.f32858p.zzP()) {
            Object obj = f32856r;
            synchronized (obj) {
                i = f32857s;
                intValue = ((Integer) zzba.zzc().m23658b(g93.f10417F5)).intValue();
            }
            if (i >= intValue) {
                return;
            }
            this.f32859q.m20542e(z);
            synchronized (obj) {
                f32857s++;
            }
        }
    }

    @Override // com.daaw.oq4
    /* renamed from: b */
    public final void mo2194b(zze zzeVar) {
        m4875a(false);
    }

    @Override // com.daaw.fs4
    public final void zzn() {
        m4875a(true);
    }
}
