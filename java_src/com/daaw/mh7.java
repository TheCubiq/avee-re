package com.daaw;

import java.util.Collections;
import java.util.HashMap;
/* loaded from: classes.dex */
public final class mh7 {

    /* renamed from: a */
    public HashMap f18880a = new HashMap();

    /* renamed from: a */
    public final oh7 m16025a() {
        if (this.f18880a != null) {
            oh7 oh7Var = new oh7(Collections.unmodifiableMap(this.f18880a), null);
            this.f18880a = null;
            return oh7Var;
        }
        throw new IllegalStateException("cannot call build() twice");
    }
}
