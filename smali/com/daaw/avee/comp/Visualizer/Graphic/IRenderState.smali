.class public interface abstract Lcom/daaw/avee/comp/Visualizer/Graphic/IRenderState;
.super Ljava/lang/Object;
.source "IRenderState.java"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/daaw/avee/comp/Visualizer/Graphic/IRenderState$IRenderResources;
    }
.end annotation


# static fields
.field public static final edgeWidth:F = 1.5f


# virtual methods
.method public abstract bindFrameBuffer(Lmdesl/graphics/glutils/FrameBuffer;)V
.end method

.method public abstract frameResourcesLoadingAdd()V
.end method

.method public abstract getBufferRenderer()Lcom/daaw/avee/comp/Visualizer/Graphic/IBufferRenderer;
.end method

.method public abstract getFrameTimeF()F
.end method

.method public abstract getMultiThread()Z
.end method

.method public abstract getRenderEdges()Z
.end method

.method public abstract getRenderEdgesPaths()Z
.end method

.method public abstract getRes()Lcom/daaw/avee/comp/Visualizer/Graphic/IRenderState$IRenderResources;
.end method

.method public abstract getScreenHeight()I
.end method

.method public abstract getScreenWidth()I
.end method

.method public abstract getTotalFrameTimeF()F
.end method

.method public abstract setBlendMode(I)V
.end method

.method public abstract setTextureWrapping(I)V
.end method
