.class public Lcom/daaw/avee/comp/Visualizer/VisualizerViewCore$c;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Ljava/lang/Runnable;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/daaw/avee/comp/Visualizer/VisualizerViewCore;->setThemeElementsUiTh(Lcom/daaw/f61;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = null
.end annotation


# instance fields
.field public final synthetic p:Lcom/daaw/f61;

.field public final synthetic q:Lcom/daaw/avee/comp/Visualizer/VisualizerViewCore;


# direct methods
.method public constructor <init>(Lcom/daaw/avee/comp/Visualizer/VisualizerViewCore;Lcom/daaw/f61;)V
    .locals 0

    iput-object p1, p0, Lcom/daaw/avee/comp/Visualizer/VisualizerViewCore$c;->q:Lcom/daaw/avee/comp/Visualizer/VisualizerViewCore;

    iput-object p2, p0, Lcom/daaw/avee/comp/Visualizer/VisualizerViewCore$c;->p:Lcom/daaw/f61;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public run()V
    .locals 2

    iget-object v0, p0, Lcom/daaw/avee/comp/Visualizer/VisualizerViewCore$c;->q:Lcom/daaw/avee/comp/Visualizer/VisualizerViewCore;

    iget-object v1, p0, Lcom/daaw/avee/comp/Visualizer/VisualizerViewCore$c;->p:Lcom/daaw/f61;

    invoke-static {v0, v1}, Lcom/daaw/avee/comp/Visualizer/VisualizerViewCore;->d(Lcom/daaw/avee/comp/Visualizer/VisualizerViewCore;Lcom/daaw/f61;)V

    return-void
.end method
