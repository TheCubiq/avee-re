package com.daaw;

import android.accounts.Account;
import android.content.Context;
import android.os.IInterface;
import android.os.Looper;
import com.daaw.k3;
import com.daaw.y70;
import com.google.android.gms.common.api.Scope;
import java.util.Collections;
import java.util.Set;
import java.util.concurrent.Executor;
/* loaded from: classes.dex */
public abstract class t70<T extends IInterface> extends pa<T> implements k3.f {
    public final xf E;
    public final Set<Scope> F;
    public final Account G;

    public t70(Context context, Looper looper, int i, xf xfVar, ej ejVar, du0 du0Var) {
        this(context, looper, u70.b(context), w70.m(), i, xfVar, (ej) ry0.j(ejVar), (du0) ry0.j(du0Var));
    }

    @Deprecated
    public t70(Context context, Looper looper, int i, xf xfVar, y70.a aVar, y70.b bVar) {
        this(context, looper, i, xfVar, (ej) aVar, (du0) bVar);
    }

    public t70(Context context, Looper looper, u70 u70Var, w70 w70Var, int i, xf xfVar, ej ejVar, du0 du0Var) {
        super(context, looper, u70Var, w70Var, i, ejVar == null ? null : new w12(ejVar), du0Var == null ? null : new z12(du0Var), xfVar.h());
        this.E = xfVar;
        this.G = xfVar.a();
        this.F = K(xfVar.c());
    }

    public Set<Scope> J(Set<Scope> set) {
        return set;
    }

    public final Set<Scope> K(Set<Scope> set) {
        Set<Scope> J = J(set);
        for (Scope scope : J) {
            if (!set.contains(scope)) {
                throw new IllegalStateException("Expanding scopes is not permitted, use implied scopes instead");
            }
        }
        return J;
    }

    @Override // com.daaw.k3.f
    public Set<Scope> a() {
        return requiresSignIn() ? this.F : Collections.emptySet();
    }

    @Override // com.daaw.pa
    public final Executor g() {
        return null;
    }

    @Override // com.daaw.pa
    public final Account getAccount() {
        return this.G;
    }

    @Override // com.daaw.pa
    public final Set<Scope> j() {
        return this.F;
    }
}
