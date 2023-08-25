package com.daaw;

import android.os.RemoteException;
import android.view.View;
import com.daaw.hd3;
import com.google.android.gms.ads.internal.client.zzaw;
import com.google.android.gms.ads.internal.client.zzba;
import com.google.android.gms.ads.internal.client.zzce;
import com.google.android.gms.ads.internal.client.zzfa;
import java.util.HashMap;
/* loaded from: classes.dex */
public final class yq2 extends ku2 {

    /* renamed from: b */
    public final /* synthetic */ View f33956b;

    /* renamed from: c */
    public final /* synthetic */ HashMap f33957c;

    /* renamed from: d */
    public final /* synthetic */ HashMap f33958d;

    /* renamed from: e */
    public final /* synthetic */ zzaw f33959e;

    public yq2(zzaw zzawVar, View view, HashMap hashMap, HashMap hashMap2) {
        this.f33959e = zzawVar;
        this.f33956b = view;
        this.f33957c = hashMap;
        this.f33958d = hashMap2;
    }

    @Override // com.daaw.ku2
    /* renamed from: a */
    public final /* bridge */ /* synthetic */ Object mo3435a() {
        zzaw.m1429i(this.f33956b.getContext(), "native_ad_view_holder_delegate");
        return new zzfa();
    }

    @Override // com.daaw.ku2
    /* renamed from: b */
    public final /* bridge */ /* synthetic */ Object mo3434b(zzce zzceVar) {
        return zzceVar.zzj(nt0.m14830g3(this.f33956b), nt0.m14830g3(this.f33957c), nt0.m14830g3(this.f33958d));
    }

    @Override // com.daaw.ku2
    /* renamed from: c */
    public final /* bridge */ /* synthetic */ Object mo3433c() {
        gt3 gt3Var;
        bf3 bf3Var;
        g93.m21879c(this.f33956b.getContext());
        if (!((Boolean) zzba.zzc().m23658b(g93.f10550S8)).booleanValue()) {
            bf3Var = this.f33959e.f36092g;
            return bf3Var.m26189c(this.f33956b, this.f33957c, this.f33958d);
        }
        try {
            return ed3.zze(((InterfaceC1684id3) o04.m14656b(this.f33956b.getContext(), "com.google.android.gms.ads.ChimeraNativeAdViewHolderDelegateCreatorImpl", new m04() { // from class: com.google.android.gms.ads.internal.client.zzat
                /* JADX WARN: Multi-variable type inference failed */
                @Override // com.daaw.m04
                public final Object zza(Object obj) {
                    return hd3.m20838g3(obj);
                }
            })).mo19913d0(nt0.m14830g3(this.f33956b), nt0.m14830g3(this.f33957c), nt0.m14830g3(this.f33958d)));
        } catch (RemoteException | n04 | NullPointerException e) {
            this.f33959e.f36093h = et3.m23193c(this.f33956b.getContext());
            gt3Var = this.f33959e.f36093h;
            gt3Var.mo21236a(e, "ClientApiBroker.createNativeAdViewHolderDelegate");
            return null;
        }
    }
}
