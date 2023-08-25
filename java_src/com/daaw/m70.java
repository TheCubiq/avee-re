package com.daaw;

import android.widget.ImageView;
/* loaded from: classes.dex */
public class m70 extends mf0<l70> {

    /* renamed from: u */
    public int f18486u;

    /* renamed from: v */
    public l70 f18487v;

    public m70(ImageView imageView) {
        this(imageView, -1);
    }

    public m70(ImageView imageView, int i) {
        super(imageView);
        this.f18486u = i;
    }

    @Override // com.daaw.AbstractC3683ya, com.daaw.qj0
    /* renamed from: a */
    public void mo3969a() {
        l70 l70Var = this.f18487v;
        if (l70Var != null) {
            l70Var.start();
        }
    }

    @Override // com.daaw.AbstractC3683ya, com.daaw.qj0
    /* renamed from: h */
    public void mo3966h() {
        l70 l70Var = this.f18487v;
        if (l70Var != null) {
            l70Var.stop();
        }
    }

    @Override // com.daaw.mf0, com.daaw.pj1
    /* renamed from: o */
    public void mo5506c(l70 l70Var, f70<? super l70> f70Var) {
        if (!l70Var.mo7215b()) {
            float width = ((ImageView) this.f3603q).getWidth() / ((ImageView) this.f3603q).getHeight();
            float intrinsicWidth = l70Var.getIntrinsicWidth() / l70Var.getIntrinsicHeight();
            if (Math.abs(width - 1.0f) <= 0.05f && Math.abs(intrinsicWidth - 1.0f) <= 0.05f) {
                l70Var = new ve1(l70Var, ((ImageView) this.f3603q).getWidth());
            }
        }
        super.mo5506c(l70Var, f70Var);
        this.f18487v = l70Var;
        l70Var.mo7214c(this.f18486u);
        l70Var.start();
    }

    @Override // com.daaw.mf0
    /* renamed from: p */
    public void mo10940n(l70 l70Var) {
        ((ImageView) this.f3603q).setImageDrawable(l70Var);
    }
}
