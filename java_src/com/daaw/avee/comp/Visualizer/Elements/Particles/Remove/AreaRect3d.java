package com.daaw.avee.comp.Visualizer.Elements.Particles.Remove;

import android.graphics.RectF;
import com.daaw.avee.Common.Vec2f;
import com.daaw.avee.Common.Vec3f;
import com.daaw.avee.comp.Visualizer.CustomPropertiesList;
import com.daaw.avee.comp.Visualizer.Elements.Base.IArea;
import java.util.Random;
/* loaded from: classes.dex */
public class AreaRect3d implements IArea {
    public static final String typeName = "Rectangle3D";
    private Random randomGenerator = new Random();
    private float vectorAngle = 0.0f;
    private float vectorAngleZ = 1.0f;
    private Vec3f vector = new Vec3f(0.0f, 0.0f, 0.0f);
    private boolean useRandomVectorInstead = false;
    private boolean use3dVectorInstead = false;

    public AreaRect3d() {
        setVectorAngle(270.0f);
    }

    public AreaRect3d setUseRandomVectorInstead(boolean z) {
        this.useRandomVectorInstead = z;
        return this;
    }

    public AreaRect3d setUse3dVectorInstead(boolean z) {
        this.use3dVectorInstead = z;
        return this;
    }

    public AreaRect3d setVectorAngle(float f) {
        this.vectorAngle = f;
        updateVector();
        return this;
    }

    public AreaRect3d setVectorZ(float f) {
        this.vectorAngleZ = f;
        updateVector();
        return this;
    }

    private void updateVector() {
        Vec2f fromAngleRad = Vec2f.fromAngleRad(this.vectorAngle);
        float abs = 1.0f - Math.abs(this.vectorAngleZ);
        Vec3f vec3f = new Vec3f(fromAngleRad.x * abs, fromAngleRad.y * abs, this.vectorAngleZ);
        this.vector = vec3f;
        vec3f.normalize();
    }

    public float getVectorAngle() {
        return this.vectorAngle;
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
        vec3f2.z = this.vector.z;
        if (this.use3dVectorInstead) {
            vec3f2.x = (nextFloat * 2.0f) - 1.0f;
            vec3f2.y = (nextFloat2 * 2.0f) - 1.0f;
        } else if (this.useRandomVectorInstead) {
            float nextFloat3 = this.randomGenerator.nextFloat();
            float nextFloat4 = this.randomGenerator.nextFloat();
            vec3f2.x = (nextFloat3 * 2.0f) - 1.0f;
            vec3f2.y = (nextFloat4 * 2.0f) - 1.0f;
        } else {
            vec3f2.x = this.vector.x;
            vec3f2.y = this.vector.y;
        }
    }

    @Override // com.daaw.avee.comp.Visualizer.Elements.Base.ICustomizable
    public void onApplyCustomization(CustomPropertiesList customPropertiesList) {
        this.use3dVectorInstead = customPropertiesList.getPropertyBool("use3dVectorInstead", this.use3dVectorInstead);
        this.useRandomVectorInstead = customPropertiesList.getPropertyBool("useRandomVectorInstead", this.useRandomVectorInstead);
        setVectorAngle(customPropertiesList.getPropertyFloat("vectorAngle", getVectorAngle()));
        setVectorZ(customPropertiesList.getPropertyFloat("vectorAngleZ", getVectorZ()));
    }

    @Override // com.daaw.avee.comp.Visualizer.Elements.Base.ICustomizable
    public void onReadCustomization(CustomPropertiesList customPropertiesList) {
        customPropertiesList.putPropertyBool("use3dVectorInstead", this.use3dVectorInstead, "misc");
        customPropertiesList.putPropertyBool("useRandomVectorInstead", this.useRandomVectorInstead, "misc");
        customPropertiesList.putPropertyFloatAsRange("vectorAngle", getVectorAngle(), "misc", 0.0f, 360.0f);
        customPropertiesList.putPropertyFloatAsRange("vectorAngleZ", getVectorZ(), "misc", -1.0f, 1.0f);
    }
}
