package com.daaw;
/* loaded from: classes.dex */
public final class of7 extends RuntimeException {
    public of7(String str) {
        super(str);
    }

    public of7(String str, Throwable th) {
        super("Creating a LegacyProtoKey failed", th);
    }
}
