package com.daaw;

import java.io.Serializable;
import java.util.Arrays;
import javax.annotation.CheckForNull;
/* loaded from: classes.dex */
public final class n48 implements Serializable, e48 {

    /* renamed from: p */
    public final Object f19477p;

    public n48(Object obj) {
        this.f19477p = obj;
    }

    public final boolean equals(@CheckForNull Object obj) {
        if (obj instanceof n48) {
            Object obj2 = this.f19477p;
            Object obj3 = ((n48) obj).f19477p;
            return obj2 == obj3 || obj2.equals(obj3);
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f19477p});
    }

    public final String toString() {
        return "Suppliers.ofInstance(" + this.f19477p + ")";
    }

    @Override // com.daaw.e48
    public final Object zza() {
        return this.f19477p;
    }
}
