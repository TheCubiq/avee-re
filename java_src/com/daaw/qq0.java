package com.daaw;

import android.view.MotionEvent;
/* loaded from: classes.dex */
public final class qq0 {
    public static boolean a(MotionEvent motionEvent, int i) {
        return (motionEvent.getSource() & i) == i;
    }
}
