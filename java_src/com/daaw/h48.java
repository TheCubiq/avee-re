package com.daaw;

import java.io.Serializable;
import java.util.Objects;
import javax.annotation.CheckForNull;
/* loaded from: classes.dex */
public final class h48 implements Serializable, e48 {
    public final e48 p;
    public volatile transient boolean q;
    @CheckForNull
    public transient Object r;

    public h48(e48 e48Var) {
        Objects.requireNonNull(e48Var);
        this.p = e48Var;
    }

    public final String toString() {
        Object obj;
        StringBuilder sb = new StringBuilder();
        sb.append("Suppliers.memoize(");
        if (this.q) {
            obj = "<supplier that returned " + this.r + ">";
        } else {
            obj = this.p;
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
                    Object zza = this.p.zza();
                    this.r = zza;
                    this.q = true;
                    return zza;
                }
            }
        }
        return this.r;
    }
}
