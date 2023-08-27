.class Lcom/daaw/avee/Design/VisualizerDesign$43$1;
.super Ljava/lang/Object;
.source "VisualizerDesign.java"

# interfaces
.implements Lcom/daaw/avee/Common/Action1;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/daaw/avee/Design/VisualizerDesign$43;->invoke(Ljava/lang/Integer;Lcom/daaw/avee/comp/Visualizer/CustomScene;Ljava/lang/Integer;Lcom/daaw/avee/Common/Events/WeakEvent2;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Lcom/daaw/avee/Common/Action1<",
        "Lcom/daaw/avee/comp/Visualizer/VisualizerViewCore;",
        ">;"
    }
.end annotation


# instance fields
.field final synthetic this$1:Lcom/daaw/avee/Design/VisualizerDesign$43;

.field final synthetic val$onCustomStructureChangedCb:Lcom/daaw/avee/Common/Events/WeakEvent2;


# direct methods
.method constructor <init>(Lcom/daaw/avee/Design/VisualizerDesign$43;Lcom/daaw/avee/Common/Events/WeakEvent2;)V
    .locals 0

    .line 1096
    iput-object p1, p0, Lcom/daaw/avee/Design/VisualizerDesign$43$1;->this$1:Lcom/daaw/avee/Design/VisualizerDesign$43;

    iput-object p2, p0, Lcom/daaw/avee/Design/VisualizerDesign$43$1;->val$onCustomStructureChangedCb:Lcom/daaw/avee/Common/Events/WeakEvent2;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onInvoke(Lcom/daaw/avee/comp/Visualizer/VisualizerViewCore;)V
    .locals 2

    .line 1101
    iget-object v0, p0, Lcom/daaw/avee/Design/VisualizerDesign$43$1;->val$onCustomStructureChangedCb:Lcom/daaw/avee/Common/Events/WeakEvent2;

    if-eqz v0, :cond_0

    const/4 v0, 0x0

    const/4 v1, -0x1

    .line 1102
    invoke-static {p1, v0, v1}, Lcom/daaw/avee/Design/VisualizerDesign;->updateChangesToVisDialogGlTh(Lcom/daaw/avee/comp/Visualizer/VisualizerViewCore;ZI)V

    :cond_0
    return-void
.end method

.method public bridge synthetic onInvoke(Ljava/lang/Object;)V
    .locals 0

    .line 1096
    check-cast p1, Lcom/daaw/avee/comp/Visualizer/VisualizerViewCore;

    invoke-virtual {p0, p1}, Lcom/daaw/avee/Design/VisualizerDesign$43$1;->onInvoke(Lcom/daaw/avee/comp/Visualizer/VisualizerViewCore;)V

    return-void
.end method
