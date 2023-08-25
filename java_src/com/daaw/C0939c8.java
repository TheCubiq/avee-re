package com.daaw;

import java.util.List;
import java.util.Objects;
/* renamed from: com.daaw.c8 */
/* loaded from: classes.dex */
public final class C0939c8 extends AbstractC1673ib {

    /* renamed from: a */
    public final List<gl0> f5612a;

    public C0939c8(List<gl0> list) {
        Objects.requireNonNull(list, "Null logRequests");
        this.f5612a = list;
    }

    @Override // com.daaw.AbstractC1673ib
    /* renamed from: c */
    public List<gl0> mo19991c() {
        return this.f5612a;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof AbstractC1673ib) {
            return this.f5612a.equals(((AbstractC1673ib) obj).mo19991c());
        }
        return false;
    }

    public int hashCode() {
        return this.f5612a.hashCode() ^ 1000003;
    }

    public String toString() {
        return "BatchedLogRequest{logRequests=" + this.f5612a + "}";
    }
}
