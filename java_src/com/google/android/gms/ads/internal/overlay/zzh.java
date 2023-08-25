package com.google.android.gms.ads.internal.overlay;

import android.content.Context;
import android.view.ViewGroup;
import android.view.ViewParent;
import com.daaw.a74;
import com.daaw.f86;
/* loaded from: classes.dex */
public final class zzh {
    public final int zza;
    public final ViewGroup.LayoutParams zzb;
    public final ViewGroup zzc;
    public final Context zzd;

    public zzh(a74 a74Var) {
        this.zzb = a74Var.getLayoutParams();
        ViewParent parent = a74Var.getParent();
        this.zzd = a74Var.mo6412j();
        if (parent == null || !(parent instanceof ViewGroup)) {
            throw new f86("Could not get the parent of the WebView for an overlay.");
        }
        ViewGroup viewGroup = (ViewGroup) parent;
        this.zzc = viewGroup;
        this.zza = viewGroup.indexOfChild(a74Var.mo6418g());
        viewGroup.removeView(a74Var.mo6418g());
        a74Var.mo6417g0(true);
    }
}
