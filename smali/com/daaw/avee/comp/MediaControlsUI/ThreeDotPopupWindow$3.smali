.class Lcom/daaw/avee/comp/MediaControlsUI/ThreeDotPopupWindow$3;
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

    .line 74
    iput-object p1, p0, Lcom/daaw/avee/comp/MediaControlsUI/ThreeDotPopupWindow$3;->this$0:Lcom/daaw/avee/comp/MediaControlsUI/ThreeDotPopupWindow;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onClick(Landroid/view/View;)V
    .locals 1

    .line 78
    sget-object p1, Lcom/daaw/avee/comp/MediaControlsUI/MediaControlsUI;->onSelectMusicSysAction:Lcom/daaw/avee/Common/Events/WeakEvent1;

    const/4 v0, 0x1

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    invoke-virtual {p1, v0}, Lcom/daaw/avee/Common/Events/WeakEvent1;->invoke(Ljava/lang/Object;)V

    return-void
.end method
