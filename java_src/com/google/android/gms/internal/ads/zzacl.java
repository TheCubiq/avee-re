package com.google.android.gms.internal.ads;

import android.view.ViewTreeObserver;
import java.lang.ref.WeakReference;
/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes2.dex */
public final class zzacl implements ViewTreeObserver.OnScrollChangedListener {
    private final /* synthetic */ zzace zzcbi;
    private final /* synthetic */ WeakReference zzcbj;

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzacl(zzace zzaceVar, WeakReference weakReference) {
        this.zzcbi = zzaceVar;
        this.zzcbj = weakReference;
    }

    @Override // android.view.ViewTreeObserver.OnScrollChangedListener
    public final void onScrollChanged() {
        this.zzcbi.zza((WeakReference<zzaqw>) this.zzcbj, true);
    }
}
