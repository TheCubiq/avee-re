package com.daaw;
/* loaded from: classes2.dex */
public final class q18 {
    public static volatile y38 a = y38.c();
    public static final Object b = new Object();

    /* JADX WARN: Can't wrap try/catch for region: R(10:18|(1:20)(7:32|(1:34)(1:40)|35|(2:37|(1:39))|27|28|29)|21|22|23|24|(1:26)|27|28|29) */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static boolean a(android.content.Context r5, android.net.Uri r6) {
        /*
            java.lang.String r6 = r6.getAuthority()
            java.lang.String r0 = "com.google.android.gms.phenotype"
            boolean r0 = r0.equals(r6)
            r1 = 0
            if (r0 != 0) goto L17
            java.lang.String r5 = java.lang.String.valueOf(r6)
            java.lang.String r6 = " is an unsupported authority. Only com.google.android.gms.phenotype authority is supported."
            r5.concat(r6)
            return r1
        L17:
            com.daaw.y38 r6 = com.daaw.q18.a
            boolean r6 = r6.b()
            if (r6 == 0) goto L2c
        L1f:
            com.daaw.y38 r5 = com.daaw.q18.a
            java.lang.Object r5 = r5.a()
            java.lang.Boolean r5 = (java.lang.Boolean) r5
            boolean r5 = r5.booleanValue()
            return r5
        L2c:
            java.lang.Object r6 = com.daaw.q18.b
            monitor-enter(r6)
            com.daaw.y38 r0 = com.daaw.q18.a     // Catch: java.lang.Throwable -> L90
            boolean r0 = r0.b()     // Catch: java.lang.Throwable -> L90
            if (r0 == 0) goto L45
            com.daaw.y38 r5 = com.daaw.q18.a     // Catch: java.lang.Throwable -> L90
            java.lang.Object r5 = r5.a()     // Catch: java.lang.Throwable -> L90
            java.lang.Boolean r5 = (java.lang.Boolean) r5     // Catch: java.lang.Throwable -> L90
            boolean r5 = r5.booleanValue()     // Catch: java.lang.Throwable -> L90
            monitor-exit(r6)     // Catch: java.lang.Throwable -> L90
            return r5
        L45:
            java.lang.String r0 = "com.google.android.gms"
            java.lang.String r2 = r5.getPackageName()     // Catch: java.lang.Throwable -> L90
            boolean r0 = r0.equals(r2)     // Catch: java.lang.Throwable -> L90
            if (r0 == 0) goto L52
            goto L73
        L52:
            android.content.pm.PackageManager r0 = r5.getPackageManager()     // Catch: java.lang.Throwable -> L90
            java.lang.String r2 = "com.google.android.gms.phenotype"
            int r3 = android.os.Build.VERSION.SDK_INT     // Catch: java.lang.Throwable -> L90
            r4 = 29
            if (r3 >= r4) goto L60
            r3 = 0
            goto L62
        L60:
            r3 = 268435456(0x10000000, float:2.5243549E-29)
        L62:
            android.content.pm.ProviderInfo r0 = r0.resolveContentProvider(r2, r3)     // Catch: java.lang.Throwable -> L90
            if (r0 == 0) goto L84
            java.lang.String r2 = "com.google.android.gms"
            java.lang.String r0 = r0.packageName     // Catch: java.lang.Throwable -> L90
            boolean r0 = r2.equals(r0)     // Catch: java.lang.Throwable -> L90
            if (r0 != 0) goto L73
            goto L84
        L73:
            android.content.pm.PackageManager r5 = r5.getPackageManager()     // Catch: java.lang.Throwable -> L90
            java.lang.String r0 = "com.google.android.gms"
            android.content.pm.ApplicationInfo r5 = r5.getApplicationInfo(r0, r1)     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L84 java.lang.Throwable -> L90
            int r5 = r5.flags     // Catch: java.lang.Throwable -> L90
            r5 = r5 & 129(0x81, float:1.81E-43)
            if (r5 == 0) goto L84
            r1 = 1
        L84:
            java.lang.Boolean r5 = java.lang.Boolean.valueOf(r1)     // Catch: java.lang.Throwable -> L90
            com.daaw.y38 r5 = com.daaw.y38.d(r5)     // Catch: java.lang.Throwable -> L90
            com.daaw.q18.a = r5     // Catch: java.lang.Throwable -> L90
            monitor-exit(r6)     // Catch: java.lang.Throwable -> L90
            goto L1f
        L90:
            r5 = move-exception
            monitor-exit(r6)     // Catch: java.lang.Throwable -> L90
            goto L94
        L93:
            throw r5
        L94:
            goto L93
        */
        throw new UnsupportedOperationException("Method not decompiled: com.daaw.q18.a(android.content.Context, android.net.Uri):boolean");
    }
}
