package com.daaw;

import java.util.List;
import java.util.Objects;
/* loaded from: classes.dex */
public final class c8 extends ib {
    public final List<gl0> a;

    public c8(List<gl0> list) {
        Objects.requireNonNull(list, "Null logRequests");
        this.a = list;
    }

    @Override // com.daaw.ib
    public List<gl0> c() {
        return this.a;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof ib) {
            return this.a.equals(((ib) obj).c());
        }
        return false;
    }

    public int hashCode() {
        return this.a.hashCode() ^ 1000003;
    }

    public String toString() {
        return "BatchedLogRequest{logRequests=" + this.a + "}";
    }
}
