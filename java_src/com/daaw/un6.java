package com.daaw;

import java.util.Map;
/* loaded from: classes.dex */
public final class un6 implements on6 {

    /* renamed from: a */
    public final ao6 f29351a;

    /* renamed from: b */
    public final yn6 f29352b;

    /* renamed from: c */
    public final ln6 f29353c;

    public un6(ln6 ln6Var, ao6 ao6Var, yn6 yn6Var, byte[] bArr) {
        this.f29353c = ln6Var;
        this.f29351a = ao6Var;
        this.f29352b = yn6Var;
    }

    @Override // com.daaw.on6
    /* renamed from: a */
    public final void mo7889a(nn6 nn6Var) {
        this.f29353c.m16713b(mo7888b(nn6Var));
    }

    @Override // com.daaw.on6
    /* renamed from: b */
    public final String mo7888b(nn6 nn6Var) {
        ao6 ao6Var = this.f29351a;
        Map m14945j = nn6Var.m14945j();
        this.f29352b.m3479a(m14945j);
        return ao6Var.m27313a(m14945j);
    }
}
