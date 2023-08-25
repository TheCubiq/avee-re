package com.daaw;

import android.content.Context;
import android.os.IInterface;
import android.os.RemoteException;
import com.google.android.gms.ads.internal.client.zzaw;
import com.google.android.gms.ads.internal.client.zzba;
import com.google.android.gms.ads.internal.client.zzce;
import com.google.android.gms.ads.internal.client.zzdk;
/* loaded from: classes.dex */
public final class d62 extends ku2 {
    public final /* synthetic */ Context b;
    public final /* synthetic */ an3 c;

    public d62(zzaw zzawVar, Context context, an3 an3Var) {
        this.b = context;
        this.c = an3Var;
    }

    @Override // com.daaw.ku2
    public final /* bridge */ /* synthetic */ Object a() {
        zzaw.i(this.b, "out_of_context_tester");
        return null;
    }

    @Override // com.daaw.ku2
    public final /* bridge */ /* synthetic */ Object b(zzce zzceVar) {
        yd0 g3 = nt0.g3(this.b);
        g93.c(this.b);
        if (((Boolean) zzba.zzc().b(g93.u8)).booleanValue()) {
            return zzceVar.zzh(g3, this.c, 224400000);
        }
        return null;
    }

    @Override // com.daaw.ku2
    public final /* bridge */ /* synthetic */ Object c() {
        yd0 g3 = nt0.g3(this.b);
        g93.c(this.b);
        if (((Boolean) zzba.zzc().b(g93.u8)).booleanValue()) {
            try {
                return ((zzdk) o04.b(this.b, "com.google.android.gms.ads.DynamiteOutOfContextTesterCreatorImpl", new m04() { // from class: com.google.android.gms.ads.internal.client.zzab
                    /* JADX WARN: Multi-variable type inference failed */
                    @Override // com.daaw.m04
                    public final Object zza(Object obj) {
                        if (obj == 0) {
                            return null;
                        }
                        IInterface queryLocalInterface = obj.queryLocalInterface("com.google.android.gms.ads.internal.client.IOutOfContextTesterCreator");
                        return queryLocalInterface instanceof zzdk ? (zzdk) queryLocalInterface : new zzdk(obj);
                    }
                })).zze(g3, this.c, 224400000);
            } catch (RemoteException | n04 | NullPointerException e) {
                et3.c(this.b).a(e, "ClientApiBroker.getOutOfContextTester");
                return null;
            }
        }
        return null;
    }
}
