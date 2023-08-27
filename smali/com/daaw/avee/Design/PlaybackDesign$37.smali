.class Lcom/daaw/avee/Design/PlaybackDesign$37;
.super Ljava/lang/Object;
.source "PlaybackDesign.java"

# interfaces
.implements Lcom/daaw/avee/Common/Events/WeakEvent$Handler;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/daaw/avee/Design/PlaybackDesign;-><init>(Lcom/daaw/avee/Design/StationsDesign;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic this$0:Lcom/daaw/avee/Design/PlaybackDesign;


# direct methods
.method constructor <init>(Lcom/daaw/avee/Design/PlaybackDesign;)V
    .locals 0

    .line 441
    iput-object p1, p0, Lcom/daaw/avee/Design/PlaybackDesign$37;->this$0:Lcom/daaw/avee/Design/PlaybackDesign;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public invoke()V
    .locals 1

    .line 444
    sget-object v0, Lcom/daaw/avee/comp/playback/EventsPlaybackService$Receive;->onRequestCloseService:Lcom/daaw/avee/Common/Events/WeakDelegate;

    invoke-virtual {v0}, Lcom/daaw/avee/Common/Events/WeakDelegate;->invoke()V

    return-void
.end method
