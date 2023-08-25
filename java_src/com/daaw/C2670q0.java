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
/* renamed from: com.daaw.q0 */
/* loaded from: classes.dex */
public class C2670q0 extends C3866zk {

    /* renamed from: c */
    public static InterfaceC2675e f23579c;

    /* renamed from: com.daaw.q0$a */
    /* loaded from: classes.dex */
    public class RunnableC2671a implements Runnable {

        /* renamed from: p */
        public final /* synthetic */ String[] f23580p;

        /* renamed from: q */
        public final /* synthetic */ Activity f23581q;

        /* renamed from: r */
        public final /* synthetic */ int f23582r;

        public RunnableC2671a(String[] strArr, Activity activity, int i) {
            this.f23580p = strArr;
            this.f23581q = activity;
            this.f23582r = i;
        }

        @Override // java.lang.Runnable
        public void run() {
            int[] iArr = new int[this.f23580p.length];
            PackageManager packageManager = this.f23581q.getPackageManager();
            String packageName = this.f23581q.getPackageName();
            int length = this.f23580p.length;
            for (int i = 0; i < length; i++) {
                iArr[i] = packageManager.checkPermission(this.f23580p[i], packageName);
            }
            ((InterfaceC2674d) this.f23581q).onRequestPermissionsResult(this.f23582r, this.f23580p, iArr);
        }
    }

    /* renamed from: com.daaw.q0$b */
    /* loaded from: classes.dex */
    public static class C2672b {
        /* renamed from: a */
        public static void m12824a(Activity activity) {
            activity.finishAffinity();
        }

        /* renamed from: b */
        public static void m12823b(Activity activity, Intent intent, int i, Bundle bundle) {
            activity.startActivityForResult(intent, i, bundle);
        }

        /* renamed from: c */
        public static void m12822c(Activity activity, IntentSender intentSender, int i, Intent intent, int i2, int i3, int i4, Bundle bundle) {
            activity.startIntentSenderForResult(intentSender, i, intent, i2, i3, i4, bundle);
        }
    }

    /* renamed from: com.daaw.q0$c */
    /* loaded from: classes.dex */
    public static class C2673c {
        /* renamed from: a */
        public static void m12821a(Object obj) {
            ((kc1.InterfaceC1939a) obj).m17809a();
        }

        /* renamed from: b */
        public static void m12820b(Activity activity, String[] strArr, int i) {
            activity.requestPermissions(strArr, i);
        }

        /* renamed from: c */
        public static boolean m12819c(Activity activity, String str) {
            return activity.shouldShowRequestPermissionRationale(str);
        }
    }

    /* renamed from: com.daaw.q0$d */
    /* loaded from: classes.dex */
    public interface InterfaceC2674d {
        void onRequestPermissionsResult(int i, String[] strArr, int[] iArr);
    }

    /* renamed from: com.daaw.q0$e */
    /* loaded from: classes.dex */
    public interface InterfaceC2675e {
        /* renamed from: a */
        boolean m12818a(Activity activity, String[] strArr, int i);
    }

    /* renamed from: com.daaw.q0$f */
    /* loaded from: classes.dex */
    public interface InterfaceC2676f {
        /* renamed from: b */
        void mo12817b(int i);
    }

    /* renamed from: l */
    public static void m12830l(Activity activity) {
        C2672b.m12824a(activity);
    }

    /* renamed from: m */
    public static /* synthetic */ void m12829m(Activity activity) {
        if (activity.isFinishing() || C3001t0.m9668i(activity)) {
            return;
        }
        activity.recreate();
    }

    /* renamed from: n */
    public static void m12828n(final Activity activity) {
        if (Build.VERSION.SDK_INT >= 28) {
            activity.recreate();
        } else {
            new Handler(activity.getMainLooper()).post(new Runnable() { // from class: com.daaw.p0
                @Override // java.lang.Runnable
                public final void run() {
                    C2670q0.m12829m(activity);
                }
            });
        }
    }

    /* renamed from: o */
    public static void m12827o(Activity activity, String[] strArr, int i) {
        InterfaceC2675e interfaceC2675e = f23579c;
        if (interfaceC2675e == null || !interfaceC2675e.m12818a(activity, strArr, i)) {
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
                if (activity instanceof InterfaceC2676f) {
                    ((InterfaceC2676f) activity).mo12817b(i);
                }
                C2673c.m12820b(activity, strArr, i);
            } else if (activity instanceof InterfaceC2674d) {
                new Handler(Looper.getMainLooper()).post(new RunnableC2671a(strArr2, activity, i));
            }
        }
    }

    /* renamed from: p */
    public static void m12826p(Activity activity, Intent intent, int i, Bundle bundle) {
        C2672b.m12823b(activity, intent, i, bundle);
    }

    /* renamed from: q */
    public static void m12825q(Activity activity, IntentSender intentSender, int i, Intent intent, int i2, int i3, int i4, Bundle bundle) {
        C2672b.m12822c(activity, intentSender, i, intent, i2, i3, i4, bundle);
    }
}
