package com.daaw;

import android.content.Context;
import android.os.RemoteException;
import com.daaw.ei3;
import com.google.android.gms.ads.internal.client.zzaw;
import com.google.android.gms.ads.internal.client.zzce;
import com.google.android.gms.ads.p003h5.OnH5AdsEventListener;
/* loaded from: classes.dex */
public final class xc2 extends ku2 {

    /* renamed from: b */
    public final /* synthetic */ Context f32356b;

    /* renamed from: c */
    public final /* synthetic */ an3 f32357c;

    /* renamed from: d */
    public final /* synthetic */ OnH5AdsEventListener f32358d;

    public xc2(zzaw zzawVar, Context context, an3 an3Var, OnH5AdsEventListener onH5AdsEventListener) {
        this.f32356b = context;
        this.f32357c = an3Var;
        this.f32358d = onH5AdsEventListener;
    }

    @Override // com.daaw.ku2
    /* renamed from: a */
    public final /* synthetic */ Object mo3435a() {
        return new ji3();
    }

    @Override // com.daaw.ku2
    /* renamed from: b */
    public final /* bridge */ /* synthetic */ Object mo3434b(zzce zzceVar) {
        return zzceVar.zzk(nt0.m14830g3(this.f32356b), this.f32357c, 224400000, new th3(this.f32358d));
    }

    @Override // com.daaw.ku2
    /* renamed from: c */
    public final /* bridge */ /* synthetic */ Object mo3433c() {
        try {
            return ((fi3) o04.m14656b(this.f32356b, "com.google.android.gms.ads.DynamiteH5AdsManagerCreatorImpl", new m04() { // from class: com.google.android.gms.ads.internal.client.zzah
                /* JADX WARN: Multi-variable type inference failed */
                @Override // com.daaw.m04
                public final Object zza(Object obj) {
                    return ei3.m23465g3(obj);
                }
            })).mo22624O2(nt0.m14830g3(this.f32356b), this.f32357c, 224400000, new th3(this.f32358d));
        } catch (RemoteException | n04 | NullPointerException unused) {
            return null;
        }
    }
}
