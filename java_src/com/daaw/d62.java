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

    /* renamed from: b */
    public final /* synthetic */ Context f6549b;

    /* renamed from: c */
    public final /* synthetic */ an3 f6550c;

    public d62(zzaw zzawVar, Context context, an3 an3Var) {
        this.f6549b = context;
        this.f6550c = an3Var;
    }

    @Override // com.daaw.ku2
    /* renamed from: a */
    public final /* bridge */ /* synthetic */ Object mo3435a() {
        zzaw.m1429i(this.f6549b, "out_of_context_tester");
        return null;
    }

    @Override // com.daaw.ku2
    /* renamed from: b */
    public final /* bridge */ /* synthetic */ Object mo3434b(zzce zzceVar) {
        yd0 m14830g3 = nt0.m14830g3(this.f6549b);
        g93.m21879c(this.f6549b);
        if (((Boolean) zzba.zzc().m23658b(g93.f10850u8)).booleanValue()) {
            return zzceVar.zzh(m14830g3, this.f6550c, 224400000);
        }
        return null;
    }

    @Override // com.daaw.ku2
    /* renamed from: c */
    public final /* bridge */ /* synthetic */ Object mo3433c() {
        yd0 m14830g3 = nt0.m14830g3(this.f6549b);
        g93.m21879c(this.f6549b);
        if (((Boolean) zzba.zzc().m23658b(g93.f10850u8)).booleanValue()) {
            try {
                return ((zzdk) o04.m14656b(this.f6549b, "com.google.android.gms.ads.DynamiteOutOfContextTesterCreatorImpl", new m04() { // from class: com.google.android.gms.ads.internal.client.zzab
                    /* JADX WARN: Multi-variable type inference failed */
                    @Override // com.daaw.m04
                    public final Object zza(Object obj) {
                        if (obj == 0) {
                            return null;
                        }
                        IInterface queryLocalInterface = obj.queryLocalInterface("com.google.android.gms.ads.internal.client.IOutOfContextTesterCreator");
                        return queryLocalInterface instanceof zzdk ? (zzdk) queryLocalInterface : new zzdk(obj);
                    }
                })).zze(m14830g3, this.f6550c, 224400000);
            } catch (RemoteException | n04 | NullPointerException e) {
                et3.m23193c(this.f6549b).mo21236a(e, "ClientApiBroker.getOutOfContextTester");
                return null;
            }
        }
        return null;
    }
}
