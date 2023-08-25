package com.daaw;

import java.io.Serializable;
import java.util.Objects;
import javax.annotation.CheckForNull;
/* loaded from: classes.dex */
public final class h48 implements Serializable, e48 {

    /* renamed from: p */
    public final e48 f12059p;

    /* renamed from: q */
    public volatile transient boolean f12060q;
    @CheckForNull

    /* renamed from: r */
    public transient Object f12061r;

    public h48(e48 e48Var) {
        Objects.requireNonNull(e48Var);
        this.f12059p = e48Var;
    }

    public final String toString() {
        Object obj;
        StringBuilder sb = new StringBuilder();
        sb.append("Suppliers.memoize(");
        if (this.f12060q) {
            obj = "<supplier that returned " + this.f12061r + ">";
        } else {
            obj = this.f12059p;
        }
        sb.append(obj);
        sb.append(")");
        return sb.toString();
    }

    @Override // com.daaw.e48
    public final Object zza() {
        if (!this.f12060q) {
            synchronized (this) {
                if (!this.f12060q) {
                    Object zza = this.f12059p.zza();
                    this.f12061r = zza;
                    this.f12060q = true;
                    return zza;
                }
            }
        }
        return this.f12061r;
    }
}
