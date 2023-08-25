.class public Lcom/daaw/avee/comp/Visualizer/VisualizerViewCore$a;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Lcom/daaw/sg0;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/daaw/avee/comp/Visualizer/VisualizerViewCore;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = null
.end annotation


# instance fields
.field public final synthetic a:Lcom/daaw/avee/comp/Visualizer/VisualizerViewCore;


# direct methods
.method public constructor <init>(Lcom/daaw/avee/comp/Visualizer/VisualizerViewCore;)V
    .locals 0

    iput-object p1, p0, Lcom/daaw/avee/comp/Visualizer/VisualizerViewCore$a;->a:Lcom/daaw/avee/comp/Visualizer/VisualizerViewCore;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public a(Ljava/lang/String;Lcom/daaw/bs1;Lcom/daaw/bs1;Lcom/daaw/bq0;Lcom/daaw/de0;)Lcom/daaw/bs1;
    .locals 7

    sget-object v0, Lcom/daaw/avee/comp/Visualizer/VisualizerViewCore;->v:Lcom/daaw/zw1;

    move-object v1, p1

    move-object v2, p2

    move-object v3, p3

    move-object v4, p4

    move-object v5, p5

    move-object v6, p3

    invoke-virtual/range {v0 .. v6}, Lcom/daaw/zw1;->a(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lcom/daaw/bs1;

    return-object p1
.end method

.method public b()I
    .locals 2

    sget-object v0, Lcom/daaw/avee/comp/Visualizer/VisualizerViewCore;->E:Lcom/daaw/vw1;

    const/4 v1, 0x0

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/daaw/vw1;->a(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Integer;

    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I

    move-result v0

    return v0
.end method

.method public c(Lcom/daaw/af0;Lcom/daaw/h2;)V
    .locals 1

    sget-object v0, Lcom/daaw/avee/comp/Visualizer/VisualizerViewCore;->x:Lcom/daaw/rw1;

    invoke-virtual {v0, p1, p2}, Lcom/daaw/rw1;->a(Ljava/lang/Object;Ljava/lang/Object;)V

    return-void
.end method

.method public d(Ljava/lang/String;)Ljava/lang/String;
    .locals 2

    sget-object v0, Lcom/daaw/avee/comp/Visualizer/VisualizerViewCore;->u:Lcom/daaw/xw1;

    iget-object v1, p0, Lcom/daaw/avee/comp/Visualizer/VisualizerViewCore$a;->a:Lcom/daaw/avee/comp/Visualizer/VisualizerViewCore;

    invoke-virtual {v0, p1, v1, p1}, Lcom/daaw/xw1;->a(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ljava/lang/String;

    return-object p1
.end method

.method public e()Z
    .locals 2

    sget-object v0, Lcom/daaw/avee/comp/Visualizer/VisualizerViewCore;->D:Lcom/daaw/vw1;

    sget-object v1, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    invoke-virtual {v0, v1}, Lcom/daaw/vw1;->a(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Boolean;

    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v0

    return v0
.end method

.method public f()V
    .locals 1

    sget-object v0, Lcom/daaw/avee/comp/Visualizer/VisualizerViewCore;->z:Lcom/daaw/pw1;

    invoke-virtual {v0}, Lcom/daaw/pw1;->a()V

    return-void
.end method

.method public g()I
    .locals 3

    sget-object v0, Lcom/daaw/avee/comp/Visualizer/VisualizerViewCore;->I:Lcom/daaw/ww1;

    iget-object v1, p0, Lcom/daaw/avee/comp/Visualizer/VisualizerViewCore$a;->a:Lcom/daaw/avee/comp/Visualizer/VisualizerViewCore;

    invoke-virtual {v1}, Landroid/opengl/GLSurfaceView;->getContext()Landroid/content/Context;

    move-result-object v1

    const/4 v2, 0x3

    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    invoke-virtual {v0, v1, v2}, Lcom/daaw/ww1;->a(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Integer;

    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I

    move-result v0

    return v0
.end method

.method public h(Lcom/daaw/vk1;ZLjava/lang/String;)V
    .locals 1

    sget-object v0, Lcom/daaw/avee/comp/Visualizer/VisualizerViewCore;->F:Lcom/daaw/sw1;

    invoke-static {p2}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object p2

    invoke-virtual {v0, p1, p2, p3}, Lcom/daaw/sw1;->a(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)V

    return-void
.end method

.method public i()Lcom/daaw/om1;
    .locals 3

    sget-object v0, Lcom/daaw/avee/comp/Visualizer/VisualizerViewCore;->J:Lcom/daaw/ww1;

    iget-object v1, p0, Lcom/daaw/avee/comp/Visualizer/VisualizerViewCore$a;->a:Lcom/daaw/avee/comp/Visualizer/VisualizerViewCore;

    invoke-virtual {v1}, Landroid/opengl/GLSurfaceView;->getContext()Landroid/content/Context;

    move-result-object v1

    const/4 v2, 0x0

    invoke-virtual {v0, v1, v2}, Lcom/daaw/ww1;->a(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/daaw/om1;

    return-object v0
.end method

.method public j(I)Lcom/daaw/avee/comp/playback/a;
    .locals 2

    sget-object v0, Lcom/daaw/avee/comp/Visualizer/VisualizerViewCore;->t:Lcom/daaw/ww1;

    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p1

    const/4 v1, 0x0

    invoke-virtual {v0, p1, v1}, Lcom/daaw/ww1;->a(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lcom/daaw/avee/comp/playback/a;

    return-object p1
.end method

.method public k()Lcom/daaw/i2;
    .locals 2

    sget-object v0, Lcom/daaw/avee/comp/Visualizer/VisualizerViewCore;->w:Lcom/daaw/vw1;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Lcom/daaw/vw1;->a(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/daaw/i2;

    return-object v0
.end method

.method public l()I
    .locals 3

    sget-object v0, Lcom/daaw/avee/comp/Visualizer/VisualizerViewCore;->H:Lcom/daaw/ww1;

    iget-object v1, p0, Lcom/daaw/avee/comp/Visualizer/VisualizerViewCore$a;->a:Lcom/daaw/avee/comp/Visualizer/VisualizerViewCore;

    invoke-virtual {v1}, Landroid/opengl/GLSurfaceView;->getContext()Landroid/content/Context;

    move-result-object v1

    const/4 v2, 0x0

    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    invoke-virtual {v0, v1, v2}, Lcom/daaw/ww1;->a(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Integer;

    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I

    move-result v0

    return v0
.end method
