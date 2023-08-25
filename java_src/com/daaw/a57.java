package com.daaw;

import java.lang.reflect.Field;
import java.security.AccessController;
import java.security.PrivilegedActionException;
import java.security.PrivilegedExceptionAction;
import javax.annotation.CheckForNull;
import sun.misc.Unsafe;
/* loaded from: classes.dex */
public final class a57 extends r47 {
    public static final Unsafe a;
    public static final long b;
    public static final long c;
    public static final long d;
    public static final long e;
    public static final long f;

    /* loaded from: classes.dex */
    public class a implements PrivilegedExceptionAction<Unsafe> {
        public static final Unsafe a() {
            Field[] declaredFields;
            for (Field field : Unsafe.class.getDeclaredFields()) {
                field.setAccessible(true);
                Object obj = field.get(null);
                if (Unsafe.class.isInstance(obj)) {
                    return (Unsafe) Unsafe.class.cast(obj);
                }
            }
            throw new NoSuchFieldError("the Unsafe");
        }

        @Override // java.security.PrivilegedExceptionAction
        public final /* bridge */ /* synthetic */ Unsafe run() {
            return a();
        }
    }

    static {
        Unsafe unsafe;
        try {
            try {
                unsafe = Unsafe.getUnsafe();
            } catch (PrivilegedActionException e2) {
                throw new RuntimeException("Could not initialize intrinsics", e2.getCause());
            }
        } catch (SecurityException unused) {
            unsafe = (Unsafe) AccessController.doPrivileged(new a());
        }
        try {
            c = unsafe.objectFieldOffset(c57.class.getDeclaredField("r"));
            b = unsafe.objectFieldOffset(c57.class.getDeclaredField("q"));
            d = unsafe.objectFieldOffset(c57.class.getDeclaredField("p"));
            e = unsafe.objectFieldOffset(b57.class.getDeclaredField("a"));
            f = unsafe.objectFieldOffset(b57.class.getDeclaredField("b"));
            a = unsafe;
        } catch (NoSuchFieldException e3) {
            throw new RuntimeException(e3);
        } catch (RuntimeException e4) {
            throw e4;
        }
    }

    public /* synthetic */ a57(h57 h57Var) {
        super(null);
    }

    @Override // com.daaw.r47
    public final u47 a(c57 c57Var, u47 u47Var) {
        u47 u47Var2;
        do {
            u47Var2 = c57Var.q;
            if (u47Var == u47Var2) {
                return u47Var2;
            }
        } while (!e(c57Var, u47Var2, u47Var));
        return u47Var2;
    }

    @Override // com.daaw.r47
    public final b57 b(c57 c57Var, b57 b57Var) {
        b57 b57Var2;
        do {
            b57Var2 = c57Var.r;
            if (b57Var == b57Var2) {
                return b57Var2;
            }
        } while (!g(c57Var, b57Var2, b57Var));
        return b57Var2;
    }

    @Override // com.daaw.r47
    public final void c(b57 b57Var, @CheckForNull b57 b57Var2) {
        a.putObject(b57Var, f, b57Var2);
    }

    @Override // com.daaw.r47
    public final void d(b57 b57Var, Thread thread) {
        a.putObject(b57Var, e, thread);
    }

    @Override // com.daaw.r47
    public final boolean e(c57 c57Var, @CheckForNull u47 u47Var, u47 u47Var2) {
        return g57.a(a, c57Var, b, u47Var, u47Var2);
    }

    @Override // com.daaw.r47
    public final boolean f(c57 c57Var, @CheckForNull Object obj, Object obj2) {
        return g57.a(a, c57Var, d, obj, obj2);
    }

    @Override // com.daaw.r47
    public final boolean g(c57 c57Var, @CheckForNull b57 b57Var, @CheckForNull b57 b57Var2) {
        return g57.a(a, c57Var, c, b57Var, b57Var2);
    }
}
