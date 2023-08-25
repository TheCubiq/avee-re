package com.daaw;

import java.util.Collections;
import java.util.HashSet;
import java.util.Set;
/* loaded from: classes2.dex */
public class p70 {

    /* renamed from: b */
    public static volatile p70 f22652b;

    /* renamed from: a */
    public final Set<ij0> f22653a = new HashSet();

    /* renamed from: a */
    public static p70 m13615a() {
        p70 p70Var = f22652b;
        if (p70Var == null) {
            synchronized (p70.class) {
                p70Var = f22652b;
                if (p70Var == null) {
                    p70Var = new p70();
                    f22652b = p70Var;
                }
            }
        }
        return p70Var;
    }

    /* renamed from: b */
    public Set<ij0> m13614b() {
        Set<ij0> unmodifiableSet;
        synchronized (this.f22653a) {
            unmodifiableSet = Collections.unmodifiableSet(this.f22653a);
        }
        return unmodifiableSet;
    }
}
