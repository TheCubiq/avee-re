package com.daaw;

import android.content.Context;
import android.view.TextureView;
/* loaded from: classes.dex */
public abstract class e24 extends TextureView implements e34 {
    public final s24 p;
    public final f34 q;
    public final Integer r;

    public e24(Context context, Integer num) {
        super(context);
        this.p = new s24();
        this.q = new f34(context, this);
        this.r = num;
    }

    public void A(int i) {
    }

    public void a(int i) {
    }

    public void b(String str, String[] strArr) {
        u(str);
    }

    public abstract int h();

    public abstract int i();

    public abstract int j();

    public abstract int k();

    public abstract int l();

    public abstract long m();

    public abstract long n();

    public abstract long o();

    public abstract String p();

    public abstract void q();

    public abstract void r();

    public abstract void s(int i);

    public abstract void t(d24 d24Var);

    public abstract void u(String str);

    public abstract void v();

    public abstract void w(float f, float f2);

    public void x(int i) {
    }

    public void y(int i) {
    }

    public void z(int i) {
    }

    public abstract void zzn();
}
