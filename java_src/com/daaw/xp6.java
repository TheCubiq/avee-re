package com.daaw;

import android.view.View;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.UUID;
import java.util.regex.Pattern;
/* loaded from: classes.dex */
public final class xp6 extends tp6 {
    public static final Pattern i = Pattern.compile("^[a-zA-Z0-9 ]+$");
    public final vp6 a;
    public final up6 b;
    public wr6 d;
    public xq6 e;
    public final List c = new ArrayList();
    public boolean f = false;
    public boolean g = false;
    public final String h = UUID.randomUUID().toString();

    public xp6(up6 up6Var, vp6 vp6Var) {
        this.b = up6Var;
        this.a = vp6Var;
        k(null);
        if (vp6Var.d() == wp6.HTML || vp6Var.d() == wp6.JAVASCRIPT) {
            this.e = new yq6(vp6Var.a());
        } else {
            this.e = new ar6(vp6Var.i(), null);
        }
        this.e.j();
        lq6.a().d(this);
        qq6.a().d(this.e.a(), up6Var.b());
    }

    @Override // com.daaw.tp6
    public final void b(View view, zp6 zp6Var, String str) {
        nq6 nq6Var;
        if (this.g) {
            return;
        }
        if (!i.matcher("Ad overlay").matches()) {
            throw new IllegalArgumentException("FriendlyObstruction has detailed reason that contains characters not in [a-z][A-Z][0-9] or space");
        }
        Iterator it = this.c.iterator();
        while (true) {
            if (!it.hasNext()) {
                nq6Var = null;
                break;
            }
            nq6Var = (nq6) it.next();
            if (nq6Var.b().get() == view) {
                break;
            }
        }
        if (nq6Var == null) {
            this.c.add(new nq6(view, zp6Var, "Ad overlay"));
        }
    }

    @Override // com.daaw.tp6
    public final void c() {
        if (this.g) {
            return;
        }
        this.d.clear();
        if (!this.g) {
            this.c.clear();
        }
        this.g = true;
        qq6.a().c(this.e.a());
        lq6.a().e(this);
        this.e.c();
        this.e = null;
    }

    @Override // com.daaw.tp6
    public final void d(View view) {
        if (this.g || f() == view) {
            return;
        }
        k(view);
        this.e.b();
        Collection<xp6> c = lq6.a().c();
        if (c == null || c.isEmpty()) {
            return;
        }
        for (xp6 xp6Var : c) {
            if (xp6Var != this && xp6Var.f() == view) {
                xp6Var.d.clear();
            }
        }
    }

    @Override // com.daaw.tp6
    public final void e() {
        if (this.f) {
            return;
        }
        this.f = true;
        lq6.a().f(this);
        this.e.h(rq6.b().a());
        this.e.f(this, this.a);
    }

    public final View f() {
        return (View) this.d.get();
    }

    public final xq6 g() {
        return this.e;
    }

    public final String h() {
        return this.h;
    }

    public final List i() {
        return this.c;
    }

    public final boolean j() {
        return this.f && !this.g;
    }

    public final void k(View view) {
        this.d = new wr6(view);
    }
}
