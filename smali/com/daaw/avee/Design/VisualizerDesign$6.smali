.class Lcom/daaw/avee/Design/VisualizerDesign$6;
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
        "Lcom/daaw/avee/comp/Visualizer/VisualizerViewCore;",
        ">;"
    }
.end annotation


# instance fields
.field final synthetic this$0:Lcom/daaw/avee/Design/VisualizerDesign;


# direct methods
.method constructor <init>(Lcom/daaw/avee/Design/VisualizerDesign;)V
    .locals 0

    .line 183
    iput-object p1, p0, Lcom/daaw/avee/Design/VisualizerDesign$6;->this$0:Lcom/daaw/avee/Design/VisualizerDesign;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public invoke(Lcom/daaw/avee/comp/Visualizer/VisualizerViewCore;)V
    .locals 2

    .line 186
    iget-object v0, p0, Lcom/daaw/avee/Design/VisualizerDesign$6;->this$0:Lcom/daaw/avee/Design/VisualizerDesign;

    new-instance v1, Ljava/lang/ref/WeakReference;

    invoke-direct {v1, p1}, Ljava/lang/ref/WeakReference;-><init>(Ljava/lang/Object;)V

    invoke-static {v0, v1}, Lcom/daaw/avee/Design/VisualizerDesign;->access$602(Lcom/daaw/avee/Design/VisualizerDesign;Ljava/lang/ref/WeakReference;)Ljava/lang/ref/WeakReference;

    return-void
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;)V
    .locals 0

    .line 183
    check-cast p1, Lcom/daaw/avee/comp/Visualizer/VisualizerViewCore;

    invoke-virtual {p0, p1}, Lcom/daaw/avee/Design/VisualizerDesign$6;->invoke(Lcom/daaw/avee/comp/Visualizer/VisualizerViewCore;)V

    return-void
.end method
