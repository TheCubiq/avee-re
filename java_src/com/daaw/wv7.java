package com.daaw;

import android.os.Build;
import android.os.UserManager;
/* loaded from: classes2.dex */
public final class wv7 {
    public static UserManager a;
    public static volatile boolean b = !b();

    /* JADX WARN: Code restructure failed: missing block: B:25:0x003d, code lost:
        if (r4.isUserRunning(android.os.Process.myUserHandle()) == false) goto L27;
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x003f, code lost:
        r7 = true;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static boolean a(android.content.Context r7) {
        /*
            boolean r0 = b()
            r1 = 0
            if (r0 == 0) goto L56
            boolean r0 = com.daaw.wv7.b
            if (r0 == 0) goto Lc
            goto L56
        Lc:
            java.lang.Class<com.daaw.wv7> r0 = com.daaw.wv7.class
            monitor-enter(r0)
            boolean r2 = com.daaw.wv7.b     // Catch: java.lang.Throwable -> L53
            if (r2 == 0) goto L15
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L53
            goto L56
        L15:
            r2 = 1
            r3 = 1
        L17:
            r4 = 2
            r5 = 0
            if (r3 > r4) goto L46
            android.os.UserManager r4 = com.daaw.wv7.a     // Catch: java.lang.Throwable -> L53
            if (r4 != 0) goto L29
            java.lang.Class<android.os.UserManager> r4 = android.os.UserManager.class
            java.lang.Object r4 = r7.getSystemService(r4)     // Catch: java.lang.Throwable -> L53
            android.os.UserManager r4 = (android.os.UserManager) r4     // Catch: java.lang.Throwable -> L53
            com.daaw.wv7.a = r4     // Catch: java.lang.Throwable -> L53
        L29:
            android.os.UserManager r4 = com.daaw.wv7.a     // Catch: java.lang.Throwable -> L53
            if (r4 != 0) goto L2f
            r7 = 1
            goto L4b
        L2f:
            boolean r6 = r4.isUserUnlocked()     // Catch: java.lang.NullPointerException -> L41 java.lang.Throwable -> L53
            if (r6 != 0) goto L3f
            android.os.UserHandle r6 = android.os.Process.myUserHandle()     // Catch: java.lang.NullPointerException -> L41 java.lang.Throwable -> L53
            boolean r7 = r4.isUserRunning(r6)     // Catch: java.lang.NullPointerException -> L41 java.lang.Throwable -> L53
            if (r7 != 0) goto L46
        L3f:
            r7 = 1
            goto L47
        L41:
            com.daaw.wv7.a = r5     // Catch: java.lang.Throwable -> L53
            int r3 = r3 + 1
            goto L17
        L46:
            r7 = 0
        L47:
            if (r7 == 0) goto L4b
            com.daaw.wv7.a = r5     // Catch: java.lang.Throwable -> L53
        L4b:
            if (r7 == 0) goto L4f
            com.daaw.wv7.b = r2     // Catch: java.lang.Throwable -> L53
        L4f:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L53
            if (r7 != 0) goto L56
            return r2
        L53:
            r7 = move-exception
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L53
            throw r7
        L56:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.daaw.wv7.a(android.content.Context):boolean");
    }

    public static boolean b() {
        return Build.VERSION.SDK_INT >= 24;
    }
}
