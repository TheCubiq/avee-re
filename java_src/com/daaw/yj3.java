package com.daaw;

import android.annotation.TargetApi;
import java.lang.reflect.Method;
@TargetApi(24)
/* loaded from: classes2.dex */
public final class yj3 {
    public static final Method a;
    public static final Method b;

    /* JADX WARN: Removed duplicated region for block: B:17:0x002c A[EXC_TOP_SPLITTER, SYNTHETIC] */
    static {
        /*
            java.lang.Class<java.lang.String> r0 = java.lang.String.class
            int r1 = android.os.Build.VERSION.SDK_INT
            r2 = 0
            r3 = 24
            r4 = 0
            if (r1 < r3) goto L25
            r1 = 4
            java.lang.Class[] r1 = new java.lang.Class[r1]     // Catch: java.lang.NoSuchMethodException -> L25
            java.lang.Class<android.app.job.JobInfo> r5 = android.app.job.JobInfo.class
            r1[r2] = r5     // Catch: java.lang.NoSuchMethodException -> L25
            r5 = 1
            r1[r5] = r0     // Catch: java.lang.NoSuchMethodException -> L25
            r5 = 2
            java.lang.Class r6 = java.lang.Integer.TYPE     // Catch: java.lang.NoSuchMethodException -> L25
            r1[r5] = r6     // Catch: java.lang.NoSuchMethodException -> L25
            r5 = 3
            r1[r5] = r0     // Catch: java.lang.NoSuchMethodException -> L25
            java.lang.Class<android.app.job.JobScheduler> r0 = android.app.job.JobScheduler.class
            java.lang.String r5 = "scheduleAsPackage"
            java.lang.reflect.Method r0 = r0.getDeclaredMethod(r5, r1)     // Catch: java.lang.NoSuchMethodException -> L25
            goto L26
        L25:
            r0 = r4
        L26:
            com.daaw.yj3.a = r0
            int r0 = android.os.Build.VERSION.SDK_INT
            if (r0 < r3) goto L36
            java.lang.Class<android.os.UserHandle> r0 = android.os.UserHandle.class
            java.lang.String r1 = "myUserId"
            java.lang.Class[] r2 = new java.lang.Class[r2]     // Catch: java.lang.NoSuchMethodException -> L36
            java.lang.reflect.Method r4 = r0.getDeclaredMethod(r1, r2)     // Catch: java.lang.NoSuchMethodException -> L36
        L36:
            com.daaw.yj3.b = r4
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.daaw.yj3.<clinit>():void");
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x0037  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static int a(android.content.Context r5, android.app.job.JobInfo r6, java.lang.String r7, java.lang.String r8) {
        /*
            java.lang.String r7 = "jobscheduler"
            java.lang.Object r7 = r5.getSystemService(r7)
            android.app.job.JobScheduler r7 = (android.app.job.JobScheduler) r7
            java.util.Objects.requireNonNull(r7)
            java.lang.reflect.Method r8 = com.daaw.yj3.a
            if (r8 == 0) goto L5b
            java.lang.String r8 = "android.permission.UPDATE_DEVICE_STATS"
            int r5 = r5.checkSelfPermission(r8)
            if (r5 == 0) goto L18
            goto L5b
        L18:
            java.lang.reflect.Method r5 = com.daaw.yj3.b
            r8 = 0
            if (r5 == 0) goto L2e
            java.lang.Class<android.os.UserHandle> r0 = android.os.UserHandle.class
            java.lang.Object[] r1 = new java.lang.Object[r8]     // Catch: java.lang.Throwable -> L2e
            java.lang.Object r5 = r5.invoke(r0, r1)     // Catch: java.lang.Throwable -> L2e
            java.lang.Integer r5 = (java.lang.Integer) r5     // Catch: java.lang.Throwable -> L2e
            if (r5 == 0) goto L2e
            int r5 = r5.intValue()     // Catch: java.lang.Throwable -> L2e
            goto L2f
        L2e:
            r5 = 0
        L2f:
            java.lang.reflect.Method r0 = com.daaw.yj3.a
            java.lang.String r1 = "com.google.android.gms"
            java.lang.String r2 = "UploadAlarm"
            if (r0 == 0) goto L56
            r3 = 4
            java.lang.Object[] r3 = new java.lang.Object[r3]     // Catch: java.lang.Throwable -> L56
            r3[r8] = r6     // Catch: java.lang.Throwable -> L56
            r4 = 1
            r3[r4] = r1     // Catch: java.lang.Throwable -> L56
            r1 = 2
            java.lang.Integer r5 = java.lang.Integer.valueOf(r5)     // Catch: java.lang.Throwable -> L56
            r3[r1] = r5     // Catch: java.lang.Throwable -> L56
            r5 = 3
            r3[r5] = r2     // Catch: java.lang.Throwable -> L56
            java.lang.Object r5 = r0.invoke(r7, r3)     // Catch: java.lang.Throwable -> L56
            java.lang.Integer r5 = (java.lang.Integer) r5     // Catch: java.lang.Throwable -> L56
            if (r5 == 0) goto L5a
            int r8 = r5.intValue()     // Catch: java.lang.Throwable -> L56
            goto L5a
        L56:
            int r8 = r7.schedule(r6)
        L5a:
            return r8
        L5b:
            int r5 = r7.schedule(r6)
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: com.daaw.yj3.a(android.content.Context, android.app.job.JobInfo, java.lang.String, java.lang.String):int");
    }
}
