.class public final synthetic Lcom/daaw/lv1;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Lcom/daaw/e0;


# instance fields
.field public final synthetic a:Lcom/daaw/avee/comp/Visualizer/VisualizerViewCore;

.field public final synthetic b:Lcom/daaw/ho;

.field public final synthetic c:Lcom/daaw/vn;

.field public final synthetic d:Z

.field public final synthetic e:I


# direct methods
.method public synthetic constructor <init>(Lcom/daaw/avee/comp/Visualizer/VisualizerViewCore;Lcom/daaw/ho;Lcom/daaw/vn;ZI)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/daaw/lv1;->a:Lcom/daaw/avee/comp/Visualizer/VisualizerViewCore;

    iput-object p2, p0, Lcom/daaw/lv1;->b:Lcom/daaw/ho;

    iput-object p3, p0, Lcom/daaw/lv1;->c:Lcom/daaw/vn;

    iput-boolean p4, p0, Lcom/daaw/lv1;->d:Z

    iput p5, p0, Lcom/daaw/lv1;->e:I

    return-void
.end method


# virtual methods
.method public final a(Ljava/lang/Object;)V
    .locals 6

    iget-object v0, p0, Lcom/daaw/lv1;->a:Lcom/daaw/avee/comp/Visualizer/VisualizerViewCore;

    iget-object v1, p0, Lcom/daaw/lv1;->b:Lcom/daaw/ho;

    iget-object v2, p0, Lcom/daaw/lv1;->c:Lcom/daaw/vn;

    iget-boolean v3, p0, Lcom/daaw/lv1;->d:Z

    iget v4, p0, Lcom/daaw/lv1;->e:I

    move-object v5, p1

    check-cast v5, Lcom/daaw/avee/comp/Visualizer/VisualizerViewCore;

    invoke-static/range {v0 .. v5}, Lcom/daaw/pv1;->b(Lcom/daaw/avee/comp/Visualizer/VisualizerViewCore;Lcom/daaw/ho;Lcom/daaw/vn;ZILcom/daaw/avee/comp/Visualizer/VisualizerViewCore;)V

    return-void
.end method
