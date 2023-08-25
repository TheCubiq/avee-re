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
/* renamed from: com.daaw.xf */
/* loaded from: classes.dex */
public final class C3536xf {
    @Nullable

    /* renamed from: a */
    public final Account f32637a;

    /* renamed from: b */
    public final Set<Scope> f32638b;

    /* renamed from: c */
    public final Set<Scope> f32639c;

    /* renamed from: d */
    public final Map<C1897k3<?>, xz1> f32640d;

    /* renamed from: e */
    public final int f32641e;
    @Nullable

    /* renamed from: f */
    public final View f32642f;

    /* renamed from: g */
    public final String f32643g;

    /* renamed from: h */
    public final String f32644h;

    /* renamed from: i */
    public final xc1 f32645i;

    /* renamed from: j */
    public Integer f32646j;

    /* renamed from: com.daaw.xf$a */
    /* loaded from: classes.dex */
    public static final class C3537a {
        @Nullable

        /* renamed from: a */
        public Account f32647a;

        /* renamed from: b */
        public C1798j6<Scope> f32648b;

        /* renamed from: c */
        public String f32649c;

        /* renamed from: d */
        public String f32650d;

        /* renamed from: e */
        public xc1 f32651e = xc1.f32346k;

        /* renamed from: a */
        public C3536xf m5158a() {
            return new C3536xf(this.f32647a, this.f32648b, null, 0, null, this.f32649c, this.f32650d, this.f32651e, false);
        }

        /* renamed from: b */
        public C3537a m5157b(String str) {
            this.f32649c = str;
            return this;
        }

        /* renamed from: c */
        public final C3537a m5156c(Collection<Scope> collection) {
            if (this.f32648b == null) {
                this.f32648b = new C1798j6<>();
            }
            this.f32648b.addAll(collection);
            return this;
        }

        /* renamed from: d */
        public final C3537a m5155d(@Nullable Account account) {
            this.f32647a = account;
            return this;
        }

        /* renamed from: e */
        public final C3537a m5154e(String str) {
            this.f32650d = str;
            return this;
        }
    }

    public C3536xf(@Nullable Account account, Set<Scope> set, Map<C1897k3<?>, xz1> map, int i, @Nullable View view, String str, String str2, @Nullable xc1 xc1Var, boolean z) {
        this.f32637a = account;
        Set<Scope> emptySet = set == null ? Collections.emptySet() : Collections.unmodifiableSet(set);
        this.f32638b = emptySet;
        map = map == null ? Collections.emptyMap() : map;
        this.f32640d = map;
        this.f32642f = view;
        this.f32641e = i;
        this.f32643g = str;
        this.f32644h = str2;
        this.f32645i = xc1Var == null ? xc1.f32346k : xc1Var;
        HashSet hashSet = new HashSet(emptySet);
        for (xz1 xz1Var : map.values()) {
            hashSet.addAll(xz1Var.f33124a);
        }
        this.f32639c = Collections.unmodifiableSet(hashSet);
    }

    /* renamed from: a */
    public Account m5167a() {
        return this.f32637a;
    }

    /* renamed from: b */
    public Account m5166b() {
        Account account = this.f32637a;
        return account != null ? account : new Account(AbstractC2527pa.DEFAULT_ACCOUNT, "com.google");
    }

    /* renamed from: c */
    public Set<Scope> m5165c() {
        return this.f32639c;
    }

    /* renamed from: d */
    public String m5164d() {
        return this.f32643g;
    }

    /* renamed from: e */
    public Set<Scope> m5163e() {
        return this.f32638b;
    }

    /* renamed from: f */
    public final xc1 m5162f() {
        return this.f32645i;
    }

    /* renamed from: g */
    public final Integer m5161g() {
        return this.f32646j;
    }

    /* renamed from: h */
    public final String m5160h() {
        return this.f32644h;
    }

    /* renamed from: i */
    public final void m5159i(Integer num) {
        this.f32646j = num;
    }
}
