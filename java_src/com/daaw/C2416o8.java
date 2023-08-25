package com.daaw;

import com.daaw.AbstractC2057lm;
import java.util.Objects;
/* renamed from: com.daaw.o8 */
/* loaded from: classes2.dex */
public final class C2416o8 extends AbstractC2057lm.AbstractC2067e.AbstractC2074d {

    /* renamed from: a */
    public final long f21117a;

    /* renamed from: b */
    public final String f21118b;

    /* renamed from: c */
    public final AbstractC2057lm.AbstractC2067e.AbstractC2074d.AbstractC2075a f21119c;

    /* renamed from: d */
    public final AbstractC2057lm.AbstractC2067e.AbstractC2074d.AbstractC2090c f21120d;

    /* renamed from: e */
    public final AbstractC2057lm.AbstractC2067e.AbstractC2074d.AbstractC2092d f21121e;

    /* renamed from: com.daaw.o8$b */
    /* loaded from: classes2.dex */
    public static final class C2418b extends AbstractC2057lm.AbstractC2067e.AbstractC2074d.AbstractC2089b {

        /* renamed from: a */
        public Long f21122a;

        /* renamed from: b */
        public String f21123b;

        /* renamed from: c */
        public AbstractC2057lm.AbstractC2067e.AbstractC2074d.AbstractC2075a f21124c;

        /* renamed from: d */
        public AbstractC2057lm.AbstractC2067e.AbstractC2074d.AbstractC2090c f21125d;

        /* renamed from: e */
        public AbstractC2057lm.AbstractC2067e.AbstractC2074d.AbstractC2092d f21126e;

        public C2418b() {
        }

        public C2418b(AbstractC2057lm.AbstractC2067e.AbstractC2074d abstractC2074d) {
            this.f21122a = Long.valueOf(abstractC2074d.mo14481e());
            this.f21123b = abstractC2074d.mo14480f();
            this.f21124c = abstractC2074d.mo14484b();
            this.f21125d = abstractC2074d.mo14483c();
            this.f21126e = abstractC2074d.mo14482d();
        }

        @Override // com.daaw.AbstractC2057lm.AbstractC2067e.AbstractC2074d.AbstractC2089b
        /* renamed from: a */
        public AbstractC2057lm.AbstractC2067e.AbstractC2074d mo14478a() {
            String str = "";
            if (this.f21122a == null) {
                str = " timestamp";
            }
            if (this.f21123b == null) {
                str = str + " type";
            }
            if (this.f21124c == null) {
                str = str + " app";
            }
            if (this.f21125d == null) {
                str = str + " device";
            }
            if (str.isEmpty()) {
                return new C2416o8(this.f21122a.longValue(), this.f21123b, this.f21124c, this.f21125d, this.f21126e);
            }
            throw new IllegalStateException("Missing required properties:" + str);
        }

        @Override // com.daaw.AbstractC2057lm.AbstractC2067e.AbstractC2074d.AbstractC2089b
        /* renamed from: b */
        public AbstractC2057lm.AbstractC2067e.AbstractC2074d.AbstractC2089b mo14477b(AbstractC2057lm.AbstractC2067e.AbstractC2074d.AbstractC2075a abstractC2075a) {
            Objects.requireNonNull(abstractC2075a, "Null app");
            this.f21124c = abstractC2075a;
            return this;
        }

        @Override // com.daaw.AbstractC2057lm.AbstractC2067e.AbstractC2074d.AbstractC2089b
        /* renamed from: c */
        public AbstractC2057lm.AbstractC2067e.AbstractC2074d.AbstractC2089b mo14476c(AbstractC2057lm.AbstractC2067e.AbstractC2074d.AbstractC2090c abstractC2090c) {
            Objects.requireNonNull(abstractC2090c, "Null device");
            this.f21125d = abstractC2090c;
            return this;
        }

        @Override // com.daaw.AbstractC2057lm.AbstractC2067e.AbstractC2074d.AbstractC2089b
        /* renamed from: d */
        public AbstractC2057lm.AbstractC2067e.AbstractC2074d.AbstractC2089b mo14475d(AbstractC2057lm.AbstractC2067e.AbstractC2074d.AbstractC2092d abstractC2092d) {
            this.f21126e = abstractC2092d;
            return this;
        }

        @Override // com.daaw.AbstractC2057lm.AbstractC2067e.AbstractC2074d.AbstractC2089b
        /* renamed from: e */
        public AbstractC2057lm.AbstractC2067e.AbstractC2074d.AbstractC2089b mo14474e(long j) {
            this.f21122a = Long.valueOf(j);
            return this;
        }

        @Override // com.daaw.AbstractC2057lm.AbstractC2067e.AbstractC2074d.AbstractC2089b
        /* renamed from: f */
        public AbstractC2057lm.AbstractC2067e.AbstractC2074d.AbstractC2089b mo14473f(String str) {
            Objects.requireNonNull(str, "Null type");
            this.f21123b = str;
            return this;
        }
    }

    public C2416o8(long j, String str, AbstractC2057lm.AbstractC2067e.AbstractC2074d.AbstractC2075a abstractC2075a, AbstractC2057lm.AbstractC2067e.AbstractC2074d.AbstractC2090c abstractC2090c, AbstractC2057lm.AbstractC2067e.AbstractC2074d.AbstractC2092d abstractC2092d) {
        this.f21117a = j;
        this.f21118b = str;
        this.f21119c = abstractC2075a;
        this.f21120d = abstractC2090c;
        this.f21121e = abstractC2092d;
    }

    @Override // com.daaw.AbstractC2057lm.AbstractC2067e.AbstractC2074d
    /* renamed from: b */
    public AbstractC2057lm.AbstractC2067e.AbstractC2074d.AbstractC2075a mo14484b() {
        return this.f21119c;
    }

    @Override // com.daaw.AbstractC2057lm.AbstractC2067e.AbstractC2074d
    /* renamed from: c */
    public AbstractC2057lm.AbstractC2067e.AbstractC2074d.AbstractC2090c mo14483c() {
        return this.f21120d;
    }

    @Override // com.daaw.AbstractC2057lm.AbstractC2067e.AbstractC2074d
    /* renamed from: d */
    public AbstractC2057lm.AbstractC2067e.AbstractC2074d.AbstractC2092d mo14482d() {
        return this.f21121e;
    }

    @Override // com.daaw.AbstractC2057lm.AbstractC2067e.AbstractC2074d
    /* renamed from: e */
    public long mo14481e() {
        return this.f21117a;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof AbstractC2057lm.AbstractC2067e.AbstractC2074d) {
            AbstractC2057lm.AbstractC2067e.AbstractC2074d abstractC2074d = (AbstractC2057lm.AbstractC2067e.AbstractC2074d) obj;
            if (this.f21117a == abstractC2074d.mo14481e() && this.f21118b.equals(abstractC2074d.mo14480f()) && this.f21119c.equals(abstractC2074d.mo14484b()) && this.f21120d.equals(abstractC2074d.mo14483c())) {
                AbstractC2057lm.AbstractC2067e.AbstractC2074d.AbstractC2092d abstractC2092d = this.f21121e;
                AbstractC2057lm.AbstractC2067e.AbstractC2074d.AbstractC2092d mo14482d = abstractC2074d.mo14482d();
                if (abstractC2092d == null) {
                    if (mo14482d == null) {
                        return true;
                    }
                } else if (abstractC2092d.equals(mo14482d)) {
                    return true;
                }
            }
            return false;
        }
        return false;
    }

    @Override // com.daaw.AbstractC2057lm.AbstractC2067e.AbstractC2074d
    /* renamed from: f */
    public String mo14480f() {
        return this.f21118b;
    }

    @Override // com.daaw.AbstractC2057lm.AbstractC2067e.AbstractC2074d
    /* renamed from: g */
    public AbstractC2057lm.AbstractC2067e.AbstractC2074d.AbstractC2089b mo14479g() {
        return new C2418b(this);
    }

    public int hashCode() {
        long j = this.f21117a;
        int hashCode = (((((((((int) (j ^ (j >>> 32))) ^ 1000003) * 1000003) ^ this.f21118b.hashCode()) * 1000003) ^ this.f21119c.hashCode()) * 1000003) ^ this.f21120d.hashCode()) * 1000003;
        AbstractC2057lm.AbstractC2067e.AbstractC2074d.AbstractC2092d abstractC2092d = this.f21121e;
        return (abstractC2092d == null ? 0 : abstractC2092d.hashCode()) ^ hashCode;
    }

    public String toString() {
        return "Event{timestamp=" + this.f21117a + ", type=" + this.f21118b + ", app=" + this.f21119c + ", device=" + this.f21120d + ", log=" + this.f21121e + "}";
    }
}
