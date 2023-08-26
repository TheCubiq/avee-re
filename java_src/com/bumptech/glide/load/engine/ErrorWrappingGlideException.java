package com.bumptech.glide.load.engine;
/* loaded from: classes.dex */
public class ErrorWrappingGlideException extends Exception {
    public ErrorWrappingGlideException(Error error) {
        super(error);
        if (error == null) {
            throw new NullPointerException("The causing error must not be null");
        }
    }

    @Override // java.lang.Throwable
    public Error getCause() {
        return (Error) super.getCause();
    }
}
