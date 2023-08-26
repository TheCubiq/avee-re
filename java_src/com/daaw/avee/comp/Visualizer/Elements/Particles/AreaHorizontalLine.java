package com.daaw.avee.comp.Visualizer.Elements.Particles;

import android.graphics.RectF;
import com.daaw.avee.Common.Vec2f;
import com.daaw.avee.Common.Vec3f;
import com.daaw.avee.comp.Visualizer.CustomPropertiesList;
import com.daaw.avee.comp.Visualizer.Elements.Base.IArea;
import java.util.Random;
/* loaded from: classes.dex */
public class AreaHorizontalLine implements IArea {
    public static final String typeName = "HorizontalLine";
    private Random randomGenerator = new Random();
    private float vectorAngle = 0.0f;
    private float vectorAngleZ = 1.0f;
    private Vec2f vector = new Vec2f(0.0f, 0.0f);
    private boolean useRandomVectorInstead = true;
    private boolean verticalOrientation = false;

    public AreaHorizontalLine() {
        setVectorAngle(270.0f);
    }

    public AreaHorizontalLine setUseRandomVectorInstead(boolean z) {
        this.useRandomVectorInstead = z;
        return this;
    }

    public AreaHorizontalLine setVectorAngle(float f) {
        this.vectorAngle = f;
        this.vector = Vec2f.fromAngleRad(f);
        return this;
    }

    public float getVectorAngle() {
        return this.vectorAngle;
    }

    public AreaHorizontalLine setVerticalOrientation(boolean z) {
        this.verticalOrientation = z;
        return this;
    }

    public boolean getVerticalOrientation() {
        return this.verticalOrientation;
    }

    public AreaHorizontalLine setVectorZ(float f) {
        this.vectorAngleZ = f;
        return this;
    }

    public float getVectorZ() {
        return this.vectorAngleZ;
    }

    @Override // com.daaw.avee.comp.Visualizer.Elements.Base.IArea
    public void getRandomPointInArea(RectF rectF, Vec3f vec3f, Vec3f vec3f2, boolean z) {
        float nextFloat = this.randomGenerator.nextFloat();
        vec3f2.z = 0.0f;
        if (this.verticalOrientation) {
            vec3f.x = rectF.centerX();
            vec3f.y = rectF.top + (rectF.height() * nextFloat);
            vec3f.z = 0.0f;
        } else {
            vec3f.x = rectF.left + (rectF.width() * nextFloat);
            vec3f.y = rectF.centerY();
            vec3f.z = 0.0f;
        }
        if (this.useRandomVectorInstead) {
            float nextFloat2 = this.randomGenerator.nextFloat();
            float nextFloat3 = this.randomGenerator.nextFloat();
            vec3f2.x = (nextFloat2 * 2.0f) - 1.0f;
            vec3f2.y = (nextFloat3 * 2.0f) - 1.0f;
        } else {
            vec3f2.x = this.vector.x;
            vec3f2.y = this.vector.y;
        }
        if (z) {
            float abs = 1.0f - Math.abs(this.vectorAngleZ);
            vec3f2.x *= abs;
            vec3f2.y *= abs;
            vec3f2.z = this.vectorAngleZ;
            vec3f2.normalize();
        }
    }

    @Override // com.daaw.avee.comp.Visualizer.Elements.Base.ICustomizable
    public void onApplyCustomization(CustomPropertiesList customPropertiesList) {
        setVerticalOrientation(customPropertiesList.getPropertyBool("verticalOrientation", false));
        this.useRandomVectorInstead = customPropertiesList.getPropertyBool("useRandomVectorInstead", true);
        setVectorAngle(customPropertiesList.getPropertyFloat("vectorAngle", 270.0f));
        setVectorZ(customPropertiesList.getPropertyFloat("vectorAngleZ", 1.0f));
    }

    @Override // com.daaw.avee.comp.Visualizer.Elements.Base.ICustomizable
    public void onReadCustomization(CustomPropertiesList customPropertiesList) {
        customPropertiesList.putPropertyBool("verticalOrientation", getVerticalOrientation(), "misc");
        customPropertiesList.putPropertyBool("useRandomVectorInstead", this.useRandomVectorInstead, "misc");
        customPropertiesList.putPropertyFloatAsRange("vectorAngle", getVectorAngle(), "misc", 0.0f, 360.0f);
        customPropertiesList.putPropertyFloatAsRange("vectorAngleZ", getVectorZ(), "misc", -1.0f, 1.0f);
    }
}
