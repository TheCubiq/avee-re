.class public Lcom/daaw/avee/Design/PcmDesign;
.super Lcom/daaw/avee/Design/DesignBase;
.source "PcmDesign.java"


# instance fields
.field private pcmBuffer:Lcom/daaw/avee/comp/PcmProcess/PcmBuffer;

.field private pcmData:Lcom/daaw/avee/comp/Common/ExoPcmData;

.field private volatile visualizerData:Lcom/daaw/avee/comp/PcmProcess/ExoVisualizerDataProvider;

.field private final visualizerLock:Ljava/lang/Object;


# direct methods
.method public constructor <init>()V
    .locals 3

    .line 27
    invoke-direct {p0}, Lcom/daaw/avee/Design/DesignBase;-><init>()V

    const/4 v0, 0x0

    .line 21
    iput-object v0, p0, Lcom/daaw/avee/Design/PcmDesign;->visualizerData:Lcom/daaw/avee/comp/PcmProcess/ExoVisualizerDataProvider;

    .line 23
    new-instance v1, Lcom/daaw/avee/comp/Common/ExoPcmData;

    invoke-direct {v1}, Lcom/daaw/avee/comp/Common/ExoPcmData;-><init>()V

    iput-object v1, p0, Lcom/daaw/avee/Design/PcmDesign;->pcmData:Lcom/daaw/avee/comp/Common/ExoPcmData;

    .line 24
    new-instance v1, Ljava/lang/Object;

    invoke-direct {v1}, Ljava/lang/Object;-><init>()V

    iput-object v1, p0, Lcom/daaw/avee/Design/PcmDesign;->visualizerLock:Ljava/lang/Object;

    .line 28
    iput-object v0, p0, Lcom/daaw/avee/Design/PcmDesign;->pcmBuffer:Lcom/daaw/avee/comp/PcmProcess/PcmBuffer;

    .line 30
    sget-object v0, Lcom/daaw/avee/comp/playback/MediaPlaybackService;->onExoPcmData:Lcom/daaw/avee/Common/Events/WeakEvent1;

    new-instance v1, Lcom/daaw/avee/Design/PcmDesign$1;

    invoke-direct {v1, p0}, Lcom/daaw/avee/Design/PcmDesign$1;-><init>(Lcom/daaw/avee/Design/PcmDesign;)V

    iget-object v2, p0, Lcom/daaw/avee/Design/PcmDesign;->listenerRefHolder:Ljava/util/List;

    invoke-virtual {v0, v1, v2}, Lcom/daaw/avee/Common/Events/WeakEvent1;->subscribeWeak(Lcom/daaw/avee/Common/Events/WeakEvent1$Handler;Ljava/util/List;)V

    .line 51
    sget-object v0, Lcom/daaw/avee/comp/playback/MediaPlaybackService;->onExoPcmDataNewSource:Lcom/daaw/avee/Common/Events/WeakEvent;

    new-instance v1, Lcom/daaw/avee/Design/PcmDesign$2;

    invoke-direct {v1, p0}, Lcom/daaw/avee/Design/PcmDesign$2;-><init>(Lcom/daaw/avee/Design/PcmDesign;)V

    iget-object v2, p0, Lcom/daaw/avee/Design/PcmDesign;->listenerRefHolder:Ljava/util/List;

    invoke-virtual {v0, v1, v2}, Lcom/daaw/avee/Common/Events/WeakEvent;->subscribeWeak(Lcom/daaw/avee/Common/Events/WeakEvent$Handler;Ljava/util/List;)V

    .line 66
    sget-object v0, Lcom/daaw/avee/Design/VisualizerExporterDesign;->onExportingChanged:Lcom/daaw/avee/Common/Events/WeakEvent3;

    new-instance v1, Lcom/daaw/avee/Design/PcmDesign$3;

    invoke-direct {v1, p0}, Lcom/daaw/avee/Design/PcmDesign$3;-><init>(Lcom/daaw/avee/Design/PcmDesign;)V

    iget-object v2, p0, Lcom/daaw/avee/Design/PcmDesign;->listenerRefHolder:Ljava/util/List;

    invoke-virtual {v0, v1, v2}, Lcom/daaw/avee/Common/Events/WeakEvent3;->subscribeWeak(Lcom/daaw/avee/Common/Events/WeakEvent3$Handler;Ljava/util/List;)V

    .line 82
    sget-object v0, Lcom/daaw/avee/Design/VisualizerDesign;->getVisualizationData:Lcom/daaw/avee/Common/Events/WeakDelegateR2;

    new-instance v1, Lcom/daaw/avee/Design/PcmDesign$4;

    invoke-direct {v1, p0}, Lcom/daaw/avee/Design/PcmDesign$4;-><init>(Lcom/daaw/avee/Design/PcmDesign;)V

    iget-object v2, p0, Lcom/daaw/avee/Design/PcmDesign;->listenerRefHolder:Ljava/util/List;

    invoke-virtual {v0, v1, v2}, Lcom/daaw/avee/Common/Events/WeakDelegateR2;->subscribeWeak(Lcom/daaw/avee/Common/Events/WeakDelegateR2$Handler;Ljava/util/List;)Lcom/daaw/avee/Common/Events/WeakDelegateR2;

    .line 89
    sget-object v0, Lcom/daaw/avee/Design/VisualizerExporterDesign;->getVisualizationData:Lcom/daaw/avee/Common/Events/WeakDelegateR2;

    new-instance v1, Lcom/daaw/avee/Design/PcmDesign$5;

    invoke-direct {v1, p0}, Lcom/daaw/avee/Design/PcmDesign$5;-><init>(Lcom/daaw/avee/Design/PcmDesign;)V

    iget-object v2, p0, Lcom/daaw/avee/Design/PcmDesign;->listenerRefHolder:Ljava/util/List;

    invoke-virtual {v0, v1, v2}, Lcom/daaw/avee/Common/Events/WeakDelegateR2;->subscribeWeak(Lcom/daaw/avee/Common/Events/WeakDelegateR2$Handler;Ljava/util/List;)Lcom/daaw/avee/Common/Events/WeakDelegateR2;

    return-void
.end method

.method static synthetic access$002(Lcom/daaw/avee/Design/PcmDesign;Lcom/daaw/avee/comp/Common/ExoPcmData;)Lcom/daaw/avee/comp/Common/ExoPcmData;
    .locals 0

    .line 19
    iput-object p1, p0, Lcom/daaw/avee/Design/PcmDesign;->pcmData:Lcom/daaw/avee/comp/Common/ExoPcmData;

    return-object p1
.end method

.method static synthetic access$100(Lcom/daaw/avee/Design/PcmDesign;)Lcom/daaw/avee/comp/PcmProcess/ExoVisualizerDataProvider;
    .locals 0

    .line 19
    iget-object p0, p0, Lcom/daaw/avee/Design/PcmDesign;->visualizerData:Lcom/daaw/avee/comp/PcmProcess/ExoVisualizerDataProvider;

    return-object p0
.end method

.method static synthetic access$200(Lcom/daaw/avee/Design/PcmDesign;)Lcom/daaw/avee/comp/PcmProcess/PcmBuffer;
    .locals 0

    .line 19
    iget-object p0, p0, Lcom/daaw/avee/Design/PcmDesign;->pcmBuffer:Lcom/daaw/avee/comp/PcmProcess/PcmBuffer;

    return-object p0
.end method

.method static synthetic access$202(Lcom/daaw/avee/Design/PcmDesign;Lcom/daaw/avee/comp/PcmProcess/PcmBuffer;)Lcom/daaw/avee/comp/PcmProcess/PcmBuffer;
    .locals 0

    .line 19
    iput-object p1, p0, Lcom/daaw/avee/Design/PcmDesign;->pcmBuffer:Lcom/daaw/avee/comp/PcmProcess/PcmBuffer;

    return-object p1
.end method

.method static synthetic access$300(Lcom/daaw/avee/Design/PcmDesign;Lcom/daaw/avee/comp/playback/AudioFrameData;Lcom/daaw/avee/comp/playback/AudioFrameData$Request2;Z)Lcom/daaw/avee/comp/playback/AudioFrameData;
    .locals 0

    .line 19
    invoke-direct {p0, p1, p2, p3}, Lcom/daaw/avee/Design/PcmDesign;->getSoundVisualizationData(Lcom/daaw/avee/comp/playback/AudioFrameData;Lcom/daaw/avee/comp/playback/AudioFrameData$Request2;Z)Lcom/daaw/avee/comp/playback/AudioFrameData;

    move-result-object p0

    return-object p0
.end method

.method private getSoundVisualizationData(Lcom/daaw/avee/comp/playback/AudioFrameData;Lcom/daaw/avee/comp/playback/AudioFrameData$Request2;Z)Lcom/daaw/avee/comp/playback/AudioFrameData;
    .locals 7

    .line 105
    sget-object v0, Lcom/daaw/avee/comp/playback/EventsPlaybackService$Receive;->getVisualizationData:Lcom/daaw/avee/Common/Events/WeakDelegateR2;

    const/4 v1, 0x0

    invoke-virtual {v0, p1, p2, v1}, Lcom/daaw/avee/Common/Events/WeakDelegateR2;->invoke(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/daaw/avee/comp/playback/AudioFrameData;

    if-nez v0, :cond_1

    if-eqz p3, :cond_0

    const-string p1, "AudioFrameData is null, MediaService not started?"

    .line 108
    invoke-static {p1}, Lcom/daaw/avee/Common/tlog;->w(Ljava/lang/String;)V

    :cond_0
    return-object v0

    .line 111
    :cond_1
    iget-boolean p3, v0, Lcom/daaw/avee/comp/playback/AudioFrameData;->exoDataUse:Z

    if-nez p3, :cond_2

    return-object v0

    .line 114
    :cond_2
    iget-object v1, p0, Lcom/daaw/avee/Design/PcmDesign;->pcmBuffer:Lcom/daaw/avee/comp/PcmProcess/PcmBuffer;

    if-eqz v1, :cond_4

    .line 116
    iget-wide v2, p2, Lcom/daaw/avee/comp/playback/AudioFrameData$Request2;->overridePositionUs:J

    const-wide/16 v4, 0x0

    cmp-long p3, v2, v4

    if-gez p3, :cond_3

    iget-wide v2, v0, Lcom/daaw/avee/comp/playback/AudioFrameData;->exoDataTimePositionUs:J

    goto :goto_0

    :cond_3
    iget-wide v2, p2, Lcom/daaw/avee/comp/playback/AudioFrameData$Request2;->overridePositionUs:J

    .line 117
    :goto_0
    iget-object p3, p0, Lcom/daaw/avee/Design/PcmDesign;->pcmData:Lcom/daaw/avee/comp/Common/ExoPcmData;

    iget v6, p3, Lcom/daaw/avee/comp/Common/ExoPcmData;->bitDepth:I

    move-object v4, p2

    move-object v5, p1

    invoke-virtual/range {v1 .. v6}, Lcom/daaw/avee/comp/PcmProcess/PcmBuffer;->getVisData(JLcom/daaw/avee/comp/playback/AudioFrameData$Request;Lcom/daaw/avee/comp/playback/AudioFrameData;I)Lcom/daaw/avee/comp/playback/AudioFrameData;

    move-result-object p1

    return-object p1

    .line 120
    :cond_4
    iget-wide v0, v0, Lcom/daaw/avee/comp/playback/AudioFrameData;->exoDataTimePositionUs:J

    invoke-virtual {p0, v0, v1, p1, p2}, Lcom/daaw/avee/Design/PcmDesign;->getVisualizationExoData(JLcom/daaw/avee/comp/playback/AudioFrameData;Lcom/daaw/avee/comp/playback/AudioFrameData$Request2;)Lcom/daaw/avee/comp/playback/AudioFrameData;

    move-result-object p1

    return-object p1
.end method


# virtual methods
.method public getVisualizationExoData(JLcom/daaw/avee/comp/playback/AudioFrameData;Lcom/daaw/avee/comp/playback/AudioFrameData$Request2;)Lcom/daaw/avee/comp/playback/AudioFrameData;
    .locals 8

    if-nez p3, :cond_0

    const/4 p1, 0x0

    return-object p1

    .line 126
    :cond_0
    iget-object v0, p0, Lcom/daaw/avee/Design/PcmDesign;->visualizerLock:Ljava/lang/Object;

    monitor-enter v0

    .line 127
    :try_start_0
    iget-object v1, p0, Lcom/daaw/avee/Design/PcmDesign;->visualizerData:Lcom/daaw/avee/comp/PcmProcess/ExoVisualizerDataProvider;

    if-nez v1, :cond_1

    .line 130
    new-instance v1, Lcom/daaw/avee/comp/PcmProcess/ExoVisualizerDataProvider;

    invoke-direct {v1}, Lcom/daaw/avee/comp/PcmProcess/ExoVisualizerDataProvider;-><init>()V

    :cond_1
    move-object v7, v1

    .line 133
    iget-wide v1, p4, Lcom/daaw/avee/comp/playback/AudioFrameData$Request2;->overridePositionUs:J

    const-wide/16 v3, 0x0

    cmp-long v5, v1, v3

    if-gez v5, :cond_2

    goto :goto_0

    :cond_2
    iget-wide p1, p4, Lcom/daaw/avee/comp/playback/AudioFrameData$Request2;->overridePositionUs:J

    :goto_0
    move-wide v2, p1

    .line 134
    iget-boolean v6, p4, Lcom/daaw/avee/comp/playback/AudioFrameData$Request2;->clearBuffers:Z

    move-object v1, v7

    move-object v4, p4

    move-object v5, p3

    invoke-virtual/range {v1 .. v6}, Lcom/daaw/avee/comp/PcmProcess/ExoVisualizerDataProvider;->getVisData(JLcom/daaw/avee/comp/playback/AudioFrameData$Request;Lcom/daaw/avee/comp/playback/AudioFrameData;Z)Lcom/daaw/avee/comp/playback/AudioFrameData;

    move-result-object p1

    .line 136
    iput-object v7, p0, Lcom/daaw/avee/Design/PcmDesign;->visualizerData:Lcom/daaw/avee/comp/PcmProcess/ExoVisualizerDataProvider;

    .line 138
    monitor-exit v0

    return-object p1

    :catchall_0
    move-exception p1

    .line 139
    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw p1
.end method
