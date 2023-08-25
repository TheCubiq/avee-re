package com.daaw;

import java.util.Collection;
import java.util.Iterator;
import java.util.Map;
import javax.annotation.CheckForNull;
/* loaded from: classes.dex */
public final class sz6 implements Iterator {

    /* renamed from: p */
    public final Iterator f26821p;
    @CheckForNull

    /* renamed from: q */
    public Collection f26822q;

    /* renamed from: r */
    public final /* synthetic */ tz6 f26823r;

    public sz6(tz6 tz6Var) {
        this.f26823r = tz6Var;
        this.f26821p = tz6Var.f28293r.entrySet().iterator();
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.f26821p.hasNext();
    }

    @Override // java.util.Iterator
    public final /* bridge */ /* synthetic */ Object next() {
        Map.Entry entry = (Map.Entry) this.f26821p.next();
        this.f26822q = (Collection) entry.getValue();
        return this.f26823r.m8661b(entry);
    }

    @Override // java.util.Iterator
    public final void remove() {
        sy6.m9700i(this.f26822q != null, "no calls to next() since the last call to remove()");
        this.f26821p.remove();
        g07.m22111n(this.f26823r.f28294s, this.f26822q.size());
        this.f26822q.clear();
        this.f26822q = null;
    }
}
