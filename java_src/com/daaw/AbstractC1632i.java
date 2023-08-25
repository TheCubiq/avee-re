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
/* renamed from: com.daaw.i */
/* loaded from: classes.dex */
public abstract class AbstractC1632i<V> implements fk0<V> {

    /* renamed from: s */
    public static final boolean f13092s = Boolean.parseBoolean(System.getProperty("guava.concurrent.generate_cancellation_cause", "false"));

    /* renamed from: t */
    public static final Logger f13093t = Logger.getLogger(AbstractC1632i.class.getName());

    /* renamed from: u */
    public static final AbstractC1634b f13094u;

    /* renamed from: v */
    public static final Object f13095v;

    /* renamed from: p */
    public volatile Object f13096p;

    /* renamed from: q */
    public volatile C1638e f13097q;

    /* renamed from: r */
    public volatile C1642i f13098r;

    /* renamed from: com.daaw.i$b */
    /* loaded from: classes.dex */
    public static abstract class AbstractC1634b {
        public AbstractC1634b() {
        }

        /* renamed from: a */
        public abstract boolean mo20291a(AbstractC1632i<?> abstractC1632i, C1638e c1638e, C1638e c1638e2);

        /* renamed from: b */
        public abstract boolean mo20290b(AbstractC1632i<?> abstractC1632i, Object obj, Object obj2);

        /* renamed from: c */
        public abstract boolean mo20289c(AbstractC1632i<?> abstractC1632i, C1642i c1642i, C1642i c1642i2);

        /* renamed from: d */
        public abstract void mo20288d(C1642i c1642i, C1642i c1642i2);

        /* renamed from: e */
        public abstract void mo20287e(C1642i c1642i, Thread thread);
    }

    /* renamed from: com.daaw.i$c */
    /* loaded from: classes.dex */
    public static final class C1635c {

        /* renamed from: c */
        public static final C1635c f13099c;

        /* renamed from: d */
        public static final C1635c f13100d;

        /* renamed from: a */
        public final boolean f13101a;

        /* renamed from: b */
        public final Throwable f13102b;

        static {
            if (AbstractC1632i.f13092s) {
                f13100d = null;
                f13099c = null;
                return;
            }
            f13100d = new C1635c(false, null);
            f13099c = new C1635c(true, null);
        }

        public C1635c(boolean z, Throwable th) {
            this.f13101a = z;
            this.f13102b = th;
        }
    }

    /* renamed from: com.daaw.i$d */
    /* loaded from: classes.dex */
    public static final class C1636d {

        /* renamed from: b */
        public static final C1636d f13103b = new C1636d(new C1637a("Failure occurred while trying to finish a future."));

        /* renamed from: a */
        public final Throwable f13104a;

        /* renamed from: com.daaw.i$d$a */
        /* loaded from: classes.dex */
        public class C1637a extends Throwable {
            public C1637a(String str) {
                super(str);
            }

            @Override // java.lang.Throwable
            public synchronized Throwable fillInStackTrace() {
                return this;
            }
        }

        public C1636d(Throwable th) {
            this.f13104a = (Throwable) AbstractC1632i.m20303e(th);
        }
    }

    /* renamed from: com.daaw.i$e */
    /* loaded from: classes.dex */
    public static final class C1638e {

        /* renamed from: d */
        public static final C1638e f13105d = new C1638e(null, null);

        /* renamed from: a */
        public final Runnable f13106a;

        /* renamed from: b */
        public final Executor f13107b;

        /* renamed from: c */
        public C1638e f13108c;

        public C1638e(Runnable runnable, Executor executor) {
            this.f13106a = runnable;
            this.f13107b = executor;
        }
    }

    /* renamed from: com.daaw.i$f */
    /* loaded from: classes.dex */
    public static final class C1639f extends AbstractC1634b {

        /* renamed from: a */
        public final AtomicReferenceFieldUpdater<C1642i, Thread> f13109a;

        /* renamed from: b */
        public final AtomicReferenceFieldUpdater<C1642i, C1642i> f13110b;

        /* renamed from: c */
        public final AtomicReferenceFieldUpdater<AbstractC1632i, C1642i> f13111c;

        /* renamed from: d */
        public final AtomicReferenceFieldUpdater<AbstractC1632i, C1638e> f13112d;

        /* renamed from: e */
        public final AtomicReferenceFieldUpdater<AbstractC1632i, Object> f13113e;

        public C1639f(AtomicReferenceFieldUpdater<C1642i, Thread> atomicReferenceFieldUpdater, AtomicReferenceFieldUpdater<C1642i, C1642i> atomicReferenceFieldUpdater2, AtomicReferenceFieldUpdater<AbstractC1632i, C1642i> atomicReferenceFieldUpdater3, AtomicReferenceFieldUpdater<AbstractC1632i, C1638e> atomicReferenceFieldUpdater4, AtomicReferenceFieldUpdater<AbstractC1632i, Object> atomicReferenceFieldUpdater5) {
            super();
            this.f13109a = atomicReferenceFieldUpdater;
            this.f13110b = atomicReferenceFieldUpdater2;
            this.f13111c = atomicReferenceFieldUpdater3;
            this.f13112d = atomicReferenceFieldUpdater4;
            this.f13113e = atomicReferenceFieldUpdater5;
        }

        @Override // com.daaw.AbstractC1632i.AbstractC1634b
        /* renamed from: a */
        public boolean mo20291a(AbstractC1632i<?> abstractC1632i, C1638e c1638e, C1638e c1638e2) {
            return C1773j.m19216a(this.f13112d, abstractC1632i, c1638e, c1638e2);
        }

        @Override // com.daaw.AbstractC1632i.AbstractC1634b
        /* renamed from: b */
        public boolean mo20290b(AbstractC1632i<?> abstractC1632i, Object obj, Object obj2) {
            return C1773j.m19216a(this.f13113e, abstractC1632i, obj, obj2);
        }

        @Override // com.daaw.AbstractC1632i.AbstractC1634b
        /* renamed from: c */
        public boolean mo20289c(AbstractC1632i<?> abstractC1632i, C1642i c1642i, C1642i c1642i2) {
            return C1773j.m19216a(this.f13111c, abstractC1632i, c1642i, c1642i2);
        }

        @Override // com.daaw.AbstractC1632i.AbstractC1634b
        /* renamed from: d */
        public void mo20288d(C1642i c1642i, C1642i c1642i2) {
            this.f13110b.lazySet(c1642i, c1642i2);
        }

        @Override // com.daaw.AbstractC1632i.AbstractC1634b
        /* renamed from: e */
        public void mo20287e(C1642i c1642i, Thread thread) {
            this.f13109a.lazySet(c1642i, thread);
        }
    }

    /* renamed from: com.daaw.i$g */
    /* loaded from: classes.dex */
    public static final class RunnableC1640g<V> implements Runnable {

        /* renamed from: p */
        public final AbstractC1632i<V> f13114p;

        /* renamed from: q */
        public final fk0<? extends V> f13115q;

        public RunnableC1640g(AbstractC1632i<V> abstractC1632i, fk0<? extends V> fk0Var) {
            this.f13114p = abstractC1632i;
            this.f13115q = fk0Var;
        }

        @Override // java.lang.Runnable
        public void run() {
            if (this.f13114p.f13096p != this) {
                return;
            }
            if (AbstractC1632i.f13094u.mo20290b(this.f13114p, this, AbstractC1632i.m20298k(this.f13115q))) {
                AbstractC1632i.m20301h(this.f13114p);
            }
        }
    }

    /* renamed from: com.daaw.i$h */
    /* loaded from: classes.dex */
    public static final class C1641h extends AbstractC1634b {
        public C1641h() {
            super();
        }

        @Override // com.daaw.AbstractC1632i.AbstractC1634b
        /* renamed from: a */
        public boolean mo20291a(AbstractC1632i<?> abstractC1632i, C1638e c1638e, C1638e c1638e2) {
            synchronized (abstractC1632i) {
                if (abstractC1632i.f13097q == c1638e) {
                    abstractC1632i.f13097q = c1638e2;
                    return true;
                }
                return false;
            }
        }

        @Override // com.daaw.AbstractC1632i.AbstractC1634b
        /* renamed from: b */
        public boolean mo20290b(AbstractC1632i<?> abstractC1632i, Object obj, Object obj2) {
            synchronized (abstractC1632i) {
                if (abstractC1632i.f13096p == obj) {
                    abstractC1632i.f13096p = obj2;
                    return true;
                }
                return false;
            }
        }

        @Override // com.daaw.AbstractC1632i.AbstractC1634b
        /* renamed from: c */
        public boolean mo20289c(AbstractC1632i<?> abstractC1632i, C1642i c1642i, C1642i c1642i2) {
            synchronized (abstractC1632i) {
                if (abstractC1632i.f13098r == c1642i) {
                    abstractC1632i.f13098r = c1642i2;
                    return true;
                }
                return false;
            }
        }

        @Override // com.daaw.AbstractC1632i.AbstractC1634b
        /* renamed from: d */
        public void mo20288d(C1642i c1642i, C1642i c1642i2) {
            c1642i.f13118b = c1642i2;
        }

        @Override // com.daaw.AbstractC1632i.AbstractC1634b
        /* renamed from: e */
        public void mo20287e(C1642i c1642i, Thread thread) {
            c1642i.f13117a = thread;
        }
    }

    /* renamed from: com.daaw.i$i */
    /* loaded from: classes.dex */
    public static final class C1642i {

        /* renamed from: c */
        public static final C1642i f13116c = new C1642i(false);

        /* renamed from: a */
        public volatile Thread f13117a;

        /* renamed from: b */
        public volatile C1642i f13118b;

        public C1642i() {
            AbstractC1632i.f13094u.mo20287e(this, Thread.currentThread());
        }

        public C1642i(boolean z) {
        }

        /* renamed from: a */
        public void m20286a(C1642i c1642i) {
            AbstractC1632i.f13094u.mo20288d(this, c1642i);
        }

        /* renamed from: b */
        public void m20285b() {
            Thread thread = this.f13117a;
            if (thread != null) {
                this.f13117a = null;
                LockSupport.unpark(thread);
            }
        }
    }

    static {
        AbstractC1634b c1641h;
        try {
            c1641h = new C1639f(AtomicReferenceFieldUpdater.newUpdater(C1642i.class, Thread.class, "a"), AtomicReferenceFieldUpdater.newUpdater(C1642i.class, C1642i.class, "b"), AtomicReferenceFieldUpdater.newUpdater(AbstractC1632i.class, C1642i.class, "r"), AtomicReferenceFieldUpdater.newUpdater(AbstractC1632i.class, C1638e.class, "q"), AtomicReferenceFieldUpdater.newUpdater(AbstractC1632i.class, Object.class, "p"));
            th = null;
        } catch (Throwable th) {
            th = th;
            c1641h = new C1641h();
        }
        f13094u = c1641h;
        if (th != null) {
            f13093t.log(Level.SEVERE, "SafeAtomicHelper is broken!", th);
        }
        f13095v = new Object();
    }

    /* renamed from: c */
    public static CancellationException m20304c(String str, Throwable th) {
        CancellationException cancellationException = new CancellationException(str);
        cancellationException.initCause(th);
        return cancellationException;
    }

    /* renamed from: e */
    public static <T> T m20303e(T t) {
        Objects.requireNonNull(t);
        return t;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v0, types: [com.daaw.i$b] */
    /* JADX WARN: Type inference failed for: r4v0, types: [com.daaw.i<?>] */
    /* JADX WARN: Type inference failed for: r4v1, types: [com.daaw.i] */
    /* JADX WARN: Type inference failed for: r4v6, types: [com.daaw.i, com.daaw.i<V>] */
    /* renamed from: h */
    public static void m20301h(AbstractC1632i<?> abstractC1632i) {
        C1638e c1638e = null;
        while (true) {
            abstractC1632i.m20294o();
            abstractC1632i.m20305b();
            C1638e m20302g = abstractC1632i.m20302g(c1638e);
            while (m20302g != null) {
                c1638e = m20302g.f13108c;
                Runnable runnable = m20302g.f13106a;
                if (runnable instanceof RunnableC1640g) {
                    RunnableC1640g runnableC1640g = (RunnableC1640g) runnable;
                    abstractC1632i = runnableC1640g.f13114p;
                    if (abstractC1632i.f13096p == runnableC1640g) {
                        if (f13094u.mo20290b(abstractC1632i, runnableC1640g, m20298k(runnableC1640g.f13115q))) {
                            break;
                        }
                    } else {
                        continue;
                    }
                } else {
                    m20300i(runnable, m20302g.f13107b);
                }
                m20302g = c1638e;
            }
            return;
        }
    }

    /* renamed from: i */
    public static void m20300i(Runnable runnable, Executor executor) {
        try {
            executor.execute(runnable);
        } catch (RuntimeException e) {
            Logger logger = f13093t;
            Level level = Level.SEVERE;
            logger.log(level, "RuntimeException while executing runnable " + runnable + " with executor " + executor, (Throwable) e);
        }
    }

    /* renamed from: k */
    public static Object m20298k(fk0<?> fk0Var) {
        if (fk0Var instanceof AbstractC1632i) {
            Object obj = ((AbstractC1632i) fk0Var).f13096p;
            if (obj instanceof C1635c) {
                C1635c c1635c = (C1635c) obj;
                return c1635c.f13101a ? c1635c.f13102b != null ? new C1635c(false, c1635c.f13102b) : C1635c.f13100d : obj;
            }
            return obj;
        }
        boolean isCancelled = fk0Var.isCancelled();
        if ((!f13092s) && isCancelled) {
            return C1635c.f13100d;
        }
        try {
            Object m20297l = m20297l(fk0Var);
            return m20297l == null ? f13095v : m20297l;
        } catch (CancellationException e) {
            if (isCancelled) {
                return new C1635c(false, e);
            }
            return new C1636d(new IllegalArgumentException("get() threw CancellationException, despite reporting isCancelled() == false: " + fk0Var, e));
        } catch (ExecutionException e2) {
            return new C1636d(e2.getCause());
        } catch (Throwable th) {
            return new C1636d(th);
        }
    }

    /* renamed from: l */
    public static <V> V m20297l(Future<V> future) {
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
    public final void m20306a(StringBuilder sb) {
        String str = "]";
        try {
            Object m20297l = m20297l(this);
            sb.append("SUCCESS, result=[");
            sb.append(m20292t(m20297l));
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
    public void m20305b() {
    }

    @Override // java.util.concurrent.Future
    public final boolean cancel(boolean z) {
        Object obj = this.f13096p;
        if (!(obj == null) && !(obj instanceof RunnableC1640g)) {
            return false;
        }
        C1635c c1635c = f13092s ? new C1635c(z, new CancellationException("Future.cancel() was called.")) : z ? C1635c.f13099c : C1635c.f13100d;
        boolean z2 = false;
        AbstractC1632i<V> abstractC1632i = this;
        while (true) {
            if (f13094u.mo20290b(abstractC1632i, obj, c1635c)) {
                if (z) {
                    abstractC1632i.m20296m();
                }
                m20301h(abstractC1632i);
                if (!(obj instanceof RunnableC1640g)) {
                    return true;
                }
                fk0<? extends V> fk0Var = ((RunnableC1640g) obj).f13115q;
                if (!(fk0Var instanceof AbstractC1632i)) {
                    fk0Var.cancel(z);
                    return true;
                }
                abstractC1632i = (AbstractC1632i) fk0Var;
                obj = abstractC1632i.f13096p;
                if (!(obj == null) && !(obj instanceof RunnableC1640g)) {
                    return true;
                }
                z2 = true;
            } else {
                obj = abstractC1632i.f13096p;
                if (!(obj instanceof RunnableC1640g)) {
                    return z2;
                }
            }
        }
    }

    @Override // com.daaw.fk0
    /* renamed from: d */
    public final void mo14694d(Runnable runnable, Executor executor) {
        m20303e(runnable);
        m20303e(executor);
        C1638e c1638e = this.f13097q;
        if (c1638e == C1638e.f13105d) {
            m20300i(runnable, executor);
        }
        C1638e c1638e2 = new C1638e(runnable, executor);
        do {
            c1638e2.f13108c = c1638e;
            if (f13094u.mo20291a(this, c1638e, c1638e2)) {
                return;
            }
            c1638e = this.f13097q;
        } while (c1638e != C1638e.f13105d);
        m20300i(runnable, executor);
    }

    /* renamed from: g */
    public final C1638e m20302g(C1638e c1638e) {
        C1638e c1638e2;
        do {
            c1638e2 = this.f13097q;
        } while (!f13094u.mo20291a(this, c1638e2, C1638e.f13105d));
        C1638e c1638e3 = c1638e;
        C1638e c1638e4 = c1638e2;
        while (c1638e4 != null) {
            C1638e c1638e5 = c1638e4.f13108c;
            c1638e4.f13108c = c1638e3;
            c1638e3 = c1638e4;
            c1638e4 = c1638e5;
        }
        return c1638e3;
    }

    @Override // java.util.concurrent.Future
    public final V get() {
        Object obj;
        if (Thread.interrupted()) {
            throw new InterruptedException();
        }
        Object obj2 = this.f13096p;
        if ((obj2 != null) && (!(obj2 instanceof RunnableC1640g))) {
            return m20299j(obj2);
        }
        C1642i c1642i = this.f13098r;
        if (c1642i != C1642i.f13116c) {
            C1642i c1642i2 = new C1642i();
            do {
                c1642i2.m20286a(c1642i);
                if (f13094u.mo20289c(this, c1642i, c1642i2)) {
                    do {
                        LockSupport.park(this);
                        if (Thread.interrupted()) {
                            m20293p(c1642i2);
                            throw new InterruptedException();
                        }
                        obj = this.f13096p;
                    } while (!((obj != null) & (!(obj instanceof RunnableC1640g))));
                    return m20299j(obj);
                }
                c1642i = this.f13098r;
            } while (c1642i != C1642i.f13116c);
            return m20299j(this.f13096p);
        }
        return m20299j(this.f13096p);
    }

    @Override // java.util.concurrent.Future
    public final V get(long j, TimeUnit timeUnit) {
        Locale locale;
        long nanos = timeUnit.toNanos(j);
        if (Thread.interrupted()) {
            throw new InterruptedException();
        }
        Object obj = this.f13096p;
        if ((obj != null) && (!(obj instanceof RunnableC1640g))) {
            return m20299j(obj);
        }
        long nanoTime = nanos > 0 ? System.nanoTime() + nanos : 0L;
        if (nanos >= 1000) {
            C1642i c1642i = this.f13098r;
            if (c1642i != C1642i.f13116c) {
                C1642i c1642i2 = new C1642i();
                do {
                    c1642i2.m20286a(c1642i);
                    if (f13094u.mo20289c(this, c1642i, c1642i2)) {
                        do {
                            LockSupport.parkNanos(this, nanos);
                            if (Thread.interrupted()) {
                                m20293p(c1642i2);
                                throw new InterruptedException();
                            }
                            Object obj2 = this.f13096p;
                            if ((obj2 != null) && (!(obj2 instanceof RunnableC1640g))) {
                                return m20299j(obj2);
                            }
                            nanos = nanoTime - System.nanoTime();
                        } while (nanos >= 1000);
                        m20293p(c1642i2);
                    } else {
                        c1642i = this.f13098r;
                    }
                } while (c1642i != C1642i.f13116c);
                return m20299j(this.f13096p);
            }
            return m20299j(this.f13096p);
        }
        while (nanos > 0) {
            Object obj3 = this.f13096p;
            if ((obj3 != null) && (!(obj3 instanceof RunnableC1640g))) {
                return m20299j(obj3);
            }
            if (Thread.interrupted()) {
                throw new InterruptedException();
            }
            nanos = nanoTime - System.nanoTime();
        }
        String abstractC1632i = toString();
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
        throw new TimeoutException(str + " for " + abstractC1632i);
    }

    @Override // java.util.concurrent.Future
    public final boolean isCancelled() {
        return this.f13096p instanceof C1635c;
    }

    @Override // java.util.concurrent.Future
    public final boolean isDone() {
        Object obj = this.f13096p;
        return (!(obj instanceof RunnableC1640g)) & (obj != null);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* renamed from: j */
    public final V m20299j(Object obj) {
        if (obj instanceof C1635c) {
            throw m20304c("Task was cancelled.", ((C1635c) obj).f13102b);
        }
        if (obj instanceof C1636d) {
            throw new ExecutionException(((C1636d) obj).f13104a);
        }
        if (obj == f13095v) {
            return null;
        }
        return obj;
    }

    /* renamed from: m */
    public void m20296m() {
    }

    /* renamed from: n */
    public String m20295n() {
        Object obj = this.f13096p;
        if (obj instanceof RunnableC1640g) {
            return "setFuture=[" + m20292t(((RunnableC1640g) obj).f13115q) + "]";
        } else if (this instanceof ScheduledFuture) {
            return "remaining delay=[" + ((ScheduledFuture) this).getDelay(TimeUnit.MILLISECONDS) + " ms]";
        } else {
            return null;
        }
    }

    /* renamed from: o */
    public final void m20294o() {
        C1642i c1642i;
        do {
            c1642i = this.f13098r;
        } while (!f13094u.mo20289c(this, c1642i, C1642i.f13116c));
        while (c1642i != null) {
            c1642i.m20285b();
            c1642i = c1642i.f13118b;
        }
    }

    /* renamed from: p */
    public final void m20293p(C1642i c1642i) {
        c1642i.f13117a = null;
        while (true) {
            C1642i c1642i2 = this.f13098r;
            if (c1642i2 == C1642i.f13116c) {
                return;
            }
            C1642i c1642i3 = null;
            while (c1642i2 != null) {
                C1642i c1642i4 = c1642i2.f13118b;
                if (c1642i2.f13117a != null) {
                    c1642i3 = c1642i2;
                } else if (c1642i3 != null) {
                    c1642i3.f13118b = c1642i4;
                    if (c1642i3.f13117a == null) {
                        break;
                    }
                } else if (!f13094u.mo20289c(this, c1642i2, c1642i4)) {
                    break;
                }
                c1642i2 = c1642i4;
            }
            return;
        }
    }

    /* renamed from: q */
    public boolean mo10473q(V v) {
        if (v == null) {
            v = (V) f13095v;
        }
        if (f13094u.mo20290b(this, null, v)) {
            m20301h(this);
            return true;
        }
        return false;
    }

    /* renamed from: r */
    public boolean mo10472r(Throwable th) {
        if (f13094u.mo20290b(this, null, new C1636d((Throwable) m20303e(th)))) {
            m20301h(this);
            return true;
        }
        return false;
    }

    /* renamed from: s */
    public boolean mo10471s(fk0<? extends V> fk0Var) {
        C1636d c1636d;
        m20303e(fk0Var);
        Object obj = this.f13096p;
        if (obj == null) {
            if (fk0Var.isDone()) {
                if (f13094u.mo20290b(this, null, m20298k(fk0Var))) {
                    m20301h(this);
                    return true;
                }
                return false;
            }
            RunnableC1640g runnableC1640g = new RunnableC1640g(this, fk0Var);
            if (f13094u.mo20290b(this, null, runnableC1640g)) {
                try {
                    fk0Var.mo14694d(runnableC1640g, EnumC2752qt.INSTANCE);
                } catch (Throwable th) {
                    try {
                        c1636d = new C1636d(th);
                    } catch (Throwable unused) {
                        c1636d = C1636d.f13103b;
                    }
                    f13094u.mo20290b(this, runnableC1640g, c1636d);
                }
                return true;
            }
            obj = this.f13096p;
        }
        if (obj instanceof C1635c) {
            fk0Var.cancel(((C1635c) obj).f13101a);
        }
        return false;
    }

    /* renamed from: t */
    public final String m20292t(Object obj) {
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
                    str = m20295n();
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
            m20306a(sb);
            sb.append("]");
            return sb.toString();
        }
        str2 = "CANCELLED";
        sb.append(str2);
        sb.append("]");
        return sb.toString();
    }
}
