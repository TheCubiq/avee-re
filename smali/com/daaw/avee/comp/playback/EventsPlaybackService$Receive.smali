.class public Lcom/daaw/avee/comp/playback/EventsPlaybackService$Receive;
.super Ljava/lang/Object;
.source "EventsPlaybackService.java"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/daaw/avee/comp/playback/EventsPlaybackService;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x9
    name = "Receive"
.end annotation


# static fields
.field public static final ACTION_Pause:I = 0x2

.field public static final ACTION_Play:I = 0x1

.field public static final ACTION_Stop:I = 0x3

.field public static final ACTION_TogglePause:I = 0x4

.field public static PlaybackControls_selectMediaPlayerCoreIndex:Lcom/daaw/avee/Common/Events/WeakDelegate1;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lcom/daaw/avee/Common/Events/WeakDelegate1<",
            "Ljava/lang/Integer;",
            ">;"
        }
    .end annotation
.end field

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

.field public static getVolume:Lcom/daaw/avee/Common/Events/WeakDelegateR;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lcom/daaw/avee/Common/Events/WeakDelegateR<",
            "Ljava/lang/Integer;",
            ">;"
        }
    .end annotation
.end field

.field public static getVolumePercentage:Lcom/daaw/avee/Common/Events/WeakDelegateR;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lcom/daaw/avee/Common/Events/WeakDelegateR<",
            "Ljava/lang/Float;",
            ">;"
        }
    .end annotation
.end field

.field static listenerRefHolder:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Ljava/lang/Object;",
            ">;"
        }
    .end annotation
.end field

.field public static onAction:Lcom/daaw/avee/Common/Events/WeakDelegate1;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lcom/daaw/avee/Common/Events/WeakDelegate1<",
            "Ljava/lang/Integer;",
            ">;"
        }
    .end annotation
.end field

.field public static onPlayDataSource:Lcom/daaw/avee/Common/Events/WeakDelegate4;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lcom/daaw/avee/Common/Events/WeakDelegate4<",
            "Ljava/lang/String;",
            "Ljava/lang/Boolean;",
            "Ljava/lang/Long;",
            "Ljava/lang/Long;",
            ">;"
        }
    .end annotation
.end field

.field public static onRepeatModeChange:Lcom/daaw/avee/Common/Events/WeakDelegate1;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lcom/daaw/avee/Common/Events/WeakDelegate1<",
            "Ljava/lang/Integer;",
            ">;"
        }
    .end annotation
.end field

.field public static onRequestCloseService:Lcom/daaw/avee/Common/Events/WeakDelegate;

.field public static onRequestEqualizerDesc:Lcom/daaw/avee/Common/Events/WeakDelegateR;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lcom/daaw/avee/Common/Events/WeakDelegateR<",
            "Lcom/daaw/avee/comp/playback/BaseEqualizerEffect$EqualizerDesc;",
            ">;"
        }
    .end annotation
.end field

.field public static onRequestStateRefresh:Lcom/daaw/avee/Common/Events/WeakDelegate;

.field public static onResetVisualizer:Lcom/daaw/avee/Common/Events/WeakDelegate;

.field public static onRestartMediaPlayerCore:Lcom/daaw/avee/Common/Events/WeakDelegate;

.field public static onSeekChanged:Lcom/daaw/avee/Common/Events/WeakDelegate1;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lcom/daaw/avee/Common/Events/WeakDelegate1<",
            "Ljava/lang/Long;",
            ">;"
        }
    .end annotation
.end field

.field public static onTimeoutChange:Lcom/daaw/avee/Common/Events/WeakDelegate1;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lcom/daaw/avee/Common/Events/WeakDelegate1<",
            "Ljava/lang/Boolean;",
            ">;"
        }
    .end annotation
.end field

.field public static savePreferences:Lcom/daaw/avee/Common/Events/WeakDelegate;

.field public static setCrossfadeValue:Lcom/daaw/avee/Common/Events/WeakDelegate1;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lcom/daaw/avee/Common/Events/WeakDelegate1<",
            "Ljava/lang/Float;",
            ">;"
        }
    .end annotation
.end field

.field public static setEqualizerSettings:Lcom/daaw/avee/Common/Events/WeakDelegate1;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lcom/daaw/avee/Common/Events/WeakDelegate1<",
            "Lcom/daaw/avee/comp/playback/BaseEqualizerEffect$EqualizerSettings;",
            ">;"
        }
    .end annotation
.end field

.field public static setVideoScalingMode:Lcom/daaw/avee/Common/Events/WeakDelegate1;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lcom/daaw/avee/Common/Events/WeakDelegate1<",
            "Ljava/lang/Integer;",
            ">;"
        }
    .end annotation
.end field

.field public static setVideoSurfaceHolder:Lcom/daaw/avee/Common/Events/WeakDelegate1;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lcom/daaw/avee/Common/Events/WeakDelegate1<",
            "Landroid/view/SurfaceHolder;",
            ">;"
        }
    .end annotation
.end field

.field public static setVolume:Lcom/daaw/avee/Common/Events/WeakDelegate1;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lcom/daaw/avee/Common/Events/WeakDelegate1<",
            "Ljava/lang/Integer;",
            ">;"
        }
    .end annotation
.end field

.field public static setVolumeMute:Lcom/daaw/avee/Common/Events/WeakDelegate1;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lcom/daaw/avee/Common/Events/WeakDelegate1<",
            "Ljava/lang/Boolean;",
            ">;"
        }
    .end annotation
.end field

.field public static setVolumePercentage:Lcom/daaw/avee/Common/Events/WeakDelegate1;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lcom/daaw/avee/Common/Events/WeakDelegate1<",
            "Ljava/lang/Float;",
            ">;"
        }
    .end annotation
.end field

.field public static setVolumeStereoBalance:Lcom/daaw/avee/Common/Events/WeakDelegate1;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lcom/daaw/avee/Common/Events/WeakDelegate1<",
            "Ljava/lang/Float;",
            ">;"
        }
    .end annotation
.end field

.field public static toggleVolumeMute:Lcom/daaw/avee/Common/Events/WeakDelegate;


# direct methods
.method static constructor <clinit>()V
    .locals 3

    .line 34
    new-instance v0, Ljava/util/LinkedList;

    invoke-direct {v0}, Ljava/util/LinkedList;-><init>()V

    sput-object v0, Lcom/daaw/avee/comp/playback/EventsPlaybackService$Receive;->listenerRefHolder:Ljava/util/List;

    .line 36
    new-instance v0, Lcom/daaw/avee/Common/Events/WeakDelegate;

    invoke-direct {v0}, Lcom/daaw/avee/Common/Events/WeakDelegate;-><init>()V

    new-instance v1, Lcom/daaw/avee/comp/playback/EventsPlaybackService$Receive$1;

    invoke-direct {v1}, Lcom/daaw/avee/comp/playback/EventsPlaybackService$Receive$1;-><init>()V

    sget-object v2, Lcom/daaw/avee/comp/playback/EventsPlaybackService$Receive;->listenerRefHolder:Ljava/util/List;

    invoke-virtual {v0, v1, v2}, Lcom/daaw/avee/Common/Events/WeakDelegate;->subscribeWeak(Lcom/daaw/avee/Common/Events/WeakDelegate$Handler;Ljava/util/List;)Lcom/daaw/avee/Common/Events/WeakDelegate;

    move-result-object v0

    sput-object v0, Lcom/daaw/avee/comp/playback/EventsPlaybackService$Receive;->savePreferences:Lcom/daaw/avee/Common/Events/WeakDelegate;

    .line 45
    new-instance v0, Lcom/daaw/avee/Common/Events/WeakDelegate;

    invoke-direct {v0}, Lcom/daaw/avee/Common/Events/WeakDelegate;-><init>()V

    new-instance v1, Lcom/daaw/avee/comp/playback/EventsPlaybackService$Receive$2;

    invoke-direct {v1}, Lcom/daaw/avee/comp/playback/EventsPlaybackService$Receive$2;-><init>()V

    sget-object v2, Lcom/daaw/avee/comp/playback/EventsPlaybackService$Receive;->listenerRefHolder:Ljava/util/List;

    invoke-virtual {v0, v1, v2}, Lcom/daaw/avee/Common/Events/WeakDelegate;->subscribeWeak(Lcom/daaw/avee/Common/Events/WeakDelegate$Handler;Ljava/util/List;)Lcom/daaw/avee/Common/Events/WeakDelegate;

    move-result-object v0

    sput-object v0, Lcom/daaw/avee/comp/playback/EventsPlaybackService$Receive;->onRequestCloseService:Lcom/daaw/avee/Common/Events/WeakDelegate;

    .line 52
    new-instance v0, Lcom/daaw/avee/Common/Events/WeakDelegateR2;

    invoke-direct {v0}, Lcom/daaw/avee/Common/Events/WeakDelegateR2;-><init>()V

    new-instance v1, Lcom/daaw/avee/comp/playback/EventsPlaybackService$Receive$3;

    invoke-direct {v1}, Lcom/daaw/avee/comp/playback/EventsPlaybackService$Receive$3;-><init>()V

    sget-object v2, Lcom/daaw/avee/comp/playback/EventsPlaybackService$Receive;->listenerRefHolder:Ljava/util/List;

    .line 53
    invoke-virtual {v0, v1, v2}, Lcom/daaw/avee/Common/Events/WeakDelegateR2;->subscribeWeak(Lcom/daaw/avee/Common/Events/WeakDelegateR2$Handler;Ljava/util/List;)Lcom/daaw/avee/Common/Events/WeakDelegateR2;

    move-result-object v0

    sput-object v0, Lcom/daaw/avee/comp/playback/EventsPlaybackService$Receive;->getVisualizationData:Lcom/daaw/avee/Common/Events/WeakDelegateR2;

    .line 63
    new-instance v0, Lcom/daaw/avee/Common/Events/WeakDelegate4;

    invoke-direct {v0}, Lcom/daaw/avee/Common/Events/WeakDelegate4;-><init>()V

    new-instance v1, Lcom/daaw/avee/comp/playback/EventsPlaybackService$Receive$4;

    invoke-direct {v1}, Lcom/daaw/avee/comp/playback/EventsPlaybackService$Receive$4;-><init>()V

    sget-object v2, Lcom/daaw/avee/comp/playback/EventsPlaybackService$Receive;->listenerRefHolder:Ljava/util/List;

    .line 64
    invoke-virtual {v0, v1, v2}, Lcom/daaw/avee/Common/Events/WeakDelegate4;->subscribeWeak(Lcom/daaw/avee/Common/Events/WeakDelegate4$Handler;Ljava/util/List;)Lcom/daaw/avee/Common/Events/WeakDelegate4;

    move-result-object v0

    sput-object v0, Lcom/daaw/avee/comp/playback/EventsPlaybackService$Receive;->onPlayDataSource:Lcom/daaw/avee/Common/Events/WeakDelegate4;

    .line 77
    new-instance v0, Lcom/daaw/avee/Common/Events/WeakDelegate1;

    invoke-direct {v0}, Lcom/daaw/avee/Common/Events/WeakDelegate1;-><init>()V

    new-instance v1, Lcom/daaw/avee/comp/playback/EventsPlaybackService$Receive$5;

    invoke-direct {v1}, Lcom/daaw/avee/comp/playback/EventsPlaybackService$Receive$5;-><init>()V

    sget-object v2, Lcom/daaw/avee/comp/playback/EventsPlaybackService$Receive;->listenerRefHolder:Ljava/util/List;

    invoke-virtual {v0, v1, v2}, Lcom/daaw/avee/Common/Events/WeakDelegate1;->subscribeWeak(Lcom/daaw/avee/Common/Events/WeakDelegate1$Handler;Ljava/util/List;)Lcom/daaw/avee/Common/Events/WeakDelegate1;

    move-result-object v0

    sput-object v0, Lcom/daaw/avee/comp/playback/EventsPlaybackService$Receive;->onAction:Lcom/daaw/avee/Common/Events/WeakDelegate1;

    .line 99
    new-instance v0, Lcom/daaw/avee/Common/Events/WeakDelegate;

    invoke-direct {v0}, Lcom/daaw/avee/Common/Events/WeakDelegate;-><init>()V

    new-instance v1, Lcom/daaw/avee/comp/playback/EventsPlaybackService$Receive$6;

    invoke-direct {v1}, Lcom/daaw/avee/comp/playback/EventsPlaybackService$Receive$6;-><init>()V

    sget-object v2, Lcom/daaw/avee/comp/playback/EventsPlaybackService$Receive;->listenerRefHolder:Ljava/util/List;

    invoke-virtual {v0, v1, v2}, Lcom/daaw/avee/Common/Events/WeakDelegate;->subscribeWeak(Lcom/daaw/avee/Common/Events/WeakDelegate$Handler;Ljava/util/List;)Lcom/daaw/avee/Common/Events/WeakDelegate;

    move-result-object v0

    sput-object v0, Lcom/daaw/avee/comp/playback/EventsPlaybackService$Receive;->onRequestStateRefresh:Lcom/daaw/avee/Common/Events/WeakDelegate;

    .line 106
    new-instance v0, Lcom/daaw/avee/Common/Events/WeakDelegate1;

    invoke-direct {v0}, Lcom/daaw/avee/Common/Events/WeakDelegate1;-><init>()V

    new-instance v1, Lcom/daaw/avee/comp/playback/EventsPlaybackService$Receive$7;

    invoke-direct {v1}, Lcom/daaw/avee/comp/playback/EventsPlaybackService$Receive$7;-><init>()V

    sget-object v2, Lcom/daaw/avee/comp/playback/EventsPlaybackService$Receive;->listenerRefHolder:Ljava/util/List;

    invoke-virtual {v0, v1, v2}, Lcom/daaw/avee/Common/Events/WeakDelegate1;->subscribeWeak(Lcom/daaw/avee/Common/Events/WeakDelegate1$Handler;Ljava/util/List;)Lcom/daaw/avee/Common/Events/WeakDelegate1;

    move-result-object v0

    sput-object v0, Lcom/daaw/avee/comp/playback/EventsPlaybackService$Receive;->onTimeoutChange:Lcom/daaw/avee/Common/Events/WeakDelegate1;

    .line 119
    new-instance v0, Lcom/daaw/avee/Common/Events/WeakDelegate1;

    invoke-direct {v0}, Lcom/daaw/avee/Common/Events/WeakDelegate1;-><init>()V

    new-instance v1, Lcom/daaw/avee/comp/playback/EventsPlaybackService$Receive$8;

    invoke-direct {v1}, Lcom/daaw/avee/comp/playback/EventsPlaybackService$Receive$8;-><init>()V

    sget-object v2, Lcom/daaw/avee/comp/playback/EventsPlaybackService$Receive;->listenerRefHolder:Ljava/util/List;

    invoke-virtual {v0, v1, v2}, Lcom/daaw/avee/Common/Events/WeakDelegate1;->subscribeWeak(Lcom/daaw/avee/Common/Events/WeakDelegate1$Handler;Ljava/util/List;)Lcom/daaw/avee/Common/Events/WeakDelegate1;

    move-result-object v0

    sput-object v0, Lcom/daaw/avee/comp/playback/EventsPlaybackService$Receive;->onSeekChanged:Lcom/daaw/avee/Common/Events/WeakDelegate1;

    .line 126
    new-instance v0, Lcom/daaw/avee/Common/Events/WeakDelegate1;

    invoke-direct {v0}, Lcom/daaw/avee/Common/Events/WeakDelegate1;-><init>()V

    new-instance v1, Lcom/daaw/avee/comp/playback/EventsPlaybackService$Receive$9;

    invoke-direct {v1}, Lcom/daaw/avee/comp/playback/EventsPlaybackService$Receive$9;-><init>()V

    sget-object v2, Lcom/daaw/avee/comp/playback/EventsPlaybackService$Receive;->listenerRefHolder:Ljava/util/List;

    invoke-virtual {v0, v1, v2}, Lcom/daaw/avee/Common/Events/WeakDelegate1;->subscribeWeak(Lcom/daaw/avee/Common/Events/WeakDelegate1$Handler;Ljava/util/List;)Lcom/daaw/avee/Common/Events/WeakDelegate1;

    move-result-object v0

    sput-object v0, Lcom/daaw/avee/comp/playback/EventsPlaybackService$Receive;->onRepeatModeChange:Lcom/daaw/avee/Common/Events/WeakDelegate1;

    .line 133
    new-instance v0, Lcom/daaw/avee/Common/Events/WeakDelegate1;

    invoke-direct {v0}, Lcom/daaw/avee/Common/Events/WeakDelegate1;-><init>()V

    new-instance v1, Lcom/daaw/avee/comp/playback/EventsPlaybackService$Receive$10;

    invoke-direct {v1}, Lcom/daaw/avee/comp/playback/EventsPlaybackService$Receive$10;-><init>()V

    sget-object v2, Lcom/daaw/avee/comp/playback/EventsPlaybackService$Receive;->listenerRefHolder:Ljava/util/List;

    invoke-virtual {v0, v1, v2}, Lcom/daaw/avee/Common/Events/WeakDelegate1;->subscribeWeak(Lcom/daaw/avee/Common/Events/WeakDelegate1$Handler;Ljava/util/List;)Lcom/daaw/avee/Common/Events/WeakDelegate1;

    move-result-object v0

    sput-object v0, Lcom/daaw/avee/comp/playback/EventsPlaybackService$Receive;->setVideoScalingMode:Lcom/daaw/avee/Common/Events/WeakDelegate1;

    .line 139
    new-instance v0, Lcom/daaw/avee/Common/Events/WeakDelegate1;

    invoke-direct {v0}, Lcom/daaw/avee/Common/Events/WeakDelegate1;-><init>()V

    new-instance v1, Lcom/daaw/avee/comp/playback/EventsPlaybackService$Receive$11;

    invoke-direct {v1}, Lcom/daaw/avee/comp/playback/EventsPlaybackService$Receive$11;-><init>()V

    sget-object v2, Lcom/daaw/avee/comp/playback/EventsPlaybackService$Receive;->listenerRefHolder:Ljava/util/List;

    invoke-virtual {v0, v1, v2}, Lcom/daaw/avee/Common/Events/WeakDelegate1;->subscribeWeak(Lcom/daaw/avee/Common/Events/WeakDelegate1$Handler;Ljava/util/List;)Lcom/daaw/avee/Common/Events/WeakDelegate1;

    move-result-object v0

    sput-object v0, Lcom/daaw/avee/comp/playback/EventsPlaybackService$Receive;->setVideoSurfaceHolder:Lcom/daaw/avee/Common/Events/WeakDelegate1;

    .line 148
    new-instance v0, Lcom/daaw/avee/Common/Events/WeakDelegate1;

    invoke-direct {v0}, Lcom/daaw/avee/Common/Events/WeakDelegate1;-><init>()V

    new-instance v1, Lcom/daaw/avee/comp/playback/EventsPlaybackService$Receive$12;

    invoke-direct {v1}, Lcom/daaw/avee/comp/playback/EventsPlaybackService$Receive$12;-><init>()V

    sget-object v2, Lcom/daaw/avee/comp/playback/EventsPlaybackService$Receive;->listenerRefHolder:Ljava/util/List;

    invoke-virtual {v0, v1, v2}, Lcom/daaw/avee/Common/Events/WeakDelegate1;->subscribeWeak(Lcom/daaw/avee/Common/Events/WeakDelegate1$Handler;Ljava/util/List;)Lcom/daaw/avee/Common/Events/WeakDelegate1;

    move-result-object v0

    sput-object v0, Lcom/daaw/avee/comp/playback/EventsPlaybackService$Receive;->setVolumePercentage:Lcom/daaw/avee/Common/Events/WeakDelegate1;

    .line 154
    new-instance v0, Lcom/daaw/avee/Common/Events/WeakDelegate1;

    invoke-direct {v0}, Lcom/daaw/avee/Common/Events/WeakDelegate1;-><init>()V

    new-instance v1, Lcom/daaw/avee/comp/playback/EventsPlaybackService$Receive$13;

    invoke-direct {v1}, Lcom/daaw/avee/comp/playback/EventsPlaybackService$Receive$13;-><init>()V

    sget-object v2, Lcom/daaw/avee/comp/playback/EventsPlaybackService$Receive;->listenerRefHolder:Ljava/util/List;

    invoke-virtual {v0, v1, v2}, Lcom/daaw/avee/Common/Events/WeakDelegate1;->subscribeWeak(Lcom/daaw/avee/Common/Events/WeakDelegate1$Handler;Ljava/util/List;)Lcom/daaw/avee/Common/Events/WeakDelegate1;

    move-result-object v0

    sput-object v0, Lcom/daaw/avee/comp/playback/EventsPlaybackService$Receive;->setVolume:Lcom/daaw/avee/Common/Events/WeakDelegate1;

    .line 161
    new-instance v0, Lcom/daaw/avee/Common/Events/WeakDelegateR;

    invoke-direct {v0}, Lcom/daaw/avee/Common/Events/WeakDelegateR;-><init>()V

    new-instance v1, Lcom/daaw/avee/comp/playback/EventsPlaybackService$Receive$14;

    invoke-direct {v1}, Lcom/daaw/avee/comp/playback/EventsPlaybackService$Receive$14;-><init>()V

    sget-object v2, Lcom/daaw/avee/comp/playback/EventsPlaybackService$Receive;->listenerRefHolder:Ljava/util/List;

    invoke-virtual {v0, v1, v2}, Lcom/daaw/avee/Common/Events/WeakDelegateR;->subscribeWeak(Lcom/daaw/avee/Common/Events/WeakDelegateR$Handler;Ljava/util/List;)Lcom/daaw/avee/Common/Events/WeakDelegateR;

    move-result-object v0

    sput-object v0, Lcom/daaw/avee/comp/playback/EventsPlaybackService$Receive;->getVolumePercentage:Lcom/daaw/avee/Common/Events/WeakDelegateR;

    .line 171
    new-instance v0, Lcom/daaw/avee/Common/Events/WeakDelegateR;

    invoke-direct {v0}, Lcom/daaw/avee/Common/Events/WeakDelegateR;-><init>()V

    new-instance v1, Lcom/daaw/avee/comp/playback/EventsPlaybackService$Receive$15;

    invoke-direct {v1}, Lcom/daaw/avee/comp/playback/EventsPlaybackService$Receive$15;-><init>()V

    sget-object v2, Lcom/daaw/avee/comp/playback/EventsPlaybackService$Receive;->listenerRefHolder:Ljava/util/List;

    invoke-virtual {v0, v1, v2}, Lcom/daaw/avee/Common/Events/WeakDelegateR;->subscribeWeak(Lcom/daaw/avee/Common/Events/WeakDelegateR$Handler;Ljava/util/List;)Lcom/daaw/avee/Common/Events/WeakDelegateR;

    move-result-object v0

    sput-object v0, Lcom/daaw/avee/comp/playback/EventsPlaybackService$Receive;->getVolume:Lcom/daaw/avee/Common/Events/WeakDelegateR;

    .line 182
    new-instance v0, Lcom/daaw/avee/Common/Events/WeakDelegate1;

    invoke-direct {v0}, Lcom/daaw/avee/Common/Events/WeakDelegate1;-><init>()V

    new-instance v1, Lcom/daaw/avee/comp/playback/EventsPlaybackService$Receive$16;

    invoke-direct {v1}, Lcom/daaw/avee/comp/playback/EventsPlaybackService$Receive$16;-><init>()V

    sget-object v2, Lcom/daaw/avee/comp/playback/EventsPlaybackService$Receive;->listenerRefHolder:Ljava/util/List;

    invoke-virtual {v0, v1, v2}, Lcom/daaw/avee/Common/Events/WeakDelegate1;->subscribeWeak(Lcom/daaw/avee/Common/Events/WeakDelegate1$Handler;Ljava/util/List;)Lcom/daaw/avee/Common/Events/WeakDelegate1;

    move-result-object v0

    sput-object v0, Lcom/daaw/avee/comp/playback/EventsPlaybackService$Receive;->setVolumeMute:Lcom/daaw/avee/Common/Events/WeakDelegate1;

    .line 188
    new-instance v0, Lcom/daaw/avee/Common/Events/WeakDelegate;

    invoke-direct {v0}, Lcom/daaw/avee/Common/Events/WeakDelegate;-><init>()V

    new-instance v1, Lcom/daaw/avee/comp/playback/EventsPlaybackService$Receive$17;

    invoke-direct {v1}, Lcom/daaw/avee/comp/playback/EventsPlaybackService$Receive$17;-><init>()V

    sget-object v2, Lcom/daaw/avee/comp/playback/EventsPlaybackService$Receive;->listenerRefHolder:Ljava/util/List;

    invoke-virtual {v0, v1, v2}, Lcom/daaw/avee/Common/Events/WeakDelegate;->subscribeWeak(Lcom/daaw/avee/Common/Events/WeakDelegate$Handler;Ljava/util/List;)Lcom/daaw/avee/Common/Events/WeakDelegate;

    move-result-object v0

    sput-object v0, Lcom/daaw/avee/comp/playback/EventsPlaybackService$Receive;->toggleVolumeMute:Lcom/daaw/avee/Common/Events/WeakDelegate;

    .line 195
    new-instance v0, Lcom/daaw/avee/Common/Events/WeakDelegate1;

    invoke-direct {v0}, Lcom/daaw/avee/Common/Events/WeakDelegate1;-><init>()V

    new-instance v1, Lcom/daaw/avee/comp/playback/EventsPlaybackService$Receive$18;

    invoke-direct {v1}, Lcom/daaw/avee/comp/playback/EventsPlaybackService$Receive$18;-><init>()V

    sget-object v2, Lcom/daaw/avee/comp/playback/EventsPlaybackService$Receive;->listenerRefHolder:Ljava/util/List;

    invoke-virtual {v0, v1, v2}, Lcom/daaw/avee/Common/Events/WeakDelegate1;->subscribeWeak(Lcom/daaw/avee/Common/Events/WeakDelegate1$Handler;Ljava/util/List;)Lcom/daaw/avee/Common/Events/WeakDelegate1;

    move-result-object v0

    sput-object v0, Lcom/daaw/avee/comp/playback/EventsPlaybackService$Receive;->setVolumeStereoBalance:Lcom/daaw/avee/Common/Events/WeakDelegate1;

    .line 201
    new-instance v0, Lcom/daaw/avee/Common/Events/WeakDelegate1;

    invoke-direct {v0}, Lcom/daaw/avee/Common/Events/WeakDelegate1;-><init>()V

    new-instance v1, Lcom/daaw/avee/comp/playback/EventsPlaybackService$Receive$19;

    invoke-direct {v1}, Lcom/daaw/avee/comp/playback/EventsPlaybackService$Receive$19;-><init>()V

    sget-object v2, Lcom/daaw/avee/comp/playback/EventsPlaybackService$Receive;->listenerRefHolder:Ljava/util/List;

    invoke-virtual {v0, v1, v2}, Lcom/daaw/avee/Common/Events/WeakDelegate1;->subscribeWeak(Lcom/daaw/avee/Common/Events/WeakDelegate1$Handler;Ljava/util/List;)Lcom/daaw/avee/Common/Events/WeakDelegate1;

    move-result-object v0

    sput-object v0, Lcom/daaw/avee/comp/playback/EventsPlaybackService$Receive;->setCrossfadeValue:Lcom/daaw/avee/Common/Events/WeakDelegate1;

    .line 208
    new-instance v0, Lcom/daaw/avee/Common/Events/WeakDelegate;

    invoke-direct {v0}, Lcom/daaw/avee/Common/Events/WeakDelegate;-><init>()V

    new-instance v1, Lcom/daaw/avee/comp/playback/EventsPlaybackService$Receive$20;

    invoke-direct {v1}, Lcom/daaw/avee/comp/playback/EventsPlaybackService$Receive$20;-><init>()V

    sget-object v2, Lcom/daaw/avee/comp/playback/EventsPlaybackService$Receive;->listenerRefHolder:Ljava/util/List;

    invoke-virtual {v0, v1, v2}, Lcom/daaw/avee/Common/Events/WeakDelegate;->subscribeWeak(Lcom/daaw/avee/Common/Events/WeakDelegate$Handler;Ljava/util/List;)Lcom/daaw/avee/Common/Events/WeakDelegate;

    move-result-object v0

    sput-object v0, Lcom/daaw/avee/comp/playback/EventsPlaybackService$Receive;->onRestartMediaPlayerCore:Lcom/daaw/avee/Common/Events/WeakDelegate;

    .line 218
    new-instance v0, Lcom/daaw/avee/Common/Events/WeakDelegate1;

    invoke-direct {v0}, Lcom/daaw/avee/Common/Events/WeakDelegate1;-><init>()V

    new-instance v1, Lcom/daaw/avee/comp/playback/EventsPlaybackService$Receive$21;

    invoke-direct {v1}, Lcom/daaw/avee/comp/playback/EventsPlaybackService$Receive$21;-><init>()V

    sget-object v2, Lcom/daaw/avee/comp/playback/EventsPlaybackService$Receive;->listenerRefHolder:Ljava/util/List;

    invoke-virtual {v0, v1, v2}, Lcom/daaw/avee/Common/Events/WeakDelegate1;->subscribeWeak(Lcom/daaw/avee/Common/Events/WeakDelegate1$Handler;Ljava/util/List;)Lcom/daaw/avee/Common/Events/WeakDelegate1;

    move-result-object v0

    sput-object v0, Lcom/daaw/avee/comp/playback/EventsPlaybackService$Receive;->PlaybackControls_selectMediaPlayerCoreIndex:Lcom/daaw/avee/Common/Events/WeakDelegate1;

    .line 227
    new-instance v0, Lcom/daaw/avee/Common/Events/WeakDelegate;

    invoke-direct {v0}, Lcom/daaw/avee/Common/Events/WeakDelegate;-><init>()V

    new-instance v1, Lcom/daaw/avee/comp/playback/EventsPlaybackService$Receive$22;

    invoke-direct {v1}, Lcom/daaw/avee/comp/playback/EventsPlaybackService$Receive$22;-><init>()V

    sget-object v2, Lcom/daaw/avee/comp/playback/EventsPlaybackService$Receive;->listenerRefHolder:Ljava/util/List;

    invoke-virtual {v0, v1, v2}, Lcom/daaw/avee/Common/Events/WeakDelegate;->subscribeWeak(Lcom/daaw/avee/Common/Events/WeakDelegate$Handler;Ljava/util/List;)Lcom/daaw/avee/Common/Events/WeakDelegate;

    move-result-object v0

    sput-object v0, Lcom/daaw/avee/comp/playback/EventsPlaybackService$Receive;->onResetVisualizer:Lcom/daaw/avee/Common/Events/WeakDelegate;

    .line 237
    new-instance v0, Lcom/daaw/avee/Common/Events/WeakDelegateR;

    invoke-direct {v0}, Lcom/daaw/avee/Common/Events/WeakDelegateR;-><init>()V

    new-instance v1, Lcom/daaw/avee/comp/playback/EventsPlaybackService$Receive$23;

    invoke-direct {v1}, Lcom/daaw/avee/comp/playback/EventsPlaybackService$Receive$23;-><init>()V

    sget-object v2, Lcom/daaw/avee/comp/playback/EventsPlaybackService$Receive;->listenerRefHolder:Ljava/util/List;

    invoke-virtual {v0, v1, v2}, Lcom/daaw/avee/Common/Events/WeakDelegateR;->subscribeWeak(Lcom/daaw/avee/Common/Events/WeakDelegateR$Handler;Ljava/util/List;)Lcom/daaw/avee/Common/Events/WeakDelegateR;

    move-result-object v0

    sput-object v0, Lcom/daaw/avee/comp/playback/EventsPlaybackService$Receive;->onRequestEqualizerDesc:Lcom/daaw/avee/Common/Events/WeakDelegateR;

    .line 248
    new-instance v0, Lcom/daaw/avee/Common/Events/WeakDelegate1;

    invoke-direct {v0}, Lcom/daaw/avee/Common/Events/WeakDelegate1;-><init>()V

    new-instance v1, Lcom/daaw/avee/comp/playback/EventsPlaybackService$Receive$24;

    invoke-direct {v1}, Lcom/daaw/avee/comp/playback/EventsPlaybackService$Receive$24;-><init>()V

    sget-object v2, Lcom/daaw/avee/comp/playback/EventsPlaybackService$Receive;->listenerRefHolder:Ljava/util/List;

    invoke-virtual {v0, v1, v2}, Lcom/daaw/avee/Common/Events/WeakDelegate1;->subscribeWeak(Lcom/daaw/avee/Common/Events/WeakDelegate1$Handler;Ljava/util/List;)Lcom/daaw/avee/Common/Events/WeakDelegate1;

    move-result-object v0

    sput-object v0, Lcom/daaw/avee/comp/playback/EventsPlaybackService$Receive;->setEqualizerSettings:Lcom/daaw/avee/Common/Events/WeakDelegate1;

    return-void
.end method

.method public constructor <init>()V
    .locals 0

    .line 27
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method static startService()V
    .locals 4

    .line 258
    invoke-static {}, Lcom/daaw/avee/PlayerCore;->s()Lcom/daaw/avee/PlayerCore;

    move-result-object v0

    invoke-virtual {v0}, Lcom/daaw/avee/PlayerCore;->getAppContext()Landroid/content/Context;

    move-result-object v0

    if-nez v0, :cond_0

    return-void

    .line 261
    :cond_0
    new-instance v1, Landroid/content/ComponentName;

    const-class v2, Lcom/daaw/avee/comp/playback/MediaPlaybackService;

    invoke-direct {v1, v0, v2}, Landroid/content/ComponentName;-><init>(Landroid/content/Context;Ljava/lang/Class;)V

    .line 262
    new-instance v2, Landroid/content/Intent;

    const-string v3, "NONE_ACTION"

    invoke-direct {v2, v3}, Landroid/content/Intent;-><init>(Ljava/lang/String;)V

    .line 263
    invoke-virtual {v2, v1}, Landroid/content/Intent;->setComponent(Landroid/content/ComponentName;)Landroid/content/Intent;

    .line 264
    invoke-static {v0, v2}, Lcom/daaw/avee/comp/playback/EventsPlaybackService$Receive;->startServiceInternal(Landroid/content/Context;Landroid/content/Intent;)V

    return-void
.end method

.method static startService(Landroid/content/Intent;)V
    .locals 3

    .line 322
    invoke-static {}, Lcom/daaw/avee/PlayerCore;->s()Lcom/daaw/avee/PlayerCore;

    move-result-object v0

    invoke-virtual {v0}, Lcom/daaw/avee/PlayerCore;->getAppContext()Landroid/content/Context;

    move-result-object v0

    if-nez v0, :cond_0

    return-void

    .line 325
    :cond_0
    new-instance v1, Landroid/content/ComponentName;

    const-class v2, Lcom/daaw/avee/comp/playback/MediaPlaybackService;

    invoke-direct {v1, v0, v2}, Landroid/content/ComponentName;-><init>(Landroid/content/Context;Ljava/lang/Class;)V

    .line 326
    invoke-virtual {p0, v1}, Landroid/content/Intent;->setComponent(Landroid/content/ComponentName;)Landroid/content/Intent;

    .line 327
    invoke-static {v0, p0}, Lcom/daaw/avee/comp/playback/EventsPlaybackService$Receive;->startServiceInternal(Landroid/content/Context;Landroid/content/Intent;)V

    return-void
.end method

.method static startService(Ljava/lang/String;)V
    .locals 3

    .line 268
    invoke-static {}, Lcom/daaw/avee/PlayerCore;->s()Lcom/daaw/avee/PlayerCore;

    move-result-object v0

    invoke-virtual {v0}, Lcom/daaw/avee/PlayerCore;->getAppContext()Landroid/content/Context;

    move-result-object v0

    if-nez v0, :cond_0

    return-void

    .line 271
    :cond_0
    new-instance v1, Landroid/content/ComponentName;

    const-class v2, Lcom/daaw/avee/comp/playback/MediaPlaybackService;

    invoke-direct {v1, v0, v2}, Landroid/content/ComponentName;-><init>(Landroid/content/Context;Ljava/lang/Class;)V

    .line 272
    new-instance v2, Landroid/content/Intent;

    invoke-direct {v2, p0}, Landroid/content/Intent;-><init>(Ljava/lang/String;)V

    .line 273
    invoke-virtual {v2, v1}, Landroid/content/Intent;->setComponent(Landroid/content/ComponentName;)Landroid/content/Intent;

    .line 274
    invoke-static {v0, v2}, Lcom/daaw/avee/comp/playback/EventsPlaybackService$Receive;->startServiceInternal(Landroid/content/Context;Landroid/content/Intent;)V

    return-void
.end method

.method static startService(Ljava/lang/String;F)V
    .locals 3

    .line 300
    invoke-static {}, Lcom/daaw/avee/PlayerCore;->s()Lcom/daaw/avee/PlayerCore;

    move-result-object v0

    invoke-virtual {v0}, Lcom/daaw/avee/PlayerCore;->getAppContext()Landroid/content/Context;

    move-result-object v0

    if-nez v0, :cond_0

    return-void

    .line 303
    :cond_0
    new-instance v1, Landroid/content/ComponentName;

    const-class v2, Lcom/daaw/avee/comp/playback/MediaPlaybackService;

    invoke-direct {v1, v0, v2}, Landroid/content/ComponentName;-><init>(Landroid/content/Context;Ljava/lang/Class;)V

    .line 304
    new-instance v2, Landroid/content/Intent;

    invoke-direct {v2, p0}, Landroid/content/Intent;-><init>(Ljava/lang/String;)V

    const-string p0, "EXTRA_ARG_1"

    .line 305
    invoke-virtual {v2, p0, p1}, Landroid/content/Intent;->putExtra(Ljava/lang/String;F)Landroid/content/Intent;

    .line 306
    invoke-virtual {v2, v1}, Landroid/content/Intent;->setComponent(Landroid/content/ComponentName;)Landroid/content/Intent;

    .line 307
    invoke-static {v0, v2}, Lcom/daaw/avee/comp/playback/EventsPlaybackService$Receive;->startServiceInternal(Landroid/content/Context;Landroid/content/Intent;)V

    return-void
.end method

.method static startService(Ljava/lang/String;I)V
    .locals 3

    .line 289
    invoke-static {}, Lcom/daaw/avee/PlayerCore;->s()Lcom/daaw/avee/PlayerCore;

    move-result-object v0

    invoke-virtual {v0}, Lcom/daaw/avee/PlayerCore;->getAppContext()Landroid/content/Context;

    move-result-object v0

    if-nez v0, :cond_0

    return-void

    .line 292
    :cond_0
    new-instance v1, Landroid/content/ComponentName;

    const-class v2, Lcom/daaw/avee/comp/playback/MediaPlaybackService;

    invoke-direct {v1, v0, v2}, Landroid/content/ComponentName;-><init>(Landroid/content/Context;Ljava/lang/Class;)V

    .line 293
    new-instance v2, Landroid/content/Intent;

    invoke-direct {v2, p0}, Landroid/content/Intent;-><init>(Ljava/lang/String;)V

    const-string p0, "EXTRA_ARG_1"

    .line 294
    invoke-virtual {v2, p0, p1}, Landroid/content/Intent;->putExtra(Ljava/lang/String;I)Landroid/content/Intent;

    .line 295
    invoke-virtual {v2, v1}, Landroid/content/Intent;->setComponent(Landroid/content/ComponentName;)Landroid/content/Intent;

    .line 296
    invoke-static {v0, v2}, Lcom/daaw/avee/comp/playback/EventsPlaybackService$Receive;->startServiceInternal(Landroid/content/Context;Landroid/content/Intent;)V

    return-void
.end method

.method static startService(Ljava/lang/String;J)V
    .locals 3

    .line 278
    invoke-static {}, Lcom/daaw/avee/PlayerCore;->s()Lcom/daaw/avee/PlayerCore;

    move-result-object v0

    invoke-virtual {v0}, Lcom/daaw/avee/PlayerCore;->getAppContext()Landroid/content/Context;

    move-result-object v0

    if-nez v0, :cond_0

    return-void

    .line 281
    :cond_0
    new-instance v1, Landroid/content/ComponentName;

    const-class v2, Lcom/daaw/avee/comp/playback/MediaPlaybackService;

    invoke-direct {v1, v0, v2}, Landroid/content/ComponentName;-><init>(Landroid/content/Context;Ljava/lang/Class;)V

    .line 282
    new-instance v2, Landroid/content/Intent;

    invoke-direct {v2, p0}, Landroid/content/Intent;-><init>(Ljava/lang/String;)V

    const-string p0, "EXTRA_ARG_1"

    .line 283
    invoke-virtual {v2, p0, p1, p2}, Landroid/content/Intent;->putExtra(Ljava/lang/String;J)Landroid/content/Intent;

    .line 284
    invoke-virtual {v2, v1}, Landroid/content/Intent;->setComponent(Landroid/content/ComponentName;)Landroid/content/Intent;

    .line 285
    invoke-static {v0, v2}, Lcom/daaw/avee/comp/playback/EventsPlaybackService$Receive;->startServiceInternal(Landroid/content/Context;Landroid/content/Intent;)V

    return-void
.end method

.method static startService(Ljava/lang/String;Z)V
    .locals 3

    .line 311
    invoke-static {}, Lcom/daaw/avee/PlayerCore;->s()Lcom/daaw/avee/PlayerCore;

    move-result-object v0

    invoke-virtual {v0}, Lcom/daaw/avee/PlayerCore;->getAppContext()Landroid/content/Context;

    move-result-object v0

    if-nez v0, :cond_0

    return-void

    .line 314
    :cond_0
    new-instance v1, Landroid/content/ComponentName;

    const-class v2, Lcom/daaw/avee/comp/playback/MediaPlaybackService;

    invoke-direct {v1, v0, v2}, Landroid/content/ComponentName;-><init>(Landroid/content/Context;Ljava/lang/Class;)V

    .line 315
    new-instance v2, Landroid/content/Intent;

    invoke-direct {v2, p0}, Landroid/content/Intent;-><init>(Ljava/lang/String;)V

    const-string p0, "EXTRA_ARG_1"

    .line 316
    invoke-virtual {v2, p0, p1}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Z)Landroid/content/Intent;

    .line 317
    invoke-virtual {v2, v1}, Landroid/content/Intent;->setComponent(Landroid/content/ComponentName;)Landroid/content/Intent;

    .line 318
    invoke-static {v0, v2}, Lcom/daaw/avee/comp/playback/EventsPlaybackService$Receive;->startServiceInternal(Landroid/content/Context;Landroid/content/Intent;)V

    return-void
.end method

.method static startServiceInternal(Landroid/content/Context;Landroid/content/Intent;)V
    .locals 2

    .line 333
    sget v0, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 v1, 0x1a

    if-lt v0, v1, :cond_0

    .line 334
    invoke-virtual {p0, p1}, Landroid/content/Context;->startForegroundService(Landroid/content/Intent;)Landroid/content/ComponentName;

    goto :goto_0

    .line 336
    :cond_0
    invoke-virtual {p0, p1}, Landroid/content/Context;->startService(Landroid/content/Intent;)Landroid/content/ComponentName;

    :goto_0
    return-void
.end method
