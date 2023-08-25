package com.daaw;

import com.daaw.ls0;
/* loaded from: classes.dex */
public final class k9 extends ls0 {
    public final ls0.c a;
    public final ls0.b b;

    /* loaded from: classes.dex */
    public static final class b extends ls0.a {
        public ls0.c a;
        public ls0.b b;

        @Override // com.daaw.ls0.a
        public ls0 a() {
            return new k9(this.a, this.b);
        }

        @Override // com.daaw.ls0.a
        public ls0.a b(ls0.b bVar) {
            this.b = bVar;
            return this;
        }

        @Override // com.daaw.ls0.a
        public ls0.a c(ls0.c cVar) {
            this.a = cVar;
            return this;
        }
    }

    public k9(ls0.c cVar, ls0.b bVar) {
        this.a = cVar;
        this.b = bVar;
    }

    @Override // com.daaw.ls0
    public ls0.b b() {
        return this.b;
    }

    @Override // com.daaw.ls0
    public ls0.c c() {
        return this.a;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof ls0) {
            ls0 ls0Var = (ls0) obj;
            ls0.c cVar = this.a;
            if (cVar != null ? cVar.equals(ls0Var.c()) : ls0Var.c() == null) {
                ls0.b bVar = this.b;
                ls0.b b2 = ls0Var.b();
                if (bVar == null) {
                    if (b2 == null) {
                        return true;
                    }
                } else if (bVar.equals(b2)) {
                    return true;
                }
            }
            return false;
        }
        return false;
    }

    public int hashCode() {
        ls0.c cVar = this.a;
        int hashCode = ((cVar == null ? 0 : cVar.hashCode()) ^ 1000003) * 1000003;
        ls0.b bVar = this.b;
        return hashCode ^ (bVar != null ? bVar.hashCode() : 0);
    }

    public String toString() {
        return "NetworkConnectionInfo{networkType=" + this.a + ", mobileSubtype=" + this.b + "}";
    }
}
