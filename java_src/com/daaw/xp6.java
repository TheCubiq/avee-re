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

    /* renamed from: i */
    public static final Pattern f32866i = Pattern.compile("^[a-zA-Z0-9 ]+$");

    /* renamed from: a */
    public final vp6 f32867a;

    /* renamed from: b */
    public final up6 f32868b;

    /* renamed from: d */
    public wr6 f32870d;

    /* renamed from: e */
    public xq6 f32871e;

    /* renamed from: c */
    public final List f32869c = new ArrayList();

    /* renamed from: f */
    public boolean f32872f = false;

    /* renamed from: g */
    public boolean f32873g = false;

    /* renamed from: h */
    public final String f32874h = UUID.randomUUID().toString();

    public xp6(up6 up6Var, vp6 vp6Var) {
        this.f32868b = up6Var;
        this.f32867a = vp6Var;
        m4827k(null);
        if (vp6Var.m6948d() == wp6.HTML || vp6Var.m6948d() == wp6.JAVASCRIPT) {
            this.f32871e = new yq6(vp6Var.m6951a());
        } else {
            this.f32871e = new ar6(vp6Var.m6943i(), null);
        }
        this.f32871e.mo4802j();
        lq6.m16667a().m16664d(this);
        qq6.m12283a().m12280d(this.f32871e.m4811a(), up6Var.m7837b());
    }

    @Override // com.daaw.tp6
    /* renamed from: b */
    public final void mo4836b(View view, zp6 zp6Var, String str) {
        nq6 nq6Var;
        if (this.f32873g) {
            return;
        }
        if (!f32866i.matcher("Ad overlay").matches()) {
            throw new IllegalArgumentException("FriendlyObstruction has detailed reason that contains characters not in [a-z][A-Z][0-9] or space");
        }
        Iterator it = this.f32869c.iterator();
        while (true) {
            if (!it.hasNext()) {
                nq6Var = null;
                break;
            }
            nq6Var = (nq6) it.next();
            if (nq6Var.m14874b().get() == view) {
                break;
            }
        }
        if (nq6Var == null) {
            this.f32869c.add(new nq6(view, zp6Var, "Ad overlay"));
        }
    }

    @Override // com.daaw.tp6
    /* renamed from: c */
    public final void mo4835c() {
        if (this.f32873g) {
            return;
        }
        this.f32870d.clear();
        if (!this.f32873g) {
            this.f32869c.clear();
        }
        this.f32873g = true;
        qq6.m12283a().m12281c(this.f32871e.m4811a());
        lq6.m16667a().m16663e(this);
        this.f32871e.mo4809c();
        this.f32871e = null;
    }

    @Override // com.daaw.tp6
    /* renamed from: d */
    public final void mo4834d(View view) {
        if (this.f32873g || m4832f() == view) {
            return;
        }
        m4827k(view);
        this.f32871e.m4810b();
        Collection<xp6> m16665c = lq6.m16667a().m16665c();
        if (m16665c == null || m16665c.isEmpty()) {
            return;
        }
        for (xp6 xp6Var : m16665c) {
            if (xp6Var != this && xp6Var.m4832f() == view) {
                xp6Var.f32870d.clear();
            }
        }
    }

    @Override // com.daaw.tp6
    /* renamed from: e */
    public final void mo4833e() {
        if (this.f32872f) {
            return;
        }
        this.f32872f = true;
        lq6.m16667a().m16662f(this);
        this.f32871e.m4804h(rq6.m11060b().m11061a());
        this.f32871e.mo4806f(this, this.f32867a);
    }

    /* renamed from: f */
    public final View m4832f() {
        return (View) this.f32870d.get();
    }

    /* renamed from: g */
    public final xq6 m4831g() {
        return this.f32871e;
    }

    /* renamed from: h */
    public final String m4830h() {
        return this.f32874h;
    }

    /* renamed from: i */
    public final List m4829i() {
        return this.f32869c;
    }

    /* renamed from: j */
    public final boolean m4828j() {
        return this.f32872f && !this.f32873g;
    }

    /* renamed from: k */
    public final void m4827k(View view) {
        this.f32870d = new wr6(view);
    }
}
