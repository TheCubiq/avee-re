.class final Lcom/daaw/avee/comp/playback/EventsPlaybackService$Receive$11;
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
        "Landroid/view/SurfaceHolder;",
        ">;"
    }
.end annotation


# direct methods
.method constructor <init>()V
    .locals 0

    .line 139
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public invoke(Landroid/view/SurfaceHolder;)V
    .locals 1

    .line 142
    invoke-static {}, Lcom/daaw/avee/comp/playback/MediaPlaybackService;->getInstance()Lcom/daaw/avee/comp/playback/MediaPlaybackService;

    move-result-object v0

    if-eqz v0, :cond_0

    .line 144
    invoke-virtual {v0, p1}, Lcom/daaw/avee/comp/playback/MediaPlaybackService;->setVideoSurfaceHolderThSafe(Landroid/view/SurfaceHolder;)V

    :cond_0
    return-void
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;)V
    .locals 0

    .line 139
    check-cast p1, Landroid/view/SurfaceHolder;

    invoke-virtual {p0, p1}, Lcom/daaw/avee/comp/playback/EventsPlaybackService$Receive$11;->invoke(Landroid/view/SurfaceHolder;)V

    return-void
.end method
