package com.google.android.gms.internal.ads;

import android.app.AlertDialog;
import android.content.Context;
import android.content.DialogInterface;
/* loaded from: classes2.dex */
final class zzall implements Runnable {
    final /* synthetic */ Context val$context;
    private final /* synthetic */ String zzcsq;
    private final /* synthetic */ boolean zzcsr;
    private final /* synthetic */ boolean zzcss;

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzall(zzalk zzalkVar, Context context, String str, boolean z, boolean z2) {
        this.val$context = context;
        this.zzcsq = str;
        this.zzcsr = z;
        this.zzcss = z2;
    }

    @Override // java.lang.Runnable
    public final void run() {
        AlertDialog.Builder builder = new AlertDialog.Builder(this.val$context);
        builder.setMessage(this.zzcsq);
        builder.setTitle(this.zzcsr ? "Error" : "Info");
        if (this.zzcss) {
            builder.setNeutralButton("Dismiss", (DialogInterface.OnClickListener) null);
        } else {
            builder.setPositiveButton("Learn More", new zzalm(this));
            builder.setNegativeButton("Dismiss", (DialogInterface.OnClickListener) null);
        }
        builder.create().show();
    }
}
