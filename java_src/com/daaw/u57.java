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
    public static final q57 y;
    public static final Logger z = Logger.getLogger(u57.class.getName());
    @CheckForNull
    public volatile Set<Throwable> w = null;
    public volatile int x;

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
        y = t57Var;
        if (th != null) {
            z.logp(Level.SEVERE, "com.google.common.util.concurrent.AggregateFutureState", "<clinit>", "SafeAtomicHelper is broken!", th);
        }
    }

    public u57(int i) {
        this.x = i;
    }

    public final int E() {
        return y.a(this);
    }

    public final Set G() {
        Set<Throwable> set = this.w;
        if (set == null) {
            Set newSetFromMap = Collections.newSetFromMap(new ConcurrentHashMap());
            K(newSetFromMap);
            y.b(this, null, newSetFromMap);
            Set<Throwable> set2 = this.w;
            set2.getClass();
            return set2;
        }
        return set;
    }

    public final void J() {
        this.w = null;
    }

    public abstract void K(Set set);
}
