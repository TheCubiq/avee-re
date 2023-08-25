package com.daaw;
/* renamed from: com.daaw.j9 */
/* loaded from: classes.dex */
public final class C1814j9 extends hl0 {

    /* renamed from: a */
    public final long f14536a;

    public C1814j9(long j) {
        this.f14536a = j;
    }

    @Override // com.daaw.hl0
    /* renamed from: c */
    public long mo18725c() {
        return this.f14536a;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        return (obj instanceof hl0) && this.f14536a == ((hl0) obj).mo18725c();
    }

    public int hashCode() {
        long j = this.f14536a;
        return 1000003 ^ ((int) (j ^ (j >>> 32)));
    }

    public String toString() {
        return "LogResponse{nextRequestWaitMillis=" + this.f14536a + "}";
    }
}
