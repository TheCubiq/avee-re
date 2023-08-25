package com.daaw;

import java.util.concurrent.Callable;
/* loaded from: classes.dex */
public final class uu8 extends fx8 {
    public final Callable f;

    public /* synthetic */ uu8(Callable callable, ut8 ut8Var) {
        super();
        this.f = callable;
    }

    @Override // com.daaw.fx8
    public final String a() {
        try {
            return (String) this.f.call();
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
}
