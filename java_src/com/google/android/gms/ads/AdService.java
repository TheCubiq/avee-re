package com.google.android.gms.ads;

import android.app.IntentService;
import android.content.Intent;
import android.os.RemoteException;
import com.daaw.k04;
import com.daaw.xm3;
import com.google.android.gms.ads.internal.client.zzay;
/* loaded from: classes.dex */
public class AdService extends IntentService {
    public static final String CLASS_NAME = "com.google.android.gms.ads.AdService";

    public AdService() {
        super("AdService");
    }

    @Override // android.app.IntentService
    public final void onHandleIntent(Intent intent) {
        try {
            zzay.zza().zzm(this, new xm3()).N(intent);
        } catch (RemoteException e) {
            k04.zzg("RemoteException calling handleNotificationIntent: ".concat(e.toString()));
        }
    }
}
