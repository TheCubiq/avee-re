.class Lcom/daaw/avee/comp/playback/MediaPlaybackService$2;
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

    .line 140
    iput-object p1, p0, Lcom/daaw/avee/comp/playback/MediaPlaybackService$2;->this$0:Lcom/daaw/avee/comp/playback/MediaPlaybackService;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public run()V
    .locals 3

    .line 143
    iget-object v0, p0, Lcom/daaw/avee/comp/playback/MediaPlaybackService$2;->this$0:Lcom/daaw/avee/comp/playback/MediaPlaybackService;

    invoke-virtual {v0}, Lcom/daaw/avee/comp/playback/MediaPlaybackService;->positionSafe()J

    move-result-wide v0

    .line 144
    sget-object v2, Lcom/daaw/avee/comp/playback/MediaPlaybackService;->onTrackPositionChanged:Lcom/daaw/avee/Common/Events/WeakEvent1;

    invoke-static {v0, v1}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v0

    invoke-virtual {v2, v0}, Lcom/daaw/avee/Common/Events/WeakEvent1;->invoke(Ljava/lang/Object;)V

    .line 145
    iget-object v0, p0, Lcom/daaw/avee/comp/playback/MediaPlaybackService$2;->this$0:Lcom/daaw/avee/comp/playback/MediaPlaybackService;

    const-wide/16 v1, 0x64

    invoke-static {v0, v1, v2}, Lcom/daaw/avee/comp/playback/MediaPlaybackService;->access$100(Lcom/daaw/avee/comp/playback/MediaPlaybackService;J)V

    return-void
.end method
