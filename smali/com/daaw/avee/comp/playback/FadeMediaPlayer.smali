.class public Lcom/daaw/avee/comp/playback/FadeMediaPlayer;
.super Ljava/lang/Object;
.source "FadeMediaPlayer.java"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/daaw/avee/comp/playback/FadeMediaPlayer$MyHandler;
    }
.end annotation


# static fields
.field private static final MSG_CROSS_FADE_TICK:I = 0x4

.field private static final MSG_START:I = 0x7

.field private static final MSG_START_CROSS_FADE:I = 0x5

.field private static final MSG_START_FADE:I = 0x6

.field private static final MSG_TICK:I = 0x2

.field private static final MSG_TICK2:I = 0x3

.field private static final prepareNextTimeReserve:J = 0x5dcL


# instance fields
.field private crossFadeDuration:J

.field private crossFadeTickMs:J

.field private fadeInSeconds:F

.field private fadeSpeed:F

.field private mHandler:Lcom/daaw/avee/comp/playback/FadeMediaPlayer$MyHandler;

.field private mediaPlayerCore:Lcom/daaw/avee/comp/playback/IMediaPlayerCore;

.field private mode:I

.field private mode2:I

.field private onNotifyListener:Lcom/daaw/avee/comp/playback/IMediaPlayerCore$OnNotifyListener;

.field private tickMs:J


# direct methods
.method public constructor <init>(Lcom/daaw/avee/comp/playback/IMediaPlayerCore;Lcom/daaw/avee/comp/playback/IMediaPlayerCore$OnNotifyListener;J)V
    .locals 5

    .line 183
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const/4 v0, 0x0

    .line 30
    iput v0, p0, Lcom/daaw/avee/comp/playback/FadeMediaPlayer;->mode:I

    .line 38
    iput v0, p0, Lcom/daaw/avee/comp/playback/FadeMediaPlayer;->mode2:I

    const-wide/16 v0, 0x50

    .line 47
    iput-wide v0, p0, Lcom/daaw/avee/comp/playback/FadeMediaPlayer;->tickMs:J

    const/high16 v2, 0x3e800000    # 0.25f

    .line 48
    iput v2, p0, Lcom/daaw/avee/comp/playback/FadeMediaPlayer;->fadeInSeconds:F

    const-wide/16 v3, 0xa

    add-long/2addr v0, v3

    long-to-float v0, v0

    const v1, 0x3a83126f    # 0.001f

    mul-float v0, v0, v1

    div-float/2addr v0, v2

    .line 49
    iput v0, p0, Lcom/daaw/avee/comp/playback/FadeMediaPlayer;->fadeSpeed:F

    const-wide/16 v0, 0x12c

    .line 51
    iput-wide v0, p0, Lcom/daaw/avee/comp/playback/FadeMediaPlayer;->crossFadeTickMs:J

    const-wide/16 v0, -0x1

    .line 52
    iput-wide v0, p0, Lcom/daaw/avee/comp/playback/FadeMediaPlayer;->crossFadeDuration:J

    .line 181
    new-instance v0, Lcom/daaw/avee/comp/playback/FadeMediaPlayer$MyHandler;

    invoke-direct {v0, p0}, Lcom/daaw/avee/comp/playback/FadeMediaPlayer$MyHandler;-><init>(Lcom/daaw/avee/comp/playback/FadeMediaPlayer;)V

    iput-object v0, p0, Lcom/daaw/avee/comp/playback/FadeMediaPlayer;->mHandler:Lcom/daaw/avee/comp/playback/FadeMediaPlayer$MyHandler;

    .line 184
    iput-object p1, p0, Lcom/daaw/avee/comp/playback/FadeMediaPlayer;->mediaPlayerCore:Lcom/daaw/avee/comp/playback/IMediaPlayerCore;

    .line 185
    iput-object p2, p0, Lcom/daaw/avee/comp/playback/FadeMediaPlayer;->onNotifyListener:Lcom/daaw/avee/comp/playback/IMediaPlayerCore$OnNotifyListener;

    .line 186
    invoke-virtual {p0, p3, p4}, Lcom/daaw/avee/comp/playback/FadeMediaPlayer;->setCrossFade(J)V

    .line 188
    new-instance p2, Lcom/daaw/avee/comp/playback/FadeMediaPlayer$1;

    invoke-direct {p2, p0}, Lcom/daaw/avee/comp/playback/FadeMediaPlayer$1;-><init>(Lcom/daaw/avee/comp/playback/FadeMediaPlayer;)V

    invoke-interface {p1, p2}, Lcom/daaw/avee/comp/playback/IMediaPlayerCore;->setNotifyListener(Lcom/daaw/avee/comp/playback/IMediaPlayerCore$OnNotifyListener;)V

    return-void
.end method

.method static synthetic access$000(Lcom/daaw/avee/comp/playback/FadeMediaPlayer;)J
    .locals 2

    .line 18
    iget-wide v0, p0, Lcom/daaw/avee/comp/playback/FadeMediaPlayer;->crossFadeDuration:J

    return-wide v0
.end method

.method static synthetic access$100(Lcom/daaw/avee/comp/playback/FadeMediaPlayer;)J
    .locals 2

    .line 18
    iget-wide v0, p0, Lcom/daaw/avee/comp/playback/FadeMediaPlayer;->tickMs:J

    return-wide v0
.end method

.method static synthetic access$1000(Lcom/daaw/avee/comp/playback/FadeMediaPlayer;)V
    .locals 0

    .line 18
    invoke-direct {p0}, Lcom/daaw/avee/comp/playback/FadeMediaPlayer;->destroyOld()V

    return-void
.end method

.method static synthetic access$1100(Lcom/daaw/avee/comp/playback/FadeMediaPlayer;)V
    .locals 0

    .line 18
    invoke-direct {p0}, Lcom/daaw/avee/comp/playback/FadeMediaPlayer;->justStart()V

    return-void
.end method

.method static synthetic access$1200(Lcom/daaw/avee/comp/playback/FadeMediaPlayer;)Lcom/daaw/avee/comp/playback/FadeMediaPlayer$MyHandler;
    .locals 0

    .line 18
    iget-object p0, p0, Lcom/daaw/avee/comp/playback/FadeMediaPlayer;->mHandler:Lcom/daaw/avee/comp/playback/FadeMediaPlayer$MyHandler;

    return-object p0
.end method

.method static synthetic access$200(Lcom/daaw/avee/comp/playback/FadeMediaPlayer;)I
    .locals 0

    .line 18
    iget p0, p0, Lcom/daaw/avee/comp/playback/FadeMediaPlayer;->mode:I

    return p0
.end method

.method static synthetic access$202(Lcom/daaw/avee/comp/playback/FadeMediaPlayer;I)I
    .locals 0

    .line 18
    iput p1, p0, Lcom/daaw/avee/comp/playback/FadeMediaPlayer;->mode:I

    return p1
.end method

.method static synthetic access$300(Lcom/daaw/avee/comp/playback/FadeMediaPlayer;)F
    .locals 0

    .line 18
    iget p0, p0, Lcom/daaw/avee/comp/playback/FadeMediaPlayer;->fadeSpeed:F

    return p0
.end method

.method static synthetic access$400(Lcom/daaw/avee/comp/playback/FadeMediaPlayer;)Lcom/daaw/avee/comp/playback/IMediaPlayerCore;
    .locals 0

    .line 18
    iget-object p0, p0, Lcom/daaw/avee/comp/playback/FadeMediaPlayer;->mediaPlayerCore:Lcom/daaw/avee/comp/playback/IMediaPlayerCore;

    return-object p0
.end method

.method static synthetic access$500(Lcom/daaw/avee/comp/playback/FadeMediaPlayer;)I
    .locals 0

    .line 18
    iget p0, p0, Lcom/daaw/avee/comp/playback/FadeMediaPlayer;->mode2:I

    return p0
.end method

.method static synthetic access$502(Lcom/daaw/avee/comp/playback/FadeMediaPlayer;I)I
    .locals 0

    .line 18
    iput p1, p0, Lcom/daaw/avee/comp/playback/FadeMediaPlayer;->mode2:I

    return p1
.end method

.method static synthetic access$600(Lcom/daaw/avee/comp/playback/FadeMediaPlayer;)Lcom/daaw/avee/comp/playback/IMediaPlayerCore$OnNotifyListener;
    .locals 0

    .line 18
    iget-object p0, p0, Lcom/daaw/avee/comp/playback/FadeMediaPlayer;->onNotifyListener:Lcom/daaw/avee/comp/playback/IMediaPlayerCore$OnNotifyListener;

    return-object p0
.end method

.method static synthetic access$700(Lcom/daaw/avee/comp/playback/FadeMediaPlayer;)J
    .locals 2

    .line 18
    iget-wide v0, p0, Lcom/daaw/avee/comp/playback/FadeMediaPlayer;->crossFadeTickMs:J

    return-wide v0
.end method

.method static synthetic access$800(Lcom/daaw/avee/comp/playback/FadeMediaPlayer;)V
    .locals 0

    .line 18
    invoke-direct {p0}, Lcom/daaw/avee/comp/playback/FadeMediaPlayer;->startCrossFade()V

    return-void
.end method

.method static synthetic access$900(Lcom/daaw/avee/comp/playback/FadeMediaPlayer;)V
    .locals 0

    .line 18
    invoke-direct {p0}, Lcom/daaw/avee/comp/playback/FadeMediaPlayer;->startFade()V

    return-void
.end method

.method private destroyOld()V
    .locals 1

    .line 363
    iget-object v0, p0, Lcom/daaw/avee/comp/playback/FadeMediaPlayer;->mediaPlayerCore:Lcom/daaw/avee/comp/playback/IMediaPlayerCore;

    invoke-interface {v0}, Lcom/daaw/avee/comp/playback/IMediaPlayerCore;->destroyOld()V

    return-void
.end method

.method private justCrossFadeUp()V
    .locals 4

    const/4 v0, 0x5

    .line 349
    iput v0, p0, Lcom/daaw/avee/comp/playback/FadeMediaPlayer;->mode:I

    .line 350
    iget-object v0, p0, Lcom/daaw/avee/comp/playback/FadeMediaPlayer;->mHandler:Lcom/daaw/avee/comp/playback/FadeMediaPlayer$MyHandler;

    const/4 v1, 0x2

    invoke-virtual {v0, v1}, Lcom/daaw/avee/comp/playback/FadeMediaPlayer$MyHandler;->removeMessages(I)V

    .line 351
    iget-object v0, p0, Lcom/daaw/avee/comp/playback/FadeMediaPlayer;->mHandler:Lcom/daaw/avee/comp/playback/FadeMediaPlayer$MyHandler;

    invoke-virtual {v0, v1}, Lcom/daaw/avee/comp/playback/FadeMediaPlayer$MyHandler;->obtainMessage(I)Landroid/os/Message;

    move-result-object v0

    .line 352
    iget-object v1, p0, Lcom/daaw/avee/comp/playback/FadeMediaPlayer;->mHandler:Lcom/daaw/avee/comp/playback/FadeMediaPlayer$MyHandler;

    iget-wide v2, p0, Lcom/daaw/avee/comp/playback/FadeMediaPlayer;->tickMs:J

    invoke-virtual {v1, v0, v2, v3}, Lcom/daaw/avee/comp/playback/FadeMediaPlayer$MyHandler;->sendMessageDelayed(Landroid/os/Message;J)Z

    return-void
.end method

.method private justFadeUp()V
    .locals 4

    const/4 v0, 0x3

    .line 334
    iput v0, p0, Lcom/daaw/avee/comp/playback/FadeMediaPlayer;->mode:I

    .line 335
    iget-object v0, p0, Lcom/daaw/avee/comp/playback/FadeMediaPlayer;->mHandler:Lcom/daaw/avee/comp/playback/FadeMediaPlayer$MyHandler;

    const/4 v1, 0x2

    invoke-virtual {v0, v1}, Lcom/daaw/avee/comp/playback/FadeMediaPlayer$MyHandler;->removeMessages(I)V

    .line 336
    iget-object v0, p0, Lcom/daaw/avee/comp/playback/FadeMediaPlayer;->mHandler:Lcom/daaw/avee/comp/playback/FadeMediaPlayer$MyHandler;

    invoke-virtual {v0, v1}, Lcom/daaw/avee/comp/playback/FadeMediaPlayer$MyHandler;->obtainMessage(I)Landroid/os/Message;

    move-result-object v0

    .line 337
    iget-object v1, p0, Lcom/daaw/avee/comp/playback/FadeMediaPlayer;->mHandler:Lcom/daaw/avee/comp/playback/FadeMediaPlayer$MyHandler;

    iget-wide v2, p0, Lcom/daaw/avee/comp/playback/FadeMediaPlayer;->tickMs:J

    invoke-virtual {v1, v0, v2, v3}, Lcom/daaw/avee/comp/playback/FadeMediaPlayer$MyHandler;->sendMessageDelayed(Landroid/os/Message;J)Z

    return-void
.end method

.method private justStart()V
    .locals 1

    .line 330
    iget-object v0, p0, Lcom/daaw/avee/comp/playback/FadeMediaPlayer;->mediaPlayerCore:Lcom/daaw/avee/comp/playback/IMediaPlayerCore;

    invoke-interface {v0}, Lcom/daaw/avee/comp/playback/IMediaPlayerCore;->start()V

    return-void
.end method

.method private pauseFade()V
    .locals 4

    const/4 v0, 0x2

    .line 315
    iput v0, p0, Lcom/daaw/avee/comp/playback/FadeMediaPlayer;->mode:I

    .line 316
    iget-object v1, p0, Lcom/daaw/avee/comp/playback/FadeMediaPlayer;->mHandler:Lcom/daaw/avee/comp/playback/FadeMediaPlayer$MyHandler;

    invoke-virtual {v1, v0}, Lcom/daaw/avee/comp/playback/FadeMediaPlayer$MyHandler;->removeMessages(I)V

    .line 317
    iget-object v1, p0, Lcom/daaw/avee/comp/playback/FadeMediaPlayer;->mHandler:Lcom/daaw/avee/comp/playback/FadeMediaPlayer$MyHandler;

    invoke-virtual {v1, v0}, Lcom/daaw/avee/comp/playback/FadeMediaPlayer$MyHandler;->obtainMessage(I)Landroid/os/Message;

    move-result-object v0

    .line 318
    iget-object v1, p0, Lcom/daaw/avee/comp/playback/FadeMediaPlayer;->mHandler:Lcom/daaw/avee/comp/playback/FadeMediaPlayer$MyHandler;

    iget-wide v2, p0, Lcom/daaw/avee/comp/playback/FadeMediaPlayer;->tickMs:J

    invoke-virtual {v1, v0, v2, v3}, Lcom/daaw/avee/comp/playback/FadeMediaPlayer$MyHandler;->sendMessageDelayed(Landroid/os/Message;J)Z

    return-void
.end method

.method private startCrossFade()V
    .locals 4

    const/4 v0, 0x5

    .line 341
    iput v0, p0, Lcom/daaw/avee/comp/playback/FadeMediaPlayer;->mode:I

    .line 342
    iget-object v0, p0, Lcom/daaw/avee/comp/playback/FadeMediaPlayer;->mediaPlayerCore:Lcom/daaw/avee/comp/playback/IMediaPlayerCore;

    invoke-interface {v0}, Lcom/daaw/avee/comp/playback/IMediaPlayerCore;->start()V

    .line 343
    iget-object v0, p0, Lcom/daaw/avee/comp/playback/FadeMediaPlayer;->mHandler:Lcom/daaw/avee/comp/playback/FadeMediaPlayer$MyHandler;

    const/4 v1, 0x2

    invoke-virtual {v0, v1}, Lcom/daaw/avee/comp/playback/FadeMediaPlayer$MyHandler;->removeMessages(I)V

    .line 344
    iget-object v0, p0, Lcom/daaw/avee/comp/playback/FadeMediaPlayer;->mHandler:Lcom/daaw/avee/comp/playback/FadeMediaPlayer$MyHandler;

    invoke-virtual {v0, v1}, Lcom/daaw/avee/comp/playback/FadeMediaPlayer$MyHandler;->obtainMessage(I)Landroid/os/Message;

    move-result-object v0

    .line 345
    iget-object v1, p0, Lcom/daaw/avee/comp/playback/FadeMediaPlayer;->mHandler:Lcom/daaw/avee/comp/playback/FadeMediaPlayer$MyHandler;

    iget-wide v2, p0, Lcom/daaw/avee/comp/playback/FadeMediaPlayer;->tickMs:J

    invoke-virtual {v1, v0, v2, v3}, Lcom/daaw/avee/comp/playback/FadeMediaPlayer$MyHandler;->sendMessageDelayed(Landroid/os/Message;J)Z

    return-void
.end method

.method private startFade()V
    .locals 4

    const/4 v0, 0x3

    .line 322
    iput v0, p0, Lcom/daaw/avee/comp/playback/FadeMediaPlayer;->mode:I

    .line 323
    iget-object v0, p0, Lcom/daaw/avee/comp/playback/FadeMediaPlayer;->mediaPlayerCore:Lcom/daaw/avee/comp/playback/IMediaPlayerCore;

    invoke-interface {v0}, Lcom/daaw/avee/comp/playback/IMediaPlayerCore;->start()V

    .line 324
    iget-object v0, p0, Lcom/daaw/avee/comp/playback/FadeMediaPlayer;->mHandler:Lcom/daaw/avee/comp/playback/FadeMediaPlayer$MyHandler;

    const/4 v1, 0x2

    invoke-virtual {v0, v1}, Lcom/daaw/avee/comp/playback/FadeMediaPlayer$MyHandler;->removeMessages(I)V

    .line 325
    iget-object v0, p0, Lcom/daaw/avee/comp/playback/FadeMediaPlayer;->mHandler:Lcom/daaw/avee/comp/playback/FadeMediaPlayer$MyHandler;

    invoke-virtual {v0, v1}, Lcom/daaw/avee/comp/playback/FadeMediaPlayer$MyHandler;->obtainMessage(I)Landroid/os/Message;

    move-result-object v0

    .line 326
    iget-object v1, p0, Lcom/daaw/avee/comp/playback/FadeMediaPlayer;->mHandler:Lcom/daaw/avee/comp/playback/FadeMediaPlayer$MyHandler;

    iget-wide v2, p0, Lcom/daaw/avee/comp/playback/FadeMediaPlayer;->tickMs:J

    invoke-virtual {v1, v0, v2, v3}, Lcom/daaw/avee/comp/playback/FadeMediaPlayer$MyHandler;->sendMessageDelayed(Landroid/os/Message;J)Z

    return-void
.end method

.method private startPlayNext(Lcom/daaw/avee/comp/playback/Song/IMediaDataSource;ZZFJ)V
    .locals 7

    .line 425
    iget-object v0, p0, Lcom/daaw/avee/comp/playback/FadeMediaPlayer;->mHandler:Lcom/daaw/avee/comp/playback/FadeMediaPlayer$MyHandler;

    const/4 v1, 0x4

    invoke-virtual {v0, v1}, Lcom/daaw/avee/comp/playback/FadeMediaPlayer$MyHandler;->removeMessages(I)V

    .line 426
    iget-object v0, p0, Lcom/daaw/avee/comp/playback/FadeMediaPlayer;->mHandler:Lcom/daaw/avee/comp/playback/FadeMediaPlayer$MyHandler;

    invoke-virtual {v0, v1}, Lcom/daaw/avee/comp/playback/FadeMediaPlayer$MyHandler;->obtainMessage(I)Landroid/os/Message;

    move-result-object v0

    .line 427
    iget-object v1, p0, Lcom/daaw/avee/comp/playback/FadeMediaPlayer;->mHandler:Lcom/daaw/avee/comp/playback/FadeMediaPlayer$MyHandler;

    iget-wide v2, p0, Lcom/daaw/avee/comp/playback/FadeMediaPlayer;->crossFadeTickMs:J

    invoke-virtual {v1, v0, v2, v3}, Lcom/daaw/avee/comp/playback/FadeMediaPlayer$MyHandler;->sendMessageDelayed(Landroid/os/Message;J)Z

    .line 429
    iget-object v0, p0, Lcom/daaw/avee/comp/playback/FadeMediaPlayer;->mHandler:Lcom/daaw/avee/comp/playback/FadeMediaPlayer$MyHandler;

    const/4 v1, 0x3

    invoke-virtual {v0, v1}, Lcom/daaw/avee/comp/playback/FadeMediaPlayer$MyHandler;->removeMessages(I)V

    const/4 v0, 0x0

    .line 430
    iput v0, p0, Lcom/daaw/avee/comp/playback/FadeMediaPlayer;->mode2:I

    .line 432
    iput v0, p0, Lcom/daaw/avee/comp/playback/FadeMediaPlayer;->mode:I

    .line 433
    iget-object v0, p0, Lcom/daaw/avee/comp/playback/FadeMediaPlayer;->mHandler:Lcom/daaw/avee/comp/playback/FadeMediaPlayer$MyHandler;

    const/4 v1, 0x2

    invoke-virtual {v0, v1}, Lcom/daaw/avee/comp/playback/FadeMediaPlayer$MyHandler;->removeMessages(I)V

    .line 435
    iget-object v0, p0, Lcom/daaw/avee/comp/playback/FadeMediaPlayer;->mediaPlayerCore:Lcom/daaw/avee/comp/playback/IMediaPlayerCore;

    invoke-interface {v0, p1}, Lcom/daaw/avee/comp/playback/IMediaPlayerCore;->setNextDataSource(Lcom/daaw/avee/comp/playback/Song/IMediaDataSource;)V

    .line 436
    iget-object v1, p0, Lcom/daaw/avee/comp/playback/FadeMediaPlayer;->mediaPlayerCore:Lcom/daaw/avee/comp/playback/IMediaPlayerCore;

    move v2, p2

    move v3, p3

    move v4, p4

    move-wide v5, p5

    invoke-interface/range {v1 .. v6}, Lcom/daaw/avee/comp/playback/IMediaPlayerCore;->playNext(ZZFJ)V

    return-void
.end method

.method private startPlayNextFadeUp(Lcom/daaw/avee/comp/playback/Song/IMediaDataSource;ZZJ)V
    .locals 7

    .line 440
    iget-object v0, p0, Lcom/daaw/avee/comp/playback/FadeMediaPlayer;->mHandler:Lcom/daaw/avee/comp/playback/FadeMediaPlayer$MyHandler;

    const/4 v1, 0x4

    invoke-virtual {v0, v1}, Lcom/daaw/avee/comp/playback/FadeMediaPlayer$MyHandler;->removeMessages(I)V

    .line 441
    iget-object v0, p0, Lcom/daaw/avee/comp/playback/FadeMediaPlayer;->mHandler:Lcom/daaw/avee/comp/playback/FadeMediaPlayer$MyHandler;

    invoke-virtual {v0, v1}, Lcom/daaw/avee/comp/playback/FadeMediaPlayer$MyHandler;->obtainMessage(I)Landroid/os/Message;

    move-result-object v0

    .line 442
    iget-object v1, p0, Lcom/daaw/avee/comp/playback/FadeMediaPlayer;->mHandler:Lcom/daaw/avee/comp/playback/FadeMediaPlayer$MyHandler;

    iget-wide v2, p0, Lcom/daaw/avee/comp/playback/FadeMediaPlayer;->crossFadeTickMs:J

    invoke-virtual {v1, v0, v2, v3}, Lcom/daaw/avee/comp/playback/FadeMediaPlayer$MyHandler;->sendMessageDelayed(Landroid/os/Message;J)Z

    .line 445
    iget-object v0, p0, Lcom/daaw/avee/comp/playback/FadeMediaPlayer;->mediaPlayerCore:Lcom/daaw/avee/comp/playback/IMediaPlayerCore;

    invoke-interface {v0, p1}, Lcom/daaw/avee/comp/playback/IMediaPlayerCore;->setNextDataSource(Lcom/daaw/avee/comp/playback/Song/IMediaDataSource;)V

    .line 446
    iget-object v1, p0, Lcom/daaw/avee/comp/playback/FadeMediaPlayer;->mediaPlayerCore:Lcom/daaw/avee/comp/playback/IMediaPlayerCore;

    const/4 v4, 0x0

    move v2, p2

    move v3, p3

    move-wide v5, p4

    invoke-interface/range {v1 .. v6}, Lcom/daaw/avee/comp/playback/IMediaPlayerCore;->playNext(ZZFJ)V

    .line 448
    iget-object p1, p0, Lcom/daaw/avee/comp/playback/FadeMediaPlayer;->mHandler:Lcom/daaw/avee/comp/playback/FadeMediaPlayer$MyHandler;

    const/4 p2, 0x3

    invoke-virtual {p1, p2}, Lcom/daaw/avee/comp/playback/FadeMediaPlayer$MyHandler;->removeMessages(I)V

    const/4 p1, 0x0

    .line 449
    iput p1, p0, Lcom/daaw/avee/comp/playback/FadeMediaPlayer;->mode2:I

    .line 451
    iget-object p1, p0, Lcom/daaw/avee/comp/playback/FadeMediaPlayer;->mHandler:Lcom/daaw/avee/comp/playback/FadeMediaPlayer$MyHandler;

    const/4 p3, 0x2

    invoke-virtual {p1, p3}, Lcom/daaw/avee/comp/playback/FadeMediaPlayer$MyHandler;->removeMessages(I)V

    .line 452
    iput p2, p0, Lcom/daaw/avee/comp/playback/FadeMediaPlayer;->mode:I

    .line 453
    iget-object p1, p0, Lcom/daaw/avee/comp/playback/FadeMediaPlayer;->mHandler:Lcom/daaw/avee/comp/playback/FadeMediaPlayer$MyHandler;

    invoke-virtual {p1, p3}, Lcom/daaw/avee/comp/playback/FadeMediaPlayer$MyHandler;->obtainMessage(I)Landroid/os/Message;

    move-result-object p1

    .line 454
    iget-object p2, p0, Lcom/daaw/avee/comp/playback/FadeMediaPlayer;->mHandler:Lcom/daaw/avee/comp/playback/FadeMediaPlayer$MyHandler;

    iget-wide p3, p0, Lcom/daaw/avee/comp/playback/FadeMediaPlayer;->tickMs:J

    invoke-virtual {p2, p1, p3, p4}, Lcom/daaw/avee/comp/playback/FadeMediaPlayer$MyHandler;->sendMessageDelayed(Landroid/os/Message;J)Z

    return-void
.end method

.method private stopFade()V
    .locals 4

    const/4 v0, 0x1

    .line 307
    iput v0, p0, Lcom/daaw/avee/comp/playback/FadeMediaPlayer;->mode:I

    .line 308
    iget-object v0, p0, Lcom/daaw/avee/comp/playback/FadeMediaPlayer;->mHandler:Lcom/daaw/avee/comp/playback/FadeMediaPlayer$MyHandler;

    const/4 v1, 0x2

    invoke-virtual {v0, v1}, Lcom/daaw/avee/comp/playback/FadeMediaPlayer$MyHandler;->removeMessages(I)V

    .line 309
    iget-object v0, p0, Lcom/daaw/avee/comp/playback/FadeMediaPlayer;->mHandler:Lcom/daaw/avee/comp/playback/FadeMediaPlayer$MyHandler;

    invoke-virtual {v0, v1}, Lcom/daaw/avee/comp/playback/FadeMediaPlayer$MyHandler;->obtainMessage(I)Landroid/os/Message;

    move-result-object v0

    .line 310
    iget-object v1, p0, Lcom/daaw/avee/comp/playback/FadeMediaPlayer;->mHandler:Lcom/daaw/avee/comp/playback/FadeMediaPlayer$MyHandler;

    iget-wide v2, p0, Lcom/daaw/avee/comp/playback/FadeMediaPlayer;->tickMs:J

    invoke-virtual {v1, v0, v2, v3}, Lcom/daaw/avee/comp/playback/FadeMediaPlayer$MyHandler;->sendMessageDelayed(Landroid/os/Message;J)Z

    return-void
.end method


# virtual methods
.method public destroyOldCrossFade()V
    .locals 4

    .line 367
    iget-object v0, p0, Lcom/daaw/avee/comp/playback/FadeMediaPlayer;->mHandler:Lcom/daaw/avee/comp/playback/FadeMediaPlayer$MyHandler;

    const/4 v1, 0x3

    invoke-virtual {v0, v1}, Lcom/daaw/avee/comp/playback/FadeMediaPlayer$MyHandler;->removeMessages(I)V

    const/4 v0, 0x6

    .line 368
    iput v0, p0, Lcom/daaw/avee/comp/playback/FadeMediaPlayer;->mode2:I

    .line 369
    iget-object v0, p0, Lcom/daaw/avee/comp/playback/FadeMediaPlayer;->mHandler:Lcom/daaw/avee/comp/playback/FadeMediaPlayer$MyHandler;

    invoke-virtual {v0, v1}, Lcom/daaw/avee/comp/playback/FadeMediaPlayer$MyHandler;->obtainMessage(I)Landroid/os/Message;

    move-result-object v0

    .line 370
    iget-object v1, p0, Lcom/daaw/avee/comp/playback/FadeMediaPlayer;->mHandler:Lcom/daaw/avee/comp/playback/FadeMediaPlayer$MyHandler;

    iget-wide v2, p0, Lcom/daaw/avee/comp/playback/FadeMediaPlayer;->tickMs:J

    invoke-virtual {v1, v0, v2, v3}, Lcom/daaw/avee/comp/playback/FadeMediaPlayer$MyHandler;->sendMessageDelayed(Landroid/os/Message;J)Z

    return-void
.end method

.method public destroyOldFadeDown()V
    .locals 4

    .line 356
    iget-object v0, p0, Lcom/daaw/avee/comp/playback/FadeMediaPlayer;->mHandler:Lcom/daaw/avee/comp/playback/FadeMediaPlayer$MyHandler;

    const/4 v1, 0x3

    invoke-virtual {v0, v1}, Lcom/daaw/avee/comp/playback/FadeMediaPlayer$MyHandler;->removeMessages(I)V

    const/4 v0, 0x4

    .line 357
    iput v0, p0, Lcom/daaw/avee/comp/playback/FadeMediaPlayer;->mode2:I

    .line 358
    iget-object v0, p0, Lcom/daaw/avee/comp/playback/FadeMediaPlayer;->mHandler:Lcom/daaw/avee/comp/playback/FadeMediaPlayer$MyHandler;

    invoke-virtual {v0, v1}, Lcom/daaw/avee/comp/playback/FadeMediaPlayer$MyHandler;->obtainMessage(I)Landroid/os/Message;

    move-result-object v0

    .line 359
    iget-object v1, p0, Lcom/daaw/avee/comp/playback/FadeMediaPlayer;->mHandler:Lcom/daaw/avee/comp/playback/FadeMediaPlayer$MyHandler;

    iget-wide v2, p0, Lcom/daaw/avee/comp/playback/FadeMediaPlayer;->tickMs:J

    invoke-virtual {v1, v0, v2, v3}, Lcom/daaw/avee/comp/playback/FadeMediaPlayer$MyHandler;->sendMessageDelayed(Landroid/os/Message;J)Z

    return-void
.end method

.method public getMediaPlayerCore()Lcom/daaw/avee/comp/playback/IMediaPlayerCore;
    .locals 1

    .line 278
    iget-object v0, p0, Lcom/daaw/avee/comp/playback/FadeMediaPlayer;->mediaPlayerCore:Lcom/daaw/avee/comp/playback/IMediaPlayerCore;

    return-object v0
.end method

.method public pauseFadeAll()V
    .locals 0

    .line 293
    invoke-direct {p0}, Lcom/daaw/avee/comp/playback/FadeMediaPlayer;->pauseFade()V

    .line 294
    invoke-virtual {p0}, Lcom/daaw/avee/comp/playback/FadeMediaPlayer;->destroyOldFadeDown()V

    return-void
.end method

.method public playNext(Lcom/daaw/avee/comp/playback/Song/IMediaDataSource;ZJ)V
    .locals 7

    .line 410
    iget-object v0, p0, Lcom/daaw/avee/comp/playback/FadeMediaPlayer;->mHandler:Lcom/daaw/avee/comp/playback/FadeMediaPlayer$MyHandler;

    const/4 v1, 0x5

    invoke-virtual {v0, v1}, Lcom/daaw/avee/comp/playback/FadeMediaPlayer$MyHandler;->removeMessages(I)V

    .line 411
    iget-object v0, p0, Lcom/daaw/avee/comp/playback/FadeMediaPlayer;->mHandler:Lcom/daaw/avee/comp/playback/FadeMediaPlayer$MyHandler;

    const/4 v1, 0x6

    invoke-virtual {v0, v1}, Lcom/daaw/avee/comp/playback/FadeMediaPlayer$MyHandler;->removeMessages(I)V

    .line 412
    iget-object v0, p0, Lcom/daaw/avee/comp/playback/FadeMediaPlayer;->mHandler:Lcom/daaw/avee/comp/playback/FadeMediaPlayer$MyHandler;

    const/4 v1, 0x7

    invoke-virtual {v0, v1}, Lcom/daaw/avee/comp/playback/FadeMediaPlayer$MyHandler;->removeMessages(I)V

    .line 414
    iget-wide v0, p0, Lcom/daaw/avee/comp/playback/FadeMediaPlayer;->crossFadeDuration:J

    const-wide/16 v2, 0x0

    cmp-long v4, v0, v2

    if-ltz v4, :cond_0

    iget-wide v2, p0, Lcom/daaw/avee/comp/playback/FadeMediaPlayer;->crossFadeTickMs:J

    cmp-long v4, v0, v2

    if-lez v4, :cond_0

    const/4 v2, 0x0

    const/4 v4, 0x0

    move-object v0, p0

    move-object v1, p1

    move v3, p2

    move-wide v5, p3

    .line 415
    invoke-direct/range {v0 .. v6}, Lcom/daaw/avee/comp/playback/FadeMediaPlayer;->startPlayNext(Lcom/daaw/avee/comp/playback/Song/IMediaDataSource;ZZFJ)V

    .line 416
    invoke-direct {p0}, Lcom/daaw/avee/comp/playback/FadeMediaPlayer;->justCrossFadeUp()V

    .line 417
    invoke-virtual {p0}, Lcom/daaw/avee/comp/playback/FadeMediaPlayer;->destroyOldCrossFade()V

    goto :goto_0

    :cond_0
    const/4 v2, 0x1

    const/high16 v4, 0x3f800000    # 1.0f

    move-object v0, p0

    move-object v1, p1

    move v3, p2

    move-wide v5, p3

    .line 419
    invoke-direct/range {v0 .. v6}, Lcom/daaw/avee/comp/playback/FadeMediaPlayer;->startPlayNext(Lcom/daaw/avee/comp/playback/Song/IMediaDataSource;ZZFJ)V

    .line 420
    invoke-direct {p0}, Lcom/daaw/avee/comp/playback/FadeMediaPlayer;->destroyOld()V

    :goto_0
    return-void
.end method

.method public playNextAtTime(Lcom/daaw/avee/comp/playback/Song/IMediaDataSource;ZJJ)V
    .locals 12

    move-object v7, p0

    move-wide/from16 v8, p5

    .line 374
    iget-object v0, v7, Lcom/daaw/avee/comp/playback/FadeMediaPlayer;->mHandler:Lcom/daaw/avee/comp/playback/FadeMediaPlayer$MyHandler;

    const/4 v10, 0x5

    invoke-virtual {v0, v10}, Lcom/daaw/avee/comp/playback/FadeMediaPlayer$MyHandler;->removeMessages(I)V

    .line 375
    iget-object v0, v7, Lcom/daaw/avee/comp/playback/FadeMediaPlayer;->mHandler:Lcom/daaw/avee/comp/playback/FadeMediaPlayer$MyHandler;

    const/4 v1, 0x6

    invoke-virtual {v0, v1}, Lcom/daaw/avee/comp/playback/FadeMediaPlayer$MyHandler;->removeMessages(I)V

    .line 376
    iget-object v0, v7, Lcom/daaw/avee/comp/playback/FadeMediaPlayer;->mHandler:Lcom/daaw/avee/comp/playback/FadeMediaPlayer$MyHandler;

    const/4 v11, 0x7

    invoke-virtual {v0, v11}, Lcom/daaw/avee/comp/playback/FadeMediaPlayer$MyHandler;->removeMessages(I)V

    .line 378
    invoke-static {}, Lcom/daaw/avee/Common/Utils;->tickCount()J

    move-result-wide v0

    sub-long v0, v8, v0

    const-wide/16 v2, 0x0

    cmp-long v4, v8, v2

    if-lez v4, :cond_3

    cmp-long v4, v0, v2

    if-gtz v4, :cond_0

    goto :goto_0

    .line 383
    :cond_0
    iget-wide v0, v7, Lcom/daaw/avee/comp/playback/FadeMediaPlayer;->crossFadeDuration:J

    cmp-long v4, v0, v2

    if-ltz v4, :cond_1

    iget-wide v4, v7, Lcom/daaw/avee/comp/playback/FadeMediaPlayer;->crossFadeTickMs:J

    cmp-long v6, v0, v4

    if-lez v6, :cond_1

    const/4 v2, 0x0

    const/4 v3, 0x0

    const/4 v4, 0x0

    move-object v0, p0

    move-object v1, p1

    move-wide v5, p3

    .line 385
    invoke-direct/range {v0 .. v6}, Lcom/daaw/avee/comp/playback/FadeMediaPlayer;->startPlayNext(Lcom/daaw/avee/comp/playback/Song/IMediaDataSource;ZZFJ)V

    if-eqz p2, :cond_4

    .line 388
    iget-object v0, v7, Lcom/daaw/avee/comp/playback/FadeMediaPlayer;->mHandler:Lcom/daaw/avee/comp/playback/FadeMediaPlayer$MyHandler;

    invoke-virtual {v0, v10}, Lcom/daaw/avee/comp/playback/FadeMediaPlayer$MyHandler;->obtainMessage(I)Landroid/os/Message;

    move-result-object v0

    .line 389
    iget-object v1, v7, Lcom/daaw/avee/comp/playback/FadeMediaPlayer;->mHandler:Lcom/daaw/avee/comp/playback/FadeMediaPlayer$MyHandler;

    invoke-virtual {v1, v0, v8, v9}, Lcom/daaw/avee/comp/playback/FadeMediaPlayer$MyHandler;->sendMessageAtTime(Landroid/os/Message;J)Z

    goto :goto_1

    .line 392
    :cond_1
    iget-wide v0, v7, Lcom/daaw/avee/comp/playback/FadeMediaPlayer;->crossFadeDuration:J

    cmp-long v4, v0, v2

    if-ltz v4, :cond_2

    const/4 v2, 0x0

    const/4 v3, 0x0

    const/high16 v4, 0x3f800000    # 1.0f

    move-object v0, p0

    move-object v1, p1

    move-wide v5, p3

    .line 393
    invoke-direct/range {v0 .. v6}, Lcom/daaw/avee/comp/playback/FadeMediaPlayer;->startPlayNext(Lcom/daaw/avee/comp/playback/Song/IMediaDataSource;ZZFJ)V

    if-eqz p2, :cond_4

    .line 395
    iget-object v0, v7, Lcom/daaw/avee/comp/playback/FadeMediaPlayer;->mHandler:Lcom/daaw/avee/comp/playback/FadeMediaPlayer$MyHandler;

    invoke-virtual {v0, v11}, Lcom/daaw/avee/comp/playback/FadeMediaPlayer$MyHandler;->obtainMessage(I)Landroid/os/Message;

    move-result-object v0

    .line 396
    iget-object v1, v7, Lcom/daaw/avee/comp/playback/FadeMediaPlayer;->mHandler:Lcom/daaw/avee/comp/playback/FadeMediaPlayer$MyHandler;

    invoke-virtual {v1, v0, v8, v9}, Lcom/daaw/avee/comp/playback/FadeMediaPlayer$MyHandler;->sendMessageAtTime(Landroid/os/Message;J)Z

    goto :goto_1

    :cond_2
    const/4 v2, 0x1

    const/4 v3, 0x0

    const/high16 v4, 0x3f800000    # 1.0f

    move-object v0, p0

    move-object v1, p1

    move-wide v5, p3

    .line 399
    invoke-direct/range {v0 .. v6}, Lcom/daaw/avee/comp/playback/FadeMediaPlayer;->startPlayNext(Lcom/daaw/avee/comp/playback/Song/IMediaDataSource;ZZFJ)V

    if-eqz p2, :cond_4

    .line 401
    iget-object v0, v7, Lcom/daaw/avee/comp/playback/FadeMediaPlayer;->mHandler:Lcom/daaw/avee/comp/playback/FadeMediaPlayer$MyHandler;

    invoke-virtual {v0, v11}, Lcom/daaw/avee/comp/playback/FadeMediaPlayer$MyHandler;->obtainMessage(I)Landroid/os/Message;

    move-result-object v0

    .line 402
    iget-object v1, v7, Lcom/daaw/avee/comp/playback/FadeMediaPlayer;->mHandler:Lcom/daaw/avee/comp/playback/FadeMediaPlayer$MyHandler;

    invoke-virtual {v1, v0, v8, v9}, Lcom/daaw/avee/comp/playback/FadeMediaPlayer$MyHandler;->sendMessageAtTime(Landroid/os/Message;J)Z

    goto :goto_1

    .line 380
    :cond_3
    :goto_0
    invoke-virtual/range {p0 .. p4}, Lcom/daaw/avee/comp/playback/FadeMediaPlayer;->playNext(Lcom/daaw/avee/comp/playback/Song/IMediaDataSource;ZJ)V

    :cond_4
    :goto_1
    return-void
.end method

.method public release()V
    .locals 2

    .line 282
    iget-object v0, p0, Lcom/daaw/avee/comp/playback/FadeMediaPlayer;->mHandler:Lcom/daaw/avee/comp/playback/FadeMediaPlayer$MyHandler;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Lcom/daaw/avee/comp/playback/FadeMediaPlayer$MyHandler;->removeCallbacksAndMessages(Ljava/lang/Object;)V

    .line 283
    iget-object v0, p0, Lcom/daaw/avee/comp/playback/FadeMediaPlayer;->mediaPlayerCore:Lcom/daaw/avee/comp/playback/IMediaPlayerCore;

    invoke-interface {v0}, Lcom/daaw/avee/comp/playback/IMediaPlayerCore;->release()V

    .line 284
    iput-object v1, p0, Lcom/daaw/avee/comp/playback/FadeMediaPlayer;->mediaPlayerCore:Lcom/daaw/avee/comp/playback/IMediaPlayerCore;

    return-void
.end method

.method public setCrossFade(J)V
    .locals 0

    .line 459
    iput-wide p1, p0, Lcom/daaw/avee/comp/playback/FadeMediaPlayer;->crossFadeDuration:J

    return-void
.end method

.method public startFadeAll()V
    .locals 0

    .line 298
    invoke-direct {p0}, Lcom/daaw/avee/comp/playback/FadeMediaPlayer;->startFade()V

    .line 299
    invoke-virtual {p0}, Lcom/daaw/avee/comp/playback/FadeMediaPlayer;->destroyOldFadeDown()V

    return-void
.end method

.method public stop()V
    .locals 1

    .line 303
    iget-object v0, p0, Lcom/daaw/avee/comp/playback/FadeMediaPlayer;->mediaPlayerCore:Lcom/daaw/avee/comp/playback/IMediaPlayerCore;

    invoke-interface {v0}, Lcom/daaw/avee/comp/playback/IMediaPlayerCore;->stop()V

    return-void
.end method

.method public stopFadeAll()V
    .locals 0

    .line 288
    invoke-direct {p0}, Lcom/daaw/avee/comp/playback/FadeMediaPlayer;->stopFade()V

    .line 289
    invoke-virtual {p0}, Lcom/daaw/avee/comp/playback/FadeMediaPlayer;->destroyOldFadeDown()V

    return-void
.end method
