.class Lcom/daaw/avee/comp/MediaControlsUI/VolumePopupWindow$4;
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

    .line 113
    iput-object p1, p0, Lcom/daaw/avee/comp/MediaControlsUI/VolumePopupWindow$4;->this$0:Lcom/daaw/avee/comp/MediaControlsUI/VolumePopupWindow;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onClick(Landroid/view/View;)V
    .locals 2

    .line 117
    iget-object p1, p0, Lcom/daaw/avee/comp/MediaControlsUI/VolumePopupWindow$4;->this$0:Lcom/daaw/avee/comp/MediaControlsUI/VolumePopupWindow;

    invoke-static {p1}, Lcom/daaw/avee/comp/MediaControlsUI/VolumePopupWindow;->access$200(Lcom/daaw/avee/comp/MediaControlsUI/VolumePopupWindow;)Landroid/view/View;

    move-result-object p1

    invoke-virtual {p1}, Landroid/view/View;->getVisibility()I

    move-result p1

    const/4 v0, 0x0

    if-nez p1, :cond_0

    .line 118
    iget-object p1, p0, Lcom/daaw/avee/comp/MediaControlsUI/VolumePopupWindow$4;->this$0:Lcom/daaw/avee/comp/MediaControlsUI/VolumePopupWindow;

    invoke-static {p1, v0, v0}, Lcom/daaw/avee/comp/MediaControlsUI/VolumePopupWindow;->access$300(Lcom/daaw/avee/comp/MediaControlsUI/VolumePopupWindow;ZZ)V

    .line 120
    sget-object p1, Lcom/daaw/avee/comp/MediaControlsUI/MediaControlsUI;->onSetAudioViewExpandedState:Lcom/daaw/avee/Common/Events/WeakEvent1;

    invoke-static {v0}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v0

    invoke-virtual {p1, v0}, Lcom/daaw/avee/Common/Events/WeakEvent1;->invoke(Ljava/lang/Object;)V

    goto :goto_0

    .line 122
    :cond_0
    iget-object p1, p0, Lcom/daaw/avee/comp/MediaControlsUI/VolumePopupWindow$4;->this$0:Lcom/daaw/avee/comp/MediaControlsUI/VolumePopupWindow;

    const/4 v1, 0x1

    invoke-static {p1, v1, v0}, Lcom/daaw/avee/comp/MediaControlsUI/VolumePopupWindow;->access$300(Lcom/daaw/avee/comp/MediaControlsUI/VolumePopupWindow;ZZ)V

    .line 124
    sget-object p1, Lcom/daaw/avee/comp/MediaControlsUI/MediaControlsUI;->onSetAudioViewExpandedState:Lcom/daaw/avee/Common/Events/WeakEvent1;

    invoke-static {v1}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v0

    invoke-virtual {p1, v0}, Lcom/daaw/avee/Common/Events/WeakEvent1;->invoke(Ljava/lang/Object;)V

    :goto_0
    return-void
.end method
