package com.daaw;

import android.content.Context;
import android.os.RemoteException;
import android.widget.FrameLayout;
import com.daaw.bd3;
import com.google.android.gms.ads.internal.client.zzaw;
import com.google.android.gms.ads.internal.client.zzba;
import com.google.android.gms.ads.internal.client.zzce;
import com.google.android.gms.ads.internal.client.zzez;
/* loaded from: classes.dex */
public final class uo2 extends ku2 {
    public final /* synthetic */ FrameLayout b;
    public final /* synthetic */ FrameLayout c;
    public final /* synthetic */ Context d;
    public final /* synthetic */ zzaw e;

    public uo2(zzaw zzawVar, FrameLayout frameLayout, FrameLayout frameLayout2, Context context) {
        this.e = zzawVar;
        this.b = frameLayout;
        this.c = frameLayout2;
        this.d = context;
    }

    @Override // com.daaw.ku2
    public final /* bridge */ /* synthetic */ Object a() {
        zzaw.i(this.d, "native_ad_view_delegate");
        return new zzez();
    }

    @Override // com.daaw.ku2
    public final /* bridge */ /* synthetic */ Object b(zzce zzceVar) {
        return zzceVar.zzi(nt0.g3(this.b), nt0.g3(this.c));
    }

    @Override // com.daaw.ku2
    public final /* bridge */ /* synthetic */ Object c() {
        gt3 gt3Var;
        af3 af3Var;
        g93.c(this.d);
        if (!((Boolean) zzba.zzc().b(g93.S8)).booleanValue()) {
            af3Var = this.e.d;
            return af3Var.c(this.d, this.b, this.c);
        }
        try {
            return yc3.zzbD(((cd3) o04.b(this.d, "com.google.android.gms.ads.ChimeraNativeAdViewDelegateCreatorImpl", new m04() { // from class: com.google.android.gms.ads.internal.client.zzar
                /* JADX WARN: Multi-variable type inference failed */
                @Override // com.daaw.m04
                public final Object zza(Object obj) {
                    return bd3.g3(obj);
                }
            })).g1(nt0.g3(this.d), nt0.g3(this.b), nt0.g3(this.c), 224400000));
        } catch (RemoteException | n04 | NullPointerException e) {
            this.e.h = et3.c(this.d);
            gt3Var = this.e.h;
            gt3Var.a(e, "ClientApiBroker.createNativeAdViewDelegate");
            return null;
        }
    }
}
