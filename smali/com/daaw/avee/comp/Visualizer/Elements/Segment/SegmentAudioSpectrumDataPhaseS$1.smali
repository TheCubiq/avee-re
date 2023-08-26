.class Lcom/daaw/avee/comp/Visualizer/Elements/Segment/SegmentAudioSpectrumDataPhaseS$1;
.super Ljava/lang/Object;
.source "SegmentAudioSpectrumDataPhaseS.java"

# interfaces
.implements Ljava/lang/Runnable;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/daaw/avee/comp/Visualizer/Elements/Segment/SegmentAudioSpectrumDataPhaseS;->MaybeStartAudioProcessThread()V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic this$0:Lcom/daaw/avee/comp/Visualizer/Elements/Segment/SegmentAudioSpectrumDataPhaseS;


# direct methods
.method constructor <init>(Lcom/daaw/avee/comp/Visualizer/Elements/Segment/SegmentAudioSpectrumDataPhaseS;)V
    .locals 0

    .line 1499
    iput-object p1, p0, Lcom/daaw/avee/comp/Visualizer/Elements/Segment/SegmentAudioSpectrumDataPhaseS$1;->this$0:Lcom/daaw/avee/comp/Visualizer/Elements/Segment/SegmentAudioSpectrumDataPhaseS;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public run()V
    .locals 4

    .line 1505
    :catch_0
    :goto_0
    :try_start_0
    iget-object v0, p0, Lcom/daaw/avee/comp/Visualizer/Elements/Segment/SegmentAudioSpectrumDataPhaseS$1;->this$0:Lcom/daaw/avee/comp/Visualizer/Elements/Segment/SegmentAudioSpectrumDataPhaseS;

    iget-object v0, v0, Lcom/daaw/avee/comp/Visualizer/Elements/Segment/SegmentAudioSpectrumDataPhaseS;->processingQueue:Ljava/util/concurrent/BlockingQueue;

    const-wide/16 v1, 0x2710

    sget-object v3, Ljava/util/concurrent/TimeUnit;->MILLISECONDS:Ljava/util/concurrent/TimeUnit;

    invoke-interface {v0, v1, v2, v3}, Ljava/util/concurrent/BlockingQueue;->poll(JLjava/util/concurrent/TimeUnit;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/daaw/avee/comp/Visualizer/Elements/Segment/SegmentAudioSpectrumDataPhaseS$ProcessingData;

    if-nez v0, :cond_0

    return-void

    .line 1509
    :cond_0
    iget-object v1, p0, Lcom/daaw/avee/comp/Visualizer/Elements/Segment/SegmentAudioSpectrumDataPhaseS$1;->this$0:Lcom/daaw/avee/comp/Visualizer/Elements/Segment/SegmentAudioSpectrumDataPhaseS;

    iget-object v1, v1, Lcom/daaw/avee/comp/Visualizer/Elements/Segment/SegmentAudioSpectrumDataPhaseS;->audioProcess:Lcom/daaw/avee/comp/Visualizer/Elements/Segment/SegmentAudioSpectrumDataPhaseS$AudioProcess;

    iget v2, v0, Lcom/daaw/avee/comp/Visualizer/Elements/Segment/SegmentAudioSpectrumDataPhaseS$ProcessingData;->frameTimeF:F

    iget-object v0, v0, Lcom/daaw/avee/comp/Visualizer/Elements/Segment/SegmentAudioSpectrumDataPhaseS$ProcessingData;->visualisationData:Lcom/daaw/avee/comp/Visualizer/InternalVisualizationDataProvider;

    invoke-virtual {v1, v2, v0}, Lcom/daaw/avee/comp/Visualizer/Elements/Segment/SegmentAudioSpectrumDataPhaseS$AudioProcess;->processTh(FLcom/daaw/avee/comp/Visualizer/InternalVisualizationDataProvider;)[F

    move-result-object v0

    .line 1511
    iget-object v1, p0, Lcom/daaw/avee/comp/Visualizer/Elements/Segment/SegmentAudioSpectrumDataPhaseS$1;->this$0:Lcom/daaw/avee/comp/Visualizer/Elements/Segment/SegmentAudioSpectrumDataPhaseS;

    iget-object v1, v1, Lcom/daaw/avee/comp/Visualizer/Elements/Segment/SegmentAudioSpectrumDataPhaseS;->processingResultQueue:Ljava/util/concurrent/BlockingQueue;

    invoke-interface {v1, v0}, Ljava/util/concurrent/BlockingQueue;->add(Ljava/lang/Object;)Z
    :try_end_0
    .catch Ljava/lang/InterruptedException; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_0
.end method
