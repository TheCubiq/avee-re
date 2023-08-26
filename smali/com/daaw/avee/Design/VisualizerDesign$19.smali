.class Lcom/daaw/avee/Design/VisualizerDesign$19;
.super Ljava/lang/Object;
.source "VisualizerDesign.java"

# interfaces
.implements Lcom/daaw/avee/Common/Events/WeakEvent2$Handler;


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
        "Lcom/daaw/avee/Common/Events/WeakEvent2$Handler<",
        "Lcom/daaw/avee/comp/Common/VisualizerThemeInfo;",
        "Ljava/util/List<",
        "Ljava/lang/Integer;",
        ">;>;"
    }
.end annotation


# instance fields
.field final synthetic this$0:Lcom/daaw/avee/Design/VisualizerDesign;


# direct methods
.method constructor <init>(Lcom/daaw/avee/Design/VisualizerDesign;)V
    .locals 0

    .line 660
    iput-object p1, p0, Lcom/daaw/avee/Design/VisualizerDesign$19;->this$0:Lcom/daaw/avee/Design/VisualizerDesign;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public invoke(Lcom/daaw/avee/comp/Common/VisualizerThemeInfo;Ljava/util/List;)V
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/daaw/avee/comp/Common/VisualizerThemeInfo;",
            "Ljava/util/List<",
            "Ljava/lang/Integer;",
            ">;)V"
        }
    .end annotation

    if-nez p1, :cond_0

    return-void

    .line 666
    :cond_0
    iget v0, p1, Lcom/daaw/avee/comp/Common/VisualizerThemeInfo;->id:I

    const/4 v1, 0x0

    invoke-static {v0, v1}, Lcom/daaw/avee/Design/VisualizerDesign;->getPrefThemeCustomizationDataOrTemplateData(I[I)Lcom/daaw/avee/comp/Visualizer/CustomScene;

    move-result-object v0

    .line 668
    iget p1, p1, Lcom/daaw/avee/comp/Common/VisualizerThemeInfo;->id:I

    invoke-static {v0, p2, p1}, Lcom/daaw/avee/Design/VisualizerDesign;->addNewVisualizer(Lcom/daaw/avee/comp/Visualizer/CustomScene;Ljava/util/List;I)I

    return-void
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;Ljava/lang/Object;)V
    .locals 0

    .line 660
    check-cast p1, Lcom/daaw/avee/comp/Common/VisualizerThemeInfo;

    check-cast p2, Ljava/util/List;

    invoke-virtual {p0, p1, p2}, Lcom/daaw/avee/Design/VisualizerDesign$19;->invoke(Lcom/daaw/avee/comp/Common/VisualizerThemeInfo;Ljava/util/List;)V

    return-void
.end method
