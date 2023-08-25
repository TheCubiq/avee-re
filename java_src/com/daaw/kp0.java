package com.daaw;

import android.content.Context;
import android.graphics.Rect;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.FrameLayout;
import android.widget.HeaderViewListAdapter;
import android.widget.ListAdapter;
import android.widget.PopupWindow;
import androidx.appcompat.view.menu.C0081d;
import androidx.appcompat.view.menu.C0082e;
import androidx.appcompat.view.menu.C0086g;
import androidx.appcompat.view.menu.InterfaceC0091i;
/* loaded from: classes.dex */
public abstract class kp0 implements vc1, InterfaceC0091i, AdapterView.OnItemClickListener {

    /* renamed from: p */
    public Rect f16609p;

    /* renamed from: A */
    public static C0081d m17565A(ListAdapter listAdapter) {
        return listAdapter instanceof HeaderViewListAdapter ? (C0081d) ((HeaderViewListAdapter) listAdapter).getWrappedAdapter() : (C0081d) listAdapter;
    }

    /* renamed from: q */
    public static int m17558q(ListAdapter listAdapter, ViewGroup viewGroup, Context context, int i) {
        int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(0, 0);
        int makeMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(0, 0);
        int count = listAdapter.getCount();
        View view = null;
        int i2 = 0;
        int i3 = 0;
        for (int i4 = 0; i4 < count; i4++) {
            int itemViewType = listAdapter.getItemViewType(i4);
            if (itemViewType != i3) {
                view = null;
                i3 = itemViewType;
            }
            if (viewGroup == null) {
                viewGroup = new FrameLayout(context);
            }
            view = listAdapter.getView(i4, view, viewGroup);
            view.measure(makeMeasureSpec, makeMeasureSpec2);
            int measuredWidth = view.getMeasuredWidth();
            if (measuredWidth >= i) {
                return i;
            }
            if (measuredWidth > i2) {
                i2 = measuredWidth;
            }
        }
        return i2;
    }

    /* renamed from: z */
    public static boolean m17549z(C0082e c0082e) {
        int size = c0082e.size();
        for (int i = 0; i < size; i++) {
            MenuItem item = c0082e.getItem(i);
            if (item.isVisible() && item.getIcon() != null) {
                return true;
            }
        }
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
        return 0;
    }

    @Override // androidx.appcompat.view.menu.InterfaceC0091i
    /* renamed from: i */
    public void mo17562i(Context context, C0082e c0082e) {
    }

    /* renamed from: n */
    public abstract void mo17561n(C0082e c0082e);

    /* renamed from: o */
    public boolean mo17560o() {
        return true;
    }

    @Override // android.widget.AdapterView.OnItemClickListener
    public void onItemClick(AdapterView<?> adapterView, View view, int i, long j) {
        ListAdapter listAdapter = (ListAdapter) adapterView.getAdapter();
        m17565A(listAdapter).f358p.m30258O((MenuItem) listAdapter.getItem(i), this, mo17560o() ? 0 : 4);
    }

    /* renamed from: p */
    public Rect m17559p() {
        return this.f16609p;
    }

    /* renamed from: r */
    public abstract void mo17557r(View view);

    /* renamed from: s */
    public void m17556s(Rect rect) {
        this.f16609p = rect;
    }

    /* renamed from: t */
    public abstract void mo17555t(boolean z);

    /* renamed from: u */
    public abstract void mo17554u(int i);

    /* renamed from: v */
    public abstract void mo17553v(int i);

    /* renamed from: w */
    public abstract void mo17552w(PopupWindow.OnDismissListener onDismissListener);

    /* renamed from: x */
    public abstract void mo17551x(boolean z);

    /* renamed from: y */
    public abstract void mo17550y(int i);
}
