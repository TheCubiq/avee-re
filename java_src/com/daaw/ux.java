package com.daaw;

import java.util.Objects;
/* loaded from: classes.dex */
public class ux extends Exception {
    public ux(Error error) {
        super(error);
        Objects.requireNonNull(error, "The causing error must not be null");
    }

    @Override // java.lang.Throwable
    /* renamed from: a */
    public Error getCause() {
        return (Error) super.getCause();
    }
}
