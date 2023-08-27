.class Lcom/daaw/avee/Design/VisualizerCustomizationDesign$3;
.super Ljava/lang/Object;
.source "VisualizerCustomizationDesign.java"

# interfaces
.implements Lcom/daaw/avee/Common/Events/WeakEvent5$Handler;


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
        "Lcom/daaw/avee/Common/Events/WeakEvent5$Handler<",
        "Lcom/daaw/avee/ContextData;",
        "Ljava/lang/Integer;",
        "Ljava/lang/Integer;",
        "Lcom/daaw/avee/comp/Visualizer/CustomScene;",
        "Ljava/lang/String;",
        ">;"
    }
.end annotation


# instance fields
.field final synthetic this$0:Lcom/daaw/avee/Design/VisualizerCustomizationDesign;


# direct methods
.method constructor <init>(Lcom/daaw/avee/Design/VisualizerCustomizationDesign;)V
    .locals 0

    .line 65
    iput-object p1, p0, Lcom/daaw/avee/Design/VisualizerCustomizationDesign$3;->this$0:Lcom/daaw/avee/Design/VisualizerCustomizationDesign;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public invoke(Lcom/daaw/avee/ContextData;Ljava/lang/Integer;Ljava/lang/Integer;Lcom/daaw/avee/comp/Visualizer/CustomScene;Ljava/lang/String;)V
    .locals 0

    .line 68
    iget-object p1, p0, Lcom/daaw/avee/Design/VisualizerCustomizationDesign$3;->this$0:Lcom/daaw/avee/Design/VisualizerCustomizationDesign;

    invoke-virtual {p1, p4, p5}, Lcom/daaw/avee/Design/VisualizerCustomizationDesign;->addElementToCustomScene(Lcom/daaw/avee/comp/Visualizer/CustomScene;Ljava/lang/String;)V

    .line 70
    iget-object p1, p0, Lcom/daaw/avee/Design/VisualizerCustomizationDesign$3;->this$0:Lcom/daaw/avee/Design/VisualizerCustomizationDesign;

    const/4 p2, 0x1

    const/4 p3, -0x1

    invoke-static {p1, p4, p2, p3}, Lcom/daaw/avee/Design/VisualizerCustomizationDesign;->access$100(Lcom/daaw/avee/Design/VisualizerCustomizationDesign;Lcom/daaw/avee/comp/Visualizer/CustomScene;ZI)V

    return-void
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)V
    .locals 0

    .line 65
    check-cast p1, Lcom/daaw/avee/ContextData;

    check-cast p2, Ljava/lang/Integer;

    check-cast p3, Ljava/lang/Integer;

    check-cast p4, Lcom/daaw/avee/comp/Visualizer/CustomScene;

    check-cast p5, Ljava/lang/String;

    invoke-virtual/range {p0 .. p5}, Lcom/daaw/avee/Design/VisualizerCustomizationDesign$3;->invoke(Lcom/daaw/avee/ContextData;Ljava/lang/Integer;Ljava/lang/Integer;Lcom/daaw/avee/comp/Visualizer/CustomScene;Ljava/lang/String;)V

    return-void
.end method
