package com.daaw;

import android.os.Bundle;
import androidx.lifecycle.AbstractC0344c;
import androidx.savedstate.Recreator;
/* loaded from: classes.dex */
public final class l81 {

    /* renamed from: d */
    public static final C2020a f17129d = new C2020a(null);

    /* renamed from: a */
    public final m81 f17130a;

    /* renamed from: b */
    public final k81 f17131b;

    /* renamed from: c */
    public boolean f17132c;

    /* renamed from: com.daaw.l81$a */
    /* loaded from: classes.dex */
    public static final class C2020a {
        public C2020a() {
        }

        public /* synthetic */ C2020a(C2575pq c2575pq) {
            this();
        }

        /* renamed from: a */
        public final l81 m17102a(m81 m81Var) {
            ug0.m8268f(m81Var, "owner");
            return new l81(m81Var, null);
        }
    }

    public l81(m81 m81Var) {
        this.f17130a = m81Var;
        this.f17131b = new k81();
    }

    public /* synthetic */ l81(m81 m81Var, C2575pq c2575pq) {
        this(m81Var);
    }

    /* renamed from: a */
    public static final l81 m17107a(m81 m81Var) {
        return f17129d.m17102a(m81Var);
    }

    /* renamed from: b */
    public final k81 m17106b() {
        return this.f17131b;
    }

    /* renamed from: c */
    public final void m17105c() {
        AbstractC0344c mo2327a = this.f17130a.mo2327a();
        ug0.m8269e(mo2327a, "owner.lifecycle");
        if (!(mo2327a.mo29047b() == AbstractC0344c.EnumC0347c.INITIALIZED)) {
            throw new IllegalStateException("Restarter must be created only during owner's initialization stage".toString());
        }
        mo2327a.mo29048a(new Recreator(this.f17130a));
        this.f17131b.m17969e(mo2327a);
        this.f17132c = true;
    }

    /* renamed from: d */
    public final void m17104d(Bundle bundle) {
        if (!this.f17132c) {
            m17105c();
        }
        AbstractC0344c mo2327a = this.f17130a.mo2327a();
        ug0.m8269e(mo2327a, "owner.lifecycle");
        if (!mo2327a.mo29047b().m29049a(AbstractC0344c.EnumC0347c.STARTED)) {
            this.f17131b.m17968f(bundle);
            return;
        }
        throw new IllegalStateException(("performRestore cannot be called when owner is " + mo2327a.mo29047b()).toString());
    }

    /* renamed from: e */
    public final void m17103e(Bundle bundle) {
        ug0.m8268f(bundle, "outBundle");
        this.f17131b.m17967g(bundle);
    }
}
