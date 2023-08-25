package com.daaw;

import java.util.HashMap;
import java.util.Map;
import javax.annotation.ParametersAreNonnullByDefault;
@ParametersAreNonnullByDefault
@Deprecated
/* loaded from: classes.dex */
public final class t93 {

    /* renamed from: a */
    public final Map f27140a = new HashMap();

    /* renamed from: b */
    public final v93 f27141b;

    public t93(v93 v93Var) {
        this.f27141b = v93Var;
    }

    /* renamed from: a */
    public final v93 m9423a() {
        return this.f27141b;
    }

    /* renamed from: b */
    public final void m9422b(String str, s93 s93Var) {
        this.f27140a.put(str, s93Var);
    }

    /* renamed from: c */
    public final void m9421c(String str, String str2, long j) {
        v93 v93Var = this.f27141b;
        s93 s93Var = (s93) this.f27140a.get(str2);
        String[] strArr = {str};
        if (s93Var != null) {
            v93Var.m7313e(s93Var, j, strArr);
        }
        this.f27140a.put(str, new s93(j, null, null));
    }
}
