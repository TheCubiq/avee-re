.class public Lcom/daaw/pv1$e0$a;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Ljava/lang/Runnable;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/daaw/pv1$e0;->a(Lcom/daaw/al;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = null
.end annotation


# instance fields
.field public final synthetic p:Lcom/daaw/avee/comp/Visualizer/VisualizerViewCore;

.field public final synthetic q:Lcom/daaw/gt;

.field public final synthetic r:Lcom/daaw/al;

.field public final synthetic s:Lcom/daaw/pv1$e0;


# direct methods
.method public constructor <init>(Lcom/daaw/pv1$e0;Lcom/daaw/avee/comp/Visualizer/VisualizerViewCore;Lcom/daaw/gt;Lcom/daaw/al;)V
    .locals 0

    iput-object p1, p0, Lcom/daaw/pv1$e0$a;->s:Lcom/daaw/pv1$e0;

    iput-object p2, p0, Lcom/daaw/pv1$e0$a;->p:Lcom/daaw/avee/comp/Visualizer/VisualizerViewCore;

    iput-object p3, p0, Lcom/daaw/pv1$e0$a;->q:Lcom/daaw/gt;

    iput-object p4, p0, Lcom/daaw/pv1$e0$a;->r:Lcom/daaw/al;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public run()V
    .locals 4

    invoke-static {}, Lcom/daaw/j5;->e()Lcom/daaw/j5;

    move-result-object v0

    sget v1, Lcom/daaw/j5;->I:I

    invoke-virtual {v0, v1}, Lcom/daaw/j5;->k(I)I

    move-result v0

    invoke-static {}, Lcom/daaw/vn;->d()Lcom/daaw/vn;

    move-result-object v1

    iget-object v2, p0, Lcom/daaw/pv1$e0$a;->p:Lcom/daaw/avee/comp/Visualizer/VisualizerViewCore;

    iget-object v3, p0, Lcom/daaw/pv1$e0$a;->q:Lcom/daaw/gt;

    invoke-virtual {v2, v1, v3}, Lcom/daaw/avee/comp/Visualizer/VisualizerViewCore;->i(Lcom/daaw/vn;Lcom/daaw/od0;)V

    iget-object v2, p0, Lcom/daaw/pv1$e0$a;->p:Lcom/daaw/avee/comp/Visualizer/VisualizerViewCore;

    new-instance v3, Lcom/daaw/pv1$e0$a$a;

    invoke-direct {v3, p0, v0, v1}, Lcom/daaw/pv1$e0$a$a;-><init>(Lcom/daaw/pv1$e0$a;ILcom/daaw/vn;)V

    invoke-virtual {v2, v3}, Landroid/opengl/GLSurfaceView;->post(Ljava/lang/Runnable;)Z

    return-void
.end method
