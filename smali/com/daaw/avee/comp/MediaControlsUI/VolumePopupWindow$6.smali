.class Lcom/daaw/avee/comp/MediaControlsUI/VolumePopupWindow$6;
.super Ljava/lang/Object;
.source "VolumePopupWindow.java"

# interfaces
.implements Landroid/widget/SeekBar$OnSeekBarChangeListener;


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

.field final synthetic val$crossfade_crossfadeMax:Lcom/daaw/avee/Common/Tuple3;


# direct methods
.method constructor <init>(Lcom/daaw/avee/comp/MediaControlsUI/VolumePopupWindow;Lcom/daaw/avee/Common/Tuple3;)V
    .locals 0

    .line 164
    iput-object p1, p0, Lcom/daaw/avee/comp/MediaControlsUI/VolumePopupWindow$6;->this$0:Lcom/daaw/avee/comp/MediaControlsUI/VolumePopupWindow;

    iput-object p2, p0, Lcom/daaw/avee/comp/MediaControlsUI/VolumePopupWindow$6;->val$crossfade_crossfadeMax:Lcom/daaw/avee/Common/Tuple3;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onProgressChanged(Landroid/widget/SeekBar;IZ)V
    .locals 2

    .line 168
    iget-object p1, p0, Lcom/daaw/avee/comp/MediaControlsUI/VolumePopupWindow$6;->this$0:Lcom/daaw/avee/comp/MediaControlsUI/VolumePopupWindow;

    iget-object p3, p0, Lcom/daaw/avee/comp/MediaControlsUI/VolumePopupWindow$6;->val$crossfade_crossfadeMax:Lcom/daaw/avee/Common/Tuple3;

    iget-object p3, p3, Lcom/daaw/avee/Common/Tuple3;->obj2:Ljava/lang/Object;

    check-cast p3, Ljava/lang/Integer;

    invoke-virtual {p3}, Ljava/lang/Integer;->intValue()I

    move-result p3

    iget-object v0, p0, Lcom/daaw/avee/comp/MediaControlsUI/VolumePopupWindow$6;->val$crossfade_crossfadeMax:Lcom/daaw/avee/Common/Tuple3;

    iget-object v0, v0, Lcom/daaw/avee/Common/Tuple3;->obj3:Ljava/lang/Object;

    check-cast v0, Ljava/lang/Float;

    invoke-virtual {v0}, Ljava/lang/Float;->floatValue()F

    move-result v0

    const/4 v1, 0x1

    invoke-static {p1, p2, p3, v0, v1}, Lcom/daaw/avee/comp/MediaControlsUI/VolumePopupWindow;->access$500(Lcom/daaw/avee/comp/MediaControlsUI/VolumePopupWindow;IIFZ)V

    return-void
.end method

.method public onStartTrackingTouch(Landroid/widget/SeekBar;)V
    .locals 0

    return-void
.end method

.method public onStopTrackingTouch(Landroid/widget/SeekBar;)V
    .locals 0

    return-void
.end method
