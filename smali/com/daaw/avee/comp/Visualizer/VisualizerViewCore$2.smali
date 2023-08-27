.class Lcom/daaw/avee/comp/Visualizer/VisualizerViewCore$2;
.super Ljava/lang/Object;
.source "VisualizerViewCore.java"

# interfaces
.implements Ljava/lang/Runnable;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/daaw/avee/comp/Visualizer/VisualizerViewCore;->setThemeElementsUiTh(Lcom/daaw/avee/comp/Visualizer/CustomScene;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic this$0:Lcom/daaw/avee/comp/Visualizer/VisualizerViewCore;

.field final synthetic val$customScene:Lcom/daaw/avee/comp/Visualizer/CustomScene;


# direct methods
.method constructor <init>(Lcom/daaw/avee/comp/Visualizer/VisualizerViewCore;Lcom/daaw/avee/comp/Visualizer/CustomScene;)V
    .locals 0

    .line 204
    iput-object p1, p0, Lcom/daaw/avee/comp/Visualizer/VisualizerViewCore$2;->this$0:Lcom/daaw/avee/comp/Visualizer/VisualizerViewCore;

    iput-object p2, p0, Lcom/daaw/avee/comp/Visualizer/VisualizerViewCore$2;->val$customScene:Lcom/daaw/avee/comp/Visualizer/CustomScene;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public run()V
    .locals 2

    .line 208
    iget-object v0, p0, Lcom/daaw/avee/comp/Visualizer/VisualizerViewCore$2;->this$0:Lcom/daaw/avee/comp/Visualizer/VisualizerViewCore;

    iget-object v1, p0, Lcom/daaw/avee/comp/Visualizer/VisualizerViewCore$2;->val$customScene:Lcom/daaw/avee/comp/Visualizer/CustomScene;

    invoke-static {v0, v1}, Lcom/daaw/avee/comp/Visualizer/VisualizerViewCore;->access$000(Lcom/daaw/avee/comp/Visualizer/VisualizerViewCore;Lcom/daaw/avee/comp/Visualizer/CustomScene;)V

    return-void
.end method
