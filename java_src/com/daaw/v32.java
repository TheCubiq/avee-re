package com.daaw;

import android.app.Activity;
import android.os.RemoteException;
import com.daaw.jr3;
import com.google.android.gms.ads.internal.client.zzaw;
import com.google.android.gms.ads.internal.client.zzba;
import com.google.android.gms.ads.internal.client.zzce;
/* loaded from: classes.dex */
public final class v32 extends ku2 {

    /* renamed from: b */
    public final /* synthetic */ Activity f29810b;

    /* renamed from: c */
    public final /* synthetic */ zzaw f29811c;

    public v32(zzaw zzawVar, Activity activity) {
        this.f29811c = zzawVar;
        this.f29810b = activity;
    }

    @Override // com.daaw.ku2
    /* renamed from: a */
    public final /* bridge */ /* synthetic */ Object mo3435a() {
        zzaw.m1429i(this.f29810b, "ad_overlay");
        return null;
    }

    @Override // com.daaw.ku2
    /* renamed from: b */
    public final /* bridge */ /* synthetic */ Object mo3434b(zzce zzceVar) {
        return zzceVar.zzm(nt0.m14830g3(this.f29810b));
    }

    @Override // com.daaw.ku2
    /* renamed from: c */
    public final /* bridge */ /* synthetic */ Object mo3433c() {
        gt3 gt3Var;
        er3 er3Var;
        g93.m21879c(this.f29810b);
        if (!((Boolean) zzba.zzc().m23658b(g93.f10550S8)).booleanValue()) {
            er3Var = this.f29811c.f36091f;
            return er3Var.m23243c(this.f29810b);
        }
        try {
            return gr3.zzF(((kr3) o04.m14656b(this.f29810b, "com.google.android.gms.ads.ChimeraAdOverlayCreatorImpl", new m04() { // from class: com.google.android.gms.ads.internal.client.zzz
                /* JADX WARN: Multi-variable type inference failed */
                @Override // com.daaw.m04
                public final Object zza(Object obj) {
                    return jr3.m18313g3(obj);
                }
            })).zze(nt0.m14830g3(this.f29810b)));
        } catch (RemoteException | n04 | NullPointerException e) {
            this.f29811c.f36093h = et3.m23193c(this.f29810b.getApplicationContext());
            gt3Var = this.f29811c.f36093h;
            gt3Var.mo21236a(e, "ClientApiBroker.createAdOverlay");
            return null;
        }
    }
}
