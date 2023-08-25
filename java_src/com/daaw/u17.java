package com.daaw;

import java.io.Serializable;
/* loaded from: classes.dex */
public final class u17 extends h07 implements Serializable {

    /* renamed from: p */
    public final Object f28325p;

    /* renamed from: q */
    public final Object f28326q;

    public u17(Object obj, Object obj2) {
        this.f28325p = obj;
        this.f28326q = obj2;
    }

    @Override // com.daaw.h07, java.util.Map.Entry
    public final Object getKey() {
        return this.f28325p;
    }

    @Override // com.daaw.h07, java.util.Map.Entry
    public final Object getValue() {
        return this.f28326q;
    }

    @Override // java.util.Map.Entry
    public final Object setValue(Object obj) {
        throw new UnsupportedOperationException();
    }
}
