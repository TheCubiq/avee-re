package androidx.appcompat.view.menu;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import androidx.appcompat.view.menu.j;
import java.util.ArrayList;
/* loaded from: classes.dex */
public class d extends BaseAdapter {
    public e p;
    public int q = -1;
    public boolean r;
    public final boolean s;
    public final LayoutInflater t;
    public final int u;

    public d(e eVar, LayoutInflater layoutInflater, boolean z, int i) {
        this.s = z;
        this.t = layoutInflater;
        this.p = eVar;
        this.u = i;
        a();
    }

    public void a() {
        g x = this.p.x();
        if (x != null) {
            ArrayList<g> B = this.p.B();
            int size = B.size();
            for (int i = 0; i < size; i++) {
                if (B.get(i) == x) {
                    this.q = i;
                    return;
                }
            }
        }
        this.q = -1;
    }

    public e b() {
        return this.p;
    }

    @Override // android.widget.Adapter
    /* renamed from: c */
    public g getItem(int i) {
        ArrayList<g> B = this.s ? this.p.B() : this.p.G();
        int i2 = this.q;
        if (i2 >= 0 && i >= i2) {
            i++;
        }
        return B.get(i);
    }

    public void d(boolean z) {
        this.r = z;
    }

    @Override // android.widget.Adapter
    public int getCount() {
        ArrayList<g> B = this.s ? this.p.B() : this.p.G();
        int i = this.q;
        int size = B.size();
        return i < 0 ? size : size - 1;
    }

    @Override // android.widget.Adapter
    public long getItemId(int i) {
        return i;
    }

    @Override // android.widget.Adapter
    public View getView(int i, View view, ViewGroup viewGroup) {
        if (view == null) {
            view = this.t.inflate(this.u, viewGroup, false);
        }
        int groupId = getItem(i).getGroupId();
        int i2 = i - 1;
        ListMenuItemView listMenuItemView = (ListMenuItemView) view;
        listMenuItemView.setGroupDividerEnabled(this.p.H() && groupId != (i2 >= 0 ? getItem(i2).getGroupId() : groupId));
        j.a aVar = (j.a) view;
        if (this.r) {
            listMenuItemView.setForceShowIcon(true);
        }
        aVar.e(getItem(i), 0);
        return view;
    }

    @Override // android.widget.BaseAdapter
    public void notifyDataSetChanged() {
        a();
        super.notifyDataSetChanged();
    }
}
