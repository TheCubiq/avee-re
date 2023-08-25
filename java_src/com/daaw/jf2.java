package com.daaw;

import java.util.Iterator;
/* loaded from: classes2.dex */
public final class jf2 implements Iterator {

    /* renamed from: p */
    public final /* synthetic */ Iterator f15071p;

    public jf2(Iterator it) {
        this.f15071p = it;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.f15071p.hasNext();
    }

    @Override // java.util.Iterator
    public final /* bridge */ /* synthetic */ Object next() {
        return new wp2((String) this.f15071p.next());
    }
}
