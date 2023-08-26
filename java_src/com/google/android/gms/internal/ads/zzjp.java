package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.doubleclick.AppEventListener;
@zzadh
/* loaded from: classes2.dex */
public final class zzjp extends zzlb {
    private final AppEventListener zzvo;

    public zzjp(AppEventListener appEventListener) {
        this.zzvo = appEventListener;
    }

    public final AppEventListener getAppEventListener() {
        return this.zzvo;
    }

    @Override // com.google.android.gms.internal.ads.zzla
    public final void onAppEvent(String str, String str2) {
        this.zzvo.onAppEvent(str, str2);
    }
}
