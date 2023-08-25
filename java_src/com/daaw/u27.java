package com.daaw;

import java.util.AbstractMap;
import java.util.Collection;
import java.util.Set;
import javax.annotation.CheckForNull;
/* loaded from: classes.dex */
public abstract class u27 extends AbstractMap {
    @CheckForNull

    /* renamed from: p */
    public transient Set f28497p;
    @CheckForNull

    /* renamed from: q */
    public transient Collection f28498q;

    /* renamed from: a */
    public abstract Set mo8608a();

    @Override // java.util.AbstractMap, java.util.Map
    public final Set entrySet() {
        Set set = this.f28497p;
        if (set == null) {
            Set mo8608a = mo8608a();
            this.f28497p = mo8608a;
            return mo8608a;
        }
        return set;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Collection values() {
        Collection collection = this.f28498q;
        if (collection == null) {
            t27 t27Var = new t27(this);
            this.f28498q = t27Var;
            return t27Var;
        }
        return collection;
    }
}
