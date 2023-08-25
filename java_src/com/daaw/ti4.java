package com.daaw;

import android.app.Activity;
import android.os.RemoteException;
import com.google.android.gms.ads.internal.client.zzba;
import com.google.android.gms.ads.internal.client.zzbu;
import com.google.android.gms.ads.internal.client.zzdg;
import com.google.android.gms.ads.internal.client.zzdn;
/* loaded from: classes.dex */
public final class ti4 extends o23 {

    /* renamed from: p */
    public final si4 f27766p;

    /* renamed from: q */
    public final zzbu f27767q;

    /* renamed from: r */
    public final dd6 f27768r;

    /* renamed from: s */
    public boolean f27769s = false;

    public ti4(si4 si4Var, zzbu zzbuVar, dd6 dd6Var) {
        this.f27766p = si4Var;
        this.f27767q = zzbuVar;
        this.f27768r = dd6Var;
    }

    @Override // com.daaw.p23
    /* renamed from: V2 */
    public final void mo7136V2(boolean z) {
        this.f27769s = z;
    }

    @Override // com.daaw.p23
    /* renamed from: X1 */
    public final void mo7135X1(t23 t23Var) {
    }

    @Override // com.daaw.p23
    /* renamed from: Y0 */
    public final void mo7134Y0(zzdg zzdgVar) {
        ry0.m10835e("setOnPaidEventListener must be called on the main UI thread.");
        dd6 dd6Var = this.f27768r;
        if (dd6Var != null) {
            dd6Var.m24517s(zzdgVar);
        }
    }

    @Override // com.daaw.p23
    /* renamed from: t1 */
    public final void mo7133t1(yd0 yd0Var, w23 w23Var) {
        try {
            this.f27768r.m24523H(w23Var);
            this.f27766p.m10329j((Activity) nt0.m14831M(yd0Var), w23Var, this.f27769s);
        } catch (RemoteException e) {
            k04.zzl("#007 Could not call remote method.", e);
        }
    }

    @Override // com.daaw.p23
    public final zzbu zze() {
        return this.f27767q;
    }

    @Override // com.daaw.p23
    public final zzdn zzf() {
        if (((Boolean) zzba.zzc().m23658b(g93.f10716i6)).booleanValue()) {
            return this.f27766p.m2130c();
        }
        return null;
    }
}
