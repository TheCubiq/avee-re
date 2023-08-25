package com.daaw;

import android.os.Handler;
import java.io.IOException;
import java.util.Iterator;
import java.util.Objects;
import java.util.concurrent.CopyOnWriteArrayList;
/* loaded from: classes.dex */
public final class yr8 {

    /* renamed from: a */
    public final int f33991a;

    /* renamed from: b */
    public final pr8 f33992b;

    /* renamed from: c */
    public final CopyOnWriteArrayList f33993c;

    public yr8() {
        this(new CopyOnWriteArrayList(), 0, null, 0L);
    }

    public yr8(CopyOnWriteArrayList copyOnWriteArrayList, int i, pr8 pr8Var, long j) {
        this.f33993c = copyOnWriteArrayList;
        this.f33991a = i;
        this.f33992b = pr8Var;
    }

    /* renamed from: n */
    public static final long m3359n(long j) {
        long m19386j0 = it5.m19386j0(j);
        if (m19386j0 == -9223372036854775807L) {
            return -9223372036854775807L;
        }
        return m19386j0;
    }

    /* renamed from: a */
    public final yr8 m3372a(int i, pr8 pr8Var, long j) {
        return new yr8(this.f33993c, i, pr8Var, 0L);
    }

    /* renamed from: b */
    public final void m3371b(Handler handler, zr8 zr8Var) {
        Objects.requireNonNull(zr8Var);
        this.f33993c.add(new xr8(handler, zr8Var));
    }

    /* renamed from: c */
    public final void m3370c(final lr8 lr8Var) {
        Iterator it = this.f33993c.iterator();
        while (it.hasNext()) {
            xr8 xr8Var = (xr8) it.next();
            final zr8 zr8Var = xr8Var.f32900b;
            it5.m19371y(xr8Var.f32899a, new Runnable() { // from class: com.daaw.sr8
                @Override // java.lang.Runnable
                public final void run() {
                    yr8 yr8Var = yr8.this;
                    zr8Var.mo1957d(yr8Var.f33991a, yr8Var.f33992b, lr8Var);
                }
            });
        }
    }

    /* renamed from: d */
    public final void m3369d(int i, f92 f92Var, int i2, Object obj, long j) {
        m3370c(new lr8(1, i, f92Var, 0, null, m3359n(j), -9223372036854775807L));
    }

    /* renamed from: e */
    public final void m3368e(final ar8 ar8Var, final lr8 lr8Var) {
        Iterator it = this.f33993c.iterator();
        while (it.hasNext()) {
            xr8 xr8Var = (xr8) it.next();
            final zr8 zr8Var = xr8Var.f32900b;
            it5.m19371y(xr8Var.f32899a, new Runnable() { // from class: com.daaw.tr8
                @Override // java.lang.Runnable
                public final void run() {
                    yr8 yr8Var = yr8.this;
                    zr8Var.mo1958W(yr8Var.f33991a, yr8Var.f33992b, ar8Var, lr8Var);
                }
            });
        }
    }

    /* renamed from: f */
    public final void m3367f(ar8 ar8Var, int i, int i2, f92 f92Var, int i3, Object obj, long j, long j2) {
        m3368e(ar8Var, new lr8(1, -1, null, 0, null, m3359n(j), m3359n(j2)));
    }

    /* renamed from: g */
    public final void m3366g(final ar8 ar8Var, final lr8 lr8Var) {
        Iterator it = this.f33993c.iterator();
        while (it.hasNext()) {
            xr8 xr8Var = (xr8) it.next();
            final zr8 zr8Var = xr8Var.f32900b;
            it5.m19371y(xr8Var.f32899a, new Runnable() { // from class: com.daaw.wr8
                @Override // java.lang.Runnable
                public final void run() {
                    yr8 yr8Var = yr8.this;
                    zr8Var.mo1959V(yr8Var.f33991a, yr8Var.f33992b, ar8Var, lr8Var);
                }
            });
        }
    }

    /* renamed from: h */
    public final void m3365h(ar8 ar8Var, int i, int i2, f92 f92Var, int i3, Object obj, long j, long j2) {
        m3366g(ar8Var, new lr8(1, -1, null, 0, null, m3359n(j), m3359n(j2)));
    }

    /* renamed from: i */
    public final void m3364i(final ar8 ar8Var, final lr8 lr8Var, final IOException iOException, final boolean z) {
        Iterator it = this.f33993c.iterator();
        while (it.hasNext()) {
            xr8 xr8Var = (xr8) it.next();
            final zr8 zr8Var = xr8Var.f32900b;
            it5.m19371y(xr8Var.f32899a, new Runnable() { // from class: com.daaw.ur8
                @Override // java.lang.Runnable
                public final void run() {
                    yr8 yr8Var = yr8.this;
                    zr8Var.mo1960N(yr8Var.f33991a, yr8Var.f33992b, ar8Var, lr8Var, iOException, z);
                }
            });
        }
    }

    /* renamed from: j */
    public final void m3363j(ar8 ar8Var, int i, int i2, f92 f92Var, int i3, Object obj, long j, long j2, IOException iOException, boolean z) {
        m3364i(ar8Var, new lr8(1, -1, null, 0, null, m3359n(j), m3359n(j2)), iOException, z);
    }

    /* renamed from: k */
    public final void m3362k(final ar8 ar8Var, final lr8 lr8Var) {
        Iterator it = this.f33993c.iterator();
        while (it.hasNext()) {
            xr8 xr8Var = (xr8) it.next();
            final zr8 zr8Var = xr8Var.f32900b;
            it5.m19371y(xr8Var.f32899a, new Runnable() { // from class: com.daaw.vr8
                @Override // java.lang.Runnable
                public final void run() {
                    yr8 yr8Var = yr8.this;
                    zr8Var.mo1961K(yr8Var.f33991a, yr8Var.f33992b, ar8Var, lr8Var);
                }
            });
        }
    }

    /* renamed from: l */
    public final void m3361l(ar8 ar8Var, int i, int i2, f92 f92Var, int i3, Object obj, long j, long j2) {
        m3362k(ar8Var, new lr8(1, -1, null, 0, null, m3359n(j), m3359n(j2)));
    }

    /* renamed from: m */
    public final void m3360m(zr8 zr8Var) {
        Iterator it = this.f33993c.iterator();
        while (it.hasNext()) {
            xr8 xr8Var = (xr8) it.next();
            if (xr8Var.f32900b == zr8Var) {
                this.f33993c.remove(xr8Var);
            }
        }
    }
}
