.class public Lcom/daaw/avee/comp/Visualizer/VisualizerViewCore$e;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Ljava/lang/Runnable;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/daaw/avee/comp/Visualizer/VisualizerViewCore;->o(Lcom/daaw/vn;Lcom/daaw/e0;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = null
.end annotation


# instance fields
.field public final synthetic p:Ljava/lang/String;

.field public final synthetic q:Lcom/daaw/e0;

.field public final synthetic r:Lcom/daaw/avee/comp/Visualizer/VisualizerViewCore;

.field public final synthetic s:Lcom/daaw/avee/comp/Visualizer/VisualizerViewCore;


# direct methods
.method public constructor <init>(Lcom/daaw/avee/comp/Visualizer/VisualizerViewCore;Ljava/lang/String;Lcom/daaw/e0;Lcom/daaw/avee/comp/Visualizer/VisualizerViewCore;)V
    .locals 0

    iput-object p1, p0, Lcom/daaw/avee/comp/Visualizer/VisualizerViewCore$e;->s:Lcom/daaw/avee/comp/Visualizer/VisualizerViewCore;

    iput-object p2, p0, Lcom/daaw/avee/comp/Visualizer/VisualizerViewCore$e;->p:Ljava/lang/String;

    iput-object p3, p0, Lcom/daaw/avee/comp/Visualizer/VisualizerViewCore$e;->q:Lcom/daaw/e0;

    iput-object p4, p0, Lcom/daaw/avee/comp/Visualizer/VisualizerViewCore$e;->r:Lcom/daaw/avee/comp/Visualizer/VisualizerViewCore;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public run()V
    .locals 2

    iget-object v0, p0, Lcom/daaw/avee/comp/Visualizer/VisualizerViewCore$e;->s:Lcom/daaw/avee/comp/Visualizer/VisualizerViewCore;

    iget-object v1, p0, Lcom/daaw/avee/comp/Visualizer/VisualizerViewCore$e;->p:Ljava/lang/String;

    invoke-static {v1}, Lcom/daaw/vn;->e(Ljava/lang/String;)Lcom/daaw/vn;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/daaw/avee/comp/Visualizer/VisualizerViewCore;->setThemeCustomizationData(Lcom/daaw/vn;)V

    iget-object v0, p0, Lcom/daaw/avee/comp/Visualizer/VisualizerViewCore$e;->q:Lcom/daaw/e0;

    if-eqz v0, :cond_0

    iget-object v1, p0, Lcom/daaw/avee/comp/Visualizer/VisualizerViewCore$e;->r:Lcom/daaw/avee/comp/Visualizer/VisualizerViewCore;

    invoke-interface {v0, v1}, Lcom/daaw/e0;->a(Ljava/lang/Object;)V

    :cond_0
    return-void
.end method
