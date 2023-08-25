package com.daaw;

import android.os.Bundle;
import androidx.lifecycle.AbstractC0344c;
import androidx.lifecycle.SavedStateHandleAttacher;
import com.daaw.AbstractC1589hn;
/* loaded from: classes.dex */
public final class g81 {

    /* renamed from: a */
    public static final AbstractC1589hn.InterfaceC1591b<m81> f10339a = new C1378b();

    /* renamed from: b */
    public static final AbstractC1589hn.InterfaceC1591b<nt1> f10340b = new C1379c();

    /* renamed from: c */
    public static final AbstractC1589hn.InterfaceC1591b<Bundle> f10341c = new C1377a();

    /* renamed from: com.daaw.g81$a */
    /* loaded from: classes.dex */
    public static final class C1377a implements AbstractC1589hn.InterfaceC1591b<Bundle> {
    }

    /* renamed from: com.daaw.g81$b */
    /* loaded from: classes.dex */
    public static final class C1378b implements AbstractC1589hn.InterfaceC1591b<m81> {
    }

    /* renamed from: com.daaw.g81$c */
    /* loaded from: classes.dex */
    public static final class C1379c implements AbstractC1589hn.InterfaceC1591b<nt1> {
    }

    /* renamed from: com.daaw.g81$d */
    /* loaded from: classes.dex */
    public static final class C1380d extends si0 implements z40<AbstractC1589hn, i81> {

        /* renamed from: q */
        public static final C1380d f10342q = new C1380d();

        public C1380d() {
            super(1);
        }

        @Override // com.daaw.z40
        /* renamed from: d */
        public final i81 mo2829b(AbstractC1589hn abstractC1589hn) {
            ug0.m8268f(abstractC1589hn, "$this$initializer");
            return new i81();
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* renamed from: a */
    public static final <T extends m81 & nt1> void m21890a(T t) {
        ug0.m8268f(t, "<this>");
        AbstractC0344c.EnumC0347c mo29047b = t.mo2327a().mo29047b();
        ug0.m8269e(mo29047b, "lifecycle.currentState");
        if (!(mo29047b == AbstractC0344c.EnumC0347c.INITIALIZED || mo29047b == AbstractC0344c.EnumC0347c.CREATED)) {
            throw new IllegalArgumentException("Failed requirement.".toString());
        }
        if (t.mo16178i().m17971c("androidx.lifecycle.internal.SavedStateHandlesProvider") == null) {
            h81 h81Var = new h81(t.mo16178i(), t);
            t.mo16178i().m17966h("androidx.lifecycle.internal.SavedStateHandlesProvider", h81Var);
            t.mo2327a().mo29048a(new SavedStateHandleAttacher(h81Var));
        }
    }

    /* renamed from: b */
    public static final i81 m21889b(nt1 nt1Var) {
        ug0.m8268f(nt1Var, "<this>");
        yf0 yf0Var = new yf0();
        yf0Var.m3784a(m31.m16243a(i81.class), C1380d.f10342q);
        return (i81) new jt1(nt1Var, yf0Var.m3783b()).m18254b("androidx.lifecycle.internal.SavedStateHandlesVM", i81.class);
    }
}
