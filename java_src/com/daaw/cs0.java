package com.daaw;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.os.Parcelable;
import android.util.SparseArray;
import android.view.LayoutInflater;
import android.view.SubMenu;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.appcompat.view.menu.i;
import androidx.recyclerview.widget.RecyclerView;
import com.daaw.y;
import com.google.android.material.internal.NavigationMenuItemView;
import com.google.android.material.internal.NavigationMenuView;
import com.google.android.material.internal.ParcelableSparseArray;
import java.util.ArrayList;
/* loaded from: classes2.dex */
public class cs0 implements androidx.appcompat.view.menu.i {
    public Drawable A;
    public int B;
    public int C;
    public int D;
    public boolean E;
    public int G;
    public int H;
    public int I;
    public NavigationMenuView p;
    public LinearLayout q;
    public i.a r;
    public androidx.appcompat.view.menu.e s;
    public int t;
    public c u;
    public LayoutInflater v;
    public int w;
    public boolean x;
    public ColorStateList y;
    public ColorStateList z;
    public boolean F = true;
    public int J = -1;
    public final View.OnClickListener K = new a();

    /* loaded from: classes2.dex */
    public class a implements View.OnClickListener {
        public a() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            boolean z = true;
            cs0.this.K(true);
            androidx.appcompat.view.menu.g itemData = ((NavigationMenuItemView) view).getItemData();
            cs0 cs0Var = cs0.this;
            boolean O = cs0Var.s.O(itemData, cs0Var, 0);
            if (itemData != null && itemData.isCheckable() && O) {
                cs0.this.u.G(itemData);
            } else {
                z = false;
            }
            cs0.this.K(false);
            if (z) {
                cs0.this.c(false);
            }
        }
    }

    /* loaded from: classes2.dex */
    public static class b extends l {
        public b(View view) {
            super(view);
        }
    }

    /* loaded from: classes2.dex */
    public class c extends RecyclerView.g<l> {
        public final ArrayList<e> c = new ArrayList<>();
        public androidx.appcompat.view.menu.g d;
        public boolean e;

        public c() {
            E();
        }

        public int A() {
            int i = cs0.this.q.getChildCount() == 0 ? 0 : 1;
            for (int i2 = 0; i2 < cs0.this.u.d(); i2++) {
                if (cs0.this.u.f(i2) == 0) {
                    i++;
                }
            }
            return i;
        }

        @Override // androidx.recyclerview.widget.RecyclerView.g
        /* renamed from: B */
        public void m(l lVar, int i) {
            int f = f(i);
            if (f != 0) {
                if (f == 1) {
                    ((TextView) lVar.a).setText(((g) this.c.get(i)).a().getTitle());
                    return;
                } else if (f != 2) {
                    return;
                } else {
                    f fVar = (f) this.c.get(i);
                    lVar.a.setPadding(0, fVar.b(), 0, fVar.a());
                    return;
                }
            }
            NavigationMenuItemView navigationMenuItemView = (NavigationMenuItemView) lVar.a;
            navigationMenuItemView.setIconTintList(cs0.this.z);
            cs0 cs0Var = cs0.this;
            if (cs0Var.x) {
                navigationMenuItemView.setTextAppearance(cs0Var.w);
            }
            ColorStateList colorStateList = cs0.this.y;
            if (colorStateList != null) {
                navigationMenuItemView.setTextColor(colorStateList);
            }
            Drawable drawable = cs0.this.A;
            xs1.v0(navigationMenuItemView, drawable != null ? drawable.getConstantState().newDrawable() : null);
            g gVar = (g) this.c.get(i);
            navigationMenuItemView.setNeedsEmptyIcon(gVar.b);
            navigationMenuItemView.setHorizontalPadding(cs0.this.B);
            navigationMenuItemView.setIconPadding(cs0.this.C);
            cs0 cs0Var2 = cs0.this;
            if (cs0Var2.E) {
                navigationMenuItemView.setIconSize(cs0Var2.D);
            }
            navigationMenuItemView.setMaxLines(cs0.this.G);
            navigationMenuItemView.e(gVar.a(), 0);
        }

        @Override // androidx.recyclerview.widget.RecyclerView.g
        /* renamed from: C */
        public l o(ViewGroup viewGroup, int i) {
            if (i == 0) {
                cs0 cs0Var = cs0.this;
                return new i(cs0Var.v, viewGroup, cs0Var.K);
            } else if (i != 1) {
                if (i != 2) {
                    if (i != 3) {
                        return null;
                    }
                    return new b(cs0.this.q);
                }
                return new j(cs0.this.v, viewGroup);
            } else {
                return new k(cs0.this.v, viewGroup);
            }
        }

        @Override // androidx.recyclerview.widget.RecyclerView.g
        /* renamed from: D */
        public void t(l lVar) {
            if (lVar instanceof i) {
                ((NavigationMenuItemView) lVar.a).D();
            }
        }

        public final void E() {
            if (this.e) {
                return;
            }
            this.e = true;
            this.c.clear();
            this.c.add(new d());
            int i = -1;
            int size = cs0.this.s.G().size();
            boolean z = false;
            int i2 = 0;
            for (int i3 = 0; i3 < size; i3++) {
                androidx.appcompat.view.menu.g gVar = cs0.this.s.G().get(i3);
                if (gVar.isChecked()) {
                    G(gVar);
                }
                if (gVar.isCheckable()) {
                    gVar.t(false);
                }
                if (gVar.hasSubMenu()) {
                    SubMenu subMenu = gVar.getSubMenu();
                    if (subMenu.hasVisibleItems()) {
                        if (i3 != 0) {
                            this.c.add(new f(cs0.this.I, 0));
                        }
                        this.c.add(new g(gVar));
                        int size2 = this.c.size();
                        int size3 = subMenu.size();
                        boolean z2 = false;
                        for (int i4 = 0; i4 < size3; i4++) {
                            androidx.appcompat.view.menu.g gVar2 = (androidx.appcompat.view.menu.g) subMenu.getItem(i4);
                            if (gVar2.isVisible()) {
                                if (!z2 && gVar2.getIcon() != null) {
                                    z2 = true;
                                }
                                if (gVar2.isCheckable()) {
                                    gVar2.t(false);
                                }
                                if (gVar.isChecked()) {
                                    G(gVar);
                                }
                                this.c.add(new g(gVar2));
                            }
                        }
                        if (z2) {
                            x(size2, this.c.size());
                        }
                    }
                } else {
                    int groupId = gVar.getGroupId();
                    if (groupId != i) {
                        i2 = this.c.size();
                        z = gVar.getIcon() != null;
                        if (i3 != 0) {
                            i2++;
                            ArrayList<e> arrayList = this.c;
                            int i5 = cs0.this.I;
                            arrayList.add(new f(i5, i5));
                        }
                    } else if (!z && gVar.getIcon() != null) {
                        x(i2, this.c.size());
                        z = true;
                    }
                    g gVar3 = new g(gVar);
                    gVar3.b = z;
                    this.c.add(gVar3);
                    i = groupId;
                }
            }
            this.e = false;
        }

        public void F(Bundle bundle) {
            androidx.appcompat.view.menu.g a;
            View actionView;
            ParcelableSparseArray parcelableSparseArray;
            androidx.appcompat.view.menu.g a2;
            int i = bundle.getInt("android:menu:checked", 0);
            if (i != 0) {
                this.e = true;
                int size = this.c.size();
                int i2 = 0;
                while (true) {
                    if (i2 >= size) {
                        break;
                    }
                    e eVar = this.c.get(i2);
                    if ((eVar instanceof g) && (a2 = ((g) eVar).a()) != null && a2.getItemId() == i) {
                        G(a2);
                        break;
                    }
                    i2++;
                }
                this.e = false;
                E();
            }
            SparseArray sparseParcelableArray = bundle.getSparseParcelableArray("android:menu:action_views");
            if (sparseParcelableArray != null) {
                int size2 = this.c.size();
                for (int i3 = 0; i3 < size2; i3++) {
                    e eVar2 = this.c.get(i3);
                    if ((eVar2 instanceof g) && (a = ((g) eVar2).a()) != null && (actionView = a.getActionView()) != null && (parcelableSparseArray = (ParcelableSparseArray) sparseParcelableArray.get(a.getItemId())) != null) {
                        actionView.restoreHierarchyState(parcelableSparseArray);
                    }
                }
            }
        }

        public void G(androidx.appcompat.view.menu.g gVar) {
            if (this.d == gVar || !gVar.isCheckable()) {
                return;
            }
            androidx.appcompat.view.menu.g gVar2 = this.d;
            if (gVar2 != null) {
                gVar2.setChecked(false);
            }
            this.d = gVar;
            gVar.setChecked(true);
        }

        public void H(boolean z) {
            this.e = z;
        }

        public void I() {
            E();
            i();
        }

        @Override // androidx.recyclerview.widget.RecyclerView.g
        public int d() {
            return this.c.size();
        }

        @Override // androidx.recyclerview.widget.RecyclerView.g
        public long e(int i) {
            return i;
        }

        @Override // androidx.recyclerview.widget.RecyclerView.g
        public int f(int i) {
            e eVar = this.c.get(i);
            if (eVar instanceof f) {
                return 2;
            }
            if (eVar instanceof d) {
                return 3;
            }
            if (eVar instanceof g) {
                return ((g) eVar).a().hasSubMenu() ? 1 : 0;
            }
            throw new RuntimeException("Unknown item type.");
        }

        public final void x(int i, int i2) {
            while (i < i2) {
                ((g) this.c.get(i)).b = true;
                i++;
            }
        }

        public Bundle y() {
            Bundle bundle = new Bundle();
            androidx.appcompat.view.menu.g gVar = this.d;
            if (gVar != null) {
                bundle.putInt("android:menu:checked", gVar.getItemId());
            }
            SparseArray<? extends Parcelable> sparseArray = new SparseArray<>();
            int size = this.c.size();
            for (int i = 0; i < size; i++) {
                e eVar = this.c.get(i);
                if (eVar instanceof g) {
                    androidx.appcompat.view.menu.g a = ((g) eVar).a();
                    View actionView = a != null ? a.getActionView() : null;
                    if (actionView != null) {
                        ParcelableSparseArray parcelableSparseArray = new ParcelableSparseArray();
                        actionView.saveHierarchyState(parcelableSparseArray);
                        sparseArray.put(a.getItemId(), parcelableSparseArray);
                    }
                }
            }
            bundle.putSparseParcelableArray("android:menu:action_views", sparseArray);
            return bundle;
        }

        public androidx.appcompat.view.menu.g z() {
            return this.d;
        }
    }

    /* loaded from: classes2.dex */
    public static class d implements e {
    }

    /* loaded from: classes2.dex */
    public interface e {
    }

    /* loaded from: classes2.dex */
    public static class f implements e {
        public final int a;
        public final int b;

        public f(int i, int i2) {
            this.a = i;
            this.b = i2;
        }

        public int a() {
            return this.b;
        }

        public int b() {
            return this.a;
        }
    }

    /* loaded from: classes2.dex */
    public static class g implements e {
        public final androidx.appcompat.view.menu.g a;
        public boolean b;

        public g(androidx.appcompat.view.menu.g gVar) {
            this.a = gVar;
        }

        public androidx.appcompat.view.menu.g a() {
            return this.a;
        }
    }

    /* loaded from: classes2.dex */
    public class h extends androidx.recyclerview.widget.k {
        public h(RecyclerView recyclerView) {
            super(recyclerView);
        }

        @Override // androidx.recyclerview.widget.k, com.daaw.w
        public void g(View view, y yVar) {
            super.g(view, yVar);
            yVar.d0(y.b.a(cs0.this.u.A(), 0, false));
        }
    }

    /* loaded from: classes2.dex */
    public static class i extends l {
        public i(LayoutInflater layoutInflater, ViewGroup viewGroup, View.OnClickListener onClickListener) {
            super(layoutInflater.inflate(a21.design_navigation_item, viewGroup, false));
            this.a.setOnClickListener(onClickListener);
        }
    }

    /* loaded from: classes2.dex */
    public static class j extends l {
        public j(LayoutInflater layoutInflater, ViewGroup viewGroup) {
            super(layoutInflater.inflate(a21.design_navigation_item_separator, viewGroup, false));
        }
    }

    /* loaded from: classes2.dex */
    public static class k extends l {
        public k(LayoutInflater layoutInflater, ViewGroup viewGroup) {
            super(layoutInflater.inflate(a21.design_navigation_item_subheader, viewGroup, false));
        }
    }

    /* loaded from: classes2.dex */
    public static abstract class l extends RecyclerView.c0 {
        public l(View view) {
            super(view);
        }
    }

    public void A(int i2) {
        this.t = i2;
    }

    public void B(Drawable drawable) {
        this.A = drawable;
        c(false);
    }

    public void C(int i2) {
        this.B = i2;
        c(false);
    }

    public void D(int i2) {
        this.C = i2;
        c(false);
    }

    public void E(int i2) {
        if (this.D != i2) {
            this.D = i2;
            this.E = true;
            c(false);
        }
    }

    public void F(ColorStateList colorStateList) {
        this.z = colorStateList;
        c(false);
    }

    public void G(int i2) {
        this.G = i2;
        c(false);
    }

    public void H(int i2) {
        this.w = i2;
        this.x = true;
        c(false);
    }

    public void I(ColorStateList colorStateList) {
        this.y = colorStateList;
        c(false);
    }

    public void J(int i2) {
        this.J = i2;
        NavigationMenuView navigationMenuView = this.p;
        if (navigationMenuView != null) {
            navigationMenuView.setOverScrollMode(i2);
        }
    }

    public void K(boolean z) {
        c cVar = this.u;
        if (cVar != null) {
            cVar.H(z);
        }
    }

    public final void L() {
        int i2 = (this.q.getChildCount() == 0 && this.F) ? this.H : 0;
        NavigationMenuView navigationMenuView = this.p;
        navigationMenuView.setPadding(0, i2, 0, navigationMenuView.getPaddingBottom());
    }

    @Override // androidx.appcompat.view.menu.i
    public void b(androidx.appcompat.view.menu.e eVar, boolean z) {
        i.a aVar = this.r;
        if (aVar != null) {
            aVar.b(eVar, z);
        }
    }

    @Override // androidx.appcompat.view.menu.i
    public void c(boolean z) {
        c cVar = this.u;
        if (cVar != null) {
            cVar.I();
        }
    }

    @Override // androidx.appcompat.view.menu.i
    public boolean d() {
        return false;
    }

    @Override // androidx.appcompat.view.menu.i
    public boolean e(androidx.appcompat.view.menu.e eVar, androidx.appcompat.view.menu.g gVar) {
        return false;
    }

    @Override // androidx.appcompat.view.menu.i
    public boolean f(androidx.appcompat.view.menu.e eVar, androidx.appcompat.view.menu.g gVar) {
        return false;
    }

    @Override // androidx.appcompat.view.menu.i
    public int getId() {
        return this.t;
    }

    public void h(View view) {
        this.q.addView(view);
        NavigationMenuView navigationMenuView = this.p;
        navigationMenuView.setPadding(0, 0, 0, navigationMenuView.getPaddingBottom());
    }

    @Override // androidx.appcompat.view.menu.i
    public void i(Context context, androidx.appcompat.view.menu.e eVar) {
        this.v = LayoutInflater.from(context);
        this.s = eVar;
        this.I = context.getResources().getDimensionPixelOffset(f11.design_navigation_separator_vertical_padding);
    }

    @Override // androidx.appcompat.view.menu.i
    public void j(Parcelable parcelable) {
        if (parcelable instanceof Bundle) {
            Bundle bundle = (Bundle) parcelable;
            SparseArray<Parcelable> sparseParcelableArray = bundle.getSparseParcelableArray("android:menu:list");
            if (sparseParcelableArray != null) {
                this.p.restoreHierarchyState(sparseParcelableArray);
            }
            Bundle bundle2 = bundle.getBundle("android:menu:adapter");
            if (bundle2 != null) {
                this.u.F(bundle2);
            }
            SparseArray sparseParcelableArray2 = bundle.getSparseParcelableArray("android:menu:header");
            if (sparseParcelableArray2 != null) {
                this.q.restoreHierarchyState(sparseParcelableArray2);
            }
        }
    }

    public void k(px1 px1Var) {
        int l2 = px1Var.l();
        if (this.H != l2) {
            this.H = l2;
            L();
        }
        NavigationMenuView navigationMenuView = this.p;
        navigationMenuView.setPadding(0, navigationMenuView.getPaddingTop(), 0, px1Var.i());
        xs1.i(this.q, px1Var);
    }

    @Override // androidx.appcompat.view.menu.i
    public boolean l(androidx.appcompat.view.menu.l lVar) {
        return false;
    }

    @Override // androidx.appcompat.view.menu.i
    public Parcelable m() {
        Bundle bundle = new Bundle();
        if (this.p != null) {
            SparseArray<Parcelable> sparseArray = new SparseArray<>();
            this.p.saveHierarchyState(sparseArray);
            bundle.putSparseParcelableArray("android:menu:list", sparseArray);
        }
        c cVar = this.u;
        if (cVar != null) {
            bundle.putBundle("android:menu:adapter", cVar.y());
        }
        if (this.q != null) {
            SparseArray<? extends Parcelable> sparseArray2 = new SparseArray<>();
            this.q.saveHierarchyState(sparseArray2);
            bundle.putSparseParcelableArray("android:menu:header", sparseArray2);
        }
        return bundle;
    }

    public androidx.appcompat.view.menu.g n() {
        return this.u.z();
    }

    public int o() {
        return this.q.getChildCount();
    }

    public View p(int i2) {
        return this.q.getChildAt(i2);
    }

    public Drawable q() {
        return this.A;
    }

    public int r() {
        return this.B;
    }

    public int s() {
        return this.C;
    }

    public int t() {
        return this.G;
    }

    public ColorStateList u() {
        return this.y;
    }

    public ColorStateList v() {
        return this.z;
    }

    public androidx.appcompat.view.menu.j w(ViewGroup viewGroup) {
        if (this.p == null) {
            NavigationMenuView navigationMenuView = (NavigationMenuView) this.v.inflate(a21.design_navigation_menu, viewGroup, false);
            this.p = navigationMenuView;
            navigationMenuView.setAccessibilityDelegateCompat(new h(this.p));
            if (this.u == null) {
                this.u = new c();
            }
            int i2 = this.J;
            if (i2 != -1) {
                this.p.setOverScrollMode(i2);
            }
            this.q = (LinearLayout) this.v.inflate(a21.design_navigation_item_header, (ViewGroup) this.p, false);
            this.p.setAdapter(this.u);
        }
        return this.p;
    }

    public View x(int i2) {
        View inflate = this.v.inflate(i2, (ViewGroup) this.q, false);
        h(inflate);
        return inflate;
    }

    public void y(boolean z) {
        if (this.F != z) {
            this.F = z;
            L();
        }
    }

    public void z(androidx.appcompat.view.menu.g gVar) {
        this.u.G(gVar);
    }
}
