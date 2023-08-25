package com.daaw;

import android.net.Uri;
import java.util.Collections;
import java.util.Map;
/* loaded from: classes.dex */
public final class j86 {

    /* renamed from: a */
    public Uri f14527a;

    /* renamed from: b */
    public final int f14528b = 1;

    /* renamed from: c */
    public Map f14529c = Collections.emptyMap();

    /* renamed from: d */
    public long f14530d;

    /* renamed from: e */
    public int f14531e;

    /* renamed from: a */
    public final j86 m18730a(int i) {
        this.f14531e = 6;
        return this;
    }

    /* renamed from: b */
    public final j86 m18729b(Map map) {
        this.f14529c = map;
        return this;
    }

    /* renamed from: c */
    public final j86 m18728c(long j) {
        this.f14530d = j;
        return this;
    }

    /* renamed from: d */
    public final j86 m18727d(Uri uri) {
        this.f14527a = uri;
        return this;
    }

    /* renamed from: e */
    public final pa6 m18726e() {
        if (this.f14527a != null) {
            return new pa6(this.f14527a, this.f14529c, this.f14530d, this.f14531e);
        }
        throw new IllegalStateException("The uri must be set.");
    }
}
