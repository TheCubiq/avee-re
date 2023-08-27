package com.google.android.gms.internal.ads;

import android.text.TextUtils;
import java.util.Map;
/* loaded from: classes2.dex */
final class zzarj implements com.google.android.gms.ads.internal.gmsg.zzv<zzaqw> {
    private final /* synthetic */ zzari zzdec;

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzarj(zzari zzariVar) {
        this.zzdec = zzariVar;
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
                synchronized (this.zzdec) {
                    i = this.zzdec.zzddu;
                    if (i != parseInt) {
                        this.zzdec.zzddu = parseInt;
                        this.zzdec.requestLayout();
                    }
                }
            } catch (Exception e) {
                zzakb.zzc("Exception occurred while getting webview content height", e);
            }
        }
    }
}
