package com.daaw;

import android.net.Uri;
import java.util.Map;
import java.util.concurrent.atomic.AtomicLong;
/* loaded from: classes.dex */
public final class ar8 {
    public static final AtomicLong d = new AtomicLong();
    public final pa6 a;
    public final Uri b;
    public final Map c;

    public ar8(long j, pa6 pa6Var, Uri uri, Map map, long j2, long j3, long j4) {
        this.a = pa6Var;
        this.b = uri;
        this.c = map;
    }

    public static long a() {
        return d.getAndIncrement();
    }
}
