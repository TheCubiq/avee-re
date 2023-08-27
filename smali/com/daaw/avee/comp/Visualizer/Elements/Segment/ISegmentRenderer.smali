.class public interface abstract Lcom/daaw/avee/comp/Visualizer/Elements/Segment/ISegmentRenderer;
.super Ljava/lang/Object;
.source "ISegmentRenderer.java"

# interfaces
.implements Lcom/daaw/avee/comp/Visualizer/Elements/Base/ICustomizable;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/daaw/avee/comp/Visualizer/Elements/Segment/ISegmentRenderer$DrawBatchDesc;,
        Lcom/daaw/avee/comp/Visualizer/Elements/Segment/ISegmentRenderer$DrawDesc;
    }
.end annotation


# virtual methods
.method public abstract drawSegment(Lcom/daaw/avee/comp/Visualizer/Graphic/RenderState;Lcom/daaw/avee/comp/Visualizer/Elements/Segment/ISegmentRenderer$DrawDesc;F)V
.end method

.method public abstract drawSegmentBatch(Lcom/daaw/avee/comp/Visualizer/Graphic/IRenderState;[Lcom/daaw/avee/comp/Visualizer/Elements/Segment/ISegmentRenderer$DrawBatchDesc;FFIF)V
.end method
