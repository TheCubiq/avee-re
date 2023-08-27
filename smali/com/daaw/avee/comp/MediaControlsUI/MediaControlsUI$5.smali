.class Lcom/daaw/avee/comp/MediaControlsUI/MediaControlsUI$5;
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

    .line 206
    iput-object p1, p0, Lcom/daaw/avee/comp/MediaControlsUI/MediaControlsUI$5;->this$0:Lcom/daaw/avee/comp/MediaControlsUI/MediaControlsUI;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onClick(Landroid/view/View;)V
    .locals 4

    .line 209
    new-instance v0, Lcom/daaw/avee/ContextData;

    invoke-direct {v0, p1}, Lcom/daaw/avee/ContextData;-><init>(Landroid/view/View;)V

    .line 210
    invoke-virtual {v0}, Lcom/daaw/avee/ContextData;->getLayoutInflater()Landroid/view/LayoutInflater;

    move-result-object v0

    .line 212
    iget-object v1, p0, Lcom/daaw/avee/comp/MediaControlsUI/MediaControlsUI$5;->this$0:Lcom/daaw/avee/comp/MediaControlsUI/MediaControlsUI;

    invoke-static {v1}, Lcom/daaw/avee/comp/MediaControlsUI/MediaControlsUI;->access$700(Lcom/daaw/avee/comp/MediaControlsUI/MediaControlsUI;)Ljava/lang/ref/WeakReference;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/ref/WeakReference;->get()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lcom/daaw/avee/comp/MediaControlsUI/VolumePopupWindow;

    .line 213
    invoke-static {v1}, Lcom/daaw/avee/Common/UtilsUI;->dismissSafe(Landroid/widget/PopupWindow;)V

    .line 214
    iget-object v1, p0, Lcom/daaw/avee/comp/MediaControlsUI/MediaControlsUI$5;->this$0:Lcom/daaw/avee/comp/MediaControlsUI/MediaControlsUI;

    new-instance v2, Ljava/lang/ref/WeakReference;

    new-instance v3, Lcom/daaw/avee/comp/MediaControlsUI/VolumePopupWindow;

    invoke-direct {v3, v0, p1}, Lcom/daaw/avee/comp/MediaControlsUI/VolumePopupWindow;-><init>(Landroid/view/LayoutInflater;Landroid/view/View;)V

    invoke-direct {v2, v3}, Ljava/lang/ref/WeakReference;-><init>(Ljava/lang/Object;)V

    invoke-static {v1, v2}, Lcom/daaw/avee/comp/MediaControlsUI/MediaControlsUI;->access$702(Lcom/daaw/avee/comp/MediaControlsUI/MediaControlsUI;Ljava/lang/ref/WeakReference;)Ljava/lang/ref/WeakReference;

    return-void
.end method
