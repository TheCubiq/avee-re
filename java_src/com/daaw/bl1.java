package com.daaw;

import com.daaw.nl;
import java.util.Objects;
/* loaded from: classes2.dex */
public final class bl1 {
    public static final pi1 a = new pi1("NO_THREAD_ELEMENTS");
    public static final n50<Object, nl.b, Object> b = a.q;
    public static final n50<al1<?>, nl.b, al1<?>> c = b.q;
    public static final n50<fl1, nl.b, fl1> d = c.q;

    /* loaded from: classes2.dex */
    public static final class a extends si0 implements n50<Object, nl.b, Object> {
        public static final a q = new a();

        public a() {
            super(2);
        }

        @Override // com.daaw.n50
        /* renamed from: d */
        public final Object c(Object obj, nl.b bVar) {
            if (bVar instanceof al1) {
                Integer num = obj instanceof Integer ? (Integer) obj : null;
                int intValue = num == null ? 1 : num.intValue();
                return intValue == 0 ? bVar : Integer.valueOf(intValue + 1);
            }
            return obj;
        }
    }

    /* loaded from: classes2.dex */
    public static final class b extends si0 implements n50<al1<?>, nl.b, al1<?>> {
        public static final b q = new b();

        public b() {
            super(2);
        }

        @Override // com.daaw.n50
        /* renamed from: d */
        public final al1<?> c(al1<?> al1Var, nl.b bVar) {
            if (al1Var != null) {
                return al1Var;
            }
            if (bVar instanceof al1) {
                return (al1) bVar;
            }
            return null;
        }
    }

    /* loaded from: classes2.dex */
    public static final class c extends si0 implements n50<fl1, nl.b, fl1> {
        public static final c q = new c();

        public c() {
            super(2);
        }

        @Override // com.daaw.n50
        /* renamed from: d */
        public final fl1 c(fl1 fl1Var, nl.b bVar) {
            if (bVar instanceof al1) {
                al1<?> al1Var = (al1) bVar;
                fl1Var.a(al1Var, al1Var.n(fl1Var.a));
            }
            return fl1Var;
        }
    }

    public static final void a(nl nlVar, Object obj) {
        if (obj == a) {
            return;
        }
        if (obj instanceof fl1) {
            ((fl1) obj).b(nlVar);
            return;
        }
        Object fold = nlVar.fold(null, c);
        Objects.requireNonNull(fold, "null cannot be cast to non-null type kotlinx.coroutines.ThreadContextElement<kotlin.Any?>");
        ((al1) fold).u(nlVar, obj);
    }

    public static final Object b(nl nlVar) {
        Object fold = nlVar.fold(0, b);
        ug0.c(fold);
        return fold;
    }

    public static final Object c(nl nlVar, Object obj) {
        if (obj == null) {
            obj = b(nlVar);
        }
        return obj == 0 ? a : obj instanceof Integer ? nlVar.fold(new fl1(nlVar, ((Number) obj).intValue()), d) : ((al1) obj).n(nlVar);
    }
}
