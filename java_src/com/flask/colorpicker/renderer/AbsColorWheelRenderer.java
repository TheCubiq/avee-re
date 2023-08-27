package com.flask.colorpicker.renderer;

import com.flask.colorpicker.ColorCircle;
import java.util.ArrayList;
import java.util.List;
/* loaded from: classes.dex */
public abstract class AbsColorWheelRenderer implements ColorWheelRenderer {
    protected List<ColorCircle> colorCircleList = new ArrayList();
    protected ColorWheelRenderOption colorWheelRenderOption;

    @Override // com.flask.colorpicker.renderer.ColorWheelRenderer
    public void initWith(ColorWheelRenderOption colorWheelRenderOption) {
        this.colorWheelRenderOption = colorWheelRenderOption;
        this.colorCircleList.clear();
    }

    @Override // com.flask.colorpicker.renderer.ColorWheelRenderer
    public ColorWheelRenderOption getRenderOption() {
        if (this.colorWheelRenderOption == null) {
            this.colorWheelRenderOption = new ColorWheelRenderOption();
        }
        return this.colorWheelRenderOption;
    }

    @Override // com.flask.colorpicker.renderer.ColorWheelRenderer
    public List<ColorCircle> getColorCircleList() {
        return this.colorCircleList;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public int getAlphaValueAsInt() {
        return Math.round(this.colorWheelRenderOption.alpha * 255.0f);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public int calcTotalCount(float f, float f2) {
        return Math.max(1, (int) ((3.063052912151454d / Math.asin(f2 / f)) + 0.5d));
    }
}
