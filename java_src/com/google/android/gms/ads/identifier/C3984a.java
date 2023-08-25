package com.google.android.gms.ads.identifier;

import android.net.Uri;
import java.util.Map;
/* renamed from: com.google.android.gms.ads.identifier.a */
/* loaded from: classes.dex */
public final class C3984a extends Thread {

    /* renamed from: p */
    public final /* synthetic */ Map f36084p;

    public C3984a(AdvertisingIdClient advertisingIdClient, Map map) {
        this.f36084p = map;
    }

    @Override // java.lang.Thread, java.lang.Runnable
    public final void run() {
        Map map = this.f36084p;
        Uri.Builder buildUpon = Uri.parse("https://pagead2.googlesyndication.com/pagead/gen_204?id=gmob-apps").buildUpon();
        for (String str : map.keySet()) {
            buildUpon.appendQueryParameter(str, (String) map.get(str));
        }
        zzc.zza(buildUpon.build().toString());
    }
}
