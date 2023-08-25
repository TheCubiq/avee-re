package com.daaw;

import java.util.Collections;
import java.util.List;
/* loaded from: classes.dex */
public final class gm4 {

    /* renamed from: a */
    public final List f11442a;

    public gm4(zl4 zl4Var) {
        this.f11442a = Collections.singletonList(s67.m10634i(zl4Var));
    }

    public gm4(List list) {
        this.f11442a = list;
    }

    /* renamed from: a */
    public static qq5 m21490a(qq5 qq5Var) {
        return new rq5(qq5Var, new ey6() { // from class: com.daaw.fm4
            @Override // com.daaw.ey6
            public final Object apply(Object obj) {
                return new gm4((zl4) obj);
            }
        });
    }
}
