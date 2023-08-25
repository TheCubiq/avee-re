package com.daaw;

import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
/* loaded from: classes2.dex */
public class nb {
    public final Float a;
    public final boolean b;

    public nb(Float f, boolean z) {
        this.b = z;
        this.a = f;
    }

    public static nb a(Context context) {
        Float f = null;
        boolean z = false;
        try {
            Intent registerReceiver = context.registerReceiver(null, new IntentFilter("android.intent.action.BATTERY_CHANGED"));
            if (registerReceiver != null) {
                z = e(registerReceiver);
                f = d(registerReceiver);
            }
        } catch (IllegalStateException e) {
            ml0.f().e("An error occurred getting battery state.", e);
        }
        return new nb(f, z);
    }

    public static Float d(Intent intent) {
        int intExtra = intent.getIntExtra("level", -1);
        int intExtra2 = intent.getIntExtra("scale", -1);
        if (intExtra == -1 || intExtra2 == -1) {
            return null;
        }
        return Float.valueOf(intExtra / intExtra2);
    }

    public static boolean e(Intent intent) {
        int intExtra = intent.getIntExtra("status", -1);
        if (intExtra == -1) {
            return false;
        }
        return intExtra == 2 || intExtra == 5;
    }

    public Float b() {
        return this.a;
    }

    public int c() {
        Float f;
        if (!this.b || (f = this.a) == null) {
            return 1;
        }
        return ((double) f.floatValue()) < 0.99d ? 2 : 3;
    }
}
