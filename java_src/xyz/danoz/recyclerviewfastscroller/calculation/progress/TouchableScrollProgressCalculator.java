package xyz.danoz.recyclerviewfastscroller.calculation.progress;

import android.view.MotionEvent;
/* loaded from: classes2.dex */
public interface TouchableScrollProgressCalculator extends ScrollProgressCalculator {
    float calculateScrollProgress(MotionEvent motionEvent);
}
