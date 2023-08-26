.class Lcom/daaw/avee/comp/MediaControlsUI/ThreeDotPopupWindow$7;
.super Ljava/lang/Object;
.source "ThreeDotPopupWindow.java"

# interfaces
.implements Landroid/view/View$OnClickListener;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/daaw/avee/comp/MediaControlsUI/ThreeDotPopupWindow;-><init>(Landroid/view/View;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic this$0:Lcom/daaw/avee/comp/MediaControlsUI/ThreeDotPopupWindow;


# direct methods
.method constructor <init>(Lcom/daaw/avee/comp/MediaControlsUI/ThreeDotPopupWindow;)V
    .locals 0

    .line 132
    iput-object p1, p0, Lcom/daaw/avee/comp/MediaControlsUI/ThreeDotPopupWindow$7;->this$0:Lcom/daaw/avee/comp/MediaControlsUI/ThreeDotPopupWindow;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onClick(Landroid/view/View;)V
    .locals 2

    .line 135
    sget-object p1, Lcom/daaw/avee/comp/MediaControlsUI/MediaControlsUI;->onRequestRepeatMode:Lcom/daaw/avee/Common/Events/WeakEventR;

    const/4 v0, 0x0

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    invoke-virtual {p1, v1}, Lcom/daaw/avee/Common/Events/WeakEventR;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ljava/lang/Integer;

    invoke-virtual {p1}, Ljava/lang/Integer;->intValue()I

    move-result p1

    const/4 v1, 0x2

    if-eq p1, v1, :cond_0

    const/4 v0, 0x2

    .line 142
    :cond_0
    sget-object p1, Lcom/daaw/avee/comp/MediaControlsUI/MediaControlsUI;->onSetRepeatMode:Lcom/daaw/avee/Common/Events/WeakEvent1;

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    invoke-virtual {p1, v0}, Lcom/daaw/avee/Common/Events/WeakEvent1;->invoke(Ljava/lang/Object;)V

    return-void
.end method
