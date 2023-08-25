package com.daaw;

import java.util.Iterator;
/* loaded from: classes2.dex */
public final class jf2 implements Iterator {
    public final /* synthetic */ Iterator p;

    public jf2(Iterator it) {
        this.p = it;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.p.hasNext();
    }

    @Override // java.util.Iterator
    public final /* bridge */ /* synthetic */ Object next() {
        return new wp2((String) this.p.next());
    }
}
