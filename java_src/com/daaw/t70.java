package com.daaw;

import android.accounts.Account;
import android.content.Context;
import android.os.IInterface;
import android.os.Looper;
import com.daaw.C1897k3;
import com.daaw.y70;
import com.google.android.gms.common.api.Scope;
import java.util.Collections;
import java.util.Set;
import java.util.concurrent.Executor;
/* loaded from: classes.dex */
public abstract class t70<T extends IInterface> extends AbstractC2527pa<T> implements C1897k3.InterfaceC1906f {

    /* renamed from: E */
    public final C3536xf f27091E;

    /* renamed from: F */
    public final Set<Scope> f27092F;

    /* renamed from: G */
    public final Account f27093G;

    public t70(Context context, Looper looper, int i, C3536xf c3536xf, InterfaceC1192ej interfaceC1192ej, du0 du0Var) {
        this(context, looper, u70.m8461b(context), w70.m6477m(), i, c3536xf, (InterfaceC1192ej) ry0.m10830j(interfaceC1192ej), (du0) ry0.m10830j(du0Var));
    }

    @Deprecated
    public t70(Context context, Looper looper, int i, C3536xf c3536xf, y70.InterfaceC3675a interfaceC3675a, y70.InterfaceC3676b interfaceC3676b) {
        this(context, looper, i, c3536xf, (InterfaceC1192ej) interfaceC3675a, (du0) interfaceC3676b);
    }

    public t70(Context context, Looper looper, u70 u70Var, w70 w70Var, int i, C3536xf c3536xf, InterfaceC1192ej interfaceC1192ej, du0 du0Var) {
        super(context, looper, u70Var, w70Var, i, interfaceC1192ej == null ? null : new w12(interfaceC1192ej), du0Var == null ? null : new z12(du0Var), c3536xf.m5160h());
        this.f27091E = c3536xf;
        this.f27093G = c3536xf.m5167a();
        this.f27092F = m9479K(c3536xf.m5165c());
    }

    /* renamed from: J */
    public Set<Scope> m9480J(Set<Scope> set) {
        return set;
    }

    /* renamed from: K */
    public final Set<Scope> m9479K(Set<Scope> set) {
        Set<Scope> m9480J = m9480J(set);
        for (Scope scope : m9480J) {
            if (!set.contains(scope)) {
                throw new IllegalStateException("Expanding scopes is not permitted, use implied scopes instead");
            }
        }
        return m9480J;
    }

    @Override // com.daaw.C1897k3.InterfaceC1906f
    /* renamed from: a */
    public Set<Scope> mo9478a() {
        return requiresSignIn() ? this.f27092F : Collections.emptySet();
    }

    @Override // com.daaw.AbstractC2527pa
    /* renamed from: g */
    public final Executor mo9477g() {
        return null;
    }

    @Override // com.daaw.AbstractC2527pa
    public final Account getAccount() {
        return this.f27093G;
    }

    @Override // com.daaw.AbstractC2527pa
    /* renamed from: j */
    public final Set<Scope> mo9476j() {
        return this.f27092F;
    }
}
