package com.google.android.material.datepicker;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.util.AttributeSet;
import android.view.KeyEvent;
import android.view.View;
import android.widget.GridView;
import android.widget.ListAdapter;
import com.daaw.fu1;
import com.daaw.jd;
import com.daaw.m11;
import com.daaw.oq1;
import com.daaw.ov0;
import com.daaw.w;
import com.daaw.xs1;
import com.daaw.y;
import java.util.Calendar;
/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes2.dex */
public final class MaterialCalendarGridView extends GridView {
    public final Calendar p;
    public final boolean q;

    /* loaded from: classes2.dex */
    public class a extends w {
        public a() {
        }

        @Override // com.daaw.w
        public void g(View view, y yVar) {
            super.g(view, yVar);
            yVar.d0(null);
        }
    }

    public MaterialCalendarGridView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public MaterialCalendarGridView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.p = oq1.k();
        if (b.k2(getContext())) {
            setNextFocusLeftId(m11.cancel_button);
            setNextFocusRightId(m11.confirm_button);
        }
        this.q = b.l2(getContext());
        xs1.r0(this, new a());
    }

    public static int c(View view) {
        return view.getLeft() + (view.getWidth() / 2);
    }

    public static boolean d(Long l, Long l2, Long l3, Long l4) {
        return l == null || l2 == null || l3 == null || l4 == null || l3.longValue() > l2.longValue() || l4.longValue() < l.longValue();
    }

    public final void a(int i, Rect rect) {
        int b;
        if (i == 33) {
            b = getAdapter2().i();
        } else if (i != 130) {
            super.onFocusChanged(true, i, rect);
            return;
        } else {
            b = getAdapter2().b();
        }
        setSelection(b);
    }

    @Override // android.widget.GridView, android.widget.AdapterView
    /* renamed from: b */
    public c getAdapter2() {
        return (c) super.getAdapter();
    }

    @Override // android.widget.AbsListView, android.view.ViewGroup, android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        getAdapter2().notifyDataSetChanged();
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        int a2;
        int c;
        int a3;
        int c2;
        int width;
        int i;
        MaterialCalendarGridView materialCalendarGridView = this;
        super.onDraw(canvas);
        c adapter2 = getAdapter2();
        DateSelector<?> dateSelector = adapter2.q;
        jd jdVar = adapter2.s;
        Long item = adapter2.getItem(adapter2.b());
        Long item2 = adapter2.getItem(adapter2.i());
        for (ov0<Long, Long> ov0Var : dateSelector.e()) {
            Long l = ov0Var.a;
            if (l != null) {
                if (ov0Var.b != null) {
                    long longValue = l.longValue();
                    long longValue2 = ov0Var.b.longValue();
                    if (!d(item, item2, Long.valueOf(longValue), Long.valueOf(longValue2))) {
                        boolean d = fu1.d(this);
                        if (longValue < item.longValue()) {
                            a2 = adapter2.b();
                            if (adapter2.f(a2)) {
                                c = 0;
                            } else {
                                View childAt = materialCalendarGridView.getChildAt(a2 - 1);
                                c = !d ? childAt.getRight() : childAt.getLeft();
                            }
                        } else {
                            materialCalendarGridView.p.setTimeInMillis(longValue);
                            a2 = adapter2.a(materialCalendarGridView.p.get(5));
                            c = c(materialCalendarGridView.getChildAt(a2));
                        }
                        if (longValue2 > item2.longValue()) {
                            a3 = Math.min(adapter2.i(), getChildCount() - 1);
                            if (adapter2.g(a3)) {
                                c2 = getWidth();
                            } else {
                                View childAt2 = materialCalendarGridView.getChildAt(a3);
                                c2 = !d ? childAt2.getRight() : childAt2.getLeft();
                            }
                        } else {
                            materialCalendarGridView.p.setTimeInMillis(longValue2);
                            a3 = adapter2.a(materialCalendarGridView.p.get(5));
                            c2 = c(materialCalendarGridView.getChildAt(a3));
                        }
                        int itemId = (int) adapter2.getItemId(a2);
                        int itemId2 = (int) adapter2.getItemId(a3);
                        while (itemId <= itemId2) {
                            int numColumns = getNumColumns() * itemId;
                            int numColumns2 = (getNumColumns() + numColumns) - 1;
                            View childAt3 = materialCalendarGridView.getChildAt(numColumns);
                            int top = childAt3.getTop() + jdVar.a.c();
                            int bottom = childAt3.getBottom() - jdVar.a.b();
                            if (d) {
                                int i2 = a3 > numColumns2 ? 0 : c2;
                                width = numColumns > a2 ? getWidth() : c;
                                i = i2;
                            } else {
                                i = numColumns > a2 ? 0 : c;
                                width = a3 > numColumns2 ? getWidth() : c2;
                            }
                            canvas.drawRect(i, top, width, bottom, jdVar.h);
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
            a(i, rect);
        } else {
            super.onFocusChanged(false, i, rect);
        }
    }

    @Override // android.widget.GridView, android.widget.AbsListView, android.view.View, android.view.KeyEvent.Callback
    public boolean onKeyDown(int i, KeyEvent keyEvent) {
        if (super.onKeyDown(i, keyEvent)) {
            if (getSelectedItemPosition() == -1 || getSelectedItemPosition() >= getAdapter2().b()) {
                return true;
            }
            if (19 == i) {
                setSelection(getAdapter2().b());
                return true;
            }
            return false;
        }
        return false;
    }

    @Override // android.widget.GridView, android.widget.AbsListView, android.view.View
    public void onMeasure(int i, int i2) {
        if (!this.q) {
            super.onMeasure(i, i2);
            return;
        }
        super.onMeasure(i, View.MeasureSpec.makeMeasureSpec(16777215, Integer.MIN_VALUE));
        getLayoutParams().height = getMeasuredHeight();
    }

    @Override // android.widget.AdapterView
    public final void setAdapter(ListAdapter listAdapter) {
        if (!(listAdapter instanceof c)) {
            throw new IllegalArgumentException(String.format("%1$s must have its Adapter set to a %2$s", MaterialCalendarGridView.class.getCanonicalName(), c.class.getCanonicalName()));
        }
        super.setAdapter(listAdapter);
    }

    @Override // android.widget.GridView, android.widget.AdapterView
    public void setSelection(int i) {
        if (i < getAdapter2().b()) {
            i = getAdapter2().b();
        }
        super.setSelection(i);
    }
}
