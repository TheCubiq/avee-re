package com.google.android.gms.internal.ads;

import android.view.View;
/* loaded from: classes2.dex */
final class zzaac implements View.OnClickListener {
    private final /* synthetic */ zzaab zzbwl;

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzaac(zzaab zzaabVar) {
        this.zzbwl = zzaabVar;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        this.zzbwl.zzm(true);
    }
}
