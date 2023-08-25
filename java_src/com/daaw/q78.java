package com.daaw;

import java.io.IOException;
/* loaded from: classes2.dex */
public final class q78 extends IOException {
    public q78(String str, Throwable th) {
        super("CodedOutputStream was writing to a flat byte array and ran out of space.: ".concat(String.valueOf(str)), th);
    }

    public q78(Throwable th) {
        super("CodedOutputStream was writing to a flat byte array and ran out of space.", th);
    }
}
