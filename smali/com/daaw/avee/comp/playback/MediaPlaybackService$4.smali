.class Lcom/daaw/avee/comp/playback/MediaPlaybackService$4;
.super Ljava/lang/Object;
.source "MediaPlaybackService.java"

# interfaces
.implements Ljava/lang/Runnable;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/daaw/avee/comp/playback/MediaPlaybackService;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic this$0:Lcom/daaw/avee/comp/playback/MediaPlaybackService;


# direct methods
.method constructor <init>(Lcom/daaw/avee/comp/playback/MediaPlaybackService;)V
    .locals 0

    .line 228
    iput-object p1, p0, Lcom/daaw/avee/comp/playback/MediaPlaybackService$4;->this$0:Lcom/daaw/avee/comp/playback/MediaPlaybackService;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public run()V
    .locals 3

    .line 232
    monitor-enter p0

    .line 233
    :try_start_0
    iget-object v0, p0, Lcom/daaw/avee/comp/playback/MediaPlaybackService$4;->this$0:Lcom/daaw/avee/comp/playback/MediaPlaybackService;

    invoke-virtual {v0}, Lcom/daaw/avee/comp/playback/MediaPlaybackService;->initialize()V

    .line 234
    invoke-virtual {p0}, Ljava/lang/Object;->notifyAll()V

    .line 235
    iget-object v0, p0, Lcom/daaw/avee/comp/playback/MediaPlaybackService$4;->this$0:Lcom/daaw/avee/comp/playback/MediaPlaybackService;

    invoke-static {v0}, Lcom/daaw/avee/comp/playback/MediaPlaybackService;->access$500(Lcom/daaw/avee/comp/playback/MediaPlaybackService;)[Z

    move-result-object v0

    const/4 v1, 0x0

    const/4 v2, 0x1

    aput-boolean v2, v0, v1

    .line 236
    monitor-exit p0

    return-void

    :catchall_0
    move-exception v0

    monitor-exit p0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw v0
.end method
