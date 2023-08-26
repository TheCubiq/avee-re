.class Lcom/daaw/avee/Design/VisualizerCustomizationDesign$4;
.super Ljava/lang/Object;
.source "VisualizerCustomizationDesign.java"

# interfaces
.implements Lcom/daaw/avee/Common/Events/WeakEvent3$Handler;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/daaw/avee/Design/VisualizerCustomizationDesign;-><init>()V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Lcom/daaw/avee/Common/Events/WeakEvent3$Handler<",
        "Landroid/content/Context;",
        "Ljava/lang/Integer;",
        "Lcom/daaw/avee/comp/Visualizer/CustomScene;",
        ">;"
    }
.end annotation


# instance fields
.field final synthetic this$0:Lcom/daaw/avee/Design/VisualizerCustomizationDesign;


# direct methods
.method constructor <init>(Lcom/daaw/avee/Design/VisualizerCustomizationDesign;)V
    .locals 0

    .line 75
    iput-object p1, p0, Lcom/daaw/avee/Design/VisualizerCustomizationDesign$4;->this$0:Lcom/daaw/avee/Design/VisualizerCustomizationDesign;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public invoke(Landroid/content/Context;Ljava/lang/Integer;Lcom/daaw/avee/comp/Visualizer/CustomScene;)V
    .locals 1

    .line 78
    invoke-static {}, Lcom/daaw/avee/comp/VisualizerCutomization/CustomizeVisDialog;->getInstance()Lcom/daaw/avee/comp/VisualizerCutomization/CustomizeVisDialog;

    move-result-object p1

    if-nez p1, :cond_0

    return-void

    .line 82
    :cond_0
    invoke-virtual {p2}, Ljava/lang/Integer;->intValue()I

    move-result p2

    invoke-virtual {p1, p2}, Lcom/daaw/avee/comp/VisualizerCutomization/CustomizeVisDialog;->getTreeItem(I)Lcom/daaw/avee/comp/VisualizerCutomization/CustomizeVisDialog$ThreeEntry;

    move-result-object p1

    .line 83
    invoke-virtual {p1}, Lcom/daaw/avee/comp/VisualizerCutomization/CustomizeVisDialog$ThreeEntry;->getComposition()Lcom/daaw/avee/comp/Visualizer/CustomComposition;

    move-result-object p2

    if-eqz p2, :cond_1

    return-void

    .line 84
    :cond_1
    invoke-virtual {p1}, Lcom/daaw/avee/comp/VisualizerCutomization/CustomizeVisDialog$ThreeEntry;->getElement()Lcom/daaw/avee/comp/Visualizer/CustomPropertiesList;

    move-result-object p1

    if-nez p1, :cond_2

    return-void

    .line 87
    :cond_2
    invoke-virtual {p1}, Lcom/daaw/avee/comp/Visualizer/CustomPropertiesList;->getParent()Lcom/daaw/avee/comp/Visualizer/CustomPropertiesList;

    move-result-object p2

    if-eqz p2, :cond_4

    .line 88
    instance-of v0, p2, Lcom/daaw/avee/comp/Visualizer/CustomComposition;

    if-nez v0, :cond_3

    goto :goto_0

    .line 90
    :cond_3
    check-cast p2, Lcom/daaw/avee/comp/Visualizer/CustomComposition;

    .line 94
    invoke-virtual {p2, p1}, Lcom/daaw/avee/comp/Visualizer/CustomComposition;->createDataEntryClonedFrom(Lcom/daaw/avee/comp/Visualizer/CustomPropertiesList;)Lcom/daaw/avee/comp/Visualizer/CustomPropertiesList;

    .line 98
    iget-object p1, p0, Lcom/daaw/avee/Design/VisualizerCustomizationDesign$4;->this$0:Lcom/daaw/avee/Design/VisualizerCustomizationDesign;

    const/4 v0, 0x0

    invoke-virtual {p2}, Lcom/daaw/avee/comp/Visualizer/CustomComposition;->GetCompositionIndex()I

    move-result p2

    invoke-static {p1, p3, v0, p2}, Lcom/daaw/avee/Design/VisualizerCustomizationDesign;->access$100(Lcom/daaw/avee/Design/VisualizerCustomizationDesign;Lcom/daaw/avee/comp/Visualizer/CustomScene;ZI)V

    :cond_4
    :goto_0
    return-void
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)V
    .locals 0

    .line 75
    check-cast p1, Landroid/content/Context;

    check-cast p2, Ljava/lang/Integer;

    check-cast p3, Lcom/daaw/avee/comp/Visualizer/CustomScene;

    invoke-virtual {p0, p1, p2, p3}, Lcom/daaw/avee/Design/VisualizerCustomizationDesign$4;->invoke(Landroid/content/Context;Ljava/lang/Integer;Lcom/daaw/avee/comp/Visualizer/CustomScene;)V

    return-void
.end method
