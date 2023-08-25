package com.daaw;

import android.os.ConditionVariable;
/* loaded from: classes.dex */
public final class ml2 implements Runnable {

    /* renamed from: p */
    public final /* synthetic */ nl2 f18959p;

    public ml2(nl2 nl2Var) {
        this.f18959p = nl2Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        ConditionVariable conditionVariable;
        boolean z;
        wm2 wm2Var;
        ConditionVariable conditionVariable2;
        if (this.f18959p.f20236b != null) {
            return;
        }
        conditionVariable = nl2.f20232c;
        synchronized (conditionVariable) {
            if (this.f18959p.f20236b != null) {
                return;
            }
            boolean z2 = false;
            try {
                z = ((Boolean) g93.f10668e2.m16137e()).booleanValue();
            } catch (IllegalStateException unused) {
                z = false;
            }
            if (z) {
                try {
                    wm2Var = this.f18959p.f20235a;
                    nl2.f20233d = ku6.m17428b(wm2Var.f31324a, "ADSHIELD", null);
                } catch (Throwable unused2) {
                }
            }
            z2 = z;
            this.f18959p.f20236b = Boolean.valueOf(z2);
            conditionVariable2 = nl2.f20232c;
            conditionVariable2.open();
        }
    }
}
