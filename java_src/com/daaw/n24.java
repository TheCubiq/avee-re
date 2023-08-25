package com.daaw;

import android.content.Context;
import android.view.ViewGroup;
/* loaded from: classes.dex */
public final class n24 {

    /* renamed from: a */
    public final Context f19425a;

    /* renamed from: b */
    public final y24 f19426b;

    /* renamed from: c */
    public final ViewGroup f19427c;

    /* renamed from: d */
    public m24 f19428d;

    public n24(Context context, ViewGroup viewGroup, a74 a74Var) {
        this.f19425a = context.getApplicationContext() != null ? context.getApplicationContext() : context;
        this.f19427c = viewGroup;
        this.f19426b = a74Var;
        this.f19428d = null;
    }

    /* renamed from: a */
    public final m24 m15569a() {
        return this.f19428d;
    }

    /* renamed from: b */
    public final void m15568b(int i, int i2, int i3, int i4) {
        ry0.m10835e("The underlay may only be modified from the UI thread.");
        m24 m24Var = this.f19428d;
        if (m24Var != null) {
            m24Var.m16283h(i, i2, i3, i4);
        }
    }

    /* renamed from: c */
    public final void m15567c(int i, int i2, int i3, int i4, int i5, boolean z, x24 x24Var, Integer num) {
        if (this.f19428d != null) {
            return;
        }
        n93.m15381a(this.f19426b.zzo().m9423a(), this.f19426b.zzn(), "vpr2");
        Context context = this.f19425a;
        y24 y24Var = this.f19426b;
        m24 m24Var = new m24(context, y24Var, i5, z, y24Var.zzo().m9423a(), x24Var, num);
        this.f19428d = m24Var;
        this.f19427c.addView(m24Var, 0, new ViewGroup.LayoutParams(-1, -1));
        this.f19428d.m16283h(i, i2, i3, i4);
        this.f19426b.zzB(false);
    }

    /* renamed from: d */
    public final void m15566d() {
        ry0.m10835e("onDestroy must be called from the UI thread.");
        m24 m24Var = this.f19428d;
        if (m24Var != null) {
            m24Var.m16273r();
            this.f19427c.removeView(this.f19428d);
            this.f19428d = null;
        }
    }

    /* renamed from: e */
    public final void m15565e() {
        ry0.m10835e("onPause must be called from the UI thread.");
        m24 m24Var = this.f19428d;
        if (m24Var != null) {
            m24Var.m16267x();
        }
    }

    /* renamed from: f */
    public final void m15564f(int i) {
        m24 m24Var = this.f19428d;
        if (m24Var != null) {
            m24Var.m16286e(i);
        }
    }
}
