.class Lcom/daaw/avee/Design/VisualizerCustomizationDesign$5;
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

    .line 102
    iput-object p1, p0, Lcom/daaw/avee/Design/VisualizerCustomizationDesign$5;->this$0:Lcom/daaw/avee/Design/VisualizerCustomizationDesign;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public invoke(Landroid/content/Context;Ljava/lang/Integer;Lcom/daaw/avee/comp/Visualizer/CustomScene;)V
    .locals 0

    .line 105
    invoke-static {}, Lcom/daaw/avee/comp/VisualizerCutomization/CustomizeVisDialog;->getInstance()Lcom/daaw/avee/comp/VisualizerCutomization/CustomizeVisDialog;

    move-result-object p1

    if-eqz p1, :cond_0

    .line 108
    invoke-virtual {p2}, Ljava/lang/Integer;->intValue()I

    move-result p2

    invoke-virtual {p1, p2}, Lcom/daaw/avee/comp/VisualizerCutomization/CustomizeVisDialog;->removeTreeItem(I)V

    :cond_0
    return-void
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)V
    .locals 0

    .line 102
    check-cast p1, Landroid/content/Context;

    check-cast p2, Ljava/lang/Integer;

    check-cast p3, Lcom/daaw/avee/comp/Visualizer/CustomScene;

    invoke-virtual {p0, p1, p2, p3}, Lcom/daaw/avee/Design/VisualizerCustomizationDesign$5;->invoke(Landroid/content/Context;Ljava/lang/Integer;Lcom/daaw/avee/comp/Visualizer/CustomScene;)V

    return-void
.end method
