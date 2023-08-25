package com.daaw;

import android.app.AlertDialog;
import android.content.Context;
import android.content.DialogInterface;
import com.google.android.gms.ads.internal.util.zzaw;
import com.google.android.gms.ads.internal.util.zzs;
import com.google.android.gms.ads.internal.zzt;
/* loaded from: classes.dex */
public final class es2 implements Runnable {
    public final /* synthetic */ Context p;
    public final /* synthetic */ String q;
    public final /* synthetic */ boolean r;
    public final /* synthetic */ boolean s;

    public es2(zzaw zzawVar, Context context, String str, boolean z, boolean z2) {
        this.p = context;
        this.q = str;
        this.r = z;
        this.s = z2;
    }

    @Override // java.lang.Runnable
    public final void run() {
        zzt.zzp();
        AlertDialog.Builder zzG = zzs.zzG(this.p);
        zzG.setMessage(this.q);
        zzG.setTitle(this.r ? "Error" : "Info");
        if (this.s) {
            zzG.setNeutralButton("Dismiss", (DialogInterface.OnClickListener) null);
        } else {
            zzG.setPositiveButton("Learn More", new zq2(this));
            zzG.setNegativeButton("Dismiss", (DialogInterface.OnClickListener) null);
        }
        zzG.create().show();
    }
}
