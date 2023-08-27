.class Lcom/daaw/avee/Design/PlayerControlsUIDesign$10;
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
        "Ljava/lang/Boolean;",
        ">;"
    }
.end annotation


# instance fields
.field final synthetic this$0:Lcom/daaw/avee/Design/PlayerControlsUIDesign;


# direct methods
.method constructor <init>(Lcom/daaw/avee/Design/PlayerControlsUIDesign;)V
    .locals 0

    .line 118
    iput-object p1, p0, Lcom/daaw/avee/Design/PlayerControlsUIDesign$10;->this$0:Lcom/daaw/avee/Design/PlayerControlsUIDesign;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public invoke(Ljava/lang/Boolean;)V
    .locals 2

    .line 122
    invoke-static {}, Lcom/daaw/avee/comp/MediaControlsUI/MediaControlsUI;->getInstance()Lcom/daaw/avee/comp/MediaControlsUI/MediaControlsUI;

    move-result-object v0

    .line 124
    invoke-virtual {p1}, Ljava/lang/Boolean;->booleanValue()Z

    move-result p1

    if-nez p1, :cond_2

    .line 126
    invoke-static {}, Lcom/daaw/avee/MainActivity;->getInstance()Lcom/daaw/avee/MainActivity;

    move-result-object p1

    const/4 v1, 0x1

    if-eqz p1, :cond_0

    .line 129
    iget p1, p1, Lcom/daaw/avee/MainActivity;->currentFragmentPage:I

    goto :goto_0

    :cond_0
    const/4 p1, 0x1

    :goto_0
    if-nez p1, :cond_1

    if-eqz v0, :cond_3

    .line 132
    invoke-virtual {v0, v1}, Lcom/daaw/avee/comp/MediaControlsUI/MediaControlsUI;->animateShow(I)V

    goto :goto_1

    :cond_1
    if-eqz v0, :cond_3

    const/4 p1, 0x2

    .line 134
    invoke-virtual {v0, p1}, Lcom/daaw/avee/comp/MediaControlsUI/MediaControlsUI;->animateShow(I)V

    goto :goto_1

    :cond_2
    if-eqz v0, :cond_3

    const/4 p1, 0x0

    .line 138
    invoke-virtual {v0, p1}, Lcom/daaw/avee/comp/MediaControlsUI/MediaControlsUI;->animateShow(I)V

    :cond_3
    :goto_1
    return-void
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;)V
    .locals 0

    .line 118
    check-cast p1, Ljava/lang/Boolean;

    invoke-virtual {p0, p1}, Lcom/daaw/avee/Design/PlayerControlsUIDesign$10;->invoke(Ljava/lang/Boolean;)V

    return-void
.end method
