.class public Lcom/daaw/avee/comp/playback/MediaPlaybackService;
.super Lcom/AOSP/MyIntentService;
.source "MediaPlaybackService.java"

# interfaces
.implements Lcom/daaw/avee/comp/playback/MediaPlaybackServiceDefs;
.implements Landroid/media/AudioManager$OnAudioFocusChangeListener;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/daaw/avee/comp/playback/MediaPlaybackService$RunnableNextDataSource;
    }
.end annotation


# static fields
.field private static volatile instanceWeak:Ljava/lang/ref/WeakReference;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/lang/ref/WeakReference<",
            "Lcom/daaw/avee/comp/playback/MediaPlaybackService;",
            ">;"
        }
    .end annotation
.end field

.field public static onCreateEarly:Lcom/daaw/avee/Common/Events/WeakEvent1;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lcom/daaw/avee/Common/Events/WeakEvent1<",
            "Landroid/content/Context;",
            ">;"
        }
    .end annotation
.end field

.field public static onDestroyed:Lcom/daaw/avee/Common/Events/WeakEvent1;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lcom/daaw/avee/Common/Events/WeakEvent1<",
            "Landroid/content/Context;",
            ">;"
        }
    .end annotation
.end field

.field public static onDisplayMetaDataStateChanged:Lcom/daaw/avee/Common/Events/WeakEvent4;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lcom/daaw/avee/Common/Events/WeakEvent4<",
            "Lcom/daaw/avee/comp/playback/Song/PlaylistSong;",
            "Lcom/daaw/avee/comp/Common/IItemIdentifier;",
            "Lcom/daaw/avee/comp/playback/Song/PlaylistSong$Data;",
            "Lcom/daaw/avee/comp/playback/PlayingMediaInfo;",
            ">;"
        }
    .end annotation
.end field

.field public static onEqualizerDescChanged:Lcom/daaw/avee/Common/Events/WeakEvent1;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lcom/daaw/avee/Common/Events/WeakEvent1<",
            "Lcom/daaw/avee/comp/playback/BaseEqualizerEffect$EqualizerDesc;",
            ">;"
        }
    .end annotation
.end field

.field public static onExoPcmData:Lcom/daaw/avee/Common/Events/WeakEvent1;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lcom/daaw/avee/Common/Events/WeakEvent1<",
            "Lcom/daaw/avee/comp/Common/ExoPcmData;",
            ">;"
        }
    .end annotation
.end field

.field public static onExoPcmDataNewSource:Lcom/daaw/avee/Common/Events/WeakEvent;

.field public static onHeadsetAssistAction:Lcom/daaw/avee/Common/Events/WeakEvent;

.field public static onPlayStateChanged:Lcom/daaw/avee/Common/Events/WeakEvent5;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lcom/daaw/avee/Common/Events/WeakEvent5<",
            "Ljava/lang/Boolean;",
            "Ljava/lang/Boolean;",
            "Ljava/lang/Integer;",
            "Ljava/lang/String;",
            "Lcom/daaw/avee/comp/playback/Song/PlaylistSong;",
            ">;"
        }
    .end annotation
.end field

.field public static onPlaybackCompleted:Lcom/daaw/avee/Common/Events/WeakEvent5;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lcom/daaw/avee/Common/Events/WeakEvent5<",
            "Ljava/lang/Integer;",
            "Ljava/lang/Boolean;",
            "Ljava/lang/Long;",
            "Ljava/lang/Boolean;",
            "Lcom/daaw/avee/comp/playback/Song/PlaylistSong;",
            ">;"
        }
    .end annotation
.end field

.field public static onRepeatModeChanged:Lcom/daaw/avee/Common/Events/WeakEvent1;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lcom/daaw/avee/Common/Events/WeakEvent1<",
            "Ljava/lang/Integer;",
            ">;"
        }
    .end annotation
.end field

.field public static onRequestAlbumArtLarge:Lcom/daaw/avee/Common/Events/WeakEvent5;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lcom/daaw/avee/Common/Events/WeakEvent5<",
            "Landroid/content/Context;",
            "Lcom/daaw/avee/comp/AlbumArt/AlbumArtRequest;",
            "Lcom/daaw/avee/comp/AlbumArt/ImageLoadedListener;",
            "Ljava/lang/Integer;",
            "Ljava/lang/Integer;",
            ">;"
        }
    .end annotation
.end field

.field public static onRequestCrossfadeValue:Lcom/daaw/avee/Common/Events/WeakEventR;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lcom/daaw/avee/Common/Events/WeakEventR<",
            "Ljava/lang/Float;",
            ">;"
        }
    .end annotation
.end field

.field public static onRequestEqualizerIsEnabled:Lcom/daaw/avee/Common/Events/WeakEventR1;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lcom/daaw/avee/Common/Events/WeakEventR1<",
            "Ljava/lang/String;",
            "Ljava/lang/Boolean;",
            ">;"
        }
    .end annotation
.end field

.field public static onRequestEqualizerSettings:Lcom/daaw/avee/Common/Events/WeakEventR1;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lcom/daaw/avee/Common/Events/WeakEventR1<",
            "Ljava/lang/String;",
            "Lcom/daaw/avee/comp/playback/BaseEqualizerEffect$EqualizerSettings;",
            ">;"
        }
    .end annotation
.end field

.field public static onRequestSelectMediaPlayerCoreIndex:Lcom/daaw/avee/Common/Events/WeakEventR;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lcom/daaw/avee/Common/Events/WeakEventR<",
            "Ljava/lang/Integer;",
            ">;"
        }
    .end annotation
.end field

.field public static onRequestTimeoutEnabled:Lcom/daaw/avee/Common/Events/WeakEventR;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lcom/daaw/avee/Common/Events/WeakEventR<",
            "Ljava/lang/Boolean;",
            ">;"
        }
    .end annotation
.end field

.field public static onRequestVideoScalingMode:Lcom/daaw/avee/Common/Events/WeakEventR;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lcom/daaw/avee/Common/Events/WeakEventR<",
            "Ljava/lang/Integer;",
            ">;"
        }
    .end annotation
.end field

.field public static onRequestVideoSurfaceHolder:Lcom/daaw/avee/Common/Events/WeakEventR;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lcom/daaw/avee/Common/Events/WeakEventR<",
            "Landroid/view/SurfaceHolder;",
            ">;"
        }
    .end annotation
.end field

.field public static onRequestVolumeMuteState:Lcom/daaw/avee/Common/Events/WeakEventR;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lcom/daaw/avee/Common/Events/WeakEventR<",
            "Ljava/lang/Boolean;",
            ">;"
        }
    .end annotation
.end field

.field public static onRequestVolumeStereoBalance:Lcom/daaw/avee/Common/Events/WeakEventR;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lcom/daaw/avee/Common/Events/WeakEventR<",
            "Ljava/lang/Float;",
            ">;"
        }
    .end annotation
.end field

.field public static onServiceDestroying:Lcom/daaw/avee/Common/Events/WeakEvent1;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lcom/daaw/avee/Common/Events/WeakEvent1<",
            "Landroid/content/Context;",
            ">;"
        }
    .end annotation
.end field

.field public static onTrackPositionChanged:Lcom/daaw/avee/Common/Events/WeakEvent1;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lcom/daaw/avee/Common/Events/WeakEvent1<",
            "Ljava/lang/Long;",
            ">;"
        }
    .end annotation
.end field

.field public static onUINextAction:Lcom/daaw/avee/Common/Events/WeakEvent;

.field public static onUIPrevAction:Lcom/daaw/avee/Common/Events/WeakEvent;

.field public static onVideoSizeChanged:Lcom/daaw/avee/Common/Events/WeakEvent3;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lcom/daaw/avee/Common/Events/WeakEvent3<",
            "Ljava/lang/Integer;",
            "Ljava/lang/Integer;",
            "Ljava/lang/Float;",
            ">;"
        }
    .end annotation
.end field

.field public static onVolumeMaxChanged:Lcom/daaw/avee/Common/Events/WeakEvent1;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lcom/daaw/avee/Common/Events/WeakEvent1<",
            "Ljava/lang/Integer;",
            ">;"
        }
    .end annotation
.end field

.field public static onVolumeMuteChanged:Lcom/daaw/avee/Common/Events/WeakEvent1;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lcom/daaw/avee/Common/Events/WeakEvent1<",
            "Ljava/lang/Boolean;",
            ">;"
        }
    .end annotation
.end field


# instance fields
.field private audioManager:Landroid/media/AudioManager;

.field private bufferingPercent:I

.field private bufferingState:Z

.field private cardId:I

.field private fadePlayer:Lcom/daaw/avee/comp/playback/FadeMediaPlayer;

.field private haveAudioFocus:Z

.field idleTimeoutRunnable:Ljava/lang/Runnable;

.field private imageLoadedListener:Lcom/daaw/avee/comp/AlbumArt/ImageLoadedListener;

.field private lastEqualizerDesc:Lcom/daaw/avee/comp/playback/BaseEqualizerEffect$EqualizerDesc;

.field lastUpdatedMetadataSong:Lcom/daaw/avee/comp/playback/Song/PlaylistSong;

.field private lastestStartId:I

.field private lostAudioFocusWhilePlaying:Z

.field private mediaButtonEventReceiverName:Landroid/content/ComponentName;

.field private mediaEventReceiver:Lcom/daaw/avee/comp/playback/MediaEventReceiver;

.field private myRunnableNextDataSourceToken:I

.field notificationChannelId:Ljava/lang/String;

.field onNotifyListener:Lcom/daaw/avee/comp/playback/IMediaPlayerCore$OnNotifyListener;

.field private openedEntry:Lcom/daaw/avee/Common/Tuple2;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lcom/daaw/avee/Common/Tuple2<",
            "Lcom/daaw/avee/comp/playback/Song/PlaylistSong;",
            "Lcom/daaw/avee/comp/Common/IItemIdentifier;",
            ">;"
        }
    .end annotation
.end field

.field private openedSongIsPreview:Z

.field private pausedWhenAudioBecomingNoisy:Z

.field private playbackQueueRefHolder:Ljava/lang/Object;

.field private playerCoreReference:Lcom/daaw/avee/PlayerCore;

.field positionRefresh:Ljava/lang/Runnable;

.field private remoteControlClient:Landroid/media/RemoteControlClient;

.field private repeatMode:I

.field private runnableNextDataSource:Lcom/daaw/avee/comp/playback/MediaPlaybackService$RunnableNextDataSource;

.field private serviceActiveForegroundState:Z

.field private serviceValidState:Z

.field final taskDeInitialize:Ljava/lang/Runnable;

.field private final taskDeInitializeDone:[Z

.field final taskInitialize:Ljava/lang/Runnable;

.field private final taskInitializeDone:[Z

.field private timeoutEnabled:Z

.field private wantsPlay:Z


# direct methods
.method static constructor <clinit>()V
    .locals 2

    .line 71
    new-instance v0, Lcom/daaw/avee/Common/Events/WeakEvent1;

    invoke-direct {v0}, Lcom/daaw/avee/Common/Events/WeakEvent1;-><init>()V

    sput-object v0, Lcom/daaw/avee/comp/playback/MediaPlaybackService;->onCreateEarly:Lcom/daaw/avee/Common/Events/WeakEvent1;

    .line 72
    new-instance v0, Lcom/daaw/avee/Common/Events/WeakEvent1;

    invoke-direct {v0}, Lcom/daaw/avee/Common/Events/WeakEvent1;-><init>()V

    sput-object v0, Lcom/daaw/avee/comp/playback/MediaPlaybackService;->onServiceDestroying:Lcom/daaw/avee/Common/Events/WeakEvent1;

    .line 73
    new-instance v0, Lcom/daaw/avee/Common/Events/WeakEvent1;

    invoke-direct {v0}, Lcom/daaw/avee/Common/Events/WeakEvent1;-><init>()V

    sput-object v0, Lcom/daaw/avee/comp/playback/MediaPlaybackService;->onDestroyed:Lcom/daaw/avee/Common/Events/WeakEvent1;

    .line 74
    new-instance v0, Lcom/daaw/avee/Common/Events/WeakEventR;

    invoke-direct {v0}, Lcom/daaw/avee/Common/Events/WeakEventR;-><init>()V

    sput-object v0, Lcom/daaw/avee/comp/playback/MediaPlaybackService;->onRequestSelectMediaPlayerCoreIndex:Lcom/daaw/avee/Common/Events/WeakEventR;

    .line 75
    new-instance v0, Lcom/daaw/avee/Common/Events/WeakEventR;

    invoke-direct {v0}, Lcom/daaw/avee/Common/Events/WeakEventR;-><init>()V

    sput-object v0, Lcom/daaw/avee/comp/playback/MediaPlaybackService;->onRequestTimeoutEnabled:Lcom/daaw/avee/Common/Events/WeakEventR;

    .line 76
    new-instance v0, Lcom/daaw/avee/Common/Events/WeakEvent5;

    invoke-direct {v0}, Lcom/daaw/avee/Common/Events/WeakEvent5;-><init>()V

    sput-object v0, Lcom/daaw/avee/comp/playback/MediaPlaybackService;->onPlayStateChanged:Lcom/daaw/avee/Common/Events/WeakEvent5;

    .line 77
    new-instance v0, Lcom/daaw/avee/Common/Events/WeakEvent4;

    invoke-direct {v0}, Lcom/daaw/avee/Common/Events/WeakEvent4;-><init>()V

    sput-object v0, Lcom/daaw/avee/comp/playback/MediaPlaybackService;->onDisplayMetaDataStateChanged:Lcom/daaw/avee/Common/Events/WeakEvent4;

    .line 78
    new-instance v0, Lcom/daaw/avee/Common/Events/WeakEvent1;

    invoke-direct {v0}, Lcom/daaw/avee/Common/Events/WeakEvent1;-><init>()V

    sput-object v0, Lcom/daaw/avee/comp/playback/MediaPlaybackService;->onRepeatModeChanged:Lcom/daaw/avee/Common/Events/WeakEvent1;

    .line 79
    new-instance v0, Lcom/daaw/avee/Common/Events/WeakEvent1;

    invoke-direct {v0}, Lcom/daaw/avee/Common/Events/WeakEvent1;-><init>()V

    sput-object v0, Lcom/daaw/avee/comp/playback/MediaPlaybackService;->onVolumeMaxChanged:Lcom/daaw/avee/Common/Events/WeakEvent1;

    .line 80
    new-instance v0, Lcom/daaw/avee/Common/Events/WeakEvent1;

    invoke-direct {v0}, Lcom/daaw/avee/Common/Events/WeakEvent1;-><init>()V

    sput-object v0, Lcom/daaw/avee/comp/playback/MediaPlaybackService;->onVolumeMuteChanged:Lcom/daaw/avee/Common/Events/WeakEvent1;

    .line 81
    new-instance v0, Lcom/daaw/avee/Common/Events/WeakEventR;

    invoke-direct {v0}, Lcom/daaw/avee/Common/Events/WeakEventR;-><init>()V

    sput-object v0, Lcom/daaw/avee/comp/playback/MediaPlaybackService;->onRequestVolumeMuteState:Lcom/daaw/avee/Common/Events/WeakEventR;

    .line 82
    new-instance v0, Lcom/daaw/avee/Common/Events/WeakEventR;

    invoke-direct {v0}, Lcom/daaw/avee/Common/Events/WeakEventR;-><init>()V

    sput-object v0, Lcom/daaw/avee/comp/playback/MediaPlaybackService;->onRequestVolumeStereoBalance:Lcom/daaw/avee/Common/Events/WeakEventR;

    .line 83
    new-instance v0, Lcom/daaw/avee/Common/Events/WeakEventR;

    invoke-direct {v0}, Lcom/daaw/avee/Common/Events/WeakEventR;-><init>()V

    sput-object v0, Lcom/daaw/avee/comp/playback/MediaPlaybackService;->onRequestCrossfadeValue:Lcom/daaw/avee/Common/Events/WeakEventR;

    .line 84
    new-instance v0, Lcom/daaw/avee/Common/Events/WeakEvent;

    invoke-direct {v0}, Lcom/daaw/avee/Common/Events/WeakEvent;-><init>()V

    sput-object v0, Lcom/daaw/avee/comp/playback/MediaPlaybackService;->onHeadsetAssistAction:Lcom/daaw/avee/Common/Events/WeakEvent;

    .line 85
    new-instance v0, Lcom/daaw/avee/Common/Events/WeakEvent5;

    invoke-direct {v0}, Lcom/daaw/avee/Common/Events/WeakEvent5;-><init>()V

    sput-object v0, Lcom/daaw/avee/comp/playback/MediaPlaybackService;->onPlaybackCompleted:Lcom/daaw/avee/Common/Events/WeakEvent5;

    .line 86
    new-instance v0, Lcom/daaw/avee/Common/Events/WeakEvent;

    invoke-direct {v0}, Lcom/daaw/avee/Common/Events/WeakEvent;-><init>()V

    sput-object v0, Lcom/daaw/avee/comp/playback/MediaPlaybackService;->onUINextAction:Lcom/daaw/avee/Common/Events/WeakEvent;

    .line 87
    new-instance v0, Lcom/daaw/avee/Common/Events/WeakEvent;

    invoke-direct {v0}, Lcom/daaw/avee/Common/Events/WeakEvent;-><init>()V

    sput-object v0, Lcom/daaw/avee/comp/playback/MediaPlaybackService;->onUIPrevAction:Lcom/daaw/avee/Common/Events/WeakEvent;

    .line 88
    new-instance v0, Lcom/daaw/avee/Common/Events/WeakEvent1;

    invoke-direct {v0}, Lcom/daaw/avee/Common/Events/WeakEvent1;-><init>()V

    sput-object v0, Lcom/daaw/avee/comp/playback/MediaPlaybackService;->onTrackPositionChanged:Lcom/daaw/avee/Common/Events/WeakEvent1;

    .line 89
    new-instance v0, Lcom/daaw/avee/Common/Events/WeakEvent3;

    invoke-direct {v0}, Lcom/daaw/avee/Common/Events/WeakEvent3;-><init>()V

    sput-object v0, Lcom/daaw/avee/comp/playback/MediaPlaybackService;->onVideoSizeChanged:Lcom/daaw/avee/Common/Events/WeakEvent3;

    .line 90
    new-instance v0, Lcom/daaw/avee/Common/Events/WeakEventR;

    invoke-direct {v0}, Lcom/daaw/avee/Common/Events/WeakEventR;-><init>()V

    sput-object v0, Lcom/daaw/avee/comp/playback/MediaPlaybackService;->onRequestVideoSurfaceHolder:Lcom/daaw/avee/Common/Events/WeakEventR;

    .line 91
    new-instance v0, Lcom/daaw/avee/Common/Events/WeakEventR;

    invoke-direct {v0}, Lcom/daaw/avee/Common/Events/WeakEventR;-><init>()V

    sput-object v0, Lcom/daaw/avee/comp/playback/MediaPlaybackService;->onRequestVideoScalingMode:Lcom/daaw/avee/Common/Events/WeakEventR;

    .line 92
    new-instance v0, Lcom/daaw/avee/Common/Events/WeakEventR1;

    invoke-direct {v0}, Lcom/daaw/avee/Common/Events/WeakEventR1;-><init>()V

    sput-object v0, Lcom/daaw/avee/comp/playback/MediaPlaybackService;->onRequestEqualizerSettings:Lcom/daaw/avee/Common/Events/WeakEventR1;

    .line 93
    new-instance v0, Lcom/daaw/avee/Common/Events/WeakEventR1;

    invoke-direct {v0}, Lcom/daaw/avee/Common/Events/WeakEventR1;-><init>()V

    sput-object v0, Lcom/daaw/avee/comp/playback/MediaPlaybackService;->onRequestEqualizerIsEnabled:Lcom/daaw/avee/Common/Events/WeakEventR1;

    .line 94
    new-instance v0, Lcom/daaw/avee/Common/Events/WeakEvent1;

    invoke-direct {v0}, Lcom/daaw/avee/Common/Events/WeakEvent1;-><init>()V

    sput-object v0, Lcom/daaw/avee/comp/playback/MediaPlaybackService;->onEqualizerDescChanged:Lcom/daaw/avee/Common/Events/WeakEvent1;

    .line 95
    new-instance v0, Lcom/daaw/avee/Common/Events/WeakEvent5;

    invoke-direct {v0}, Lcom/daaw/avee/Common/Events/WeakEvent5;-><init>()V

    sput-object v0, Lcom/daaw/avee/comp/playback/MediaPlaybackService;->onRequestAlbumArtLarge:Lcom/daaw/avee/Common/Events/WeakEvent5;

    .line 98
    new-instance v0, Lcom/daaw/avee/Common/Events/WeakEvent;

    invoke-direct {v0}, Lcom/daaw/avee/Common/Events/WeakEvent;-><init>()V

    sput-object v0, Lcom/daaw/avee/comp/playback/MediaPlaybackService;->onExoPcmDataNewSource:Lcom/daaw/avee/Common/Events/WeakEvent;

    .line 99
    new-instance v0, Lcom/daaw/avee/Common/Events/WeakEvent1;

    invoke-direct {v0}, Lcom/daaw/avee/Common/Events/WeakEvent1;-><init>()V

    sput-object v0, Lcom/daaw/avee/comp/playback/MediaPlaybackService;->onExoPcmData:Lcom/daaw/avee/Common/Events/WeakEvent1;

    .line 101
    new-instance v0, Ljava/lang/ref/WeakReference;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Ljava/lang/ref/WeakReference;-><init>(Ljava/lang/Object;)V

    sput-object v0, Lcom/daaw/avee/comp/playback/MediaPlaybackService;->instanceWeak:Ljava/lang/ref/WeakReference;

    return-void
.end method

.method public constructor <init>()V
    .locals 11

    const-string v0, "MediaPlaybackService"

    .line 251
    invoke-direct {p0, v0}, Lcom/AOSP/MyIntentService;-><init>(Ljava/lang/String;)V

    const/4 v0, 0x1

    new-array v1, v0, [Z

    .line 102
    iput-object v1, p0, Lcom/daaw/avee/comp/playback/MediaPlaybackService;->taskInitializeDone:[Z

    new-array v1, v0, [Z

    .line 103
    iput-object v1, p0, Lcom/daaw/avee/comp/playback/MediaPlaybackService;->taskDeInitializeDone:[Z

    const/4 v1, 0x0

    .line 104
    iput-boolean v1, p0, Lcom/daaw/avee/comp/playback/MediaPlaybackService;->serviceValidState:Z

    const/4 v2, -0x1

    .line 105
    iput v2, p0, Lcom/daaw/avee/comp/playback/MediaPlaybackService;->lastestStartId:I

    .line 111
    iput-boolean v1, p0, Lcom/daaw/avee/comp/playback/MediaPlaybackService;->openedSongIsPreview:Z

    const/4 v3, 0x0

    .line 112
    iput-object v3, p0, Lcom/daaw/avee/comp/playback/MediaPlaybackService;->openedEntry:Lcom/daaw/avee/Common/Tuple2;

    .line 113
    iput-boolean v1, p0, Lcom/daaw/avee/comp/playback/MediaPlaybackService;->haveAudioFocus:Z

    .line 114
    iput-boolean v1, p0, Lcom/daaw/avee/comp/playback/MediaPlaybackService;->lostAudioFocusWhilePlaying:Z

    .line 115
    iput-boolean v1, p0, Lcom/daaw/avee/comp/playback/MediaPlaybackService;->pausedWhenAudioBecomingNoisy:Z

    .line 116
    iput-boolean v1, p0, Lcom/daaw/avee/comp/playback/MediaPlaybackService;->bufferingState:Z

    .line 117
    iput v2, p0, Lcom/daaw/avee/comp/playback/MediaPlaybackService;->bufferingPercent:I

    .line 118
    iput-boolean v1, p0, Lcom/daaw/avee/comp/playback/MediaPlaybackService;->wantsPlay:Z

    .line 119
    new-instance v10, Lcom/daaw/avee/comp/playback/MediaPlaybackService$RunnableNextDataSource;

    const-wide/16 v6, 0x0

    const/4 v8, 0x0

    const/4 v9, 0x0

    move-object v4, v10

    move-object v5, p0

    invoke-direct/range {v4 .. v9}, Lcom/daaw/avee/comp/playback/MediaPlaybackService$RunnableNextDataSource;-><init>(Lcom/daaw/avee/comp/playback/MediaPlaybackService;JZLcom/daaw/avee/comp/playback/Song/PlaylistSong;)V

    iput-object v10, p0, Lcom/daaw/avee/comp/playback/MediaPlaybackService;->runnableNextDataSource:Lcom/daaw/avee/comp/playback/MediaPlaybackService$RunnableNextDataSource;

    const/4 v4, 0x4

    .line 120
    iput v4, p0, Lcom/daaw/avee/comp/playback/MediaPlaybackService;->myRunnableNextDataSourceToken:I

    .line 121
    iput-boolean v1, p0, Lcom/daaw/avee/comp/playback/MediaPlaybackService;->serviceActiveForegroundState:Z

    .line 122
    iput-boolean v0, p0, Lcom/daaw/avee/comp/playback/MediaPlaybackService;->timeoutEnabled:Z

    .line 124
    iput v2, p0, Lcom/daaw/avee/comp/playback/MediaPlaybackService;->repeatMode:I

    .line 125
    iput v1, p0, Lcom/daaw/avee/comp/playback/MediaPlaybackService;->cardId:I

    .line 127
    iput-object v3, p0, Lcom/daaw/avee/comp/playback/MediaPlaybackService;->lastEqualizerDesc:Lcom/daaw/avee/comp/playback/BaseEqualizerEffect$EqualizerDesc;

    .line 129
    iput-object v3, p0, Lcom/daaw/avee/comp/playback/MediaPlaybackService;->playerCoreReference:Lcom/daaw/avee/PlayerCore;

    .line 132
    iput-object v3, p0, Lcom/daaw/avee/comp/playback/MediaPlaybackService;->notificationChannelId:Ljava/lang/String;

    .line 134
    new-instance v0, Lcom/daaw/avee/comp/playback/MediaPlaybackService$1;

    invoke-direct {v0, p0}, Lcom/daaw/avee/comp/playback/MediaPlaybackService$1;-><init>(Lcom/daaw/avee/comp/playback/MediaPlaybackService;)V

    iput-object v0, p0, Lcom/daaw/avee/comp/playback/MediaPlaybackService;->idleTimeoutRunnable:Ljava/lang/Runnable;

    .line 140
    new-instance v0, Lcom/daaw/avee/comp/playback/MediaPlaybackService$2;

    invoke-direct {v0, p0}, Lcom/daaw/avee/comp/playback/MediaPlaybackService$2;-><init>(Lcom/daaw/avee/comp/playback/MediaPlaybackService;)V

    iput-object v0, p0, Lcom/daaw/avee/comp/playback/MediaPlaybackService;->positionRefresh:Ljava/lang/Runnable;

    .line 149
    new-instance v0, Lcom/daaw/avee/comp/playback/MediaPlaybackService$3;

    invoke-direct {v0, p0}, Lcom/daaw/avee/comp/playback/MediaPlaybackService$3;-><init>(Lcom/daaw/avee/comp/playback/MediaPlaybackService;)V

    iput-object v0, p0, Lcom/daaw/avee/comp/playback/MediaPlaybackService;->onNotifyListener:Lcom/daaw/avee/comp/playback/IMediaPlayerCore$OnNotifyListener;

    .line 228
    new-instance v0, Lcom/daaw/avee/comp/playback/MediaPlaybackService$4;

    invoke-direct {v0, p0}, Lcom/daaw/avee/comp/playback/MediaPlaybackService$4;-><init>(Lcom/daaw/avee/comp/playback/MediaPlaybackService;)V

    iput-object v0, p0, Lcom/daaw/avee/comp/playback/MediaPlaybackService;->taskInitialize:Ljava/lang/Runnable;

    .line 239
    new-instance v0, Lcom/daaw/avee/comp/playback/MediaPlaybackService$5;

    invoke-direct {v0, p0}, Lcom/daaw/avee/comp/playback/MediaPlaybackService$5;-><init>(Lcom/daaw/avee/comp/playback/MediaPlaybackService;)V

    iput-object v0, p0, Lcom/daaw/avee/comp/playback/MediaPlaybackService;->taskDeInitialize:Ljava/lang/Runnable;

    .line 1112
    iput-object v3, p0, Lcom/daaw/avee/comp/playback/MediaPlaybackService;->lastUpdatedMetadataSong:Lcom/daaw/avee/comp/playback/Song/PlaylistSong;

    .line 252
    invoke-virtual {p0, v1}, Lcom/daaw/avee/comp/playback/MediaPlaybackService;->setIntentRedelivery(Z)V

    .line 254
    new-instance v0, Lcom/daaw/avee/comp/playback/FadeMediaPlayer;

    sget-object v1, Lcom/daaw/avee/comp/playback/IMediaPlayerCore;->Empty:Lcom/daaw/avee/comp/playback/IMediaPlayerCore;

    iget-object v2, p0, Lcom/daaw/avee/comp/playback/MediaPlaybackService;->onNotifyListener:Lcom/daaw/avee/comp/playback/IMediaPlayerCore$OnNotifyListener;

    const-wide/16 v3, 0x0

    invoke-direct {v0, v1, v2, v3, v4}, Lcom/daaw/avee/comp/playback/FadeMediaPlayer;-><init>(Lcom/daaw/avee/comp/playback/IMediaPlayerCore;Lcom/daaw/avee/comp/playback/IMediaPlayerCore$OnNotifyListener;J)V

    iput-object v0, p0, Lcom/daaw/avee/comp/playback/MediaPlaybackService;->fadePlayer:Lcom/daaw/avee/comp/playback/FadeMediaPlayer;

    return-void
.end method

.method static synthetic access$000(Lcom/daaw/avee/comp/playback/MediaPlaybackService;)V
    .locals 0

    .line 59
    invoke-direct {p0}, Lcom/daaw/avee/comp/playback/MediaPlaybackService;->stopService()V

    return-void
.end method

.method static synthetic access$100(Lcom/daaw/avee/comp/playback/MediaPlaybackService;J)V
    .locals 0

    .line 59
    invoke-direct {p0, p1, p2}, Lcom/daaw/avee/comp/playback/MediaPlaybackService;->queuePositionRefresh(J)V

    return-void
.end method

.method static synthetic access$1000(Lcom/daaw/avee/comp/playback/MediaPlaybackService;Landroid/graphics/Bitmap;)V
    .locals 0

    .line 59
    invoke-direct {p0, p1}, Lcom/daaw/avee/comp/playback/MediaPlaybackService;->setMetadataArtworkTh(Landroid/graphics/Bitmap;)V

    return-void
.end method

.method static synthetic access$1100(Lcom/daaw/avee/comp/playback/MediaPlaybackService;Landroid/graphics/Bitmap;)V
    .locals 0

    .line 59
    invoke-direct {p0, p1}, Lcom/daaw/avee/comp/playback/MediaPlaybackService;->setMetadataArtwork(Landroid/graphics/Bitmap;)V

    return-void
.end method

.method static synthetic access$1200(Lcom/daaw/avee/comp/playback/MediaPlaybackService;Landroid/view/SurfaceHolder;)V
    .locals 0

    .line 59
    invoke-direct {p0, p1}, Lcom/daaw/avee/comp/playback/MediaPlaybackService;->setVideoSurfaceHolder(Landroid/view/SurfaceHolder;)V

    return-void
.end method

.method static synthetic access$1300(Lcom/daaw/avee/comp/playback/MediaPlaybackService;)V
    .locals 0

    .line 59
    invoke-direct {p0}, Lcom/daaw/avee/comp/playback/MediaPlaybackService;->resetVisualizer()V

    return-void
.end method

.method static synthetic access$1400(Lcom/daaw/avee/comp/playback/MediaPlaybackService;)Lcom/daaw/avee/comp/playback/IMediaPlayerCore;
    .locals 0

    .line 59
    invoke-direct {p0}, Lcom/daaw/avee/comp/playback/MediaPlaybackService;->getPlayer()Lcom/daaw/avee/comp/playback/IMediaPlayerCore;

    move-result-object p0

    return-object p0
.end method

.method static synthetic access$1500(Lcom/daaw/avee/comp/playback/MediaPlaybackService;Lcom/daaw/avee/comp/playback/BaseEqualizerEffect$EqualizerSettings;)V
    .locals 0

    .line 59
    invoke-direct {p0, p1}, Lcom/daaw/avee/comp/playback/MediaPlaybackService;->setEqualizerSettings(Lcom/daaw/avee/comp/playback/BaseEqualizerEffect$EqualizerSettings;)V

    return-void
.end method

.method static synthetic access$1600(Lcom/daaw/avee/comp/playback/MediaPlaybackService;)Z
    .locals 0

    .line 59
    iget-boolean p0, p0, Lcom/daaw/avee/comp/playback/MediaPlaybackService;->serviceValidState:Z

    return p0
.end method

.method static synthetic access$1700(Lcom/daaw/avee/comp/playback/MediaPlaybackService;)I
    .locals 0

    .line 59
    iget p0, p0, Lcom/daaw/avee/comp/playback/MediaPlaybackService;->repeatMode:I

    return p0
.end method

.method static synthetic access$1800(Lcom/daaw/avee/comp/playback/MediaPlaybackService;)Z
    .locals 0

    .line 59
    iget-boolean p0, p0, Lcom/daaw/avee/comp/playback/MediaPlaybackService;->wantsPlay:Z

    return p0
.end method

.method static synthetic access$200(Lcom/daaw/avee/comp/playback/MediaPlaybackService;ZLjava/lang/String;)V
    .locals 0

    .line 59
    invoke-direct {p0, p1, p2}, Lcom/daaw/avee/comp/playback/MediaPlaybackService;->notifyPlaystateOrMetaChanged(ZLjava/lang/String;)V

    return-void
.end method

.method static synthetic access$300(Lcom/daaw/avee/comp/playback/MediaPlaybackService;ZI)V
    .locals 0

    .line 59
    invoke-direct {p0, p1, p2}, Lcom/daaw/avee/comp/playback/MediaPlaybackService;->notifyBufferingUpdate(ZI)V

    return-void
.end method

.method static synthetic access$402(Lcom/daaw/avee/comp/playback/MediaPlaybackService;Lcom/daaw/avee/comp/playback/BaseEqualizerEffect$EqualizerDesc;)Lcom/daaw/avee/comp/playback/BaseEqualizerEffect$EqualizerDesc;
    .locals 0

    .line 59
    iput-object p1, p0, Lcom/daaw/avee/comp/playback/MediaPlaybackService;->lastEqualizerDesc:Lcom/daaw/avee/comp/playback/BaseEqualizerEffect$EqualizerDesc;

    return-object p1
.end method

.method static synthetic access$500(Lcom/daaw/avee/comp/playback/MediaPlaybackService;)[Z
    .locals 0

    .line 59
    iget-object p0, p0, Lcom/daaw/avee/comp/playback/MediaPlaybackService;->taskInitializeDone:[Z

    return-object p0
.end method

.method static synthetic access$600(Lcom/daaw/avee/comp/playback/MediaPlaybackService;)[Z
    .locals 0

    .line 59
    iget-object p0, p0, Lcom/daaw/avee/comp/playback/MediaPlaybackService;->taskDeInitializeDone:[Z

    return-object p0
.end method

.method static synthetic access$700(Lcom/daaw/avee/comp/playback/MediaPlaybackService;Z)V
    .locals 0

    .line 59
    invoke-direct {p0, p1}, Lcom/daaw/avee/comp/playback/MediaPlaybackService;->setTimeoutEnable(Z)V

    return-void
.end method

.method static synthetic access$800(Lcom/daaw/avee/comp/playback/MediaPlaybackService;I)V
    .locals 0

    .line 59
    invoke-direct {p0, p1}, Lcom/daaw/avee/comp/playback/MediaPlaybackService;->selectMediaPlayerCoreIndex(I)V

    return-void
.end method

.method static synthetic access$900(Lcom/daaw/avee/comp/playback/MediaPlaybackService;)V
    .locals 0

    .line 59
    invoke-direct {p0}, Lcom/daaw/avee/comp/playback/MediaPlaybackService;->savePreferences()V

    return-void
.end method

.method static getCardId(Landroid/content/Context;)I
    .locals 6

    .line 1390
    invoke-virtual {p0}, Landroid/content/Context;->getContentResolver()Landroid/content/ContentResolver;

    move-result-object v0

    const-string p0, "content://media/external/fs_id"

    .line 1391
    invoke-static {p0}, Landroid/net/Uri;->parse(Ljava/lang/String;)Landroid/net/Uri;

    move-result-object v1

    const/4 v2, 0x0

    const/4 v3, 0x0

    const/4 v4, 0x0

    const/4 v5, 0x0

    invoke-static/range {v0 .. v5}, Lcom/daaw/avee/Common/MediaStoreUtils;->querySafe(Landroid/content/ContentResolver;Landroid/net/Uri;[Ljava/lang/String;Ljava/lang/String;[Ljava/lang/String;Ljava/lang/String;)Landroid/database/Cursor;

    move-result-object p0

    if-eqz p0, :cond_0

    .line 1394
    invoke-interface {p0}, Landroid/database/Cursor;->moveToFirst()Z

    const/4 v0, 0x0

    .line 1395
    invoke-interface {p0, v0}, Landroid/database/Cursor;->getInt(I)I

    move-result v0

    .line 1396
    invoke-interface {p0}, Landroid/database/Cursor;->close()V

    goto :goto_0

    :cond_0
    const/4 v0, -0x1

    :goto_0
    return v0
.end method

.method public static getInstance()Lcom/daaw/avee/comp/playback/MediaPlaybackService;
    .locals 1

    .line 258
    sget-object v0, Lcom/daaw/avee/comp/playback/MediaPlaybackService;->instanceWeak:Ljava/lang/ref/WeakReference;

    invoke-virtual {v0}, Ljava/lang/ref/WeakReference;->get()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/daaw/avee/comp/playback/MediaPlaybackService;

    return-object v0
.end method

.method private getPlayer()Lcom/daaw/avee/comp/playback/IMediaPlayerCore;
    .locals 1

    .line 937
    iget-object v0, p0, Lcom/daaw/avee/comp/playback/MediaPlaybackService;->fadePlayer:Lcom/daaw/avee/comp/playback/FadeMediaPlayer;

    invoke-virtual {v0}, Lcom/daaw/avee/comp/playback/FadeMediaPlayer;->getMediaPlayerCore()Lcom/daaw/avee/comp/playback/IMediaPlayerCore;

    move-result-object v0

    return-object v0
.end method

.method private notifyBufferingUpdate(ZI)V
    .locals 6

    .line 1263
    iput-boolean p1, p0, Lcom/daaw/avee/comp/playback/MediaPlaybackService;->bufferingState:Z

    .line 1264
    iput p2, p0, Lcom/daaw/avee/comp/playback/MediaPlaybackService;->bufferingPercent:I

    if-nez p1, :cond_0

    const/16 p1, 0x65

    .line 1265
    iput p1, p0, Lcom/daaw/avee/comp/playback/MediaPlaybackService;->bufferingPercent:I

    .line 1266
    :cond_0
    sget-object v0, Lcom/daaw/avee/comp/playback/MediaPlaybackService;->onPlayStateChanged:Lcom/daaw/avee/Common/Events/WeakEvent5;

    invoke-virtual {p0}, Lcom/daaw/avee/comp/playback/MediaPlaybackService;->isPlaying()Z

    move-result p1

    invoke-static {p1}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v1

    invoke-virtual {p0}, Lcom/daaw/avee/comp/playback/MediaPlaybackService;->wantsPlaying()Z

    move-result p1

    invoke-static {p1}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v2

    iget p1, p0, Lcom/daaw/avee/comp/playback/MediaPlaybackService;->bufferingPercent:I

    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v3

    const/4 v4, 0x0

    const/4 v5, 0x0

    invoke-virtual/range {v0 .. v5}, Lcom/daaw/avee/Common/Events/WeakEvent5;->invoke(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)V

    return-void
.end method

.method private notifyMessage(Ljava/lang/String;)V
    .locals 1

    .line 1270
    sget-object v0, Lcom/daaw/avee/EventsGlobal/EventsGlobalTextNotifier;->onTextMsg:Lcom/daaw/avee/Common/Events/WeakEvent1;

    invoke-virtual {v0, p1}, Lcom/daaw/avee/Common/Events/WeakEvent1;->invoke(Ljava/lang/Object;)V

    return-void
.end method

.method private notifyPlaystateOrMetaChanged(ZLjava/lang/String;)V
    .locals 17

    move-object/from16 v9, p0

    .line 1114
    invoke-direct/range {p0 .. p0}, Lcom/daaw/avee/comp/playback/MediaPlaybackService;->updateServiceState()Z

    move-result v0

    .line 1116
    sget-object v1, Lcom/daaw/avee/comp/playback/Song/PlaylistSong;->EmptySong:Lcom/daaw/avee/comp/playback/Song/PlaylistSong;

    .line 1117
    invoke-virtual/range {p0 .. p0}, Lcom/daaw/avee/comp/playback/MediaPlaybackService;->getOpenedOrSupposedOrNullEntry()Lcom/daaw/avee/Common/Tuple2;

    move-result-object v10

    if-eqz v10, :cond_0

    .line 1119
    iget-object v1, v10, Lcom/daaw/avee/Common/Tuple2;->obj1:Ljava/lang/Object;

    check-cast v1, Lcom/daaw/avee/comp/playback/Song/PlaylistSong;

    :cond_0
    move-object v11, v1

    .line 1121
    iget-object v1, v9, Lcom/daaw/avee/comp/playback/MediaPlaybackService;->lastUpdatedMetadataSong:Lcom/daaw/avee/comp/playback/Song/PlaylistSong;

    const/4 v12, 0x0

    const/4 v13, 0x1

    if-eqz v1, :cond_2

    invoke-virtual {v1, v11}, Lcom/daaw/avee/comp/playback/Song/PlaylistSong;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_1

    goto :goto_0

    :cond_1
    const/4 v14, 0x0

    goto :goto_1

    :cond_2
    :goto_0
    const/4 v14, 0x1

    :goto_1
    if-eqz p1, :cond_3

    .line 1123
    iput-object v11, v9, Lcom/daaw/avee/comp/playback/MediaPlaybackService;->lastUpdatedMetadataSong:Lcom/daaw/avee/comp/playback/Song/PlaylistSong;

    :cond_3
    const/4 v15, 0x0

    if-nez v0, :cond_4

    .line 1128
    invoke-virtual/range {p0 .. p0}, Lcom/daaw/avee/comp/playback/MediaPlaybackService;->getApplicationContext()Landroid/content/Context;

    move-result-object v0

    invoke-virtual {v11, v0}, Lcom/daaw/avee/comp/playback/Song/PlaylistSong;->getDataBlocking(Landroid/content/Context;)Lcom/daaw/avee/comp/playback/Song/PlaylistSong$Data;

    move-result-object v16

    const/4 v1, 0x1

    .line 1130
    iget-object v2, v9, Lcom/daaw/avee/comp/playback/MediaPlaybackService;->notificationChannelId:Ljava/lang/String;

    .line 1135
    invoke-virtual/range {p0 .. p0}, Lcom/daaw/avee/comp/playback/MediaPlaybackService;->isPlaying()Z

    move-result v4

    .line 1136
    invoke-virtual/range {p0 .. p0}, Lcom/daaw/avee/comp/playback/MediaPlaybackService;->wantsPlaying()Z

    move-result v5

    const-class v6, Lcom/daaw/avee/comp/playback/MediaPlaybackService;

    const/4 v7, 0x0

    new-instance v8, Lcom/daaw/avee/comp/playback/-$$Lambda$MediaPlaybackService$1b87wyM-2ddSfa5U5UEUDJmNQPM;

    invoke-direct {v8, v9}, Lcom/daaw/avee/comp/playback/-$$Lambda$MediaPlaybackService$1b87wyM-2ddSfa5U5UEUDJmNQPM;-><init>(Lcom/daaw/avee/comp/playback/MediaPlaybackService;)V

    move-object/from16 v0, p0

    move-object/from16 v3, v16

    .line 1130
    invoke-static/range {v0 .. v8}, Lcom/daaw/avee/comp/playback/view/MediaPlaybackNotification;->updateNotification(Landroid/content/Context;ILjava/lang/String;Lcom/daaw/avee/comp/playback/Song/PlaylistSong$Data;ZZLjava/lang/Class;ILcom/daaw/avee/Common/Func/Func;)V

    goto :goto_2

    :cond_4
    move-object/from16 v16, v15

    :goto_2
    if-nez v16, :cond_5

    .line 1144
    invoke-virtual/range {p0 .. p0}, Lcom/daaw/avee/comp/playback/MediaPlaybackService;->getApplicationContext()Landroid/content/Context;

    move-result-object v0

    invoke-virtual {v11, v0}, Lcom/daaw/avee/comp/playback/Song/PlaylistSong;->getDataBlocking(Landroid/content/Context;)Lcom/daaw/avee/comp/playback/Song/PlaylistSong$Data;

    move-result-object v16

    .line 1146
    :cond_5
    invoke-static {}, Lcom/daaw/avee/comp/playback/view/MediaAppWidgetProvider;->getInstance()Lcom/daaw/avee/comp/playback/view/MediaAppWidgetProvider;

    move-result-object v0

    .line 1148
    invoke-virtual/range {p0 .. p0}, Lcom/daaw/avee/comp/playback/MediaPlaybackService;->isPlaying()Z

    move-result v3

    .line 1149
    invoke-virtual/range {p0 .. p0}, Lcom/daaw/avee/comp/playback/MediaPlaybackService;->wantsPlaying()Z

    move-result v4

    const-class v5, Lcom/daaw/avee/comp/playback/MediaPlaybackService;

    move-object/from16 v1, p0

    move-object/from16 v2, v16

    .line 1146
    invoke-virtual/range {v0 .. v5}, Lcom/daaw/avee/comp/playback/view/MediaAppWidgetProvider;->notifyChange(Landroid/content/Context;Lcom/daaw/avee/comp/playback/Song/PlaylistSong$Data;ZZLjava/lang/Class;)V

    if-nez v16, :cond_6

    .line 1155
    invoke-virtual/range {p0 .. p0}, Lcom/daaw/avee/comp/playback/MediaPlaybackService;->getApplicationContext()Landroid/content/Context;

    move-result-object v0

    invoke-virtual {v11, v0}, Lcom/daaw/avee/comp/playback/Song/PlaylistSong;->getDataBlocking(Landroid/content/Context;)Lcom/daaw/avee/comp/playback/Song/PlaylistSong$Data;

    move-result-object v16

    :cond_6
    move-object/from16 v0, v16

    .line 1157
    sget-object v1, Lcom/daaw/avee/comp/playback/Song/PlaylistSong;->emptyData:Lcom/daaw/avee/comp/playback/Song/PlaylistSong$Data;

    if-eq v0, v1, :cond_7

    .line 1159
    new-instance v1, Landroid/content/Intent;

    const-string v2, "com.android.music.metachanged"

    invoke-direct {v1, v2}, Landroid/content/Intent;-><init>(Ljava/lang/String;)V

    .line 1160
    invoke-virtual/range {p0 .. p0}, Lcom/daaw/avee/comp/playback/MediaPlaybackService;->isPlaying()Z

    move-result v2

    const-string v3, "playing"

    invoke-virtual {v1, v3, v2}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Z)Landroid/content/Intent;

    .line 1161
    iget-object v2, v0, Lcom/daaw/avee/comp/playback/Song/PlaylistSong$Data;->trackName:Ljava/lang/String;

    const-string v3, "track"

    invoke-virtual {v1, v3, v2}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Ljava/lang/String;)Landroid/content/Intent;

    .line 1162
    iget-object v2, v0, Lcom/daaw/avee/comp/playback/Song/PlaylistSong$Data;->albumName:Ljava/lang/String;

    const-string v3, "album"

    invoke-virtual {v1, v3, v2}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Ljava/lang/String;)Landroid/content/Intent;

    .line 1163
    iget-object v2, v0, Lcom/daaw/avee/comp/playback/Song/PlaylistSong$Data;->artistName:Ljava/lang/String;

    const-string v3, "artist"

    invoke-virtual {v1, v3, v2}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Ljava/lang/String;)Landroid/content/Intent;

    .line 1164
    iget-wide v2, v0, Lcom/daaw/avee/comp/playback/Song/PlaylistSong$Data;->audioId:J

    const-string v4, "songid"

    invoke-virtual {v1, v4, v2, v3}, Landroid/content/Intent;->putExtra(Ljava/lang/String;J)Landroid/content/Intent;

    .line 1165
    iget-wide v2, v0, Lcom/daaw/avee/comp/playback/Song/PlaylistSong$Data;->albumId:J

    const-string v4, "albumid"

    invoke-virtual {v1, v4, v2, v3}, Landroid/content/Intent;->putExtra(Ljava/lang/String;J)Landroid/content/Intent;

    .line 1167
    iget-wide v2, v0, Lcom/daaw/avee/comp/playback/Song/PlaylistSong$Data;->albumId:J

    const-string v4, "id"

    invoke-virtual {v1, v4, v2, v3}, Landroid/content/Intent;->putExtra(Ljava/lang/String;J)Landroid/content/Intent;

    .line 1169
    invoke-virtual {v9, v1}, Lcom/daaw/avee/comp/playback/MediaPlaybackService;->sendBroadcast(Landroid/content/Intent;)V

    .line 1173
    :cond_7
    iget-object v1, v9, Lcom/daaw/avee/comp/playback/MediaPlaybackService;->remoteControlClient:Landroid/media/RemoteControlClient;

    if-eqz v1, :cond_a

    .line 1175
    invoke-virtual/range {p0 .. p0}, Lcom/daaw/avee/comp/playback/MediaPlaybackService;->isPlaying()Z

    move-result v2

    const/4 v3, 0x2

    if-eqz v2, :cond_8

    const/4 v2, 0x3

    goto :goto_3

    :cond_8
    const/4 v2, 0x2

    :goto_3
    invoke-virtual {v1, v2}, Landroid/media/RemoteControlClient;->setPlaybackState(I)V

    if-eqz p1, :cond_a

    if-eqz v14, :cond_a

    if-nez v0, :cond_9

    .line 1180
    invoke-virtual/range {p0 .. p0}, Lcom/daaw/avee/comp/playback/MediaPlaybackService;->getApplicationContext()Landroid/content/Context;

    move-result-object v0

    invoke-virtual {v11, v0}, Lcom/daaw/avee/comp/playback/Song/PlaylistSong;->getDataBlocking(Landroid/content/Context;)Lcom/daaw/avee/comp/playback/Song/PlaylistSong$Data;

    move-result-object v0

    :cond_9
    move-object v6, v0

    .line 1182
    iget-object v0, v9, Lcom/daaw/avee/comp/playback/MediaPlaybackService;->remoteControlClient:Landroid/media/RemoteControlClient;

    invoke-virtual {v0, v12}, Landroid/media/RemoteControlClient;->editMetadata(Z)Landroid/media/RemoteControlClient$MetadataEditor;

    move-result-object v0

    const/4 v1, 0x7

    .line 1183
    iget-object v2, v6, Lcom/daaw/avee/comp/playback/Song/PlaylistSong$Data;->trackName:Ljava/lang/String;

    invoke-virtual {v0, v1, v2}, Landroid/media/RemoteControlClient$MetadataEditor;->putString(ILjava/lang/String;)Landroid/media/RemoteControlClient$MetadataEditor;

    .line 1184
    iget-object v1, v6, Lcom/daaw/avee/comp/playback/Song/PlaylistSong$Data;->albumName:Ljava/lang/String;

    invoke-virtual {v0, v13, v1}, Landroid/media/RemoteControlClient$MetadataEditor;->putString(ILjava/lang/String;)Landroid/media/RemoteControlClient$MetadataEditor;

    .line 1185
    iget-object v1, v6, Lcom/daaw/avee/comp/playback/Song/PlaylistSong$Data;->artistName:Ljava/lang/String;

    invoke-virtual {v0, v3, v1}, Landroid/media/RemoteControlClient$MetadataEditor;->putString(ILjava/lang/String;)Landroid/media/RemoteControlClient$MetadataEditor;

    const/16 v1, 0x9

    .line 1186
    invoke-virtual/range {p0 .. p0}, Lcom/daaw/avee/comp/playback/MediaPlaybackService;->duration()J

    move-result-wide v2

    invoke-virtual {v0, v1, v2, v3}, Landroid/media/RemoteControlClient$MetadataEditor;->putLong(IJ)Landroid/media/RemoteControlClient$MetadataEditor;

    .line 1187
    invoke-virtual {v0}, Landroid/media/RemoteControlClient$MetadataEditor;->apply()V

    .line 1191
    new-instance v0, Lcom/daaw/avee/comp/playback/MediaPlaybackService$11;

    invoke-direct {v0, v9}, Lcom/daaw/avee/comp/playback/MediaPlaybackService$11;-><init>(Lcom/daaw/avee/comp/playback/MediaPlaybackService;)V

    iput-object v0, v9, Lcom/daaw/avee/comp/playback/MediaPlaybackService;->imageLoadedListener:Lcom/daaw/avee/comp/AlbumArt/ImageLoadedListener;

    .line 1214
    sget-object v0, Lcom/daaw/avee/comp/playback/MediaPlaybackService;->onRequestAlbumArtLarge:Lcom/daaw/avee/Common/Events/WeakEvent5;

    new-instance v2, Lcom/daaw/avee/comp/AlbumArt/AlbumArtRequest;

    iget-object v1, v6, Lcom/daaw/avee/comp/playback/Song/PlaylistSong$Data;->dataSource:Landroid/net/Uri;

    .line 1217
    invoke-virtual {v6}, Lcom/daaw/avee/comp/playback/Song/PlaylistSong$Data;->getAlbumArtPath0Str()Ljava/lang/String;

    move-result-object v3

    .line 1218
    invoke-virtual {v6}, Lcom/daaw/avee/comp/playback/Song/PlaylistSong$Data;->getAlbumArtPath1Str()Ljava/lang/String;

    move-result-object v4

    .line 1219
    invoke-virtual {v6}, Lcom/daaw/avee/comp/playback/Song/PlaylistSong$Data;->getAlbumArtGenerateStr()Ljava/lang/String;

    move-result-object v5

    invoke-direct {v2, v1, v3, v4, v5}, Lcom/daaw/avee/comp/AlbumArt/AlbumArtRequest;-><init>(Landroid/net/Uri;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    iget-object v3, v9, Lcom/daaw/avee/comp/playback/MediaPlaybackService;->imageLoadedListener:Lcom/daaw/avee/comp/AlbumArt/ImageLoadedListener;

    const/16 v1, 0x2bc

    .line 1221
    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v4

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v5

    move-object/from16 v1, p0

    .line 1214
    invoke-virtual/range {v0 .. v5}, Lcom/daaw/avee/Common/Events/WeakEvent5;->invoke(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)V

    move-object v0, v6

    :cond_a
    if-eqz p1, :cond_e

    if-nez v0, :cond_b

    .line 1230
    invoke-virtual/range {p0 .. p0}, Lcom/daaw/avee/comp/playback/MediaPlaybackService;->getApplicationContext()Landroid/content/Context;

    move-result-object v0

    invoke-virtual {v11, v0}, Lcom/daaw/avee/comp/playback/Song/PlaylistSong;->getDataBlocking(Landroid/content/Context;)Lcom/daaw/avee/comp/playback/Song/PlaylistSong$Data;

    move-result-object v0

    :cond_b
    if-nez v10, :cond_c

    goto :goto_4

    .line 1232
    :cond_c
    iget-object v1, v10, Lcom/daaw/avee/Common/Tuple2;->obj2:Ljava/lang/Object;

    move-object v15, v1

    check-cast v15, Lcom/daaw/avee/comp/Common/IItemIdentifier;

    .line 1233
    :goto_4
    invoke-direct/range {p0 .. p0}, Lcom/daaw/avee/comp/playback/MediaPlaybackService;->getPlayer()Lcom/daaw/avee/comp/playback/IMediaPlayerCore;

    move-result-object v1

    invoke-interface {v1}, Lcom/daaw/avee/comp/playback/IMediaPlayerCore;->getPlayingMediaInfo()Lcom/daaw/avee/comp/playback/PlayingMediaInfo;

    move-result-object v1

    if-nez v1, :cond_d

    .line 1234
    sget-object v1, Lcom/daaw/avee/comp/playback/PlayingMediaInfo;->empty:Lcom/daaw/avee/comp/playback/PlayingMediaInfo;

    .line 1235
    :cond_d
    sget-object v2, Lcom/daaw/avee/comp/playback/MediaPlaybackService;->onDisplayMetaDataStateChanged:Lcom/daaw/avee/Common/Events/WeakEvent4;

    invoke-virtual {v2, v11, v15, v0, v1}, Lcom/daaw/avee/Common/Events/WeakEvent4;->invoke(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)V

    .line 1238
    :cond_e
    invoke-virtual/range {p0 .. p0}, Lcom/daaw/avee/comp/playback/MediaPlaybackService;->isPlaying()Z

    move-result v0

    .line 1239
    invoke-virtual/range {p0 .. p0}, Lcom/daaw/avee/comp/playback/MediaPlaybackService;->wantsPlaying()Z

    move-result v1

    .line 1240
    sget-object v2, Lcom/daaw/avee/comp/playback/MediaPlaybackService;->onPlayStateChanged:Lcom/daaw/avee/Common/Events/WeakEvent5;

    invoke-static {v0}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v3

    invoke-static {v1}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v4

    iget v0, v9, Lcom/daaw/avee/comp/playback/MediaPlaybackService;->bufferingPercent:I

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v5

    move-object/from16 v6, p2

    move-object v7, v11

    invoke-virtual/range {v2 .. v7}, Lcom/daaw/avee/Common/Events/WeakEvent5;->invoke(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)V

    return-void
.end method

.method private queuePositionRefresh(J)V
    .locals 2

    .line 262
    iget-object v0, p0, Lcom/daaw/avee/comp/playback/MediaPlaybackService;->mServiceHandler:Lcom/AOSP/MyIntentService$ServiceHandler;

    iget-object v1, p0, Lcom/daaw/avee/comp/playback/MediaPlaybackService;->positionRefresh:Ljava/lang/Runnable;

    invoke-virtual {v0, v1}, Lcom/AOSP/MyIntentService$ServiceHandler;->removeCallbacks(Ljava/lang/Runnable;)V

    .line 263
    iget-boolean v0, p0, Lcom/daaw/avee/comp/playback/MediaPlaybackService;->serviceValidState:Z

    if-eqz v0, :cond_0

    .line 264
    iget-object v0, p0, Lcom/daaw/avee/comp/playback/MediaPlaybackService;->mServiceHandler:Lcom/AOSP/MyIntentService$ServiceHandler;

    iget-object v1, p0, Lcom/daaw/avee/comp/playback/MediaPlaybackService;->positionRefresh:Ljava/lang/Runnable;

    invoke-virtual {v0, v1, p1, p2}, Lcom/AOSP/MyIntentService$ServiceHandler;->postDelayed(Ljava/lang/Runnable;J)Z

    :cond_0
    return-void
.end method

.method private reloadPreferences()V
    .locals 6

    .line 1093
    invoke-static {}, Lcom/daaw/avee/comp/AppPreferences/AppPreferences;->createOrGetInstance()Lcom/daaw/avee/comp/AppPreferences/AppPreferences;

    move-result-object v0

    invoke-virtual {p0}, Lcom/daaw/avee/comp/playback/MediaPlaybackService;->getApplicationContext()Landroid/content/Context;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/daaw/avee/comp/AppPreferences/AppPreferences;->getPreferences(Landroid/content/Context;)Landroid/content/SharedPreferences;

    move-result-object v0

    const/4 v1, 0x0

    const-string v2, "repeatmode"

    .line 1095
    invoke-static {v0, v2, v1}, Lcom/daaw/avee/comp/AppPreferences/AppPreferences;->preferencesGetIntSafe(Landroid/content/SharedPreferences;Ljava/lang/String;I)I

    move-result v2

    const/4 v3, 0x2

    if-eq v2, v3, :cond_0

    const/4 v3, 0x1

    if-eq v2, v3, :cond_0

    const/4 v2, 0x0

    .line 1099
    :cond_0
    invoke-virtual {p0, v2, v1}, Lcom/daaw/avee/comp/playback/MediaPlaybackService;->setRepeatMode(IZ)V

    const-wide/16 v2, 0x0

    const-string v4, "seekpos"

    .line 1101
    invoke-static {v0, v4, v2, v3}, Lcom/daaw/avee/comp/AppPreferences/AppPreferences;->preferencesGetLongSafe(Landroid/content/SharedPreferences;Ljava/lang/String;J)J

    move-result-wide v2

    const-string v4, "openedPath"

    const-string v5, ""

    .line 1103
    invoke-static {v0, v4, v5}, Lcom/daaw/avee/comp/AppPreferences/AppPreferences;->preferencesGetStringSafe(Landroid/content/SharedPreferences;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    .line 1104
    new-instance v4, Lcom/daaw/avee/Common/Tuple2;

    new-instance v5, Lcom/daaw/avee/comp/playback/Song/PlaylistSong;

    invoke-direct {v5, v0}, Lcom/daaw/avee/comp/playback/Song/PlaylistSong;-><init>(Ljava/lang/String;)V

    new-instance v0, Lcom/daaw/avee/comp/PlaybackQueue/QueueItemIdentifier;

    invoke-direct {v0}, Lcom/daaw/avee/comp/PlaybackQueue/QueueItemIdentifier;-><init>()V

    invoke-direct {v4, v5, v0}, Lcom/daaw/avee/Common/Tuple2;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 1106
    iget-boolean v0, p0, Lcom/daaw/avee/comp/playback/MediaPlaybackService;->openedSongIsPreview:Z

    if-nez v0, :cond_1

    .line 1107
    invoke-direct {p0, v1}, Lcom/daaw/avee/comp/playback/MediaPlaybackService;->setWantsPlaying(Z)V

    .line 1108
    invoke-virtual {p0, v4, v2, v3}, Lcom/daaw/avee/comp/playback/MediaPlaybackService;->openAndPlaySongIndex(Lcom/daaw/avee/Common/Tuple2;J)V

    :cond_1
    return-void
.end method

.method private resetVisualizer()V
    .locals 1

    .line 1337
    invoke-direct {p0}, Lcom/daaw/avee/comp/playback/MediaPlaybackService;->getPlayer()Lcom/daaw/avee/comp/playback/IMediaPlayerCore;

    move-result-object v0

    if-eqz v0, :cond_0

    .line 1339
    invoke-interface {v0}, Lcom/daaw/avee/comp/playback/IMediaPlayerCore;->resetVisualizer()V

    :cond_0
    return-void
.end method

.method private savePreferences()V
    .locals 4

    .line 1077
    invoke-static {}, Lcom/daaw/avee/comp/AppPreferences/AppPreferences;->createOrGetInstance()Lcom/daaw/avee/comp/AppPreferences/AppPreferences;

    move-result-object v0

    invoke-virtual {p0}, Lcom/daaw/avee/comp/playback/MediaPlaybackService;->getApplicationContext()Landroid/content/Context;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/daaw/avee/comp/AppPreferences/AppPreferences;->getPreferences(Landroid/content/Context;)Landroid/content/SharedPreferences;

    move-result-object v0

    .line 1078
    invoke-interface {v0}, Landroid/content/SharedPreferences;->edit()Landroid/content/SharedPreferences$Editor;

    move-result-object v0

    .line 1080
    iget v1, p0, Lcom/daaw/avee/comp/playback/MediaPlaybackService;->cardId:I

    const-string v2, "cardid"

    invoke-interface {v0, v2, v1}, Landroid/content/SharedPreferences$Editor;->putInt(Ljava/lang/String;I)Landroid/content/SharedPreferences$Editor;

    .line 1081
    invoke-direct {p0}, Lcom/daaw/avee/comp/playback/MediaPlaybackService;->getPlayer()Lcom/daaw/avee/comp/playback/IMediaPlayerCore;

    move-result-object v1

    invoke-interface {v1}, Lcom/daaw/avee/comp/playback/IMediaPlayerCore;->position()J

    move-result-wide v1

    const-string v3, "seekpos"

    invoke-interface {v0, v3, v1, v2}, Landroid/content/SharedPreferences$Editor;->putLong(Ljava/lang/String;J)Landroid/content/SharedPreferences$Editor;

    .line 1082
    iget v1, p0, Lcom/daaw/avee/comp/playback/MediaPlaybackService;->repeatMode:I

    const-string v2, "repeatmode"

    invoke-interface {v0, v2, v1}, Landroid/content/SharedPreferences$Editor;->putInt(Ljava/lang/String;I)Landroid/content/SharedPreferences$Editor;

    .line 1085
    iget-object v1, p0, Lcom/daaw/avee/comp/playback/MediaPlaybackService;->openedEntry:Lcom/daaw/avee/Common/Tuple2;

    if-eqz v1, :cond_0

    iget-object v1, v1, Lcom/daaw/avee/Common/Tuple2;->obj1:Ljava/lang/Object;

    if-eqz v1, :cond_0

    .line 1086
    iget-object v1, p0, Lcom/daaw/avee/comp/playback/MediaPlaybackService;->openedEntry:Lcom/daaw/avee/Common/Tuple2;

    iget-object v1, v1, Lcom/daaw/avee/Common/Tuple2;->obj1:Ljava/lang/Object;

    check-cast v1, Lcom/daaw/avee/comp/playback/Song/PlaylistSong;

    invoke-virtual {v1}, Lcom/daaw/avee/comp/playback/Song/PlaylistSong;->getConstrucPath()Ljava/lang/String;

    move-result-object v1

    goto :goto_0

    :cond_0
    const-string v1, ""

    :goto_0
    const-string v2, "openedPath"

    .line 1087
    invoke-interface {v0, v2, v1}, Landroid/content/SharedPreferences$Editor;->putString(Ljava/lang/String;Ljava/lang/String;)Landroid/content/SharedPreferences$Editor;

    .line 1089
    invoke-interface {v0}, Landroid/content/SharedPreferences$Editor;->apply()V

    return-void
.end method

.method private selectMediaPlayerCoreIndex(I)V
    .locals 1

    const/4 v0, 0x0

    .line 904
    invoke-direct {p0, p1, v0}, Lcom/daaw/avee/comp/playback/MediaPlaybackService;->selectMediaPlayerCoreIndex(IZ)V

    return-void
.end method

.method private selectMediaPlayerCoreIndex(IZ)V
    .locals 9

    if-nez p2, :cond_0

    .line 909
    invoke-virtual {p0}, Lcom/daaw/avee/comp/playback/MediaPlaybackService;->getSelectedMediaPlayerCoreIndex()I

    move-result p2

    if-ltz p2, :cond_0

    if-ne p2, p1, :cond_0

    return-void

    .line 913
    :cond_0
    sget-object p2, Lcom/daaw/avee/comp/playback/MediaPlaybackService;->onRequestVolumeMuteState:Lcom/daaw/avee/Common/Events/WeakEventR;

    const/4 v0, 0x0

    invoke-static {v0}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v0

    invoke-virtual {p2, v0}, Lcom/daaw/avee/Common/Events/WeakEventR;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p2

    check-cast p2, Ljava/lang/Boolean;

    invoke-virtual {p2}, Ljava/lang/Boolean;->booleanValue()Z

    move-result p2

    .line 914
    sget-object v0, Lcom/daaw/avee/comp/playback/MediaPlaybackService;->onRequestVolumeStereoBalance:Lcom/daaw/avee/Common/Events/WeakEventR;

    const/4 v1, 0x0

    invoke-static {v1}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/daaw/avee/Common/Events/WeakEventR;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Float;

    invoke-virtual {v0}, Ljava/lang/Float;->floatValue()F

    move-result v0

    .line 915
    sget-object v1, Lcom/daaw/avee/comp/playback/MediaPlaybackService;->onRequestCrossfadeValue:Lcom/daaw/avee/Common/Events/WeakEventR;

    const/high16 v2, -0x40800000    # -1.0f

    invoke-static {v2}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    move-result-object v2

    invoke-virtual {v1, v2}, Lcom/daaw/avee/Common/Events/WeakEventR;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/lang/Float;

    invoke-virtual {v1}, Ljava/lang/Float;->floatValue()F

    move-result v1

    .line 919
    iget-object v2, p0, Lcom/daaw/avee/comp/playback/MediaPlaybackService;->fadePlayer:Lcom/daaw/avee/comp/playback/FadeMediaPlayer;

    invoke-virtual {v2}, Lcom/daaw/avee/comp/playback/FadeMediaPlayer;->getMediaPlayerCore()Lcom/daaw/avee/comp/playback/IMediaPlayerCore;

    move-result-object v2

    invoke-interface {v2}, Lcom/daaw/avee/comp/playback/IMediaPlayerCore;->position()J

    move-result-wide v2

    .line 920
    iget-object v4, p0, Lcom/daaw/avee/comp/playback/MediaPlaybackService;->fadePlayer:Lcom/daaw/avee/comp/playback/FadeMediaPlayer;

    invoke-virtual {v4}, Lcom/daaw/avee/comp/playback/FadeMediaPlayer;->release()V

    const/4 v4, 0x1

    const/high16 v5, 0x447a0000    # 1000.0f

    if-ne p1, v4, :cond_1

    .line 923
    new-instance p1, Lcom/daaw/avee/comp/playback/ExoMediaPlayer/ExoMediaPlayerCore;

    invoke-virtual {p0}, Lcom/daaw/avee/comp/playback/MediaPlaybackService;->getResources()Landroid/content/res/Resources;

    move-result-object v4

    const v6, 0x7f1000fe

    invoke-virtual {v4, v6}, Landroid/content/res/Resources;->getString(I)Ljava/lang/String;

    move-result-object v4

    iget-object v6, p0, Lcom/daaw/avee/comp/playback/MediaPlaybackService;->onNotifyListener:Lcom/daaw/avee/comp/playback/IMediaPlayerCore$OnNotifyListener;

    invoke-direct {p1, p0, v4, v6}, Lcom/daaw/avee/comp/playback/ExoMediaPlayer/ExoMediaPlayerCore;-><init>(Landroid/content/Context;Ljava/lang/String;Lcom/daaw/avee/comp/playback/IMediaPlayerCore$OnNotifyListener;)V

    .line 924
    new-instance v4, Lcom/daaw/avee/comp/playback/FadeMediaPlayer;

    iget-object v6, p0, Lcom/daaw/avee/comp/playback/MediaPlaybackService;->onNotifyListener:Lcom/daaw/avee/comp/playback/IMediaPlayerCore$OnNotifyListener;

    mul-float v1, v1, v5

    float-to-long v7, v1

    invoke-direct {v4, p1, v6, v7, v8}, Lcom/daaw/avee/comp/playback/FadeMediaPlayer;-><init>(Lcom/daaw/avee/comp/playback/IMediaPlayerCore;Lcom/daaw/avee/comp/playback/IMediaPlayerCore$OnNotifyListener;J)V

    iput-object v4, p0, Lcom/daaw/avee/comp/playback/MediaPlaybackService;->fadePlayer:Lcom/daaw/avee/comp/playback/FadeMediaPlayer;

    goto :goto_0

    .line 926
    :cond_1
    new-instance p1, Lcom/daaw/avee/comp/playback/NativeMediaPlayer/NativeMediaPlayerCore;

    invoke-virtual {p0}, Lcom/daaw/avee/comp/playback/MediaPlaybackService;->getResources()Landroid/content/res/Resources;

    move-result-object v4

    const v6, 0x7f1000ff

    invoke-virtual {v4, v6}, Landroid/content/res/Resources;->getString(I)Ljava/lang/String;

    move-result-object v4

    iget-object v6, p0, Lcom/daaw/avee/comp/playback/MediaPlaybackService;->onNotifyListener:Lcom/daaw/avee/comp/playback/IMediaPlayerCore$OnNotifyListener;

    invoke-direct {p1, p0, v4, v6}, Lcom/daaw/avee/comp/playback/NativeMediaPlayer/NativeMediaPlayerCore;-><init>(Landroid/content/Context;Ljava/lang/String;Lcom/daaw/avee/comp/playback/IMediaPlayerCore$OnNotifyListener;)V

    .line 927
    new-instance v4, Lcom/daaw/avee/comp/playback/FadeMediaPlayer;

    iget-object v6, p0, Lcom/daaw/avee/comp/playback/MediaPlaybackService;->onNotifyListener:Lcom/daaw/avee/comp/playback/IMediaPlayerCore$OnNotifyListener;

    mul-float v1, v1, v5

    float-to-long v7, v1

    invoke-direct {v4, p1, v6, v7, v8}, Lcom/daaw/avee/comp/playback/FadeMediaPlayer;-><init>(Lcom/daaw/avee/comp/playback/IMediaPlayerCore;Lcom/daaw/avee/comp/playback/IMediaPlayerCore$OnNotifyListener;J)V

    iput-object v4, p0, Lcom/daaw/avee/comp/playback/MediaPlaybackService;->fadePlayer:Lcom/daaw/avee/comp/playback/FadeMediaPlayer;

    .line 930
    :goto_0
    iget-object p1, p0, Lcom/daaw/avee/comp/playback/MediaPlaybackService;->fadePlayer:Lcom/daaw/avee/comp/playback/FadeMediaPlayer;

    invoke-virtual {p1}, Lcom/daaw/avee/comp/playback/FadeMediaPlayer;->getMediaPlayerCore()Lcom/daaw/avee/comp/playback/IMediaPlayerCore;

    move-result-object p1

    invoke-interface {p1, p2}, Lcom/daaw/avee/comp/playback/IMediaPlayerCore;->setMute(Z)V

    .line 931
    iget-object p1, p0, Lcom/daaw/avee/comp/playback/MediaPlaybackService;->fadePlayer:Lcom/daaw/avee/comp/playback/FadeMediaPlayer;

    invoke-virtual {p1}, Lcom/daaw/avee/comp/playback/FadeMediaPlayer;->getMediaPlayerCore()Lcom/daaw/avee/comp/playback/IMediaPlayerCore;

    move-result-object p1

    invoke-interface {p1, v0}, Lcom/daaw/avee/comp/playback/IMediaPlayerCore;->setVolumeStereoBalance(F)V

    .line 933
    iget-object p1, p0, Lcom/daaw/avee/comp/playback/MediaPlaybackService;->openedEntry:Lcom/daaw/avee/Common/Tuple2;

    invoke-virtual {p0, p1, v2, v3}, Lcom/daaw/avee/comp/playback/MediaPlaybackService;->openAndPlaySongIndex(Lcom/daaw/avee/Common/Tuple2;J)V

    return-void
.end method

.method private setEqualizerSettings(Lcom/daaw/avee/comp/playback/BaseEqualizerEffect$EqualizerSettings;)V
    .locals 1

    .line 1384
    invoke-direct {p0}, Lcom/daaw/avee/comp/playback/MediaPlaybackService;->getPlayer()Lcom/daaw/avee/comp/playback/IMediaPlayerCore;

    move-result-object v0

    if-eqz v0, :cond_0

    .line 1386
    invoke-interface {v0, p1}, Lcom/daaw/avee/comp/playback/IMediaPlayerCore;->setEqualizerSettings(Lcom/daaw/avee/comp/playback/BaseEqualizerEffect$EqualizerSettings;)V

    :cond_0
    return-void
.end method

.method private setMetadataArtwork(Landroid/graphics/Bitmap;)V
    .locals 2

    .line 1257
    iget-object v0, p0, Lcom/daaw/avee/comp/playback/MediaPlaybackService;->remoteControlClient:Landroid/media/RemoteControlClient;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Landroid/media/RemoteControlClient;->editMetadata(Z)Landroid/media/RemoteControlClient$MetadataEditor;

    move-result-object v0

    const/16 v1, 0x64

    .line 1258
    invoke-virtual {v0, v1, p1}, Landroid/media/RemoteControlClient$MetadataEditor;->putBitmap(ILandroid/graphics/Bitmap;)Landroid/media/RemoteControlClient$MetadataEditor;

    .line 1259
    invoke-virtual {v0}, Landroid/media/RemoteControlClient$MetadataEditor;->apply()V

    return-void
.end method

.method private setMetadataArtworkTh(Landroid/graphics/Bitmap;)V
    .locals 2

    .line 1245
    iget-object v0, p0, Lcom/daaw/avee/comp/playback/MediaPlaybackService;->mServiceHandler:Lcom/AOSP/MyIntentService$ServiceHandler;

    new-instance v1, Lcom/daaw/avee/comp/playback/MediaPlaybackService$12;

    invoke-direct {v1, p0, p1}, Lcom/daaw/avee/comp/playback/MediaPlaybackService$12;-><init>(Lcom/daaw/avee/comp/playback/MediaPlaybackService;Landroid/graphics/Bitmap;)V

    invoke-virtual {v0, v1}, Lcom/AOSP/MyIntentService$ServiceHandler;->post(Ljava/lang/Runnable;)Z

    return-void
.end method

.method private setTimeoutEnable(Z)V
    .locals 0

    .line 704
    iput-boolean p1, p0, Lcom/daaw/avee/comp/playback/MediaPlaybackService;->timeoutEnabled:Z

    .line 705
    invoke-direct {p0}, Lcom/daaw/avee/comp/playback/MediaPlaybackService;->updateServiceState()Z

    return-void
.end method

.method private setVideoSurfaceHolder(Landroid/view/SurfaceHolder;)V
    .locals 1

    .line 1280
    iget-object v0, p0, Lcom/daaw/avee/comp/playback/MediaPlaybackService;->fadePlayer:Lcom/daaw/avee/comp/playback/FadeMediaPlayer;

    invoke-virtual {v0}, Lcom/daaw/avee/comp/playback/FadeMediaPlayer;->getMediaPlayerCore()Lcom/daaw/avee/comp/playback/IMediaPlayerCore;

    move-result-object v0

    invoke-interface {v0, p1}, Lcom/daaw/avee/comp/playback/IMediaPlayerCore;->setVideoSurfaceHolder(Landroid/view/SurfaceHolder;)V

    return-void
.end method

.method private setWantsPlaying(Z)V
    .locals 7

    .line 1006
    iput-boolean p1, p0, Lcom/daaw/avee/comp/playback/MediaPlaybackService;->wantsPlay:Z

    .line 1008
    invoke-virtual {p0}, Lcom/daaw/avee/comp/playback/MediaPlaybackService;->isPlaying()Z

    move-result p1

    .line 1009
    invoke-virtual {p0}, Lcom/daaw/avee/comp/playback/MediaPlaybackService;->wantsPlaying()Z

    move-result v0

    .line 1010
    sget-object v1, Lcom/daaw/avee/comp/playback/MediaPlaybackService;->onPlayStateChanged:Lcom/daaw/avee/Common/Events/WeakEvent5;

    invoke-static {p1}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v2

    invoke-static {v0}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v3

    iget p1, p0, Lcom/daaw/avee/comp/playback/MediaPlaybackService;->bufferingPercent:I

    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v4

    const/4 v5, 0x0

    const/4 v6, 0x0

    invoke-virtual/range {v1 .. v6}, Lcom/daaw/avee/Common/Events/WeakEvent5;->invoke(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)V

    return-void
.end method

.method private stopService()V
    .locals 1

    .line 689
    invoke-direct {p0}, Lcom/daaw/avee/comp/playback/MediaPlaybackService;->getPlayer()Lcom/daaw/avee/comp/playback/IMediaPlayerCore;

    move-result-object v0

    if-eqz v0, :cond_0

    invoke-direct {p0}, Lcom/daaw/avee/comp/playback/MediaPlaybackService;->getPlayer()Lcom/daaw/avee/comp/playback/IMediaPlayerCore;

    move-result-object v0

    invoke-interface {v0}, Lcom/daaw/avee/comp/playback/IMediaPlayerCore;->stop()V

    .line 690
    :cond_0
    iget v0, p0, Lcom/daaw/avee/comp/playback/MediaPlaybackService;->lastestStartId:I

    invoke-virtual {p0, v0}, Lcom/daaw/avee/comp/playback/MediaPlaybackService;->stopSelf(I)V

    const/4 v0, 0x0

    .line 691
    iput-boolean v0, p0, Lcom/daaw/avee/comp/playback/MediaPlaybackService;->serviceActiveForegroundState:Z

    return-void
.end method

.method private updateServiceState()Z
    .locals 1

    const/4 v0, 0x0

    .line 768
    invoke-direct {p0, v0}, Lcom/daaw/avee/comp/playback/MediaPlaybackService;->updateServiceState(Z)Z

    move-result v0

    return v0
.end method

.method private updateServiceState(Z)Z
    .locals 4

    .line 774
    invoke-static {}, Lcom/daaw/avee/comp/AppPreferences/AppPreferences;->createOrGetInstance()Lcom/daaw/avee/comp/AppPreferences/AppPreferences;

    move-result-object v0

    invoke-virtual {p0}, Lcom/daaw/avee/comp/playback/MediaPlaybackService;->getApplicationContext()Landroid/content/Context;

    move-result-object v1

    const/4 v2, 0x1

    const-string v3, "pref_resumePlayingAfterAudioFocusGained"

    invoke-virtual {v0, v1, v3, v2}, Lcom/daaw/avee/comp/AppPreferences/AppPreferences;->preferencesGetBoolSafe(Landroid/content/Context;Ljava/lang/String;Z)Z

    move-result v0

    .line 775
    iget-boolean v1, p0, Lcom/daaw/avee/comp/playback/MediaPlaybackService;->lostAudioFocusWhilePlaying:Z

    const/4 v3, 0x0

    if-eqz v1, :cond_0

    if-eqz v0, :cond_0

    const/4 v0, 0x1

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    .line 778
    :goto_0
    iget-boolean v1, p0, Lcom/daaw/avee/comp/playback/MediaPlaybackService;->timeoutEnabled:Z

    if-eqz v1, :cond_3

    invoke-direct {p0}, Lcom/daaw/avee/comp/playback/MediaPlaybackService;->getPlayer()Lcom/daaw/avee/comp/playback/IMediaPlayerCore;

    move-result-object v1

    if-eqz v1, :cond_1

    invoke-direct {p0}, Lcom/daaw/avee/comp/playback/MediaPlaybackService;->getPlayer()Lcom/daaw/avee/comp/playback/IMediaPlayerCore;

    move-result-object v1

    invoke-interface {v1}, Lcom/daaw/avee/comp/playback/IMediaPlayerCore;->isPreparingOrStared()Z

    move-result v1

    if-nez v1, :cond_3

    :cond_1
    if-eqz v0, :cond_2

    goto :goto_1

    :cond_2
    const/4 v2, 0x0

    :cond_3
    :goto_1
    if-eqz v2, :cond_6

    if-nez p1, :cond_6

    .line 785
    invoke-direct {p0}, Lcom/daaw/avee/comp/playback/MediaPlaybackService;->getPlayer()Lcom/daaw/avee/comp/playback/IMediaPlayerCore;

    move-result-object p1

    if-eqz p1, :cond_4

    invoke-direct {p0}, Lcom/daaw/avee/comp/playback/MediaPlaybackService;->getPlayer()Lcom/daaw/avee/comp/playback/IMediaPlayerCore;

    move-result-object p1

    invoke-interface {p1}, Lcom/daaw/avee/comp/playback/IMediaPlayerCore;->isPreparingOrStared()Z

    move-result p1

    if-nez p1, :cond_5

    .line 786
    :cond_4
    invoke-virtual {p0}, Lcom/daaw/avee/comp/playback/MediaPlaybackService;->requestAudioLowerFocus()V

    .line 788
    :cond_5
    invoke-virtual {p0}, Lcom/daaw/avee/comp/playback/MediaPlaybackService;->goActiveService()Z

    move-result v3

    goto :goto_2

    :cond_6
    if-nez p1, :cond_7

    .line 792
    invoke-virtual {p0}, Lcom/daaw/avee/comp/playback/MediaPlaybackService;->requestAudioLowerFocus()V

    .line 793
    :cond_7
    invoke-virtual {p0, p1}, Lcom/daaw/avee/comp/playback/MediaPlaybackService;->goIdleService(Z)V

    :goto_2
    return v3
.end method


# virtual methods
.method public abandonAudioFocus(Z)V
    .locals 1

    const-string v0, "abandonAudioFocus"

    .line 676
    invoke-static {v0}, Lcom/daaw/avee/Common/tlog;->d(Ljava/lang/String;)V

    if-nez p1, :cond_0

    .line 679
    iget-object p1, p0, Lcom/daaw/avee/comp/playback/MediaPlaybackService;->remoteControlClient:Landroid/media/RemoteControlClient;

    if-eqz p1, :cond_0

    const/4 v0, 0x2

    .line 680
    invoke-virtual {p1, v0}, Landroid/media/RemoteControlClient;->setPlaybackState(I)V

    :cond_0
    const/4 p1, 0x0

    .line 682
    iput-boolean p1, p0, Lcom/daaw/avee/comp/playback/MediaPlaybackService;->haveAudioFocus:Z

    .line 683
    iget-object p1, p0, Lcom/daaw/avee/comp/playback/MediaPlaybackService;->audioManager:Landroid/media/AudioManager;

    invoke-virtual {p1, p0}, Landroid/media/AudioManager;->abandonAudioFocus(Landroid/media/AudioManager$OnAudioFocusChangeListener;)I

    return-void
.end method

.method deInitialize()V
    .locals 11

    const/4 v0, 0x1

    .line 396
    invoke-direct {p0, v0}, Lcom/daaw/avee/comp/playback/MediaPlaybackService;->updateServiceState(Z)Z

    const/4 v1, 0x0

    .line 398
    iput-boolean v1, p0, Lcom/daaw/avee/comp/playback/MediaPlaybackService;->serviceValidState:Z

    .line 399
    new-instance v1, Ljava/lang/ref/WeakReference;

    const/4 v2, 0x0

    invoke-direct {v1, v2}, Ljava/lang/ref/WeakReference;-><init>(Ljava/lang/Object;)V

    sput-object v1, Lcom/daaw/avee/comp/playback/MediaPlaybackService;->instanceWeak:Ljava/lang/ref/WeakReference;

    .line 400
    invoke-direct {p0}, Lcom/daaw/avee/comp/playback/MediaPlaybackService;->savePreferences()V

    .line 401
    sget-object v1, Lcom/daaw/avee/comp/playback/MediaPlaybackService;->onDestroyed:Lcom/daaw/avee/Common/Events/WeakEvent1;

    invoke-virtual {v1, p0}, Lcom/daaw/avee/Common/Events/WeakEvent1;->invoke(Ljava/lang/Object;)V

    .line 404
    invoke-virtual {p0, v0}, Lcom/daaw/avee/comp/playback/MediaPlaybackService;->abandonAudioFocus(Z)V

    .line 406
    iget-object v0, p0, Lcom/daaw/avee/comp/playback/MediaPlaybackService;->remoteControlClient:Landroid/media/RemoteControlClient;

    if-eqz v0, :cond_0

    .line 408
    :try_start_0
    iget-object v1, p0, Lcom/daaw/avee/comp/playback/MediaPlaybackService;->audioManager:Landroid/media/AudioManager;

    invoke-virtual {v1, v0}, Landroid/media/AudioManager;->unregisterRemoteControlClient(Landroid/media/RemoteControlClient;)V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_0

    :catch_0
    move-exception v0

    .line 410
    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "unregisterRemoteControlClient failed: "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/Exception;->getMessage()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-static {v1}, Lcom/daaw/avee/Common/tlog;->w(Ljava/lang/String;)V

    .line 411
    invoke-virtual {v0}, Ljava/lang/Exception;->printStackTrace()V

    .line 415
    :goto_0
    :try_start_1
    iget-object v0, p0, Lcom/daaw/avee/comp/playback/MediaPlaybackService;->audioManager:Landroid/media/AudioManager;

    iget-object v1, p0, Lcom/daaw/avee/comp/playback/MediaPlaybackService;->mediaButtonEventReceiverName:Landroid/content/ComponentName;

    invoke-virtual {v0, v1}, Landroid/media/AudioManager;->unregisterMediaButtonEventReceiver(Landroid/content/ComponentName;)V
    :try_end_1
    .catch Ljava/lang/IllegalArgumentException; {:try_start_1 .. :try_end_1} :catch_1

    goto :goto_1

    :catch_1
    move-exception v0

    .line 417
    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "unregisterMediaButtonEventReceiver failed: "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/IllegalArgumentException;->getMessage()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lcom/daaw/avee/Common/tlog;->w(Ljava/lang/String;)V

    .line 422
    :cond_0
    :goto_1
    :try_start_2
    iget-object v0, p0, Lcom/daaw/avee/comp/playback/MediaPlaybackService;->mediaEventReceiver:Lcom/daaw/avee/comp/playback/MediaEventReceiver;

    invoke-virtual {p0, v0}, Lcom/daaw/avee/comp/playback/MediaPlaybackService;->unregisterReceiver(Landroid/content/BroadcastReceiver;)V
    :try_end_2
    .catch Ljava/lang/IllegalArgumentException; {:try_start_2 .. :try_end_2} :catch_2

    .line 427
    :catch_2
    iget-object v0, p0, Lcom/daaw/avee/comp/playback/MediaPlaybackService;->fadePlayer:Lcom/daaw/avee/comp/playback/FadeMediaPlayer;

    invoke-virtual {v0}, Lcom/daaw/avee/comp/playback/FadeMediaPlayer;->release()V

    .line 428
    new-instance v0, Lcom/daaw/avee/comp/playback/FadeMediaPlayer;

    sget-object v1, Lcom/daaw/avee/comp/playback/IMediaPlayerCore;->Empty:Lcom/daaw/avee/comp/playback/IMediaPlayerCore;

    iget-object v2, p0, Lcom/daaw/avee/comp/playback/MediaPlaybackService;->onNotifyListener:Lcom/daaw/avee/comp/playback/IMediaPlayerCore$OnNotifyListener;

    const-wide/16 v3, 0x0

    invoke-direct {v0, v1, v2, v3, v4}, Lcom/daaw/avee/comp/playback/FadeMediaPlayer;-><init>(Lcom/daaw/avee/comp/playback/IMediaPlayerCore;Lcom/daaw/avee/comp/playback/IMediaPlayerCore$OnNotifyListener;J)V

    iput-object v0, p0, Lcom/daaw/avee/comp/playback/MediaPlaybackService;->fadePlayer:Lcom/daaw/avee/comp/playback/FadeMediaPlayer;

    .line 430
    invoke-static {}, Lcom/daaw/avee/comp/playback/view/MediaAppWidgetProvider;->getInstance()Lcom/daaw/avee/comp/playback/view/MediaAppWidgetProvider;

    move-result-object v5

    .line 431
    invoke-virtual {p0}, Lcom/daaw/avee/comp/playback/MediaPlaybackService;->getOpenedOrSupposedOrEmptySong()Lcom/daaw/avee/comp/playback/Song/PlaylistSong;

    move-result-object v0

    invoke-virtual {v0}, Lcom/daaw/avee/comp/playback/Song/PlaylistSong;->getData()Lcom/daaw/avee/comp/playback/Song/PlaylistSong$Data;

    move-result-object v7

    const/4 v8, 0x0

    const/4 v9, 0x0

    const-class v10, Lcom/daaw/avee/comp/playback/MediaPlaybackService;

    move-object v6, p0

    .line 430
    invoke-virtual/range {v5 .. v10}, Lcom/daaw/avee/comp/playback/view/MediaAppWidgetProvider;->notifyChange(Landroid/content/Context;Lcom/daaw/avee/comp/playback/Song/PlaylistSong$Data;ZZLjava/lang/Class;)V

    return-void
.end method

.method public duration()J
    .locals 2

    .line 1042
    invoke-direct {p0}, Lcom/daaw/avee/comp/playback/MediaPlaybackService;->getPlayer()Lcom/daaw/avee/comp/playback/IMediaPlayerCore;

    move-result-object v0

    if-nez v0, :cond_0

    const-wide/16 v0, 0x0

    return-wide v0

    .line 1044
    :cond_0
    invoke-interface {v0}, Lcom/daaw/avee/comp/playback/IMediaPlayerCore;->duration()J

    move-result-wide v0

    return-wide v0
.end method

.method public getCurrentSong()Lcom/daaw/avee/comp/playback/Song/PlaylistSong;
    .locals 1

    .line 1014
    iget-object v0, p0, Lcom/daaw/avee/comp/playback/MediaPlaybackService;->openedEntry:Lcom/daaw/avee/Common/Tuple2;

    if-nez v0, :cond_0

    const/4 v0, 0x0

    return-object v0

    .line 1016
    :cond_0
    iget-object v0, v0, Lcom/daaw/avee/Common/Tuple2;->obj1:Ljava/lang/Object;

    check-cast v0, Lcom/daaw/avee/comp/playback/Song/PlaylistSong;

    return-object v0
.end method

.method public getEqualizerDescThSafe()Lcom/daaw/avee/comp/playback/BaseEqualizerEffect$EqualizerDesc;
    .locals 2

    .line 1361
    iget-object v0, p0, Lcom/daaw/avee/comp/playback/MediaPlaybackService;->mServiceHandler:Lcom/AOSP/MyIntentService$ServiceHandler;

    new-instance v1, Lcom/daaw/avee/comp/playback/MediaPlaybackService$15;

    invoke-direct {v1, p0}, Lcom/daaw/avee/comp/playback/MediaPlaybackService$15;-><init>(Lcom/daaw/avee/comp/playback/MediaPlaybackService;)V

    invoke-virtual {v0, v1}, Lcom/AOSP/MyIntentService$ServiceHandler;->post(Ljava/lang/Runnable;)Z

    .line 1370
    iget-object v0, p0, Lcom/daaw/avee/comp/playback/MediaPlaybackService;->lastEqualizerDesc:Lcom/daaw/avee/comp/playback/BaseEqualizerEffect$EqualizerDesc;

    return-object v0
.end method

.method public getOpenedOrSupposedOrEmptySong()Lcom/daaw/avee/comp/playback/Song/PlaylistSong;
    .locals 1

    .line 1034
    invoke-virtual {p0}, Lcom/daaw/avee/comp/playback/MediaPlaybackService;->getOpenedOrSupposedOrNullEntry()Lcom/daaw/avee/Common/Tuple2;

    move-result-object v0

    if-eqz v0, :cond_0

    .line 1036
    iget-object v0, v0, Lcom/daaw/avee/Common/Tuple2;->obj1:Ljava/lang/Object;

    check-cast v0, Lcom/daaw/avee/comp/playback/Song/PlaylistSong;

    return-object v0

    .line 1038
    :cond_0
    sget-object v0, Lcom/daaw/avee/comp/playback/Song/PlaylistSong;->EmptySong:Lcom/daaw/avee/comp/playback/Song/PlaylistSong;

    return-object v0
.end method

.method public getOpenedOrSupposedOrNullEntry()Lcom/daaw/avee/Common/Tuple2;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lcom/daaw/avee/Common/Tuple2<",
            "Lcom/daaw/avee/comp/playback/Song/PlaylistSong;",
            "Lcom/daaw/avee/comp/Common/IItemIdentifier;",
            ">;"
        }
    .end annotation

    .line 1027
    iget-object v0, p0, Lcom/daaw/avee/comp/playback/MediaPlaybackService;->openedEntry:Lcom/daaw/avee/Common/Tuple2;

    if-eqz v0, :cond_0

    return-object v0

    :cond_0
    const/4 v0, 0x0

    return-object v0
.end method

.method public getOpenedSongOrEmpty()Lcom/daaw/avee/comp/playback/Song/PlaylistSong;
    .locals 1

    .line 1020
    invoke-virtual {p0}, Lcom/daaw/avee/comp/playback/MediaPlaybackService;->getCurrentSong()Lcom/daaw/avee/comp/playback/Song/PlaylistSong;

    move-result-object v0

    if-nez v0, :cond_0

    .line 1022
    sget-object v0, Lcom/daaw/avee/comp/playback/Song/PlaylistSong;->EmptySong:Lcom/daaw/avee/comp/playback/Song/PlaylistSong;

    :cond_0
    return-object v0
.end method

.method public getSelectedMediaPlayerCoreIndex()I
    .locals 2

    .line 869
    iget-object v0, p0, Lcom/daaw/avee/comp/playback/MediaPlaybackService;->fadePlayer:Lcom/daaw/avee/comp/playback/FadeMediaPlayer;

    invoke-virtual {v0}, Lcom/daaw/avee/comp/playback/FadeMediaPlayer;->getMediaPlayerCore()Lcom/daaw/avee/comp/playback/IMediaPlayerCore;

    move-result-object v0

    .line 871
    instance-of v1, v0, Lcom/daaw/avee/comp/playback/NativeMediaPlayer/NativeMediaPlayerCore;

    if-eqz v1, :cond_0

    const/4 v0, 0x0

    return v0

    .line 874
    :cond_0
    instance-of v0, v0, Lcom/daaw/avee/comp/playback/ExoMediaPlayer/ExoMediaPlayerCore;

    if-eqz v0, :cond_1

    const/4 v0, 0x1

    return v0

    :cond_1
    const/4 v0, -0x1

    return v0
.end method

.method public getVisualizationData(Lcom/daaw/avee/comp/playback/AudioFrameData;Lcom/daaw/avee/comp/playback/AudioFrameData$Request2;)Lcom/daaw/avee/comp/playback/AudioFrameData;
    .locals 1

    .line 1352
    invoke-direct {p0}, Lcom/daaw/avee/comp/playback/MediaPlaybackService;->getPlayer()Lcom/daaw/avee/comp/playback/IMediaPlayerCore;

    move-result-object v0

    if-eqz v0, :cond_0

    .line 1354
    invoke-interface {v0, p1, p2}, Lcom/daaw/avee/comp/playback/IMediaPlayerCore;->getVisualizationData(Lcom/daaw/avee/comp/playback/AudioFrameData;Lcom/daaw/avee/comp/playback/AudioFrameData$Request2;)Lcom/daaw/avee/comp/playback/AudioFrameData;

    move-result-object p1

    return-object p1

    :cond_0
    const/4 p1, 0x0

    return-object p1
.end method

.method public getVolume()I
    .locals 2

    .line 1307
    iget-object v0, p0, Lcom/daaw/avee/comp/playback/MediaPlaybackService;->audioManager:Landroid/media/AudioManager;

    const/4 v1, 0x3

    invoke-virtual {v0, v1}, Landroid/media/AudioManager;->getStreamVolume(I)I

    move-result v0

    return v0
.end method

.method public getVolumeMax()I
    .locals 2

    .line 1303
    iget-object v0, p0, Lcom/daaw/avee/comp/playback/MediaPlaybackService;->audioManager:Landroid/media/AudioManager;

    const/4 v1, 0x3

    invoke-virtual {v0, v1}, Landroid/media/AudioManager;->getStreamMaxVolume(I)I

    move-result v0

    return v0
.end method

.method public getVolumePercentage()F
    .locals 3

    .line 1293
    iget-object v0, p0, Lcom/daaw/avee/comp/playback/MediaPlaybackService;->audioManager:Landroid/media/AudioManager;

    const/4 v1, 0x3

    invoke-virtual {v0, v1}, Landroid/media/AudioManager;->getStreamMaxVolume(I)I

    move-result v0

    int-to-float v0, v0

    .line 1294
    iget-object v2, p0, Lcom/daaw/avee/comp/playback/MediaPlaybackService;->audioManager:Landroid/media/AudioManager;

    invoke-virtual {v2, v1}, Landroid/media/AudioManager;->getStreamVolume(I)I

    move-result v1

    int-to-float v1, v1

    div-float/2addr v1, v0

    return v1
.end method

.method public goActiveService()Z
    .locals 11

    .line 737
    iget-boolean v0, p0, Lcom/daaw/avee/comp/playback/MediaPlaybackService;->serviceActiveForegroundState:Z

    if-eqz v0, :cond_0

    const/4 v0, 0x0

    return v0

    :cond_0
    const-string v0, "active state"

    .line 741
    invoke-static {v0}, Lcom/daaw/avee/Common/tlog;->d(Ljava/lang/String;)V

    .line 743
    iget-object v0, p0, Lcom/daaw/avee/comp/playback/MediaPlaybackService;->mServiceHandler:Lcom/AOSP/MyIntentService$ServiceHandler;

    iget-object v1, p0, Lcom/daaw/avee/comp/playback/MediaPlaybackService;->idleTimeoutRunnable:Ljava/lang/Runnable;

    invoke-virtual {v0, v1}, Lcom/AOSP/MyIntentService$ServiceHandler;->removeCallbacks(Ljava/lang/Runnable;)V

    .line 744
    invoke-virtual {p0}, Lcom/daaw/avee/comp/playback/MediaPlaybackService;->getOpenedOrSupposedOrEmptySong()Lcom/daaw/avee/comp/playback/Song/PlaylistSong;

    move-result-object v0

    invoke-virtual {p0}, Lcom/daaw/avee/comp/playback/MediaPlaybackService;->getApplicationContext()Landroid/content/Context;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/daaw/avee/comp/playback/Song/PlaylistSong;->getDataBlocking(Landroid/content/Context;)Lcom/daaw/avee/comp/playback/Song/PlaylistSong$Data;

    move-result-object v5

    .line 746
    iget-object v0, p0, Lcom/daaw/avee/comp/playback/MediaPlaybackService;->notificationChannelId:Ljava/lang/String;

    if-nez v0, :cond_1

    .line 747
    invoke-static {p0}, Lcom/daaw/avee/comp/playback/view/MediaPlaybackNotification;->createNotificationChannel(Landroid/content/Context;)Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lcom/daaw/avee/comp/playback/MediaPlaybackService;->notificationChannelId:Ljava/lang/String;

    :cond_1
    const/4 v3, 0x1

    .line 749
    iget-object v4, p0, Lcom/daaw/avee/comp/playback/MediaPlaybackService;->notificationChannelId:Ljava/lang/String;

    .line 754
    invoke-virtual {p0}, Lcom/daaw/avee/comp/playback/MediaPlaybackService;->isPlaying()Z

    move-result v6

    .line 755
    invoke-virtual {p0}, Lcom/daaw/avee/comp/playback/MediaPlaybackService;->wantsPlaying()Z

    move-result v7

    const-class v8, Lcom/daaw/avee/comp/playback/MediaPlaybackService;

    const/4 v9, 0x0

    new-instance v10, Lcom/daaw/avee/comp/playback/-$$Lambda$MediaPlaybackService$b6844qXj7EfJHDuAxF5z5oKN1bs;

    invoke-direct {v10, p0}, Lcom/daaw/avee/comp/playback/-$$Lambda$MediaPlaybackService$b6844qXj7EfJHDuAxF5z5oKN1bs;-><init>(Lcom/daaw/avee/comp/playback/MediaPlaybackService;)V

    move-object v2, p0

    .line 749
    invoke-static/range {v2 .. v10}, Lcom/daaw/avee/comp/playback/view/MediaPlaybackNotification;->getOrCreateNotification(Landroid/content/Context;ILjava/lang/String;Lcom/daaw/avee/comp/playback/Song/PlaylistSong$Data;ZZLjava/lang/Class;ILcom/daaw/avee/Common/Func/Func;)Landroid/app/Notification;

    move-result-object v0

    const/4 v1, 0x1

    invoke-virtual {p0, v1, v0}, Lcom/daaw/avee/comp/playback/MediaPlaybackService;->startForeground(ILandroid/app/Notification;)V

    .line 761
    iput-boolean v1, p0, Lcom/daaw/avee/comp/playback/MediaPlaybackService;->serviceActiveForegroundState:Z

    return v1
.end method

.method public goIdleService(Z)V
    .locals 4

    if-eqz p1, :cond_0

    const-string v0, "idle state"

    .line 721
    invoke-static {v0}, Lcom/daaw/avee/Common/tlog;->d(Ljava/lang/String;)V

    const/4 v0, 0x0

    .line 722
    iput-boolean v0, p0, Lcom/daaw/avee/comp/playback/MediaPlaybackService;->serviceActiveForegroundState:Z

    .line 724
    iget-object v0, p0, Lcom/daaw/avee/comp/playback/MediaPlaybackService;->mServiceHandler:Lcom/AOSP/MyIntentService$ServiceHandler;

    iget-object v1, p0, Lcom/daaw/avee/comp/playback/MediaPlaybackService;->idleTimeoutRunnable:Ljava/lang/Runnable;

    invoke-virtual {v0, v1}, Lcom/AOSP/MyIntentService$ServiceHandler;->removeCallbacks(Ljava/lang/Runnable;)V

    .line 725
    iget-object v0, p0, Lcom/daaw/avee/comp/playback/MediaPlaybackService;->mServiceHandler:Lcom/AOSP/MyIntentService$ServiceHandler;

    iget-object v1, p0, Lcom/daaw/avee/comp/playback/MediaPlaybackService;->idleTimeoutRunnable:Ljava/lang/Runnable;

    .line 726
    invoke-virtual {p0}, Lcom/daaw/avee/comp/playback/MediaPlaybackService;->getResources()Landroid/content/res/Resources;

    move-result-object v2

    const v3, 0x7f0a0016

    invoke-virtual {v2, v3}, Landroid/content/res/Resources;->getInteger(I)I

    move-result v2

    int-to-long v2, v2

    .line 725
    invoke-virtual {v0, v1, v2, v3}, Lcom/AOSP/MyIntentService$ServiceHandler;->postDelayed(Ljava/lang/Runnable;J)Z

    .line 728
    invoke-virtual {p0, p1}, Lcom/daaw/avee/comp/playback/MediaPlaybackService;->stopForeground(Z)V

    if-eqz p1, :cond_0

    const/4 p1, 0x1

    .line 731
    invoke-static {p0, p1}, Lcom/daaw/avee/comp/playback/view/MediaPlaybackNotification;->CancelNotification(Landroid/content/Context;I)V

    :cond_0
    return-void
.end method

.method initialize()V
    .locals 4

    const/4 v0, 0x0

    .line 299
    iput-boolean v0, p0, Lcom/daaw/avee/comp/playback/MediaPlaybackService;->serviceActiveForegroundState:Z

    .line 301
    sget-object v1, Lcom/daaw/avee/comp/playback/MediaPlaybackService;->onCreateEarly:Lcom/daaw/avee/Common/Events/WeakEvent1;

    invoke-virtual {v1, p0}, Lcom/daaw/avee/Common/Events/WeakEvent1;->invoke(Ljava/lang/Object;)V

    .line 303
    sget-object v1, Lcom/daaw/avee/comp/playback/MediaPlaybackService;->onRequestSelectMediaPlayerCoreIndex:Lcom/daaw/avee/Common/Events/WeakEventR;

    const/4 v2, -0x1

    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    invoke-virtual {v1, v2}, Lcom/daaw/avee/Common/Events/WeakEventR;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/lang/Integer;

    invoke-virtual {v1}, Ljava/lang/Integer;->intValue()I

    move-result v1

    .line 304
    invoke-direct {p0, v1}, Lcom/daaw/avee/comp/playback/MediaPlaybackService;->selectMediaPlayerCoreIndex(I)V

    const-string v1, "audio"

    .line 306
    invoke-virtual {p0, v1}, Lcom/daaw/avee/comp/playback/MediaPlaybackService;->getSystemService(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Landroid/media/AudioManager;

    iput-object v1, p0, Lcom/daaw/avee/comp/playback/MediaPlaybackService;->audioManager:Landroid/media/AudioManager;

    .line 307
    new-instance v1, Lcom/daaw/avee/comp/playback/MediaEventReceiver;

    invoke-direct {v1}, Lcom/daaw/avee/comp/playback/MediaEventReceiver;-><init>()V

    iput-object v1, p0, Lcom/daaw/avee/comp/playback/MediaPlaybackService;->mediaEventReceiver:Lcom/daaw/avee/comp/playback/MediaEventReceiver;

    .line 309
    new-instance v1, Landroid/content/IntentFilter;

    invoke-direct {v1}, Landroid/content/IntentFilter;-><init>()V

    const-string v2, "android.media.AUDIO_BECOMING_NOISY"

    .line 310
    invoke-virtual {v1, v2}, Landroid/content/IntentFilter;->addAction(Ljava/lang/String;)V

    .line 311
    sget v2, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 v3, 0x15

    if-lt v2, v3, :cond_0

    const-string v2, "android.intent.action.HEADSET_PLUG"

    .line 312
    invoke-virtual {v1, v2}, Landroid/content/IntentFilter;->addAction(Ljava/lang/String;)V

    .line 315
    :cond_0
    iget-object v2, p0, Lcom/daaw/avee/comp/playback/MediaPlaybackService;->mediaEventReceiver:Lcom/daaw/avee/comp/playback/MediaEventReceiver;

    invoke-virtual {p0, v2, v1}, Lcom/daaw/avee/comp/playback/MediaPlaybackService;->registerReceiver(Landroid/content/BroadcastReceiver;Landroid/content/IntentFilter;)Landroid/content/Intent;

    .line 319
    new-instance v1, Landroid/content/ComponentName;

    const-class v2, Lcom/daaw/avee/comp/playback/MediaButtonEventReceiver;

    invoke-direct {v1, p0, v2}, Landroid/content/ComponentName;-><init>(Landroid/content/Context;Ljava/lang/Class;)V

    iput-object v1, p0, Lcom/daaw/avee/comp/playback/MediaPlaybackService;->mediaButtonEventReceiverName:Landroid/content/ComponentName;

    .line 325
    :try_start_0
    iget-object v2, p0, Lcom/daaw/avee/comp/playback/MediaPlaybackService;->audioManager:Landroid/media/AudioManager;

    invoke-virtual {v2, v1}, Landroid/media/AudioManager;->registerMediaButtonEventReceiver(Landroid/content/ComponentName;)V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_0

    :catch_0
    move-exception v1

    .line 327
    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "registerMediaButtonEventReceiver failed: "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/Exception;->getMessage()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v2, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-static {v1}, Lcom/daaw/avee/Common/tlog;->w(Ljava/lang/String;)V

    .line 334
    :goto_0
    :try_start_1
    new-instance v1, Landroid/content/Intent;

    const-string v2, "android.intent.action.MEDIA_BUTTON"

    invoke-direct {v1, v2}, Landroid/content/Intent;-><init>(Ljava/lang/String;)V

    .line 335
    iget-object v2, p0, Lcom/daaw/avee/comp/playback/MediaPlaybackService;->mediaButtonEventReceiverName:Landroid/content/ComponentName;

    invoke-virtual {v1, v2}, Landroid/content/Intent;->setComponent(Landroid/content/ComponentName;)Landroid/content/Intent;

    .line 336
    invoke-virtual {p0}, Lcom/daaw/avee/comp/playback/MediaPlaybackService;->getApplicationContext()Landroid/content/Context;

    move-result-object v2

    invoke-static {v2, v0, v1, v0}, Landroid/app/PendingIntent;->getBroadcast(Landroid/content/Context;ILandroid/content/Intent;I)Landroid/app/PendingIntent;

    move-result-object v1

    .line 339
    new-instance v2, Landroid/media/RemoteControlClient;

    invoke-direct {v2, v1}, Landroid/media/RemoteControlClient;-><init>(Landroid/app/PendingIntent;)V

    iput-object v2, p0, Lcom/daaw/avee/comp/playback/MediaPlaybackService;->remoteControlClient:Landroid/media/RemoteControlClient;

    .line 340
    iget-object v1, p0, Lcom/daaw/avee/comp/playback/MediaPlaybackService;->audioManager:Landroid/media/AudioManager;

    invoke-virtual {v1, v2}, Landroid/media/AudioManager;->registerRemoteControlClient(Landroid/media/RemoteControlClient;)V

    const/16 v1, 0xbd

    .line 348
    iget-object v2, p0, Lcom/daaw/avee/comp/playback/MediaPlaybackService;->remoteControlClient:Landroid/media/RemoteControlClient;

    invoke-virtual {v2, v1}, Landroid/media/RemoteControlClient;->setTransportControlFlags(I)V
    :try_end_1
    .catch Ljava/lang/Exception; {:try_start_1 .. :try_end_1} :catch_1

    goto :goto_1

    :catch_1
    move-exception v1

    .line 351
    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "remoteControlClient failed: "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/Exception;->getMessage()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v2, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-static {v1}, Lcom/daaw/avee/Common/tlog;->w(Ljava/lang/String;)V

    .line 355
    :goto_1
    sget-object v1, Lcom/daaw/avee/comp/playback/MediaPlaybackService;->onVolumeMaxChanged:Lcom/daaw/avee/Common/Events/WeakEvent1;

    invoke-virtual {p0}, Lcom/daaw/avee/comp/playback/MediaPlaybackService;->getVolumeMax()I

    move-result v2

    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    invoke-virtual {v1, v2}, Lcom/daaw/avee/Common/Events/WeakEvent1;->invoke(Ljava/lang/Object;)V

    .line 357
    invoke-static {p0}, Lcom/daaw/avee/comp/playback/MediaPlaybackService;->getCardId(Landroid/content/Context;)I

    move-result v1

    iput v1, p0, Lcom/daaw/avee/comp/playback/MediaPlaybackService;->cardId:I

    .line 358
    invoke-virtual {p0, v0, v0}, Lcom/daaw/avee/comp/playback/MediaPlaybackService;->setRepeatMode(IZ)V

    const/4 v0, 0x1

    .line 359
    iput-boolean v0, p0, Lcom/daaw/avee/comp/playback/MediaPlaybackService;->serviceValidState:Z

    .line 360
    invoke-direct {p0}, Lcom/daaw/avee/comp/playback/MediaPlaybackService;->reloadPreferences()V

    .line 362
    invoke-direct {p0}, Lcom/daaw/avee/comp/playback/MediaPlaybackService;->updateServiceState()Z

    const/4 v1, 0x0

    .line 364
    invoke-direct {p0, v0, v1}, Lcom/daaw/avee/comp/playback/MediaPlaybackService;->notifyPlaystateOrMetaChanged(ZLjava/lang/String;)V

    .line 365
    sget-object v1, Lcom/daaw/avee/comp/playback/MediaPlaybackService;->onVolumeMuteChanged:Lcom/daaw/avee/Common/Events/WeakEvent1;

    invoke-direct {p0}, Lcom/daaw/avee/comp/playback/MediaPlaybackService;->getPlayer()Lcom/daaw/avee/comp/playback/IMediaPlayerCore;

    move-result-object v2

    invoke-interface {v2}, Lcom/daaw/avee/comp/playback/IMediaPlayerCore;->isMuted()Z

    move-result v2

    invoke-static {v2}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v2

    invoke-virtual {v1, v2}, Lcom/daaw/avee/Common/Events/WeakEvent1;->invoke(Ljava/lang/Object;)V

    .line 366
    sget-object v1, Lcom/daaw/avee/comp/playback/MediaPlaybackService;->onRequestTimeoutEnabled:Lcom/daaw/avee/Common/Events/WeakEventR;

    invoke-static {v0}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v0

    invoke-virtual {v1, v0}, Lcom/daaw/avee/Common/Events/WeakEventR;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Boolean;

    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v0

    .line 367
    invoke-direct {p0, v0}, Lcom/daaw/avee/comp/playback/MediaPlaybackService;->setTimeoutEnable(Z)V

    .line 369
    invoke-static {}, Lcom/daaw/avee/comp/PlaybackQueue/QueueCore;->createOrGetInstance()Lcom/daaw/avee/comp/PlaybackQueue/QueueCore;

    move-result-object v0

    iput-object v0, p0, Lcom/daaw/avee/comp/playback/MediaPlaybackService;->playbackQueueRefHolder:Ljava/lang/Object;

    return-void
.end method

.method public isPlaying()Z
    .locals 1

    .line 998
    invoke-direct {p0}, Lcom/daaw/avee/comp/playback/MediaPlaybackService;->getPlayer()Lcom/daaw/avee/comp/playback/IMediaPlayerCore;

    move-result-object v0

    invoke-interface {v0}, Lcom/daaw/avee/comp/playback/IMediaPlayerCore;->isPreparingOrStared()Z

    move-result v0

    return v0
.end method

.method public synthetic lambda$goActiveService$0$MediaPlaybackService()Landroid/os/Handler;
    .locals 1

    .line 758
    iget-boolean v0, p0, Lcom/daaw/avee/comp/playback/MediaPlaybackService;->serviceValidState:Z

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/daaw/avee/comp/playback/MediaPlaybackService;->mServiceHandler:Lcom/AOSP/MyIntentService$ServiceHandler;

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    return-object v0
.end method

.method public synthetic lambda$notifyPlaystateOrMetaChanged$1$MediaPlaybackService()Landroid/os/Handler;
    .locals 1

    .line 1139
    iget-boolean v0, p0, Lcom/daaw/avee/comp/playback/MediaPlaybackService;->serviceValidState:Z

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/daaw/avee/comp/playback/MediaPlaybackService;->mServiceHandler:Lcom/AOSP/MyIntentService$ServiceHandler;

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    return-object v0
.end method

.method mpRequestNextDataAtTime(J)V
    .locals 8

    .line 638
    iget-object v0, p0, Lcom/daaw/avee/comp/playback/MediaPlaybackService;->mServiceHandler:Lcom/AOSP/MyIntentService$ServiceHandler;

    iget v1, p0, Lcom/daaw/avee/comp/playback/MediaPlaybackService;->myRunnableNextDataSourceToken:I

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/AOSP/MyIntentService$ServiceHandler;->removeCallbacksAndMessages(Ljava/lang/Object;)V

    .line 639
    iget-object v0, p0, Lcom/daaw/avee/comp/playback/MediaPlaybackService;->mServiceHandler:Lcom/AOSP/MyIntentService$ServiceHandler;

    new-instance v7, Lcom/daaw/avee/comp/playback/MediaPlaybackService$RunnableNextDataSource;

    const/4 v5, 0x0

    const/4 v6, 0x0

    move-object v1, v7

    move-object v2, p0

    move-wide v3, p1

    invoke-direct/range {v1 .. v6}, Lcom/daaw/avee/comp/playback/MediaPlaybackService$RunnableNextDataSource;-><init>(Lcom/daaw/avee/comp/playback/MediaPlaybackService;JZLcom/daaw/avee/comp/playback/Song/PlaylistSong;)V

    iget p1, p0, Lcom/daaw/avee/comp/playback/MediaPlaybackService;->myRunnableNextDataSourceToken:I

    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p1

    const-wide/16 v1, 0x0

    invoke-virtual {v0, v7, p1, v1, v2}, Lcom/AOSP/MyIntentService$ServiceHandler;->postAtTime(Ljava/lang/Runnable;Ljava/lang/Object;J)Z

    return-void
.end method

.method mpRequestNextDataDelay(Z)V
    .locals 8

    .line 628
    iget-object v0, p0, Lcom/daaw/avee/comp/playback/MediaPlaybackService;->mServiceHandler:Lcom/AOSP/MyIntentService$ServiceHandler;

    iget v1, p0, Lcom/daaw/avee/comp/playback/MediaPlaybackService;->myRunnableNextDataSourceToken:I

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/AOSP/MyIntentService$ServiceHandler;->removeCallbacksAndMessages(Ljava/lang/Object;)V

    .line 629
    iget-object v0, p0, Lcom/daaw/avee/comp/playback/MediaPlaybackService;->mServiceHandler:Lcom/AOSP/MyIntentService$ServiceHandler;

    new-instance v7, Lcom/daaw/avee/comp/playback/MediaPlaybackService$RunnableNextDataSource;

    invoke-virtual {p0}, Lcom/daaw/avee/comp/playback/MediaPlaybackService;->getCurrentSong()Lcom/daaw/avee/comp/playback/Song/PlaylistSong;

    move-result-object v6

    const-wide/16 v3, 0x0

    move-object v1, v7

    move-object v2, p0

    move v5, p1

    invoke-direct/range {v1 .. v6}, Lcom/daaw/avee/comp/playback/MediaPlaybackService$RunnableNextDataSource;-><init>(Lcom/daaw/avee/comp/playback/MediaPlaybackService;JZLcom/daaw/avee/comp/playback/Song/PlaylistSong;)V

    iget p1, p0, Lcom/daaw/avee/comp/playback/MediaPlaybackService;->myRunnableNextDataSourceToken:I

    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p1

    invoke-static {}, Landroid/os/SystemClock;->uptimeMillis()J

    move-result-wide v1

    const-wide/16 v3, 0x3e8

    add-long/2addr v1, v3

    invoke-virtual {v0, v7, p1, v1, v2}, Lcom/AOSP/MyIntentService$ServiceHandler;->postAtTime(Ljava/lang/Runnable;Ljava/lang/Object;J)Z

    return-void
.end method

.method mpRequestNextDataNow()V
    .locals 5

    .line 633
    iget-object v0, p0, Lcom/daaw/avee/comp/playback/MediaPlaybackService;->mServiceHandler:Lcom/AOSP/MyIntentService$ServiceHandler;

    iget v1, p0, Lcom/daaw/avee/comp/playback/MediaPlaybackService;->myRunnableNextDataSourceToken:I

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/AOSP/MyIntentService$ServiceHandler;->removeCallbacksAndMessages(Ljava/lang/Object;)V

    .line 634
    iget-object v0, p0, Lcom/daaw/avee/comp/playback/MediaPlaybackService;->mServiceHandler:Lcom/AOSP/MyIntentService$ServiceHandler;

    iget-object v1, p0, Lcom/daaw/avee/comp/playback/MediaPlaybackService;->runnableNextDataSource:Lcom/daaw/avee/comp/playback/MediaPlaybackService$RunnableNextDataSource;

    iget v2, p0, Lcom/daaw/avee/comp/playback/MediaPlaybackService;->myRunnableNextDataSourceToken:I

    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    const-wide/16 v3, 0x0

    invoke-virtual {v0, v1, v2, v3, v4}, Lcom/AOSP/MyIntentService$ServiceHandler;->postAtTime(Ljava/lang/Runnable;Ljava/lang/Object;J)Z

    return-void
.end method

.method public onAudioFocusChange(I)V
    .locals 5

    const/4 v0, -0x2

    const-string v1, "pref_fadePlayPause"

    const/4 v2, 0x0

    const/4 v3, 0x1

    if-eq p1, v0, :cond_3

    const/4 v0, -0x1

    if-eq p1, v0, :cond_3

    if-eq p1, v3, :cond_0

    goto :goto_2

    .line 578
    :cond_0
    invoke-static {}, Lcom/daaw/avee/comp/AppPreferences/AppPreferences;->createOrGetInstance()Lcom/daaw/avee/comp/AppPreferences/AppPreferences;

    move-result-object p1

    invoke-virtual {p0}, Lcom/daaw/avee/comp/playback/MediaPlaybackService;->getApplicationContext()Landroid/content/Context;

    move-result-object v0

    const-string v4, "pref_resumePlayingAfterAudioFocusGained"

    invoke-virtual {p1, v0, v4, v3}, Lcom/daaw/avee/comp/AppPreferences/AppPreferences;->preferencesGetBoolSafe(Landroid/content/Context;Ljava/lang/String;Z)Z

    move-result p1

    .line 580
    iget-boolean v0, p0, Lcom/daaw/avee/comp/playback/MediaPlaybackService;->lostAudioFocusWhilePlaying:Z

    if-eqz v0, :cond_6

    if-eqz p1, :cond_6

    .line 582
    invoke-direct {p0}, Lcom/daaw/avee/comp/playback/MediaPlaybackService;->getPlayer()Lcom/daaw/avee/comp/playback/IMediaPlayerCore;

    move-result-object p1

    if-eqz p1, :cond_2

    .line 585
    invoke-static {}, Lcom/daaw/avee/comp/AppPreferences/AppPreferences;->createOrGetInstance()Lcom/daaw/avee/comp/AppPreferences/AppPreferences;

    move-result-object p1

    invoke-virtual {p0}, Lcom/daaw/avee/comp/playback/MediaPlaybackService;->getApplicationContext()Landroid/content/Context;

    move-result-object v0

    invoke-virtual {p1, v0, v1, v3}, Lcom/daaw/avee/comp/AppPreferences/AppPreferences;->preferencesGetBoolSafe(Landroid/content/Context;Ljava/lang/String;Z)Z

    move-result p1

    if-eqz p1, :cond_1

    .line 588
    iget-object p1, p0, Lcom/daaw/avee/comp/playback/MediaPlaybackService;->fadePlayer:Lcom/daaw/avee/comp/playback/FadeMediaPlayer;

    invoke-virtual {p1}, Lcom/daaw/avee/comp/playback/FadeMediaPlayer;->startFadeAll()V

    goto :goto_0

    .line 590
    :cond_1
    invoke-direct {p0}, Lcom/daaw/avee/comp/playback/MediaPlaybackService;->getPlayer()Lcom/daaw/avee/comp/playback/IMediaPlayerCore;

    move-result-object p1

    invoke-interface {p1}, Lcom/daaw/avee/comp/playback/IMediaPlayerCore;->start()V

    .line 593
    :cond_2
    :goto_0
    iput-boolean v2, p0, Lcom/daaw/avee/comp/playback/MediaPlaybackService;->lostAudioFocusWhilePlaying:Z

    goto :goto_2

    .line 605
    :cond_3
    invoke-direct {p0}, Lcom/daaw/avee/comp/playback/MediaPlaybackService;->getPlayer()Lcom/daaw/avee/comp/playback/IMediaPlayerCore;

    move-result-object p1

    if-eqz p1, :cond_5

    .line 608
    invoke-static {}, Lcom/daaw/avee/comp/AppPreferences/AppPreferences;->createOrGetInstance()Lcom/daaw/avee/comp/AppPreferences/AppPreferences;

    move-result-object p1

    invoke-virtual {p0}, Lcom/daaw/avee/comp/playback/MediaPlaybackService;->getApplicationContext()Landroid/content/Context;

    move-result-object v0

    invoke-virtual {p1, v0, v1, v3}, Lcom/daaw/avee/comp/AppPreferences/AppPreferences;->preferencesGetBoolSafe(Landroid/content/Context;Ljava/lang/String;Z)Z

    move-result p1

    .line 610
    invoke-direct {p0}, Lcom/daaw/avee/comp/playback/MediaPlaybackService;->getPlayer()Lcom/daaw/avee/comp/playback/IMediaPlayerCore;

    move-result-object v0

    invoke-interface {v0}, Lcom/daaw/avee/comp/playback/IMediaPlayerCore;->isPreparingOrStared()Z

    move-result v0

    iput-boolean v0, p0, Lcom/daaw/avee/comp/playback/MediaPlaybackService;->lostAudioFocusWhilePlaying:Z

    if-eqz p1, :cond_4

    .line 613
    iget-object p1, p0, Lcom/daaw/avee/comp/playback/MediaPlaybackService;->fadePlayer:Lcom/daaw/avee/comp/playback/FadeMediaPlayer;

    invoke-virtual {p1}, Lcom/daaw/avee/comp/playback/FadeMediaPlayer;->pauseFadeAll()V

    goto :goto_1

    .line 615
    :cond_4
    invoke-direct {p0}, Lcom/daaw/avee/comp/playback/MediaPlaybackService;->getPlayer()Lcom/daaw/avee/comp/playback/IMediaPlayerCore;

    move-result-object p1

    invoke-interface {p1}, Lcom/daaw/avee/comp/playback/IMediaPlayerCore;->pause()V

    goto :goto_1

    .line 617
    :cond_5
    iput-boolean v2, p0, Lcom/daaw/avee/comp/playback/MediaPlaybackService;->lostAudioFocusWhilePlaying:Z

    .line 620
    :goto_1
    invoke-direct {p0}, Lcom/daaw/avee/comp/playback/MediaPlaybackService;->updateServiceState()Z

    :cond_6
    :goto_2
    return-void
.end method

.method public onCreate()V
    .locals 3

    .line 269
    invoke-super {p0}, Lcom/AOSP/MyIntentService;->onCreate()V

    .line 271
    new-instance v0, Ljava/lang/ref/WeakReference;

    invoke-direct {v0, p0}, Ljava/lang/ref/WeakReference;-><init>(Ljava/lang/Object;)V

    sput-object v0, Lcom/daaw/avee/comp/playback/MediaPlaybackService;->instanceWeak:Ljava/lang/ref/WeakReference;

    .line 272
    invoke-static {}, Lcom/daaw/avee/PlayerCore;->s()Lcom/daaw/avee/PlayerCore;

    move-result-object v0

    iput-object v0, p0, Lcom/daaw/avee/comp/playback/MediaPlaybackService;->playerCoreReference:Lcom/daaw/avee/PlayerCore;

    const/4 v0, 0x0

    .line 274
    iput-boolean v0, p0, Lcom/daaw/avee/comp/playback/MediaPlaybackService;->serviceActiveForegroundState:Z

    .line 275
    invoke-virtual {p0}, Lcom/daaw/avee/comp/playback/MediaPlaybackService;->goActiveService()Z

    .line 277
    iget-object v1, p0, Lcom/daaw/avee/comp/playback/MediaPlaybackService;->taskInitializeDone:[Z

    aput-boolean v0, v1, v0

    .line 278
    iget-object v1, p0, Lcom/daaw/avee/comp/playback/MediaPlaybackService;->mServiceHandler:Lcom/AOSP/MyIntentService$ServiceHandler;

    iget-object v2, p0, Lcom/daaw/avee/comp/playback/MediaPlaybackService;->taskInitialize:Ljava/lang/Runnable;

    invoke-virtual {v1, v2}, Lcom/AOSP/MyIntentService$ServiceHandler;->post(Ljava/lang/Runnable;)Z

    .line 280
    iget-object v1, p0, Lcom/daaw/avee/comp/playback/MediaPlaybackService;->taskInitialize:Ljava/lang/Runnable;

    monitor-enter v1

    .line 281
    :try_start_0
    iget-object v2, p0, Lcom/daaw/avee/comp/playback/MediaPlaybackService;->taskInitializeDone:[Z

    aget-boolean v0, v2, v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    if-nez v0, :cond_0

    .line 283
    :try_start_1
    iget-object v0, p0, Lcom/daaw/avee/comp/playback/MediaPlaybackService;->taskInitialize:Ljava/lang/Runnable;

    invoke-virtual {v0}, Ljava/lang/Object;->wait()V
    :try_end_1
    .catch Ljava/lang/InterruptedException; {:try_start_1 .. :try_end_1} :catch_0
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    goto :goto_0

    :catch_0
    move-exception v0

    .line 285
    :try_start_2
    invoke-virtual {v0}, Ljava/lang/InterruptedException;->printStackTrace()V

    .line 288
    :cond_0
    :goto_0
    monitor-exit v1

    return-void

    :catchall_0
    move-exception v0

    monitor-exit v1
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    throw v0
.end method

.method public onDestroy()V
    .locals 3

    const/4 v0, 0x0

    .line 375
    iput-boolean v0, p0, Lcom/daaw/avee/comp/playback/MediaPlaybackService;->serviceValidState:Z

    .line 376
    sget-object v1, Lcom/daaw/avee/comp/playback/MediaPlaybackService;->onServiceDestroying:Lcom/daaw/avee/Common/Events/WeakEvent1;

    invoke-virtual {v1, p0}, Lcom/daaw/avee/Common/Events/WeakEvent1;->invoke(Ljava/lang/Object;)V

    .line 377
    iget-object v1, p0, Lcom/daaw/avee/comp/playback/MediaPlaybackService;->taskDeInitializeDone:[Z

    aput-boolean v0, v1, v0

    .line 378
    iget-object v1, p0, Lcom/daaw/avee/comp/playback/MediaPlaybackService;->mServiceHandler:Lcom/AOSP/MyIntentService$ServiceHandler;

    iget-object v2, p0, Lcom/daaw/avee/comp/playback/MediaPlaybackService;->taskDeInitialize:Ljava/lang/Runnable;

    invoke-virtual {v1, v2}, Lcom/AOSP/MyIntentService$ServiceHandler;->post(Ljava/lang/Runnable;)Z

    .line 380
    iget-object v1, p0, Lcom/daaw/avee/comp/playback/MediaPlaybackService;->taskDeInitialize:Ljava/lang/Runnable;

    monitor-enter v1

    .line 381
    :try_start_0
    iget-object v2, p0, Lcom/daaw/avee/comp/playback/MediaPlaybackService;->taskDeInitializeDone:[Z

    aget-boolean v0, v2, v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    if-nez v0, :cond_0

    .line 383
    :try_start_1
    iget-object v0, p0, Lcom/daaw/avee/comp/playback/MediaPlaybackService;->taskDeInitialize:Ljava/lang/Runnable;

    invoke-virtual {v0}, Ljava/lang/Object;->wait()V
    :try_end_1
    .catch Ljava/lang/InterruptedException; {:try_start_1 .. :try_end_1} :catch_0
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    goto :goto_0

    :catch_0
    move-exception v0

    .line 385
    :try_start_2
    invoke-virtual {v0}, Ljava/lang/InterruptedException;->printStackTrace()V

    .line 388
    :cond_0
    :goto_0
    monitor-exit v1
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    .line 390
    invoke-super {p0}, Lcom/AOSP/MyIntentService;->onDestroy()V

    const/4 v0, 0x0

    .line 391
    iput-object v0, p0, Lcom/daaw/avee/comp/playback/MediaPlaybackService;->playerCoreReference:Lcom/daaw/avee/PlayerCore;

    return-void

    :catchall_0
    move-exception v0

    .line 388
    :try_start_3
    monitor-exit v1
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_0

    throw v0
.end method

.method protected onHandleIntent(Landroid/content/Intent;)V
    .locals 14

    const/4 v0, 0x0

    if-eqz p1, :cond_0

    .line 451
    invoke-virtual {p1}, Landroid/content/Intent;->getAction()Ljava/lang/String;

    move-result-object v1

    goto :goto_0

    :cond_0
    move-object v1, v0

    :goto_0
    if-eqz v1, :cond_4

    const/4 v2, -0x1

    .line 455
    invoke-virtual {v1}, Ljava/lang/String;->hashCode()I

    move-result v3

    const/4 v4, 0x1

    const/4 v5, 0x0

    sparse-switch v3, :sswitch_data_0

    goto/16 :goto_1

    :sswitch_0
    const-string v3, "VOLUME_ACTION"

    invoke-virtual {v1, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_1

    const/4 v2, 0x4

    goto/16 :goto_1

    :sswitch_1
    const-string v3, "ACTION_HEADSET_PLUGGED_IN"

    invoke-virtual {v1, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_1

    const/16 v2, 0xb

    goto/16 :goto_1

    :sswitch_2
    const-string v3, "PAUSE_ACTION"

    invoke-virtual {v1, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_1

    const/16 v2, 0xf

    goto/16 :goto_1

    :sswitch_3
    const-string v3, "AUDIO_BECOMING_NOISY_ACTION"

    invoke-virtual {v1, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_1

    const/16 v2, 0xa

    goto/16 :goto_1

    :sswitch_4
    const-string v3, "NEXT_ACTION"

    invoke-virtual {v1, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_1

    const/16 v2, 0x11

    goto/16 :goto_1

    :sswitch_5
    const-string v3, "VOLUME_PERCENTAGE_ACTION"

    invoke-virtual {v1, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_1

    const/4 v2, 0x3

    goto/16 :goto_1

    :sswitch_6
    const-string v3, "ACTIVITY_AND_SERVICE_EXIT_ACTION"

    invoke-virtual {v1, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_1

    const/16 v2, 0x13

    goto/16 :goto_1

    :sswitch_7
    const-string v3, "PREVIOUS_ACTION"

    invoke-virtual {v1, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_1

    const/16 v2, 0x10

    goto/16 :goto_1

    :sswitch_8
    const-string v3, "VOLUME_STEREO_BALANCE_ACTION"

    invoke-virtual {v1, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_1

    const/4 v2, 0x7

    goto/16 :goto_1

    :sswitch_9
    const-string v3, "TIMEOUT_DISABLE_ACTION"

    invoke-virtual {v1, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_1

    const/16 v2, 0x14

    goto/16 :goto_1

    :sswitch_a
    const-string v3, "CROSS_FADE_VALUE_ACTION"

    invoke-virtual {v1, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_1

    const/16 v2, 0x8

    goto/16 :goto_1

    :sswitch_b
    const-string v3, "PLAY_ACTION"

    invoke-virtual {v1, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_1

    const/16 v2, 0xd

    goto/16 :goto_1

    :sswitch_c
    const-string v3, "HEADSET_ASSIST_ACTION"

    invoke-virtual {v1, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_1

    const/16 v2, 0x15

    goto :goto_1

    :sswitch_d
    const-string v3, "PLAY_DATA_SOURCE_ACTION"

    invoke-virtual {v1, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_1

    const/16 v2, 0x9

    goto :goto_1

    :sswitch_e
    const-string v3, "SET_MUTE_ACTION"

    invoke-virtual {v1, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_1

    const/4 v2, 0x5

    goto :goto_1

    :sswitch_f
    const-string v3, "VIDEO_SCALING_MODE_ACTION"

    invoke-virtual {v1, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_1

    const/4 v2, 0x2

    goto :goto_1

    :sswitch_10
    const-string v3, "STOP_ACTION"

    invoke-virtual {v1, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_1

    const/16 v2, 0xc

    goto :goto_1

    :sswitch_11
    const-string v3, "TOGGLE_MUTE_ACTION"

    invoke-virtual {v1, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_1

    const/4 v2, 0x6

    goto :goto_1

    :sswitch_12
    const-string v3, "TOGGLE_PAUSE_ACTION"

    invoke-virtual {v1, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_1

    const/16 v2, 0xe

    goto :goto_1

    :sswitch_13
    const-string v3, "SEEK_ACTION"

    invoke-virtual {v1, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_1

    const/4 v2, 0x0

    goto :goto_1

    :sswitch_14
    const-string v3, "EXIT_ACTION"

    invoke-virtual {v1, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_1

    const/16 v2, 0x12

    goto :goto_1

    :sswitch_15
    const-string v3, "REPEAT_MODE_ACTION"

    invoke-virtual {v1, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_1

    const/4 v2, 0x1

    :cond_1
    :goto_1
    const-wide/16 v6, 0x0

    const-string v1, "EXTRA_ARG_1"

    packed-switch v2, :pswitch_data_0

    goto/16 :goto_4

    .line 535
    :pswitch_0
    sget-object p1, Lcom/daaw/avee/comp/playback/MediaPlaybackService;->onHeadsetAssistAction:Lcom/daaw/avee/Common/Events/WeakEvent;

    invoke-virtual {p1}, Lcom/daaw/avee/Common/Events/WeakEvent;->invoke()V

    goto/16 :goto_4

    .line 532
    :pswitch_1
    invoke-direct {p0, v5}, Lcom/daaw/avee/comp/playback/MediaPlaybackService;->setTimeoutEnable(Z)V

    goto/16 :goto_4

    .line 528
    :pswitch_2
    sget-object p1, Lcom/daaw/avee/EventsGlobal/EventsGlobalNotificationUI;->onExitAction:Lcom/daaw/avee/Common/Events/WeakEvent;

    invoke-virtual {p1}, Lcom/daaw/avee/Common/Events/WeakEvent;->invoke()V

    .line 529
    invoke-direct {p0}, Lcom/daaw/avee/comp/playback/MediaPlaybackService;->stopService()V

    goto/16 :goto_4

    .line 525
    :pswitch_3
    invoke-direct {p0}, Lcom/daaw/avee/comp/playback/MediaPlaybackService;->stopService()V

    goto/16 :goto_4

    .line 522
    :pswitch_4
    sget-object p1, Lcom/daaw/avee/comp/playback/MediaPlaybackService;->onUINextAction:Lcom/daaw/avee/Common/Events/WeakEvent;

    invoke-virtual {p1}, Lcom/daaw/avee/Common/Events/WeakEvent;->invoke()V

    goto/16 :goto_4

    .line 519
    :pswitch_5
    sget-object p1, Lcom/daaw/avee/comp/playback/MediaPlaybackService;->onUIPrevAction:Lcom/daaw/avee/Common/Events/WeakEvent;

    invoke-virtual {p1}, Lcom/daaw/avee/Common/Events/WeakEvent;->invoke()V

    goto/16 :goto_4

    .line 516
    :pswitch_6
    invoke-virtual {p0, v5}, Lcom/daaw/avee/comp/playback/MediaPlaybackService;->pause(Z)V

    goto/16 :goto_4

    .line 513
    :pswitch_7
    invoke-virtual {p0}, Lcom/daaw/avee/comp/playback/MediaPlaybackService;->togglePause()V

    goto/16 :goto_4

    .line 510
    :pswitch_8
    invoke-virtual {p0}, Lcom/daaw/avee/comp/playback/MediaPlaybackService;->play()V

    goto/16 :goto_4

    .line 507
    :pswitch_9
    invoke-virtual {p0}, Lcom/daaw/avee/comp/playback/MediaPlaybackService;->stop()V

    goto/16 :goto_4

    .line 501
    :pswitch_a
    invoke-static {}, Lcom/daaw/avee/comp/AppPreferences/AppPreferences;->createOrGetInstance()Lcom/daaw/avee/comp/AppPreferences/AppPreferences;

    move-result-object p1

    invoke-virtual {p0}, Lcom/daaw/avee/comp/playback/MediaPlaybackService;->getApplicationContext()Landroid/content/Context;

    move-result-object v0

    const-string v1, "pref_resumeWhenHeadsetPluggedIn"

    invoke-virtual {p1, v0, v1, v4}, Lcom/daaw/avee/comp/AppPreferences/AppPreferences;->preferencesGetBoolSafe(Landroid/content/Context;Ljava/lang/String;Z)Z

    move-result p1

    .line 503
    iget-boolean v0, p0, Lcom/daaw/avee/comp/playback/MediaPlaybackService;->pausedWhenAudioBecomingNoisy:Z

    if-eqz v0, :cond_4

    if-eqz p1, :cond_4

    .line 504
    invoke-virtual {p0}, Lcom/daaw/avee/comp/playback/MediaPlaybackService;->play()V

    goto/16 :goto_4

    .line 496
    :pswitch_b
    invoke-virtual {p0, v4}, Lcom/daaw/avee/comp/playback/MediaPlaybackService;->pause(Z)V

    goto/16 :goto_4

    .line 484
    :pswitch_c
    invoke-virtual {p1, v1}, Landroid/content/Intent;->getStringExtra(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    if-eqz v1, :cond_2

    .line 485
    new-instance v2, Lcom/daaw/avee/comp/playback/Song/PlaylistSong;

    invoke-direct {v2, v1}, Lcom/daaw/avee/comp/playback/Song/PlaylistSong;-><init>(Ljava/lang/String;)V

    goto :goto_2

    :cond_2
    move-object v2, v0

    :goto_2
    const-string v1, "EXTRA_ARG_2"

    .line 486
    invoke-virtual {p1, v1, v5}, Landroid/content/Intent;->getBooleanExtra(Ljava/lang/String;Z)Z

    move-result v1

    const-string v3, "EXTRA_ARG_3"

    .line 487
    invoke-virtual {p1, v3, v6, v7}, Landroid/content/Intent;->getLongExtra(Ljava/lang/String;J)J

    move-result-wide v10

    const-string v3, "EXTRA_ARG_4"

    .line 488
    invoke-virtual {p1, v3, v6, v7}, Landroid/content/Intent;->getLongExtra(Ljava/lang/String;J)J

    move-result-wide v12

    if-eqz v2, :cond_3

    .line 490
    new-instance p1, Lcom/daaw/avee/Common/Tuple2;

    check-cast v0, Lcom/daaw/avee/comp/Common/IItemIdentifier;

    invoke-direct {p1, v2, v0}, Lcom/daaw/avee/Common/Tuple2;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    move-object v9, p1

    goto :goto_3

    :cond_3
    move-object v9, v0

    .line 492
    :goto_3
    invoke-direct {p0, v1}, Lcom/daaw/avee/comp/playback/MediaPlaybackService;->setWantsPlaying(Z)V

    move-object v8, p0

    .line 493
    invoke-virtual/range {v8 .. v13}, Lcom/daaw/avee/comp/playback/MediaPlaybackService;->openAndPlaySongIndex(Lcom/daaw/avee/Common/Tuple2;JJ)V

    goto :goto_4

    :pswitch_d
    const/high16 v0, -0x40800000    # -1.0f

    .line 481
    invoke-virtual {p1, v1, v0}, Landroid/content/Intent;->getFloatExtra(Ljava/lang/String;F)F

    move-result p1

    invoke-virtual {p0, p1}, Lcom/daaw/avee/comp/playback/MediaPlaybackService;->setCrossFadeValue(F)V

    goto :goto_4

    :pswitch_e
    const/4 v0, 0x0

    .line 478
    invoke-virtual {p1, v1, v0}, Landroid/content/Intent;->getFloatExtra(Ljava/lang/String;F)F

    move-result p1

    invoke-virtual {p0, p1}, Lcom/daaw/avee/comp/playback/MediaPlaybackService;->setVolumeStereoBalance(F)V

    goto :goto_4

    .line 475
    :pswitch_f
    invoke-virtual {p0}, Lcom/daaw/avee/comp/playback/MediaPlaybackService;->toggleVolumeMute()V

    goto :goto_4

    .line 472
    :pswitch_10
    invoke-virtual {p1, v1, v5}, Landroid/content/Intent;->getBooleanExtra(Ljava/lang/String;Z)Z

    move-result p1

    invoke-virtual {p0, p1}, Lcom/daaw/avee/comp/playback/MediaPlaybackService;->setVolumeMute(Z)V

    goto :goto_4

    .line 469
    :pswitch_11
    invoke-virtual {p1, v1, v5}, Landroid/content/Intent;->getIntExtra(Ljava/lang/String;I)I

    move-result p1

    invoke-virtual {p0, p1}, Lcom/daaw/avee/comp/playback/MediaPlaybackService;->setVolume(I)V

    goto :goto_4

    :pswitch_12
    const/high16 v0, 0x41a00000    # 20.0f

    .line 466
    invoke-virtual {p1, v1, v0}, Landroid/content/Intent;->getFloatExtra(Ljava/lang/String;F)F

    move-result p1

    invoke-virtual {p0, p1}, Lcom/daaw/avee/comp/playback/MediaPlaybackService;->setVolumePercentage(F)V

    goto :goto_4

    .line 463
    :pswitch_13
    invoke-virtual {p1, v1, v5}, Landroid/content/Intent;->getIntExtra(Ljava/lang/String;I)I

    move-result p1

    invoke-virtual {p0, p1}, Lcom/daaw/avee/comp/playback/MediaPlaybackService;->setVideoScalingMode(I)V

    goto :goto_4

    .line 460
    :pswitch_14
    invoke-virtual {p1, v1, v5}, Landroid/content/Intent;->getIntExtra(Ljava/lang/String;I)I

    move-result p1

    invoke-virtual {p0, p1, v4}, Lcom/daaw/avee/comp/playback/MediaPlaybackService;->setRepeatMode(IZ)V

    goto :goto_4

    .line 457
    :pswitch_15
    invoke-virtual {p1, v1, v6, v7}, Landroid/content/Intent;->getLongExtra(Ljava/lang/String;J)J

    move-result-wide v0

    invoke-virtual {p0, v0, v1}, Lcom/daaw/avee/comp/playback/MediaPlaybackService;->seek(J)V

    :cond_4
    :goto_4
    return-void

    :sswitch_data_0
    .sparse-switch
        -0x7d046052 -> :sswitch_15
        -0x73841f89 -> :sswitch_14
        -0x68720e23 -> :sswitch_13
        -0x63ec9836 -> :sswitch_12
        -0x4ece094f -> :sswitch_11
        -0x461236ed -> :sswitch_10
        -0x45125e6a -> :sswitch_f
        -0x3fa66d61 -> :sswitch_e
        -0x37273a10 -> :sswitch_d
        -0x1d6f3251 -> :sswitch_c
        -0x1bdf565f -> :sswitch_b
        -0x12ce5098 -> :sswitch_a
        0x5e1da4b -> :sswitch_9
        0x1e4108db -> :sswitch_8
        0x2167d07e -> :sswitch_7
        0x35f74e15 -> :sswitch_6
        0x55c7c196 -> :sswitch_5
        0x57154502 -> :sswitch_4
        0x74999c59 -> :sswitch_3
        0x780b24bf -> :sswitch_2
        0x7a4ce692 -> :sswitch_1
        0x7c96c2fb -> :sswitch_0
    .end sparse-switch

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_15
        :pswitch_14
        :pswitch_13
        :pswitch_12
        :pswitch_11
        :pswitch_10
        :pswitch_f
        :pswitch_e
        :pswitch_d
        :pswitch_c
        :pswitch_b
        :pswitch_a
        :pswitch_9
        :pswitch_8
        :pswitch_7
        :pswitch_6
        :pswitch_5
        :pswitch_4
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method

.method public onStart(Landroid/content/Intent;I)V
    .locals 0

    .line 443
    iput p2, p0, Lcom/daaw/avee/comp/playback/MediaPlaybackService;->lastestStartId:I

    .line 444
    invoke-super {p0, p1, p2}, Lcom/AOSP/MyIntentService;->onStart(Landroid/content/Intent;I)V

    return-void
.end method

.method public onStartCommand(Landroid/content/Intent;II)I
    .locals 0

    .line 293
    invoke-virtual {p0}, Lcom/daaw/avee/comp/playback/MediaPlaybackService;->goActiveService()Z

    .line 294
    invoke-super {p0, p1, p2, p3}, Lcom/AOSP/MyIntentService;->onStartCommand(Landroid/content/Intent;II)I

    move-result p1

    return p1
.end method

.method public openAndPlaySongIndex(Lcom/daaw/avee/Common/Tuple2;)V
    .locals 6
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/daaw/avee/Common/Tuple2<",
            "Lcom/daaw/avee/comp/playback/Song/PlaylistSong;",
            "Lcom/daaw/avee/comp/Common/IItemIdentifier;",
            ">;)V"
        }
    .end annotation

    const-wide/16 v2, 0x0

    const-wide/16 v4, 0x0

    move-object v0, p0

    move-object v1, p1

    .line 820
    invoke-virtual/range {v0 .. v5}, Lcom/daaw/avee/comp/playback/MediaPlaybackService;->openAndPlaySongIndex(Lcom/daaw/avee/Common/Tuple2;JJ)V

    return-void
.end method

.method public openAndPlaySongIndex(Lcom/daaw/avee/Common/Tuple2;J)V
    .locals 6
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/daaw/avee/Common/Tuple2<",
            "Lcom/daaw/avee/comp/playback/Song/PlaylistSong;",
            "Lcom/daaw/avee/comp/Common/IItemIdentifier;",
            ">;J)V"
        }
    .end annotation

    const-wide/16 v4, 0x0

    move-object v0, p0

    move-object v1, p1

    move-wide v2, p2

    .line 824
    invoke-virtual/range {v0 .. v5}, Lcom/daaw/avee/comp/playback/MediaPlaybackService;->openAndPlaySongIndex(Lcom/daaw/avee/Common/Tuple2;JJ)V

    return-void
.end method

.method public openAndPlaySongIndex(Lcom/daaw/avee/Common/Tuple2;JJ)V
    .locals 7
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/daaw/avee/Common/Tuple2<",
            "Lcom/daaw/avee/comp/playback/Song/PlaylistSong;",
            "Lcom/daaw/avee/comp/Common/IItemIdentifier;",
            ">;JJ)V"
        }
    .end annotation

    const-wide/16 v0, 0x64

    .line 828
    invoke-direct {p0, v0, v1}, Lcom/daaw/avee/comp/playback/MediaPlaybackService;->queuePositionRefresh(J)V

    const/4 v0, 0x0

    .line 829
    iput-boolean v0, p0, Lcom/daaw/avee/comp/playback/MediaPlaybackService;->lostAudioFocusWhilePlaying:Z

    .line 830
    iput-boolean v0, p0, Lcom/daaw/avee/comp/playback/MediaPlaybackService;->pausedWhenAudioBecomingNoisy:Z

    .line 831
    iget-object v1, p0, Lcom/daaw/avee/comp/playback/MediaPlaybackService;->mServiceHandler:Lcom/AOSP/MyIntentService$ServiceHandler;

    iget v2, p0, Lcom/daaw/avee/comp/playback/MediaPlaybackService;->myRunnableNextDataSourceToken:I

    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    invoke-virtual {v1, v2}, Lcom/AOSP/MyIntentService$ServiceHandler;->removeCallbacksAndMessages(Ljava/lang/Object;)V

    .line 833
    iput-boolean v0, p0, Lcom/daaw/avee/comp/playback/MediaPlaybackService;->openedSongIsPreview:Z

    .line 834
    iput-object p1, p0, Lcom/daaw/avee/comp/playback/MediaPlaybackService;->openedEntry:Lcom/daaw/avee/Common/Tuple2;

    .line 836
    invoke-virtual {p0}, Lcom/daaw/avee/comp/playback/MediaPlaybackService;->getCurrentSong()Lcom/daaw/avee/comp/playback/Song/PlaylistSong;

    move-result-object p1

    if-eqz p1, :cond_1

    const-wide/16 v0, 0x0

    cmp-long v2, p4, v0

    if-gtz v2, :cond_0

    .line 840
    iget-object p4, p0, Lcom/daaw/avee/comp/playback/MediaPlaybackService;->fadePlayer:Lcom/daaw/avee/comp/playback/FadeMediaPlayer;

    invoke-virtual {p1}, Lcom/daaw/avee/comp/playback/Song/PlaylistSong;->getMediaDataSource()Lcom/daaw/avee/comp/playback/Song/IMediaDataSource;

    move-result-object p1

    iget-boolean p5, p0, Lcom/daaw/avee/comp/playback/MediaPlaybackService;->wantsPlay:Z

    invoke-virtual {p4, p1, p5, p2, p3}, Lcom/daaw/avee/comp/playback/FadeMediaPlayer;->playNext(Lcom/daaw/avee/comp/playback/Song/IMediaDataSource;ZJ)V

    goto :goto_0

    .line 843
    :cond_0
    iget-object v0, p0, Lcom/daaw/avee/comp/playback/MediaPlaybackService;->fadePlayer:Lcom/daaw/avee/comp/playback/FadeMediaPlayer;

    invoke-virtual {p1}, Lcom/daaw/avee/comp/playback/Song/PlaylistSong;->getMediaDataSource()Lcom/daaw/avee/comp/playback/Song/IMediaDataSource;

    move-result-object v1

    iget-boolean v2, p0, Lcom/daaw/avee/comp/playback/MediaPlaybackService;->wantsPlay:Z

    move-wide v3, p2

    move-wide v5, p4

    invoke-virtual/range {v0 .. v6}, Lcom/daaw/avee/comp/playback/FadeMediaPlayer;->playNextAtTime(Lcom/daaw/avee/comp/playback/Song/IMediaDataSource;ZJJ)V

    :goto_0
    const/4 p1, 0x1

    const/4 p2, 0x0

    .line 847
    invoke-direct {p0, p1, p2}, Lcom/daaw/avee/comp/playback/MediaPlaybackService;->notifyPlaystateOrMetaChanged(ZLjava/lang/String;)V

    goto :goto_1

    .line 849
    :cond_1
    iget-object p1, p0, Lcom/daaw/avee/comp/playback/MediaPlaybackService;->fadePlayer:Lcom/daaw/avee/comp/playback/FadeMediaPlayer;

    invoke-virtual {p1}, Lcom/daaw/avee/comp/playback/FadeMediaPlayer;->stop()V

    :goto_1
    return-void
.end method

.method public pause(Z)V
    .locals 4

    const/4 v0, 0x1

    const/4 v1, 0x0

    if-eqz p1, :cond_0

    .line 961
    invoke-virtual {p0}, Lcom/daaw/avee/comp/playback/MediaPlaybackService;->wantsPlaying()Z

    move-result p1

    if-eqz p1, :cond_0

    const/4 p1, 0x1

    goto :goto_0

    :cond_0
    const/4 p1, 0x0

    :goto_0
    iput-boolean p1, p0, Lcom/daaw/avee/comp/playback/MediaPlaybackService;->pausedWhenAudioBecomingNoisy:Z

    .line 963
    invoke-direct {p0, v1}, Lcom/daaw/avee/comp/playback/MediaPlaybackService;->setWantsPlaying(Z)V

    const-wide/16 v2, 0x64

    .line 964
    invoke-direct {p0, v2, v3}, Lcom/daaw/avee/comp/playback/MediaPlaybackService;->queuePositionRefresh(J)V

    .line 965
    iput-boolean v1, p0, Lcom/daaw/avee/comp/playback/MediaPlaybackService;->lostAudioFocusWhilePlaying:Z

    .line 968
    invoke-static {}, Lcom/daaw/avee/comp/AppPreferences/AppPreferences;->createOrGetInstance()Lcom/daaw/avee/comp/AppPreferences/AppPreferences;

    move-result-object p1

    invoke-virtual {p0}, Lcom/daaw/avee/comp/playback/MediaPlaybackService;->getApplicationContext()Landroid/content/Context;

    move-result-object v1

    const-string v2, "pref_fadePlayPause"

    invoke-virtual {p1, v1, v2, v0}, Lcom/daaw/avee/comp/AppPreferences/AppPreferences;->preferencesGetBoolSafe(Landroid/content/Context;Ljava/lang/String;Z)Z

    move-result p1

    if-eqz p1, :cond_1

    .line 971
    iget-object p1, p0, Lcom/daaw/avee/comp/playback/MediaPlaybackService;->fadePlayer:Lcom/daaw/avee/comp/playback/FadeMediaPlayer;

    invoke-virtual {p1}, Lcom/daaw/avee/comp/playback/FadeMediaPlayer;->pauseFadeAll()V

    goto :goto_1

    .line 973
    :cond_1
    invoke-direct {p0}, Lcom/daaw/avee/comp/playback/MediaPlaybackService;->getPlayer()Lcom/daaw/avee/comp/playback/IMediaPlayerCore;

    move-result-object p1

    invoke-interface {p1}, Lcom/daaw/avee/comp/playback/IMediaPlayerCore;->pause()V

    :goto_1
    return-void
.end method

.method public play()V
    .locals 4

    const/4 v0, 0x1

    .line 941
    invoke-direct {p0, v0}, Lcom/daaw/avee/comp/playback/MediaPlaybackService;->setWantsPlaying(Z)V

    const-wide/16 v1, 0x64

    .line 942
    invoke-direct {p0, v1, v2}, Lcom/daaw/avee/comp/playback/MediaPlaybackService;->queuePositionRefresh(J)V

    const/4 v1, 0x0

    .line 943
    iput-boolean v1, p0, Lcom/daaw/avee/comp/playback/MediaPlaybackService;->lostAudioFocusWhilePlaying:Z

    .line 944
    iput-boolean v1, p0, Lcom/daaw/avee/comp/playback/MediaPlaybackService;->pausedWhenAudioBecomingNoisy:Z

    .line 946
    invoke-direct {p0}, Lcom/daaw/avee/comp/playback/MediaPlaybackService;->getPlayer()Lcom/daaw/avee/comp/playback/IMediaPlayerCore;

    move-result-object v1

    invoke-interface {v1}, Lcom/daaw/avee/comp/playback/IMediaPlayerCore;->isPreparingOrAbove()Z

    move-result v1

    if-nez v1, :cond_0

    .line 948
    iget-object v1, p0, Lcom/daaw/avee/comp/playback/MediaPlaybackService;->openedEntry:Lcom/daaw/avee/Common/Tuple2;

    invoke-virtual {p0, v1}, Lcom/daaw/avee/comp/playback/MediaPlaybackService;->openAndPlaySongIndex(Lcom/daaw/avee/Common/Tuple2;)V

    .line 952
    :cond_0
    invoke-static {}, Lcom/daaw/avee/comp/AppPreferences/AppPreferences;->createOrGetInstance()Lcom/daaw/avee/comp/AppPreferences/AppPreferences;

    move-result-object v1

    invoke-virtual {p0}, Lcom/daaw/avee/comp/playback/MediaPlaybackService;->getApplicationContext()Landroid/content/Context;

    move-result-object v2

    const-string v3, "pref_fadePlayPause"

    invoke-virtual {v1, v2, v3, v0}, Lcom/daaw/avee/comp/AppPreferences/AppPreferences;->preferencesGetBoolSafe(Landroid/content/Context;Ljava/lang/String;Z)Z

    move-result v0

    if-eqz v0, :cond_1

    .line 955
    iget-object v0, p0, Lcom/daaw/avee/comp/playback/MediaPlaybackService;->fadePlayer:Lcom/daaw/avee/comp/playback/FadeMediaPlayer;

    invoke-virtual {v0}, Lcom/daaw/avee/comp/playback/FadeMediaPlayer;->startFadeAll()V

    goto :goto_0

    .line 957
    :cond_1
    invoke-direct {p0}, Lcom/daaw/avee/comp/playback/MediaPlaybackService;->getPlayer()Lcom/daaw/avee/comp/playback/IMediaPlayerCore;

    move-result-object v0

    invoke-interface {v0}, Lcom/daaw/avee/comp/playback/IMediaPlayerCore;->start()V

    :goto_0
    return-void
.end method

.method public position()J
    .locals 2

    .line 1048
    invoke-direct {p0}, Lcom/daaw/avee/comp/playback/MediaPlaybackService;->getPlayer()Lcom/daaw/avee/comp/playback/IMediaPlayerCore;

    move-result-object v0

    if-nez v0, :cond_0

    const-wide/16 v0, 0x0

    return-wide v0

    .line 1050
    :cond_0
    invoke-interface {v0}, Lcom/daaw/avee/comp/playback/IMediaPlayerCore;->position()J

    move-result-wide v0

    return-wide v0
.end method

.method public positionSafe()J
    .locals 2

    .line 1054
    invoke-direct {p0}, Lcom/daaw/avee/comp/playback/MediaPlaybackService;->getPlayer()Lcom/daaw/avee/comp/playback/IMediaPlayerCore;

    move-result-object v0

    if-nez v0, :cond_0

    const-wide/16 v0, 0x0

    return-wide v0

    .line 1055
    :cond_0
    invoke-direct {p0}, Lcom/daaw/avee/comp/playback/MediaPlaybackService;->getPlayer()Lcom/daaw/avee/comp/playback/IMediaPlayerCore;

    move-result-object v0

    invoke-interface {v0}, Lcom/daaw/avee/comp/playback/IMediaPlayerCore;->position()J

    move-result-wide v0

    return-wide v0
.end method

.method public previewOpen(Ljava/util/List;I)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "Lcom/daaw/avee/comp/playback/Song/PlaylistSong;",
            ">;I)V"
        }
    .end annotation

    const/4 p2, 0x0

    .line 816
    invoke-interface {p1, p2}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lcom/daaw/avee/comp/playback/Song/PlaylistSong;

    invoke-virtual {p0, p1, p2}, Lcom/daaw/avee/comp/playback/MediaPlaybackService;->previewOpenAndPlaySong(Lcom/daaw/avee/comp/playback/Song/PlaylistSong;Z)V

    return-void
.end method

.method public previewOpenAndPlaySong(Lcom/daaw/avee/comp/playback/Song/PlaylistSong;Z)V
    .locals 4

    const/4 v0, 0x1

    .line 854
    iput-boolean v0, p0, Lcom/daaw/avee/comp/playback/MediaPlaybackService;->openedSongIsPreview:Z

    .line 855
    new-instance v1, Lcom/daaw/avee/Common/Tuple2;

    new-instance v2, Lcom/daaw/avee/comp/PlaybackQueue/QueueItemIdentifier;

    invoke-direct {v2}, Lcom/daaw/avee/comp/PlaybackQueue/QueueItemIdentifier;-><init>()V

    invoke-direct {v1, p1, v2}, Lcom/daaw/avee/Common/Tuple2;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    iput-object v1, p0, Lcom/daaw/avee/comp/playback/MediaPlaybackService;->openedEntry:Lcom/daaw/avee/Common/Tuple2;

    .line 857
    invoke-virtual {p0}, Lcom/daaw/avee/comp/playback/MediaPlaybackService;->getCurrentSong()Lcom/daaw/avee/comp/playback/Song/PlaylistSong;

    move-result-object p1

    if-eqz p1, :cond_0

    .line 859
    iget-object v1, p0, Lcom/daaw/avee/comp/playback/MediaPlaybackService;->fadePlayer:Lcom/daaw/avee/comp/playback/FadeMediaPlayer;

    invoke-virtual {p1}, Lcom/daaw/avee/comp/playback/Song/PlaylistSong;->getMediaDataSource()Lcom/daaw/avee/comp/playback/Song/IMediaDataSource;

    move-result-object p1

    xor-int/2addr p2, v0

    const-wide/16 v2, 0x0

    invoke-virtual {v1, p1, p2, v2, v3}, Lcom/daaw/avee/comp/playback/FadeMediaPlayer;->playNext(Lcom/daaw/avee/comp/playback/Song/IMediaDataSource;ZJ)V

    const/4 p1, 0x0

    .line 862
    invoke-direct {p0, v0, p1}, Lcom/daaw/avee/comp/playback/MediaPlaybackService;->notifyPlaystateOrMetaChanged(ZLjava/lang/String;)V

    goto :goto_0

    .line 864
    :cond_0
    iget-object p1, p0, Lcom/daaw/avee/comp/playback/MediaPlaybackService;->fadePlayer:Lcom/daaw/avee/comp/playback/FadeMediaPlayer;

    invoke-virtual {p1}, Lcom/daaw/avee/comp/playback/FadeMediaPlayer;->stop()V

    :goto_0
    return-void
.end method

.method public requestAudioFocus()Z
    .locals 3

    .line 643
    iget-object v0, p0, Lcom/daaw/avee/comp/playback/MediaPlaybackService;->audioManager:Landroid/media/AudioManager;

    const/4 v1, 0x1

    const/4 v2, 0x3

    invoke-virtual {v0, p0, v2, v1}, Landroid/media/AudioManager;->requestAudioFocus(Landroid/media/AudioManager$OnAudioFocusChangeListener;II)I

    move-result v0

    if-ne v0, v1, :cond_0

    .line 647
    iput-boolean v1, p0, Lcom/daaw/avee/comp/playback/MediaPlaybackService;->haveAudioFocus:Z

    return v1

    :cond_0
    const-string v0, "requestAudioFocus failed"

    .line 650
    invoke-static {v0}, Lcom/daaw/avee/Common/tlog;->w(Ljava/lang/String;)V

    const/4 v0, 0x0

    .line 653
    iput-boolean v0, p0, Lcom/daaw/avee/comp/playback/MediaPlaybackService;->haveAudioFocus:Z

    return v0
.end method

.method public requestAudioLowerFocus()V
    .locals 2

    .line 658
    iget-boolean v0, p0, Lcom/daaw/avee/comp/playback/MediaPlaybackService;->haveAudioFocus:Z

    if-eqz v0, :cond_2

    iget-boolean v0, p0, Lcom/daaw/avee/comp/playback/MediaPlaybackService;->lostAudioFocusWhilePlaying:Z

    if-eqz v0, :cond_0

    goto :goto_0

    .line 660
    :cond_0
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "requestAudioLowerFocus, haveAudioFocus: "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-boolean v1, p0, Lcom/daaw/avee/comp/playback/MediaPlaybackService;->haveAudioFocus:Z

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    const-string v1, "; lostAudioFocusWhilePlaying: "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-boolean v1, p0, Lcom/daaw/avee/comp/playback/MediaPlaybackService;->lostAudioFocusWhilePlaying:Z

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lcom/daaw/avee/Common/tlog;->d(Ljava/lang/String;)V

    .line 661
    iget-object v0, p0, Lcom/daaw/avee/comp/playback/MediaPlaybackService;->audioManager:Landroid/media/AudioManager;

    const/4 v1, 0x3

    invoke-virtual {v0, p0, v1, v1}, Landroid/media/AudioManager;->requestAudioFocus(Landroid/media/AudioManager$OnAudioFocusChangeListener;II)I

    move-result v0

    const/4 v1, 0x1

    if-ne v0, v1, :cond_1

    goto :goto_0

    :cond_1
    const-string v0, "requestAudioLowerFocus failed"

    .line 668
    invoke-static {v0}, Lcom/daaw/avee/Common/tlog;->w(Ljava/lang/String;)V

    :cond_2
    :goto_0
    return-void
.end method

.method public resetVisualizerThSafe()V
    .locals 2

    .line 1343
    iget-object v0, p0, Lcom/daaw/avee/comp/playback/MediaPlaybackService;->mServiceHandler:Lcom/AOSP/MyIntentService$ServiceHandler;

    new-instance v1, Lcom/daaw/avee/comp/playback/MediaPlaybackService$14;

    invoke-direct {v1, p0}, Lcom/daaw/avee/comp/playback/MediaPlaybackService$14;-><init>(Lcom/daaw/avee/comp/playback/MediaPlaybackService;)V

    invoke-virtual {v0, v1}, Lcom/AOSP/MyIntentService$ServiceHandler;->post(Ljava/lang/Runnable;)Z

    return-void
.end method

.method restartMediaPlayerCore()V
    .locals 2

    .line 882
    invoke-virtual {p0}, Lcom/daaw/avee/comp/playback/MediaPlaybackService;->getSelectedMediaPlayerCoreIndex()I

    move-result v0

    const/4 v1, 0x1

    invoke-direct {p0, v0, v1}, Lcom/daaw/avee/comp/playback/MediaPlaybackService;->selectMediaPlayerCoreIndex(IZ)V

    return-void
.end method

.method public restartMediaPlayerCoreThSafe()V
    .locals 2

    .line 886
    iget-object v0, p0, Lcom/daaw/avee/comp/playback/MediaPlaybackService;->mServiceHandler:Lcom/AOSP/MyIntentService$ServiceHandler;

    new-instance v1, Lcom/daaw/avee/comp/playback/MediaPlaybackService$8;

    invoke-direct {v1, p0}, Lcom/daaw/avee/comp/playback/MediaPlaybackService$8;-><init>(Lcom/daaw/avee/comp/playback/MediaPlaybackService;)V

    invoke-virtual {v0, v1}, Lcom/AOSP/MyIntentService$ServiceHandler;->post(Ljava/lang/Runnable;)Z

    return-void
.end method

.method public savePreferencesThSafe()V
    .locals 2

    .line 1068
    iget-object v0, p0, Lcom/daaw/avee/comp/playback/MediaPlaybackService;->mServiceHandler:Lcom/AOSP/MyIntentService$ServiceHandler;

    new-instance v1, Lcom/daaw/avee/comp/playback/MediaPlaybackService$10;

    invoke-direct {v1, p0}, Lcom/daaw/avee/comp/playback/MediaPlaybackService$10;-><init>(Lcom/daaw/avee/comp/playback/MediaPlaybackService;)V

    invoke-virtual {v0, v1}, Lcom/AOSP/MyIntentService$ServiceHandler;->post(Ljava/lang/Runnable;)Z

    return-void
.end method

.method public seek(J)V
    .locals 3

    const/4 v0, 0x0

    .line 1059
    iput-boolean v0, p0, Lcom/daaw/avee/comp/playback/MediaPlaybackService;->lostAudioFocusWhilePlaying:Z

    .line 1060
    iput-boolean v0, p0, Lcom/daaw/avee/comp/playback/MediaPlaybackService;->pausedWhenAudioBecomingNoisy:Z

    .line 1061
    invoke-direct {p0}, Lcom/daaw/avee/comp/playback/MediaPlaybackService;->getPlayer()Lcom/daaw/avee/comp/playback/IMediaPlayerCore;

    move-result-object v0

    if-nez v0, :cond_0

    return-void

    :cond_0
    const-wide/16 v0, 0x0

    cmp-long v2, p1, v0

    if-gez v2, :cond_1

    move-wide p1, v0

    .line 1063
    :cond_1
    invoke-direct {p0}, Lcom/daaw/avee/comp/playback/MediaPlaybackService;->getPlayer()Lcom/daaw/avee/comp/playback/IMediaPlayerCore;

    move-result-object v0

    invoke-interface {v0}, Lcom/daaw/avee/comp/playback/IMediaPlayerCore;->duration()J

    move-result-wide v0

    cmp-long v2, p1, v0

    if-lez v2, :cond_2

    invoke-direct {p0}, Lcom/daaw/avee/comp/playback/MediaPlaybackService;->getPlayer()Lcom/daaw/avee/comp/playback/IMediaPlayerCore;

    move-result-object p1

    invoke-interface {p1}, Lcom/daaw/avee/comp/playback/IMediaPlayerCore;->duration()J

    move-result-wide p1

    .line 1064
    :cond_2
    invoke-direct {p0}, Lcom/daaw/avee/comp/playback/MediaPlaybackService;->getPlayer()Lcom/daaw/avee/comp/playback/IMediaPlayerCore;

    move-result-object v0

    invoke-interface {v0, p1, p2}, Lcom/daaw/avee/comp/playback/IMediaPlayerCore;->seek(J)V

    return-void
.end method

.method public selectMediaPlayerCoreIndexThSafe(I)V
    .locals 2

    .line 895
    iget-object v0, p0, Lcom/daaw/avee/comp/playback/MediaPlaybackService;->mServiceHandler:Lcom/AOSP/MyIntentService$ServiceHandler;

    new-instance v1, Lcom/daaw/avee/comp/playback/MediaPlaybackService$9;

    invoke-direct {v1, p0, p1}, Lcom/daaw/avee/comp/playback/MediaPlaybackService$9;-><init>(Lcom/daaw/avee/comp/playback/MediaPlaybackService;I)V

    invoke-virtual {v0, v1}, Lcom/AOSP/MyIntentService$ServiceHandler;->post(Ljava/lang/Runnable;)Z

    return-void
.end method

.method public setCrossFadeValue(F)V
    .locals 3

    .line 1333
    iget-object v0, p0, Lcom/daaw/avee/comp/playback/MediaPlaybackService;->fadePlayer:Lcom/daaw/avee/comp/playback/FadeMediaPlayer;

    const/high16 v1, 0x447a0000    # 1000.0f

    mul-float p1, p1, v1

    float-to-long v1, p1

    invoke-virtual {v0, v1, v2}, Lcom/daaw/avee/comp/playback/FadeMediaPlayer;->setCrossFade(J)V

    return-void
.end method

.method public setEqualizerSettingsThSafe(Lcom/daaw/avee/comp/playback/BaseEqualizerEffect$EqualizerSettings;)V
    .locals 2

    .line 1375
    iget-object v0, p0, Lcom/daaw/avee/comp/playback/MediaPlaybackService;->mServiceHandler:Lcom/AOSP/MyIntentService$ServiceHandler;

    new-instance v1, Lcom/daaw/avee/comp/playback/MediaPlaybackService$16;

    invoke-direct {v1, p0, p1}, Lcom/daaw/avee/comp/playback/MediaPlaybackService$16;-><init>(Lcom/daaw/avee/comp/playback/MediaPlaybackService;Lcom/daaw/avee/comp/playback/BaseEqualizerEffect$EqualizerSettings;)V

    invoke-virtual {v0, v1}, Lcom/AOSP/MyIntentService$ServiceHandler;->post(Ljava/lang/Runnable;)Z

    return-void
.end method

.method public setRepeatMode(IZ)V
    .locals 1

    .line 800
    iget v0, p0, Lcom/daaw/avee/comp/playback/MediaPlaybackService;->repeatMode:I

    if-ne v0, p1, :cond_0

    return-void

    .line 801
    :cond_0
    iput p1, p0, Lcom/daaw/avee/comp/playback/MediaPlaybackService;->repeatMode:I

    if-eqz p2, :cond_3

    if-nez p1, :cond_1

    const p1, 0x7f10010e

    .line 805
    invoke-virtual {p0, p1}, Lcom/daaw/avee/comp/playback/MediaPlaybackService;->getString(I)Ljava/lang/String;

    move-result-object p1

    invoke-direct {p0, p1}, Lcom/daaw/avee/comp/playback/MediaPlaybackService;->notifyMessage(Ljava/lang/String;)V

    goto :goto_0

    :cond_1
    const/4 p2, 0x1

    if-ne p1, p2, :cond_2

    const p1, 0x7f10010d

    .line 807
    invoke-virtual {p0, p1}, Lcom/daaw/avee/comp/playback/MediaPlaybackService;->getString(I)Ljava/lang/String;

    move-result-object p1

    invoke-direct {p0, p1}, Lcom/daaw/avee/comp/playback/MediaPlaybackService;->notifyMessage(Ljava/lang/String;)V

    goto :goto_0

    :cond_2
    const/4 p2, 0x2

    if-ne p1, p2, :cond_3

    const p1, 0x7f10010c

    .line 809
    invoke-virtual {p0, p1}, Lcom/daaw/avee/comp/playback/MediaPlaybackService;->getString(I)Ljava/lang/String;

    move-result-object p1

    invoke-direct {p0, p1}, Lcom/daaw/avee/comp/playback/MediaPlaybackService;->notifyMessage(Ljava/lang/String;)V

    .line 812
    :cond_3
    :goto_0
    sget-object p1, Lcom/daaw/avee/comp/playback/MediaPlaybackService;->onRepeatModeChanged:Lcom/daaw/avee/Common/Events/WeakEvent1;

    iget p2, p0, Lcom/daaw/avee/comp/playback/MediaPlaybackService;->repeatMode:I

    invoke-static {p2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p2

    invoke-virtual {p1, p2}, Lcom/daaw/avee/Common/Events/WeakEvent1;->invoke(Ljava/lang/Object;)V

    return-void
.end method

.method public setTimeoutEnableThSafe(Z)V
    .locals 2

    .line 709
    iget-object v0, p0, Lcom/daaw/avee/comp/playback/MediaPlaybackService;->mServiceHandler:Lcom/AOSP/MyIntentService$ServiceHandler;

    new-instance v1, Lcom/daaw/avee/comp/playback/MediaPlaybackService$7;

    invoke-direct {v1, p0, p1}, Lcom/daaw/avee/comp/playback/MediaPlaybackService$7;-><init>(Lcom/daaw/avee/comp/playback/MediaPlaybackService;Z)V

    invoke-virtual {v0, v1}, Lcom/AOSP/MyIntentService$ServiceHandler;->post(Ljava/lang/Runnable;)Z

    return-void
.end method

.method public setVideoScalingMode(I)V
    .locals 1

    .line 1274
    iget-object v0, p0, Lcom/daaw/avee/comp/playback/MediaPlaybackService;->fadePlayer:Lcom/daaw/avee/comp/playback/FadeMediaPlayer;

    invoke-virtual {v0}, Lcom/daaw/avee/comp/playback/FadeMediaPlayer;->getMediaPlayerCore()Lcom/daaw/avee/comp/playback/IMediaPlayerCore;

    move-result-object v0

    invoke-interface {v0, p1}, Lcom/daaw/avee/comp/playback/IMediaPlayerCore;->setVideoScalingMode(I)V

    .line 1275
    invoke-virtual {p0}, Lcom/daaw/avee/comp/playback/MediaPlaybackService;->getSelectedMediaPlayerCoreIndex()I

    move-result p1

    const/4 v0, 0x1

    if-ne p1, v0, :cond_0

    .line 1276
    invoke-virtual {p0}, Lcom/daaw/avee/comp/playback/MediaPlaybackService;->restartMediaPlayerCore()V

    :cond_0
    return-void
.end method

.method public setVideoSurfaceHolderThSafe(Landroid/view/SurfaceHolder;)V
    .locals 2

    .line 1284
    iget-object v0, p0, Lcom/daaw/avee/comp/playback/MediaPlaybackService;->mServiceHandler:Lcom/AOSP/MyIntentService$ServiceHandler;

    new-instance v1, Lcom/daaw/avee/comp/playback/MediaPlaybackService$13;

    invoke-direct {v1, p0, p1}, Lcom/daaw/avee/comp/playback/MediaPlaybackService$13;-><init>(Lcom/daaw/avee/comp/playback/MediaPlaybackService;Landroid/view/SurfaceHolder;)V

    invoke-virtual {v0, v1}, Lcom/AOSP/MyIntentService$ServiceHandler;->post(Ljava/lang/Runnable;)Z

    return-void
.end method

.method public setVolume(I)V
    .locals 3

    .line 1311
    iget-object v0, p0, Lcom/daaw/avee/comp/playback/MediaPlaybackService;->audioManager:Landroid/media/AudioManager;

    const/4 v1, 0x3

    const/4 v2, 0x0

    invoke-virtual {v0, v1, p1, v2}, Landroid/media/AudioManager;->setStreamVolume(III)V

    return-void
.end method

.method public setVolumeMute(Z)V
    .locals 1

    .line 1318
    invoke-direct {p0}, Lcom/daaw/avee/comp/playback/MediaPlaybackService;->getPlayer()Lcom/daaw/avee/comp/playback/IMediaPlayerCore;

    move-result-object v0

    if-eqz v0, :cond_0

    .line 1319
    invoke-direct {p0}, Lcom/daaw/avee/comp/playback/MediaPlaybackService;->getPlayer()Lcom/daaw/avee/comp/playback/IMediaPlayerCore;

    move-result-object v0

    invoke-interface {v0, p1}, Lcom/daaw/avee/comp/playback/IMediaPlayerCore;->setMute(Z)V

    :cond_0
    return-void
.end method

.method public setVolumePercentage(F)V
    .locals 3

    .line 1298
    iget-object v0, p0, Lcom/daaw/avee/comp/playback/MediaPlaybackService;->audioManager:Landroid/media/AudioManager;

    const/4 v1, 0x3

    invoke-virtual {v0, v1}, Landroid/media/AudioManager;->getStreamMaxVolume(I)I

    move-result v0

    .line 1299
    iget-object v2, p0, Lcom/daaw/avee/comp/playback/MediaPlaybackService;->audioManager:Landroid/media/AudioManager;

    int-to-float v0, v0

    mul-float v0, v0, p1

    float-to-int p1, v0

    const/4 v0, 0x0

    invoke-virtual {v2, v1, p1, v0}, Landroid/media/AudioManager;->setStreamVolume(III)V

    return-void
.end method

.method public setVolumeStereoBalance(F)V
    .locals 1

    .line 1328
    invoke-direct {p0}, Lcom/daaw/avee/comp/playback/MediaPlaybackService;->getPlayer()Lcom/daaw/avee/comp/playback/IMediaPlayerCore;

    move-result-object v0

    if-eqz v0, :cond_0

    .line 1329
    invoke-direct {p0}, Lcom/daaw/avee/comp/playback/MediaPlaybackService;->getPlayer()Lcom/daaw/avee/comp/playback/IMediaPlayerCore;

    move-result-object v0

    invoke-interface {v0, p1}, Lcom/daaw/avee/comp/playback/IMediaPlayerCore;->setVolumeStereoBalance(F)V

    :cond_0
    return-void
.end method

.method public stop()V
    .locals 4

    const/4 v0, 0x0

    .line 984
    invoke-direct {p0, v0}, Lcom/daaw/avee/comp/playback/MediaPlaybackService;->setWantsPlaying(Z)V

    .line 985
    iput-boolean v0, p0, Lcom/daaw/avee/comp/playback/MediaPlaybackService;->lostAudioFocusWhilePlaying:Z

    .line 986
    iput-boolean v0, p0, Lcom/daaw/avee/comp/playback/MediaPlaybackService;->pausedWhenAudioBecomingNoisy:Z

    .line 989
    invoke-static {}, Lcom/daaw/avee/comp/AppPreferences/AppPreferences;->createOrGetInstance()Lcom/daaw/avee/comp/AppPreferences/AppPreferences;

    move-result-object v0

    invoke-virtual {p0}, Lcom/daaw/avee/comp/playback/MediaPlaybackService;->getApplicationContext()Landroid/content/Context;

    move-result-object v1

    const-string v2, "pref_fadePlayPause"

    const/4 v3, 0x1

    invoke-virtual {v0, v1, v2, v3}, Lcom/daaw/avee/comp/AppPreferences/AppPreferences;->preferencesGetBoolSafe(Landroid/content/Context;Ljava/lang/String;Z)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 992
    iget-object v0, p0, Lcom/daaw/avee/comp/playback/MediaPlaybackService;->fadePlayer:Lcom/daaw/avee/comp/playback/FadeMediaPlayer;

    invoke-virtual {v0}, Lcom/daaw/avee/comp/playback/FadeMediaPlayer;->stopFadeAll()V

    goto :goto_0

    .line 994
    :cond_0
    iget-object v0, p0, Lcom/daaw/avee/comp/playback/MediaPlaybackService;->fadePlayer:Lcom/daaw/avee/comp/playback/FadeMediaPlayer;

    invoke-virtual {v0}, Lcom/daaw/avee/comp/playback/FadeMediaPlayer;->stop()V

    :goto_0
    return-void
.end method

.method public stopServiceThSafe()V
    .locals 2

    .line 695
    iget-object v0, p0, Lcom/daaw/avee/comp/playback/MediaPlaybackService;->mServiceHandler:Lcom/AOSP/MyIntentService$ServiceHandler;

    new-instance v1, Lcom/daaw/avee/comp/playback/MediaPlaybackService$6;

    invoke-direct {v1, p0}, Lcom/daaw/avee/comp/playback/MediaPlaybackService$6;-><init>(Lcom/daaw/avee/comp/playback/MediaPlaybackService;)V

    invoke-virtual {v0, v1}, Lcom/AOSP/MyIntentService$ServiceHandler;->post(Ljava/lang/Runnable;)Z

    return-void
.end method

.method public togglePause()V
    .locals 1

    .line 977
    invoke-virtual {p0}, Lcom/daaw/avee/comp/playback/MediaPlaybackService;->wantsPlaying()Z

    move-result v0

    if-eqz v0, :cond_0

    const/4 v0, 0x0

    .line 978
    invoke-virtual {p0, v0}, Lcom/daaw/avee/comp/playback/MediaPlaybackService;->pause(Z)V

    goto :goto_0

    .line 980
    :cond_0
    invoke-virtual {p0}, Lcom/daaw/avee/comp/playback/MediaPlaybackService;->play()V

    :goto_0
    return-void
.end method

.method public toggleVolumeMute()V
    .locals 2

    .line 1323
    invoke-direct {p0}, Lcom/daaw/avee/comp/playback/MediaPlaybackService;->getPlayer()Lcom/daaw/avee/comp/playback/IMediaPlayerCore;

    move-result-object v0

    if-eqz v0, :cond_0

    .line 1324
    invoke-direct {p0}, Lcom/daaw/avee/comp/playback/MediaPlaybackService;->getPlayer()Lcom/daaw/avee/comp/playback/IMediaPlayerCore;

    move-result-object v0

    invoke-direct {p0}, Lcom/daaw/avee/comp/playback/MediaPlaybackService;->getPlayer()Lcom/daaw/avee/comp/playback/IMediaPlayerCore;

    move-result-object v1

    invoke-interface {v1}, Lcom/daaw/avee/comp/playback/IMediaPlayerCore;->isMuted()Z

    move-result v1

    xor-int/lit8 v1, v1, 0x1

    invoke-interface {v0, v1}, Lcom/daaw/avee/comp/playback/IMediaPlayerCore;->setMute(Z)V

    :cond_0
    return-void
.end method

.method public wantsPlaying()Z
    .locals 1

    .line 1002
    iget-boolean v0, p0, Lcom/daaw/avee/comp/playback/MediaPlaybackService;->wantsPlay:Z

    return v0
.end method
