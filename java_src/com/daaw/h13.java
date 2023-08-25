package com.daaw;

import com.google.android.gms.ads.admanager.AppEventListener;
import com.google.android.gms.ads.internal.client.zzca;
/* loaded from: classes.dex */
public final class h13 extends zzca {

    /* renamed from: p */
    public final AppEventListener f11950p;

    public h13(AppEventListener appEventListener) {
        this.f11950p = appEventListener;
    }

    /* renamed from: g3 */
    public final AppEventListener m21089g3() {
        return this.f11950p;
    }

    @Override // com.google.android.gms.ads.internal.client.zzcb
    public final void zzc(String str, String str2) {
        this.f11950p.onAppEvent(str, str2);
    }
}
