package com.daaw;
/* loaded from: classes.dex */
public interface da1 {

    /* loaded from: classes.dex */
    public static final class a {
        public final fa1 a;
        public final fa1 b;

        public a(fa1 fa1Var) {
            this(fa1Var, fa1Var);
        }

        public a(fa1 fa1Var, fa1 fa1Var2) {
            this.a = (fa1) s6.e(fa1Var);
            this.b = (fa1) s6.e(fa1Var2);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj == null || a.class != obj.getClass()) {
                return false;
            }
            a aVar = (a) obj;
            return this.a.equals(aVar.a) && this.b.equals(aVar.b);
        }

        public int hashCode() {
            return (this.a.hashCode() * 31) + this.b.hashCode();
        }

        public String toString() {
            String str;
            StringBuilder sb = new StringBuilder();
            sb.append("[");
            sb.append(this.a);
            if (this.a.equals(this.b)) {
                str = "";
            } else {
                str = ", " + this.b;
            }
            sb.append(str);
            sb.append("]");
            return sb.toString();
        }
    }

    /* loaded from: classes.dex */
    public static final class b implements da1 {
        public final long a;
        public final a b;

        public b(long j) {
            this(j, 0L);
        }

        public b(long j, long j2) {
            this.a = j;
            this.b = new a(j2 == 0 ? fa1.c : new fa1(0L, j2));
        }

        @Override // com.daaw.da1
        public boolean e() {
            return false;
        }

        @Override // com.daaw.da1
        public a g(long j) {
            return this.b;
        }

        @Override // com.daaw.da1
        public long h() {
            return this.a;
        }
    }

    boolean e();

    a g(long j);

    long h();
}
