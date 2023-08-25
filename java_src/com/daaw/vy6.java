package com.daaw;

import java.io.Serializable;
import java.util.List;
import javax.annotation.CheckForNull;
/* loaded from: classes.dex */
public final class vy6 implements Serializable, ty6 {

    /* renamed from: p */
    public final List f30717p;

    public final boolean equals(@CheckForNull Object obj) {
        if (obj instanceof vy6) {
            return this.f30717p.equals(((vy6) obj).f30717p);
        }
        return false;
    }

    public final int hashCode() {
        return this.f30717p.hashCode() + 306654252;
    }

    public final String toString() {
        List list = this.f30717p;
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
        for (int i = 0; i < this.f30717p.size(); i++) {
            if (!((ty6) this.f30717p.get(i)).zza(obj)) {
                return false;
            }
        }
        return true;
    }
}
