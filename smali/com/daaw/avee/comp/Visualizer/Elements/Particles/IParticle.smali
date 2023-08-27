.class public interface abstract Lcom/daaw/avee/comp/Visualizer/Elements/Particles/IParticle;
.super Ljava/lang/Object;
.source "IParticle.java"


# virtual methods
.method public abstract getAlive()Z
.end method

.method public abstract getColorArgb()[F
.end method

.method public abstract getPosition()Lcom/daaw/avee/Common/Vec3f;
.end method

.method public abstract getRot()F
.end method

.method public abstract getSizeX()F
.end method

.method public abstract getSizeY()F
.end method

.method public abstract getTextureFrame()Lcom/daaw/avee/comp/Visualizer/Graphic/AtlasTexture;
.end method

.method public abstract getVisible()Z
.end method

.method public abstract setAlive(Z)V
.end method

.method public abstract setVisible(Z)V
.end method

.method public abstract update(FFLcom/daaw/avee/Common/Vec2f;Lcom/daaw/avee/Common/Vec2f;FFLcom/daaw/avee/Common/Vec2f;FFLcom/daaw/avee/Common/Vec2f;Lcom/daaw/avee/comp/Visualizer/Graphic/VMatrix;F)Z
.end method

.method public abstract updateVisible(F)V
.end method
