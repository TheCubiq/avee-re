package com.daaw;

import java.util.Iterator;
import java.util.Map;
import javax.annotation.CheckForNull;
/* loaded from: classes.dex */
public final class rz6 extends r27 {
    public final /* synthetic */ tz6 p;

    public rz6(tz6 tz6Var) {
        this.p = tz6Var;
    }

    @Override // com.daaw.r27, java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean contains(@CheckForNull Object obj) {
        return m07.a(this.p.r.entrySet(), obj);
    }

    @Override // com.daaw.r27
    public final Map d() {
        return this.p;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
    public final Iterator iterator() {
        return new sz6(this.p);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean remove(@CheckForNull Object obj) {
        if (contains(obj)) {
            Map.Entry entry = (Map.Entry) obj;
            entry.getClass();
            g07.s(this.p.s, entry.getKey());
            return true;
        }
        return false;
    }
}
