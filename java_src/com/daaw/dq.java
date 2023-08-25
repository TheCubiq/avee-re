package com.daaw;

import android.util.Log;
import com.daaw.ut;
import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;
/* loaded from: classes.dex */
public class dq<A, T, Z> {
    public static final b m = new b();
    public final ix a;
    public final int b;
    public final int c;
    public final ip<A> d;
    public final jp<A, T> e;
    public final cn1<T> f;
    public final i51<T, Z> g;
    public final a h;
    public final wt i;
    public final dz0 j;
    public final b k;
    public volatile boolean l;

    /* loaded from: classes.dex */
    public interface a {
        ut a();
    }

    /* loaded from: classes.dex */
    public static class b {
        public OutputStream a(File file) {
            return new BufferedOutputStream(new FileOutputStream(file));
        }
    }

    /* loaded from: classes.dex */
    public class c<DataType> implements ut.b {
        public final zw<DataType> a;
        public final DataType b;

        public c(zw<DataType> zwVar, DataType datatype) {
            this.a = zwVar;
            this.b = datatype;
        }

        @Override // com.daaw.ut.b
        public boolean a(File file) {
            boolean z;
            OutputStream outputStream = null;
            try {
                try {
                    outputStream = dq.this.k.a(file);
                    z = this.a.a(this.b, outputStream);
                    if (outputStream != null) {
                        try {
                            outputStream.close();
                        } catch (IOException unused) {
                        }
                    }
                } catch (Throwable th) {
                    if (outputStream != null) {
                        try {
                            outputStream.close();
                        } catch (IOException unused2) {
                        }
                    }
                    throw th;
                }
            } catch (FileNotFoundException unused3) {
                Log.isLoggable("DecodeJob", 3);
                if (outputStream != null) {
                    try {
                        outputStream.close();
                    } catch (IOException unused4) {
                    }
                }
                z = false;
            }
            return z;
        }
    }

    public dq(ix ixVar, int i, int i2, ip<A> ipVar, jp<A, T> jpVar, cn1<T> cn1Var, i51<T, Z> i51Var, a aVar, wt wtVar, dz0 dz0Var) {
        this(ixVar, i, i2, ipVar, jpVar, cn1Var, i51Var, aVar, wtVar, dz0Var, m);
    }

    public dq(ix ixVar, int i, int i2, ip<A> ipVar, jp<A, T> jpVar, cn1<T> cn1Var, i51<T, Z> i51Var, a aVar, wt wtVar, dz0 dz0Var, b bVar) {
        this.a = ixVar;
        this.b = i;
        this.c = i2;
        this.d = ipVar;
        this.e = jpVar;
        this.f = cn1Var;
        this.g = i51Var;
        this.h = aVar;
        this.i = wtVar;
        this.j = dz0Var;
        this.k = bVar;
    }

    public final z41<T> b(A a2) {
        long b2 = jl0.b();
        this.h.a().b(this.a.b(), new c(this.e.a(), a2));
        if (Log.isLoggable("DecodeJob", 2)) {
            j("Wrote source to cache", b2);
        }
        long b3 = jl0.b();
        z41<T> i = i(this.a.b());
        if (Log.isLoggable("DecodeJob", 2) && i != null) {
            j("Decoded source from cache", b3);
        }
        return i;
    }

    public void c() {
        this.l = true;
        this.d.cancel();
    }

    public z41<Z> d() {
        return m(g());
    }

    public final z41<T> e(A a2) {
        if (this.i.b()) {
            return b(a2);
        }
        long b2 = jl0.b();
        z41<T> c2 = this.e.d().c(a2, this.b, this.c);
        if (Log.isLoggable("DecodeJob", 2)) {
            j("Decoded from source", b2);
            return c2;
        }
        return c2;
    }

    public z41<Z> f() {
        if (this.i.a()) {
            long b2 = jl0.b();
            z41<T> i = i(this.a);
            if (Log.isLoggable("DecodeJob", 2)) {
                j("Decoded transformed from cache", b2);
            }
            long b3 = jl0.b();
            z41<Z> k = k(i);
            if (Log.isLoggable("DecodeJob", 2)) {
                j("Transcoded transformed from cache", b3);
            }
            return k;
        }
        return null;
    }

    public final z41<T> g() {
        try {
            long b2 = jl0.b();
            A a2 = this.d.a(this.j);
            if (Log.isLoggable("DecodeJob", 2)) {
                j("Fetched data", b2);
            }
            if (this.l) {
                return null;
            }
            return e(a2);
        } finally {
            this.d.b();
        }
    }

    public z41<Z> h() {
        if (this.i.b()) {
            long b2 = jl0.b();
            z41<T> i = i(this.a.b());
            if (Log.isLoggable("DecodeJob", 2)) {
                j("Decoded source from cache", b2);
            }
            return m(i);
        }
        return null;
    }

    public final z41<T> i(hi0 hi0Var) {
        File c2 = this.h.a().c(hi0Var);
        if (c2 == null) {
            return null;
        }
        try {
            z41<T> c3 = this.e.e().c(c2, this.b, this.c);
            if (c3 == null) {
            }
            return c3;
        } finally {
            this.h.a().a(hi0Var);
        }
    }

    public final void j(String str, long j) {
        StringBuilder sb = new StringBuilder();
        sb.append(str);
        sb.append(" in ");
        sb.append(jl0.a(j));
        sb.append(", key: ");
        sb.append(this.a);
    }

    public final z41<Z> k(z41<T> z41Var) {
        if (z41Var == null) {
            return null;
        }
        return this.g.a(z41Var);
    }

    public final z41<T> l(z41<T> z41Var) {
        if (z41Var == null) {
            return null;
        }
        z41<T> a2 = this.f.a(z41Var, this.b, this.c);
        if (!z41Var.equals(a2)) {
            z41Var.c();
        }
        return a2;
    }

    public final z41<Z> m(z41<T> z41Var) {
        long b2 = jl0.b();
        z41<T> l = l(z41Var);
        if (Log.isLoggable("DecodeJob", 2)) {
            j("Transformed resource from source", b2);
        }
        n(l);
        long b3 = jl0.b();
        z41<Z> k = k(l);
        if (Log.isLoggable("DecodeJob", 2)) {
            j("Transcoded transformed from source", b3);
        }
        return k;
    }

    public final void n(z41<T> z41Var) {
        if (z41Var == null || !this.i.a()) {
            return;
        }
        long b2 = jl0.b();
        this.h.a().b(this.a, new c(this.e.c(), z41Var));
        if (Log.isLoggable("DecodeJob", 2)) {
            j("Wrote transformed from source to cache", b2);
        }
    }
}
