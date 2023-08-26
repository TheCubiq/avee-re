package com.google.android.gms.internal.ads;

import android.view.View;
/* loaded from: classes2.dex */
final class zzasm implements View.OnAttachStateChangeListener {
    private final /* synthetic */ zzait zzdcg;
    private final /* synthetic */ zzasj zzdes;

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzasm(zzasj zzasjVar, zzait zzaitVar) {
        this.zzdes = zzasjVar;
        this.zzdcg = zzaitVar;
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewAttachedToWindow(View view) {
        this.zzdes.zza(view, this.zzdcg, 10);
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewDetachedFromWindow(View view) {
    }
}
