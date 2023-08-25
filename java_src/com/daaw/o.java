package com.daaw;

import java.util.Locale;
import java.util.Objects;
import java.util.concurrent.CancellationException;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;
import java.util.concurrent.Future;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import java.util.concurrent.locks.LockSupport;
import java.util.logging.Level;
import java.util.logging.Logger;
/* loaded from: classes.dex */
public abstract class o<V> implements fk0<V> {
    public static final boolean s = Boolean.parseBoolean(System.getProperty("guava.concurrent.generate_cancellation_cause", "false"));
    public static final Logger t = Logger.getLogger(o.class.getName());
    public static final b u;
    public static final Object v;
    public volatile Object p;
    public volatile e q;
    public volatile i r;

    /* loaded from: classes.dex */
    public static abstract class b {
        public b() {
        }

        public abstract boolean a(o<?> oVar, e eVar, e eVar2);

        public abstract boolean b(o<?> oVar, Object obj, Object obj2);

        public abstract boolean c(o<?> oVar, i iVar, i iVar2);

        public abstract void d(i iVar, i iVar2);

        public abstract void e(i iVar, Thread thread);
    }

    /* loaded from: classes.dex */
    public static final class c {
        public static final c c;
        public static final c d;
        public final boolean a;
        public final Throwable b;

        static {
            if (o.s) {
                d = null;
                c = null;
                return;
            }
            d = new c(false, null);
            c = new c(true, null);
        }

        public c(boolean z, Throwable th) {
            this.a = z;
            this.b = th;
        }
    }

    /* loaded from: classes.dex */
    public static final class d {
        public static final d b = new d(new a("Failure occurred while trying to finish a future."));
        public final Throwable a;

        /* loaded from: classes.dex */
        public class a extends Throwable {
            public a(String str) {
                super(str);
            }

            @Override // java.lang.Throwable
            public synchronized Throwable fillInStackTrace() {
                return this;
            }
        }

        public d(Throwable th) {
            this.a = (Throwable) o.e(th);
        }
    }

    /* loaded from: classes.dex */
    public static final class e {
        public static final e d = new e(null, null);
        public final Runnable a;
        public final Executor b;
        public e c;

        public e(Runnable runnable, Executor executor) {
            this.a = runnable;
            this.b = executor;
        }
    }

    /* loaded from: classes.dex */
    public static final class f extends b {
        public final AtomicReferenceFieldUpdater<i, Thread> a;
        public final AtomicReferenceFieldUpdater<i, i> b;
        public final AtomicReferenceFieldUpdater<o, i> c;
        public final AtomicReferenceFieldUpdater<o, e> d;
        public final AtomicReferenceFieldUpdater<o, Object> e;

        public f(AtomicReferenceFieldUpdater<i, Thread> atomicReferenceFieldUpdater, AtomicReferenceFieldUpdater<i, i> atomicReferenceFieldUpdater2, AtomicReferenceFieldUpdater<o, i> atomicReferenceFieldUpdater3, AtomicReferenceFieldUpdater<o, e> atomicReferenceFieldUpdater4, AtomicReferenceFieldUpdater<o, Object> atomicReferenceFieldUpdater5) {
            super();
            this.a = atomicReferenceFieldUpdater;
            this.b = atomicReferenceFieldUpdater2;
            this.c = atomicReferenceFieldUpdater3;
            this.d = atomicReferenceFieldUpdater4;
            this.e = atomicReferenceFieldUpdater5;
        }

        @Override // com.daaw.o.b
        public boolean a(o<?> oVar, e eVar, e eVar2) {
            return j.a(this.d, oVar, eVar, eVar2);
        }

        @Override // com.daaw.o.b
        public boolean b(o<?> oVar, Object obj, Object obj2) {
            return j.a(this.e, oVar, obj, obj2);
        }

        @Override // com.daaw.o.b
        public boolean c(o<?> oVar, i iVar, i iVar2) {
            return j.a(this.c, oVar, iVar, iVar2);
        }

        @Override // com.daaw.o.b
        public void d(i iVar, i iVar2) {
            this.b.lazySet(iVar, iVar2);
        }

        @Override // com.daaw.o.b
        public void e(i iVar, Thread thread) {
            this.a.lazySet(iVar, thread);
        }
    }

    /* loaded from: classes.dex */
    public static final class g<V> implements Runnable {
        public final o<V> p;
        public final fk0<? extends V> q;

        @Override // java.lang.Runnable
        public void run() {
            if (this.p.p != this) {
                return;
            }
            if (o.u.b(this.p, this, o.k(this.q))) {
                o.h(this.p);
            }
        }
    }

    /* loaded from: classes.dex */
    public static final class h extends b {
        public h() {
            super();
        }

        @Override // com.daaw.o.b
        public boolean a(o<?> oVar, e eVar, e eVar2) {
            synchronized (oVar) {
                if (oVar.q == eVar) {
                    oVar.q = eVar2;
                    return true;
                }
                return false;
            }
        }

        @Override // com.daaw.o.b
        public boolean b(o<?> oVar, Object obj, Object obj2) {
            synchronized (oVar) {
                if (oVar.p == obj) {
                    oVar.p = obj2;
                    return true;
                }
                return false;
            }
        }

        @Override // com.daaw.o.b
        public boolean c(o<?> oVar, i iVar, i iVar2) {
            synchronized (oVar) {
                if (oVar.r == iVar) {
                    oVar.r = iVar2;
                    return true;
                }
                return false;
            }
        }

        @Override // com.daaw.o.b
        public void d(i iVar, i iVar2) {
            iVar.b = iVar2;
        }

        @Override // com.daaw.o.b
        public void e(i iVar, Thread thread) {
            iVar.a = thread;
        }
    }

    /* loaded from: classes.dex */
    public static final class i {
        public static final i c = new i(false);
        public volatile Thread a;
        public volatile i b;

        public i() {
            o.u.e(this, Thread.currentThread());
        }

        public i(boolean z) {
        }

        public void a(i iVar) {
            o.u.d(this, iVar);
        }

        public void b() {
            Thread thread = this.a;
            if (thread != null) {
                this.a = null;
                LockSupport.unpark(thread);
            }
        }
    }

    static {
        b hVar;
        try {
            hVar = new f(AtomicReferenceFieldUpdater.newUpdater(i.class, Thread.class, "a"), AtomicReferenceFieldUpdater.newUpdater(i.class, i.class, "b"), AtomicReferenceFieldUpdater.newUpdater(o.class, i.class, "r"), AtomicReferenceFieldUpdater.newUpdater(o.class, e.class, "q"), AtomicReferenceFieldUpdater.newUpdater(o.class, Object.class, "p"));
            th = null;
        } catch (Throwable th) {
            th = th;
            hVar = new h();
        }
        u = hVar;
        if (th != null) {
            t.log(Level.SEVERE, "SafeAtomicHelper is broken!", th);
        }
        v = new Object();
    }

    public static CancellationException c(String str, Throwable th) {
        CancellationException cancellationException = new CancellationException(str);
        cancellationException.initCause(th);
        return cancellationException;
    }

    static <T> T e(T t2) {
        Objects.requireNonNull(t2);
        return t2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v0, types: [com.daaw.o$b] */
    /* JADX WARN: Type inference failed for: r4v0, types: [com.daaw.o<?>] */
    /* JADX WARN: Type inference failed for: r4v1, types: [com.daaw.o] */
    /* JADX WARN: Type inference failed for: r4v6, types: [com.daaw.o<V>, com.daaw.o] */
    public static void h(o<?> oVar) {
        e eVar = null;
        while (true) {
            oVar.o();
            oVar.b();
            e g2 = oVar.g(eVar);
            while (g2 != null) {
                eVar = g2.c;
                Runnable runnable = g2.a;
                if (runnable instanceof g) {
                    g gVar = (g) runnable;
                    oVar = gVar.p;
                    if (oVar.p == gVar) {
                        if (u.b(oVar, gVar, k(gVar.q))) {
                            break;
                        }
                    } else {
                        continue;
                    }
                } else {
                    i(runnable, g2.b);
                }
                g2 = eVar;
            }
            return;
        }
    }

    public static void i(Runnable runnable, Executor executor) {
        try {
            executor.execute(runnable);
        } catch (RuntimeException e2) {
            Logger logger = t;
            Level level = Level.SEVERE;
            logger.log(level, "RuntimeException while executing runnable " + runnable + " with executor " + executor, (Throwable) e2);
        }
    }

    static Object k(fk0<?> fk0Var) {
        if (fk0Var instanceof o) {
            Object obj = ((o) fk0Var).p;
            if (obj instanceof c) {
                c cVar = (c) obj;
                return cVar.a ? cVar.b != null ? new c(false, cVar.b) : c.d : obj;
            }
            return obj;
        }
        boolean isCancelled = fk0Var.isCancelled();
        if ((!s) && isCancelled) {
            return c.d;
        }
        try {
            Object l = l(fk0Var);
            return l == null ? v : l;
        } catch (CancellationException e2) {
            if (isCancelled) {
                return new c(false, e2);
            }
            return new d(new IllegalArgumentException("get() threw CancellationException, despite reporting isCancelled() == false: " + fk0Var, e2));
        } catch (ExecutionException e3) {
            return new d(e3.getCause());
        } catch (Throwable th) {
            return new d(th);
        }
    }

    static <V> V l(Future<V> future) {
        V v2;
        boolean z = false;
        while (true) {
            try {
                v2 = future.get();
                break;
            } catch (InterruptedException unused) {
                z = true;
            } catch (Throwable th) {
                if (z) {
                    Thread.currentThread().interrupt();
                }
                throw th;
            }
        }
        if (z) {
            Thread.currentThread().interrupt();
        }
        return v2;
    }

    public final void a(StringBuilder sb) {
        String str = "]";
        try {
            Object l = l(this);
            sb.append("SUCCESS, result=[");
            sb.append(s(l));
            sb.append("]");
        } catch (CancellationException unused) {
            str = "CANCELLED";
            sb.append(str);
        } catch (RuntimeException e2) {
            sb.append("UNKNOWN, cause=[");
            sb.append(e2.getClass());
            str = " thrown from get()]";
            sb.append(str);
        } catch (ExecutionException e3) {
            sb.append("FAILURE, cause=[");
            sb.append(e3.getCause());
            sb.append(str);
        }
    }

    public void b() {
    }

    @Override // java.util.concurrent.Future
    public final boolean cancel(boolean z) {
        Object obj = this.p;
        if (!(obj == null) && !(obj instanceof g)) {
            return false;
        }
        c cVar = s ? new c(z, new CancellationException("Future.cancel() was called.")) : z ? c.c : c.d;
        boolean z2 = false;
        o<V> oVar = this;
        while (true) {
            if (u.b(oVar, obj, cVar)) {
                if (z) {
                    oVar.m();
                }
                h(oVar);
                if (!(obj instanceof g)) {
                    return true;
                }
                fk0<? extends V> fk0Var = ((g) obj).q;
                if (!(fk0Var instanceof o)) {
                    fk0Var.cancel(z);
                    return true;
                }
                oVar = (o) fk0Var;
                obj = oVar.p;
                if (!(obj == null) && !(obj instanceof g)) {
                    return true;
                }
                z2 = true;
            } else {
                obj = oVar.p;
                if (!(obj instanceof g)) {
                    return z2;
                }
            }
        }
    }

    @Override // com.daaw.fk0
    public final void d(Runnable runnable, Executor executor) {
        e(runnable);
        e(executor);
        e eVar = this.q;
        if (eVar == e.d) {
            i(runnable, executor);
        }
        e eVar2 = new e(runnable, executor);
        do {
            eVar2.c = eVar;
            if (u.a(this, eVar, eVar2)) {
                return;
            }
            eVar = this.q;
        } while (eVar != e.d);
        i(runnable, executor);
    }

    public final e g(e eVar) {
        e eVar2;
        do {
            eVar2 = this.q;
        } while (!u.a(this, eVar2, e.d));
        e eVar3 = eVar;
        e eVar4 = eVar2;
        while (eVar4 != null) {
            e eVar5 = eVar4.c;
            eVar4.c = eVar3;
            eVar3 = eVar4;
            eVar4 = eVar5;
        }
        return eVar3;
    }

    @Override // java.util.concurrent.Future
    public final V get() {
        Object obj;
        if (Thread.interrupted()) {
            throw new InterruptedException();
        }
        Object obj2 = this.p;
        if ((obj2 != null) && (!(obj2 instanceof g))) {
            return j(obj2);
        }
        i iVar = this.r;
        if (iVar != i.c) {
            i iVar2 = new i();
            do {
                iVar2.a(iVar);
                if (u.c(this, iVar, iVar2)) {
                    do {
                        LockSupport.park(this);
                        if (Thread.interrupted()) {
                            p(iVar2);
                            throw new InterruptedException();
                        }
                        obj = this.p;
                    } while (!((obj != null) & (!(obj instanceof g))));
                    return j(obj);
                }
                iVar = this.r;
            } while (iVar != i.c);
            return j(this.p);
        }
        return j(this.p);
    }

    @Override // java.util.concurrent.Future
    public final V get(long j, TimeUnit timeUnit) {
        Locale locale;
        long nanos = timeUnit.toNanos(j);
        if (Thread.interrupted()) {
            throw new InterruptedException();
        }
        Object obj = this.p;
        if ((obj != null) && (!(obj instanceof g))) {
            return j(obj);
        }
        long nanoTime = nanos > 0 ? System.nanoTime() + nanos : 0L;
        if (nanos >= 1000) {
            i iVar = this.r;
            if (iVar != i.c) {
                i iVar2 = new i();
                do {
                    iVar2.a(iVar);
                    if (u.c(this, iVar, iVar2)) {
                        do {
                            LockSupport.parkNanos(this, nanos);
                            if (Thread.interrupted()) {
                                p(iVar2);
                                throw new InterruptedException();
                            }
                            Object obj2 = this.p;
                            if ((obj2 != null) && (!(obj2 instanceof g))) {
                                return j(obj2);
                            }
                            nanos = nanoTime - System.nanoTime();
                        } while (nanos >= 1000);
                        p(iVar2);
                    } else {
                        iVar = this.r;
                    }
                } while (iVar != i.c);
                return j(this.p);
            }
            return j(this.p);
        }
        while (nanos > 0) {
            Object obj3 = this.p;
            if ((obj3 != null) && (!(obj3 instanceof g))) {
                return j(obj3);
            }
            if (Thread.interrupted()) {
                throw new InterruptedException();
            }
            nanos = nanoTime - System.nanoTime();
        }
        String oVar = toString();
        String lowerCase = timeUnit.toString().toLowerCase(Locale.ROOT);
        String str = "Waited " + j + " " + timeUnit.toString().toLowerCase(locale);
        if (nanos + 1000 < 0) {
            String str2 = str + " (plus ";
            long j2 = -nanos;
            long convert = timeUnit.convert(j2, TimeUnit.NANOSECONDS);
            long nanos2 = j2 - timeUnit.toNanos(convert);
            boolean z = convert == 0 || nanos2 > 1000;
            if (convert > 0) {
                String str3 = str2 + convert + " " + lowerCase;
                if (z) {
                    str3 = str3 + ",";
                }
                str2 = str3 + " ";
            }
            if (z) {
                str2 = str2 + nanos2 + " nanoseconds ";
            }
            str = str2 + "delay)";
        }
        if (isDone()) {
            throw new TimeoutException(str + " but future completed as timeout expired");
        }
        throw new TimeoutException(str + " for " + oVar);
    }

    @Override // java.util.concurrent.Future
    public final boolean isCancelled() {
        return this.p instanceof c;
    }

    @Override // java.util.concurrent.Future
    public final boolean isDone() {
        Object obj = this.p;
        return (!(obj instanceof g)) & (obj != null);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final V j(Object obj) {
        if (obj instanceof c) {
            throw c("Task was cancelled.", ((c) obj).b);
        }
        if (obj instanceof d) {
            throw new ExecutionException(((d) obj).a);
        }
        if (obj == v) {
            return null;
        }
        return obj;
    }

    public void m() {
    }

    public String n() {
        Object obj = this.p;
        if (obj instanceof g) {
            return "setFuture=[" + s(((g) obj).q) + "]";
        } else if (this instanceof ScheduledFuture) {
            return "remaining delay=[" + ((ScheduledFuture) this).getDelay(TimeUnit.MILLISECONDS) + " ms]";
        } else {
            return null;
        }
    }

    public final void o() {
        i iVar;
        do {
            iVar = this.r;
        } while (!u.c(this, iVar, i.c));
        while (iVar != null) {
            iVar.b();
            iVar = iVar.b;
        }
    }

    public final void p(i iVar) {
        iVar.a = null;
        while (true) {
            i iVar2 = this.r;
            if (iVar2 == i.c) {
                return;
            }
            i iVar3 = null;
            while (iVar2 != null) {
                i iVar4 = iVar2.b;
                if (iVar2.a != null) {
                    iVar3 = iVar2;
                } else if (iVar3 != null) {
                    iVar3.b = iVar4;
                    if (iVar3.a == null) {
                        break;
                    }
                } else if (!u.c(this, iVar2, iVar4)) {
                    break;
                }
                iVar2 = iVar4;
            }
            return;
        }
    }

    public boolean q(V v2) {
        if (v2 == null) {
            v2 = (V) v;
        }
        if (u.b(this, null, v2)) {
            h(this);
            return true;
        }
        return false;
    }

    public boolean r(Throwable th) {
        if (u.b(this, null, new d((Throwable) e(th)))) {
            h(this);
            return true;
        }
        return false;
    }

    public final String s(Object obj) {
        return obj == this ? "this future" : String.valueOf(obj);
    }

    public final boolean t() {
        Object obj = this.p;
        return (obj instanceof c) && ((c) obj).a;
    }

    public String toString() {
        String str;
        String str2;
        StringBuilder sb = new StringBuilder();
        sb.append(super.toString());
        sb.append("[status=");
        if (!isCancelled()) {
            if (!isDone()) {
                try {
                    str = n();
                } catch (RuntimeException e2) {
                    str = "Exception thrown from implementation: " + e2.getClass();
                }
                if (str != null && !str.isEmpty()) {
                    sb.append("PENDING, info=[");
                    sb.append(str);
                    sb.append("]");
                    sb.append("]");
                    return sb.toString();
                }
                str2 = isDone() ? "PENDING" : "PENDING";
            }
            a(sb);
            sb.append("]");
            return sb.toString();
        }
        str2 = "CANCELLED";
        sb.append(str2);
        sb.append("]");
        return sb.toString();
    }
}
