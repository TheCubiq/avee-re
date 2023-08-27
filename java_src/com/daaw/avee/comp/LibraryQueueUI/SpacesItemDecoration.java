package com.daaw.avee.comp.LibraryQueueUI;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
/* loaded from: classes.dex */
public class SpacesItemDecoration extends RecyclerView.ItemDecoration {
    private Paint myPaint;
    private int space;

    public SpacesItemDecoration(int i, int i2) {
        Paint paint = new Paint();
        this.myPaint = paint;
        this.space = i;
        paint.setColor(i2);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.ItemDecoration
    public void onDraw(Canvas canvas, RecyclerView recyclerView, RecyclerView.State state) {
        int paddingLeft = recyclerView.getPaddingLeft();
        int width = recyclerView.getWidth() - recyclerView.getPaddingRight();
        int childCount = recyclerView.getChildCount();
        for (int i = 0; i < childCount - 1; i++) {
            View childAt = recyclerView.getChildAt(i);
            int bottom = childAt.getBottom() + ((RecyclerView.LayoutParams) childAt.getLayoutParams()).bottomMargin;
            canvas.drawRect(paddingLeft, bottom, width, this.space + bottom, this.myPaint);
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.ItemDecoration
    public void getItemOffsets(Rect rect, View view, RecyclerView recyclerView, RecyclerView.State state) {
        rect.left = 0;
        rect.right = 0;
        rect.bottom = this.space;
        if (recyclerView.getChildAdapterPosition(view) == 0) {
            rect.top = this.space;
        }
    }
}
