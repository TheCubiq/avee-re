package xyz.danoz.recyclerviewfastscroller.vertical;

import android.content.Context;
import android.util.AttributeSet;
import xyz.danoz.recyclerviewfastscroller.AbsRecyclerViewFastScroller;
import xyz.danoz.recyclerviewfastscroller.R;
import xyz.danoz.recyclerviewfastscroller.RecyclerViewScroller;
import xyz.danoz.recyclerviewfastscroller.calculation.VerticalScrollBoundsProvider;
import xyz.danoz.recyclerviewfastscroller.calculation.position.VerticalScreenPositionCalculator;
import xyz.danoz.recyclerviewfastscroller.calculation.progress.TouchableScrollProgressCalculator;
import xyz.danoz.recyclerviewfastscroller.calculation.progress.VerticalLinearLayoutManagerScrollProgressCalculator;
import xyz.danoz.recyclerviewfastscroller.calculation.progress.VerticalScrollProgressCalculator;
/* loaded from: classes2.dex */
public class VerticalRecyclerViewFastScroller extends AbsRecyclerViewFastScroller implements RecyclerViewScroller {
    private VerticalScreenPositionCalculator mScreenPositionCalculator;
    private VerticalScrollProgressCalculator mScrollProgressCalculator;

    public VerticalRecyclerViewFastScroller(Context context) {
        this(context, null);
    }

    public VerticalRecyclerViewFastScroller(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public VerticalRecyclerViewFastScroller(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }

    @Override // xyz.danoz.recyclerviewfastscroller.AbsRecyclerViewFastScroller
    protected int getLayoutResourceId() {
        return R.layout.vertical_recycler_fast_scroller_layout;
    }

    @Override // xyz.danoz.recyclerviewfastscroller.AbsRecyclerViewFastScroller
    protected TouchableScrollProgressCalculator getScrollProgressCalculator() {
        return this.mScrollProgressCalculator;
    }

    @Override // xyz.danoz.recyclerviewfastscroller.AbsRecyclerViewFastScroller
    public void moveHandleToPosition(float f) {
        if (this.mScreenPositionCalculator == null) {
            return;
        }
        this.mHandle.setY(this.mScreenPositionCalculator.getYPositionFromScrollProgress(f));
    }

    @Override // xyz.danoz.recyclerviewfastscroller.AbsRecyclerViewFastScroller
    protected void onCreateScrollProgressCalculator() {
        VerticalScrollBoundsProvider verticalScrollBoundsProvider = new VerticalScrollBoundsProvider(this.mBar.getY(), (this.mBar.getY() + this.mBar.getHeight()) - this.mHandle.getHeight());
        this.mScrollProgressCalculator = new VerticalLinearLayoutManagerScrollProgressCalculator(verticalScrollBoundsProvider);
        this.mScreenPositionCalculator = new VerticalScreenPositionCalculator(verticalScrollBoundsProvider);
    }
}
