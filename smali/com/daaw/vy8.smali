.class public final Lcom/daaw/vy8;
.super Ljava/lang/Object;
.source ""


# instance fields
.field public final a:Landroid/os/Handler;

.field public final b:Lcom/daaw/wy8;


# direct methods
.method public constructor <init>(Landroid/os/Handler;Lcom/daaw/wy8;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    if-nez p2, :cond_0

    const/4 p1, 0x0

    :cond_0
    iput-object p1, p0, Lcom/daaw/vy8;->a:Landroid/os/Handler;

    iput-object p2, p0, Lcom/daaw/vy8;->b:Lcom/daaw/wy8;

    return-void
.end method


# virtual methods
.method public final a(Ljava/lang/String;JJ)V
    .locals 9

    iget-object v0, p0, Lcom/daaw/vy8;->a:Landroid/os/Handler;

    if-eqz v0, :cond_0

    new-instance v8, Lcom/daaw/jy8;

    move-object v1, v8

    move-object v2, p0

    move-object v3, p1

    move-wide v4, p2

    move-wide v6, p4

    invoke-direct/range {v1 .. v7}, Lcom/daaw/jy8;-><init>(Lcom/daaw/vy8;Ljava/lang/String;JJ)V

    invoke-virtual {v0, v8}, Landroid/os/Handler;->post(Ljava/lang/Runnable;)Z

    :cond_0
    return-void
.end method

.method public final b(Ljava/lang/String;)V
    .locals 2

    iget-object v0, p0, Lcom/daaw/vy8;->a:Landroid/os/Handler;

    if-eqz v0, :cond_0

    new-instance v1, Lcom/daaw/uy8;

    invoke-direct {v1, p0, p1}, Lcom/daaw/uy8;-><init>(Lcom/daaw/vy8;Ljava/lang/String;)V

    invoke-virtual {v0, v1}, Landroid/os/Handler;->post(Ljava/lang/Runnable;)Z

    :cond_0
    return-void
.end method

.method public final c(Lcom/daaw/ql7;)V
    .locals 2

    invoke-virtual {p1}, Lcom/daaw/ql7;->a()V

    iget-object v0, p0, Lcom/daaw/vy8;->a:Landroid/os/Handler;

    if-eqz v0, :cond_0

    new-instance v1, Lcom/daaw/iy8;

    invoke-direct {v1, p0, p1}, Lcom/daaw/iy8;-><init>(Lcom/daaw/vy8;Lcom/daaw/ql7;)V

    invoke-virtual {v0, v1}, Landroid/os/Handler;->post(Ljava/lang/Runnable;)Z

    :cond_0
    return-void
.end method

.method public final d(IJ)V
    .locals 2

    iget-object v0, p0, Lcom/daaw/vy8;->a:Landroid/os/Handler;

    if-eqz v0, :cond_0

    new-instance v1, Lcom/daaw/dy8;

    invoke-direct {v1, p0, p1, p2, p3}, Lcom/daaw/dy8;-><init>(Lcom/daaw/vy8;IJ)V

    invoke-virtual {v0, v1}, Landroid/os/Handler;->post(Ljava/lang/Runnable;)Z

    :cond_0
    return-void
.end method

.method public final e(Lcom/daaw/ql7;)V
    .locals 2

    iget-object v0, p0, Lcom/daaw/vy8;->a:Landroid/os/Handler;

    if-eqz v0, :cond_0

    new-instance v1, Lcom/daaw/hy8;

    invoke-direct {v1, p0, p1}, Lcom/daaw/hy8;-><init>(Lcom/daaw/vy8;Lcom/daaw/ql7;)V

    invoke-virtual {v0, v1}, Landroid/os/Handler;->post(Ljava/lang/Runnable;)Z

    :cond_0
    return-void
.end method

.method public final f(Lcom/daaw/f92;Lcom/daaw/tm7;)V
    .locals 2

    iget-object v0, p0, Lcom/daaw/vy8;->a:Landroid/os/Handler;

    if-eqz v0, :cond_0

    new-instance v1, Lcom/daaw/sy8;

    invoke-direct {v1, p0, p1, p2}, Lcom/daaw/sy8;-><init>(Lcom/daaw/vy8;Lcom/daaw/f92;Lcom/daaw/tm7;)V

    invoke-virtual {v0, v1}, Landroid/os/Handler;->post(Ljava/lang/Runnable;)Z

    :cond_0
    return-void
.end method

.method public final synthetic g(Ljava/lang/String;JJ)V
    .locals 6

    iget-object v0, p0, Lcom/daaw/vy8;->b:Lcom/daaw/wy8;

    sget v1, Lcom/daaw/it5;->a:I

    move-object v1, p1

    move-wide v2, p2

    move-wide v4, p4

    invoke-interface/range {v0 .. v5}, Lcom/daaw/wy8;->q(Ljava/lang/String;JJ)V

    return-void
.end method

.method public final synthetic h(Ljava/lang/String;)V
    .locals 2

    iget-object v0, p0, Lcom/daaw/vy8;->b:Lcom/daaw/wy8;

    sget v1, Lcom/daaw/it5;->a:I

    invoke-interface {v0, p1}, Lcom/daaw/wy8;->r(Ljava/lang/String;)V

    return-void
.end method

.method public final synthetic i(Lcom/daaw/ql7;)V
    .locals 2

    invoke-virtual {p1}, Lcom/daaw/ql7;->a()V

    iget-object v0, p0, Lcom/daaw/vy8;->b:Lcom/daaw/wy8;

    sget v1, Lcom/daaw/it5;->a:I

    invoke-interface {v0, p1}, Lcom/daaw/wy8;->n(Lcom/daaw/ql7;)V

    return-void
.end method

.method public final synthetic j(IJ)V
    .locals 2

    iget-object v0, p0, Lcom/daaw/vy8;->b:Lcom/daaw/wy8;

    sget v1, Lcom/daaw/it5;->a:I

    invoke-interface {v0, p1, p2, p3}, Lcom/daaw/wy8;->e(IJ)V

    return-void
.end method

.method public final synthetic k(Lcom/daaw/ql7;)V
    .locals 2

    iget-object v0, p0, Lcom/daaw/vy8;->b:Lcom/daaw/wy8;

    sget v1, Lcom/daaw/it5;->a:I

    invoke-interface {v0, p1}, Lcom/daaw/wy8;->k(Lcom/daaw/ql7;)V

    return-void
.end method

.method public final synthetic l(Lcom/daaw/f92;Lcom/daaw/tm7;)V
    .locals 1

    sget v0, Lcom/daaw/it5;->a:I

    iget-object v0, p0, Lcom/daaw/vy8;->b:Lcom/daaw/wy8;

    invoke-interface {v0, p1, p2}, Lcom/daaw/wy8;->d(Lcom/daaw/f92;Lcom/daaw/tm7;)V

    return-void
.end method

.method public final synthetic m(Ljava/lang/Object;J)V
    .locals 2

    iget-object v0, p0, Lcom/daaw/vy8;->b:Lcom/daaw/wy8;

    sget v1, Lcom/daaw/it5;->a:I

    invoke-interface {v0, p1, p2, p3}, Lcom/daaw/wy8;->t(Ljava/lang/Object;J)V

    return-void
.end method

.method public final synthetic n(JI)V
    .locals 2

    iget-object v0, p0, Lcom/daaw/vy8;->b:Lcom/daaw/wy8;

    sget v1, Lcom/daaw/it5;->a:I

    invoke-interface {v0, p1, p2, p3}, Lcom/daaw/wy8;->f(JI)V

    return-void
.end method

.method public final synthetic o(Ljava/lang/Exception;)V
    .locals 2

    iget-object v0, p0, Lcom/daaw/vy8;->b:Lcom/daaw/wy8;

    sget v1, Lcom/daaw/it5;->a:I

    invoke-interface {v0, p1}, Lcom/daaw/wy8;->p(Ljava/lang/Exception;)V

    return-void
.end method

.method public final synthetic p(Lcom/daaw/ll4;)V
    .locals 2

    iget-object v0, p0, Lcom/daaw/vy8;->b:Lcom/daaw/wy8;

    sget v1, Lcom/daaw/it5;->a:I

    invoke-interface {v0, p1}, Lcom/daaw/wy8;->a(Lcom/daaw/ll4;)V

    return-void
.end method

.method public final q(Ljava/lang/Object;)V
    .locals 4

    iget-object v0, p0, Lcom/daaw/vy8;->a:Landroid/os/Handler;

    if-eqz v0, :cond_0

    invoke-static {}, Landroid/os/SystemClock;->elapsedRealtime()J

    move-result-wide v0

    iget-object v2, p0, Lcom/daaw/vy8;->a:Landroid/os/Handler;

    new-instance v3, Lcom/daaw/ey8;

    invoke-direct {v3, p0, p1, v0, v1}, Lcom/daaw/ey8;-><init>(Lcom/daaw/vy8;Ljava/lang/Object;J)V

    invoke-virtual {v2, v3}, Landroid/os/Handler;->post(Ljava/lang/Runnable;)Z

    :cond_0
    return-void
.end method

.method public final r(JI)V
    .locals 2

    iget-object v0, p0, Lcom/daaw/vy8;->a:Landroid/os/Handler;

    if-eqz v0, :cond_0

    new-instance v1, Lcom/daaw/gy8;

    invoke-direct {v1, p0, p1, p2, p3}, Lcom/daaw/gy8;-><init>(Lcom/daaw/vy8;JI)V

    invoke-virtual {v0, v1}, Landroid/os/Handler;->post(Ljava/lang/Runnable;)Z

    :cond_0
    return-void
.end method

.method public final s(Ljava/lang/Exception;)V
    .locals 2

    iget-object v0, p0, Lcom/daaw/vy8;->a:Landroid/os/Handler;

    if-eqz v0, :cond_0

    new-instance v1, Lcom/daaw/fy8;

    invoke-direct {v1, p0, p1}, Lcom/daaw/fy8;-><init>(Lcom/daaw/vy8;Ljava/lang/Exception;)V

    invoke-virtual {v0, v1}, Landroid/os/Handler;->post(Ljava/lang/Runnable;)Z

    :cond_0
    return-void
.end method

.method public final t(Lcom/daaw/ll4;)V
    .locals 2

    iget-object v0, p0, Lcom/daaw/vy8;->a:Landroid/os/Handler;

    if-eqz v0, :cond_0

    new-instance v1, Lcom/daaw/ty8;

    invoke-direct {v1, p0, p1}, Lcom/daaw/ty8;-><init>(Lcom/daaw/vy8;Lcom/daaw/ll4;)V

    invoke-virtual {v0, v1}, Landroid/os/Handler;->post(Ljava/lang/Runnable;)Z

    :cond_0
    return-void
.end method
