package com.daaw.avee.comp.Common.PrControls;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.widget.ImageButton;
import com.daaw.avee.Common.Events.WeakEventR;
import com.daaw.avee.Common.Events.WeakEventR2;
import com.daaw.avee.ContextData;
/* loaded from: classes.dex */
public class PrImageButton extends ImageButton {
    public static final WeakEventR<Boolean> onRequest = new WeakEventR<>();
    public static final WeakEventR2<ContextData, PrImageButton, Boolean> onTouch = new WeakEventR2<>();

    public PrImageButton(Context context, AttributeSet attributeSet, int i, int i2) {
        super(context, attributeSet, i, i2);
    }

    public PrImageButton(Context context) {
        super(context);
    }

    public PrImageButton(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public PrImageButton(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }

    @Override // android.view.View
    public boolean onTouchEvent(MotionEvent motionEvent) {
        if ((motionEvent.getActionMasked() == 0 || motionEvent.getActionMasked() == 5) && onTouch.invoke(new ContextData(this), this, false).booleanValue()) {
            return true;
        }
        return super.onTouchEvent(motionEvent);
    }

    @Override // android.widget.ImageView, android.view.View
    protected void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        setEnabled(onRequest.invoke(false).booleanValue());
        Drawable drawableBg = PrResources.getDrawableBg();
        if (drawableBg != null) {
            int intrinsicWidth = drawableBg.getIntrinsicWidth();
            int width = canvas.getWidth() - getPaddingRight();
            int paddingTop = getPaddingTop();
            drawableBg.setBounds(width - intrinsicWidth, paddingTop, width, intrinsicWidth + paddingTop);
            drawableBg.draw(canvas);
        }
    }
}
