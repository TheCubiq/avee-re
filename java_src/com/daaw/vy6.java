package com.daaw;

import java.io.Serializable;
import java.util.List;
import javax.annotation.CheckForNull;
/* loaded from: classes.dex */
public final class vy6 implements Serializable, ty6 {
    public final List p;

    public final boolean equals(@CheckForNull Object obj) {
        if (obj instanceof vy6) {
            return this.p.equals(((vy6) obj).p);
        }
        return false;
    }

    public final int hashCode() {
        return this.p.hashCode() + 306654252;
    }

    public final String toString() {
        List list = this.p;
        StringBuilder sb = new StringBuilder("Predicates.");
        sb.append("and(");
        boolean z = true;
        for (Object obj : list) {
            if (!z) {
                sb.append(',');
            }
            sb.append(obj);
            z = false;
        }
        sb.append(')');
        return sb.toString();
    }

    @Override // com.daaw.ty6
    public final boolean zza(Object obj) {
        for (int i = 0; i < this.p.size(); i++) {
            if (!((ty6) this.p.get(i)).zza(obj)) {
                return false;
            }
        }
        return true;
    }
}
