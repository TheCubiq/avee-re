package com.daaw;

import android.os.Bundle;
import androidx.lifecycle.SavedStateHandleAttacher;
import androidx.lifecycle.c;
import com.daaw.hn;
/* loaded from: classes.dex */
public final class g81 {
    public static final hn.b<m81> a = new b();
    public static final hn.b<nt1> b = new c();
    public static final hn.b<Bundle> c = new a();

    /* loaded from: classes.dex */
    public static final class a implements hn.b<Bundle> {
    }

    /* loaded from: classes.dex */
    public static final class b implements hn.b<m81> {
    }

    /* loaded from: classes.dex */
    public static final class c implements hn.b<nt1> {
    }

    /* loaded from: classes.dex */
    public static final class d extends si0 implements z40<hn, i81> {
        public static final d q = new d();

        public d() {
            super(1);
        }

        @Override // com.daaw.z40
        /* renamed from: d */
        public final i81 b(hn hnVar) {
            ug0.f(hnVar, "$this$initializer");
            return new i81();
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final <T extends m81 & nt1> void a(T t) {
        ug0.f(t, "<this>");
        c.EnumC0020c b2 = t.a().b();
        ug0.e(b2, "lifecycle.currentState");
        if (!(b2 == c.EnumC0020c.INITIALIZED || b2 == c.EnumC0020c.CREATED)) {
            throw new IllegalArgumentException("Failed requirement.".toString());
        }
        if (t.i().c("androidx.lifecycle.internal.SavedStateHandlesProvider") == null) {
            h81 h81Var = new h81(t.i(), t);
            t.i().h("androidx.lifecycle.internal.SavedStateHandlesProvider", h81Var);
            t.a().a(new SavedStateHandleAttacher(h81Var));
        }
    }

    public static final i81 b(nt1 nt1Var) {
        ug0.f(nt1Var, "<this>");
        yf0 yf0Var = new yf0();
        yf0Var.a(m31.a(i81.class), d.q);
        return (i81) new jt1(nt1Var, yf0Var.b()).b("androidx.lifecycle.internal.SavedStateHandlesVM", i81.class);
    }
}
