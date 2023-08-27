.class Lcom/daaw/avee/comp/Visualizer/VisualizerViewCore$3;
.super Ljava/lang/Object;
.source "VisualizerViewCore.java"

# interfaces
.implements Ljava/lang/Runnable;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/daaw/avee/comp/Visualizer/VisualizerViewCore;->setThemeElementsUiTh(Lcom/daaw/avee/comp/Visualizer/Elements/RootElement;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic this$0:Lcom/daaw/avee/comp/Visualizer/VisualizerViewCore;

.field final synthetic val$root:Lcom/daaw/avee/comp/Visualizer/Elements/RootElement;


# direct methods
.method constructor <init>(Lcom/daaw/avee/comp/Visualizer/VisualizerViewCore;Lcom/daaw/avee/comp/Visualizer/Elements/RootElement;)V
    .locals 0

    .line 215
    iput-object p1, p0, Lcom/daaw/avee/comp/Visualizer/VisualizerViewCore$3;->this$0:Lcom/daaw/avee/comp/Visualizer/VisualizerViewCore;

    iput-object p2, p0, Lcom/daaw/avee/comp/Visualizer/VisualizerViewCore$3;->val$root:Lcom/daaw/avee/comp/Visualizer/Elements/RootElement;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public run()V
    .locals 2

    .line 219
    iget-object v0, p0, Lcom/daaw/avee/comp/Visualizer/VisualizerViewCore$3;->this$0:Lcom/daaw/avee/comp/Visualizer/VisualizerViewCore;

    iget-object v1, p0, Lcom/daaw/avee/comp/Visualizer/VisualizerViewCore$3;->val$root:Lcom/daaw/avee/comp/Visualizer/Elements/RootElement;

    invoke-static {v0, v1}, Lcom/daaw/avee/comp/Visualizer/VisualizerViewCore;->access$100(Lcom/daaw/avee/comp/Visualizer/VisualizerViewCore;Lcom/daaw/avee/comp/Visualizer/Elements/RootElement;)V

    return-void
.end method
