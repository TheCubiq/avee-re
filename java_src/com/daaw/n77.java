package com.daaw;
/* loaded from: classes.dex */
public final class n77 {
    public static void a(Throwable th) {
        if (th instanceof InterruptedException) {
            Thread.currentThread().interrupt();
        }
    }
}
