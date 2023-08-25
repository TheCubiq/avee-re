package com.daaw;

import android.os.ConditionVariable;
/* loaded from: classes.dex */
public final class ml2 implements Runnable {
    public final /* synthetic */ nl2 p;

    public ml2(nl2 nl2Var) {
        this.p = nl2Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        ConditionVariable conditionVariable;
        boolean z;
        wm2 wm2Var;
        ConditionVariable conditionVariable2;
        if (this.p.b != null) {
            return;
        }
        conditionVariable = nl2.c;
        synchronized (conditionVariable) {
            if (this.p.b != null) {
                return;
            }
            boolean z2 = false;
            try {
                z = ((Boolean) g93.e2.e()).booleanValue();
            } catch (IllegalStateException unused) {
                z = false;
            }
            if (z) {
                try {
                    wm2Var = this.p.a;
                    nl2.d = ku6.b(wm2Var.a, "ADSHIELD", null);
                } catch (Throwable unused2) {
                }
            }
            z2 = z;
            this.p.b = Boolean.valueOf(z2);
            conditionVariable2 = nl2.c;
            conditionVariable2.open();
        }
    }
}
