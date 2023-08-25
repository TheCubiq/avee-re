package com.daaw;

import android.content.Context;
import android.view.ViewGroup;
/* loaded from: classes.dex */
public final class n24 {
    public final Context a;
    public final y24 b;
    public final ViewGroup c;
    public m24 d;

    public n24(Context context, ViewGroup viewGroup, a74 a74Var) {
        this.a = context.getApplicationContext() != null ? context.getApplicationContext() : context;
        this.c = viewGroup;
        this.b = a74Var;
        this.d = null;
    }

    public final m24 a() {
        return this.d;
    }

    public final void b(int i, int i2, int i3, int i4) {
        ry0.e("The underlay may only be modified from the UI thread.");
        m24 m24Var = this.d;
        if (m24Var != null) {
            m24Var.h(i, i2, i3, i4);
        }
    }

    public final void c(int i, int i2, int i3, int i4, int i5, boolean z, x24 x24Var, Integer num) {
        if (this.d != null) {
            return;
        }
        n93.a(this.b.zzo().a(), this.b.zzn(), "vpr2");
        Context context = this.a;
        y24 y24Var = this.b;
        m24 m24Var = new m24(context, y24Var, i5, z, y24Var.zzo().a(), x24Var, num);
        this.d = m24Var;
        this.c.addView(m24Var, 0, new ViewGroup.LayoutParams(-1, -1));
        this.d.h(i, i2, i3, i4);
        this.b.zzB(false);
    }

    public final void d() {
        ry0.e("onDestroy must be called from the UI thread.");
        m24 m24Var = this.d;
        if (m24Var != null) {
            m24Var.r();
            this.c.removeView(this.d);
            this.d = null;
        }
    }

    public final void e() {
        ry0.e("onPause must be called from the UI thread.");
        m24 m24Var = this.d;
        if (m24Var != null) {
            m24Var.x();
        }
    }

    public final void f(int i) {
        m24 m24Var = this.d;
        if (m24Var != null) {
            m24Var.e(i);
        }
    }
}
