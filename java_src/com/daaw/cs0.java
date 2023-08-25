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
import androidx.appcompat.view.menu.C0082e;
import androidx.appcompat.view.menu.C0086g;
import androidx.appcompat.view.menu.InterfaceC0091i;
import androidx.appcompat.view.menu.InterfaceC0093j;
import androidx.appcompat.view.menu.SubMenuC0098l;
import androidx.recyclerview.widget.C0451k;
import androidx.recyclerview.widget.RecyclerView;
import com.daaw.C3654y;
import com.google.android.material.internal.NavigationMenuItemView;
import com.google.android.material.internal.NavigationMenuView;
import com.google.android.material.internal.ParcelableSparseArray;
import java.util.ArrayList;
/* loaded from: classes2.dex */
public class cs0 implements InterfaceC0091i {

    /* renamed from: A */
    public Drawable f6127A;

    /* renamed from: B */
    public int f6128B;

    /* renamed from: C */
    public int f6129C;

    /* renamed from: D */
    public int f6130D;

    /* renamed from: E */
    public boolean f6131E;

    /* renamed from: G */
    public int f6133G;

    /* renamed from: H */
    public int f6134H;

    /* renamed from: I */
    public int f6135I;

    /* renamed from: p */
    public NavigationMenuView f6138p;

    /* renamed from: q */
    public LinearLayout f6139q;

    /* renamed from: r */
    public InterfaceC0091i.InterfaceC0092a f6140r;

    /* renamed from: s */
    public C0082e f6141s;

    /* renamed from: t */
    public int f6142t;

    /* renamed from: u */
    public C0996c f6143u;

    /* renamed from: v */
    public LayoutInflater f6144v;

    /* renamed from: w */
    public int f6145w;

    /* renamed from: x */
    public boolean f6146x;

    /* renamed from: y */
    public ColorStateList f6147y;

    /* renamed from: z */
    public ColorStateList f6148z;

    /* renamed from: F */
    public boolean f6132F = true;

    /* renamed from: J */
    public int f6136J = -1;

    /* renamed from: K */
    public final View.OnClickListener f6137K = new View$OnClickListenerC0994a();

    /* renamed from: com.daaw.cs0$a */
    /* loaded from: classes2.dex */
    public class View$OnClickListenerC0994a implements View.OnClickListener {
        public View$OnClickListenerC0994a() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            boolean z = true;
            cs0.this.m25028K(true);
            C0086g itemData = ((NavigationMenuItemView) view).getItemData();
            cs0 cs0Var = cs0.this;
            boolean m30258O = cs0Var.f6141s.m30258O(itemData, cs0Var, 0);
            if (itemData != null && itemData.isCheckable() && m30258O) {
                cs0.this.f6143u.m24998G(itemData);
            } else {
                z = false;
            }
            cs0.this.m25028K(false);
            if (z) {
                cs0.this.mo25024c(false);
            }
        }
    }

    /* renamed from: com.daaw.cs0$b */
    /* loaded from: classes2.dex */
    public static class C0995b extends AbstractC1005l {
        public C0995b(View view) {
            super(view);
        }
    }

    /* renamed from: com.daaw.cs0$c */
    /* loaded from: classes2.dex */
    public class C0996c extends RecyclerView.AbstractC0380g<AbstractC1005l> {

        /* renamed from: c */
        public final ArrayList<InterfaceC0998e> f6150c = new ArrayList<>();

        /* renamed from: d */
        public C0086g f6151d;

        /* renamed from: e */
        public boolean f6152e;

        public C0996c() {
            m25000E();
        }

        /* renamed from: A */
        public int m25004A() {
            int i = cs0.this.f6139q.getChildCount() == 0 ? 0 : 1;
            for (int i2 = 0; i2 < cs0.this.f6143u.mo497d(); i2++) {
                if (cs0.this.f6143u.mo4978f(i2) == 0) {
                    i++;
                }
            }
            return i;
        }

        @Override // androidx.recyclerview.widget.RecyclerView.AbstractC0380g
        /* renamed from: B */
        public void mo496m(AbstractC1005l abstractC1005l, int i) {
            int mo4978f = mo4978f(i);
            if (mo4978f != 0) {
                if (mo4978f == 1) {
                    ((TextView) abstractC1005l.f1947a).setText(((C1000g) this.f6150c.get(i)).m24989a().getTitle());
                    return;
                } else if (mo4978f != 2) {
                    return;
                } else {
                    C0999f c0999f = (C0999f) this.f6150c.get(i);
                    abstractC1005l.f1947a.setPadding(0, c0999f.m24990b(), 0, c0999f.m24991a());
                    return;
                }
            }
            NavigationMenuItemView navigationMenuItemView = (NavigationMenuItemView) abstractC1005l.f1947a;
            navigationMenuItemView.setIconTintList(cs0.this.f6148z);
            cs0 cs0Var = cs0.this;
            if (cs0Var.f6146x) {
                navigationMenuItemView.setTextAppearance(cs0Var.f6145w);
            }
            ColorStateList colorStateList = cs0.this.f6147y;
            if (colorStateList != null) {
                navigationMenuItemView.setTextColor(colorStateList);
            }
            Drawable drawable = cs0.this.f6127A;
            xs1.m4694v0(navigationMenuItemView, drawable != null ? drawable.getConstantState().newDrawable() : null);
            C1000g c1000g = (C1000g) this.f6150c.get(i);
            navigationMenuItemView.setNeedsEmptyIcon(c1000g.f6157b);
            navigationMenuItemView.setHorizontalPadding(cs0.this.f6128B);
            navigationMenuItemView.setIconPadding(cs0.this.f6129C);
            cs0 cs0Var2 = cs0.this;
            if (cs0Var2.f6131E) {
                navigationMenuItemView.setIconSize(cs0Var2.f6130D);
            }
            navigationMenuItemView.setMaxLines(cs0.this.f6133G);
            navigationMenuItemView.mo348e(c1000g.m24989a(), 0);
        }

        @Override // androidx.recyclerview.widget.RecyclerView.AbstractC0380g
        /* renamed from: C */
        public AbstractC1005l mo495o(ViewGroup viewGroup, int i) {
            if (i == 0) {
                cs0 cs0Var = cs0.this;
                return new C1002i(cs0Var.f6144v, viewGroup, cs0Var.f6137K);
            } else if (i != 1) {
                if (i != 2) {
                    if (i != 3) {
                        return null;
                    }
                    return new C0995b(cs0.this.f6139q);
                }
                return new C1003j(cs0.this.f6144v, viewGroup);
            } else {
                return new C1004k(cs0.this.f6144v, viewGroup);
            }
        }

        @Override // androidx.recyclerview.widget.RecyclerView.AbstractC0380g
        /* renamed from: D */
        public void mo24995t(AbstractC1005l abstractC1005l) {
            if (abstractC1005l instanceof C1002i) {
                ((NavigationMenuItemView) abstractC1005l.f1947a).m351D();
            }
        }

        /* renamed from: E */
        public final void m25000E() {
            if (this.f6152e) {
                return;
            }
            this.f6152e = true;
            this.f6150c.clear();
            this.f6150c.add(new C0997d());
            int i = -1;
            int size = cs0.this.f6141s.m30262G().size();
            boolean z = false;
            int i2 = 0;
            for (int i3 = 0; i3 < size; i3++) {
                C0086g c0086g = cs0.this.f6141s.m30262G().get(i3);
                if (c0086g.isChecked()) {
                    m24998G(c0086g);
                }
                if (c0086g.isCheckable()) {
                    c0086g.m30196t(false);
                }
                if (c0086g.hasSubMenu()) {
                    SubMenu subMenu = c0086g.getSubMenu();
                    if (subMenu.hasVisibleItems()) {
                        if (i3 != 0) {
                            this.f6150c.add(new C0999f(cs0.this.f6135I, 0));
                        }
                        this.f6150c.add(new C1000g(c0086g));
                        int size2 = this.f6150c.size();
                        int size3 = subMenu.size();
                        boolean z2 = false;
                        for (int i4 = 0; i4 < size3; i4++) {
                            C0086g c0086g2 = (C0086g) subMenu.getItem(i4);
                            if (c0086g2.isVisible()) {
                                if (!z2 && c0086g2.getIcon() != null) {
                                    z2 = true;
                                }
                                if (c0086g2.isCheckable()) {
                                    c0086g2.m30196t(false);
                                }
                                if (c0086g.isChecked()) {
                                    m24998G(c0086g);
                                }
                                this.f6150c.add(new C1000g(c0086g2));
                            }
                        }
                        if (z2) {
                            m24994x(size2, this.f6150c.size());
                        }
                    }
                } else {
                    int groupId = c0086g.getGroupId();
                    if (groupId != i) {
                        i2 = this.f6150c.size();
                        z = c0086g.getIcon() != null;
                        if (i3 != 0) {
                            i2++;
                            ArrayList<InterfaceC0998e> arrayList = this.f6150c;
                            int i5 = cs0.this.f6135I;
                            arrayList.add(new C0999f(i5, i5));
                        }
                    } else if (!z && c0086g.getIcon() != null) {
                        m24994x(i2, this.f6150c.size());
                        z = true;
                    }
                    C1000g c1000g = new C1000g(c0086g);
                    c1000g.f6157b = z;
                    this.f6150c.add(c1000g);
                    i = groupId;
                }
            }
            this.f6152e = false;
        }

        /* renamed from: F */
        public void m24999F(Bundle bundle) {
            C0086g m24989a;
            View actionView;
            ParcelableSparseArray parcelableSparseArray;
            C0086g m24989a2;
            int i = bundle.getInt("android:menu:checked", 0);
            if (i != 0) {
                this.f6152e = true;
                int size = this.f6150c.size();
                int i2 = 0;
                while (true) {
                    if (i2 >= size) {
                        break;
                    }
                    InterfaceC0998e interfaceC0998e = this.f6150c.get(i2);
                    if ((interfaceC0998e instanceof C1000g) && (m24989a2 = ((C1000g) interfaceC0998e).m24989a()) != null && m24989a2.getItemId() == i) {
                        m24998G(m24989a2);
                        break;
                    }
                    i2++;
                }
                this.f6152e = false;
                m25000E();
            }
            SparseArray sparseParcelableArray = bundle.getSparseParcelableArray("android:menu:action_views");
            if (sparseParcelableArray != null) {
                int size2 = this.f6150c.size();
                for (int i3 = 0; i3 < size2; i3++) {
                    InterfaceC0998e interfaceC0998e2 = this.f6150c.get(i3);
                    if ((interfaceC0998e2 instanceof C1000g) && (m24989a = ((C1000g) interfaceC0998e2).m24989a()) != null && (actionView = m24989a.getActionView()) != null && (parcelableSparseArray = (ParcelableSparseArray) sparseParcelableArray.get(m24989a.getItemId())) != null) {
                        actionView.restoreHierarchyState(parcelableSparseArray);
                    }
                }
            }
        }

        /* renamed from: G */
        public void m24998G(C0086g c0086g) {
            if (this.f6151d == c0086g || !c0086g.isCheckable()) {
                return;
            }
            C0086g c0086g2 = this.f6151d;
            if (c0086g2 != null) {
                c0086g2.setChecked(false);
            }
            this.f6151d = c0086g;
            c0086g.setChecked(true);
        }

        /* renamed from: H */
        public void m24997H(boolean z) {
            this.f6152e = z;
        }

        /* renamed from: I */
        public void m24996I() {
            m25000E();
            m28714i();
        }

        @Override // androidx.recyclerview.widget.RecyclerView.AbstractC0380g
        /* renamed from: d */
        public int mo497d() {
            return this.f6150c.size();
        }

        @Override // androidx.recyclerview.widget.RecyclerView.AbstractC0380g
        /* renamed from: e */
        public long mo504e(int i) {
            return i;
        }

        @Override // androidx.recyclerview.widget.RecyclerView.AbstractC0380g
        /* renamed from: f */
        public int mo4978f(int i) {
            InterfaceC0998e interfaceC0998e = this.f6150c.get(i);
            if (interfaceC0998e instanceof C0999f) {
                return 2;
            }
            if (interfaceC0998e instanceof C0997d) {
                return 3;
            }
            if (interfaceC0998e instanceof C1000g) {
                return ((C1000g) interfaceC0998e).m24989a().hasSubMenu() ? 1 : 0;
            }
            throw new RuntimeException("Unknown item type.");
        }

        /* renamed from: x */
        public final void m24994x(int i, int i2) {
            while (i < i2) {
                ((C1000g) this.f6150c.get(i)).f6157b = true;
                i++;
            }
        }

        /* renamed from: y */
        public Bundle m24993y() {
            Bundle bundle = new Bundle();
            C0086g c0086g = this.f6151d;
            if (c0086g != null) {
                bundle.putInt("android:menu:checked", c0086g.getItemId());
            }
            SparseArray<? extends Parcelable> sparseArray = new SparseArray<>();
            int size = this.f6150c.size();
            for (int i = 0; i < size; i++) {
                InterfaceC0998e interfaceC0998e = this.f6150c.get(i);
                if (interfaceC0998e instanceof C1000g) {
                    C0086g m24989a = ((C1000g) interfaceC0998e).m24989a();
                    View actionView = m24989a != null ? m24989a.getActionView() : null;
                    if (actionView != null) {
                        ParcelableSparseArray parcelableSparseArray = new ParcelableSparseArray();
                        actionView.saveHierarchyState(parcelableSparseArray);
                        sparseArray.put(m24989a.getItemId(), parcelableSparseArray);
                    }
                }
            }
            bundle.putSparseParcelableArray("android:menu:action_views", sparseArray);
            return bundle;
        }

        /* renamed from: z */
        public C0086g m24992z() {
            return this.f6151d;
        }
    }

    /* renamed from: com.daaw.cs0$d */
    /* loaded from: classes2.dex */
    public static class C0997d implements InterfaceC0998e {
    }

    /* renamed from: com.daaw.cs0$e */
    /* loaded from: classes2.dex */
    public interface InterfaceC0998e {
    }

    /* renamed from: com.daaw.cs0$f */
    /* loaded from: classes2.dex */
    public static class C0999f implements InterfaceC0998e {

        /* renamed from: a */
        public final int f6154a;

        /* renamed from: b */
        public final int f6155b;

        public C0999f(int i, int i2) {
            this.f6154a = i;
            this.f6155b = i2;
        }

        /* renamed from: a */
        public int m24991a() {
            return this.f6155b;
        }

        /* renamed from: b */
        public int m24990b() {
            return this.f6154a;
        }
    }

    /* renamed from: com.daaw.cs0$g */
    /* loaded from: classes2.dex */
    public static class C1000g implements InterfaceC0998e {

        /* renamed from: a */
        public final C0086g f6156a;

        /* renamed from: b */
        public boolean f6157b;

        public C1000g(C0086g c0086g) {
            this.f6156a = c0086g;
        }

        /* renamed from: a */
        public C0086g m24989a() {
            return this.f6156a;
        }
    }

    /* renamed from: com.daaw.cs0$h */
    /* loaded from: classes2.dex */
    public class C1001h extends C0451k {
        public C1001h(RecyclerView recyclerView) {
            super(recyclerView);
        }

        @Override // androidx.recyclerview.widget.C0451k, com.daaw.C3388w
        /* renamed from: g */
        public void mo161g(View view, C3654y c3654y) {
            super.mo161g(view, c3654y);
            c3654y.m4331d0(C3654y.C3656b.m4282a(cs0.this.f6143u.m25004A(), 0, false));
        }
    }

    /* renamed from: com.daaw.cs0$i */
    /* loaded from: classes2.dex */
    public static class C1002i extends AbstractC1005l {
        public C1002i(LayoutInflater layoutInflater, ViewGroup viewGroup, View.OnClickListener onClickListener) {
            super(layoutInflater.inflate(a21.design_navigation_item, viewGroup, false));
            this.f1947a.setOnClickListener(onClickListener);
        }
    }

    /* renamed from: com.daaw.cs0$j */
    /* loaded from: classes2.dex */
    public static class C1003j extends AbstractC1005l {
        public C1003j(LayoutInflater layoutInflater, ViewGroup viewGroup) {
            super(layoutInflater.inflate(a21.design_navigation_item_separator, viewGroup, false));
        }
    }

    /* renamed from: com.daaw.cs0$k */
    /* loaded from: classes2.dex */
    public static class C1004k extends AbstractC1005l {
        public C1004k(LayoutInflater layoutInflater, ViewGroup viewGroup) {
            super(layoutInflater.inflate(a21.design_navigation_item_subheader, viewGroup, false));
        }
    }

    /* renamed from: com.daaw.cs0$l */
    /* loaded from: classes2.dex */
    public static abstract class AbstractC1005l extends RecyclerView.AbstractC0376c0 {
        public AbstractC1005l(View view) {
            super(view);
        }
    }

    /* renamed from: A */
    public void m25038A(int i) {
        this.f6142t = i;
    }

    /* renamed from: B */
    public void m25037B(Drawable drawable) {
        this.f6127A = drawable;
        mo25024c(false);
    }

    /* renamed from: C */
    public void m25036C(int i) {
        this.f6128B = i;
        mo25024c(false);
    }

    /* renamed from: D */
    public void m25035D(int i) {
        this.f6129C = i;
        mo25024c(false);
    }

    /* renamed from: E */
    public void m25034E(int i) {
        if (this.f6130D != i) {
            this.f6130D = i;
            this.f6131E = true;
            mo25024c(false);
        }
    }

    /* renamed from: F */
    public void m25033F(ColorStateList colorStateList) {
        this.f6148z = colorStateList;
        mo25024c(false);
    }

    /* renamed from: G */
    public void m25032G(int i) {
        this.f6133G = i;
        mo25024c(false);
    }

    /* renamed from: H */
    public void m25031H(int i) {
        this.f6145w = i;
        this.f6146x = true;
        mo25024c(false);
    }

    /* renamed from: I */
    public void m25030I(ColorStateList colorStateList) {
        this.f6147y = colorStateList;
        mo25024c(false);
    }

    /* renamed from: J */
    public void m25029J(int i) {
        this.f6136J = i;
        NavigationMenuView navigationMenuView = this.f6138p;
        if (navigationMenuView != null) {
            navigationMenuView.setOverScrollMode(i);
        }
    }

    /* renamed from: K */
    public void m25028K(boolean z) {
        C0996c c0996c = this.f6143u;
        if (c0996c != null) {
            c0996c.m24997H(z);
        }
    }

    /* renamed from: L */
    public final void m25027L() {
        int i = (this.f6139q.getChildCount() == 0 && this.f6132F) ? this.f6134H : 0;
        NavigationMenuView navigationMenuView = this.f6138p;
        navigationMenuView.setPadding(0, i, 0, navigationMenuView.getPaddingBottom());
    }

    @Override // androidx.appcompat.view.menu.InterfaceC0091i
    /* renamed from: b */
    public void mo25025b(C0082e c0082e, boolean z) {
        InterfaceC0091i.InterfaceC0092a interfaceC0092a = this.f6140r;
        if (interfaceC0092a != null) {
            interfaceC0092a.mo24218b(c0082e, z);
        }
    }

    @Override // androidx.appcompat.view.menu.InterfaceC0091i
    /* renamed from: c */
    public void mo25024c(boolean z) {
        C0996c c0996c = this.f6143u;
        if (c0996c != null) {
            c0996c.m24996I();
        }
    }

    @Override // androidx.appcompat.view.menu.InterfaceC0091i
    /* renamed from: d */
    public boolean mo25023d() {
        return false;
    }

    @Override // androidx.appcompat.view.menu.InterfaceC0091i
    /* renamed from: e */
    public boolean mo17564e(C0082e c0082e, C0086g c0086g) {
        return false;
    }

    @Override // androidx.appcompat.view.menu.InterfaceC0091i
    /* renamed from: f */
    public boolean mo17563f(C0082e c0082e, C0086g c0086g) {
        return false;
    }

    @Override // androidx.appcompat.view.menu.InterfaceC0091i
    public int getId() {
        return this.f6142t;
    }

    /* renamed from: h */
    public void m25022h(View view) {
        this.f6139q.addView(view);
        NavigationMenuView navigationMenuView = this.f6138p;
        navigationMenuView.setPadding(0, 0, 0, navigationMenuView.getPaddingBottom());
    }

    @Override // androidx.appcompat.view.menu.InterfaceC0091i
    /* renamed from: i */
    public void mo17562i(Context context, C0082e c0082e) {
        this.f6144v = LayoutInflater.from(context);
        this.f6141s = c0082e;
        this.f6135I = context.getResources().getDimensionPixelOffset(f11.design_navigation_separator_vertical_padding);
    }

    @Override // androidx.appcompat.view.menu.InterfaceC0091i
    /* renamed from: j */
    public void mo25021j(Parcelable parcelable) {
        if (parcelable instanceof Bundle) {
            Bundle bundle = (Bundle) parcelable;
            SparseArray<Parcelable> sparseParcelableArray = bundle.getSparseParcelableArray("android:menu:list");
            if (sparseParcelableArray != null) {
                this.f6138p.restoreHierarchyState(sparseParcelableArray);
            }
            Bundle bundle2 = bundle.getBundle("android:menu:adapter");
            if (bundle2 != null) {
                this.f6143u.m24999F(bundle2);
            }
            SparseArray sparseParcelableArray2 = bundle.getSparseParcelableArray("android:menu:header");
            if (sparseParcelableArray2 != null) {
                this.f6139q.restoreHierarchyState(sparseParcelableArray2);
            }
        }
    }

    /* renamed from: k */
    public void m25020k(px1 px1Var) {
        int m12949l = px1Var.m12949l();
        if (this.f6134H != m12949l) {
            this.f6134H = m12949l;
            m25027L();
        }
        NavigationMenuView navigationMenuView = this.f6138p;
        navigationMenuView.setPadding(0, navigationMenuView.getPaddingTop(), 0, px1Var.m12952i());
        xs1.m4721i(this.f6139q, px1Var);
    }

    @Override // androidx.appcompat.view.menu.InterfaceC0091i
    /* renamed from: l */
    public boolean mo25019l(SubMenuC0098l subMenuC0098l) {
        return false;
    }

    @Override // androidx.appcompat.view.menu.InterfaceC0091i
    /* renamed from: m */
    public Parcelable mo25018m() {
        Bundle bundle = new Bundle();
        if (this.f6138p != null) {
            SparseArray<Parcelable> sparseArray = new SparseArray<>();
            this.f6138p.saveHierarchyState(sparseArray);
            bundle.putSparseParcelableArray("android:menu:list", sparseArray);
        }
        C0996c c0996c = this.f6143u;
        if (c0996c != null) {
            bundle.putBundle("android:menu:adapter", c0996c.m24993y());
        }
        if (this.f6139q != null) {
            SparseArray<? extends Parcelable> sparseArray2 = new SparseArray<>();
            this.f6139q.saveHierarchyState(sparseArray2);
            bundle.putSparseParcelableArray("android:menu:header", sparseArray2);
        }
        return bundle;
    }

    /* renamed from: n */
    public C0086g m25017n() {
        return this.f6143u.m24992z();
    }

    /* renamed from: o */
    public int m25016o() {
        return this.f6139q.getChildCount();
    }

    /* renamed from: p */
    public View m25015p(int i) {
        return this.f6139q.getChildAt(i);
    }

    /* renamed from: q */
    public Drawable m25014q() {
        return this.f6127A;
    }

    /* renamed from: r */
    public int m25013r() {
        return this.f6128B;
    }

    /* renamed from: s */
    public int m25012s() {
        return this.f6129C;
    }

    /* renamed from: t */
    public int m25011t() {
        return this.f6133G;
    }

    /* renamed from: u */
    public ColorStateList m25010u() {
        return this.f6147y;
    }

    /* renamed from: v */
    public ColorStateList m25009v() {
        return this.f6148z;
    }

    /* renamed from: w */
    public InterfaceC0093j m25008w(ViewGroup viewGroup) {
        if (this.f6138p == null) {
            NavigationMenuView navigationMenuView = (NavigationMenuView) this.f6144v.inflate(a21.design_navigation_menu, viewGroup, false);
            this.f6138p = navigationMenuView;
            navigationMenuView.setAccessibilityDelegateCompat(new C1001h(this.f6138p));
            if (this.f6143u == null) {
                this.f6143u = new C0996c();
            }
            int i = this.f6136J;
            if (i != -1) {
                this.f6138p.setOverScrollMode(i);
            }
            this.f6139q = (LinearLayout) this.f6144v.inflate(a21.design_navigation_item_header, (ViewGroup) this.f6138p, false);
            this.f6138p.setAdapter(this.f6143u);
        }
        return this.f6138p;
    }

    /* renamed from: x */
    public View m25007x(int i) {
        View inflate = this.f6144v.inflate(i, (ViewGroup) this.f6139q, false);
        m25022h(inflate);
        return inflate;
    }

    /* renamed from: y */
    public void m25006y(boolean z) {
        if (this.f6132F != z) {
            this.f6132F = z;
            m25027L();
        }
    }

    /* renamed from: z */
    public void m25005z(C0086g c0086g) {
        this.f6143u.m24998G(c0086g);
    }
}
