package com.daaw;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
/* loaded from: classes2.dex */
public final class l88 {

    /* renamed from: b */
    public static volatile l88 f17142b;

    /* renamed from: c */
    public static final l88 f17143c = new l88(true);

    /* renamed from: a */
    public final Map f17144a;

    public l88() {
        this.f17144a = new HashMap();
    }

    public l88(boolean z) {
        this.f17144a = Collections.emptyMap();
    }

    /* renamed from: a */
    public static l88 m17099a() {
        l88 l88Var = f17142b;
        if (l88Var != null) {
            return l88Var;
        }
        synchronized (l88.class) {
            l88 l88Var2 = f17142b;
            if (l88Var2 != null) {
                return l88Var2;
            }
            l88 m18700b = j98.m18700b(l88.class);
            f17142b = m18700b;
            return m18700b;
        }
    }

    /* renamed from: b */
    public final ea8 m17098b(zd8 zd8Var, int i) {
        return (ea8) this.f17144a.get(new i88(zd8Var, i));
    }
}
