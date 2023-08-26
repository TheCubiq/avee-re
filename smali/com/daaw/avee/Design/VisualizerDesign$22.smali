.class Lcom/daaw/avee/Design/VisualizerDesign$22;
.super Ljava/lang/Object;
.source "VisualizerDesign.java"

# interfaces
.implements Lcom/daaw/avee/Common/Events/WeakEvent$Handler;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/daaw/avee/Design/VisualizerDesign;-><init>()V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic this$0:Lcom/daaw/avee/Design/VisualizerDesign;


# direct methods
.method constructor <init>(Lcom/daaw/avee/Design/VisualizerDesign;)V
    .locals 0

    .line 731
    iput-object p1, p0, Lcom/daaw/avee/Design/VisualizerDesign$22;->this$0:Lcom/daaw/avee/Design/VisualizerDesign;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public invoke()V
    .locals 3

    .line 737
    iget-object v0, p0, Lcom/daaw/avee/Design/VisualizerDesign$22;->this$0:Lcom/daaw/avee/Design/VisualizerDesign;

    invoke-static {v0}, Lcom/daaw/avee/Design/VisualizerDesign;->access$600(Lcom/daaw/avee/Design/VisualizerDesign;)Ljava/lang/ref/WeakReference;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/ref/WeakReference;->get()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/daaw/avee/comp/Visualizer/VisualizerViewCore;

    if-eqz v0, :cond_0

    const/4 v1, 0x0

    const/4 v2, -0x1

    .line 739
    invoke-static {v0, v1, v2}, Lcom/daaw/avee/Design/VisualizerDesign;->updateChangesToVisDialogGlTh(Lcom/daaw/avee/comp/Visualizer/VisualizerViewCore;ZI)V

    :cond_0
    return-void
.end method
