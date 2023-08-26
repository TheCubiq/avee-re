.class Lcom/daaw/avee/comp/MediaControlsUI/MediaControlsUI$6;
.super Ljava/lang/Object;
.source "MediaControlsUI.java"

# interfaces
.implements Landroid/view/View$OnClickListener;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/daaw/avee/comp/MediaControlsUI/MediaControlsUI;->onCreateView(Landroid/view/View;Landroid/view/View;Landroid/view/View;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic this$0:Lcom/daaw/avee/comp/MediaControlsUI/MediaControlsUI;


# direct methods
.method constructor <init>(Lcom/daaw/avee/comp/MediaControlsUI/MediaControlsUI;)V
    .locals 0

    .line 219
    iput-object p1, p0, Lcom/daaw/avee/comp/MediaControlsUI/MediaControlsUI$6;->this$0:Lcom/daaw/avee/comp/MediaControlsUI/MediaControlsUI;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onClick(Landroid/view/View;)V
    .locals 3

    .line 222
    iget-object v0, p0, Lcom/daaw/avee/comp/MediaControlsUI/MediaControlsUI$6;->this$0:Lcom/daaw/avee/comp/MediaControlsUI/MediaControlsUI;

    invoke-static {v0}, Lcom/daaw/avee/comp/MediaControlsUI/MediaControlsUI;->access$800(Lcom/daaw/avee/comp/MediaControlsUI/MediaControlsUI;)Ljava/lang/ref/WeakReference;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/ref/WeakReference;->get()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/daaw/avee/comp/MediaControlsUI/ThreeDotPopupWindow;

    .line 223
    invoke-static {v0}, Lcom/daaw/avee/Common/UtilsUI;->dismissSafe(Landroid/widget/PopupWindow;)V

    .line 224
    iget-object v0, p0, Lcom/daaw/avee/comp/MediaControlsUI/MediaControlsUI$6;->this$0:Lcom/daaw/avee/comp/MediaControlsUI/MediaControlsUI;

    new-instance v1, Ljava/lang/ref/WeakReference;

    new-instance v2, Lcom/daaw/avee/comp/MediaControlsUI/ThreeDotPopupWindow;

    invoke-direct {v2, p1}, Lcom/daaw/avee/comp/MediaControlsUI/ThreeDotPopupWindow;-><init>(Landroid/view/View;)V

    invoke-direct {v1, v2}, Ljava/lang/ref/WeakReference;-><init>(Ljava/lang/Object;)V

    invoke-static {v0, v1}, Lcom/daaw/avee/comp/MediaControlsUI/MediaControlsUI;->access$802(Lcom/daaw/avee/comp/MediaControlsUI/MediaControlsUI;Ljava/lang/ref/WeakReference;)Ljava/lang/ref/WeakReference;

    return-void
.end method
