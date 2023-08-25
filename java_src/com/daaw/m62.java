package com.daaw;
/* loaded from: classes.dex */
public final class m62 implements m09 {
    public final long p;
    public final m09 q;

    public m62(long j, m09 m09Var) {
        this.p = j;
        this.q = m09Var;
    }

    @Override // com.daaw.m09
    public final void i(i42 i42Var) {
        this.q.i(new l62(this, i42Var));
    }

    @Override // com.daaw.m09
    public final m42 n(int i, int i2) {
        return this.q.n(i, i2);
    }

    @Override // com.daaw.m09
    public final void zzC() {
        this.q.zzC();
    }
}
