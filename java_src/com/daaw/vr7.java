package com.daaw;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
/* loaded from: classes.dex */
public final class vr7 {

    /* renamed from: b */
    public static volatile vr7 f30538b;

    /* renamed from: c */
    public static final vr7 f30539c = new vr7(true);

    /* renamed from: a */
    public final Map f30540a;

    public vr7() {
        this.f30540a = new HashMap();
    }

    public vr7(boolean z) {
        this.f30540a = Collections.emptyMap();
    }

    /* renamed from: a */
    public static vr7 m6834a() {
        return f30539c;
    }

    /* renamed from: b */
    public static vr7 m6833b() {
        vr7 vr7Var = f30538b;
        if (vr7Var != null) {
            return vr7Var;
        }
        synchronized (vr7.class) {
            vr7 vr7Var2 = f30538b;
            if (vr7Var2 != null) {
                return vr7Var2;
            }
            vr7 m23993b = ds7.m23993b(vr7.class);
            f30538b = m23993b;
            return m23993b;
        }
    }

    /* renamed from: c */
    public final ks7 m6832c(xt7 xt7Var, int i) {
        return (ks7) this.f30540a.get(new ur7(xt7Var, i));
    }
}
