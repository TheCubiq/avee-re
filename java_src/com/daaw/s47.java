package com.daaw;

import javax.annotation.CheckForNull;
/* loaded from: classes.dex */
public final class s47 {
    @CheckForNull
    public static final s47 c;
    @CheckForNull
    public static final s47 d;
    public final boolean a;
    @CheckForNull
    public final Throwable b;

    static {
        if (c57.s) {
            d = null;
            c = null;
            return;
        }
        d = new s47(false, null);
        c = new s47(true, null);
    }

    public s47(boolean z, @CheckForNull Throwable th) {
        this.a = z;
        this.b = th;
    }
}
