package xyz.danoz.recyclerviewfastscroller.calculation;
/* loaded from: classes2.dex */
public class VerticalScrollBoundsProvider {
    private final float mMaximumScrollY;
    private final float mMinimumScrollY;

    public VerticalScrollBoundsProvider(float f, float f2) {
        this.mMinimumScrollY = f;
        this.mMaximumScrollY = f2;
    }

    public float getMinimumScrollY() {
        return this.mMinimumScrollY;
    }

    public float getMaximumScrollY() {
        return this.mMaximumScrollY;
    }
}
