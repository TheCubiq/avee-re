package com.google.android.gms.internal.ads;

import java.util.HashMap;
import java.util.Map;
import javax.annotation.ParametersAreNonnullByDefault;
@ParametersAreNonnullByDefault
@zzadh
/* loaded from: classes.dex */
public final class zznw {
    private final Map<String, zznv> zzbgm = new HashMap();
    private final zznx zzvr;

    public zznw(zznx zznxVar) {
        this.zzvr = zznxVar;
    }

    public final void zza(String str, zznv zznvVar) {
        this.zzbgm.put(str, zznvVar);
    }

    public final void zza(String str, String str2, long j) {
        zznx zznxVar = this.zzvr;
        zznv zznvVar = this.zzbgm.get(str2);
        String[] strArr = {str};
        if (zznxVar != null && zznvVar != null) {
            zznxVar.zza(zznvVar, j, strArr);
        }
        Map<String, zznv> map = this.zzbgm;
        zznx zznxVar2 = this.zzvr;
        map.put(str, zznxVar2 == null ? null : zznxVar2.zzd(j));
    }

    public final zznx zzji() {
        return this.zzvr;
    }
}
