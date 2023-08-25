package com.daaw;

import android.widget.ImageView;
/* loaded from: classes.dex */
public class m70 extends mf0<l70> {
    public int u;
    public l70 v;

    public m70(ImageView imageView) {
        this(imageView, -1);
    }

    public m70(ImageView imageView, int i) {
        super(imageView);
        this.u = i;
    }

    @Override // com.daaw.ya, com.daaw.qj0
    public void a() {
        l70 l70Var = this.v;
        if (l70Var != null) {
            l70Var.start();
        }
    }

    @Override // com.daaw.ya, com.daaw.qj0
    public void h() {
        l70 l70Var = this.v;
        if (l70Var != null) {
            l70Var.stop();
        }
    }

    @Override // com.daaw.mf0, com.daaw.pj1
    /* renamed from: o */
    public void c(l70 l70Var, f70<? super l70> f70Var) {
        if (!l70Var.b()) {
            float width = ((ImageView) this.q).getWidth() / ((ImageView) this.q).getHeight();
            float intrinsicWidth = l70Var.getIntrinsicWidth() / l70Var.getIntrinsicHeight();
            if (Math.abs(width - 1.0f) <= 0.05f && Math.abs(intrinsicWidth - 1.0f) <= 0.05f) {
                l70Var = new ve1(l70Var, ((ImageView) this.q).getWidth());
            }
        }
        super.c(l70Var, f70Var);
        this.v = l70Var;
        l70Var.c(this.u);
        l70Var.start();
    }

    @Override // com.daaw.mf0
    /* renamed from: p */
    public void n(l70 l70Var) {
        ((ImageView) this.q).setImageDrawable(l70Var);
    }
}
