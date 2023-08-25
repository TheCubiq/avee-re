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
    public final /* synthetic */ View b;
    public final /* synthetic */ HashMap c;
    public final /* synthetic */ HashMap d;
    public final /* synthetic */ zzaw e;

    public yq2(zzaw zzawVar, View view, HashMap hashMap, HashMap hashMap2) {
        this.e = zzawVar;
        this.b = view;
        this.c = hashMap;
        this.d = hashMap2;
    }

    @Override // com.daaw.ku2
    public final /* bridge */ /* synthetic */ Object a() {
        zzaw.i(this.b.getContext(), "native_ad_view_holder_delegate");
        return new zzfa();
    }

    @Override // com.daaw.ku2
    public final /* bridge */ /* synthetic */ Object b(zzce zzceVar) {
        return zzceVar.zzj(nt0.g3(this.b), nt0.g3(this.c), nt0.g3(this.d));
    }

    @Override // com.daaw.ku2
    public final /* bridge */ /* synthetic */ Object c() {
        gt3 gt3Var;
        bf3 bf3Var;
        g93.c(this.b.getContext());
        if (!((Boolean) zzba.zzc().b(g93.S8)).booleanValue()) {
            bf3Var = this.e.g;
            return bf3Var.c(this.b, this.c, this.d);
        }
        try {
            return ed3.zze(((id3) o04.b(this.b.getContext(), "com.google.android.gms.ads.ChimeraNativeAdViewHolderDelegateCreatorImpl", new m04() { // from class: com.google.android.gms.ads.internal.client.zzat
                /* JADX WARN: Multi-variable type inference failed */
                @Override // com.daaw.m04
                public final Object zza(Object obj) {
                    return hd3.g3(obj);
                }
            })).d0(nt0.g3(this.b), nt0.g3(this.c), nt0.g3(this.d)));
        } catch (RemoteException | n04 | NullPointerException e) {
            this.e.h = et3.c(this.b.getContext());
            gt3Var = this.e.h;
            gt3Var.a(e, "ClientApiBroker.createNativeAdViewHolderDelegate");
            return null;
        }
    }
}
