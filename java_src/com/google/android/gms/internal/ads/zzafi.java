package com.google.android.gms.internal.ads;

import java.util.Map;
/* loaded from: classes2.dex */
public final class zzafi implements com.google.android.gms.ads.internal.gmsg.zzv<Object> {
    @Override // com.google.android.gms.ads.internal.gmsg.zzv
    public final void zza(Object obj, Map<String, String> map) {
        com.google.android.gms.ads.internal.gmsg.zzaa zzaaVar;
        String str = map.get("request_id");
        String valueOf = String.valueOf(map.get("errors"));
        zzakb.zzdk(valueOf.length() != 0 ? "Invalid request: ".concat(valueOf) : new String("Invalid request: "));
        zzaaVar = zzafa.zzcgg;
        zzaaVar.zzat(str);
    }
}
