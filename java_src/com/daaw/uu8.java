package com.daaw;

import java.util.concurrent.Callable;
/* loaded from: classes.dex */
public final class uu8 extends fx8 {

    /* renamed from: f */
    public final Callable f29554f;

    public /* synthetic */ uu8(Callable callable, ut8 ut8Var) {
        super();
        this.f29554f = callable;
    }

    @Override // com.daaw.fx8
    /* renamed from: a */
    public final String mo7701a() {
        try {
            return (String) this.f29554f.call();
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
}
