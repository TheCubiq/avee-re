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
/* renamed from: com.daaw.o */
/* loaded from: classes.dex */
public abstract class AbstractC2377o<V> implements fk0<V> {

    /* renamed from: s */
    public static final boolean f20875s = Boolean.parseBoolean(System.getProperty("guava.concurrent.generate_cancellation_cause", "false"));

    /* renamed from: t */
    public static final Logger f20876t = Logger.getLogger(AbstractC2377o.class.getName());

    /* renamed from: u */
    public static final AbstractC2379b f20877u;

    /* renamed from: v */
    public static final Object f20878v;

    /* renamed from: p */
    public volatile Object f20879p;

    /* renamed from: q */
    public volatile C2383e f20880q;

    /* renamed from: r */
    public volatile C2387i f20881r;

    /* renamed from: com.daaw.o$b */
    /* loaded from: classes.dex */
    public static abstract class AbstractC2379b {
        public AbstractC2379b() {
        }

        /* renamed from: a */
        public abstract boolean mo14678a(AbstractC2377o<?> abstractC2377o, C2383e c2383e, C2383e c2383e2);

        /* renamed from: b */
        public abstract boolean mo14677b(AbstractC2377o<?> abstractC2377o, Object obj, Object obj2);

        /* renamed from: c */
        public abstract boolean mo14676c(AbstractC2377o<?> abstractC2377o, C2387i c2387i, C2387i c2387i2);

        /* renamed from: d */
        public abstract void mo14675d(C2387i c2387i, C2387i c2387i2);

        /* renamed from: e */
        public abstract void mo14674e(C2387i c2387i, Thread thread);
    }

    /* renamed from: com.daaw.o$c */
    /* loaded from: classes.dex */
    public static final class C2380c {

        /* renamed from: c */
        public static final C2380c f20882c;

        /* renamed from: d */
        public static final C2380c f20883d;

        /* renamed from: a */
        public final boolean f20884a;

        /* renamed from: b */
        public final Throwable f20885b;

        static {
            if (AbstractC2377o.f20875s) {
                f20883d = null;
                f20882c = null;
                return;
            }
            f20883d = new C2380c(false, null);
            f20882c = new C2380c(true, null);
        }

        public C2380c(boolean z, Throwable th) {
            this.f20884a = z;
            this.f20885b = th;
        }
    }

    /* renamed from: com.daaw.o$d */
    /* loaded from: classes.dex */
    public static final class C2381d {

        /* renamed from: b */
        public static final C2381d f20886b = new C2381d(new C2382a("Failure occurred while trying to finish a future."));

        /* renamed from: a */
        public final Throwable f20887a;

        /* renamed from: com.daaw.o$d$a */
        /* loaded from: classes.dex */
        public class C2382a extends Throwable {
            public C2382a(String str) {
                super(str);
            }

            @Override // java.lang.Throwable
            public synchronized Throwable fillInStackTrace() {
                return this;
            }
        }

        public C2381d(Throwable th) {
            this.f20887a = (Throwable) AbstractC2377o.m14693e(th);
        }
    }

    /* renamed from: com.daaw.o$e */
    /* loaded from: classes.dex */
    public static final class C2383e {

        /* renamed from: d */
        public static final C2383e f20888d = new C2383e(null, null);

        /* renamed from: a */
        public final Runnable f20889a;

        /* renamed from: b */
        public final Executor f20890b;

        /* renamed from: c */
        public C2383e f20891c;

        public C2383e(Runnable runnable, Executor executor) {
            this.f20889a = runnable;
            this.f20890b = executor;
        }
    }

    /* renamed from: com.daaw.o$f */
    /* loaded from: classes.dex */
    public static final class C2384f extends AbstractC2379b {

        /* renamed from: a */
        public final AtomicReferenceFieldUpdater<C2387i, Thread> f20892a;

        /* renamed from: b */
        public final AtomicReferenceFieldUpdater<C2387i, C2387i> f20893b;

        /* renamed from: c */
        public final AtomicReferenceFieldUpdater<AbstractC2377o, C2387i> f20894c;

        /* renamed from: d */
        public final AtomicReferenceFieldUpdater<AbstractC2377o, C2383e> f20895d;

        /* renamed from: e */
        public final AtomicReferenceFieldUpdater<AbstractC2377o, Object> f20896e;

        public C2384f(AtomicReferenceFieldUpdater<C2387i, Thread> atomicReferenceFieldUpdater, AtomicReferenceFieldUpdater<C2387i, C2387i> atomicReferenceFieldUpdater2, AtomicReferenceFieldUpdater<AbstractC2377o, C2387i> atomicReferenceFieldUpdater3, AtomicReferenceFieldUpdater<AbstractC2377o, C2383e> atomicReferenceFieldUpdater4, AtomicReferenceFieldUpdater<AbstractC2377o, Object> atomicReferenceFieldUpdater5) {
            super();
            this.f20892a = atomicReferenceFieldUpdater;
            this.f20893b = atomicReferenceFieldUpdater2;
            this.f20894c = atomicReferenceFieldUpdater3;
            this.f20895d = atomicReferenceFieldUpdater4;
            this.f20896e = atomicReferenceFieldUpdater5;
        }

        @Override // com.daaw.AbstractC2377o.AbstractC2379b
        /* renamed from: a */
        public boolean mo14678a(AbstractC2377o<?> abstractC2377o, C2383e c2383e, C2383e c2383e2) {
            return C1773j.m19216a(this.f20895d, abstractC2377o, c2383e, c2383e2);
        }

        @Override // com.daaw.AbstractC2377o.AbstractC2379b
        /* renamed from: b */
        public boolean mo14677b(AbstractC2377o<?> abstractC2377o, Object obj, Object obj2) {
            return C1773j.m19216a(this.f20896e, abstractC2377o, obj, obj2);
        }

        @Override // com.daaw.AbstractC2377o.AbstractC2379b
        /* renamed from: c */
        public boolean mo14676c(AbstractC2377o<?> abstractC2377o, C2387i c2387i, C2387i c2387i2) {
            return C1773j.m19216a(this.f20894c, abstractC2377o, c2387i, c2387i2);
        }

        @Override // com.daaw.AbstractC2377o.AbstractC2379b
        /* renamed from: d */
        public void mo14675d(C2387i c2387i, C2387i c2387i2) {
            this.f20893b.lazySet(c2387i, c2387i2);
        }

        @Override // com.daaw.AbstractC2377o.AbstractC2379b
        /* renamed from: e */
        public void mo14674e(C2387i c2387i, Thread thread) {
            this.f20892a.lazySet(c2387i, thread);
        }
    }

    /* renamed from: com.daaw.o$g */
    /* loaded from: classes.dex */
    public static final class RunnableC2385g<V> implements Runnable {

        /* renamed from: p */
        public final AbstractC2377o<V> f20897p;

        /* renamed from: q */
        public final fk0<? extends V> f20898q;

        @Override // java.lang.Runnable
        public void run() {
            if (this.f20897p.f20879p != this) {
                return;
            }
            if (AbstractC2377o.f20877u.mo14677b(this.f20897p, this, AbstractC2377o.m14688k(this.f20898q))) {
                AbstractC2377o.m14691h(this.f20897p);
            }
        }
    }

    /* renamed from: com.daaw.o$h */
    /* loaded from: classes.dex */
    public static final class C2386h extends AbstractC2379b {
        public C2386h() {
            super();
        }

        @Override // com.daaw.AbstractC2377o.AbstractC2379b
        /* renamed from: a */
        public boolean mo14678a(AbstractC2377o<?> abstractC2377o, C2383e c2383e, C2383e c2383e2) {
            synchronized (abstractC2377o) {
                if (abstractC2377o.f20880q == c2383e) {
                    abstractC2377o.f20880q = c2383e2;
                    return true;
                }
                return false;
            }
        }

        @Override // com.daaw.AbstractC2377o.AbstractC2379b
        /* renamed from: b */
        public boolean mo14677b(AbstractC2377o<?> abstractC2377o, Object obj, Object obj2) {
            synchronized (abstractC2377o) {
                if (abstractC2377o.f20879p == obj) {
                    abstractC2377o.f20879p = obj2;
                    return true;
                }
                return false;
            }
        }

        @Override // com.daaw.AbstractC2377o.AbstractC2379b
        /* renamed from: c */
        public boolean mo14676c(AbstractC2377o<?> abstractC2377o, C2387i c2387i, C2387i c2387i2) {
            synchronized (abstractC2377o) {
                if (abstractC2377o.f20881r == c2387i) {
                    abstractC2377o.f20881r = c2387i2;
                    return true;
                }
                return false;
            }
        }

        @Override // com.daaw.AbstractC2377o.AbstractC2379b
        /* renamed from: d */
        public void mo14675d(C2387i c2387i, C2387i c2387i2) {
            c2387i.f20901b = c2387i2;
        }

        @Override // com.daaw.AbstractC2377o.AbstractC2379b
        /* renamed from: e */
        public void mo14674e(C2387i c2387i, Thread thread) {
            c2387i.f20900a = thread;
        }
    }

    /* renamed from: com.daaw.o$i */
    /* loaded from: classes.dex */
    public static final class C2387i {

        /* renamed from: c */
        public static final C2387i f20899c = new C2387i(false);

        /* renamed from: a */
        public volatile Thread f20900a;

        /* renamed from: b */
        public volatile C2387i f20901b;

        public C2387i() {
            AbstractC2377o.f20877u.mo14674e(this, Thread.currentThread());
        }

        public C2387i(boolean z) {
        }

        /* renamed from: a */
        public void m14673a(C2387i c2387i) {
            AbstractC2377o.f20877u.mo14675d(this, c2387i);
        }

        /* renamed from: b */
        public void m14672b() {
            Thread thread = this.f20900a;
            if (thread != null) {
                this.f20900a = null;
                LockSupport.unpark(thread);
            }
        }
    }

    static {
        AbstractC2379b c2386h;
        try {
            c2386h = new C2384f(AtomicReferenceFieldUpdater.newUpdater(C2387i.class, Thread.class, "a"), AtomicReferenceFieldUpdater.newUpdater(C2387i.class, C2387i.class, "b"), AtomicReferenceFieldUpdater.newUpdater(AbstractC2377o.class, C2387i.class, "r"), AtomicReferenceFieldUpdater.newUpdater(AbstractC2377o.class, C2383e.class, "q"), AtomicReferenceFieldUpdater.newUpdater(AbstractC2377o.class, Object.class, "p"));
            th = null;
        } catch (Throwable th) {
            th = th;
            c2386h = new C2386h();
        }
        f20877u = c2386h;
        if (th != null) {
            f20876t.log(Level.SEVERE, "SafeAtomicHelper is broken!", th);
        }
        f20878v = new Object();
    }

    /* renamed from: c */
    public static CancellationException m14695c(String str, Throwable th) {
        CancellationException cancellationException = new CancellationException(str);
        cancellationException.initCause(th);
        return cancellationException;
    }

    /* renamed from: e */
    static <T> T m14693e(T t) {
        Objects.requireNonNull(t);
        return t;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v0, types: [com.daaw.o$b] */
    /* JADX WARN: Type inference failed for: r4v0, types: [com.daaw.o<?>] */
    /* JADX WARN: Type inference failed for: r4v1, types: [com.daaw.o] */
    /* JADX WARN: Type inference failed for: r4v6, types: [com.daaw.o<V>, com.daaw.o] */
    /* renamed from: h */
    public static void m14691h(AbstractC2377o<?> abstractC2377o) {
        C2383e c2383e = null;
        while (true) {
            abstractC2377o.m14684o();
            abstractC2377o.mo6831b();
            C2383e m14692g = abstractC2377o.m14692g(c2383e);
            while (m14692g != null) {
                c2383e = m14692g.f20891c;
                Runnable runnable = m14692g.f20889a;
                if (runnable instanceof RunnableC2385g) {
                    RunnableC2385g runnableC2385g = (RunnableC2385g) runnable;
                    abstractC2377o = runnableC2385g.f20897p;
                    if (abstractC2377o.f20879p == runnableC2385g) {
                        if (f20877u.mo14677b(abstractC2377o, runnableC2385g, m14688k(runnableC2385g.f20898q))) {
                            break;
                        }
                    } else {
                        continue;
                    }
                } else {
                    m14690i(runnable, m14692g.f20890b);
                }
                m14692g = c2383e;
            }
            return;
        }
    }

    /* renamed from: i */
    public static void m14690i(Runnable runnable, Executor executor) {
        try {
            executor.execute(runnable);
        } catch (RuntimeException e) {
            Logger logger = f20876t;
            Level level = Level.SEVERE;
            logger.log(level, "RuntimeException while executing runnable " + runnable + " with executor " + executor, (Throwable) e);
        }
    }

    /* renamed from: k */
    static Object m14688k(fk0<?> fk0Var) {
        if (fk0Var instanceof AbstractC2377o) {
            Object obj = ((AbstractC2377o) fk0Var).f20879p;
            if (obj instanceof C2380c) {
                C2380c c2380c = (C2380c) obj;
                return c2380c.f20884a ? c2380c.f20885b != null ? new C2380c(false, c2380c.f20885b) : C2380c.f20883d : obj;
            }
            return obj;
        }
        boolean isCancelled = fk0Var.isCancelled();
        if ((!f20875s) && isCancelled) {
            return C2380c.f20883d;
        }
        try {
            Object m14687l = m14687l(fk0Var);
            return m14687l == null ? f20878v : m14687l;
        } catch (CancellationException e) {
            if (isCancelled) {
                return new C2380c(false, e);
            }
            return new C2381d(new IllegalArgumentException("get() threw CancellationException, despite reporting isCancelled() == false: " + fk0Var, e));
        } catch (ExecutionException e2) {
            return new C2381d(e2.getCause());
        } catch (Throwable th) {
            return new C2381d(th);
        }
    }

    /* renamed from: l */
    static <V> V m14687l(Future<V> future) {
        V v;
        boolean z = false;
        while (true) {
            try {
                v = future.get();
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
        return v;
    }

    /* renamed from: a */
    public final void m14696a(StringBuilder sb) {
        String str = "]";
        try {
            Object m14687l = m14687l(this);
            sb.append("SUCCESS, result=[");
            sb.append(m14680s(m14687l));
            sb.append("]");
        } catch (CancellationException unused) {
            str = "CANCELLED";
            sb.append(str);
        } catch (RuntimeException e) {
            sb.append("UNKNOWN, cause=[");
            sb.append(e.getClass());
            str = " thrown from get()]";
            sb.append(str);
        } catch (ExecutionException e2) {
            sb.append("FAILURE, cause=[");
            sb.append(e2.getCause());
            sb.append(str);
        }
    }

    /* renamed from: b */
    public void mo6831b() {
    }

    @Override // java.util.concurrent.Future
    public final boolean cancel(boolean z) {
        Object obj = this.f20879p;
        if (!(obj == null) && !(obj instanceof RunnableC2385g)) {
            return false;
        }
        C2380c c2380c = f20875s ? new C2380c(z, new CancellationException("Future.cancel() was called.")) : z ? C2380c.f20882c : C2380c.f20883d;
        boolean z2 = false;
        AbstractC2377o<V> abstractC2377o = this;
        while (true) {
            if (f20877u.mo14677b(abstractC2377o, obj, c2380c)) {
                if (z) {
                    abstractC2377o.m14686m();
                }
                m14691h(abstractC2377o);
                if (!(obj instanceof RunnableC2385g)) {
                    return true;
                }
                fk0<? extends V> fk0Var = ((RunnableC2385g) obj).f20898q;
                if (!(fk0Var instanceof AbstractC2377o)) {
                    fk0Var.cancel(z);
                    return true;
                }
                abstractC2377o = (AbstractC2377o) fk0Var;
                obj = abstractC2377o.f20879p;
                if (!(obj == null) && !(obj instanceof RunnableC2385g)) {
                    return true;
                }
                z2 = true;
            } else {
                obj = abstractC2377o.f20879p;
                if (!(obj instanceof RunnableC2385g)) {
                    return z2;
                }
            }
        }
    }

    @Override // com.daaw.fk0
    /* renamed from: d */
    public final void mo14694d(Runnable runnable, Executor executor) {
        m14693e(runnable);
        m14693e(executor);
        C2383e c2383e = this.f20880q;
        if (c2383e == C2383e.f20888d) {
            m14690i(runnable, executor);
        }
        C2383e c2383e2 = new C2383e(runnable, executor);
        do {
            c2383e2.f20891c = c2383e;
            if (f20877u.mo14678a(this, c2383e, c2383e2)) {
                return;
            }
            c2383e = this.f20880q;
        } while (c2383e != C2383e.f20888d);
        m14690i(runnable, executor);
    }

    /* renamed from: g */
    public final C2383e m14692g(C2383e c2383e) {
        C2383e c2383e2;
        do {
            c2383e2 = this.f20880q;
        } while (!f20877u.mo14678a(this, c2383e2, C2383e.f20888d));
        C2383e c2383e3 = c2383e;
        C2383e c2383e4 = c2383e2;
        while (c2383e4 != null) {
            C2383e c2383e5 = c2383e4.f20891c;
            c2383e4.f20891c = c2383e3;
            c2383e3 = c2383e4;
            c2383e4 = c2383e5;
        }
        return c2383e3;
    }

    @Override // java.util.concurrent.Future
    public final V get() {
        Object obj;
        if (Thread.interrupted()) {
            throw new InterruptedException();
        }
        Object obj2 = this.f20879p;
        if ((obj2 != null) && (!(obj2 instanceof RunnableC2385g))) {
            return m14689j(obj2);
        }
        C2387i c2387i = this.f20881r;
        if (c2387i != C2387i.f20899c) {
            C2387i c2387i2 = new C2387i();
            do {
                c2387i2.m14673a(c2387i);
                if (f20877u.mo14676c(this, c2387i, c2387i2)) {
                    do {
                        LockSupport.park(this);
                        if (Thread.interrupted()) {
                            m14683p(c2387i2);
                            throw new InterruptedException();
                        }
                        obj = this.f20879p;
                    } while (!((obj != null) & (!(obj instanceof RunnableC2385g))));
                    return m14689j(obj);
                }
                c2387i = this.f20881r;
            } while (c2387i != C2387i.f20899c);
            return m14689j(this.f20879p);
        }
        return m14689j(this.f20879p);
    }

    @Override // java.util.concurrent.Future
    public final V get(long j, TimeUnit timeUnit) {
        Locale locale;
        long nanos = timeUnit.toNanos(j);
        if (Thread.interrupted()) {
            throw new InterruptedException();
        }
        Object obj = this.f20879p;
        if ((obj != null) && (!(obj instanceof RunnableC2385g))) {
            return m14689j(obj);
        }
        long nanoTime = nanos > 0 ? System.nanoTime() + nanos : 0L;
        if (nanos >= 1000) {
            C2387i c2387i = this.f20881r;
            if (c2387i != C2387i.f20899c) {
                C2387i c2387i2 = new C2387i();
                do {
                    c2387i2.m14673a(c2387i);
                    if (f20877u.mo14676c(this, c2387i, c2387i2)) {
                        do {
                            LockSupport.parkNanos(this, nanos);
                            if (Thread.interrupted()) {
                                m14683p(c2387i2);
                                throw new InterruptedException();
                            }
                            Object obj2 = this.f20879p;
                            if ((obj2 != null) && (!(obj2 instanceof RunnableC2385g))) {
                                return m14689j(obj2);
                            }
                            nanos = nanoTime - System.nanoTime();
                        } while (nanos >= 1000);
                        m14683p(c2387i2);
                    } else {
                        c2387i = this.f20881r;
                    }
                } while (c2387i != C2387i.f20899c);
                return m14689j(this.f20879p);
            }
            return m14689j(this.f20879p);
        }
        while (nanos > 0) {
            Object obj3 = this.f20879p;
            if ((obj3 != null) && (!(obj3 instanceof RunnableC2385g))) {
                return m14689j(obj3);
            }
            if (Thread.interrupted()) {
                throw new InterruptedException();
            }
            nanos = nanoTime - System.nanoTime();
        }
        String abstractC2377o = toString();
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
        throw new TimeoutException(str + " for " + abstractC2377o);
    }

    @Override // java.util.concurrent.Future
    public final boolean isCancelled() {
        return this.f20879p instanceof C2380c;
    }

    @Override // java.util.concurrent.Future
    public final boolean isDone() {
        Object obj = this.f20879p;
        return (!(obj instanceof RunnableC2385g)) & (obj != null);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* renamed from: j */
    public final V m14689j(Object obj) {
        if (obj instanceof C2380c) {
            throw m14695c("Task was cancelled.", ((C2380c) obj).f20885b);
        }
        if (obj instanceof C2381d) {
            throw new ExecutionException(((C2381d) obj).f20887a);
        }
        if (obj == f20878v) {
            return null;
        }
        return obj;
    }

    /* renamed from: m */
    public void m14686m() {
    }

    /* renamed from: n */
    public String m14685n() {
        Object obj = this.f20879p;
        if (obj instanceof RunnableC2385g) {
            return "setFuture=[" + m14680s(((RunnableC2385g) obj).f20898q) + "]";
        } else if (this instanceof ScheduledFuture) {
            return "remaining delay=[" + ((ScheduledFuture) this).getDelay(TimeUnit.MILLISECONDS) + " ms]";
        } else {
            return null;
        }
    }

    /* renamed from: o */
    public final void m14684o() {
        C2387i c2387i;
        do {
            c2387i = this.f20881r;
        } while (!f20877u.mo14676c(this, c2387i, C2387i.f20899c));
        while (c2387i != null) {
            c2387i.m14672b();
            c2387i = c2387i.f20901b;
        }
    }

    /* renamed from: p */
    public final void m14683p(C2387i c2387i) {
        c2387i.f20900a = null;
        while (true) {
            C2387i c2387i2 = this.f20881r;
            if (c2387i2 == C2387i.f20899c) {
                return;
            }
            C2387i c2387i3 = null;
            while (c2387i2 != null) {
                C2387i c2387i4 = c2387i2.f20901b;
                if (c2387i2.f20900a != null) {
                    c2387i3 = c2387i2;
                } else if (c2387i3 != null) {
                    c2387i3.f20901b = c2387i4;
                    if (c2387i3.f20900a == null) {
                        break;
                    }
                } else if (!f20877u.mo14676c(this, c2387i2, c2387i4)) {
                    break;
                }
                c2387i2 = c2387i4;
            }
            return;
        }
    }

    /* renamed from: q */
    public boolean m14682q(V v) {
        if (v == null) {
            v = (V) f20878v;
        }
        if (f20877u.mo14677b(this, null, v)) {
            m14691h(this);
            return true;
        }
        return false;
    }

    /* renamed from: r */
    public boolean m14681r(Throwable th) {
        if (f20877u.mo14677b(this, null, new C2381d((Throwable) m14693e(th)))) {
            m14691h(this);
            return true;
        }
        return false;
    }

    /* renamed from: s */
    public final String m14680s(Object obj) {
        return obj == this ? "this future" : String.valueOf(obj);
    }

    /* renamed from: t */
    public final boolean m14679t() {
        Object obj = this.f20879p;
        return (obj instanceof C2380c) && ((C2380c) obj).f20884a;
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
                    str = m14685n();
                } catch (RuntimeException e) {
                    str = "Exception thrown from implementation: " + e.getClass();
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
            m14696a(sb);
            sb.append("]");
            return sb.toString();
        }
        str2 = "CANCELLED";
        sb.append(str2);
        sb.append("]");
        return sb.toString();
    }
}
