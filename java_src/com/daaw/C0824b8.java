package com.daaw;

import com.daaw.AbstractC1066da;
import java.util.Objects;
/* renamed from: com.daaw.b8 */
/* loaded from: classes.dex */
public final class C0824b8 extends AbstractC1066da {

    /* renamed from: a */
    public final AbstractC1066da.EnumC1067a f4515a;

    /* renamed from: b */
    public final long f4516b;

    public C0824b8(AbstractC1066da.EnumC1067a enumC1067a, long j) {
        Objects.requireNonNull(enumC1067a, "Null status");
        this.f4515a = enumC1067a;
        this.f4516b = j;
    }

    @Override // com.daaw.AbstractC1066da
    /* renamed from: b */
    public long mo24586b() {
        return this.f4516b;
    }

    @Override // com.daaw.AbstractC1066da
    /* renamed from: c */
    public AbstractC1066da.EnumC1067a mo24585c() {
        return this.f4515a;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof AbstractC1066da) {
            AbstractC1066da abstractC1066da = (AbstractC1066da) obj;
            return this.f4515a.equals(abstractC1066da.mo24585c()) && this.f4516b == abstractC1066da.mo24586b();
        }
        return false;
    }

    public int hashCode() {
        long j = this.f4516b;
        return ((this.f4515a.hashCode() ^ 1000003) * 1000003) ^ ((int) (j ^ (j >>> 32)));
    }

    public String toString() {
        return "BackendResponse{status=" + this.f4515a + ", nextRequestWaitMillis=" + this.f4516b + "}";
    }
}
