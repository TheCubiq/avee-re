package com.daaw;

import java.io.Serializable;
/* loaded from: classes.dex */
public final class u17 extends h07 implements Serializable {
    public final Object p;
    public final Object q;

    public u17(Object obj, Object obj2) {
        this.p = obj;
        this.q = obj2;
    }

    @Override // com.daaw.h07, java.util.Map.Entry
    public final Object getKey() {
        return this.p;
    }

    @Override // com.daaw.h07, java.util.Map.Entry
    public final Object getValue() {
        return this.q;
    }

    @Override // java.util.Map.Entry
    public final Object setValue(Object obj) {
        throw new UnsupportedOperationException();
    }
}
