package com.google.android.gms.ads.internal.gmsg;

import android.content.Context;
import com.google.android.gms.ads.internal.zzbv;
import com.google.android.gms.internal.ads.zzadh;
import java.util.Map;
@zzadh
/* loaded from: classes.dex */
public final class zzab implements zzv<Object> {
    private final Context zzrt;

    public zzab(Context context) {
        this.zzrt = context;
    }

    @Override // com.google.android.gms.ads.internal.gmsg.zzv
    public final void zza(Object obj, Map<String, String> map) {
        if (zzbv.zzfh().zzs(this.zzrt)) {
            zzbv.zzfh().zza(this.zzrt, map.get("eventName"), map.get("eventId"));
        }
    }
}
