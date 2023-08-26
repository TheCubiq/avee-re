.class Lcom/daaw/avee/comp/Visualizer/VisualizerViewCore$6;
.super Ljava/lang/Object;
.source "VisualizerViewCore.java"

# interfaces
.implements Ljava/lang/Runnable;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/daaw/avee/comp/Visualizer/VisualizerViewCore;->setTriggerLogoTh(II)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic this$0:Lcom/daaw/avee/comp/Visualizer/VisualizerViewCore;

.field final synthetic val$elementId:I

.field final synthetic val$trigger:I


# direct methods
.method constructor <init>(Lcom/daaw/avee/comp/Visualizer/VisualizerViewCore;II)V
    .locals 0

    .line 297
    iput-object p1, p0, Lcom/daaw/avee/comp/Visualizer/VisualizerViewCore$6;->this$0:Lcom/daaw/avee/comp/Visualizer/VisualizerViewCore;

    iput p2, p0, Lcom/daaw/avee/comp/Visualizer/VisualizerViewCore$6;->val$trigger:I

    iput p3, p0, Lcom/daaw/avee/comp/Visualizer/VisualizerViewCore$6;->val$elementId:I

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public run()V
    .locals 3

    .line 301
    iget-object v0, p0, Lcom/daaw/avee/comp/Visualizer/VisualizerViewCore$6;->this$0:Lcom/daaw/avee/comp/Visualizer/VisualizerViewCore;

    iget v1, p0, Lcom/daaw/avee/comp/Visualizer/VisualizerViewCore$6;->val$trigger:I

    iget v2, p0, Lcom/daaw/avee/comp/Visualizer/VisualizerViewCore$6;->val$elementId:I

    invoke-static {v0, v1, v2}, Lcom/daaw/avee/comp/Visualizer/VisualizerViewCore;->access$300(Lcom/daaw/avee/comp/Visualizer/VisualizerViewCore;II)V

    return-void
.end method
