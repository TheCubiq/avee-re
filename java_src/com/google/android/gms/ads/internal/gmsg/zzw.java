package com.google.android.gms.ads.internal.gmsg;

import com.google.android.gms.internal.ads.zzakb;
import com.google.android.gms.internal.ads.zzakk;
import com.google.android.gms.internal.ads.zzue;
import java.util.Map;
import org.json.JSONObject;
/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public final class zzw implements Runnable {
    private final /* synthetic */ Map zzbmh;
    final /* synthetic */ zzue zzbmi;
    private final /* synthetic */ HttpClient zzbmj;

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzw(HttpClient httpClient, Map map, zzue zzueVar) {
        this.zzbmj = httpClient;
        this.zzbmh = map;
        this.zzbmi = zzueVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        zzakb.zzck("Received Http request.");
        try {
            JSONObject send = this.zzbmj.send(new JSONObject((String) this.zzbmh.get("http_request")));
            if (send == null) {
                zzakb.e("Response should not be null.");
            } else {
                zzakk.zzcrm.post(new zzx(this, send));
            }
        } catch (Exception e) {
            zzakb.zzb("Error converting request to json.", e);
        }
    }
}
