.class public Lcom/daaw/avee/comp/Visualizer/Elements/Segment/SegmentAudioSpectrumDataPhaseS;
.super Ljava/lang/Object;
.source "SegmentAudioSpectrumDataPhaseS.java"

# interfaces
.implements Lcom/daaw/avee/comp/Visualizer/Elements/Segment/ISegmentDataProvider;
.implements Lcom/daaw/avee/comp/Visualizer/Elements/Base/IFrameDataProvider;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/daaw/avee/comp/Visualizer/Elements/Segment/SegmentAudioSpectrumDataPhaseS$ProcessingData;,
        Lcom/daaw/avee/comp/Visualizer/Elements/Segment/SegmentAudioSpectrumDataPhaseS$AudioProcess;
    }
.end annotation


# static fields
.field static final debug:Z = false

.field public static final typeName:Ljava/lang/String; = "Spectrum2"


# instance fields
.field audioProcess:Lcom/daaw/avee/comp/Visualizer/Elements/Segment/SegmentAudioSpectrumDataPhaseS$AudioProcess;

.field audioProcessTh:Ljava/lang/Thread;

.field frameValuesAccumulator:Lcom/daaw/avee/comp/Visualizer/Elements/Base/FrameValuesAccumulator;

.field final processingQueue:Ljava/util/concurrent/BlockingQueue;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/concurrent/BlockingQueue<",
            "Lcom/daaw/avee/comp/Visualizer/Elements/Segment/SegmentAudioSpectrumDataPhaseS$ProcessingData;",
            ">;"
        }
    .end annotation
.end field

.field final processingResultQueue:Ljava/util/concurrent/BlockingQueue;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/concurrent/BlockingQueue<",
            "[F>;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>()V
    .locals 2

    .line 1525
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 1467
    new-instance v0, Lcom/daaw/avee/comp/Visualizer/Elements/Base/FrameValuesAccumulator;

    invoke-direct {v0}, Lcom/daaw/avee/comp/Visualizer/Elements/Base/FrameValuesAccumulator;-><init>()V

    iput-object v0, p0, Lcom/daaw/avee/comp/Visualizer/Elements/Segment/SegmentAudioSpectrumDataPhaseS;->frameValuesAccumulator:Lcom/daaw/avee/comp/Visualizer/Elements/Base/FrameValuesAccumulator;

    .line 1470
    new-instance v0, Lcom/daaw/avee/comp/Visualizer/Elements/Segment/SegmentAudioSpectrumDataPhaseS$AudioProcess;

    invoke-direct {v0, p0}, Lcom/daaw/avee/comp/Visualizer/Elements/Segment/SegmentAudioSpectrumDataPhaseS$AudioProcess;-><init>(Lcom/daaw/avee/comp/Visualizer/Elements/Segment/SegmentAudioSpectrumDataPhaseS;)V

    iput-object v0, p0, Lcom/daaw/avee/comp/Visualizer/Elements/Segment/SegmentAudioSpectrumDataPhaseS;->audioProcess:Lcom/daaw/avee/comp/Visualizer/Elements/Segment/SegmentAudioSpectrumDataPhaseS$AudioProcess;

    .line 1473
    new-instance v0, Ljava/util/concurrent/ArrayBlockingQueue;

    const/4 v1, 0x1

    invoke-direct {v0, v1}, Ljava/util/concurrent/ArrayBlockingQueue;-><init>(I)V

    iput-object v0, p0, Lcom/daaw/avee/comp/Visualizer/Elements/Segment/SegmentAudioSpectrumDataPhaseS;->processingQueue:Ljava/util/concurrent/BlockingQueue;

    .line 1474
    new-instance v0, Ljava/util/concurrent/ArrayBlockingQueue;

    const/4 v1, 0x2

    invoke-direct {v0, v1}, Ljava/util/concurrent/ArrayBlockingQueue;-><init>(I)V

    iput-object v0, p0, Lcom/daaw/avee/comp/Visualizer/Elements/Segment/SegmentAudioSpectrumDataPhaseS;->processingResultQueue:Ljava/util/concurrent/BlockingQueue;

    const/4 v0, 0x0

    .line 1475
    iput-object v0, p0, Lcom/daaw/avee/comp/Visualizer/Elements/Segment/SegmentAudioSpectrumDataPhaseS;->audioProcessTh:Ljava/lang/Thread;

    return-void
.end method

.method private MaybeStartAudioProcessThread()V
    .locals 2

    .line 1495
    iget-object v0, p0, Lcom/daaw/avee/comp/Visualizer/Elements/Segment/SegmentAudioSpectrumDataPhaseS;->audioProcessTh:Ljava/lang/Thread;

    if-eqz v0, :cond_0

    invoke-virtual {v0}, Ljava/lang/Thread;->isAlive()Z

    move-result v0

    if-eqz v0, :cond_0

    return-void

    :cond_0
    const-string v0, "Starting audioProcessTh"

    .line 1497
    invoke-static {v0}, Lcom/daaw/avee/Common/tlog;->d(Ljava/lang/String;)V

    .line 1499
    new-instance v0, Ljava/lang/Thread;

    new-instance v1, Lcom/daaw/avee/comp/Visualizer/Elements/Segment/SegmentAudioSpectrumDataPhaseS$1;

    invoke-direct {v1, p0}, Lcom/daaw/avee/comp/Visualizer/Elements/Segment/SegmentAudioSpectrumDataPhaseS$1;-><init>(Lcom/daaw/avee/comp/Visualizer/Elements/Segment/SegmentAudioSpectrumDataPhaseS;)V

    invoke-direct {v0, v1}, Ljava/lang/Thread;-><init>(Ljava/lang/Runnable;)V

    iput-object v0, p0, Lcom/daaw/avee/comp/Visualizer/Elements/Segment/SegmentAudioSpectrumDataPhaseS;->audioProcessTh:Ljava/lang/Thread;

    .line 1520
    invoke-virtual {v0}, Ljava/lang/Thread;->start()V

    return-void
.end method


# virtual methods
.method public createFrameValuesAccessorList(IIILcom/daaw/avee/Common/ISimpleListFloat;)Lcom/daaw/avee/Common/ISimpleListFloat;
    .locals 1

    .line 1578
    iget-object v0, p0, Lcom/daaw/avee/comp/Visualizer/Elements/Segment/SegmentAudioSpectrumDataPhaseS;->frameValuesAccumulator:Lcom/daaw/avee/comp/Visualizer/Elements/Base/FrameValuesAccumulator;

    invoke-virtual {v0, p1, p2, p3, p4}, Lcom/daaw/avee/comp/Visualizer/Elements/Base/FrameValuesAccumulator;->createFrameValuesAccessorList(IIILcom/daaw/avee/Common/ISimpleListFloat;)Lcom/daaw/avee/Common/ISimpleListFloat;

    move-result-object p1

    return-object p1
.end method

.method public getFrameValues(II)[F
    .locals 1

    .line 1573
    iget-object v0, p0, Lcom/daaw/avee/comp/Visualizer/Elements/Segment/SegmentAudioSpectrumDataPhaseS;->frameValuesAccumulator:Lcom/daaw/avee/comp/Visualizer/Elements/Base/FrameValuesAccumulator;

    invoke-virtual {v0, p1, p2}, Lcom/daaw/avee/comp/Visualizer/Elements/Base/FrameValuesAccumulator;->getFrameValues(II)[F

    move-result-object p1

    return-object p1
.end method

.method public getPeakBarIndex()F
    .locals 1

    .line 1593
    iget-object v0, p0, Lcom/daaw/avee/comp/Visualizer/Elements/Segment/SegmentAudioSpectrumDataPhaseS;->audioProcess:Lcom/daaw/avee/comp/Visualizer/Elements/Segment/SegmentAudioSpectrumDataPhaseS$AudioProcess;

    invoke-virtual {v0}, Lcom/daaw/avee/comp/Visualizer/Elements/Segment/SegmentAudioSpectrumDataPhaseS$AudioProcess;->getPeakBarIndexSmooth()F

    move-result v0

    return v0
.end method

.method public getRms()F
    .locals 1

    .line 1587
    iget-object v0, p0, Lcom/daaw/avee/comp/Visualizer/Elements/Segment/SegmentAudioSpectrumDataPhaseS;->audioProcess:Lcom/daaw/avee/comp/Visualizer/Elements/Segment/SegmentAudioSpectrumDataPhaseS$AudioProcess;

    invoke-virtual {v0}, Lcom/daaw/avee/comp/Visualizer/Elements/Segment/SegmentAudioSpectrumDataPhaseS$AudioProcess;->getBeatBarValueSmooth()F

    move-result v0

    return v0
.end method

.method public onApplyCustomization(Lcom/daaw/avee/comp/Visualizer/CustomPropertiesList;)V
    .locals 1

    .line 1601
    iget-object v0, p0, Lcom/daaw/avee/comp/Visualizer/Elements/Segment/SegmentAudioSpectrumDataPhaseS;->audioProcess:Lcom/daaw/avee/comp/Visualizer/Elements/Segment/SegmentAudioSpectrumDataPhaseS$AudioProcess;

    invoke-virtual {v0, p1}, Lcom/daaw/avee/comp/Visualizer/Elements/Segment/SegmentAudioSpectrumDataPhaseS$AudioProcess;->onApplyCustomization(Lcom/daaw/avee/comp/Visualizer/CustomPropertiesList;)V

    return-void
.end method

.method public onReadCustomization(Lcom/daaw/avee/comp/Visualizer/CustomPropertiesList;)V
    .locals 1

    .line 1608
    iget-object v0, p0, Lcom/daaw/avee/comp/Visualizer/Elements/Segment/SegmentAudioSpectrumDataPhaseS;->audioProcess:Lcom/daaw/avee/comp/Visualizer/Elements/Segment/SegmentAudioSpectrumDataPhaseS$AudioProcess;

    invoke-virtual {v0, p1}, Lcom/daaw/avee/comp/Visualizer/Elements/Segment/SegmentAudioSpectrumDataPhaseS$AudioProcess;->onReadCustomization(Lcom/daaw/avee/comp/Visualizer/CustomPropertiesList;)V

    return-void
.end method

.method public onRender(Lcom/daaw/avee/comp/Visualizer/Graphic/RenderState;Lcom/daaw/avee/comp/Visualizer/Graphic/VFrameBuffer;)V
    .locals 1

    .line 1718
    iget-object v0, p0, Lcom/daaw/avee/comp/Visualizer/Elements/Segment/SegmentAudioSpectrumDataPhaseS;->audioProcess:Lcom/daaw/avee/comp/Visualizer/Elements/Segment/SegmentAudioSpectrumDataPhaseS$AudioProcess;

    invoke-virtual {v0, p1, p2}, Lcom/daaw/avee/comp/Visualizer/Elements/Segment/SegmentAudioSpectrumDataPhaseS$AudioProcess;->onRender(Lcom/daaw/avee/comp/Visualizer/Graphic/RenderState;Lcom/daaw/avee/comp/Visualizer/Graphic/VFrameBuffer;)V

    return-void
.end method

.method public process(Lcom/daaw/avee/comp/Visualizer/Graphic/IRenderState;Lcom/daaw/avee/comp/Visualizer/InternalVisualizationDataProvider;)V
    .locals 4

    .line 1540
    invoke-interface {p1}, Lcom/daaw/avee/comp/Visualizer/Graphic/IRenderState;->getMultiThread()Z

    move-result v0

    if-nez v0, :cond_0

    .line 1542
    iget-object v0, p0, Lcom/daaw/avee/comp/Visualizer/Elements/Segment/SegmentAudioSpectrumDataPhaseS;->audioProcess:Lcom/daaw/avee/comp/Visualizer/Elements/Segment/SegmentAudioSpectrumDataPhaseS$AudioProcess;

    invoke-interface {p1}, Lcom/daaw/avee/comp/Visualizer/Graphic/IRenderState;->getFrameTimeF()F

    move-result p1

    invoke-virtual {v0, p1, p2}, Lcom/daaw/avee/comp/Visualizer/Elements/Segment/SegmentAudioSpectrumDataPhaseS$AudioProcess;->processTh(FLcom/daaw/avee/comp/Visualizer/InternalVisualizationDataProvider;)[F

    move-result-object p1

    .line 1543
    iget-object p2, p0, Lcom/daaw/avee/comp/Visualizer/Elements/Segment/SegmentAudioSpectrumDataPhaseS;->frameValuesAccumulator:Lcom/daaw/avee/comp/Visualizer/Elements/Base/FrameValuesAccumulator;

    invoke-virtual {p2, p1}, Lcom/daaw/avee/comp/Visualizer/Elements/Base/FrameValuesAccumulator;->addFrame([F)V

    goto :goto_0

    .line 1550
    :cond_0
    invoke-direct {p0}, Lcom/daaw/avee/comp/Visualizer/Elements/Segment/SegmentAudioSpectrumDataPhaseS;->MaybeStartAudioProcessThread()V

    .line 1553
    :try_start_0
    iget-object v0, p0, Lcom/daaw/avee/comp/Visualizer/Elements/Segment/SegmentAudioSpectrumDataPhaseS;->processingResultQueue:Ljava/util/concurrent/BlockingQueue;

    const-wide/16 v1, 0x64

    sget-object v3, Ljava/util/concurrent/TimeUnit;->MILLISECONDS:Ljava/util/concurrent/TimeUnit;

    invoke-interface {v0, v1, v2, v3}, Ljava/util/concurrent/BlockingQueue;->poll(JLjava/util/concurrent/TimeUnit;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [F

    if-eqz v0, :cond_1

    .line 1555
    iget-object v1, p0, Lcom/daaw/avee/comp/Visualizer/Elements/Segment/SegmentAudioSpectrumDataPhaseS;->frameValuesAccumulator:Lcom/daaw/avee/comp/Visualizer/Elements/Base/FrameValuesAccumulator;

    invoke-virtual {v1, v0}, Lcom/daaw/avee/comp/Visualizer/Elements/Base/FrameValuesAccumulator;->addFrame([F)V
    :try_end_0
    .catch Ljava/lang/InterruptedException; {:try_start_0 .. :try_end_0} :catch_0

    .line 1559
    :catch_0
    :cond_1
    iget-object v0, p0, Lcom/daaw/avee/comp/Visualizer/Elements/Segment/SegmentAudioSpectrumDataPhaseS;->processingQueue:Ljava/util/concurrent/BlockingQueue;

    new-instance v1, Lcom/daaw/avee/comp/Visualizer/Elements/Segment/SegmentAudioSpectrumDataPhaseS$ProcessingData;

    invoke-interface {p1}, Lcom/daaw/avee/comp/Visualizer/Graphic/IRenderState;->getFrameTimeF()F

    move-result p1

    invoke-direct {v1, p0, p1, p2}, Lcom/daaw/avee/comp/Visualizer/Elements/Segment/SegmentAudioSpectrumDataPhaseS$ProcessingData;-><init>(Lcom/daaw/avee/comp/Visualizer/Elements/Segment/SegmentAudioSpectrumDataPhaseS;FLcom/daaw/avee/comp/Visualizer/InternalVisualizationDataProvider;)V

    invoke-interface {v0, v1}, Ljava/util/concurrent/BlockingQueue;->offer(Ljava/lang/Object;)Z

    :goto_0
    return-void
.end method

.method public setAweightFft(F)V
    .locals 1

    .line 1704
    iget-object v0, p0, Lcom/daaw/avee/comp/Visualizer/Elements/Segment/SegmentAudioSpectrumDataPhaseS;->audioProcess:Lcom/daaw/avee/comp/Visualizer/Elements/Segment/SegmentAudioSpectrumDataPhaseS$AudioProcess;

    invoke-virtual {v0, p1}, Lcom/daaw/avee/comp/Visualizer/Elements/Segment/SegmentAudioSpectrumDataPhaseS$AudioProcess;->setAweightFft(F)V

    return-void
.end method

.method public setBeatBart(I)V
    .locals 1

    .line 1652
    iget-object v0, p0, Lcom/daaw/avee/comp/Visualizer/Elements/Segment/SegmentAudioSpectrumDataPhaseS;->audioProcess:Lcom/daaw/avee/comp/Visualizer/Elements/Segment/SegmentAudioSpectrumDataPhaseS$AudioProcess;

    invoke-virtual {v0, p1}, Lcom/daaw/avee/comp/Visualizer/Elements/Segment/SegmentAudioSpectrumDataPhaseS$AudioProcess;->setBeatBart(I)V

    return-void
.end method

.method public setBeatRangeCorners(FFFF)V
    .locals 1

    .line 1699
    iget-object v0, p0, Lcom/daaw/avee/comp/Visualizer/Elements/Segment/SegmentAudioSpectrumDataPhaseS;->audioProcess:Lcom/daaw/avee/comp/Visualizer/Elements/Segment/SegmentAudioSpectrumDataPhaseS$AudioProcess;

    invoke-virtual {v0, p1, p2, p3, p4}, Lcom/daaw/avee/comp/Visualizer/Elements/Segment/SegmentAudioSpectrumDataPhaseS$AudioProcess;->setBeatRangeCorners(FFFF)V

    return-void
.end method

.method public setBeatSmooth(F)V
    .locals 1

    .line 1694
    iget-object v0, p0, Lcom/daaw/avee/comp/Visualizer/Elements/Segment/SegmentAudioSpectrumDataPhaseS;->audioProcess:Lcom/daaw/avee/comp/Visualizer/Elements/Segment/SegmentAudioSpectrumDataPhaseS$AudioProcess;

    invoke-virtual {v0, p1}, Lcom/daaw/avee/comp/Visualizer/Elements/Segment/SegmentAudioSpectrumDataPhaseS$AudioProcess;->setBeatSmooth(F)V

    return-void
.end method

.method public setDataMode(I)V
    .locals 1

    .line 1657
    iget-object v0, p0, Lcom/daaw/avee/comp/Visualizer/Elements/Segment/SegmentAudioSpectrumDataPhaseS;->audioProcess:Lcom/daaw/avee/comp/Visualizer/Elements/Segment/SegmentAudioSpectrumDataPhaseS$AudioProcess;

    invoke-virtual {v0, p1}, Lcom/daaw/avee/comp/Visualizer/Elements/Segment/SegmentAudioSpectrumDataPhaseS$AudioProcess;->setDataMode(I)V

    return-void
.end method

.method public setFftFilter(IF)V
    .locals 1

    .line 1684
    iget-object v0, p0, Lcom/daaw/avee/comp/Visualizer/Elements/Segment/SegmentAudioSpectrumDataPhaseS;->audioProcess:Lcom/daaw/avee/comp/Visualizer/Elements/Segment/SegmentAudioSpectrumDataPhaseS$AudioProcess;

    invoke-virtual {v0, p1, p2}, Lcom/daaw/avee/comp/Visualizer/Elements/Segment/SegmentAudioSpectrumDataPhaseS$AudioProcess;->setFftFilter(IF)V

    return-void
.end method

.method public setFftSoftness(I)V
    .locals 1

    .line 1679
    iget-object v0, p0, Lcom/daaw/avee/comp/Visualizer/Elements/Segment/SegmentAudioSpectrumDataPhaseS;->audioProcess:Lcom/daaw/avee/comp/Visualizer/Elements/Segment/SegmentAudioSpectrumDataPhaseS$AudioProcess;

    invoke-virtual {v0, p1}, Lcom/daaw/avee/comp/Visualizer/Elements/Segment/SegmentAudioSpectrumDataPhaseS$AudioProcess;->setFftSoftness(I)V

    return-void
.end method

.method public setFrequencyBinSliding(Z)V
    .locals 1

    .line 1689
    iget-object v0, p0, Lcom/daaw/avee/comp/Visualizer/Elements/Segment/SegmentAudioSpectrumDataPhaseS;->audioProcess:Lcom/daaw/avee/comp/Visualizer/Elements/Segment/SegmentAudioSpectrumDataPhaseS$AudioProcess;

    invoke-virtual {v0, p1}, Lcom/daaw/avee/comp/Visualizer/Elements/Segment/SegmentAudioSpectrumDataPhaseS$AudioProcess;->setFrequencyBinSliding(Z)V

    return-void
.end method

.method public setOutputMultiplier(F)V
    .locals 1

    .line 1710
    iget-object v0, p0, Lcom/daaw/avee/comp/Visualizer/Elements/Segment/SegmentAudioSpectrumDataPhaseS;->audioProcess:Lcom/daaw/avee/comp/Visualizer/Elements/Segment/SegmentAudioSpectrumDataPhaseS$AudioProcess;

    invoke-virtual {v0, p1}, Lcom/daaw/avee/comp/Visualizer/Elements/Segment/SegmentAudioSpectrumDataPhaseS$AudioProcess;->setOutputMultiplier(F)V

    return-void
.end method

.method public setSampleInCountPower(I)V
    .locals 0

    return-void
.end method

.method public setSampleOutCount(IFFZIF)V
    .locals 10

    const/4 v7, 0x0

    const/4 v8, 0x0

    const/4 v9, 0x0

    move-object v0, p0

    move v1, p1

    move v2, p2

    move v3, p3

    move v4, p4

    move v5, p5

    move/from16 v6, p6

    .line 1632
    invoke-virtual/range {v0 .. v9}, Lcom/daaw/avee/comp/Visualizer/Elements/Segment/SegmentAudioSpectrumDataPhaseS;->setSampleOutCount(IFFZIFIIF)V

    return-void
.end method

.method public setSampleOutCount(IFFZIFIIF)V
    .locals 11

    move-object v0, p0

    .line 1637
    iget-object v1, v0, Lcom/daaw/avee/comp/Visualizer/Elements/Segment/SegmentAudioSpectrumDataPhaseS;->audioProcess:Lcom/daaw/avee/comp/Visualizer/Elements/Segment/SegmentAudioSpectrumDataPhaseS$AudioProcess;

    move v2, p1

    move v3, p2

    move v4, p3

    move v5, p4

    move/from16 v6, p5

    move/from16 v7, p6

    move/from16 v8, p7

    move/from16 v9, p8

    move/from16 v10, p9

    invoke-virtual/range {v1 .. v10}, Lcom/daaw/avee/comp/Visualizer/Elements/Segment/SegmentAudioSpectrumDataPhaseS$AudioProcess;->setSampleOutCount(IFFZIFIIF)V

    return-void
.end method

.method public setSampleOutCount(IFI)V
    .locals 10

    const/high16 v2, 0x41a00000    # 20.0f

    const v3, 0x468ca000    # 18000.0f

    const/4 v4, 0x0

    const/4 v5, 0x1

    const/4 v9, 0x0

    move-object v0, p0

    move v1, p1

    move v6, p2

    move v7, p3

    move v8, p3

    .line 1622
    invoke-virtual/range {v0 .. v9}, Lcom/daaw/avee/comp/Visualizer/Elements/Segment/SegmentAudioSpectrumDataPhaseS;->setSampleOutCount(IFFZIFIIF)V

    return-void
.end method

.method public setSampleOutCount(IZI)V
    .locals 10

    const/high16 v2, 0x41a00000    # 20.0f

    const v3, 0x468ca000    # 18000.0f

    const v6, 0x3d75c28f    # 0.06f

    const/4 v7, 0x0

    const/4 v8, 0x0

    const/4 v9, 0x0

    move-object v0, p0

    move v1, p1

    move v4, p2

    move v5, p3

    .line 1627
    invoke-virtual/range {v0 .. v9}, Lcom/daaw/avee/comp/Visualizer/Elements/Segment/SegmentAudioSpectrumDataPhaseS;->setSampleOutCount(IFFZIFIIF)V

    return-void
.end method

.method public setSmooth(F)V
    .locals 1

    .line 1663
    iget-object v0, p0, Lcom/daaw/avee/comp/Visualizer/Elements/Segment/SegmentAudioSpectrumDataPhaseS;->audioProcess:Lcom/daaw/avee/comp/Visualizer/Elements/Segment/SegmentAudioSpectrumDataPhaseS$AudioProcess;

    invoke-virtual {v0, p1}, Lcom/daaw/avee/comp/Visualizer/Elements/Segment/SegmentAudioSpectrumDataPhaseS$AudioProcess;->setSmooth(F)V

    return-void
.end method

.method public setSmoothFactor(F)V
    .locals 1

    .line 1642
    iget-object v0, p0, Lcom/daaw/avee/comp/Visualizer/Elements/Segment/SegmentAudioSpectrumDataPhaseS;->audioProcess:Lcom/daaw/avee/comp/Visualizer/Elements/Segment/SegmentAudioSpectrumDataPhaseS$AudioProcess;

    invoke-virtual {v0, p1}, Lcom/daaw/avee/comp/Visualizer/Elements/Segment/SegmentAudioSpectrumDataPhaseS$AudioProcess;->setSmoothFactor(F)V

    return-void
.end method

.method public setSteadySmooth(F)V
    .locals 1

    .line 1673
    iget-object v0, p0, Lcom/daaw/avee/comp/Visualizer/Elements/Segment/SegmentAudioSpectrumDataPhaseS;->audioProcess:Lcom/daaw/avee/comp/Visualizer/Elements/Segment/SegmentAudioSpectrumDataPhaseS$AudioProcess;

    invoke-virtual {v0, p1}, Lcom/daaw/avee/comp/Visualizer/Elements/Segment/SegmentAudioSpectrumDataPhaseS$AudioProcess;->setSteadySmooth(F)V

    return-void
.end method
