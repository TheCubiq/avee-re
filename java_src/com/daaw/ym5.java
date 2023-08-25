package com.daaw;

import android.os.ParcelFileDescriptor;
import android.os.RemoteException;
import com.google.android.gms.ads.internal.util.zzaz;
import com.google.android.gms.ads.internal.util.zze;
/* loaded from: classes.dex */
public final class ym5 implements o67 {

    /* renamed from: a */
    public final /* synthetic */ hu3 f33820a;

    public ym5(cn5 cn5Var, hu3 hu3Var) {
        this.f33820a = hu3Var;
    }

    @Override // com.daaw.o67
    /* renamed from: a */
    public final /* bridge */ /* synthetic */ void mo2151a(Object obj) {
        try {
            this.f33820a.mo6046y((ParcelFileDescriptor) obj);
        } catch (RemoteException e) {
            zze.zzb("Service can't call client", e);
        }
    }

    @Override // com.daaw.o67
    /* renamed from: b */
    public final void mo2150b(Throwable th) {
        try {
            this.f33820a.mo6047K(zzaz.zzb(th));
        } catch (RemoteException e) {
            zze.zzb("Service can't call client", e);
        }
    }
}
