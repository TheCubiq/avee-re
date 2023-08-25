package com.daaw;

import java.util.Objects;
import javax.annotation.CheckForNull;
/* loaded from: classes.dex */
public final class k48 implements e48 {
    @CheckForNull

    /* renamed from: p */
    public volatile e48 f15682p;

    /* renamed from: q */
    public volatile boolean f15683q;
    @CheckForNull

    /* renamed from: r */
    public Object f15684r;

    public k48(e48 e48Var) {
        Objects.requireNonNull(e48Var);
        this.f15682p = e48Var;
    }

    public final String toString() {
        Object obj = this.f15682p;
        StringBuilder sb = new StringBuilder();
        sb.append("Suppliers.memoize(");
        if (obj == null) {
            obj = "<supplier that returned " + this.f15684r + ">";
        }
        sb.append(obj);
        sb.append(")");
        return sb.toString();
    }

    @Override // com.daaw.e48
    public final Object zza() {
        if (!this.f15683q) {
            synchronized (this) {
                if (!this.f15683q) {
                    e48 e48Var = this.f15682p;
                    e48Var.getClass();
                    Object zza = e48Var.zza();
                    this.f15684r = zza;
                    this.f15683q = true;
                    this.f15682p = null;
                    return zza;
                }
            }
        }
        return this.f15684r;
    }
}
