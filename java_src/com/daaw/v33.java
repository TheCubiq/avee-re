package com.daaw;

import java.io.InputStream;
/* loaded from: classes.dex */
public final class v33 {

    /* renamed from: a */
    public final InputStream f29812a;

    /* renamed from: b */
    public final boolean f29813b;

    /* renamed from: c */
    public final boolean f29814c;

    /* renamed from: d */
    public final long f29815d;

    /* renamed from: e */
    public final boolean f29816e;

    public v33(InputStream inputStream, boolean z, boolean z2, long j, boolean z3) {
        this.f29812a = inputStream;
        this.f29813b = z;
        this.f29814c = z2;
        this.f29815d = j;
        this.f29816e = z3;
    }

    /* renamed from: b */
    public static v33 m7516b(InputStream inputStream, boolean z, boolean z2, long j, boolean z3) {
        return new v33(inputStream, z, z2, j, z3);
    }

    /* renamed from: a */
    public final long m7517a() {
        return this.f29815d;
    }

    /* renamed from: c */
    public final InputStream m7515c() {
        return this.f29812a;
    }

    /* renamed from: d */
    public final boolean m7514d() {
        return this.f29813b;
    }

    /* renamed from: e */
    public final boolean m7513e() {
        return this.f29816e;
    }

    /* renamed from: f */
    public final boolean m7512f() {
        return this.f29814c;
    }
}
