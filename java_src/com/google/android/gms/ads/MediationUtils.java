package com.google.android.gms.ads;
/* loaded from: classes.dex */
public class MediationUtils {
    /* JADX WARN: Removed duplicated region for block: B:38:0x00bb  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x00d1 A[ADDED_TO_REGION, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static com.google.android.gms.ads.AdSize findClosestSize(android.content.Context r10, com.google.android.gms.ads.AdSize r11, java.util.List<com.google.android.gms.ads.AdSize> r12) {
        /*
            r0 = 0
            if (r12 == 0) goto Ld4
            if (r11 != 0) goto L7
            goto Ld4
        L7:
            boolean r1 = r11.h()
            if (r1 != 0) goto L36
            boolean r1 = r11.i()
            if (r1 != 0) goto L36
            android.content.res.Resources r1 = r10.getResources()
            android.util.DisplayMetrics r1 = r1.getDisplayMetrics()
            float r1 = r1.density
            int r2 = r11.getWidthInPixels(r10)
            float r2 = (float) r2
            float r2 = r2 / r1
            int r2 = java.lang.Math.round(r2)
            int r10 = r11.getHeightInPixels(r10)
            float r10 = (float) r10
            float r10 = r10 / r1
            int r10 = java.lang.Math.round(r10)
            com.google.android.gms.ads.AdSize r11 = new com.google.android.gms.ads.AdSize
            r11.<init>(r2, r10)
        L36:
            java.util.Iterator r10 = r12.iterator()
        L3a:
            boolean r12 = r10.hasNext()
            if (r12 == 0) goto Ld4
            java.lang.Object r12 = r10.next()
            com.google.android.gms.ads.AdSize r12 = (com.google.android.gms.ads.AdSize) r12
            if (r12 == 0) goto L3a
            int r1 = r11.getWidth()
            int r2 = r12.getWidth()
            int r3 = r11.getHeight()
            int r4 = r12.getHeight()
            double r5 = (double) r1
            r7 = 4602678819172646912(0x3fe0000000000000, double:0.5)
            java.lang.Double.isNaN(r5)
            double r5 = r5 * r7
            double r7 = (double) r2
            int r9 = (r5 > r7 ? 1 : (r5 == r7 ? 0 : -1))
            if (r9 > 0) goto L3a
            if (r1 < r2) goto L3a
            boolean r1 = r11.i()
            if (r1 == 0) goto L98
            int r1 = r11.a()
            com.daaw.y83 r3 = com.daaw.g93.b7
            com.daaw.e93 r5 = com.google.android.gms.ads.internal.client.zzba.zzc()
            java.lang.Object r3 = r5.b(r3)
            java.lang.Integer r3 = (java.lang.Integer) r3
            int r3 = r3.intValue()
            if (r3 > r2) goto L3a
            com.daaw.y83 r2 = com.daaw.g93.c7
            com.daaw.e93 r3 = com.google.android.gms.ads.internal.client.zzba.zzc()
            java.lang.Object r2 = r3.b(r2)
            java.lang.Integer r2 = (java.lang.Integer) r2
            int r2 = r2.intValue()
            if (r2 > r4) goto L3a
            if (r1 < r4) goto L3a
            goto Lb8
        L98:
            boolean r1 = r11.h()
            if (r1 == 0) goto La5
            int r1 = r11.b()
            if (r1 < r4) goto L3a
            goto Lb8
        La5:
            double r1 = (double) r3
            r5 = 4604480259023595110(0x3fe6666666666666, double:0.7)
            java.lang.Double.isNaN(r1)
            double r1 = r1 * r5
            double r5 = (double) r4
            int r7 = (r1 > r5 ? 1 : (r1 == r5 ? 0 : -1))
            if (r7 > 0) goto L3a
            if (r3 >= r4) goto Lb8
            goto L3a
        Lb8:
            if (r0 != 0) goto Lbb
            goto Ld1
        Lbb:
            int r1 = r0.getWidth()
            int r2 = r0.getHeight()
            int r1 = r1 * r2
            int r2 = r12.getWidth()
            int r3 = r12.getHeight()
            int r2 = r2 * r3
            if (r1 > r2) goto L3a
        Ld1:
            r0 = r12
            goto L3a
        Ld4:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.ads.MediationUtils.findClosestSize(android.content.Context, com.google.android.gms.ads.AdSize, java.util.List):com.google.android.gms.ads.AdSize");
    }
}
