package com.daaw;
/* loaded from: classes.dex */
public final class sv7 extends RuntimeException {
    public sv7(xt7 xt7Var) {
        super("Message was missing required fields.  (Lite runtime could not determine which fields were missing).");
    }

    /* renamed from: a */
    public final xs7 m9798a() {
        return new xs7(getMessage());
    }
}
