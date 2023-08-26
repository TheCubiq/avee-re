package com.daaw.avee.comp.Visualizer.Elements.Particles;

import android.graphics.RectF;
import com.daaw.avee.Common.Vec2f;
import com.daaw.avee.Common.Vec3f;
import com.daaw.avee.comp.Visualizer.CustomPropertiesList;
import com.daaw.avee.comp.Visualizer.Elements.Base.IArea;
import java.util.Random;
/* loaded from: classes.dex */
public class AreaRect implements IArea {
    public static final String typeName = "Rectangle";
    private Random randomGenerator = new Random();
    private float vectorAngle = 0.0f;
    private float vectorAngleZ = 1.0f;
    private Vec2f vector = new Vec2f(0.0f, 0.0f);
    private boolean useRandomVectorInstead = false;
    private boolean relativeToCenter = false;

    public AreaRect() {
        setVectorAngle(270.0f);
    }

    public AreaRect setUseRandomVectorInstead(boolean z) {
        this.useRandomVectorInstead = z;
        return this;
    }

    public AreaRect setVectorRelativeToCenter(boolean z) {
        this.relativeToCenter = z;
        return this;
    }

    public AreaRect setVectorAngle(float f) {
        this.vectorAngle = f;
        this.vector = Vec2f.fromAngleRad(f);
        return this;
    }

    public float getVectorAngle() {
        return this.vectorAngle;
    }

    public AreaRect setVectorZ(float f) {
        this.vectorAngleZ = f;
        return this;
    }

    public float getVectorZ() {
        return this.vectorAngleZ;
    }

    @Override // com.daaw.avee.comp.Visualizer.Elements.Base.IArea
    public void getRandomPointInArea(RectF rectF, Vec3f vec3f, Vec3f vec3f2, boolean z) {
        float nextFloat = this.randomGenerator.nextFloat();
        float nextFloat2 = this.randomGenerator.nextFloat();
        vec3f.x = rectF.left + (rectF.width() * nextFloat);
        vec3f.y = rectF.top + (rectF.height() * nextFloat2);
        vec3f.z = 0.0f;
        vec3f2.z = 0.0f;
        if (this.useRandomVectorInstead) {
            float nextFloat3 = this.randomGenerator.nextFloat();
            float nextFloat4 = this.randomGenerator.nextFloat();
            vec3f2.x = (nextFloat3 * 2.0f) - 1.0f;
            vec3f2.y = (nextFloat4 * 2.0f) - 1.0f;
        } else if (this.relativeToCenter) {
            Vec2f.fromAngleXY(vec3f2, ((float) Math.toRadians(this.vectorAngle)) + Vec2f.getAngle((nextFloat * 2.0f) - 1.0f, (nextFloat2 * 2.0f) - 1.0f));
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
        this.relativeToCenter = customPropertiesList.getPropertyBool("vectorRelativeToCenter", false);
        this.useRandomVectorInstead = customPropertiesList.getPropertyBool("useRandomVectorInstead", false);
        setVectorAngle(customPropertiesList.getPropertyFloat("vectorAngle", 270.0f));
        setVectorZ(customPropertiesList.getPropertyFloat("vectorAngleZ", 1.0f));
    }

    @Override // com.daaw.avee.comp.Visualizer.Elements.Base.ICustomizable
    public void onReadCustomization(CustomPropertiesList customPropertiesList) {
        customPropertiesList.putPropertyBool("vectorRelativeToCenter", this.relativeToCenter, "misc");
        customPropertiesList.putPropertyBool("useRandomVectorInstead", this.useRandomVectorInstead, "misc");
        customPropertiesList.putPropertyFloatAsRange("vectorAngle", getVectorAngle(), "misc", 0.0f, 360.0f);
        customPropertiesList.putPropertyFloatAsRange("vectorAngleZ", getVectorZ(), "misc", -1.0f, 1.0f);
    }
}
