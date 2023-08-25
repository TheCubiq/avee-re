package com.daaw;

import java.lang.reflect.Field;
import java.security.AccessController;
import java.security.PrivilegedActionException;
import java.security.PrivilegedExceptionAction;
import javax.annotation.CheckForNull;
import sun.misc.Unsafe;
/* loaded from: classes.dex */
public final class a57 extends r47 {

    /* renamed from: a */
    public static final Unsafe f2913a;

    /* renamed from: b */
    public static final long f2914b;

    /* renamed from: c */
    public static final long f2915c;

    /* renamed from: d */
    public static final long f2916d;

    /* renamed from: e */
    public static final long f2917e;

    /* renamed from: f */
    public static final long f2918f;

    /* renamed from: com.daaw.a57$a */
    /* loaded from: classes.dex */
    public class C0603a implements PrivilegedExceptionAction<Unsafe> {
        /* renamed from: a */
        public static final Unsafe m27602a() {
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
            return m27602a();
        }
    }

    static {
        Unsafe unsafe;
        try {
            try {
                unsafe = Unsafe.getUnsafe();
            } catch (PrivilegedActionException e) {
                throw new RuntimeException("Could not initialize intrinsics", e.getCause());
            }
        } catch (SecurityException unused) {
            unsafe = (Unsafe) AccessController.doPrivileged(new C0603a());
        }
        try {
            f2915c = unsafe.objectFieldOffset(c57.class.getDeclaredField("r"));
            f2914b = unsafe.objectFieldOffset(c57.class.getDeclaredField("q"));
            f2916d = unsafe.objectFieldOffset(c57.class.getDeclaredField("p"));
            f2917e = unsafe.objectFieldOffset(b57.class.getDeclaredField("a"));
            f2918f = unsafe.objectFieldOffset(b57.class.getDeclaredField("b"));
            f2913a = unsafe;
        } catch (NoSuchFieldException e2) {
            throw new RuntimeException(e2);
        } catch (RuntimeException e3) {
            throw e3;
        }
    }

    public /* synthetic */ a57(h57 h57Var) {
        super(null);
    }

    @Override // com.daaw.r47
    /* renamed from: a */
    public final u47 mo5533a(c57 c57Var, u47 u47Var) {
        u47 u47Var2;
        do {
            u47Var2 = c57Var.f5512q;
            if (u47Var == u47Var2) {
                return u47Var2;
            }
        } while (!mo5529e(c57Var, u47Var2, u47Var));
        return u47Var2;
    }

    @Override // com.daaw.r47
    /* renamed from: b */
    public final b57 mo5532b(c57 c57Var, b57 b57Var) {
        b57 b57Var2;
        do {
            b57Var2 = c57Var.f5513r;
            if (b57Var == b57Var2) {
                return b57Var2;
            }
        } while (!mo5527g(c57Var, b57Var2, b57Var));
        return b57Var2;
    }

    @Override // com.daaw.r47
    /* renamed from: c */
    public final void mo5531c(b57 b57Var, @CheckForNull b57 b57Var2) {
        f2913a.putObject(b57Var, f2918f, b57Var2);
    }

    @Override // com.daaw.r47
    /* renamed from: d */
    public final void mo5530d(b57 b57Var, Thread thread) {
        f2913a.putObject(b57Var, f2917e, thread);
    }

    @Override // com.daaw.r47
    /* renamed from: e */
    public final boolean mo5529e(c57 c57Var, @CheckForNull u47 u47Var, u47 u47Var2) {
        return g57.m21908a(f2913a, c57Var, f2914b, u47Var, u47Var2);
    }

    @Override // com.daaw.r47
    /* renamed from: f */
    public final boolean mo5528f(c57 c57Var, @CheckForNull Object obj, Object obj2) {
        return g57.m21908a(f2913a, c57Var, f2916d, obj, obj2);
    }

    @Override // com.daaw.r47
    /* renamed from: g */
    public final boolean mo5527g(c57 c57Var, @CheckForNull b57 b57Var, @CheckForNull b57 b57Var2) {
        return g57.m21908a(f2913a, c57Var, f2915c, b57Var, b57Var2);
    }
}
