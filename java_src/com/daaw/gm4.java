package com.daaw;

import java.util.Collections;
import java.util.List;
/* loaded from: classes.dex */
public final class gm4 {
    public final List a;

    public gm4(zl4 zl4Var) {
        this.a = Collections.singletonList(s67.i(zl4Var));
    }

    public gm4(List list) {
        this.a = list;
    }

    public static qq5 a(qq5 qq5Var) {
        return new rq5(qq5Var, new ey6() { // from class: com.daaw.fm4
            @Override // com.daaw.ey6
            public final Object apply(Object obj) {
                return new gm4((zl4) obj);
            }
        });
    }
}
