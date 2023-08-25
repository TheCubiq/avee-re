package com.daaw;

import java.util.Objects;
/* loaded from: classes.dex */
public final class yt2 {
    public final hu2 a = new hu2();
    public final ws2 b;
    public fu2 c;
    public vt2 d;
    public int e;
    public int f;
    public int g;
    public vs2 h;
    public gu2 i;

    public yt2(ws2 ws2Var) {
        this.b = ws2Var;
    }

    public final void a(fu2 fu2Var, vt2 vt2Var) {
        Objects.requireNonNull(fu2Var);
        this.c = fu2Var;
        Objects.requireNonNull(vt2Var);
        this.d = vt2Var;
        this.b.a(fu2Var.f);
        b();
    }

    public final void b() {
        hu2 hu2Var = this.a;
        hu2Var.d = 0;
        hu2Var.r = 0L;
        hu2Var.l = false;
        hu2Var.q = false;
        hu2Var.n = null;
        this.e = 0;
        this.g = 0;
        this.f = 0;
        this.h = null;
        this.i = null;
    }
}
