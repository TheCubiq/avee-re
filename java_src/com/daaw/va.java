package com.daaw;

import android.content.Context;
import android.view.MenuItem;
import android.view.SubMenu;
/* loaded from: classes.dex */
public abstract class va {
    public final Context a;
    public cd1<hi1, MenuItem> b;
    public cd1<oi1, SubMenu> c;

    public va(Context context) {
        this.a = context;
    }

    public final MenuItem c(MenuItem menuItem) {
        if (menuItem instanceof hi1) {
            hi1 hi1Var = (hi1) menuItem;
            if (this.b == null) {
                this.b = new cd1<>();
            }
            MenuItem menuItem2 = this.b.get(hi1Var);
            if (menuItem2 == null) {
                jp0 jp0Var = new jp0(this.a, hi1Var);
                this.b.put(hi1Var, jp0Var);
                return jp0Var;
            }
            return menuItem2;
        }
        return menuItem;
    }

    public final SubMenu d(SubMenu subMenu) {
        if (subMenu instanceof oi1) {
            oi1 oi1Var = (oi1) subMenu;
            if (this.c == null) {
                this.c = new cd1<>();
            }
            SubMenu subMenu2 = this.c.get(oi1Var);
            if (subMenu2 == null) {
                ph1 ph1Var = new ph1(this.a, oi1Var);
                this.c.put(oi1Var, ph1Var);
                return ph1Var;
            }
            return subMenu2;
        }
        return subMenu;
    }

    public final void e() {
        cd1<hi1, MenuItem> cd1Var = this.b;
        if (cd1Var != null) {
            cd1Var.clear();
        }
        cd1<oi1, SubMenu> cd1Var2 = this.c;
        if (cd1Var2 != null) {
            cd1Var2.clear();
        }
    }

    public final void f(int i) {
        if (this.b == null) {
            return;
        }
        int i2 = 0;
        while (i2 < this.b.size()) {
            if (this.b.i(i2).getGroupId() == i) {
                this.b.k(i2);
                i2--;
            }
            i2++;
        }
    }

    public final void g(int i) {
        if (this.b == null) {
            return;
        }
        for (int i2 = 0; i2 < this.b.size(); i2++) {
            if (this.b.i(i2).getItemId() == i) {
                this.b.k(i2);
                return;
            }
        }
    }
}
