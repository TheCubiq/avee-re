.class public Lcom/daaw/d41;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Landroid/opengl/GLSurfaceView$Renderer;


# instance fields
.field public final a:Lcom/daaw/y31;

.field public b:Lcom/daaw/f61;

.field public c:Landroid/content/Context;

.field public d:Z

.field public e:Lcom/daaw/sg0;

.field public f:J


# direct methods
.method public constructor <init>(Landroid/content/Context;Landroid/content/res/Resources;Lcom/daaw/sg0;)V
    .locals 2

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const/4 v0, 0x0

    iput-object v0, p0, Lcom/daaw/d41;->b:Lcom/daaw/f61;

    iput-object v0, p0, Lcom/daaw/d41;->c:Landroid/content/Context;

    const/4 v0, 0x0

    iput-boolean v0, p0, Lcom/daaw/d41;->d:Z

    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v0

    iput-wide v0, p0, Lcom/daaw/d41;->f:J

    iput-object p1, p0, Lcom/daaw/d41;->c:Landroid/content/Context;

    iput-object p3, p0, Lcom/daaw/d41;->e:Lcom/daaw/sg0;

    new-instance p1, Lcom/daaw/y31;

    invoke-direct {p1, p3}, Lcom/daaw/y31;-><init>(Lcom/daaw/sg0;)V

    iput-object p1, p0, Lcom/daaw/d41;->a:Lcom/daaw/y31;

    invoke-virtual {p1, p2}, Lcom/daaw/y31;->P(Landroid/content/res/Resources;)V

    invoke-virtual {p0}, Lcom/daaw/d41;->d()V

    return-void
.end method


# virtual methods
.method public a()Lcom/daaw/g40;
    .locals 1

    iget-object v0, p0, Lcom/daaw/d41;->a:Lcom/daaw/y31;

    invoke-virtual {v0}, Lcom/daaw/y31;->C()Lcom/daaw/g40;

    move-result-object v0

    return-object v0
.end method

.method public b()I
    .locals 1

    iget-object v0, p0, Lcom/daaw/d41;->a:Lcom/daaw/y31;

    invoke-virtual {v0}, Lcom/daaw/y31;->D()I

    move-result v0

    return v0
.end method

.method public c(Lcom/daaw/vn;Lcom/daaw/od0;)V
    .locals 1

    iget-object v0, p0, Lcom/daaw/d41;->b:Lcom/daaw/f61;

    if-eqz v0, :cond_0

    invoke-virtual {v0, p1, p2}, Lcom/daaw/f61;->p0(Lcom/daaw/vn;Lcom/daaw/od0;)V

    :cond_0
    return-void
.end method

.method public d()V
    .locals 2

    sget-object v0, Lcom/daaw/avee/comp/Visualizer/VisualizerViewCore;->y:Lcom/daaw/vw1;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Lcom/daaw/vw1;->a(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/daaw/vn;

    if-eqz v0, :cond_0

    invoke-virtual {p0, v0}, Lcom/daaw/d41;->g(Lcom/daaw/vn;)V

    :cond_0
    return-void
.end method

.method public e()V
    .locals 1

    iget-object v0, p0, Lcom/daaw/d41;->b:Lcom/daaw/f61;

    if-eqz v0, :cond_0

    invoke-virtual {v0}, Lcom/daaw/uv;->l()V

    :cond_0
    return-void
.end method

.method public f(Lcom/daaw/vn;)V
    .locals 1

    iget-object v0, p0, Lcom/daaw/d41;->b:Lcom/daaw/f61;

    if-eqz v0, :cond_0

    invoke-virtual {v0, p1}, Lcom/daaw/f61;->t0(Lcom/daaw/vn;)V

    :cond_0
    return-void
.end method

.method public g(Lcom/daaw/vn;)V
    .locals 3

    iget-object v0, p0, Lcom/daaw/d41;->b:Lcom/daaw/f61;

    if-nez v0, :cond_0

    invoke-static {}, Lcom/daaw/tv1;->i()Lcom/daaw/tv1;

    move-result-object v0

    const/4 v1, 0x0

    const-string v2, ""

    invoke-virtual {v0, v1, v1, v2}, Lcom/daaw/tv1;->e(IZLjava/lang/String;)Lcom/daaw/f61;

    move-result-object v0

    iput-object v0, p0, Lcom/daaw/d41;->b:Lcom/daaw/f61;

    :cond_0
    iget-object v0, p0, Lcom/daaw/d41;->b:Lcom/daaw/f61;

    invoke-virtual {v0, p1}, Lcom/daaw/f61;->t0(Lcom/daaw/vn;)V

    iget-object p1, p0, Lcom/daaw/d41;->b:Lcom/daaw/f61;

    if-eqz p1, :cond_1

    invoke-virtual {p1}, Lcom/daaw/uv;->l()V

    :cond_1
    iget-object p1, p0, Lcom/daaw/d41;->e:Lcom/daaw/sg0;

    invoke-interface {p1}, Lcom/daaw/sg0;->f()V

    return-void
.end method

.method public h(Lcom/daaw/f61;)V
    .locals 0

    iput-object p1, p0, Lcom/daaw/d41;->b:Lcom/daaw/f61;

    if-eqz p1, :cond_0

    invoke-virtual {p1}, Lcom/daaw/uv;->l()V

    :cond_0
    iget-object p1, p0, Lcom/daaw/d41;->e:Lcom/daaw/sg0;

    invoke-interface {p1}, Lcom/daaw/sg0;->f()V

    return-void
.end method

.method public i(II)V
    .locals 1

    if-lez p2, :cond_0

    iget-object v0, p0, Lcom/daaw/d41;->b:Lcom/daaw/f61;

    invoke-virtual {v0, p2}, Lcom/daaw/uv;->e(I)Lcom/daaw/tv;

    move-result-object p2

    if-eqz p2, :cond_1

    invoke-virtual {p2, p1}, Lcom/daaw/tv;->U(I)V

    goto :goto_0

    :cond_0
    iget-object p2, p0, Lcom/daaw/d41;->a:Lcom/daaw/y31;

    invoke-virtual {p2, p1}, Lcom/daaw/y31;->U(I)V

    :cond_1
    :goto_0
    return-void
.end method

.method public onDrawFrame(Ljavax/microedition/khronos/opengles/GL10;)V
    .locals 7

    iget-boolean p1, p0, Lcom/daaw/d41;->d:Z

    if-nez p1, :cond_0

    return-void

    :cond_0
    iget-object p1, p0, Lcom/daaw/d41;->a:Lcom/daaw/y31;

    iget-object p1, p1, Lcom/daaw/y31;->u:Lcom/daaw/y31$c;

    invoke-virtual {p1}, Lcom/daaw/y31$c;->y()Z

    move-result p1

    if-nez p1, :cond_1

    return-void

    :cond_1
    iget-object p1, p0, Lcom/daaw/d41;->b:Lcom/daaw/f61;

    sget-object v0, Lcom/daaw/avee/comp/Visualizer/VisualizerViewCore;->B:Lcom/daaw/vw1;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Lcom/daaw/vw1;->a(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/daaw/f40;

    const/high16 v2, 0x3f800000    # 1.0f

    const v3, 0x3dcccccd    # 0.1f

    invoke-static {v3, v3, v3, v2}, Landroid/opengl/GLES20;->glClearColor(FFFF)V

    const/16 v2, 0x4100

    invoke-static {v2}, Landroid/opengl/GLES20;->glClear(I)V

    const/16 v2, 0x2801

    const/16 v3, 0xde1

    const/16 v4, 0x2601

    invoke-static {v3, v2, v4}, Landroid/opengl/GLES20;->glTexParameteri(III)V

    const/16 v2, 0x2800

    invoke-static {v3, v2, v4}, Landroid/opengl/GLES20;->glTexParameteri(III)V

    iget-object v2, p0, Lcom/daaw/d41;->a:Lcom/daaw/y31;

    const/4 v3, 0x1

    invoke-virtual {v2, v3}, Lcom/daaw/y31;->T(I)V

    iget-object v2, p0, Lcom/daaw/d41;->a:Lcom/daaw/y31;

    if-eqz v0, :cond_2

    iget v4, v0, Lcom/daaw/f40;->c:I

    iget v5, v0, Lcom/daaw/f40;->a:I

    iget v6, v0, Lcom/daaw/f40;->b:I

    invoke-virtual {v2, v4, v5, v6}, Lcom/daaw/y31;->N(III)V

    goto :goto_0

    :cond_2
    const/4 v4, -0x1

    invoke-virtual {v2, v4, v4, v4}, Lcom/daaw/y31;->N(III)V

    :goto_0
    sget-object v2, Lcom/daaw/avee/comp/Visualizer/VisualizerViewCore;->A:Lcom/daaw/rw1;

    iget-object v4, p0, Lcom/daaw/d41;->a:Lcom/daaw/y31;

    invoke-virtual {v4}, Lcom/daaw/y31;->d()F

    move-result v4

    invoke-static {v4}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    move-result-object v4

    iget-object v5, p0, Lcom/daaw/d41;->a:Lcom/daaw/y31;

    invoke-virtual {v5}, Lcom/daaw/y31;->g()F

    move-result v5

    invoke-static {v5}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    move-result-object v5

    invoke-virtual {v2, v4, v5}, Lcom/daaw/rw1;->a(Ljava/lang/Object;Ljava/lang/Object;)V

    if-eqz p1, :cond_3

    iget-object v2, p0, Lcom/daaw/d41;->a:Lcom/daaw/y31;

    invoke-virtual {p1, v2, v1, v1}, Lcom/daaw/uv;->y(Lcom/daaw/de0;Lcom/daaw/e40;Lcom/daaw/vc0;)V

    :cond_3
    if-eqz p1, :cond_7

    const/4 v2, 0x0

    if-eqz v0, :cond_4

    const/4 v4, 0x1

    goto :goto_1

    :cond_4
    const/4 v4, 0x0

    :goto_1
    if-eqz v0, :cond_5

    iget-boolean v5, v0, Lcom/daaw/f40;->d:Z

    if-eqz v5, :cond_5

    goto :goto_2

    :cond_5
    const/4 v3, 0x0

    :goto_2
    if-eqz v0, :cond_6

    iget-object v2, v0, Lcom/daaw/f40;->e:[I

    goto :goto_3

    :cond_6
    move-object v2, v1

    :goto_3
    invoke-virtual {p1, v4, v3, v2}, Lcom/daaw/f61;->s0(ZZ[I)V

    :cond_7
    if-eqz p1, :cond_8

    iget-object v2, p0, Lcom/daaw/d41;->a:Lcom/daaw/y31;

    invoke-virtual {p1, v2, v1}, Lcom/daaw/f61;->B(Lcom/daaw/y31;Lcom/daaw/e40;)V

    :cond_8
    iget-object v2, p0, Lcom/daaw/d41;->a:Lcom/daaw/y31;

    invoke-virtual {v2}, Lcom/daaw/y31;->M()V

    iget-object v2, p0, Lcom/daaw/d41;->a:Lcom/daaw/y31;

    invoke-virtual {v2, v1}, Lcom/daaw/y31;->i(Lcom/daaw/e40;)V

    if-eqz p1, :cond_9

    if-eqz v0, :cond_9

    invoke-virtual {p1}, Lcom/daaw/f61;->l0()[I

    move-result-object v0

    if-eqz v0, :cond_9

    invoke-virtual {p1}, Lcom/daaw/f61;->l0()[I

    move-result-object v0

    invoke-virtual {p1}, Lcom/daaw/f61;->n0()I

    move-result v1

    invoke-virtual {p1}, Lcom/daaw/f61;->m0()I

    move-result p1

    sget-object v2, Lcom/daaw/avee/comp/Visualizer/VisualizerViewCore;->C:Lcom/daaw/tw1;

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p1

    invoke-virtual {v2, v0, v1, p1, v0}, Lcom/daaw/tw1;->a(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)V

    :cond_9
    return-void
.end method

.method public onSurfaceChanged(Ljavax/microedition/khronos/opengles/GL10;II)V
    .locals 1

    new-instance p1, Ljava/lang/StringBuilder;

    invoke-direct {p1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v0, "onSurfaceChanged: "

    invoke-virtual {p1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p1, p2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v0, " ; "

    invoke-virtual {p1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p1, p3}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {p1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-static {p1}, Lcom/daaw/lz1;->c(Ljava/lang/String;)V

    iget-object p1, p0, Lcom/daaw/d41;->a:Lcom/daaw/y31;

    invoke-static {}, Lcom/daaw/dx0;->e()Landroid/content/Context;

    move-result-object v0

    invoke-virtual {p1, v0, p2, p3}, Lcom/daaw/y31;->Q(Landroid/content/Context;II)Z

    iget-object p1, p0, Lcom/daaw/d41;->b:Lcom/daaw/f61;

    if-eqz p1, :cond_0

    invoke-virtual {p1}, Lcom/daaw/uv;->l()V

    :cond_0
    return-void
.end method

.method public onSurfaceCreated(Ljavax/microedition/khronos/opengles/GL10;Ljavax/microedition/khronos/egl/EGLConfig;)V
    .locals 0

    const/4 p1, 0x1

    iput-boolean p1, p0, Lcom/daaw/d41;->d:Z

    iget-object p1, p0, Lcom/daaw/d41;->a:Lcom/daaw/y31;

    invoke-virtual {p1}, Lcom/daaw/y31;->R()V

    iget-object p1, p0, Lcom/daaw/d41;->b:Lcom/daaw/f61;

    if-eqz p1, :cond_0

    invoke-virtual {p1}, Lcom/daaw/uv;->l()V

    :cond_0
    return-void
.end method
