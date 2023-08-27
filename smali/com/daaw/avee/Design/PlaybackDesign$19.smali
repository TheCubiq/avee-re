.class Lcom/daaw/avee/Design/PlaybackDesign$19;
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
        "Lcom/daaw/avee/ContextData;",
        ">;"
    }
.end annotation


# instance fields
.field final synthetic this$0:Lcom/daaw/avee/Design/PlaybackDesign;


# direct methods
.method constructor <init>(Lcom/daaw/avee/Design/PlaybackDesign;)V
    .locals 0

    .line 310
    iput-object p1, p0, Lcom/daaw/avee/Design/PlaybackDesign$19;->this$0:Lcom/daaw/avee/Design/PlaybackDesign;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public invoke(Lcom/daaw/avee/ContextData;)V
    .locals 2

    .line 314
    sget-object v0, Lcom/daaw/avee/comp/playback/ExoMediaPlayer/ExoMediaPlayerCore$Receive;->showTrackSelection:Lcom/daaw/avee/Common/Events/WeakDelegate2;

    invoke-virtual {p1}, Lcom/daaw/avee/ContextData;->getActivity()Landroid/app/Activity;

    move-result-object p1

    const-string v1, "Select track"

    invoke-virtual {v0, p1, v1}, Lcom/daaw/avee/Common/Events/WeakDelegate2;->invoke(Ljava/lang/Object;Ljava/lang/Object;)V

    return-void
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;)V
    .locals 0

    .line 310
    check-cast p1, Lcom/daaw/avee/ContextData;

    invoke-virtual {p0, p1}, Lcom/daaw/avee/Design/PlaybackDesign$19;->invoke(Lcom/daaw/avee/ContextData;)V

    return-void
.end method
