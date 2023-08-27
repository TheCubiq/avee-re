package com.google.android.gms.internal.ads;

import android.view.View;
/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes2.dex */
public final class zzasl implements Runnable {
    private final /* synthetic */ View val$view;
    private final /* synthetic */ zzait zzdcg;
    private final /* synthetic */ int zzdch;
    private final /* synthetic */ zzasj zzdes;

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzasl(zzasj zzasjVar, View view, zzait zzaitVar, int i) {
        this.zzdes = zzasjVar;
        this.val$view = view;
        this.zzdcg = zzaitVar;
        this.zzdch = i;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.zzdes.zza(this.val$view, this.zzdcg, this.zzdch - 1);
    }
}
