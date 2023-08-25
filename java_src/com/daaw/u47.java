package com.daaw;

import java.util.concurrent.Executor;
import javax.annotation.CheckForNull;
/* loaded from: classes.dex */
public final class u47 {
    public static final u47 d = new u47();
    @CheckForNull
    public final Runnable a;
    @CheckForNull
    public final Executor b;
    @CheckForNull
    public u47 c;

    public u47() {
        this.a = null;
        this.b = null;
    }

    public u47(Runnable runnable, Executor executor) {
        this.a = runnable;
        this.b = executor;
    }
}
