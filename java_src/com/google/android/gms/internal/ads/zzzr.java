package com.google.android.gms.internal.ads;

import android.os.RemoteException;
/* loaded from: classes2.dex */
final class zzzr implements zzatd<zzate, Object> {
    private final /* synthetic */ zzxt zzbvk;
    private final /* synthetic */ zzzh zzbvl;
    private final /* synthetic */ zzzp zzbvm;

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzzr(zzzp zzzpVar, zzzh zzzhVar, zzxt zzxtVar) {
        this.zzbvm = zzzpVar;
        this.zzbvl = zzzhVar;
        this.zzbvk = zzxtVar;
    }

    @Override // com.google.android.gms.internal.ads.zzatd
    public final void zzau(String str) {
        try {
            this.zzbvl.zzbr(str);
        } catch (RemoteException e) {
            zzane.zzb("", e);
        }
    }
}
