package com.daaw;

import android.os.ParcelFileDescriptor;
import android.os.RemoteException;
import com.google.android.gms.ads.internal.util.zzaz;
import com.google.android.gms.ads.internal.util.zze;
/* loaded from: classes.dex */
public final class ln5 implements o67 {

    /* renamed from: a */
    public final /* synthetic */ eu3 f17564a;

    public ln5(mn5 mn5Var, eu3 eu3Var) {
        this.f17564a = eu3Var;
    }

    @Override // com.daaw.o67
    /* renamed from: a */
    public final /* bridge */ /* synthetic */ void mo2151a(Object obj) {
        try {
            this.f17564a.mo19640y((ParcelFileDescriptor) obj);
        } catch (RemoteException e) {
            zze.zzb("Ad service can't call client", e);
        }
    }

    @Override // com.daaw.o67
    /* renamed from: b */
    public final void mo2150b(Throwable th) {
        try {
            this.f17564a.mo19641K(zzaz.zzb(th));
        } catch (RemoteException e) {
            zze.zzb("Ad service can't call client", e);
        }
    }
}
