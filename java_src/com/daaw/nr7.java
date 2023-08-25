package com.daaw;

import java.io.IOException;
/* loaded from: classes.dex */
public final class nr7 extends IOException {
    public nr7(String str, Throwable th) {
        super("CodedOutputStream was writing to a flat byte array and ran out of space.: ".concat(String.valueOf(str)), th);
    }

    public nr7(Throwable th) {
        super("CodedOutputStream was writing to a flat byte array and ran out of space.", th);
    }
}
