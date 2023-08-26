.class Lcom/daaw/avee/Design/PlaybackDesign$43;
.super Ljava/lang/Object;
.source "PlaybackDesign.java"

# interfaces
.implements Ljava/lang/Runnable;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/daaw/avee/Design/PlaybackDesign;->onPlayStateChanged(Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/Integer;Ljava/lang/String;Lcom/daaw/avee/comp/playback/Song/PlaylistSong;Z)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic this$0:Lcom/daaw/avee/Design/PlaybackDesign;

.field final synthetic val$errorMsg:Ljava/lang/String;

.field final synthetic val$forceScreenOn:Z

.field final synthetic val$isPlaying:Ljava/lang/Boolean;

.field final synthetic val$wantsPlaying:Ljava/lang/Boolean;


# direct methods
.method constructor <init>(Lcom/daaw/avee/Design/PlaybackDesign;Ljava/lang/String;Ljava/lang/Boolean;Ljava/lang/Boolean;Z)V
    .locals 0

    .line 590
    iput-object p1, p0, Lcom/daaw/avee/Design/PlaybackDesign$43;->this$0:Lcom/daaw/avee/Design/PlaybackDesign;

    iput-object p2, p0, Lcom/daaw/avee/Design/PlaybackDesign$43;->val$errorMsg:Ljava/lang/String;

    iput-object p3, p0, Lcom/daaw/avee/Design/PlaybackDesign$43;->val$isPlaying:Ljava/lang/Boolean;

    iput-object p4, p0, Lcom/daaw/avee/Design/PlaybackDesign$43;->val$wantsPlaying:Ljava/lang/Boolean;

    iput-boolean p5, p0, Lcom/daaw/avee/Design/PlaybackDesign$43;->val$forceScreenOn:Z

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public run()V
    .locals 3

    .line 596
    iget-object v0, p0, Lcom/daaw/avee/Design/PlaybackDesign$43;->val$errorMsg:Ljava/lang/String;

    if-eqz v0, :cond_0

    invoke-virtual {v0}, Ljava/lang/String;->length()I

    move-result v0

    if-lez v0, :cond_0

    .line 597
    sget-object v0, Lcom/daaw/avee/EventsGlobal/EventsGlobalTextNotifier;->onTextMsg:Lcom/daaw/avee/Common/Events/WeakEvent1;

    iget-object v1, p0, Lcom/daaw/avee/Design/PlaybackDesign$43;->val$errorMsg:Ljava/lang/String;

    invoke-virtual {v0, v1}, Lcom/daaw/avee/Common/Events/WeakEvent1;->invoke(Ljava/lang/Object;)V

    .line 601
    :cond_0
    invoke-static {}, Lcom/daaw/avee/comp/MediaControlsUI/MediaControlsUI;->getInstance()Lcom/daaw/avee/comp/MediaControlsUI/MediaControlsUI;

    move-result-object v0

    if-eqz v0, :cond_1

    .line 603
    iget-object v1, p0, Lcom/daaw/avee/Design/PlaybackDesign$43;->val$isPlaying:Ljava/lang/Boolean;

    invoke-virtual {v1}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v1

    iget-object v2, p0, Lcom/daaw/avee/Design/PlaybackDesign$43;->val$wantsPlaying:Ljava/lang/Boolean;

    invoke-virtual {v2}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v2

    invoke-virtual {v0, v1, v2}, Lcom/daaw/avee/comp/MediaControlsUI/MediaControlsUI;->updatePlaystate(ZZ)V

    .line 605
    :cond_1
    invoke-static {}, Lcom/daaw/avee/MainActivity;->getInstance()Lcom/daaw/avee/MainActivity;

    move-result-object v0

    if-eqz v0, :cond_4

    .line 607
    iget-boolean v1, p0, Lcom/daaw/avee/Design/PlaybackDesign$43;->val$forceScreenOn:Z

    if-nez v1, :cond_3

    iget v1, v0, Lcom/daaw/avee/MainActivity;->currentFragmentPage:I

    const/4 v2, 0x2

    if-ne v1, v2, :cond_2

    iget-object v1, p0, Lcom/daaw/avee/Design/PlaybackDesign$43;->val$isPlaying:Ljava/lang/Boolean;

    invoke-virtual {v1}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v1

    if-eqz v1, :cond_2

    goto :goto_0

    :cond_2
    const/4 v1, 0x0

    goto :goto_1

    :cond_3
    :goto_0
    const/4 v1, 0x1

    :goto_1
    iget-boolean v2, p0, Lcom/daaw/avee/Design/PlaybackDesign$43;->val$forceScreenOn:Z

    invoke-virtual {v0, v1, v2}, Lcom/daaw/avee/MainActivity;->setKeepScreenOnLock(ZZ)V

    :cond_4
    return-void
.end method
