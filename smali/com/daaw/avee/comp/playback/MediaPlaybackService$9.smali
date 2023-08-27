.class Lcom/daaw/avee/comp/playback/MediaPlaybackService$9;
.super Ljava/lang/Object;
.source "MediaPlaybackService.java"

# interfaces
.implements Ljava/lang/Runnable;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/daaw/avee/comp/playback/MediaPlaybackService;->selectMediaPlayerCoreIndexThSafe(I)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic this$0:Lcom/daaw/avee/comp/playback/MediaPlaybackService;

.field final synthetic val$index:I


# direct methods
.method constructor <init>(Lcom/daaw/avee/comp/playback/MediaPlaybackService;I)V
    .locals 0

    .line 895
    iput-object p1, p0, Lcom/daaw/avee/comp/playback/MediaPlaybackService$9;->this$0:Lcom/daaw/avee/comp/playback/MediaPlaybackService;

    iput p2, p0, Lcom/daaw/avee/comp/playback/MediaPlaybackService$9;->val$index:I

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public run()V
    .locals 2

    .line 898
    iget-object v0, p0, Lcom/daaw/avee/comp/playback/MediaPlaybackService$9;->this$0:Lcom/daaw/avee/comp/playback/MediaPlaybackService;

    iget v1, p0, Lcom/daaw/avee/comp/playback/MediaPlaybackService$9;->val$index:I

    invoke-static {v0, v1}, Lcom/daaw/avee/comp/playback/MediaPlaybackService;->access$800(Lcom/daaw/avee/comp/playback/MediaPlaybackService;I)V

    return-void
.end method
