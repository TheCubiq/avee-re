.class public final synthetic Lcom/daaw/avee/Design/-$$Lambda$VisualizerDesign$zolF5hibwrWe6ARHB3ugN9kKIGQ;
.super Ljava/lang/Object;
.source "lambda"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field private final synthetic f$0:Lcom/daaw/avee/comp/Visualizer/VisualizerViewCore;

.field private final synthetic f$1:Z

.field private final synthetic f$2:I


# direct methods
.method public synthetic constructor <init>(Lcom/daaw/avee/comp/Visualizer/VisualizerViewCore;ZI)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/daaw/avee/Design/-$$Lambda$VisualizerDesign$zolF5hibwrWe6ARHB3ugN9kKIGQ;->f$0:Lcom/daaw/avee/comp/Visualizer/VisualizerViewCore;

    iput-boolean p2, p0, Lcom/daaw/avee/Design/-$$Lambda$VisualizerDesign$zolF5hibwrWe6ARHB3ugN9kKIGQ;->f$1:Z

    iput p3, p0, Lcom/daaw/avee/Design/-$$Lambda$VisualizerDesign$zolF5hibwrWe6ARHB3ugN9kKIGQ;->f$2:I

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 3

    iget-object v0, p0, Lcom/daaw/avee/Design/-$$Lambda$VisualizerDesign$zolF5hibwrWe6ARHB3ugN9kKIGQ;->f$0:Lcom/daaw/avee/comp/Visualizer/VisualizerViewCore;

    iget-boolean v1, p0, Lcom/daaw/avee/Design/-$$Lambda$VisualizerDesign$zolF5hibwrWe6ARHB3ugN9kKIGQ;->f$1:Z

    iget v2, p0, Lcom/daaw/avee/Design/-$$Lambda$VisualizerDesign$zolF5hibwrWe6ARHB3ugN9kKIGQ;->f$2:I

    invoke-static {v0, v1, v2}, Lcom/daaw/avee/Design/VisualizerDesign;->lambda$updateChangesToVisDialogGlTh$3(Lcom/daaw/avee/comp/Visualizer/VisualizerViewCore;ZI)V

    return-void
.end method
