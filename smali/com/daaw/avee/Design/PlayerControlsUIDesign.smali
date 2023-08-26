.class public Lcom/daaw/avee/Design/PlayerControlsUIDesign;
.super Ljava/lang/Object;
.source "PlayerControlsUIDesign.java"


# instance fields
.field private listenerRefHolder:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Ljava/lang/Object;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>()V
    .locals 3

    .line 29
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 27
    new-instance v0, Ljava/util/LinkedList;

    invoke-direct {v0}, Ljava/util/LinkedList;-><init>()V

    iput-object v0, p0, Lcom/daaw/avee/Design/PlayerControlsUIDesign;->listenerRefHolder:Ljava/util/List;

    .line 31
    sget-object v0, Lcom/daaw/avee/comp/MediaControlsUI/MediaControlsUI;->onPlaybackPrev:Lcom/daaw/avee/Common/Events/WeakEvent;

    new-instance v1, Lcom/daaw/avee/Design/PlayerControlsUIDesign$1;

    invoke-direct {v1, p0}, Lcom/daaw/avee/Design/PlayerControlsUIDesign$1;-><init>(Lcom/daaw/avee/Design/PlayerControlsUIDesign;)V

    iget-object v2, p0, Lcom/daaw/avee/Design/PlayerControlsUIDesign;->listenerRefHolder:Ljava/util/List;

    invoke-virtual {v0, v1, v2}, Lcom/daaw/avee/Common/Events/WeakEvent;->subscribeWeak(Lcom/daaw/avee/Common/Events/WeakEvent$Handler;Ljava/util/List;)V

    .line 40
    sget-object v0, Lcom/daaw/avee/comp/MediaControlsUI/MediaControlsUI;->onPlaybackNext:Lcom/daaw/avee/Common/Events/WeakEvent;

    new-instance v1, Lcom/daaw/avee/Design/PlayerControlsUIDesign$2;

    invoke-direct {v1, p0}, Lcom/daaw/avee/Design/PlayerControlsUIDesign$2;-><init>(Lcom/daaw/avee/Design/PlayerControlsUIDesign;)V

    iget-object v2, p0, Lcom/daaw/avee/Design/PlayerControlsUIDesign;->listenerRefHolder:Ljava/util/List;

    invoke-virtual {v0, v1, v2}, Lcom/daaw/avee/Common/Events/WeakEvent;->subscribeWeak(Lcom/daaw/avee/Common/Events/WeakEvent$Handler;Ljava/util/List;)V

    .line 49
    sget-object v0, Lcom/daaw/avee/comp/MediaControlsUI/MediaControlsUI;->onPlaybackTogglePause:Lcom/daaw/avee/Common/Events/WeakEvent;

    new-instance v1, Lcom/daaw/avee/Design/PlayerControlsUIDesign$3;

    invoke-direct {v1, p0}, Lcom/daaw/avee/Design/PlayerControlsUIDesign$3;-><init>(Lcom/daaw/avee/Design/PlayerControlsUIDesign;)V

    iget-object v2, p0, Lcom/daaw/avee/Design/PlayerControlsUIDesign;->listenerRefHolder:Ljava/util/List;

    invoke-virtual {v0, v1, v2}, Lcom/daaw/avee/Common/Events/WeakEvent;->subscribeWeak(Lcom/daaw/avee/Common/Events/WeakEvent$Handler;Ljava/util/List;)V

    .line 56
    sget-object v0, Lcom/daaw/avee/comp/MediaControlsUI/MediaControlsUI;->onRequestTrackPosition:Lcom/daaw/avee/Common/Events/WeakEventR;

    new-instance v1, Lcom/daaw/avee/Design/PlayerControlsUIDesign$4;

    invoke-direct {v1, p0}, Lcom/daaw/avee/Design/PlayerControlsUIDesign$4;-><init>(Lcom/daaw/avee/Design/PlayerControlsUIDesign;)V

    iget-object v2, p0, Lcom/daaw/avee/Design/PlayerControlsUIDesign;->listenerRefHolder:Ljava/util/List;

    invoke-virtual {v0, v1, v2}, Lcom/daaw/avee/Common/Events/WeakEventR;->subscribeWeak(Lcom/daaw/avee/Common/Events/WeakEventR$Handler;Ljava/util/List;)V

    .line 63
    sget-object v0, Lcom/daaw/avee/comp/MediaControlsUI/MediaControlsUI;->onSetTrackPosition:Lcom/daaw/avee/Common/Events/WeakEvent1;

    new-instance v1, Lcom/daaw/avee/Design/PlayerControlsUIDesign$5;

    invoke-direct {v1, p0}, Lcom/daaw/avee/Design/PlayerControlsUIDesign$5;-><init>(Lcom/daaw/avee/Design/PlayerControlsUIDesign;)V

    iget-object v2, p0, Lcom/daaw/avee/Design/PlayerControlsUIDesign;->listenerRefHolder:Ljava/util/List;

    invoke-virtual {v0, v1, v2}, Lcom/daaw/avee/Common/Events/WeakEvent1;->subscribeWeak(Lcom/daaw/avee/Common/Events/WeakEvent1$Handler;Ljava/util/List;)V

    .line 70
    sget-object v0, Lcom/daaw/avee/comp/MediaControlsUI/MediaControlsUI;->onRequestShowState:Lcom/daaw/avee/Common/Events/WeakEventR;

    new-instance v1, Lcom/daaw/avee/Design/PlayerControlsUIDesign$6;

    invoke-direct {v1, p0}, Lcom/daaw/avee/Design/PlayerControlsUIDesign$6;-><init>(Lcom/daaw/avee/Design/PlayerControlsUIDesign;)V

    iget-object v2, p0, Lcom/daaw/avee/Design/PlayerControlsUIDesign;->listenerRefHolder:Ljava/util/List;

    invoke-virtual {v0, v1, v2}, Lcom/daaw/avee/Common/Events/WeakEventR;->subscribeWeak(Lcom/daaw/avee/Common/Events/WeakEventR$Handler;Ljava/util/List;)V

    .line 84
    sget-object v0, Lcom/daaw/avee/comp/MediaControlsUI/MediaControlsUI;->onRequestShuffleMode:Lcom/daaw/avee/Common/Events/WeakEventR;

    new-instance v1, Lcom/daaw/avee/Design/PlayerControlsUIDesign$7;

    invoke-direct {v1, p0}, Lcom/daaw/avee/Design/PlayerControlsUIDesign$7;-><init>(Lcom/daaw/avee/Design/PlayerControlsUIDesign;)V

    iget-object v2, p0, Lcom/daaw/avee/Design/PlayerControlsUIDesign;->listenerRefHolder:Ljava/util/List;

    invoke-virtual {v0, v1, v2}, Lcom/daaw/avee/Common/Events/WeakEventR;->subscribeWeak(Lcom/daaw/avee/Common/Events/WeakEventR$Handler;Ljava/util/List;)V

    .line 94
    sget-object v0, Lcom/daaw/avee/comp/MediaControlsUI/MediaControlsUI;->onSetShuffleMode:Lcom/daaw/avee/Common/Events/WeakEvent1;

    new-instance v1, Lcom/daaw/avee/Design/PlayerControlsUIDesign$8;

    invoke-direct {v1, p0}, Lcom/daaw/avee/Design/PlayerControlsUIDesign$8;-><init>(Lcom/daaw/avee/Design/PlayerControlsUIDesign;)V

    iget-object v2, p0, Lcom/daaw/avee/Design/PlayerControlsUIDesign;->listenerRefHolder:Ljava/util/List;

    invoke-virtual {v0, v1, v2}, Lcom/daaw/avee/Common/Events/WeakEvent1;->subscribeWeak(Lcom/daaw/avee/Common/Events/WeakEvent1$Handler;Ljava/util/List;)V

    .line 104
    sget-object v0, Lcom/daaw/avee/comp/PlaybackQueue/QueueCore;->onShuffleModeChanged:Lcom/daaw/avee/Common/Events/WeakEvent1;

    new-instance v1, Lcom/daaw/avee/Design/PlayerControlsUIDesign$9;

    invoke-direct {v1, p0}, Lcom/daaw/avee/Design/PlayerControlsUIDesign$9;-><init>(Lcom/daaw/avee/Design/PlayerControlsUIDesign;)V

    iget-object v2, p0, Lcom/daaw/avee/Design/PlayerControlsUIDesign;->listenerRefHolder:Ljava/util/List;

    invoke-virtual {v0, v1, v2}, Lcom/daaw/avee/Common/Events/WeakEvent1;->subscribeWeak(Lcom/daaw/avee/Common/Events/WeakEvent1$Handler;Ljava/util/List;)V

    .line 118
    sget-object v0, Lcom/daaw/avee/MainActivity;->onFullscreenChanged:Lcom/daaw/avee/Common/Events/WeakEvent1;

    new-instance v1, Lcom/daaw/avee/Design/PlayerControlsUIDesign$10;

    invoke-direct {v1, p0}, Lcom/daaw/avee/Design/PlayerControlsUIDesign$10;-><init>(Lcom/daaw/avee/Design/PlayerControlsUIDesign;)V

    iget-object v2, p0, Lcom/daaw/avee/Design/PlayerControlsUIDesign;->listenerRefHolder:Ljava/util/List;

    invoke-virtual {v0, v1, v2}, Lcom/daaw/avee/Common/Events/WeakEvent1;->subscribeWeak(Lcom/daaw/avee/Common/Events/WeakEvent1$Handler;Ljava/util/List;)V

    .line 145
    sget-object v0, Lcom/daaw/avee/MainActivity;->onCreateView:Lcom/daaw/avee/Common/Events/WeakEvent3;

    new-instance v1, Lcom/daaw/avee/Design/PlayerControlsUIDesign$11;

    invoke-direct {v1, p0}, Lcom/daaw/avee/Design/PlayerControlsUIDesign$11;-><init>(Lcom/daaw/avee/Design/PlayerControlsUIDesign;)V

    iget-object v2, p0, Lcom/daaw/avee/Design/PlayerControlsUIDesign;->listenerRefHolder:Ljava/util/List;

    invoke-virtual {v0, v1, v2}, Lcom/daaw/avee/Common/Events/WeakEvent3;->subscribeWeak(Lcom/daaw/avee/Common/Events/WeakEvent3$Handler;Ljava/util/List;)V

    return-void
.end method


# virtual methods
.method getPlayerControlsShowState(ZI)I
    .locals 2

    .line 161
    invoke-static {}, Lcom/daaw/avee/PlayerCore;->s()Lcom/daaw/avee/PlayerCore;

    move-result-object v0

    invoke-virtual {v0}, Lcom/daaw/avee/PlayerCore;->getAppContext()Landroid/content/Context;

    move-result-object v0

    const/4 v1, 0x2

    if-nez v0, :cond_0

    return v1

    :cond_0
    if-eqz p1, :cond_2

    if-nez p2, :cond_1

    const/4 p1, 0x1

    return p1

    :cond_1
    return v1

    :cond_2
    const/4 p1, 0x0

    return p1
.end method
