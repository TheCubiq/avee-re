package com.daaw;

import java.util.Arrays;
import java.util.Collection;
/* loaded from: classes.dex */
public class fr0<T> implements cn1<T> {

    /* renamed from: a */
    public final Collection<? extends cn1<T>> f9828a;

    /* renamed from: b */
    public String f9829b;

    @SafeVarargs
    public fr0(cn1<T>... cn1VarArr) {
        if (cn1VarArr.length < 1) {
            throw new IllegalArgumentException("MultiTransformation must contain at least one Transformation");
        }
        this.f9828a = Arrays.asList(cn1VarArr);
    }

    @Override // com.daaw.cn1
    /* renamed from: a */
    public z41<T> mo7395a(z41<T> z41Var, int i, int i2) {
        z41<T> z41Var2 = z41Var;
        for (cn1<T> cn1Var : this.f9828a) {
            z41<T> mo7395a = cn1Var.mo7395a(z41Var2, i, i2);
            if (z41Var2 != null && !z41Var2.equals(z41Var) && !z41Var2.equals(mo7395a)) {
                z41Var2.mo2827c();
            }
            z41Var2 = mo7395a;
        }
        return z41Var2;
    }

    @Override // com.daaw.cn1
    public String getId() {
        if (this.f9829b == null) {
            StringBuilder sb = new StringBuilder();
            for (cn1<T> cn1Var : this.f9828a) {
                sb.append(cn1Var.getId());
            }
            this.f9829b = sb.toString();
        }
        return this.f9829b;
    }
}
