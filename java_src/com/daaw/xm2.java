package com.daaw;

import android.content.Context;
import android.os.SystemClock;
import android.util.DisplayMetrics;
import android.view.Display;
import android.view.View;
import android.view.ViewGroup;
import android.view.WindowManager;
/* loaded from: classes.dex */
public final class xm2 {
    public long a = -1;
    public long b = -1;
    public long c = -1;
    public long d = -1;
    public long e = -1;
    public long f = -1;
    public long g = -1;
    public long h = -1;

    public static DisplayMetrics l(Context context) {
        Display defaultDisplay = ((WindowManager) context.getSystemService("window")).getDefaultDisplay();
        DisplayMetrics displayMetrics = new DisplayMetrics();
        try {
            defaultDisplay.getRealMetrics(displayMetrics);
        } catch (NoSuchMethodError unused) {
            defaultDisplay.getMetrics(displayMetrics);
        }
        return displayMetrics;
    }

    public static boolean m(View view) {
        try {
            if (view.getClass().getName().contains("DebugGestureViewWrapper")) {
                view = ((ViewGroup) view).getChildAt(0);
            }
            Object invoke = view.getClass().getMethod("getAdConfiguration", new Class[0]).invoke(view, new Object[0]);
            String str = (String) invoke.getClass().getMethod("adTypeToString", Integer.TYPE).invoke(null, Integer.valueOf(((Integer) invoke.getClass().getField("adType").get(invoke)).intValue()));
            if (!str.contains("INTERSTITIAL") && !str.contains("APP_OPEN")) {
                if (!str.contains("REWARDED")) {
                    return false;
                }
            }
            return true;
        } catch (ReflectiveOperationException | SecurityException unused) {
            return false;
        }
    }

    public final long a() {
        return this.g;
    }

    public final long b() {
        return this.e;
    }

    public final long c() {
        return this.a;
    }

    public final long d() {
        return this.c;
    }

    public final long e() {
        return this.h;
    }

    public final long f() {
        return this.f;
    }

    public final long g() {
        return this.b;
    }

    public final long h() {
        return this.d;
    }

    public final void i() {
        this.h = this.g;
        this.g = SystemClock.uptimeMillis();
    }

    public final void j() {
        this.b = this.a;
        this.a = SystemClock.uptimeMillis();
    }

    public final void k(Context context, View view) {
        this.d = this.c;
        this.c = SystemClock.uptimeMillis();
        long j = this.e;
        if (j != -1) {
            this.f = j;
        }
        DisplayMetrics l = l(context);
        int i = l.widthPixels;
        int i2 = l.heightPixels;
        int min = Math.min(view.getWidth(), l.widthPixels) * Math.min(view.getHeight(), l.heightPixels);
        if (min + min < i * i2 && !(min == 0 && m(view))) {
            this.e = -1L;
        } else {
            this.e = this.c;
        }
    }
}
