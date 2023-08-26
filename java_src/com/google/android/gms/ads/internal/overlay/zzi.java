package com.google.android.gms.ads.internal.overlay;

import android.content.Context;
import android.view.ViewGroup;
import android.view.ViewParent;
import com.google.android.gms.internal.ads.zzadh;
import com.google.android.gms.internal.ads.zzaqw;
@zzadh
/* loaded from: classes.dex */
public final class zzi {
    public final int index;
    public final ViewGroup parent;
    public final ViewGroup.LayoutParams zzbyi;
    public final Context zzrt;

    public zzi(zzaqw zzaqwVar) throws zzg {
        this.zzbyi = zzaqwVar.getLayoutParams();
        ViewParent parent = zzaqwVar.getParent();
        this.zzrt = zzaqwVar.zzua();
        if (parent == null || !(parent instanceof ViewGroup)) {
            throw new zzg("Could not get the parent of the WebView for an overlay.");
        }
        ViewGroup viewGroup = (ViewGroup) parent;
        this.parent = viewGroup;
        this.index = viewGroup.indexOfChild(zzaqwVar.getView());
        this.parent.removeView(zzaqwVar.getView());
        zzaqwVar.zzai(true);
    }
}
