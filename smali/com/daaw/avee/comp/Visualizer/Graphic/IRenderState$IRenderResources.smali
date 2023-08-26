.class public interface abstract Lcom/daaw/avee/comp/Visualizer/Graphic/IRenderState$IRenderResources;
.super Ljava/lang/Object;
.source "IRenderState.java"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/daaw/avee/comp/Visualizer/Graphic/IRenderState;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x609
    name = "IRenderResources"
.end annotation


# virtual methods
.method public abstract getAtlasTexRoundSegment()Lcom/daaw/avee/comp/Visualizer/Graphic/AtlasTexture;
.end method

.method public abstract getAtlasTexSquareSegment()Lcom/daaw/avee/comp/Visualizer/Graphic/AtlasTexture;
.end method

.method public abstract getAtlasTexSquareYSidesSegment()Lcom/daaw/avee/comp/Visualizer/Graphic/AtlasTexture;
.end method

.method public abstract getAtlasTexWhite()Lcom/daaw/avee/comp/Visualizer/Graphic/AtlasTexture;
.end method

.method public abstract getMeter()Lcom/daaw/avee/comp/Visualizer/Meter;
.end method

.method public abstract getVisualizationData()Lcom/daaw/avee/comp/Visualizer/InternalVisualizationDataProvider;
.end method
