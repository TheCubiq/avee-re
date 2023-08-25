package com.daaw;

import java.util.Set;
import javax.annotation.CheckForNull;
/* loaded from: classes.dex */
public abstract class py8 extends aq8 implements Set {
    @CheckForNull
    public transient rt8 q;

    @Override // java.util.Collection, java.util.Set
    public final boolean equals(@CheckForNull Object obj) {
        if (obj == this || obj == this) {
            return true;
        }
        if (obj instanceof Set) {
            Set set = (Set) obj;
            try {
                if (size() == set.size()) {
                    if (containsAll(set)) {
                        return true;
                    }
                }
            } catch (ClassCastException | NullPointerException unused) {
            }
        }
        return false;
    }

    @Override // com.daaw.aq8
    public rt8 h() {
        rt8 rt8Var = this.q;
        if (rt8Var == null) {
            rt8 n = n();
            this.q = n;
            return n;
        }
        return rt8Var;
    }

    @Override // java.util.Collection, java.util.Set
    public final int hashCode() {
        return pa2.a(this);
    }

    public rt8 n() {
        return rt8.o(toArray());
    }
}
