package com.daaw;

import android.app.Activity;
import android.content.Intent;
import android.content.IntentSender;
import android.content.pm.PackageManager;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.text.TextUtils;
import com.daaw.kc1;
import java.util.Arrays;
import java.util.HashSet;
/* loaded from: classes.dex */
public class q0 extends zk {
    public static e c;

    /* loaded from: classes.dex */
    public class a implements Runnable {
        public final /* synthetic */ String[] p;
        public final /* synthetic */ Activity q;
        public final /* synthetic */ int r;

        public a(String[] strArr, Activity activity, int i) {
            this.p = strArr;
            this.q = activity;
            this.r = i;
        }

        @Override // java.lang.Runnable
        public void run() {
            int[] iArr = new int[this.p.length];
            PackageManager packageManager = this.q.getPackageManager();
            String packageName = this.q.getPackageName();
            int length = this.p.length;
            for (int i = 0; i < length; i++) {
                iArr[i] = packageManager.checkPermission(this.p[i], packageName);
            }
            ((d) this.q).onRequestPermissionsResult(this.r, this.p, iArr);
        }
    }

    /* loaded from: classes.dex */
    public static class b {
        public static void a(Activity activity) {
            activity.finishAffinity();
        }

        public static void b(Activity activity, Intent intent, int i, Bundle bundle) {
            activity.startActivityForResult(intent, i, bundle);
        }

        public static void c(Activity activity, IntentSender intentSender, int i, Intent intent, int i2, int i3, int i4, Bundle bundle) {
            activity.startIntentSenderForResult(intentSender, i, intent, i2, i3, i4, bundle);
        }
    }

    /* loaded from: classes.dex */
    public static class c {
        public static void a(Object obj) {
            ((kc1.a) obj).a();
        }

        public static void b(Activity activity, String[] strArr, int i) {
            activity.requestPermissions(strArr, i);
        }

        public static boolean c(Activity activity, String str) {
            return activity.shouldShowRequestPermissionRationale(str);
        }
    }

    /* loaded from: classes.dex */
    public interface d {
        void onRequestPermissionsResult(int i, String[] strArr, int[] iArr);
    }

    /* loaded from: classes.dex */
    public interface e {
        boolean a(Activity activity, String[] strArr, int i);
    }

    /* loaded from: classes.dex */
    public interface f {
        void b(int i);
    }

    public static void l(Activity activity) {
        b.a(activity);
    }

    public static /* synthetic */ void m(Activity activity) {
        if (activity.isFinishing() || t0.i(activity)) {
            return;
        }
        activity.recreate();
    }

    public static void n(final Activity activity) {
        if (Build.VERSION.SDK_INT >= 28) {
            activity.recreate();
        } else {
            new Handler(activity.getMainLooper()).post(new Runnable() { // from class: com.daaw.p0
                @Override // java.lang.Runnable
                public final void run() {
                    q0.m(activity);
                }
            });
        }
    }

    public static void o(Activity activity, String[] strArr, int i) {
        e eVar = c;
        if (eVar == null || !eVar.a(activity, strArr, i)) {
            HashSet hashSet = new HashSet();
            for (int i2 = 0; i2 < strArr.length; i2++) {
                if (TextUtils.isEmpty(strArr[i2])) {
                    throw new IllegalArgumentException("Permission request for permissions " + Arrays.toString(strArr) + " must not contain null or empty values");
                }
                if (Build.VERSION.SDK_INT < 33 && TextUtils.equals(strArr[i2], "android.permission.POST_NOTIFICATIONS")) {
                    hashSet.add(Integer.valueOf(i2));
                }
            }
            int size = hashSet.size();
            String[] strArr2 = size > 0 ? new String[strArr.length - size] : strArr;
            if (size > 0) {
                if (size == strArr.length) {
                    return;
                }
                int i3 = 0;
                for (int i4 = 0; i4 < strArr.length; i4++) {
                    if (!hashSet.contains(Integer.valueOf(i4))) {
                        strArr2[i3] = strArr[i4];
                        i3++;
                    }
                }
            }
            if (Build.VERSION.SDK_INT >= 23) {
                if (activity instanceof f) {
                    ((f) activity).b(i);
                }
                c.b(activity, strArr, i);
            } else if (activity instanceof d) {
                new Handler(Looper.getMainLooper()).post(new a(strArr2, activity, i));
            }
        }
    }

    public static void p(Activity activity, Intent intent, int i, Bundle bundle) {
        b.b(activity, intent, i, bundle);
    }

    public static void q(Activity activity, IntentSender intentSender, int i, Intent intent, int i2, int i3, int i4, Bundle bundle) {
        b.c(activity, intentSender, i, intent, i2, i3, i4, bundle);
    }
}
