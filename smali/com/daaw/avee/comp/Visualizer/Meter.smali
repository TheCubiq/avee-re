.class public Lcom/daaw/avee/comp/Visualizer/Meter;
.super Ljava/lang/Object;
.source "Meter.java"


# instance fields
.field private audioDataProviderWeak:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Ljava/lang/ref/WeakReference<",
            "Lcom/daaw/avee/comp/Visualizer/Elements/Segment/ISegmentDataProvider;",
            ">;>;"
        }
    .end annotation
.end field

.field private framePeakBarIndex:F

.field private meterOutputData:Lcom/daaw/avee/comp/Common/MeterOutputData;

.field private renderState:Lcom/daaw/avee/comp/Visualizer/Graphic/IRenderState;


# direct methods
.method public constructor <init>(Lcom/daaw/avee/comp/Visualizer/Graphic/IRenderState;)V
    .locals 1

    .line 29
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 25
    new-instance v0, Lcom/daaw/avee/comp/Common/MeterOutputData;

    invoke-direct {v0}, Lcom/daaw/avee/comp/Common/MeterOutputData;-><init>()V

    iput-object v0, p0, Lcom/daaw/avee/comp/Visualizer/Meter;->meterOutputData:Lcom/daaw/avee/comp/Common/MeterOutputData;

    .line 26
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iput-object v0, p0, Lcom/daaw/avee/comp/Visualizer/Meter;->audioDataProviderWeak:Ljava/util/List;

    .line 30
    iput-object p1, p0, Lcom/daaw/avee/comp/Visualizer/Meter;->renderState:Lcom/daaw/avee/comp/Visualizer/Graphic/IRenderState;

    return-void
.end method


# virtual methods
.method public addAudioDataProviderToFrame(Lcom/daaw/avee/comp/Visualizer/Elements/Segment/ISegmentDataProvider;)V
    .locals 2

    .line 195
    iget-object v0, p0, Lcom/daaw/avee/comp/Visualizer/Meter;->audioDataProviderWeak:Ljava/util/List;

    new-instance v1, Ljava/lang/ref/WeakReference;

    invoke-direct {v1, p1}, Ljava/lang/ref/WeakReference;-><init>(Ljava/lang/Object;)V

    invoke-interface {v0, v1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    return-void
.end method

.method public getAudioDataProvider(I)Lcom/daaw/avee/comp/Visualizer/Elements/Segment/ISegmentDataProvider;
    .locals 1

    if-ltz p1, :cond_0

    .line 200
    iget-object v0, p0, Lcom/daaw/avee/comp/Visualizer/Meter;->audioDataProviderWeak:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v0

    if-ge p1, v0, :cond_0

    .line 201
    iget-object v0, p0, Lcom/daaw/avee/comp/Visualizer/Meter;->audioDataProviderWeak:Ljava/util/List;

    invoke-interface {v0, p1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ljava/lang/ref/WeakReference;

    invoke-virtual {p1}, Ljava/lang/ref/WeakReference;->get()Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lcom/daaw/avee/comp/Visualizer/Elements/Segment/ISegmentDataProvider;

    return-object p1

    :cond_0
    const/4 p1, 0x0

    return-object p1
.end method

.method public measureLocalSpaceX(FZFF)F
    .locals 0

    if-eqz p2, :cond_0

    cmpg-float p2, p4, p3

    if-gez p2, :cond_0

    mul-float p1, p1, p4

    return p1

    :cond_0
    mul-float p1, p1, p3

    return p1
.end method

.method public measureLocalSpaceY(FZFF)F
    .locals 0

    if-eqz p2, :cond_0

    cmpg-float p2, p3, p4

    if-gez p2, :cond_0

    mul-float p1, p1, p3

    return p1

    :cond_0
    mul-float p1, p1, p4

    return p1
.end method

.method public measureScreenScale1D(F)F
    .locals 1

    const/4 v0, 0x1

    .line 128
    invoke-virtual {p0, p1, v0}, Lcom/daaw/avee/comp/Visualizer/Meter;->measureScreenScaleX(FZ)F

    move-result p1

    return p1
.end method

.method public measureScreenScaleX(FZ)F
    .locals 1

    if-eqz p2, :cond_0

    .line 113
    iget-object p2, p0, Lcom/daaw/avee/comp/Visualizer/Meter;->renderState:Lcom/daaw/avee/comp/Visualizer/Graphic/IRenderState;

    invoke-interface {p2}, Lcom/daaw/avee/comp/Visualizer/Graphic/IRenderState;->getScreenHeight()I

    move-result p2

    iget-object v0, p0, Lcom/daaw/avee/comp/Visualizer/Meter;->renderState:Lcom/daaw/avee/comp/Visualizer/Graphic/IRenderState;

    invoke-interface {v0}, Lcom/daaw/avee/comp/Visualizer/Graphic/IRenderState;->getScreenWidth()I

    move-result v0

    if-ge p2, v0, :cond_0

    .line 114
    iget-object p2, p0, Lcom/daaw/avee/comp/Visualizer/Meter;->renderState:Lcom/daaw/avee/comp/Visualizer/Graphic/IRenderState;

    invoke-interface {p2}, Lcom/daaw/avee/comp/Visualizer/Graphic/IRenderState;->getScreenHeight()I

    move-result p2

    :goto_0
    int-to-float p2, p2

    mul-float p1, p1, p2

    return p1

    .line 116
    :cond_0
    iget-object p2, p0, Lcom/daaw/avee/comp/Visualizer/Meter;->renderState:Lcom/daaw/avee/comp/Visualizer/Graphic/IRenderState;

    invoke-interface {p2}, Lcom/daaw/avee/comp/Visualizer/Graphic/IRenderState;->getScreenWidth()I

    move-result p2

    goto :goto_0
.end method

.method public measureScreenScaleY(FZ)F
    .locals 1

    if-eqz p2, :cond_0

    .line 121
    iget-object p2, p0, Lcom/daaw/avee/comp/Visualizer/Meter;->renderState:Lcom/daaw/avee/comp/Visualizer/Graphic/IRenderState;

    invoke-interface {p2}, Lcom/daaw/avee/comp/Visualizer/Graphic/IRenderState;->getScreenWidth()I

    move-result p2

    iget-object v0, p0, Lcom/daaw/avee/comp/Visualizer/Meter;->renderState:Lcom/daaw/avee/comp/Visualizer/Graphic/IRenderState;

    invoke-interface {v0}, Lcom/daaw/avee/comp/Visualizer/Graphic/IRenderState;->getScreenHeight()I

    move-result v0

    if-ge p2, v0, :cond_0

    .line 122
    iget-object p2, p0, Lcom/daaw/avee/comp/Visualizer/Meter;->renderState:Lcom/daaw/avee/comp/Visualizer/Graphic/IRenderState;

    invoke-interface {p2}, Lcom/daaw/avee/comp/Visualizer/Graphic/IRenderState;->getScreenWidth()I

    move-result p2

    :goto_0
    int-to-float p2, p2

    mul-float p1, p1, p2

    return p1

    .line 124
    :cond_0
    iget-object p2, p0, Lcom/daaw/avee/comp/Visualizer/Meter;->renderState:Lcom/daaw/avee/comp/Visualizer/Graphic/IRenderState;

    invoke-interface {p2}, Lcom/daaw/avee/comp/Visualizer/Graphic/IRenderState;->getScreenHeight()I

    move-result p2

    goto :goto_0
.end method

.method public measureScreenSpace(F)F
    .locals 2

    .line 42
    iget-object v0, p0, Lcom/daaw/avee/comp/Visualizer/Meter;->renderState:Lcom/daaw/avee/comp/Visualizer/Graphic/IRenderState;

    invoke-interface {v0}, Lcom/daaw/avee/comp/Visualizer/Graphic/IRenderState;->getScreenHeight()I

    move-result v0

    iget-object v1, p0, Lcom/daaw/avee/comp/Visualizer/Meter;->renderState:Lcom/daaw/avee/comp/Visualizer/Graphic/IRenderState;

    invoke-interface {v1}, Lcom/daaw/avee/comp/Visualizer/Graphic/IRenderState;->getScreenWidth()I

    move-result v1

    if-ge v0, v1, :cond_0

    .line 43
    iget-object v0, p0, Lcom/daaw/avee/comp/Visualizer/Meter;->renderState:Lcom/daaw/avee/comp/Visualizer/Graphic/IRenderState;

    invoke-interface {v0}, Lcom/daaw/avee/comp/Visualizer/Graphic/IRenderState;->getScreenHeight()I

    move-result v0

    :goto_0
    int-to-float v0, v0

    mul-float p1, p1, v0

    return p1

    .line 45
    :cond_0
    iget-object v0, p0, Lcom/daaw/avee/comp/Visualizer/Meter;->renderState:Lcom/daaw/avee/comp/Visualizer/Graphic/IRenderState;

    invoke-interface {v0}, Lcom/daaw/avee/comp/Visualizer/Graphic/IRenderState;->getScreenWidth()I

    move-result v0

    goto :goto_0
.end method

.method public measureScreenSpaceAnchorX(I)F
    .locals 2

    const/4 v0, 0x1

    const/4 v1, 0x0

    if-eq p1, v0, :cond_2

    const/4 v0, 0x2

    if-eq p1, v0, :cond_1

    const/4 v0, 0x3

    if-eq p1, v0, :cond_0

    return v1

    :cond_0
    const/high16 p1, 0x3f800000    # 1.0f

    .line 74
    iget-object v0, p0, Lcom/daaw/avee/comp/Visualizer/Meter;->renderState:Lcom/daaw/avee/comp/Visualizer/Graphic/IRenderState;

    invoke-interface {v0}, Lcom/daaw/avee/comp/Visualizer/Graphic/IRenderState;->getScreenWidth()I

    move-result v0

    :goto_0
    int-to-float v0, v0

    mul-float v0, v0, p1

    return v0

    :cond_1
    const/high16 p1, 0x3f000000    # 0.5f

    .line 72
    iget-object v0, p0, Lcom/daaw/avee/comp/Visualizer/Meter;->renderState:Lcom/daaw/avee/comp/Visualizer/Graphic/IRenderState;

    invoke-interface {v0}, Lcom/daaw/avee/comp/Visualizer/Graphic/IRenderState;->getScreenWidth()I

    move-result v0

    goto :goto_0

    .line 70
    :cond_2
    iget-object p1, p0, Lcom/daaw/avee/comp/Visualizer/Meter;->renderState:Lcom/daaw/avee/comp/Visualizer/Graphic/IRenderState;

    invoke-interface {p1}, Lcom/daaw/avee/comp/Visualizer/Graphic/IRenderState;->getScreenWidth()I

    move-result p1

    int-to-float p1, p1

    mul-float p1, p1, v1

    return p1
.end method

.method public measureScreenSpaceAnchorY(I)F
    .locals 2

    const/4 v0, 0x1

    const/4 v1, 0x0

    if-eq p1, v0, :cond_2

    const/4 v0, 0x2

    if-eq p1, v0, :cond_1

    const/4 v0, 0x3

    if-eq p1, v0, :cond_0

    return v1

    :cond_0
    const/high16 p1, 0x3f800000    # 1.0f

    .line 90
    iget-object v0, p0, Lcom/daaw/avee/comp/Visualizer/Meter;->renderState:Lcom/daaw/avee/comp/Visualizer/Graphic/IRenderState;

    invoke-interface {v0}, Lcom/daaw/avee/comp/Visualizer/Graphic/IRenderState;->getScreenHeight()I

    move-result v0

    :goto_0
    int-to-float v0, v0

    mul-float v0, v0, p1

    return v0

    :cond_1
    const/high16 p1, 0x3f000000    # 0.5f

    .line 88
    iget-object v0, p0, Lcom/daaw/avee/comp/Visualizer/Meter;->renderState:Lcom/daaw/avee/comp/Visualizer/Graphic/IRenderState;

    invoke-interface {v0}, Lcom/daaw/avee/comp/Visualizer/Graphic/IRenderState;->getScreenHeight()I

    move-result v0

    goto :goto_0

    .line 86
    :cond_2
    iget-object p1, p0, Lcom/daaw/avee/comp/Visualizer/Meter;->renderState:Lcom/daaw/avee/comp/Visualizer/Graphic/IRenderState;

    invoke-interface {p1}, Lcom/daaw/avee/comp/Visualizer/Graphic/IRenderState;->getScreenHeight()I

    move-result p1

    int-to-float p1, p1

    mul-float p1, p1, v1

    return p1
.end method

.method public measureScreenSpaceX(FZ)F
    .locals 1

    if-eqz p2, :cond_0

    .line 50
    iget-object p2, p0, Lcom/daaw/avee/comp/Visualizer/Meter;->renderState:Lcom/daaw/avee/comp/Visualizer/Graphic/IRenderState;

    invoke-interface {p2}, Lcom/daaw/avee/comp/Visualizer/Graphic/IRenderState;->getScreenHeight()I

    move-result p2

    iget-object v0, p0, Lcom/daaw/avee/comp/Visualizer/Meter;->renderState:Lcom/daaw/avee/comp/Visualizer/Graphic/IRenderState;

    invoke-interface {v0}, Lcom/daaw/avee/comp/Visualizer/Graphic/IRenderState;->getScreenWidth()I

    move-result v0

    if-ge p2, v0, :cond_0

    .line 51
    iget-object p2, p0, Lcom/daaw/avee/comp/Visualizer/Meter;->renderState:Lcom/daaw/avee/comp/Visualizer/Graphic/IRenderState;

    invoke-interface {p2}, Lcom/daaw/avee/comp/Visualizer/Graphic/IRenderState;->getScreenHeight()I

    move-result p2

    :goto_0
    int-to-float p2, p2

    mul-float p1, p1, p2

    return p1

    .line 53
    :cond_0
    iget-object p2, p0, Lcom/daaw/avee/comp/Visualizer/Meter;->renderState:Lcom/daaw/avee/comp/Visualizer/Graphic/IRenderState;

    invoke-interface {p2}, Lcom/daaw/avee/comp/Visualizer/Graphic/IRenderState;->getScreenWidth()I

    move-result p2

    goto :goto_0
.end method

.method public measureScreenSpaceY(FZ)F
    .locals 1

    if-eqz p2, :cond_0

    .line 58
    iget-object p2, p0, Lcom/daaw/avee/comp/Visualizer/Meter;->renderState:Lcom/daaw/avee/comp/Visualizer/Graphic/IRenderState;

    invoke-interface {p2}, Lcom/daaw/avee/comp/Visualizer/Graphic/IRenderState;->getScreenWidth()I

    move-result p2

    iget-object v0, p0, Lcom/daaw/avee/comp/Visualizer/Meter;->renderState:Lcom/daaw/avee/comp/Visualizer/Graphic/IRenderState;

    invoke-interface {v0}, Lcom/daaw/avee/comp/Visualizer/Graphic/IRenderState;->getScreenHeight()I

    move-result v0

    if-ge p2, v0, :cond_0

    .line 59
    iget-object p2, p0, Lcom/daaw/avee/comp/Visualizer/Meter;->renderState:Lcom/daaw/avee/comp/Visualizer/Graphic/IRenderState;

    invoke-interface {p2}, Lcom/daaw/avee/comp/Visualizer/Graphic/IRenderState;->getScreenWidth()I

    move-result p2

    :goto_0
    int-to-float p2, p2

    mul-float p1, p1, p2

    return p1

    .line 61
    :cond_0
    iget-object p2, p0, Lcom/daaw/avee/comp/Visualizer/Meter;->renderState:Lcom/daaw/avee/comp/Visualizer/Graphic/IRenderState;

    invoke-interface {p2}, Lcom/daaw/avee/comp/Visualizer/Graphic/IRenderState;->getScreenHeight()I

    move-result p2

    goto :goto_0
.end method

.method public measureText(Ljava/lang/String;)Ljava/lang/String;
    .locals 2

    .line 156
    iget-object v0, p0, Lcom/daaw/avee/comp/Visualizer/Meter;->renderState:Lcom/daaw/avee/comp/Visualizer/Graphic/IRenderState;

    invoke-interface {v0}, Lcom/daaw/avee/comp/Visualizer/Graphic/IRenderState;->getRes()Lcom/daaw/avee/comp/Visualizer/Graphic/IRenderState$IRenderResources;

    move-result-object v0

    invoke-interface {v0}, Lcom/daaw/avee/comp/Visualizer/Graphic/IRenderState$IRenderResources;->getVisualizationData()Lcom/daaw/avee/comp/Visualizer/InternalVisualizationDataProvider;

    move-result-object v0

    invoke-interface {v0, p1}, Lcom/daaw/avee/comp/Visualizer/InternalVisualizationDataProvider;->onRequestsMeasureText(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    if-nez v0, :cond_0

    .line 159
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "result null, "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lcom/daaw/avee/Common/tlog;->w(Ljava/lang/String;)V

    return-object p1

    :cond_0
    return-object v0
.end method

.method public measureVec2f(Ljava/lang/String;)Lcom/daaw/avee/Common/Vec2f;
    .locals 2

    .line 167
    new-instance v0, Lcom/daaw/avee/Common/Vec2f;

    const/high16 v1, 0x3f800000    # 1.0f

    invoke-direct {v0, v1, v1}, Lcom/daaw/avee/Common/Vec2f;-><init>(FF)V

    const/4 v1, 0x0

    invoke-virtual {p0, p1, v0, v1}, Lcom/daaw/avee/comp/Visualizer/Meter;->measureVec2f(Ljava/lang/String;Lcom/daaw/avee/Common/Vec2f;Lcom/daaw/avee/Common/Vec2f;)Lcom/daaw/avee/Common/Vec2f;

    move-result-object p1

    return-object p1
.end method

.method public measureVec2f(Ljava/lang/String;Lcom/daaw/avee/Common/Vec2f;Lcom/daaw/avee/Common/Vec2f;)Lcom/daaw/avee/Common/Vec2f;
    .locals 7

    .line 174
    iget-object v0, p0, Lcom/daaw/avee/comp/Visualizer/Meter;->renderState:Lcom/daaw/avee/comp/Visualizer/Graphic/IRenderState;

    invoke-interface {v0}, Lcom/daaw/avee/comp/Visualizer/Graphic/IRenderState;->getRes()Lcom/daaw/avee/comp/Visualizer/Graphic/IRenderState$IRenderResources;

    move-result-object v0

    invoke-interface {v0}, Lcom/daaw/avee/comp/Visualizer/Graphic/IRenderState$IRenderResources;->getVisualizationData()Lcom/daaw/avee/comp/Visualizer/InternalVisualizationDataProvider;

    move-result-object v1

    iget-object v5, p0, Lcom/daaw/avee/comp/Visualizer/Meter;->meterOutputData:Lcom/daaw/avee/comp/Common/MeterOutputData;

    iget-object v6, p0, Lcom/daaw/avee/comp/Visualizer/Meter;->renderState:Lcom/daaw/avee/comp/Visualizer/Graphic/IRenderState;

    move-object v2, p1

    move-object v3, p2

    move-object v4, p3

    invoke-interface/range {v1 .. v6}, Lcom/daaw/avee/comp/Visualizer/InternalVisualizationDataProvider;->onRequestMeasureVec2f(Ljava/lang/String;Lcom/daaw/avee/Common/Vec2f;Lcom/daaw/avee/Common/Vec2f;Lcom/daaw/avee/comp/Common/MeterOutputData;Lcom/daaw/avee/comp/Visualizer/Graphic/IRenderState;)Lcom/daaw/avee/Common/Vec2f;

    move-result-object p2

    if-nez p2, :cond_0

    .line 177
    new-instance p2, Ljava/lang/StringBuilder;

    invoke-direct {p2}, Ljava/lang/StringBuilder;-><init>()V

    const-string p3, "result null, "

    invoke-virtual {p2, p3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p2, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-static {p1}, Lcom/daaw/avee/Common/tlog;->w(Ljava/lang/String;)V

    .line 178
    new-instance p1, Lcom/daaw/avee/Common/Vec2f;

    const/4 p2, 0x0

    invoke-direct {p1, p2, p2}, Lcom/daaw/avee/Common/Vec2f;-><init>(FF)V

    return-object p1

    :cond_0
    return-object p2
.end method

.method public onFrameStart()V
    .locals 1

    .line 186
    iget-object v0, p0, Lcom/daaw/avee/comp/Visualizer/Meter;->audioDataProviderWeak:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->clear()V

    return-void
.end method

.method public setFrameDataRmsValue(F)V
    .locals 1

    .line 191
    iget-object v0, p0, Lcom/daaw/avee/comp/Visualizer/Meter;->meterOutputData:Lcom/daaw/avee/comp/Common/MeterOutputData;

    iput p1, v0, Lcom/daaw/avee/comp/Common/MeterOutputData;->frameDataRmsValue:F

    return-void
.end method

.method public setFramePeakBarIndex(F)V
    .locals 1

    .line 207
    iget-object v0, p0, Lcom/daaw/avee/comp/Visualizer/Meter;->meterOutputData:Lcom/daaw/avee/comp/Common/MeterOutputData;

    iput p1, v0, Lcom/daaw/avee/comp/Common/MeterOutputData;->peakBarIndex:F

    return-void
.end method
