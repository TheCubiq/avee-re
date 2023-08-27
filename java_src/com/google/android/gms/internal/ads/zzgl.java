package com.google.android.gms.internal.ads;

import android.view.View;
/* loaded from: classes2.dex */
final class zzgl implements Runnable {
    private final /* synthetic */ View zzaij;
    private final /* synthetic */ zzgk zzaik;

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzgl(zzgk zzgkVar, View view) {
        this.zzaik = zzgkVar;
        this.zzaij = view;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.zzaik.zzk(this.zzaij);
    }
}
