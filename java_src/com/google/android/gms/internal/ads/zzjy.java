package com.google.android.gms.internal.ads;

import android.os.RemoteException;
import android.view.View;
import com.google.android.gms.dynamic.ObjectWrapper;
import com.google.android.gms.internal.ads.zzjr;
import java.util.HashMap;
/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes2.dex */
public final class zzjy extends zzjr.zza<zzqf> {
    private final /* synthetic */ zzjr zzart;
    private final /* synthetic */ View zzarw;
    private final /* synthetic */ HashMap zzarx;
    private final /* synthetic */ HashMap zzary;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zzjy(zzjr zzjrVar, View view, HashMap hashMap, HashMap hashMap2) {
        super();
        this.zzart = zzjrVar;
        this.zzarw = view;
        this.zzarx = hashMap;
        this.zzary = hashMap2;
    }

    @Override // com.google.android.gms.internal.ads.zzjr.zza
    public final /* synthetic */ zzqf zza(zzld zzldVar) throws RemoteException {
        return zzldVar.createNativeAdViewHolderDelegate(ObjectWrapper.wrap(this.zzarw), ObjectWrapper.wrap(this.zzarx), ObjectWrapper.wrap(this.zzary));
    }

    @Override // com.google.android.gms.internal.ads.zzjr.zza
    public final /* synthetic */ zzqf zzib() throws RemoteException {
        zzrw zzrwVar;
        zzrwVar = this.zzart.zzarp;
        zzqf zzb = zzrwVar.zzb(this.zzarw, this.zzarx, this.zzary);
        if (zzb != null) {
            return zzb;
        }
        zzjr zzjrVar = this.zzart;
        zzjr.zza(this.zzarw.getContext(), "native_ad_view_holder_delegate");
        return new zzmn();
    }
}
