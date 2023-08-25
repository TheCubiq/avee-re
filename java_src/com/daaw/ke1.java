package com.daaw;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
/* loaded from: classes.dex */
public class ke1 extends RecyclerView.n {
    public Paint a;
    public int b;

    public ke1(int i, int i2) {
        Paint paint = new Paint();
        this.a = paint;
        this.b = i;
        paint.setColor(i2);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.n
    public void e(Rect rect, View view, RecyclerView recyclerView, RecyclerView.z zVar) {
        rect.left = 0;
        rect.right = 0;
        rect.bottom = this.b;
        if (recyclerView.d0(view) == 0) {
            rect.top = this.b;
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.n
    public void g(Canvas canvas, RecyclerView recyclerView, RecyclerView.z zVar) {
        int paddingLeft = recyclerView.getPaddingLeft();
        int width = recyclerView.getWidth() - recyclerView.getPaddingRight();
        int childCount = recyclerView.getChildCount();
        for (int i = 0; i < childCount - 1; i++) {
            View childAt = recyclerView.getChildAt(i);
            int bottom = childAt.getBottom() + ((ViewGroup.MarginLayoutParams) ((RecyclerView.p) childAt.getLayoutParams())).bottomMargin;
            canvas.drawRect(paddingLeft, bottom, width, this.b + bottom, this.a);
        }
    }
}
