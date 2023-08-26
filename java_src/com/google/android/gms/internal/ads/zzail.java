package com.google.android.gms.internal.ads;

import android.graphics.Bitmap;
import java.io.ByteArrayOutputStream;
/* loaded from: classes2.dex */
final class zzail implements Runnable {
    private final /* synthetic */ Bitmap val$bitmap;
    private final /* synthetic */ zzaii zzcna;

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzail(zzaii zzaiiVar, Bitmap bitmap) {
        this.zzcna = zzaiiVar;
        this.val$bitmap = bitmap;
    }

    @Override // java.lang.Runnable
    public final void run() {
        Object obj;
        zzbfm zzbfmVar;
        zzbfm zzbfmVar2;
        zzbfm zzbfmVar3;
        zzbfm zzbfmVar4;
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        this.val$bitmap.compress(Bitmap.CompressFormat.PNG, 0, byteArrayOutputStream);
        obj = this.zzcna.mLock;
        synchronized (obj) {
            zzbfmVar = this.zzcna.zzcmn;
            zzbfmVar.zzecm = new zzbft();
            zzbfmVar2 = this.zzcna.zzcmn;
            zzbfmVar2.zzecm.zzedl = byteArrayOutputStream.toByteArray();
            zzbfmVar3 = this.zzcna.zzcmn;
            zzbfmVar3.zzecm.mimeType = "image/png";
            zzbfmVar4 = this.zzcna.zzcmn;
            zzbfmVar4.zzecm.zzamf = 1;
        }
    }
}
