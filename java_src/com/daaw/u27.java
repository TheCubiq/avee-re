package com.daaw;

import java.util.AbstractMap;
import java.util.Collection;
import java.util.Set;
import javax.annotation.CheckForNull;
/* loaded from: classes.dex */
public abstract class u27 extends AbstractMap {
    @CheckForNull
    public transient Set p;
    @CheckForNull
    public transient Collection q;

    public abstract Set a();

    @Override // java.util.AbstractMap, java.util.Map
    public final Set entrySet() {
        Set set = this.p;
        if (set == null) {
            Set a = a();
            this.p = a;
            return a;
        }
        return set;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Collection values() {
        Collection collection = this.q;
        if (collection == null) {
            t27 t27Var = new t27(this);
            this.q = t27Var;
            return t27Var;
        }
        return collection;
    }
}
