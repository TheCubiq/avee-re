package com.daaw;

import com.daaw.InterfaceC2307nl;
import java.util.Objects;
/* loaded from: classes2.dex */
public final class bl1 {

    /* renamed from: a */
    public static final pi1 f4887a = new pi1("NO_THREAD_ELEMENTS");

    /* renamed from: b */
    public static final n50<Object, InterfaceC2307nl.InterfaceC2310b, Object> f4888b = C0857a.f4891q;

    /* renamed from: c */
    public static final n50<al1<?>, InterfaceC2307nl.InterfaceC2310b, al1<?>> f4889c = C0858b.f4892q;

    /* renamed from: d */
    public static final n50<fl1, InterfaceC2307nl.InterfaceC2310b, fl1> f4890d = C0859c.f4893q;

    /* renamed from: com.daaw.bl1$a */
    /* loaded from: classes2.dex */
    public static final class C0857a extends si0 implements n50<Object, InterfaceC2307nl.InterfaceC2310b, Object> {

        /* renamed from: q */
        public static final C0857a f4891q = new C0857a();

        public C0857a() {
            super(2);
        }

        @Override // com.daaw.n50
        /* renamed from: d */
        public final Object mo15095c(Object obj, InterfaceC2307nl.InterfaceC2310b interfaceC2310b) {
            if (interfaceC2310b instanceof al1) {
                Integer num = obj instanceof Integer ? (Integer) obj : null;
                int intValue = num == null ? 1 : num.intValue();
                return intValue == 0 ? interfaceC2310b : Integer.valueOf(intValue + 1);
            }
            return obj;
        }
    }

    /* renamed from: com.daaw.bl1$b */
    /* loaded from: classes2.dex */
    public static final class C0858b extends si0 implements n50<al1<?>, InterfaceC2307nl.InterfaceC2310b, al1<?>> {

        /* renamed from: q */
        public static final C0858b f4892q = new C0858b();

        public C0858b() {
            super(2);
        }

        @Override // com.daaw.n50
        /* renamed from: d */
        public final al1<?> mo15095c(al1<?> al1Var, InterfaceC2307nl.InterfaceC2310b interfaceC2310b) {
            if (al1Var != null) {
                return al1Var;
            }
            if (interfaceC2310b instanceof al1) {
                return (al1) interfaceC2310b;
            }
            return null;
        }
    }

    /* renamed from: com.daaw.bl1$c */
    /* loaded from: classes2.dex */
    public static final class C0859c extends si0 implements n50<fl1, InterfaceC2307nl.InterfaceC2310b, fl1> {

        /* renamed from: q */
        public static final C0859c f4893q = new C0859c();

        public C0859c() {
            super(2);
        }

        @Override // com.daaw.n50
        /* renamed from: d */
        public final fl1 mo15095c(fl1 fl1Var, InterfaceC2307nl.InterfaceC2310b interfaceC2310b) {
            if (interfaceC2310b instanceof al1) {
                al1<?> al1Var = (al1) interfaceC2310b;
                fl1Var.m22507a(al1Var, al1Var.m27359n(fl1Var.f9658a));
            }
            return fl1Var;
        }
    }

    /* renamed from: a */
    public static final void m26073a(InterfaceC2307nl interfaceC2307nl, Object obj) {
        if (obj == f4887a) {
            return;
        }
        if (obj instanceof fl1) {
            ((fl1) obj).m22506b(interfaceC2307nl);
            return;
        }
        Object fold = interfaceC2307nl.fold(null, f4889c);
        Objects.requireNonNull(fold, "null cannot be cast to non-null type kotlinx.coroutines.ThreadContextElement<kotlin.Any?>");
        ((al1) fold).m27358u(interfaceC2307nl, obj);
    }

    /* renamed from: b */
    public static final Object m26072b(InterfaceC2307nl interfaceC2307nl) {
        Object fold = interfaceC2307nl.fold(0, f4888b);
        ug0.m8271c(fold);
        return fold;
    }

    /* renamed from: c */
    public static final Object m26071c(InterfaceC2307nl interfaceC2307nl, Object obj) {
        if (obj == null) {
            obj = m26072b(interfaceC2307nl);
        }
        return obj == 0 ? f4887a : obj instanceof Integer ? interfaceC2307nl.fold(new fl1(interfaceC2307nl, ((Number) obj).intValue()), f4890d) : ((al1) obj).m27359n(interfaceC2307nl);
    }
}
