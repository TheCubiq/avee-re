.class Lcom/daaw/avee/Design/PlaybackDesign$1;
.super Ljava/lang/Object;
.source "PlaybackDesign.java"

# interfaces
.implements Lcom/daaw/avee/Common/Events/WeakEvent1$Handler;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/daaw/avee/Design/PlaybackDesign;-><init>(Lcom/daaw/avee/Design/StationsDesign;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Lcom/daaw/avee/Common/Events/WeakEvent1$Handler<",
        "Landroid/app/Activity;",
        ">;"
    }
.end annotation


# instance fields
.field final synthetic this$0:Lcom/daaw/avee/Design/PlaybackDesign;


# direct methods
.method constructor <init>(Lcom/daaw/avee/Design/PlaybackDesign;)V
    .locals 0

    .line 69
    iput-object p1, p0, Lcom/daaw/avee/Design/PlaybackDesign$1;->this$0:Lcom/daaw/avee/Design/PlaybackDesign;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public invoke(Landroid/app/Activity;)V
    .locals 1

    .line 72
    invoke-static {}, Lcom/daaw/avee/comp/PlaybackQueue/QueueCore;->createOrGetInstance()Lcom/daaw/avee/comp/PlaybackQueue/QueueCore;

    move-result-object v0

    if-eqz v0, :cond_0

    .line 74
    invoke-virtual {v0, p1}, Lcom/daaw/avee/comp/PlaybackQueue/QueueCore;->onDataSaveTime(Landroid/content/Context;)V

    .line 76
    :cond_0
    sget-object p1, Lcom/daaw/avee/comp/playback/EventsPlaybackService$Receive;->savePreferences:Lcom/daaw/avee/Common/Events/WeakDelegate;

    invoke-virtual {p1}, Lcom/daaw/avee/Common/Events/WeakDelegate;->invoke()V

    return-void
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;)V
    .locals 0

    .line 69
    check-cast p1, Landroid/app/Activity;

    invoke-virtual {p0, p1}, Lcom/daaw/avee/Design/PlaybackDesign$1;->invoke(Landroid/app/Activity;)V

    return-void
.end method
