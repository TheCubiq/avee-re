.class Lcom/daaw/avee/comp/playback/Song/PlaylistSong$PlaylistSongOwnSerialExecutor;
.super Ljava/lang/Object;
.source "PlaylistSong.java"

# interfaces
.implements Ljava/util/concurrent/Executor;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/daaw/avee/comp/playback/Song/PlaylistSong;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0xa
    name = "PlaylistSongOwnSerialExecutor"
.end annotation


# instance fields
.field active:Ljava/lang/Runnable;

.field final tasks:Ljava/util/ArrayDeque;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/ArrayDeque<",
            "Ljava/lang/Runnable;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method private constructor <init>()V
    .locals 1

    .line 449
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 450
    new-instance v0, Ljava/util/ArrayDeque;

    invoke-direct {v0}, Ljava/util/ArrayDeque;-><init>()V

    iput-object v0, p0, Lcom/daaw/avee/comp/playback/Song/PlaylistSong$PlaylistSongOwnSerialExecutor;->tasks:Ljava/util/ArrayDeque;

    return-void
.end method


# virtual methods
.method public declared-synchronized execute(Ljava/lang/Runnable;)V
    .locals 2

    monitor-enter p0

    .line 454
    :try_start_0
    iget-object v0, p0, Lcom/daaw/avee/comp/playback/Song/PlaylistSong$PlaylistSongOwnSerialExecutor;->tasks:Ljava/util/ArrayDeque;

    new-instance v1, Lcom/daaw/avee/comp/playback/Song/PlaylistSong$PlaylistSongOwnSerialExecutor$1;

    invoke-direct {v1, p0, p1}, Lcom/daaw/avee/comp/playback/Song/PlaylistSong$PlaylistSongOwnSerialExecutor$1;-><init>(Lcom/daaw/avee/comp/playback/Song/PlaylistSong$PlaylistSongOwnSerialExecutor;Ljava/lang/Runnable;)V

    invoke-virtual {v0, v1}, Ljava/util/ArrayDeque;->offer(Ljava/lang/Object;)Z

    .line 463
    iget-object p1, p0, Lcom/daaw/avee/comp/playback/Song/PlaylistSong$PlaylistSongOwnSerialExecutor;->active:Ljava/lang/Runnable;

    if-nez p1, :cond_0

    .line 464
    invoke-virtual {p0}, Lcom/daaw/avee/comp/playback/Song/PlaylistSong$PlaylistSongOwnSerialExecutor;->scheduleNext()V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 466
    :cond_0
    monitor-exit p0

    return-void

    :catchall_0
    move-exception p1

    monitor-exit p0

    throw p1
.end method

.method protected declared-synchronized scheduleNext()V
    .locals 2

    monitor-enter p0

    .line 469
    :try_start_0
    iget-object v0, p0, Lcom/daaw/avee/comp/playback/Song/PlaylistSong$PlaylistSongOwnSerialExecutor;->tasks:Ljava/util/ArrayDeque;

    invoke-virtual {v0}, Ljava/util/ArrayDeque;->poll()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Runnable;

    iput-object v0, p0, Lcom/daaw/avee/comp/playback/Song/PlaylistSong$PlaylistSongOwnSerialExecutor;->active:Ljava/lang/Runnable;

    if-eqz v0, :cond_0

    .line 470
    sget-object v0, Lcom/daaw/avee/Common/VAsyncTask;->THREAD_POOL_EXECUTOR_2:Ljava/util/concurrent/Executor;

    iget-object v1, p0, Lcom/daaw/avee/comp/playback/Song/PlaylistSong$PlaylistSongOwnSerialExecutor;->active:Ljava/lang/Runnable;

    invoke-interface {v0, v1}, Ljava/util/concurrent/Executor;->execute(Ljava/lang/Runnable;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 472
    :cond_0
    monitor-exit p0

    return-void

    :catchall_0
    move-exception v0

    monitor-exit p0

    throw v0
.end method
