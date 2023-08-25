package com.daaw;

import java.util.Map;
/* loaded from: classes.dex */
public final class do6 implements on6 {
    public final ao6 a;
    public final yn6 b;

    public do6(ao6 ao6Var, yn6 yn6Var) {
        this.a = ao6Var;
        this.b = yn6Var;
    }

    @Override // com.daaw.on6
    public final void a(nn6 nn6Var) {
    }

    @Override // com.daaw.on6
    public final String b(nn6 nn6Var) {
        ao6 ao6Var = this.a;
        Map j = nn6Var.j();
        this.b.a(j);
        return ao6Var.a(j);
    }
}
