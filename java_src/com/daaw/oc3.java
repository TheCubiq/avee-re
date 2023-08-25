package com.daaw;

import com.google.android.gms.ads.formats.NativeAd;
import java.util.ArrayList;
import java.util.List;
/* loaded from: classes.dex */
public final class oc3 extends NativeAd.AdChoicesInfo {
    public final nc3 a;
    public final List b = new ArrayList();
    public String c;

    /* JADX WARN: Code restructure failed: missing block: B:20:0x004c, code lost:
        r4.b.add(new com.daaw.wc3(r3));
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public oc3(com.daaw.nc3 r5) {
        /*
            r4 = this;
            java.lang.String r0 = ""
            r4.<init>()
            java.util.ArrayList r1 = new java.util.ArrayList
            r1.<init>()
            r4.b = r1
            r4.a = r5
            java.lang.String r1 = r5.zzg()     // Catch: android.os.RemoteException -> L15
            r4.c = r1     // Catch: android.os.RemoteException -> L15
            goto L1b
        L15:
            r1 = move-exception
            com.daaw.k04.zzh(r0, r1)
            r4.c = r0
        L1b:
            java.util.List r5 = r5.zzh()     // Catch: android.os.RemoteException -> L58
            java.util.Iterator r5 = r5.iterator()     // Catch: android.os.RemoteException -> L58
        L23:
            boolean r1 = r5.hasNext()     // Catch: android.os.RemoteException -> L58
            if (r1 == 0) goto L57
            java.lang.Object r1 = r5.next()     // Catch: android.os.RemoteException -> L58
            boolean r2 = r1 instanceof android.os.IBinder     // Catch: android.os.RemoteException -> L58
            r3 = 0
            if (r2 == 0) goto L4a
            android.os.IBinder r1 = (android.os.IBinder) r1     // Catch: android.os.RemoteException -> L58
            if (r1 != 0) goto L37
            goto L4a
        L37:
            java.lang.String r2 = "com.google.android.gms.ads.internal.formats.client.INativeAdImage"
            android.os.IInterface r2 = r1.queryLocalInterface(r2)     // Catch: android.os.RemoteException -> L58
            boolean r3 = r2 instanceof com.daaw.vc3     // Catch: android.os.RemoteException -> L58
            if (r3 == 0) goto L45
            r3 = r2
            com.daaw.vc3 r3 = (com.daaw.vc3) r3     // Catch: android.os.RemoteException -> L58
            goto L4a
        L45:
            com.daaw.tc3 r3 = new com.daaw.tc3     // Catch: android.os.RemoteException -> L58
            r3.<init>(r1)     // Catch: android.os.RemoteException -> L58
        L4a:
            if (r3 == 0) goto L23
            java.util.List r1 = r4.b     // Catch: android.os.RemoteException -> L58
            com.daaw.wc3 r2 = new com.daaw.wc3     // Catch: android.os.RemoteException -> L58
            r2.<init>(r3)     // Catch: android.os.RemoteException -> L58
            r1.add(r2)     // Catch: android.os.RemoteException -> L58
            goto L23
        L57:
            return
        L58:
            r5 = move-exception
            com.daaw.k04.zzh(r0, r5)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.daaw.oc3.<init>(com.daaw.nc3):void");
    }

    @Override // com.google.android.gms.ads.formats.NativeAd.AdChoicesInfo
    public final List<NativeAd.Image> getImages() {
        return this.b;
    }

    @Override // com.google.android.gms.ads.formats.NativeAd.AdChoicesInfo
    public final CharSequence getText() {
        return this.c;
    }
}
