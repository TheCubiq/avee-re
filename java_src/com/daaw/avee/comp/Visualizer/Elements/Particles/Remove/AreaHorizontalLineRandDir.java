package com.daaw.avee.comp.Visualizer.Elements.Particles.Remove;

import android.graphics.RectF;
import com.daaw.avee.Common.Vec3f;
import com.daaw.avee.comp.Visualizer.CustomPropertiesList;
import com.daaw.avee.comp.Visualizer.Elements.Base.IArea;
import java.util.Random;
/* loaded from: classes.dex */
public class AreaHorizontalLineRandDir implements IArea {
    public static final String typeName = "HorizontalLineRandom";
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
        float nextFloat2 = this.randomGenerator.nextFloat();
        vec3f.x = rectF.left + (rectF.width() * nextFloat);
        vec3f.y = rectF.centerY();
        vec3f.z = 0.0f;
        vec3f2.x = (nextFloat * 2.0f) - 1.0f;
        vec3f2.y = (nextFloat2 * 2.0f) - 1.0f;
        vec3f2.z = 0.0f;
    }
}
