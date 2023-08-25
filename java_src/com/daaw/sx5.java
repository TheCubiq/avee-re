package com.daaw;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Map;
import java.util.Objects;
/* loaded from: classes.dex */
public abstract class sx5 implements p46 {

    /* renamed from: a */
    public final boolean f26746a;

    /* renamed from: b */
    public final ArrayList f26747b = new ArrayList(1);

    /* renamed from: c */
    public int f26748c;

    /* renamed from: d */
    public pa6 f26749d;

    public sx5(boolean z) {
        this.f26746a = z;
    }

    /* renamed from: c */
    public final void m9782c(int i) {
        pa6 pa6Var = this.f26749d;
        int i2 = it5.f13991a;
        for (int i3 = 0; i3 < this.f26748c; i3++) {
            ((qz6) this.f26747b.get(i3)).mo11898D(this, pa6Var, this.f26746a, i);
        }
    }

    @Override // com.daaw.p46
    /* renamed from: d */
    public final void mo1979d(qz6 qz6Var) {
        Objects.requireNonNull(qz6Var);
        if (this.f26747b.contains(qz6Var)) {
            return;
        }
        this.f26747b.add(qz6Var);
        this.f26748c++;
    }

    /* renamed from: k */
    public final void m9781k() {
        pa6 pa6Var = this.f26749d;
        int i = it5.f13991a;
        for (int i2 = 0; i2 < this.f26748c; i2++) {
            ((qz6) this.f26747b.get(i2)).mo11897a(this, pa6Var, this.f26746a);
        }
        this.f26749d = null;
    }

    /* renamed from: l */
    public final void m9780l(pa6 pa6Var) {
        for (int i = 0; i < this.f26748c; i++) {
            ((qz6) this.f26747b.get(i)).mo11896f(this, pa6Var, this.f26746a);
        }
    }

    /* renamed from: m */
    public final void m9779m(pa6 pa6Var) {
        this.f26749d = pa6Var;
        for (int i = 0; i < this.f26748c; i++) {
            ((qz6) this.f26747b.get(i)).mo11895l(this, pa6Var, this.f26746a);
        }
    }

    @Override // com.daaw.p46
    public /* synthetic */ Map zze() {
        return Collections.emptyMap();
    }
}
