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

    /* renamed from: v */
    public static final ih2 f13078v = new dz7("eof ");

    /* renamed from: w */
    public static final oz7 f13079w = oz7.m13793b(hz7.class);

    /* renamed from: p */
    public fh2 f13080p;

    /* renamed from: q */
    public iz7 f13081q;

    /* renamed from: r */
    public ih2 f13082r = null;

    /* renamed from: s */
    public long f13083s = 0;

    /* renamed from: t */
    public long f13084t = 0;

    /* renamed from: u */
    public final List f13085u = new ArrayList();

    public void close() {
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        ih2 ih2Var = this.f13082r;
        if (ih2Var == f13078v) {
            return false;
        }
        if (ih2Var != null) {
            return true;
        }
        try {
            this.f13082r = next();
            return true;
        } catch (NoSuchElementException unused) {
            this.f13082r = f13078v;
            return false;
        }
    }

    @Override // java.util.Iterator
    /* renamed from: q */
    public final ih2 next() {
        ih2 mo22637a;
        ih2 ih2Var = this.f13082r;
        if (ih2Var != null && ih2Var != f13078v) {
            this.f13082r = null;
            return ih2Var;
        }
        iz7 iz7Var = this.f13081q;
        if (iz7Var == null || this.f13083s >= this.f13084t) {
            this.f13082r = f13078v;
            throw new NoSuchElementException();
        }
        try {
            synchronized (iz7Var) {
                this.f13081q.mo12773b(this.f13083s);
                mo22637a = this.f13080p.mo22637a(this.f13081q, this);
                this.f13083s = this.f13081q.zzb();
            }
            return mo22637a;
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
        for (int i = 0; i < this.f13085u.size(); i++) {
            if (i > 0) {
                sb.append(";");
            }
            sb.append(((ih2) this.f13085u.get(i)).toString());
        }
        sb.append("]");
        return sb.toString();
    }

    /* renamed from: u */
    public final List m20313u() {
        return (this.f13081q == null || this.f13082r == f13078v) ? this.f13085u : new nz7(this.f13085u, this);
    }

    /* renamed from: w */
    public final void m20312w(iz7 iz7Var, long j, fh2 fh2Var) {
        this.f13081q = iz7Var;
        this.f13083s = iz7Var.zzb();
        iz7Var.mo12773b(iz7Var.zzb() + j);
        this.f13084t = iz7Var.zzb();
        this.f13080p = fh2Var;
    }
}
