.class Lcom/daaw/avee/Design/PlayerControlsUIDesign$3;
.super Ljava/lang/Object;
.source "PlayerControlsUIDesign.java"

# interfaces
.implements Lcom/daaw/avee/Common/Events/WeakEvent$Handler;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/daaw/avee/Design/PlayerControlsUIDesign;-><init>()V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic this$0:Lcom/daaw/avee/Design/PlayerControlsUIDesign;


# direct methods
.method constructor <init>(Lcom/daaw/avee/Design/PlayerControlsUIDesign;)V
    .locals 0

    .line 49
    iput-object p1, p0, Lcom/daaw/avee/Design/PlayerControlsUIDesign$3;->this$0:Lcom/daaw/avee/Design/PlayerControlsUIDesign;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public invoke()V
    .locals 2

    .line 52
    sget-object v0, Lcom/daaw/avee/comp/playback/EventsPlaybackService$Receive;->onAction:Lcom/daaw/avee/Common/Events/WeakDelegate1;

    const/4 v1, 0x4

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/daaw/avee/Common/Events/WeakDelegate1;->invoke(Ljava/lang/Object;)V

    return-void
.end method
