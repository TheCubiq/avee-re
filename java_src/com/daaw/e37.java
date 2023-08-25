package com.daaw;

import java.util.Collection;
import java.util.Map;
import java.util.Set;
/* loaded from: classes.dex */
public final class e37 extends mz6 {
    public final transient iz6 u;

    public e37(Map map, iz6 iz6Var) {
        super(map);
        this.u = iz6Var;
    }

    @Override // com.daaw.j07
    public final Map e() {
        return q();
    }

    @Override // com.daaw.j07
    public final Set f() {
        return r();
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [java.util.Collection, java.lang.Object] */
    @Override // com.daaw.g07
    public final /* bridge */ /* synthetic */ Collection h() {
        return this.u.zza();
    }
}
