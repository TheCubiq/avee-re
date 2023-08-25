package com.daaw;

import javax.annotation.CheckForNull;
/* loaded from: classes.dex */
public final class x47 extends r47 {
    public /* synthetic */ x47(e57 e57Var) {
        super(null);
    }

    @Override // com.daaw.r47
    public final u47 a(c57 c57Var, u47 u47Var) {
        u47 u47Var2;
        synchronized (c57Var) {
            u47Var2 = c57Var.q;
            if (u47Var2 != u47Var) {
                c57Var.q = u47Var;
            }
        }
        return u47Var2;
    }

    @Override // com.daaw.r47
    public final b57 b(c57 c57Var, b57 b57Var) {
        b57 b57Var2;
        synchronized (c57Var) {
            b57Var2 = c57Var.r;
            if (b57Var2 != b57Var) {
                c57Var.r = b57Var;
            }
        }
        return b57Var2;
    }

    @Override // com.daaw.r47
    public final void c(b57 b57Var, @CheckForNull b57 b57Var2) {
        b57Var.b = b57Var2;
    }

    @Override // com.daaw.r47
    public final void d(b57 b57Var, Thread thread) {
        b57Var.a = thread;
    }

    @Override // com.daaw.r47
    public final boolean e(c57 c57Var, @CheckForNull u47 u47Var, u47 u47Var2) {
        u47 u47Var3;
        synchronized (c57Var) {
            u47Var3 = c57Var.q;
            if (u47Var3 == u47Var) {
                c57Var.q = u47Var2;
                return true;
            }
            return false;
        }
    }

    @Override // com.daaw.r47
    public final boolean f(c57 c57Var, @CheckForNull Object obj, Object obj2) {
        Object obj3;
        synchronized (c57Var) {
            obj3 = c57Var.p;
            if (obj3 == obj) {
                c57Var.p = obj2;
                return true;
            }
            return false;
        }
    }

    @Override // com.daaw.r47
    public final boolean g(c57 c57Var, @CheckForNull b57 b57Var, @CheckForNull b57 b57Var2) {
        b57 b57Var3;
        synchronized (c57Var) {
            b57Var3 = c57Var.r;
            if (b57Var3 == b57Var) {
                c57Var.r = b57Var2;
                return true;
            }
            return false;
        }
    }
}
