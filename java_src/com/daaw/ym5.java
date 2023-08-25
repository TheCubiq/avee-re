package com.daaw;

import android.os.ParcelFileDescriptor;
import android.os.RemoteException;
import com.google.android.gms.ads.internal.util.zzaz;
import com.google.android.gms.ads.internal.util.zze;
/* loaded from: classes.dex */
public final class ym5 implements o67 {
    public final /* synthetic */ hu3 a;

    public ym5(cn5 cn5Var, hu3 hu3Var) {
        this.a = hu3Var;
    }

    @Override // com.daaw.o67
    public final /* bridge */ /* synthetic */ void a(Object obj) {
        try {
            this.a.y((ParcelFileDescriptor) obj);
        } catch (RemoteException e) {
            zze.zzb("Service can't call client", e);
        }
    }

    @Override // com.daaw.o67
    public final void b(Throwable th) {
        try {
            this.a.K(zzaz.zzb(th));
        } catch (RemoteException e) {
            zze.zzb("Service can't call client", e);
        }
    }
}
