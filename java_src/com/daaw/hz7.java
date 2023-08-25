package com.daaw;

import java.io.Closeable;
import java.io.EOFException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.NoSuchElementException;
/* loaded from: classes.dex */
public class hz7 implements Iterator, Closeable, jh2 {
    public static final ih2 v = new dz7("eof ");
    public static final oz7 w = oz7.b(hz7.class);
    public fh2 p;
    public iz7 q;
    public ih2 r = null;
    public long s = 0;
    public long t = 0;
    public final List u = new ArrayList();

    public void close() {
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        ih2 ih2Var = this.r;
        if (ih2Var == v) {
            return false;
        }
        if (ih2Var != null) {
            return true;
        }
        try {
            this.r = next();
            return true;
        } catch (NoSuchElementException unused) {
            this.r = v;
            return false;
        }
    }

    @Override // java.util.Iterator
    /* renamed from: q */
    public final ih2 next() {
        ih2 a;
        ih2 ih2Var = this.r;
        if (ih2Var != null && ih2Var != v) {
            this.r = null;
            return ih2Var;
        }
        iz7 iz7Var = this.q;
        if (iz7Var == null || this.s >= this.t) {
            this.r = v;
            throw new NoSuchElementException();
        }
        try {
            synchronized (iz7Var) {
                this.q.b(this.s);
                a = this.p.a(this.q, this);
                this.s = this.q.zzb();
            }
            return a;
        } catch (EOFException unused) {
            throw new NoSuchElementException();
        } catch (IOException unused2) {
            throw new NoSuchElementException();
        }
    }

    @Override // java.util.Iterator
    public final void remove() {
        throw new UnsupportedOperationException();
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append("[");
        for (int i = 0; i < this.u.size(); i++) {
            if (i > 0) {
                sb.append(";");
            }
            sb.append(((ih2) this.u.get(i)).toString());
        }
        sb.append("]");
        return sb.toString();
    }

    public final List u() {
        return (this.q == null || this.r == v) ? this.u : new nz7(this.u, this);
    }

    public final void w(iz7 iz7Var, long j, fh2 fh2Var) {
        this.q = iz7Var;
        this.s = iz7Var.zzb();
        iz7Var.b(iz7Var.zzb() + j);
        this.t = iz7Var.zzb();
        this.p = fh2Var;
    }
}
