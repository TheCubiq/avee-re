package com.daaw;

import android.app.Activity;
import android.os.RemoteException;
import com.google.android.gms.ads.internal.client.zzba;
import com.google.android.gms.ads.internal.client.zzbu;
import com.google.android.gms.ads.internal.client.zzdg;
import com.google.android.gms.ads.internal.client.zzdn;
/* loaded from: classes.dex */
public final class ti4 extends o23 {
    public final si4 p;
    public final zzbu q;
    public final dd6 r;
    public boolean s = false;

    public ti4(si4 si4Var, zzbu zzbuVar, dd6 dd6Var) {
        this.p = si4Var;
        this.q = zzbuVar;
        this.r = dd6Var;
    }

    @Override // com.daaw.p23
    public final void V2(boolean z) {
        this.s = z;
    }

    @Override // com.daaw.p23
    public final void X1(t23 t23Var) {
    }

    @Override // com.daaw.p23
    public final void Y0(zzdg zzdgVar) {
        ry0.e("setOnPaidEventListener must be called on the main UI thread.");
        dd6 dd6Var = this.r;
        if (dd6Var != null) {
            dd6Var.s(zzdgVar);
        }
    }

    @Override // com.daaw.p23
    public final void t1(yd0 yd0Var, w23 w23Var) {
        try {
            this.r.H(w23Var);
            this.p.j((Activity) nt0.M(yd0Var), w23Var, this.s);
        } catch (RemoteException e) {
            k04.zzl("#007 Could not call remote method.", e);
        }
    }

    @Override // com.daaw.p23
    public final zzbu zze() {
        return this.q;
    }

    @Override // com.daaw.p23
    public final zzdn zzf() {
        if (((Boolean) zzba.zzc().b(g93.i6)).booleanValue()) {
            return this.p.c();
        }
        return null;
    }
}
