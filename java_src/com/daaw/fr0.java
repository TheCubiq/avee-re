package com.daaw;

import java.util.Arrays;
import java.util.Collection;
/* loaded from: classes.dex */
public class fr0<T> implements cn1<T> {
    public final Collection<? extends cn1<T>> a;
    public String b;

    @SafeVarargs
    public fr0(cn1<T>... cn1VarArr) {
        if (cn1VarArr.length < 1) {
            throw new IllegalArgumentException("MultiTransformation must contain at least one Transformation");
        }
        this.a = Arrays.asList(cn1VarArr);
    }

    @Override // com.daaw.cn1
    public z41<T> a(z41<T> z41Var, int i, int i2) {
        z41<T> z41Var2 = z41Var;
        for (cn1<T> cn1Var : this.a) {
            z41<T> a = cn1Var.a(z41Var2, i, i2);
            if (z41Var2 != null && !z41Var2.equals(z41Var) && !z41Var2.equals(a)) {
                z41Var2.c();
            }
            z41Var2 = a;
        }
        return z41Var2;
    }

    @Override // com.daaw.cn1
    public String getId() {
        if (this.b == null) {
            StringBuilder sb = new StringBuilder();
            for (cn1<T> cn1Var : this.a) {
                sb.append(cn1Var.getId());
            }
            this.b = sb.toString();
        }
        return this.b;
    }
}
