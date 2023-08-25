package com.daaw;

import android.util.Log;
import org.conscrypt.NativeConstants;
/* loaded from: classes2.dex */
public final class ej5 implements Runnable {
    public final /* synthetic */ int p;
    public final /* synthetic */ String q;
    public final /* synthetic */ Object r;
    public final /* synthetic */ Object s;
    public final /* synthetic */ Object t;
    public final /* synthetic */ om5 u;

    public ej5(om5 om5Var, int i, String str, Object obj, Object obj2, Object obj3) {
        this.u = om5Var;
        this.p = i;
        this.q = str;
        this.r = obj;
        this.s = obj2;
        this.t = obj3;
    }

    @Override // java.lang.Runnable
    public final void run() {
        char c;
        long j;
        char c2;
        long j2;
        om5 om5Var;
        char c3;
        l36 F = this.u.a.F();
        if (!F.m()) {
            Log.println(6, this.u.C(), "Persisted config not initialized. Not logging error/warn");
            return;
        }
        om5 om5Var2 = this.u;
        c = om5Var2.c;
        if (c == 0) {
            if (om5Var2.a.z().H()) {
                om5Var = this.u;
                om5Var.a.a();
                c3 = 'C';
            } else {
                om5Var = this.u;
                om5Var.a.a();
                c3 = 'c';
            }
            om5Var.c = c3;
        }
        om5 om5Var3 = this.u;
        j = om5Var3.d;
        if (j < 0) {
            om5Var3.a.z().p();
            om5Var3.d = 74029L;
        }
        char charAt = "01VDIWEA?".charAt(this.p);
        om5 om5Var4 = this.u;
        c2 = om5Var4.c;
        j2 = om5Var4.d;
        String str = "2" + charAt + c2 + j2 + ":" + om5.A(true, this.q, this.r, this.s, this.t);
        if (str.length() > 1024) {
            str = this.q.substring(0, NativeConstants.SSL_MODE_SEND_FALLBACK_SCSV);
        }
        e16 e16Var = F.d;
        if (e16Var != null) {
            e16Var.b(str, 1L);
        }
    }
}
