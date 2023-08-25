package com.daaw;
/* loaded from: classes.dex */
public final class f86 extends Exception {
    public f86(String str) {
        super(str);
    }

    public f86(String str, Throwable th) {
        super("Could not obtain webview for the overlay.", th);
    }
}
