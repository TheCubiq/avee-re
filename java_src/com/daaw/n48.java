package com.daaw;

import java.io.Serializable;
import java.util.Arrays;
import javax.annotation.CheckForNull;
/* loaded from: classes.dex */
public final class n48 implements Serializable, e48 {
    public final Object p;

    public n48(Object obj) {
        this.p = obj;
    }

    public final boolean equals(@CheckForNull Object obj) {
        if (obj instanceof n48) {
            Object obj2 = this.p;
            Object obj3 = ((n48) obj).p;
            return obj2 == obj3 || obj2.equals(obj3);
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.p});
    }

    public final String toString() {
        return "Suppliers.ofInstance(" + this.p + ")";
    }

    @Override // com.daaw.e48
    public final Object zza() {
        return this.p;
    }
}
