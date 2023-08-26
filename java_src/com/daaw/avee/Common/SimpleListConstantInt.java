package com.daaw.avee.Common;
/* loaded from: classes.dex */
public class SimpleListConstantInt implements ISimpleListInt {
    int size;
    int value;

    public SimpleListConstantInt(int i, int i2) {
        this.value = i;
        this.size = i2;
    }

    @Override // com.daaw.avee.Common.ISimpleListInt
    public int size() {
        return this.size;
    }

    @Override // com.daaw.avee.Common.ISimpleListInt
    public int get(int i) {
        return this.value;
    }
}
