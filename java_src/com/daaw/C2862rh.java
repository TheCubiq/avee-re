package com.daaw;

import com.daaw.p51;
/* renamed from: com.daaw.rh */
/* loaded from: classes2.dex */
public final class C2862rh {
    /* renamed from: a */
    public static final <T> Object m11315a(Object obj, InterfaceC1438gl<? super T> interfaceC1438gl) {
        if (obj instanceof C2292nh) {
            p51.C2516a c2516a = p51.f22616p;
            obj = s51.m10708a(((C2292nh) obj).f20118a);
        } else {
            p51.C2516a c2516a2 = p51.f22616p;
        }
        return p51.m13631a(obj);
    }

    /* renamed from: b */
    public static final <T> Object m11314b(Object obj, InterfaceC3200ud<?> interfaceC3200ud) {
        Throwable m13630b = p51.m13630b(obj);
        return m13630b == null ? obj : new C2292nh(m13630b, false, 2, null);
    }

    /* renamed from: c */
    public static final <T> Object m11313c(Object obj, z40<? super Throwable, lp1> z40Var) {
        Throwable m13630b = p51.m13630b(obj);
        return m13630b == null ? z40Var != null ? new C2440oh(obj, z40Var) : obj : new C2292nh(m13630b, false, 2, null);
    }

    /* renamed from: d */
    public static /* synthetic */ Object m11312d(Object obj, z40 z40Var, int i, Object obj2) {
        if ((i & 1) != 0) {
            z40Var = null;
        }
        return m11313c(obj, z40Var);
    }
}
