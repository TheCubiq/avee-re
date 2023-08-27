.class public Lcom/daaw/avee/comp/SleepTimer/SleepTimer;
.super Ljava/lang/Object;
.source "SleepTimer.java"


# static fields
.field private static final createInstanceLock:Ljava/lang/Object;

.field private static volatile instanceWeak:Ljava/lang/ref/WeakReference;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/lang/ref/WeakReference<",
            "Lcom/daaw/avee/comp/SleepTimer/SleepTimer;",
            ">;"
        }
    .end annotation
.end field

.field public static onSleepTimerConfigChanged:Lcom/daaw/avee/Common/Events/WeakEvent3;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lcom/daaw/avee/Common/Events/WeakEvent3<",
            "Ljava/lang/Boolean;",
            "Ljava/lang/Integer;",
            "Ljava/lang/Boolean;",
            ">;"
        }
    .end annotation
.end field

.field public static onSleepTimerFire:Lcom/daaw/avee/Common/Events/WeakEvent;


# instance fields
.field private enabled:Z

.field private minutes:I

.field private playLastSongToEnd:Z

.field private sleepAtTime:Ljava/util/Date;

.field private timer:Ljava/util/Timer;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    .line 19
    new-instance v0, Lcom/daaw/avee/Common/Events/WeakEvent3;

    invoke-direct {v0}, Lcom/daaw/avee/Common/Events/WeakEvent3;-><init>()V

    sput-object v0, Lcom/daaw/avee/comp/SleepTimer/SleepTimer;->onSleepTimerConfigChanged:Lcom/daaw/avee/Common/Events/WeakEvent3;

    .line 20
    new-instance v0, Lcom/daaw/avee/Common/Events/WeakEvent;

    invoke-direct {v0}, Lcom/daaw/avee/Common/Events/WeakEvent;-><init>()V

    sput-object v0, Lcom/daaw/avee/comp/SleepTimer/SleepTimer;->onSleepTimerFire:Lcom/daaw/avee/Common/Events/WeakEvent;

    .line 22
    new-instance v0, Ljava/lang/Object;

    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    sput-object v0, Lcom/daaw/avee/comp/SleepTimer/SleepTimer;->createInstanceLock:Ljava/lang/Object;

    .line 23
    new-instance v0, Ljava/lang/ref/WeakReference;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Ljava/lang/ref/WeakReference;-><init>(Ljava/lang/Object;)V

    sput-object v0, Lcom/daaw/avee/comp/SleepTimer/SleepTimer;->instanceWeak:Ljava/lang/ref/WeakReference;

    return-void
.end method

.method public constructor <init>()V
    .locals 4

    .line 33
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const/4 v0, 0x0

    .line 24
    iput-boolean v0, p0, Lcom/daaw/avee/comp/SleepTimer/SleepTimer;->enabled:Z

    .line 25
    iput v0, p0, Lcom/daaw/avee/comp/SleepTimer/SleepTimer;->minutes:I

    .line 26
    new-instance v1, Ljava/util/Date;

    invoke-direct {v1}, Ljava/util/Date;-><init>()V

    iput-object v1, p0, Lcom/daaw/avee/comp/SleepTimer/SleepTimer;->sleepAtTime:Ljava/util/Date;

    .line 27
    iput-boolean v0, p0, Lcom/daaw/avee/comp/SleepTimer/SleepTimer;->playLastSongToEnd:Z

    const/4 v0, 0x0

    .line 31
    iput-object v0, p0, Lcom/daaw/avee/comp/SleepTimer/SleepTimer;->timer:Ljava/util/Timer;

    .line 34
    sget-object v0, Lcom/daaw/avee/comp/SleepTimer/SleepTimer;->onSleepTimerConfigChanged:Lcom/daaw/avee/Common/Events/WeakEvent3;

    iget-boolean v1, p0, Lcom/daaw/avee/comp/SleepTimer/SleepTimer;->enabled:Z

    invoke-static {v1}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v1

    iget v2, p0, Lcom/daaw/avee/comp/SleepTimer/SleepTimer;->minutes:I

    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    iget-boolean v3, p0, Lcom/daaw/avee/comp/SleepTimer/SleepTimer;->playLastSongToEnd:Z

    invoke-static {v3}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v3

    invoke-virtual {v0, v1, v2, v3}, Lcom/daaw/avee/Common/Events/WeakEvent3;->invoke(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)V

    return-void
.end method

.method static synthetic access$000(Lcom/daaw/avee/comp/SleepTimer/SleepTimer;)V
    .locals 0

    .line 17
    invoke-direct {p0}, Lcom/daaw/avee/comp/SleepTimer/SleepTimer;->fire()V

    return-void
.end method

.method public static createOrGetInstance()Lcom/daaw/avee/comp/SleepTimer/SleepTimer;
    .locals 3

    .line 39
    sget-object v0, Lcom/daaw/avee/comp/SleepTimer/SleepTimer;->instanceWeak:Ljava/lang/ref/WeakReference;

    invoke-virtual {v0}, Ljava/lang/ref/WeakReference;->get()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/daaw/avee/comp/SleepTimer/SleepTimer;

    if-eqz v0, :cond_0

    return-object v0

    .line 42
    :cond_0
    sget-object v0, Lcom/daaw/avee/comp/SleepTimer/SleepTimer;->createInstanceLock:Ljava/lang/Object;

    monitor-enter v0

    .line 43
    :try_start_0
    sget-object v1, Lcom/daaw/avee/comp/SleepTimer/SleepTimer;->instanceWeak:Ljava/lang/ref/WeakReference;

    invoke-virtual {v1}, Ljava/lang/ref/WeakReference;->get()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lcom/daaw/avee/comp/SleepTimer/SleepTimer;

    if-nez v1, :cond_1

    .line 45
    new-instance v1, Lcom/daaw/avee/comp/SleepTimer/SleepTimer;

    invoke-direct {v1}, Lcom/daaw/avee/comp/SleepTimer/SleepTimer;-><init>()V

    .line 46
    new-instance v2, Ljava/lang/ref/WeakReference;

    invoke-direct {v2, v1}, Ljava/lang/ref/WeakReference;-><init>(Ljava/lang/Object;)V

    sput-object v2, Lcom/daaw/avee/comp/SleepTimer/SleepTimer;->instanceWeak:Ljava/lang/ref/WeakReference;

    .line 49
    :cond_1
    monitor-exit v0

    return-object v1

    :catchall_0
    move-exception v1

    .line 50
    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw v1
.end method

.method private fire()V
    .locals 4

    .line 122
    iget v0, p0, Lcom/daaw/avee/comp/SleepTimer/SleepTimer;->minutes:I

    iget-object v1, p0, Lcom/daaw/avee/comp/SleepTimer/SleepTimer;->sleepAtTime:Ljava/util/Date;

    iget-boolean v2, p0, Lcom/daaw/avee/comp/SleepTimer/SleepTimer;->playLastSongToEnd:Z

    const/4 v3, 0x0

    invoke-virtual {p0, v3, v0, v1, v2}, Lcom/daaw/avee/comp/SleepTimer/SleepTimer;->configure(ZILjava/util/Date;Z)V

    .line 123
    sget-object v0, Lcom/daaw/avee/comp/SleepTimer/SleepTimer;->onSleepTimerFire:Lcom/daaw/avee/Common/Events/WeakEvent;

    invoke-virtual {v0}, Lcom/daaw/avee/Common/Events/WeakEvent;->invoke()V

    return-void
.end method


# virtual methods
.method public configure(ZILjava/util/Date;Z)V
    .locals 2

    if-gez p2, :cond_0

    const/4 p1, 0x0

    .line 57
    :cond_0
    iput-boolean p1, p0, Lcom/daaw/avee/comp/SleepTimer/SleepTimer;->enabled:Z

    .line 58
    iput p2, p0, Lcom/daaw/avee/comp/SleepTimer/SleepTimer;->minutes:I

    .line 59
    iput-object p3, p0, Lcom/daaw/avee/comp/SleepTimer/SleepTimer;->sleepAtTime:Ljava/util/Date;

    .line 60
    iput-boolean p4, p0, Lcom/daaw/avee/comp/SleepTimer/SleepTimer;->playLastSongToEnd:Z

    if-eqz p1, :cond_2

    .line 76
    iget-object v0, p0, Lcom/daaw/avee/comp/SleepTimer/SleepTimer;->timer:Ljava/util/Timer;

    if-eqz v0, :cond_1

    .line 77
    invoke-virtual {v0}, Ljava/util/Timer;->cancel()V

    .line 79
    :cond_1
    new-instance v0, Ljava/util/Timer;

    invoke-direct {v0}, Ljava/util/Timer;-><init>()V

    iput-object v0, p0, Lcom/daaw/avee/comp/SleepTimer/SleepTimer;->timer:Ljava/util/Timer;

    .line 81
    new-instance v1, Lcom/daaw/avee/comp/SleepTimer/SleepTimer$1;

    invoke-direct {v1, p0}, Lcom/daaw/avee/comp/SleepTimer/SleepTimer$1;-><init>(Lcom/daaw/avee/comp/SleepTimer/SleepTimer;)V

    invoke-virtual {v0, v1, p3}, Ljava/util/Timer;->schedule(Ljava/util/TimerTask;Ljava/util/Date;)V

    goto :goto_0

    .line 88
    :cond_2
    iget-object p3, p0, Lcom/daaw/avee/comp/SleepTimer/SleepTimer;->timer:Ljava/util/Timer;

    if-eqz p3, :cond_3

    .line 89
    invoke-virtual {p3}, Ljava/util/Timer;->cancel()V

    :cond_3
    const/4 p3, 0x0

    .line 90
    iput-object p3, p0, Lcom/daaw/avee/comp/SleepTimer/SleepTimer;->timer:Ljava/util/Timer;

    .line 93
    :goto_0
    sget-object p3, Lcom/daaw/avee/comp/SleepTimer/SleepTimer;->onSleepTimerConfigChanged:Lcom/daaw/avee/Common/Events/WeakEvent3;

    invoke-static {p1}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object p1

    invoke-static {p2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p2

    invoke-static {p4}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object p4

    invoke-virtual {p3, p1, p2, p4}, Lcom/daaw/avee/Common/Events/WeakEvent3;->invoke(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)V

    return-void
.end method

.method public getConfig()Lcom/daaw/avee/comp/SleepTimer/SleepTimerConfig;
    .locals 2

    .line 98
    new-instance v0, Lcom/daaw/avee/comp/SleepTimer/SleepTimerConfig;

    invoke-direct {v0}, Lcom/daaw/avee/comp/SleepTimer/SleepTimerConfig;-><init>()V

    .line 99
    iget-boolean v1, p0, Lcom/daaw/avee/comp/SleepTimer/SleepTimer;->enabled:Z

    iput-boolean v1, v0, Lcom/daaw/avee/comp/SleepTimer/SleepTimerConfig;->enabled:Z

    .line 100
    iget v1, p0, Lcom/daaw/avee/comp/SleepTimer/SleepTimer;->minutes:I

    iput v1, v0, Lcom/daaw/avee/comp/SleepTimer/SleepTimerConfig;->minutes:I

    .line 101
    iget-boolean v1, p0, Lcom/daaw/avee/comp/SleepTimer/SleepTimer;->playLastSongToEnd:Z

    iput-boolean v1, v0, Lcom/daaw/avee/comp/SleepTimer/SleepTimerConfig;->playLastSongToEnd:Z

    return-object v0
.end method

.method public getRemainingSeconds()I
    .locals 5

    .line 108
    new-instance v0, Ljava/util/Date;

    invoke-direct {v0}, Ljava/util/Date;-><init>()V

    .line 110
    iget-object v1, p0, Lcom/daaw/avee/comp/SleepTimer/SleepTimer;->sleepAtTime:Ljava/util/Date;

    invoke-virtual {v1}, Ljava/util/Date;->getTime()J

    move-result-wide v1

    invoke-virtual {v0}, Ljava/util/Date;->getTime()J

    move-result-wide v3

    sub-long/2addr v1, v3

    long-to-int v0, v1

    .line 112
    div-int/lit16 v0, v0, 0x3e8

    return v0
.end method

.method public getSleepAtTime()Ljava/util/Date;
    .locals 1

    .line 117
    iget-object v0, p0, Lcom/daaw/avee/comp/SleepTimer/SleepTimer;->sleepAtTime:Ljava/util/Date;

    return-object v0
.end method
