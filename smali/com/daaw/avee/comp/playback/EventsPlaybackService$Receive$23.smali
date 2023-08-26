.class final Lcom/daaw/avee/comp/playback/EventsPlaybackService$Receive$23;
.super Ljava/lang/Object;
.source "EventsPlaybackService.java"

# interfaces
.implements Lcom/daaw/avee/Common/Events/WeakDelegateR$Handler;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/daaw/avee/comp/playback/EventsPlaybackService$Receive;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x8
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Lcom/daaw/avee/Common/Events/WeakDelegateR$Handler<",
        "Lcom/daaw/avee/comp/playback/BaseEqualizerEffect$EqualizerDesc;",
        ">;"
    }
.end annotation


# direct methods
.method constructor <init>()V
    .locals 0

    .line 237
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public invoke()Lcom/daaw/avee/comp/playback/BaseEqualizerEffect$EqualizerDesc;
    .locals 1

    .line 240
    invoke-static {}, Lcom/daaw/avee/comp/playback/MediaPlaybackService;->getInstance()Lcom/daaw/avee/comp/playback/MediaPlaybackService;

    move-result-object v0

    if-eqz v0, :cond_0

    .line 242
    invoke-virtual {v0}, Lcom/daaw/avee/comp/playback/MediaPlaybackService;->getEqualizerDescThSafe()Lcom/daaw/avee/comp/playback/BaseEqualizerEffect$EqualizerDesc;

    move-result-object v0

    return-object v0

    :cond_0
    const/4 v0, 0x0

    return-object v0
.end method

.method public bridge synthetic invoke()Ljava/lang/Object;
    .locals 1

    .line 237
    invoke-virtual {p0}, Lcom/daaw/avee/comp/playback/EventsPlaybackService$Receive$23;->invoke()Lcom/daaw/avee/comp/playback/BaseEqualizerEffect$EqualizerDesc;

    move-result-object v0

    return-object v0
.end method
