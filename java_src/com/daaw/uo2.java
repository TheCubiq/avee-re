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

    /* renamed from: b */
    public final /* synthetic */ FrameLayout f29379b;

    /* renamed from: c */
    public final /* synthetic */ FrameLayout f29380c;

    /* renamed from: d */
    public final /* synthetic */ Context f29381d;

    /* renamed from: e */
    public final /* synthetic */ zzaw f29382e;

    public uo2(zzaw zzawVar, FrameLayout frameLayout, FrameLayout frameLayout2, Context context) {
        this.f29382e = zzawVar;
        this.f29379b = frameLayout;
        this.f29380c = frameLayout2;
        this.f29381d = context;
    }

    @Override // com.daaw.ku2
    /* renamed from: a */
    public final /* bridge */ /* synthetic */ Object mo3435a() {
        zzaw.m1429i(this.f29381d, "native_ad_view_delegate");
        return new zzez();
    }

    @Override // com.daaw.ku2
    /* renamed from: b */
    public final /* bridge */ /* synthetic */ Object mo3434b(zzce zzceVar) {
        return zzceVar.zzi(nt0.m14830g3(this.f29379b), nt0.m14830g3(this.f29380c));
    }

    @Override // com.daaw.ku2
    /* renamed from: c */
    public final /* bridge */ /* synthetic */ Object mo3433c() {
        gt3 gt3Var;
        af3 af3Var;
        g93.m21879c(this.f29381d);
        if (!((Boolean) zzba.zzc().m23658b(g93.f10550S8)).booleanValue()) {
            af3Var = this.f29382e.f36089d;
            return af3Var.m27492c(this.f29381d, this.f29379b, this.f29380c);
        }
        try {
            return yc3.zzbD(((cd3) o04.m14656b(this.f29381d, "com.google.android.gms.ads.ChimeraNativeAdViewDelegateCreatorImpl", new m04() { // from class: com.google.android.gms.ads.internal.client.zzar
                /* JADX WARN: Multi-variable type inference failed */
                @Override // com.daaw.m04
                public final Object zza(Object obj) {
                    return bd3.m26211g3(obj);
                }
            })).mo25417g1(nt0.m14830g3(this.f29381d), nt0.m14830g3(this.f29379b), nt0.m14830g3(this.f29380c), 224400000));
        } catch (RemoteException | n04 | NullPointerException e) {
            this.f29382e.f36093h = et3.m23193c(this.f29381d);
            gt3Var = this.f29382e.f36093h;
            gt3Var.mo21236a(e, "ClientApiBroker.createNativeAdViewDelegate");
            return null;
        }
    }
}
