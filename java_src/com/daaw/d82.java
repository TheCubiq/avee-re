package com.daaw;

import android.content.Context;
import android.os.RemoteException;
import com.daaw.bz3;
import com.google.android.gms.ads.internal.client.zzaw;
import com.google.android.gms.ads.internal.client.zzce;
/* loaded from: classes.dex */
public final class d82 extends ku2 {

    /* renamed from: b */
    public final /* synthetic */ Context f6604b;

    /* renamed from: c */
    public final /* synthetic */ an3 f6605c;

    public d82(zzaw zzawVar, Context context, an3 an3Var) {
        this.f6604b = context;
        this.f6605c = an3Var;
    }

    @Override // com.daaw.ku2
    /* renamed from: a */
    public final /* bridge */ /* synthetic */ Object mo3435a() {
        return null;
    }

    @Override // com.daaw.ku2
    /* renamed from: b */
    public final /* bridge */ /* synthetic */ Object mo3434b(zzce zzceVar) {
        return zzceVar.zzp(nt0.m14830g3(this.f6604b), this.f6605c, 224400000);
    }

    @Override // com.daaw.ku2
    /* renamed from: c */
    public final /* bridge */ /* synthetic */ Object mo3433c() {
        try {
            return ((cz3) o04.m14656b(this.f6604b, "com.google.android.gms.ads.DynamiteSignalGeneratorCreatorImpl", new m04() { // from class: com.google.android.gms.ads.internal.client.zzad
                /* JADX WARN: Multi-variable type inference failed */
                @Override // com.daaw.m04
                public final Object zza(Object obj) {
                    return bz3.m25715g3(obj);
                }
            })).mo24857J(nt0.m14830g3(this.f6604b), this.f6605c, 224400000);
        } catch (RemoteException | n04 | NullPointerException unused) {
            return null;
        }
    }
}
