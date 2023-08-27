package com.google.android.gms.internal.ads;

import android.app.DownloadManager;
import android.content.Context;
import android.content.DialogInterface;
import android.net.Uri;
import android.os.Environment;
/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes2.dex */
public final class zzaaf implements DialogInterface.OnClickListener {
    private final /* synthetic */ String zzbwo;
    private final /* synthetic */ String zzbwp;
    private final /* synthetic */ zzaae zzbwq;

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzaaf(zzaae zzaaeVar, String str, String str2) {
        this.zzbwq = zzaaeVar;
        this.zzbwo = str;
        this.zzbwp = str2;
    }

    @Override // android.content.DialogInterface.OnClickListener
    public final void onClick(DialogInterface dialogInterface, int i) {
        Context context;
        context = this.zzbwq.mContext;
        DownloadManager downloadManager = (DownloadManager) context.getSystemService("download");
        try {
            String str = this.zzbwo;
            String str2 = this.zzbwp;
            DownloadManager.Request request = new DownloadManager.Request(Uri.parse(str));
            request.setDestinationInExternalPublicDir(Environment.DIRECTORY_PICTURES, str2);
            com.google.android.gms.ads.internal.zzbv.zzem().zza(request);
            downloadManager.enqueue(request);
        } catch (IllegalStateException unused) {
            this.zzbwq.zzbw("Could not store picture.");
        }
    }
}
