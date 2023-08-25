package com.daaw;

import android.media.metrics.LogSessionId;
import java.util.Objects;
/* loaded from: classes.dex */
public final class lh8 {

    /* renamed from: b */
    public static final lh8 f17418b;

    /* renamed from: a */
    public final jh8 f17419a;

    static {
        f17418b = it5.f13991a < 31 ? new lh8() : new lh8(jh8.f15117b);
    }

    public lh8() {
        this.f17419a = null;
        uo4.m7872f(it5.f13991a < 31);
    }

    public lh8(LogSessionId logSessionId) {
        this.f17419a = new jh8(logSessionId);
    }

    public lh8(jh8 jh8Var) {
        this.f17419a = jh8Var;
    }

    /* renamed from: a */
    public final LogSessionId m16945a() {
        jh8 jh8Var = this.f17419a;
        Objects.requireNonNull(jh8Var);
        return jh8Var.f15118a;
    }
}
