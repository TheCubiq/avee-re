.class final Lcom/daaw/avee/comp/playback/EventsPlaybackService$Receive$5;
.super Ljava/lang/Object;
.source "EventsPlaybackService.java"

# interfaces
.implements Lcom/daaw/avee/Common/Events/WeakDelegate1$Handler;


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
        "Lcom/daaw/avee/Common/Events/WeakDelegate1$Handler<",
        "Ljava/lang/Integer;",
        ">;"
    }
.end annotation


# direct methods
.method constructor <init>()V
    .locals 0

    .line 77
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public invoke(Ljava/lang/Integer;)V
    .locals 1

    .line 80
    invoke-virtual {p1}, Ljava/lang/Integer;->intValue()I

    move-result p1

    const/4 v0, 0x1

    if-eq p1, v0, :cond_3

    const/4 v0, 0x2

    if-eq p1, v0, :cond_2

    const/4 v0, 0x3

    if-eq p1, v0, :cond_1

    const/4 v0, 0x4

    if-eq p1, v0, :cond_0

    goto :goto_0

    :cond_0
    const-string p1, "TOGGLE_PAUSE_ACTION"

    .line 93
    invoke-static {p1}, Lcom/daaw/avee/comp/playback/EventsPlaybackService$Receive;->startService(Ljava/lang/String;)V

    goto :goto_0

    :cond_1
    const-string p1, "STOP_ACTION"

    .line 90
    invoke-static {p1}, Lcom/daaw/avee/comp/playback/EventsPlaybackService$Receive;->startService(Ljava/lang/String;)V

    goto :goto_0

    :cond_2
    const-string p1, "PAUSE_ACTION"

    .line 86
    invoke-static {p1}, Lcom/daaw/avee/comp/playback/EventsPlaybackService$Receive;->startService(Ljava/lang/String;)V

    goto :goto_0

    :cond_3
    const-string p1, "PLAY_ACTION"

    .line 82
    invoke-static {p1}, Lcom/daaw/avee/comp/playback/EventsPlaybackService$Receive;->startService(Ljava/lang/String;)V

    :goto_0
    return-void
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;)V
    .locals 0

    .line 77
    check-cast p1, Ljava/lang/Integer;

    invoke-virtual {p0, p1}, Lcom/daaw/avee/comp/playback/EventsPlaybackService$Receive$5;->invoke(Ljava/lang/Integer;)V

    return-void
.end method
