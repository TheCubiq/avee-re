package com.daaw;

import com.daaw.gl0;
import java.util.List;
/* renamed from: com.daaw.i9 */
/* loaded from: classes.dex */
public final class C1667i9 extends gl0 {

    /* renamed from: a */
    public final long f13359a;

    /* renamed from: b */
    public final long f13360b;

    /* renamed from: c */
    public final AbstractC3202uf f13361c;

    /* renamed from: d */
    public final Integer f13362d;

    /* renamed from: e */
    public final String f13363e;

    /* renamed from: f */
    public final List<cl0> f13364f;

    /* renamed from: g */
    public final h01 f13365g;

    /* renamed from: com.daaw.i9$b */
    /* loaded from: classes.dex */
    public static final class C1669b extends gl0.AbstractC1439a {

        /* renamed from: a */
        public Long f13366a;

        /* renamed from: b */
        public Long f13367b;

        /* renamed from: c */
        public AbstractC3202uf f13368c;

        /* renamed from: d */
        public Integer f13369d;

        /* renamed from: e */
        public String f13370e;

        /* renamed from: f */
        public List<cl0> f13371f;

        /* renamed from: g */
        public h01 f13372g;

        @Override // com.daaw.gl0.AbstractC1439a
        /* renamed from: a */
        public gl0 mo20020a() {
            String str = "";
            if (this.f13366a == null) {
                str = " requestTimeMs";
            }
            if (this.f13367b == null) {
                str = str + " requestUptimeMs";
            }
            if (str.isEmpty()) {
                return new C1667i9(this.f13366a.longValue(), this.f13367b.longValue(), this.f13368c, this.f13369d, this.f13370e, this.f13371f, this.f13372g);
            }
            throw new IllegalStateException("Missing required properties:" + str);
        }

        @Override // com.daaw.gl0.AbstractC1439a
        /* renamed from: b */
        public gl0.AbstractC1439a mo20019b(AbstractC3202uf abstractC3202uf) {
            this.f13368c = abstractC3202uf;
            return this;
        }

        @Override // com.daaw.gl0.AbstractC1439a
        /* renamed from: c */
        public gl0.AbstractC1439a mo20018c(List<cl0> list) {
            this.f13371f = list;
            return this;
        }

        @Override // com.daaw.gl0.AbstractC1439a
        /* renamed from: d */
        public gl0.AbstractC1439a mo20017d(Integer num) {
            this.f13369d = num;
            return this;
        }

        @Override // com.daaw.gl0.AbstractC1439a
        /* renamed from: e */
        public gl0.AbstractC1439a mo20016e(String str) {
            this.f13370e = str;
            return this;
        }

        @Override // com.daaw.gl0.AbstractC1439a
        /* renamed from: f */
        public gl0.AbstractC1439a mo20015f(h01 h01Var) {
            this.f13372g = h01Var;
            return this;
        }

        @Override // com.daaw.gl0.AbstractC1439a
        /* renamed from: g */
        public gl0.AbstractC1439a mo20014g(long j) {
            this.f13366a = Long.valueOf(j);
            return this;
        }

        @Override // com.daaw.gl0.AbstractC1439a
        /* renamed from: h */
        public gl0.AbstractC1439a mo20013h(long j) {
            this.f13367b = Long.valueOf(j);
            return this;
        }
    }

    public C1667i9(long j, long j2, AbstractC3202uf abstractC3202uf, Integer num, String str, List<cl0> list, h01 h01Var) {
        this.f13359a = j;
        this.f13360b = j2;
        this.f13361c = abstractC3202uf;
        this.f13362d = num;
        this.f13363e = str;
        this.f13364f = list;
        this.f13365g = h01Var;
    }

    @Override // com.daaw.gl0
    /* renamed from: b */
    public AbstractC3202uf mo20027b() {
        return this.f13361c;
    }

    @Override // com.daaw.gl0
    /* renamed from: c */
    public List<cl0> mo20026c() {
        return this.f13364f;
    }

    @Override // com.daaw.gl0
    /* renamed from: d */
    public Integer mo20025d() {
        return this.f13362d;
    }

    @Override // com.daaw.gl0
    /* renamed from: e */
    public String mo20024e() {
        return this.f13363e;
    }

    public boolean equals(Object obj) {
        AbstractC3202uf abstractC3202uf;
        Integer num;
        String str;
        List<cl0> list;
        if (obj == this) {
            return true;
        }
        if (obj instanceof gl0) {
            gl0 gl0Var = (gl0) obj;
            if (this.f13359a == gl0Var.mo20022g() && this.f13360b == gl0Var.mo20021h() && ((abstractC3202uf = this.f13361c) != null ? abstractC3202uf.equals(gl0Var.mo20027b()) : gl0Var.mo20027b() == null) && ((num = this.f13362d) != null ? num.equals(gl0Var.mo20025d()) : gl0Var.mo20025d() == null) && ((str = this.f13363e) != null ? str.equals(gl0Var.mo20024e()) : gl0Var.mo20024e() == null) && ((list = this.f13364f) != null ? list.equals(gl0Var.mo20026c()) : gl0Var.mo20026c() == null)) {
                h01 h01Var = this.f13365g;
                h01 mo20023f = gl0Var.mo20023f();
                if (h01Var == null) {
                    if (mo20023f == null) {
                        return true;
                    }
                } else if (h01Var.equals(mo20023f)) {
                    return true;
                }
            }
            return false;
        }
        return false;
    }

    @Override // com.daaw.gl0
    /* renamed from: f */
    public h01 mo20023f() {
        return this.f13365g;
    }

    @Override // com.daaw.gl0
    /* renamed from: g */
    public long mo20022g() {
        return this.f13359a;
    }

    @Override // com.daaw.gl0
    /* renamed from: h */
    public long mo20021h() {
        return this.f13360b;
    }

    public int hashCode() {
        long j = this.f13359a;
        long j2 = this.f13360b;
        int i = (((((int) (j ^ (j >>> 32))) ^ 1000003) * 1000003) ^ ((int) (j2 ^ (j2 >>> 32)))) * 1000003;
        AbstractC3202uf abstractC3202uf = this.f13361c;
        int hashCode = (i ^ (abstractC3202uf == null ? 0 : abstractC3202uf.hashCode())) * 1000003;
        Integer num = this.f13362d;
        int hashCode2 = (hashCode ^ (num == null ? 0 : num.hashCode())) * 1000003;
        String str = this.f13363e;
        int hashCode3 = (hashCode2 ^ (str == null ? 0 : str.hashCode())) * 1000003;
        List<cl0> list = this.f13364f;
        int hashCode4 = (hashCode3 ^ (list == null ? 0 : list.hashCode())) * 1000003;
        h01 h01Var = this.f13365g;
        return hashCode4 ^ (h01Var != null ? h01Var.hashCode() : 0);
    }

    public String toString() {
        return "LogRequest{requestTimeMs=" + this.f13359a + ", requestUptimeMs=" + this.f13360b + ", clientInfo=" + this.f13361c + ", logSource=" + this.f13362d + ", logSourceName=" + this.f13363e + ", logEvents=" + this.f13364f + ", qosTier=" + this.f13365g + "}";
    }
}
