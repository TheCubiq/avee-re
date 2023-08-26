package com.daaw.avee.comp.Common.PrControls;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.MotionEvent;
import androidx.appcompat.widget.AppCompatCheckBox;
import com.daaw.avee.Common.Events.WeakEvent1;
import com.daaw.avee.Common.Events.WeakEventR;
import com.daaw.avee.Common.Events.WeakEventR1;
import com.daaw.avee.ContextData;
/* loaded from: classes.dex */
public class PrGreenCheckBox extends AppCompatCheckBox {
    public static final WeakEventR<Boolean> onRequest = new WeakEventR<>();
    public static final WeakEventR1<ContextData, Boolean> onTouch = new WeakEventR1<>();
    public static final WeakEvent1<Boolean> onChecked = new WeakEvent1<>();

    public PrGreenCheckBox(Context context) {
        super(context);
    }

    public PrGreenCheckBox(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public PrGreenCheckBox(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }

    @Override // android.widget.CompoundButton, android.widget.Checkable
    public void setChecked(boolean z) {
        super.setChecked(z);
        onChecked.invoke(Boolean.valueOf(z));
    }

    @Override // android.widget.TextView, android.view.View
    public boolean onTouchEvent(MotionEvent motionEvent) {
        if ((motionEvent.getActionMasked() == 0 || motionEvent.getActionMasked() == 5) && onTouch.invoke(new ContextData(this), false).booleanValue()) {
            return true;
        }
        return super.onTouchEvent(motionEvent);
    }

    @Override // android.widget.CompoundButton, android.widget.TextView, android.view.View
    protected void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        Drawable drawableRedBg = PrResources.getDrawableRedBg();
        if (drawableRedBg != null) {
            int intrinsicWidth = drawableRedBg.getIntrinsicWidth();
            int width = canvas.getWidth() - getCompoundPaddingRight();
            int compoundPaddingTop = getCompoundPaddingTop();
            drawableRedBg.setBounds(width - intrinsicWidth, compoundPaddingTop, width, intrinsicWidth + compoundPaddingTop);
            drawableRedBg.draw(canvas);
        }
    }
}
