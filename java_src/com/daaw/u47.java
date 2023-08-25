package com.daaw;

import java.util.concurrent.Executor;
import javax.annotation.CheckForNull;
/* loaded from: classes.dex */
public final class u47 {

    /* renamed from: d */
    public static final u47 f28546d = new u47();
    @CheckForNull

    /* renamed from: a */
    public final Runnable f28547a;
    @CheckForNull

    /* renamed from: b */
    public final Executor f28548b;
    @CheckForNull

    /* renamed from: c */
    public u47 f28549c;

    public u47() {
        this.f28547a = null;
        this.f28548b = null;
    }

    public u47(Runnable runnable, Executor executor) {
        this.f28547a = runnable;
        this.f28548b = executor;
    }
}
