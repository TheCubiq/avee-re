.class Lcom/daaw/avee/Design/PlaybackDesign$42;
.super Ljava/lang/Object;
.source "PlaybackDesign.java"

# interfaces
.implements Ljava/lang/Runnable;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/daaw/avee/Design/PlaybackDesign;->onPlaybackCompleted(Ljava/lang/Integer;Ljava/lang/Boolean;Ljava/lang/Long;ZLcom/daaw/avee/comp/playback/Song/PlaylistSong;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic this$0:Lcom/daaw/avee/Design/PlaybackDesign;

.field final synthetic val$atTime:Ljava/lang/Long;

.field final synthetic val$isErrorState:Z

.field final synthetic val$rptMode:Ljava/lang/Integer;

.field final synthetic val$songForErrorState:Lcom/daaw/avee/comp/playback/Song/PlaylistSong;


# direct methods
.method constructor <init>(Lcom/daaw/avee/Design/PlaybackDesign;ZLcom/daaw/avee/comp/playback/Song/PlaylistSong;Ljava/lang/Long;Ljava/lang/Integer;)V
    .locals 0

    .line 518
    iput-object p1, p0, Lcom/daaw/avee/Design/PlaybackDesign$42;->this$0:Lcom/daaw/avee/Design/PlaybackDesign;

    iput-boolean p2, p0, Lcom/daaw/avee/Design/PlaybackDesign$42;->val$isErrorState:Z

    iput-object p3, p0, Lcom/daaw/avee/Design/PlaybackDesign$42;->val$songForErrorState:Lcom/daaw/avee/comp/playback/Song/PlaylistSong;

    iput-object p4, p0, Lcom/daaw/avee/Design/PlaybackDesign$42;->val$atTime:Ljava/lang/Long;

    iput-object p5, p0, Lcom/daaw/avee/Design/PlaybackDesign$42;->val$rptMode:Ljava/lang/Integer;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public run()V
    .locals 2

    .line 522
    iget-boolean v0, p0, Lcom/daaw/avee/Design/PlaybackDesign$42;->val$isErrorState:Z

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/daaw/avee/Design/PlaybackDesign$42;->this$0:Lcom/daaw/avee/Design/PlaybackDesign;

    iget-object v0, v0, Lcom/daaw/avee/Design/PlaybackDesign;->stationsDesign:Lcom/daaw/avee/Design/StationsDesign;

    iget-object v1, p0, Lcom/daaw/avee/Design/PlaybackDesign$42;->val$songForErrorState:Lcom/daaw/avee/comp/playback/Song/PlaylistSong;

    invoke-virtual {v0, v1}, Lcom/daaw/avee/Design/StationsDesign;->trySwitchPlaybackEngine(Lcom/daaw/avee/comp/playback/Song/PlaylistSong;)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 523
    invoke-static {}, Lcom/daaw/avee/comp/PlaybackQueue/QueueCore;->createOrGetInstance()Lcom/daaw/avee/comp/PlaybackQueue/QueueCore;

    move-result-object v0

    if-eqz v0, :cond_4

    .line 525
    iget-object v1, p0, Lcom/daaw/avee/Design/PlaybackDesign$42;->val$atTime:Ljava/lang/Long;

    invoke-virtual {v0, v1}, Lcom/daaw/avee/comp/PlaybackQueue/QueueCore;->playCurrent(Ljava/lang/Object;)V

    goto :goto_0

    .line 526
    :cond_0
    iget-object v0, p0, Lcom/daaw/avee/Design/PlaybackDesign$42;->val$rptMode:Ljava/lang/Integer;

    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I

    move-result v0

    const/4 v1, 0x1

    if-ne v0, v1, :cond_1

    .line 527
    invoke-static {}, Lcom/daaw/avee/comp/PlaybackQueue/QueueCore;->createOrGetInstance()Lcom/daaw/avee/comp/PlaybackQueue/QueueCore;

    move-result-object v0

    if-eqz v0, :cond_4

    .line 529
    iget-object v1, p0, Lcom/daaw/avee/Design/PlaybackDesign$42;->val$atTime:Ljava/lang/Long;

    invoke-virtual {v0, v1}, Lcom/daaw/avee/comp/PlaybackQueue/QueueCore;->playCurrent(Ljava/lang/Object;)V

    goto :goto_0

    .line 531
    :cond_1
    iget-object v0, p0, Lcom/daaw/avee/Design/PlaybackDesign$42;->val$rptMode:Ljava/lang/Integer;

    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I

    move-result v0

    const/4 v1, 0x2

    if-ne v0, v1, :cond_3

    .line 532
    invoke-static {}, Lcom/daaw/avee/comp/PlaybackQueue/QueueCore;->createOrGetInstance()Lcom/daaw/avee/comp/PlaybackQueue/QueueCore;

    move-result-object v0

    if-eqz v0, :cond_4

    .line 534
    invoke-virtual {v0}, Lcom/daaw/avee/comp/PlaybackQueue/QueueCore;->isNextPlaylistEnd()Z

    move-result v1

    if-eqz v1, :cond_2

    .line 535
    iget-object v1, p0, Lcom/daaw/avee/Design/PlaybackDesign$42;->val$atTime:Ljava/lang/Long;

    invoke-virtual {v0, v1}, Lcom/daaw/avee/comp/PlaybackQueue/QueueCore;->playFirst(Ljava/lang/Object;)V

    goto :goto_0

    .line 537
    :cond_2
    iget-object v1, p0, Lcom/daaw/avee/Design/PlaybackDesign$42;->val$atTime:Ljava/lang/Long;

    invoke-virtual {v0, v1}, Lcom/daaw/avee/comp/PlaybackQueue/QueueCore;->next(Ljava/lang/Object;)V

    goto :goto_0

    .line 540
    :cond_3
    invoke-static {}, Lcom/daaw/avee/comp/PlaybackQueue/QueueCore;->createOrGetInstance()Lcom/daaw/avee/comp/PlaybackQueue/QueueCore;

    move-result-object v0

    if-eqz v0, :cond_4

    .line 542
    iget-object v1, p0, Lcom/daaw/avee/Design/PlaybackDesign$42;->val$atTime:Ljava/lang/Long;

    invoke-virtual {v0, v1}, Lcom/daaw/avee/comp/PlaybackQueue/QueueCore;->next(Ljava/lang/Object;)V

    :cond_4
    :goto_0
    return-void
.end method
