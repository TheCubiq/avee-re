package com.daaw;

import android.net.Uri;
import com.daaw.jk0;
import java.io.InputStream;
/* loaded from: classes.dex */
public final class vv0<T> implements jk0.c {
    public final pp a;
    public final int b;
    public final mp c;
    public final a<? extends T> d;
    public volatile T e;
    public volatile long f;

    /* loaded from: classes.dex */
    public interface a<T> {
        T a(Uri uri, InputStream inputStream);
    }

    public vv0(mp mpVar, Uri uri, int i, a<? extends T> aVar) {
        this(mpVar, new pp(uri, 3), i, aVar);
    }

    public vv0(mp mpVar, pp ppVar, int i, a<? extends T> aVar) {
        this.c = mpVar;
        this.a = ppVar;
        this.b = i;
        this.d = aVar;
    }

    @Override // com.daaw.jk0.c
    public final void a() {
        op opVar = new op(this.c, this.a);
        try {
            opVar.q();
            this.e = this.d.a(this.c.d(), opVar);
        } finally {
            this.f = opVar.d();
            sq1.i(opVar);
        }
    }

    @Override // com.daaw.jk0.c
    public final void b() {
    }

    public long c() {
        return this.f;
    }

    public final T d() {
        return this.e;
    }
}
