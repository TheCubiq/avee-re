.class Lcom/daaw/avee/comp/Visualizer/VisualizerViewCore$1;
.super Ljava/lang/Object;
.source "VisualizerViewCore.java"

# interfaces
.implements Lcom/daaw/avee/comp/Visualizer/InternalVisualizationDataProvider;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/daaw/avee/comp/Visualizer/VisualizerViewCore;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic this$0:Lcom/daaw/avee/comp/Visualizer/VisualizerViewCore;


# direct methods
.method constructor <init>(Lcom/daaw/avee/comp/Visualizer/VisualizerViewCore;)V
    .locals 0

    .line 70
    iput-object p1, p0, Lcom/daaw/avee/comp/Visualizer/VisualizerViewCore$1;->this$0:Lcom/daaw/avee/comp/Visualizer/VisualizerViewCore;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onOffScreenContentRendered(Lmdesl/graphics/Texture;ZLjava/lang/String;)V
    .locals 1

    .line 130
    sget-object v0, Lcom/daaw/avee/comp/Visualizer/VisualizerViewCore;->onOffScreenContentRendered:Lcom/daaw/avee/Common/Events/WeakEvent3;

    invoke-static {p2}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object p2

    invoke-virtual {v0, p1, p2, p3}, Lcom/daaw/avee/Common/Events/WeakEvent3;->invoke(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)V

    return-void
.end method

.method public onRequestAlbumArtPathAndBitmap(Lcom/daaw/avee/comp/AlbumArt/ImageLoadedListener;Lcom/daaw/avee/comp/AlbumArt/AlbumArtRequest2;)V
    .locals 1

    .line 115
    sget-object v0, Lcom/daaw/avee/comp/Visualizer/VisualizerViewCore;->onRequestAlbumArtPathAndBitmap:Lcom/daaw/avee/Common/Events/WeakEvent2;

    invoke-virtual {v0, p1, p2}, Lcom/daaw/avee/Common/Events/WeakEvent2;->invoke(Ljava/lang/Object;Ljava/lang/Object;)V

    return-void
.end method

.method public onRequestAntiAliasingValue()I
    .locals 3

    .line 140
    sget-object v0, Lcom/daaw/avee/comp/Visualizer/VisualizerViewCore;->onRequestRenderQualityEdgesValue:Lcom/daaw/avee/Common/Events/WeakEventR1;

    iget-object v1, p0, Lcom/daaw/avee/comp/Visualizer/VisualizerViewCore$1;->this$0:Lcom/daaw/avee/comp/Visualizer/VisualizerViewCore;

    invoke-virtual {v1}, Lcom/daaw/avee/comp/Visualizer/VisualizerViewCore;->getContext()Landroid/content/Context;

    move-result-object v1

    const/4 v2, 0x0

    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    invoke-virtual {v0, v1, v2}, Lcom/daaw/avee/Common/Events/WeakEventR1;->invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Integer;

    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I

    move-result v0

    return v0
.end method

.method public onRequestAudioProcessMultiThreadValue()I
    .locals 3

    .line 145
    sget-object v0, Lcom/daaw/avee/comp/Visualizer/VisualizerViewCore;->onRequestAudioProcessMultiThreadValue:Lcom/daaw/avee/Common/Events/WeakEventR1;

    iget-object v1, p0, Lcom/daaw/avee/comp/Visualizer/VisualizerViewCore$1;->this$0:Lcom/daaw/avee/comp/Visualizer/VisualizerViewCore;

    invoke-virtual {v1}, Lcom/daaw/avee/comp/Visualizer/VisualizerViewCore;->getContext()Landroid/content/Context;

    move-result-object v1

    const/4 v2, 0x3

    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    invoke-virtual {v0, v1, v2}, Lcom/daaw/avee/Common/Events/WeakEventR1;->invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Integer;

    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I

    move-result v0

    return v0
.end method

.method public onRequestConvertDpToPx(I)I
    .locals 2

    .line 135
    sget-object v0, Lcom/daaw/avee/comp/Visualizer/VisualizerViewCore;->onRequestConvertDpToPx:Lcom/daaw/avee/Common/Events/WeakEventR1;

    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p1

    invoke-virtual {v0, v1, p1}, Lcom/daaw/avee/Common/Events/WeakEventR1;->invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ljava/lang/Integer;

    invoke-virtual {p1}, Ljava/lang/Integer;->intValue()I

    move-result p1

    return p1
.end method

.method public onRequestMeasureVec2f(Ljava/lang/String;Lcom/daaw/avee/Common/Vec2f;Lcom/daaw/avee/Common/Vec2f;Lcom/daaw/avee/comp/Common/MeterOutputData;Lcom/daaw/avee/comp/Visualizer/Graphic/IRenderState;)Lcom/daaw/avee/Common/Vec2f;
    .locals 7

    .line 105
    sget-object v0, Lcom/daaw/avee/comp/Visualizer/VisualizerViewCore;->onRequestMeasureVec2f:Lcom/daaw/avee/Common/Events/WeakEventR5;

    move-object v1, p1

    move-object v2, p2

    move-object v3, p3

    move-object v4, p4

    move-object v5, p5

    move-object v6, p3

    invoke-virtual/range {v0 .. v6}, Lcom/daaw/avee/Common/Events/WeakEventR5;->invoke(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lcom/daaw/avee/Common/Vec2f;

    return-object p1
.end method

.method public onRequestOverrideAudioFrameSamplesInCount()I
    .locals 2

    .line 125
    sget-object v0, Lcom/daaw/avee/comp/Visualizer/VisualizerViewCore;->onRequestOverrideAudioFrameSamplesInCount:Lcom/daaw/avee/Common/Events/WeakEventR;

    const/4 v1, 0x0

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/daaw/avee/Common/Events/WeakEventR;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Integer;

    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I

    move-result v0

    return v0
.end method

.method public onRequestSoundVisualizationData(I)Lcom/daaw/avee/comp/playback/AudioFrameData;
    .locals 2

    .line 74
    sget-object v0, Lcom/daaw/avee/comp/Visualizer/VisualizerViewCore;->onRequestsSoundVisualizationData:Lcom/daaw/avee/Common/Events/WeakEventR1;

    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p1

    const/4 v1, 0x0

    invoke-virtual {v0, p1, v1}, Lcom/daaw/avee/Common/Events/WeakEventR1;->invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lcom/daaw/avee/comp/playback/AudioFrameData;

    return-object p1
.end method

.method public onRequestTrackDurationInfo()Lcom/daaw/avee/comp/Common/TrackDurationInfo;
    .locals 3

    .line 155
    sget-object v0, Lcom/daaw/avee/comp/Visualizer/VisualizerViewCore;->onRequestTrackDurationInfo:Lcom/daaw/avee/Common/Events/WeakEventR1;

    iget-object v1, p0, Lcom/daaw/avee/comp/Visualizer/VisualizerViewCore$1;->this$0:Lcom/daaw/avee/comp/Visualizer/VisualizerViewCore;

    invoke-virtual {v1}, Lcom/daaw/avee/comp/Visualizer/VisualizerViewCore;->getContext()Landroid/content/Context;

    move-result-object v1

    const/4 v2, 0x0

    invoke-virtual {v0, v1, v2}, Lcom/daaw/avee/Common/Events/WeakEventR1;->invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/daaw/avee/comp/Common/TrackDurationInfo;

    return-object v0
.end method

.method public onRequestUseHighQualityBlur()Z
    .locals 2

    .line 120
    sget-object v0, Lcom/daaw/avee/comp/Visualizer/VisualizerViewCore;->onRequestUseHighQualityBlur:Lcom/daaw/avee/Common/Events/WeakEventR;

    const/4 v1, 0x0

    invoke-static {v1}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/daaw/avee/Common/Events/WeakEventR;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Boolean;

    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v0

    return v0
.end method

.method public onRequestsAlbumArtPath()Lcom/daaw/avee/comp/AlbumArt/AlbumArtRequest;
    .locals 2

    .line 110
    sget-object v0, Lcom/daaw/avee/comp/Visualizer/VisualizerViewCore;->onRequestsAlbumArtPath:Lcom/daaw/avee/Common/Events/WeakEventR;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Lcom/daaw/avee/Common/Events/WeakEventR;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/daaw/avee/comp/AlbumArt/AlbumArtRequest;

    return-object v0
.end method

.method public onRequestsMeasureText(Ljava/lang/String;)Ljava/lang/String;
    .locals 2

    .line 100
    sget-object v0, Lcom/daaw/avee/comp/Visualizer/VisualizerViewCore;->onRequestMeasureText:Lcom/daaw/avee/Common/Events/WeakEventR2;

    iget-object v1, p0, Lcom/daaw/avee/comp/Visualizer/VisualizerViewCore$1;->this$0:Lcom/daaw/avee/comp/Visualizer/VisualizerViewCore;

    invoke-virtual {v0, p1, v1, p1}, Lcom/daaw/avee/Common/Events/WeakEventR2;->invoke(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ljava/lang/String;

    return-object p1
.end method

.method public onThemeChanged()V
    .locals 1

    .line 150
    sget-object v0, Lcom/daaw/avee/comp/Visualizer/VisualizerViewCore;->onThemeChanged:Lcom/daaw/avee/Common/Events/WeakEvent;

    invoke-virtual {v0}, Lcom/daaw/avee/Common/Events/WeakEvent;->invoke()V

    return-void
.end method
