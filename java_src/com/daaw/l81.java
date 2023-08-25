package com.daaw;

import android.os.Bundle;
import androidx.lifecycle.c;
import androidx.savedstate.Recreator;
/* loaded from: classes.dex */
public final class l81 {
    public static final a d = new a(null);
    public final m81 a;
    public final k81 b;
    public boolean c;

    /* loaded from: classes.dex */
    public static final class a {
        public a() {
        }

        public /* synthetic */ a(pq pqVar) {
            this();
        }

        public final l81 a(m81 m81Var) {
            ug0.f(m81Var, "owner");
            return new l81(m81Var, null);
        }
    }

    public l81(m81 m81Var) {
        this.a = m81Var;
        this.b = new k81();
    }

    public /* synthetic */ l81(m81 m81Var, pq pqVar) {
        this(m81Var);
    }

    public static final l81 a(m81 m81Var) {
        return d.a(m81Var);
    }

    public final k81 b() {
        return this.b;
    }

    public final void c() {
        androidx.lifecycle.c a2 = this.a.a();
        ug0.e(a2, "owner.lifecycle");
        if (!(a2.b() == c.EnumC0020c.INITIALIZED)) {
            throw new IllegalStateException("Restarter must be created only during owner's initialization stage".toString());
        }
        a2.a(new Recreator(this.a));
        this.b.e(a2);
        this.c = true;
    }

    public final void d(Bundle bundle) {
        if (!this.c) {
            c();
        }
        androidx.lifecycle.c a2 = this.a.a();
        ug0.e(a2, "owner.lifecycle");
        if (!a2.b().a(c.EnumC0020c.STARTED)) {
            this.b.f(bundle);
            return;
        }
        throw new IllegalStateException(("performRestore cannot be called when owner is " + a2.b()).toString());
    }

    public final void e(Bundle bundle) {
        ug0.f(bundle, "outBundle");
        this.b.g(bundle);
    }
}
