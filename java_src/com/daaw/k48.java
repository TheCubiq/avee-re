package com.daaw;

import java.util.Objects;
import javax.annotation.CheckForNull;
/* loaded from: classes.dex */
public final class k48 implements e48 {
    @CheckForNull
    public volatile e48 p;
    public volatile boolean q;
    @CheckForNull
    public Object r;

    public k48(e48 e48Var) {
        Objects.requireNonNull(e48Var);
        this.p = e48Var;
    }

    public final String toString() {
        Object obj = this.p;
        StringBuilder sb = new StringBuilder();
        sb.append("Suppliers.memoize(");
        if (obj == null) {
            obj = "<supplier that returned " + this.r + ">";
        }
        sb.append(obj);
        sb.append(")");
        return sb.toString();
    }

    @Override // com.daaw.e48
    public final Object zza() {
        if (!this.q) {
            synchronized (this) {
                if (!this.q) {
                    e48 e48Var = this.p;
                    e48Var.getClass();
                    Object zza = e48Var.zza();
                    this.r = zza;
                    this.q = true;
                    this.p = null;
                    return zza;
                }
            }
        }
        return this.r;
    }
}
