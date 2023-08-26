package com.daaw.avee.Common;
/* loaded from: classes.dex */
public class SimpleListConstantShort implements ISimpleListShort {
    int size;
    short value;

    public SimpleListConstantShort(short s, int i) {
        this.value = s;
        this.size = i;
    }

    @Override // com.daaw.avee.Common.ISimpleListShort
    public int size() {
        return this.size;
    }

    @Override // com.daaw.avee.Common.ISimpleListShort
    public short get(int i) {
        return this.value;
    }
}
