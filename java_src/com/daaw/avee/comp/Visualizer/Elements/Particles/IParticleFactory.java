package com.daaw.avee.comp.Visualizer.Elements.Particles;

import com.daaw.avee.Common.Vec3f;
import com.daaw.avee.comp.Visualizer.Elements.Base.ICustomizable;
import com.daaw.avee.comp.Visualizer.Graphic.RenderState;
/* loaded from: classes.dex */
public interface IParticleFactory extends ICustomizable {
    IParticle allocateParticle();

    boolean emitParticleMaybe(RenderState renderState, IParticle iParticle, Vec3f vec3f, Vec3f vec3f2);

    float getTrailLength();
}
