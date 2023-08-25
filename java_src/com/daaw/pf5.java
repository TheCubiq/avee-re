package com.daaw;

import android.content.Context;
import android.os.RemoteException;
import com.google.android.gms.ads.internal.client.zzl;
/* loaded from: classes.dex */
public final class pf5 implements ze5 {

    /* renamed from: a */
    public final long f22894a;

    /* renamed from: b */
    public final ef5 f22895b;

    /* renamed from: c */
    public final kh6 f22896c;

    public pf5(long j, Context context, ef5 ef5Var, b94 b94Var, String str) {
        this.f22894a = j;
        this.f22895b = ef5Var;
        mh6 mo26233z = b94Var.mo26233z();
        mo26233z.mo16026a(context);
        mo26233z.zza(str);
        this.f22896c = mo26233z.zzc().zza();
    }

    @Override // com.daaw.ze5
    /* renamed from: a */
    public final void mo2418a(zzl zzlVar) {
        try {
            this.f22896c.zzf(zzlVar, new nf5(this));
        } catch (RemoteException e) {
            k04.zzl("#007 Could not call remote method.", e);
        }
    }

    @Override // com.daaw.ze5
    public final void zza() {
    }

    @Override // com.daaw.ze5
    public final void zzc() {
        try {
            this.f22896c.zzk(new of5(this));
            this.f22896c.zzm(nt0.m14830g3(null));
        } catch (RemoteException e) {
            k04.zzl("#007 Could not call remote method.", e);
        }
    }
}
