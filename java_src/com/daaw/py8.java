package com.daaw;

import java.util.Set;
import javax.annotation.CheckForNull;
/* loaded from: classes.dex */
public abstract class py8 extends aq8 implements Set {
    @CheckForNull

    /* renamed from: q */
    public transient rt8 f23538q;

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
    /* renamed from: h */
    public rt8 mo10948h() {
        rt8 rt8Var = this.f23538q;
        if (rt8Var == null) {
            rt8 mo12850n = mo12850n();
            this.f23538q = mo12850n;
            return mo12850n;
        }
        return rt8Var;
    }

    @Override // java.util.Collection, java.util.Set
    public final int hashCode() {
        return pa2.m13536a(this);
    }

    /* renamed from: n */
    public rt8 mo12850n() {
        return rt8.m10945o(toArray());
    }
}
