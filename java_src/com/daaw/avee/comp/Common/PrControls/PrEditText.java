package com.daaw.avee.comp.Common.PrControls;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.MotionEvent;
import androidx.appcompat.widget.AppCompatEditText;
import com.daaw.avee.Common.Events.WeakEventR;
import com.daaw.avee.Common.Events.WeakEventR2;
import com.daaw.avee.ContextData;
/* loaded from: classes.dex */
public class PrEditText extends AppCompatEditText {
    public static final WeakEventR<Boolean> hasPremium = new WeakEventR<>();
    public static final WeakEventR2<ContextData, PrEditText, Boolean> onTouch = new WeakEventR2<>();

    public PrEditText(Context context) {
        super(context);
    }

    public PrEditText(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public PrEditText(Context context, AttributeSet attributeSet, int i) {
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
        boolean booleanValue = hasPremium.invoke(false).booleanValue();
        setEnabled(booleanValue);
        setClickable(booleanValue);
        setEnabled(booleanValue);
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
