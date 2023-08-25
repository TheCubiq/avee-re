package com.daaw;

import javax.annotation.CheckForNull;
/* loaded from: classes.dex */
public final class x47 extends r47 {
    public /* synthetic */ x47(e57 e57Var) {
        super(null);
    }

    @Override // com.daaw.r47
    /* renamed from: a */
    public final u47 mo5533a(c57 c57Var, u47 u47Var) {
        u47 u47Var2;
        synchronized (c57Var) {
            u47Var2 = c57Var.f5512q;
            if (u47Var2 != u47Var) {
                c57Var.f5512q = u47Var;
            }
        }
        return u47Var2;
    }

    @Override // com.daaw.r47
    /* renamed from: b */
    public final b57 mo5532b(c57 c57Var, b57 b57Var) {
        b57 b57Var2;
        synchronized (c57Var) {
            b57Var2 = c57Var.f5513r;
            if (b57Var2 != b57Var) {
                c57Var.f5513r = b57Var;
            }
        }
        return b57Var2;
    }

    @Override // com.daaw.r47
    /* renamed from: c */
    public final void mo5531c(b57 b57Var, @CheckForNull b57 b57Var2) {
        b57Var.f4319b = b57Var2;
    }

    @Override // com.daaw.r47
    /* renamed from: d */
    public final void mo5530d(b57 b57Var, Thread thread) {
        b57Var.f4318a = thread;
    }

    @Override // com.daaw.r47
    /* renamed from: e */
    public final boolean mo5529e(c57 c57Var, @CheckForNull u47 u47Var, u47 u47Var2) {
        u47 u47Var3;
        synchronized (c57Var) {
            u47Var3 = c57Var.f5512q;
            if (u47Var3 == u47Var) {
                c57Var.f5512q = u47Var2;
                return true;
            }
            return false;
        }
    }

    @Override // com.daaw.r47
    /* renamed from: f */
    public final boolean mo5528f(c57 c57Var, @CheckForNull Object obj, Object obj2) {
        Object obj3;
        synchronized (c57Var) {
            obj3 = c57Var.f5511p;
            if (obj3 == obj) {
                c57Var.f5511p = obj2;
                return true;
            }
            return false;
        }
    }

    @Override // com.daaw.r47
    /* renamed from: g */
    public final boolean mo5527g(c57 c57Var, @CheckForNull b57 b57Var, @CheckForNull b57 b57Var2) {
        b57 b57Var3;
        synchronized (c57Var) {
            b57Var3 = c57Var.f5513r;
            if (b57Var3 == b57Var) {
                c57Var.f5513r = b57Var2;
                return true;
            }
            return false;
        }
    }
}
