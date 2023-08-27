.class Lcom/daaw/avee/comp/MediaControlsUI/VolumePopupWindow$2;
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

    .line 69
    iput-object p1, p0, Lcom/daaw/avee/comp/MediaControlsUI/VolumePopupWindow$2;->this$0:Lcom/daaw/avee/comp/MediaControlsUI/VolumePopupWindow;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onClick(Landroid/view/View;)V
    .locals 3

    .line 72
    sget-object p1, Lcom/daaw/avee/comp/MediaControlsUI/MediaControlsUI;->onToggleMuteAction:Lcom/daaw/avee/Common/Events/WeakEvent;

    invoke-virtual {p1}, Lcom/daaw/avee/Common/Events/WeakEvent;->invoke()V

    .line 74
    iget-object p1, p0, Lcom/daaw/avee/comp/MediaControlsUI/VolumePopupWindow$2;->this$0:Lcom/daaw/avee/comp/MediaControlsUI/VolumePopupWindow;

    invoke-static {p1}, Lcom/daaw/avee/comp/MediaControlsUI/VolumePopupWindow;->access$000(Lcom/daaw/avee/comp/MediaControlsUI/VolumePopupWindow;)Landroid/os/Handler;

    move-result-object p1

    const/4 v0, 0x0

    const-wide/16 v1, 0x384

    invoke-virtual {p1, v0, v1, v2}, Landroid/os/Handler;->sendEmptyMessageDelayed(IJ)Z

    return-void
.end method
