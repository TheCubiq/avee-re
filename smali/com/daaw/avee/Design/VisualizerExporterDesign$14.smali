.class Lcom/daaw/avee/Design/VisualizerExporterDesign$14;
.super Ljava/lang/Object;
.source "VisualizerExporterDesign.java"

# interfaces
.implements Lcom/daaw/avee/Common/Events/WeakEventR2$Handler;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/daaw/avee/Design/VisualizerExporterDesign;-><init>(Lcom/daaw/avee/Design/VisualizerDesign;Lcom/daaw/avee/Design/PlaybackDesign;Lcom/daaw/avee/Design/MainUIDesign;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Lcom/daaw/avee/Common/Events/WeakEventR2$Handler<",
        "Lcom/daaw/avee/comp/playback/AudioFrameData;",
        "Ljava/lang/Integer;",
        "Lcom/daaw/avee/comp/playback/AudioFrameData;",
        ">;"
    }
.end annotation


# instance fields
.field final synthetic this$0:Lcom/daaw/avee/Design/VisualizerExporterDesign;


# direct methods
.method constructor <init>(Lcom/daaw/avee/Design/VisualizerExporterDesign;)V
    .locals 0

    .line 508
    iput-object p1, p0, Lcom/daaw/avee/Design/VisualizerExporterDesign$14;->this$0:Lcom/daaw/avee/Design/VisualizerExporterDesign;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public invoke(Lcom/daaw/avee/comp/playback/AudioFrameData;Ljava/lang/Integer;)Lcom/daaw/avee/comp/playback/AudioFrameData;
    .locals 7

    .line 513
    iget-object p1, p0, Lcom/daaw/avee/Design/VisualizerExporterDesign$14;->this$0:Lcom/daaw/avee/Design/VisualizerExporterDesign;

    invoke-static {p1}, Lcom/daaw/avee/Design/VisualizerExporterDesign;->access$1300(Lcom/daaw/avee/Design/VisualizerExporterDesign;)Lcom/daaw/avee/comp/playback/AudioFrameData;

    move-result-object p1

    if-nez p1, :cond_0

    iget-object p1, p0, Lcom/daaw/avee/Design/VisualizerExporterDesign$14;->this$0:Lcom/daaw/avee/Design/VisualizerExporterDesign;

    new-instance v0, Lcom/daaw/avee/comp/playback/AudioFrameData;

    invoke-direct {v0}, Lcom/daaw/avee/comp/playback/AudioFrameData;-><init>()V

    invoke-static {p1, v0}, Lcom/daaw/avee/Design/VisualizerExporterDesign;->access$1302(Lcom/daaw/avee/Design/VisualizerExporterDesign;Lcom/daaw/avee/comp/playback/AudioFrameData;)Lcom/daaw/avee/comp/playback/AudioFrameData;

    .line 515
    :cond_0
    invoke-static {}, Lcom/daaw/avee/Design/VisualizerExporterDesign;->access$1100()Z

    move-result p1

    const/4 v0, 0x0

    const/4 v1, 0x1

    if-nez p1, :cond_1

    .line 516
    iget-object p1, p0, Lcom/daaw/avee/Design/VisualizerExporterDesign$14;->this$0:Lcom/daaw/avee/Design/VisualizerExporterDesign;

    invoke-static {p1, v1}, Lcom/daaw/avee/Design/VisualizerExporterDesign;->access$1402(Lcom/daaw/avee/Design/VisualizerExporterDesign;Z)Z

    return-object v0

    .line 525
    :cond_1
    iget-object p1, p0, Lcom/daaw/avee/Design/VisualizerExporterDesign$14;->this$0:Lcom/daaw/avee/Design/VisualizerExporterDesign;

    invoke-static {p1}, Lcom/daaw/avee/Design/VisualizerExporterDesign;->access$1500(Lcom/daaw/avee/Design/VisualizerExporterDesign;)I

    move-result p1

    iget-object v2, p0, Lcom/daaw/avee/Design/VisualizerExporterDesign$14;->this$0:Lcom/daaw/avee/Design/VisualizerExporterDesign;

    invoke-static {v2}, Lcom/daaw/avee/Design/VisualizerExporterDesign;->access$1600(Lcom/daaw/avee/Design/VisualizerExporterDesign;)I

    move-result v2

    sub-int/2addr p1, v2

    .line 526
    iget-object v2, p0, Lcom/daaw/avee/Design/VisualizerExporterDesign$14;->this$0:Lcom/daaw/avee/Design/VisualizerExporterDesign;

    invoke-static {v2}, Lcom/daaw/avee/Design/VisualizerExporterDesign;->access$1700(Lcom/daaw/avee/Design/VisualizerExporterDesign;)I

    move-result v2

    if-ltz p1, :cond_c

    .line 528
    iget-object v3, p0, Lcom/daaw/avee/Design/VisualizerExporterDesign$14;->this$0:Lcom/daaw/avee/Design/VisualizerExporterDesign;

    invoke-static {v3}, Lcom/daaw/avee/Design/VisualizerExporterDesign;->access$1500(Lcom/daaw/avee/Design/VisualizerExporterDesign;)I

    move-result v3

    iget-object v4, p0, Lcom/daaw/avee/Design/VisualizerExporterDesign$14;->this$0:Lcom/daaw/avee/Design/VisualizerExporterDesign;

    invoke-static {v4}, Lcom/daaw/avee/Design/VisualizerExporterDesign;->access$1800(Lcom/daaw/avee/Design/VisualizerExporterDesign;)I

    move-result v4

    if-gt v3, v4, :cond_c

    .line 529
    iget-object v3, p0, Lcom/daaw/avee/Design/VisualizerExporterDesign$14;->this$0:Lcom/daaw/avee/Design/VisualizerExporterDesign;

    invoke-static {v3}, Lcom/daaw/avee/Design/VisualizerExporterDesign;->access$1800(Lcom/daaw/avee/Design/VisualizerExporterDesign;)I

    move-result v3

    sub-int/2addr v3, v1

    const/4 v4, 0x0

    if-lt p1, v3, :cond_2

    goto :goto_0

    :cond_2
    const/4 v1, 0x0

    .line 532
    :goto_0
    iget-object p1, p0, Lcom/daaw/avee/Design/VisualizerExporterDesign$14;->this$0:Lcom/daaw/avee/Design/VisualizerExporterDesign;

    invoke-static {p1}, Lcom/daaw/avee/Design/VisualizerExporterDesign;->access$1900(Lcom/daaw/avee/Design/VisualizerExporterDesign;)Lcom/daaw/avee/comp/playback/AudioFrameData$Request2;

    move-result-object p1

    invoke-static {}, Lcom/daaw/avee/Design/VisualizerExporterDesign;->access$2000()J

    move-result-wide v5

    iput-wide v5, p1, Lcom/daaw/avee/comp/playback/AudioFrameData$Request2;->overridePositionUs:J

    .line 533
    iget-object p1, p0, Lcom/daaw/avee/Design/VisualizerExporterDesign$14;->this$0:Lcom/daaw/avee/Design/VisualizerExporterDesign;

    invoke-static {p1}, Lcom/daaw/avee/Design/VisualizerExporterDesign;->access$1900(Lcom/daaw/avee/Design/VisualizerExporterDesign;)Lcom/daaw/avee/comp/playback/AudioFrameData$Request2;

    move-result-object p1

    const-wide v5, 0x412e848000000000L    # 1000000.0

    int-to-double v2, v2

    invoke-static {v2, v3}, Ljava/lang/Double;->isNaN(D)Z

    div-double/2addr v5, v2

    invoke-static {v5, v6}, Ljava/lang/Math;->ceil(D)D

    move-result-wide v2

    double-to-long v2, v2

    iput-wide v2, p1, Lcom/daaw/avee/comp/playback/AudioFrameData$Request2;->samplesCountUs:J

    .line 534
    iget-object p1, p0, Lcom/daaw/avee/Design/VisualizerExporterDesign$14;->this$0:Lcom/daaw/avee/Design/VisualizerExporterDesign;

    invoke-static {p1}, Lcom/daaw/avee/Design/VisualizerExporterDesign;->access$1900(Lcom/daaw/avee/Design/VisualizerExporterDesign;)Lcom/daaw/avee/comp/playback/AudioFrameData$Request2;

    move-result-object p1

    invoke-virtual {p2}, Ljava/lang/Integer;->intValue()I

    move-result p2

    iput p2, p1, Lcom/daaw/avee/comp/playback/AudioFrameData$Request2;->samplesCount:I

    .line 537
    sget-object p1, Lcom/daaw/avee/Design/VisualizerExporterDesign;->getVisualizationData:Lcom/daaw/avee/Common/Events/WeakDelegateR2;

    iget-object p2, p0, Lcom/daaw/avee/Design/VisualizerExporterDesign$14;->this$0:Lcom/daaw/avee/Design/VisualizerExporterDesign;

    invoke-static {p2}, Lcom/daaw/avee/Design/VisualizerExporterDesign;->access$1300(Lcom/daaw/avee/Design/VisualizerExporterDesign;)Lcom/daaw/avee/comp/playback/AudioFrameData;

    move-result-object p2

    iget-object v2, p0, Lcom/daaw/avee/Design/VisualizerExporterDesign$14;->this$0:Lcom/daaw/avee/Design/VisualizerExporterDesign;

    invoke-static {v2}, Lcom/daaw/avee/Design/VisualizerExporterDesign;->access$1900(Lcom/daaw/avee/Design/VisualizerExporterDesign;)Lcom/daaw/avee/comp/playback/AudioFrameData$Request2;

    move-result-object v2

    invoke-virtual {p1, p2, v2, v0}, Lcom/daaw/avee/Common/Events/WeakDelegateR2;->invoke(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lcom/daaw/avee/comp/playback/AudioFrameData;

    .line 550
    iget-object p2, p0, Lcom/daaw/avee/Design/VisualizerExporterDesign$14;->this$0:Lcom/daaw/avee/Design/VisualizerExporterDesign;

    invoke-static {p2}, Lcom/daaw/avee/Design/VisualizerExporterDesign;->access$1500(Lcom/daaw/avee/Design/VisualizerExporterDesign;)I

    move-result p2

    rem-int/lit8 p2, p2, 0xf

    if-nez p2, :cond_3

    .line 551
    iget-object p2, p0, Lcom/daaw/avee/Design/VisualizerExporterDesign$14;->this$0:Lcom/daaw/avee/Design/VisualizerExporterDesign;

    invoke-static {p2}, Lcom/daaw/avee/Design/VisualizerExporterDesign;->access$1900(Lcom/daaw/avee/Design/VisualizerExporterDesign;)Lcom/daaw/avee/comp/playback/AudioFrameData$Request2;

    move-result-object v2

    iget-wide v2, v2, Lcom/daaw/avee/comp/playback/AudioFrameData$Request2;->overridePositionUs:J

    invoke-static {p2, v2, v3}, Lcom/daaw/avee/Design/VisualizerExporterDesign;->access$2100(Lcom/daaw/avee/Design/VisualizerExporterDesign;J)V

    :cond_3
    if-eqz p1, :cond_4

    .line 554
    iget-boolean p2, p1, Lcom/daaw/avee/comp/playback/AudioFrameData;->capturedDataFully:Z

    if-nez p2, :cond_a

    :cond_4
    if-nez v1, :cond_a

    const-wide/16 v1, 0x3e8

    const-string p2, "not capturedDataFully posMs: "

    if-eqz p1, :cond_5

    .line 557
    new-instance v3, Ljava/lang/StringBuilder;

    invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v3, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object p2, p0, Lcom/daaw/avee/Design/VisualizerExporterDesign$14;->this$0:Lcom/daaw/avee/Design/VisualizerExporterDesign;

    invoke-static {p2}, Lcom/daaw/avee/Design/VisualizerExporterDesign;->access$1900(Lcom/daaw/avee/Design/VisualizerExporterDesign;)Lcom/daaw/avee/comp/playback/AudioFrameData$Request2;

    move-result-object p2

    iget-wide v5, p2, Lcom/daaw/avee/comp/playback/AudioFrameData$Request2;->overridePositionUs:J

    div-long/2addr v5, v1

    invoke-virtual {v3, v5, v6}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    const-string p2, ", readjust and wait "

    invoke-virtual {v3, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget p2, p1, Lcom/daaw/avee/comp/playback/AudioFrameData;->captureSamplesCount:I

    invoke-virtual {v3, p2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string p2, " / "

    invoke-virtual {v3, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 558
    invoke-virtual {p1}, Lcom/daaw/avee/comp/playback/AudioFrameData;->getBufferSizeForCapture()I

    move-result p2

    invoke-virtual {v3, p2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p2

    .line 557
    invoke-static {p2}, Lcom/daaw/avee/Common/tlog;->d(Ljava/lang/String;)V

    goto :goto_1

    .line 560
    :cond_5
    new-instance v3, Ljava/lang/StringBuilder;

    invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v3, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object p2, p0, Lcom/daaw/avee/Design/VisualizerExporterDesign$14;->this$0:Lcom/daaw/avee/Design/VisualizerExporterDesign;

    invoke-static {p2}, Lcom/daaw/avee/Design/VisualizerExporterDesign;->access$1900(Lcom/daaw/avee/Design/VisualizerExporterDesign;)Lcom/daaw/avee/comp/playback/AudioFrameData$Request2;

    move-result-object p2

    iget-wide v5, p2, Lcom/daaw/avee/comp/playback/AudioFrameData$Request2;->overridePositionUs:J

    div-long/2addr v5, v1

    invoke-virtual {v3, v5, v6}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    const-string p2, ", readjust and wait, outData is null"

    invoke-virtual {v3, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p2

    invoke-static {p2}, Lcom/daaw/avee/Common/tlog;->d(Ljava/lang/String;)V

    .line 564
    :goto_1
    iget-object p2, p0, Lcom/daaw/avee/Design/VisualizerExporterDesign$14;->this$0:Lcom/daaw/avee/Design/VisualizerExporterDesign;

    invoke-virtual {p2}, Lcom/daaw/avee/Design/VisualizerExporterDesign;->readjustSeek2()V

    :goto_2
    const/16 p2, 0xa

    if-ge v4, p2, :cond_8

    if-eqz p1, :cond_6

    .line 570
    iget-object v1, p0, Lcom/daaw/avee/Design/VisualizerExporterDesign$14;->this$0:Lcom/daaw/avee/Design/VisualizerExporterDesign;

    invoke-static {v1, p1}, Lcom/daaw/avee/Design/VisualizerExporterDesign;->access$1302(Lcom/daaw/avee/Design/VisualizerExporterDesign;Lcom/daaw/avee/comp/playback/AudioFrameData;)Lcom/daaw/avee/comp/playback/AudioFrameData;

    .line 571
    :cond_6
    sget-object p1, Lcom/daaw/avee/Design/VisualizerExporterDesign;->getVisualizationData:Lcom/daaw/avee/Common/Events/WeakDelegateR2;

    iget-object v1, p0, Lcom/daaw/avee/Design/VisualizerExporterDesign$14;->this$0:Lcom/daaw/avee/Design/VisualizerExporterDesign;

    invoke-static {v1}, Lcom/daaw/avee/Design/VisualizerExporterDesign;->access$1300(Lcom/daaw/avee/Design/VisualizerExporterDesign;)Lcom/daaw/avee/comp/playback/AudioFrameData;

    move-result-object v1

    iget-object v2, p0, Lcom/daaw/avee/Design/VisualizerExporterDesign$14;->this$0:Lcom/daaw/avee/Design/VisualizerExporterDesign;

    invoke-static {v2}, Lcom/daaw/avee/Design/VisualizerExporterDesign;->access$1900(Lcom/daaw/avee/Design/VisualizerExporterDesign;)Lcom/daaw/avee/comp/playback/AudioFrameData$Request2;

    move-result-object v2

    invoke-virtual {p1, v1, v2, v0}, Lcom/daaw/avee/Common/Events/WeakDelegateR2;->invoke(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lcom/daaw/avee/comp/playback/AudioFrameData;

    if-eqz p1, :cond_7

    .line 572
    iget-boolean v1, p1, Lcom/daaw/avee/comp/playback/AudioFrameData;->capturedDataFully:Z

    if-eqz v1, :cond_7

    goto :goto_3

    :cond_7
    const-wide/16 v1, 0x1f4

    .line 582
    :try_start_0
    invoke-static {v1, v2}, Ljava/lang/Thread;->sleep(J)V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    :catch_0
    add-int/lit8 v4, v4, 0x1

    goto :goto_2

    :cond_8
    :goto_3
    if-lez v4, :cond_9

    const-string v0, "didn\'t got with first"

    .line 589
    invoke-static {v0}, Lcom/daaw/avee/Common/tlog;->d(Ljava/lang/String;)V

    :cond_9
    if-lt v4, p2, :cond_a

    const-string p2, "failed to get capturedDataFully, gave up"

    .line 591
    invoke-static {p2}, Lcom/daaw/avee/Common/tlog;->d(Ljava/lang/String;)V

    .line 592
    iget-object p2, p0, Lcom/daaw/avee/Design/VisualizerExporterDesign$14;->this$0:Lcom/daaw/avee/Design/VisualizerExporterDesign;

    invoke-static {p2}, Lcom/daaw/avee/Design/VisualizerExporterDesign;->access$2200(Lcom/daaw/avee/Design/VisualizerExporterDesign;)Lcom/daaw/avee/Common/StatusMsg;

    move-result-object p2

    const-string v0, "warning: failed to get audio data for frame"

    invoke-virtual {p2, v0}, Lcom/daaw/avee/Common/StatusMsg;->addErrorMessageCollapsed(Ljava/lang/String;)V

    :cond_a
    if-eqz p1, :cond_b

    .line 596
    iget-object p2, p0, Lcom/daaw/avee/Design/VisualizerExporterDesign$14;->this$0:Lcom/daaw/avee/Design/VisualizerExporterDesign;

    invoke-static {p2, p1}, Lcom/daaw/avee/Design/VisualizerExporterDesign;->access$1302(Lcom/daaw/avee/Design/VisualizerExporterDesign;Lcom/daaw/avee/comp/playback/AudioFrameData;)Lcom/daaw/avee/comp/playback/AudioFrameData;

    .line 597
    :cond_b
    iget-object p2, p0, Lcom/daaw/avee/Design/VisualizerExporterDesign$14;->this$0:Lcom/daaw/avee/Design/VisualizerExporterDesign;

    invoke-static {p2, p1}, Lcom/daaw/avee/Design/VisualizerExporterDesign;->access$2302(Lcom/daaw/avee/Design/VisualizerExporterDesign;Lcom/daaw/avee/comp/playback/AudioFrameData;)Lcom/daaw/avee/comp/playback/AudioFrameData;

    return-object p1

    :cond_c
    return-object v0
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    .line 508
    check-cast p1, Lcom/daaw/avee/comp/playback/AudioFrameData;

    check-cast p2, Ljava/lang/Integer;

    invoke-virtual {p0, p1, p2}, Lcom/daaw/avee/Design/VisualizerExporterDesign$14;->invoke(Lcom/daaw/avee/comp/playback/AudioFrameData;Ljava/lang/Integer;)Lcom/daaw/avee/comp/playback/AudioFrameData;

    move-result-object p1

    return-object p1
.end method
