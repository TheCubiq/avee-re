package com.daaw;

import android.content.Context;
import android.content.Intent;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.view.ActionProvider;
import android.view.ContextMenu;
import android.view.KeyEvent;
import android.view.MenuItem;
import android.view.SubMenu;
import android.view.View;
/* renamed from: com.daaw.m0 */
/* loaded from: classes.dex */
public class C2140m0 implements hi1 {

    /* renamed from: a */
    public final int f17934a;

    /* renamed from: b */
    public final int f17935b;

    /* renamed from: c */
    public final int f17936c;

    /* renamed from: d */
    public CharSequence f17937d;

    /* renamed from: e */
    public CharSequence f17938e;

    /* renamed from: f */
    public Intent f17939f;

    /* renamed from: g */
    public char f17940g;

    /* renamed from: i */
    public char f17942i;

    /* renamed from: k */
    public Drawable f17944k;

    /* renamed from: l */
    public Context f17945l;

    /* renamed from: m */
    public MenuItem.OnMenuItemClickListener f17946m;

    /* renamed from: n */
    public CharSequence f17947n;

    /* renamed from: o */
    public CharSequence f17948o;

    /* renamed from: h */
    public int f17941h = 4096;

    /* renamed from: j */
    public int f17943j = 4096;

    /* renamed from: p */
    public ColorStateList f17949p = null;

    /* renamed from: q */
    public PorterDuff.Mode f17950q = null;

    /* renamed from: r */
    public boolean f17951r = false;

    /* renamed from: s */
    public boolean f17952s = false;

    /* renamed from: t */
    public int f17953t = 16;

    public C2140m0(Context context, int i, int i2, int i3, int i4, CharSequence charSequence) {
        this.f17945l = context;
        this.f17934a = i2;
        this.f17935b = i;
        this.f17936c = i4;
        this.f17937d = charSequence;
    }

    @Override // com.daaw.hi1
    /* renamed from: a */
    public AbstractC2388o0 mo16345a() {
        return null;
    }

    @Override // com.daaw.hi1
    /* renamed from: b */
    public hi1 mo16344b(AbstractC2388o0 abstractC2388o0) {
        throw new UnsupportedOperationException();
    }

    /* renamed from: c */
    public final void m16343c() {
        Drawable drawable = this.f17944k;
        if (drawable != null) {
            if (this.f17951r || this.f17952s) {
                Drawable m14809r = C2366nu.m14809r(drawable);
                this.f17944k = m14809r;
                Drawable mutate = m14809r.mutate();
                this.f17944k = mutate;
                if (this.f17951r) {
                    C2366nu.m14812o(mutate, this.f17949p);
                }
                if (this.f17952s) {
                    C2366nu.m14811p(this.f17944k, this.f17950q);
                }
            }
        }
    }

    @Override // com.daaw.hi1, android.view.MenuItem
    public boolean collapseActionView() {
        return false;
    }

    @Override // com.daaw.hi1, android.view.MenuItem
    /* renamed from: d */
    public hi1 setActionView(int i) {
        throw new UnsupportedOperationException();
    }

    @Override // com.daaw.hi1, android.view.MenuItem
    /* renamed from: e */
    public hi1 setActionView(View view) {
        throw new UnsupportedOperationException();
    }

    @Override // com.daaw.hi1, android.view.MenuItem
    public boolean expandActionView() {
        return false;
    }

    @Override // com.daaw.hi1, android.view.MenuItem
    /* renamed from: f */
    public hi1 setShowAsActionFlags(int i) {
        setShowAsAction(i);
        return this;
    }

    @Override // android.view.MenuItem
    public ActionProvider getActionProvider() {
        throw new UnsupportedOperationException();
    }

    @Override // com.daaw.hi1, android.view.MenuItem
    public View getActionView() {
        return null;
    }

    @Override // com.daaw.hi1, android.view.MenuItem
    public int getAlphabeticModifiers() {
        return this.f17943j;
    }

    @Override // android.view.MenuItem
    public char getAlphabeticShortcut() {
        return this.f17942i;
    }

    @Override // com.daaw.hi1, android.view.MenuItem
    public CharSequence getContentDescription() {
        return this.f17947n;
    }

    @Override // android.view.MenuItem
    public int getGroupId() {
        return this.f17935b;
    }

    @Override // android.view.MenuItem
    public Drawable getIcon() {
        return this.f17944k;
    }

    @Override // com.daaw.hi1, android.view.MenuItem
    public ColorStateList getIconTintList() {
        return this.f17949p;
    }

    @Override // com.daaw.hi1, android.view.MenuItem
    public PorterDuff.Mode getIconTintMode() {
        return this.f17950q;
    }

    @Override // android.view.MenuItem
    public Intent getIntent() {
        return this.f17939f;
    }

    @Override // android.view.MenuItem
    public int getItemId() {
        return this.f17934a;
    }

    @Override // android.view.MenuItem
    public ContextMenu.ContextMenuInfo getMenuInfo() {
        return null;
    }

    @Override // com.daaw.hi1, android.view.MenuItem
    public int getNumericModifiers() {
        return this.f17941h;
    }

    @Override // android.view.MenuItem
    public char getNumericShortcut() {
        return this.f17940g;
    }

    @Override // android.view.MenuItem
    public int getOrder() {
        return this.f17936c;
    }

    @Override // android.view.MenuItem
    public SubMenu getSubMenu() {
        return null;
    }

    @Override // android.view.MenuItem
    public CharSequence getTitle() {
        return this.f17937d;
    }

    @Override // android.view.MenuItem
    public CharSequence getTitleCondensed() {
        CharSequence charSequence = this.f17938e;
        return charSequence != null ? charSequence : this.f17937d;
    }

    @Override // com.daaw.hi1, android.view.MenuItem
    public CharSequence getTooltipText() {
        return this.f17948o;
    }

    @Override // android.view.MenuItem
    public boolean hasSubMenu() {
        return false;
    }

    @Override // com.daaw.hi1, android.view.MenuItem
    public boolean isActionViewExpanded() {
        return false;
    }

    @Override // android.view.MenuItem
    public boolean isCheckable() {
        return (this.f17953t & 1) != 0;
    }

    @Override // android.view.MenuItem
    public boolean isChecked() {
        return (this.f17953t & 2) != 0;
    }

    @Override // android.view.MenuItem
    public boolean isEnabled() {
        return (this.f17953t & 16) != 0;
    }

    @Override // android.view.MenuItem
    public boolean isVisible() {
        return (this.f17953t & 8) == 0;
    }

    @Override // android.view.MenuItem
    public MenuItem setActionProvider(ActionProvider actionProvider) {
        throw new UnsupportedOperationException();
    }

    @Override // android.view.MenuItem
    public MenuItem setAlphabeticShortcut(char c) {
        this.f17942i = Character.toLowerCase(c);
        return this;
    }

    @Override // com.daaw.hi1, android.view.MenuItem
    public MenuItem setAlphabeticShortcut(char c, int i) {
        this.f17942i = Character.toLowerCase(c);
        this.f17943j = KeyEvent.normalizeMetaState(i);
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setCheckable(boolean z) {
        this.f17953t = (z ? 1 : 0) | (this.f17953t & (-2));
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setChecked(boolean z) {
        this.f17953t = (z ? 2 : 0) | (this.f17953t & (-3));
        return this;
    }

    @Override // android.view.MenuItem
    public hi1 setContentDescription(CharSequence charSequence) {
        this.f17947n = charSequence;
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setEnabled(boolean z) {
        this.f17953t = (z ? 16 : 0) | (this.f17953t & (-17));
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setIcon(int i) {
        this.f17944k = C3866zk.m2178e(this.f17945l, i);
        m16343c();
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setIcon(Drawable drawable) {
        this.f17944k = drawable;
        m16343c();
        return this;
    }

    @Override // com.daaw.hi1, android.view.MenuItem
    public MenuItem setIconTintList(ColorStateList colorStateList) {
        this.f17949p = colorStateList;
        this.f17951r = true;
        m16343c();
        return this;
    }

    @Override // com.daaw.hi1, android.view.MenuItem
    public MenuItem setIconTintMode(PorterDuff.Mode mode) {
        this.f17950q = mode;
        this.f17952s = true;
        m16343c();
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setIntent(Intent intent) {
        this.f17939f = intent;
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setNumericShortcut(char c) {
        this.f17940g = c;
        return this;
    }

    @Override // com.daaw.hi1, android.view.MenuItem
    public MenuItem setNumericShortcut(char c, int i) {
        this.f17940g = c;
        this.f17941h = KeyEvent.normalizeMetaState(i);
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setOnActionExpandListener(MenuItem.OnActionExpandListener onActionExpandListener) {
        throw new UnsupportedOperationException();
    }

    @Override // android.view.MenuItem
    public MenuItem setOnMenuItemClickListener(MenuItem.OnMenuItemClickListener onMenuItemClickListener) {
        this.f17946m = onMenuItemClickListener;
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setShortcut(char c, char c2) {
        this.f17940g = c;
        this.f17942i = Character.toLowerCase(c2);
        return this;
    }

    @Override // com.daaw.hi1, android.view.MenuItem
    public MenuItem setShortcut(char c, char c2, int i, int i2) {
        this.f17940g = c;
        this.f17941h = KeyEvent.normalizeMetaState(i);
        this.f17942i = Character.toLowerCase(c2);
        this.f17943j = KeyEvent.normalizeMetaState(i2);
        return this;
    }

    @Override // com.daaw.hi1, android.view.MenuItem
    public void setShowAsAction(int i) {
    }

    @Override // android.view.MenuItem
    public MenuItem setTitle(int i) {
        this.f17937d = this.f17945l.getResources().getString(i);
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setTitle(CharSequence charSequence) {
        this.f17937d = charSequence;
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setTitleCondensed(CharSequence charSequence) {
        this.f17938e = charSequence;
        return this;
    }

    @Override // android.view.MenuItem
    public hi1 setTooltipText(CharSequence charSequence) {
        this.f17948o = charSequence;
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setVisible(boolean z) {
        this.f17953t = (this.f17953t & 8) | (z ? 0 : 8);
        return this;
    }
}
