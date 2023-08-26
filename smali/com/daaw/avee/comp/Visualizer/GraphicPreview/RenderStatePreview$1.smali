.class Lcom/daaw/avee/comp/Visualizer/GraphicPreview/RenderStatePreview$1;
.super Ljava/lang/Object;
.source "RenderStatePreview.java"

# interfaces
.implements Lcom/daaw/avee/comp/Visualizer/InternalVisualizationDataProvider;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/daaw/avee/comp/Visualizer/GraphicPreview/RenderStatePreview;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic this$0:Lcom/daaw/avee/comp/Visualizer/GraphicPreview/RenderStatePreview;


# direct methods
.method constructor <init>(Lcom/daaw/avee/comp/Visualizer/GraphicPreview/RenderStatePreview;)V
    .locals 0

    .line 51
    iput-object p1, p0, Lcom/daaw/avee/comp/Visualizer/GraphicPreview/RenderStatePreview$1;->this$0:Lcom/daaw/avee/comp/Visualizer/GraphicPreview/RenderStatePreview;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onOffScreenContentRendered(Lmdesl/graphics/Texture;ZLjava/lang/String;)V
    .locals 0

    return-void
.end method

.method public onRequestAlbumArtPathAndBitmap(Lcom/daaw/avee/comp/AlbumArt/ImageLoadedListener;Lcom/daaw/avee/comp/AlbumArt/AlbumArtRequest2;)V
    .locals 0

    return-void
.end method

.method public onRequestAntiAliasingValue()I
    .locals 1

    const/4 v0, 0x0

    return v0
.end method

.method public onRequestAudioProcessMultiThreadValue()I
    .locals 1

    const/4 v0, 0x0

    return v0
.end method

.method public onRequestConvertDpToPx(I)I
    .locals 2

    .line 96
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

    .line 66
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
    .locals 1

    const/4 v0, 0x0

    return v0
.end method

.method public onRequestSoundVisualizationData(I)Lcom/daaw/avee/comp/playback/AudioFrameData;
    .locals 1

    .line 56
    iget-object v0, p0, Lcom/daaw/avee/comp/Visualizer/GraphicPreview/RenderStatePreview$1;->this$0:Lcom/daaw/avee/comp/Visualizer/GraphicPreview/RenderStatePreview;

    invoke-static {v0, p1}, Lcom/daaw/avee/comp/Visualizer/GraphicPreview/RenderStatePreview;->access$000(Lcom/daaw/avee/comp/Visualizer/GraphicPreview/RenderStatePreview;I)Lcom/daaw/avee/comp/playback/AudioFrameData;

    move-result-object p1

    return-object p1
.end method

.method public onRequestTrackDurationInfo()Lcom/daaw/avee/comp/Common/TrackDurationInfo;
    .locals 1

    const/4 v0, 0x0

    return-object v0
.end method

.method public onRequestUseHighQualityBlur()Z
    .locals 1

    const/4 v0, 0x0

    return v0
.end method

.method public onRequestsAlbumArtPath()Lcom/daaw/avee/comp/AlbumArt/AlbumArtRequest;
    .locals 1

    const/4 v0, 0x0

    return-object v0
.end method

.method public onRequestsMeasureText(Ljava/lang/String;)Ljava/lang/String;
    .locals 0

    const-string p1, ""

    return-object p1
.end method

.method public onThemeChanged()V
    .locals 0

    return-void
.end method
