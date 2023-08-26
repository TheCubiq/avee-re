package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.RemoteException;
import com.google.android.gms.common.GooglePlayServicesUtilLight;
import com.google.android.gms.dynamic.ObjectWrapper;
import com.google.android.gms.internal.ads.zzjr;
import com.google.firebase.analytics.FirebaseAnalytics;
/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes2.dex */
public final class zzjt extends zzjr.zza<zzks> {
    private final /* synthetic */ Context val$context;
    private final /* synthetic */ zzjn zzarq;
    private final /* synthetic */ String zzarr;
    private final /* synthetic */ zzjr zzart;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zzjt(zzjr zzjrVar, Context context, zzjn zzjnVar, String str) {
        super();
        this.zzart = zzjrVar;
        this.val$context = context;
        this.zzarq = zzjnVar;
        this.zzarr = str;
    }

    @Override // com.google.android.gms.internal.ads.zzjr.zza
    public final /* synthetic */ zzks zza(zzld zzldVar) throws RemoteException {
        return zzldVar.createSearchAdManager(ObjectWrapper.wrap(this.val$context), this.zzarq, this.zzarr, GooglePlayServicesUtilLight.GOOGLE_PLAY_SERVICES_VERSION_CODE);
    }

    @Override // com.google.android.gms.internal.ads.zzjr.zza
    public final /* synthetic */ zzks zzib() throws RemoteException {
        zzjh zzjhVar;
        zzjhVar = this.zzart.zzarj;
        zzks zza = zzjhVar.zza(this.val$context, this.zzarq, this.zzarr, null, 3);
        if (zza != null) {
            return zza;
        }
        zzjr zzjrVar = this.zzart;
        zzjr.zza(this.val$context, FirebaseAnalytics.Event.SEARCH);
        return new zzmj();
    }
}
