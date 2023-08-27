.class public Lcom/daaw/avee/Design/VisualizerExporterDesign;
.super Ljava/lang/Object;
.source "VisualizerExporterDesign.java"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/daaw/avee/Design/VisualizerExporterDesign$ExportingStats;
    }
.end annotation


# static fields
.field private static audioTrackPositionUs:J

.field private static volatile exporting:Z

.field public static getVisualizationData:Lcom/daaw/avee/Common/Events/WeakDelegateR2;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lcom/daaw/avee/Common/Events/WeakDelegateR2<",
            "Lcom/daaw/avee/comp/playback/AudioFrameData;",
            "Lcom/daaw/avee/comp/playback/AudioFrameData$Request2;",
            "Lcom/daaw/avee/comp/playback/AudioFrameData;",
            ">;"
        }
    .end annotation
.end field

.field public static isPremium:Lcom/daaw/avee/Common/Events/WeakEventR;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lcom/daaw/avee/Common/Events/WeakEventR<",
            "Ljava/lang/Boolean;",
            ">;"
        }
    .end annotation
.end field

.field public static final onExportSuccess:Lcom/daaw/avee/Common/Events/WeakEvent;

.field public static onExportingChanged:Lcom/daaw/avee/Common/Events/WeakEvent3;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lcom/daaw/avee/Common/Events/WeakEvent3<",
            "Ljava/lang/Boolean;",
            "Ljava/lang/Long;",
            "Ljava/lang/Boolean;",
            ">;"
        }
    .end annotation
.end field

.field private static outputTrackDurationUs:J

.field private static outputTrackPositionUs:J


# instance fields
.field private volatile audioFrameRequest:Lcom/daaw/avee/comp/playback/AudioFrameData$Request2;

.field private currentDullTrackDurationMs:J

.field private currentEndMSec:J

.field private currentExportSettings:Lcom/daaw/avee/comp/VisualizerExporter/VisExportDialog$ExportSettings;

.field private currentSongDisplayData:Lcom/daaw/avee/comp/playback/Song/PlaylistSong$Data;

.field private currentStartMSec:J

.field private currentTrack:Lcom/daaw/avee/comp/playback/Song/PlaylistSong;

.field private duration:J

.field private volatile encodingTargetBitrateMbps:F

.field private volatile endFrameToCapture:I

.field private volatile exportFile:Ljava/io/File;

.field private exportFrameIndex:I

.field private volatile exportOStream:Ljava/io/OutputStream;

.field private exportSettingsProfiles:[Lcom/daaw/avee/comp/VisualizerExporter/VisExportDialog$ExportSettingsProfile;

.field private exportingErrorStatus:Lcom/daaw/avee/Common/StatusMsg;

.field private exportingStats:Lcom/daaw/avee/Design/VisualizerExporterDesign$ExportingStats;

.field private exportingStatus:Lcom/daaw/avee/comp/VisualizerExporter/VisExportDialog$ExportingProgressStatus;

.field private volatile frameCaptureDesc:Lcom/daaw/avee/comp/Visualizer/FrameCaptureDesc;

.field private volatile frameCounter:I

.field private volatile glThreadSignalDoneExporting:Z

.field private lastAudioFrameData:Lcom/daaw/avee/comp/playback/AudioFrameData;

.field private lastAudioFrameDataReuse:Lcom/daaw/avee/comp/playback/AudioFrameData;

.field private listenerRefHolder:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Ljava/lang/Object;",
            ">;"
        }
    .end annotation
.end field

.field private loadingResourcesFrameCounter:I

.field private mainThreadHandler:Landroid/os/Handler;

.field private mainUIDesign:Lcom/daaw/avee/Design/MainUIDesign;

.field private volatile overrideAudioFrameSamplesInCount:I

.field final playbackDesign:Lcom/daaw/avee/Design/PlaybackDesign;

.field private volatile startFrameToCapture:I

.field private volatile targetAudioBitrateKbps:F

.field private volatile targetAudioChannels:I

.field private volatile targetExportAudio:Z

.field private volatile targetFps:I

.field private volatile targetFrameTimeUs:J

.field private volatile targetVideoCodec:Ljava/lang/String;

.field private volatile targetVideoCodecProfile:I

.field private volatile targetVideoForceCompatibleWH:Z

.field private volatile targetVideoMimeType:Ljava/lang/String;

.field private volatile videoEncoder:Lcom/daaw/avee/comp/VisualizerExporter/AudioVideoCTSRecorder;

.field private visualizerSurfaceView:Ljava/lang/ref/WeakReference;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/lang/ref/WeakReference<",
            "Lcom/daaw/avee/comp/Visualizer/VisualizerViewCore;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method static constructor <clinit>()V
    .locals 2

    .line 73
    new-instance v0, Lcom/daaw/avee/Common/Events/WeakEventR;

    invoke-direct {v0}, Lcom/daaw/avee/Common/Events/WeakEventR;-><init>()V

    sput-object v0, Lcom/daaw/avee/Design/VisualizerExporterDesign;->isPremium:Lcom/daaw/avee/Common/Events/WeakEventR;

    .line 74
    new-instance v0, Lcom/daaw/avee/Common/Events/WeakEvent3;

    invoke-direct {v0}, Lcom/daaw/avee/Common/Events/WeakEvent3;-><init>()V

    sput-object v0, Lcom/daaw/avee/Design/VisualizerExporterDesign;->onExportingChanged:Lcom/daaw/avee/Common/Events/WeakEvent3;

    .line 75
    new-instance v0, Lcom/daaw/avee/Common/Events/WeakDelegateR2;

    invoke-direct {v0}, Lcom/daaw/avee/Common/Events/WeakDelegateR2;-><init>()V

    sput-object v0, Lcom/daaw/avee/Design/VisualizerExporterDesign;->getVisualizationData:Lcom/daaw/avee/Common/Events/WeakDelegateR2;

    .line 76
    new-instance v0, Lcom/daaw/avee/Common/Events/WeakEvent;

    invoke-direct {v0}, Lcom/daaw/avee/Common/Events/WeakEvent;-><init>()V

    sput-object v0, Lcom/daaw/avee/Design/VisualizerExporterDesign;->onExportSuccess:Lcom/daaw/avee/Common/Events/WeakEvent;

    const/4 v0, 0x0

    .line 111
    sput-boolean v0, Lcom/daaw/avee/Design/VisualizerExporterDesign;->exporting:Z

    const-wide/16 v0, 0x0

    .line 112
    sput-wide v0, Lcom/daaw/avee/Design/VisualizerExporterDesign;->audioTrackPositionUs:J

    .line 113
    sput-wide v0, Lcom/daaw/avee/Design/VisualizerExporterDesign;->outputTrackPositionUs:J

    .line 114
    sput-wide v0, Lcom/daaw/avee/Design/VisualizerExporterDesign;->outputTrackDurationUs:J

    return-void
.end method

.method public constructor <init>(Lcom/daaw/avee/Design/VisualizerDesign;Lcom/daaw/avee/Design/PlaybackDesign;Lcom/daaw/avee/Design/MainUIDesign;)V
    .locals 6

    .line 161
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 78
    new-instance v0, Ljava/util/LinkedList;

    invoke-direct {v0}, Ljava/util/LinkedList;-><init>()V

    iput-object v0, p0, Lcom/daaw/avee/Design/VisualizerExporterDesign;->listenerRefHolder:Ljava/util/List;

    const/4 v0, 0x0

    .line 83
    iput-object v0, p0, Lcom/daaw/avee/Design/VisualizerExporterDesign;->exportSettingsProfiles:[Lcom/daaw/avee/comp/VisualizerExporter/VisExportDialog$ExportSettingsProfile;

    .line 85
    new-instance v1, Ljava/lang/ref/WeakReference;

    invoke-direct {v1, v0}, Ljava/lang/ref/WeakReference;-><init>(Ljava/lang/Object;)V

    iput-object v1, p0, Lcom/daaw/avee/Design/VisualizerExporterDesign;->visualizerSurfaceView:Ljava/lang/ref/WeakReference;

    const-wide/16 v1, 0x0

    .line 88
    iput-wide v1, p0, Lcom/daaw/avee/Design/VisualizerExporterDesign;->duration:J

    const/4 v3, 0x1

    .line 92
    iput-boolean v3, p0, Lcom/daaw/avee/Design/VisualizerExporterDesign;->targetVideoForceCompatibleWH:Z

    const/16 v4, 0x1e

    .line 93
    iput v4, p0, Lcom/daaw/avee/Design/VisualizerExporterDesign;->targetFps:I

    const-wide/32 v4, 0x8235

    .line 94
    iput-wide v4, p0, Lcom/daaw/avee/Design/VisualizerExporterDesign;->targetFrameTimeUs:J

    const/high16 v4, 0x41000000    # 8.0f

    .line 95
    iput v4, p0, Lcom/daaw/avee/Design/VisualizerExporterDesign;->encodingTargetBitrateMbps:F

    .line 96
    iput-boolean v3, p0, Lcom/daaw/avee/Design/VisualizerExporterDesign;->targetExportAudio:Z

    const/high16 v3, 0x43a00000    # 320.0f

    .line 97
    iput v3, p0, Lcom/daaw/avee/Design/VisualizerExporterDesign;->targetAudioBitrateKbps:F

    const/4 v3, 0x2

    .line 98
    iput v3, p0, Lcom/daaw/avee/Design/VisualizerExporterDesign;->targetAudioChannels:I

    const-string v3, ""

    .line 99
    iput-object v3, p0, Lcom/daaw/avee/Design/VisualizerExporterDesign;->targetVideoCodec:Ljava/lang/String;

    .line 100
    iput-object v3, p0, Lcom/daaw/avee/Design/VisualizerExporterDesign;->targetVideoMimeType:Ljava/lang/String;

    const/4 v3, 0x0

    .line 101
    iput v3, p0, Lcom/daaw/avee/Design/VisualizerExporterDesign;->targetVideoCodecProfile:I

    .line 104
    new-instance v4, Lcom/daaw/avee/comp/playback/AudioFrameData$Request2;

    invoke-direct {v4}, Lcom/daaw/avee/comp/playback/AudioFrameData$Request2;-><init>()V

    iput-object v4, p0, Lcom/daaw/avee/Design/VisualizerExporterDesign;->audioFrameRequest:Lcom/daaw/avee/comp/playback/AudioFrameData$Request2;

    .line 107
    iput v3, p0, Lcom/daaw/avee/Design/VisualizerExporterDesign;->startFrameToCapture:I

    .line 108
    iput v3, p0, Lcom/daaw/avee/Design/VisualizerExporterDesign;->endFrameToCapture:I

    .line 110
    iput v3, p0, Lcom/daaw/avee/Design/VisualizerExporterDesign;->overrideAudioFrameSamplesInCount:I

    .line 116
    iput-boolean v3, p0, Lcom/daaw/avee/Design/VisualizerExporterDesign;->glThreadSignalDoneExporting:Z

    .line 117
    new-instance v4, Lcom/daaw/avee/Design/VisualizerExporterDesign$ExportingStats;

    invoke-direct {v4, p0, v0}, Lcom/daaw/avee/Design/VisualizerExporterDesign$ExportingStats;-><init>(Lcom/daaw/avee/Design/VisualizerExporterDesign;Lcom/daaw/avee/Design/VisualizerExporterDesign$1;)V

    iput-object v4, p0, Lcom/daaw/avee/Design/VisualizerExporterDesign;->exportingStats:Lcom/daaw/avee/Design/VisualizerExporterDesign$ExportingStats;

    .line 119
    iput-object v0, p0, Lcom/daaw/avee/Design/VisualizerExporterDesign;->currentExportSettings:Lcom/daaw/avee/comp/VisualizerExporter/VisExportDialog$ExportSettings;

    .line 120
    iput-wide v1, p0, Lcom/daaw/avee/Design/VisualizerExporterDesign;->currentStartMSec:J

    .line 121
    iput-wide v1, p0, Lcom/daaw/avee/Design/VisualizerExporterDesign;->currentEndMSec:J

    .line 122
    iput-wide v1, p0, Lcom/daaw/avee/Design/VisualizerExporterDesign;->currentDullTrackDurationMs:J

    .line 126
    new-instance v0, Landroid/os/Handler;

    invoke-direct {v0}, Landroid/os/Handler;-><init>()V

    iput-object v0, p0, Lcom/daaw/avee/Design/VisualizerExporterDesign;->mainThreadHandler:Landroid/os/Handler;

    .line 127
    iput v3, p0, Lcom/daaw/avee/Design/VisualizerExporterDesign;->frameCounter:I

    .line 128
    iput v3, p0, Lcom/daaw/avee/Design/VisualizerExporterDesign;->exportFrameIndex:I

    .line 129
    iput v3, p0, Lcom/daaw/avee/Design/VisualizerExporterDesign;->loadingResourcesFrameCounter:I

    .line 132
    new-instance v0, Lcom/daaw/avee/Common/StatusMsg;

    invoke-direct {v0}, Lcom/daaw/avee/Common/StatusMsg;-><init>()V

    iput-object v0, p0, Lcom/daaw/avee/Design/VisualizerExporterDesign;->exportingErrorStatus:Lcom/daaw/avee/Common/StatusMsg;

    .line 165
    iput-object p2, p0, Lcom/daaw/avee/Design/VisualizerExporterDesign;->playbackDesign:Lcom/daaw/avee/Design/PlaybackDesign;

    .line 166
    iput-object p3, p0, Lcom/daaw/avee/Design/VisualizerExporterDesign;->mainUIDesign:Lcom/daaw/avee/Design/MainUIDesign;

    .line 168
    sget-object p3, Lcom/daaw/avee/comp/VisualUI/Fragment2;->onSurfaceCreated:Lcom/daaw/avee/Common/Events/WeakEvent1;

    new-instance v0, Lcom/daaw/avee/Design/VisualizerExporterDesign$1;

    invoke-direct {v0, p0}, Lcom/daaw/avee/Design/VisualizerExporterDesign$1;-><init>(Lcom/daaw/avee/Design/VisualizerExporterDesign;)V

    iget-object v1, p0, Lcom/daaw/avee/Design/VisualizerExporterDesign;->listenerRefHolder:Ljava/util/List;

    invoke-virtual {p3, v0, v1}, Lcom/daaw/avee/Common/Events/WeakEvent1;->subscribeWeak(Lcom/daaw/avee/Common/Events/WeakEvent1$Handler;Ljava/util/List;)V

    .line 175
    sget-object p3, Lcom/daaw/avee/comp/VisualUI/Fragment2;->onRequestIsExportAvailable:Lcom/daaw/avee/Common/Events/WeakEventR;

    new-instance v0, Lcom/daaw/avee/Design/VisualizerExporterDesign$2;

    invoke-direct {v0, p0}, Lcom/daaw/avee/Design/VisualizerExporterDesign$2;-><init>(Lcom/daaw/avee/Design/VisualizerExporterDesign;)V

    iget-object v1, p0, Lcom/daaw/avee/Design/VisualizerExporterDesign;->listenerRefHolder:Ljava/util/List;

    invoke-virtual {p3, v0, v1}, Lcom/daaw/avee/Common/Events/WeakEventR;->subscribeWeak(Lcom/daaw/avee/Common/Events/WeakEventR$Handler;Ljava/util/List;)V

    .line 182
    sget-object p3, Lcom/daaw/avee/comp/VisualUI/Fragment2;->onExportAction:Lcom/daaw/avee/Common/Events/WeakEvent1;

    new-instance v0, Lcom/daaw/avee/Design/VisualizerExporterDesign$3;

    invoke-direct {v0, p0}, Lcom/daaw/avee/Design/VisualizerExporterDesign$3;-><init>(Lcom/daaw/avee/Design/VisualizerExporterDesign;)V

    iget-object v1, p0, Lcom/daaw/avee/Design/VisualizerExporterDesign;->listenerRefHolder:Ljava/util/List;

    invoke-virtual {p3, v0, v1}, Lcom/daaw/avee/Common/Events/WeakEvent1;->subscribeWeak(Lcom/daaw/avee/Common/Events/WeakEvent1$Handler;Ljava/util/List;)V

    .line 202
    sget-object p3, Lcom/daaw/avee/comp/VisualizerExporter/VisExportDialog;->onExportAction:Lcom/daaw/avee/Common/Events/WeakEvent4;

    new-instance v0, Lcom/daaw/avee/Design/VisualizerExporterDesign$4;

    invoke-direct {v0, p0}, Lcom/daaw/avee/Design/VisualizerExporterDesign$4;-><init>(Lcom/daaw/avee/Design/VisualizerExporterDesign;)V

    iget-object v1, p0, Lcom/daaw/avee/Design/VisualizerExporterDesign;->listenerRefHolder:Ljava/util/List;

    invoke-virtual {p3, v0, v1}, Lcom/daaw/avee/Common/Events/WeakEvent4;->subscribeWeak(Lcom/daaw/avee/Common/Events/WeakEvent4$Handler;Ljava/util/List;)V

    .line 223
    sget-object p3, Lcom/daaw/avee/comp/VisualizerExporter/VisExportDialog;->onCancelAction:Lcom/daaw/avee/Common/Events/WeakEvent;

    new-instance v0, Lcom/daaw/avee/Design/VisualizerExporterDesign$5;

    invoke-direct {v0, p0}, Lcom/daaw/avee/Design/VisualizerExporterDesign$5;-><init>(Lcom/daaw/avee/Design/VisualizerExporterDesign;)V

    iget-object v1, p0, Lcom/daaw/avee/Design/VisualizerExporterDesign;->listenerRefHolder:Ljava/util/List;

    invoke-virtual {p3, v0, v1}, Lcom/daaw/avee/Common/Events/WeakEvent;->subscribeWeak(Lcom/daaw/avee/Common/Events/WeakEvent$Handler;Ljava/util/List;)V

    .line 230
    sget-object p3, Lcom/daaw/avee/comp/VisualizerExporter/VisExportDialog;->onDestDirAction:Lcom/daaw/avee/Common/Events/WeakEvent3;

    new-instance v0, Lcom/daaw/avee/Design/VisualizerExporterDesign$6;

    invoke-direct {v0, p0}, Lcom/daaw/avee/Design/VisualizerExporterDesign$6;-><init>(Lcom/daaw/avee/Design/VisualizerExporterDesign;)V

    iget-object v1, p0, Lcom/daaw/avee/Design/VisualizerExporterDesign;->listenerRefHolder:Ljava/util/List;

    invoke-virtual {p3, v0, v1}, Lcom/daaw/avee/Common/Events/WeakEvent3;->subscribeWeak(Lcom/daaw/avee/Common/Events/WeakEvent3$Handler;Ljava/util/List;)V

    .line 243
    sget-object p3, Lcom/daaw/avee/comp/VisualizerExporter/VisExportDialog;->onActivityResult:Lcom/daaw/avee/Common/Events/WeakEvent3;

    new-instance v0, Lcom/daaw/avee/Design/VisualizerExporterDesign$7;

    invoke-direct {v0, p0}, Lcom/daaw/avee/Design/VisualizerExporterDesign$7;-><init>(Lcom/daaw/avee/Design/VisualizerExporterDesign;)V

    iget-object v1, p0, Lcom/daaw/avee/Design/VisualizerExporterDesign;->listenerRefHolder:Ljava/util/List;

    invoke-virtual {p3, v0, v1}, Lcom/daaw/avee/Common/Events/WeakEvent3;->subscribeWeak(Lcom/daaw/avee/Common/Events/WeakEvent3$Handler;Ljava/util/List;)V

    .line 321
    sget-object p3, Lcom/daaw/avee/comp/Common/DirectoryPickerDialog;->onSubmitValue:Lcom/daaw/avee/Common/Events/WeakEvent3;

    new-instance v0, Lcom/daaw/avee/Design/VisualizerExporterDesign$8;

    invoke-direct {v0, p0}, Lcom/daaw/avee/Design/VisualizerExporterDesign$8;-><init>(Lcom/daaw/avee/Design/VisualizerExporterDesign;)V

    iget-object v1, p0, Lcom/daaw/avee/Design/VisualizerExporterDesign;->listenerRefHolder:Ljava/util/List;

    invoke-virtual {p3, v0, v1}, Lcom/daaw/avee/Common/Events/WeakEvent3;->subscribeWeak(Lcom/daaw/avee/Common/Events/WeakEvent3$Handler;Ljava/util/List;)V

    .line 330
    sget-object p3, Lcom/daaw/avee/comp/VisualizerExporter/VisExportDialog;->onRequestExportSettings:Lcom/daaw/avee/Common/Events/WeakEventR;

    new-instance v0, Lcom/daaw/avee/Design/VisualizerExporterDesign$9;

    invoke-direct {v0, p0}, Lcom/daaw/avee/Design/VisualizerExporterDesign$9;-><init>(Lcom/daaw/avee/Design/VisualizerExporterDesign;)V

    iget-object v1, p0, Lcom/daaw/avee/Design/VisualizerExporterDesign;->listenerRefHolder:Ljava/util/List;

    invoke-virtual {p3, v0, v1}, Lcom/daaw/avee/Common/Events/WeakEventR;->subscribeWeak(Lcom/daaw/avee/Common/Events/WeakEventR$Handler;Ljava/util/List;)V

    .line 464
    sget-object p3, Lcom/daaw/avee/MainActivity;->onViewPagerPageSelected:Lcom/daaw/avee/Common/Events/WeakEvent2;

    new-instance v0, Lcom/daaw/avee/Design/VisualizerExporterDesign$10;

    invoke-direct {v0, p0, p2}, Lcom/daaw/avee/Design/VisualizerExporterDesign$10;-><init>(Lcom/daaw/avee/Design/VisualizerExporterDesign;Lcom/daaw/avee/Design/PlaybackDesign;)V

    iget-object v1, p0, Lcom/daaw/avee/Design/VisualizerExporterDesign;->listenerRefHolder:Ljava/util/List;

    invoke-virtual {p3, v0, v1}, Lcom/daaw/avee/Common/Events/WeakEvent2;->subscribeWeak(Lcom/daaw/avee/Common/Events/WeakEvent2$Handler;Ljava/util/List;)V

    .line 478
    sget-object p3, Lcom/daaw/avee/comp/playback/MediaPlaybackService;->onPlayStateChanged:Lcom/daaw/avee/Common/Events/WeakEvent5;

    new-instance v0, Lcom/daaw/avee/Design/VisualizerExporterDesign$11;

    invoke-direct {v0, p0, p2}, Lcom/daaw/avee/Design/VisualizerExporterDesign$11;-><init>(Lcom/daaw/avee/Design/VisualizerExporterDesign;Lcom/daaw/avee/Design/PlaybackDesign;)V

    iget-object v1, p0, Lcom/daaw/avee/Design/VisualizerExporterDesign;->listenerRefHolder:Ljava/util/List;

    invoke-virtual {p3, v0, v1}, Lcom/daaw/avee/Common/Events/WeakEvent5;->subscribeWeak(Lcom/daaw/avee/Common/Events/WeakEvent5$Handler;Ljava/util/List;)V

    .line 486
    sget-object p3, Lcom/daaw/avee/comp/Visualizer/VisualizerViewCore;->onRequestUseHighQualityBlur:Lcom/daaw/avee/Common/Events/WeakEventR;

    new-instance v0, Lcom/daaw/avee/Design/VisualizerExporterDesign$12;

    invoke-direct {v0, p0, p1}, Lcom/daaw/avee/Design/VisualizerExporterDesign$12;-><init>(Lcom/daaw/avee/Design/VisualizerExporterDesign;Lcom/daaw/avee/Design/VisualizerDesign;)V

    iget-object p1, p0, Lcom/daaw/avee/Design/VisualizerExporterDesign;->listenerRefHolder:Ljava/util/List;

    invoke-virtual {p3, v0, p1}, Lcom/daaw/avee/Common/Events/WeakEventR;->subscribeWeak(Lcom/daaw/avee/Common/Events/WeakEventR$Handler;Ljava/util/List;)V

    .line 497
    sget-object p1, Lcom/daaw/avee/comp/Visualizer/VisualizerViewCore;->onRequestOverrideAudioFrameSamplesInCount:Lcom/daaw/avee/Common/Events/WeakEventR;

    new-instance p3, Lcom/daaw/avee/Design/VisualizerExporterDesign$13;

    invoke-direct {p3, p0}, Lcom/daaw/avee/Design/VisualizerExporterDesign$13;-><init>(Lcom/daaw/avee/Design/VisualizerExporterDesign;)V

    iget-object v0, p0, Lcom/daaw/avee/Design/VisualizerExporterDesign;->listenerRefHolder:Ljava/util/List;

    invoke-virtual {p1, p3, v0}, Lcom/daaw/avee/Common/Events/WeakEventR;->subscribeWeak(Lcom/daaw/avee/Common/Events/WeakEventR$Handler;Ljava/util/List;)V

    .line 508
    sget-object p1, Lcom/daaw/avee/Design/AppDesign;->onRequestsSoundVisualizationDataExport:Lcom/daaw/avee/Common/Events/WeakEventR2;

    new-instance p3, Lcom/daaw/avee/Design/VisualizerExporterDesign$14;

    invoke-direct {p3, p0}, Lcom/daaw/avee/Design/VisualizerExporterDesign$14;-><init>(Lcom/daaw/avee/Design/VisualizerExporterDesign;)V

    iget-object v0, p0, Lcom/daaw/avee/Design/VisualizerExporterDesign;->listenerRefHolder:Ljava/util/List;

    invoke-virtual {p1, p3, v0}, Lcom/daaw/avee/Common/Events/WeakEventR2;->subscribeWeak(Lcom/daaw/avee/Common/Events/WeakEventR2$Handler;Ljava/util/List;)V

    .line 615
    sget-object p1, Lcom/daaw/avee/comp/playback/MediaPlaybackService;->onDisplayMetaDataStateChanged:Lcom/daaw/avee/Common/Events/WeakEvent4;

    new-instance p3, Lcom/daaw/avee/Design/VisualizerExporterDesign$15;

    invoke-direct {p3, p0}, Lcom/daaw/avee/Design/VisualizerExporterDesign$15;-><init>(Lcom/daaw/avee/Design/VisualizerExporterDesign;)V

    iget-object v0, p0, Lcom/daaw/avee/Design/VisualizerExporterDesign;->listenerRefHolder:Ljava/util/List;

    invoke-virtual {p1, p3, v0}, Lcom/daaw/avee/Common/Events/WeakEvent4;->subscribeWeak(Lcom/daaw/avee/Common/Events/WeakEvent4$Handler;Ljava/util/List;)V

    .line 638
    sget-object p1, Lcom/daaw/avee/comp/Visualizer/VisualizerViewCore;->onRequestFrameCaptureMode:Lcom/daaw/avee/Common/Events/WeakEventR;

    new-instance p3, Lcom/daaw/avee/Design/VisualizerExporterDesign$16;

    invoke-direct {p3, p0}, Lcom/daaw/avee/Design/VisualizerExporterDesign$16;-><init>(Lcom/daaw/avee/Design/VisualizerExporterDesign;)V

    iget-object v0, p0, Lcom/daaw/avee/Design/VisualizerExporterDesign;->listenerRefHolder:Ljava/util/List;

    invoke-virtual {p1, p3, v0}, Lcom/daaw/avee/Common/Events/WeakEventR;->subscribeWeak(Lcom/daaw/avee/Common/Events/WeakEventR$Handler;Ljava/util/List;)V

    .line 726
    sget-object p1, Lcom/daaw/avee/comp/Visualizer/VisualizerViewCore;->onOffScreenContentRendered:Lcom/daaw/avee/Common/Events/WeakEvent3;

    new-instance p3, Lcom/daaw/avee/Design/VisualizerExporterDesign$17;

    invoke-direct {p3, p0}, Lcom/daaw/avee/Design/VisualizerExporterDesign$17;-><init>(Lcom/daaw/avee/Design/VisualizerExporterDesign;)V

    iget-object v0, p0, Lcom/daaw/avee/Design/VisualizerExporterDesign;->listenerRefHolder:Ljava/util/List;

    invoke-virtual {p1, p3, v0}, Lcom/daaw/avee/Common/Events/WeakEvent3;->subscribeWeak(Lcom/daaw/avee/Common/Events/WeakEvent3$Handler;Ljava/util/List;)V

    .line 850
    sget-object p1, Lcom/daaw/avee/comp/playback/MediaPlaybackService;->onPlaybackCompleted:Lcom/daaw/avee/Common/Events/WeakEvent5;

    new-instance p3, Lcom/daaw/avee/Design/VisualizerExporterDesign$18;

    invoke-direct {p3, p0, p2}, Lcom/daaw/avee/Design/VisualizerExporterDesign$18;-><init>(Lcom/daaw/avee/Design/VisualizerExporterDesign;Lcom/daaw/avee/Design/PlaybackDesign;)V

    iget-object p2, p0, Lcom/daaw/avee/Design/VisualizerExporterDesign;->listenerRefHolder:Ljava/util/List;

    invoke-virtual {p1, p3, p2}, Lcom/daaw/avee/Common/Events/WeakEvent5;->subscribeWeak(Lcom/daaw/avee/Common/Events/WeakEvent5$Handler;Ljava/util/List;)V

    .line 875
    sget-object p1, Lcom/daaw/avee/Design/AppDesign;->onRequestRenderQualityEdgesValueExport:Lcom/daaw/avee/Common/Events/WeakEventR1;

    new-instance p2, Lcom/daaw/avee/Design/VisualizerExporterDesign$19;

    invoke-direct {p2, p0}, Lcom/daaw/avee/Design/VisualizerExporterDesign$19;-><init>(Lcom/daaw/avee/Design/VisualizerExporterDesign;)V

    iget-object p3, p0, Lcom/daaw/avee/Design/VisualizerExporterDesign;->listenerRefHolder:Ljava/util/List;

    invoke-virtual {p1, p2, p3}, Lcom/daaw/avee/Common/Events/WeakEventR1;->subscribeWeak(Lcom/daaw/avee/Common/Events/WeakEventR1$Handler;Ljava/util/List;)V

    .line 882
    sget-object p1, Lcom/daaw/avee/Design/AppDesign;->onRequestAudioProcessMultiThreadValueExport:Lcom/daaw/avee/Common/Events/WeakEventR1;

    new-instance p2, Lcom/daaw/avee/Design/VisualizerExporterDesign$20;

    invoke-direct {p2, p0}, Lcom/daaw/avee/Design/VisualizerExporterDesign$20;-><init>(Lcom/daaw/avee/Design/VisualizerExporterDesign;)V

    iget-object p3, p0, Lcom/daaw/avee/Design/VisualizerExporterDesign;->listenerRefHolder:Ljava/util/List;

    invoke-virtual {p1, p2, p3}, Lcom/daaw/avee/Common/Events/WeakEventR1;->subscribeWeak(Lcom/daaw/avee/Common/Events/WeakEventR1$Handler;Ljava/util/List;)V

    return-void
.end method

.method static synthetic access$1000(Lcom/daaw/avee/Design/VisualizerExporterDesign;)Lcom/daaw/avee/comp/playback/Song/PlaylistSong$Data;
    .locals 0

    .line 72
    iget-object p0, p0, Lcom/daaw/avee/Design/VisualizerExporterDesign;->currentSongDisplayData:Lcom/daaw/avee/comp/playback/Song/PlaylistSong$Data;

    return-object p0
.end method

.method static synthetic access$1002(Lcom/daaw/avee/Design/VisualizerExporterDesign;Lcom/daaw/avee/comp/playback/Song/PlaylistSong$Data;)Lcom/daaw/avee/comp/playback/Song/PlaylistSong$Data;
    .locals 0

    .line 72
    iput-object p1, p0, Lcom/daaw/avee/Design/VisualizerExporterDesign;->currentSongDisplayData:Lcom/daaw/avee/comp/playback/Song/PlaylistSong$Data;

    return-object p1
.end method

.method static synthetic access$102(Lcom/daaw/avee/Design/VisualizerExporterDesign;Ljava/lang/ref/WeakReference;)Ljava/lang/ref/WeakReference;
    .locals 0

    .line 72
    iput-object p1, p0, Lcom/daaw/avee/Design/VisualizerExporterDesign;->visualizerSurfaceView:Ljava/lang/ref/WeakReference;

    return-object p1
.end method

.method static synthetic access$1100()Z
    .locals 1

    .line 72
    sget-boolean v0, Lcom/daaw/avee/Design/VisualizerExporterDesign;->exporting:Z

    return v0
.end method

.method static synthetic access$1102(Z)Z
    .locals 0

    .line 72
    sput-boolean p0, Lcom/daaw/avee/Design/VisualizerExporterDesign;->exporting:Z

    return p0
.end method

.method static synthetic access$1200(Lcom/daaw/avee/Design/VisualizerExporterDesign;)I
    .locals 0

    .line 72
    iget p0, p0, Lcom/daaw/avee/Design/VisualizerExporterDesign;->overrideAudioFrameSamplesInCount:I

    return p0
.end method

.method static synthetic access$1300(Lcom/daaw/avee/Design/VisualizerExporterDesign;)Lcom/daaw/avee/comp/playback/AudioFrameData;
    .locals 0

    .line 72
    iget-object p0, p0, Lcom/daaw/avee/Design/VisualizerExporterDesign;->lastAudioFrameDataReuse:Lcom/daaw/avee/comp/playback/AudioFrameData;

    return-object p0
.end method

.method static synthetic access$1302(Lcom/daaw/avee/Design/VisualizerExporterDesign;Lcom/daaw/avee/comp/playback/AudioFrameData;)Lcom/daaw/avee/comp/playback/AudioFrameData;
    .locals 0

    .line 72
    iput-object p1, p0, Lcom/daaw/avee/Design/VisualizerExporterDesign;->lastAudioFrameDataReuse:Lcom/daaw/avee/comp/playback/AudioFrameData;

    return-object p1
.end method

.method static synthetic access$1402(Lcom/daaw/avee/Design/VisualizerExporterDesign;Z)Z
    .locals 0

    .line 72
    iput-boolean p1, p0, Lcom/daaw/avee/Design/VisualizerExporterDesign;->glThreadSignalDoneExporting:Z

    return p1
.end method

.method static synthetic access$1500(Lcom/daaw/avee/Design/VisualizerExporterDesign;)I
    .locals 0

    .line 72
    iget p0, p0, Lcom/daaw/avee/Design/VisualizerExporterDesign;->frameCounter:I

    return p0
.end method

.method static synthetic access$1600(Lcom/daaw/avee/Design/VisualizerExporterDesign;)I
    .locals 0

    .line 72
    iget p0, p0, Lcom/daaw/avee/Design/VisualizerExporterDesign;->startFrameToCapture:I

    return p0
.end method

.method static synthetic access$1700(Lcom/daaw/avee/Design/VisualizerExporterDesign;)I
    .locals 0

    .line 72
    iget p0, p0, Lcom/daaw/avee/Design/VisualizerExporterDesign;->targetFps:I

    return p0
.end method

.method static synthetic access$1800(Lcom/daaw/avee/Design/VisualizerExporterDesign;)I
    .locals 0

    .line 72
    iget p0, p0, Lcom/daaw/avee/Design/VisualizerExporterDesign;->endFrameToCapture:I

    return p0
.end method

.method static synthetic access$1900(Lcom/daaw/avee/Design/VisualizerExporterDesign;)Lcom/daaw/avee/comp/playback/AudioFrameData$Request2;
    .locals 0

    .line 72
    iget-object p0, p0, Lcom/daaw/avee/Design/VisualizerExporterDesign;->audioFrameRequest:Lcom/daaw/avee/comp/playback/AudioFrameData$Request2;

    return-object p0
.end method

.method static synthetic access$200(Lcom/daaw/avee/Design/VisualizerExporterDesign;)J
    .locals 2

    .line 72
    iget-wide v0, p0, Lcom/daaw/avee/Design/VisualizerExporterDesign;->duration:J

    return-wide v0
.end method

.method static synthetic access$2000()J
    .locals 2

    .line 72
    sget-wide v0, Lcom/daaw/avee/Design/VisualizerExporterDesign;->audioTrackPositionUs:J

    return-wide v0
.end method

.method static synthetic access$202(Lcom/daaw/avee/Design/VisualizerExporterDesign;J)J
    .locals 0

    .line 72
    iput-wide p1, p0, Lcom/daaw/avee/Design/VisualizerExporterDesign;->duration:J

    return-wide p1
.end method

.method static synthetic access$2100(Lcom/daaw/avee/Design/VisualizerExporterDesign;J)V
    .locals 0

    .line 72
    invoke-direct {p0, p1, p2}, Lcom/daaw/avee/Design/VisualizerExporterDesign;->checkTrackAhead(J)V

    return-void
.end method

.method static synthetic access$2200(Lcom/daaw/avee/Design/VisualizerExporterDesign;)Lcom/daaw/avee/Common/StatusMsg;
    .locals 0

    .line 72
    iget-object p0, p0, Lcom/daaw/avee/Design/VisualizerExporterDesign;->exportingErrorStatus:Lcom/daaw/avee/Common/StatusMsg;

    return-object p0
.end method

.method static synthetic access$2300(Lcom/daaw/avee/Design/VisualizerExporterDesign;)Lcom/daaw/avee/comp/playback/AudioFrameData;
    .locals 0

    .line 72
    iget-object p0, p0, Lcom/daaw/avee/Design/VisualizerExporterDesign;->lastAudioFrameData:Lcom/daaw/avee/comp/playback/AudioFrameData;

    return-object p0
.end method

.method static synthetic access$2302(Lcom/daaw/avee/Design/VisualizerExporterDesign;Lcom/daaw/avee/comp/playback/AudioFrameData;)Lcom/daaw/avee/comp/playback/AudioFrameData;
    .locals 0

    .line 72
    iput-object p1, p0, Lcom/daaw/avee/Design/VisualizerExporterDesign;->lastAudioFrameData:Lcom/daaw/avee/comp/playback/AudioFrameData;

    return-object p1
.end method

.method static synthetic access$2402(Lcom/daaw/avee/Design/VisualizerExporterDesign;Lcom/daaw/avee/comp/playback/Song/PlaylistSong;)Lcom/daaw/avee/comp/playback/Song/PlaylistSong;
    .locals 0

    .line 72
    iput-object p1, p0, Lcom/daaw/avee/Design/VisualizerExporterDesign;->currentTrack:Lcom/daaw/avee/comp/playback/Song/PlaylistSong;

    return-object p1
.end method

.method static synthetic access$2500(Lcom/daaw/avee/Design/VisualizerExporterDesign;)Lcom/daaw/avee/comp/Visualizer/FrameCaptureDesc;
    .locals 0

    .line 72
    iget-object p0, p0, Lcom/daaw/avee/Design/VisualizerExporterDesign;->frameCaptureDesc:Lcom/daaw/avee/comp/Visualizer/FrameCaptureDesc;

    return-object p0
.end method

.method static synthetic access$2600(Lcom/daaw/avee/Design/VisualizerExporterDesign;)I
    .locals 0

    .line 72
    iget p0, p0, Lcom/daaw/avee/Design/VisualizerExporterDesign;->loadingResourcesFrameCounter:I

    return p0
.end method

.method static synthetic access$2608(Lcom/daaw/avee/Design/VisualizerExporterDesign;)I
    .locals 2

    .line 72
    iget v0, p0, Lcom/daaw/avee/Design/VisualizerExporterDesign;->loadingResourcesFrameCounter:I

    add-int/lit8 v1, v0, 0x1

    iput v1, p0, Lcom/daaw/avee/Design/VisualizerExporterDesign;->loadingResourcesFrameCounter:I

    return v0
.end method

.method static synthetic access$2700(Lcom/daaw/avee/Design/VisualizerExporterDesign;)Lcom/daaw/avee/comp/VisualizerExporter/VisExportDialog$ExportingProgressStatus;
    .locals 0

    .line 72
    iget-object p0, p0, Lcom/daaw/avee/Design/VisualizerExporterDesign;->exportingStatus:Lcom/daaw/avee/comp/VisualizerExporter/VisExportDialog$ExportingProgressStatus;

    return-object p0
.end method

.method static synthetic access$2702(Lcom/daaw/avee/Design/VisualizerExporterDesign;Lcom/daaw/avee/comp/VisualizerExporter/VisExportDialog$ExportingProgressStatus;)Lcom/daaw/avee/comp/VisualizerExporter/VisExportDialog$ExportingProgressStatus;
    .locals 0

    .line 72
    iput-object p1, p0, Lcom/daaw/avee/Design/VisualizerExporterDesign;->exportingStatus:Lcom/daaw/avee/comp/VisualizerExporter/VisExportDialog$ExportingProgressStatus;

    return-object p1
.end method

.method static synthetic access$2800(Lcom/daaw/avee/Design/VisualizerExporterDesign;)Landroid/os/Handler;
    .locals 0

    .line 72
    iget-object p0, p0, Lcom/daaw/avee/Design/VisualizerExporterDesign;->mainThreadHandler:Landroid/os/Handler;

    return-object p0
.end method

.method static synthetic access$2900(Lcom/daaw/avee/Design/VisualizerExporterDesign;)Lcom/daaw/avee/comp/VisualizerExporter/AudioVideoCTSRecorder;
    .locals 0

    .line 72
    iget-object p0, p0, Lcom/daaw/avee/Design/VisualizerExporterDesign;->videoEncoder:Lcom/daaw/avee/comp/VisualizerExporter/AudioVideoCTSRecorder;

    return-object p0
.end method

.method static synthetic access$300(Lcom/daaw/avee/Design/VisualizerExporterDesign;ZLcom/daaw/avee/Common/StatusMsg;Z)V
    .locals 0

    .line 72
    invoke-direct {p0, p1, p2, p3}, Lcom/daaw/avee/Design/VisualizerExporterDesign;->stopExport(ZLcom/daaw/avee/Common/StatusMsg;Z)V

    return-void
.end method

.method static synthetic access$3000(Lcom/daaw/avee/Design/VisualizerExporterDesign;)Ljava/io/File;
    .locals 0

    .line 72
    iget-object p0, p0, Lcom/daaw/avee/Design/VisualizerExporterDesign;->exportFile:Ljava/io/File;

    return-object p0
.end method

.method static synthetic access$3100(Lcom/daaw/avee/Design/VisualizerExporterDesign;)Ljava/io/OutputStream;
    .locals 0

    .line 72
    iget-object p0, p0, Lcom/daaw/avee/Design/VisualizerExporterDesign;->exportOStream:Ljava/io/OutputStream;

    return-object p0
.end method

.method static synthetic access$3200(Lcom/daaw/avee/Design/VisualizerExporterDesign;IIILjava/io/File;Ljava/io/OutputStream;)Ljava/lang/String;
    .locals 0

    .line 72
    invoke-direct/range {p0 .. p5}, Lcom/daaw/avee/Design/VisualizerExporterDesign;->createEncoder(IIILjava/io/File;Ljava/io/OutputStream;)Ljava/lang/String;

    move-result-object p0

    return-object p0
.end method

.method static synthetic access$3300()J
    .locals 2

    .line 72
    sget-wide v0, Lcom/daaw/avee/Design/VisualizerExporterDesign;->outputTrackPositionUs:J

    return-wide v0
.end method

.method static synthetic access$3400(Lcom/daaw/avee/Design/VisualizerExporterDesign;)I
    .locals 0

    .line 72
    iget p0, p0, Lcom/daaw/avee/Design/VisualizerExporterDesign;->exportFrameIndex:I

    return p0
.end method

.method static synthetic access$3500(Lcom/daaw/avee/Design/VisualizerExporterDesign;I)V
    .locals 0

    .line 72
    invoke-direct {p0, p1}, Lcom/daaw/avee/Design/VisualizerExporterDesign;->setFrameCounter(I)V

    return-void
.end method

.method static synthetic access$400(Lcom/daaw/avee/Design/VisualizerExporterDesign;)Lcom/daaw/avee/comp/VisualizerExporter/VisExportDialog$ExportSettings;
    .locals 0

    .line 72
    iget-object p0, p0, Lcom/daaw/avee/Design/VisualizerExporterDesign;->currentExportSettings:Lcom/daaw/avee/comp/VisualizerExporter/VisExportDialog$ExportSettings;

    return-object p0
.end method

.method static synthetic access$500(Lcom/daaw/avee/Design/VisualizerExporterDesign;)J
    .locals 2

    .line 72
    iget-wide v0, p0, Lcom/daaw/avee/Design/VisualizerExporterDesign;->currentStartMSec:J

    return-wide v0
.end method

.method static synthetic access$600(Lcom/daaw/avee/Design/VisualizerExporterDesign;)J
    .locals 2

    .line 72
    iget-wide v0, p0, Lcom/daaw/avee/Design/VisualizerExporterDesign;->currentEndMSec:J

    return-wide v0
.end method

.method static synthetic access$700(Lcom/daaw/avee/Design/VisualizerExporterDesign;)J
    .locals 2

    .line 72
    iget-wide v0, p0, Lcom/daaw/avee/Design/VisualizerExporterDesign;->currentDullTrackDurationMs:J

    return-wide v0
.end method

.method static synthetic access$800(Lcom/daaw/avee/Design/VisualizerExporterDesign;)[Lcom/daaw/avee/comp/VisualizerExporter/VisExportDialog$ExportSettingsProfile;
    .locals 0

    .line 72
    iget-object p0, p0, Lcom/daaw/avee/Design/VisualizerExporterDesign;->exportSettingsProfiles:[Lcom/daaw/avee/comp/VisualizerExporter/VisExportDialog$ExportSettingsProfile;

    return-object p0
.end method

.method static synthetic access$802(Lcom/daaw/avee/Design/VisualizerExporterDesign;[Lcom/daaw/avee/comp/VisualizerExporter/VisExportDialog$ExportSettingsProfile;)[Lcom/daaw/avee/comp/VisualizerExporter/VisExportDialog$ExportSettingsProfile;
    .locals 0

    .line 72
    iput-object p1, p0, Lcom/daaw/avee/Design/VisualizerExporterDesign;->exportSettingsProfiles:[Lcom/daaw/avee/comp/VisualizerExporter/VisExportDialog$ExportSettingsProfile;

    return-object p1
.end method

.method static synthetic access$900(Lcom/daaw/avee/Design/VisualizerExporterDesign;Ljava/lang/String;)Ljava/lang/String;
    .locals 0

    .line 72
    invoke-direct {p0, p1}, Lcom/daaw/avee/Design/VisualizerExporterDesign;->getExportDirectoryPath(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p0

    return-object p0
.end method

.method private checkTrackAhead(J)V
    .locals 0

    return-void
.end method

.method private createEncoder(IIILjava/io/File;Ljava/io/OutputStream;)Ljava/lang/String;
    .locals 17

    move-object/from16 v0, p0

    .line 1302
    iget-object v1, v0, Lcom/daaw/avee/Design/VisualizerExporterDesign;->exportingStats:Lcom/daaw/avee/Design/VisualizerExporterDesign$ExportingStats;

    invoke-virtual {v1}, Lcom/daaw/avee/Design/VisualizerExporterDesign$ExportingStats;->reset()V

    const/4 v1, 0x0

    .line 1304
    invoke-virtual {v0, v1}, Lcom/daaw/avee/Design/VisualizerExporterDesign;->destroyEncoder(Lcom/daaw/avee/Common/StatusMsg;)V

    const-string v2, "initialize VideoSequenceEncoder"

    .line 1306
    invoke-static {v2}, Lcom/daaw/avee/Common/tlog;->w(Ljava/lang/String;)V

    .line 1307
    new-instance v2, Lcom/daaw/avee/comp/VisualizerExporter/AudioVideoCTSRecorder;

    invoke-direct {v2}, Lcom/daaw/avee/comp/VisualizerExporter/AudioVideoCTSRecorder;-><init>()V

    iput-object v2, v0, Lcom/daaw/avee/Design/VisualizerExporterDesign;->videoEncoder:Lcom/daaw/avee/comp/VisualizerExporter/AudioVideoCTSRecorder;

    if-nez p4, :cond_0

    if-eqz p5, :cond_0

    :try_start_0
    const-string v2, "aveeexport"

    .line 1313
    invoke-static {v2, v1}, Ljava/io/File;->createTempFile(Ljava/lang/String;Ljava/lang/String;)Ljava/io/File;

    move-result-object v2
    :try_end_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_0

    move-object v3, v2

    goto :goto_0

    :catch_0
    :cond_0
    move-object/from16 v3, p4

    :goto_0
    const/4 v15, 0x1

    if-eqz v3, :cond_3

    .line 1319
    iget-object v2, v0, Lcom/daaw/avee/Design/VisualizerExporterDesign;->videoEncoder:Lcom/daaw/avee/comp/VisualizerExporter/AudioVideoCTSRecorder;

    iget v5, v0, Lcom/daaw/avee/Design/VisualizerExporterDesign;->targetFps:I

    iget v8, v0, Lcom/daaw/avee/Design/VisualizerExporterDesign;->encodingTargetBitrateMbps:F

    iget-boolean v9, v0, Lcom/daaw/avee/Design/VisualizerExporterDesign;->targetExportAudio:Z

    iget v10, v0, Lcom/daaw/avee/Design/VisualizerExporterDesign;->targetAudioBitrateKbps:F

    iget v11, v0, Lcom/daaw/avee/Design/VisualizerExporterDesign;->targetAudioChannels:I

    iget-object v13, v0, Lcom/daaw/avee/Design/VisualizerExporterDesign;->targetVideoCodec:Ljava/lang/String;

    iget-object v14, v0, Lcom/daaw/avee/Design/VisualizerExporterDesign;->targetVideoMimeType:Ljava/lang/String;

    iget v12, v0, Lcom/daaw/avee/Design/VisualizerExporterDesign;->targetVideoCodecProfile:I

    move-object/from16 v4, p5

    move/from16 v6, p1

    move/from16 v7, p2

    move/from16 v16, v12

    move/from16 v12, p3

    const/4 v1, 0x1

    move/from16 v15, v16

    invoke-virtual/range {v2 .. v15}, Lcom/daaw/avee/comp/VisualizerExporter/AudioVideoCTSRecorder;->initialize(Ljava/io/File;Ljava/io/OutputStream;IIIFZFIILjava/lang/String;Ljava/lang/String;I)Ljava/lang/String;

    move-result-object v2

    if-eqz v2, :cond_2

    .line 1336
    iget-object v3, v0, Lcom/daaw/avee/Design/VisualizerExporterDesign;->exportingStats:Lcom/daaw/avee/Design/VisualizerExporterDesign$ExportingStats;

    iput-boolean v1, v3, Lcom/daaw/avee/Design/VisualizerExporterDesign$ExportingStats;->criticalFailure:Z

    .line 1337
    iget v1, v0, Lcom/daaw/avee/Design/VisualizerExporterDesign;->targetFps:I

    const/16 v3, 0x28

    const-string v4, "Failed to initialize encoder: "

    if-le v1, v3, :cond_1

    .line 1338
    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v1, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v2, " Try lower value for Fps?"

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    goto :goto_1

    .line 1340
    :cond_1
    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v1, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    goto :goto_1

    :cond_2
    const/4 v1, 0x0

    goto :goto_1

    :cond_3
    const/4 v1, 0x1

    .line 1344
    iget-object v2, v0, Lcom/daaw/avee/Design/VisualizerExporterDesign;->exportingStats:Lcom/daaw/avee/Design/VisualizerExporterDesign$ExportingStats;

    iput-boolean v1, v2, Lcom/daaw/avee/Design/VisualizerExporterDesign$ExportingStats;->criticalFailure:Z

    const-string v1, "Failed to create file"

    :goto_1
    if-eqz v1, :cond_4

    .line 1352
    invoke-static {v1}, Lcom/daaw/avee/Common/tlog;->w(Ljava/lang/String;)V

    :cond_4
    return-object v1
.end method

.method private getExportDirectoryPath(Ljava/lang/String;)Ljava/lang/String;
    .locals 2

    .line 909
    :try_start_0
    sget-object v0, Landroid/os/Environment;->DIRECTORY_DOWNLOADS:Ljava/lang/String;

    invoke-static {v0}, Landroid/os/Environment;->getExternalStoragePublicDirectory(Ljava/lang/String;)Ljava/io/File;

    move-result-object v0
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_0

    :catch_0
    const/4 v0, 0x0

    :goto_0
    if-nez v0, :cond_0

    .line 917
    :try_start_1
    invoke-static {}, Lcom/daaw/avee/PlayerCore;->s()Lcom/daaw/avee/PlayerCore;

    move-result-object v1

    invoke-virtual {v1}, Lcom/daaw/avee/PlayerCore;->getAppContext()Landroid/content/Context;

    move-result-object v1

    invoke-virtual {v1}, Landroid/content/Context;->getFilesDir()Ljava/io/File;

    move-result-object v0
    :try_end_1
    .catch Ljava/lang/Exception; {:try_start_1 .. :try_end_1} :catch_1

    goto :goto_1

    :catch_1
    nop

    :cond_0
    :goto_1
    if-eqz v0, :cond_1

    .line 927
    :try_start_2
    invoke-virtual {v0}, Ljava/io/File;->getCanonicalPath()Ljava/lang/String;

    move-result-object p1
    :try_end_2
    .catch Ljava/lang/Exception; {:try_start_2 .. :try_end_2} :catch_2

    :catch_2
    :cond_1
    return-object p1
.end method

.method public static getOutputTrackDurationUs()J
    .locals 2

    .line 146
    sget-wide v0, Lcom/daaw/avee/Design/VisualizerExporterDesign;->outputTrackDurationUs:J

    return-wide v0
.end method

.method public static getOutputTrackPositionUs()J
    .locals 2

    .line 141
    sget-wide v0, Lcom/daaw/avee/Design/VisualizerExporterDesign;->outputTrackPositionUs:J

    return-wide v0
.end method

.method public static isExporting()Z
    .locals 1

    .line 136
    sget-boolean v0, Lcom/daaw/avee/Design/VisualizerExporterDesign;->exporting:Z

    return v0
.end method

.method private readjustSeek(JZ)J
    .locals 2

    const-wide/32 v0, 0x493e0

    sub-long/2addr p1, v0

    const-wide/16 v0, 0x0

    .line 1378
    invoke-static {v0, v1, p1, p2}, Ljava/lang/Math;->max(JJ)J

    move-result-wide p1

    const-wide/16 v0, 0x3e8

    .line 1379
    div-long/2addr p1, v0

    .line 1381
    sget-object p3, Lcom/daaw/avee/comp/playback/EventsPlaybackService$Receive;->onSeekChanged:Lcom/daaw/avee/Common/Events/WeakDelegate1;

    invoke-static {p1, p2}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object p1

    invoke-virtual {p3, p1}, Lcom/daaw/avee/Common/Events/WeakDelegate1;->invoke(Ljava/lang/Object;)V

    .line 1382
    sget-object p1, Lcom/daaw/avee/comp/playback/EventsPlaybackService$Receive;->onAction:Lcom/daaw/avee/Common/Events/WeakDelegate1;

    const/4 p2, 0x1

    invoke-static {p2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p2

    invoke-virtual {p1, p2}, Lcom/daaw/avee/Common/Events/WeakDelegate1;->invoke(Ljava/lang/Object;)V

    const-wide/16 p1, 0x12c

    return-wide p1
.end method

.method private setFrameCounter(I)V
    .locals 4

    .line 893
    iput p1, p0, Lcom/daaw/avee/Design/VisualizerExporterDesign;->frameCounter:I

    .line 894
    iget p1, p0, Lcom/daaw/avee/Design/VisualizerExporterDesign;->frameCounter:I

    iget v0, p0, Lcom/daaw/avee/Design/VisualizerExporterDesign;->startFrameToCapture:I

    sub-int/2addr p1, v0

    iput p1, p0, Lcom/daaw/avee/Design/VisualizerExporterDesign;->exportFrameIndex:I

    .line 895
    iget p1, p0, Lcom/daaw/avee/Design/VisualizerExporterDesign;->targetFps:I

    .line 897
    iget v0, p0, Lcom/daaw/avee/Design/VisualizerExporterDesign;->exportFrameIndex:I

    int-to-long v0, v0

    invoke-static {v0, v1, p1}, Lcom/daaw/avee/comp/VisualizerExporter/AudioVideoCTSRecorder;->computePresentationTime(JI)J

    move-result-wide v0

    sput-wide v0, Lcom/daaw/avee/Design/VisualizerExporterDesign;->outputTrackPositionUs:J

    .line 898
    iget v0, p0, Lcom/daaw/avee/Design/VisualizerExporterDesign;->frameCounter:I

    int-to-long v0, v0

    invoke-static {v0, v1, p1}, Lcom/daaw/avee/comp/VisualizerExporter/AudioVideoCTSRecorder;->computePresentationTime(JI)J

    move-result-wide v0

    const-wide/16 v2, 0x0

    invoke-static {v2, v3, v0, v1}, Ljava/lang/Math;->max(JJ)J

    move-result-wide v0

    sput-wide v0, Lcom/daaw/avee/Design/VisualizerExporterDesign;->audioTrackPositionUs:J

    return-void
.end method

.method public static showFileSavedNotification(ILandroid/content/Context;Ljava/lang/String;Landroid/net/Uri;Ljava/lang/String;Ljava/lang/String;)V
    .locals 2

    .line 1232
    sget v0, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 v1, 0x18

    if-lt v0, v1, :cond_0

    return-void

    .line 1241
    :cond_0
    :try_start_0
    new-instance v0, Landroid/content/Intent;

    const-string v1, "android.intent.action.VIEW"

    invoke-direct {v0, v1}, Landroid/content/Intent;-><init>(Ljava/lang/String;)V

    .line 1243
    invoke-virtual {v0, p3, p5}, Landroid/content/Intent;->setDataAndType(Landroid/net/Uri;Ljava/lang/String;)Landroid/content/Intent;

    const/4 p3, 0x0

    .line 1244
    invoke-static {p1, p3, v0, p3}, Landroid/app/PendingIntent;->getActivity(Landroid/content/Context;ILandroid/content/Intent;I)Landroid/app/PendingIntent;

    move-result-object p3

    const-string p5, "notification"

    .line 1247
    invoke-virtual {p1, p5}, Landroid/content/Context;->getSystemService(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object p5

    check-cast p5, Landroid/app/NotificationManager;

    .line 1248
    new-instance v0, Landroidx/core/app/NotificationCompat$Builder;

    invoke-direct {v0, p1}, Landroidx/core/app/NotificationCompat$Builder;-><init>(Landroid/content/Context;)V

    .line 1249
    invoke-virtual {v0, p4}, Landroidx/core/app/NotificationCompat$Builder;->setContentTitle(Ljava/lang/CharSequence;)Landroidx/core/app/NotificationCompat$Builder;

    move-result-object p1

    .line 1250
    invoke-virtual {p1, p2}, Landroidx/core/app/NotificationCompat$Builder;->setContentText(Ljava/lang/CharSequence;)Landroidx/core/app/NotificationCompat$Builder;

    move-result-object p1

    const p2, 0x7f080105

    .line 1251
    invoke-virtual {p1, p2}, Landroidx/core/app/NotificationCompat$Builder;->setSmallIcon(I)Landroidx/core/app/NotificationCompat$Builder;

    move-result-object p1

    .line 1252
    invoke-virtual {p1, p3}, Landroidx/core/app/NotificationCompat$Builder;->setContentIntent(Landroid/app/PendingIntent;)Landroidx/core/app/NotificationCompat$Builder;

    move-result-object p1

    const/4 p2, 0x1

    invoke-virtual {p1, p2}, Landroidx/core/app/NotificationCompat$Builder;->setLocalOnly(Z)Landroidx/core/app/NotificationCompat$Builder;

    move-result-object p1

    invoke-virtual {p1, p2}, Landroidx/core/app/NotificationCompat$Builder;->setAutoCancel(Z)Landroidx/core/app/NotificationCompat$Builder;

    .line 1261
    invoke-virtual {v0}, Landroidx/core/app/NotificationCompat$Builder;->build()Landroid/app/Notification;

    move-result-object p1

    invoke-virtual {p5, p0, p1}, Landroid/app/NotificationManager;->notify(ILandroid/app/Notification;)V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    :catch_0
    return-void
.end method

.method private stopExport(ZLcom/daaw/avee/Common/StatusMsg;Z)V
    .locals 9

    .line 1126
    sget v0, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 v1, 0x12

    if-ge v0, v1, :cond_0

    return-void

    :cond_0
    if-nez p3, :cond_1

    .line 1129
    sget-boolean p3, Lcom/daaw/avee/Design/VisualizerExporterDesign;->exporting:Z

    if-nez p3, :cond_1

    return-void

    .line 1131
    :cond_1
    iget-object p3, p0, Lcom/daaw/avee/Design/VisualizerExporterDesign;->mainUIDesign:Lcom/daaw/avee/Design/MainUIDesign;

    const/4 v0, 0x0

    invoke-virtual {p3, v0}, Lcom/daaw/avee/Design/MainUIDesign;->setOverrideForceLockOrient(Z)V

    .line 1133
    iput-boolean v0, p0, Lcom/daaw/avee/Design/VisualizerExporterDesign;->glThreadSignalDoneExporting:Z

    .line 1134
    sput-boolean v0, Lcom/daaw/avee/Design/VisualizerExporterDesign;->exporting:Z

    .line 1135
    sget-object p3, Lcom/daaw/avee/Design/VisualizerExporterDesign;->onExportingChanged:Lcom/daaw/avee/Common/Events/WeakEvent3;

    sget-boolean v1, Lcom/daaw/avee/Design/VisualizerExporterDesign;->exporting:Z

    invoke-static {v1}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v1

    const-wide/16 v2, 0x0

    invoke-static {v2, v3}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v2

    invoke-static {v0}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v3

    invoke-virtual {p3, v1, v2, v3}, Lcom/daaw/avee/Common/Events/WeakEvent3;->invoke(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)V

    const/4 p3, 0x0

    .line 1138
    :goto_0
    iget-boolean v1, p0, Lcom/daaw/avee/Design/VisualizerExporterDesign;->glThreadSignalDoneExporting:Z

    if-nez v1, :cond_2

    const/16 v1, 0x32

    if-ge p3, v1, :cond_2

    add-int/lit8 p3, p3, 0x1

    const-wide/16 v1, 0x64

    .line 1142
    :try_start_0
    invoke-static {v1, v2}, Ljava/lang/Thread;->sleep(J)V
    :try_end_0
    .catch Ljava/lang/InterruptedException; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_0

    :catch_0
    move-exception v1

    .line 1144
    invoke-virtual {v1}, Ljava/lang/InterruptedException;->printStackTrace()V

    goto :goto_0

    .line 1148
    :cond_2
    iget-boolean p3, p0, Lcom/daaw/avee/Design/VisualizerExporterDesign;->glThreadSignalDoneExporting:Z

    if-nez p3, :cond_3

    const-string p3, "glThreadSignalDoneExporting timed out"

    .line 1149
    invoke-static {p3}, Lcom/daaw/avee/Common/tlog;->w(Ljava/lang/String;)V

    :cond_3
    const/4 p3, 0x0

    .line 1151
    iput-object p3, p0, Lcom/daaw/avee/Design/VisualizerExporterDesign;->exportingStatus:Lcom/daaw/avee/comp/VisualizerExporter/VisExportDialog$ExportingProgressStatus;

    .line 1153
    iget-object v1, p0, Lcom/daaw/avee/Design/VisualizerExporterDesign;->playbackDesign:Lcom/daaw/avee/Design/PlaybackDesign;

    invoke-virtual {v1, v0}, Lcom/daaw/avee/Design/PlaybackDesign;->updateKeepScreenOnLock(Z)V

    .line 1154
    sget-object v1, Lcom/daaw/avee/comp/playback/EventsPlaybackService$Receive;->onAction:Lcom/daaw/avee/Common/Events/WeakDelegate1;

    const/4 v2, 0x2

    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v3

    invoke-virtual {v1, v3}, Lcom/daaw/avee/Common/Events/WeakDelegate1;->invoke(Ljava/lang/Object;)V

    .line 1156
    new-instance v1, Lcom/daaw/avee/comp/VisualizerExporter/VisExportDialog$ExportingProgressStatus;

    invoke-direct {v1}, Lcom/daaw/avee/comp/VisualizerExporter/VisExportDialog$ExportingProgressStatus;-><init>()V

    .line 1157
    iput-boolean v0, v1, Lcom/daaw/avee/comp/VisualizerExporter/VisExportDialog$ExportingProgressStatus;->active:Z

    .line 1158
    invoke-static {v1}, Lcom/daaw/avee/comp/VisualizerExporter/VisExportDialog;->updateExportingProgressStatus(Lcom/daaw/avee/comp/VisualizerExporter/VisExportDialog$ExportingProgressStatus;)V

    .line 1162
    invoke-static {}, Lcom/daaw/avee/PlayerCore;->s()Lcom/daaw/avee/PlayerCore;

    move-result-object v0

    invoke-virtual {v0}, Lcom/daaw/avee/PlayerCore;->getAppContext()Landroid/content/Context;

    move-result-object v0

    if-eqz v0, :cond_9

    .line 1165
    iget-object v1, p0, Lcom/daaw/avee/Design/VisualizerExporterDesign;->exportFile:Ljava/io/File;

    if-eqz v1, :cond_4

    .line 1166
    iget-object v1, p0, Lcom/daaw/avee/Design/VisualizerExporterDesign;->exportFile:Ljava/io/File;

    invoke-static {v1}, Landroid/net/Uri;->fromFile(Ljava/io/File;)Landroid/net/Uri;

    move-result-object v1

    .line 1167
    new-instance v3, Ljava/lang/StringBuilder;

    invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V

    const-string v4, "notify file: "

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-static {v1}, Lcom/daaw/avee/Common/tlog;->d(Ljava/lang/String;)V

    .line 1169
    iget-object v1, p0, Lcom/daaw/avee/Design/VisualizerExporterDesign;->exportFile:Ljava/io/File;

    invoke-virtual {v1}, Ljava/io/File;->getAbsolutePath()Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1}, Lcom/daaw/avee/Common/UtilsFileSys;->scanFile(Landroid/content/Context;Ljava/lang/String;)V

    :cond_4
    if-eqz p1, :cond_8

    .line 1174
    iget-object v1, p0, Lcom/daaw/avee/Design/VisualizerExporterDesign;->exportFile:Ljava/io/File;

    if-eqz v1, :cond_5

    .line 1175
    iget-object v1, p0, Lcom/daaw/avee/Design/VisualizerExporterDesign;->exportFile:Ljava/io/File;

    invoke-static {v1}, Landroid/net/Uri;->fromFile(Ljava/io/File;)Landroid/net/Uri;

    move-result-object v6

    const/4 v3, 0x3

    .line 1180
    invoke-virtual {v6}, Landroid/net/Uri;->getPath()Ljava/lang/String;

    move-result-object v1

    invoke-static {v1}, Lcom/daaw/avee/Common/UtilsFileSys;->extractFilename(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v7

    const-string v5, "Exported visualizer"

    const-string v8, "video/mp4"

    move-object v4, v0

    .line 1176
    invoke-static/range {v3 .. v8}, Lcom/daaw/avee/Design/VisualizerExporterDesign;->showFileSavedNotification(ILandroid/content/Context;Ljava/lang/String;Landroid/net/Uri;Ljava/lang/String;Ljava/lang/String;)V

    :cond_5
    if-eqz p2, :cond_6

    .line 1185
    invoke-virtual {p2}, Lcom/daaw/avee/Common/StatusMsg;->getFullMessage()Ljava/lang/String;

    move-result-object p2

    goto :goto_1

    :cond_6
    const-string p2, ""

    :goto_1
    if-eqz p2, :cond_7

    .line 1186
    invoke-virtual {p2}, Ljava/lang/String;->length()I

    move-result v1

    if-lez v1, :cond_7

    .line 1188
    invoke-static {}, Lcom/daaw/avee/PlayerCore;->s()Lcom/daaw/avee/PlayerCore;

    move-result-object v0

    invoke-virtual {v0}, Lcom/daaw/avee/PlayerCore;->getActivityContextAsActivity()Landroid/app/Activity;

    move-result-object v0

    if-eqz v0, :cond_9

    .line 1190
    invoke-virtual {v0}, Landroid/app/Activity;->isFinishing()Z

    move-result v1

    if-nez v1, :cond_9

    .line 1191
    new-instance v1, Landroid/app/AlertDialog$Builder;

    invoke-direct {v1, v0}, Landroid/app/AlertDialog$Builder;-><init>(Landroid/content/Context;)V

    .line 1192
    invoke-virtual {v1, p2}, Landroid/app/AlertDialog$Builder;->setMessage(Ljava/lang/CharSequence;)Landroid/app/AlertDialog$Builder;

    const p2, 0x7f1001b2

    .line 1193
    invoke-virtual {v1, p2}, Landroid/app/AlertDialog$Builder;->setTitle(I)Landroid/app/AlertDialog$Builder;

    const p2, 0x7f10004f

    .line 1194
    new-instance v0, Lcom/daaw/avee/Design/VisualizerExporterDesign$21;

    invoke-direct {v0, p0}, Lcom/daaw/avee/Design/VisualizerExporterDesign$21;-><init>(Lcom/daaw/avee/Design/VisualizerExporterDesign;)V

    invoke-virtual {v1, p2, v0}, Landroid/app/AlertDialog$Builder;->setPositiveButton(ILandroid/content/DialogInterface$OnClickListener;)Landroid/app/AlertDialog$Builder;

    .line 1199
    invoke-virtual {v1}, Landroid/app/AlertDialog$Builder;->create()Landroid/app/AlertDialog;

    move-result-object p2

    .line 1200
    invoke-virtual {p2}, Landroid/app/AlertDialog;->show()V

    const v0, 0x102000b

    .line 1202
    invoke-virtual {p2, v0}, Landroid/app/AlertDialog;->findViewById(I)Landroid/view/View;

    move-result-object p2

    check-cast p2, Landroid/widget/TextView;

    if-eqz p2, :cond_9

    const/high16 v0, 0x41600000    # 14.0f

    .line 1203
    invoke-virtual {p2, v2, v0}, Landroid/widget/TextView;->setTextSize(IF)V

    goto :goto_2

    .line 1206
    :cond_7
    invoke-virtual {v0}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object p2

    const v0, 0x7f1001b9

    invoke-virtual {p2, v0}, Landroid/content/res/Resources;->getString(I)Ljava/lang/String;

    move-result-object p2

    .line 1207
    sget-object v0, Lcom/daaw/avee/EventsGlobal/EventsGlobalTextNotifier;->onTextMsg:Lcom/daaw/avee/Common/Events/WeakEvent1;

    invoke-virtual {v0, p2}, Lcom/daaw/avee/Common/Events/WeakEvent1;->invoke(Ljava/lang/Object;)V

    goto :goto_2

    .line 1211
    :cond_8
    invoke-virtual {v0}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object p2

    const v0, 0x7f1001ae

    invoke-virtual {p2, v0}, Landroid/content/res/Resources;->getString(I)Ljava/lang/String;

    move-result-object p2

    .line 1212
    sget-object v0, Lcom/daaw/avee/EventsGlobal/EventsGlobalTextNotifier;->onTextMsg:Lcom/daaw/avee/Common/Events/WeakEvent1;

    invoke-virtual {v0, p2}, Lcom/daaw/avee/Common/Events/WeakEvent1;->invoke(Ljava/lang/Object;)V

    .line 1219
    :cond_9
    :goto_2
    iput-object p3, p0, Lcom/daaw/avee/Design/VisualizerExporterDesign;->frameCaptureDesc:Lcom/daaw/avee/comp/Visualizer/FrameCaptureDesc;

    .line 1221
    iput-object p3, p0, Lcom/daaw/avee/Design/VisualizerExporterDesign;->exportFile:Ljava/io/File;

    .line 1223
    invoke-virtual {p0}, Lcom/daaw/avee/Design/VisualizerExporterDesign;->resetVisualizer()V

    if-eqz p1, :cond_a

    .line 1226
    sget-object p1, Lcom/daaw/avee/Design/VisualizerExporterDesign;->onExportSuccess:Lcom/daaw/avee/Common/Events/WeakEvent;

    invoke-virtual {p1}, Lcom/daaw/avee/Common/Events/WeakEvent;->invoke()V

    :cond_a
    return-void
.end method

.method private validateExportSettings(Lcom/daaw/avee/comp/VisualizerExporter/VisExportDialog$ExportSettingsProfile;[Lcom/daaw/avee/comp/VisualizerExporter/VisExportDialog$ExportSettingsProfile;)V
    .locals 2

    .line 938
    sget-object v0, Lcom/daaw/avee/Design/VisualizerExporterDesign;->isPremium:Lcom/daaw/avee/Common/Events/WeakEventR;

    const/4 v1, 0x0

    invoke-static {v1}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/daaw/avee/Common/Events/WeakEventR;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Boolean;

    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v0

    if-eqz v0, :cond_0

    return-void

    .line 942
    :cond_0
    invoke-static {p2}, Lcom/daaw/avee/comp/VisualizerExporter/VisExportDialog$ExportSettingsProfile;->makeMaxProfile([Lcom/daaw/avee/comp/VisualizerExporter/VisExportDialog$ExportSettingsProfile;)Lcom/daaw/avee/comp/VisualizerExporter/VisExportDialog$ExportSettingsProfile;

    move-result-object p2

    .line 943
    invoke-virtual {p1, p2}, Lcom/daaw/avee/comp/VisualizerExporter/VisExportDialog$ExportSettingsProfile;->forceMaxProfile(Lcom/daaw/avee/comp/VisualizerExporter/VisExportDialog$ExportSettingsProfile;)V

    return-void
.end method


# virtual methods
.method createFile(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/io/File;
    .locals 1

    const/4 v0, 0x0

    .line 1278
    invoke-virtual {p0, p1, p2, p3, v0}, Lcom/daaw/avee/Design/VisualizerExporterDesign;->createFile(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;I)Ljava/io/File;

    move-result-object p1

    return-object p1
.end method

.method createFile(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;I)Ljava/io/File;
    .locals 3

    .line 1282
    new-instance v0, Ljava/io/File;

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v1, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v2, " "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1, p4}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v1, p3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-static {v1}, Lcom/daaw/avee/Common/UtilsFileSys;->fixToValidFilename(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    invoke-direct {v0, p1, v1}, Ljava/io/File;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    .line 1284
    invoke-virtual {v0}, Ljava/io/File;->getParentFile()Ljava/io/File;

    move-result-object v1

    if-eqz v1, :cond_0

    .line 1286
    invoke-virtual {v1}, Ljava/io/File;->isDirectory()Z

    move-result v2

    if-nez v2, :cond_0

    .line 1287
    invoke-virtual {v1}, Ljava/io/File;->mkdirs()Z

    .line 1292
    :cond_0
    invoke-virtual {v0}, Ljava/io/File;->exists()Z

    move-result v1

    if-eqz v1, :cond_1

    const/16 v1, 0x3e8

    if-ge p4, v1, :cond_1

    add-int/lit8 p4, p4, 0x1

    .line 1294
    invoke-virtual {p0, p1, p2, p3, p4}, Lcom/daaw/avee/Design/VisualizerExporterDesign;->createFile(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;I)Ljava/io/File;

    move-result-object p1

    return-object p1

    :cond_1
    return-object v0
.end method

.method destroyEncoder(Lcom/daaw/avee/Common/StatusMsg;)V
    .locals 1

    .line 1358
    iget-object v0, p0, Lcom/daaw/avee/Design/VisualizerExporterDesign;->videoEncoder:Lcom/daaw/avee/comp/VisualizerExporter/AudioVideoCTSRecorder;

    if-eqz v0, :cond_0

    .line 1359
    iget-object v0, p0, Lcom/daaw/avee/Design/VisualizerExporterDesign;->videoEncoder:Lcom/daaw/avee/comp/VisualizerExporter/AudioVideoCTSRecorder;

    invoke-virtual {v0, p1}, Lcom/daaw/avee/comp/VisualizerExporter/AudioVideoCTSRecorder;->finish(Lcom/daaw/avee/Common/StatusMsg;)Z

    .line 1360
    iget-object p1, p0, Lcom/daaw/avee/Design/VisualizerExporterDesign;->videoEncoder:Lcom/daaw/avee/comp/VisualizerExporter/AudioVideoCTSRecorder;

    invoke-virtual {p1}, Lcom/daaw/avee/comp/VisualizerExporter/AudioVideoCTSRecorder;->release()V

    const/4 p1, 0x0

    .line 1361
    iput-object p1, p0, Lcom/daaw/avee/Design/VisualizerExporterDesign;->videoEncoder:Lcom/daaw/avee/comp/VisualizerExporter/AudioVideoCTSRecorder;

    :cond_0
    return-void
.end method

.method readjustSeek2()V
    .locals 0

    return-void
.end method

.method resetVisualizer()V
    .locals 1

    .line 1368
    iget-object v0, p0, Lcom/daaw/avee/Design/VisualizerExporterDesign;->visualizerSurfaceView:Ljava/lang/ref/WeakReference;

    invoke-virtual {v0}, Ljava/lang/ref/WeakReference;->get()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/daaw/avee/comp/Visualizer/VisualizerViewCore;

    if-eqz v0, :cond_0

    .line 1370
    invoke-virtual {v0}, Lcom/daaw/avee/comp/Visualizer/VisualizerViewCore;->resetVisualizerTh()V

    :cond_0
    return-void
.end method

.method startExport(Lcom/daaw/avee/ContextData;Lcom/daaw/avee/comp/VisualizerExporter/VisExportDialog$ExportSettings;Ljava/io/File;Ljava/io/OutputStream;JJJ)V
    .locals 17

    move-object/from16 v0, p0

    move-object/from16 v1, p2

    .line 1006
    sget v2, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 v3, 0x12

    if-ge v2, v3, :cond_0

    return-void

    .line 1008
    :cond_0
    sget-boolean v2, Lcom/daaw/avee/Design/VisualizerExporterDesign;->exporting:Z

    if-eqz v2, :cond_1

    return-void

    .line 1010
    :cond_1
    iget-object v2, v0, Lcom/daaw/avee/Design/VisualizerExporterDesign;->exportingErrorStatus:Lcom/daaw/avee/Common/StatusMsg;

    invoke-virtual {v2}, Lcom/daaw/avee/Common/StatusMsg;->reset()V

    .line 1012
    iget-object v2, v0, Lcom/daaw/avee/Design/VisualizerExporterDesign;->mainUIDesign:Lcom/daaw/avee/Design/MainUIDesign;

    const/4 v3, 0x1

    invoke-virtual {v2, v3}, Lcom/daaw/avee/Design/MainUIDesign;->setOverrideForceLockOrient(Z)V

    .line 1014
    invoke-static {}, Ljava/lang/System;->gc()V

    .line 1016
    iget-object v2, v1, Lcom/daaw/avee/comp/VisualizerExporter/VisExportDialog$ExportSettings;->profileActive:Lcom/daaw/avee/comp/VisualizerExporter/VisExportDialog$ExportSettingsProfile;

    iget-object v4, v0, Lcom/daaw/avee/Design/VisualizerExporterDesign;->exportSettingsProfiles:[Lcom/daaw/avee/comp/VisualizerExporter/VisExportDialog$ExportSettingsProfile;

    invoke-direct {v0, v2, v4}, Lcom/daaw/avee/Design/VisualizerExporterDesign;->validateExportSettings(Lcom/daaw/avee/comp/VisualizerExporter/VisExportDialog$ExportSettingsProfile;[Lcom/daaw/avee/comp/VisualizerExporter/VisExportDialog$ExportSettingsProfile;)V

    .line 1018
    invoke-static/range {p5 .. p8}, Ljava/lang/Math;->min(JJ)J

    move-result-wide v4

    const-wide/16 v6, 0x0

    invoke-static {v4, v5, v6, v7}, Ljava/lang/Math;->max(JJ)J

    move-result-wide v4

    move-wide/from16 v8, p7

    .line 1019
    invoke-static {v4, v5, v8, v9}, Ljava/lang/Math;->max(JJ)J

    move-result-wide v8

    const-wide/16 v10, 0x32

    sub-long v10, p9, v10

    invoke-static {v8, v9, v10, v11}, Ljava/lang/Math;->min(JJ)J

    move-result-wide v8

    .line 1021
    iget-object v2, v1, Lcom/daaw/avee/comp/VisualizerExporter/VisExportDialog$ExportSettings;->profileActive:Lcom/daaw/avee/comp/VisualizerExporter/VisExportDialog$ExportSettingsProfile;

    iget v2, v2, Lcom/daaw/avee/comp/VisualizerExporter/VisExportDialog$ExportSettingsProfile;->frameRate:I

    invoke-static {v2, v3}, Ljava/lang/Math;->max(II)I

    move-result v2

    iput v2, v0, Lcom/daaw/avee/Design/VisualizerExporterDesign;->targetFps:I

    const-wide/32 v10, 0xf4240

    .line 1022
    iget v2, v0, Lcom/daaw/avee/Design/VisualizerExporterDesign;->targetFps:I

    int-to-long v12, v2

    div-long/2addr v10, v12

    iput-wide v10, v0, Lcom/daaw/avee/Design/VisualizerExporterDesign;->targetFrameTimeUs:J

    .line 1023
    iget-object v2, v1, Lcom/daaw/avee/comp/VisualizerExporter/VisExportDialog$ExportSettings;->profileActive:Lcom/daaw/avee/comp/VisualizerExporter/VisExportDialog$ExportSettingsProfile;

    iget v2, v2, Lcom/daaw/avee/comp/VisualizerExporter/VisExportDialog$ExportSettingsProfile;->videoBitrateMbps:F

    iput v2, v0, Lcom/daaw/avee/Design/VisualizerExporterDesign;->encodingTargetBitrateMbps:F

    .line 1024
    iget-boolean v2, v1, Lcom/daaw/avee/comp/VisualizerExporter/VisExportDialog$ExportSettings;->videoForceCompatibleWH:Z

    iput-boolean v2, v0, Lcom/daaw/avee/Design/VisualizerExporterDesign;->targetVideoForceCompatibleWH:Z

    .line 1025
    iget-boolean v2, v1, Lcom/daaw/avee/comp/VisualizerExporter/VisExportDialog$ExportSettings;->exportAudio:Z

    iput-boolean v2, v0, Lcom/daaw/avee/Design/VisualizerExporterDesign;->targetExportAudio:Z

    .line 1026
    iget-object v2, v1, Lcom/daaw/avee/comp/VisualizerExporter/VisExportDialog$ExportSettings;->profileActive:Lcom/daaw/avee/comp/VisualizerExporter/VisExportDialog$ExportSettingsProfile;

    iget v2, v2, Lcom/daaw/avee/comp/VisualizerExporter/VisExportDialog$ExportSettingsProfile;->audioBitrateKbps:F

    iput v2, v0, Lcom/daaw/avee/Design/VisualizerExporterDesign;->targetAudioBitrateKbps:F

    .line 1027
    iget-object v2, v1, Lcom/daaw/avee/comp/VisualizerExporter/VisExportDialog$ExportSettings;->profileActive:Lcom/daaw/avee/comp/VisualizerExporter/VisExportDialog$ExportSettingsProfile;

    iget v2, v2, Lcom/daaw/avee/comp/VisualizerExporter/VisExportDialog$ExportSettingsProfile;->audioChannels:I

    iput v2, v0, Lcom/daaw/avee/Design/VisualizerExporterDesign;->targetAudioChannels:I

    .line 1028
    iget v2, v1, Lcom/daaw/avee/comp/VisualizerExporter/VisExportDialog$ExportSettings;->videoCodecActiveIndex:I

    invoke-virtual {v1, v2}, Lcom/daaw/avee/comp/VisualizerExporter/VisExportDialog$ExportSettings;->getVideoCodec(I)Ljava/lang/String;

    move-result-object v2

    iput-object v2, v0, Lcom/daaw/avee/Design/VisualizerExporterDesign;->targetVideoCodec:Ljava/lang/String;

    .line 1029
    iget v2, v1, Lcom/daaw/avee/comp/VisualizerExporter/VisExportDialog$ExportSettings;->videoCodecActiveIndex:I

    invoke-virtual {v1, v2}, Lcom/daaw/avee/comp/VisualizerExporter/VisExportDialog$ExportSettings;->getVideoMimeTypeCodec(I)Ljava/lang/String;

    move-result-object v2

    iput-object v2, v0, Lcom/daaw/avee/Design/VisualizerExporterDesign;->targetVideoMimeType:Ljava/lang/String;

    .line 1030
    iget-object v2, v1, Lcom/daaw/avee/comp/VisualizerExporter/VisExportDialog$ExportSettings;->profileActive:Lcom/daaw/avee/comp/VisualizerExporter/VisExportDialog$ExportSettingsProfile;

    iget v2, v2, Lcom/daaw/avee/comp/VisualizerExporter/VisExportDialog$ExportSettingsProfile;->videoCodecProfile:I

    iput v2, v0, Lcom/daaw/avee/Design/VisualizerExporterDesign;->targetVideoCodecProfile:I

    .line 1032
    iget-boolean v2, v1, Lcom/daaw/avee/comp/VisualizerExporter/VisExportDialog$ExportSettings;->hideAppLogo:Z

    .line 1034
    iget-object v10, v1, Lcom/daaw/avee/comp/VisualizerExporter/VisExportDialog$ExportSettings;->profileActive:Lcom/daaw/avee/comp/VisualizerExporter/VisExportDialog$ExportSettingsProfile;

    iget v10, v10, Lcom/daaw/avee/comp/VisualizerExporter/VisExportDialog$ExportSettingsProfile;->width:I

    const/16 v11, 0x10

    invoke-static {v11, v10}, Ljava/lang/Math;->max(II)I

    move-result v10

    const/16 v12, 0x2000

    invoke-static {v12, v10}, Ljava/lang/Math;->min(II)I

    move-result v10

    .line 1035
    iget-object v1, v1, Lcom/daaw/avee/comp/VisualizerExporter/VisExportDialog$ExportSettings;->profileActive:Lcom/daaw/avee/comp/VisualizerExporter/VisExportDialog$ExportSettingsProfile;

    iget v1, v1, Lcom/daaw/avee/comp/VisualizerExporter/VisExportDialog$ExportSettingsProfile;->height:I

    invoke-static {v11, v1}, Ljava/lang/Math;->max(II)I

    move-result v1

    invoke-static {v12, v1}, Ljava/lang/Math;->min(II)I

    move-result v1

    .line 1037
    iget-boolean v11, v0, Lcom/daaw/avee/Design/VisualizerExporterDesign;->targetVideoForceCompatibleWH:Z

    if-eqz v11, :cond_2

    .line 1038
    invoke-static {v10}, Lcom/daaw/avee/comp/VisualizerExporter/AudioVideoCTSRecorder;->getCompatibleVideoWidth(I)I

    move-result v10

    .line 1039
    invoke-static {v1}, Lcom/daaw/avee/comp/VisualizerExporter/AudioVideoCTSRecorder;->getCompatibleVideoHeight(I)I

    move-result v1

    .line 1042
    :cond_2
    new-instance v11, Lcom/daaw/avee/comp/Visualizer/FrameCaptureDesc;

    invoke-direct {v11}, Lcom/daaw/avee/comp/Visualizer/FrameCaptureDesc;-><init>()V

    iput-object v11, v0, Lcom/daaw/avee/Design/VisualizerExporterDesign;->frameCaptureDesc:Lcom/daaw/avee/comp/Visualizer/FrameCaptureDesc;

    .line 1043
    iget-object v11, v0, Lcom/daaw/avee/Design/VisualizerExporterDesign;->frameCaptureDesc:Lcom/daaw/avee/comp/Visualizer/FrameCaptureDesc;

    const/4 v12, 0x0

    iput-boolean v12, v11, Lcom/daaw/avee/comp/Visualizer/FrameCaptureDesc;->captureToImageBuffer:Z

    .line 1044
    iget-object v11, v0, Lcom/daaw/avee/Design/VisualizerExporterDesign;->frameCaptureDesc:Lcom/daaw/avee/comp/Visualizer/FrameCaptureDesc;

    iget-wide v13, v0, Lcom/daaw/avee/Design/VisualizerExporterDesign;->targetFrameTimeUs:J

    const-wide/16 v15, 0x3e8

    div-long/2addr v13, v15

    long-to-int v14, v13

    iput v14, v11, Lcom/daaw/avee/comp/Visualizer/FrameCaptureDesc;->overrideFrameTimeMs:I

    .line 1045
    iget-object v11, v0, Lcom/daaw/avee/Design/VisualizerExporterDesign;->frameCaptureDesc:Lcom/daaw/avee/comp/Visualizer/FrameCaptureDesc;

    iput v10, v11, Lcom/daaw/avee/comp/Visualizer/FrameCaptureDesc;->overrideScreenWidth:I

    .line 1046
    iget-object v10, v0, Lcom/daaw/avee/Design/VisualizerExporterDesign;->frameCaptureDesc:Lcom/daaw/avee/comp/Visualizer/FrameCaptureDesc;

    iput v1, v10, Lcom/daaw/avee/comp/Visualizer/FrameCaptureDesc;->overrideScreenHeight:I

    .line 1048
    invoke-static {}, Lcom/daaw/avee/comp/AppPreferences/AppPreferences;->createOrGetInstance()Lcom/daaw/avee/comp/AppPreferences/AppPreferences;

    move-result-object v1

    .line 1049
    iget-object v10, v0, Lcom/daaw/avee/Design/VisualizerExporterDesign;->audioFrameRequest:Lcom/daaw/avee/comp/playback/AudioFrameData$Request2;

    iget v11, v0, Lcom/daaw/avee/Design/VisualizerExporterDesign;->targetAudioChannels:I

    iput v11, v10, Lcom/daaw/avee/comp/playback/AudioFrameData$Request2;->audioChannelCount:I

    .line 1050
    iget-object v10, v0, Lcom/daaw/avee/Design/VisualizerExporterDesign;->audioFrameRequest:Lcom/daaw/avee/comp/playback/AudioFrameData$Request2;

    sget v11, Lcom/daaw/avee/comp/AppPreferences/AppPreferences;->PREF_Bool_visualizerUseGlobalSession:I

    invoke-virtual {v1, v11}, Lcom/daaw/avee/comp/AppPreferences/AppPreferences;->getBool(I)Z

    move-result v11

    iput-boolean v11, v10, Lcom/daaw/avee/comp/playback/AudioFrameData$Request2;->useGlobalSession:Z

    .line 1051
    iget-object v10, v0, Lcom/daaw/avee/Design/VisualizerExporterDesign;->audioFrameRequest:Lcom/daaw/avee/comp/playback/AudioFrameData$Request2;

    const-wide/16 v13, -0x1

    iput-wide v13, v10, Lcom/daaw/avee/comp/playback/AudioFrameData$Request2;->overridePositionUs:J

    .line 1052
    iget-object v10, v0, Lcom/daaw/avee/Design/VisualizerExporterDesign;->audioFrameRequest:Lcom/daaw/avee/comp/playback/AudioFrameData$Request2;

    sget v11, Lcom/daaw/avee/comp/AppPreferences/AppPreferences;->PREF_Int_audioVisOffset:I

    invoke-virtual {v1, v11}, Lcom/daaw/avee/comp/AppPreferences/AppPreferences;->getInt(I)I

    move-result v1

    iput v1, v10, Lcom/daaw/avee/comp/playback/AudioFrameData$Request2;->audioOffsetMs:I

    mul-long v4, v4, v15

    .line 1054
    iget-wide v10, v0, Lcom/daaw/avee/Design/VisualizerExporterDesign;->targetFrameTimeUs:J

    div-long v10, v4, v10

    long-to-int v1, v10

    iput v1, v0, Lcom/daaw/avee/Design/VisualizerExporterDesign;->startFrameToCapture:I

    mul-long v8, v8, v15

    .line 1055
    iget-wide v10, v0, Lcom/daaw/avee/Design/VisualizerExporterDesign;->targetFrameTimeUs:J

    div-long/2addr v8, v10

    long-to-int v1, v8

    iput v1, v0, Lcom/daaw/avee/Design/VisualizerExporterDesign;->endFrameToCapture:I

    .line 1056
    iget v1, v0, Lcom/daaw/avee/Design/VisualizerExporterDesign;->startFrameToCapture:I

    add-int/2addr v1, v3

    iget v8, v0, Lcom/daaw/avee/Design/VisualizerExporterDesign;->endFrameToCapture:I

    invoke-static {v1, v8}, Ljava/lang/Math;->max(II)I

    move-result v1

    iput v1, v0, Lcom/daaw/avee/Design/VisualizerExporterDesign;->endFrameToCapture:I

    .line 1057
    iget v1, v0, Lcom/daaw/avee/Design/VisualizerExporterDesign;->endFrameToCapture:I

    iget v8, v0, Lcom/daaw/avee/Design/VisualizerExporterDesign;->startFrameToCapture:I

    sub-int/2addr v1, v8

    int-to-long v8, v1

    iget-wide v10, v0, Lcom/daaw/avee/Design/VisualizerExporterDesign;->targetFrameTimeUs:J

    mul-long v8, v8, v10

    sput-wide v8, Lcom/daaw/avee/Design/VisualizerExporterDesign;->outputTrackDurationUs:J

    .line 1059
    iget v1, v0, Lcom/daaw/avee/Design/VisualizerExporterDesign;->startFrameToCapture:I

    add-int/lit8 v1, v1, -0x3c

    invoke-direct {v0, v1}, Lcom/daaw/avee/Design/VisualizerExporterDesign;->setFrameCounter(I)V

    .line 1060
    iput v12, v0, Lcom/daaw/avee/Design/VisualizerExporterDesign;->loadingResourcesFrameCounter:I

    .line 1062
    iput v12, v0, Lcom/daaw/avee/Design/VisualizerExporterDesign;->overrideAudioFrameSamplesInCount:I

    move-object/from16 v1, p3

    .line 1072
    iput-object v1, v0, Lcom/daaw/avee/Design/VisualizerExporterDesign;->exportFile:Ljava/io/File;

    move-object/from16 v1, p4

    .line 1073
    iput-object v1, v0, Lcom/daaw/avee/Design/VisualizerExporterDesign;->exportOStream:Ljava/io/OutputStream;

    .line 1077
    iget-object v1, v0, Lcom/daaw/avee/Design/VisualizerExporterDesign;->exportFile:Ljava/io/File;

    if-nez v1, :cond_3

    iget-object v1, v0, Lcom/daaw/avee/Design/VisualizerExporterDesign;->exportOStream:Ljava/io/OutputStream;

    if-nez v1, :cond_3

    .line 1078
    invoke-virtual/range {p1 .. p1}, Lcom/daaw/avee/ContextData;->getContext()Landroid/content/Context;

    move-result-object v1

    invoke-virtual {v1}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v1

    const v8, 0x7f1001b4

    invoke-virtual {v1, v8}, Landroid/content/res/Resources;->getString(I)Ljava/lang/String;

    move-result-object v1

    .line 1079
    sget-object v8, Lcom/daaw/avee/EventsGlobal/EventsGlobalTextNotifier;->onTextMsg:Lcom/daaw/avee/Common/Events/WeakEvent1;

    invoke-virtual {v8, v1}, Lcom/daaw/avee/Common/Events/WeakEvent1;->invoke(Ljava/lang/Object;)V

    .line 1093
    :cond_3
    iget-object v1, v0, Lcom/daaw/avee/Design/VisualizerExporterDesign;->exportFile:Ljava/io/File;

    if-nez v1, :cond_4

    iget-object v1, v0, Lcom/daaw/avee/Design/VisualizerExporterDesign;->exportOStream:Ljava/io/OutputStream;

    if-nez v1, :cond_4

    .line 1094
    new-instance v1, Lcom/daaw/avee/comp/VisualizerExporter/VisExportDialog$ExportingProgressStatus;

    invoke-direct {v1}, Lcom/daaw/avee/comp/VisualizerExporter/VisExportDialog$ExportingProgressStatus;-><init>()V

    .line 1095
    iput-boolean v12, v1, Lcom/daaw/avee/comp/VisualizerExporter/VisExportDialog$ExportingProgressStatus;->active:Z

    .line 1096
    invoke-static {v1}, Lcom/daaw/avee/comp/VisualizerExporter/VisExportDialog;->updateExportingProgressStatus(Lcom/daaw/avee/comp/VisualizerExporter/VisExportDialog$ExportingProgressStatus;)V

    return-void

    .line 1101
    :cond_4
    new-instance v1, Lcom/daaw/avee/comp/VisualizerExporter/VisExportDialog$ExportingProgressStatus;

    invoke-direct {v1}, Lcom/daaw/avee/comp/VisualizerExporter/VisExportDialog$ExportingProgressStatus;-><init>()V

    .line 1102
    iput-boolean v3, v1, Lcom/daaw/avee/comp/VisualizerExporter/VisExportDialog$ExportingProgressStatus;->active:Z

    .line 1103
    iput v12, v1, Lcom/daaw/avee/comp/VisualizerExporter/VisExportDialog$ExportingProgressStatus;->progressValue:I

    const/16 v8, 0x64

    .line 1104
    iput v8, v1, Lcom/daaw/avee/comp/VisualizerExporter/VisExportDialog$ExportingProgressStatus;->progressMax:I

    .line 1105
    invoke-static {v1}, Lcom/daaw/avee/comp/VisualizerExporter/VisExportDialog;->updateExportingProgressStatus(Lcom/daaw/avee/comp/VisualizerExporter/VisExportDialog$ExportingProgressStatus;)V

    .line 1112
    sget-object v1, Lcom/daaw/avee/comp/playback/EventsPlaybackService$Receive;->onAction:Lcom/daaw/avee/Common/Events/WeakDelegate1;

    invoke-static {v3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v8

    invoke-virtual {v1, v8}, Lcom/daaw/avee/Common/Events/WeakDelegate1;->invoke(Ljava/lang/Object;)V

    .line 1113
    sget-object v1, Lcom/daaw/avee/comp/playback/EventsPlaybackService$Receive;->onSeekChanged:Lcom/daaw/avee/Common/Events/WeakDelegate1;

    invoke-static {v6, v7}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v6

    invoke-virtual {v1, v6}, Lcom/daaw/avee/Common/Events/WeakDelegate1;->invoke(Ljava/lang/Object;)V

    .line 1114
    invoke-direct {v0, v4, v5, v3}, Lcom/daaw/avee/Design/VisualizerExporterDesign;->readjustSeek(JZ)J

    .line 1115
    invoke-static {}, Lcom/daaw/avee/comp/AppPreferences/AppPreferences;->createOrGetInstance()Lcom/daaw/avee/comp/AppPreferences/AppPreferences;

    move-result-object v1

    sget v4, Lcom/daaw/avee/comp/AppPreferences/AppPreferences;->PREF_Int_playbackEngine:I

    invoke-virtual {v1, v4, v3}, Lcom/daaw/avee/comp/AppPreferences/AppPreferences;->setInt(II)V

    .line 1117
    sput-boolean v3, Lcom/daaw/avee/Design/VisualizerExporterDesign;->exporting:Z

    .line 1118
    sget-object v1, Lcom/daaw/avee/Design/VisualizerExporterDesign;->onExportingChanged:Lcom/daaw/avee/Common/Events/WeakEvent3;

    sget-boolean v3, Lcom/daaw/avee/Design/VisualizerExporterDesign;->exporting:Z

    invoke-static {v3}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v3

    invoke-static/range {p9 .. p10}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v4

    invoke-static {v2}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v2

    invoke-virtual {v1, v3, v4, v2}, Lcom/daaw/avee/Common/Events/WeakEvent3;->invoke(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)V

    .line 1121
    invoke-virtual/range {p0 .. p0}, Lcom/daaw/avee/Design/VisualizerExporterDesign;->resetVisualizer()V

    return-void
.end method

.method startExportCreateFile(Landroid/app/Fragment;Lcom/daaw/avee/ContextData;Lcom/daaw/avee/comp/VisualizerExporter/VisExportDialog$ExportSettings;JJJ)V
    .locals 12

    move-object v11, p0

    move-object v2, p3

    .line 949
    iget-object v0, v2, Lcom/daaw/avee/comp/VisualizerExporter/VisExportDialog$ExportSettings;->destinationDir:Ljava/lang/String;

    const/4 v1, 0x1

    if-eqz v0, :cond_0

    iget-object v0, v2, Lcom/daaw/avee/comp/VisualizerExporter/VisExportDialog$ExportSettings;->destinationDir:Ljava/lang/String;

    invoke-virtual {v0}, Ljava/lang/String;->length()I

    move-result v0

    if-ge v0, v1, :cond_1

    :cond_0
    const-string v0, "/"

    .line 950
    iput-object v0, v2, Lcom/daaw/avee/comp/VisualizerExporter/VisExportDialog$ExportSettings;->destinationDir:Ljava/lang/String;

    .line 951
    :cond_1
    iget-object v0, v2, Lcom/daaw/avee/comp/VisualizerExporter/VisExportDialog$ExportSettings;->filename:Ljava/lang/String;

    if-eqz v0, :cond_2

    iget-object v0, v2, Lcom/daaw/avee/comp/VisualizerExporter/VisExportDialog$ExportSettings;->filename:Ljava/lang/String;

    invoke-virtual {v0}, Ljava/lang/String;->length()I

    move-result v0

    if-ge v0, v1, :cond_3

    :cond_2
    const-string v0, "exported"

    .line 952
    iput-object v0, v2, Lcom/daaw/avee/comp/VisualizerExporter/VisExportDialog$ExportSettings;->filename:Ljava/lang/String;

    .line 953
    :cond_3
    iget-object v0, v2, Lcom/daaw/avee/comp/VisualizerExporter/VisExportDialog$ExportSettings;->filename:Ljava/lang/String;

    invoke-static {v0}, Lcom/daaw/avee/Common/UtilsFileSys;->extractFilenameWithoutExt(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    .line 968
    iput-object v2, v11, Lcom/daaw/avee/Design/VisualizerExporterDesign;->currentExportSettings:Lcom/daaw/avee/comp/VisualizerExporter/VisExportDialog$ExportSettings;

    move-wide/from16 v5, p4

    .line 969
    iput-wide v5, v11, Lcom/daaw/avee/Design/VisualizerExporterDesign;->currentStartMSec:J

    move-wide/from16 v7, p6

    .line 970
    iput-wide v7, v11, Lcom/daaw/avee/Design/VisualizerExporterDesign;->currentEndMSec:J

    move-wide/from16 v9, p8

    .line 971
    iput-wide v9, v11, Lcom/daaw/avee/Design/VisualizerExporterDesign;->currentDullTrackDurationMs:J

    .line 974
    iget-object v1, v2, Lcom/daaw/avee/comp/VisualizerExporter/VisExportDialog$ExportSettings;->destinationDir:Ljava/lang/String;

    invoke-static {}, Lcom/daaw/avee/comp/VisualizerExporter/AudioVideoCTSRecorder;->getOutputFileExtensionWithDot()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {p0, v1, v0, v3}, Lcom/daaw/avee/Design/VisualizerExporterDesign;->createFile(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/io/File;

    move-result-object v3

    .line 977
    :try_start_0
    invoke-virtual {v3}, Ljava/io/File;->createNewFile()Z
    :try_end_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_0

    :catch_0
    nop

    .line 981
    :goto_0
    invoke-virtual {v3}, Ljava/io/File;->canWrite()Z

    move-result v1

    if-eqz v1, :cond_4

    const/4 v4, 0x0

    move-object v0, p0

    move-object v1, p2

    move-object v2, p3

    move-wide/from16 v5, p4

    move-wide/from16 v7, p6

    move-wide/from16 v9, p8

    .line 982
    invoke-virtual/range {v0 .. v10}, Lcom/daaw/avee/Design/VisualizerExporterDesign;->startExport(Lcom/daaw/avee/ContextData;Lcom/daaw/avee/comp/VisualizerExporter/VisExportDialog$ExportSettings;Ljava/io/File;Ljava/io/OutputStream;JJJ)V

    goto :goto_1

    .line 986
    :cond_4
    sget v1, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 v2, 0x13

    if-ge v1, v2, :cond_5

    goto :goto_1

    .line 994
    :cond_5
    new-instance v1, Landroid/content/Intent;

    const-string v2, "android.intent.action.CREATE_DOCUMENT"

    invoke-direct {v1, v2}, Landroid/content/Intent;-><init>(Ljava/lang/String;)V

    const-string v2, "android.intent.category.OPENABLE"

    .line 995
    invoke-virtual {v1, v2}, Landroid/content/Intent;->addCategory(Ljava/lang/String;)Landroid/content/Intent;

    .line 996
    invoke-static {}, Lcom/daaw/avee/comp/VisualizerExporter/AudioVideoCTSRecorder;->getOutputFileMimeType()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Landroid/content/Intent;->setType(Ljava/lang/String;)Landroid/content/Intent;

    const-string v2, "android.intent.extra.TITLE"

    .line 998
    invoke-virtual {v1, v2, v0}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Ljava/lang/String;)Landroid/content/Intent;

    const/16 v0, 0x36

    move-object v2, p1

    .line 999
    invoke-virtual {p1, v1, v0}, Landroid/app/Fragment;->startActivityForResult(Landroid/content/Intent;I)V

    :goto_1
    return-void
.end method
