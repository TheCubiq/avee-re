package com.google.android.gms.internal.ads;

import org.json.JSONObject;
/* loaded from: classes2.dex */
final class zzfi implements zzaoo<zzwb> {
    private final /* synthetic */ JSONObject zzagb;

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzfi(zzff zzffVar, JSONObject jSONObject) {
        this.zzagb = jSONObject;
    }

    @Override // com.google.android.gms.internal.ads.zzaoo
    public final /* synthetic */ void zze(zzwb zzwbVar) {
        zzwbVar.zzb("AFMA_updateActiveView", this.zzagb);
    }
}
