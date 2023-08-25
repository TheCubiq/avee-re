package com.daaw;

import android.app.AlertDialog;
import android.content.Context;
import android.content.DialogInterface;
import com.google.android.gms.ads.internal.util.zzaw;
import com.google.android.gms.ads.internal.util.zzs;
import com.google.android.gms.ads.internal.zzt;
/* loaded from: classes.dex */
public final class es2 implements Runnable {

    /* renamed from: p */
    public final /* synthetic */ Context f8725p;

    /* renamed from: q */
    public final /* synthetic */ String f8726q;

    /* renamed from: r */
    public final /* synthetic */ boolean f8727r;

    /* renamed from: s */
    public final /* synthetic */ boolean f8728s;

    public es2(zzaw zzawVar, Context context, String str, boolean z, boolean z2) {
        this.f8725p = context;
        this.f8726q = str;
        this.f8727r = z;
        this.f8728s = z2;
    }

    @Override // java.lang.Runnable
    public final void run() {
        zzt.zzp();
        AlertDialog.Builder zzG = zzs.zzG(this.f8725p);
        zzG.setMessage(this.f8726q);
        zzG.setTitle(this.f8727r ? "Error" : "Info");
        if (this.f8728s) {
            zzG.setNeutralButton("Dismiss", (DialogInterface.OnClickListener) null);
        } else {
            zzG.setPositiveButton("Learn More", new zq2(this));
            zzG.setNegativeButton("Dismiss", (DialogInterface.OnClickListener) null);
        }
        zzG.create().show();
    }
}
