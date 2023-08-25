package com.daaw;
/* loaded from: classes.dex */
public class q01 implements vd0 {
    public int a;
    public int b;

    public q01() {
        this.a = -1;
        this.b = 0;
    }

    public q01(int i) {
        this.a = -1;
        this.b = i;
    }

    @Override // com.daaw.vd0
    public int a() {
        return this.a;
    }

    @Override // com.daaw.vd0
    public void b(int i) {
        this.b = i;
    }

    @Override // com.daaw.vd0
    public int c() {
        return this.b;
    }

    public void d(int i) {
        this.a = i;
    }

    public boolean equals(Object obj) {
        return super.equals(obj);
    }
}
