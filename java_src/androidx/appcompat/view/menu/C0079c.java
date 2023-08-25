package androidx.appcompat.view.menu;

import android.content.Context;
import android.os.Bundle;
import android.os.Parcelable;
import android.util.SparseArray;
import android.view.ContextThemeWrapper;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.BaseAdapter;
import android.widget.ListAdapter;
import androidx.appcompat.view.menu.InterfaceC0091i;
import androidx.appcompat.view.menu.InterfaceC0093j;
import com.daaw.c21;
import java.util.ArrayList;
/* renamed from: androidx.appcompat.view.menu.c */
/* loaded from: classes.dex */
public class C0079c implements InterfaceC0091i, AdapterView.OnItemClickListener {

    /* renamed from: p */
    public Context f346p;

    /* renamed from: q */
    public LayoutInflater f347q;

    /* renamed from: r */
    public C0082e f348r;

    /* renamed from: s */
    public ExpandedMenuView f349s;

    /* renamed from: t */
    public int f350t;

    /* renamed from: u */
    public int f351u;

    /* renamed from: v */
    public int f352v;

    /* renamed from: w */
    public InterfaceC0091i.InterfaceC0092a f353w;

    /* renamed from: x */
    public C0080a f354x;

    /* renamed from: y */
    public int f355y;

    /* renamed from: androidx.appcompat.view.menu.c$a */
    /* loaded from: classes.dex */
    public class C0080a extends BaseAdapter {

        /* renamed from: p */
        public int f356p = -1;

        public C0080a() {
            m30273a();
        }

        /* renamed from: a */
        public void m30273a() {
            C0086g m30220x = C0079c.this.f348r.m30220x();
            if (m30220x != null) {
                ArrayList<C0086g> m30266B = C0079c.this.f348r.m30266B();
                int size = m30266B.size();
                for (int i = 0; i < size; i++) {
                    if (m30266B.get(i) == m30220x) {
                        this.f356p = i;
                        return;
                    }
                }
            }
            this.f356p = -1;
        }

        @Override // android.widget.Adapter
        /* renamed from: b */
        public C0086g getItem(int i) {
            ArrayList<C0086g> m30266B = C0079c.this.f348r.m30266B();
            int i2 = i + C0079c.this.f350t;
            int i3 = this.f356p;
            if (i3 >= 0 && i2 >= i3) {
                i2++;
            }
            return m30266B.get(i2);
        }

        @Override // android.widget.Adapter
        public int getCount() {
            int size = C0079c.this.f348r.m30266B().size() - C0079c.this.f350t;
            return this.f356p < 0 ? size : size - 1;
        }

        @Override // android.widget.Adapter
        public long getItemId(int i) {
            return i;
        }

        @Override // android.widget.Adapter
        public View getView(int i, View view, ViewGroup viewGroup) {
            if (view == null) {
                C0079c c0079c = C0079c.this;
                view = c0079c.f347q.inflate(c0079c.f352v, viewGroup, false);
            }
            ((InterfaceC0093j.InterfaceC0094a) view).mo348e(getItem(i), 0);
            return view;
        }

        @Override // android.widget.BaseAdapter
        public void notifyDataSetChanged() {
            m30273a();
            super.notifyDataSetChanged();
        }
    }

    public C0079c(int i, int i2) {
        this.f352v = i;
        this.f351u = i2;
    }

    public C0079c(Context context, int i) {
        this(i, 0);
        this.f346p = context;
        this.f347q = LayoutInflater.from(context);
    }

    /* renamed from: a */
    public ListAdapter m30277a() {
        if (this.f354x == null) {
            this.f354x = new C0080a();
        }
        return this.f354x;
    }

    @Override // androidx.appcompat.view.menu.InterfaceC0091i
    /* renamed from: b */
    public void mo25025b(C0082e c0082e, boolean z) {
        InterfaceC0091i.InterfaceC0092a interfaceC0092a = this.f353w;
        if (interfaceC0092a != null) {
            interfaceC0092a.mo24218b(c0082e, z);
        }
    }

    @Override // androidx.appcompat.view.menu.InterfaceC0091i
    /* renamed from: c */
    public void mo25024c(boolean z) {
        C0080a c0080a = this.f354x;
        if (c0080a != null) {
            c0080a.notifyDataSetChanged();
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
    /* renamed from: g */
    public void mo30174g(InterfaceC0091i.InterfaceC0092a interfaceC0092a) {
        this.f353w = interfaceC0092a;
    }

    @Override // androidx.appcompat.view.menu.InterfaceC0091i
    public int getId() {
        return this.f355y;
    }

    /* renamed from: h */
    public InterfaceC0093j m30276h(ViewGroup viewGroup) {
        if (this.f349s == null) {
            this.f349s = (ExpandedMenuView) this.f347q.inflate(c21.abc_expanded_menu_layout, viewGroup, false);
            if (this.f354x == null) {
                this.f354x = new C0080a();
            }
            this.f349s.setAdapter((ListAdapter) this.f354x);
            this.f349s.setOnItemClickListener(this);
        }
        return this.f349s;
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x0029  */
    /* JADX WARN: Removed duplicated region for block: B:15:? A[RETURN, SYNTHETIC] */
    @Override // androidx.appcompat.view.menu.InterfaceC0091i
    /* renamed from: i */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void mo17562i(Context context, C0082e c0082e) {
        LayoutInflater from;
        C0080a c0080a;
        if (this.f351u == 0) {
            if (this.f346p != null) {
                this.f346p = context;
                if (this.f347q == null) {
                    from = LayoutInflater.from(context);
                }
            }
            this.f348r = c0082e;
            c0080a = this.f354x;
            if (c0080a == null) {
                c0080a.notifyDataSetChanged();
                return;
            }
            return;
        }
        ContextThemeWrapper contextThemeWrapper = new ContextThemeWrapper(context, this.f351u);
        this.f346p = contextThemeWrapper;
        from = LayoutInflater.from(contextThemeWrapper);
        this.f347q = from;
        this.f348r = c0082e;
        c0080a = this.f354x;
        if (c0080a == null) {
        }
    }

    @Override // androidx.appcompat.view.menu.InterfaceC0091i
    /* renamed from: j */
    public void mo25021j(Parcelable parcelable) {
        m30275k((Bundle) parcelable);
    }

    /* renamed from: k */
    public void m30275k(Bundle bundle) {
        SparseArray<Parcelable> sparseParcelableArray = bundle.getSparseParcelableArray("android:menu:list");
        if (sparseParcelableArray != null) {
            this.f349s.restoreHierarchyState(sparseParcelableArray);
        }
    }

    @Override // androidx.appcompat.view.menu.InterfaceC0091i
    /* renamed from: l */
    public boolean mo25019l(SubMenuC0098l subMenuC0098l) {
        if (subMenuC0098l.hasVisibleItems()) {
            new DialogInterface$OnKeyListenerC0085f(subMenuC0098l).m30216d(null);
            InterfaceC0091i.InterfaceC0092a interfaceC0092a = this.f353w;
            if (interfaceC0092a != null) {
                interfaceC0092a.mo24217c(subMenuC0098l);
                return true;
            }
            return true;
        }
        return false;
    }

    @Override // androidx.appcompat.view.menu.InterfaceC0091i
    /* renamed from: m */
    public Parcelable mo25018m() {
        if (this.f349s == null) {
            return null;
        }
        Bundle bundle = new Bundle();
        m30274n(bundle);
        return bundle;
    }

    /* renamed from: n */
    public void m30274n(Bundle bundle) {
        SparseArray<Parcelable> sparseArray = new SparseArray<>();
        ExpandedMenuView expandedMenuView = this.f349s;
        if (expandedMenuView != null) {
            expandedMenuView.saveHierarchyState(sparseArray);
        }
        bundle.putSparseParcelableArray("android:menu:list", sparseArray);
    }

    @Override // android.widget.AdapterView.OnItemClickListener
    public void onItemClick(AdapterView<?> adapterView, View view, int i, long j) {
        this.f348r.m30258O(this.f354x.getItem(i), this, 0);
    }
}
