.class Lcom/daaw/avee/Design/VisualizerDesign$38;
.super Ljava/lang/Object;
.source "VisualizerDesign.java"

# interfaces
.implements Lcom/daaw/avee/Common/Events/WeakEvent1$Handler;


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
        "Lcom/daaw/avee/Common/Events/WeakEvent1$Handler<",
        "Lcom/daaw/avee/ContextData;",
        ">;"
    }
.end annotation


# instance fields
.field final synthetic this$0:Lcom/daaw/avee/Design/VisualizerDesign;


# direct methods
.method constructor <init>(Lcom/daaw/avee/Design/VisualizerDesign;)V
    .locals 0

    .line 941
    iput-object p1, p0, Lcom/daaw/avee/Design/VisualizerDesign$38;->this$0:Lcom/daaw/avee/Design/VisualizerDesign;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public invoke(Lcom/daaw/avee/ContextData;)V
    .locals 3

    .line 945
    new-instance v0, Lcom/daaw/avee/comp/Visualizer/DependencyResourceCounter;

    invoke-direct {v0}, Lcom/daaw/avee/comp/Visualizer/DependencyResourceCounter;-><init>()V

    .line 947
    iget-object v1, p0, Lcom/daaw/avee/Design/VisualizerDesign$38;->this$0:Lcom/daaw/avee/Design/VisualizerDesign;

    invoke-static {v1}, Lcom/daaw/avee/Design/VisualizerDesign;->access$600(Lcom/daaw/avee/Design/VisualizerDesign;)Ljava/lang/ref/WeakReference;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/ref/WeakReference;->get()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lcom/daaw/avee/comp/Visualizer/VisualizerViewCore;

    if-eqz v1, :cond_0

    .line 949
    new-instance v2, Lcom/daaw/avee/Design/VisualizerDesign$38$1;

    invoke-direct {v2, p0, v1, v0, p1}, Lcom/daaw/avee/Design/VisualizerDesign$38$1;-><init>(Lcom/daaw/avee/Design/VisualizerDesign$38;Lcom/daaw/avee/comp/Visualizer/VisualizerViewCore;Lcom/daaw/avee/comp/Visualizer/DependencyResourceCounter;Lcom/daaw/avee/ContextData;)V

    invoke-virtual {v1, v2}, Lcom/daaw/avee/comp/Visualizer/VisualizerViewCore;->queueEvent(Ljava/lang/Runnable;)V

    :cond_0
    return-void
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;)V
    .locals 0

    .line 941
    check-cast p1, Lcom/daaw/avee/ContextData;

    invoke-virtual {p0, p1}, Lcom/daaw/avee/Design/VisualizerDesign$38;->invoke(Lcom/daaw/avee/ContextData;)V

    return-void
.end method
