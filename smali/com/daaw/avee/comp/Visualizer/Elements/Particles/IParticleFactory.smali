.class public interface abstract Lcom/daaw/avee/comp/Visualizer/Elements/Particles/IParticleFactory;
.super Ljava/lang/Object;
.source "IParticleFactory.java"

# interfaces
.implements Lcom/daaw/avee/comp/Visualizer/Elements/Base/ICustomizable;


# virtual methods
.method public abstract allocateParticle()Lcom/daaw/avee/comp/Visualizer/Elements/Particles/IParticle;
.end method

.method public abstract emitParticleMaybe(Lcom/daaw/avee/comp/Visualizer/Graphic/RenderState;Lcom/daaw/avee/comp/Visualizer/Elements/Particles/IParticle;Lcom/daaw/avee/Common/Vec3f;Lcom/daaw/avee/Common/Vec3f;)Z
.end method

.method public abstract getTrailLength()F
.end method
