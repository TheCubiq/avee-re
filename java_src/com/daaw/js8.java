package com.daaw;

import java.util.List;
/* loaded from: classes2.dex */
public final class js8 extends ad2 {

    /* renamed from: r */
    public final zp8 f15375r;

    public js8(zp8 zp8Var) {
        super("internal.logger");
        this.f15375r = zp8Var;
        this.f3098q.put("log", new er8(this, false, true));
        this.f3098q.put("silent", new qm8(this, "silent"));
        ((ad2) this.f3098q.get("silent")).mo2705h("log", new er8(this, true, true));
        this.f3098q.put("unmonitored", new oo8(this, "unmonitored"));
        ((ad2) this.f3098q.get("unmonitored")).mo2705h("log", new er8(this, false, false));
    }

    @Override // com.daaw.ad2
    /* renamed from: a */
    public final gl2 mo5780a(w07 w07Var, List list) {
        return gl2.f11420g;
    }
}
