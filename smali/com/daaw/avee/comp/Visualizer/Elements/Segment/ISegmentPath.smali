.class public interface abstract Lcom/daaw/avee/comp/Visualizer/Elements/Segment/ISegmentPath;
.super Ljava/lang/Object;
.source "ISegmentPath.java"

# interfaces
.implements Lcom/daaw/avee/comp/Visualizer/Elements/Base/ICustomizable;


# virtual methods
.method public abstract getPathLength(Landroid/graphics/RectF;I)F
.end method

.method public abstract getPointOnPath(ZIILandroid/graphics/RectF;FLandroid/graphics/PointF;Landroid/graphics/PointF;)I
.end method

.method public abstract getPreferredPointCount(Landroid/graphics/RectF;)I
.end method

.method public abstract process(Lcom/daaw/avee/comp/Visualizer/Graphic/IRenderState;)V
.end method
