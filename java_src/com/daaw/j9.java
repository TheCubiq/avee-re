package com.daaw;
/* loaded from: classes.dex */
public final class j9 extends hl0 {
    public final long a;

    public j9(long j) {
        this.a = j;
    }

    @Override // com.daaw.hl0
    public long c() {
        return this.a;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        return (obj instanceof hl0) && this.a == ((hl0) obj).c();
    }

    public int hashCode() {
        long j = this.a;
        return 1000003 ^ ((int) (j ^ (j >>> 32)));
    }

    public String toString() {
        return "LogResponse{nextRequestWaitMillis=" + this.a + "}";
    }
}
