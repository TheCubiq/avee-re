package com.google.android.gms.internal.ads;

import android.app.Activity;
import android.os.RemoteException;
import com.google.android.gms.dynamic.ObjectWrapper;
import com.google.android.gms.internal.ads.zzjr;
/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes2.dex */
public final class zzka extends zzjr.zza<zzaap> {
    private final /* synthetic */ Activity val$activity;
    private final /* synthetic */ zzjr zzart;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zzka(zzjr zzjrVar, Activity activity) {
        super();
        this.zzart = zzjrVar;
        this.val$activity = activity;
    }

    @Override // com.google.android.gms.internal.ads.zzjr.zza
    public final /* synthetic */ zzaap zza(zzld zzldVar) throws RemoteException {
        return zzldVar.createAdOverlay(ObjectWrapper.wrap(this.val$activity));
    }

    @Override // com.google.android.gms.internal.ads.zzjr.zza
    public final /* synthetic */ zzaap zzib() throws RemoteException {
        zzaao zzaaoVar;
        zzaaoVar = this.zzart.zzaro;
        zzaap zze = zzaaoVar.zze(this.val$activity);
        if (zze != null) {
            return zze;
        }
        zzjr zzjrVar = this.zzart;
        zzjr.zza(this.val$activity, "ad_overlay");
        return null;
    }
}
