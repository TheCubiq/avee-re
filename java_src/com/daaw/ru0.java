package com.daaw;

import com.daaw.qu0;
/* loaded from: classes.dex */
public class ru0 implements qu0 {
    public final kr0<qu0.b> c = new kr0<>();
    public final sb1<qu0.b.c> d = sb1.u();

    public ru0() {
        a(qu0.b);
    }

    public void a(qu0.b bVar) {
        this.c.h(bVar);
        if (bVar instanceof qu0.b.c) {
            this.d.q((qu0.b.c) bVar);
        } else if (bVar instanceof qu0.b.a) {
            this.d.r(((qu0.b.a) bVar).a());
        }
    }
}
