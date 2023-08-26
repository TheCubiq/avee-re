.class Lcom/daaw/avee/Design/PlayerControlsUIDesign$9;
.super Ljava/lang/Object;
.source "PlayerControlsUIDesign.java"

# interfaces
.implements Lcom/daaw/avee/Common/Events/WeakEvent1$Handler;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/daaw/avee/Design/PlayerControlsUIDesign;-><init>()V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Lcom/daaw/avee/Common/Events/WeakEvent1$Handler<",
        "Ljava/lang/Integer;",
        ">;"
    }
.end annotation


# instance fields
.field final synthetic this$0:Lcom/daaw/avee/Design/PlayerControlsUIDesign;


# direct methods
.method constructor <init>(Lcom/daaw/avee/Design/PlayerControlsUIDesign;)V
    .locals 0

    .line 104
    iput-object p1, p0, Lcom/daaw/avee/Design/PlayerControlsUIDesign$9;->this$0:Lcom/daaw/avee/Design/PlayerControlsUIDesign;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public invoke(Ljava/lang/Integer;)V
    .locals 2

    .line 108
    invoke-static {}, Lcom/daaw/avee/comp/MediaControlsUI/MediaControlsUI;->getInstance()Lcom/daaw/avee/comp/MediaControlsUI/MediaControlsUI;

    move-result-object v0

    if-eqz v0, :cond_0

    .line 110
    invoke-virtual {p1}, Ljava/lang/Integer;->intValue()I

    move-result v1

    invoke-virtual {v0, v1}, Lcom/daaw/avee/comp/MediaControlsUI/MediaControlsUI;->onShuffleModeChanged(I)V

    .line 112
    :cond_0
    invoke-virtual {p1}, Ljava/lang/Integer;->intValue()I

    move-result p1

    invoke-static {p1}, Lcom/daaw/avee/comp/LibraryQueueUI/LibraryQueueFragmentBase;->onShuffleModeChanged(I)V

    return-void
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;)V
    .locals 0

    .line 104
    check-cast p1, Ljava/lang/Integer;

    invoke-virtual {p0, p1}, Lcom/daaw/avee/Design/PlayerControlsUIDesign$9;->invoke(Ljava/lang/Integer;)V

    return-void
.end method
