package com.google.android.material.datepicker;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.util.AttributeSet;
import android.view.KeyEvent;
import android.view.View;
import android.widget.GridView;
import android.widget.ListAdapter;
import com.daaw.C1820jd;
import com.daaw.C3388w;
import com.daaw.C3654y;
import com.daaw.fu1;
import com.daaw.m11;
import com.daaw.oq1;
import com.daaw.ov0;
import com.daaw.xs1;
import java.util.Calendar;
/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes2.dex */
public final class MaterialCalendarGridView extends GridView {

    /* renamed from: p */
    public final Calendar f37433p;

    /* renamed from: q */
    public final boolean f37434q;

    /* renamed from: com.google.android.material.datepicker.MaterialCalendarGridView$a */
    /* loaded from: classes2.dex */
    public class C4057a extends C3388w {
        public C4057a() {
        }

        @Override // com.daaw.C3388w
        /* renamed from: g */
        public void mo161g(View view, C3654y c3654y) {
            super.mo161g(view, c3654y);
            c3654y.m4331d0(null);
        }
    }

    public MaterialCalendarGridView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public MaterialCalendarGridView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f37433p = oq1.m14076k();
        if (C4072b.m530k2(getContext())) {
            setNextFocusLeftId(m11.cancel_button);
            setNextFocusRightId(m11.confirm_button);
        }
        this.f37434q = C4072b.m529l2(getContext());
        xs1.m4702r0(this, new C4057a());
    }

    /* renamed from: c */
    public static int m590c(View view) {
        return view.getLeft() + (view.getWidth() / 2);
    }

    /* renamed from: d */
    public static boolean m589d(Long l, Long l2, Long l3, Long l4) {
        return l == null || l2 == null || l3 == null || l4 == null || l3.longValue() > l2.longValue() || l4.longValue() < l.longValue();
    }

    /* renamed from: a */
    public final void m592a(int i, Rect rect) {
        int m520b;
        if (i == 33) {
            m520b = getAdapter2().m513i();
        } else if (i != 130) {
            super.onFocusChanged(true, i, rect);
            return;
        } else {
            m520b = getAdapter2().m520b();
        }
        setSelection(m520b);
    }

    @Override // android.widget.GridView, android.widget.AdapterView
    /* renamed from: b */
    public C4077c getAdapter2() {
        return (C4077c) super.getAdapter();
    }

    @Override // android.widget.AbsListView, android.view.ViewGroup, android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        getAdapter2().notifyDataSetChanged();
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        int m521a;
        int m590c;
        int m521a2;
        int m590c2;
        int width;
        int i;
        MaterialCalendarGridView materialCalendarGridView = this;
        super.onDraw(canvas);
        C4077c adapter2 = getAdapter2();
        DateSelector<?> dateSelector = adapter2.f37504q;
        C1820jd c1820jd = adapter2.f37506s;
        Long item = adapter2.getItem(adapter2.m520b());
        Long item2 = adapter2.getItem(adapter2.m513i());
        for (ov0<Long, Long> ov0Var : dateSelector.m603e()) {
            Long l = ov0Var.f22030a;
            if (l != null) {
                if (ov0Var.f22031b != null) {
                    long longValue = l.longValue();
                    long longValue2 = ov0Var.f22031b.longValue();
                    if (!m589d(item, item2, Long.valueOf(longValue), Long.valueOf(longValue2))) {
                        boolean m22259d = fu1.m22259d(this);
                        if (longValue < item.longValue()) {
                            m521a = adapter2.m520b();
                            if (adapter2.m516f(m521a)) {
                                m590c = 0;
                            } else {
                                View childAt = materialCalendarGridView.getChildAt(m521a - 1);
                                m590c = !m22259d ? childAt.getRight() : childAt.getLeft();
                            }
                        } else {
                            materialCalendarGridView.f37433p.setTimeInMillis(longValue);
                            m521a = adapter2.m521a(materialCalendarGridView.f37433p.get(5));
                            m590c = m590c(materialCalendarGridView.getChildAt(m521a));
                        }
                        if (longValue2 > item2.longValue()) {
                            m521a2 = Math.min(adapter2.m513i(), getChildCount() - 1);
                            if (adapter2.m515g(m521a2)) {
                                m590c2 = getWidth();
                            } else {
                                View childAt2 = materialCalendarGridView.getChildAt(m521a2);
                                m590c2 = !m22259d ? childAt2.getRight() : childAt2.getLeft();
                            }
                        } else {
                            materialCalendarGridView.f37433p.setTimeInMillis(longValue2);
                            m521a2 = adapter2.m521a(materialCalendarGridView.f37433p.get(5));
                            m590c2 = m590c(materialCalendarGridView.getChildAt(m521a2));
                        }
                        int itemId = (int) adapter2.getItemId(m521a);
                        int itemId2 = (int) adapter2.getItemId(m521a2);
                        while (itemId <= itemId2) {
                            int numColumns = getNumColumns() * itemId;
                            int numColumns2 = (getNumColumns() + numColumns) - 1;
                            View childAt3 = materialCalendarGridView.getChildAt(numColumns);
                            int top = childAt3.getTop() + c1820jd.f14991a.m19924c();
                            int bottom = childAt3.getBottom() - c1820jd.f14991a.m19925b();
                            if (m22259d) {
                                int i2 = m521a2 > numColumns2 ? 0 : m590c2;
                                width = numColumns > m521a ? getWidth() : m590c;
                                i = i2;
                            } else {
                                i = numColumns > m521a ? 0 : m590c;
                                width = m521a2 > numColumns2 ? getWidth() : m590c2;
                            }
                            canvas.drawRect(i, top, width, bottom, c1820jd.f14998h);
                            itemId++;
                            materialCalendarGridView = this;
                            adapter2 = adapter2;
                        }
                    }
                }
            }
            materialCalendarGridView = this;
        }
    }

    @Override // android.widget.GridView, android.widget.AbsListView, android.view.View
    public void onFocusChanged(boolean z, int i, Rect rect) {
        if (z) {
            m592a(i, rect);
        } else {
            super.onFocusChanged(false, i, rect);
        }
    }

    @Override // android.widget.GridView, android.widget.AbsListView, android.view.View, android.view.KeyEvent.Callback
    public boolean onKeyDown(int i, KeyEvent keyEvent) {
        if (super.onKeyDown(i, keyEvent)) {
            if (getSelectedItemPosition() == -1 || getSelectedItemPosition() >= getAdapter2().m520b()) {
                return true;
            }
            if (19 == i) {
                setSelection(getAdapter2().m520b());
                return true;
            }
            return false;
        }
        return false;
    }

    @Override // android.widget.GridView, android.widget.AbsListView, android.view.View
    public void onMeasure(int i, int i2) {
        if (!this.f37434q) {
            super.onMeasure(i, i2);
            return;
        }
        super.onMeasure(i, View.MeasureSpec.makeMeasureSpec(16777215, Integer.MIN_VALUE));
        getLayoutParams().height = getMeasuredHeight();
    }

    @Override // android.widget.AdapterView
    public final void setAdapter(ListAdapter listAdapter) {
        if (!(listAdapter instanceof C4077c)) {
            throw new IllegalArgumentException(String.format("%1$s must have its Adapter set to a %2$s", MaterialCalendarGridView.class.getCanonicalName(), C4077c.class.getCanonicalName()));
        }
        super.setAdapter(listAdapter);
    }

    @Override // android.widget.GridView, android.widget.AdapterView
    public void setSelection(int i) {
        if (i < getAdapter2().m520b()) {
            i = getAdapter2().m520b();
        }
        super.setSelection(i);
    }
}
