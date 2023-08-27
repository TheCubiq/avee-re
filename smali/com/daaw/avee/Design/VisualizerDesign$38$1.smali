.class Lcom/daaw/avee/Design/VisualizerDesign$38$1;
.super Ljava/lang/Object;
.source "VisualizerDesign.java"

# interfaces
.implements Ljava/lang/Runnable;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/daaw/avee/Design/VisualizerDesign$38;->invoke(Lcom/daaw/avee/ContextData;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic this$1:Lcom/daaw/avee/Design/VisualizerDesign$38;

.field final synthetic val$contextData:Lcom/daaw/avee/ContextData;

.field final synthetic val$dependencyResourceCounter:Lcom/daaw/avee/comp/Visualizer/DependencyResourceCounter;

.field final synthetic val$surfaceView:Lcom/daaw/avee/comp/Visualizer/VisualizerViewCore;


# direct methods
.method constructor <init>(Lcom/daaw/avee/Design/VisualizerDesign$38;Lcom/daaw/avee/comp/Visualizer/VisualizerViewCore;Lcom/daaw/avee/comp/Visualizer/DependencyResourceCounter;Lcom/daaw/avee/ContextData;)V
    .locals 0

    .line 949
    iput-object p1, p0, Lcom/daaw/avee/Design/VisualizerDesign$38$1;->this$1:Lcom/daaw/avee/Design/VisualizerDesign$38;

    iput-object p2, p0, Lcom/daaw/avee/Design/VisualizerDesign$38$1;->val$surfaceView:Lcom/daaw/avee/comp/Visualizer/VisualizerViewCore;

    iput-object p3, p0, Lcom/daaw/avee/Design/VisualizerDesign$38$1;->val$dependencyResourceCounter:Lcom/daaw/avee/comp/Visualizer/DependencyResourceCounter;

    iput-object p4, p0, Lcom/daaw/avee/Design/VisualizerDesign$38$1;->val$contextData:Lcom/daaw/avee/ContextData;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public run()V
    .locals 4

    .line 953
    invoke-static {}, Lcom/daaw/avee/comp/AppPreferences/AppPreferences;->createOrGetInstance()Lcom/daaw/avee/comp/AppPreferences/AppPreferences;

    move-result-object v0

    sget v1, Lcom/daaw/avee/comp/AppPreferences/AppPreferences;->PREF_Int_visualizerThemeId:I

    invoke-virtual {v0, v1}, Lcom/daaw/avee/comp/AppPreferences/AppPreferences;->getInt(I)I

    move-result v0

    .line 956
    invoke-static {}, Lcom/daaw/avee/comp/Visualizer/CustomScene;->Create()Lcom/daaw/avee/comp/Visualizer/CustomScene;

    move-result-object v1

    .line 958
    iget-object v2, p0, Lcom/daaw/avee/Design/VisualizerDesign$38$1;->val$surfaceView:Lcom/daaw/avee/comp/Visualizer/VisualizerViewCore;

    iget-object v3, p0, Lcom/daaw/avee/Design/VisualizerDesign$38$1;->val$dependencyResourceCounter:Lcom/daaw/avee/comp/Visualizer/DependencyResourceCounter;

    invoke-virtual {v2, v1, v3}, Lcom/daaw/avee/comp/Visualizer/VisualizerViewCore;->readThemeCustomizationData(Lcom/daaw/avee/comp/Visualizer/CustomScene;Lcom/daaw/avee/comp/Visualizer/IDependencyResourceCounter;)V

    .line 966
    iget-object v2, p0, Lcom/daaw/avee/Design/VisualizerDesign$38$1;->val$surfaceView:Lcom/daaw/avee/comp/Visualizer/VisualizerViewCore;

    new-instance v3, Lcom/daaw/avee/Design/VisualizerDesign$38$1$1;

    invoke-direct {v3, p0, v0, v1}, Lcom/daaw/avee/Design/VisualizerDesign$38$1$1;-><init>(Lcom/daaw/avee/Design/VisualizerDesign$38$1;ILcom/daaw/avee/comp/Visualizer/CustomScene;)V

    invoke-virtual {v2, v3}, Lcom/daaw/avee/comp/Visualizer/VisualizerViewCore;->post(Ljava/lang/Runnable;)Z

    return-void
.end method
