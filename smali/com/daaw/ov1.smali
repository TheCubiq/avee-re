.class public final synthetic Lcom/daaw/ov1;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic p:Lcom/daaw/avee/comp/Visualizer/VisualizerViewCore;

.field public final synthetic q:Z

.field public final synthetic r:I


# direct methods
.method public synthetic constructor <init>(Lcom/daaw/avee/comp/Visualizer/VisualizerViewCore;ZI)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/daaw/ov1;->p:Lcom/daaw/avee/comp/Visualizer/VisualizerViewCore;

    iput-boolean p2, p0, Lcom/daaw/ov1;->q:Z

    iput p3, p0, Lcom/daaw/ov1;->r:I

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 3

    iget-object v0, p0, Lcom/daaw/ov1;->p:Lcom/daaw/avee/comp/Visualizer/VisualizerViewCore;

    iget-boolean v1, p0, Lcom/daaw/ov1;->q:Z

    iget v2, p0, Lcom/daaw/ov1;->r:I

    invoke-static {v0, v1, v2}, Lcom/daaw/pv1;->d(Lcom/daaw/avee/comp/Visualizer/VisualizerViewCore;ZI)V

    return-void
.end method
