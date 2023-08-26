.class final Lcom/daaw/avee/comp/playback/EventsPlaybackService$Receive$1;
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

    .line 36
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public invoke()V
    .locals 1

    .line 39
    invoke-static {}, Lcom/daaw/avee/comp/playback/MediaPlaybackService;->getInstance()Lcom/daaw/avee/comp/playback/MediaPlaybackService;

    move-result-object v0

    if-eqz v0, :cond_0

    .line 41
    invoke-virtual {v0}, Lcom/daaw/avee/comp/playback/MediaPlaybackService;->savePreferencesThSafe()V

    :cond_0
    return-void
.end method
