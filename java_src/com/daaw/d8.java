package com.daaw;

import com.daaw.uf;
/* loaded from: classes.dex */
public final class d8 extends uf {
    public final uf.b a;
    public final z2 b;

    /* loaded from: classes.dex */
    public static final class b extends uf.a {
        public uf.b a;
        public z2 b;

        @Override // com.daaw.uf.a
        public uf a() {
            return new d8(this.a, this.b);
        }

        @Override // com.daaw.uf.a
        public uf.a b(z2 z2Var) {
            this.b = z2Var;
            return this;
        }

        @Override // com.daaw.uf.a
        public uf.a c(uf.b bVar) {
            this.a = bVar;
            return this;
        }
    }

    public d8(uf.b bVar, z2 z2Var) {
        this.a = bVar;
        this.b = z2Var;
    }

    @Override // com.daaw.uf
    public z2 b() {
        return this.b;
    }

    @Override // com.daaw.uf
    public uf.b c() {
        return this.a;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof uf) {
            uf ufVar = (uf) obj;
            uf.b bVar = this.a;
            if (bVar != null ? bVar.equals(ufVar.c()) : ufVar.c() == null) {
                z2 z2Var = this.b;
                z2 b2 = ufVar.b();
                if (z2Var == null) {
                    if (b2 == null) {
                        return true;
                    }
                } else if (z2Var.equals(b2)) {
                    return true;
                }
            }
            return false;
        }
        return false;
    }

    public int hashCode() {
        uf.b bVar = this.a;
        int hashCode = ((bVar == null ? 0 : bVar.hashCode()) ^ 1000003) * 1000003;
        z2 z2Var = this.b;
        return hashCode ^ (z2Var != null ? z2Var.hashCode() : 0);
    }

    public String toString() {
        return "ClientInfo{clientType=" + this.a + ", androidClientInfo=" + this.b + "}";
    }
}
