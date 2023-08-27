.class Lcom/daaw/avee/Design/VisualizerExporterDesign$17;
.super Ljava/lang/Object;
.source "VisualizerExporterDesign.java"

# interfaces
.implements Lcom/daaw/avee/Common/Events/WeakEvent3$Handler;


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
        "Lcom/daaw/avee/Common/Events/WeakEvent3$Handler<",
        "Lmdesl/graphics/Texture;",
        "Ljava/lang/Boolean;",
        "Ljava/lang/String;",
        ">;"
    }
.end annotation


# instance fields
.field final synthetic this$0:Lcom/daaw/avee/Design/VisualizerExporterDesign;


# direct methods
.method constructor <init>(Lcom/daaw/avee/Design/VisualizerExporterDesign;)V
    .locals 0

    .line 726
    iput-object p1, p0, Lcom/daaw/avee/Design/VisualizerExporterDesign$17;->this$0:Lcom/daaw/avee/Design/VisualizerExporterDesign;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public bridge synthetic invoke(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)V
    .locals 0

    .line 726
    check-cast p1, Lmdesl/graphics/Texture;

    check-cast p2, Ljava/lang/Boolean;

    check-cast p3, Ljava/lang/String;

    invoke-virtual {p0, p1, p2, p3}, Lcom/daaw/avee/Design/VisualizerExporterDesign$17;->invoke(Lmdesl/graphics/Texture;Ljava/lang/Boolean;Ljava/lang/String;)V

    return-void
.end method

.method public invoke(Lmdesl/graphics/Texture;Ljava/lang/Boolean;Ljava/lang/String;)V
    .locals 8

    .line 732
    invoke-static {}, Lcom/daaw/avee/Design/VisualizerExporterDesign;->access$1100()Z

    move-result v0

    const/4 v1, 0x1

    if-nez v0, :cond_0

    .line 733
    iget-object p1, p0, Lcom/daaw/avee/Design/VisualizerExporterDesign$17;->this$0:Lcom/daaw/avee/Design/VisualizerExporterDesign;

    invoke-static {p1, v1}, Lcom/daaw/avee/Design/VisualizerExporterDesign;->access$1402(Lcom/daaw/avee/Design/VisualizerExporterDesign;Z)Z

    return-void

    .line 741
    :cond_0
    invoke-virtual {p2}, Ljava/lang/Boolean;->booleanValue()Z

    move-result p2

    const/16 v0, 0x258

    if-eqz p2, :cond_2

    iget-object p2, p0, Lcom/daaw/avee/Design/VisualizerExporterDesign$17;->this$0:Lcom/daaw/avee/Design/VisualizerExporterDesign;

    invoke-static {p2}, Lcom/daaw/avee/Design/VisualizerExporterDesign;->access$2600(Lcom/daaw/avee/Design/VisualizerExporterDesign;)I

    move-result p2

    if-ge p2, v0, :cond_2

    .line 742
    iget-object p1, p0, Lcom/daaw/avee/Design/VisualizerExporterDesign$17;->this$0:Lcom/daaw/avee/Design/VisualizerExporterDesign;

    invoke-static {p1}, Lcom/daaw/avee/Design/VisualizerExporterDesign;->access$2608(Lcom/daaw/avee/Design/VisualizerExporterDesign;)I

    .line 743
    iget-object p1, p0, Lcom/daaw/avee/Design/VisualizerExporterDesign$17;->this$0:Lcom/daaw/avee/Design/VisualizerExporterDesign;

    invoke-static {p1}, Lcom/daaw/avee/Design/VisualizerExporterDesign;->access$2600(Lcom/daaw/avee/Design/VisualizerExporterDesign;)I

    move-result p1

    rem-int/lit8 p1, p1, 0x1e

    if-nez p1, :cond_1

    .line 744
    iget-object p1, p0, Lcom/daaw/avee/Design/VisualizerExporterDesign$17;->this$0:Lcom/daaw/avee/Design/VisualizerExporterDesign;

    invoke-static {p1}, Lcom/daaw/avee/Design/VisualizerExporterDesign;->access$2800(Lcom/daaw/avee/Design/VisualizerExporterDesign;)Landroid/os/Handler;

    move-result-object p1

    new-instance p2, Lcom/daaw/avee/Design/VisualizerExporterDesign$17$1;

    invoke-direct {p2, p0, p3}, Lcom/daaw/avee/Design/VisualizerExporterDesign$17$1;-><init>(Lcom/daaw/avee/Design/VisualizerExporterDesign$17;Ljava/lang/String;)V

    invoke-virtual {p1, p2}, Landroid/os/Handler;->post(Ljava/lang/Runnable;)Z

    :cond_1
    return-void

    .line 760
    :cond_2
    iget-object p2, p0, Lcom/daaw/avee/Design/VisualizerExporterDesign$17;->this$0:Lcom/daaw/avee/Design/VisualizerExporterDesign;

    invoke-static {p2}, Lcom/daaw/avee/Design/VisualizerExporterDesign;->access$2600(Lcom/daaw/avee/Design/VisualizerExporterDesign;)I

    move-result p2

    if-lt p2, v0, :cond_3

    .line 762
    iget-object p2, p0, Lcom/daaw/avee/Design/VisualizerExporterDesign$17;->this$0:Lcom/daaw/avee/Design/VisualizerExporterDesign;

    invoke-static {p2}, Lcom/daaw/avee/Design/VisualizerExporterDesign;->access$2200(Lcom/daaw/avee/Design/VisualizerExporterDesign;)Lcom/daaw/avee/Common/StatusMsg;

    move-result-object p2

    const-string p3, "loading resources timeout"

    invoke-virtual {p2, p3}, Lcom/daaw/avee/Common/StatusMsg;->addErrorMessageCollapsed(Ljava/lang/String;)V

    .line 767
    :cond_3
    iget-object p2, p0, Lcom/daaw/avee/Design/VisualizerExporterDesign$17;->this$0:Lcom/daaw/avee/Design/VisualizerExporterDesign;

    invoke-static {p2}, Lcom/daaw/avee/Design/VisualizerExporterDesign;->access$2500(Lcom/daaw/avee/Design/VisualizerExporterDesign;)Lcom/daaw/avee/comp/Visualizer/FrameCaptureDesc;

    move-result-object p2

    iget-boolean p2, p2, Lcom/daaw/avee/comp/Visualizer/FrameCaptureDesc;->captureToImageBuffer:Z

    if-eqz p2, :cond_4

    return-void

    .line 769
    :cond_4
    iget-object p2, p0, Lcom/daaw/avee/Design/VisualizerExporterDesign$17;->this$0:Lcom/daaw/avee/Design/VisualizerExporterDesign;

    invoke-static {p2}, Lcom/daaw/avee/Design/VisualizerExporterDesign;->access$1500(Lcom/daaw/avee/Design/VisualizerExporterDesign;)I

    move-result p2

    iget-object p3, p0, Lcom/daaw/avee/Design/VisualizerExporterDesign$17;->this$0:Lcom/daaw/avee/Design/VisualizerExporterDesign;

    invoke-static {p3}, Lcom/daaw/avee/Design/VisualizerExporterDesign;->access$1600(Lcom/daaw/avee/Design/VisualizerExporterDesign;)I

    move-result p3

    if-ne p2, p3, :cond_7

    .line 771
    iget-object p2, p0, Lcom/daaw/avee/Design/VisualizerExporterDesign$17;->this$0:Lcom/daaw/avee/Design/VisualizerExporterDesign;

    invoke-static {p2}, Lcom/daaw/avee/Design/VisualizerExporterDesign;->access$2200(Lcom/daaw/avee/Design/VisualizerExporterDesign;)Lcom/daaw/avee/Common/StatusMsg;

    move-result-object p2

    invoke-virtual {p2}, Lcom/daaw/avee/Common/StatusMsg;->reset()V

    .line 773
    invoke-static {}, Ljava/lang/System;->gc()V

    .line 774
    iget-object p2, p0, Lcom/daaw/avee/Design/VisualizerExporterDesign$17;->this$0:Lcom/daaw/avee/Design/VisualizerExporterDesign;

    invoke-static {p2}, Lcom/daaw/avee/Design/VisualizerExporterDesign;->access$2900(Lcom/daaw/avee/Design/VisualizerExporterDesign;)Lcom/daaw/avee/comp/VisualizerExporter/AudioVideoCTSRecorder;

    move-result-object p2

    if-nez p2, :cond_7

    .line 775
    iget-object p2, p0, Lcom/daaw/avee/Design/VisualizerExporterDesign$17;->this$0:Lcom/daaw/avee/Design/VisualizerExporterDesign;

    invoke-static {p2}, Lcom/daaw/avee/Design/VisualizerExporterDesign;->access$2300(Lcom/daaw/avee/Design/VisualizerExporterDesign;)Lcom/daaw/avee/comp/playback/AudioFrameData;

    move-result-object p2

    if-eqz p2, :cond_5

    iget-object p2, p0, Lcom/daaw/avee/Design/VisualizerExporterDesign$17;->this$0:Lcom/daaw/avee/Design/VisualizerExporterDesign;

    invoke-static {p2}, Lcom/daaw/avee/Design/VisualizerExporterDesign;->access$2300(Lcom/daaw/avee/Design/VisualizerExporterDesign;)Lcom/daaw/avee/comp/playback/AudioFrameData;

    move-result-object p2

    iget p2, p2, Lcom/daaw/avee/comp/playback/AudioFrameData;->sampleRate:I

    move v5, p2

    goto :goto_0

    :cond_5
    const p2, 0xac44

    const v5, 0xac44

    .line 776
    :goto_0
    iget-object p2, p0, Lcom/daaw/avee/Design/VisualizerExporterDesign$17;->this$0:Lcom/daaw/avee/Design/VisualizerExporterDesign;

    invoke-static {p2}, Lcom/daaw/avee/Design/VisualizerExporterDesign;->access$2300(Lcom/daaw/avee/Design/VisualizerExporterDesign;)Lcom/daaw/avee/comp/playback/AudioFrameData;

    move-result-object p2

    if-nez p2, :cond_6

    .line 777
    iget-object p2, p0, Lcom/daaw/avee/Design/VisualizerExporterDesign$17;->this$0:Lcom/daaw/avee/Design/VisualizerExporterDesign;

    invoke-static {p2}, Lcom/daaw/avee/Design/VisualizerExporterDesign;->access$2200(Lcom/daaw/avee/Design/VisualizerExporterDesign;)Lcom/daaw/avee/Common/StatusMsg;

    move-result-object p2

    const-string p3, "failed to get audio sampleRate"

    invoke-virtual {p2, p3}, Lcom/daaw/avee/Common/StatusMsg;->addErrorMessage(Ljava/lang/String;)V

    .line 778
    :cond_6
    iget-object v2, p0, Lcom/daaw/avee/Design/VisualizerExporterDesign$17;->this$0:Lcom/daaw/avee/Design/VisualizerExporterDesign;

    invoke-virtual {p1}, Lmdesl/graphics/Texture;->getWidth()I

    move-result v3

    invoke-virtual {p1}, Lmdesl/graphics/Texture;->getHeight()I

    move-result v4

    iget-object p2, p0, Lcom/daaw/avee/Design/VisualizerExporterDesign$17;->this$0:Lcom/daaw/avee/Design/VisualizerExporterDesign;

    invoke-static {p2}, Lcom/daaw/avee/Design/VisualizerExporterDesign;->access$3000(Lcom/daaw/avee/Design/VisualizerExporterDesign;)Ljava/io/File;

    move-result-object v6

    iget-object p2, p0, Lcom/daaw/avee/Design/VisualizerExporterDesign$17;->this$0:Lcom/daaw/avee/Design/VisualizerExporterDesign;

    invoke-static {p2}, Lcom/daaw/avee/Design/VisualizerExporterDesign;->access$3100(Lcom/daaw/avee/Design/VisualizerExporterDesign;)Ljava/io/OutputStream;

    move-result-object v7

    invoke-static/range {v2 .. v7}, Lcom/daaw/avee/Design/VisualizerExporterDesign;->access$3200(Lcom/daaw/avee/Design/VisualizerExporterDesign;IIILjava/io/File;Ljava/io/OutputStream;)Ljava/lang/String;

    move-result-object p2

    if-eqz p2, :cond_7

    .line 780
    iget-object p3, p0, Lcom/daaw/avee/Design/VisualizerExporterDesign$17;->this$0:Lcom/daaw/avee/Design/VisualizerExporterDesign;

    invoke-static {p3}, Lcom/daaw/avee/Design/VisualizerExporterDesign;->access$2200(Lcom/daaw/avee/Design/VisualizerExporterDesign;)Lcom/daaw/avee/Common/StatusMsg;

    move-result-object p3

    invoke-virtual {p3, p2}, Lcom/daaw/avee/Common/StatusMsg;->addCriticalError(Ljava/lang/String;)V

    .line 784
    :cond_7
    iget-object p2, p0, Lcom/daaw/avee/Design/VisualizerExporterDesign$17;->this$0:Lcom/daaw/avee/Design/VisualizerExporterDesign;

    invoke-static {p2}, Lcom/daaw/avee/Design/VisualizerExporterDesign;->access$1500(Lcom/daaw/avee/Design/VisualizerExporterDesign;)I

    move-result p2

    iget-object p3, p0, Lcom/daaw/avee/Design/VisualizerExporterDesign$17;->this$0:Lcom/daaw/avee/Design/VisualizerExporterDesign;

    invoke-static {p3}, Lcom/daaw/avee/Design/VisualizerExporterDesign;->access$1600(Lcom/daaw/avee/Design/VisualizerExporterDesign;)I

    move-result p3

    if-lt p2, p3, :cond_9

    iget-object p2, p0, Lcom/daaw/avee/Design/VisualizerExporterDesign$17;->this$0:Lcom/daaw/avee/Design/VisualizerExporterDesign;

    invoke-static {p2}, Lcom/daaw/avee/Design/VisualizerExporterDesign;->access$1500(Lcom/daaw/avee/Design/VisualizerExporterDesign;)I

    move-result p2

    iget-object p3, p0, Lcom/daaw/avee/Design/VisualizerExporterDesign$17;->this$0:Lcom/daaw/avee/Design/VisualizerExporterDesign;

    invoke-static {p3}, Lcom/daaw/avee/Design/VisualizerExporterDesign;->access$1800(Lcom/daaw/avee/Design/VisualizerExporterDesign;)I

    move-result p3

    if-gt p2, p3, :cond_9

    iget-object p2, p0, Lcom/daaw/avee/Design/VisualizerExporterDesign$17;->this$0:Lcom/daaw/avee/Design/VisualizerExporterDesign;

    invoke-static {p2}, Lcom/daaw/avee/Design/VisualizerExporterDesign;->access$2900(Lcom/daaw/avee/Design/VisualizerExporterDesign;)Lcom/daaw/avee/comp/VisualizerExporter/AudioVideoCTSRecorder;

    move-result-object p2

    if-eqz p2, :cond_9

    iget-object p2, p0, Lcom/daaw/avee/Design/VisualizerExporterDesign$17;->this$0:Lcom/daaw/avee/Design/VisualizerExporterDesign;

    invoke-static {p2}, Lcom/daaw/avee/Design/VisualizerExporterDesign;->access$2200(Lcom/daaw/avee/Design/VisualizerExporterDesign;)Lcom/daaw/avee/Common/StatusMsg;

    move-result-object p2

    invoke-virtual {p2}, Lcom/daaw/avee/Common/StatusMsg;->hasCriticalError()Z

    move-result p2

    if-nez p2, :cond_9

    .line 789
    iget-object p2, p0, Lcom/daaw/avee/Design/VisualizerExporterDesign$17;->this$0:Lcom/daaw/avee/Design/VisualizerExporterDesign;

    invoke-static {p2}, Lcom/daaw/avee/Design/VisualizerExporterDesign;->access$2900(Lcom/daaw/avee/Design/VisualizerExporterDesign;)Lcom/daaw/avee/comp/VisualizerExporter/AudioVideoCTSRecorder;

    move-result-object p2

    invoke-virtual {p2}, Lcom/daaw/avee/comp/VisualizerExporter/AudioVideoCTSRecorder;->frameAvailableSoon()V

    .line 790
    iget-object p2, p0, Lcom/daaw/avee/Design/VisualizerExporterDesign$17;->this$0:Lcom/daaw/avee/Design/VisualizerExporterDesign;

    invoke-static {p2}, Lcom/daaw/avee/Design/VisualizerExporterDesign;->access$2900(Lcom/daaw/avee/Design/VisualizerExporterDesign;)Lcom/daaw/avee/comp/VisualizerExporter/AudioVideoCTSRecorder;

    move-result-object p2

    invoke-static {}, Lcom/daaw/avee/Design/VisualizerExporterDesign;->access$3300()J

    move-result-wide v2

    iget-object p3, p0, Lcom/daaw/avee/Design/VisualizerExporterDesign$17;->this$0:Lcom/daaw/avee/Design/VisualizerExporterDesign;

    invoke-static {p3}, Lcom/daaw/avee/Design/VisualizerExporterDesign;->access$3400(Lcom/daaw/avee/Design/VisualizerExporterDesign;)I

    move-result p3

    invoke-virtual {p2, p1, v2, v3, p3}, Lcom/daaw/avee/comp/VisualizerExporter/AudioVideoCTSRecorder;->addFrameImageOGL(Lmdesl/graphics/Texture;JI)Z

    move-result p1

    if-nez p1, :cond_8

    const-string p1, "failed to add video frame"

    .line 791
    invoke-static {p1}, Lcom/daaw/avee/Common/tlog;->w(Ljava/lang/String;)V

    .line 792
    iget-object p2, p0, Lcom/daaw/avee/Design/VisualizerExporterDesign$17;->this$0:Lcom/daaw/avee/Design/VisualizerExporterDesign;

    invoke-static {p2}, Lcom/daaw/avee/Design/VisualizerExporterDesign;->access$2200(Lcom/daaw/avee/Design/VisualizerExporterDesign;)Lcom/daaw/avee/Common/StatusMsg;

    move-result-object p2

    invoke-virtual {p2, p1}, Lcom/daaw/avee/Common/StatusMsg;->addErrorMessageCollapsed(Ljava/lang/String;)V

    .line 794
    :cond_8
    iget-object p1, p0, Lcom/daaw/avee/Design/VisualizerExporterDesign$17;->this$0:Lcom/daaw/avee/Design/VisualizerExporterDesign;

    invoke-static {p1}, Lcom/daaw/avee/Design/VisualizerExporterDesign;->access$2300(Lcom/daaw/avee/Design/VisualizerExporterDesign;)Lcom/daaw/avee/comp/playback/AudioFrameData;

    move-result-object p1

    if-eqz p1, :cond_9

    iget-object p1, p0, Lcom/daaw/avee/Design/VisualizerExporterDesign$17;->this$0:Lcom/daaw/avee/Design/VisualizerExporterDesign;

    invoke-static {p1}, Lcom/daaw/avee/Design/VisualizerExporterDesign;->access$2900(Lcom/daaw/avee/Design/VisualizerExporterDesign;)Lcom/daaw/avee/comp/VisualizerExporter/AudioVideoCTSRecorder;

    move-result-object p1

    if-eqz p1, :cond_9

    .line 796
    iget-object p1, p0, Lcom/daaw/avee/Design/VisualizerExporterDesign$17;->this$0:Lcom/daaw/avee/Design/VisualizerExporterDesign;

    invoke-static {p1}, Lcom/daaw/avee/Design/VisualizerExporterDesign;->access$2300(Lcom/daaw/avee/Design/VisualizerExporterDesign;)Lcom/daaw/avee/comp/playback/AudioFrameData;

    move-result-object p1

    invoke-static {}, Lcom/daaw/avee/Design/VisualizerExporterDesign;->access$3300()J

    move-result-wide p2

    iput-wide p2, p1, Lcom/daaw/avee/comp/playback/AudioFrameData;->capturedDataPositionEndUs:J

    .line 798
    iget-object p1, p0, Lcom/daaw/avee/Design/VisualizerExporterDesign$17;->this$0:Lcom/daaw/avee/Design/VisualizerExporterDesign;

    invoke-static {p1}, Lcom/daaw/avee/Design/VisualizerExporterDesign;->access$2900(Lcom/daaw/avee/Design/VisualizerExporterDesign;)Lcom/daaw/avee/comp/VisualizerExporter/AudioVideoCTSRecorder;

    move-result-object p1

    invoke-virtual {p1}, Lcom/daaw/avee/comp/VisualizerExporter/AudioVideoCTSRecorder;->getAudioInputFormatChannelCount()I

    move-result p1

    .line 799
    iget-object p2, p0, Lcom/daaw/avee/Design/VisualizerExporterDesign$17;->this$0:Lcom/daaw/avee/Design/VisualizerExporterDesign;

    invoke-static {p2}, Lcom/daaw/avee/Design/VisualizerExporterDesign;->access$2300(Lcom/daaw/avee/Design/VisualizerExporterDesign;)Lcom/daaw/avee/comp/playback/AudioFrameData;

    move-result-object p2

    iget-object p3, p0, Lcom/daaw/avee/Design/VisualizerExporterDesign$17;->this$0:Lcom/daaw/avee/Design/VisualizerExporterDesign;

    invoke-static {p3}, Lcom/daaw/avee/Design/VisualizerExporterDesign;->access$2300(Lcom/daaw/avee/Design/VisualizerExporterDesign;)Lcom/daaw/avee/comp/playback/AudioFrameData;

    move-result-object p3

    invoke-virtual {p3}, Lcom/daaw/avee/comp/playback/AudioFrameData;->getBufferSizeForTimedResult()I

    move-result p3

    invoke-virtual {p2, p1, p3}, Lcom/daaw/avee/comp/playback/AudioFrameData;->pcmAsDesiredChannelCount(II)Lcom/daaw/avee/Common/ISimpleListShort;

    move-result-object p1

    .line 800
    iget-object p2, p0, Lcom/daaw/avee/Design/VisualizerExporterDesign$17;->this$0:Lcom/daaw/avee/Design/VisualizerExporterDesign;

    invoke-static {p2}, Lcom/daaw/avee/Design/VisualizerExporterDesign;->access$2900(Lcom/daaw/avee/Design/VisualizerExporterDesign;)Lcom/daaw/avee/comp/VisualizerExporter/AudioVideoCTSRecorder;

    move-result-object p2

    iget-object p3, p0, Lcom/daaw/avee/Design/VisualizerExporterDesign$17;->this$0:Lcom/daaw/avee/Design/VisualizerExporterDesign;

    invoke-static {p3}, Lcom/daaw/avee/Design/VisualizerExporterDesign;->access$2300(Lcom/daaw/avee/Design/VisualizerExporterDesign;)Lcom/daaw/avee/comp/playback/AudioFrameData;

    move-result-object p3

    iget-wide v2, p3, Lcom/daaw/avee/comp/playback/AudioFrameData;->capturedDataPositionEndUs:J

    invoke-virtual {p2, p1, v2, v3}, Lcom/daaw/avee/comp/VisualizerExporter/AudioVideoCTSRecorder;->audioFrameAvailableSoon(Lcom/daaw/avee/Common/ISimpleListShort;J)V

    .line 805
    :cond_9
    iget-object p1, p0, Lcom/daaw/avee/Design/VisualizerExporterDesign$17;->this$0:Lcom/daaw/avee/Design/VisualizerExporterDesign;

    invoke-static {p1}, Lcom/daaw/avee/Design/VisualizerExporterDesign;->access$1500(Lcom/daaw/avee/Design/VisualizerExporterDesign;)I

    move-result p1

    iget-object p2, p0, Lcom/daaw/avee/Design/VisualizerExporterDesign$17;->this$0:Lcom/daaw/avee/Design/VisualizerExporterDesign;

    invoke-static {p2}, Lcom/daaw/avee/Design/VisualizerExporterDesign;->access$1800(Lcom/daaw/avee/Design/VisualizerExporterDesign;)I

    move-result p2

    if-eq p1, p2, :cond_a

    iget-object p1, p0, Lcom/daaw/avee/Design/VisualizerExporterDesign$17;->this$0:Lcom/daaw/avee/Design/VisualizerExporterDesign;

    invoke-static {p1}, Lcom/daaw/avee/Design/VisualizerExporterDesign;->access$2200(Lcom/daaw/avee/Design/VisualizerExporterDesign;)Lcom/daaw/avee/Common/StatusMsg;

    move-result-object p1

    invoke-virtual {p1}, Lcom/daaw/avee/Common/StatusMsg;->hasCriticalError()Z

    move-result p1

    if-eqz p1, :cond_b

    .line 807
    :cond_a
    iget-object p1, p0, Lcom/daaw/avee/Design/VisualizerExporterDesign$17;->this$0:Lcom/daaw/avee/Design/VisualizerExporterDesign;

    invoke-static {p1}, Lcom/daaw/avee/Design/VisualizerExporterDesign;->access$2900(Lcom/daaw/avee/Design/VisualizerExporterDesign;)Lcom/daaw/avee/comp/VisualizerExporter/AudioVideoCTSRecorder;

    move-result-object p1

    if-eqz p1, :cond_b

    .line 808
    iget-object p1, p0, Lcom/daaw/avee/Design/VisualizerExporterDesign$17;->this$0:Lcom/daaw/avee/Design/VisualizerExporterDesign;

    invoke-static {p1}, Lcom/daaw/avee/Design/VisualizerExporterDesign;->access$2900(Lcom/daaw/avee/Design/VisualizerExporterDesign;)Lcom/daaw/avee/comp/VisualizerExporter/AudioVideoCTSRecorder;

    move-result-object p1

    iget-object p2, p0, Lcom/daaw/avee/Design/VisualizerExporterDesign$17;->this$0:Lcom/daaw/avee/Design/VisualizerExporterDesign;

    invoke-static {p2}, Lcom/daaw/avee/Design/VisualizerExporterDesign;->access$2200(Lcom/daaw/avee/Design/VisualizerExporterDesign;)Lcom/daaw/avee/Common/StatusMsg;

    move-result-object p2

    invoke-virtual {p1, p2}, Lcom/daaw/avee/comp/VisualizerExporter/AudioVideoCTSRecorder;->stop(Lcom/daaw/avee/Common/StatusMsg;)Z

    .line 813
    :cond_b
    iget-object p1, p0, Lcom/daaw/avee/Design/VisualizerExporterDesign$17;->this$0:Lcom/daaw/avee/Design/VisualizerExporterDesign;

    invoke-static {p1}, Lcom/daaw/avee/Design/VisualizerExporterDesign;->access$1500(Lcom/daaw/avee/Design/VisualizerExporterDesign;)I

    move-result p1

    iget-object p2, p0, Lcom/daaw/avee/Design/VisualizerExporterDesign$17;->this$0:Lcom/daaw/avee/Design/VisualizerExporterDesign;

    invoke-static {p2}, Lcom/daaw/avee/Design/VisualizerExporterDesign;->access$1800(Lcom/daaw/avee/Design/VisualizerExporterDesign;)I

    move-result p2

    add-int/lit8 p2, p2, 0x1e

    if-eq p1, p2, :cond_d

    iget-object p1, p0, Lcom/daaw/avee/Design/VisualizerExporterDesign$17;->this$0:Lcom/daaw/avee/Design/VisualizerExporterDesign;

    invoke-static {p1}, Lcom/daaw/avee/Design/VisualizerExporterDesign;->access$2200(Lcom/daaw/avee/Design/VisualizerExporterDesign;)Lcom/daaw/avee/Common/StatusMsg;

    move-result-object p1

    invoke-virtual {p1}, Lcom/daaw/avee/Common/StatusMsg;->hasCriticalError()Z

    move-result p1

    if-eqz p1, :cond_c

    goto :goto_1

    .line 828
    :cond_c
    iget-object p1, p0, Lcom/daaw/avee/Design/VisualizerExporterDesign$17;->this$0:Lcom/daaw/avee/Design/VisualizerExporterDesign;

    invoke-static {p1}, Lcom/daaw/avee/Design/VisualizerExporterDesign;->access$1500(Lcom/daaw/avee/Design/VisualizerExporterDesign;)I

    move-result p1

    add-int/lit8 p1, p1, 0xa

    rem-int/lit8 p1, p1, 0x14

    if-nez p1, :cond_e

    .line 829
    iget-object p1, p0, Lcom/daaw/avee/Design/VisualizerExporterDesign$17;->this$0:Lcom/daaw/avee/Design/VisualizerExporterDesign;

    invoke-static {p1}, Lcom/daaw/avee/Design/VisualizerExporterDesign;->access$2800(Lcom/daaw/avee/Design/VisualizerExporterDesign;)Landroid/os/Handler;

    move-result-object p1

    new-instance p2, Lcom/daaw/avee/Design/VisualizerExporterDesign$17$3;

    invoke-direct {p2, p0}, Lcom/daaw/avee/Design/VisualizerExporterDesign$17$3;-><init>(Lcom/daaw/avee/Design/VisualizerExporterDesign$17;)V

    invoke-virtual {p1, p2}, Landroid/os/Handler;->post(Ljava/lang/Runnable;)Z

    goto :goto_2

    .line 816
    :cond_d
    :goto_1
    iget-object p1, p0, Lcom/daaw/avee/Design/VisualizerExporterDesign$17;->this$0:Lcom/daaw/avee/Design/VisualizerExporterDesign;

    invoke-static {p1}, Lcom/daaw/avee/Design/VisualizerExporterDesign;->access$2200(Lcom/daaw/avee/Design/VisualizerExporterDesign;)Lcom/daaw/avee/Common/StatusMsg;

    move-result-object p2

    invoke-virtual {p1, p2}, Lcom/daaw/avee/Design/VisualizerExporterDesign;->destroyEncoder(Lcom/daaw/avee/Common/StatusMsg;)V

    const/4 p1, 0x0

    .line 818
    invoke-static {p1}, Lcom/daaw/avee/Design/VisualizerExporterDesign;->access$1102(Z)Z

    .line 820
    new-instance p1, Lcom/daaw/avee/Common/StatusMsg;

    iget-object p2, p0, Lcom/daaw/avee/Design/VisualizerExporterDesign$17;->this$0:Lcom/daaw/avee/Design/VisualizerExporterDesign;

    invoke-static {p2}, Lcom/daaw/avee/Design/VisualizerExporterDesign;->access$2200(Lcom/daaw/avee/Design/VisualizerExporterDesign;)Lcom/daaw/avee/Common/StatusMsg;

    move-result-object p2

    invoke-direct {p1, p2}, Lcom/daaw/avee/Common/StatusMsg;-><init>(Lcom/daaw/avee/Common/StatusMsg;)V

    .line 821
    iget-object p2, p0, Lcom/daaw/avee/Design/VisualizerExporterDesign$17;->this$0:Lcom/daaw/avee/Design/VisualizerExporterDesign;

    invoke-static {p2}, Lcom/daaw/avee/Design/VisualizerExporterDesign;->access$2800(Lcom/daaw/avee/Design/VisualizerExporterDesign;)Landroid/os/Handler;

    move-result-object p2

    new-instance p3, Lcom/daaw/avee/Design/VisualizerExporterDesign$17$2;

    invoke-direct {p3, p0, p1}, Lcom/daaw/avee/Design/VisualizerExporterDesign$17$2;-><init>(Lcom/daaw/avee/Design/VisualizerExporterDesign$17;Lcom/daaw/avee/Common/StatusMsg;)V

    invoke-virtual {p2, p3}, Landroid/os/Handler;->post(Ljava/lang/Runnable;)Z

    .line 846
    :cond_e
    :goto_2
    iget-object p1, p0, Lcom/daaw/avee/Design/VisualizerExporterDesign$17;->this$0:Lcom/daaw/avee/Design/VisualizerExporterDesign;

    invoke-static {p1}, Lcom/daaw/avee/Design/VisualizerExporterDesign;->access$1500(Lcom/daaw/avee/Design/VisualizerExporterDesign;)I

    move-result p2

    add-int/2addr p2, v1

    invoke-static {p1, p2}, Lcom/daaw/avee/Design/VisualizerExporterDesign;->access$3500(Lcom/daaw/avee/Design/VisualizerExporterDesign;I)V

    return-void
.end method
