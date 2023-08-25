.class public Lcom/daaw/avee/comp/Visualizer/VisualizerViewCore$b;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Ljava/lang/Runnable;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/daaw/avee/comp/Visualizer/VisualizerViewCore;->setThemeElementsUiTh(Lcom/daaw/vn;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = null
.end annotation


# instance fields
.field public final synthetic p:Lcom/daaw/vn;

.field public final synthetic q:Lcom/daaw/avee/comp/Visualizer/VisualizerViewCore;


# direct methods
.method public constructor <init>(Lcom/daaw/avee/comp/Visualizer/VisualizerViewCore;Lcom/daaw/vn;)V
    .locals 0

    iput-object p1, p0, Lcom/daaw/avee/comp/Visualizer/VisualizerViewCore$b;->q:Lcom/daaw/avee/comp/Visualizer/VisualizerViewCore;

    iput-object p2, p0, Lcom/daaw/avee/comp/Visualizer/VisualizerViewCore$b;->p:Lcom/daaw/vn;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public run()V
    .locals 2

    iget-object v0, p0, Lcom/daaw/avee/comp/Visualizer/VisualizerViewCore$b;->q:Lcom/daaw/avee/comp/Visualizer/VisualizerViewCore;

    iget-object v1, p0, Lcom/daaw/avee/comp/Visualizer/VisualizerViewCore$b;->p:Lcom/daaw/vn;

    invoke-static {v0, v1}, Lcom/daaw/avee/comp/Visualizer/VisualizerViewCore;->c(Lcom/daaw/avee/comp/Visualizer/VisualizerViewCore;Lcom/daaw/vn;)V

    return-void
.end method
