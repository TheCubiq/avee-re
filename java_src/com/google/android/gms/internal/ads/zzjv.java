package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.RemoteException;
import com.google.android.gms.common.GooglePlayServicesUtilLight;
import com.google.android.gms.dynamic.ObjectWrapper;
import com.google.android.gms.internal.ads.zzjr;
/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes2.dex */
public final class zzjv extends zzjr.zza<zzkn> {
    private final /* synthetic */ Context val$context;
    private final /* synthetic */ String zzarr;
    private final /* synthetic */ zzxn zzars;
    private final /* synthetic */ zzjr zzart;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zzjv(zzjr zzjrVar, Context context, String str, zzxn zzxnVar) {
        super();
        this.zzart = zzjrVar;
        this.val$context = context;
        this.zzarr = str;
        this.zzars = zzxnVar;
    }

    @Override // com.google.android.gms.internal.ads.zzjr.zza
    public final /* synthetic */ zzkn zza(zzld zzldVar) throws RemoteException {
        return zzldVar.createAdLoaderBuilder(ObjectWrapper.wrap(this.val$context), this.zzarr, this.zzars, GooglePlayServicesUtilLight.GOOGLE_PLAY_SERVICES_VERSION_CODE);
    }

    @Override // com.google.android.gms.internal.ads.zzjr.zza
    public final /* synthetic */ zzkn zzib() throws RemoteException {
        zzjg zzjgVar;
        zzjgVar = this.zzart.zzark;
        zzkn zza = zzjgVar.zza(this.val$context, this.zzarr, this.zzars);
        if (zza != null) {
            return zza;
        }
        zzjr zzjrVar = this.zzart;
        zzjr.zza(this.val$context, "native_ad");
        return new zzmf();
    }
}
