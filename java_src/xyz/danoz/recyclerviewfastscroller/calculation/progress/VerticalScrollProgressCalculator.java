package xyz.danoz.recyclerviewfastscroller.calculation.progress;

import android.view.MotionEvent;
import xyz.danoz.recyclerviewfastscroller.calculation.VerticalScrollBoundsProvider;
/* loaded from: classes2.dex */
public abstract class VerticalScrollProgressCalculator implements TouchableScrollProgressCalculator {
    private final VerticalScrollBoundsProvider mScrollBoundsProvider;

    public VerticalScrollProgressCalculator(VerticalScrollBoundsProvider verticalScrollBoundsProvider) {
        this.mScrollBoundsProvider = verticalScrollBoundsProvider;
    }

    @Override // xyz.danoz.recyclerviewfastscroller.calculation.progress.TouchableScrollProgressCalculator
    public float calculateScrollProgress(MotionEvent motionEvent) {
        float y = motionEvent.getY();
        if (y <= this.mScrollBoundsProvider.getMinimumScrollY()) {
            return 0.0f;
        }
        if (y >= this.mScrollBoundsProvider.getMaximumScrollY()) {
            return 1.0f;
        }
        return y / this.mScrollBoundsProvider.getMaximumScrollY();
    }
}
