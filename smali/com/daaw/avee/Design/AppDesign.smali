.class public Lcom/daaw/avee/Design/AppDesign;
.super Lcom/daaw/avee/Design/DesignBase;
.source "AppDesign.java"


# static fields
.field public static onRequestAudioProcessMultiThreadValueExport:Lcom/daaw/avee/Common/Events/WeakEventR1;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lcom/daaw/avee/Common/Events/WeakEventR1<",
            "Landroid/content/Context;",
            "Ljava/lang/Integer;",
            ">;"
        }
    .end annotation
.end field

.field public static onRequestAudioProcessMultiThreadValueRealTime:Lcom/daaw/avee/Common/Events/WeakEventR1;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lcom/daaw/avee/Common/Events/WeakEventR1<",
            "Landroid/content/Context;",
            "Ljava/lang/Integer;",
            ">;"
        }
    .end annotation
.end field

.field public static onRequestRenderQualityEdgesValueExport:Lcom/daaw/avee/Common/Events/WeakEventR1;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lcom/daaw/avee/Common/Events/WeakEventR1<",
            "Landroid/content/Context;",
            "Ljava/lang/Integer;",
            ">;"
        }
    .end annotation
.end field

.field public static onRequestRenderQualityEdgesValueRealTime:Lcom/daaw/avee/Common/Events/WeakEventR1;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lcom/daaw/avee/Common/Events/WeakEventR1<",
            "Landroid/content/Context;",
            "Ljava/lang/Integer;",
            ">;"
        }
    .end annotation
.end field

.field public static onRequestsSoundVisualizationDataExport:Lcom/daaw/avee/Common/Events/WeakEventR2;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lcom/daaw/avee/Common/Events/WeakEventR2<",
            "Lcom/daaw/avee/comp/playback/AudioFrameData;",
            "Ljava/lang/Integer;",
            "Lcom/daaw/avee/comp/playback/AudioFrameData;",
            ">;"
        }
    .end annotation
.end field

.field public static onRequestsSoundVisualizationDataRealTime:Lcom/daaw/avee/Common/Events/WeakEventR2;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lcom/daaw/avee/Common/Events/WeakEventR2<",
            "Lcom/daaw/avee/comp/playback/AudioFrameData;",
            "Ljava/lang/Integer;",
            "Lcom/daaw/avee/comp/playback/AudioFrameData;",
            ">;"
        }
    .end annotation
.end field


# instance fields
.field private lastAudioFrameDataReuse:Lcom/daaw/avee/comp/playback/AudioFrameData;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .line 16
    new-instance v0, Lcom/daaw/avee/Common/Events/WeakEventR2;

    invoke-direct {v0}, Lcom/daaw/avee/Common/Events/WeakEventR2;-><init>()V

    sput-object v0, Lcom/daaw/avee/Design/AppDesign;->onRequestsSoundVisualizationDataExport:Lcom/daaw/avee/Common/Events/WeakEventR2;

    .line 17
    new-instance v0, Lcom/daaw/avee/Common/Events/WeakEventR2;

    invoke-direct {v0}, Lcom/daaw/avee/Common/Events/WeakEventR2;-><init>()V

    sput-object v0, Lcom/daaw/avee/Design/AppDesign;->onRequestsSoundVisualizationDataRealTime:Lcom/daaw/avee/Common/Events/WeakEventR2;

    .line 19
    new-instance v0, Lcom/daaw/avee/Common/Events/WeakEventR1;

    invoke-direct {v0}, Lcom/daaw/avee/Common/Events/WeakEventR1;-><init>()V

    sput-object v0, Lcom/daaw/avee/Design/AppDesign;->onRequestRenderQualityEdgesValueExport:Lcom/daaw/avee/Common/Events/WeakEventR1;

    .line 20
    new-instance v0, Lcom/daaw/avee/Common/Events/WeakEventR1;

    invoke-direct {v0}, Lcom/daaw/avee/Common/Events/WeakEventR1;-><init>()V

    sput-object v0, Lcom/daaw/avee/Design/AppDesign;->onRequestRenderQualityEdgesValueRealTime:Lcom/daaw/avee/Common/Events/WeakEventR1;

    .line 22
    new-instance v0, Lcom/daaw/avee/Common/Events/WeakEventR1;

    invoke-direct {v0}, Lcom/daaw/avee/Common/Events/WeakEventR1;-><init>()V

    sput-object v0, Lcom/daaw/avee/Design/AppDesign;->onRequestAudioProcessMultiThreadValueExport:Lcom/daaw/avee/Common/Events/WeakEventR1;

    .line 23
    new-instance v0, Lcom/daaw/avee/Common/Events/WeakEventR1;

    invoke-direct {v0}, Lcom/daaw/avee/Common/Events/WeakEventR1;-><init>()V

    sput-object v0, Lcom/daaw/avee/Design/AppDesign;->onRequestAudioProcessMultiThreadValueRealTime:Lcom/daaw/avee/Common/Events/WeakEventR1;

    return-void
.end method

.method public constructor <init>()V
    .locals 3

    .line 29
    invoke-direct {p0}, Lcom/daaw/avee/Design/DesignBase;-><init>()V

    .line 30
    new-instance v0, Lcom/daaw/avee/comp/playback/AudioFrameData;

    invoke-direct {v0}, Lcom/daaw/avee/comp/playback/AudioFrameData;-><init>()V

    iput-object v0, p0, Lcom/daaw/avee/Design/AppDesign;->lastAudioFrameDataReuse:Lcom/daaw/avee/comp/playback/AudioFrameData;

    .line 32
    sget-object v0, Lcom/daaw/avee/comp/Visualizer/VisualizerViewCore;->onRequestsSoundVisualizationData:Lcom/daaw/avee/Common/Events/WeakEventR1;

    new-instance v1, Lcom/daaw/avee/Design/AppDesign$1;

    invoke-direct {v1, p0}, Lcom/daaw/avee/Design/AppDesign$1;-><init>(Lcom/daaw/avee/Design/AppDesign;)V

    iget-object v2, p0, Lcom/daaw/avee/Design/AppDesign;->listenerRefHolder:Ljava/util/List;

    invoke-virtual {v0, v1, v2}, Lcom/daaw/avee/Common/Events/WeakEventR1;->subscribeWeak(Lcom/daaw/avee/Common/Events/WeakEventR1$Handler;Ljava/util/List;)V

    .line 62
    sget-object v0, Lcom/daaw/avee/comp/Visualizer/VisualizerViewCore;->onRequestRenderQualityEdgesValue:Lcom/daaw/avee/Common/Events/WeakEventR1;

    new-instance v1, Lcom/daaw/avee/Design/AppDesign$2;

    invoke-direct {v1, p0}, Lcom/daaw/avee/Design/AppDesign$2;-><init>(Lcom/daaw/avee/Design/AppDesign;)V

    iget-object v2, p0, Lcom/daaw/avee/Design/AppDesign;->listenerRefHolder:Ljava/util/List;

    invoke-virtual {v0, v1, v2}, Lcom/daaw/avee/Common/Events/WeakEventR1;->subscribeWeak(Lcom/daaw/avee/Common/Events/WeakEventR1$Handler;Ljava/util/List;)V

    .line 72
    sget-object v0, Lcom/daaw/avee/comp/Visualizer/VisualizerViewCore;->onRequestAudioProcessMultiThreadValue:Lcom/daaw/avee/Common/Events/WeakEventR1;

    new-instance v1, Lcom/daaw/avee/Design/AppDesign$3;

    invoke-direct {v1, p0}, Lcom/daaw/avee/Design/AppDesign$3;-><init>(Lcom/daaw/avee/Design/AppDesign;)V

    iget-object v2, p0, Lcom/daaw/avee/Design/AppDesign;->listenerRefHolder:Ljava/util/List;

    invoke-virtual {v0, v1, v2}, Lcom/daaw/avee/Common/Events/WeakEventR1;->subscribeWeak(Lcom/daaw/avee/Common/Events/WeakEventR1$Handler;Ljava/util/List;)V

    return-void
.end method

.method static synthetic access$000(Lcom/daaw/avee/Design/AppDesign;)Lcom/daaw/avee/comp/playback/AudioFrameData;
    .locals 0

    .line 14
    iget-object p0, p0, Lcom/daaw/avee/Design/AppDesign;->lastAudioFrameDataReuse:Lcom/daaw/avee/comp/playback/AudioFrameData;

    return-object p0
.end method

.method static synthetic access$002(Lcom/daaw/avee/Design/AppDesign;Lcom/daaw/avee/comp/playback/AudioFrameData;)Lcom/daaw/avee/comp/playback/AudioFrameData;
    .locals 0

    .line 14
    iput-object p1, p0, Lcom/daaw/avee/Design/AppDesign;->lastAudioFrameDataReuse:Lcom/daaw/avee/comp/playback/AudioFrameData;

    return-object p1
.end method

.method public static getTrackDurationForRendering()J
    .locals 4

    .line 96
    invoke-static {}, Lcom/daaw/avee/Design/VisualizerExporterDesign;->isExporting()Z

    move-result v0

    if-eqz v0, :cond_0

    invoke-static {}, Lcom/daaw/avee/Design/VisualizerExporterDesign;->getOutputTrackDurationUs()J

    move-result-wide v0

    const-wide/16 v2, 0x3e8

    div-long/2addr v0, v2

    goto :goto_0

    :cond_0
    sget-object v0, Lcom/daaw/avee/Design/PlaybackDesign;->playingMediaInfo:Lcom/daaw/avee/comp/playback/PlayingMediaInfo;

    iget-wide v0, v0, Lcom/daaw/avee/comp/playback/PlayingMediaInfo;->duration:J

    :goto_0
    return-wide v0
.end method

.method public static getTrackPositionForRendering()J
    .locals 4

    .line 90
    invoke-static {}, Lcom/daaw/avee/Design/VisualizerExporterDesign;->isExporting()Z

    move-result v0

    if-eqz v0, :cond_0

    invoke-static {}, Lcom/daaw/avee/Design/VisualizerExporterDesign;->getOutputTrackPositionUs()J

    move-result-wide v0

    const-wide/16 v2, 0x3e8

    div-long/2addr v0, v2

    goto :goto_0

    :cond_0
    sget-wide v0, Lcom/daaw/avee/Design/PlaybackDesign;->trackPosition:J

    :goto_0
    return-wide v0
.end method
