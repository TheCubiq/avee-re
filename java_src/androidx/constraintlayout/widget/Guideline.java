package androidx.constraintlayout.widget;

import android.content.Context;
import android.graphics.Canvas;
import android.util.AttributeSet;
import android.view.View;
import androidx.constraintlayout.widget.ConstraintLayout;
/* loaded from: classes.dex */
public class Guideline extends View {
    public Guideline(Context context) {
        super(context);
        super.setVisibility(8);
    }

    public Guideline(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        super.setVisibility(8);
    }

    @Override // android.view.View
    public void draw(Canvas canvas) {
    }

    @Override // android.view.View
    public void onMeasure(int i, int i2) {
        setMeasuredDimension(0, 0);
    }

    public void setGuidelineBegin(int i) {
        ConstraintLayout.C0175b c0175b = (ConstraintLayout.C0175b) getLayoutParams();
        c0175b.f916a = i;
        setLayoutParams(c0175b);
    }

    public void setGuidelineEnd(int i) {
        ConstraintLayout.C0175b c0175b = (ConstraintLayout.C0175b) getLayoutParams();
        c0175b.f918b = i;
        setLayoutParams(c0175b);
    }

    public void setGuidelinePercent(float f) {
        ConstraintLayout.C0175b c0175b = (ConstraintLayout.C0175b) getLayoutParams();
        c0175b.f920c = f;
        setLayoutParams(c0175b);
    }

    @Override // android.view.View
    public void setVisibility(int i) {
    }
}
