.class Lcom/daaw/avee/Design/VisualizerDesign$38$1$1;
.super Ljava/lang/Object;
.source "VisualizerDesign.java"

# interfaces
.implements Ljava/lang/Runnable;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/daaw/avee/Design/VisualizerDesign$38$1;->run()V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic this$2:Lcom/daaw/avee/Design/VisualizerDesign$38$1;

.field final synthetic val$readCustomization:Lcom/daaw/avee/comp/Visualizer/CustomScene;

.field final synthetic val$rootIdentifier:I


# direct methods
.method constructor <init>(Lcom/daaw/avee/Design/VisualizerDesign$38$1;ILcom/daaw/avee/comp/Visualizer/CustomScene;)V
    .locals 0

    .line 966
    iput-object p1, p0, Lcom/daaw/avee/Design/VisualizerDesign$38$1$1;->this$2:Lcom/daaw/avee/Design/VisualizerDesign$38$1;

    iput p2, p0, Lcom/daaw/avee/Design/VisualizerDesign$38$1$1;->val$rootIdentifier:I

    iput-object p3, p0, Lcom/daaw/avee/Design/VisualizerDesign$38$1$1;->val$readCustomization:Lcom/daaw/avee/comp/Visualizer/CustomScene;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public run()V
    .locals 4

    .line 973
    iget-object v0, p0, Lcom/daaw/avee/Design/VisualizerDesign$38$1$1;->this$2:Lcom/daaw/avee/Design/VisualizerDesign$38$1;

    iget-object v0, v0, Lcom/daaw/avee/Design/VisualizerDesign$38$1;->this$1:Lcom/daaw/avee/Design/VisualizerDesign$38;

    iget-object v0, v0, Lcom/daaw/avee/Design/VisualizerDesign$38;->this$0:Lcom/daaw/avee/Design/VisualizerDesign;

    iget v1, p0, Lcom/daaw/avee/Design/VisualizerDesign$38$1$1;->val$rootIdentifier:I

    iget-object v2, p0, Lcom/daaw/avee/Design/VisualizerDesign$38$1$1;->this$2:Lcom/daaw/avee/Design/VisualizerDesign$38$1;

    iget-object v2, v2, Lcom/daaw/avee/Design/VisualizerDesign$38$1;->val$dependencyResourceCounter:Lcom/daaw/avee/comp/Visualizer/DependencyResourceCounter;

    invoke-virtual {v2}, Lcom/daaw/avee/comp/Visualizer/DependencyResourceCounter;->GetDependencyResourceNamesList()Ljava/util/List;

    move-result-object v2

    invoke-static {v0, v1, v2}, Lcom/daaw/avee/Design/VisualizerDesign;->access$1600(Lcom/daaw/avee/Design/VisualizerDesign;ILjava/util/List;)V

    .line 976
    iget-object v0, p0, Lcom/daaw/avee/Design/VisualizerDesign$38$1$1;->this$2:Lcom/daaw/avee/Design/VisualizerDesign$38$1;

    iget-object v0, v0, Lcom/daaw/avee/Design/VisualizerDesign$38$1;->val$contextData:Lcom/daaw/avee/ContextData;

    invoke-virtual {v0}, Lcom/daaw/avee/ContextData;->getActivity()Landroid/app/Activity;

    move-result-object v0

    if-eqz v0, :cond_1

    .line 977
    invoke-virtual {v0}, Landroid/app/Activity;->isFinishing()Z

    move-result v0

    if-nez v0, :cond_1

    .line 978
    iget-object v0, p0, Lcom/daaw/avee/Design/VisualizerDesign$38$1$1;->this$2:Lcom/daaw/avee/Design/VisualizerDesign$38$1;

    iget-object v0, v0, Lcom/daaw/avee/Design/VisualizerDesign$38$1;->val$contextData:Lcom/daaw/avee/ContextData;

    invoke-virtual {v0}, Lcom/daaw/avee/ContextData;->getFragmentManager()Landroid/app/FragmentManager;

    move-result-object v0

    if-eqz v0, :cond_1

    .line 980
    invoke-static {v0}, Lcom/daaw/avee/comp/VisualizerCutomization/CustomizeVisDialog;->isShowing(Landroid/app/FragmentManager;)Z

    move-result v0

    if-eqz v0, :cond_0

    return-void

    .line 981
    :cond_0
    iget-object v0, p0, Lcom/daaw/avee/Design/VisualizerDesign$38$1$1;->this$2:Lcom/daaw/avee/Design/VisualizerDesign$38$1;

    iget-object v0, v0, Lcom/daaw/avee/Design/VisualizerDesign$38$1;->val$contextData:Lcom/daaw/avee/ContextData;

    iget v1, p0, Lcom/daaw/avee/Design/VisualizerDesign$38$1$1;->val$rootIdentifier:I

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    iget-object v2, p0, Lcom/daaw/avee/Design/VisualizerDesign$38$1$1;->val$readCustomization:Lcom/daaw/avee/comp/Visualizer/CustomScene;

    # sget-object v3, Lcom/daaw/avee/comp/Visualizer/Elements/ElementsFactory;->addableTypeNamesArray:[Ljava/lang/String;´

    # ElementsFactory.getAddableTypeNamesArray() instead :

    invoke-static {}, Lcom/daaw/avee/comp/Visualizer/Elements/ElementsFactory;->getAddableTypeNamesArray()[Ljava/lang/String;

    move-result-object v3


    invoke-static {v0, v1, v2, v3}, Lcom/daaw/avee/comp/VisualizerCutomization/CustomizeVisDialog;->createAndShowCustomizeVisDialog(Lcom/daaw/avee/ContextData;Ljava/lang/Integer;Lcom/daaw/avee/comp/Visualizer/CustomScene;[Ljava/lang/String;)Lcom/daaw/avee/comp/VisualizerCutomization/CustomizeVisDialog;

    :cond_1
    return-void
.end method
