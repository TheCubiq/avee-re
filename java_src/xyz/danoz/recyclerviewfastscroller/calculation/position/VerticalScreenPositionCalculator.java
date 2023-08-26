package xyz.danoz.recyclerviewfastscroller.calculation.position;

import xyz.danoz.recyclerviewfastscroller.calculation.VerticalScrollBoundsProvider;
/* loaded from: classes2.dex */
public class VerticalScreenPositionCalculator {
    private final VerticalScrollBoundsProvider mVerticalScrollBoundsProvider;

    public VerticalScreenPositionCalculator(VerticalScrollBoundsProvider verticalScrollBoundsProvider) {
        this.mVerticalScrollBoundsProvider = verticalScrollBoundsProvider;
    }

    public float getYPositionFromScrollProgress(float f) {
        return Math.max(this.mVerticalScrollBoundsProvider.getMinimumScrollY(), Math.min(f * this.mVerticalScrollBoundsProvider.getMaximumScrollY(), this.mVerticalScrollBoundsProvider.getMaximumScrollY()));
    }
}
