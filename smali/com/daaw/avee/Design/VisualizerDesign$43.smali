.class Lcom/daaw/avee/Design/VisualizerDesign$43;
.super Ljava/lang/Object;
.source "VisualizerDesign.java"

# interfaces
.implements Lcom/daaw/avee/Common/Events/WeakEvent4$Handler;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/daaw/avee/Design/VisualizerDesign;-><init>()V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Lcom/daaw/avee/Common/Events/WeakEvent4$Handler<",
        "Ljava/lang/Integer;",
        "Lcom/daaw/avee/comp/Visualizer/CustomScene;",
        "Ljava/lang/Integer;",
        "Lcom/daaw/avee/Common/Events/WeakEvent2<",
        "Ljava/lang/Integer;",
        "Lcom/daaw/avee/comp/Visualizer/CustomScene;",
        ">;>;"
    }
.end annotation


# instance fields
.field final synthetic this$0:Lcom/daaw/avee/Design/VisualizerDesign;


# direct methods
.method constructor <init>(Lcom/daaw/avee/Design/VisualizerDesign;)V
    .locals 0

    .line 1086
    iput-object p1, p0, Lcom/daaw/avee/Design/VisualizerDesign$43;->this$0:Lcom/daaw/avee/Design/VisualizerDesign;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public invoke(Ljava/lang/Integer;Lcom/daaw/avee/comp/Visualizer/CustomScene;Ljava/lang/Integer;Lcom/daaw/avee/Common/Events/WeakEvent2;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/Integer;",
            "Lcom/daaw/avee/comp/Visualizer/CustomScene;",
            "Ljava/lang/Integer;",
            "Lcom/daaw/avee/Common/Events/WeakEvent2<",
            "Ljava/lang/Integer;",
            "Lcom/daaw/avee/comp/Visualizer/CustomScene;",
            ">;)V"
        }
    .end annotation

    .line 1090
    iget-object p1, p0, Lcom/daaw/avee/Design/VisualizerDesign$43;->this$0:Lcom/daaw/avee/Design/VisualizerDesign;

    invoke-static {p1}, Lcom/daaw/avee/Design/VisualizerDesign;->access$600(Lcom/daaw/avee/Design/VisualizerDesign;)Ljava/lang/ref/WeakReference;

    move-result-object p1

    invoke-virtual {p1}, Ljava/lang/ref/WeakReference;->get()Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lcom/daaw/avee/comp/Visualizer/VisualizerViewCore;

    if-eqz p1, :cond_0

    .line 1096
    new-instance p3, Lcom/daaw/avee/Design/VisualizerDesign$43$1;

    invoke-direct {p3, p0, p4}, Lcom/daaw/avee/Design/VisualizerDesign$43$1;-><init>(Lcom/daaw/avee/Design/VisualizerDesign$43;Lcom/daaw/avee/Common/Events/WeakEvent2;)V

    invoke-virtual {p1, p2, p3}, Lcom/daaw/avee/comp/Visualizer/VisualizerViewCore;->setThemeCustomizationDataUiTh(Lcom/daaw/avee/comp/Visualizer/CustomScene;Lcom/daaw/avee/Common/Action1;)V

    :cond_0
    return-void
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)V
    .locals 0

    .line 1086
    check-cast p1, Ljava/lang/Integer;

    check-cast p2, Lcom/daaw/avee/comp/Visualizer/CustomScene;

    check-cast p3, Ljava/lang/Integer;

    check-cast p4, Lcom/daaw/avee/Common/Events/WeakEvent2;

    invoke-virtual {p0, p1, p2, p3, p4}, Lcom/daaw/avee/Design/VisualizerDesign$43;->invoke(Ljava/lang/Integer;Lcom/daaw/avee/comp/Visualizer/CustomScene;Ljava/lang/Integer;Lcom/daaw/avee/Common/Events/WeakEvent2;)V

    return-void
.end method
