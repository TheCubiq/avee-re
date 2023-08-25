package com.daaw;

import android.content.Context;
import android.os.RemoteException;
import com.daaw.ei3;
import com.google.android.gms.ads.h5.OnH5AdsEventListener;
import com.google.android.gms.ads.internal.client.zzaw;
import com.google.android.gms.ads.internal.client.zzce;
/* loaded from: classes.dex */
public final class xc2 extends ku2 {
    public final /* synthetic */ Context b;
    public final /* synthetic */ an3 c;
    public final /* synthetic */ OnH5AdsEventListener d;

    public xc2(zzaw zzawVar, Context context, an3 an3Var, OnH5AdsEventListener onH5AdsEventListener) {
        this.b = context;
        this.c = an3Var;
        this.d = onH5AdsEventListener;
    }

    @Override // com.daaw.ku2
    public final /* synthetic */ Object a() {
        return new ji3();
    }

    @Override // com.daaw.ku2
    public final /* bridge */ /* synthetic */ Object b(zzce zzceVar) {
        return zzceVar.zzk(nt0.g3(this.b), this.c, 224400000, new th3(this.d));
    }

    @Override // com.daaw.ku2
    public final /* bridge */ /* synthetic */ Object c() {
        try {
            return ((fi3) o04.b(this.b, "com.google.android.gms.ads.DynamiteH5AdsManagerCreatorImpl", new m04() { // from class: com.google.android.gms.ads.internal.client.zzah
                /* JADX WARN: Multi-variable type inference failed */
                @Override // com.daaw.m04
                public final Object zza(Object obj) {
                    return ei3.g3(obj);
                }
            })).O2(nt0.g3(this.b), this.c, 224400000, new th3(this.d));
        } catch (RemoteException | n04 | NullPointerException unused) {
            return null;
        }
    }
}
