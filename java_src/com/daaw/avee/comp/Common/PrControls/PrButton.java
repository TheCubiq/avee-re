package com.daaw.avee.comp.Common.PrControls;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.widget.Button;
import com.daaw.avee.Common.Events.WeakEventR;
import com.daaw.avee.Common.Events.WeakEventR2;
import com.daaw.avee.ContextData;
/* loaded from: classes.dex */
public class PrButton extends Button {
    public static final WeakEventR<Boolean> hasPremium = new WeakEventR<>();
    public static final WeakEventR2<ContextData, PrButton, Boolean> onTouch = new WeakEventR2<>();

    public PrButton(Context context, AttributeSet attributeSet, int i, int i2) {
        super(context, attributeSet, i, i2);
    }

    public PrButton(Context context) {
        super(context);
    }

    public PrButton(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public PrButton(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }

    @Override // android.widget.TextView, android.view.View
    public boolean onTouchEvent(MotionEvent motionEvent) {
        if ((motionEvent.getActionMasked() == 0 || motionEvent.getActionMasked() == 5) && onTouch.invoke(new ContextData(this), this, false).booleanValue()) {
            return true;
        }
        return super.onTouchEvent(motionEvent);
    }

    @Override // android.widget.TextView, android.view.View
    protected void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        setEnabled(hasPremium.invoke(false).booleanValue());
        Drawable drawableBg = PrResources.getDrawableBg();
        if (drawableBg != null) {
            int intrinsicWidth = drawableBg.getIntrinsicWidth();
            int width = canvas.getWidth() - getCompoundPaddingRight();
            int compoundPaddingTop = getCompoundPaddingTop();
            drawableBg.setBounds(width - intrinsicWidth, compoundPaddingTop, width, intrinsicWidth + compoundPaddingTop);
            drawableBg.draw(canvas);
        }
    }
}
