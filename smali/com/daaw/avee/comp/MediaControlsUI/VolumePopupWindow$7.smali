.class Lcom/daaw/avee/comp/MediaControlsUI/VolumePopupWindow$7;
.super Ljava/lang/Object;
.source "VolumePopupWindow.java"

# interfaces
.implements Landroid/view/View$OnClickListener;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/daaw/avee/comp/MediaControlsUI/VolumePopupWindow;-><init>(Landroid/view/LayoutInflater;Landroid/view/View;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic this$0:Lcom/daaw/avee/comp/MediaControlsUI/VolumePopupWindow;


# direct methods
.method constructor <init>(Lcom/daaw/avee/comp/MediaControlsUI/VolumePopupWindow;)V
    .locals 0

    .line 183
    iput-object p1, p0, Lcom/daaw/avee/comp/MediaControlsUI/VolumePopupWindow$7;->this$0:Lcom/daaw/avee/comp/MediaControlsUI/VolumePopupWindow;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onClick(Landroid/view/View;)V
    .locals 4

    .line 186
    iget-object v0, p0, Lcom/daaw/avee/comp/MediaControlsUI/VolumePopupWindow$7;->this$0:Lcom/daaw/avee/comp/MediaControlsUI/VolumePopupWindow;

    invoke-static {v0}, Lcom/daaw/avee/comp/MediaControlsUI/VolumePopupWindow;->access$000(Lcom/daaw/avee/comp/MediaControlsUI/VolumePopupWindow;)Landroid/os/Handler;

    move-result-object v0

    const/4 v1, 0x0

    const-wide/16 v2, 0x384

    invoke-virtual {v0, v1, v2, v3}, Landroid/os/Handler;->sendEmptyMessageDelayed(IJ)Z

    .line 187
    sget-object v0, Lcom/daaw/avee/comp/MediaControlsUI/MediaControlsUI;->onActionEq:Lcom/daaw/avee/Common/Events/WeakEvent1;

    new-instance v1, Lcom/daaw/avee/ContextData;

    invoke-direct {v1, p1}, Lcom/daaw/avee/ContextData;-><init>(Landroid/view/View;)V

    invoke-virtual {v0, v1}, Lcom/daaw/avee/Common/Events/WeakEvent1;->invoke(Ljava/lang/Object;)V

    return-void
.end method
