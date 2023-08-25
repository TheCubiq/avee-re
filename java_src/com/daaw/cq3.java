package com.daaw;

import android.app.DownloadManager;
import android.content.Context;
import android.content.DialogInterface;
import android.net.Uri;
import android.os.Environment;
import com.google.android.gms.ads.internal.zzt;
/* loaded from: classes.dex */
public final class cq3 implements DialogInterface.OnClickListener {
    public final /* synthetic */ String p;
    public final /* synthetic */ String q;
    public final /* synthetic */ eq3 r;

    public cq3(eq3 eq3Var, String str, String str2) {
        this.r = eq3Var;
        this.p = str;
        this.q = str2;
    }

    @Override // android.content.DialogInterface.OnClickListener
    public final void onClick(DialogInterface dialogInterface, int i) {
        Context context;
        context = this.r.d;
        DownloadManager downloadManager = (DownloadManager) context.getSystemService("download");
        try {
            String str = this.p;
            String str2 = this.q;
            DownloadManager.Request request = new DownloadManager.Request(Uri.parse(str));
            request.setDestinationInExternalPublicDir(Environment.DIRECTORY_PICTURES, str2);
            zzt.zzp();
            request.allowScanningByMediaScanner();
            request.setNotificationVisibility(1);
            downloadManager.enqueue(request);
        } catch (IllegalStateException unused) {
            this.r.c("Could not store picture.");
        }
    }
}
