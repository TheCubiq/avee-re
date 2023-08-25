package androidx.appcompat.view.menu;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import androidx.appcompat.view.menu.InterfaceC0093j;
import java.util.ArrayList;
/* renamed from: androidx.appcompat.view.menu.d */
/* loaded from: classes.dex */
public class C0081d extends BaseAdapter {

    /* renamed from: p */
    public C0082e f358p;

    /* renamed from: q */
    public int f359q = -1;

    /* renamed from: r */
    public boolean f360r;

    /* renamed from: s */
    public final boolean f361s;

    /* renamed from: t */
    public final LayoutInflater f362t;

    /* renamed from: u */
    public final int f363u;

    public C0081d(C0082e c0082e, LayoutInflater layoutInflater, boolean z, int i) {
        this.f361s = z;
        this.f362t = layoutInflater;
        this.f358p = c0082e;
        this.f363u = i;
        m30271a();
    }

    /* renamed from: a */
    public void m30271a() {
        C0086g m30220x = this.f358p.m30220x();
        if (m30220x != null) {
            ArrayList<C0086g> m30266B = this.f358p.m30266B();
            int size = m30266B.size();
            for (int i = 0; i < size; i++) {
                if (m30266B.get(i) == m30220x) {
                    this.f359q = i;
                    return;
                }
            }
        }
        this.f359q = -1;
    }

    /* renamed from: b */
    public C0082e m30270b() {
        return this.f358p;
    }

    @Override // android.widget.Adapter
    /* renamed from: c */
    public C0086g getItem(int i) {
        ArrayList<C0086g> m30266B = this.f361s ? this.f358p.m30266B() : this.f358p.m30262G();
        int i2 = this.f359q;
        if (i2 >= 0 && i >= i2) {
            i++;
        }
        return m30266B.get(i);
    }

    /* renamed from: d */
    public void m30268d(boolean z) {
        this.f360r = z;
    }

    @Override // android.widget.Adapter
    public int getCount() {
        ArrayList<C0086g> m30266B = this.f361s ? this.f358p.m30266B() : this.f358p.m30262G();
        int i = this.f359q;
        int size = m30266B.size();
        return i < 0 ? size : size - 1;
    }

    @Override // android.widget.Adapter
    public long getItemId(int i) {
        return i;
    }

    @Override // android.widget.Adapter
    public View getView(int i, View view, ViewGroup viewGroup) {
        if (view == null) {
            view = this.f362t.inflate(this.f363u, viewGroup, false);
        }
        int groupId = getItem(i).getGroupId();
        int i2 = i - 1;
        ListMenuItemView listMenuItemView = (ListMenuItemView) view;
        listMenuItemView.setGroupDividerEnabled(this.f358p.mo30172H() && groupId != (i2 >= 0 ? getItem(i2).getGroupId() : groupId));
        InterfaceC0093j.InterfaceC0094a interfaceC0094a = (InterfaceC0093j.InterfaceC0094a) view;
        if (this.f360r) {
            listMenuItemView.setForceShowIcon(true);
        }
        interfaceC0094a.mo348e(getItem(i), 0);
        return view;
    }

    @Override // android.widget.BaseAdapter
    public void notifyDataSetChanged() {
        m30271a();
        super.notifyDataSetChanged();
    }
}
