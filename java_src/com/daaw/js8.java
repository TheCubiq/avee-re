package com.daaw;

import java.util.List;
/* loaded from: classes2.dex */
public final class js8 extends ad2 {
    public final zp8 r;

    public js8(zp8 zp8Var) {
        super("internal.logger");
        this.r = zp8Var;
        this.q.put("log", new er8(this, false, true));
        this.q.put("silent", new qm8(this, "silent"));
        ((ad2) this.q.get("silent")).h("log", new er8(this, true, true));
        this.q.put("unmonitored", new oo8(this, "unmonitored"));
        ((ad2) this.q.get("unmonitored")).h("log", new er8(this, false, false));
    }

    @Override // com.daaw.ad2
    public final gl2 a(w07 w07Var, List list) {
        return gl2.g;
    }
}
