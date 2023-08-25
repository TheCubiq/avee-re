package com.daaw;

import com.daaw.lm;
import java.util.Objects;
/* loaded from: classes2.dex */
public final class k8 extends lm.e {
    public final String a;
    public final String b;
    public final long c;
    public final Long d;
    public final boolean e;
    public final lm.e.a f;
    public final lm.e.f g;
    public final lm.e.AbstractC0075e h;
    public final lm.e.c i;
    public final of0<lm.e.d> j;
    public final int k;

    /* loaded from: classes2.dex */
    public static final class b extends lm.e.b {
        public String a;
        public String b;
        public Long c;
        public Long d;
        public Boolean e;
        public lm.e.a f;
        public lm.e.f g;
        public lm.e.AbstractC0075e h;
        public lm.e.c i;
        public of0<lm.e.d> j;
        public Integer k;

        public b() {
        }

        public b(lm.e eVar) {
            this.a = eVar.f();
            this.b = eVar.h();
            this.c = Long.valueOf(eVar.k());
            this.d = eVar.d();
            this.e = Boolean.valueOf(eVar.m());
            this.f = eVar.b();
            this.g = eVar.l();
            this.h = eVar.j();
            this.i = eVar.c();
            this.j = eVar.e();
            this.k = Integer.valueOf(eVar.g());
        }

        @Override // com.daaw.lm.e.b
        public lm.e a() {
            String str = "";
            if (this.a == null) {
                str = " generator";
            }
            if (this.b == null) {
                str = str + " identifier";
            }
            if (this.c == null) {
                str = str + " startedAt";
            }
            if (this.e == null) {
                str = str + " crashed";
            }
            if (this.f == null) {
                str = str + " app";
            }
            if (this.k == null) {
                str = str + " generatorType";
            }
            if (str.isEmpty()) {
                return new k8(this.a, this.b, this.c.longValue(), this.d, this.e.booleanValue(), this.f, this.g, this.h, this.i, this.j, this.k.intValue());
            }
            throw new IllegalStateException("Missing required properties:" + str);
        }

        @Override // com.daaw.lm.e.b
        public lm.e.b b(lm.e.a aVar) {
            Objects.requireNonNull(aVar, "Null app");
            this.f = aVar;
            return this;
        }

        @Override // com.daaw.lm.e.b
        public lm.e.b c(boolean z) {
            this.e = Boolean.valueOf(z);
            return this;
        }

        @Override // com.daaw.lm.e.b
        public lm.e.b d(lm.e.c cVar) {
            this.i = cVar;
            return this;
        }

        @Override // com.daaw.lm.e.b
        public lm.e.b e(Long l) {
            this.d = l;
            return this;
        }

        @Override // com.daaw.lm.e.b
        public lm.e.b f(of0<lm.e.d> of0Var) {
            this.j = of0Var;
            return this;
        }

        @Override // com.daaw.lm.e.b
        public lm.e.b g(String str) {
            Objects.requireNonNull(str, "Null generator");
            this.a = str;
            return this;
        }

        @Override // com.daaw.lm.e.b
        public lm.e.b h(int i) {
            this.k = Integer.valueOf(i);
            return this;
        }

        @Override // com.daaw.lm.e.b
        public lm.e.b i(String str) {
            Objects.requireNonNull(str, "Null identifier");
            this.b = str;
            return this;
        }

        @Override // com.daaw.lm.e.b
        public lm.e.b k(lm.e.AbstractC0075e abstractC0075e) {
            this.h = abstractC0075e;
            return this;
        }

        @Override // com.daaw.lm.e.b
        public lm.e.b l(long j) {
            this.c = Long.valueOf(j);
            return this;
        }

        @Override // com.daaw.lm.e.b
        public lm.e.b m(lm.e.f fVar) {
            this.g = fVar;
            return this;
        }
    }

    public k8(String str, String str2, long j, Long l, boolean z, lm.e.a aVar, lm.e.f fVar, lm.e.AbstractC0075e abstractC0075e, lm.e.c cVar, of0<lm.e.d> of0Var, int i) {
        this.a = str;
        this.b = str2;
        this.c = j;
        this.d = l;
        this.e = z;
        this.f = aVar;
        this.g = fVar;
        this.h = abstractC0075e;
        this.i = cVar;
        this.j = of0Var;
        this.k = i;
    }

    @Override // com.daaw.lm.e
    public lm.e.a b() {
        return this.f;
    }

    @Override // com.daaw.lm.e
    public lm.e.c c() {
        return this.i;
    }

    @Override // com.daaw.lm.e
    public Long d() {
        return this.d;
    }

    @Override // com.daaw.lm.e
    public of0<lm.e.d> e() {
        return this.j;
    }

    public boolean equals(Object obj) {
        Long l;
        lm.e.f fVar;
        lm.e.AbstractC0075e abstractC0075e;
        lm.e.c cVar;
        of0<lm.e.d> of0Var;
        if (obj == this) {
            return true;
        }
        if (obj instanceof lm.e) {
            lm.e eVar = (lm.e) obj;
            return this.a.equals(eVar.f()) && this.b.equals(eVar.h()) && this.c == eVar.k() && ((l = this.d) != null ? l.equals(eVar.d()) : eVar.d() == null) && this.e == eVar.m() && this.f.equals(eVar.b()) && ((fVar = this.g) != null ? fVar.equals(eVar.l()) : eVar.l() == null) && ((abstractC0075e = this.h) != null ? abstractC0075e.equals(eVar.j()) : eVar.j() == null) && ((cVar = this.i) != null ? cVar.equals(eVar.c()) : eVar.c() == null) && ((of0Var = this.j) != null ? of0Var.equals(eVar.e()) : eVar.e() == null) && this.k == eVar.g();
        }
        return false;
    }

    @Override // com.daaw.lm.e
    public String f() {
        return this.a;
    }

    @Override // com.daaw.lm.e
    public int g() {
        return this.k;
    }

    @Override // com.daaw.lm.e
    public String h() {
        return this.b;
    }

    public int hashCode() {
        long j = this.c;
        int hashCode = (((((this.a.hashCode() ^ 1000003) * 1000003) ^ this.b.hashCode()) * 1000003) ^ ((int) (j ^ (j >>> 32)))) * 1000003;
        Long l = this.d;
        int hashCode2 = (((((hashCode ^ (l == null ? 0 : l.hashCode())) * 1000003) ^ (this.e ? 1231 : 1237)) * 1000003) ^ this.f.hashCode()) * 1000003;
        lm.e.f fVar = this.g;
        int hashCode3 = (hashCode2 ^ (fVar == null ? 0 : fVar.hashCode())) * 1000003;
        lm.e.AbstractC0075e abstractC0075e = this.h;
        int hashCode4 = (hashCode3 ^ (abstractC0075e == null ? 0 : abstractC0075e.hashCode())) * 1000003;
        lm.e.c cVar = this.i;
        int hashCode5 = (hashCode4 ^ (cVar == null ? 0 : cVar.hashCode())) * 1000003;
        of0<lm.e.d> of0Var = this.j;
        return ((hashCode5 ^ (of0Var != null ? of0Var.hashCode() : 0)) * 1000003) ^ this.k;
    }

    @Override // com.daaw.lm.e
    public lm.e.AbstractC0075e j() {
        return this.h;
    }

    @Override // com.daaw.lm.e
    public long k() {
        return this.c;
    }

    @Override // com.daaw.lm.e
    public lm.e.f l() {
        return this.g;
    }

    @Override // com.daaw.lm.e
    public boolean m() {
        return this.e;
    }

    @Override // com.daaw.lm.e
    public lm.e.b n() {
        return new b(this);
    }

    public String toString() {
        return "Session{generator=" + this.a + ", identifier=" + this.b + ", startedAt=" + this.c + ", endedAt=" + this.d + ", crashed=" + this.e + ", app=" + this.f + ", user=" + this.g + ", os=" + this.h + ", device=" + this.i + ", events=" + this.j + ", generatorType=" + this.k + "}";
    }
}
