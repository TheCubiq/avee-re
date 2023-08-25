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
    public static final boolean s;
    public static final Logger t;
    public static final r47 u;
    public static final Object v;
    @CheckForNull
    public volatile Object p;
    @CheckForNull
    public volatile u47 q;
    @CheckForNull
    public volatile b57 r;

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
        s = z;
        t = Logger.getLogger(c57.class.getName());
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
        u = x47Var;
        if (th != null) {
            Logger logger = t;
            Level level = Level.SEVERE;
            logger.logp(level, "com.google.common.util.concurrent.AbstractFuture", "<clinit>", "UnsafeAtomicHelper is broken!", th2);
            logger.logp(level, "com.google.common.util.concurrent.AbstractFuture", "<clinit>", "SafeAtomicHelper is broken!", th);
        }
        v = new Object();
    }

    public static void B(c57 c57Var, boolean z) {
        u47 u47Var = null;
        while (true) {
            for (b57 b = u.b(c57Var, b57.c); b != null; b = b.b) {
                Thread thread = b.a;
                if (thread != null) {
                    b.a = null;
                    LockSupport.unpark(thread);
                }
            }
            if (z) {
                c57Var.u();
            }
            c57Var.g();
            u47 u47Var2 = u47Var;
            u47 a = u.a(c57Var, u47.d);
            u47 u47Var3 = u47Var2;
            while (a != null) {
                u47 u47Var4 = a.c;
                a.c = u47Var3;
                u47Var3 = a;
                a = u47Var4;
            }
            while (u47Var3 != null) {
                u47Var = u47Var3.c;
                Runnable runnable = u47Var3.a;
                runnable.getClass();
                if (runnable instanceof w47) {
                    w47 w47Var = (w47) runnable;
                    c57Var = w47Var.p;
                    if (c57Var.p == w47Var) {
                        if (u.f(c57Var, w47Var, j(w47Var.q))) {
                            break;
                        }
                    } else {
                        continue;
                    }
                } else {
                    Executor executor = u47Var3.b;
                    executor.getClass();
                    C(runnable, executor);
                }
                u47Var3 = u47Var;
            }
            return;
            z = false;
        }
    }

    public static void C(Runnable runnable, Executor executor) {
        try {
            executor.execute(runnable);
        } catch (RuntimeException e) {
            Logger logger = t;
            Level level = Level.SEVERE;
            String valueOf = String.valueOf(runnable);
            String valueOf2 = String.valueOf(executor);
            logger.logp(level, "com.google.common.util.concurrent.AbstractFuture", "executeListener", "RuntimeException while executing runnable " + valueOf + " with executor " + valueOf2, (Throwable) e);
        }
    }

    public static final Object c(Object obj) {
        if (obj instanceof s47) {
            Throwable th = ((s47) obj).b;
            CancellationException cancellationException = new CancellationException("Task was cancelled.");
            cancellationException.initCause(th);
            throw cancellationException;
        } else if (obj instanceof t47) {
            throw new ExecutionException(((t47) obj).a);
        } else {
            if (obj == v) {
                return null;
            }
            return obj;
        }
    }

    public static Object j(f77 f77Var) {
        Throwable a;
        if (f77Var instanceof y47) {
            Object obj = ((c57) f77Var).p;
            if (obj instanceof s47) {
                s47 s47Var = (s47) obj;
                if (s47Var.a) {
                    Throwable th = s47Var.b;
                    obj = th != null ? new s47(false, th) : s47.d;
                }
            }
            obj.getClass();
            return obj;
        } else if (!(f77Var instanceof y77) || (a = ((y77) f77Var).a()) == null) {
            boolean isCancelled = f77Var.isCancelled();
            if ((!s) && isCancelled) {
                s47 s47Var2 = s47.d;
                s47Var2.getClass();
                return s47Var2;
            }
            try {
                Object k = k(f77Var);
                if (!isCancelled) {
                    return k == null ? v : k;
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
            return new t47(a);
        }
    }

    public static Object k(Future future) {
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

    public final void A(StringBuilder sb, @CheckForNull Object obj) {
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
    public final Throwable a() {
        if (this instanceof y47) {
            Object obj = this.p;
            if (obj instanceof t47) {
                return ((t47) obj).a;
            }
            return null;
        }
        return null;
    }

    public final void b(b57 b57Var) {
        b57Var.a = null;
        while (true) {
            b57 b57Var2 = this.r;
            if (b57Var2 != b57.c) {
                b57 b57Var3 = null;
                while (b57Var2 != null) {
                    b57 b57Var4 = b57Var2.b;
                    if (b57Var2.a != null) {
                        b57Var3 = b57Var2;
                    } else if (b57Var3 != null) {
                        b57Var3.b = b57Var4;
                        if (b57Var3.a == null) {
                            break;
                        }
                    } else if (!u.g(this, b57Var2, b57Var4)) {
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
        To view partially-correct add '--show-bad-code' argument
    */
    public boolean cancel(boolean r8) {
        /*
            r7 = this;
            java.lang.Object r0 = r7.p
            r1 = 0
            r2 = 1
            if (r0 != 0) goto L8
            r3 = 1
            goto L9
        L8:
            r3 = 0
        L9:
            boolean r4 = r0 instanceof com.daaw.w47
            r3 = r3 | r4
            if (r3 == 0) goto L5f
            boolean r3 = com.daaw.c57.s
            if (r3 == 0) goto L1f
            com.daaw.s47 r3 = new com.daaw.s47
            java.util.concurrent.CancellationException r4 = new java.util.concurrent.CancellationException
            java.lang.String r5 = "Future.cancel() was called."
            r4.<init>(r5)
            r3.<init>(r8, r4)
            goto L29
        L1f:
            if (r8 == 0) goto L24
            com.daaw.s47 r3 = com.daaw.s47.c
            goto L26
        L24:
            com.daaw.s47 r3 = com.daaw.s47.d
        L26:
            r3.getClass()
        L29:
            r5 = 0
            r4 = r7
        L2b:
            com.daaw.r47 r6 = com.daaw.c57.u
            boolean r6 = r6.f(r4, r0, r3)
            if (r6 == 0) goto L58
            B(r4, r8)
            boolean r4 = r0 instanceof com.daaw.w47
            if (r4 == 0) goto L56
            com.daaw.w47 r0 = (com.daaw.w47) r0
            com.daaw.f77<? extends V> r0 = r0.q
            boolean r4 = r0 instanceof com.daaw.y47
            if (r4 == 0) goto L53
            r4 = r0
            com.daaw.c57 r4 = (com.daaw.c57) r4
            java.lang.Object r0 = r4.p
            if (r0 != 0) goto L4b
            r5 = 1
            goto L4c
        L4b:
            r5 = 0
        L4c:
            boolean r6 = r0 instanceof com.daaw.w47
            r5 = r5 | r6
            if (r5 == 0) goto L56
            r5 = 1
            goto L2b
        L53:
            r0.cancel(r8)
        L56:
            r1 = 1
            goto L5f
        L58:
            java.lang.Object r0 = r4.p
            boolean r6 = r0 instanceof com.daaw.w47
            if (r6 != 0) goto L2b
            r1 = r5
        L5f:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.daaw.c57.cancel(boolean):boolean");
    }

    @CheckForNull
    public String e() {
        if (this instanceof ScheduledFuture) {
            long delay = ((ScheduledFuture) this).getDelay(TimeUnit.MILLISECONDS);
            return "remaining delay=[" + delay + " ms]";
        }
        return null;
    }

    @Override // com.daaw.f77
    public void f(Runnable runnable, Executor executor) {
        u47 u47Var;
        sy6.c(runnable, "Runnable was null.");
        sy6.c(executor, "Executor was null.");
        if (isDone() || (u47Var = this.q) == u47.d) {
            C(runnable, executor);
        }
        u47 u47Var2 = new u47(runnable, executor);
        do {
            u47Var2.c = u47Var;
            if (u.e(this, u47Var, u47Var2)) {
                return;
            }
            u47Var = this.q;
        } while (u47Var != u47.d);
        C(runnable, executor);
    }

    public void g() {
    }

    @Override // java.util.concurrent.Future
    public Object get() {
        Object obj;
        if (Thread.interrupted()) {
            throw new InterruptedException();
        }
        Object obj2 = this.p;
        if ((obj2 != null) && (!(obj2 instanceof w47))) {
            return c(obj2);
        }
        b57 b57Var = this.r;
        if (b57Var == b57.c) {
            Object obj3 = this.p;
            obj3.getClass();
            return c(obj3);
        }
        b57 b57Var2 = new b57();
        do {
            r47 r47Var = u;
            r47Var.c(b57Var2, b57Var);
            if (r47Var.g(this, b57Var, b57Var2)) {
                do {
                    LockSupport.park(this);
                    if (Thread.interrupted()) {
                        b(b57Var2);
                        throw new InterruptedException();
                    }
                    obj = this.p;
                } while (!((obj != null) & (!(obj instanceof w47))));
                return c(obj);
            }
            b57Var = this.r;
        } while (b57Var != b57.c);
        Object obj32 = this.p;
        obj32.getClass();
        return c(obj32);
    }

    @Override // java.util.concurrent.Future
    public Object get(long j, TimeUnit timeUnit) {
        long nanos = timeUnit.toNanos(j);
        if (Thread.interrupted()) {
            throw new InterruptedException();
        }
        Object obj = this.p;
        boolean z = true;
        if ((obj != null) && (!(obj instanceof w47))) {
            return c(obj);
        }
        long nanoTime = nanos > 0 ? System.nanoTime() + nanos : 0L;
        if (nanos >= 1000) {
            b57 b57Var = this.r;
            if (b57Var == b57.c) {
                Object obj2 = this.p;
                obj2.getClass();
                return c(obj2);
            }
            b57 b57Var2 = new b57();
            do {
                r47 r47Var = u;
                r47Var.c(b57Var2, b57Var);
                if (r47Var.g(this, b57Var, b57Var2)) {
                    do {
                        LockSupport.parkNanos(this, Math.min(nanos, 2147483647999999999L));
                        if (Thread.interrupted()) {
                            b(b57Var2);
                            throw new InterruptedException();
                        }
                        Object obj3 = this.p;
                        if ((obj3 != null) && (!(obj3 instanceof w47))) {
                            return c(obj3);
                        }
                        nanos = nanoTime - System.nanoTime();
                    } while (nanos >= 1000);
                    b(b57Var2);
                } else {
                    b57Var = this.r;
                }
            } while (b57Var != b57.c);
            Object obj22 = this.p;
            obj22.getClass();
            return c(obj22);
        }
        while (nanos > 0) {
            Object obj4 = this.p;
            if ((obj4 != null) && (!(obj4 instanceof w47))) {
                return c(obj4);
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

    public boolean h(Object obj) {
        if (obj == null) {
            obj = v;
        }
        if (u.f(this, null, obj)) {
            B(this, false);
            return true;
        }
        return false;
    }

    public boolean i(Throwable th) {
        Objects.requireNonNull(th);
        if (u.f(this, null, new t47(th))) {
            B(this, false);
            return true;
        }
        return false;
    }

    @Override // java.util.concurrent.Future
    public boolean isCancelled() {
        return this.p instanceof s47;
    }

    @Override // java.util.concurrent.Future
    public boolean isDone() {
        Object obj = this.p;
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
            y(sb);
        } else {
            z(sb);
        }
        sb.append("]");
        return sb.toString();
    }

    public void u() {
    }

    public final void v(@CheckForNull Future future) {
        if ((future != null) && isCancelled()) {
            future.cancel(x());
        }
    }

    public final boolean w(f77 f77Var) {
        t47 t47Var;
        Objects.requireNonNull(f77Var);
        Object obj = this.p;
        if (obj == null) {
            if (f77Var.isDone()) {
                if (u.f(this, null, j(f77Var))) {
                    B(this, false);
                    return true;
                }
                return false;
            }
            w47 w47Var = new w47(this, f77Var);
            if (u.f(this, null, w47Var)) {
                try {
                    f77Var.f(w47Var, g67.INSTANCE);
                } catch (Error | RuntimeException e) {
                    try {
                        t47Var = new t47(e);
                    } catch (Error | RuntimeException unused) {
                        t47Var = t47.b;
                    }
                    u.f(this, w47Var, t47Var);
                }
                return true;
            }
            obj = this.p;
        }
        if (obj instanceof s47) {
            f77Var.cancel(((s47) obj).a);
        }
        return false;
    }

    public final boolean x() {
        Object obj = this.p;
        return (obj instanceof s47) && ((s47) obj).a;
    }

    public final void y(StringBuilder sb) {
        String hexString;
        String str = "]";
        try {
            Object k = k(this);
            sb.append("SUCCESS, result=[");
            if (k == null) {
                hexString = "null";
            } else if (k == this) {
                hexString = "this future";
            } else {
                sb.append(k.getClass().getName());
                sb.append("@");
                hexString = Integer.toHexString(System.identityHashCode(k));
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
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void z(java.lang.StringBuilder r5) {
        /*
            r4 = this;
            int r0 = r5.length()
            java.lang.String r1 = "PENDING"
            r5.append(r1)
            java.lang.Object r1 = r4.p
            boolean r2 = r1 instanceof com.daaw.w47
            java.lang.String r3 = "]"
            if (r2 == 0) goto L21
            java.lang.String r2 = ", setFuture=["
            r5.append(r2)
            com.daaw.w47 r1 = (com.daaw.w47) r1
            com.daaw.f77<? extends V> r1 = r1.q
            r4.A(r5, r1)
        L1d:
            r5.append(r3)
            goto L46
        L21:
            java.lang.String r1 = r4.e()     // Catch: java.lang.StackOverflowError -> L2a java.lang.RuntimeException -> L2c
            java.lang.String r1 = com.daaw.hz6.a(r1)     // Catch: java.lang.StackOverflowError -> L2a java.lang.RuntimeException -> L2c
            goto L3b
        L2a:
            r1 = move-exception
            goto L2d
        L2c:
            r1 = move-exception
        L2d:
            java.lang.Class r1 = r1.getClass()
            java.lang.String r1 = java.lang.String.valueOf(r1)
            java.lang.String r2 = "Exception thrown from implementation: "
            java.lang.String r1 = r2.concat(r1)
        L3b:
            if (r1 == 0) goto L46
            java.lang.String r2 = ", info=["
            r5.append(r2)
            r5.append(r1)
            goto L1d
        L46:
            boolean r1 = r4.isDone()
            if (r1 == 0) goto L56
            int r1 = r5.length()
            r5.delete(r0, r1)
            r4.y(r5)
        L56:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.daaw.c57.z(java.lang.StringBuilder):void");
    }
}
