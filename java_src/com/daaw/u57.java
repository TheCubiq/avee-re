package com.daaw;

import java.util.Collections;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.annotation.CheckForNull;
/* loaded from: classes.dex */
public abstract class u57 extends z47 {

    /* renamed from: y */
    public static final q57 f28580y;

    /* renamed from: z */
    public static final Logger f28581z = Logger.getLogger(u57.class.getName());
    @CheckForNull

    /* renamed from: w */
    public volatile Set<Throwable> f28582w = null;

    /* renamed from: x */
    public volatile int f28583x;

    static {
        Throwable th;
        q57 t57Var;
        try {
            t57Var = new r57(AtomicReferenceFieldUpdater.newUpdater(u57.class, Set.class, "w"), AtomicIntegerFieldUpdater.newUpdater(u57.class, "x"));
            th = null;
        } catch (Error | RuntimeException e) {
            th = e;
            t57Var = new t57(null);
        }
        f28580y = t57Var;
        if (th != null) {
            f28581z.logp(Level.SEVERE, "com.google.common.util.concurrent.AggregateFutureState", "<clinit>", "SafeAtomicHelper is broken!", th);
        }
    }

    public u57(int i) {
        this.f28583x = i;
    }

    /* renamed from: E */
    public final int m8561E() {
        return f28580y.mo9517a(this);
    }

    /* renamed from: G */
    public final Set m8559G() {
        Set<Throwable> set = this.f28582w;
        if (set == null) {
            Set newSetFromMap = Collections.newSetFromMap(new ConcurrentHashMap());
            mo8555K(newSetFromMap);
            f28580y.mo9516b(this, null, newSetFromMap);
            Set<Throwable> set2 = this.f28582w;
            set2.getClass();
            return set2;
        }
        return set;
    }

    /* renamed from: J */
    public final void m8556J() {
        this.f28582w = null;
    }

    /* renamed from: K */
    public abstract void mo8555K(Set set);
}
