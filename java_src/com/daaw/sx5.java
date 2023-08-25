package com.daaw;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Map;
import java.util.Objects;
/* loaded from: classes.dex */
public abstract class sx5 implements p46 {
    public final boolean a;
    public final ArrayList b = new ArrayList(1);
    public int c;
    public pa6 d;

    public sx5(boolean z) {
        this.a = z;
    }

    public final void c(int i) {
        pa6 pa6Var = this.d;
        int i2 = it5.a;
        for (int i3 = 0; i3 < this.c; i3++) {
            ((qz6) this.b.get(i3)).D(this, pa6Var, this.a, i);
        }
    }

    @Override // com.daaw.p46
    public final void d(qz6 qz6Var) {
        Objects.requireNonNull(qz6Var);
        if (this.b.contains(qz6Var)) {
            return;
        }
        this.b.add(qz6Var);
        this.c++;
    }

    public final void k() {
        pa6 pa6Var = this.d;
        int i = it5.a;
        for (int i2 = 0; i2 < this.c; i2++) {
            ((qz6) this.b.get(i2)).a(this, pa6Var, this.a);
        }
        this.d = null;
    }

    public final void l(pa6 pa6Var) {
        for (int i = 0; i < this.c; i++) {
            ((qz6) this.b.get(i)).f(this, pa6Var, this.a);
        }
    }

    public final void m(pa6 pa6Var) {
        this.d = pa6Var;
        for (int i = 0; i < this.c; i++) {
            ((qz6) this.b.get(i)).l(this, pa6Var, this.a);
        }
    }

    @Override // com.daaw.p46
    public /* synthetic */ Map zze() {
        return Collections.emptyMap();
    }
}
