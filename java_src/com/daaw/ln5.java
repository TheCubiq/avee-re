package com.daaw;

import android.os.ParcelFileDescriptor;
import android.os.RemoteException;
import com.google.android.gms.ads.internal.util.zzaz;
import com.google.android.gms.ads.internal.util.zze;
/* loaded from: classes.dex */
public final class ln5 implements o67 {
    public final /* synthetic */ eu3 a;

    public ln5(mn5 mn5Var, eu3 eu3Var) {
        this.a = eu3Var;
    }

    @Override // com.daaw.o67
    public final /* bridge */ /* synthetic */ void a(Object obj) {
        try {
            this.a.y((ParcelFileDescriptor) obj);
        } catch (RemoteException e) {
            zze.zzb("Ad service can't call client", e);
        }
    }

    @Override // com.daaw.o67
    public final void b(Throwable th) {
        try {
            this.a.K(zzaz.zzb(th));
        } catch (RemoteException e) {
            zze.zzb("Ad service can't call client", e);
        }
    }
}
