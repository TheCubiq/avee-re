package com.daaw;
/* loaded from: classes.dex */
public class gd1 implements ke0 {
    public short a;
    public int b;

    public gd1(short s, int i) {
        this.a = s;
        this.b = i;
    }

    @Override // com.daaw.ke0
    public short get(int i) {
        return this.a;
    }

    @Override // com.daaw.ke0
    public int size() {
        return this.b;
    }
}
