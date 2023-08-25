package com.daaw;

import java.util.Objects;
/* loaded from: classes.dex */
public final class t47 {
    public static final t47 b = new t47(new a("Failure occurred while trying to finish a future."));
    public final Throwable a;

    /* loaded from: classes.dex */
    public class a extends Throwable {
        public a(String str) {
            super("Failure occurred while trying to finish a future.");
        }

        @Override // java.lang.Throwable
        public final synchronized Throwable fillInStackTrace() {
            return this;
        }
    }

    public t47(Throwable th) {
        Objects.requireNonNull(th);
        this.a = th;
    }
}
