.class public final synthetic Lcom/daaw/vv1;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic p:Lcom/daaw/avee/comp/Visualizer/VisualizerViewCore;

.field public final synthetic q:Lcom/daaw/vn;

.field public final synthetic r:Lcom/daaw/od0;

.field public final synthetic s:Lcom/daaw/e0;

.field public final synthetic t:Lcom/daaw/avee/comp/Visualizer/VisualizerViewCore;


# direct methods
.method public synthetic constructor <init>(Lcom/daaw/avee/comp/Visualizer/VisualizerViewCore;Lcom/daaw/vn;Lcom/daaw/od0;Lcom/daaw/e0;Lcom/daaw/avee/comp/Visualizer/VisualizerViewCore;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/daaw/vv1;->p:Lcom/daaw/avee/comp/Visualizer/VisualizerViewCore;

    iput-object p2, p0, Lcom/daaw/vv1;->q:Lcom/daaw/vn;

    iput-object p3, p0, Lcom/daaw/vv1;->r:Lcom/daaw/od0;

    iput-object p4, p0, Lcom/daaw/vv1;->s:Lcom/daaw/e0;

    iput-object p5, p0, Lcom/daaw/vv1;->t:Lcom/daaw/avee/comp/Visualizer/VisualizerViewCore;

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 5

    iget-object v0, p0, Lcom/daaw/vv1;->p:Lcom/daaw/avee/comp/Visualizer/VisualizerViewCore;

    iget-object v1, p0, Lcom/daaw/vv1;->q:Lcom/daaw/vn;

    iget-object v2, p0, Lcom/daaw/vv1;->r:Lcom/daaw/od0;

    iget-object v3, p0, Lcom/daaw/vv1;->s:Lcom/daaw/e0;

    iget-object v4, p0, Lcom/daaw/vv1;->t:Lcom/daaw/avee/comp/Visualizer/VisualizerViewCore;

    invoke-static {v0, v1, v2, v3, v4}, Lcom/daaw/avee/comp/Visualizer/VisualizerViewCore;->b(Lcom/daaw/avee/comp/Visualizer/VisualizerViewCore;Lcom/daaw/vn;Lcom/daaw/od0;Lcom/daaw/e0;Lcom/daaw/avee/comp/Visualizer/VisualizerViewCore;)V

    return-void
.end method
