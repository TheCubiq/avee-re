package com.daaw;

import java.util.Collection;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import javax.annotation.CheckForNull;
/* loaded from: classes.dex */
public abstract class j07 implements w27 {
    @CheckForNull

    /* renamed from: p */
    public transient Set f14165p;
    @CheckForNull

    /* renamed from: q */
    public transient Collection f14166q;
    @CheckForNull

    /* renamed from: r */
    public transient Map f14167r;

    @Override // com.daaw.w27
    /* renamed from: b */
    public final Map mo6567b() {
        Map map = this.f14167r;
        if (map == null) {
            Map mo19178e = mo19178e();
            this.f14167r = mo19178e;
            return mo19178e;
        }
        return map;
    }

    /* renamed from: c */
    public abstract Collection mo19180c();

    /* renamed from: d */
    public abstract Iterator mo19179d();

    /* renamed from: e */
    public abstract Map mo19178e();

    public final boolean equals(@CheckForNull Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof w27) {
            return mo6567b().equals(((w27) obj).mo6567b());
        }
        return false;
    }

    /* renamed from: f */
    public abstract Set mo19177f();

    /* renamed from: g */
    public final Set m19176g() {
        Set set = this.f14165p;
        if (set == null) {
            Set mo19177f = mo19177f();
            this.f14165p = mo19177f;
            return mo19177f;
        }
        return set;
    }

    public final int hashCode() {
        return mo6567b().hashCode();
    }

    public final String toString() {
        return mo6567b().toString();
    }

    @Override // com.daaw.w27
    public final Collection zzt() {
        Collection collection = this.f14166q;
        if (collection == null) {
            Collection mo19180c = mo19180c();
            this.f14166q = mo19180c;
            return mo19180c;
        }
        return collection;
    }
}
