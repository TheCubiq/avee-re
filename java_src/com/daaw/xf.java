package com.daaw;

import android.accounts.Account;
import android.view.View;
import com.google.android.gms.common.api.Scope;
import java.util.Collection;
import java.util.Collections;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;
import javax.annotation.Nullable;
/* loaded from: classes.dex */
public final class xf {
    @Nullable
    public final Account a;
    public final Set<Scope> b;
    public final Set<Scope> c;
    public final Map<k3<?>, xz1> d;
    public final int e;
    @Nullable
    public final View f;
    public final String g;
    public final String h;
    public final xc1 i;
    public Integer j;

    /* loaded from: classes.dex */
    public static final class a {
        @Nullable
        public Account a;
        public j6<Scope> b;
        public String c;
        public String d;
        public xc1 e = xc1.k;

        public xf a() {
            return new xf(this.a, this.b, null, 0, null, this.c, this.d, this.e, false);
        }

        public a b(String str) {
            this.c = str;
            return this;
        }

        public final a c(Collection<Scope> collection) {
            if (this.b == null) {
                this.b = new j6<>();
            }
            this.b.addAll(collection);
            return this;
        }

        public final a d(@Nullable Account account) {
            this.a = account;
            return this;
        }

        public final a e(String str) {
            this.d = str;
            return this;
        }
    }

    public xf(@Nullable Account account, Set<Scope> set, Map<k3<?>, xz1> map, int i, @Nullable View view, String str, String str2, @Nullable xc1 xc1Var, boolean z) {
        this.a = account;
        Set<Scope> emptySet = set == null ? Collections.emptySet() : Collections.unmodifiableSet(set);
        this.b = emptySet;
        map = map == null ? Collections.emptyMap() : map;
        this.d = map;
        this.f = view;
        this.e = i;
        this.g = str;
        this.h = str2;
        this.i = xc1Var == null ? xc1.k : xc1Var;
        HashSet hashSet = new HashSet(emptySet);
        for (xz1 xz1Var : map.values()) {
            hashSet.addAll(xz1Var.a);
        }
        this.c = Collections.unmodifiableSet(hashSet);
    }

    public Account a() {
        return this.a;
    }

    public Account b() {
        Account account = this.a;
        return account != null ? account : new Account(pa.DEFAULT_ACCOUNT, "com.google");
    }

    public Set<Scope> c() {
        return this.c;
    }

    public String d() {
        return this.g;
    }

    public Set<Scope> e() {
        return this.b;
    }

    public final xc1 f() {
        return this.i;
    }

    public final Integer g() {
        return this.j;
    }

    public final String h() {
        return this.h;
    }

    public final void i(Integer num) {
        this.j = num;
    }
}
