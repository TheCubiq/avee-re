package com.daaw;

import android.net.Uri;
import java.util.Map;
import java.util.concurrent.atomic.AtomicLong;
/* loaded from: classes.dex */
public final class ar8 {

    /* renamed from: d */
    public static final AtomicLong f3510d = new AtomicLong();

    /* renamed from: a */
    public final pa6 f3511a;

    /* renamed from: b */
    public final Uri f3512b;

    /* renamed from: c */
    public final Map f3513c;

    public ar8(long j, pa6 pa6Var, Uri uri, Map map, long j2, long j3, long j4) {
        this.f3511a = pa6Var;
        this.f3512b = uri;
        this.f3513c = map;
    }

    /* renamed from: a */
    public static long m27119a() {
        return f3510d.getAndIncrement();
    }
}
