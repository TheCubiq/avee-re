package com.daaw;

import java.util.Iterator;
import java.util.Map;
import javax.annotation.CheckForNull;
/* loaded from: classes.dex */
public final class rz6 extends r27 {

    /* renamed from: p */
    public final /* synthetic */ tz6 f25732p;

    public rz6(tz6 tz6Var) {
        this.f25732p = tz6Var;
    }

    @Override // com.daaw.r27, java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean contains(@CheckForNull Object obj) {
        return m07.m16300a(this.f25732p.f28293r.entrySet(), obj);
    }

    @Override // com.daaw.r27
    /* renamed from: d */
    public final Map mo10814d() {
        return this.f25732p;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
    public final Iterator iterator() {
        return new sz6(this.f25732p);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean remove(@CheckForNull Object obj) {
        if (contains(obj)) {
            Map.Entry entry = (Map.Entry) obj;
            entry.getClass();
            g07.m22106s(this.f25732p.f28294s, entry.getKey());
            return true;
        }
        return false;
    }
}
