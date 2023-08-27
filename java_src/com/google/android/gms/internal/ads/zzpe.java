package com.google.android.gms.internal.ads;

import android.text.TextUtils;
import java.lang.ref.WeakReference;
import java.util.Map;
/* loaded from: classes2.dex */
public final class zzpe implements com.google.android.gms.ads.internal.gmsg.zzv<Object> {
    private final String zzaae;
    private final WeakReference<zzpa> zzyg;

    public zzpe(zzpa zzpaVar, String str) {
        this.zzyg = new WeakReference<>(zzpaVar);
        this.zzaae = str;
    }

    @Override // com.google.android.gms.ads.internal.gmsg.zzv
    public final void zza(Object obj, Map<String, String> map) {
        zzpa zzpaVar;
        String str = map.get("ads_id");
        String str2 = map.get("eventName");
        if (TextUtils.isEmpty(str) || !this.zzaae.equals(str)) {
            return;
        }
        try {
            Integer.parseInt(map.get("eventType"));
        } catch (Exception e) {
            zzakb.zzb("Parse Scion log event type error", e);
        }
        if ("_ai".equals(str2)) {
            zzpa zzpaVar2 = this.zzyg.get();
            if (zzpaVar2 != null) {
                zzpaVar2.zzbr();
            }
        } else if (!"_ac".equals(str2) || (zzpaVar = this.zzyg.get()) == null) {
        } else {
            zzpaVar.zzbs();
        }
    }
}
