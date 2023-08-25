package com.daaw;

import android.graphics.drawable.Drawable;
import android.widget.ImageView;
import com.daaw.f70;
/* loaded from: classes.dex */
public abstract class mf0<Z> extends au1<ImageView, Z> implements f70.a {
    public mf0(ImageView imageView) {
        super(imageView);
    }

    @Override // com.daaw.pj1
    public void c(Z z, f70<? super Z> f70Var) {
        if (f70Var == null || !f70Var.a(z, this)) {
            n(z);
        }
    }

    @Override // com.daaw.f70.a
    public void d(Drawable drawable) {
        ((ImageView) this.q).setImageDrawable(drawable);
    }

    @Override // com.daaw.f70.a
    public Drawable f() {
        return ((ImageView) this.q).getDrawable();
    }

    @Override // com.daaw.ya, com.daaw.pj1
    public void g(Exception exc, Drawable drawable) {
        ((ImageView) this.q).setImageDrawable(drawable);
    }

    @Override // com.daaw.ya, com.daaw.pj1
    public void i(Drawable drawable) {
        ((ImageView) this.q).setImageDrawable(drawable);
    }

    @Override // com.daaw.ya, com.daaw.pj1
    public void k(Drawable drawable) {
        ((ImageView) this.q).setImageDrawable(drawable);
    }

    public abstract void n(Z z);
}
