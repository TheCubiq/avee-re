package com.google.android.gms.internal.ads;

import android.content.Context;
import android.view.ViewGroup;
import com.google.android.gms.common.internal.Preconditions;
@zzadh
/* loaded from: classes2.dex */
public final class zzapn {
    private final Context zzcyf;
    private final zzapw zzcyg;
    private final ViewGroup zzcyh;
    private zzapi zzcyi;

    private zzapn(Context context, ViewGroup viewGroup, zzapw zzapwVar, zzapi zzapiVar) {
        this.zzcyf = context.getApplicationContext() != null ? context.getApplicationContext() : context;
        this.zzcyh = viewGroup;
        this.zzcyg = zzapwVar;
        this.zzcyi = null;
    }

    public zzapn(Context context, ViewGroup viewGroup, zzaqw zzaqwVar) {
        this(context, viewGroup, zzaqwVar, null);
    }

    public final void onDestroy() {
        Preconditions.checkMainThread("onDestroy must be called from the UI thread.");
        zzapi zzapiVar = this.zzcyi;
        if (zzapiVar != null) {
            zzapiVar.destroy();
            this.zzcyh.removeView(this.zzcyi);
            this.zzcyi = null;
        }
    }

    public final void onPause() {
        Preconditions.checkMainThread("onPause must be called from the UI thread.");
        zzapi zzapiVar = this.zzcyi;
        if (zzapiVar != null) {
            zzapiVar.pause();
        }
    }

    public final void zza(int i, int i2, int i3, int i4, int i5, boolean z, zzapv zzapvVar) {
        if (this.zzcyi != null) {
            return;
        }
        zznq.zza(this.zzcyg.zztp().zzji(), this.zzcyg.zztn(), "vpr2");
        Context context = this.zzcyf;
        zzapw zzapwVar = this.zzcyg;
        zzapi zzapiVar = new zzapi(context, zzapwVar, i5, z, zzapwVar.zztp().zzji(), zzapvVar);
        this.zzcyi = zzapiVar;
        this.zzcyh.addView(zzapiVar, 0, new ViewGroup.LayoutParams(-1, -1));
        this.zzcyi.zzd(i, i2, i3, i4);
        this.zzcyg.zzah(false);
    }

    public final void zze(int i, int i2, int i3, int i4) {
        Preconditions.checkMainThread("The underlay may only be modified from the UI thread.");
        zzapi zzapiVar = this.zzcyi;
        if (zzapiVar != null) {
            zzapiVar.zzd(i, i2, i3, i4);
        }
    }

    public final zzapi zzth() {
        Preconditions.checkMainThread("getAdVideoUnderlay must be called from the UI thread.");
        return this.zzcyi;
    }
}
