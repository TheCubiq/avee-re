package com.daaw;

import android.content.Context;
import android.view.MenuItem;
import android.view.SubMenu;
/* renamed from: com.daaw.va */
/* loaded from: classes.dex */
public abstract class AbstractC3320va {

    /* renamed from: a */
    public final Context f30067a;

    /* renamed from: b */
    public cd1<hi1, MenuItem> f30068b;

    /* renamed from: c */
    public cd1<oi1, SubMenu> f30069c;

    public AbstractC3320va(Context context) {
        this.f30067a = context;
    }

    /* renamed from: c */
    public final MenuItem m7309c(MenuItem menuItem) {
        if (menuItem instanceof hi1) {
            hi1 hi1Var = (hi1) menuItem;
            if (this.f30068b == null) {
                this.f30068b = new cd1<>();
            }
            MenuItem menuItem2 = this.f30068b.get(hi1Var);
            if (menuItem2 == null) {
                jp0 jp0Var = new jp0(this.f30067a, hi1Var);
                this.f30068b.put(hi1Var, jp0Var);
                return jp0Var;
            }
            return menuItem2;
        }
        return menuItem;
    }

    /* renamed from: d */
    public final SubMenu m7308d(SubMenu subMenu) {
        if (subMenu instanceof oi1) {
            oi1 oi1Var = (oi1) subMenu;
            if (this.f30069c == null) {
                this.f30069c = new cd1<>();
            }
            SubMenu subMenu2 = this.f30069c.get(oi1Var);
            if (subMenu2 == null) {
                ph1 ph1Var = new ph1(this.f30067a, oi1Var);
                this.f30069c.put(oi1Var, ph1Var);
                return ph1Var;
            }
            return subMenu2;
        }
        return subMenu;
    }

    /* renamed from: e */
    public final void m7307e() {
        cd1<hi1, MenuItem> cd1Var = this.f30068b;
        if (cd1Var != null) {
            cd1Var.clear();
        }
        cd1<oi1, SubMenu> cd1Var2 = this.f30069c;
        if (cd1Var2 != null) {
            cd1Var2.clear();
        }
    }

    /* renamed from: f */
    public final void m7306f(int i) {
        if (this.f30068b == null) {
            return;
        }
        int i2 = 0;
        while (i2 < this.f30068b.size()) {
            if (this.f30068b.m25436i(i2).getGroupId() == i) {
                this.f30068b.m25434k(i2);
                i2--;
            }
            i2++;
        }
    }

    /* renamed from: g */
    public final void m7305g(int i) {
        if (this.f30068b == null) {
            return;
        }
        for (int i2 = 0; i2 < this.f30068b.size(); i2++) {
            if (this.f30068b.m25436i(i2).getItemId() == i) {
                this.f30068b.m25434k(i2);
                return;
            }
        }
    }
}
