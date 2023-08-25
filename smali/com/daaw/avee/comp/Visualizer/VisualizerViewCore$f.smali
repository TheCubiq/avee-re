.class public Lcom/daaw/avee/comp/Visualizer/VisualizerViewCore$f;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Ljava/lang/Runnable;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/daaw/avee/comp/Visualizer/VisualizerViewCore;->q(II)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = null
.end annotation


# instance fields
.field public final synthetic p:I

.field public final synthetic q:I

.field public final synthetic r:Lcom/daaw/avee/comp/Visualizer/VisualizerViewCore;


# direct methods
.method public constructor <init>(Lcom/daaw/avee/comp/Visualizer/VisualizerViewCore;II)V
    .locals 0

    iput-object p1, p0, Lcom/daaw/avee/comp/Visualizer/VisualizerViewCore$f;->r:Lcom/daaw/avee/comp/Visualizer/VisualizerViewCore;

    iput p2, p0, Lcom/daaw/avee/comp/Visualizer/VisualizerViewCore$f;->p:I

    iput p3, p0, Lcom/daaw/avee/comp/Visualizer/VisualizerViewCore$f;->q:I

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public run()V
    .locals 3

    iget-object v0, p0, Lcom/daaw/avee/comp/Visualizer/VisualizerViewCore$f;->r:Lcom/daaw/avee/comp/Visualizer/VisualizerViewCore;

    iget v1, p0, Lcom/daaw/avee/comp/Visualizer/VisualizerViewCore$f;->p:I

    iget v2, p0, Lcom/daaw/avee/comp/Visualizer/VisualizerViewCore$f;->q:I

    invoke-static {v0, v1, v2}, Lcom/daaw/avee/comp/Visualizer/VisualizerViewCore;->f(Lcom/daaw/avee/comp/Visualizer/VisualizerViewCore;II)V

    return-void
.end method
