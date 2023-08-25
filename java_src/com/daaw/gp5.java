package com.daaw;
/* loaded from: classes.dex */
public final class gp5 implements o67 {
    public final /* synthetic */ boolean a;
    public final /* synthetic */ hp5 b;

    public gp5(hp5 hp5Var, boolean z) {
        this.b = hp5Var;
        this.a = z;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Removed duplicated region for block: B:22:0x005b  */
    @Override // com.daaw.o67
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final /* bridge */ /* synthetic */ void a(java.lang.Object r8) {
        /*
            r7 = this;
            android.os.Bundle r8 = (android.os.Bundle) r8
            com.daaw.hp5 r0 = r7.b
            boolean r0 = r0.a()
            if (r0 == 0) goto Lb
            return
        Lb:
            java.lang.String r0 = "ad_types"
            java.lang.Object r0 = r8.get(r0)
            boolean r1 = r0 instanceof java.util.List
            if (r1 == 0) goto L18
            java.util.List r0 = (java.util.List) r0
            goto L22
        L18:
            boolean r1 = r0 instanceof java.lang.String[]
            if (r1 == 0) goto L48
            java.lang.String[] r0 = (java.lang.String[]) r0
            java.util.List r0 = java.util.Arrays.asList(r0)
        L22:
            java.util.ArrayList r1 = new java.util.ArrayList
            int r2 = r0.size()
            r1.<init>(r2)
            java.util.Iterator r0 = r0.iterator()
        L2f:
            boolean r2 = r0.hasNext()
            if (r2 == 0) goto L43
            java.lang.Object r2 = r0.next()
            boolean r3 = r2 instanceof java.lang.String
            if (r3 == 0) goto L2f
            java.lang.String r2 = (java.lang.String) r2
            r1.add(r2)
            goto L2f
        L43:
            java.util.List r0 = java.util.Collections.unmodifiableList(r1)
            goto L4c
        L48:
            java.util.List r0 = java.util.Collections.emptyList()
        L4c:
            java.util.ArrayList r4 = new java.util.ArrayList
            r4.<init>()
            java.util.Iterator r0 = r0.iterator()
        L55:
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto Laf
            java.lang.Object r1 = r0.next()
            java.lang.String r1 = (java.lang.String) r1
            int r2 = r1.hashCode()
            r3 = 3
            r5 = 2
            r6 = 1
            switch(r2) {
                case -1396342996: goto L8a;
                case -1052618729: goto L80;
                case -239580146: goto L76;
                case 604727084: goto L6c;
                default: goto L6b;
            }
        L6b:
            goto L94
        L6c:
            java.lang.String r2 = "interstitial"
            boolean r1 = r1.equals(r2)
            if (r1 == 0) goto L94
            r1 = 1
            goto L95
        L76:
            java.lang.String r2 = "rewarded"
            boolean r1 = r1.equals(r2)
            if (r1 == 0) goto L94
            r1 = 3
            goto L95
        L80:
            java.lang.String r2 = "native"
            boolean r1 = r1.equals(r2)
            if (r1 == 0) goto L94
            r1 = 2
            goto L95
        L8a:
            java.lang.String r2 = "banner"
            boolean r1 = r1.equals(r2)
            if (r1 == 0) goto L94
            r1 = 0
            goto L95
        L94:
            r1 = -1
        L95:
            if (r1 == 0) goto La9
            if (r1 == r6) goto La6
            if (r1 == r5) goto La3
            if (r1 == r3) goto La0
            com.daaw.y43 r1 = com.daaw.y43.AD_FORMAT_TYPE_UNSPECIFIED
            goto Lab
        La0:
            com.daaw.y43 r1 = com.daaw.y43.REWARD_BASED_VIDEO_AD
            goto Lab
        La3:
            com.daaw.y43 r1 = com.daaw.y43.NATIVE_APP_INSTALL
            goto Lab
        La6:
            com.daaw.y43 r1 = com.daaw.y43.INTERSTITIAL
            goto Lab
        La9:
            com.daaw.y43 r1 = com.daaw.y43.BANNER
        Lab:
            r4.add(r1)
            goto L55
        Laf:
            com.daaw.hp5 r0 = r7.b
            com.daaw.x63 r6 = com.daaw.hp5.c(r0, r8)
            com.daaw.hp5 r0 = r7.b
            com.daaw.o63 r5 = com.daaw.hp5.b(r0, r8)
            com.daaw.hp5 r8 = r7.b
            com.daaw.so5 r8 = r8.b
            boolean r3 = r7.a
            com.daaw.fp5 r0 = new com.daaw.fp5
            r1 = r0
            r2 = r7
            r1.<init>()
            r8.a(r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.daaw.gp5.a(java.lang.Object):void");
    }

    @Override // com.daaw.o67
    public final void b(Throwable th) {
        k04.zzg("Failed to get signals bundle");
    }
}
