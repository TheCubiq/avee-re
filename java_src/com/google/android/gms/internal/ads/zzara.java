package com.google.android.gms.internal.ads;

import android.view.View;
/* loaded from: classes2.dex */
final class zzara implements View.OnAttachStateChangeListener {
    private final /* synthetic */ zzait zzdcg;
    private final /* synthetic */ zzaqx zzdci;

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzara(zzaqx zzaqxVar, zzait zzaitVar) {
        this.zzdci = zzaqxVar;
        this.zzdcg = zzaitVar;
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewAttachedToWindow(View view) {
        this.zzdci.zza(view, this.zzdcg, 10);
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewDetachedFromWindow(View view) {
    }
}
