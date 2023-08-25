package com.daaw;
/* loaded from: classes.dex */
public final class d52 implements i42 {
    public final long a;
    public final /* synthetic */ g52 b;

    public d52(g52 g52Var, long j) {
        this.b = g52Var;
        this.a = j;
    }

    @Override // com.daaw.i42
    public final g42 b(long j) {
        j52[] j52VarArr;
        j52[] j52VarArr2;
        j52[] j52VarArr3;
        j52VarArr = this.b.g;
        g42 a = j52VarArr[0].a(j);
        int i = 1;
        while (true) {
            g52 g52Var = this.b;
            j52VarArr2 = g52Var.g;
            if (i >= j52VarArr2.length) {
                return a;
            }
            j52VarArr3 = g52Var.g;
            g42 a2 = j52VarArr3[i].a(j);
            if (a2.a.b < a.a.b) {
                a = a2;
            }
            i++;
        }
    }

    @Override // com.daaw.i42
    public final long zze() {
        return this.a;
    }

    @Override // com.daaw.i42
    public final boolean zzh() {
        return true;
    }
}
