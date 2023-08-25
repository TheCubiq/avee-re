package com.daaw;

import android.os.Handler;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;
/* loaded from: classes.dex */
public final class kw8 {

    /* renamed from: a */
    public final CopyOnWriteArrayList f16793a = new CopyOnWriteArrayList();

    /* renamed from: a */
    public final void m17374a(Handler handler, lw8 lw8Var) {
        m17372c(lw8Var);
        this.f16793a.add(new jw8(handler, lw8Var));
    }

    /* renamed from: b */
    public final void m17373b(final int i, final long j, final long j2) {
        boolean z;
        Handler handler;
        Iterator it = this.f16793a.iterator();
        while (it.hasNext()) {
            final jw8 jw8Var = (jw8) it.next();
            z = jw8Var.f15490c;
            if (!z) {
                handler = jw8Var.f15488a;
                handler.post(new Runnable() { // from class: com.daaw.iw8
                    @Override // java.lang.Runnable
                    public final void run() {
                        lw8 lw8Var;
                        jw8 jw8Var2 = jw8.this;
                        int i2 = i;
                        long j3 = j;
                        long j4 = j2;
                        lw8Var = jw8Var2.f15489b;
                        lw8Var.mo9156P(i2, j3, j4);
                    }
                });
            }
        }
    }

    /* renamed from: c */
    public final void m17372c(lw8 lw8Var) {
        lw8 lw8Var2;
        Iterator it = this.f16793a.iterator();
        while (it.hasNext()) {
            jw8 jw8Var = (jw8) it.next();
            lw8Var2 = jw8Var.f15489b;
            if (lw8Var2 == lw8Var) {
                jw8Var.m18195c();
                this.f16793a.remove(jw8Var);
            }
        }
    }
}
