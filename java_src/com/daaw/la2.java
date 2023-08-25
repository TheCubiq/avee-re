package com.daaw;

import android.content.Context;
import android.os.RemoteException;
import com.daaw.cr3;
import com.google.android.gms.ads.internal.client.zzaw;
import com.google.android.gms.ads.internal.client.zzce;
/* loaded from: classes.dex */
public final class la2 extends ku2 {

    /* renamed from: b */
    public final /* synthetic */ Context f17176b;

    /* renamed from: c */
    public final /* synthetic */ an3 f17177c;

    public la2(zzaw zzawVar, Context context, an3 an3Var) {
        this.f17176b = context;
        this.f17177c = an3Var;
    }

    @Override // com.daaw.ku2
    /* renamed from: a */
    public final /* bridge */ /* synthetic */ Object mo3435a() {
        return null;
    }

    @Override // com.daaw.ku2
    /* renamed from: b */
    public final /* bridge */ /* synthetic */ Object mo3434b(zzce zzceVar) {
        return zzceVar.zzl(nt0.m14830g3(this.f17176b), this.f17177c, 224400000);
    }

    @Override // com.daaw.ku2
    /* renamed from: c */
    public final /* bridge */ /* synthetic */ Object mo3433c() {
        try {
            return ((dr3) o04.m14656b(this.f17176b, "com.google.android.gms.ads.DynamiteOfflineUtilsCreatorImpl", new m04() { // from class: com.google.android.gms.ads.internal.client.zzaf
                /* JADX WARN: Multi-variable type inference failed */
                @Override // com.daaw.m04
                public final Object zza(Object obj) {
                    return cr3.m25059g3(obj);
                }
            })).mo24059J(nt0.m14830g3(this.f17176b), this.f17177c, 224400000);
        } catch (RemoteException | n04 | NullPointerException unused) {
            return null;
        }
    }
}
