package com.daaw;

import java.util.Objects;
/* renamed from: com.daaw.ux */
/* loaded from: classes.dex */
public class C3264ux extends Exception {
    public C3264ux(Error error) {
        super(error);
        Objects.requireNonNull(error, "The causing error must not be null");
    }

    @Override // java.lang.Throwable
    /* renamed from: a */
    public Error getCause() {
        return (Error) super.getCause();
    }
}
