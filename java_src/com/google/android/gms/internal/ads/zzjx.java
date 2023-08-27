package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.RemoteException;
import android.widget.FrameLayout;
import com.google.android.gms.dynamic.ObjectWrapper;
import com.google.android.gms.internal.ads.zzjr;
/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes2.dex */
public final class zzjx extends zzjr.zza<zzqa> {
    private final /* synthetic */ Context val$context;
    private final /* synthetic */ zzjr zzart;
    private final /* synthetic */ FrameLayout zzaru;
    private final /* synthetic */ FrameLayout zzarv;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zzjx(zzjr zzjrVar, FrameLayout frameLayout, FrameLayout frameLayout2, Context context) {
        super();
        this.zzart = zzjrVar;
        this.zzaru = frameLayout;
        this.zzarv = frameLayout2;
        this.val$context = context;
    }

    @Override // com.google.android.gms.internal.ads.zzjr.zza
    public final /* synthetic */ zzqa zza(zzld zzldVar) throws RemoteException {
        return zzldVar.createNativeAdViewDelegate(ObjectWrapper.wrap(this.zzaru), ObjectWrapper.wrap(this.zzarv));
    }

    @Override // com.google.android.gms.internal.ads.zzjr.zza
    public final /* synthetic */ zzqa zzib() throws RemoteException {
        zzrv zzrvVar;
        zzrvVar = this.zzart.zzarm;
        zzqa zzb = zzrvVar.zzb(this.val$context, this.zzaru, this.zzarv);
        if (zzb != null) {
            return zzb;
        }
        zzjr zzjrVar = this.zzart;
        zzjr.zza(this.val$context, "native_ad_view_delegate");
        return new zzmm();
    }
}
