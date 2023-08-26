.class Lcom/daaw/avee/comp/playback/MediaPlaybackService$16;
.super Ljava/lang/Object;
.source "MediaPlaybackService.java"

# interfaces
.implements Ljava/lang/Runnable;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/daaw/avee/comp/playback/MediaPlaybackService;->setEqualizerSettingsThSafe(Lcom/daaw/avee/comp/playback/BaseEqualizerEffect$EqualizerSettings;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic this$0:Lcom/daaw/avee/comp/playback/MediaPlaybackService;

.field final synthetic val$equalizerSettings:Lcom/daaw/avee/comp/playback/BaseEqualizerEffect$EqualizerSettings;


# direct methods
.method constructor <init>(Lcom/daaw/avee/comp/playback/MediaPlaybackService;Lcom/daaw/avee/comp/playback/BaseEqualizerEffect$EqualizerSettings;)V
    .locals 0

    .line 1375
    iput-object p1, p0, Lcom/daaw/avee/comp/playback/MediaPlaybackService$16;->this$0:Lcom/daaw/avee/comp/playback/MediaPlaybackService;

    iput-object p2, p0, Lcom/daaw/avee/comp/playback/MediaPlaybackService$16;->val$equalizerSettings:Lcom/daaw/avee/comp/playback/BaseEqualizerEffect$EqualizerSettings;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public run()V
    .locals 2

    .line 1378
    iget-object v0, p0, Lcom/daaw/avee/comp/playback/MediaPlaybackService$16;->this$0:Lcom/daaw/avee/comp/playback/MediaPlaybackService;

    iget-object v1, p0, Lcom/daaw/avee/comp/playback/MediaPlaybackService$16;->val$equalizerSettings:Lcom/daaw/avee/comp/playback/BaseEqualizerEffect$EqualizerSettings;

    invoke-static {v0, v1}, Lcom/daaw/avee/comp/playback/MediaPlaybackService;->access$1500(Lcom/daaw/avee/comp/playback/MediaPlaybackService;Lcom/daaw/avee/comp/playback/BaseEqualizerEffect$EqualizerSettings;)V

    return-void
.end method
