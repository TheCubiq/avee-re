package com.daaw;

import android.app.DownloadManager;
import android.content.Context;
import android.content.DialogInterface;
import android.net.Uri;
import android.os.Environment;
import com.google.android.gms.ads.internal.zzt;
/* loaded from: classes.dex */
public final class cq3 implements DialogInterface.OnClickListener {

    /* renamed from: p */
    public final /* synthetic */ String f6081p;

    /* renamed from: q */
    public final /* synthetic */ String f6082q;

    /* renamed from: r */
    public final /* synthetic */ eq3 f6083r;

    public cq3(eq3 eq3Var, String str, String str2) {
        this.f6083r = eq3Var;
        this.f6081p = str;
        this.f6082q = str2;
    }

    @Override // android.content.DialogInterface.OnClickListener
    public final void onClick(DialogInterface dialogInterface, int i) {
        Context context;
        context = this.f6083r.f8687d;
        DownloadManager downloadManager = (DownloadManager) context.getSystemService("download");
        try {
            String str = this.f6081p;
            String str2 = this.f6082q;
            DownloadManager.Request request = new DownloadManager.Request(Uri.parse(str));
            request.setDestinationInExternalPublicDir(Environment.DIRECTORY_PICTURES, str2);
            zzt.zzp();
            request.allowScanningByMediaScanner();
            request.setNotificationVisibility(1);
            downloadManager.enqueue(request);
        } catch (IllegalStateException unused) {
            this.f6083r.m20488c("Could not store picture.");
        }
    }
}
