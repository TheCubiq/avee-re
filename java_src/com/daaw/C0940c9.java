package com.daaw;

import com.daaw.AbstractC0896by;
import java.util.Map;
import java.util.Objects;
/* renamed from: com.daaw.c9 */
/* loaded from: classes.dex */
public final class C0940c9 extends AbstractC0896by {

    /* renamed from: a */
    public final String f5627a;

    /* renamed from: b */
    public final Integer f5628b;

    /* renamed from: c */
    public final C3475ww f5629c;

    /* renamed from: d */
    public final long f5630d;

    /* renamed from: e */
    public final long f5631e;

    /* renamed from: f */
    public final Map<String, String> f5632f;

    /* renamed from: com.daaw.c9$b */
    /* loaded from: classes.dex */
    public static final class C0942b extends AbstractC0896by.AbstractC0897a {

        /* renamed from: a */
        public String f5633a;

        /* renamed from: b */
        public Integer f5634b;

        /* renamed from: c */
        public C3475ww f5635c;

        /* renamed from: d */
        public Long f5636d;

        /* renamed from: e */
        public Long f5637e;

        /* renamed from: f */
        public Map<String, String> f5638f;

        @Override // com.daaw.AbstractC0896by.AbstractC0897a
        /* renamed from: d */
        public AbstractC0896by mo25500d() {
            String str = "";
            if (this.f5633a == null) {
                str = " transportName";
            }
            if (this.f5635c == null) {
                str = str + " encodedPayload";
            }
            if (this.f5636d == null) {
                str = str + " eventMillis";
            }
            if (this.f5637e == null) {
                str = str + " uptimeMillis";
            }
            if (this.f5638f == null) {
                str = str + " autoMetadata";
            }
            if (str.isEmpty()) {
                return new C0940c9(this.f5633a, this.f5634b, this.f5635c, this.f5636d.longValue(), this.f5637e.longValue(), this.f5638f);
            }
            throw new IllegalStateException("Missing required properties:" + str);
        }

        @Override // com.daaw.AbstractC0896by.AbstractC0897a
        /* renamed from: e */
        public Map<String, String> mo25499e() {
            Map<String, String> map = this.f5638f;
            if (map != null) {
                return map;
            }
            throw new IllegalStateException("Property \"autoMetadata\" has not been set");
        }

        @Override // com.daaw.AbstractC0896by.AbstractC0897a
        /* renamed from: f */
        public AbstractC0896by.AbstractC0897a mo25498f(Map<String, String> map) {
            Objects.requireNonNull(map, "Null autoMetadata");
            this.f5638f = map;
            return this;
        }

        @Override // com.daaw.AbstractC0896by.AbstractC0897a
        /* renamed from: g */
        public AbstractC0896by.AbstractC0897a mo25497g(Integer num) {
            this.f5634b = num;
            return this;
        }

        @Override // com.daaw.AbstractC0896by.AbstractC0897a
        /* renamed from: h */
        public AbstractC0896by.AbstractC0897a mo25496h(C3475ww c3475ww) {
            Objects.requireNonNull(c3475ww, "Null encodedPayload");
            this.f5635c = c3475ww;
            return this;
        }

        @Override // com.daaw.AbstractC0896by.AbstractC0897a
        /* renamed from: i */
        public AbstractC0896by.AbstractC0897a mo25495i(long j) {
            this.f5636d = Long.valueOf(j);
            return this;
        }

        @Override // com.daaw.AbstractC0896by.AbstractC0897a
        /* renamed from: j */
        public AbstractC0896by.AbstractC0897a mo25494j(String str) {
            Objects.requireNonNull(str, "Null transportName");
            this.f5633a = str;
            return this;
        }

        @Override // com.daaw.AbstractC0896by.AbstractC0897a
        /* renamed from: k */
        public AbstractC0896by.AbstractC0897a mo25493k(long j) {
            this.f5637e = Long.valueOf(j);
            return this;
        }
    }

    public C0940c9(String str, Integer num, C3475ww c3475ww, long j, long j2, Map<String, String> map) {
        this.f5627a = str;
        this.f5628b = num;
        this.f5629c = c3475ww;
        this.f5630d = j;
        this.f5631e = j2;
        this.f5632f = map;
    }

    @Override // com.daaw.AbstractC0896by
    /* renamed from: c */
    public Map<String, String> mo25506c() {
        return this.f5632f;
    }

    @Override // com.daaw.AbstractC0896by
    /* renamed from: d */
    public Integer mo25505d() {
        return this.f5628b;
    }

    @Override // com.daaw.AbstractC0896by
    /* renamed from: e */
    public C3475ww mo25504e() {
        return this.f5629c;
    }

    public boolean equals(Object obj) {
        Integer num;
        if (obj == this) {
            return true;
        }
        if (obj instanceof AbstractC0896by) {
            AbstractC0896by abstractC0896by = (AbstractC0896by) obj;
            return this.f5627a.equals(abstractC0896by.mo25502j()) && ((num = this.f5628b) != null ? num.equals(abstractC0896by.mo25505d()) : abstractC0896by.mo25505d() == null) && this.f5629c.equals(abstractC0896by.mo25504e()) && this.f5630d == abstractC0896by.mo25503f() && this.f5631e == abstractC0896by.mo25501k() && this.f5632f.equals(abstractC0896by.mo25506c());
        }
        return false;
    }

    @Override // com.daaw.AbstractC0896by
    /* renamed from: f */
    public long mo25503f() {
        return this.f5630d;
    }

    public int hashCode() {
        int hashCode = (this.f5627a.hashCode() ^ 1000003) * 1000003;
        Integer num = this.f5628b;
        int hashCode2 = num == null ? 0 : num.hashCode();
        long j = this.f5630d;
        long j2 = this.f5631e;
        return ((((((((hashCode ^ hashCode2) * 1000003) ^ this.f5629c.hashCode()) * 1000003) ^ ((int) (j ^ (j >>> 32)))) * 1000003) ^ ((int) (j2 ^ (j2 >>> 32)))) * 1000003) ^ this.f5632f.hashCode();
    }

    @Override // com.daaw.AbstractC0896by
    /* renamed from: j */
    public String mo25502j() {
        return this.f5627a;
    }

    @Override // com.daaw.AbstractC0896by
    /* renamed from: k */
    public long mo25501k() {
        return this.f5631e;
    }

    public String toString() {
        return "EventInternal{transportName=" + this.f5627a + ", code=" + this.f5628b + ", encodedPayload=" + this.f5629c + ", eventMillis=" + this.f5630d + ", uptimeMillis=" + this.f5631e + ", autoMetadata=" + this.f5632f + "}";
    }
}
