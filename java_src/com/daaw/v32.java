package com.daaw;

import android.app.Activity;
import android.os.RemoteException;
import com.daaw.jr3;
import com.google.android.gms.ads.internal.client.zzaw;
import com.google.android.gms.ads.internal.client.zzba;
import com.google.android.gms.ads.internal.client.zzce;
/* loaded from: classes.dex */
public final class v32 extends ku2 {
    public final /* synthetic */ Activity b;
    public final /* synthetic */ zzaw c;

    public v32(zzaw zzawVar, Activity activity) {
        this.c = zzawVar;
        this.b = activity;
    }

    @Override // com.daaw.ku2
    public final /* bridge */ /* synthetic */ Object a() {
        zzaw.i(this.b, "ad_overlay");
        return null;
    }

    @Override // com.daaw.ku2
    public final /* bridge */ /* synthetic */ Object b(zzce zzceVar) {
        return zzceVar.zzm(nt0.g3(this.b));
    }

    @Override // com.daaw.ku2
    public final /* bridge */ /* synthetic */ Object c() {
        gt3 gt3Var;
        er3 er3Var;
        g93.c(this.b);
        if (!((Boolean) zzba.zzc().b(g93.S8)).booleanValue()) {
            er3Var = this.c.f;
            return er3Var.c(this.b);
        }
        try {
            return gr3.zzF(((kr3) o04.b(this.b, "com.google.android.gms.ads.ChimeraAdOverlayCreatorImpl", new m04() { // from class: com.google.android.gms.ads.internal.client.zzz
                /* JADX WARN: Multi-variable type inference failed */
                @Override // com.daaw.m04
                public final Object zza(Object obj) {
                    return jr3.g3(obj);
                }
            })).zze(nt0.g3(this.b)));
        } catch (RemoteException | n04 | NullPointerException e) {
            this.c.h = et3.c(this.b.getApplicationContext());
            gt3Var = this.c.h;
            gt3Var.a(e, "ClientApiBroker.createAdOverlay");
            return null;
        }
    }
}
