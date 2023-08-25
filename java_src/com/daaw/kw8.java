package com.daaw;

import android.os.Handler;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;
/* loaded from: classes.dex */
public final class kw8 {
    public final CopyOnWriteArrayList a = new CopyOnWriteArrayList();

    public final void a(Handler handler, lw8 lw8Var) {
        c(lw8Var);
        this.a.add(new jw8(handler, lw8Var));
    }

    public final void b(final int i, final long j, final long j2) {
        boolean z;
        Handler handler;
        Iterator it = this.a.iterator();
        while (it.hasNext()) {
            final jw8 jw8Var = (jw8) it.next();
            z = jw8Var.c;
            if (!z) {
                handler = jw8Var.a;
                handler.post(new Runnable() { // from class: com.daaw.iw8
                    @Override // java.lang.Runnable
                    public final void run() {
                        lw8 lw8Var;
                        jw8 jw8Var2 = jw8.this;
                        int i2 = i;
                        long j3 = j;
                        long j4 = j2;
                        lw8Var = jw8Var2.b;
                        lw8Var.P(i2, j3, j4);
                    }
                });
            }
        }
    }

    public final void c(lw8 lw8Var) {
        lw8 lw8Var2;
        Iterator it = this.a.iterator();
        while (it.hasNext()) {
            jw8 jw8Var = (jw8) it.next();
            lw8Var2 = jw8Var.b;
            if (lw8Var2 == lw8Var) {
                jw8Var.c();
                this.a.remove(jw8Var);
            }
        }
    }
}
