package com.daaw;

import android.media.metrics.LogSessionId;
import java.util.Objects;
/* loaded from: classes.dex */
public final class lh8 {
    public static final lh8 b;
    public final jh8 a;

    static {
        b = it5.a < 31 ? new lh8() : new lh8(jh8.b);
    }

    public lh8() {
        this.a = null;
        uo4.f(it5.a < 31);
    }

    public lh8(LogSessionId logSessionId) {
        this.a = new jh8(logSessionId);
    }

    public lh8(jh8 jh8Var) {
        this.a = jh8Var;
    }

    public final LogSessionId a() {
        jh8 jh8Var = this.a;
        Objects.requireNonNull(jh8Var);
        return jh8Var.a;
    }
}
