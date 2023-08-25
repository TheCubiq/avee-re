package com.daaw;

import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
/* renamed from: com.daaw.nb */
/* loaded from: classes2.dex */
public class C2272nb {

    /* renamed from: a */
    public final Float f19772a;

    /* renamed from: b */
    public final boolean f19773b;

    public C2272nb(Float f, boolean z) {
        this.f19773b = z;
        this.f19772a = f;
    }

    /* renamed from: a */
    public static C2272nb m15349a(Context context) {
        Float f = null;
        boolean z = false;
        try {
            Intent registerReceiver = context.registerReceiver(null, new IntentFilter("android.intent.action.BATTERY_CHANGED"));
            if (registerReceiver != null) {
                z = m15345e(registerReceiver);
                f = m15346d(registerReceiver);
            }
        } catch (IllegalStateException e) {
            ml0.m15976f().m15977e("An error occurred getting battery state.", e);
        }
        return new C2272nb(f, z);
    }

    /* renamed from: d */
    public static Float m15346d(Intent intent) {
        int intExtra = intent.getIntExtra("level", -1);
        int intExtra2 = intent.getIntExtra("scale", -1);
        if (intExtra == -1 || intExtra2 == -1) {
            return null;
        }
        return Float.valueOf(intExtra / intExtra2);
    }

    /* renamed from: e */
    public static boolean m15345e(Intent intent) {
        int intExtra = intent.getIntExtra("status", -1);
        if (intExtra == -1) {
            return false;
        }
        return intExtra == 2 || intExtra == 5;
    }

    /* renamed from: b */
    public Float m15348b() {
        return this.f19772a;
    }

    /* renamed from: c */
    public int m15347c() {
        Float f;
        if (!this.f19773b || (f = this.f19772a) == null) {
            return 1;
        }
        return ((double) f.floatValue()) < 0.99d ? 2 : 3;
    }
}
