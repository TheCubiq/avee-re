package com.daaw.avee.comp.VisualUI;

import android.content.Context;
import android.graphics.Rect;
import android.util.AttributeSet;
import android.view.View;
/* loaded from: classes.dex */
public class MyViewFitsSystemWindows extends View {
    public MyViewFitsSystemWindows(Context context) {
        super(context);
    }

    public MyViewFitsSystemWindows(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public MyViewFitsSystemWindows(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }

    @Override // android.view.View
    protected boolean fitSystemWindows(Rect rect) {
        return super.fitSystemWindows(rect);
    }

    @Override // android.view.View
    public void requestFitSystemWindows() {
        super.requestFitSystemWindows();
    }

    @Override // android.view.View
    public boolean getFitsSystemWindows() {
        return super.getFitsSystemWindows();
    }
}
