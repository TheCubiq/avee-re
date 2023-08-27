package com.google.android.gms.internal.ads;

import android.os.Bundle;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArraySet;
/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes2.dex */
public final class zzakf extends zzakg {
    private final /* synthetic */ zzakd zzcrh;
    private final /* synthetic */ Bundle zzcri;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zzakf(zzakd zzakdVar, Bundle bundle) {
        super(null);
        this.zzcrh = zzakdVar;
        this.zzcri = bundle;
    }

    @Override // com.google.android.gms.internal.ads.zzajx
    public final void zzdn() {
        CopyOnWriteArraySet copyOnWriteArraySet;
        copyOnWriteArraySet = this.zzcrh.zzcqv;
        Iterator it = copyOnWriteArraySet.iterator();
        while (it.hasNext()) {
            ((zzakh) it.next()).zzd(this.zzcri);
        }
    }
}
