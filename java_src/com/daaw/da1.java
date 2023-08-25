package com.daaw;
/* loaded from: classes.dex */
public interface da1 {

    /* renamed from: com.daaw.da1$a */
    /* loaded from: classes.dex */
    public static final class C1068a {

        /* renamed from: a */
        public final fa1 f6712a;

        /* renamed from: b */
        public final fa1 f6713b;

        public C1068a(fa1 fa1Var) {
            this(fa1Var, fa1Var);
        }

        public C1068a(fa1 fa1Var, fa1 fa1Var2) {
            this.f6712a = (fa1) C2914s6.m10686e(fa1Var);
            this.f6713b = (fa1) C2914s6.m10686e(fa1Var2);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj == null || C1068a.class != obj.getClass()) {
                return false;
            }
            C1068a c1068a = (C1068a) obj;
            return this.f6712a.equals(c1068a.f6712a) && this.f6713b.equals(c1068a.f6713b);
        }

        public int hashCode() {
            return (this.f6712a.hashCode() * 31) + this.f6713b.hashCode();
        }

        public String toString() {
            String str;
            StringBuilder sb = new StringBuilder();
            sb.append("[");
            sb.append(this.f6712a);
            if (this.f6712a.equals(this.f6713b)) {
                str = "";
            } else {
                str = ", " + this.f6713b;
            }
            sb.append(str);
            sb.append("]");
            return sb.toString();
        }
    }

    /* renamed from: com.daaw.da1$b */
    /* loaded from: classes.dex */
    public static final class C1069b implements da1 {

        /* renamed from: a */
        public final long f6714a;

        /* renamed from: b */
        public final C1068a f6715b;

        public C1069b(long j) {
            this(j, 0L);
        }

        public C1069b(long j, long j2) {
            this.f6714a = j;
            this.f6715b = new C1068a(j2 == 0 ? fa1.f9301c : new fa1(0L, j2));
        }

        @Override // com.daaw.da1
        /* renamed from: e */
        public boolean mo6932e() {
            return false;
        }

        @Override // com.daaw.da1
        /* renamed from: g */
        public C1068a mo6931g(long j) {
            return this.f6715b;
        }

        @Override // com.daaw.da1
        /* renamed from: h */
        public long mo6930h() {
            return this.f6714a;
        }
    }

    /* renamed from: e */
    boolean mo6932e();

    /* renamed from: g */
    C1068a mo6931g(long j);

    /* renamed from: h */
    long mo6930h();
}
