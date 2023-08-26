.class final Lcom/daaw/avee/comp/playback/EventsPlaybackService$Receive$17;
.super Ljava/lang/Object;
.source "EventsPlaybackService.java"

# interfaces
.implements Lcom/daaw/avee/Common/Events/WeakDelegate$Handler;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/daaw/avee/comp/playback/EventsPlaybackService$Receive;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x8
    name = null
.end annotation


# direct methods
.method constructor <init>()V
    .locals 0

    .line 188
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public invoke()V
    .locals 1

    const-string v0, "TOGGLE_MUTE_ACTION"

    .line 191
    invoke-static {v0}, Lcom/daaw/avee/comp/playback/EventsPlaybackService$Receive;->startService(Ljava/lang/String;)V

    return-void
.end method
