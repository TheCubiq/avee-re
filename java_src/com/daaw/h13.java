package com.daaw;

import com.google.android.gms.ads.admanager.AppEventListener;
import com.google.android.gms.ads.internal.client.zzca;
/* loaded from: classes.dex */
public final class h13 extends zzca {
    public final AppEventListener p;

    public h13(AppEventListener appEventListener) {
        this.p = appEventListener;
    }

    public final AppEventListener g3() {
        return this.p;
    }

    @Override // com.google.android.gms.ads.internal.client.zzcb
    public final void zzc(String str, String str2) {
        this.p.onAppEvent(str, str2);
    }
}
