package com.daaw;

import android.os.Handler;
import java.io.IOException;
import java.util.Iterator;
import java.util.Objects;
import java.util.concurrent.CopyOnWriteArrayList;
/* loaded from: classes.dex */
public final class yr8 {
    public final int a;
    public final pr8 b;
    public final CopyOnWriteArrayList c;

    public yr8() {
        this(new CopyOnWriteArrayList(), 0, null, 0L);
    }

    public yr8(CopyOnWriteArrayList copyOnWriteArrayList, int i, pr8 pr8Var, long j) {
        this.c = copyOnWriteArrayList;
        this.a = i;
        this.b = pr8Var;
    }

    public static final long n(long j) {
        long j0 = it5.j0(j);
        if (j0 == -9223372036854775807L) {
            return -9223372036854775807L;
        }
        return j0;
    }

    public final yr8 a(int i, pr8 pr8Var, long j) {
        return new yr8(this.c, i, pr8Var, 0L);
    }

    public final void b(Handler handler, zr8 zr8Var) {
        Objects.requireNonNull(zr8Var);
        this.c.add(new xr8(handler, zr8Var));
    }

    public final void c(final lr8 lr8Var) {
        Iterator it = this.c.iterator();
        while (it.hasNext()) {
            xr8 xr8Var = (xr8) it.next();
            final zr8 zr8Var = xr8Var.b;
            it5.y(xr8Var.a, new Runnable() { // from class: com.daaw.sr8
                @Override // java.lang.Runnable
                public final void run() {
                    yr8 yr8Var = yr8.this;
                    zr8Var.d(yr8Var.a, yr8Var.b, lr8Var);
                }
            });
        }
    }

    public final void d(int i, f92 f92Var, int i2, Object obj, long j) {
        c(new lr8(1, i, f92Var, 0, null, n(j), -9223372036854775807L));
    }

    public final void e(final ar8 ar8Var, final lr8 lr8Var) {
        Iterator it = this.c.iterator();
        while (it.hasNext()) {
            xr8 xr8Var = (xr8) it.next();
            final zr8 zr8Var = xr8Var.b;
            it5.y(xr8Var.a, new Runnable() { // from class: com.daaw.tr8
                @Override // java.lang.Runnable
                public final void run() {
                    yr8 yr8Var = yr8.this;
                    zr8Var.W(yr8Var.a, yr8Var.b, ar8Var, lr8Var);
                }
            });
        }
    }

    public final void f(ar8 ar8Var, int i, int i2, f92 f92Var, int i3, Object obj, long j, long j2) {
        e(ar8Var, new lr8(1, -1, null, 0, null, n(j), n(j2)));
    }

    public final void g(final ar8 ar8Var, final lr8 lr8Var) {
        Iterator it = this.c.iterator();
        while (it.hasNext()) {
            xr8 xr8Var = (xr8) it.next();
            final zr8 zr8Var = xr8Var.b;
            it5.y(xr8Var.a, new Runnable() { // from class: com.daaw.wr8
                @Override // java.lang.Runnable
                public final void run() {
                    yr8 yr8Var = yr8.this;
                    zr8Var.V(yr8Var.a, yr8Var.b, ar8Var, lr8Var);
                }
            });
        }
    }

    public final void h(ar8 ar8Var, int i, int i2, f92 f92Var, int i3, Object obj, long j, long j2) {
        g(ar8Var, new lr8(1, -1, null, 0, null, n(j), n(j2)));
    }

    public final void i(final ar8 ar8Var, final lr8 lr8Var, final IOException iOException, final boolean z) {
        Iterator it = this.c.iterator();
        while (it.hasNext()) {
            xr8 xr8Var = (xr8) it.next();
            final zr8 zr8Var = xr8Var.b;
            it5.y(xr8Var.a, new Runnable() { // from class: com.daaw.ur8
                @Override // java.lang.Runnable
                public final void run() {
                    yr8 yr8Var = yr8.this;
                    zr8Var.N(yr8Var.a, yr8Var.b, ar8Var, lr8Var, iOException, z);
                }
            });
        }
    }

    public final void j(ar8 ar8Var, int i, int i2, f92 f92Var, int i3, Object obj, long j, long j2, IOException iOException, boolean z) {
        i(ar8Var, new lr8(1, -1, null, 0, null, n(j), n(j2)), iOException, z);
    }

    public final void k(final ar8 ar8Var, final lr8 lr8Var) {
        Iterator it = this.c.iterator();
        while (it.hasNext()) {
            xr8 xr8Var = (xr8) it.next();
            final zr8 zr8Var = xr8Var.b;
            it5.y(xr8Var.a, new Runnable() { // from class: com.daaw.vr8
                @Override // java.lang.Runnable
                public final void run() {
                    yr8 yr8Var = yr8.this;
                    zr8Var.K(yr8Var.a, yr8Var.b, ar8Var, lr8Var);
                }
            });
        }
    }

    public final void l(ar8 ar8Var, int i, int i2, f92 f92Var, int i3, Object obj, long j, long j2) {
        k(ar8Var, new lr8(1, -1, null, 0, null, n(j), n(j2)));
    }

    public final void m(zr8 zr8Var) {
        Iterator it = this.c.iterator();
        while (it.hasNext()) {
            xr8 xr8Var = (xr8) it.next();
            if (xr8Var.b == zr8Var) {
                this.c.remove(xr8Var);
            }
        }
    }
}
