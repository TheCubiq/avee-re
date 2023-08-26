package com.daaw.avee.comp.Visualizer.Elements.Particles;

import com.daaw.avee.Common.Vec2f;
import com.daaw.avee.Common.Vec3f;
import com.daaw.avee.comp.Visualizer.Graphic.AtlasTexture;
import com.daaw.avee.comp.Visualizer.Graphic.VMatrix;
/* loaded from: classes.dex */
public interface IParticle {
    boolean getAlive();

    float[] getColorArgb();

    Vec3f getPosition();

    float getRot();

    float getSizeX();

    float getSizeY();

    AtlasTexture getTextureFrame();

    boolean getVisible();

    void setAlive(boolean z);

    void setVisible(boolean z);

    boolean update(float f, float f2, Vec2f vec2f, Vec2f vec2f2, float f3, float f4, Vec2f vec2f3, float f5, float f6, Vec2f vec2f4, VMatrix vMatrix, float f7);

    void updateVisible(float f);
}
