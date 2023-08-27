.class public Lcom/daaw/avee/comp/Visualizer/Elements/Segment/SegmentAudioSpectrumData;
.super Ljava/lang/Object;
.source "SegmentAudioSpectrumData.java"

# interfaces
.implements Lcom/daaw/avee/comp/Visualizer/Elements/Segment/ISegmentDataProvider;
.implements Lcom/daaw/avee/comp/Visualizer/Elements/Base/IFrameDataProvider;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/daaw/avee/comp/Visualizer/Elements/Segment/SegmentAudioSpectrumData$ProcessingData;,
        Lcom/daaw/avee/comp/Visualizer/Elements/Segment/SegmentAudioSpectrumData$AudioProcess;
    }
.end annotation


# static fields
.field static final debug:Z = false

.field public static final typeName:Ljava/lang/String; = "Spectrum"


# instance fields
.field final audioProcess:Lcom/daaw/avee/comp/Visualizer/Elements/Segment/SegmentAudioSpectrumData$AudioProcess;

.field audioProcessTh:Ljava/lang/Thread;

.field frameValuesAccumulator:Lcom/daaw/avee/comp/Visualizer/Elements/Base/FrameValuesAccumulator;

.field final processingQueue:Ljava/util/concurrent/BlockingQueue;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/concurrent/BlockingQueue<",
            "Lcom/daaw/avee/comp/Visualizer/Elements/Segment/SegmentAudioSpectrumData$ProcessingData;",
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

    .line 1489
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 1432
    new-instance v0, Lcom/daaw/avee/comp/Visualizer/Elements/Base/FrameValuesAccumulator;

    invoke-direct {v0}, Lcom/daaw/avee/comp/Visualizer/Elements/Base/FrameValuesAccumulator;-><init>()V

    iput-object v0, p0, Lcom/daaw/avee/comp/Visualizer/Elements/Segment/SegmentAudioSpectrumData;->frameValuesAccumulator:Lcom/daaw/avee/comp/Visualizer/Elements/Base/FrameValuesAccumulator;

    .line 1435
    new-instance v0, Lcom/daaw/avee/comp/Visualizer/Elements/Segment/SegmentAudioSpectrumData$AudioProcess;

    invoke-direct {v0}, Lcom/daaw/avee/comp/Visualizer/Elements/Segment/SegmentAudioSpectrumData$AudioProcess;-><init>()V

    iput-object v0, p0, Lcom/daaw/avee/comp/Visualizer/Elements/Segment/SegmentAudioSpectrumData;->audioProcess:Lcom/daaw/avee/comp/Visualizer/Elements/Segment/SegmentAudioSpectrumData$AudioProcess;

    .line 1438
    new-instance v0, Ljava/util/concurrent/ArrayBlockingQueue;

    const/4 v1, 0x1

    invoke-direct {v0, v1}, Ljava/util/concurrent/ArrayBlockingQueue;-><init>(I)V

    iput-object v0, p0, Lcom/daaw/avee/comp/Visualizer/Elements/Segment/SegmentAudioSpectrumData;->processingQueue:Ljava/util/concurrent/BlockingQueue;

    .line 1439
    new-instance v0, Ljava/util/concurrent/ArrayBlockingQueue;

    const/4 v1, 0x2

    invoke-direct {v0, v1}, Ljava/util/concurrent/ArrayBlockingQueue;-><init>(I)V

    iput-object v0, p0, Lcom/daaw/avee/comp/Visualizer/Elements/Segment/SegmentAudioSpectrumData;->processingResultQueue:Ljava/util/concurrent/BlockingQueue;

    const/4 v0, 0x0

    .line 1440
    iput-object v0, p0, Lcom/daaw/avee/comp/Visualizer/Elements/Segment/SegmentAudioSpectrumData;->audioProcessTh:Ljava/lang/Thread;

    return-void
.end method

.method private MaybeStartAudioProcessThread()V
    .locals 2

    .line 1460
    iget-object v0, p0, Lcom/daaw/avee/comp/Visualizer/Elements/Segment/SegmentAudioSpectrumData;->audioProcessTh:Ljava/lang/Thread;

    if-eqz v0, :cond_0

    invoke-virtual {v0}, Ljava/lang/Thread;->isAlive()Z

    move-result v0

    if-eqz v0, :cond_0

    return-void

    :cond_0
    const-string v0, "Starting audioProcessTh"

    .line 1462
    invoke-static {v0}, Lcom/daaw/avee/Common/tlog;->d(Ljava/lang/String;)V

    .line 1464
    new-instance v0, Ljava/lang/Thread;

    new-instance v1, Lcom/daaw/avee/comp/Visualizer/Elements/Segment/SegmentAudioSpectrumData$1;

    invoke-direct {v1, p0}, Lcom/daaw/avee/comp/Visualizer/Elements/Segment/SegmentAudioSpectrumData$1;-><init>(Lcom/daaw/avee/comp/Visualizer/Elements/Segment/SegmentAudioSpectrumData;)V

    invoke-direct {v0, v1}, Ljava/lang/Thread;-><init>(Ljava/lang/Runnable;)V

    iput-object v0, p0, Lcom/daaw/avee/comp/Visualizer/Elements/Segment/SegmentAudioSpectrumData;->audioProcessTh:Ljava/lang/Thread;

    .line 1485
    invoke-virtual {v0}, Ljava/lang/Thread;->start()V

    return-void
.end method


# virtual methods
.method public createFrameValuesAccessorList(IIILcom/daaw/avee/Common/ISimpleListFloat;)Lcom/daaw/avee/Common/ISimpleListFloat;
    .locals 1

    .line 1536
    iget-object v0, p0, Lcom/daaw/avee/comp/Visualizer/Elements/Segment/SegmentAudioSpectrumData;->frameValuesAccumulator:Lcom/daaw/avee/comp/Visualizer/Elements/Base/FrameValuesAccumulator;

    invoke-virtual {v0, p1, p2, p3, p4}, Lcom/daaw/avee/comp/Visualizer/Elements/Base/FrameValuesAccumulator;->createFrameValuesAccessorList(IIILcom/daaw/avee/Common/ISimpleListFloat;)Lcom/daaw/avee/Common/ISimpleListFloat;

    move-result-object p1

    return-object p1
.end method

.method public getFrameValues(II)[F
    .locals 1

    .line 1530
    iget-object v0, p0, Lcom/daaw/avee/comp/Visualizer/Elements/Segment/SegmentAudioSpectrumData;->frameValuesAccumulator:Lcom/daaw/avee/comp/Visualizer/Elements/Base/FrameValuesAccumulator;

    invoke-virtual {v0, p1, p2}, Lcom/daaw/avee/comp/Visualizer/Elements/Base/FrameValuesAccumulator;->getFrameValues(II)[F

    move-result-object p1

    return-object p1
.end method

.method public getPeakBarIndex()F
    .locals 1

    .line 1551
    iget-object v0, p0, Lcom/daaw/avee/comp/Visualizer/Elements/Segment/SegmentAudioSpectrumData;->audioProcess:Lcom/daaw/avee/comp/Visualizer/Elements/Segment/SegmentAudioSpectrumData$AudioProcess;

    invoke-virtual {v0}, Lcom/daaw/avee/comp/Visualizer/Elements/Segment/SegmentAudioSpectrumData$AudioProcess;->getPeakBarIndexSmooth()F

    move-result v0

    return v0
.end method

.method public getRms()F
    .locals 1

    .line 1545
    iget-object v0, p0, Lcom/daaw/avee/comp/Visualizer/Elements/Segment/SegmentAudioSpectrumData;->audioProcess:Lcom/daaw/avee/comp/Visualizer/Elements/Segment/SegmentAudioSpectrumData$AudioProcess;

    invoke-virtual {v0}, Lcom/daaw/avee/comp/Visualizer/Elements/Segment/SegmentAudioSpectrumData$AudioProcess;->getBeatBarValueSmooth()F

    move-result v0

    return v0
.end method

.method public onApplyCustomization(Lcom/daaw/avee/comp/Visualizer/CustomPropertiesList;)V
    .locals 1

    .line 1559
    iget-object v0, p0, Lcom/daaw/avee/comp/Visualizer/Elements/Segment/SegmentAudioSpectrumData;->audioProcess:Lcom/daaw/avee/comp/Visualizer/Elements/Segment/SegmentAudioSpectrumData$AudioProcess;

    invoke-virtual {v0, p1}, Lcom/daaw/avee/comp/Visualizer/Elements/Segment/SegmentAudioSpectrumData$AudioProcess;->onApplyCustomization(Lcom/daaw/avee/comp/Visualizer/CustomPropertiesList;)V

    return-void
.end method

.method public onReadCustomization(Lcom/daaw/avee/comp/Visualizer/CustomPropertiesList;)V
    .locals 1

    .line 1566
    iget-object v0, p0, Lcom/daaw/avee/comp/Visualizer/Elements/Segment/SegmentAudioSpectrumData;->audioProcess:Lcom/daaw/avee/comp/Visualizer/Elements/Segment/SegmentAudioSpectrumData$AudioProcess;

    invoke-virtual {v0, p1}, Lcom/daaw/avee/comp/Visualizer/Elements/Segment/SegmentAudioSpectrumData$AudioProcess;->onReadCustomization(Lcom/daaw/avee/comp/Visualizer/CustomPropertiesList;)V

    return-void
.end method

.method public process(Lcom/daaw/avee/comp/Visualizer/Graphic/IRenderState;Lcom/daaw/avee/comp/Visualizer/InternalVisualizationDataProvider;)V
    .locals 4

    .line 1503
    invoke-interface {p1}, Lcom/daaw/avee/comp/Visualizer/Graphic/IRenderState;->getMultiThread()Z

    move-result v0

    if-nez v0, :cond_0

    .line 1504
    iget-object v0, p0, Lcom/daaw/avee/comp/Visualizer/Elements/Segment/SegmentAudioSpectrumData;->audioProcess:Lcom/daaw/avee/comp/Visualizer/Elements/Segment/SegmentAudioSpectrumData$AudioProcess;

    invoke-interface {p1}, Lcom/daaw/avee/comp/Visualizer/Graphic/IRenderState;->getFrameTimeF()F

    move-result p1

    invoke-static {v0, p1, p2}, Lcom/daaw/avee/comp/Visualizer/Elements/Segment/SegmentAudioSpectrumData$AudioProcess;->access$200(Lcom/daaw/avee/comp/Visualizer/Elements/Segment/SegmentAudioSpectrumData$AudioProcess;FLcom/daaw/avee/comp/Visualizer/InternalVisualizationDataProvider;)[F

    move-result-object p1

    .line 1505
    iget-object p2, p0, Lcom/daaw/avee/comp/Visualizer/Elements/Segment/SegmentAudioSpectrumData;->frameValuesAccumulator:Lcom/daaw/avee/comp/Visualizer/Elements/Base/FrameValuesAccumulator;

    invoke-virtual {p2, p1}, Lcom/daaw/avee/comp/Visualizer/Elements/Base/FrameValuesAccumulator;->addFrame([F)V

    goto :goto_0

    .line 1508
    :cond_0
    invoke-direct {p0}, Lcom/daaw/avee/comp/Visualizer/Elements/Segment/SegmentAudioSpectrumData;->MaybeStartAudioProcessThread()V

    .line 1511
    :try_start_0
    iget-object v0, p0, Lcom/daaw/avee/comp/Visualizer/Elements/Segment/SegmentAudioSpectrumData;->processingResultQueue:Ljava/util/concurrent/BlockingQueue;

    const-wide/16 v1, 0x64

    sget-object v3, Ljava/util/concurrent/TimeUnit;->MILLISECONDS:Ljava/util/concurrent/TimeUnit;

    invoke-interface {v0, v1, v2, v3}, Ljava/util/concurrent/BlockingQueue;->poll(JLjava/util/concurrent/TimeUnit;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [F

    if-eqz v0, :cond_1

    .line 1513
    iget-object v1, p0, Lcom/daaw/avee/comp/Visualizer/Elements/Segment/SegmentAudioSpectrumData;->frameValuesAccumulator:Lcom/daaw/avee/comp/Visualizer/Elements/Base/FrameValuesAccumulator;

    invoke-virtual {v1, v0}, Lcom/daaw/avee/comp/Visualizer/Elements/Base/FrameValuesAccumulator;->addFrame([F)V
    :try_end_0
    .catch Ljava/lang/InterruptedException; {:try_start_0 .. :try_end_0} :catch_0

    .line 1517
    :catch_0
    :cond_1
    iget-object v0, p0, Lcom/daaw/avee/comp/Visualizer/Elements/Segment/SegmentAudioSpectrumData;->processingQueue:Ljava/util/concurrent/BlockingQueue;

    new-instance v1, Lcom/daaw/avee/comp/Visualizer/Elements/Segment/SegmentAudioSpectrumData$ProcessingData;

    invoke-interface {p1}, Lcom/daaw/avee/comp/Visualizer/Graphic/IRenderState;->getFrameTimeF()F

    move-result p1

    invoke-direct {v1, p1, p2}, Lcom/daaw/avee/comp/Visualizer/Elements/Segment/SegmentAudioSpectrumData$ProcessingData;-><init>(FLcom/daaw/avee/comp/Visualizer/InternalVisualizationDataProvider;)V

    invoke-interface {v0, v1}, Ljava/util/concurrent/BlockingQueue;->offer(Ljava/lang/Object;)Z

    :goto_0
    return-void
.end method

.method public setAweightFft(F)V
    .locals 1

    .line 1651
    iget-object v0, p0, Lcom/daaw/avee/comp/Visualizer/Elements/Segment/SegmentAudioSpectrumData;->audioProcess:Lcom/daaw/avee/comp/Visualizer/Elements/Segment/SegmentAudioSpectrumData$AudioProcess;

    invoke-static {v0, p1}, Lcom/daaw/avee/comp/Visualizer/Elements/Segment/SegmentAudioSpectrumData$AudioProcess;->access$900(Lcom/daaw/avee/comp/Visualizer/Elements/Segment/SegmentAudioSpectrumData$AudioProcess;F)V

    return-void
.end method

.method public setBeatBart(I)V
    .locals 1

    .line 1604
    iget-object v0, p0, Lcom/daaw/avee/comp/Visualizer/Elements/Segment/SegmentAudioSpectrumData;->audioProcess:Lcom/daaw/avee/comp/Visualizer/Elements/Segment/SegmentAudioSpectrumData$AudioProcess;

    invoke-virtual {v0, p1}, Lcom/daaw/avee/comp/Visualizer/Elements/Segment/SegmentAudioSpectrumData$AudioProcess;->setBeatBart(I)V

    return-void
.end method

.method public setBeatRangeCorners(FFFF)V
    .locals 1

    .line 1647
    iget-object v0, p0, Lcom/daaw/avee/comp/Visualizer/Elements/Segment/SegmentAudioSpectrumData;->audioProcess:Lcom/daaw/avee/comp/Visualizer/Elements/Segment/SegmentAudioSpectrumData$AudioProcess;

    invoke-static {v0, p1, p2, p3, p4}, Lcom/daaw/avee/comp/Visualizer/Elements/Segment/SegmentAudioSpectrumData$AudioProcess;->access$800(Lcom/daaw/avee/comp/Visualizer/Elements/Segment/SegmentAudioSpectrumData$AudioProcess;FFFF)V

    return-void
.end method

.method public setBeatSmooth(F)V
    .locals 1

    .line 1642
    iget-object v0, p0, Lcom/daaw/avee/comp/Visualizer/Elements/Segment/SegmentAudioSpectrumData;->audioProcess:Lcom/daaw/avee/comp/Visualizer/Elements/Segment/SegmentAudioSpectrumData$AudioProcess;

    invoke-static {v0, p1}, Lcom/daaw/avee/comp/Visualizer/Elements/Segment/SegmentAudioSpectrumData$AudioProcess;->access$700(Lcom/daaw/avee/comp/Visualizer/Elements/Segment/SegmentAudioSpectrumData$AudioProcess;F)V

    return-void
.end method

.method public setDataMode(I)V
    .locals 1

    .line 1608
    iget-object v0, p0, Lcom/daaw/avee/comp/Visualizer/Elements/Segment/SegmentAudioSpectrumData;->audioProcess:Lcom/daaw/avee/comp/Visualizer/Elements/Segment/SegmentAudioSpectrumData$AudioProcess;

    invoke-virtual {v0, p1}, Lcom/daaw/avee/comp/Visualizer/Elements/Segment/SegmentAudioSpectrumData$AudioProcess;->setDataMode(I)V

    return-void
.end method

.method public setFftFilter(IF)V
    .locals 1

    .line 1632
    iget-object v0, p0, Lcom/daaw/avee/comp/Visualizer/Elements/Segment/SegmentAudioSpectrumData;->audioProcess:Lcom/daaw/avee/comp/Visualizer/Elements/Segment/SegmentAudioSpectrumData$AudioProcess;

    invoke-static {v0, p1, p2}, Lcom/daaw/avee/comp/Visualizer/Elements/Segment/SegmentAudioSpectrumData$AudioProcess;->access$600(Lcom/daaw/avee/comp/Visualizer/Elements/Segment/SegmentAudioSpectrumData$AudioProcess;IF)V

    return-void
.end method

.method public setFftSoftness(I)V
    .locals 1

    .line 1627
    iget-object v0, p0, Lcom/daaw/avee/comp/Visualizer/Elements/Segment/SegmentAudioSpectrumData;->audioProcess:Lcom/daaw/avee/comp/Visualizer/Elements/Segment/SegmentAudioSpectrumData$AudioProcess;

    invoke-virtual {v0, p1}, Lcom/daaw/avee/comp/Visualizer/Elements/Segment/SegmentAudioSpectrumData$AudioProcess;->setFftSoftness(I)V

    return-void
.end method

.method public setFrequencyBinSliding(Z)V
    .locals 1

    .line 1637
    iget-object v0, p0, Lcom/daaw/avee/comp/Visualizer/Elements/Segment/SegmentAudioSpectrumData;->audioProcess:Lcom/daaw/avee/comp/Visualizer/Elements/Segment/SegmentAudioSpectrumData$AudioProcess;

    invoke-virtual {v0, p1}, Lcom/daaw/avee/comp/Visualizer/Elements/Segment/SegmentAudioSpectrumData$AudioProcess;->setFrequencyBinSliding(Z)V

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

    .line 1586
    invoke-virtual/range {v0 .. v9}, Lcom/daaw/avee/comp/Visualizer/Elements/Segment/SegmentAudioSpectrumData;->setSampleOutCount(IFFZIFIIF)V

    return-void
.end method

.method public setSampleOutCount(IFFZIFIIF)V
    .locals 11

    move-object v0, p0

    .line 1590
    iget-object v1, v0, Lcom/daaw/avee/comp/Visualizer/Elements/Segment/SegmentAudioSpectrumData;->audioProcess:Lcom/daaw/avee/comp/Visualizer/Elements/Segment/SegmentAudioSpectrumData$AudioProcess;

    move v2, p1

    move v3, p2

    move v4, p3

    move v5, p4

    move/from16 v6, p5

    move/from16 v7, p6

    move/from16 v8, p7

    move/from16 v9, p8

    move/from16 v10, p9

    invoke-static/range {v1 .. v10}, Lcom/daaw/avee/comp/Visualizer/Elements/Segment/SegmentAudioSpectrumData$AudioProcess;->access$300(Lcom/daaw/avee/comp/Visualizer/Elements/Segment/SegmentAudioSpectrumData$AudioProcess;IFFZIFIIF)V

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

    .line 1578
    invoke-virtual/range {v0 .. v9}, Lcom/daaw/avee/comp/Visualizer/Elements/Segment/SegmentAudioSpectrumData;->setSampleOutCount(IFFZIFIIF)V

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

    .line 1582
    invoke-virtual/range {v0 .. v9}, Lcom/daaw/avee/comp/Visualizer/Elements/Segment/SegmentAudioSpectrumData;->setSampleOutCount(IFFZIFIIF)V

    return-void
.end method

.method public setSmooth(F)V
    .locals 1

    .line 1613
    iget-object v0, p0, Lcom/daaw/avee/comp/Visualizer/Elements/Segment/SegmentAudioSpectrumData;->audioProcess:Lcom/daaw/avee/comp/Visualizer/Elements/Segment/SegmentAudioSpectrumData$AudioProcess;

    invoke-virtual {v0, p1}, Lcom/daaw/avee/comp/Visualizer/Elements/Segment/SegmentAudioSpectrumData$AudioProcess;->setSmooth(F)V

    return-void
.end method

.method public setSmooth2(F)V
    .locals 1

    .line 1617
    iget-object v0, p0, Lcom/daaw/avee/comp/Visualizer/Elements/Segment/SegmentAudioSpectrumData;->audioProcess:Lcom/daaw/avee/comp/Visualizer/Elements/Segment/SegmentAudioSpectrumData$AudioProcess;

    invoke-virtual {v0, p1}, Lcom/daaw/avee/comp/Visualizer/Elements/Segment/SegmentAudioSpectrumData$AudioProcess;->setSmooth2(F)V

    return-void
.end method

.method public setSmoothFactor(F)V
    .locals 1

    .line 1595
    iget-object v0, p0, Lcom/daaw/avee/comp/Visualizer/Elements/Segment/SegmentAudioSpectrumData;->audioProcess:Lcom/daaw/avee/comp/Visualizer/Elements/Segment/SegmentAudioSpectrumData$AudioProcess;

    invoke-static {v0, p1}, Lcom/daaw/avee/comp/Visualizer/Elements/Segment/SegmentAudioSpectrumData$AudioProcess;->access$400(Lcom/daaw/avee/comp/Visualizer/Elements/Segment/SegmentAudioSpectrumData$AudioProcess;F)V

    return-void
.end method

.method public setSmoothFactor2(F)V
    .locals 1

    .line 1600
    iget-object v0, p0, Lcom/daaw/avee/comp/Visualizer/Elements/Segment/SegmentAudioSpectrumData;->audioProcess:Lcom/daaw/avee/comp/Visualizer/Elements/Segment/SegmentAudioSpectrumData$AudioProcess;

    invoke-static {v0, p1}, Lcom/daaw/avee/comp/Visualizer/Elements/Segment/SegmentAudioSpectrumData$AudioProcess;->access$500(Lcom/daaw/avee/comp/Visualizer/Elements/Segment/SegmentAudioSpectrumData$AudioProcess;F)V

    return-void
.end method

.method public setSteadySmooth(F)V
    .locals 1

    .line 1621
    iget-object v0, p0, Lcom/daaw/avee/comp/Visualizer/Elements/Segment/SegmentAudioSpectrumData;->audioProcess:Lcom/daaw/avee/comp/Visualizer/Elements/Segment/SegmentAudioSpectrumData$AudioProcess;

    invoke-virtual {v0, p1}, Lcom/daaw/avee/comp/Visualizer/Elements/Segment/SegmentAudioSpectrumData$AudioProcess;->setSteadySmooth(F)V

    return-void
.end method
