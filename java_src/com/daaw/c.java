package com.daaw;

import java.util.ArrayList;
import java.util.List;
/* loaded from: classes.dex */
public abstract class c implements bh {
    public ah a;
    public List<tg> b = new ArrayList();

    @Override // com.daaw.bh
    public ah b() {
        if (this.a == null) {
            this.a = new ah();
        }
        return this.a;
    }

    @Override // com.daaw.bh
    public void c(ah ahVar) {
        this.a = ahVar;
        this.b.clear();
    }

    @Override // com.daaw.bh
    public List<tg> d() {
        return this.b;
    }

    public int e(float f, float f2) {
        return Math.max(1, (int) ((3.063052912151454d / Math.asin(f2 / f)) + 0.5d));
    }

    public int f() {
        return Math.round(this.a.e * 255.0f);
    }
}
