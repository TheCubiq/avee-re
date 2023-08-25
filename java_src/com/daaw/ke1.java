package com.daaw;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
/* loaded from: classes.dex */
public class ke1 extends RecyclerView.AbstractC0390n {

    /* renamed from: a */
    public Paint f16322a;

    /* renamed from: b */
    public int f16323b;

    public ke1(int i, int i2) {
        Paint paint = new Paint();
        this.f16322a = paint;
        this.f16323b = i;
        paint.setColor(i2);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC0390n
    /* renamed from: e */
    public void mo16521e(Rect rect, View view, RecyclerView recyclerView, RecyclerView.C0409z c0409z) {
        rect.left = 0;
        rect.right = 0;
        rect.bottom = this.f16323b;
        if (recyclerView.m28835d0(view) == 0) {
            rect.top = this.f16323b;
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC0390n
    /* renamed from: g */
    public void mo553g(Canvas canvas, RecyclerView recyclerView, RecyclerView.C0409z c0409z) {
        int paddingLeft = recyclerView.getPaddingLeft();
        int width = recyclerView.getWidth() - recyclerView.getPaddingRight();
        int childCount = recyclerView.getChildCount();
        for (int i = 0; i < childCount - 1; i++) {
            View childAt = recyclerView.getChildAt(i);
            int bottom = childAt.getBottom() + ((ViewGroup.MarginLayoutParams) ((RecyclerView.C0396p) childAt.getLayoutParams())).bottomMargin;
            canvas.drawRect(paddingLeft, bottom, width, this.f16323b + bottom, this.f16322a);
        }
    }
}
