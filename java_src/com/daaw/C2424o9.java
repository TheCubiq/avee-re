package com.daaw;

import com.daaw.s81;
import java.util.Objects;
import java.util.Set;
/* renamed from: com.daaw.o9 */
/* loaded from: classes.dex */
public final class C2424o9 extends s81.AbstractC2921b {

    /* renamed from: a */
    public final long f21165a;

    /* renamed from: b */
    public final long f21166b;

    /* renamed from: c */
    public final Set<s81.EnumC2923c> f21167c;

    /* renamed from: com.daaw.o9$b */
    /* loaded from: classes.dex */
    public static final class C2426b extends s81.AbstractC2921b.AbstractC2922a {

        /* renamed from: a */
        public Long f21168a;

        /* renamed from: b */
        public Long f21169b;

        /* renamed from: c */
        public Set<s81.EnumC2923c> f21170c;

        @Override // com.daaw.s81.AbstractC2921b.AbstractC2922a
        /* renamed from: a */
        public s81.AbstractC2921b mo10532a() {
            String str = "";
            if (this.f21168a == null) {
                str = " delta";
            }
            if (this.f21169b == null) {
                str = str + " maxAllowedDelay";
            }
            if (this.f21170c == null) {
                str = str + " flags";
            }
            if (str.isEmpty()) {
                return new C2424o9(this.f21168a.longValue(), this.f21169b.longValue(), this.f21170c);
            }
            throw new IllegalStateException("Missing required properties:" + str);
        }

        @Override // com.daaw.s81.AbstractC2921b.AbstractC2922a
        /* renamed from: b */
        public s81.AbstractC2921b.AbstractC2922a mo10531b(long j) {
            this.f21168a = Long.valueOf(j);
            return this;
        }

        @Override // com.daaw.s81.AbstractC2921b.AbstractC2922a
        /* renamed from: c */
        public s81.AbstractC2921b.AbstractC2922a mo10530c(Set<s81.EnumC2923c> set) {
            Objects.requireNonNull(set, "Null flags");
            this.f21170c = set;
            return this;
        }

        @Override // com.daaw.s81.AbstractC2921b.AbstractC2922a
        /* renamed from: d */
        public s81.AbstractC2921b.AbstractC2922a mo10529d(long j) {
            this.f21169b = Long.valueOf(j);
            return this;
        }
    }

    public C2424o9(long j, long j2, Set<s81.EnumC2923c> set) {
        this.f21165a = j;
        this.f21166b = j2;
        this.f21167c = set;
    }

    @Override // com.daaw.s81.AbstractC2921b
    /* renamed from: b */
    public long mo10535b() {
        return this.f21165a;
    }

    @Override // com.daaw.s81.AbstractC2921b
    /* renamed from: c */
    public Set<s81.EnumC2923c> mo10534c() {
        return this.f21167c;
    }

    @Override // com.daaw.s81.AbstractC2921b
    /* renamed from: d */
    public long mo10533d() {
        return this.f21166b;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof s81.AbstractC2921b) {
            s81.AbstractC2921b abstractC2921b = (s81.AbstractC2921b) obj;
            return this.f21165a == abstractC2921b.mo10535b() && this.f21166b == abstractC2921b.mo10533d() && this.f21167c.equals(abstractC2921b.mo10534c());
        }
        return false;
    }

    public int hashCode() {
        long j = this.f21165a;
        long j2 = this.f21166b;
        return this.f21167c.hashCode() ^ ((((((int) (j ^ (j >>> 32))) ^ 1000003) * 1000003) ^ ((int) (j2 ^ (j2 >>> 32)))) * 1000003);
    }

    public String toString() {
        return "ConfigValue{delta=" + this.f21165a + ", maxAllowedDelay=" + this.f21166b + ", flags=" + this.f21167c + "}";
    }
}
