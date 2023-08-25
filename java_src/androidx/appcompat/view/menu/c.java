package androidx.appcompat.view.menu;

import android.content.Context;
import android.os.Bundle;
import android.os.Parcelable;
import android.util.SparseArray;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.BaseAdapter;
import android.widget.ListAdapter;
import androidx.appcompat.view.menu.i;
import androidx.appcompat.view.menu.j;
import com.daaw.c21;
import java.util.ArrayList;
/* loaded from: classes.dex */
public class c implements i, AdapterView.OnItemClickListener {
    public Context p;
    public LayoutInflater q;
    public e r;
    public ExpandedMenuView s;
    public int t;
    public int u;
    public int v;
    public i.a w;
    public a x;
    public int y;

    /* loaded from: classes.dex */
    public class a extends BaseAdapter {
        public int p = -1;

        public a() {
            a();
        }

        public void a() {
            g x = c.this.r.x();
            if (x != null) {
                ArrayList<g> B = c.this.r.B();
                int size = B.size();
                for (int i = 0; i < size; i++) {
                    if (B.get(i) == x) {
                        this.p = i;
                        return;
                    }
                }
            }
            this.p = -1;
        }

        @Override // android.widget.Adapter
        /* renamed from: b */
        public g getItem(int i) {
            ArrayList<g> B = c.this.r.B();
            int i2 = i + c.this.t;
            int i3 = this.p;
            if (i3 >= 0 && i2 >= i3) {
                i2++;
            }
            return B.get(i2);
        }

        @Override // android.widget.Adapter
        public int getCount() {
            int size = c.this.r.B().size() - c.this.t;
            return this.p < 0 ? size : size - 1;
        }

        @Override // android.widget.Adapter
        public long getItemId(int i) {
            return i;
        }

        @Override // android.widget.Adapter
        public View getView(int i, View view, ViewGroup viewGroup) {
            if (view == null) {
                c cVar = c.this;
                view = cVar.q.inflate(cVar.v, viewGroup, false);
            }
            ((j.a) view).e(getItem(i), 0);
            return view;
        }

        @Override // android.widget.BaseAdapter
        public void notifyDataSetChanged() {
            a();
            super.notifyDataSetChanged();
        }
    }

    public c(int i, int i2) {
        this.v = i;
        this.u = i2;
    }

    public c(Context context, int i) {
        this(i, 0);
        this.p = context;
        this.q = LayoutInflater.from(context);
    }

    public ListAdapter a() {
        if (this.x == null) {
            this.x = new a();
        }
        return this.x;
    }

    @Override // androidx.appcompat.view.menu.i
    public void b(e eVar, boolean z) {
        i.a aVar = this.w;
        if (aVar != null) {
            aVar.b(eVar, z);
        }
    }

    @Override // androidx.appcompat.view.menu.i
    public void c(boolean z) {
        a aVar = this.x;
        if (aVar != null) {
            aVar.notifyDataSetChanged();
        }
    }

    @Override // androidx.appcompat.view.menu.i
    public boolean d() {
        return false;
    }

    @Override // androidx.appcompat.view.menu.i
    public boolean e(e eVar, g gVar) {
        return false;
    }

    @Override // androidx.appcompat.view.menu.i
    public boolean f(e eVar, g gVar) {
        return false;
    }

    @Override // androidx.appcompat.view.menu.i
    public void g(i.a aVar) {
        this.w = aVar;
    }

    @Override // androidx.appcompat.view.menu.i
    public int getId() {
        return this.y;
    }

    public j h(ViewGroup viewGroup) {
        if (this.s == null) {
            this.s = (ExpandedMenuView) this.q.inflate(c21.abc_expanded_menu_layout, viewGroup, false);
            if (this.x == null) {
                this.x = new a();
            }
            this.s.setAdapter((ListAdapter) this.x);
            this.s.setOnItemClickListener(this);
        }
        return this.s;
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x0029  */
    /* JADX WARN: Removed duplicated region for block: B:15:? A[RETURN, SYNTHETIC] */
    @Override // androidx.appcompat.view.menu.i
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void i(android.content.Context r3, androidx.appcompat.view.menu.e r4) {
        /*
            r2 = this;
            int r0 = r2.u
            if (r0 == 0) goto L14
            android.view.ContextThemeWrapper r0 = new android.view.ContextThemeWrapper
            int r1 = r2.u
            r0.<init>(r3, r1)
            r2.p = r0
            android.view.LayoutInflater r3 = android.view.LayoutInflater.from(r0)
        L11:
            r2.q = r3
            goto L23
        L14:
            android.content.Context r0 = r2.p
            if (r0 == 0) goto L23
            r2.p = r3
            android.view.LayoutInflater r0 = r2.q
            if (r0 != 0) goto L23
            android.view.LayoutInflater r3 = android.view.LayoutInflater.from(r3)
            goto L11
        L23:
            r2.r = r4
            androidx.appcompat.view.menu.c$a r3 = r2.x
            if (r3 == 0) goto L2c
            r3.notifyDataSetChanged()
        L2c:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.view.menu.c.i(android.content.Context, androidx.appcompat.view.menu.e):void");
    }

    @Override // androidx.appcompat.view.menu.i
    public void j(Parcelable parcelable) {
        k((Bundle) parcelable);
    }

    public void k(Bundle bundle) {
        SparseArray<Parcelable> sparseParcelableArray = bundle.getSparseParcelableArray("android:menu:list");
        if (sparseParcelableArray != null) {
            this.s.restoreHierarchyState(sparseParcelableArray);
        }
    }

    @Override // androidx.appcompat.view.menu.i
    public boolean l(l lVar) {
        if (lVar.hasVisibleItems()) {
            new f(lVar).d(null);
            i.a aVar = this.w;
            if (aVar != null) {
                aVar.c(lVar);
                return true;
            }
            return true;
        }
        return false;
    }

    @Override // androidx.appcompat.view.menu.i
    public Parcelable m() {
        if (this.s == null) {
            return null;
        }
        Bundle bundle = new Bundle();
        n(bundle);
        return bundle;
    }

    public void n(Bundle bundle) {
        SparseArray<Parcelable> sparseArray = new SparseArray<>();
        ExpandedMenuView expandedMenuView = this.s;
        if (expandedMenuView != null) {
            expandedMenuView.saveHierarchyState(sparseArray);
        }
        bundle.putSparseParcelableArray("android:menu:list", sparseArray);
    }

    @Override // android.widget.AdapterView.OnItemClickListener
    public void onItemClick(AdapterView<?> adapterView, View view, int i, long j) {
        this.r.O(this.x.getItem(i), this, 0);
    }
}
