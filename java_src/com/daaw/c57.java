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
import javax.annotation.CheckForNull;
/* loaded from: classes.dex */
public abstract class c57<V> extends y77 implements f77<V> {

    /* renamed from: s */
    public static final boolean f5507s;

    /* renamed from: t */
    public static final Logger f5508t;

    /* renamed from: u */
    public static final r47 f5509u;

    /* renamed from: v */
    public static final Object f5510v;
    @CheckForNull

    /* renamed from: p */
    public volatile Object f5511p;
    @CheckForNull

    /* renamed from: q */
    public volatile u47 f5512q;
    @CheckForNull

    /* renamed from: r */
    public volatile b57 f5513r;

    static {
        boolean z;
        Throwable th;
        Throwable th2;
        r47 x47Var;
        try {
            z = Boolean.parseBoolean(System.getProperty("guava.concurrent.generate_cancellation_cause", "false"));
        } catch (SecurityException unused) {
            z = false;
        }
        f5507s = z;
        f5508t = Logger.getLogger(c57.class.getName());
        try {
            x47Var = new a57(null);
            th2 = null;
            th = null;
        } catch (Error | RuntimeException e) {
            try {
                th2 = e;
                x47Var = new v47(AtomicReferenceFieldUpdater.newUpdater(b57.class, Thread.class, "a"), AtomicReferenceFieldUpdater.newUpdater(b57.class, b57.class, "b"), AtomicReferenceFieldUpdater.newUpdater(c57.class, b57.class, "r"), AtomicReferenceFieldUpdater.newUpdater(c57.class, u47.class, "q"), AtomicReferenceFieldUpdater.newUpdater(c57.class, Object.class, "p"));
                th = null;
            } catch (Error | RuntimeException e2) {
                th = e2;
                th2 = e;
                x47Var = new x47(null);
            }
        }
        f5509u = x47Var;
        if (th != null) {
            Logger logger = f5508t;
            Level level = Level.SEVERE;
            logger.logp(level, "com.google.common.util.concurrent.AbstractFuture", "<clinit>", "UnsafeAtomicHelper is broken!", th2);
            logger.logp(level, "com.google.common.util.concurrent.AbstractFuture", "<clinit>", "SafeAtomicHelper is broken!", th);
        }
        f5510v = new Object();
    }

    /* renamed from: B */
    public static void m25616B(c57 c57Var, boolean z) {
        u47 u47Var = null;
        while (true) {
            for (b57 mo5532b = f5509u.mo5532b(c57Var, b57.f4317c); mo5532b != null; mo5532b = mo5532b.f4319b) {
                Thread thread = mo5532b.f4318a;
                if (thread != null) {
                    mo5532b.f4318a = null;
                    LockSupport.unpark(thread);
                }
            }
            if (z) {
                c57Var.mo22880u();
            }
            c57Var.mo7360g();
            u47 u47Var2 = u47Var;
            u47 mo5533a = f5509u.mo5533a(c57Var, u47.f28546d);
            u47 u47Var3 = u47Var2;
            while (mo5533a != null) {
                u47 u47Var4 = mo5533a.f28549c;
                mo5533a.f28549c = u47Var3;
                u47Var3 = mo5533a;
                mo5533a = u47Var4;
            }
            while (u47Var3 != null) {
                u47Var = u47Var3.f28549c;
                Runnable runnable = u47Var3.f28547a;
                runnable.getClass();
                if (runnable instanceof w47) {
                    w47 w47Var = (w47) runnable;
                    c57Var = w47Var.f30885p;
                    if (c57Var.f5511p == w47Var) {
                        if (f5509u.mo5528f(c57Var, w47Var, m25612j(w47Var.f30886q))) {
                            break;
                        }
                    } else {
                        continue;
                    }
                } else {
                    Executor executor = u47Var3.f28548b;
                    executor.getClass();
                    m25615C(runnable, executor);
                }
                u47Var3 = u47Var;
            }
            return;
            z = false;
        }
    }

    /* renamed from: C */
    public static void m25615C(Runnable runnable, Executor executor) {
        try {
            executor.execute(runnable);
        } catch (RuntimeException e) {
            Logger logger = f5508t;
            Level level = Level.SEVERE;
            String valueOf = String.valueOf(runnable);
            String valueOf2 = String.valueOf(executor);
            logger.logp(level, "com.google.common.util.concurrent.AbstractFuture", "executeListener", "RuntimeException while executing runnable " + valueOf + " with executor " + valueOf2, (Throwable) e);
        }
    }

    /* renamed from: c */
    public static final Object m25613c(Object obj) {
        if (obj instanceof s47) {
            Throwable th = ((s47) obj).f25861b;
            CancellationException cancellationException = new CancellationException("Task was cancelled.");
            cancellationException.initCause(th);
            throw cancellationException;
        } else if (obj instanceof t47) {
            throw new ExecutionException(((t47) obj).f27002a);
        } else {
            if (obj == f5510v) {
                return null;
            }
            return obj;
        }
    }

    /* renamed from: j */
    public static Object m25612j(f77 f77Var) {
        Throwable mo4029a;
        if (f77Var instanceof y47) {
            Object obj = ((c57) f77Var).f5511p;
            if (obj instanceof s47) {
                s47 s47Var = (s47) obj;
                if (s47Var.f25860a) {
                    Throwable th = s47Var.f25861b;
                    obj = th != null ? new s47(false, th) : s47.f25859d;
                }
            }
            obj.getClass();
            return obj;
        } else if (!(f77Var instanceof y77) || (mo4029a = ((y77) f77Var).mo4029a()) == null) {
            boolean isCancelled = f77Var.isCancelled();
            if ((!f5507s) && isCancelled) {
                s47 s47Var2 = s47.f25859d;
                s47Var2.getClass();
                return s47Var2;
            }
            try {
                Object m25611k = m25611k(f77Var);
                if (!isCancelled) {
                    return m25611k == null ? f5510v : m25611k;
                }
                String valueOf = String.valueOf(f77Var);
                return new s47(false, new IllegalArgumentException("get() did not throw CancellationException, despite reporting isCancelled() == true: " + valueOf));
            } catch (Error e) {
                e = e;
                return new t47(e);
            } catch (CancellationException e2) {
                return !isCancelled ? new t47(new IllegalArgumentException("get() threw CancellationException, despite reporting isCancelled() == false: ".concat(String.valueOf(f77Var)), e2)) : new s47(false, e2);
            } catch (RuntimeException e3) {
                e = e3;
                return new t47(e);
            } catch (ExecutionException e4) {
                return isCancelled ? new s47(false, new IllegalArgumentException("get() did not throw CancellationException, despite reporting isCancelled() == true: ".concat(String.valueOf(f77Var)), e4)) : new t47(e4.getCause());
            }
        } else {
            return new t47(mo4029a);
        }
    }

    /* renamed from: k */
    public static Object m25611k(Future future) {
        Object obj;
        boolean z = false;
        while (true) {
            try {
                obj = future.get();
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
        return obj;
    }

    /* renamed from: A */
    public final void m25617A(StringBuilder sb, @CheckForNull Object obj) {
        try {
            if (obj == this) {
                sb.append("this future");
            } else {
                sb.append(obj);
            }
        } catch (RuntimeException | StackOverflowError e) {
            sb.append("Exception thrown from implementation: ");
            sb.append(e.getClass());
        }
    }

    @Override // com.daaw.y77
    @CheckForNull
    /* renamed from: a */
    public final Throwable mo4029a() {
        if (this instanceof y47) {
            Object obj = this.f5511p;
            if (obj instanceof t47) {
                return ((t47) obj).f27002a;
            }
            return null;
        }
        return null;
    }

    /* renamed from: b */
    public final void m25614b(b57 b57Var) {
        b57Var.f4318a = null;
        while (true) {
            b57 b57Var2 = this.f5513r;
            if (b57Var2 != b57.f4317c) {
                b57 b57Var3 = null;
                while (b57Var2 != null) {
                    b57 b57Var4 = b57Var2.f4319b;
                    if (b57Var2.f4318a != null) {
                        b57Var3 = b57Var2;
                    } else if (b57Var3 != null) {
                        b57Var3.f4319b = b57Var4;
                        if (b57Var3.f4318a == null) {
                            break;
                        }
                    } else if (!f5509u.mo5527g(this, b57Var2, b57Var4)) {
                        break;
                    }
                    b57Var2 = b57Var4;
                }
                return;
            }
            return;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:30:0x0056, code lost:
        return true;
     */
    @Override // java.util.concurrent.Future
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public boolean cancel(boolean z) {
        s47 s47Var;
        Object obj = this.f5511p;
        if (!(obj == null) && !(obj instanceof w47)) {
            return false;
        }
        if (f5507s) {
            s47Var = new s47(z, new CancellationException("Future.cancel() was called."));
        } else {
            s47Var = z ? s47.f25858c : s47.f25859d;
            s47Var.getClass();
        }
        boolean z2 = false;
        c57<V> c57Var = this;
        while (true) {
            if (f5509u.mo5528f(c57Var, obj, s47Var)) {
                m25616B(c57Var, z);
                if (!(obj instanceof w47)) {
                    break;
                }
                f77<? extends V> f77Var = ((w47) obj).f30886q;
                if (!(f77Var instanceof y47)) {
                    f77Var.cancel(z);
                    break;
                }
                c57Var = (c57) f77Var;
                obj = c57Var.f5511p;
                if (!(obj == null) && !(obj instanceof w47)) {
                    break;
                }
                z2 = true;
            } else {
                obj = c57Var.f5511p;
                if (!(obj instanceof w47)) {
                    return z2;
                }
            }
        }
    }

    @CheckForNull
    /* renamed from: e */
    public String mo7361e() {
        if (this instanceof ScheduledFuture) {
            long delay = ((ScheduledFuture) this).getDelay(TimeUnit.MILLISECONDS);
            return "remaining delay=[" + delay + " ms]";
        }
        return null;
    }

    @Override // com.daaw.f77
    /* renamed from: f */
    public void mo6515f(Runnable runnable, Executor executor) {
        u47 u47Var;
        sy6.m9706c(runnable, "Runnable was null.");
        sy6.m9706c(executor, "Executor was null.");
        if (isDone() || (u47Var = this.f5512q) == u47.f28546d) {
            m25615C(runnable, executor);
        }
        u47 u47Var2 = new u47(runnable, executor);
        do {
            u47Var2.f28549c = u47Var;
            if (f5509u.mo5529e(this, u47Var, u47Var2)) {
                return;
            }
            u47Var = this.f5512q;
        } while (u47Var != u47.f28546d);
        m25615C(runnable, executor);
    }

    /* renamed from: g */
    public void mo7360g() {
    }

    @Override // java.util.concurrent.Future
    public Object get() {
        Object obj;
        if (Thread.interrupted()) {
            throw new InterruptedException();
        }
        Object obj2 = this.f5511p;
        if ((obj2 != null) && (!(obj2 instanceof w47))) {
            return m25613c(obj2);
        }
        b57 b57Var = this.f5513r;
        if (b57Var == b57.f4317c) {
            Object obj3 = this.f5511p;
            obj3.getClass();
            return m25613c(obj3);
        }
        b57 b57Var2 = new b57();
        do {
            r47 r47Var = f5509u;
            r47Var.mo5531c(b57Var2, b57Var);
            if (r47Var.mo5527g(this, b57Var, b57Var2)) {
                do {
                    LockSupport.park(this);
                    if (Thread.interrupted()) {
                        m25614b(b57Var2);
                        throw new InterruptedException();
                    }
                    obj = this.f5511p;
                } while (!((obj != null) & (!(obj instanceof w47))));
                return m25613c(obj);
            }
            b57Var = this.f5513r;
        } while (b57Var != b57.f4317c);
        Object obj32 = this.f5511p;
        obj32.getClass();
        return m25613c(obj32);
    }

    @Override // java.util.concurrent.Future
    public Object get(long j, TimeUnit timeUnit) {
        long nanos = timeUnit.toNanos(j);
        if (Thread.interrupted()) {
            throw new InterruptedException();
        }
        Object obj = this.f5511p;
        boolean z = true;
        if ((obj != null) && (!(obj instanceof w47))) {
            return m25613c(obj);
        }
        long nanoTime = nanos > 0 ? System.nanoTime() + nanos : 0L;
        if (nanos >= 1000) {
            b57 b57Var = this.f5513r;
            if (b57Var == b57.f4317c) {
                Object obj2 = this.f5511p;
                obj2.getClass();
                return m25613c(obj2);
            }
            b57 b57Var2 = new b57();
            do {
                r47 r47Var = f5509u;
                r47Var.mo5531c(b57Var2, b57Var);
                if (r47Var.mo5527g(this, b57Var, b57Var2)) {
                    do {
                        LockSupport.parkNanos(this, Math.min(nanos, 2147483647999999999L));
                        if (Thread.interrupted()) {
                            m25614b(b57Var2);
                            throw new InterruptedException();
                        }
                        Object obj3 = this.f5511p;
                        if ((obj3 != null) && (!(obj3 instanceof w47))) {
                            return m25613c(obj3);
                        }
                        nanos = nanoTime - System.nanoTime();
                    } while (nanos >= 1000);
                    m25614b(b57Var2);
                } else {
                    b57Var = this.f5513r;
                }
            } while (b57Var != b57.f4317c);
            Object obj22 = this.f5511p;
            obj22.getClass();
            return m25613c(obj22);
        }
        while (nanos > 0) {
            Object obj4 = this.f5511p;
            if ((obj4 != null) && (!(obj4 instanceof w47))) {
                return m25613c(obj4);
            }
            if (Thread.interrupted()) {
                throw new InterruptedException();
            }
            nanos = nanoTime - System.nanoTime();
        }
        String c57Var = toString();
        String timeUnit2 = timeUnit.toString();
        Locale locale = Locale.ROOT;
        String lowerCase = timeUnit2.toLowerCase(locale);
        String str = "Waited " + j + " " + timeUnit.toString().toLowerCase(locale);
        if (nanos + 1000 < 0) {
            String concat = str.concat(" (plus ");
            long j2 = -nanos;
            long convert = timeUnit.convert(j2, TimeUnit.NANOSECONDS);
            long nanos2 = j2 - timeUnit.toNanos(convert);
            if (convert != 0 && nanos2 <= 1000) {
                z = false;
            }
            if (convert > 0) {
                String str2 = concat + convert + " " + lowerCase;
                if (z) {
                    str2 = str2.concat(",");
                }
                concat = str2.concat(" ");
            }
            if (z) {
                concat = concat + nanos2 + " nanoseconds ";
            }
            str = concat.concat("delay)");
        }
        if (isDone()) {
            throw new TimeoutException(str.concat(" but future completed as timeout expired"));
        }
        throw new TimeoutException(str + " for " + c57Var);
    }

    /* renamed from: h */
    public boolean mo14486h(Object obj) {
        if (obj == null) {
            obj = f5510v;
        }
        if (f5509u.mo5528f(this, null, obj)) {
            m25616B(this, false);
            return true;
        }
        return false;
    }

    /* renamed from: i */
    public boolean mo14485i(Throwable th) {
        Objects.requireNonNull(th);
        if (f5509u.mo5528f(this, null, new t47(th))) {
            m25616B(this, false);
            return true;
        }
        return false;
    }

    @Override // java.util.concurrent.Future
    public boolean isCancelled() {
        return this.f5511p instanceof s47;
    }

    @Override // java.util.concurrent.Future
    public boolean isDone() {
        Object obj = this.f5511p;
        return (!(obj instanceof w47)) & (obj != null);
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getName().startsWith("com.google.common.util.concurrent.") ? getClass().getSimpleName() : getClass().getName());
        sb.append('@');
        sb.append(Integer.toHexString(System.identityHashCode(this)));
        sb.append("[status=");
        if (isCancelled()) {
            sb.append("CANCELLED");
        } else if (isDone()) {
            m25598y(sb);
        } else {
            m25597z(sb);
        }
        sb.append("]");
        return sb.toString();
    }

    /* renamed from: u */
    public void mo22880u() {
    }

    /* renamed from: v */
    public final void m25601v(@CheckForNull Future future) {
        if ((future != null) && isCancelled()) {
            future.cancel(m25599x());
        }
    }

    /* renamed from: w */
    public final boolean m25600w(f77 f77Var) {
        t47 t47Var;
        Objects.requireNonNull(f77Var);
        Object obj = this.f5511p;
        if (obj == null) {
            if (f77Var.isDone()) {
                if (f5509u.mo5528f(this, null, m25612j(f77Var))) {
                    m25616B(this, false);
                    return true;
                }
                return false;
            }
            w47 w47Var = new w47(this, f77Var);
            if (f5509u.mo5528f(this, null, w47Var)) {
                try {
                    f77Var.mo6515f(w47Var, g67.INSTANCE);
                } catch (Error | RuntimeException e) {
                    try {
                        t47Var = new t47(e);
                    } catch (Error | RuntimeException unused) {
                        t47Var = t47.f27001b;
                    }
                    f5509u.mo5528f(this, w47Var, t47Var);
                }
                return true;
            }
            obj = this.f5511p;
        }
        if (obj instanceof s47) {
            f77Var.cancel(((s47) obj).f25860a);
        }
        return false;
    }

    /* renamed from: x */
    public final boolean m25599x() {
        Object obj = this.f5511p;
        return (obj instanceof s47) && ((s47) obj).f25860a;
    }

    /* renamed from: y */
    public final void m25598y(StringBuilder sb) {
        String hexString;
        String str = "]";
        try {
            Object m25611k = m25611k(this);
            sb.append("SUCCESS, result=[");
            if (m25611k == null) {
                hexString = "null";
            } else if (m25611k == this) {
                hexString = "this future";
            } else {
                sb.append(m25611k.getClass().getName());
                sb.append("@");
                hexString = Integer.toHexString(System.identityHashCode(m25611k));
            }
            sb.append(hexString);
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

    /* JADX WARN: Removed duplicated region for block: B:16:0x004c  */
    /* JADX WARN: Removed duplicated region for block: B:20:? A[RETURN, SYNTHETIC] */
    /* renamed from: z */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void m25597z(StringBuilder sb) {
        String concat;
        int length = sb.length();
        sb.append("PENDING");
        Object obj = this.f5511p;
        if (!(obj instanceof w47)) {
            try {
                concat = hz6.m20318a(mo7361e());
            } catch (RuntimeException | StackOverflowError e) {
                concat = "Exception thrown from implementation: ".concat(String.valueOf(e.getClass()));
            }
            if (concat != null) {
                sb.append(", info=[");
                sb.append(concat);
            }
            if (isDone()) {
                return;
            }
            sb.delete(length, sb.length());
            m25598y(sb);
            return;
        }
        sb.append(", setFuture=[");
        m25617A(sb, ((w47) obj).f30886q);
        sb.append("]");
        if (isDone()) {
        }
    }
}
