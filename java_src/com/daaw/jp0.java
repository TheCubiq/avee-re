package com.daaw;

import android.content.Context;
import android.content.Intent;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.view.ActionProvider;
import android.view.CollapsibleActionView;
import android.view.ContextMenu;
import android.view.MenuItem;
import android.view.SubMenu;
import android.view.View;
import android.widget.FrameLayout;
import com.daaw.AbstractC2388o0;
import java.lang.reflect.Method;
/* loaded from: classes.dex */
public class jp0 extends AbstractC3320va implements MenuItem {

    /* renamed from: d */
    public final hi1 f15293d;

    /* renamed from: e */
    public Method f15294e;

    /* renamed from: com.daaw.jp0$a */
    /* loaded from: classes.dex */
    public class C1850a extends AbstractC2388o0 {

        /* renamed from: d */
        public final ActionProvider f15295d;

        public C1850a(Context context, ActionProvider actionProvider) {
            super(context);
            this.f15295d = actionProvider;
        }

        @Override // com.daaw.AbstractC2388o0
        /* renamed from: a */
        public boolean mo14671a() {
            return this.f15295d.hasSubMenu();
        }

        @Override // com.daaw.AbstractC2388o0
        /* renamed from: c */
        public View mo14669c() {
            return this.f15295d.onCreateActionView();
        }

        @Override // com.daaw.AbstractC2388o0
        /* renamed from: e */
        public boolean mo14667e() {
            return this.f15295d.onPerformDefaultAction();
        }

        @Override // com.daaw.AbstractC2388o0
        /* renamed from: f */
        public void mo14666f(SubMenu subMenu) {
            this.f15295d.onPrepareSubMenu(jp0.this.m7308d(subMenu));
        }
    }

    /* renamed from: com.daaw.jp0$b */
    /* loaded from: classes.dex */
    public class ActionProvider$VisibilityListenerC1851b extends C1850a implements ActionProvider.VisibilityListener {

        /* renamed from: f */
        public AbstractC2388o0.InterfaceC2390b f15297f;

        public ActionProvider$VisibilityListenerC1851b(Context context, ActionProvider actionProvider) {
            super(context, actionProvider);
        }

        @Override // com.daaw.AbstractC2388o0
        /* renamed from: b */
        public boolean mo14670b() {
            return this.f15295d.isVisible();
        }

        @Override // com.daaw.AbstractC2388o0
        /* renamed from: d */
        public View mo14668d(MenuItem menuItem) {
            return this.f15295d.onCreateActionView(menuItem);
        }

        @Override // com.daaw.AbstractC2388o0
        /* renamed from: g */
        public boolean mo14665g() {
            return this.f15295d.overridesItemVisibility();
        }

        @Override // com.daaw.AbstractC2388o0
        /* renamed from: j */
        public void mo14662j(AbstractC2388o0.InterfaceC2390b interfaceC2390b) {
            this.f15297f = interfaceC2390b;
            this.f15295d.setVisibilityListener(interfaceC2390b != null ? this : null);
        }

        @Override // android.view.ActionProvider.VisibilityListener
        public void onActionProviderVisibilityChanged(boolean z) {
            AbstractC2388o0.InterfaceC2390b interfaceC2390b = this.f15297f;
            if (interfaceC2390b != null) {
                interfaceC2390b.onActionProviderVisibilityChanged(z);
            }
        }
    }

    /* renamed from: com.daaw.jp0$c */
    /* loaded from: classes.dex */
    public static class C1852c extends FrameLayout implements InterfaceC1278fg {

        /* renamed from: p */
        public final CollapsibleActionView f15299p;

        public C1852c(View view) {
            super(view.getContext());
            this.f15299p = (CollapsibleActionView) view;
            addView(view);
        }

        /* renamed from: a */
        public View m18348a() {
            return (View) this.f15299p;
        }

        @Override // com.daaw.InterfaceC1278fg
        /* renamed from: c */
        public void mo18347c() {
            this.f15299p.onActionViewExpanded();
        }

        @Override // com.daaw.InterfaceC1278fg
        /* renamed from: f */
        public void mo18346f() {
            this.f15299p.onActionViewCollapsed();
        }
    }

    /* renamed from: com.daaw.jp0$d */
    /* loaded from: classes.dex */
    public class MenuItem$OnActionExpandListenerC1853d implements MenuItem.OnActionExpandListener {

        /* renamed from: a */
        public final MenuItem.OnActionExpandListener f15300a;

        public MenuItem$OnActionExpandListenerC1853d(MenuItem.OnActionExpandListener onActionExpandListener) {
            this.f15300a = onActionExpandListener;
        }

        @Override // android.view.MenuItem.OnActionExpandListener
        public boolean onMenuItemActionCollapse(MenuItem menuItem) {
            return this.f15300a.onMenuItemActionCollapse(jp0.this.m7309c(menuItem));
        }

        @Override // android.view.MenuItem.OnActionExpandListener
        public boolean onMenuItemActionExpand(MenuItem menuItem) {
            return this.f15300a.onMenuItemActionExpand(jp0.this.m7309c(menuItem));
        }
    }

    /* renamed from: com.daaw.jp0$e */
    /* loaded from: classes.dex */
    public class MenuItem$OnMenuItemClickListenerC1854e implements MenuItem.OnMenuItemClickListener {

        /* renamed from: a */
        public final MenuItem.OnMenuItemClickListener f15302a;

        public MenuItem$OnMenuItemClickListenerC1854e(MenuItem.OnMenuItemClickListener onMenuItemClickListener) {
            this.f15302a = onMenuItemClickListener;
        }

        @Override // android.view.MenuItem.OnMenuItemClickListener
        public boolean onMenuItemClick(MenuItem menuItem) {
            return this.f15302a.onMenuItemClick(jp0.this.m7309c(menuItem));
        }
    }

    public jp0(Context context, hi1 hi1Var) {
        super(context);
        if (hi1Var == null) {
            throw new IllegalArgumentException("Wrapped Object can not be null.");
        }
        this.f15293d = hi1Var;
    }

    @Override // android.view.MenuItem
    public boolean collapseActionView() {
        return this.f15293d.collapseActionView();
    }

    @Override // android.view.MenuItem
    public boolean expandActionView() {
        return this.f15293d.expandActionView();
    }

    @Override // android.view.MenuItem
    public ActionProvider getActionProvider() {
        AbstractC2388o0 mo16345a = this.f15293d.mo16345a();
        if (mo16345a instanceof C1850a) {
            return ((C1850a) mo16345a).f15295d;
        }
        return null;
    }

    @Override // android.view.MenuItem
    public View getActionView() {
        View actionView = this.f15293d.getActionView();
        return actionView instanceof C1852c ? ((C1852c) actionView).m18348a() : actionView;
    }

    @Override // android.view.MenuItem
    public int getAlphabeticModifiers() {
        return this.f15293d.getAlphabeticModifiers();
    }

    @Override // android.view.MenuItem
    public char getAlphabeticShortcut() {
        return this.f15293d.getAlphabeticShortcut();
    }

    @Override // android.view.MenuItem
    public CharSequence getContentDescription() {
        return this.f15293d.getContentDescription();
    }

    @Override // android.view.MenuItem
    public int getGroupId() {
        return this.f15293d.getGroupId();
    }

    @Override // android.view.MenuItem
    public Drawable getIcon() {
        return this.f15293d.getIcon();
    }

    @Override // android.view.MenuItem
    public ColorStateList getIconTintList() {
        return this.f15293d.getIconTintList();
    }

    @Override // android.view.MenuItem
    public PorterDuff.Mode getIconTintMode() {
        return this.f15293d.getIconTintMode();
    }

    @Override // android.view.MenuItem
    public Intent getIntent() {
        return this.f15293d.getIntent();
    }

    @Override // android.view.MenuItem
    public int getItemId() {
        return this.f15293d.getItemId();
    }

    @Override // android.view.MenuItem
    public ContextMenu.ContextMenuInfo getMenuInfo() {
        return this.f15293d.getMenuInfo();
    }

    @Override // android.view.MenuItem
    public int getNumericModifiers() {
        return this.f15293d.getNumericModifiers();
    }

    @Override // android.view.MenuItem
    public char getNumericShortcut() {
        return this.f15293d.getNumericShortcut();
    }

    @Override // android.view.MenuItem
    public int getOrder() {
        return this.f15293d.getOrder();
    }

    @Override // android.view.MenuItem
    public SubMenu getSubMenu() {
        return m7308d(this.f15293d.getSubMenu());
    }

    @Override // android.view.MenuItem
    public CharSequence getTitle() {
        return this.f15293d.getTitle();
    }

    @Override // android.view.MenuItem
    public CharSequence getTitleCondensed() {
        return this.f15293d.getTitleCondensed();
    }

    @Override // android.view.MenuItem
    public CharSequence getTooltipText() {
        return this.f15293d.getTooltipText();
    }

    /* renamed from: h */
    public void m18349h(boolean z) {
        try {
            if (this.f15294e == null) {
                this.f15294e = this.f15293d.getClass().getDeclaredMethod("setExclusiveCheckable", Boolean.TYPE);
            }
            this.f15294e.invoke(this.f15293d, Boolean.valueOf(z));
        } catch (Exception unused) {
        }
    }

    @Override // android.view.MenuItem
    public boolean hasSubMenu() {
        return this.f15293d.hasSubMenu();
    }

    @Override // android.view.MenuItem
    public boolean isActionViewExpanded() {
        return this.f15293d.isActionViewExpanded();
    }

    @Override // android.view.MenuItem
    public boolean isCheckable() {
        return this.f15293d.isCheckable();
    }

    @Override // android.view.MenuItem
    public boolean isChecked() {
        return this.f15293d.isChecked();
    }

    @Override // android.view.MenuItem
    public boolean isEnabled() {
        return this.f15293d.isEnabled();
    }

    @Override // android.view.MenuItem
    public boolean isVisible() {
        return this.f15293d.isVisible();
    }

    @Override // android.view.MenuItem
    public MenuItem setActionProvider(ActionProvider actionProvider) {
        ActionProvider$VisibilityListenerC1851b actionProvider$VisibilityListenerC1851b = new ActionProvider$VisibilityListenerC1851b(this.f30067a, actionProvider);
        hi1 hi1Var = this.f15293d;
        if (actionProvider == null) {
            actionProvider$VisibilityListenerC1851b = null;
        }
        hi1Var.mo16344b(actionProvider$VisibilityListenerC1851b);
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setActionView(int i) {
        this.f15293d.setActionView(i);
        View actionView = this.f15293d.getActionView();
        if (actionView instanceof CollapsibleActionView) {
            this.f15293d.setActionView(new C1852c(actionView));
        }
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setActionView(View view) {
        if (view instanceof CollapsibleActionView) {
            view = new C1852c(view);
        }
        this.f15293d.setActionView(view);
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setAlphabeticShortcut(char c) {
        this.f15293d.setAlphabeticShortcut(c);
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setAlphabeticShortcut(char c, int i) {
        this.f15293d.setAlphabeticShortcut(c, i);
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setCheckable(boolean z) {
        this.f15293d.setCheckable(z);
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setChecked(boolean z) {
        this.f15293d.setChecked(z);
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setContentDescription(CharSequence charSequence) {
        this.f15293d.setContentDescription(charSequence);
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setEnabled(boolean z) {
        this.f15293d.setEnabled(z);
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setIcon(int i) {
        this.f15293d.setIcon(i);
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setIcon(Drawable drawable) {
        this.f15293d.setIcon(drawable);
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setIconTintList(ColorStateList colorStateList) {
        this.f15293d.setIconTintList(colorStateList);
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setIconTintMode(PorterDuff.Mode mode) {
        this.f15293d.setIconTintMode(mode);
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setIntent(Intent intent) {
        this.f15293d.setIntent(intent);
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setNumericShortcut(char c) {
        this.f15293d.setNumericShortcut(c);
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setNumericShortcut(char c, int i) {
        this.f15293d.setNumericShortcut(c, i);
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setOnActionExpandListener(MenuItem.OnActionExpandListener onActionExpandListener) {
        this.f15293d.setOnActionExpandListener(onActionExpandListener != null ? new MenuItem$OnActionExpandListenerC1853d(onActionExpandListener) : null);
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setOnMenuItemClickListener(MenuItem.OnMenuItemClickListener onMenuItemClickListener) {
        this.f15293d.setOnMenuItemClickListener(onMenuItemClickListener != null ? new MenuItem$OnMenuItemClickListenerC1854e(onMenuItemClickListener) : null);
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setShortcut(char c, char c2) {
        this.f15293d.setShortcut(c, c2);
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setShortcut(char c, char c2, int i, int i2) {
        this.f15293d.setShortcut(c, c2, i, i2);
        return this;
    }

    @Override // android.view.MenuItem
    public void setShowAsAction(int i) {
        this.f15293d.setShowAsAction(i);
    }

    @Override // android.view.MenuItem
    public MenuItem setShowAsActionFlags(int i) {
        this.f15293d.setShowAsActionFlags(i);
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setTitle(int i) {
        this.f15293d.setTitle(i);
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setTitle(CharSequence charSequence) {
        this.f15293d.setTitle(charSequence);
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setTitleCondensed(CharSequence charSequence) {
        this.f15293d.setTitleCondensed(charSequence);
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setTooltipText(CharSequence charSequence) {
        this.f15293d.setTooltipText(charSequence);
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setVisible(boolean z) {
        return this.f15293d.setVisible(z);
    }
}
