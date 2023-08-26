package com.daaw.avee.comp.Visualizer.Elements.Particles;

import com.daaw.avee.Common.Vec2f;
import com.daaw.avee.comp.Visualizer.Elements.Base.ICustomizable;
/* loaded from: classes.dex */
public interface IForceField extends ICustomizable {
    float getVelocityAndFactor(float f, float f2, Vec2f vec2f);
}
