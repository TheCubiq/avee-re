package com.daaw.avee.comp.Visualizer.Elements;

import com.daaw.avee.comp.Visualizer.CustomPropertiesList;
/* loaded from: classes.dex */
public class FpsTextElement extends TextElement {
    private static int color2 = -2136997888;
    private static int textBlendMode = 4;
    public static final String typeName = "StatText";

    @Override // com.daaw.avee.comp.Visualizer.Elements.TextElement, com.daaw.avee.comp.Visualizer.Elements.Base.Element
    public String getElementTypeName() {
        return typeName;
    }

    public FpsTextElement() {
        setColor(color2);
        setBlendMode(textBlendMode);
        setFontSize(28);
        setPosition(0.05f, 1.0f);
        setLocalPosition(0.0f, 1.7f);
        setPositionUniform(true, false);
        setText("fps:{Fps} flush:{StatFlush} res:{WaitResLoad},{ResLoad},{GradualResLoad} rt:{RTSwitch}");
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.daaw.avee.comp.Visualizer.Elements.TextElement, com.daaw.avee.comp.Visualizer.Elements.Base.Element
    public void onApplyCustomization(CustomPropertiesList customPropertiesList) {
        super.onApplyCustomization(customPropertiesList);
    }
}
