package com.daaw;

import android.content.Context;
import android.view.ActionMode;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import com.daaw.n0;
import java.util.ArrayList;
/* loaded from: classes.dex */
public class di1 extends ActionMode {
    public final Context a;
    public final n0 b;

    /* loaded from: classes.dex */
    public static class a implements n0.a {
        public final ActionMode.Callback a;
        public final Context b;
        public final ArrayList<di1> c = new ArrayList<>();
        public final cd1<Menu, Menu> d = new cd1<>();

        public a(Context context, ActionMode.Callback callback) {
            this.b = context;
            this.a = callback;
        }

        @Override // com.daaw.n0.a
        public boolean a(n0 n0Var, Menu menu) {
            return this.a.onPrepareActionMode(e(n0Var), f(menu));
        }

        @Override // com.daaw.n0.a
        public boolean b(n0 n0Var, Menu menu) {
            return this.a.onCreateActionMode(e(n0Var), f(menu));
        }

        @Override // com.daaw.n0.a
        public void c(n0 n0Var) {
            this.a.onDestroyActionMode(e(n0Var));
        }

        @Override // com.daaw.n0.a
        public boolean d(n0 n0Var, MenuItem menuItem) {
            return this.a.onActionItemClicked(e(n0Var), new jp0(this.b, (hi1) menuItem));
        }

        public ActionMode e(n0 n0Var) {
            int size = this.c.size();
            for (int i = 0; i < size; i++) {
                di1 di1Var = this.c.get(i);
                if (di1Var != null && di1Var.b == n0Var) {
                    return di1Var;
                }
            }
            di1 di1Var2 = new di1(this.b, n0Var);
            this.c.add(di1Var2);
            return di1Var2;
        }

        public final Menu f(Menu menu) {
            Menu menu2 = this.d.get(menu);
            if (menu2 == null) {
                np0 np0Var = new np0(this.b, (fi1) menu);
                this.d.put(menu, np0Var);
                return np0Var;
            }
            return menu2;
        }
    }

    public di1(Context context, n0 n0Var) {
        this.a = context;
        this.b = n0Var;
    }

    @Override // android.view.ActionMode
    public void finish() {
        this.b.c();
    }

    @Override // android.view.ActionMode
    public View getCustomView() {
        return this.b.d();
    }

    @Override // android.view.ActionMode
    public Menu getMenu() {
        return new np0(this.a, (fi1) this.b.e());
    }

    @Override // android.view.ActionMode
    public MenuInflater getMenuInflater() {
        return this.b.f();
    }

    @Override // android.view.ActionMode
    public CharSequence getSubtitle() {
        return this.b.g();
    }

    @Override // android.view.ActionMode
    public Object getTag() {
        return this.b.h();
    }

    @Override // android.view.ActionMode
    public CharSequence getTitle() {
        return this.b.i();
    }

    @Override // android.view.ActionMode
    public boolean getTitleOptionalHint() {
        return this.b.j();
    }

    @Override // android.view.ActionMode
    public void invalidate() {
        this.b.k();
    }

    @Override // android.view.ActionMode
    public boolean isTitleOptional() {
        return this.b.l();
    }

    @Override // android.view.ActionMode
    public void setCustomView(View view) {
        this.b.m(view);
    }

    @Override // android.view.ActionMode
    public void setSubtitle(int i) {
        this.b.n(i);
    }

    @Override // android.view.ActionMode
    public void setSubtitle(CharSequence charSequence) {
        this.b.o(charSequence);
    }

    @Override // android.view.ActionMode
    public void setTag(Object obj) {
        this.b.p(obj);
    }

    @Override // android.view.ActionMode
    public void setTitle(int i) {
        this.b.q(i);
    }

    @Override // android.view.ActionMode
    public void setTitle(CharSequence charSequence) {
        this.b.r(charSequence);
    }

    @Override // android.view.ActionMode
    public void setTitleOptionalHint(boolean z) {
        this.b.s(z);
    }
}
