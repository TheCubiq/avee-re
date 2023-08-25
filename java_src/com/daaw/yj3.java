package com.daaw;

import android.annotation.TargetApi;
import android.app.job.JobInfo;
import android.app.job.JobScheduler;
import android.content.Context;
import android.os.Build;
import android.os.UserHandle;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Objects;
@TargetApi(24)
/* loaded from: classes2.dex */
public final class yj3 {

    /* renamed from: a */
    public static final Method f33734a;

    /* renamed from: b */
    public static final Method f33735b;

    /* JADX WARN: Removed duplicated region for block: B:17:0x002c A[EXC_TOP_SPLITTER, SYNTHETIC] */
    static {
        Method method;
        Method method2 = null;
        if (Build.VERSION.SDK_INT >= 24) {
            try {
                method = JobScheduler.class.getDeclaredMethod("scheduleAsPackage", JobInfo.class, String.class, Integer.TYPE, String.class);
            } catch (NoSuchMethodException unused) {
            }
            f33734a = method;
            if (Build.VERSION.SDK_INT >= 24) {
                try {
                    method2 = UserHandle.class.getDeclaredMethod("myUserId", new Class[0]);
                } catch (NoSuchMethodException unused2) {
                }
            }
            f33735b = method2;
        }
        method = null;
        f33734a = method;
        if (Build.VERSION.SDK_INT >= 24) {
        }
        f33735b = method2;
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x0037  */
    /* renamed from: a */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static int m3649a(Context context, JobInfo jobInfo, String str, String str2) {
        Integer num;
        int intValue;
        Method method;
        JobScheduler jobScheduler = (JobScheduler) context.getSystemService("jobscheduler");
        Objects.requireNonNull(jobScheduler);
        if (f33734a == null || context.checkSelfPermission("android.permission.UPDATE_DEVICE_STATS") != 0) {
            return jobScheduler.schedule(jobInfo);
        }
        Method method2 = f33735b;
        if (method2 != null) {
            try {
                num = (Integer) method2.invoke(UserHandle.class, new Object[0]);
            } catch (IllegalAccessException | InvocationTargetException unused) {
            }
            if (num != null) {
                intValue = num.intValue();
                method = f33734a;
                if (method != null) {
                    try {
                        Integer num2 = (Integer) method.invoke(jobScheduler, jobInfo, "com.google.android.gms", Integer.valueOf(intValue), "UploadAlarm");
                        if (num2 != null) {
                            return num2.intValue();
                        }
                        return 0;
                    } catch (IllegalAccessException | InvocationTargetException unused2) {
                    }
                }
                return jobScheduler.schedule(jobInfo);
            }
        }
        intValue = 0;
        method = f33734a;
        if (method != null) {
        }
        return jobScheduler.schedule(jobInfo);
    }
}
