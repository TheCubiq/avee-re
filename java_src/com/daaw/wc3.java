package com.daaw;

import android.graphics.drawable.Drawable;
import android.net.Uri;
import com.google.android.gms.ads.formats.NativeAd;
/* loaded from: classes.dex */
public final class wc3 extends NativeAd.Image {
    public final vc3 a;
    public final Drawable b;
    public final Uri c;
    public final double d;
    public final int e;
    public final int f;

    /* JADX WARN: Can't wrap try/catch for region: R(18:1|(2:2|3)|(15:5|6|7|8|9|10|11|12|13|14|15|16|17|18|19)|34|6|7|8|9|10|11|12|13|14|15|16|17|18|19) */
    /* JADX WARN: Code restructure failed: missing block: B:13:0x0023, code lost:
        r4 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x0024, code lost:
        com.daaw.k04.zzh("", r4);
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x0030, code lost:
        r4 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x0031, code lost:
        com.daaw.k04.zzh("", r4);
        r1 = 1.0d;
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x0040, code lost:
        r1 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x0041, code lost:
        com.daaw.k04.zzh("", r1);
        r1 = -1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x004e, code lost:
        r1 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x004f, code lost:
        com.daaw.k04.zzh("", r1);
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public wc3(com.daaw.vc3 r4) {
        /*
            r3 = this;
            java.lang.String r0 = ""
            r3.<init>()
            r3.a = r4
            r1 = 0
            com.daaw.yd0 r4 = r4.zzf()     // Catch: android.os.RemoteException -> L15
            if (r4 == 0) goto L19
            java.lang.Object r4 = com.daaw.nt0.M(r4)     // Catch: android.os.RemoteException -> L15
            android.graphics.drawable.Drawable r4 = (android.graphics.drawable.Drawable) r4     // Catch: android.os.RemoteException -> L15
            goto L1a
        L15:
            r4 = move-exception
            com.daaw.k04.zzh(r0, r4)
        L19:
            r4 = r1
        L1a:
            r3.b = r4
            com.daaw.vc3 r4 = r3.a     // Catch: android.os.RemoteException -> L23
            android.net.Uri r1 = r4.zze()     // Catch: android.os.RemoteException -> L23
            goto L27
        L23:
            r4 = move-exception
            com.daaw.k04.zzh(r0, r4)
        L27:
            r3.c = r1
            com.daaw.vc3 r4 = r3.a     // Catch: android.os.RemoteException -> L30
            double r1 = r4.zzb()     // Catch: android.os.RemoteException -> L30
            goto L36
        L30:
            r4 = move-exception
            com.daaw.k04.zzh(r0, r4)
            r1 = 4607182418800017408(0x3ff0000000000000, double:1.0)
        L36:
            r3.d = r1
            r4 = -1
            com.daaw.vc3 r1 = r3.a     // Catch: android.os.RemoteException -> L40
            int r1 = r1.zzd()     // Catch: android.os.RemoteException -> L40
            goto L45
        L40:
            r1 = move-exception
            com.daaw.k04.zzh(r0, r1)
            r1 = -1
        L45:
            r3.e = r1
            com.daaw.vc3 r1 = r3.a     // Catch: android.os.RemoteException -> L4e
            int r4 = r1.zzc()     // Catch: android.os.RemoteException -> L4e
            goto L52
        L4e:
            r1 = move-exception
            com.daaw.k04.zzh(r0, r1)
        L52:
            r3.f = r4
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.daaw.wc3.<init>(com.daaw.vc3):void");
    }

    @Override // com.google.android.gms.ads.formats.NativeAd.Image
    public final Drawable getDrawable() {
        return this.b;
    }

    @Override // com.google.android.gms.ads.formats.NativeAd.Image
    public final double getScale() {
        return this.d;
    }

    @Override // com.google.android.gms.ads.formats.NativeAd.Image
    public final Uri getUri() {
        return this.c;
    }

    @Override // com.google.android.gms.ads.formats.NativeAd.Image
    public final int zza() {
        return this.f;
    }

    @Override // com.google.android.gms.ads.formats.NativeAd.Image
    public final int zzb() {
        return this.e;
    }
}
