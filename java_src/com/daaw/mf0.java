package com.daaw;

import android.graphics.drawable.Drawable;
import android.widget.ImageView;
import com.daaw.f70;
/* loaded from: classes.dex */
public abstract class mf0<Z> extends au1<ImageView, Z> implements f70.InterfaceC1258a {
    public mf0(ImageView imageView) {
        super(imageView);
    }

    @Override // com.daaw.pj1
    /* renamed from: c */
    public void mo5506c(Z z, f70<? super Z> f70Var) {
        if (f70Var == null || !f70Var.mo6825a(z, this)) {
            mo10940n(z);
        }
    }

    @Override // com.daaw.f70.InterfaceC1258a
    /* renamed from: d */
    public void mo16045d(Drawable drawable) {
        ((ImageView) this.f3603q).setImageDrawable(drawable);
    }

    @Override // com.daaw.f70.InterfaceC1258a
    /* renamed from: f */
    public Drawable mo16044f() {
        return ((ImageView) this.f3603q).getDrawable();
    }

    @Override // com.daaw.AbstractC3683ya, com.daaw.pj1
    /* renamed from: g */
    public void mo3967g(Exception exc, Drawable drawable) {
        ((ImageView) this.f3603q).setImageDrawable(drawable);
    }

    @Override // com.daaw.AbstractC3683ya, com.daaw.pj1
    /* renamed from: i */
    public void mo3965i(Drawable drawable) {
        ((ImageView) this.f3603q).setImageDrawable(drawable);
    }

    @Override // com.daaw.AbstractC3683ya, com.daaw.pj1
    /* renamed from: k */
    public void mo3963k(Drawable drawable) {
        ((ImageView) this.f3603q).setImageDrawable(drawable);
    }

    /* renamed from: n */
    public abstract void mo10940n(Z z);
}
