package com.daaw;

import java.util.Collections;
import java.util.HashSet;
import java.util.Set;
/* loaded from: classes2.dex */
public class p70 {
    public static volatile p70 b;
    public final Set<ij0> a = new HashSet();

    public static p70 a() {
        p70 p70Var = b;
        if (p70Var == null) {
            synchronized (p70.class) {
                p70Var = b;
                if (p70Var == null) {
                    p70Var = new p70();
                    b = p70Var;
                }
            }
        }
        return p70Var;
    }

    public Set<ij0> b() {
        Set<ij0> unmodifiableSet;
        synchronized (this.a) {
            unmodifiableSet = Collections.unmodifiableSet(this.a);
        }
        return unmodifiableSet;
    }
}
