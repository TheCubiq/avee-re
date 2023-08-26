package com.flask.colorpicker.renderer;

import android.graphics.Color;
import android.graphics.Paint;
import com.flask.colorpicker.ColorCircle;
import com.flask.colorpicker.builder.PaintBuilder;
/* loaded from: classes.dex */
public class SimpleColorWheelRenderer extends AbsColorWheelRenderer {
    private Paint selectorFill = PaintBuilder.newPaint().build();
    private float[] hsv = new float[3];

    @Override // com.flask.colorpicker.renderer.ColorWheelRenderer
    public void draw() {
        int size = this.colorCircleList.size();
        float width = this.colorWheelRenderOption.targetCanvas.getWidth() / 2.0f;
        int i = this.colorWheelRenderOption.density;
        float f = this.colorWheelRenderOption.maxRadius;
        int i2 = 0;
        int i3 = 0;
        while (i2 < i) {
            float f2 = (i2 / (i - 1)) * f;
            float f3 = this.colorWheelRenderOption.cSize;
            int calcTotalCount = calcTotalCount(f2, f3);
            int i4 = 0;
            while (i4 < calcTotalCount) {
                double d = i4;
                Double.isNaN(d);
                double d2 = calcTotalCount;
                Double.isNaN(d2);
                Double.isNaN(d2);
                int i5 = i2;
                double d3 = (i2 + 1) % 2;
                Double.isNaN(d3);
                double d4 = ((d * 6.283185307179586d) / d2) + ((3.141592653589793d / d2) * d3);
                double d5 = f2;
                double cos = Math.cos(d4);
                Double.isNaN(d5);
                float f4 = ((float) (cos * d5)) + width;
                double sin = Math.sin(d4);
                Double.isNaN(d5);
                float f5 = ((float) (d5 * sin)) + width;
                float[] fArr = this.hsv;
                fArr[0] = (float) ((d4 * 180.0d) / 3.141592653589793d);
                fArr[1] = f2 / f;
                fArr[2] = this.colorWheelRenderOption.lightness;
                this.selectorFill.setColor(Color.HSVToColor(this.hsv));
                this.selectorFill.setAlpha(getAlphaValueAsInt());
                this.colorWheelRenderOption.targetCanvas.drawCircle(f4, f5, f3 - this.colorWheelRenderOption.strokeWidth, this.selectorFill);
                if (i3 >= size) {
                    this.colorCircleList.add(new ColorCircle(f4, f5, this.hsv));
                } else {
                    this.colorCircleList.get(i3).set(f4, f5, this.hsv);
                }
                i3++;
                i4++;
                i2 = i5;
            }
            i2++;
        }
    }
}
