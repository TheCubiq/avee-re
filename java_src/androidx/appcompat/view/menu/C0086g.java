package androidx.appcompat.view.menu;

import android.content.ActivityNotFoundException;
import android.content.Context;
import android.content.Intent;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.view.ActionProvider;
import android.view.ContextMenu;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.MenuItem;
import android.view.SubMenu;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewDebug;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import androidx.appcompat.view.menu.InterfaceC0093j;
import com.daaw.AbstractC2388o0;
import com.daaw.C2366nu;
import com.daaw.C2818r4;
import com.daaw.hi1;
import com.daaw.i21;
/* renamed from: androidx.appcompat.view.menu.g */
/* loaded from: classes.dex */
public final class C0086g implements hi1 {

    /* renamed from: A */
    public View f395A;

    /* renamed from: B */
    public AbstractC2388o0 f396B;

    /* renamed from: C */
    public MenuItem.OnActionExpandListener f397C;

    /* renamed from: E */
    public ContextMenu.ContextMenuInfo f399E;

    /* renamed from: a */
    public final int f400a;

    /* renamed from: b */
    public final int f401b;

    /* renamed from: c */
    public final int f402c;

    /* renamed from: d */
    public final int f403d;

    /* renamed from: e */
    public CharSequence f404e;

    /* renamed from: f */
    public CharSequence f405f;

    /* renamed from: g */
    public Intent f406g;

    /* renamed from: h */
    public char f407h;

    /* renamed from: j */
    public char f409j;

    /* renamed from: l */
    public Drawable f411l;

    /* renamed from: n */
    public C0082e f413n;

    /* renamed from: o */
    public SubMenuC0098l f414o;

    /* renamed from: p */
    public Runnable f415p;

    /* renamed from: q */
    public MenuItem.OnMenuItemClickListener f416q;

    /* renamed from: r */
    public CharSequence f417r;

    /* renamed from: s */
    public CharSequence f418s;

    /* renamed from: z */
    public int f425z;

    /* renamed from: i */
    public int f408i = 4096;

    /* renamed from: k */
    public int f410k = 4096;

    /* renamed from: m */
    public int f412m = 0;

    /* renamed from: t */
    public ColorStateList f419t = null;

    /* renamed from: u */
    public PorterDuff.Mode f420u = null;

    /* renamed from: v */
    public boolean f421v = false;

    /* renamed from: w */
    public boolean f422w = false;

    /* renamed from: x */
    public boolean f423x = false;

    /* renamed from: y */
    public int f424y = 16;

    /* renamed from: D */
    public boolean f398D = false;

    /* renamed from: androidx.appcompat.view.menu.g$a */
    /* loaded from: classes.dex */
    public class C0087a implements AbstractC2388o0.InterfaceC2390b {
        public C0087a() {
        }

        @Override // com.daaw.AbstractC2388o0.InterfaceC2390b
        public void onActionProviderVisibilityChanged(boolean z) {
            C0086g c0086g = C0086g.this;
            c0086g.f413n.m30260L(c0086g);
        }
    }

    public C0086g(C0082e c0082e, int i, int i2, int i3, int i4, CharSequence charSequence, int i5) {
        this.f413n = c0082e;
        this.f400a = i2;
        this.f401b = i;
        this.f402c = i3;
        this.f403d = i4;
        this.f404e = charSequence;
        this.f425z = i5;
    }

    /* renamed from: d */
    public static void m30212d(StringBuilder sb, int i, int i2, String str) {
        if ((i & i2) == i2) {
            sb.append(str);
        }
    }

    /* renamed from: A */
    public boolean m30215A() {
        return this.f413n.mo30170J() && m30209g() != 0;
    }

    /* renamed from: B */
    public boolean m30214B() {
        return (this.f425z & 4) == 4;
    }

    @Override // com.daaw.hi1
    /* renamed from: a */
    public AbstractC2388o0 mo16345a() {
        return this.f396B;
    }

    @Override // com.daaw.hi1
    /* renamed from: b */
    public hi1 mo16344b(AbstractC2388o0 abstractC2388o0) {
        AbstractC2388o0 abstractC2388o02 = this.f396B;
        if (abstractC2388o02 != null) {
            abstractC2388o02.m14664h();
        }
        this.f395A = null;
        this.f396B = abstractC2388o0;
        this.f413n.mo24014M(true);
        AbstractC2388o0 abstractC2388o03 = this.f396B;
        if (abstractC2388o03 != null) {
            abstractC2388o03.mo14662j(new C0087a());
        }
        return this;
    }

    /* renamed from: c */
    public void m30213c() {
        this.f413n.m30261K(this);
    }

    @Override // com.daaw.hi1, android.view.MenuItem
    public boolean collapseActionView() {
        if ((this.f425z & 8) == 0) {
            return false;
        }
        if (this.f395A == null) {
            return true;
        }
        MenuItem.OnActionExpandListener onActionExpandListener = this.f397C;
        if (onActionExpandListener == null || onActionExpandListener.onMenuItemActionCollapse(this)) {
            return this.f413n.mo30168f(this);
        }
        return false;
    }

    /* renamed from: e */
    public final Drawable m30211e(Drawable drawable) {
        if (drawable != null && this.f423x && (this.f421v || this.f422w)) {
            drawable = C2366nu.m14809r(drawable).mutate();
            if (this.f421v) {
                C2366nu.m14812o(drawable, this.f419t);
            }
            if (this.f422w) {
                C2366nu.m14811p(drawable, this.f420u);
            }
            this.f423x = false;
        }
        return drawable;
    }

    @Override // com.daaw.hi1, android.view.MenuItem
    public boolean expandActionView() {
        if (m30206j()) {
            MenuItem.OnActionExpandListener onActionExpandListener = this.f397C;
            if (onActionExpandListener == null || onActionExpandListener.onMenuItemActionExpand(this)) {
                return this.f413n.mo30165m(this);
            }
            return false;
        }
        return false;
    }

    /* renamed from: f */
    public int m30210f() {
        return this.f403d;
    }

    /* renamed from: g */
    public char m30209g() {
        return this.f413n.mo30171I() ? this.f409j : this.f407h;
    }

    @Override // android.view.MenuItem
    public ActionProvider getActionProvider() {
        throw new UnsupportedOperationException("This is not supported, use MenuItemCompat.getActionProvider()");
    }

    @Override // com.daaw.hi1, android.view.MenuItem
    public View getActionView() {
        View view = this.f395A;
        if (view != null) {
            return view;
        }
        AbstractC2388o0 abstractC2388o0 = this.f396B;
        if (abstractC2388o0 != null) {
            View mo14668d = abstractC2388o0.mo14668d(this);
            this.f395A = mo14668d;
            return mo14668d;
        }
        return null;
    }

    @Override // com.daaw.hi1, android.view.MenuItem
    public int getAlphabeticModifiers() {
        return this.f410k;
    }

    @Override // android.view.MenuItem
    public char getAlphabeticShortcut() {
        return this.f409j;
    }

    @Override // com.daaw.hi1, android.view.MenuItem
    public CharSequence getContentDescription() {
        return this.f417r;
    }

    @Override // android.view.MenuItem
    public int getGroupId() {
        return this.f401b;
    }

    @Override // android.view.MenuItem
    public Drawable getIcon() {
        Drawable drawable = this.f411l;
        if (drawable != null) {
            return m30211e(drawable);
        }
        if (this.f412m != 0) {
            Drawable m11783b = C2818r4.m11783b(this.f413n.m30221w(), this.f412m);
            this.f412m = 0;
            this.f411l = m11783b;
            return m30211e(m11783b);
        }
        return null;
    }

    @Override // com.daaw.hi1, android.view.MenuItem
    public ColorStateList getIconTintList() {
        return this.f419t;
    }

    @Override // com.daaw.hi1, android.view.MenuItem
    public PorterDuff.Mode getIconTintMode() {
        return this.f420u;
    }

    @Override // android.view.MenuItem
    public Intent getIntent() {
        return this.f406g;
    }

    @Override // android.view.MenuItem
    @ViewDebug.CapturedViewProperty
    public int getItemId() {
        return this.f400a;
    }

    @Override // android.view.MenuItem
    public ContextMenu.ContextMenuInfo getMenuInfo() {
        return this.f399E;
    }

    @Override // com.daaw.hi1, android.view.MenuItem
    public int getNumericModifiers() {
        return this.f408i;
    }

    @Override // android.view.MenuItem
    public char getNumericShortcut() {
        return this.f407h;
    }

    @Override // android.view.MenuItem
    public int getOrder() {
        return this.f402c;
    }

    @Override // android.view.MenuItem
    public SubMenu getSubMenu() {
        return this.f414o;
    }

    @Override // android.view.MenuItem
    @ViewDebug.CapturedViewProperty
    public CharSequence getTitle() {
        return this.f404e;
    }

    @Override // android.view.MenuItem
    public CharSequence getTitleCondensed() {
        CharSequence charSequence = this.f405f;
        return charSequence != null ? charSequence : this.f404e;
    }

    @Override // com.daaw.hi1, android.view.MenuItem
    public CharSequence getTooltipText() {
        return this.f418s;
    }

    /* renamed from: h */
    public String m30208h() {
        int i;
        char m30209g = m30209g();
        if (m30209g == 0) {
            return "";
        }
        Resources resources = this.f413n.m30221w().getResources();
        StringBuilder sb = new StringBuilder();
        if (ViewConfiguration.get(this.f413n.m30221w()).hasPermanentMenuKey()) {
            sb.append(resources.getString(i21.abc_prepend_shortcut_label));
        }
        int i2 = this.f413n.mo30171I() ? this.f410k : this.f408i;
        m30212d(sb, i2, 65536, resources.getString(i21.abc_menu_meta_shortcut_label));
        m30212d(sb, i2, 4096, resources.getString(i21.abc_menu_ctrl_shortcut_label));
        m30212d(sb, i2, 2, resources.getString(i21.abc_menu_alt_shortcut_label));
        m30212d(sb, i2, 1, resources.getString(i21.abc_menu_shift_shortcut_label));
        m30212d(sb, i2, 4, resources.getString(i21.abc_menu_sym_shortcut_label));
        m30212d(sb, i2, 8, resources.getString(i21.abc_menu_function_shortcut_label));
        if (m30209g == '\b') {
            i = i21.abc_menu_delete_shortcut_label;
        } else if (m30209g == '\n') {
            i = i21.abc_menu_enter_shortcut_label;
        } else if (m30209g != ' ') {
            sb.append(m30209g);
            return sb.toString();
        } else {
            i = i21.abc_menu_space_shortcut_label;
        }
        sb.append(resources.getString(i));
        return sb.toString();
    }

    @Override // android.view.MenuItem
    public boolean hasSubMenu() {
        return this.f414o != null;
    }

    /* renamed from: i */
    public CharSequence m30207i(InterfaceC0093j.InterfaceC0094a interfaceC0094a) {
        return (interfaceC0094a == null || !interfaceC0094a.mo349d()) ? getTitle() : getTitleCondensed();
    }

    @Override // com.daaw.hi1, android.view.MenuItem
    public boolean isActionViewExpanded() {
        return this.f398D;
    }

    @Override // android.view.MenuItem
    public boolean isCheckable() {
        return (this.f424y & 1) == 1;
    }

    @Override // android.view.MenuItem
    public boolean isChecked() {
        return (this.f424y & 2) == 2;
    }

    @Override // android.view.MenuItem
    public boolean isEnabled() {
        return (this.f424y & 16) != 0;
    }

    @Override // android.view.MenuItem
    public boolean isVisible() {
        AbstractC2388o0 abstractC2388o0 = this.f396B;
        return (abstractC2388o0 == null || !abstractC2388o0.mo14665g()) ? (this.f424y & 8) == 0 : (this.f424y & 8) == 0 && this.f396B.mo14670b();
    }

    /* renamed from: j */
    public boolean m30206j() {
        AbstractC2388o0 abstractC2388o0;
        if ((this.f425z & 8) != 0) {
            if (this.f395A == null && (abstractC2388o0 = this.f396B) != null) {
                this.f395A = abstractC2388o0.mo14668d(this);
            }
            return this.f395A != null;
        }
        return false;
    }

    /* renamed from: k */
    public boolean m30205k() {
        MenuItem.OnMenuItemClickListener onMenuItemClickListener = this.f416q;
        if (onMenuItemClickListener == null || !onMenuItemClickListener.onMenuItemClick(this)) {
            C0082e c0082e = this.f413n;
            if (c0082e.mo30167h(c0082e, this)) {
                return true;
            }
            Runnable runnable = this.f415p;
            if (runnable != null) {
                runnable.run();
                return true;
            }
            if (this.f406g != null) {
                try {
                    this.f413n.m30221w().startActivity(this.f406g);
                    return true;
                } catch (ActivityNotFoundException unused) {
                }
            }
            AbstractC2388o0 abstractC2388o0 = this.f396B;
            return abstractC2388o0 != null && abstractC2388o0.mo14667e();
        }
        return true;
    }

    /* renamed from: l */
    public boolean m30204l() {
        return (this.f424y & 32) == 32;
    }

    /* renamed from: m */
    public boolean m30203m() {
        return (this.f424y & 4) != 0;
    }

    /* renamed from: n */
    public boolean m30202n() {
        return (this.f425z & 1) == 1;
    }

    /* renamed from: o */
    public boolean m30201o() {
        return (this.f425z & 2) == 2;
    }

    @Override // com.daaw.hi1, android.view.MenuItem
    /* renamed from: p */
    public hi1 setActionView(int i) {
        Context m30221w = this.f413n.m30221w();
        setActionView(LayoutInflater.from(m30221w).inflate(i, (ViewGroup) new LinearLayout(m30221w), false));
        return this;
    }

    @Override // com.daaw.hi1, android.view.MenuItem
    /* renamed from: q */
    public hi1 setActionView(View view) {
        int i;
        this.f395A = view;
        this.f396B = null;
        if (view != null && view.getId() == -1 && (i = this.f400a) > 0) {
            view.setId(i);
        }
        this.f413n.m30261K(this);
        return this;
    }

    /* renamed from: r */
    public void m30198r(boolean z) {
        this.f398D = z;
        this.f413n.mo24014M(false);
    }

    /* renamed from: s */
    public void m30197s(boolean z) {
        int i = this.f424y;
        int i2 = (z ? 2 : 0) | (i & (-3));
        this.f424y = i2;
        if (i != i2) {
            this.f413n.mo24014M(false);
        }
    }

    @Override // android.view.MenuItem
    public MenuItem setActionProvider(ActionProvider actionProvider) {
        throw new UnsupportedOperationException("This is not supported, use MenuItemCompat.setActionProvider()");
    }

    @Override // android.view.MenuItem
    public MenuItem setAlphabeticShortcut(char c) {
        if (this.f409j == c) {
            return this;
        }
        this.f409j = Character.toLowerCase(c);
        this.f413n.mo24014M(false);
        return this;
    }

    @Override // com.daaw.hi1, android.view.MenuItem
    public MenuItem setAlphabeticShortcut(char c, int i) {
        if (this.f409j == c && this.f410k == i) {
            return this;
        }
        this.f409j = Character.toLowerCase(c);
        this.f410k = KeyEvent.normalizeMetaState(i);
        this.f413n.mo24014M(false);
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setCheckable(boolean z) {
        int i = this.f424y;
        int i2 = (z ? 1 : 0) | (i & (-2));
        this.f424y = i2;
        if (i != i2) {
            this.f413n.mo24014M(false);
        }
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setChecked(boolean z) {
        if ((this.f424y & 4) != 0) {
            this.f413n.m30250X(this);
        } else {
            m30197s(z);
        }
        return this;
    }

    @Override // android.view.MenuItem
    public hi1 setContentDescription(CharSequence charSequence) {
        this.f417r = charSequence;
        this.f413n.mo24014M(false);
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setEnabled(boolean z) {
        this.f424y = z ? this.f424y | 16 : this.f424y & (-17);
        this.f413n.mo24014M(false);
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setIcon(int i) {
        this.f411l = null;
        this.f412m = i;
        this.f423x = true;
        this.f413n.mo24014M(false);
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setIcon(Drawable drawable) {
        this.f412m = 0;
        this.f411l = drawable;
        this.f423x = true;
        this.f413n.mo24014M(false);
        return this;
    }

    @Override // com.daaw.hi1, android.view.MenuItem
    public MenuItem setIconTintList(ColorStateList colorStateList) {
        this.f419t = colorStateList;
        this.f421v = true;
        this.f423x = true;
        this.f413n.mo24014M(false);
        return this;
    }

    @Override // com.daaw.hi1, android.view.MenuItem
    public MenuItem setIconTintMode(PorterDuff.Mode mode) {
        this.f420u = mode;
        this.f422w = true;
        this.f423x = true;
        this.f413n.mo24014M(false);
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setIntent(Intent intent) {
        this.f406g = intent;
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setNumericShortcut(char c) {
        if (this.f407h == c) {
            return this;
        }
        this.f407h = c;
        this.f413n.mo24014M(false);
        return this;
    }

    @Override // com.daaw.hi1, android.view.MenuItem
    public MenuItem setNumericShortcut(char c, int i) {
        if (this.f407h == c && this.f408i == i) {
            return this;
        }
        this.f407h = c;
        this.f408i = KeyEvent.normalizeMetaState(i);
        this.f413n.mo24014M(false);
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setOnActionExpandListener(MenuItem.OnActionExpandListener onActionExpandListener) {
        this.f397C = onActionExpandListener;
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setOnMenuItemClickListener(MenuItem.OnMenuItemClickListener onMenuItemClickListener) {
        this.f416q = onMenuItemClickListener;
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setShortcut(char c, char c2) {
        this.f407h = c;
        this.f409j = Character.toLowerCase(c2);
        this.f413n.mo24014M(false);
        return this;
    }

    @Override // com.daaw.hi1, android.view.MenuItem
    public MenuItem setShortcut(char c, char c2, int i, int i2) {
        this.f407h = c;
        this.f408i = KeyEvent.normalizeMetaState(i);
        this.f409j = Character.toLowerCase(c2);
        this.f410k = KeyEvent.normalizeMetaState(i2);
        this.f413n.mo24014M(false);
        return this;
    }

    @Override // com.daaw.hi1, android.view.MenuItem
    public void setShowAsAction(int i) {
        int i2 = i & 3;
        if (i2 != 0 && i2 != 1 && i2 != 2) {
            throw new IllegalArgumentException("SHOW_AS_ACTION_ALWAYS, SHOW_AS_ACTION_IF_ROOM, and SHOW_AS_ACTION_NEVER are mutually exclusive.");
        }
        this.f425z = i;
        this.f413n.m30261K(this);
    }

    @Override // android.view.MenuItem
    public MenuItem setTitle(int i) {
        return setTitle(this.f413n.m30221w().getString(i));
    }

    @Override // android.view.MenuItem
    public MenuItem setTitle(CharSequence charSequence) {
        this.f404e = charSequence;
        this.f413n.mo24014M(false);
        SubMenuC0098l subMenuC0098l = this.f414o;
        if (subMenuC0098l != null) {
            subMenuC0098l.setHeaderTitle(charSequence);
        }
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setTitleCondensed(CharSequence charSequence) {
        this.f405f = charSequence;
        this.f413n.mo24014M(false);
        return this;
    }

    @Override // android.view.MenuItem
    public hi1 setTooltipText(CharSequence charSequence) {
        this.f418s = charSequence;
        this.f413n.mo24014M(false);
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setVisible(boolean z) {
        if (m30191y(z)) {
            this.f413n.m30260L(this);
        }
        return this;
    }

    /* renamed from: t */
    public void m30196t(boolean z) {
        this.f424y = (z ? 4 : 0) | (this.f424y & (-5));
    }

    public String toString() {
        CharSequence charSequence = this.f404e;
        if (charSequence != null) {
            return charSequence.toString();
        }
        return null;
    }

    /* renamed from: u */
    public void m30195u(boolean z) {
        this.f424y = z ? this.f424y | 32 : this.f424y & (-33);
    }

    /* renamed from: v */
    public void m30194v(ContextMenu.ContextMenuInfo contextMenuInfo) {
        this.f399E = contextMenuInfo;
    }

    @Override // com.daaw.hi1, android.view.MenuItem
    /* renamed from: w */
    public hi1 setShowAsActionFlags(int i) {
        setShowAsAction(i);
        return this;
    }

    /* renamed from: x */
    public void m30192x(SubMenuC0098l subMenuC0098l) {
        this.f414o = subMenuC0098l;
        subMenuC0098l.setHeaderTitle(getTitle());
    }

    /* renamed from: y */
    public boolean m30191y(boolean z) {
        int i = this.f424y;
        int i2 = (z ? 0 : 8) | (i & (-9));
        this.f424y = i2;
        return i != i2;
    }

    /* renamed from: z */
    public boolean m30190z() {
        return this.f413n.m30265C();
    }
}
