package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.Build;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.concurrent.Future;
@zzadh
/* loaded from: classes2.dex */
public final class zznm {
    private Context mContext;
    private String zzaej;
    private String zzbfx = (String) zzkb.zzik().zzd(zznk.zzawi);
    private Map<String, String> zzbfy;

    public zznm(Context context, String str) {
        this.mContext = null;
        this.zzaej = null;
        this.mContext = context;
        this.zzaej = str;
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        this.zzbfy = linkedHashMap;
        linkedHashMap.put("s", "gmob_sdk");
        this.zzbfy.put("v", "3");
        this.zzbfy.put("os", Build.VERSION.RELEASE);
        this.zzbfy.put("sdk", Build.VERSION.SDK);
        Map<String, String> map = this.zzbfy;
        com.google.android.gms.ads.internal.zzbv.zzek();
        map.put("device", zzakk.zzri());
        this.zzbfy.put("app", context.getApplicationContext() != null ? context.getApplicationContext().getPackageName() : context.getPackageName());
        Map<String, String> map2 = this.zzbfy;
        com.google.android.gms.ads.internal.zzbv.zzek();
        map2.put("is_lite_sdk", zzakk.zzav(context) ? "1" : "0");
        Future<zzaga> zzq = com.google.android.gms.ads.internal.zzbv.zzev().zzq(this.mContext);
        try {
            zzq.get();
            this.zzbfy.put("network_coarse", Integer.toString(zzq.get().zzcjx));
            this.zzbfy.put("network_fine", Integer.toString(zzq.get().zzcjy));
        } catch (Exception e) {
            com.google.android.gms.ads.internal.zzbv.zzeo().zza(e, "CsiConfiguration.CsiConfiguration");
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final Context getContext() {
        return this.mContext;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final String zzfw() {
        return this.zzaej;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final String zzjd() {
        return this.zzbfx;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final Map<String, String> zzje() {
        return this.zzbfy;
    }
}
