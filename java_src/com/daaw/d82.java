package com.daaw;

import android.content.Context;
import android.os.RemoteException;
import com.daaw.bz3;
import com.google.android.gms.ads.internal.client.zzaw;
import com.google.android.gms.ads.internal.client.zzce;
/* loaded from: classes.dex */
public final class d82 extends ku2 {
    public final /* synthetic */ Context b;
    public final /* synthetic */ an3 c;

    public d82(zzaw zzawVar, Context context, an3 an3Var) {
        this.b = context;
        this.c = an3Var;
    }

    @Override // com.daaw.ku2
    public final /* bridge */ /* synthetic */ Object a() {
        return null;
    }

    @Override // com.daaw.ku2
    public final /* bridge */ /* synthetic */ Object b(zzce zzceVar) {
        return zzceVar.zzp(nt0.g3(this.b), this.c, 224400000);
    }

    @Override // com.daaw.ku2
    public final /* bridge */ /* synthetic */ Object c() {
        try {
            return ((cz3) o04.b(this.b, "com.google.android.gms.ads.DynamiteSignalGeneratorCreatorImpl", new m04() { // from class: com.google.android.gms.ads.internal.client.zzad
                /* JADX WARN: Multi-variable type inference failed */
                @Override // com.daaw.m04
                public final Object zza(Object obj) {
                    return bz3.g3(obj);
                }
            })).J(nt0.g3(this.b), this.c, 224400000);
        } catch (RemoteException | n04 | NullPointerException unused) {
            return null;
        }
    }
}
