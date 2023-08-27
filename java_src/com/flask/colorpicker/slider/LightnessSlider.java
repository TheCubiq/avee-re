package com.flask.colorpicker.slider;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.util.AttributeSet;
import com.flask.colorpicker.ColorPickerView;
import com.flask.colorpicker.Utils;
import com.flask.colorpicker.builder.PaintBuilder;
/* loaded from: classes.dex */
public class LightnessSlider extends AbsCustomSlider {
    private Paint barPaint;
    private Paint clearingStroke;
    private int color;
    private ColorPickerView colorPicker;
    private Paint solid;

    public LightnessSlider(Context context) {
        super(context);
        this.barPaint = PaintBuilder.newPaint().build();
        this.solid = PaintBuilder.newPaint().build();
        this.clearingStroke = PaintBuilder.newPaint().color(-1).xPerMode(PorterDuff.Mode.CLEAR).build();
    }

    public LightnessSlider(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.barPaint = PaintBuilder.newPaint().build();
        this.solid = PaintBuilder.newPaint().build();
        this.clearingStroke = PaintBuilder.newPaint().color(-1).xPerMode(PorterDuff.Mode.CLEAR).build();
    }

    public LightnessSlider(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.barPaint = PaintBuilder.newPaint().build();
        this.solid = PaintBuilder.newPaint().build();
        this.clearingStroke = PaintBuilder.newPaint().color(-1).xPerMode(PorterDuff.Mode.CLEAR).build();
    }

    @Override // com.flask.colorpicker.slider.AbsCustomSlider
    protected void drawBar(Canvas canvas) {
        int width = canvas.getWidth();
        int height = canvas.getHeight();
        float[] fArr = new float[3];
        Color.colorToHSV(this.color, fArr);
        int max = Math.max(2, width / 256);
        int i = 0;
        while (i <= width) {
            float f = i;
            fArr[2] = f / (width - 1);
            this.barPaint.setColor(Color.HSVToColor(fArr));
            i += max;
            canvas.drawRect(f, 0.0f, i, height, this.barPaint);
        }
    }

    @Override // com.flask.colorpicker.slider.AbsCustomSlider
    protected void onValueChanged(float f) {
        ColorPickerView colorPickerView = this.colorPicker;
        if (colorPickerView != null) {
            colorPickerView.setLightness(f);
        }
    }

    @Override // com.flask.colorpicker.slider.AbsCustomSlider
    protected void drawHandle(Canvas canvas, float f, float f2) {
        this.solid.setColor(Utils.colorAtLightness(this.color, this.value));
        if (this.showBorder) {
            canvas.drawCircle(f, f2, this.handleRadius, this.clearingStroke);
        }
        canvas.drawCircle(f, f2, this.handleRadius * 0.75f, this.solid);
    }

    public void setColorPicker(ColorPickerView colorPickerView) {
        this.colorPicker = colorPickerView;
    }

    public void setColor(int i) {
        this.color = i;
        this.value = Utils.lightnessOfColor(i);
        if (this.bar != null) {
            updateBar();
            invalidate();
        }
    }
}
