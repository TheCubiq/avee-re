package com.google.android.gms.internal.ads;

import android.text.TextUtils;
import java.util.Map;
/* loaded from: classes2.dex */
final class zzasr implements com.google.android.gms.ads.internal.gmsg.zzv<zzaqw> {
    private final /* synthetic */ zzasq zzdev;

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzasr(zzasq zzasqVar) {
        this.zzdev = zzasqVar;
    }

    @Override // com.google.android.gms.ads.internal.gmsg.zzv
    public final /* synthetic */ void zza(zzaqw zzaqwVar, Map map) {
        int i;
        if (map != null) {
            String str = (String) map.get("height");
            if (TextUtils.isEmpty(str)) {
                return;
            }
            try {
                int parseInt = Integer.parseInt(str);
                synchronized (this.zzdev) {
                    i = this.zzdev.zzddu;
                    if (i != parseInt) {
                        this.zzdev.zzddu = parseInt;
                        this.zzdev.requestLayout();
                    }
                }
            } catch (Exception e) {
                zzakb.zzc("Exception occurred while getting webview content height", e);
            }
        }
    }
}
