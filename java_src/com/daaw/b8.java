package com.daaw;

import com.daaw.da;
import java.util.Objects;
/* loaded from: classes.dex */
public final class b8 extends da {
    public final da.a a;
    public final long b;

    public b8(da.a aVar, long j) {
        Objects.requireNonNull(aVar, "Null status");
        this.a = aVar;
        this.b = j;
    }

    @Override // com.daaw.da
    public long b() {
        return this.b;
    }

    @Override // com.daaw.da
    public da.a c() {
        return this.a;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof da) {
            da daVar = (da) obj;
            return this.a.equals(daVar.c()) && this.b == daVar.b();
        }
        return false;
    }

    public int hashCode() {
        long j = this.b;
        return ((this.a.hashCode() ^ 1000003) * 1000003) ^ ((int) (j ^ (j >>> 32)));
    }

    public String toString() {
        return "BackendResponse{status=" + this.a + ", nextRequestWaitMillis=" + this.b + "}";
    }
}
