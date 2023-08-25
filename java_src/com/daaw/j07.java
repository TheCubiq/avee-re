package com.daaw;

import java.util.Collection;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import javax.annotation.CheckForNull;
/* loaded from: classes.dex */
public abstract class j07 implements w27 {
    @CheckForNull
    public transient Set p;
    @CheckForNull
    public transient Collection q;
    @CheckForNull
    public transient Map r;

    @Override // com.daaw.w27
    public final Map b() {
        Map map = this.r;
        if (map == null) {
            Map e = e();
            this.r = e;
            return e;
        }
        return map;
    }

    public abstract Collection c();

    public abstract Iterator d();

    public abstract Map e();

    public final boolean equals(@CheckForNull Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof w27) {
            return b().equals(((w27) obj).b());
        }
        return false;
    }

    public abstract Set f();

    public final Set g() {
        Set set = this.p;
        if (set == null) {
            Set f = f();
            this.p = f;
            return f;
        }
        return set;
    }

    public final int hashCode() {
        return b().hashCode();
    }

    public final String toString() {
        return b().toString();
    }

    @Override // com.daaw.w27
    public final Collection zzt() {
        Collection collection = this.q;
        if (collection == null) {
            Collection c = c();
            this.q = c;
            return c;
        }
        return collection;
    }
}
