package com.daaw;

import android.os.RemoteException;
import com.google.android.gms.ads.internal.client.zzdd;
/* loaded from: classes.dex */
public final class ih6 extends yr6 {

    /* renamed from: a */
    public final /* synthetic */ zzdd f13643a;

    /* renamed from: b */
    public final /* synthetic */ kh6 f13644b;

    public ih6(kh6 kh6Var, zzdd zzddVar) {
        this.f13644b = kh6Var;
        this.f13643a = zzddVar;
    }

    @Override // com.daaw.yr6
    /* renamed from: k */
    public final void mo3375k() {
        j95 j95Var;
        j95Var = this.f13644b.f16385v;
        if (j95Var != null) {
            try {
                this.f13643a.zze();
            } catch (RemoteException e) {
                k04.zzl("#007 Could not call remote method.", e);
            }
        }
    }
}
