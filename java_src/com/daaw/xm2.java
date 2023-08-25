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

    /* renamed from: a */
    public long f32795a = -1;

    /* renamed from: b */
    public long f32796b = -1;

    /* renamed from: c */
    public long f32797c = -1;

    /* renamed from: d */
    public long f32798d = -1;

    /* renamed from: e */
    public long f32799e = -1;

    /* renamed from: f */
    public long f32800f = -1;

    /* renamed from: g */
    public long f32801g = -1;

    /* renamed from: h */
    public long f32802h = -1;

    /* renamed from: l */
    public static DisplayMetrics m4992l(Context context) {
        Display defaultDisplay = ((WindowManager) context.getSystemService("window")).getDefaultDisplay();
        DisplayMetrics displayMetrics = new DisplayMetrics();
        try {
            defaultDisplay.getRealMetrics(displayMetrics);
        } catch (NoSuchMethodError unused) {
            defaultDisplay.getMetrics(displayMetrics);
        }
        return displayMetrics;
    }

    /* renamed from: m */
    public static boolean m4991m(View view) {
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

    /* renamed from: a */
    public final long m5003a() {
        return this.f32801g;
    }

    /* renamed from: b */
    public final long m5002b() {
        return this.f32799e;
    }

    /* renamed from: c */
    public final long m5001c() {
        return this.f32795a;
    }

    /* renamed from: d */
    public final long m5000d() {
        return this.f32797c;
    }

    /* renamed from: e */
    public final long m4999e() {
        return this.f32802h;
    }

    /* renamed from: f */
    public final long m4998f() {
        return this.f32800f;
    }

    /* renamed from: g */
    public final long m4997g() {
        return this.f32796b;
    }

    /* renamed from: h */
    public final long m4996h() {
        return this.f32798d;
    }

    /* renamed from: i */
    public final void m4995i() {
        this.f32802h = this.f32801g;
        this.f32801g = SystemClock.uptimeMillis();
    }

    /* renamed from: j */
    public final void m4994j() {
        this.f32796b = this.f32795a;
        this.f32795a = SystemClock.uptimeMillis();
    }

    /* renamed from: k */
    public final void m4993k(Context context, View view) {
        this.f32798d = this.f32797c;
        this.f32797c = SystemClock.uptimeMillis();
        long j = this.f32799e;
        if (j != -1) {
            this.f32800f = j;
        }
        DisplayMetrics m4992l = m4992l(context);
        int i = m4992l.widthPixels;
        int i2 = m4992l.heightPixels;
        int min = Math.min(view.getWidth(), m4992l.widthPixels) * Math.min(view.getHeight(), m4992l.heightPixels);
        if (min + min < i * i2 && !(min == 0 && m4991m(view))) {
            this.f32799e = -1L;
        } else {
            this.f32799e = this.f32797c;
        }
    }
}
