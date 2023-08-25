package com.daaw;

import com.daaw.of1;
import java.util.Objects;
/* loaded from: classes2.dex */
public final class r9 extends of1 {
    public final of1.a a;
    public final of1.c b;
    public final of1.b c;

    public r9(of1.a aVar, of1.c cVar, of1.b bVar) {
        Objects.requireNonNull(aVar, "Null appData");
        this.a = aVar;
        Objects.requireNonNull(cVar, "Null osData");
        this.b = cVar;
        Objects.requireNonNull(bVar, "Null deviceData");
        this.c = bVar;
    }

    @Override // com.daaw.of1
    public of1.a a() {
        return this.a;
    }

    @Override // com.daaw.of1
    public of1.b c() {
        return this.c;
    }

    @Override // com.daaw.of1
    public of1.c d() {
        return this.b;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof of1) {
            of1 of1Var = (of1) obj;
            return this.a.equals(of1Var.a()) && this.b.equals(of1Var.d()) && this.c.equals(of1Var.c());
        }
        return false;
    }

    public int hashCode() {
        return ((((this.a.hashCode() ^ 1000003) * 1000003) ^ this.b.hashCode()) * 1000003) ^ this.c.hashCode();
    }

    public String toString() {
        return "StaticSessionData{appData=" + this.a + ", osData=" + this.b + ", deviceData=" + this.c + "}";
    }
}
