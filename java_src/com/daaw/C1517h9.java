package com.daaw;

import com.daaw.cl0;
import java.util.Arrays;
/* renamed from: com.daaw.h9 */
/* loaded from: classes.dex */
public final class C1517h9 extends cl0 {

    /* renamed from: a */
    public final long f12189a;

    /* renamed from: b */
    public final Integer f12190b;

    /* renamed from: c */
    public final long f12191c;

    /* renamed from: d */
    public final byte[] f12192d;

    /* renamed from: e */
    public final String f12193e;

    /* renamed from: f */
    public final long f12194f;

    /* renamed from: g */
    public final ls0 f12195g;

    /* renamed from: com.daaw.h9$b */
    /* loaded from: classes.dex */
    public static final class C1519b extends cl0.AbstractC0968a {

        /* renamed from: a */
        public Long f12196a;

        /* renamed from: b */
        public Integer f12197b;

        /* renamed from: c */
        public Long f12198c;

        /* renamed from: d */
        public byte[] f12199d;

        /* renamed from: e */
        public String f12200e;

        /* renamed from: f */
        public Long f12201f;

        /* renamed from: g */
        public ls0 f12202g;

        @Override // com.daaw.cl0.AbstractC0968a
        /* renamed from: a */
        public cl0 mo20935a() {
            String str = "";
            if (this.f12196a == null) {
                str = " eventTimeMs";
            }
            if (this.f12198c == null) {
                str = str + " eventUptimeMs";
            }
            if (this.f12201f == null) {
                str = str + " timezoneOffsetSeconds";
            }
            if (str.isEmpty()) {
                return new C1517h9(this.f12196a.longValue(), this.f12197b, this.f12198c.longValue(), this.f12199d, this.f12200e, this.f12201f.longValue(), this.f12202g);
            }
            throw new IllegalStateException("Missing required properties:" + str);
        }

        @Override // com.daaw.cl0.AbstractC0968a
        /* renamed from: b */
        public cl0.AbstractC0968a mo20934b(Integer num) {
            this.f12197b = num;
            return this;
        }

        @Override // com.daaw.cl0.AbstractC0968a
        /* renamed from: c */
        public cl0.AbstractC0968a mo20933c(long j) {
            this.f12196a = Long.valueOf(j);
            return this;
        }

        @Override // com.daaw.cl0.AbstractC0968a
        /* renamed from: d */
        public cl0.AbstractC0968a mo20932d(long j) {
            this.f12198c = Long.valueOf(j);
            return this;
        }

        @Override // com.daaw.cl0.AbstractC0968a
        /* renamed from: e */
        public cl0.AbstractC0968a mo20931e(ls0 ls0Var) {
            this.f12202g = ls0Var;
            return this;
        }

        @Override // com.daaw.cl0.AbstractC0968a
        /* renamed from: f */
        public cl0.AbstractC0968a mo20930f(byte[] bArr) {
            this.f12199d = bArr;
            return this;
        }

        @Override // com.daaw.cl0.AbstractC0968a
        /* renamed from: g */
        public cl0.AbstractC0968a mo20929g(String str) {
            this.f12200e = str;
            return this;
        }

        @Override // com.daaw.cl0.AbstractC0968a
        /* renamed from: h */
        public cl0.AbstractC0968a mo20928h(long j) {
            this.f12201f = Long.valueOf(j);
            return this;
        }
    }

    public C1517h9(long j, Integer num, long j2, byte[] bArr, String str, long j3, ls0 ls0Var) {
        this.f12189a = j;
        this.f12190b = num;
        this.f12191c = j2;
        this.f12192d = bArr;
        this.f12193e = str;
        this.f12194f = j3;
        this.f12195g = ls0Var;
    }

    @Override // com.daaw.cl0
    /* renamed from: b */
    public Integer mo20942b() {
        return this.f12190b;
    }

    @Override // com.daaw.cl0
    /* renamed from: c */
    public long mo20941c() {
        return this.f12189a;
    }

    @Override // com.daaw.cl0
    /* renamed from: d */
    public long mo20940d() {
        return this.f12191c;
    }

    @Override // com.daaw.cl0
    /* renamed from: e */
    public ls0 mo20939e() {
        return this.f12195g;
    }

    public boolean equals(Object obj) {
        Integer num;
        String str;
        if (obj == this) {
            return true;
        }
        if (obj instanceof cl0) {
            cl0 cl0Var = (cl0) obj;
            if (this.f12189a == cl0Var.mo20941c() && ((num = this.f12190b) != null ? num.equals(cl0Var.mo20942b()) : cl0Var.mo20942b() == null) && this.f12191c == cl0Var.mo20940d()) {
                if (Arrays.equals(this.f12192d, cl0Var instanceof C1517h9 ? ((C1517h9) cl0Var).f12192d : cl0Var.mo20938f()) && ((str = this.f12193e) != null ? str.equals(cl0Var.mo20937g()) : cl0Var.mo20937g() == null) && this.f12194f == cl0Var.mo20936h()) {
                    ls0 ls0Var = this.f12195g;
                    ls0 mo20939e = cl0Var.mo20939e();
                    if (ls0Var == null) {
                        if (mo20939e == null) {
                            return true;
                        }
                    } else if (ls0Var.equals(mo20939e)) {
                        return true;
                    }
                }
            }
            return false;
        }
        return false;
    }

    @Override // com.daaw.cl0
    /* renamed from: f */
    public byte[] mo20938f() {
        return this.f12192d;
    }

    @Override // com.daaw.cl0
    /* renamed from: g */
    public String mo20937g() {
        return this.f12193e;
    }

    @Override // com.daaw.cl0
    /* renamed from: h */
    public long mo20936h() {
        return this.f12194f;
    }

    public int hashCode() {
        long j = this.f12189a;
        int i = (((int) (j ^ (j >>> 32))) ^ 1000003) * 1000003;
        Integer num = this.f12190b;
        int hashCode = num == null ? 0 : num.hashCode();
        long j2 = this.f12191c;
        int hashCode2 = (((((i ^ hashCode) * 1000003) ^ ((int) (j2 ^ (j2 >>> 32)))) * 1000003) ^ Arrays.hashCode(this.f12192d)) * 1000003;
        String str = this.f12193e;
        int hashCode3 = str == null ? 0 : str.hashCode();
        long j3 = this.f12194f;
        int i2 = (((hashCode2 ^ hashCode3) * 1000003) ^ ((int) ((j3 >>> 32) ^ j3))) * 1000003;
        ls0 ls0Var = this.f12195g;
        return i2 ^ (ls0Var != null ? ls0Var.hashCode() : 0);
    }

    public String toString() {
        return "LogEvent{eventTimeMs=" + this.f12189a + ", eventCode=" + this.f12190b + ", eventUptimeMs=" + this.f12191c + ", sourceExtension=" + Arrays.toString(this.f12192d) + ", sourceExtensionJsonProto3=" + this.f12193e + ", timezoneOffsetSeconds=" + this.f12194f + ", networkConnectionInfo=" + this.f12195g + "}";
    }
}
