package com.daaw;

import android.net.Uri;
import java.util.Collections;
import java.util.Map;
/* loaded from: classes.dex */
public final class j86 {
    public Uri a;
    public final int b = 1;
    public Map c = Collections.emptyMap();
    public long d;
    public int e;

    public final j86 a(int i) {
        this.e = 6;
        return this;
    }

    public final j86 b(Map map) {
        this.c = map;
        return this;
    }

    public final j86 c(long j) {
        this.d = j;
        return this;
    }

    public final j86 d(Uri uri) {
        this.a = uri;
        return this;
    }

    public final pa6 e() {
        if (this.a != null) {
            return new pa6(this.a, this.c, this.d, this.e);
        }
        throw new IllegalStateException("The uri must be set.");
    }
}
