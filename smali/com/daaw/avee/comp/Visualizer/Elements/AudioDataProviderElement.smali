.class public Lcom/daaw/avee/comp/Visualizer/Elements/AudioDataProviderElement;
.super Lcom/daaw/avee/comp/Visualizer/Elements/Base/Element;
.source "AudioDataProviderElement.java"


# static fields
.field public static final typeName:Ljava/lang/String; = "AudioProvider"


# instance fields
.field private segmentDataProvider:Lcom/daaw/avee/comp/Visualizer/Elements/Segment/ISegmentDataProvider;


# direct methods
.method public constructor <init>()V
    .locals 2

    const/high16 v0, 0x3f000000    # 0.5f

    const/4 v1, 0x0

    .line 31
    invoke-direct {p0, v1, v0, v0}, Lcom/daaw/avee/comp/Visualizer/Elements/Base/Element;-><init>(IFF)V

    const/4 v0, 0x0

    .line 25
    iput-object v0, p0, Lcom/daaw/avee/comp/Visualizer/Elements/AudioDataProviderElement;->segmentDataProvider:Lcom/daaw/avee/comp/Visualizer/Elements/Segment/ISegmentDataProvider;

    .line 32
    invoke-virtual {p0, v0}, Lcom/daaw/avee/comp/Visualizer/Elements/AudioDataProviderElement;->setSegmentDataProvider(Lcom/daaw/avee/comp/Visualizer/Elements/Segment/ISegmentDataProvider;)V

    return-void
.end method


# virtual methods
.method public getElementTypeName()Ljava/lang/String;
    .locals 1

    const-string v0, "AudioProvider"

    return-object v0
.end method

.method protected onApplyCustomization(Lcom/daaw/avee/comp/Visualizer/CustomPropertiesList;)V
    .locals 2

    const-string v0, "sampleProvider"

    .line 48
    invoke-virtual {p1, v0}, Lcom/daaw/avee/comp/Visualizer/CustomPropertiesList;->getChild(Ljava/lang/String;)Lcom/daaw/avee/comp/Visualizer/CustomPropertiesList;

    move-result-object v0

    const-string v1, "Spectrum"

    .line 49
    invoke-virtual {v0, v1}, Lcom/daaw/avee/comp/Visualizer/CustomPropertiesList;->getTypeName(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    iget-object v1, p0, Lcom/daaw/avee/comp/Visualizer/Elements/AudioDataProviderElement;->segmentDataProvider:Lcom/daaw/avee/comp/Visualizer/Elements/Segment/ISegmentDataProvider;

    invoke-static {v0, v1}, Lcom/daaw/avee/comp/Visualizer/Elements/Segment/SegmentDataProviderFactory;->create(Ljava/lang/String;Lcom/daaw/avee/comp/Visualizer/Elements/Segment/ISegmentDataProvider;)Lcom/daaw/avee/comp/Visualizer/Elements/Segment/ISegmentDataProvider;

    move-result-object v0

    iput-object v0, p0, Lcom/daaw/avee/comp/Visualizer/Elements/AudioDataProviderElement;->segmentDataProvider:Lcom/daaw/avee/comp/Visualizer/Elements/Segment/ISegmentDataProvider;

    if-eqz v0, :cond_0

    .line 51
    invoke-interface {v0, p1}, Lcom/daaw/avee/comp/Visualizer/Elements/Segment/ISegmentDataProvider;->onApplyCustomization(Lcom/daaw/avee/comp/Visualizer/CustomPropertiesList;)V

    :cond_0
    return-void
.end method

.method public onCreateGLResources(Lcom/daaw/avee/comp/Visualizer/Graphic/RenderState;)Z
    .locals 0

    .line 79
    invoke-super {p0, p1}, Lcom/daaw/avee/comp/Visualizer/Elements/Base/Element;->onCreateGLResources(Lcom/daaw/avee/comp/Visualizer/Graphic/RenderState;)Z

    move-result p1

    return p1
.end method

.method protected onDestroyGLResources(Lcom/daaw/avee/comp/Visualizer/Graphic/RenderState;)V
    .locals 0

    .line 74
    invoke-super {p0, p1}, Lcom/daaw/avee/comp/Visualizer/Elements/Base/Element;->onDestroyGLResources(Lcom/daaw/avee/comp/Visualizer/Graphic/RenderState;)V

    return-void
.end method

.method public onEarlyUpdate(Lcom/daaw/avee/comp/Visualizer/Graphic/IRenderState;Lmdesl/graphics/glutils/FrameBuffer;Lcom/daaw/avee/comp/Visualizer/ICompositionDependencies;)V
    .locals 0

    .line 89
    invoke-super {p0, p1, p2, p3}, Lcom/daaw/avee/comp/Visualizer/Elements/Base/Element;->onEarlyUpdate(Lcom/daaw/avee/comp/Visualizer/Graphic/IRenderState;Lmdesl/graphics/glutils/FrameBuffer;Lcom/daaw/avee/comp/Visualizer/ICompositionDependencies;)V

    .line 91
    iget-object p2, p0, Lcom/daaw/avee/comp/Visualizer/Elements/AudioDataProviderElement;->segmentDataProvider:Lcom/daaw/avee/comp/Visualizer/Elements/Segment/ISegmentDataProvider;

    if-eqz p2, :cond_0

    .line 93
    invoke-interface {p1}, Lcom/daaw/avee/comp/Visualizer/Graphic/IRenderState;->getRes()Lcom/daaw/avee/comp/Visualizer/Graphic/IRenderState$IRenderResources;

    move-result-object p3

    invoke-interface {p3}, Lcom/daaw/avee/comp/Visualizer/Graphic/IRenderState$IRenderResources;->getVisualizationData()Lcom/daaw/avee/comp/Visualizer/InternalVisualizationDataProvider;

    move-result-object p3

    invoke-interface {p2, p1, p3}, Lcom/daaw/avee/comp/Visualizer/Elements/Segment/ISegmentDataProvider;->process(Lcom/daaw/avee/comp/Visualizer/Graphic/IRenderState;Lcom/daaw/avee/comp/Visualizer/InternalVisualizationDataProvider;)V

    .line 94
    invoke-interface {p1}, Lcom/daaw/avee/comp/Visualizer/Graphic/IRenderState;->getRes()Lcom/daaw/avee/comp/Visualizer/Graphic/IRenderState$IRenderResources;

    move-result-object p2

    invoke-interface {p2}, Lcom/daaw/avee/comp/Visualizer/Graphic/IRenderState$IRenderResources;->getMeter()Lcom/daaw/avee/comp/Visualizer/Meter;

    move-result-object p2

    iget-object p3, p0, Lcom/daaw/avee/comp/Visualizer/Elements/AudioDataProviderElement;->segmentDataProvider:Lcom/daaw/avee/comp/Visualizer/Elements/Segment/ISegmentDataProvider;

    invoke-interface {p3}, Lcom/daaw/avee/comp/Visualizer/Elements/Segment/ISegmentDataProvider;->getRms()F

    move-result p3

    invoke-virtual {p2, p3}, Lcom/daaw/avee/comp/Visualizer/Meter;->setFrameDataRmsValue(F)V

    .line 95
    invoke-interface {p1}, Lcom/daaw/avee/comp/Visualizer/Graphic/IRenderState;->getRes()Lcom/daaw/avee/comp/Visualizer/Graphic/IRenderState$IRenderResources;

    move-result-object p2

    invoke-interface {p2}, Lcom/daaw/avee/comp/Visualizer/Graphic/IRenderState$IRenderResources;->getMeter()Lcom/daaw/avee/comp/Visualizer/Meter;

    move-result-object p2

    iget-object p3, p0, Lcom/daaw/avee/comp/Visualizer/Elements/AudioDataProviderElement;->segmentDataProvider:Lcom/daaw/avee/comp/Visualizer/Elements/Segment/ISegmentDataProvider;

    invoke-interface {p3}, Lcom/daaw/avee/comp/Visualizer/Elements/Segment/ISegmentDataProvider;->getPeakBarIndex()F

    move-result p3

    invoke-virtual {p2, p3}, Lcom/daaw/avee/comp/Visualizer/Meter;->setFramePeakBarIndex(F)V

    .line 97
    :cond_0
    invoke-interface {p1}, Lcom/daaw/avee/comp/Visualizer/Graphic/IRenderState;->getRes()Lcom/daaw/avee/comp/Visualizer/Graphic/IRenderState$IRenderResources;

    move-result-object p1

    invoke-interface {p1}, Lcom/daaw/avee/comp/Visualizer/Graphic/IRenderState$IRenderResources;->getMeter()Lcom/daaw/avee/comp/Visualizer/Meter;

    move-result-object p1

    iget-object p2, p0, Lcom/daaw/avee/comp/Visualizer/Elements/AudioDataProviderElement;->segmentDataProvider:Lcom/daaw/avee/comp/Visualizer/Elements/Segment/ISegmentDataProvider;

    invoke-virtual {p1, p2}, Lcom/daaw/avee/comp/Visualizer/Meter;->addAudioDataProviderToFrame(Lcom/daaw/avee/comp/Visualizer/Elements/Segment/ISegmentDataProvider;)V

    return-void
.end method

.method protected onReadCustomization(Lcom/daaw/avee/comp/Visualizer/CustomPropertiesList;Lcom/daaw/avee/comp/Visualizer/IDependencyResourceCounter;)V
    .locals 3

    const-string p2, "Audio Provider"

    .line 58
    invoke-virtual {p1, p2}, Lcom/daaw/avee/comp/Visualizer/CustomPropertiesList;->setCustomizationName(Ljava/lang/String;)V

    .line 61
    iget-object p2, p0, Lcom/daaw/avee/comp/Visualizer/Elements/AudioDataProviderElement;->segmentDataProvider:Lcom/daaw/avee/comp/Visualizer/Elements/Segment/ISegmentDataProvider;

    const-string v0, "Spectrum"

    .line 63
    invoke-static {p2, v0}, Lcom/daaw/avee/comp/Visualizer/Elements/Segment/SegmentDataProviderFactory;->getTypeName(Lcom/daaw/avee/comp/Visualizer/Elements/Segment/ISegmentDataProvider;Ljava/lang/String;)Ljava/lang/String;

    move-result-object p2

    sget-object v0, Lcom/daaw/avee/comp/Visualizer/Elements/Segment/SegmentDataProviderFactory;->typeNames:[Ljava/lang/String;

    const-string v1, "sampleProvider"

    const-string v2, "0_general"

    .line 62
    invoke-virtual {p1, v1, p2, v2, v0}, Lcom/daaw/avee/comp/Visualizer/CustomPropertiesList;->putEmptyChild(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;[Ljava/lang/String;)Lcom/daaw/avee/comp/Visualizer/CustomPropertiesList;

    .line 68
    iget-object p2, p0, Lcom/daaw/avee/comp/Visualizer/Elements/AudioDataProviderElement;->segmentDataProvider:Lcom/daaw/avee/comp/Visualizer/Elements/Segment/ISegmentDataProvider;

    if-eqz p2, :cond_0

    invoke-interface {p2, p1}, Lcom/daaw/avee/comp/Visualizer/Elements/Segment/ISegmentDataProvider;->onReadCustomization(Lcom/daaw/avee/comp/Visualizer/CustomPropertiesList;)V

    :cond_0
    return-void
.end method

.method public onRender(Lcom/daaw/avee/comp/Visualizer/Graphic/RenderState;Lmdesl/graphics/glutils/FrameBuffer;)V
    .locals 0

    .line 84
    invoke-super {p0, p1, p2}, Lcom/daaw/avee/comp/Visualizer/Elements/Base/Element;->onRender(Lcom/daaw/avee/comp/Visualizer/Graphic/RenderState;Lmdesl/graphics/glutils/FrameBuffer;)V

    return-void
.end method

.method public setSegmentDataProvider(Lcom/daaw/avee/comp/Visualizer/Elements/Segment/ISegmentDataProvider;)V
    .locals 0

    .line 36
    iput-object p1, p0, Lcom/daaw/avee/comp/Visualizer/Elements/AudioDataProviderElement;->segmentDataProvider:Lcom/daaw/avee/comp/Visualizer/Elements/Segment/ISegmentDataProvider;

    return-void
.end method
