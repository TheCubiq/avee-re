package com.daaw;

import java.util.Objects;
/* loaded from: classes.dex */
public final class t47 {

    /* renamed from: b */
    public static final t47 f27001b = new t47(new C3012a("Failure occurred while trying to finish a future."));

    /* renamed from: a */
    public final Throwable f27002a;

    /* renamed from: com.daaw.t47$a */
    /* loaded from: classes.dex */
    public class C3012a extends Throwable {
        public C3012a(String str) {
            super("Failure occurred while trying to finish a future.");
        }

        @Override // java.lang.Throwable
        public final synchronized Throwable fillInStackTrace() {
            return this;
        }
    }

    public t47(Throwable th) {
        Objects.requireNonNull(th);
        this.f27002a = th;
    }
}
