.class public Lcom/daaw/avee/comp/playback/ExoMediaPlayer/ExoMediaPlayerCore;
.super Ljava/lang/Object;
.source "ExoMediaPlayerCore.java"

# interfaces
.implements Lcom/daaw/avee/comp/playback/IMediaPlayerCore;
.implements Lcom/daaw/avee/comp/playback/BaseEqualizerEffect$IEqualizerEffectListener;
.implements Landroid/view/SurfaceHolder$Callback;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/daaw/avee/comp/playback/ExoMediaPlayer/ExoMediaPlayerCore$PlayerEntry;,
        Lcom/daaw/avee/comp/playback/ExoMediaPlayer/ExoMediaPlayerCore$Receive;
    }
.end annotation


# static fields
.field private static volatile instanceWeak:Ljava/lang/ref/WeakReference;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/lang/ref/WeakReference<",
            "Lcom/daaw/avee/comp/playback/ExoMediaPlayer/ExoMediaPlayerCore;",
            ">;"
        }
    .end annotation
.end field


# instance fields
.field private audioCapabilities:Lcom/google/android/exoplayer2/audio/AudioCapabilities;

.field private audioCapabilitiesReceiver:Lcom/google/android/exoplayer2/audio/AudioCapabilitiesReceiver;

.field private context:Landroid/content/Context;

.field private currentPlayer:I

.field private equalizerEffect:Lcom/daaw/avee/comp/playback/ExoMediaPlayer/ExoEqualizerEffect;

.field lastSeekTimeMs:J

.field private listenerRefHolder:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Ljava/lang/Object;",
            ">;"
        }
    .end annotation
.end field

.field private mainHandler:Landroid/os/Handler;

.field private muted:Z

.field private nextDataSource:Lcom/daaw/avee/comp/playback/Song/IMediaDataSource;

.field private nextPlayer:I

.field private onNotifyListener:Lcom/daaw/avee/comp/playback/IMediaPlayerCore$OnNotifyListener;

.field private pcmDataTmp:Lcom/daaw/avee/comp/Common/ExoPcmData;

.field private players:[Lcom/daaw/avee/comp/playback/ExoMediaPlayer/ExoMediaPlayerCore$PlayerEntry;

.field private surfaceHolderWeak:Ljava/lang/ref/WeakReference;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/lang/ref/WeakReference<",
            "Landroid/view/SurfaceHolder;",
            ">;"
        }
    .end annotation
.end field

.field private userAgent:Ljava/lang/String;

.field private volatile visualizerData:Lcom/daaw/avee/comp/PcmProcess/ExoVisualizerDataProvider;

.field private visualizerDataCapturer:Lcom/daaw/avee/comp/playback/ExoMediaPlayer/IVisualizerDataCapturer;

.field private visualizerLastTimeUsed:J

.field private final visualizerLock:Ljava/lang/Object;

.field private volume:F


# direct methods
.method static constructor <clinit>()V
    .locals 2

    .line 87
    new-instance v0, Ljava/lang/ref/WeakReference;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Ljava/lang/ref/WeakReference;-><init>(Ljava/lang/Object;)V

    sput-object v0, Lcom/daaw/avee/comp/playback/ExoMediaPlayer/ExoMediaPlayerCore;->instanceWeak:Ljava/lang/ref/WeakReference;

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Ljava/lang/String;Lcom/daaw/avee/comp/playback/IMediaPlayerCore$OnNotifyListener;)V
    .locals 4

    .line 217
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 106
    new-instance p2, Ljava/lang/Object;

    invoke-direct {p2}, Ljava/lang/Object;-><init>()V

    iput-object p2, p0, Lcom/daaw/avee/comp/playback/ExoMediaPlayer/ExoMediaPlayerCore;->visualizerLock:Ljava/lang/Object;

    const/4 p2, 0x2

    new-array p2, p2, [Lcom/daaw/avee/comp/playback/ExoMediaPlayer/ExoMediaPlayerCore$PlayerEntry;

    .line 108
    iput-object p2, p0, Lcom/daaw/avee/comp/playback/ExoMediaPlayer/ExoMediaPlayerCore;->players:[Lcom/daaw/avee/comp/playback/ExoMediaPlayer/ExoMediaPlayerCore$PlayerEntry;

    const/4 p2, 0x0

    .line 109
    iput p2, p0, Lcom/daaw/avee/comp/playback/ExoMediaPlayer/ExoMediaPlayerCore;->currentPlayer:I

    const/4 v0, 0x1

    .line 110
    iput v0, p0, Lcom/daaw/avee/comp/playback/ExoMediaPlayer/ExoMediaPlayerCore;->nextPlayer:I

    const/high16 v0, 0x3f800000    # 1.0f

    .line 112
    iput v0, p0, Lcom/daaw/avee/comp/playback/ExoMediaPlayer/ExoMediaPlayerCore;->volume:F

    .line 113
    iput-boolean p2, p0, Lcom/daaw/avee/comp/playback/ExoMediaPlayer/ExoMediaPlayerCore;->muted:Z

    .line 114
    new-instance v0, Ljava/lang/ref/WeakReference;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Ljava/lang/ref/WeakReference;-><init>(Ljava/lang/Object;)V

    iput-object v0, p0, Lcom/daaw/avee/comp/playback/ExoMediaPlayer/ExoMediaPlayerCore;->surfaceHolderWeak:Ljava/lang/ref/WeakReference;

    const-wide/16 v2, 0x0

    .line 115
    iput-wide v2, p0, Lcom/daaw/avee/comp/playback/ExoMediaPlayer/ExoMediaPlayerCore;->visualizerLastTimeUsed:J

    .line 116
    iput-object v1, p0, Lcom/daaw/avee/comp/playback/ExoMediaPlayer/ExoMediaPlayerCore;->visualizerData:Lcom/daaw/avee/comp/PcmProcess/ExoVisualizerDataProvider;

    .line 117
    new-instance v0, Ljava/util/LinkedList;

    invoke-direct {v0}, Ljava/util/LinkedList;-><init>()V

    iput-object v0, p0, Lcom/daaw/avee/comp/playback/ExoMediaPlayer/ExoMediaPlayerCore;->listenerRefHolder:Ljava/util/List;

    .line 122
    new-instance v0, Lcom/daaw/avee/comp/playback/ExoMediaPlayer/ExoEqualizerEffect;

    invoke-direct {v0, p0}, Lcom/daaw/avee/comp/playback/ExoMediaPlayer/ExoEqualizerEffect;-><init>(Lcom/daaw/avee/comp/playback/BaseEqualizerEffect$IEqualizerEffectListener;)V

    iput-object v0, p0, Lcom/daaw/avee/comp/playback/ExoMediaPlayer/ExoMediaPlayerCore;->equalizerEffect:Lcom/daaw/avee/comp/playback/ExoMediaPlayer/ExoEqualizerEffect;

    .line 126
    new-instance v0, Landroid/os/Handler;

    invoke-direct {v0}, Landroid/os/Handler;-><init>()V

    iput-object v0, p0, Lcom/daaw/avee/comp/playback/ExoMediaPlayer/ExoMediaPlayerCore;->mainHandler:Landroid/os/Handler;

    .line 128
    new-instance v0, Lcom/daaw/avee/comp/Common/ExoPcmData;

    invoke-direct {v0}, Lcom/daaw/avee/comp/Common/ExoPcmData;-><init>()V

    iput-object v0, p0, Lcom/daaw/avee/comp/playback/ExoMediaPlayer/ExoMediaPlayerCore;->pcmDataTmp:Lcom/daaw/avee/comp/Common/ExoPcmData;

    .line 130
    new-instance v0, Lcom/daaw/avee/comp/playback/ExoMediaPlayer/ExoMediaPlayerCore$1;

    invoke-direct {v0, p0}, Lcom/daaw/avee/comp/playback/ExoMediaPlayer/ExoMediaPlayerCore$1;-><init>(Lcom/daaw/avee/comp/playback/ExoMediaPlayer/ExoMediaPlayerCore;)V

    iput-object v0, p0, Lcom/daaw/avee/comp/playback/ExoMediaPlayer/ExoMediaPlayerCore;->visualizerDataCapturer:Lcom/daaw/avee/comp/playback/ExoMediaPlayer/IVisualizerDataCapturer;

    .line 580
    iput-wide v2, p0, Lcom/daaw/avee/comp/playback/ExoMediaPlayer/ExoMediaPlayerCore;->lastSeekTimeMs:J

    .line 218
    iput-object p1, p0, Lcom/daaw/avee/comp/playback/ExoMediaPlayer/ExoMediaPlayerCore;->context:Landroid/content/Context;

    .line 219
    iput-object p3, p0, Lcom/daaw/avee/comp/playback/ExoMediaPlayer/ExoMediaPlayerCore;->onNotifyListener:Lcom/daaw/avee/comp/playback/IMediaPlayerCore$OnNotifyListener;

    const-string p3, "ExoPlayerDemo"

    .line 221
    invoke-static {p1, p3}, Lcom/google/android/exoplayer2/util/Util;->getUserAgent(Landroid/content/Context;Ljava/lang/String;)Ljava/lang/String;

    move-result-object p3

    iput-object p3, p0, Lcom/daaw/avee/comp/playback/ExoMediaPlayer/ExoMediaPlayerCore;->userAgent:Ljava/lang/String;

    .line 223
    :goto_0
    iget-object p3, p0, Lcom/daaw/avee/comp/playback/ExoMediaPlayer/ExoMediaPlayerCore;->players:[Lcom/daaw/avee/comp/playback/ExoMediaPlayer/ExoMediaPlayerCore$PlayerEntry;

    array-length v0, p3

    if-ge p2, v0, :cond_0

    .line 224
    new-instance v0, Lcom/daaw/avee/comp/playback/ExoMediaPlayer/ExoMediaPlayerCore$PlayerEntry;

    invoke-direct {v0, p0, p1, p2}, Lcom/daaw/avee/comp/playback/ExoMediaPlayer/ExoMediaPlayerCore$PlayerEntry;-><init>(Lcom/daaw/avee/comp/playback/ExoMediaPlayer/ExoMediaPlayerCore;Landroid/content/Context;I)V

    aput-object v0, p3, p2

    add-int/lit8 p2, p2, 0x1

    goto :goto_0

    .line 226
    :cond_0
    new-instance p2, Lcom/google/android/exoplayer2/audio/AudioCapabilitiesReceiver;

    new-instance p3, Lcom/daaw/avee/comp/playback/ExoMediaPlayer/ExoMediaPlayerCore$2;

    invoke-direct {p3, p0}, Lcom/daaw/avee/comp/playback/ExoMediaPlayer/ExoMediaPlayerCore$2;-><init>(Lcom/daaw/avee/comp/playback/ExoMediaPlayer/ExoMediaPlayerCore;)V

    invoke-direct {p2, p1, p3}, Lcom/google/android/exoplayer2/audio/AudioCapabilitiesReceiver;-><init>(Landroid/content/Context;Lcom/google/android/exoplayer2/audio/AudioCapabilitiesReceiver$Listener;)V

    iput-object p2, p0, Lcom/daaw/avee/comp/playback/ExoMediaPlayer/ExoMediaPlayerCore;->audioCapabilitiesReceiver:Lcom/google/android/exoplayer2/audio/AudioCapabilitiesReceiver;

    .line 238
    sget-object p1, Lcom/daaw/avee/EventsGlobal/EventsGlobalApp;->onUITick10:Lcom/daaw/avee/Common/Events/WeakEvent;

    new-instance p2, Lcom/daaw/avee/comp/playback/ExoMediaPlayer/ExoMediaPlayerCore$3;

    invoke-direct {p2, p0}, Lcom/daaw/avee/comp/playback/ExoMediaPlayer/ExoMediaPlayerCore$3;-><init>(Lcom/daaw/avee/comp/playback/ExoMediaPlayer/ExoMediaPlayerCore;)V

    iget-object p3, p0, Lcom/daaw/avee/comp/playback/ExoMediaPlayer/ExoMediaPlayerCore;->listenerRefHolder:Ljava/util/List;

    invoke-virtual {p1, p2, p3}, Lcom/daaw/avee/Common/Events/WeakEvent;->subscribeWeak(Lcom/daaw/avee/Common/Events/WeakEvent$Handler;Ljava/util/List;)V

    .line 245
    new-instance p1, Ljava/lang/ref/WeakReference;

    invoke-direct {p1, p0}, Ljava/lang/ref/WeakReference;-><init>(Ljava/lang/Object;)V

    sput-object p1, Lcom/daaw/avee/comp/playback/ExoMediaPlayer/ExoMediaPlayerCore;->instanceWeak:Ljava/lang/ref/WeakReference;

    return-void
.end method

.method public static ConvertToExoVideoScalingMode(I)I
    .locals 2

    const/4 v0, 0x1

    if-ne p0, v0, :cond_0

    return v0

    :cond_0
    const/4 v1, 0x2

    if-ne p0, v1, :cond_1

    return v1

    :cond_1
    return v0
.end method

.method static synthetic access$000(Lcom/daaw/avee/comp/playback/ExoMediaPlayer/ExoMediaPlayerCore;)Lcom/daaw/avee/comp/playback/IMediaPlayerCore$OnNotifyListener;
    .locals 0

    .line 82
    iget-object p0, p0, Lcom/daaw/avee/comp/playback/ExoMediaPlayer/ExoMediaPlayerCore;->onNotifyListener:Lcom/daaw/avee/comp/playback/IMediaPlayerCore$OnNotifyListener;

    return-object p0
.end method

.method static synthetic access$100(Lcom/daaw/avee/comp/playback/ExoMediaPlayer/ExoMediaPlayerCore;)Lcom/daaw/avee/comp/PcmProcess/ExoVisualizerDataProvider;
    .locals 0

    .line 82
    iget-object p0, p0, Lcom/daaw/avee/comp/playback/ExoMediaPlayer/ExoMediaPlayerCore;->visualizerData:Lcom/daaw/avee/comp/PcmProcess/ExoVisualizerDataProvider;

    return-object p0
.end method

.method static synthetic access$1000(Lcom/daaw/avee/comp/playback/ExoMediaPlayer/ExoMediaPlayerCore;)Lcom/daaw/avee/comp/playback/ExoMediaPlayer/IVisualizerDataCapturer;
    .locals 0

    .line 82
    iget-object p0, p0, Lcom/daaw/avee/comp/playback/ExoMediaPlayer/ExoMediaPlayerCore;->visualizerDataCapturer:Lcom/daaw/avee/comp/playback/ExoMediaPlayer/IVisualizerDataCapturer;

    return-object p0
.end method

.method static synthetic access$1100(Lcom/daaw/avee/comp/playback/ExoMediaPlayer/ExoMediaPlayerCore;)Lcom/google/android/exoplayer2/SimpleExoPlayer;
    .locals 0

    .line 82
    invoke-direct {p0}, Lcom/daaw/avee/comp/playback/ExoMediaPlayer/ExoMediaPlayerCore;->getPlayer()Lcom/google/android/exoplayer2/SimpleExoPlayer;

    move-result-object p0

    return-object p0
.end method

.method static synthetic access$200(Lcom/daaw/avee/comp/playback/ExoMediaPlayer/ExoMediaPlayerCore;)Lcom/daaw/avee/comp/Common/ExoPcmData;
    .locals 0

    .line 82
    iget-object p0, p0, Lcom/daaw/avee/comp/playback/ExoMediaPlayer/ExoMediaPlayerCore;->pcmDataTmp:Lcom/daaw/avee/comp/Common/ExoPcmData;

    return-object p0
.end method

.method static synthetic access$300(Lcom/daaw/avee/comp/playback/ExoMediaPlayer/ExoMediaPlayerCore;)Lcom/daaw/avee/comp/playback/ExoMediaPlayer/ExoEqualizerEffect;
    .locals 0

    .line 82
    iget-object p0, p0, Lcom/daaw/avee/comp/playback/ExoMediaPlayer/ExoMediaPlayerCore;->equalizerEffect:Lcom/daaw/avee/comp/playback/ExoMediaPlayer/ExoEqualizerEffect;

    return-object p0
.end method

.method static synthetic access$500(Lcom/daaw/avee/comp/playback/ExoMediaPlayer/ExoMediaPlayerCore;)Lcom/google/android/exoplayer2/audio/AudioCapabilities;
    .locals 0

    .line 82
    iget-object p0, p0, Lcom/daaw/avee/comp/playback/ExoMediaPlayer/ExoMediaPlayerCore;->audioCapabilities:Lcom/google/android/exoplayer2/audio/AudioCapabilities;

    return-object p0
.end method

.method static synthetic access$502(Lcom/daaw/avee/comp/playback/ExoMediaPlayer/ExoMediaPlayerCore;Lcom/google/android/exoplayer2/audio/AudioCapabilities;)Lcom/google/android/exoplayer2/audio/AudioCapabilities;
    .locals 0

    .line 82
    iput-object p1, p0, Lcom/daaw/avee/comp/playback/ExoMediaPlayer/ExoMediaPlayerCore;->audioCapabilities:Lcom/google/android/exoplayer2/audio/AudioCapabilities;

    return-object p1
.end method

.method static synthetic access$600(Lcom/daaw/avee/comp/playback/ExoMediaPlayer/ExoMediaPlayerCore;)V
    .locals 0

    .line 82
    invoke-direct {p0}, Lcom/daaw/avee/comp/playback/ExoMediaPlayer/ExoMediaPlayerCore;->restartPlayers()V

    return-void
.end method

.method static synthetic access$900(Lcom/daaw/avee/comp/playback/ExoMediaPlayer/ExoMediaPlayerCore;)Ljava/lang/String;
    .locals 0

    .line 82
    iget-object p0, p0, Lcom/daaw/avee/comp/playback/ExoMediaPlayer/ExoMediaPlayerCore;->userAgent:Ljava/lang/String;

    return-object p0
.end method

.method private getPlayer()Lcom/google/android/exoplayer2/SimpleExoPlayer;
    .locals 1

    .line 532
    invoke-virtual {p0}, Lcom/daaw/avee/comp/playback/ExoMediaPlayer/ExoMediaPlayerCore;->getPlayerEntry()Lcom/daaw/avee/comp/playback/ExoMediaPlayer/ExoMediaPlayerCore$PlayerEntry;

    move-result-object v0

    invoke-static {v0}, Lcom/daaw/avee/comp/playback/ExoMediaPlayer/ExoMediaPlayerCore$PlayerEntry;->access$800(Lcom/daaw/avee/comp/playback/ExoMediaPlayer/ExoMediaPlayerCore$PlayerEntry;)Lcom/google/android/exoplayer2/SimpleExoPlayer;

    move-result-object v0

    return-object v0
.end method

.method private restartPlayers()V
    .locals 8

    .line 277
    iget-object v0, p0, Lcom/daaw/avee/comp/playback/ExoMediaPlayer/ExoMediaPlayerCore;->players:[Lcom/daaw/avee/comp/playback/ExoMediaPlayer/ExoMediaPlayerCore$PlayerEntry;

    array-length v1, v0

    const/4 v2, 0x0

    :goto_0
    if-ge v2, v1, :cond_1

    aget-object v3, v0, v2

    const-wide/16 v4, 0x0

    .line 280
    invoke-static {v3}, Lcom/daaw/avee/comp/playback/ExoMediaPlayer/ExoMediaPlayerCore$PlayerEntry;->access$800(Lcom/daaw/avee/comp/playback/ExoMediaPlayer/ExoMediaPlayerCore$PlayerEntry;)Lcom/google/android/exoplayer2/SimpleExoPlayer;

    move-result-object v6

    if-eqz v6, :cond_0

    .line 281
    invoke-static {v3}, Lcom/daaw/avee/comp/playback/ExoMediaPlayer/ExoMediaPlayerCore$PlayerEntry;->access$800(Lcom/daaw/avee/comp/playback/ExoMediaPlayer/ExoMediaPlayerCore$PlayerEntry;)Lcom/google/android/exoplayer2/SimpleExoPlayer;

    move-result-object v4

    invoke-virtual {v4}, Lcom/google/android/exoplayer2/SimpleExoPlayer;->getCurrentPosition()J

    move-result-wide v4

    .line 282
    :cond_0
    iget-object v6, v3, Lcom/daaw/avee/comp/playback/ExoMediaPlayer/ExoMediaPlayerCore$PlayerEntry;->dataSource:Lcom/daaw/avee/comp/playback/Song/IMediaDataSource;

    .line 283
    invoke-static {v3}, Lcom/daaw/avee/comp/playback/ExoMediaPlayer/ExoMediaPlayerCore$PlayerEntry;->access$700(Lcom/daaw/avee/comp/playback/ExoMediaPlayer/ExoMediaPlayerCore$PlayerEntry;)V

    const/high16 v7, 0x3f800000    # 1.0f

    .line 284
    invoke-virtual {v3, v6, v7, v4, v5}, Lcom/daaw/avee/comp/playback/ExoMediaPlayer/ExoMediaPlayerCore$PlayerEntry;->preparePlayer(Lcom/daaw/avee/comp/playback/Song/IMediaDataSource;FJ)V

    add-int/lit8 v2, v2, 0x1

    goto :goto_0

    :cond_1
    return-void
.end method


# virtual methods
.method checkVisualizerLife()V
    .locals 7

    .line 289
    iget-object v0, p0, Lcom/daaw/avee/comp/playback/ExoMediaPlayer/ExoMediaPlayerCore;->visualizerLock:Ljava/lang/Object;

    monitor-enter v0

    .line 290
    :try_start_0
    iget-object v1, p0, Lcom/daaw/avee/comp/playback/ExoMediaPlayer/ExoMediaPlayerCore;->visualizerData:Lcom/daaw/avee/comp/PcmProcess/ExoVisualizerDataProvider;

    if-eqz v1, :cond_0

    .line 291
    invoke-static {}, Landroid/os/SystemClock;->elapsedRealtime()J

    move-result-wide v2

    iget-wide v4, p0, Lcom/daaw/avee/comp/playback/ExoMediaPlayer/ExoMediaPlayerCore;->visualizerLastTimeUsed:J

    sub-long/2addr v2, v4

    const-wide/16 v4, 0x1f40

    cmp-long v6, v2, v4

    if-lez v6, :cond_0

    .line 292
    invoke-virtual {v1}, Lcom/daaw/avee/comp/PcmProcess/ExoVisualizerDataProvider;->release()V

    const/4 v1, 0x0

    .line 293
    iput-object v1, p0, Lcom/daaw/avee/comp/playback/ExoMediaPlayer/ExoMediaPlayerCore;->visualizerData:Lcom/daaw/avee/comp/PcmProcess/ExoVisualizerDataProvider;

    .line 295
    :cond_0
    monitor-exit v0

    return-void

    :catchall_0
    move-exception v1

    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw v1
.end method

.method public containsVideoTrack()Z
    .locals 1

    .line 389
    invoke-direct {p0}, Lcom/daaw/avee/comp/playback/ExoMediaPlayer/ExoMediaPlayerCore;->getPlayer()Lcom/google/android/exoplayer2/SimpleExoPlayer;

    move-result-object v0

    if-eqz v0, :cond_0

    const/4 v0, 0x1

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    return v0
.end method

.method cycleNextPlayer()V
    .locals 2

    .line 544
    iget v0, p0, Lcom/daaw/avee/comp/playback/ExoMediaPlayer/ExoMediaPlayerCore;->currentPlayer:I

    .line 545
    iget v1, p0, Lcom/daaw/avee/comp/playback/ExoMediaPlayer/ExoMediaPlayerCore;->nextPlayer:I

    iput v1, p0, Lcom/daaw/avee/comp/playback/ExoMediaPlayer/ExoMediaPlayerCore;->currentPlayer:I

    .line 546
    iput v0, p0, Lcom/daaw/avee/comp/playback/ExoMediaPlayer/ExoMediaPlayerCore;->nextPlayer:I

    return-void
.end method

.method public destroy(I)V
    .locals 1

    if-nez p1, :cond_0

    const-string p1, "trying to destroy currentPlayer"

    .line 524
    invoke-static {p1}, Lcom/daaw/avee/Common/tlog;->w(Ljava/lang/String;)V

    goto :goto_0

    .line 526
    :cond_0
    iget p1, p0, Lcom/daaw/avee/comp/playback/ExoMediaPlayer/ExoMediaPlayerCore;->currentPlayer:I

    iget v0, p0, Lcom/daaw/avee/comp/playback/ExoMediaPlayer/ExoMediaPlayerCore;->nextPlayer:I

    if-ne p1, v0, :cond_1

    return-void

    .line 527
    :cond_1
    iget-object p1, p0, Lcom/daaw/avee/comp/playback/ExoMediaPlayer/ExoMediaPlayerCore;->players:[Lcom/daaw/avee/comp/playback/ExoMediaPlayer/ExoMediaPlayerCore$PlayerEntry;

    aget-object p1, p1, v0

    invoke-static {p1}, Lcom/daaw/avee/comp/playback/ExoMediaPlayer/ExoMediaPlayerCore$PlayerEntry;->access$700(Lcom/daaw/avee/comp/playback/ExoMediaPlayer/ExoMediaPlayerCore$PlayerEntry;)V

    :goto_0
    return-void
.end method

.method public destroyOld()V
    .locals 2

    .line 518
    iget v0, p0, Lcom/daaw/avee/comp/playback/ExoMediaPlayer/ExoMediaPlayerCore;->currentPlayer:I

    iget v1, p0, Lcom/daaw/avee/comp/playback/ExoMediaPlayer/ExoMediaPlayerCore;->nextPlayer:I

    if-ne v0, v1, :cond_0

    return-void

    :cond_0
    const/4 v0, 0x1

    .line 519
    invoke-virtual {p0, v0}, Lcom/daaw/avee/comp/playback/ExoMediaPlayer/ExoMediaPlayerCore;->destroy(I)V

    return-void
.end method

.method public duration()J
    .locals 2

    .line 425
    invoke-virtual {p0}, Lcom/daaw/avee/comp/playback/ExoMediaPlayer/ExoMediaPlayerCore;->getPlayerEntry()Lcom/daaw/avee/comp/playback/ExoMediaPlayer/ExoMediaPlayerCore$PlayerEntry;

    move-result-object v0

    invoke-virtual {v0}, Lcom/daaw/avee/comp/playback/ExoMediaPlayer/ExoMediaPlayerCore$PlayerEntry;->getDuration()J

    move-result-wide v0

    return-wide v0
.end method

.method public getEqualizerDesc()Lcom/daaw/avee/comp/playback/BaseEqualizerEffect$EqualizerDesc;
    .locals 1

    .line 632
    iget-object v0, p0, Lcom/daaw/avee/comp/playback/ExoMediaPlayer/ExoMediaPlayerCore;->equalizerEffect:Lcom/daaw/avee/comp/playback/ExoMediaPlayer/ExoEqualizerEffect;

    if-eqz v0, :cond_0

    invoke-virtual {v0}, Lcom/daaw/avee/comp/playback/ExoMediaPlayer/ExoEqualizerEffect;->getEqualizerDesc()Lcom/daaw/avee/comp/playback/BaseEqualizerEffect$EqualizerDesc;

    move-result-object v0

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    return-object v0
.end method

.method public getEqualizerSettings(Ljava/lang/String;)Lcom/daaw/avee/comp/playback/BaseEqualizerEffect$EqualizerSettings;
    .locals 1

    .line 617
    iget-object v0, p0, Lcom/daaw/avee/comp/playback/ExoMediaPlayer/ExoMediaPlayerCore;->onNotifyListener:Lcom/daaw/avee/comp/playback/IMediaPlayerCore$OnNotifyListener;

    invoke-interface {v0, p1}, Lcom/daaw/avee/comp/playback/IMediaPlayerCore$OnNotifyListener;->getEqualizerSettings(Ljava/lang/String;)Lcom/daaw/avee/comp/playback/BaseEqualizerEffect$EqualizerSettings;

    move-result-object p1

    return-object p1
.end method

.method getNextPlayerEntry()Lcom/daaw/avee/comp/playback/ExoMediaPlayer/ExoMediaPlayerCore$PlayerEntry;
    .locals 2

    .line 540
    iget-object v0, p0, Lcom/daaw/avee/comp/playback/ExoMediaPlayer/ExoMediaPlayerCore;->players:[Lcom/daaw/avee/comp/playback/ExoMediaPlayer/ExoMediaPlayerCore$PlayerEntry;

    iget v1, p0, Lcom/daaw/avee/comp/playback/ExoMediaPlayer/ExoMediaPlayerCore;->nextPlayer:I

    aget-object v0, v0, v1

    return-object v0
.end method

.method getPlayerEntry()Lcom/daaw/avee/comp/playback/ExoMediaPlayer/ExoMediaPlayerCore$PlayerEntry;
    .locals 2

    .line 536
    iget-object v0, p0, Lcom/daaw/avee/comp/playback/ExoMediaPlayer/ExoMediaPlayerCore;->players:[Lcom/daaw/avee/comp/playback/ExoMediaPlayer/ExoMediaPlayerCore$PlayerEntry;

    iget v1, p0, Lcom/daaw/avee/comp/playback/ExoMediaPlayer/ExoMediaPlayerCore;->currentPlayer:I

    aget-object v0, v0, v1

    return-object v0
.end method

.method public getPlayingMediaInfo()Lcom/daaw/avee/comp/playback/PlayingMediaInfo;
    .locals 4

    .line 430
    invoke-direct {p0}, Lcom/daaw/avee/comp/playback/ExoMediaPlayer/ExoMediaPlayerCore;->getPlayer()Lcom/google/android/exoplayer2/SimpleExoPlayer;

    move-result-object v0

    if-nez v0, :cond_0

    const/4 v0, 0x0

    return-object v0

    .line 431
    :cond_0
    new-instance v0, Lcom/daaw/avee/comp/playback/PlayingMediaInfo;

    .line 432
    invoke-virtual {p0}, Lcom/daaw/avee/comp/playback/ExoMediaPlayer/ExoMediaPlayerCore;->getPlayerEntry()Lcom/daaw/avee/comp/playback/ExoMediaPlayer/ExoMediaPlayerCore$PlayerEntry;

    move-result-object v1

    invoke-virtual {v1}, Lcom/daaw/avee/comp/playback/ExoMediaPlayer/ExoMediaPlayerCore$PlayerEntry;->getDuration()J

    move-result-wide v1

    .line 433
    invoke-direct {p0}, Lcom/daaw/avee/comp/playback/ExoMediaPlayer/ExoMediaPlayerCore;->getPlayer()Lcom/google/android/exoplayer2/SimpleExoPlayer;

    move-result-object v3

    if-eqz v3, :cond_1

    const/4 v3, 0x1

    goto :goto_0

    :cond_1
    const/4 v3, 0x0

    :goto_0
    invoke-direct {v0, v1, v2, v3}, Lcom/daaw/avee/comp/playback/PlayingMediaInfo;-><init>(JZ)V

    return-object v0
.end method

.method public getVisualizationData(Lcom/daaw/avee/comp/playback/AudioFrameData;Lcom/daaw/avee/comp/playback/AudioFrameData$Request2;)Lcom/daaw/avee/comp/playback/AudioFrameData;
    .locals 5

    if-nez p1, :cond_0

    const/4 p1, 0x0

    return-object p1

    .line 587
    :cond_0
    iget-wide v0, p2, Lcom/daaw/avee/comp/playback/AudioFrameData$Request2;->overridePositionUs:J

    const-wide/16 v2, 0x0

    cmp-long v4, v0, v2

    if-gez v4, :cond_1

    .line 588
    invoke-virtual {p0}, Lcom/daaw/avee/comp/playback/ExoMediaPlayer/ExoMediaPlayerCore;->position()J

    move-result-wide v0

    const-wide/16 v2, 0x3e8

    mul-long v0, v0, v2

    invoke-virtual {p1, v0, v1}, Lcom/daaw/avee/comp/playback/AudioFrameData;->initAsUseExoData(J)V

    goto :goto_0

    .line 590
    :cond_1
    iget-wide v0, p2, Lcom/daaw/avee/comp/playback/AudioFrameData$Request2;->overridePositionUs:J

    invoke-virtual {p1, v0, v1}, Lcom/daaw/avee/comp/playback/AudioFrameData;->initAsUseExoData(J)V

    :goto_0
    return-object p1
.end method

.method public isEqualizerEnabled(Ljava/lang/String;)Z
    .locals 1

    .line 622
    iget-object v0, p0, Lcom/daaw/avee/comp/playback/ExoMediaPlayer/ExoMediaPlayerCore;->onNotifyListener:Lcom/daaw/avee/comp/playback/IMediaPlayerCore$OnNotifyListener;

    invoke-interface {v0, p1}, Lcom/daaw/avee/comp/playback/IMediaPlayerCore$OnNotifyListener;->getEqualizerEnabled(Ljava/lang/String;)Z

    move-result p1

    return p1
.end method

.method public isMuted()Z
    .locals 1

    .line 458
    iget-boolean v0, p0, Lcom/daaw/avee/comp/playback/ExoMediaPlayer/ExoMediaPlayerCore;->muted:Z

    return v0
.end method

.method public isPreparingOrAbove()Z
    .locals 2

    .line 368
    invoke-direct {p0}, Lcom/daaw/avee/comp/playback/ExoMediaPlayer/ExoMediaPlayerCore;->getPlayer()Lcom/google/android/exoplayer2/SimpleExoPlayer;

    move-result-object v0

    if-eqz v0, :cond_1

    .line 369
    invoke-direct {p0}, Lcom/daaw/avee/comp/playback/ExoMediaPlayer/ExoMediaPlayerCore;->getPlayer()Lcom/google/android/exoplayer2/SimpleExoPlayer;

    move-result-object v0

    invoke-virtual {v0}, Lcom/google/android/exoplayer2/SimpleExoPlayer;->getPlaybackState()I

    move-result v0

    const/4 v1, 0x2

    if-eq v0, v1, :cond_0

    .line 370
    invoke-direct {p0}, Lcom/daaw/avee/comp/playback/ExoMediaPlayer/ExoMediaPlayerCore;->getPlayer()Lcom/google/android/exoplayer2/SimpleExoPlayer;

    move-result-object v0

    invoke-virtual {v0}, Lcom/google/android/exoplayer2/SimpleExoPlayer;->getPlaybackState()I

    move-result v0

    const/4 v1, 0x3

    if-ne v0, v1, :cond_1

    :cond_0
    const/4 v0, 0x1

    goto :goto_0

    :cond_1
    const/4 v0, 0x0

    :goto_0
    return v0
.end method

.method public isPreparingOrStared()Z
    .locals 3

    .line 374
    invoke-direct {p0}, Lcom/daaw/avee/comp/playback/ExoMediaPlayer/ExoMediaPlayerCore;->getPlayer()Lcom/google/android/exoplayer2/SimpleExoPlayer;

    move-result-object v0

    const/4 v1, 0x0

    if-nez v0, :cond_0

    return v1

    .line 382
    :cond_0
    invoke-direct {p0}, Lcom/daaw/avee/comp/playback/ExoMediaPlayer/ExoMediaPlayerCore;->getPlayer()Lcom/google/android/exoplayer2/SimpleExoPlayer;

    move-result-object v0

    invoke-virtual {v0}, Lcom/google/android/exoplayer2/SimpleExoPlayer;->getPlaybackState()I

    move-result v0

    const/4 v2, 0x4

    if-eq v0, v2, :cond_1

    invoke-direct {p0}, Lcom/daaw/avee/comp/playback/ExoMediaPlayer/ExoMediaPlayerCore;->getPlayer()Lcom/google/android/exoplayer2/SimpleExoPlayer;

    move-result-object v0

    invoke-virtual {v0}, Lcom/google/android/exoplayer2/SimpleExoPlayer;->getPlayWhenReady()Z

    move-result v0

    if-eqz v0, :cond_1

    const/4 v1, 0x1

    :cond_1
    return v1
.end method

.method public onEqualizerDescChanged(Lcom/daaw/avee/comp/playback/BaseEqualizerEffect$EqualizerDesc;)V
    .locals 1

    .line 627
    iget-object v0, p0, Lcom/daaw/avee/comp/playback/ExoMediaPlayer/ExoMediaPlayerCore;->onNotifyListener:Lcom/daaw/avee/comp/playback/IMediaPlayerCore$OnNotifyListener;

    invoke-interface {v0, p1}, Lcom/daaw/avee/comp/playback/IMediaPlayerCore$OnNotifyListener;->onEqualizerDescChanged(Lcom/daaw/avee/comp/playback/BaseEqualizerEffect$EqualizerDesc;)V

    return-void
.end method

.method public pause()V
    .locals 3

    .line 355
    invoke-direct {p0}, Lcom/daaw/avee/comp/playback/ExoMediaPlayer/ExoMediaPlayerCore;->getPlayer()Lcom/google/android/exoplayer2/SimpleExoPlayer;

    move-result-object v0

    if-nez v0, :cond_0

    return-void

    .line 356
    :cond_0
    invoke-virtual {p0}, Lcom/daaw/avee/comp/playback/ExoMediaPlayer/ExoMediaPlayerCore;->getPlayerEntry()Lcom/daaw/avee/comp/playback/ExoMediaPlayer/ExoMediaPlayerCore$PlayerEntry;

    move-result-object v0

    invoke-virtual {v0}, Lcom/daaw/avee/comp/playback/ExoMediaPlayer/ExoMediaPlayerCore$PlayerEntry;->pause()V

    .line 357
    iget-object v0, p0, Lcom/daaw/avee/comp/playback/ExoMediaPlayer/ExoMediaPlayerCore;->onNotifyListener:Lcom/daaw/avee/comp/playback/IMediaPlayerCore$OnNotifyListener;

    const/4 v1, 0x0

    const/4 v2, 0x0

    invoke-interface {v0, v1, v2}, Lcom/daaw/avee/comp/playback/IMediaPlayerCore$OnNotifyListener;->onMpPlaystateOrMetaChanged(ZLjava/lang/String;)V

    return-void
.end method

.method public playNext(ZZFJ)V
    .locals 1

    if-nez p1, :cond_0

    .line 310
    invoke-virtual {p0}, Lcom/daaw/avee/comp/playback/ExoMediaPlayer/ExoMediaPlayerCore;->isPreparingOrAbove()Z

    move-result p1

    if-eqz p1, :cond_1

    .line 311
    invoke-virtual {p0}, Lcom/daaw/avee/comp/playback/ExoMediaPlayer/ExoMediaPlayerCore;->cycleNextPlayer()V

    goto :goto_0

    .line 314
    :cond_0
    iget p1, p0, Lcom/daaw/avee/comp/playback/ExoMediaPlayer/ExoMediaPlayerCore;->currentPlayer:I

    iget v0, p0, Lcom/daaw/avee/comp/playback/ExoMediaPlayer/ExoMediaPlayerCore;->nextPlayer:I

    if-eq p1, v0, :cond_1

    .line 315
    invoke-virtual {p0}, Lcom/daaw/avee/comp/playback/ExoMediaPlayer/ExoMediaPlayerCore;->getNextPlayerEntry()Lcom/daaw/avee/comp/playback/ExoMediaPlayer/ExoMediaPlayerCore$PlayerEntry;

    move-result-object p1

    invoke-static {p1}, Lcom/daaw/avee/comp/playback/ExoMediaPlayer/ExoMediaPlayerCore$PlayerEntry;->access$700(Lcom/daaw/avee/comp/playback/ExoMediaPlayer/ExoMediaPlayerCore$PlayerEntry;)V

    .line 319
    :cond_1
    :goto_0
    iget-object p1, p0, Lcom/daaw/avee/comp/playback/ExoMediaPlayer/ExoMediaPlayerCore;->nextDataSource:Lcom/daaw/avee/comp/playback/Song/IMediaDataSource;

    if-eqz p1, :cond_4

    invoke-interface {p1}, Lcom/daaw/avee/comp/playback/Song/IMediaDataSource;->getContentUri()Landroid/net/Uri;

    move-result-object p1

    if-eqz p1, :cond_4

    iget-object p1, p0, Lcom/daaw/avee/comp/playback/ExoMediaPlayer/ExoMediaPlayerCore;->nextDataSource:Lcom/daaw/avee/comp/playback/Song/IMediaDataSource;

    invoke-interface {p1}, Lcom/daaw/avee/comp/playback/Song/IMediaDataSource;->getContentUri()Landroid/net/Uri;

    move-result-object p1

    sget-object v0, Landroid/net/Uri;->EMPTY:Landroid/net/Uri;

    invoke-virtual {p1, v0}, Landroid/net/Uri;->equals(Ljava/lang/Object;)Z

    move-result p1

    if-eqz p1, :cond_2

    goto :goto_2

    .line 330
    :cond_2
    invoke-virtual {p0}, Lcom/daaw/avee/comp/playback/ExoMediaPlayer/ExoMediaPlayerCore;->getPlayerEntry()Lcom/daaw/avee/comp/playback/ExoMediaPlayer/ExoMediaPlayerCore$PlayerEntry;

    move-result-object p1

    iget-object v0, p0, Lcom/daaw/avee/comp/playback/ExoMediaPlayer/ExoMediaPlayerCore;->nextDataSource:Lcom/daaw/avee/comp/playback/Song/IMediaDataSource;

    invoke-virtual {p1, v0, p3, p4, p5}, Lcom/daaw/avee/comp/playback/ExoMediaPlayer/ExoMediaPlayerCore$PlayerEntry;->preparePlayer(Lcom/daaw/avee/comp/playback/Song/IMediaDataSource;FJ)V

    if-eqz p2, :cond_3

    .line 333
    invoke-virtual {p0}, Lcom/daaw/avee/comp/playback/ExoMediaPlayer/ExoMediaPlayerCore;->start()V

    goto :goto_1

    .line 335
    :cond_3
    invoke-virtual {p0}, Lcom/daaw/avee/comp/playback/ExoMediaPlayer/ExoMediaPlayerCore;->getPlayerEntry()Lcom/daaw/avee/comp/playback/ExoMediaPlayer/ExoMediaPlayerCore$PlayerEntry;

    move-result-object p1

    invoke-virtual {p1}, Lcom/daaw/avee/comp/playback/ExoMediaPlayer/ExoMediaPlayerCore$PlayerEntry;->pause()V

    :goto_1
    return-void

    :cond_4
    :goto_2
    const-string p1, "nextDataSource is null"

    .line 320
    invoke-static {p1}, Lcom/daaw/avee/Common/tlog;->w(Ljava/lang/String;)V

    if-eqz p2, :cond_5

    .line 323
    invoke-virtual {p0}, Lcom/daaw/avee/comp/playback/ExoMediaPlayer/ExoMediaPlayerCore;->start()V

    goto :goto_3

    .line 325
    :cond_5
    invoke-virtual {p0}, Lcom/daaw/avee/comp/playback/ExoMediaPlayer/ExoMediaPlayerCore;->pause()V

    :goto_3
    return-void
.end method

.method public position()J
    .locals 2

    .line 440
    invoke-direct {p0}, Lcom/daaw/avee/comp/playback/ExoMediaPlayer/ExoMediaPlayerCore;->getPlayer()Lcom/google/android/exoplayer2/SimpleExoPlayer;

    move-result-object v0

    if-nez v0, :cond_0

    const-wide/16 v0, 0x0

    return-wide v0

    .line 441
    :cond_0
    invoke-direct {p0}, Lcom/daaw/avee/comp/playback/ExoMediaPlayer/ExoMediaPlayerCore;->getPlayer()Lcom/google/android/exoplayer2/SimpleExoPlayer;

    move-result-object v0

    invoke-virtual {v0}, Lcom/google/android/exoplayer2/SimpleExoPlayer;->getCurrentPosition()J

    move-result-wide v0

    return-wide v0
.end method

.method public release()V
    .locals 4

    .line 263
    iget-object v0, p0, Lcom/daaw/avee/comp/playback/ExoMediaPlayer/ExoMediaPlayerCore;->equalizerEffect:Lcom/daaw/avee/comp/playback/ExoMediaPlayer/ExoEqualizerEffect;

    const/4 v1, 0x0

    if-eqz v0, :cond_0

    .line 264
    invoke-virtual {v0}, Lcom/daaw/avee/comp/playback/ExoMediaPlayer/ExoEqualizerEffect;->release()V

    .line 265
    iput-object v1, p0, Lcom/daaw/avee/comp/playback/ExoMediaPlayer/ExoMediaPlayerCore;->equalizerEffect:Lcom/daaw/avee/comp/playback/ExoMediaPlayer/ExoEqualizerEffect;

    .line 268
    :cond_0
    invoke-virtual {p0, v1}, Lcom/daaw/avee/comp/playback/ExoMediaPlayer/ExoMediaPlayerCore;->setVideoSurfaceHolder(Landroid/view/SurfaceHolder;)V

    .line 270
    iget-object v0, p0, Lcom/daaw/avee/comp/playback/ExoMediaPlayer/ExoMediaPlayerCore;->players:[Lcom/daaw/avee/comp/playback/ExoMediaPlayer/ExoMediaPlayerCore$PlayerEntry;

    array-length v1, v0

    const/4 v2, 0x0

    :goto_0
    if-ge v2, v1, :cond_1

    aget-object v3, v0, v2

    .line 271
    invoke-static {v3}, Lcom/daaw/avee/comp/playback/ExoMediaPlayer/ExoMediaPlayerCore$PlayerEntry;->access$700(Lcom/daaw/avee/comp/playback/ExoMediaPlayer/ExoMediaPlayerCore$PlayerEntry;)V

    add-int/lit8 v2, v2, 0x1

    goto :goto_0

    :cond_1
    return-void
.end method

.method public resetVisualizer()V
    .locals 0

    return-void
.end method

.method public seek(J)V
    .locals 2

    .line 445
    iput-wide p1, p0, Lcom/daaw/avee/comp/playback/ExoMediaPlayer/ExoMediaPlayerCore;->lastSeekTimeMs:J

    .line 446
    invoke-virtual {p0}, Lcom/daaw/avee/comp/playback/ExoMediaPlayer/ExoMediaPlayerCore;->getPlayerEntry()Lcom/daaw/avee/comp/playback/ExoMediaPlayer/ExoMediaPlayerCore$PlayerEntry;

    move-result-object v0

    const/high16 v1, 0x3f800000    # 1.0f

    invoke-virtual {v0, v1}, Lcom/daaw/avee/comp/playback/ExoMediaPlayer/ExoMediaPlayerCore$PlayerEntry;->setFadeVolume(F)V

    .line 447
    invoke-virtual {p0}, Lcom/daaw/avee/comp/playback/ExoMediaPlayer/ExoMediaPlayerCore;->getPlayerEntry()Lcom/daaw/avee/comp/playback/ExoMediaPlayer/ExoMediaPlayerCore$PlayerEntry;

    move-result-object v0

    long-to-int p2, p1

    int-to-long p1, p2

    invoke-virtual {v0, p1, p2}, Lcom/daaw/avee/comp/playback/ExoMediaPlayer/ExoMediaPlayerCore$PlayerEntry;->seekTo(J)V

    return-void
.end method

.method public setEqualizerSettings(Lcom/daaw/avee/comp/playback/BaseEqualizerEffect$EqualizerSettings;)V
    .locals 1

    .line 637
    iget-object v0, p0, Lcom/daaw/avee/comp/playback/ExoMediaPlayer/ExoMediaPlayerCore;->equalizerEffect:Lcom/daaw/avee/comp/playback/ExoMediaPlayer/ExoEqualizerEffect;

    if-eqz v0, :cond_0

    .line 638
    invoke-virtual {v0, p1}, Lcom/daaw/avee/comp/playback/ExoMediaPlayer/ExoEqualizerEffect;->setEqualizerSettings(Lcom/daaw/avee/comp/playback/BaseEqualizerEffect$EqualizerSettings;)V

    :cond_0
    return-void
.end method

.method public setFadeVolume(FI)V
    .locals 2

    if-nez p2, :cond_0

    .line 486
    iget p2, p0, Lcom/daaw/avee/comp/playback/ExoMediaPlayer/ExoMediaPlayerCore;->currentPlayer:I

    goto :goto_0

    .line 488
    :cond_0
    iget p2, p0, Lcom/daaw/avee/comp/playback/ExoMediaPlayer/ExoMediaPlayerCore;->nextPlayer:I

    .line 489
    iget v0, p0, Lcom/daaw/avee/comp/playback/ExoMediaPlayer/ExoMediaPlayerCore;->currentPlayer:I

    if-ne v0, p2, :cond_1

    return-void

    .line 492
    :cond_1
    :goto_0
    iget-object v0, p0, Lcom/daaw/avee/comp/playback/ExoMediaPlayer/ExoMediaPlayerCore;->players:[Lcom/daaw/avee/comp/playback/ExoMediaPlayer/ExoMediaPlayerCore$PlayerEntry;

    aget-object v1, v0, p2

    if-eqz v1, :cond_2

    .line 493
    aget-object p2, v0, p2

    invoke-virtual {p2, p1}, Lcom/daaw/avee/comp/playback/ExoMediaPlayer/ExoMediaPlayerCore$PlayerEntry;->setFadeVolume(F)V

    :cond_2
    return-void
.end method

.method public setFadeVolumeRelative(FI)Z
    .locals 3

    const/4 v0, 0x1

    if-nez p2, :cond_0

    .line 499
    iget p2, p0, Lcom/daaw/avee/comp/playback/ExoMediaPlayer/ExoMediaPlayerCore;->currentPlayer:I

    goto :goto_0

    .line 501
    :cond_0
    iget p2, p0, Lcom/daaw/avee/comp/playback/ExoMediaPlayer/ExoMediaPlayerCore;->nextPlayer:I

    .line 502
    iget v1, p0, Lcom/daaw/avee/comp/playback/ExoMediaPlayer/ExoMediaPlayerCore;->currentPlayer:I

    if-ne v1, p2, :cond_1

    return v0

    .line 504
    :cond_1
    :goto_0
    iget-object v1, p0, Lcom/daaw/avee/comp/playback/ExoMediaPlayer/ExoMediaPlayerCore;->players:[Lcom/daaw/avee/comp/playback/ExoMediaPlayer/ExoMediaPlayerCore$PlayerEntry;

    aget-object v2, v1, p2

    if-eqz v2, :cond_3

    aget-object p2, v1, p2

    invoke-virtual {p2, p1}, Lcom/daaw/avee/comp/playback/ExoMediaPlayer/ExoMediaPlayerCore$PlayerEntry;->setFadeVolumeRelative(F)Z

    move-result p1

    if-eqz p1, :cond_2

    goto :goto_1

    :cond_2
    const/4 v0, 0x0

    :cond_3
    :goto_1
    return v0
.end method

.method public setMute(Z)V
    .locals 1

    .line 452
    iget v0, p0, Lcom/daaw/avee/comp/playback/ExoMediaPlayer/ExoMediaPlayerCore;->volume:F

    invoke-virtual {p0, p1, v0}, Lcom/daaw/avee/comp/playback/ExoMediaPlayer/ExoMediaPlayerCore;->setVolume(ZF)V

    .line 453
    iget-object v0, p0, Lcom/daaw/avee/comp/playback/ExoMediaPlayer/ExoMediaPlayerCore;->onNotifyListener:Lcom/daaw/avee/comp/playback/IMediaPlayerCore$OnNotifyListener;

    invoke-interface {v0, p1}, Lcom/daaw/avee/comp/playback/IMediaPlayerCore$OnNotifyListener;->onVolumeMuteStateChanged(Z)V

    return-void
.end method

.method public setNextDataSource(Lcom/daaw/avee/comp/playback/Song/IMediaDataSource;)V
    .locals 0

    .line 299
    iput-object p1, p0, Lcom/daaw/avee/comp/playback/ExoMediaPlayer/ExoMediaPlayerCore;->nextDataSource:Lcom/daaw/avee/comp/playback/Song/IMediaDataSource;

    return-void
.end method

.method public setNotifyListener(Lcom/daaw/avee/comp/playback/IMediaPlayerCore$OnNotifyListener;)V
    .locals 0

    .line 259
    iput-object p1, p0, Lcom/daaw/avee/comp/playback/ExoMediaPlayer/ExoMediaPlayerCore;->onNotifyListener:Lcom/daaw/avee/comp/playback/IMediaPlayerCore$OnNotifyListener;

    return-void
.end method

.method public setVideoScalingMode(I)V
    .locals 1

    .line 394
    invoke-virtual {p0}, Lcom/daaw/avee/comp/playback/ExoMediaPlayer/ExoMediaPlayerCore;->getPlayerEntry()Lcom/daaw/avee/comp/playback/ExoMediaPlayer/ExoMediaPlayerCore$PlayerEntry;

    move-result-object v0

    invoke-virtual {v0, p1}, Lcom/daaw/avee/comp/playback/ExoMediaPlayer/ExoMediaPlayerCore$PlayerEntry;->setVideoScalingMode(I)V

    return-void
.end method

.method public setVideoSurfaceHolder(Landroid/view/SurfaceHolder;)V
    .locals 1

    if-eqz p1, :cond_0

    .line 409
    new-instance v0, Ljava/lang/ref/WeakReference;

    invoke-direct {v0, p1}, Ljava/lang/ref/WeakReference;-><init>(Ljava/lang/Object;)V

    iput-object v0, p0, Lcom/daaw/avee/comp/playback/ExoMediaPlayer/ExoMediaPlayerCore;->surfaceHolderWeak:Ljava/lang/ref/WeakReference;

    .line 410
    invoke-interface {p1, p0}, Landroid/view/SurfaceHolder;->removeCallback(Landroid/view/SurfaceHolder$Callback;)V

    .line 411
    invoke-interface {p1, p0}, Landroid/view/SurfaceHolder;->addCallback(Landroid/view/SurfaceHolder$Callback;)V

    .line 413
    invoke-virtual {p0, p1}, Lcom/daaw/avee/comp/playback/ExoMediaPlayer/ExoMediaPlayerCore;->surfaceCreated(Landroid/view/SurfaceHolder;)V

    goto :goto_0

    .line 415
    :cond_0
    iget-object p1, p0, Lcom/daaw/avee/comp/playback/ExoMediaPlayer/ExoMediaPlayerCore;->surfaceHolderWeak:Ljava/lang/ref/WeakReference;

    invoke-virtual {p1}, Ljava/lang/ref/WeakReference;->get()Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Landroid/view/SurfaceHolder;

    const/4 v0, 0x0

    if-eqz p1, :cond_1

    .line 417
    invoke-interface {p1, p0}, Landroid/view/SurfaceHolder;->removeCallback(Landroid/view/SurfaceHolder$Callback;)V

    .line 418
    new-instance p1, Ljava/lang/ref/WeakReference;

    invoke-direct {p1, v0}, Ljava/lang/ref/WeakReference;-><init>(Ljava/lang/Object;)V

    iput-object p1, p0, Lcom/daaw/avee/comp/playback/ExoMediaPlayer/ExoMediaPlayerCore;->surfaceHolderWeak:Ljava/lang/ref/WeakReference;

    .line 420
    :cond_1
    invoke-virtual {p0, v0}, Lcom/daaw/avee/comp/playback/ExoMediaPlayer/ExoMediaPlayerCore;->surfaceDestroyed(Landroid/view/SurfaceHolder;)V

    :goto_0
    return-void
.end method

.method public setVolume(F)V
    .locals 1

    .line 463
    iget-boolean v0, p0, Lcom/daaw/avee/comp/playback/ExoMediaPlayer/ExoMediaPlayerCore;->muted:Z

    invoke-virtual {p0, v0, p1}, Lcom/daaw/avee/comp/playback/ExoMediaPlayer/ExoMediaPlayerCore;->setVolume(ZF)V

    return-void
.end method

.method public setVolume(ZF)V
    .locals 3

    .line 467
    iput p2, p0, Lcom/daaw/avee/comp/playback/ExoMediaPlayer/ExoMediaPlayerCore;->volume:F

    .line 468
    iput-boolean p1, p0, Lcom/daaw/avee/comp/playback/ExoMediaPlayer/ExoMediaPlayerCore;->muted:Z

    const/4 v0, 0x0

    if-eqz p1, :cond_1

    .line 471
    iget-object p1, p0, Lcom/daaw/avee/comp/playback/ExoMediaPlayer/ExoMediaPlayerCore;->players:[Lcom/daaw/avee/comp/playback/ExoMediaPlayer/ExoMediaPlayerCore$PlayerEntry;

    array-length p2, p1

    :goto_0
    if-ge v0, p2, :cond_3

    aget-object v1, p1, v0

    if-eqz v1, :cond_0

    const/4 v2, 0x0

    .line 473
    invoke-virtual {v1, v2}, Lcom/daaw/avee/comp/playback/ExoMediaPlayer/ExoMediaPlayerCore$PlayerEntry;->setVolume(F)V

    :cond_0
    add-int/lit8 v0, v0, 0x1

    goto :goto_0

    .line 476
    :cond_1
    iget-object p1, p0, Lcom/daaw/avee/comp/playback/ExoMediaPlayer/ExoMediaPlayerCore;->players:[Lcom/daaw/avee/comp/playback/ExoMediaPlayer/ExoMediaPlayerCore$PlayerEntry;

    array-length v1, p1

    :goto_1
    if-ge v0, v1, :cond_3

    aget-object v2, p1, v0

    if-eqz v2, :cond_2

    .line 478
    invoke-virtual {v2, p2}, Lcom/daaw/avee/comp/playback/ExoMediaPlayer/ExoMediaPlayerCore$PlayerEntry;->setVolume(F)V

    :cond_2
    add-int/lit8 v0, v0, 0x1

    goto :goto_1

    :cond_3
    return-void
.end method

.method public setVolumeStereoBalance(F)V
    .locals 4

    .line 509
    iget-object v0, p0, Lcom/daaw/avee/comp/playback/ExoMediaPlayer/ExoMediaPlayerCore;->players:[Lcom/daaw/avee/comp/playback/ExoMediaPlayer/ExoMediaPlayerCore$PlayerEntry;

    array-length v1, v0

    const/4 v2, 0x0

    :goto_0
    if-ge v2, v1, :cond_1

    aget-object v3, v0, v2

    if-eqz v3, :cond_0

    .line 511
    invoke-virtual {v3, p1}, Lcom/daaw/avee/comp/playback/ExoMediaPlayer/ExoMediaPlayerCore$PlayerEntry;->setVolumeStereoBalance(F)V

    :cond_0
    add-int/lit8 v2, v2, 0x1

    goto :goto_0

    :cond_1
    return-void
.end method

.method public start()V
    .locals 3

    .line 340
    invoke-virtual {p0}, Lcom/daaw/avee/comp/playback/ExoMediaPlayer/ExoMediaPlayerCore;->getPlayerEntry()Lcom/daaw/avee/comp/playback/ExoMediaPlayer/ExoMediaPlayerCore$PlayerEntry;

    move-result-object v0

    .line 341
    invoke-static {v0}, Lcom/daaw/avee/comp/playback/ExoMediaPlayer/ExoMediaPlayerCore$PlayerEntry;->access$800(Lcom/daaw/avee/comp/playback/ExoMediaPlayer/ExoMediaPlayerCore$PlayerEntry;)Lcom/google/android/exoplayer2/SimpleExoPlayer;

    move-result-object v1

    if-nez v1, :cond_0

    return-void

    .line 343
    :cond_0
    iget-object v1, p0, Lcom/daaw/avee/comp/playback/ExoMediaPlayer/ExoMediaPlayerCore;->onNotifyListener:Lcom/daaw/avee/comp/playback/IMediaPlayerCore$OnNotifyListener;

    invoke-interface {v1}, Lcom/daaw/avee/comp/playback/IMediaPlayerCore$OnNotifyListener;->onRequestAudioFocus()Z

    move-result v1

    if-eqz v1, :cond_1

    .line 345
    invoke-virtual {v0}, Lcom/daaw/avee/comp/playback/ExoMediaPlayer/ExoMediaPlayerCore$PlayerEntry;->rePrepareDataSourceIfNotStarted()V

    .line 347
    iget-object v0, p0, Lcom/daaw/avee/comp/playback/ExoMediaPlayer/ExoMediaPlayerCore;->onNotifyListener:Lcom/daaw/avee/comp/playback/IMediaPlayerCore$OnNotifyListener;

    invoke-interface {v0}, Lcom/daaw/avee/comp/playback/IMediaPlayerCore$OnNotifyListener;->onRequestVideoSurfaceHolder()Landroid/view/SurfaceHolder;

    move-result-object v0

    invoke-virtual {p0, v0}, Lcom/daaw/avee/comp/playback/ExoMediaPlayer/ExoMediaPlayerCore;->surfaceCreated(Landroid/view/SurfaceHolder;)V

    .line 348
    invoke-virtual {p0}, Lcom/daaw/avee/comp/playback/ExoMediaPlayer/ExoMediaPlayerCore;->getPlayerEntry()Lcom/daaw/avee/comp/playback/ExoMediaPlayer/ExoMediaPlayerCore$PlayerEntry;

    move-result-object v0

    invoke-virtual {v0}, Lcom/daaw/avee/comp/playback/ExoMediaPlayer/ExoMediaPlayerCore$PlayerEntry;->start()V

    .line 351
    :cond_1
    iget-object v0, p0, Lcom/daaw/avee/comp/playback/ExoMediaPlayer/ExoMediaPlayerCore;->onNotifyListener:Lcom/daaw/avee/comp/playback/IMediaPlayerCore$OnNotifyListener;

    const/4 v1, 0x0

    const/4 v2, 0x0

    invoke-interface {v0, v1, v2}, Lcom/daaw/avee/comp/playback/IMediaPlayerCore$OnNotifyListener;->onMpPlaystateOrMetaChanged(ZLjava/lang/String;)V

    return-void
.end method

.method public stop()V
    .locals 3

    .line 361
    invoke-direct {p0}, Lcom/daaw/avee/comp/playback/ExoMediaPlayer/ExoMediaPlayerCore;->getPlayer()Lcom/google/android/exoplayer2/SimpleExoPlayer;

    move-result-object v0

    if-nez v0, :cond_0

    return-void

    .line 362
    :cond_0
    invoke-direct {p0}, Lcom/daaw/avee/comp/playback/ExoMediaPlayer/ExoMediaPlayerCore;->getPlayer()Lcom/google/android/exoplayer2/SimpleExoPlayer;

    move-result-object v0

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Lcom/google/android/exoplayer2/SimpleExoPlayer;->setPlayWhenReady(Z)V

    .line 363
    iget-object v0, p0, Lcom/daaw/avee/comp/playback/ExoMediaPlayer/ExoMediaPlayerCore;->onNotifyListener:Lcom/daaw/avee/comp/playback/IMediaPlayerCore$OnNotifyListener;

    const/4 v2, 0x0

    invoke-interface {v0, v1, v2}, Lcom/daaw/avee/comp/playback/IMediaPlayerCore$OnNotifyListener;->onMpPlaystateOrMetaChanged(ZLjava/lang/String;)V

    return-void
.end method

.method public surfaceChanged(Landroid/view/SurfaceHolder;III)V
    .locals 0

    return-void
.end method

.method public surfaceCreated(Landroid/view/SurfaceHolder;)V
    .locals 2

    const/4 v0, 0x0

    if-eqz p1, :cond_0

    .line 553
    invoke-virtual {p0}, Lcom/daaw/avee/comp/playback/ExoMediaPlayer/ExoMediaPlayerCore;->getNextPlayerEntry()Lcom/daaw/avee/comp/playback/ExoMediaPlayer/ExoMediaPlayerCore$PlayerEntry;

    move-result-object v1

    invoke-virtual {v1, v0}, Lcom/daaw/avee/comp/playback/ExoMediaPlayer/ExoMediaPlayerCore$PlayerEntry;->setVideoSurface(Landroid/view/Surface;)Z

    .line 554
    invoke-virtual {p0}, Lcom/daaw/avee/comp/playback/ExoMediaPlayer/ExoMediaPlayerCore;->getPlayerEntry()Lcom/daaw/avee/comp/playback/ExoMediaPlayer/ExoMediaPlayerCore$PlayerEntry;

    move-result-object v0

    invoke-interface {p1}, Landroid/view/SurfaceHolder;->getSurface()Landroid/view/Surface;

    move-result-object p1

    invoke-virtual {v0, p1}, Lcom/daaw/avee/comp/playback/ExoMediaPlayer/ExoMediaPlayerCore$PlayerEntry;->setVideoSurface(Landroid/view/Surface;)Z

    move-result p1

    goto :goto_0

    .line 559
    :cond_0
    invoke-virtual {p0}, Lcom/daaw/avee/comp/playback/ExoMediaPlayer/ExoMediaPlayerCore;->getNextPlayerEntry()Lcom/daaw/avee/comp/playback/ExoMediaPlayer/ExoMediaPlayerCore$PlayerEntry;

    move-result-object p1

    invoke-virtual {p1, v0}, Lcom/daaw/avee/comp/playback/ExoMediaPlayer/ExoMediaPlayerCore$PlayerEntry;->setVideoSurface(Landroid/view/Surface;)Z

    .line 560
    invoke-virtual {p0}, Lcom/daaw/avee/comp/playback/ExoMediaPlayer/ExoMediaPlayerCore;->getPlayerEntry()Lcom/daaw/avee/comp/playback/ExoMediaPlayer/ExoMediaPlayerCore$PlayerEntry;

    move-result-object p1

    invoke-virtual {p1, v0}, Lcom/daaw/avee/comp/playback/ExoMediaPlayer/ExoMediaPlayerCore$PlayerEntry;->setVideoSurface(Landroid/view/Surface;)Z

    :goto_0
    return-void
.end method

.method public surfaceDestroyed(Landroid/view/SurfaceHolder;)V
    .locals 2

    .line 571
    iget p1, p0, Lcom/daaw/avee/comp/playback/ExoMediaPlayer/ExoMediaPlayerCore;->currentPlayer:I

    iget v0, p0, Lcom/daaw/avee/comp/playback/ExoMediaPlayer/ExoMediaPlayerCore;->nextPlayer:I

    const/4 v1, 0x0

    if-eq p1, v0, :cond_0

    invoke-virtual {p0}, Lcom/daaw/avee/comp/playback/ExoMediaPlayer/ExoMediaPlayerCore;->getNextPlayerEntry()Lcom/daaw/avee/comp/playback/ExoMediaPlayer/ExoMediaPlayerCore$PlayerEntry;

    move-result-object p1

    invoke-virtual {p1, v1}, Lcom/daaw/avee/comp/playback/ExoMediaPlayer/ExoMediaPlayerCore$PlayerEntry;->setVideoSurface(Landroid/view/Surface;)Z

    .line 572
    :cond_0
    invoke-virtual {p0}, Lcom/daaw/avee/comp/playback/ExoMediaPlayer/ExoMediaPlayerCore;->getPlayerEntry()Lcom/daaw/avee/comp/playback/ExoMediaPlayer/ExoMediaPlayerCore$PlayerEntry;

    move-result-object p1

    invoke-virtual {p1, v1}, Lcom/daaw/avee/comp/playback/ExoMediaPlayer/ExoMediaPlayerCore$PlayerEntry;->setVideoSurface(Landroid/view/Surface;)Z

    return-void
.end method
