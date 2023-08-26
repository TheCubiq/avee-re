.class public interface abstract Lcom/daaw/avee/comp/Visualizer/Elements/Segment/ISegmentDataProvider;
.super Ljava/lang/Object;
.source "ISegmentDataProvider.java"

# interfaces
.implements Lcom/daaw/avee/comp/Visualizer/Elements/Base/ICustomizable;
.implements Lcom/daaw/avee/comp/Visualizer/Elements/Base/IFrameDataProvider;


# virtual methods
.method public abstract createFrameValuesAccessorList(IIILcom/daaw/avee/Common/ISimpleListFloat;)Lcom/daaw/avee/Common/ISimpleListFloat;
.end method

.method public abstract getFrameValues(II)[F
.end method

.method public abstract process(Lcom/daaw/avee/comp/Visualizer/Graphic/IRenderState;Lcom/daaw/avee/comp/Visualizer/InternalVisualizationDataProvider;)V
.end method
