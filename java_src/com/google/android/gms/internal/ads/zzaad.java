package com.google.android.gms.internal.ads;

import java.util.Map;
@zzadh
/* loaded from: classes2.dex */
public final class zzaad {
    private final zzaqw zzbnd;
    private final boolean zzbwm;
    private final String zzbwn;

    public zzaad(zzaqw zzaqwVar, Map<String, String> map) {
        this.zzbnd = zzaqwVar;
        this.zzbwn = map.get("forceOrientation");
        this.zzbwm = map.containsKey("allowOrientationChange") ? Boolean.parseBoolean(map.get("allowOrientationChange")) : true;
    }

    public final void execute() {
        if (this.zzbnd == null) {
            zzakb.zzdk("AdWebView is null");
        } else {
            this.zzbnd.setRequestedOrientation("portrait".equalsIgnoreCase(this.zzbwn) ? com.google.android.gms.ads.internal.zzbv.zzem().zzrm() : "landscape".equalsIgnoreCase(this.zzbwn) ? com.google.android.gms.ads.internal.zzbv.zzem().zzrl() : this.zzbwm ? -1 : com.google.android.gms.ads.internal.zzbv.zzem().zzrn());
        }
    }
}
