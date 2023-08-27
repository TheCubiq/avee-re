package com.daaw.avee.comp.Visualizer.Elements.Particles.Remove;

import android.graphics.RectF;
import com.daaw.avee.Common.Vec3f;
import com.daaw.avee.comp.Visualizer.CustomPropertiesList;
import com.daaw.avee.comp.Visualizer.Elements.Base.IArea;
import java.util.Random;
/* loaded from: classes.dex */
public class AreaVerticalLine implements IArea {
    public static final String typeName = "Line";
    public static final String typeNameAlias = "VerticalLine";
    private Random randomGenerator = new Random();

    @Override // com.daaw.avee.comp.Visualizer.Elements.Base.ICustomizable
    public void onApplyCustomization(CustomPropertiesList customPropertiesList) {
    }

    @Override // com.daaw.avee.comp.Visualizer.Elements.Base.ICustomizable
    public void onReadCustomization(CustomPropertiesList customPropertiesList) {
    }

    @Override // com.daaw.avee.comp.Visualizer.Elements.Base.IArea
    public void getRandomPointInArea(RectF rectF, Vec3f vec3f, Vec3f vec3f2, boolean z) {
        float nextFloat = this.randomGenerator.nextFloat();
        vec3f.x = rectF.centerX();
        vec3f.y = rectF.top + (rectF.height() * nextFloat);
        vec3f.z = 0.0f;
        vec3f2.x = 1.0f;
        vec3f2.y = 0.0f;
        vec3f2.z = 0.0f;
    }
}
