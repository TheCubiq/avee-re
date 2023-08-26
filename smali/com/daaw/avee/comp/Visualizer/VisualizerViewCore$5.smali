.class Lcom/daaw/avee/comp/Visualizer/VisualizerViewCore$5;
.super Ljava/lang/Object;
.source "VisualizerViewCore.java"

# interfaces
.implements Ljava/lang/Runnable;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/daaw/avee/comp/Visualizer/VisualizerViewCore;->setThemeCustomizationDataUiTh(Lcom/daaw/avee/comp/Visualizer/CustomScene;Lcom/daaw/avee/Common/Action1;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic this$0:Lcom/daaw/avee/comp/Visualizer/VisualizerViewCore;

.field final synthetic val$customSceneStr:Ljava/lang/String;

.field final synthetic val$onFinished:Lcom/daaw/avee/Common/Action1;

.field final synthetic val$surfaceView:Lcom/daaw/avee/comp/Visualizer/VisualizerViewCore;


# direct methods
.method constructor <init>(Lcom/daaw/avee/comp/Visualizer/VisualizerViewCore;Ljava/lang/String;Lcom/daaw/avee/Common/Action1;Lcom/daaw/avee/comp/Visualizer/VisualizerViewCore;)V
    .locals 0

    .line 251
    iput-object p1, p0, Lcom/daaw/avee/comp/Visualizer/VisualizerViewCore$5;->this$0:Lcom/daaw/avee/comp/Visualizer/VisualizerViewCore;

    iput-object p2, p0, Lcom/daaw/avee/comp/Visualizer/VisualizerViewCore$5;->val$customSceneStr:Ljava/lang/String;

    iput-object p3, p0, Lcom/daaw/avee/comp/Visualizer/VisualizerViewCore$5;->val$onFinished:Lcom/daaw/avee/Common/Action1;

    iput-object p4, p0, Lcom/daaw/avee/comp/Visualizer/VisualizerViewCore$5;->val$surfaceView:Lcom/daaw/avee/comp/Visualizer/VisualizerViewCore;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public run()V
    .locals 2

    .line 257
    iget-object v0, p0, Lcom/daaw/avee/comp/Visualizer/VisualizerViewCore$5;->this$0:Lcom/daaw/avee/comp/Visualizer/VisualizerViewCore;

    iget-object v1, p0, Lcom/daaw/avee/comp/Visualizer/VisualizerViewCore$5;->val$customSceneStr:Ljava/lang/String;

    invoke-static {v1}, Lcom/daaw/avee/comp/Visualizer/CustomScene;->CreateFromString(Ljava/lang/String;)Lcom/daaw/avee/comp/Visualizer/CustomScene;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/daaw/avee/comp/Visualizer/VisualizerViewCore;->setThemeCustomizationData(Lcom/daaw/avee/comp/Visualizer/CustomScene;)V

    .line 258
    iget-object v0, p0, Lcom/daaw/avee/comp/Visualizer/VisualizerViewCore$5;->val$onFinished:Lcom/daaw/avee/Common/Action1;

    if-eqz v0, :cond_0

    iget-object v1, p0, Lcom/daaw/avee/comp/Visualizer/VisualizerViewCore$5;->val$surfaceView:Lcom/daaw/avee/comp/Visualizer/VisualizerViewCore;

    invoke-interface {v0, v1}, Lcom/daaw/avee/Common/Action1;->onInvoke(Ljava/lang/Object;)V

    :cond_0
    return-void
.end method
