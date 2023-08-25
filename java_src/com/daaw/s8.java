package com.daaw;

import com.daaw.lm;
import java.util.Objects;
/* loaded from: classes2.dex */
public final class s8 extends lm.e.d.a.b.c {
    public final String a;
    public final String b;
    public final of0<lm.e.d.a.b.AbstractC0070e.AbstractC0072b> c;
    public final lm.e.d.a.b.c d;
    public final int e;

    /* loaded from: classes2.dex */
    public static final class b extends lm.e.d.a.b.c.AbstractC0067a {
        public String a;
        public String b;
        public of0<lm.e.d.a.b.AbstractC0070e.AbstractC0072b> c;
        public lm.e.d.a.b.c d;
        public Integer e;

        @Override // com.daaw.lm.e.d.a.b.c.AbstractC0067a
        public lm.e.d.a.b.c a() {
            String str = "";
            if (this.a == null) {
                str = " type";
            }
            if (this.c == null) {
                str = str + " frames";
            }
            if (this.e == null) {
                str = str + " overflowCount";
            }
            if (str.isEmpty()) {
                return new s8(this.a, this.b, this.c, this.d, this.e.intValue());
            }
            throw new IllegalStateException("Missing required properties:" + str);
        }

        @Override // com.daaw.lm.e.d.a.b.c.AbstractC0067a
        public lm.e.d.a.b.c.AbstractC0067a b(lm.e.d.a.b.c cVar) {
            this.d = cVar;
            return this;
        }

        @Override // com.daaw.lm.e.d.a.b.c.AbstractC0067a
        public lm.e.d.a.b.c.AbstractC0067a c(of0<lm.e.d.a.b.AbstractC0070e.AbstractC0072b> of0Var) {
            Objects.requireNonNull(of0Var, "Null frames");
            this.c = of0Var;
            return this;
        }

        @Override // com.daaw.lm.e.d.a.b.c.AbstractC0067a
        public lm.e.d.a.b.c.AbstractC0067a d(int i) {
            this.e = Integer.valueOf(i);
            return this;
        }

        @Override // com.daaw.lm.e.d.a.b.c.AbstractC0067a
        public lm.e.d.a.b.c.AbstractC0067a e(String str) {
            this.b = str;
            return this;
        }

        @Override // com.daaw.lm.e.d.a.b.c.AbstractC0067a
        public lm.e.d.a.b.c.AbstractC0067a f(String str) {
            Objects.requireNonNull(str, "Null type");
            this.a = str;
            return this;
        }
    }

    public s8(String str, String str2, of0<lm.e.d.a.b.AbstractC0070e.AbstractC0072b> of0Var, lm.e.d.a.b.c cVar, int i) {
        this.a = str;
        this.b = str2;
        this.c = of0Var;
        this.d = cVar;
        this.e = i;
    }

    @Override // com.daaw.lm.e.d.a.b.c
    public lm.e.d.a.b.c b() {
        return this.d;
    }

    @Override // com.daaw.lm.e.d.a.b.c
    public of0<lm.e.d.a.b.AbstractC0070e.AbstractC0072b> c() {
        return this.c;
    }

    @Override // com.daaw.lm.e.d.a.b.c
    public int d() {
        return this.e;
    }

    @Override // com.daaw.lm.e.d.a.b.c
    public String e() {
        return this.b;
    }

    public boolean equals(Object obj) {
        String str;
        lm.e.d.a.b.c cVar;
        if (obj == this) {
            return true;
        }
        if (obj instanceof lm.e.d.a.b.c) {
            lm.e.d.a.b.c cVar2 = (lm.e.d.a.b.c) obj;
            return this.a.equals(cVar2.f()) && ((str = this.b) != null ? str.equals(cVar2.e()) : cVar2.e() == null) && this.c.equals(cVar2.c()) && ((cVar = this.d) != null ? cVar.equals(cVar2.b()) : cVar2.b() == null) && this.e == cVar2.d();
        }
        return false;
    }

    @Override // com.daaw.lm.e.d.a.b.c
    public String f() {
        return this.a;
    }

    public int hashCode() {
        int hashCode = (this.a.hashCode() ^ 1000003) * 1000003;
        String str = this.b;
        int hashCode2 = (((hashCode ^ (str == null ? 0 : str.hashCode())) * 1000003) ^ this.c.hashCode()) * 1000003;
        lm.e.d.a.b.c cVar = this.d;
        return ((hashCode2 ^ (cVar != null ? cVar.hashCode() : 0)) * 1000003) ^ this.e;
    }

    public String toString() {
        return "Exception{type=" + this.a + ", reason=" + this.b + ", frames=" + this.c + ", causedBy=" + this.d + ", overflowCount=" + this.e + "}";
    }
}
