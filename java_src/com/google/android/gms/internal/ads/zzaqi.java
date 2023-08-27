package com.google.android.gms.internal.ads;

import androidx.core.app.NotificationCompat;
import java.util.HashMap;
/* loaded from: classes2.dex */
final class zzaqi implements Runnable {
    private final /* synthetic */ String zzcce;
    private final /* synthetic */ String zzdba;
    private final /* synthetic */ int zzdbb;
    private final /* synthetic */ int zzdbc;
    private final /* synthetic */ boolean zzdbd = false;
    private final /* synthetic */ zzaqh zzdbe;

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzaqi(zzaqh zzaqhVar, String str, String str2, int i, int i2, boolean z) {
        this.zzdbe = zzaqhVar;
        this.zzcce = str;
        this.zzdba = str2;
        this.zzdbb = i;
        this.zzdbc = i2;
    }

    @Override // java.lang.Runnable
    public final void run() {
        HashMap hashMap = new HashMap();
        hashMap.put(NotificationCompat.CATEGORY_EVENT, "precacheProgress");
        hashMap.put("src", this.zzcce);
        hashMap.put("cachedSrc", this.zzdba);
        hashMap.put("bytesLoaded", Integer.toString(this.zzdbb));
        hashMap.put("totalBytes", Integer.toString(this.zzdbc));
        hashMap.put("cacheReady", this.zzdbd ? "1" : "0");
        this.zzdbe.zza("onPrecacheEvent", hashMap);
    }
}
