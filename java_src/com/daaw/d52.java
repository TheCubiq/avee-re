package com.daaw;
/* loaded from: classes.dex */
public final class d52 implements i42 {

    /* renamed from: a */
    public final long f6529a;

    /* renamed from: b */
    public final /* synthetic */ g52 f6530b;

    public d52(g52 g52Var, long j) {
        this.f6530b = g52Var;
        this.f6529a = j;
    }

    @Override // com.daaw.i42
    /* renamed from: b */
    public final g42 mo2631b(long j) {
        j52[] j52VarArr;
        j52[] j52VarArr2;
        j52[] j52VarArr3;
        j52VarArr = this.f6530b.f10281g;
        g42 m18871a = j52VarArr[0].m18871a(j);
        int i = 1;
        while (true) {
            g52 g52Var = this.f6530b;
            j52VarArr2 = g52Var.f10281g;
            if (i >= j52VarArr2.length) {
                return m18871a;
            }
            j52VarArr3 = g52Var.f10281g;
            g42 m18871a2 = j52VarArr3[i].m18871a(j);
            if (m18871a2.f10252a.f14257b < m18871a.f10252a.f14257b) {
                m18871a = m18871a2;
            }
            i++;
        }
    }

    @Override // com.daaw.i42
    public final long zze() {
        return this.f6529a;
    }

    @Override // com.daaw.i42
    public final boolean zzh() {
        return true;
    }
}
