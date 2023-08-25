package androidx.appcompat.view.menu;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.view.Menu;
import android.view.MenuItem;
import android.view.SubMenu;
import android.view.View;
import androidx.appcompat.view.menu.C0082e;
/* renamed from: androidx.appcompat.view.menu.l */
/* loaded from: classes.dex */
public class SubMenuC0098l extends C0082e implements SubMenu {

    /* renamed from: B */
    public C0082e f463B;

    /* renamed from: C */
    public C0086g f464C;

    public SubMenuC0098l(Context context, C0082e c0082e, C0086g c0086g) {
        super(context);
        this.f463B = c0082e;
        this.f464C = c0086g;
    }

    @Override // androidx.appcompat.view.menu.C0082e
    /* renamed from: F */
    public C0082e mo30173F() {
        return this.f463B.mo30173F();
    }

    @Override // androidx.appcompat.view.menu.C0082e
    /* renamed from: H */
    public boolean mo30172H() {
        return this.f463B.mo30172H();
    }

    @Override // androidx.appcompat.view.menu.C0082e
    /* renamed from: I */
    public boolean mo30171I() {
        return this.f463B.mo30171I();
    }

    @Override // androidx.appcompat.view.menu.C0082e
    /* renamed from: J */
    public boolean mo30170J() {
        return this.f463B.mo30170J();
    }

    @Override // androidx.appcompat.view.menu.C0082e
    /* renamed from: V */
    public void mo30169V(C0082e.InterfaceC0083a interfaceC0083a) {
        this.f463B.mo30169V(interfaceC0083a);
    }

    @Override // androidx.appcompat.view.menu.C0082e
    /* renamed from: f */
    public boolean mo30168f(C0086g c0086g) {
        return this.f463B.mo30168f(c0086g);
    }

    @Override // android.view.SubMenu
    public MenuItem getItem() {
        return this.f464C;
    }

    @Override // androidx.appcompat.view.menu.C0082e
    /* renamed from: h */
    public boolean mo30167h(C0082e c0082e, MenuItem menuItem) {
        return super.mo30167h(c0082e, menuItem) || this.f463B.mo30167h(c0082e, menuItem);
    }

    /* renamed from: i0 */
    public Menu m30166i0() {
        return this.f463B;
    }

    @Override // androidx.appcompat.view.menu.C0082e
    /* renamed from: m */
    public boolean mo30165m(C0086g c0086g) {
        return this.f463B.mo30165m(c0086g);
    }

    @Override // androidx.appcompat.view.menu.C0082e, android.view.Menu
    public void setGroupDividerEnabled(boolean z) {
        this.f463B.setGroupDividerEnabled(z);
    }

    @Override // android.view.SubMenu
    public SubMenu setHeaderIcon(int i) {
        return (SubMenu) super.m30249Y(i);
    }

    @Override // android.view.SubMenu
    public SubMenu setHeaderIcon(Drawable drawable) {
        return (SubMenu) super.m30248Z(drawable);
    }

    @Override // android.view.SubMenu
    public SubMenu setHeaderTitle(int i) {
        return (SubMenu) super.m30244b0(i);
    }

    @Override // android.view.SubMenu
    public SubMenu setHeaderTitle(CharSequence charSequence) {
        return (SubMenu) super.m30242c0(charSequence);
    }

    @Override // android.view.SubMenu
    public SubMenu setHeaderView(View view) {
        return (SubMenu) super.m30240d0(view);
    }

    @Override // android.view.SubMenu
    public SubMenu setIcon(int i) {
        this.f464C.setIcon(i);
        return this;
    }

    @Override // android.view.SubMenu
    public SubMenu setIcon(Drawable drawable) {
        this.f464C.setIcon(drawable);
        return this;
    }

    @Override // androidx.appcompat.view.menu.C0082e, android.view.Menu
    public void setQwertyMode(boolean z) {
        this.f463B.setQwertyMode(z);
    }

    @Override // androidx.appcompat.view.menu.C0082e
    /* renamed from: v */
    public String mo30164v() {
        C0086g c0086g = this.f464C;
        int itemId = c0086g != null ? c0086g.getItemId() : 0;
        if (itemId == 0) {
            return null;
        }
        return super.mo30164v() + ":" + itemId;
    }
}
