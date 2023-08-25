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
public abstract class i<V> implements fk0<V> {
    public static final boolean s = Boolean.parseBoolean(System.getProperty("guava.concurrent.generate_cancellation_cause", "false"));
    public static final Logger t = Logger.getLogger(i.class.getName());
    public static final b u;
    public static final Object v;
    public volatile Object p;
    public volatile e q;
    public volatile C0053i r;

    /* loaded from: classes.dex */
    public static abstract class b {
        public b() {
        }

        public abstract boolean a(i<?> iVar, e eVar, e eVar2);

        public abstract boolean b(i<?> iVar, Object obj, Object obj2);

        public abstract boolean c(i<?> iVar, C0053i c0053i, C0053i c0053i2);

        public abstract void d(C0053i c0053i, C0053i c0053i2);

        public abstract void e(C0053i c0053i, Thread thread);
    }

    /* loaded from: classes.dex */
    public static final class c {
        public static final c c;
        public static final c d;
        public final boolean a;
        public final Throwable b;

        static {
            if (i.s) {
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
            this.a = (Throwable) i.e(th);
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
        public final AtomicReferenceFieldUpdater<C0053i, Thread> a;
        public final AtomicReferenceFieldUpdater<C0053i, C0053i> b;
        public final AtomicReferenceFieldUpdater<i, C0053i> c;
        public final AtomicReferenceFieldUpdater<i, e> d;
        public final AtomicReferenceFieldUpdater<i, Object> e;

        public f(AtomicReferenceFieldUpdater<C0053i, Thread> atomicReferenceFieldUpdater, AtomicReferenceFieldUpdater<C0053i, C0053i> atomicReferenceFieldUpdater2, AtomicReferenceFieldUpdater<i, C0053i> atomicReferenceFieldUpdater3, AtomicReferenceFieldUpdater<i, e> atomicReferenceFieldUpdater4, AtomicReferenceFieldUpdater<i, Object> atomicReferenceFieldUpdater5) {
            super();
            this.a = atomicReferenceFieldUpdater;
            this.b = atomicReferenceFieldUpdater2;
            this.c = atomicReferenceFieldUpdater3;
            this.d = atomicReferenceFieldUpdater4;
            this.e = atomicReferenceFieldUpdater5;
        }

        @Override // com.daaw.i.b
        public boolean a(i<?> iVar, e eVar, e eVar2) {
            return j.a(this.d, iVar, eVar, eVar2);
        }

        @Override // com.daaw.i.b
        public boolean b(i<?> iVar, Object obj, Object obj2) {
            return j.a(this.e, iVar, obj, obj2);
        }

        @Override // com.daaw.i.b
        public boolean c(i<?> iVar, C0053i c0053i, C0053i c0053i2) {
            return j.a(this.c, iVar, c0053i, c0053i2);
        }

        @Override // com.daaw.i.b
        public void d(C0053i c0053i, C0053i c0053i2) {
            this.b.lazySet(c0053i, c0053i2);
        }

        @Override // com.daaw.i.b
        public void e(C0053i c0053i, Thread thread) {
            this.a.lazySet(c0053i, thread);
        }
    }

    /* loaded from: classes.dex */
    public static final class g<V> implements Runnable {
        public final i<V> p;
        public final fk0<? extends V> q;

        public g(i<V> iVar, fk0<? extends V> fk0Var) {
            this.p = iVar;
            this.q = fk0Var;
        }

        @Override // java.lang.Runnable
        public void run() {
            if (this.p.p != this) {
                return;
            }
            if (i.u.b(this.p, this, i.k(this.q))) {
                i.h(this.p);
            }
        }
    }

    /* loaded from: classes.dex */
    public static final class h extends b {
        public h() {
            super();
        }

        @Override // com.daaw.i.b
        public boolean a(i<?> iVar, e eVar, e eVar2) {
            synchronized (iVar) {
                if (iVar.q == eVar) {
                    iVar.q = eVar2;
                    return true;
                }
                return false;
            }
        }

        @Override // com.daaw.i.b
        public boolean b(i<?> iVar, Object obj, Object obj2) {
            synchronized (iVar) {
                if (iVar.p == obj) {
                    iVar.p = obj2;
                    return true;
                }
                return false;
            }
        }

        @Override // com.daaw.i.b
        public boolean c(i<?> iVar, C0053i c0053i, C0053i c0053i2) {
            synchronized (iVar) {
                if (iVar.r == c0053i) {
                    iVar.r = c0053i2;
                    return true;
                }
                return false;
            }
        }

        @Override // com.daaw.i.b
        public void d(C0053i c0053i, C0053i c0053i2) {
            c0053i.b = c0053i2;
        }

        @Override // com.daaw.i.b
        public void e(C0053i c0053i, Thread thread) {
            c0053i.a = thread;
        }
    }

    /* renamed from: com.daaw.i$i  reason: collision with other inner class name */
    /* loaded from: classes.dex */
    public static final class C0053i {
        public static final C0053i c = new C0053i(false);
        public volatile Thread a;
        public volatile C0053i b;

        public C0053i() {
            i.u.e(this, Thread.currentThread());
        }

        public C0053i(boolean z) {
        }

        public void a(C0053i c0053i) {
            i.u.d(this, c0053i);
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
            hVar = new f(AtomicReferenceFieldUpdater.newUpdater(C0053i.class, Thread.class, "a"), AtomicReferenceFieldUpdater.newUpdater(C0053i.class, C0053i.class, "b"), AtomicReferenceFieldUpdater.newUpdater(i.class, C0053i.class, "r"), AtomicReferenceFieldUpdater.newUpdater(i.class, e.class, "q"), AtomicReferenceFieldUpdater.newUpdater(i.class, Object.class, "p"));
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

    public static <T> T e(T t2) {
        Objects.requireNonNull(t2);
        return t2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v0, types: [com.daaw.i$b] */
    /* JADX WARN: Type inference failed for: r4v0, types: [com.daaw.i<?>] */
    /* JADX WARN: Type inference failed for: r4v1, types: [com.daaw.i] */
    /* JADX WARN: Type inference failed for: r4v6, types: [com.daaw.i, com.daaw.i<V>] */
    public static void h(i<?> iVar) {
        e eVar = null;
        while (true) {
            iVar.o();
            iVar.b();
            e g2 = iVar.g(eVar);
            while (g2 != null) {
                eVar = g2.c;
                Runnable runnable = g2.a;
                if (runnable instanceof g) {
                    g gVar = (g) runnable;
                    iVar = gVar.p;
                    if (iVar.p == gVar) {
                        if (u.b(iVar, gVar, k(gVar.q))) {
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

    public static Object k(fk0<?> fk0Var) {
        if (fk0Var instanceof i) {
            Object obj = ((i) fk0Var).p;
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

    public static <V> V l(Future<V> future) {
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
            sb.append(t(l));
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
        i<V> iVar = this;
        while (true) {
            if (u.b(iVar, obj, cVar)) {
                if (z) {
                    iVar.m();
                }
                h(iVar);
                if (!(obj instanceof g)) {
                    return true;
                }
                fk0<? extends V> fk0Var = ((g) obj).q;
                if (!(fk0Var instanceof i)) {
                    fk0Var.cancel(z);
                    return true;
                }
                iVar = (i) fk0Var;
                obj = iVar.p;
                if (!(obj == null) && !(obj instanceof g)) {
                    return true;
                }
                z2 = true;
            } else {
                obj = iVar.p;
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
        C0053i c0053i = this.r;
        if (c0053i != C0053i.c) {
            C0053i c0053i2 = new C0053i();
            do {
                c0053i2.a(c0053i);
                if (u.c(this, c0053i, c0053i2)) {
                    do {
                        LockSupport.park(this);
                        if (Thread.interrupted()) {
                            p(c0053i2);
                            throw new InterruptedException();
                        }
                        obj = this.p;
                    } while (!((obj != null) & (!(obj instanceof g))));
                    return j(obj);
                }
                c0053i = this.r;
            } while (c0053i != C0053i.c);
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
            C0053i c0053i = this.r;
            if (c0053i != C0053i.c) {
                C0053i c0053i2 = new C0053i();
                do {
                    c0053i2.a(c0053i);
                    if (u.c(this, c0053i, c0053i2)) {
                        do {
                            LockSupport.parkNanos(this, nanos);
                            if (Thread.interrupted()) {
                                p(c0053i2);
                                throw new InterruptedException();
                            }
                            Object obj2 = this.p;
                            if ((obj2 != null) && (!(obj2 instanceof g))) {
                                return j(obj2);
                            }
                            nanos = nanoTime - System.nanoTime();
                        } while (nanos >= 1000);
                        p(c0053i2);
                    } else {
                        c0053i = this.r;
                    }
                } while (c0053i != C0053i.c);
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
        String iVar = toString();
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
        throw new TimeoutException(str + " for " + iVar);
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
            return "setFuture=[" + t(((g) obj).q) + "]";
        } else if (this instanceof ScheduledFuture) {
            return "remaining delay=[" + ((ScheduledFuture) this).getDelay(TimeUnit.MILLISECONDS) + " ms]";
        } else {
            return null;
        }
    }

    public final void o() {
        C0053i c0053i;
        do {
            c0053i = this.r;
        } while (!u.c(this, c0053i, C0053i.c));
        while (c0053i != null) {
            c0053i.b();
            c0053i = c0053i.b;
        }
    }

    public final void p(C0053i c0053i) {
        c0053i.a = null;
        while (true) {
            C0053i c0053i2 = this.r;
            if (c0053i2 == C0053i.c) {
                return;
            }
            C0053i c0053i3 = null;
            while (c0053i2 != null) {
                C0053i c0053i4 = c0053i2.b;
                if (c0053i2.a != null) {
                    c0053i3 = c0053i2;
                } else if (c0053i3 != null) {
                    c0053i3.b = c0053i4;
                    if (c0053i3.a == null) {
                        break;
                    }
                } else if (!u.c(this, c0053i2, c0053i4)) {
                    break;
                }
                c0053i2 = c0053i4;
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

    public boolean s(fk0<? extends V> fk0Var) {
        d dVar;
        e(fk0Var);
        Object obj = this.p;
        if (obj == null) {
            if (fk0Var.isDone()) {
                if (u.b(this, null, k(fk0Var))) {
                    h(this);
                    return true;
                }
                return false;
            }
            g gVar = new g(this, fk0Var);
            if (u.b(this, null, gVar)) {
                try {
                    fk0Var.d(gVar, qt.INSTANCE);
                } catch (Throwable th) {
                    try {
                        dVar = new d(th);
                    } catch (Throwable unused) {
                        dVar = d.b;
                    }
                    u.b(this, gVar, dVar);
                }
                return true;
            }
            obj = this.p;
        }
        if (obj instanceof c) {
            fk0Var.cancel(((c) obj).a);
        }
        return false;
    }

    public final String t(Object obj) {
        return obj == this ? "this future" : String.valueOf(obj);
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
