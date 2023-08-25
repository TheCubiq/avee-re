package com.google.android.gms.ads.identifier;

import android.net.Uri;
import java.util.Map;
/* loaded from: classes.dex */
public final class a extends Thread {
    public final /* synthetic */ Map p;

    public a(AdvertisingIdClient advertisingIdClient, Map map) {
        this.p = map;
    }

    @Override // java.lang.Thread, java.lang.Runnable
    public final void run() {
        Map map = this.p;
        Uri.Builder buildUpon = Uri.parse("https://pagead2.googlesyndication.com/pagead/gen_204?id=gmob-apps").buildUpon();
        for (String str : map.keySet()) {
            buildUpon.appendQueryParameter(str, (String) map.get(str));
        }
        zzc.zza(buildUpon.build().toString());
    }
}
