package com.daaw;

import android.content.Context;
import android.view.ActionMode;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import com.daaw.AbstractC2228n0;
import java.util.ArrayList;
/* loaded from: classes.dex */
public class di1 extends ActionMode {

    /* renamed from: a */
    public final Context f7123a;

    /* renamed from: b */
    public final AbstractC2228n0 f7124b;

    /* renamed from: com.daaw.di1$a */
    /* loaded from: classes.dex */
    public static class C1089a implements AbstractC2228n0.InterfaceC2229a {

        /* renamed from: a */
        public final ActionMode.Callback f7125a;

        /* renamed from: b */
        public final Context f7126b;

        /* renamed from: c */
        public final ArrayList<di1> f7127c = new ArrayList<>();

        /* renamed from: d */
        public final cd1<Menu, Menu> f7128d = new cd1<>();

        public C1089a(Context context, ActionMode.Callback callback) {
            this.f7126b = context;
            this.f7125a = callback;
        }

        @Override // com.daaw.AbstractC2228n0.InterfaceC2229a
        /* renamed from: a */
        public boolean mo15631a(AbstractC2228n0 abstractC2228n0, Menu menu) {
            return this.f7125a.onPrepareActionMode(m24363e(abstractC2228n0), m24362f(menu));
        }

        @Override // com.daaw.AbstractC2228n0.InterfaceC2229a
        /* renamed from: b */
        public boolean mo15630b(AbstractC2228n0 abstractC2228n0, Menu menu) {
            return this.f7125a.onCreateActionMode(m24363e(abstractC2228n0), m24362f(menu));
        }

        @Override // com.daaw.AbstractC2228n0.InterfaceC2229a
        /* renamed from: c */
        public void mo15629c(AbstractC2228n0 abstractC2228n0) {
            this.f7125a.onDestroyActionMode(m24363e(abstractC2228n0));
        }

        @Override // com.daaw.AbstractC2228n0.InterfaceC2229a
        /* renamed from: d */
        public boolean mo15628d(AbstractC2228n0 abstractC2228n0, MenuItem menuItem) {
            return this.f7125a.onActionItemClicked(m24363e(abstractC2228n0), new jp0(this.f7126b, (hi1) menuItem));
        }

        /* renamed from: e */
        public ActionMode m24363e(AbstractC2228n0 abstractC2228n0) {
            int size = this.f7127c.size();
            for (int i = 0; i < size; i++) {
                di1 di1Var = this.f7127c.get(i);
                if (di1Var != null && di1Var.f7124b == abstractC2228n0) {
                    return di1Var;
                }
            }
            di1 di1Var2 = new di1(this.f7126b, abstractC2228n0);
            this.f7127c.add(di1Var2);
            return di1Var2;
        }

        /* renamed from: f */
        public final Menu m24362f(Menu menu) {
            Menu menu2 = this.f7128d.get(menu);
            if (menu2 == null) {
                np0 np0Var = new np0(this.f7126b, (fi1) menu);
                this.f7128d.put(menu, np0Var);
                return np0Var;
            }
            return menu2;
        }
    }

    public di1(Context context, AbstractC2228n0 abstractC2228n0) {
        this.f7123a = context;
        this.f7124b = abstractC2228n0;
    }

    @Override // android.view.ActionMode
    public void finish() {
        this.f7124b.mo15648c();
    }

    @Override // android.view.ActionMode
    public View getCustomView() {
        return this.f7124b.mo15647d();
    }

    @Override // android.view.ActionMode
    public Menu getMenu() {
        return new np0(this.f7123a, (fi1) this.f7124b.mo15646e());
    }

    @Override // android.view.ActionMode
    public MenuInflater getMenuInflater() {
        return this.f7124b.mo15645f();
    }

    @Override // android.view.ActionMode
    public CharSequence getSubtitle() {
        return this.f7124b.mo15644g();
    }

    @Override // android.view.ActionMode
    public Object getTag() {
        return this.f7124b.m15643h();
    }

    @Override // android.view.ActionMode
    public CharSequence getTitle() {
        return this.f7124b.mo15642i();
    }

    @Override // android.view.ActionMode
    public boolean getTitleOptionalHint() {
        return this.f7124b.m15641j();
    }

    @Override // android.view.ActionMode
    public void invalidate() {
        this.f7124b.mo15640k();
    }

    @Override // android.view.ActionMode
    public boolean isTitleOptional() {
        return this.f7124b.mo15639l();
    }

    @Override // android.view.ActionMode
    public void setCustomView(View view) {
        this.f7124b.mo15638m(view);
    }

    @Override // android.view.ActionMode
    public void setSubtitle(int i) {
        this.f7124b.mo15637n(i);
    }

    @Override // android.view.ActionMode
    public void setSubtitle(CharSequence charSequence) {
        this.f7124b.mo15636o(charSequence);
    }

    @Override // android.view.ActionMode
    public void setTag(Object obj) {
        this.f7124b.m15635p(obj);
    }

    @Override // android.view.ActionMode
    public void setTitle(int i) {
        this.f7124b.mo15634q(i);
    }

    @Override // android.view.ActionMode
    public void setTitle(CharSequence charSequence) {
        this.f7124b.mo15633r(charSequence);
    }

    @Override // android.view.ActionMode
    public void setTitleOptionalHint(boolean z) {
        this.f7124b.mo15632s(z);
    }
}
