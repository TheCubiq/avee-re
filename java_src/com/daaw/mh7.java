package com.daaw;

import java.util.Collections;
import java.util.HashMap;
/* loaded from: classes.dex */
public final class mh7 {
    public HashMap a = new HashMap();

    public final oh7 a() {
        if (this.a != null) {
            oh7 oh7Var = new oh7(Collections.unmodifiableMap(this.a), null);
            this.a = null;
            return oh7Var;
        }
        throw new IllegalStateException("cannot call build() twice");
    }
}
