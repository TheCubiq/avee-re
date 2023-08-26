.class public Lcom/daaw/avee/comp/playback/NativeMediaPlayer/NativeMediaPlayerCore;
.super Ljava/lang/Object;
.source "NativeMediaPlayerCore.java"

# interfaces
.implements Lcom/daaw/avee/comp/playback/IMediaPlayerCore;
.implements Lcom/daaw/avee/comp/playback/BaseEqualizerEffect$IEqualizerEffectListener;
.implements Landroid/media/MediaPlayer$OnSeekCompleteListener;
.implements Landroid/media/MediaPlayer$OnCompletionListener;
.implements Landroid/media/MediaPlayer$OnBufferingUpdateListener;
.implements Landroid/media/MediaPlayer$OnInfoListener;
.implements Landroid/media/MediaPlayer$OnErrorListener;
.implements Landroid/media/MediaPlayer$OnVideoSizeChangedListener;
.implements Landroid/view/SurfaceHolder$Callback;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/daaw/avee/comp/playback/NativeMediaPlayer/NativeMediaPlayerCore$PlayerEntry;
    }
.end annotation


# instance fields
.field context:Landroid/content/Context;

.field currentPlayer:I

.field equalizerEffect:Lcom/daaw/avee/comp/playback/NativeMediaPlayer/NativeEqualizerEffect;

.field listenerRefHolder:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Ljava/lang/Object;",
            ">;"
        }
    .end annotation
.end field

.field muted:Z

.field nextDataSource:Landroid/net/Uri;

.field nextPlayer:I

.field onNotifyListener:Lcom/daaw/avee/comp/playback/IMediaPlayerCore$OnNotifyListener;

.field private players:[Lcom/daaw/avee/comp/playback/NativeMediaPlayer/NativeMediaPlayerCore$PlayerEntry;

.field surfaceHolderWeak:Ljava/lang/ref/WeakReference;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/lang/ref/WeakReference<",
            "Landroid/view/SurfaceHolder;",
            ">;"
        }
    .end annotation
.end field

.field visualizerData:Lcom/daaw/avee/comp/playback/NativeMediaPlayer/NativeVisualizerDataProvider;

.field visualizerLastTimeUsed:J

.field final visualizerLock:Ljava/lang/Object;

.field volume:F


# direct methods
.method public constructor <init>(Landroid/content/Context;Ljava/lang/String;Lcom/daaw/avee/comp/playback/IMediaPlayerCore$OnNotifyListener;)V
    .locals 3

    .line 62
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 46
    new-instance p2, Ljava/lang/Object;

    invoke-direct {p2}, Ljava/lang/Object;-><init>()V

    iput-object p2, p0, Lcom/daaw/avee/comp/playback/NativeMediaPlayer/NativeMediaPlayerCore;->visualizerLock:Ljava/lang/Object;

    const/4 p2, 0x0

    .line 49
    iput p2, p0, Lcom/daaw/avee/comp/playback/NativeMediaPlayer/NativeMediaPlayerCore;->currentPlayer:I

    const/4 v0, 0x1

    .line 50
    iput v0, p0, Lcom/daaw/avee/comp/playback/NativeMediaPlayer/NativeMediaPlayerCore;->nextPlayer:I

    const/4 v0, 0x0

    .line 51
    iput-object v0, p0, Lcom/daaw/avee/comp/playback/NativeMediaPlayer/NativeMediaPlayerCore;->nextDataSource:Landroid/net/Uri;

    const/high16 v1, 0x3f800000    # 1.0f

    .line 52
    iput v1, p0, Lcom/daaw/avee/comp/playback/NativeMediaPlayer/NativeMediaPlayerCore;->volume:F

    .line 53
    iput-boolean p2, p0, Lcom/daaw/avee/comp/playback/NativeMediaPlayer/NativeMediaPlayerCore;->muted:Z

    const-wide/16 v1, 0x0

    .line 54
    iput-wide v1, p0, Lcom/daaw/avee/comp/playback/NativeMediaPlayer/NativeMediaPlayerCore;->visualizerLastTimeUsed:J

    .line 55
    iput-object v0, p0, Lcom/daaw/avee/comp/playback/NativeMediaPlayer/NativeMediaPlayerCore;->visualizerData:Lcom/daaw/avee/comp/playback/NativeMediaPlayer/NativeVisualizerDataProvider;

    .line 56
    new-instance v1, Lcom/daaw/avee/comp/playback/NativeMediaPlayer/NativeEqualizerEffect;

    invoke-direct {v1, p0}, Lcom/daaw/avee/comp/playback/NativeMediaPlayer/NativeEqualizerEffect;-><init>(Lcom/daaw/avee/comp/playback/BaseEqualizerEffect$IEqualizerEffectListener;)V

    iput-object v1, p0, Lcom/daaw/avee/comp/playback/NativeMediaPlayer/NativeMediaPlayerCore;->equalizerEffect:Lcom/daaw/avee/comp/playback/NativeMediaPlayer/NativeEqualizerEffect;

    .line 57
    new-instance v1, Ljava/lang/ref/WeakReference;

    invoke-direct {v1, v0}, Ljava/lang/ref/WeakReference;-><init>(Ljava/lang/Object;)V

    iput-object v1, p0, Lcom/daaw/avee/comp/playback/NativeMediaPlayer/NativeMediaPlayerCore;->surfaceHolderWeak:Ljava/lang/ref/WeakReference;

    .line 58
    new-instance v0, Ljava/util/LinkedList;

    invoke-direct {v0}, Ljava/util/LinkedList;-><init>()V

    iput-object v0, p0, Lcom/daaw/avee/comp/playback/NativeMediaPlayer/NativeMediaPlayerCore;->listenerRefHolder:Ljava/util/List;

    const/4 v0, 0x2

    new-array v0, v0, [Lcom/daaw/avee/comp/playback/NativeMediaPlayer/NativeMediaPlayerCore$PlayerEntry;

    .line 59
    iput-object v0, p0, Lcom/daaw/avee/comp/playback/NativeMediaPlayer/NativeMediaPlayerCore;->players:[Lcom/daaw/avee/comp/playback/NativeMediaPlayer/NativeMediaPlayerCore$PlayerEntry;

    .line 63
    iput-object p1, p0, Lcom/daaw/avee/comp/playback/NativeMediaPlayer/NativeMediaPlayerCore;->context:Landroid/content/Context;

    .line 64
    iput-object p3, p0, Lcom/daaw/avee/comp/playback/NativeMediaPlayer/NativeMediaPlayerCore;->onNotifyListener:Lcom/daaw/avee/comp/playback/IMediaPlayerCore$OnNotifyListener;

    .line 67
    :goto_0
    iget-object p1, p0, Lcom/daaw/avee/comp/playback/NativeMediaPlayer/NativeMediaPlayerCore;->players:[Lcom/daaw/avee/comp/playback/NativeMediaPlayer/NativeMediaPlayerCore$PlayerEntry;

    array-length p3, p1

    if-ge p2, p3, :cond_0

    .line 68
    new-instance p3, Lcom/daaw/avee/comp/playback/NativeMediaPlayer/NativeMediaPlayerCore$PlayerEntry;

    invoke-direct {p3, p0}, Lcom/daaw/avee/comp/playback/NativeMediaPlayer/NativeMediaPlayerCore$PlayerEntry;-><init>(Lcom/daaw/avee/comp/playback/NativeMediaPlayer/NativeMediaPlayerCore;)V

    aput-object p3, p1, p2

    add-int/lit8 p2, p2, 0x1

    goto :goto_0

    .line 70
    :cond_0
    sget-object p1, Lcom/daaw/avee/EventsGlobal/EventsGlobalApp;->onUITick10:Lcom/daaw/avee/Common/Events/WeakEvent;

    new-instance p2, Lcom/daaw/avee/comp/playback/NativeMediaPlayer/NativeMediaPlayerCore$1;

    invoke-direct {p2, p0}, Lcom/daaw/avee/comp/playback/NativeMediaPlayer/NativeMediaPlayerCore$1;-><init>(Lcom/daaw/avee/comp/playback/NativeMediaPlayer/NativeMediaPlayerCore;)V

    iget-object p3, p0, Lcom/daaw/avee/comp/playback/NativeMediaPlayer/NativeMediaPlayerCore;->listenerRefHolder:Ljava/util/List;

    invoke-virtual {p1, p2, p3}, Lcom/daaw/avee/Common/Events/WeakEvent;->subscribeWeak(Lcom/daaw/avee/Common/Events/WeakEvent$Handler;Ljava/util/List;)V

    return-void
.end method

.method public static ConvertToNativeVideoScalingMode(I)I
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

.method static synthetic access$000(Lcom/daaw/avee/comp/playback/NativeMediaPlayer/NativeMediaPlayerCore;Z)V
    .locals 0

    .line 35
    invoke-direct {p0, p1}, Lcom/daaw/avee/comp/playback/NativeMediaPlayer/NativeMediaPlayerCore;->start(Z)V

    return-void
.end method

.method private start(Z)V
    .locals 3

    .line 352
    iget-object v0, p0, Lcom/daaw/avee/comp/playback/NativeMediaPlayer/NativeMediaPlayerCore;->players:[Lcom/daaw/avee/comp/playback/NativeMediaPlayer/NativeMediaPlayerCore$PlayerEntry;

    iget v1, p0, Lcom/daaw/avee/comp/playback/NativeMediaPlayer/NativeMediaPlayerCore;->currentPlayer:I

    aget-object v0, v0, v1

    invoke-virtual {v0}, Lcom/daaw/avee/comp/playback/NativeMediaPlayer/NativeMediaPlayerCore$PlayerEntry;->getStateLevels()I

    move-result v0

    const/4 v1, 0x1

    const/4 v2, 0x2

    if-ge v0, v2, :cond_0

    .line 353
    iget-object p1, p0, Lcom/daaw/avee/comp/playback/NativeMediaPlayer/NativeMediaPlayerCore;->players:[Lcom/daaw/avee/comp/playback/NativeMediaPlayer/NativeMediaPlayerCore$PlayerEntry;

    iget v0, p0, Lcom/daaw/avee/comp/playback/NativeMediaPlayer/NativeMediaPlayerCore;->currentPlayer:I

    aget-object p1, p1, v0

    iput-boolean v1, p1, Lcom/daaw/avee/comp/playback/NativeMediaPlayer/NativeMediaPlayerCore$PlayerEntry;->playerShouldStarts:Z

    return-void

    .line 358
    :cond_0
    iget-object v0, p0, Lcom/daaw/avee/comp/playback/NativeMediaPlayer/NativeMediaPlayerCore;->players:[Lcom/daaw/avee/comp/playback/NativeMediaPlayer/NativeMediaPlayerCore$PlayerEntry;

    iget v2, p0, Lcom/daaw/avee/comp/playback/NativeMediaPlayer/NativeMediaPlayerCore;->currentPlayer:I

    aget-object v0, v0, v2

    invoke-virtual {v0}, Lcom/daaw/avee/comp/playback/NativeMediaPlayer/NativeMediaPlayerCore$PlayerEntry;->getStateLevels()I

    move-result v0

    const/4 v2, 0x3

    if-ge v0, v2, :cond_1

    .line 359
    iget-object p1, p0, Lcom/daaw/avee/comp/playback/NativeMediaPlayer/NativeMediaPlayerCore;->players:[Lcom/daaw/avee/comp/playback/NativeMediaPlayer/NativeMediaPlayerCore$PlayerEntry;

    iget v0, p0, Lcom/daaw/avee/comp/playback/NativeMediaPlayer/NativeMediaPlayerCore;->currentPlayer:I

    aget-object p1, p1, v0

    iput-boolean v1, p1, Lcom/daaw/avee/comp/playback/NativeMediaPlayer/NativeMediaPlayerCore$PlayerEntry;->playerShouldStarts:Z

    const/4 p1, -0x1

    .line 362
    :try_start_0
    iget-object v0, p0, Lcom/daaw/avee/comp/playback/NativeMediaPlayer/NativeMediaPlayerCore;->players:[Lcom/daaw/avee/comp/playback/NativeMediaPlayer/NativeMediaPlayerCore$PlayerEntry;

    iget v1, p0, Lcom/daaw/avee/comp/playback/NativeMediaPlayer/NativeMediaPlayerCore;->currentPlayer:I

    aget-object v0, v0, v1

    iget-object v0, v0, Lcom/daaw/avee/comp/playback/NativeMediaPlayer/NativeMediaPlayerCore$PlayerEntry;->player:Landroid/media/MediaPlayer;

    invoke-virtual {v0}, Landroid/media/MediaPlayer;->prepareAsync()V
    :try_end_0
    .catch Ljava/lang/IllegalStateException; {:try_start_0 .. :try_end_0} :catch_1
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_0

    .line 366
    :catch_0
    iget v0, p0, Lcom/daaw/avee/comp/playback/NativeMediaPlayer/NativeMediaPlayerCore;->currentPlayer:I

    invoke-virtual {p0, v0, p1}, Lcom/daaw/avee/comp/playback/NativeMediaPlayer/NativeMediaPlayerCore;->setStateLevel(II)V

    goto :goto_0

    .line 364
    :catch_1
    iget v0, p0, Lcom/daaw/avee/comp/playback/NativeMediaPlayer/NativeMediaPlayerCore;->currentPlayer:I

    invoke-virtual {p0, v0, p1}, Lcom/daaw/avee/comp/playback/NativeMediaPlayer/NativeMediaPlayerCore;->setStateLevel(II)V

    :goto_0
    return-void

    .line 371
    :cond_1
    iget-object v0, p0, Lcom/daaw/avee/comp/playback/NativeMediaPlayer/NativeMediaPlayerCore;->onNotifyListener:Lcom/daaw/avee/comp/playback/IMediaPlayerCore$OnNotifyListener;

    invoke-interface {v0}, Lcom/daaw/avee/comp/playback/IMediaPlayerCore$OnNotifyListener;->onRequestAudioFocus()Z

    move-result v0

    if-eqz v0, :cond_2

    .line 372
    iget-object v0, p0, Lcom/daaw/avee/comp/playback/NativeMediaPlayer/NativeMediaPlayerCore;->players:[Lcom/daaw/avee/comp/playback/NativeMediaPlayer/NativeMediaPlayerCore$PlayerEntry;

    iget v1, p0, Lcom/daaw/avee/comp/playback/NativeMediaPlayer/NativeMediaPlayerCore;->currentPlayer:I

    aget-object v0, v0, v1

    iget-object v0, v0, Lcom/daaw/avee/comp/playback/NativeMediaPlayer/NativeMediaPlayerCore$PlayerEntry;->player:Landroid/media/MediaPlayer;

    invoke-virtual {v0}, Landroid/media/MediaPlayer;->start()V

    .line 373
    iget v0, p0, Lcom/daaw/avee/comp/playback/NativeMediaPlayer/NativeMediaPlayerCore;->currentPlayer:I

    const/4 v1, 0x5

    invoke-virtual {p0, v0, v1}, Lcom/daaw/avee/comp/playback/NativeMediaPlayer/NativeMediaPlayerCore;->setStateLevel(II)V

    :cond_2
    if-eqz p1, :cond_3

    .line 377
    iget-object p1, p0, Lcom/daaw/avee/comp/playback/NativeMediaPlayer/NativeMediaPlayerCore;->onNotifyListener:Lcom/daaw/avee/comp/playback/IMediaPlayerCore$OnNotifyListener;

    const/4 v0, 0x0

    const/4 v1, 0x0

    invoke-interface {p1, v0, v1}, Lcom/daaw/avee/comp/playback/IMediaPlayerCore$OnNotifyListener;->onMpPlaystateOrMetaChanged(ZLjava/lang/String;)V

    :cond_3
    return-void
.end method


# virtual methods
.method checkVisualizerLife()V
    .locals 7

    .line 110
    iget-object v0, p0, Lcom/daaw/avee/comp/playback/NativeMediaPlayer/NativeMediaPlayerCore;->visualizerLock:Ljava/lang/Object;

    monitor-enter v0

    .line 111
    :try_start_0
    iget-object v1, p0, Lcom/daaw/avee/comp/playback/NativeMediaPlayer/NativeMediaPlayerCore;->visualizerData:Lcom/daaw/avee/comp/playback/NativeMediaPlayer/NativeVisualizerDataProvider;

    if-eqz v1, :cond_0

    .line 114
    invoke-static {}, Landroid/os/SystemClock;->elapsedRealtime()J

    move-result-wide v2

    iget-wide v4, p0, Lcom/daaw/avee/comp/playback/NativeMediaPlayer/NativeMediaPlayerCore;->visualizerLastTimeUsed:J

    sub-long/2addr v2, v4

    const-wide/16 v4, 0x1f40

    cmp-long v6, v2, v4

    if-lez v6, :cond_0

    .line 116
    invoke-virtual {v1}, Lcom/daaw/avee/comp/playback/NativeMediaPlayer/NativeVisualizerDataProvider;->release()V

    const/4 v1, 0x0

    .line 117
    iput-object v1, p0, Lcom/daaw/avee/comp/playback/NativeMediaPlayer/NativeMediaPlayerCore;->visualizerData:Lcom/daaw/avee/comp/playback/NativeMediaPlayer/NativeVisualizerDataProvider;

    .line 120
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
    .locals 2

    .line 407
    iget-object v0, p0, Lcom/daaw/avee/comp/playback/NativeMediaPlayer/NativeMediaPlayerCore;->players:[Lcom/daaw/avee/comp/playback/NativeMediaPlayer/NativeMediaPlayerCore$PlayerEntry;

    iget v1, p0, Lcom/daaw/avee/comp/playback/NativeMediaPlayer/NativeMediaPlayerCore;->currentPlayer:I

    aget-object v0, v0, v1

    invoke-virtual {v0}, Lcom/daaw/avee/comp/playback/NativeMediaPlayer/NativeMediaPlayerCore$PlayerEntry;->containsVideoTrack()Z

    move-result v0

    return v0
.end method

.method createMediaPlayer(I)V
    .locals 3

    .line 216
    iget-object v0, p0, Lcom/daaw/avee/comp/playback/NativeMediaPlayer/NativeMediaPlayerCore;->players:[Lcom/daaw/avee/comp/playback/NativeMediaPlayer/NativeMediaPlayerCore$PlayerEntry;

    aget-object v1, v0, p1

    if-nez v1, :cond_0

    .line 217
    new-instance v1, Lcom/daaw/avee/comp/playback/NativeMediaPlayer/NativeMediaPlayerCore$PlayerEntry;

    invoke-direct {v1, p0}, Lcom/daaw/avee/comp/playback/NativeMediaPlayer/NativeMediaPlayerCore$PlayerEntry;-><init>(Lcom/daaw/avee/comp/playback/NativeMediaPlayer/NativeMediaPlayerCore;)V

    aput-object v1, v0, p1

    .line 220
    :cond_0
    iget-object v0, p0, Lcom/daaw/avee/comp/playback/NativeMediaPlayer/NativeMediaPlayerCore;->players:[Lcom/daaw/avee/comp/playback/NativeMediaPlayer/NativeMediaPlayerCore$PlayerEntry;

    aget-object v0, v0, p1

    iget-object v0, v0, Lcom/daaw/avee/comp/playback/NativeMediaPlayer/NativeMediaPlayerCore$PlayerEntry;->player:Landroid/media/MediaPlayer;

    if-nez v0, :cond_1

    .line 221
    new-instance v0, Landroid/media/MediaPlayer;

    invoke-direct {v0}, Landroid/media/MediaPlayer;-><init>()V

    .line 223
    iget-object v1, p0, Lcom/daaw/avee/comp/playback/NativeMediaPlayer/NativeMediaPlayerCore;->players:[Lcom/daaw/avee/comp/playback/NativeMediaPlayer/NativeMediaPlayerCore$PlayerEntry;

    aget-object v1, v1, p1

    invoke-virtual {v0, v1}, Landroid/media/MediaPlayer;->setOnPreparedListener(Landroid/media/MediaPlayer$OnPreparedListener;)V

    .line 224
    invoke-virtual {v0, p0}, Landroid/media/MediaPlayer;->setOnSeekCompleteListener(Landroid/media/MediaPlayer$OnSeekCompleteListener;)V

    .line 225
    invoke-virtual {v0, p0}, Landroid/media/MediaPlayer;->setOnCompletionListener(Landroid/media/MediaPlayer$OnCompletionListener;)V

    .line 226
    invoke-virtual {v0, p0}, Landroid/media/MediaPlayer;->setOnBufferingUpdateListener(Landroid/media/MediaPlayer$OnBufferingUpdateListener;)V

    .line 227
    invoke-virtual {v0, p0}, Landroid/media/MediaPlayer;->setOnInfoListener(Landroid/media/MediaPlayer$OnInfoListener;)V

    .line 228
    invoke-virtual {v0, p0}, Landroid/media/MediaPlayer;->setOnErrorListener(Landroid/media/MediaPlayer$OnErrorListener;)V

    .line 229
    invoke-virtual {v0, p0}, Landroid/media/MediaPlayer;->setOnVideoSizeChangedListener(Landroid/media/MediaPlayer$OnVideoSizeChangedListener;)V

    .line 233
    iget-object v1, p0, Lcom/daaw/avee/comp/playback/NativeMediaPlayer/NativeMediaPlayerCore;->context:Landroid/content/Context;

    const/4 v2, 0x1

    invoke-virtual {v0, v1, v2}, Landroid/media/MediaPlayer;->setWakeMode(Landroid/content/Context;I)V

    .line 235
    iget-object v1, p0, Lcom/daaw/avee/comp/playback/NativeMediaPlayer/NativeMediaPlayerCore;->players:[Lcom/daaw/avee/comp/playback/NativeMediaPlayer/NativeMediaPlayerCore$PlayerEntry;

    aget-object v1, v1, p1

    iput-object v0, v1, Lcom/daaw/avee/comp/playback/NativeMediaPlayer/NativeMediaPlayerCore$PlayerEntry;->player:Landroid/media/MediaPlayer;

    .line 238
    :cond_1
    iget-object v0, p0, Lcom/daaw/avee/comp/playback/NativeMediaPlayer/NativeMediaPlayerCore;->players:[Lcom/daaw/avee/comp/playback/NativeMediaPlayer/NativeMediaPlayerCore$PlayerEntry;

    aget-object v0, v0, p1

    iget-object v0, v0, Lcom/daaw/avee/comp/playback/NativeMediaPlayer/NativeMediaPlayerCore$PlayerEntry;->player:Landroid/media/MediaPlayer;

    invoke-virtual {v0}, Landroid/media/MediaPlayer;->reset()V

    const/4 v0, 0x0

    .line 239
    invoke-virtual {p0, p1, v0}, Lcom/daaw/avee/comp/playback/NativeMediaPlayer/NativeMediaPlayerCore;->setStateLevel(II)V

    .line 240
    iget-object v1, p0, Lcom/daaw/avee/comp/playback/NativeMediaPlayer/NativeMediaPlayerCore;->players:[Lcom/daaw/avee/comp/playback/NativeMediaPlayer/NativeMediaPlayerCore$PlayerEntry;

    aget-object p1, v1, p1

    iput-boolean v0, p1, Lcom/daaw/avee/comp/playback/NativeMediaPlayer/NativeMediaPlayerCore$PlayerEntry;->playerShouldStarts:Z

    return-void
.end method

.method cycleNextPlayer()V
    .locals 2

    .line 260
    iget v0, p0, Lcom/daaw/avee/comp/playback/NativeMediaPlayer/NativeMediaPlayerCore;->currentPlayer:I

    .line 261
    iget v1, p0, Lcom/daaw/avee/comp/playback/NativeMediaPlayer/NativeMediaPlayerCore;->nextPlayer:I

    iput v1, p0, Lcom/daaw/avee/comp/playback/NativeMediaPlayer/NativeMediaPlayerCore;->currentPlayer:I

    .line 262
    iput v0, p0, Lcom/daaw/avee/comp/playback/NativeMediaPlayer/NativeMediaPlayerCore;->nextPlayer:I

    return-void
.end method

.method public destroy(I)V
    .locals 1

    if-nez p1, :cond_0

    const-string p1, "trying to destroy currentPlayer"

    .line 536
    invoke-static {p1}, Lcom/daaw/avee/Common/tlog;->w(Ljava/lang/String;)V

    goto :goto_0

    .line 538
    :cond_0
    iget p1, p0, Lcom/daaw/avee/comp/playback/NativeMediaPlayer/NativeMediaPlayerCore;->currentPlayer:I

    iget v0, p0, Lcom/daaw/avee/comp/playback/NativeMediaPlayer/NativeMediaPlayerCore;->nextPlayer:I

    if-ne p1, v0, :cond_1

    return-void

    .line 539
    :cond_1
    invoke-virtual {p0, v0}, Lcom/daaw/avee/comp/playback/NativeMediaPlayer/NativeMediaPlayerCore;->releaseMediaPlayer(I)V

    :goto_0
    return-void
.end method

.method public destroyOld()V
    .locals 2

    .line 529
    iget v0, p0, Lcom/daaw/avee/comp/playback/NativeMediaPlayer/NativeMediaPlayerCore;->currentPlayer:I

    iget v1, p0, Lcom/daaw/avee/comp/playback/NativeMediaPlayer/NativeMediaPlayerCore;->nextPlayer:I

    if-ne v0, v1, :cond_0

    return-void

    :cond_0
    const/4 v0, 0x1

    .line 530
    invoke-virtual {p0, v0}, Lcom/daaw/avee/comp/playback/NativeMediaPlayer/NativeMediaPlayerCore;->destroy(I)V

    return-void
.end method

.method public duration()J
    .locals 2

    .line 432
    iget-object v0, p0, Lcom/daaw/avee/comp/playback/NativeMediaPlayer/NativeMediaPlayerCore;->players:[Lcom/daaw/avee/comp/playback/NativeMediaPlayer/NativeMediaPlayerCore$PlayerEntry;

    iget v1, p0, Lcom/daaw/avee/comp/playback/NativeMediaPlayer/NativeMediaPlayerCore;->currentPlayer:I

    aget-object v0, v0, v1

    invoke-virtual {v0}, Lcom/daaw/avee/comp/playback/NativeMediaPlayer/NativeMediaPlayerCore$PlayerEntry;->getStateLevels()I

    move-result v0

    const/4 v1, 0x2

    if-ge v0, v1, :cond_0

    const-wide/16 v0, 0x0

    return-wide v0

    .line 433
    :cond_0
    iget-object v0, p0, Lcom/daaw/avee/comp/playback/NativeMediaPlayer/NativeMediaPlayerCore;->players:[Lcom/daaw/avee/comp/playback/NativeMediaPlayer/NativeMediaPlayerCore$PlayerEntry;

    iget v1, p0, Lcom/daaw/avee/comp/playback/NativeMediaPlayer/NativeMediaPlayerCore;->currentPlayer:I

    aget-object v0, v0, v1

    iget-object v0, v0, Lcom/daaw/avee/comp/playback/NativeMediaPlayer/NativeMediaPlayerCore$PlayerEntry;->player:Landroid/media/MediaPlayer;

    invoke-virtual {v0}, Landroid/media/MediaPlayer;->getDuration()I

    move-result v0

    int-to-long v0, v0

    return-wide v0
.end method

.method public getEqualizerDesc()Lcom/daaw/avee/comp/playback/BaseEqualizerEffect$EqualizerDesc;
    .locals 1

    .line 640
    iget-object v0, p0, Lcom/daaw/avee/comp/playback/NativeMediaPlayer/NativeMediaPlayerCore;->equalizerEffect:Lcom/daaw/avee/comp/playback/NativeMediaPlayer/NativeEqualizerEffect;

    if-eqz v0, :cond_0

    invoke-virtual {v0}, Lcom/daaw/avee/comp/playback/NativeMediaPlayer/NativeEqualizerEffect;->getEqualizerDesc()Lcom/daaw/avee/comp/playback/BaseEqualizerEffect$EqualizerDesc;

    move-result-object v0

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    return-object v0
.end method

.method public getEqualizerSettings(Ljava/lang/String;)Lcom/daaw/avee/comp/playback/BaseEqualizerEffect$EqualizerSettings;
    .locals 1

    .line 625
    iget-object v0, p0, Lcom/daaw/avee/comp/playback/NativeMediaPlayer/NativeMediaPlayerCore;->onNotifyListener:Lcom/daaw/avee/comp/playback/IMediaPlayerCore$OnNotifyListener;

    invoke-interface {v0, p1}, Lcom/daaw/avee/comp/playback/IMediaPlayerCore$OnNotifyListener;->getEqualizerSettings(Ljava/lang/String;)Lcom/daaw/avee/comp/playback/BaseEqualizerEffect$EqualizerSettings;

    move-result-object p1

    return-object p1
.end method

.method public getPlayingMediaInfo()Lcom/daaw/avee/comp/playback/PlayingMediaInfo;
    .locals 5

    .line 438
    iget-object v0, p0, Lcom/daaw/avee/comp/playback/NativeMediaPlayer/NativeMediaPlayerCore;->players:[Lcom/daaw/avee/comp/playback/NativeMediaPlayer/NativeMediaPlayerCore$PlayerEntry;

    iget v1, p0, Lcom/daaw/avee/comp/playback/NativeMediaPlayer/NativeMediaPlayerCore;->currentPlayer:I

    aget-object v0, v0, v1

    invoke-virtual {v0}, Lcom/daaw/avee/comp/playback/NativeMediaPlayer/NativeMediaPlayerCore$PlayerEntry;->getStateLevels()I

    move-result v0

    const/4 v1, 0x2

    if-ge v0, v1, :cond_0

    const/4 v0, 0x0

    return-object v0

    .line 439
    :cond_0
    new-instance v0, Lcom/daaw/avee/comp/playback/PlayingMediaInfo;

    iget-object v1, p0, Lcom/daaw/avee/comp/playback/NativeMediaPlayer/NativeMediaPlayerCore;->players:[Lcom/daaw/avee/comp/playback/NativeMediaPlayer/NativeMediaPlayerCore$PlayerEntry;

    iget v2, p0, Lcom/daaw/avee/comp/playback/NativeMediaPlayer/NativeMediaPlayerCore;->currentPlayer:I

    aget-object v1, v1, v2

    iget-object v1, v1, Lcom/daaw/avee/comp/playback/NativeMediaPlayer/NativeMediaPlayerCore$PlayerEntry;->player:Landroid/media/MediaPlayer;

    .line 440
    invoke-virtual {v1}, Landroid/media/MediaPlayer;->getDuration()I

    move-result v1

    int-to-long v1, v1

    iget-object v3, p0, Lcom/daaw/avee/comp/playback/NativeMediaPlayer/NativeMediaPlayerCore;->players:[Lcom/daaw/avee/comp/playback/NativeMediaPlayer/NativeMediaPlayerCore$PlayerEntry;

    iget v4, p0, Lcom/daaw/avee/comp/playback/NativeMediaPlayer/NativeMediaPlayerCore;->currentPlayer:I

    aget-object v3, v3, v4

    .line 441
    invoke-virtual {v3}, Lcom/daaw/avee/comp/playback/NativeMediaPlayer/NativeMediaPlayerCore$PlayerEntry;->containsVideoTrack()Z

    move-result v3

    invoke-direct {v0, v1, v2, v3}, Lcom/daaw/avee/comp/playback/PlayingMediaInfo;-><init>(JZ)V

    return-object v0
.end method

.method public getVisualizationData(Lcom/daaw/avee/comp/playback/AudioFrameData;Lcom/daaw/avee/comp/playback/AudioFrameData$Request2;)Lcom/daaw/avee/comp/playback/AudioFrameData;
    .locals 10

    const/4 v0, 0x0

    if-nez p1, :cond_0

    return-object v0

    .line 587
    :cond_0
    iget-object v1, p0, Lcom/daaw/avee/comp/playback/NativeMediaPlayer/NativeMediaPlayerCore;->players:[Lcom/daaw/avee/comp/playback/NativeMediaPlayer/NativeMediaPlayerCore$PlayerEntry;

    iget v2, p0, Lcom/daaw/avee/comp/playback/NativeMediaPlayer/NativeMediaPlayerCore;->currentPlayer:I

    aget-object v1, v1, v2

    iget-object v1, v1, Lcom/daaw/avee/comp/playback/NativeMediaPlayer/NativeMediaPlayerCore$PlayerEntry;->stateTh:Lcom/daaw/avee/comp/playback/NativeMediaPlayer/NativeMediaPlayerCore$PlayerEntry$StateTh;

    .line 589
    iget-boolean v2, p2, Lcom/daaw/avee/comp/playback/AudioFrameData$Request2;->snoopMode:Z

    if-nez v2, :cond_2

    .line 590
    iget v2, v1, Lcom/daaw/avee/comp/playback/NativeMediaPlayer/NativeMediaPlayerCore$PlayerEntry$StateTh;->stateLevels:I

    const/4 v3, 0x3

    if-ge v2, v3, :cond_1

    return-object v0

    .line 591
    :cond_1
    iget-boolean v0, v1, Lcom/daaw/avee/comp/playback/NativeMediaPlayer/NativeMediaPlayerCore$PlayerEntry$StateTh;->isPreparingOrStared:Z

    if-nez v0, :cond_2

    return-object p1

    .line 595
    :cond_2
    iget v7, v1, Lcom/daaw/avee/comp/playback/NativeMediaPlayer/NativeMediaPlayerCore$PlayerEntry$StateTh;->audioSessionId:I

    .line 597
    iget-object v0, p0, Lcom/daaw/avee/comp/playback/NativeMediaPlayer/NativeMediaPlayerCore;->visualizerLock:Ljava/lang/Object;

    monitor-enter v0

    .line 598
    :try_start_0
    iget-object v1, p0, Lcom/daaw/avee/comp/playback/NativeMediaPlayer/NativeMediaPlayerCore;->visualizerData:Lcom/daaw/avee/comp/playback/NativeMediaPlayer/NativeVisualizerDataProvider;

    if-nez v1, :cond_3

    .line 601
    new-instance v1, Lcom/daaw/avee/comp/playback/NativeMediaPlayer/NativeVisualizerDataProvider;

    invoke-direct {v1}, Lcom/daaw/avee/comp/playback/NativeMediaPlayer/NativeVisualizerDataProvider;-><init>()V

    .line 604
    :cond_3
    invoke-static {}, Landroid/os/SystemClock;->elapsedRealtime()J

    move-result-wide v2

    iput-wide v2, p0, Lcom/daaw/avee/comp/playback/NativeMediaPlayer/NativeMediaPlayerCore;->visualizerLastTimeUsed:J

    .line 608
    iget-wide v2, p2, Lcom/daaw/avee/comp/playback/AudioFrameData$Request2;->overridePositionUs:J

    const-wide/16 v4, 0x0

    const/4 v6, 0x0

    const/4 v8, 0x1

    cmp-long v9, v2, v4

    if-gez v9, :cond_6

    const-wide/16 v3, 0x0

    .line 609
    iget-boolean v2, p2, Lcom/daaw/avee/comp/playback/AudioFrameData$Request2;->useGlobalSession:Z

    if-nez v2, :cond_5

    iget-boolean v2, p2, Lcom/daaw/avee/comp/playback/AudioFrameData$Request2;->snoopMode:Z

    if-eqz v2, :cond_4

    goto :goto_0

    :cond_4
    const/4 v8, 0x0

    :cond_5
    :goto_0
    move-object v2, v1

    move-object v5, p2

    move-object v6, p1

    invoke-virtual/range {v2 .. v8}, Lcom/daaw/avee/comp/playback/NativeMediaPlayer/NativeVisualizerDataProvider;->getVisData(JLcom/daaw/avee/comp/playback/AudioFrameData$Request;Lcom/daaw/avee/comp/playback/AudioFrameData;IZ)Lcom/daaw/avee/comp/playback/AudioFrameData;

    move-result-object p1

    goto :goto_2

    :cond_6
    const-string v2, "overridePositionUs not supported on Native"

    .line 611
    invoke-static {v2}, Lcom/daaw/avee/Common/tlog;->w(Ljava/lang/String;)V

    const-wide/16 v3, 0x0

    .line 612
    iget-boolean v2, p2, Lcom/daaw/avee/comp/playback/AudioFrameData$Request2;->useGlobalSession:Z

    if-nez v2, :cond_8

    iget-boolean v2, p2, Lcom/daaw/avee/comp/playback/AudioFrameData$Request2;->snoopMode:Z

    if-eqz v2, :cond_7

    goto :goto_1

    :cond_7
    const/4 v8, 0x0

    :cond_8
    :goto_1
    move-object v2, v1

    move-object v5, p2

    move-object v6, p1

    invoke-virtual/range {v2 .. v8}, Lcom/daaw/avee/comp/playback/NativeMediaPlayer/NativeVisualizerDataProvider;->getVisData(JLcom/daaw/avee/comp/playback/AudioFrameData$Request;Lcom/daaw/avee/comp/playback/AudioFrameData;IZ)Lcom/daaw/avee/comp/playback/AudioFrameData;

    move-result-object p1

    .line 615
    :goto_2
    iput-object v1, p0, Lcom/daaw/avee/comp/playback/NativeMediaPlayer/NativeMediaPlayerCore;->visualizerData:Lcom/daaw/avee/comp/playback/NativeMediaPlayer/NativeVisualizerDataProvider;

    .line 617
    monitor-exit v0

    return-object p1

    :catchall_0
    move-exception p1

    .line 618
    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw p1
.end method

.method public isEqualizerEnabled(Ljava/lang/String;)Z
    .locals 1

    .line 630
    iget-object v0, p0, Lcom/daaw/avee/comp/playback/NativeMediaPlayer/NativeMediaPlayerCore;->onNotifyListener:Lcom/daaw/avee/comp/playback/IMediaPlayerCore$OnNotifyListener;

    invoke-interface {v0, p1}, Lcom/daaw/avee/comp/playback/IMediaPlayerCore$OnNotifyListener;->getEqualizerEnabled(Ljava/lang/String;)Z

    move-result p1

    return p1
.end method

.method public isMuted()Z
    .locals 1

    .line 467
    iget-boolean v0, p0, Lcom/daaw/avee/comp/playback/NativeMediaPlayer/NativeMediaPlayerCore;->muted:Z

    return v0
.end method

.method public isPreparingOrAbove()Z
    .locals 2

    .line 398
    iget-object v0, p0, Lcom/daaw/avee/comp/playback/NativeMediaPlayer/NativeMediaPlayerCore;->players:[Lcom/daaw/avee/comp/playback/NativeMediaPlayer/NativeMediaPlayerCore$PlayerEntry;

    iget v1, p0, Lcom/daaw/avee/comp/playback/NativeMediaPlayer/NativeMediaPlayerCore;->currentPlayer:I

    aget-object v0, v0, v1

    invoke-virtual {v0}, Lcom/daaw/avee/comp/playback/NativeMediaPlayer/NativeMediaPlayerCore$PlayerEntry;->isPreparingOrAbove()Z

    move-result v0

    return v0
.end method

.method public isPreparingOrStared()Z
    .locals 2

    .line 402
    iget-object v0, p0, Lcom/daaw/avee/comp/playback/NativeMediaPlayer/NativeMediaPlayerCore;->players:[Lcom/daaw/avee/comp/playback/NativeMediaPlayer/NativeMediaPlayerCore$PlayerEntry;

    iget v1, p0, Lcom/daaw/avee/comp/playback/NativeMediaPlayer/NativeMediaPlayerCore;->currentPlayer:I

    aget-object v0, v0, v1

    invoke-virtual {v0}, Lcom/daaw/avee/comp/playback/NativeMediaPlayer/NativeMediaPlayerCore$PlayerEntry;->isPreparingOrStared()Z

    move-result v0

    return v0
.end method

.method public onBufferingUpdate(Landroid/media/MediaPlayer;I)V
    .locals 2

    .line 143
    iget-object v0, p0, Lcom/daaw/avee/comp/playback/NativeMediaPlayer/NativeMediaPlayerCore;->players:[Lcom/daaw/avee/comp/playback/NativeMediaPlayer/NativeMediaPlayerCore$PlayerEntry;

    iget v1, p0, Lcom/daaw/avee/comp/playback/NativeMediaPlayer/NativeMediaPlayerCore;->currentPlayer:I

    aget-object v0, v0, v1

    iget-object v0, v0, Lcom/daaw/avee/comp/playback/NativeMediaPlayer/NativeMediaPlayerCore$PlayerEntry;->player:Landroid/media/MediaPlayer;

    if-ne v0, p1, :cond_0

    .line 144
    iget-object p1, p0, Lcom/daaw/avee/comp/playback/NativeMediaPlayer/NativeMediaPlayerCore;->onNotifyListener:Lcom/daaw/avee/comp/playback/IMediaPlayerCore$OnNotifyListener;

    const/4 v0, 0x1

    invoke-interface {p1, v0, p2}, Lcom/daaw/avee/comp/playback/IMediaPlayerCore$OnNotifyListener;->onBufferingUpdate(ZI)V

    :cond_0
    return-void
.end method

.method public onCompletion(Landroid/media/MediaPlayer;)V
    .locals 2

    .line 131
    iget-object v0, p0, Lcom/daaw/avee/comp/playback/NativeMediaPlayer/NativeMediaPlayerCore;->players:[Lcom/daaw/avee/comp/playback/NativeMediaPlayer/NativeMediaPlayerCore$PlayerEntry;

    iget v1, p0, Lcom/daaw/avee/comp/playback/NativeMediaPlayer/NativeMediaPlayerCore;->currentPlayer:I

    aget-object v0, v0, v1

    iget-object v0, v0, Lcom/daaw/avee/comp/playback/NativeMediaPlayer/NativeMediaPlayerCore$PlayerEntry;->player:Landroid/media/MediaPlayer;

    if-ne v0, p1, :cond_1

    .line 132
    iget-object p1, p0, Lcom/daaw/avee/comp/playback/NativeMediaPlayer/NativeMediaPlayerCore;->players:[Lcom/daaw/avee/comp/playback/NativeMediaPlayer/NativeMediaPlayerCore$PlayerEntry;

    iget v0, p0, Lcom/daaw/avee/comp/playback/NativeMediaPlayer/NativeMediaPlayerCore;->currentPlayer:I

    aget-object p1, p1, v0

    invoke-virtual {p1}, Lcom/daaw/avee/comp/playback/NativeMediaPlayer/NativeMediaPlayerCore$PlayerEntry;->getStateLevels()I

    move-result p1

    if-gez p1, :cond_0

    .line 133
    iget-object p1, p0, Lcom/daaw/avee/comp/playback/NativeMediaPlayer/NativeMediaPlayerCore;->onNotifyListener:Lcom/daaw/avee/comp/playback/IMediaPlayerCore$OnNotifyListener;

    const/4 v0, 0x1

    invoke-interface {p1, v0}, Lcom/daaw/avee/comp/playback/IMediaPlayerCore$OnNotifyListener;->requestNextDataDelay(Z)V

    goto :goto_0

    .line 135
    :cond_0
    iget-object p1, p0, Lcom/daaw/avee/comp/playback/NativeMediaPlayer/NativeMediaPlayerCore;->onNotifyListener:Lcom/daaw/avee/comp/playback/IMediaPlayerCore$OnNotifyListener;

    invoke-interface {p1}, Lcom/daaw/avee/comp/playback/IMediaPlayerCore$OnNotifyListener;->requestNextDataNow()V

    :cond_1
    :goto_0
    return-void
.end method

.method public onEqualizerDescChanged(Lcom/daaw/avee/comp/playback/BaseEqualizerEffect$EqualizerDesc;)V
    .locals 1

    .line 635
    iget-object v0, p0, Lcom/daaw/avee/comp/playback/NativeMediaPlayer/NativeMediaPlayerCore;->onNotifyListener:Lcom/daaw/avee/comp/playback/IMediaPlayerCore$OnNotifyListener;

    invoke-interface {v0, p1}, Lcom/daaw/avee/comp/playback/IMediaPlayerCore$OnNotifyListener;->onEqualizerDescChanged(Lcom/daaw/avee/comp/playback/BaseEqualizerEffect$EqualizerDesc;)V

    return-void
.end method

.method public onError(Landroid/media/MediaPlayer;II)Z
    .locals 3

    .line 159
    iget-object v0, p0, Lcom/daaw/avee/comp/playback/NativeMediaPlayer/NativeMediaPlayerCore;->players:[Lcom/daaw/avee/comp/playback/NativeMediaPlayer/NativeMediaPlayerCore$PlayerEntry;

    iget v1, p0, Lcom/daaw/avee/comp/playback/NativeMediaPlayer/NativeMediaPlayerCore;->currentPlayer:I

    aget-object v0, v0, v1

    iget-object v0, v0, Lcom/daaw/avee/comp/playback/NativeMediaPlayer/NativeMediaPlayerCore$PlayerEntry;->player:Landroid/media/MediaPlayer;

    const/4 v1, -0x1

    if-ne v0, p1, :cond_0

    .line 161
    iget p1, p0, Lcom/daaw/avee/comp/playback/NativeMediaPlayer/NativeMediaPlayerCore;->currentPlayer:I

    invoke-virtual {p0, p1, v1}, Lcom/daaw/avee/comp/playback/NativeMediaPlayer/NativeMediaPlayerCore;->setStateLevel(II)V

    goto :goto_0

    .line 165
    :cond_0
    iget-object v0, p0, Lcom/daaw/avee/comp/playback/NativeMediaPlayer/NativeMediaPlayerCore;->players:[Lcom/daaw/avee/comp/playback/NativeMediaPlayer/NativeMediaPlayerCore$PlayerEntry;

    iget v2, p0, Lcom/daaw/avee/comp/playback/NativeMediaPlayer/NativeMediaPlayerCore;->nextPlayer:I

    aget-object v0, v0, v2

    iget-object v0, v0, Lcom/daaw/avee/comp/playback/NativeMediaPlayer/NativeMediaPlayerCore$PlayerEntry;->player:Landroid/media/MediaPlayer;

    if-ne v0, p1, :cond_1

    .line 167
    iget p1, p0, Lcom/daaw/avee/comp/playback/NativeMediaPlayer/NativeMediaPlayerCore;->nextPlayer:I

    invoke-virtual {p0, p1, v1}, Lcom/daaw/avee/comp/playback/NativeMediaPlayer/NativeMediaPlayerCore;->setStateLevel(II)V

    goto :goto_0

    .line 172
    :cond_1
    invoke-static {}, Ljunit/framework/Assert;->fail()V

    .line 185
    :goto_0
    new-instance p1, Ljava/lang/StringBuilder;

    invoke-direct {p1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v0, "Error: "

    invoke-virtual {p1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p1, p2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string p2, ","

    invoke-virtual {p1, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p1, p3}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {p1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    .line 187
    iget-object p2, p0, Lcom/daaw/avee/comp/playback/NativeMediaPlayer/NativeMediaPlayerCore;->onNotifyListener:Lcom/daaw/avee/comp/playback/IMediaPlayerCore$OnNotifyListener;

    const/4 p3, 0x0

    invoke-interface {p2, p3, p1}, Lcom/daaw/avee/comp/playback/IMediaPlayerCore$OnNotifyListener;->onMpPlaystateOrMetaChanged(ZLjava/lang/String;)V

    return p3
.end method

.method public onInfo(Landroid/media/MediaPlayer;II)Z
    .locals 0

    const/4 p1, 0x0

    return p1
.end method

.method public onSeekComplete(Landroid/media/MediaPlayer;)V
    .locals 0

    return-void
.end method

.method public onVideoSizeChanged(Landroid/media/MediaPlayer;II)V
    .locals 1

    int-to-float p1, p2

    const/high16 v0, 0x3f800000    # 1.0f

    mul-float p1, p1, v0

    int-to-float v0, p3

    div-float/2addr p1, v0

    .line 196
    iget-object v0, p0, Lcom/daaw/avee/comp/playback/NativeMediaPlayer/NativeMediaPlayerCore;->onNotifyListener:Lcom/daaw/avee/comp/playback/IMediaPlayerCore$OnNotifyListener;

    invoke-interface {v0, p2, p3, p1}, Lcom/daaw/avee/comp/playback/IMediaPlayerCore$OnNotifyListener;->onNotifyVideoSizeChanged(IIF)V

    return-void
.end method

.method public pause()V
    .locals 3

    .line 381
    iget-object v0, p0, Lcom/daaw/avee/comp/playback/NativeMediaPlayer/NativeMediaPlayerCore;->players:[Lcom/daaw/avee/comp/playback/NativeMediaPlayer/NativeMediaPlayerCore$PlayerEntry;

    iget v1, p0, Lcom/daaw/avee/comp/playback/NativeMediaPlayer/NativeMediaPlayerCore;->currentPlayer:I

    aget-object v0, v0, v1

    invoke-virtual {v0}, Lcom/daaw/avee/comp/playback/NativeMediaPlayer/NativeMediaPlayerCore$PlayerEntry;->getStateLevels()I

    move-result v0

    const/4 v1, 0x4

    if-ge v0, v1, :cond_0

    return-void

    .line 382
    :cond_0
    iget-object v0, p0, Lcom/daaw/avee/comp/playback/NativeMediaPlayer/NativeMediaPlayerCore;->players:[Lcom/daaw/avee/comp/playback/NativeMediaPlayer/NativeMediaPlayerCore$PlayerEntry;

    iget v2, p0, Lcom/daaw/avee/comp/playback/NativeMediaPlayer/NativeMediaPlayerCore;->currentPlayer:I

    aget-object v0, v0, v2

    iget-object v0, v0, Lcom/daaw/avee/comp/playback/NativeMediaPlayer/NativeMediaPlayerCore$PlayerEntry;->player:Landroid/media/MediaPlayer;

    invoke-virtual {v0}, Landroid/media/MediaPlayer;->pause()V

    .line 383
    iget v0, p0, Lcom/daaw/avee/comp/playback/NativeMediaPlayer/NativeMediaPlayerCore;->currentPlayer:I

    invoke-virtual {p0, v0, v1}, Lcom/daaw/avee/comp/playback/NativeMediaPlayer/NativeMediaPlayerCore;->setStateLevel(II)V

    .line 385
    iget-object v0, p0, Lcom/daaw/avee/comp/playback/NativeMediaPlayer/NativeMediaPlayerCore;->onNotifyListener:Lcom/daaw/avee/comp/playback/IMediaPlayerCore$OnNotifyListener;

    const/4 v1, 0x0

    const/4 v2, 0x0

    invoke-interface {v0, v1, v2}, Lcom/daaw/avee/comp/playback/IMediaPlayerCore$OnNotifyListener;->onMpPlaystateOrMetaChanged(ZLjava/lang/String;)V

    return-void
.end method

.method public playNext(ZZFJ)V
    .locals 7

    if-nez p1, :cond_0

    .line 318
    iget-object p1, p0, Lcom/daaw/avee/comp/playback/NativeMediaPlayer/NativeMediaPlayerCore;->players:[Lcom/daaw/avee/comp/playback/NativeMediaPlayer/NativeMediaPlayerCore$PlayerEntry;

    iget v0, p0, Lcom/daaw/avee/comp/playback/NativeMediaPlayer/NativeMediaPlayerCore;->currentPlayer:I

    aget-object p1, p1, v0

    invoke-virtual {p1}, Lcom/daaw/avee/comp/playback/NativeMediaPlayer/NativeMediaPlayerCore$PlayerEntry;->isPreparingOrAbove()Z

    move-result p1

    if-eqz p1, :cond_1

    .line 319
    invoke-virtual {p0}, Lcom/daaw/avee/comp/playback/NativeMediaPlayer/NativeMediaPlayerCore;->cycleNextPlayer()V

    goto :goto_0

    .line 323
    :cond_0
    iget p1, p0, Lcom/daaw/avee/comp/playback/NativeMediaPlayer/NativeMediaPlayerCore;->currentPlayer:I

    iget v0, p0, Lcom/daaw/avee/comp/playback/NativeMediaPlayer/NativeMediaPlayerCore;->nextPlayer:I

    if-eq p1, v0, :cond_1

    .line 324
    invoke-virtual {p0, v0}, Lcom/daaw/avee/comp/playback/NativeMediaPlayer/NativeMediaPlayerCore;->releaseMediaPlayer(I)V

    .line 328
    :cond_1
    :goto_0
    iget-object p1, p0, Lcom/daaw/avee/comp/playback/NativeMediaPlayer/NativeMediaPlayerCore;->nextDataSource:Landroid/net/Uri;

    const/4 v0, 0x1

    if-eqz p1, :cond_4

    sget-object v1, Landroid/net/Uri;->EMPTY:Landroid/net/Uri;

    invoke-virtual {p1, v1}, Landroid/net/Uri;->equals(Ljava/lang/Object;)Z

    move-result p1

    if-eqz p1, :cond_2

    goto :goto_2

    .line 338
    :cond_2
    iget v2, p0, Lcom/daaw/avee/comp/playback/NativeMediaPlayer/NativeMediaPlayerCore;->currentPlayer:I

    iget-object v3, p0, Lcom/daaw/avee/comp/playback/NativeMediaPlayer/NativeMediaPlayerCore;->nextDataSource:Landroid/net/Uri;

    move-object v1, p0

    move v4, p3

    move-wide v5, p4

    invoke-virtual/range {v1 .. v6}, Lcom/daaw/avee/comp/playback/NativeMediaPlayer/NativeMediaPlayerCore;->preparePlayer(ILandroid/net/Uri;FJ)V

    if-eqz p2, :cond_3

    .line 341
    invoke-direct {p0, v0}, Lcom/daaw/avee/comp/playback/NativeMediaPlayer/NativeMediaPlayerCore;->start(Z)V

    goto :goto_1

    .line 343
    :cond_3
    invoke-virtual {p0}, Lcom/daaw/avee/comp/playback/NativeMediaPlayer/NativeMediaPlayerCore;->pause()V

    :goto_1
    return-void

    :cond_4
    :goto_2
    const-string p1, "nextDataSource is null"

    .line 329
    invoke-static {p1}, Lcom/daaw/avee/Common/tlog;->w(Ljava/lang/String;)V

    if-eqz p2, :cond_5

    .line 332
    invoke-direct {p0, v0}, Lcom/daaw/avee/comp/playback/NativeMediaPlayer/NativeMediaPlayerCore;->start(Z)V

    goto :goto_3

    .line 334
    :cond_5
    invoke-virtual {p0}, Lcom/daaw/avee/comp/playback/NativeMediaPlayer/NativeMediaPlayerCore;->pause()V

    :goto_3
    return-void
.end method

.method public position()J
    .locals 2

    .line 448
    iget-object v0, p0, Lcom/daaw/avee/comp/playback/NativeMediaPlayer/NativeMediaPlayerCore;->players:[Lcom/daaw/avee/comp/playback/NativeMediaPlayer/NativeMediaPlayerCore$PlayerEntry;

    iget v1, p0, Lcom/daaw/avee/comp/playback/NativeMediaPlayer/NativeMediaPlayerCore;->currentPlayer:I

    aget-object v0, v0, v1

    invoke-virtual {v0}, Lcom/daaw/avee/comp/playback/NativeMediaPlayer/NativeMediaPlayerCore$PlayerEntry;->getStateLevels()I

    move-result v0

    const/4 v1, 0x2

    if-ge v0, v1, :cond_0

    const-wide/16 v0, 0x0

    return-wide v0

    .line 449
    :cond_0
    iget-object v0, p0, Lcom/daaw/avee/comp/playback/NativeMediaPlayer/NativeMediaPlayerCore;->players:[Lcom/daaw/avee/comp/playback/NativeMediaPlayer/NativeMediaPlayerCore$PlayerEntry;

    iget v1, p0, Lcom/daaw/avee/comp/playback/NativeMediaPlayer/NativeMediaPlayerCore;->currentPlayer:I

    aget-object v0, v0, v1

    iget-object v0, v0, Lcom/daaw/avee/comp/playback/NativeMediaPlayer/NativeMediaPlayerCore$PlayerEntry;->player:Landroid/media/MediaPlayer;

    invoke-virtual {v0}, Landroid/media/MediaPlayer;->getCurrentPosition()I

    move-result v0

    int-to-long v0, v0

    return-wide v0
.end method

.method preparePlayer(ILandroid/net/Uri;FJ)V
    .locals 4

    .line 267
    invoke-virtual {p0, p1}, Lcom/daaw/avee/comp/playback/NativeMediaPlayer/NativeMediaPlayerCore;->createMediaPlayer(I)V

    const/4 v0, -0x1

    const/4 v1, 0x1

    .line 271
    :try_start_0
    iget-object v2, p0, Lcom/daaw/avee/comp/playback/NativeMediaPlayer/NativeMediaPlayerCore;->players:[Lcom/daaw/avee/comp/playback/NativeMediaPlayer/NativeMediaPlayerCore$PlayerEntry;

    aget-object v2, v2, p1

    iget-object v2, v2, Lcom/daaw/avee/comp/playback/NativeMediaPlayer/NativeMediaPlayerCore$PlayerEntry;->player:Landroid/media/MediaPlayer;

    iget-object v3, p0, Lcom/daaw/avee/comp/playback/NativeMediaPlayer/NativeMediaPlayerCore;->context:Landroid/content/Context;

    invoke-virtual {v2, v3, p2}, Landroid/media/MediaPlayer;->setDataSource(Landroid/content/Context;Landroid/net/Uri;)V

    .line 273
    invoke-virtual {p0, p1, v1}, Lcom/daaw/avee/comp/playback/NativeMediaPlayer/NativeMediaPlayerCore;->setStateLevel(II)V

    .line 275
    iget-object p2, p0, Lcom/daaw/avee/comp/playback/NativeMediaPlayer/NativeMediaPlayerCore;->players:[Lcom/daaw/avee/comp/playback/NativeMediaPlayer/NativeMediaPlayerCore$PlayerEntry;

    aget-object p2, p2, p1

    iget-object p2, p2, Lcom/daaw/avee/comp/playback/NativeMediaPlayer/NativeMediaPlayerCore$PlayerEntry;->player:Landroid/media/MediaPlayer;

    const/4 v2, 0x3

    invoke-virtual {p2, v2}, Landroid/media/MediaPlayer;->setAudioStreamType(I)V

    .line 277
    iget-object p2, p0, Lcom/daaw/avee/comp/playback/NativeMediaPlayer/NativeMediaPlayerCore;->players:[Lcom/daaw/avee/comp/playback/NativeMediaPlayer/NativeMediaPlayerCore$PlayerEntry;

    aget-object p2, p2, p1

    iget-object v2, p0, Lcom/daaw/avee/comp/playback/NativeMediaPlayer/NativeMediaPlayerCore;->onNotifyListener:Lcom/daaw/avee/comp/playback/IMediaPlayerCore$OnNotifyListener;

    invoke-interface {v2}, Lcom/daaw/avee/comp/playback/IMediaPlayerCore$OnNotifyListener;->getVideoScalingMode()I

    move-result v2

    invoke-virtual {p2, v2}, Lcom/daaw/avee/comp/playback/NativeMediaPlayer/NativeMediaPlayerCore$PlayerEntry;->setVideoScalingMode(I)V

    .line 279
    iget-object p2, p0, Lcom/daaw/avee/comp/playback/NativeMediaPlayer/NativeMediaPlayerCore;->onNotifyListener:Lcom/daaw/avee/comp/playback/IMediaPlayerCore$OnNotifyListener;

    invoke-interface {p2}, Lcom/daaw/avee/comp/playback/IMediaPlayerCore$OnNotifyListener;->onRequestVideoSurfaceHolder()Landroid/view/SurfaceHolder;

    move-result-object p2

    invoke-virtual {p0, p2}, Lcom/daaw/avee/comp/playback/NativeMediaPlayer/NativeMediaPlayerCore;->setVideoSurfaceHolder(Landroid/view/SurfaceHolder;)V

    .line 282
    iget-object p2, p0, Lcom/daaw/avee/comp/playback/NativeMediaPlayer/NativeMediaPlayerCore;->players:[Lcom/daaw/avee/comp/playback/NativeMediaPlayer/NativeMediaPlayerCore$PlayerEntry;

    iget v2, p0, Lcom/daaw/avee/comp/playback/NativeMediaPlayer/NativeMediaPlayerCore;->currentPlayer:I

    aget-object p2, p2, v2

    invoke-virtual {p2, p3}, Lcom/daaw/avee/comp/playback/NativeMediaPlayer/NativeMediaPlayerCore$PlayerEntry;->setFadeVolume(F)V

    .line 283
    iget-object p2, p0, Lcom/daaw/avee/comp/playback/NativeMediaPlayer/NativeMediaPlayerCore;->players:[Lcom/daaw/avee/comp/playback/NativeMediaPlayer/NativeMediaPlayerCore$PlayerEntry;

    iget v2, p0, Lcom/daaw/avee/comp/playback/NativeMediaPlayer/NativeMediaPlayerCore;->currentPlayer:I

    aget-object p2, p2, v2

    invoke-virtual {p2, p3}, Lcom/daaw/avee/comp/playback/NativeMediaPlayer/NativeMediaPlayerCore$PlayerEntry;->setStartFadeVolume(F)V

    .line 285
    iget-object p2, p0, Lcom/daaw/avee/comp/playback/NativeMediaPlayer/NativeMediaPlayerCore;->players:[Lcom/daaw/avee/comp/playback/NativeMediaPlayer/NativeMediaPlayerCore$PlayerEntry;

    aget-object p2, p2, p1

    invoke-virtual {p2, p4, p5}, Lcom/daaw/avee/comp/playback/NativeMediaPlayer/NativeMediaPlayerCore$PlayerEntry;->prepareAsync(J)V
    :try_end_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_1
    .catch Ljava/lang/IllegalArgumentException; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_0

    :catch_0
    move-exception p2

    .line 295
    iget-object p3, p0, Lcom/daaw/avee/comp/playback/NativeMediaPlayer/NativeMediaPlayerCore;->onNotifyListener:Lcom/daaw/avee/comp/playback/IMediaPlayerCore$OnNotifyListener;

    const-string p4, "Invalid media source"

    invoke-interface {p3, v1, p4}, Lcom/daaw/avee/comp/playback/IMediaPlayerCore$OnNotifyListener;->onMpPlaystateOrMetaChanged(ZLjava/lang/String;)V

    .line 297
    invoke-virtual {p2}, Ljava/lang/IllegalArgumentException;->getMessage()Ljava/lang/String;

    move-result-object p2

    invoke-static {p2}, Lcom/daaw/avee/Common/tlog;->w(Ljava/lang/String;)V

    .line 299
    invoke-virtual {p0, p1, v0}, Lcom/daaw/avee/comp/playback/NativeMediaPlayer/NativeMediaPlayerCore;->setStateLevel(II)V

    .line 300
    iget-object p2, p0, Lcom/daaw/avee/comp/playback/NativeMediaPlayer/NativeMediaPlayerCore;->players:[Lcom/daaw/avee/comp/playback/NativeMediaPlayer/NativeMediaPlayerCore$PlayerEntry;

    aget-object p1, p2, p1

    iget-object p1, p1, Lcom/daaw/avee/comp/playback/NativeMediaPlayer/NativeMediaPlayerCore$PlayerEntry;->player:Landroid/media/MediaPlayer;

    invoke-virtual {p0, p1}, Lcom/daaw/avee/comp/playback/NativeMediaPlayer/NativeMediaPlayerCore;->onCompletion(Landroid/media/MediaPlayer;)V

    goto :goto_0

    :catch_1
    move-exception p2

    .line 287
    iget-object p3, p0, Lcom/daaw/avee/comp/playback/NativeMediaPlayer/NativeMediaPlayerCore;->onNotifyListener:Lcom/daaw/avee/comp/playback/IMediaPlayerCore$OnNotifyListener;

    const-string p4, "Failed open media source"

    invoke-interface {p3, v1, p4}, Lcom/daaw/avee/comp/playback/IMediaPlayerCore$OnNotifyListener;->onMpPlaystateOrMetaChanged(ZLjava/lang/String;)V

    .line 289
    invoke-virtual {p2}, Ljava/io/IOException;->getMessage()Ljava/lang/String;

    move-result-object p2

    invoke-static {p2}, Lcom/daaw/avee/Common/tlog;->w(Ljava/lang/String;)V

    .line 291
    invoke-virtual {p0, p1, v0}, Lcom/daaw/avee/comp/playback/NativeMediaPlayer/NativeMediaPlayerCore;->setStateLevel(II)V

    .line 292
    iget-object p2, p0, Lcom/daaw/avee/comp/playback/NativeMediaPlayer/NativeMediaPlayerCore;->players:[Lcom/daaw/avee/comp/playback/NativeMediaPlayer/NativeMediaPlayerCore$PlayerEntry;

    aget-object p1, p2, p1

    iget-object p1, p1, Lcom/daaw/avee/comp/playback/NativeMediaPlayer/NativeMediaPlayerCore$PlayerEntry;->player:Landroid/media/MediaPlayer;

    invoke-virtual {p0, p1}, Lcom/daaw/avee/comp/playback/NativeMediaPlayer/NativeMediaPlayerCore;->onCompletion(Landroid/media/MediaPlayer;)V

    :goto_0
    return-void
.end method

.method public release()V
    .locals 2

    .line 93
    iget-object v0, p0, Lcom/daaw/avee/comp/playback/NativeMediaPlayer/NativeMediaPlayerCore;->equalizerEffect:Lcom/daaw/avee/comp/playback/NativeMediaPlayer/NativeEqualizerEffect;

    const/4 v1, 0x0

    if-eqz v0, :cond_0

    .line 94
    invoke-virtual {v0}, Lcom/daaw/avee/comp/playback/NativeMediaPlayer/NativeEqualizerEffect;->release()V

    .line 95
    iput-object v1, p0, Lcom/daaw/avee/comp/playback/NativeMediaPlayer/NativeMediaPlayerCore;->equalizerEffect:Lcom/daaw/avee/comp/playback/NativeMediaPlayer/NativeEqualizerEffect;

    .line 98
    :cond_0
    iget-object v0, p0, Lcom/daaw/avee/comp/playback/NativeMediaPlayer/NativeMediaPlayerCore;->surfaceHolderWeak:Ljava/lang/ref/WeakReference;

    invoke-virtual {v0}, Ljava/lang/ref/WeakReference;->get()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/view/SurfaceHolder;

    if-eqz v0, :cond_1

    .line 100
    invoke-interface {v0, p0}, Landroid/view/SurfaceHolder;->removeCallback(Landroid/view/SurfaceHolder$Callback;)V

    .line 101
    new-instance v0, Ljava/lang/ref/WeakReference;

    invoke-direct {v0, v1}, Ljava/lang/ref/WeakReference;-><init>(Ljava/lang/Object;)V

    iput-object v0, p0, Lcom/daaw/avee/comp/playback/NativeMediaPlayer/NativeMediaPlayerCore;->surfaceHolderWeak:Ljava/lang/ref/WeakReference;

    .line 104
    :cond_1
    iget v0, p0, Lcom/daaw/avee/comp/playback/NativeMediaPlayer/NativeMediaPlayerCore;->currentPlayer:I

    invoke-virtual {p0, v0}, Lcom/daaw/avee/comp/playback/NativeMediaPlayer/NativeMediaPlayerCore;->releaseMediaPlayer(I)V

    .line 105
    iget v0, p0, Lcom/daaw/avee/comp/playback/NativeMediaPlayer/NativeMediaPlayerCore;->nextPlayer:I

    invoke-virtual {p0, v0}, Lcom/daaw/avee/comp/playback/NativeMediaPlayer/NativeMediaPlayerCore;->releaseMediaPlayer(I)V

    return-void
.end method

.method releaseMediaPlayer(I)V
    .locals 1

    const/4 v0, 0x0

    .line 245
    invoke-virtual {p0, p1, v0}, Lcom/daaw/avee/comp/playback/NativeMediaPlayer/NativeMediaPlayerCore;->releaseMediaPlayer(IZ)V

    return-void
.end method

.method releaseMediaPlayer(IZ)V
    .locals 1

    .line 250
    iget-object p2, p0, Lcom/daaw/avee/comp/playback/NativeMediaPlayer/NativeMediaPlayerCore;->players:[Lcom/daaw/avee/comp/playback/NativeMediaPlayer/NativeMediaPlayerCore$PlayerEntry;

    array-length v0, p2

    if-lt p1, v0, :cond_0

    return-void

    .line 253
    :cond_0
    aget-object p2, p2, p1

    invoke-virtual {p2}, Lcom/daaw/avee/comp/playback/NativeMediaPlayer/NativeMediaPlayerCore$PlayerEntry;->release()V

    const/4 p2, -0x2

    .line 255
    invoke-virtual {p0, p1, p2}, Lcom/daaw/avee/comp/playback/NativeMediaPlayer/NativeMediaPlayerCore;->setStateLevel(II)V

    .line 256
    iget-object p2, p0, Lcom/daaw/avee/comp/playback/NativeMediaPlayer/NativeMediaPlayerCore;->players:[Lcom/daaw/avee/comp/playback/NativeMediaPlayer/NativeMediaPlayerCore$PlayerEntry;

    aget-object p1, p2, p1

    const/4 p2, 0x0

    iput-boolean p2, p1, Lcom/daaw/avee/comp/playback/NativeMediaPlayer/NativeMediaPlayerCore$PlayerEntry;->playerShouldStarts:Z

    return-void
.end method

.method resetMediaPlayer(I)V
    .locals 2

    .line 210
    iget-object v0, p0, Lcom/daaw/avee/comp/playback/NativeMediaPlayer/NativeMediaPlayerCore;->players:[Lcom/daaw/avee/comp/playback/NativeMediaPlayer/NativeMediaPlayerCore$PlayerEntry;

    aget-object v1, v0, p1

    if-eqz v1, :cond_0

    .line 211
    aget-object p1, v0, p1

    invoke-virtual {p1}, Lcom/daaw/avee/comp/playback/NativeMediaPlayer/NativeMediaPlayerCore$PlayerEntry;->reset()V

    :cond_0
    return-void
.end method

.method public resetVisualizer()V
    .locals 2

    .line 572
    iget-object v0, p0, Lcom/daaw/avee/comp/playback/NativeMediaPlayer/NativeMediaPlayerCore;->visualizerLock:Ljava/lang/Object;

    monitor-enter v0

    .line 573
    :try_start_0
    iget-object v1, p0, Lcom/daaw/avee/comp/playback/NativeMediaPlayer/NativeMediaPlayerCore;->visualizerData:Lcom/daaw/avee/comp/playback/NativeMediaPlayer/NativeVisualizerDataProvider;

    if-nez v1, :cond_0

    .line 576
    monitor-exit v0

    return-void

    .line 578
    :cond_0
    invoke-virtual {v1}, Lcom/daaw/avee/comp/playback/NativeMediaPlayer/NativeVisualizerDataProvider;->reset()V

    .line 579
    monitor-exit v0

    return-void

    :catchall_0
    move-exception v1

    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw v1
.end method

.method public seek(J)V
    .locals 2

    .line 454
    iget-object v0, p0, Lcom/daaw/avee/comp/playback/NativeMediaPlayer/NativeMediaPlayerCore;->players:[Lcom/daaw/avee/comp/playback/NativeMediaPlayer/NativeMediaPlayerCore$PlayerEntry;

    iget v1, p0, Lcom/daaw/avee/comp/playback/NativeMediaPlayer/NativeMediaPlayerCore;->currentPlayer:I

    aget-object v0, v0, v1

    invoke-virtual {v0}, Lcom/daaw/avee/comp/playback/NativeMediaPlayer/NativeMediaPlayerCore$PlayerEntry;->getStateLevels()I

    move-result v0

    const/4 v1, 0x3

    if-ge v0, v1, :cond_0

    return-void

    .line 455
    :cond_0
    iget-object v0, p0, Lcom/daaw/avee/comp/playback/NativeMediaPlayer/NativeMediaPlayerCore;->players:[Lcom/daaw/avee/comp/playback/NativeMediaPlayer/NativeMediaPlayerCore$PlayerEntry;

    iget v1, p0, Lcom/daaw/avee/comp/playback/NativeMediaPlayer/NativeMediaPlayerCore;->currentPlayer:I

    aget-object v0, v0, v1

    const/high16 v1, 0x3f800000    # 1.0f

    invoke-virtual {v0, v1}, Lcom/daaw/avee/comp/playback/NativeMediaPlayer/NativeMediaPlayerCore$PlayerEntry;->setFadeVolume(F)V

    .line 456
    iget-object v0, p0, Lcom/daaw/avee/comp/playback/NativeMediaPlayer/NativeMediaPlayerCore;->players:[Lcom/daaw/avee/comp/playback/NativeMediaPlayer/NativeMediaPlayerCore$PlayerEntry;

    iget v1, p0, Lcom/daaw/avee/comp/playback/NativeMediaPlayer/NativeMediaPlayerCore;->currentPlayer:I

    aget-object v0, v0, v1

    iget-object v0, v0, Lcom/daaw/avee/comp/playback/NativeMediaPlayer/NativeMediaPlayerCore$PlayerEntry;->player:Landroid/media/MediaPlayer;

    long-to-int p2, p1

    invoke-virtual {v0, p2}, Landroid/media/MediaPlayer;->seekTo(I)V

    return-void
.end method

.method public setEqualizerSettings(Lcom/daaw/avee/comp/playback/BaseEqualizerEffect$EqualizerSettings;)V
    .locals 1

    .line 645
    iget-object v0, p0, Lcom/daaw/avee/comp/playback/NativeMediaPlayer/NativeMediaPlayerCore;->equalizerEffect:Lcom/daaw/avee/comp/playback/NativeMediaPlayer/NativeEqualizerEffect;

    if-eqz v0, :cond_0

    .line 646
    invoke-virtual {v0, p1}, Lcom/daaw/avee/comp/playback/NativeMediaPlayer/NativeEqualizerEffect;->setEqualizerSettings(Lcom/daaw/avee/comp/playback/BaseEqualizerEffect$EqualizerSettings;)V

    :cond_0
    return-void
.end method

.method public setFadeVolume(FI)V
    .locals 2

    if-nez p2, :cond_0

    .line 496
    iget p2, p0, Lcom/daaw/avee/comp/playback/NativeMediaPlayer/NativeMediaPlayerCore;->currentPlayer:I

    goto :goto_0

    .line 498
    :cond_0
    iget p2, p0, Lcom/daaw/avee/comp/playback/NativeMediaPlayer/NativeMediaPlayerCore;->nextPlayer:I

    .line 499
    iget v0, p0, Lcom/daaw/avee/comp/playback/NativeMediaPlayer/NativeMediaPlayerCore;->currentPlayer:I

    if-ne v0, p2, :cond_1

    return-void

    .line 502
    :cond_1
    :goto_0
    iget-object v0, p0, Lcom/daaw/avee/comp/playback/NativeMediaPlayer/NativeMediaPlayerCore;->players:[Lcom/daaw/avee/comp/playback/NativeMediaPlayer/NativeMediaPlayerCore$PlayerEntry;

    aget-object v1, v0, p2

    if-eqz v1, :cond_2

    .line 503
    aget-object p2, v0, p2

    invoke-virtual {p2, p1}, Lcom/daaw/avee/comp/playback/NativeMediaPlayer/NativeMediaPlayerCore$PlayerEntry;->setFadeVolume(F)V

    :cond_2
    return-void
.end method

.method public setFadeVolumeRelative(FI)Z
    .locals 3

    const/4 v0, 0x1

    if-nez p2, :cond_0

    .line 509
    iget p2, p0, Lcom/daaw/avee/comp/playback/NativeMediaPlayer/NativeMediaPlayerCore;->currentPlayer:I

    goto :goto_0

    .line 511
    :cond_0
    iget p2, p0, Lcom/daaw/avee/comp/playback/NativeMediaPlayer/NativeMediaPlayerCore;->nextPlayer:I

    .line 512
    iget v1, p0, Lcom/daaw/avee/comp/playback/NativeMediaPlayer/NativeMediaPlayerCore;->currentPlayer:I

    if-ne v1, p2, :cond_1

    return v0

    .line 515
    :cond_1
    :goto_0
    iget-object v1, p0, Lcom/daaw/avee/comp/playback/NativeMediaPlayer/NativeMediaPlayerCore;->players:[Lcom/daaw/avee/comp/playback/NativeMediaPlayer/NativeMediaPlayerCore$PlayerEntry;

    aget-object v2, v1, p2

    if-eqz v2, :cond_3

    aget-object p2, v1, p2

    invoke-virtual {p2, p1}, Lcom/daaw/avee/comp/playback/NativeMediaPlayer/NativeMediaPlayerCore$PlayerEntry;->setFadeVolumeRelative(F)Z

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

    .line 461
    iget v0, p0, Lcom/daaw/avee/comp/playback/NativeMediaPlayer/NativeMediaPlayerCore;->volume:F

    invoke-virtual {p0, p1, v0}, Lcom/daaw/avee/comp/playback/NativeMediaPlayer/NativeMediaPlayerCore;->setVolume(ZF)V

    .line 462
    iget-object v0, p0, Lcom/daaw/avee/comp/playback/NativeMediaPlayer/NativeMediaPlayerCore;->onNotifyListener:Lcom/daaw/avee/comp/playback/IMediaPlayerCore$OnNotifyListener;

    invoke-interface {v0, p1}, Lcom/daaw/avee/comp/playback/IMediaPlayerCore$OnNotifyListener;->onVolumeMuteStateChanged(Z)V

    return-void
.end method

.method public setNextDataSource(Lcom/daaw/avee/comp/playback/Song/IMediaDataSource;)V
    .locals 0

    .line 306
    invoke-interface {p1}, Lcom/daaw/avee/comp/playback/Song/IMediaDataSource;->getContentUri()Landroid/net/Uri;

    move-result-object p1

    iput-object p1, p0, Lcom/daaw/avee/comp/playback/NativeMediaPlayer/NativeMediaPlayerCore;->nextDataSource:Landroid/net/Uri;

    return-void
.end method

.method public setNotifyListener(Lcom/daaw/avee/comp/playback/IMediaPlayerCore$OnNotifyListener;)V
    .locals 0

    .line 89
    iput-object p1, p0, Lcom/daaw/avee/comp/playback/NativeMediaPlayer/NativeMediaPlayerCore;->onNotifyListener:Lcom/daaw/avee/comp/playback/IMediaPlayerCore$OnNotifyListener;

    return-void
.end method

.method setStateLevel(II)V
    .locals 1

    .line 200
    iget-object v0, p0, Lcom/daaw/avee/comp/playback/NativeMediaPlayer/NativeMediaPlayerCore;->players:[Lcom/daaw/avee/comp/playback/NativeMediaPlayer/NativeMediaPlayerCore$PlayerEntry;

    aget-object v0, v0, p1

    invoke-virtual {v0, p2}, Lcom/daaw/avee/comp/playback/NativeMediaPlayer/NativeMediaPlayerCore$PlayerEntry;->setStateLevels(I)V

    .line 202
    iget-object p2, p0, Lcom/daaw/avee/comp/playback/NativeMediaPlayer/NativeMediaPlayerCore;->equalizerEffect:Lcom/daaw/avee/comp/playback/NativeMediaPlayer/NativeEqualizerEffect;

    if-eqz p2, :cond_0

    iget v0, p0, Lcom/daaw/avee/comp/playback/NativeMediaPlayer/NativeMediaPlayerCore;->currentPlayer:I

    if-ne p1, v0, :cond_0

    .line 203
    iget-object v0, p0, Lcom/daaw/avee/comp/playback/NativeMediaPlayer/NativeMediaPlayerCore;->players:[Lcom/daaw/avee/comp/playback/NativeMediaPlayer/NativeMediaPlayerCore$PlayerEntry;

    aget-object p1, v0, p1

    iget-object p1, p1, Lcom/daaw/avee/comp/playback/NativeMediaPlayer/NativeMediaPlayerCore$PlayerEntry;->stateTh:Lcom/daaw/avee/comp/playback/NativeMediaPlayer/NativeMediaPlayerCore$PlayerEntry$StateTh;

    iget p1, p1, Lcom/daaw/avee/comp/playback/NativeMediaPlayer/NativeMediaPlayerCore$PlayerEntry$StateTh;->audioSessionId:I

    invoke-virtual {p2, p1}, Lcom/daaw/avee/comp/playback/NativeMediaPlayer/NativeEqualizerEffect;->onAudioSessionChanged(I)V

    .line 204
    iget-object p1, p0, Lcom/daaw/avee/comp/playback/NativeMediaPlayer/NativeMediaPlayerCore;->equalizerEffect:Lcom/daaw/avee/comp/playback/NativeMediaPlayer/NativeEqualizerEffect;

    invoke-virtual {p1}, Lcom/daaw/avee/comp/playback/NativeMediaPlayer/NativeEqualizerEffect;->onCheckEqualizerLife()V

    :cond_0
    return-void
.end method

.method public setVideoScalingMode(I)V
    .locals 2

    .line 412
    iget-object v0, p0, Lcom/daaw/avee/comp/playback/NativeMediaPlayer/NativeMediaPlayerCore;->players:[Lcom/daaw/avee/comp/playback/NativeMediaPlayer/NativeMediaPlayerCore$PlayerEntry;

    iget v1, p0, Lcom/daaw/avee/comp/playback/NativeMediaPlayer/NativeMediaPlayerCore;->currentPlayer:I

    aget-object v0, v0, v1

    invoke-virtual {v0, p1}, Lcom/daaw/avee/comp/playback/NativeMediaPlayer/NativeMediaPlayerCore$PlayerEntry;->setVideoScalingMode(I)V

    return-void
.end method

.method public setVideoSurfaceHolder(Landroid/view/SurfaceHolder;)V
    .locals 1

    if-eqz p1, :cond_0

    .line 418
    new-instance v0, Ljava/lang/ref/WeakReference;

    invoke-direct {v0, p1}, Ljava/lang/ref/WeakReference;-><init>(Ljava/lang/Object;)V

    iput-object v0, p0, Lcom/daaw/avee/comp/playback/NativeMediaPlayer/NativeMediaPlayerCore;->surfaceHolderWeak:Ljava/lang/ref/WeakReference;

    .line 419
    invoke-interface {p1, p0}, Landroid/view/SurfaceHolder;->addCallback(Landroid/view/SurfaceHolder$Callback;)V

    .line 420
    invoke-virtual {p0, p1}, Lcom/daaw/avee/comp/playback/NativeMediaPlayer/NativeMediaPlayerCore;->surfaceCreated(Landroid/view/SurfaceHolder;)V

    goto :goto_0

    .line 422
    :cond_0
    iget-object p1, p0, Lcom/daaw/avee/comp/playback/NativeMediaPlayer/NativeMediaPlayerCore;->surfaceHolderWeak:Ljava/lang/ref/WeakReference;

    invoke-virtual {p1}, Ljava/lang/ref/WeakReference;->get()Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Landroid/view/SurfaceHolder;

    const/4 v0, 0x0

    if-eqz p1, :cond_1

    .line 424
    invoke-interface {p1, p0}, Landroid/view/SurfaceHolder;->removeCallback(Landroid/view/SurfaceHolder$Callback;)V

    .line 425
    new-instance p1, Ljava/lang/ref/WeakReference;

    invoke-direct {p1, v0}, Ljava/lang/ref/WeakReference;-><init>(Ljava/lang/Object;)V

    iput-object p1, p0, Lcom/daaw/avee/comp/playback/NativeMediaPlayer/NativeMediaPlayerCore;->surfaceHolderWeak:Ljava/lang/ref/WeakReference;

    .line 427
    :cond_1
    invoke-virtual {p0, v0}, Lcom/daaw/avee/comp/playback/NativeMediaPlayer/NativeMediaPlayerCore;->surfaceDestroyed(Landroid/view/SurfaceHolder;)V

    :goto_0
    return-void
.end method

.method public setVolume(F)V
    .locals 1

    .line 472
    iput p1, p0, Lcom/daaw/avee/comp/playback/NativeMediaPlayer/NativeMediaPlayerCore;->volume:F

    .line 473
    iget-boolean v0, p0, Lcom/daaw/avee/comp/playback/NativeMediaPlayer/NativeMediaPlayerCore;->muted:Z

    invoke-virtual {p0, v0, p1}, Lcom/daaw/avee/comp/playback/NativeMediaPlayer/NativeMediaPlayerCore;->setVolume(ZF)V

    return-void
.end method

.method public setVolume(ZF)V
    .locals 3

    .line 477
    iput-boolean p1, p0, Lcom/daaw/avee/comp/playback/NativeMediaPlayer/NativeMediaPlayerCore;->muted:Z

    .line 478
    iput p2, p0, Lcom/daaw/avee/comp/playback/NativeMediaPlayer/NativeMediaPlayerCore;->volume:F

    const/4 p2, 0x0

    if-eqz p1, :cond_1

    .line 481
    iget-object p1, p0, Lcom/daaw/avee/comp/playback/NativeMediaPlayer/NativeMediaPlayerCore;->players:[Lcom/daaw/avee/comp/playback/NativeMediaPlayer/NativeMediaPlayerCore$PlayerEntry;

    array-length v0, p1

    :goto_0
    if-ge p2, v0, :cond_3

    aget-object v1, p1, p2

    if-eqz v1, :cond_0

    const/4 v2, 0x0

    .line 483
    invoke-virtual {v1, v2}, Lcom/daaw/avee/comp/playback/NativeMediaPlayer/NativeMediaPlayerCore$PlayerEntry;->setVolume(F)V

    :cond_0
    add-int/lit8 p2, p2, 0x1

    goto :goto_0

    .line 486
    :cond_1
    iget-object p1, p0, Lcom/daaw/avee/comp/playback/NativeMediaPlayer/NativeMediaPlayerCore;->players:[Lcom/daaw/avee/comp/playback/NativeMediaPlayer/NativeMediaPlayerCore$PlayerEntry;

    array-length v0, p1

    :goto_1
    if-ge p2, v0, :cond_3

    aget-object v1, p1, p2

    if-eqz v1, :cond_2

    .line 488
    iget v2, p0, Lcom/daaw/avee/comp/playback/NativeMediaPlayer/NativeMediaPlayerCore;->volume:F

    invoke-virtual {v1, v2}, Lcom/daaw/avee/comp/playback/NativeMediaPlayer/NativeMediaPlayerCore$PlayerEntry;->setVolume(F)V

    :cond_2
    add-int/lit8 p2, p2, 0x1

    goto :goto_1

    :cond_3
    return-void
.end method

.method public setVolumeStereoBalance(F)V
    .locals 4

    .line 520
    iget-object v0, p0, Lcom/daaw/avee/comp/playback/NativeMediaPlayer/NativeMediaPlayerCore;->players:[Lcom/daaw/avee/comp/playback/NativeMediaPlayer/NativeMediaPlayerCore$PlayerEntry;

    array-length v1, v0

    const/4 v2, 0x0

    :goto_0
    if-ge v2, v1, :cond_1

    aget-object v3, v0, v2

    if-eqz v3, :cond_0

    .line 522
    invoke-virtual {v3, p1}, Lcom/daaw/avee/comp/playback/NativeMediaPlayer/NativeMediaPlayerCore$PlayerEntry;->setVolumeStereoBalance(F)V

    :cond_0
    add-int/lit8 v2, v2, 0x1

    goto :goto_0

    :cond_1
    return-void
.end method

.method public start()V
    .locals 1

    const/4 v0, 0x1

    .line 347
    invoke-direct {p0, v0}, Lcom/daaw/avee/comp/playback/NativeMediaPlayer/NativeMediaPlayerCore;->start(Z)V

    return-void
.end method

.method public stop()V
    .locals 3

    .line 389
    iget-object v0, p0, Lcom/daaw/avee/comp/playback/NativeMediaPlayer/NativeMediaPlayerCore;->players:[Lcom/daaw/avee/comp/playback/NativeMediaPlayer/NativeMediaPlayerCore$PlayerEntry;

    iget v1, p0, Lcom/daaw/avee/comp/playback/NativeMediaPlayer/NativeMediaPlayerCore;->currentPlayer:I

    aget-object v0, v0, v1

    invoke-virtual {v0}, Lcom/daaw/avee/comp/playback/NativeMediaPlayer/NativeMediaPlayerCore$PlayerEntry;->getStateLevels()I

    move-result v0

    const/4 v1, 0x2

    if-ge v0, v1, :cond_0

    return-void

    .line 390
    :cond_0
    iget-object v0, p0, Lcom/daaw/avee/comp/playback/NativeMediaPlayer/NativeMediaPlayerCore;->players:[Lcom/daaw/avee/comp/playback/NativeMediaPlayer/NativeMediaPlayerCore$PlayerEntry;

    iget v2, p0, Lcom/daaw/avee/comp/playback/NativeMediaPlayer/NativeMediaPlayerCore;->currentPlayer:I

    aget-object v0, v0, v2

    iget-object v0, v0, Lcom/daaw/avee/comp/playback/NativeMediaPlayer/NativeMediaPlayerCore$PlayerEntry;->player:Landroid/media/MediaPlayer;

    invoke-virtual {v0}, Landroid/media/MediaPlayer;->stop()V

    .line 391
    iget v0, p0, Lcom/daaw/avee/comp/playback/NativeMediaPlayer/NativeMediaPlayerCore;->currentPlayer:I

    invoke-virtual {p0, v0, v1}, Lcom/daaw/avee/comp/playback/NativeMediaPlayer/NativeMediaPlayerCore;->setStateLevel(II)V

    .line 393
    iget-object v0, p0, Lcom/daaw/avee/comp/playback/NativeMediaPlayer/NativeMediaPlayerCore;->onNotifyListener:Lcom/daaw/avee/comp/playback/IMediaPlayerCore$OnNotifyListener;

    const/4 v1, 0x0

    const/4 v2, 0x0

    invoke-interface {v0, v1, v2}, Lcom/daaw/avee/comp/playback/IMediaPlayerCore$OnNotifyListener;->onMpPlaystateOrMetaChanged(ZLjava/lang/String;)V

    return-void
.end method

.method public surfaceChanged(Landroid/view/SurfaceHolder;III)V
    .locals 0

    return-void
.end method

.method public surfaceCreated(Landroid/view/SurfaceHolder;)V
    .locals 3

    const/4 v0, 0x0

    if-eqz p1, :cond_0

    .line 548
    iget-object v1, p0, Lcom/daaw/avee/comp/playback/NativeMediaPlayer/NativeMediaPlayerCore;->players:[Lcom/daaw/avee/comp/playback/NativeMediaPlayer/NativeMediaPlayerCore$PlayerEntry;

    iget v2, p0, Lcom/daaw/avee/comp/playback/NativeMediaPlayer/NativeMediaPlayerCore;->nextPlayer:I

    aget-object v1, v1, v2

    invoke-virtual {v1, v0}, Lcom/daaw/avee/comp/playback/NativeMediaPlayer/NativeMediaPlayerCore$PlayerEntry;->setVideoSurface(Landroid/view/Surface;)V

    .line 549
    iget-object v0, p0, Lcom/daaw/avee/comp/playback/NativeMediaPlayer/NativeMediaPlayerCore;->players:[Lcom/daaw/avee/comp/playback/NativeMediaPlayer/NativeMediaPlayerCore$PlayerEntry;

    iget v1, p0, Lcom/daaw/avee/comp/playback/NativeMediaPlayer/NativeMediaPlayerCore;->currentPlayer:I

    aget-object v0, v0, v1

    invoke-interface {p1}, Landroid/view/SurfaceHolder;->getSurface()Landroid/view/Surface;

    move-result-object p1

    invoke-virtual {v0, p1}, Lcom/daaw/avee/comp/playback/NativeMediaPlayer/NativeMediaPlayerCore$PlayerEntry;->setVideoSurface(Landroid/view/Surface;)V

    goto :goto_0

    .line 551
    :cond_0
    iget-object p1, p0, Lcom/daaw/avee/comp/playback/NativeMediaPlayer/NativeMediaPlayerCore;->players:[Lcom/daaw/avee/comp/playback/NativeMediaPlayer/NativeMediaPlayerCore$PlayerEntry;

    iget v1, p0, Lcom/daaw/avee/comp/playback/NativeMediaPlayer/NativeMediaPlayerCore;->nextPlayer:I

    aget-object p1, p1, v1

    invoke-virtual {p1, v0}, Lcom/daaw/avee/comp/playback/NativeMediaPlayer/NativeMediaPlayerCore$PlayerEntry;->setVideoSurface(Landroid/view/Surface;)V

    .line 552
    iget-object p1, p0, Lcom/daaw/avee/comp/playback/NativeMediaPlayer/NativeMediaPlayerCore;->players:[Lcom/daaw/avee/comp/playback/NativeMediaPlayer/NativeMediaPlayerCore$PlayerEntry;

    iget v1, p0, Lcom/daaw/avee/comp/playback/NativeMediaPlayer/NativeMediaPlayerCore;->currentPlayer:I

    aget-object p1, p1, v1

    invoke-virtual {p1, v0}, Lcom/daaw/avee/comp/playback/NativeMediaPlayer/NativeMediaPlayerCore$PlayerEntry;->setVideoSurface(Landroid/view/Surface;)V

    :goto_0
    return-void
.end method

.method public surfaceDestroyed(Landroid/view/SurfaceHolder;)V
    .locals 2

    .line 566
    iget p1, p0, Lcom/daaw/avee/comp/playback/NativeMediaPlayer/NativeMediaPlayerCore;->currentPlayer:I

    iget v0, p0, Lcom/daaw/avee/comp/playback/NativeMediaPlayer/NativeMediaPlayerCore;->nextPlayer:I

    const/4 v1, 0x0

    if-eq p1, v0, :cond_0

    iget-object p1, p0, Lcom/daaw/avee/comp/playback/NativeMediaPlayer/NativeMediaPlayerCore;->players:[Lcom/daaw/avee/comp/playback/NativeMediaPlayer/NativeMediaPlayerCore$PlayerEntry;

    aget-object p1, p1, v0

    invoke-virtual {p1, v1}, Lcom/daaw/avee/comp/playback/NativeMediaPlayer/NativeMediaPlayerCore$PlayerEntry;->setVideoSurface(Landroid/view/Surface;)V

    .line 567
    :cond_0
    iget-object p1, p0, Lcom/daaw/avee/comp/playback/NativeMediaPlayer/NativeMediaPlayerCore;->players:[Lcom/daaw/avee/comp/playback/NativeMediaPlayer/NativeMediaPlayerCore$PlayerEntry;

    iget v0, p0, Lcom/daaw/avee/comp/playback/NativeMediaPlayer/NativeMediaPlayerCore;->currentPlayer:I

    aget-object p1, p1, v0

    invoke-virtual {p1, v1}, Lcom/daaw/avee/comp/playback/NativeMediaPlayer/NativeMediaPlayerCore$PlayerEntry;->setVideoSurface(Landroid/view/Surface;)V

    return-void
.end method
