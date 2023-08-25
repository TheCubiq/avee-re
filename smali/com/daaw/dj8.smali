.class public final Lcom/daaw/dj8;
.super Ljava/lang/Object;
.source ""


# instance fields
.field public final a:Landroid/os/Handler;

.field public final b:Lcom/daaw/fj8;


# direct methods
.method public constructor <init>(Landroid/os/Handler;Lcom/daaw/fj8;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    if-nez p2, :cond_0

    const/4 p1, 0x0

    :cond_0
    iput-object p1, p0, Lcom/daaw/dj8;->a:Landroid/os/Handler;

    iput-object p2, p0, Lcom/daaw/dj8;->b:Lcom/daaw/fj8;

    return-void
.end method


# virtual methods
.method public final a(Ljava/lang/Exception;)V
    .locals 2

    iget-object v0, p0, Lcom/daaw/dj8;->a:Landroid/os/Handler;

    if-eqz v0, :cond_0

    new-instance v1, Lcom/daaw/ji8;

    invoke-direct {v1, p0, p1}, Lcom/daaw/ji8;-><init>(Lcom/daaw/dj8;Ljava/lang/Exception;)V

    invoke-virtual {v0, v1}, Landroid/os/Handler;->post(Ljava/lang/Runnable;)Z

    :cond_0
    return-void
.end method

.method public final b(Ljava/lang/Exception;)V
    .locals 2

    iget-object v0, p0, Lcom/daaw/dj8;->a:Landroid/os/Handler;

    if-eqz v0, :cond_0

    new-instance v1, Lcom/daaw/vi8;

    invoke-direct {v1, p0, p1}, Lcom/daaw/vi8;-><init>(Lcom/daaw/dj8;Ljava/lang/Exception;)V

    invoke-virtual {v0, v1}, Landroid/os/Handler;->post(Ljava/lang/Runnable;)Z

    :cond_0
    return-void
.end method

.method public final c(Ljava/lang/String;JJ)V
    .locals 9

    iget-object v0, p0, Lcom/daaw/dj8;->a:Landroid/os/Handler;

    if-eqz v0, :cond_0

    new-instance v8, Lcom/daaw/ti8;

    move-object v1, v8

    move-object v2, p0

    move-object v3, p1

    move-wide v4, p2

    move-wide v6, p4

    invoke-direct/range {v1 .. v7}, Lcom/daaw/ti8;-><init>(Lcom/daaw/dj8;Ljava/lang/String;JJ)V

    invoke-virtual {v0, v8}, Landroid/os/Handler;->post(Ljava/lang/Runnable;)Z

    :cond_0
    return-void
.end method

.method public final d(Ljava/lang/String;)V
    .locals 2

    iget-object v0, p0, Lcom/daaw/dj8;->a:Landroid/os/Handler;

    if-eqz v0, :cond_0

    new-instance v1, Lcom/daaw/xi8;

    invoke-direct {v1, p0, p1}, Lcom/daaw/xi8;-><init>(Lcom/daaw/dj8;Ljava/lang/String;)V

    invoke-virtual {v0, v1}, Landroid/os/Handler;->post(Ljava/lang/Runnable;)Z

    :cond_0
    return-void
.end method

.method public final e(Lcom/daaw/ql7;)V
    .locals 2

    invoke-virtual {p1}, Lcom/daaw/ql7;->a()V

    iget-object v0, p0, Lcom/daaw/dj8;->a:Landroid/os/Handler;

    if-eqz v0, :cond_0

    new-instance v1, Lcom/daaw/li8;

    invoke-direct {v1, p0, p1}, Lcom/daaw/li8;-><init>(Lcom/daaw/dj8;Lcom/daaw/ql7;)V

    invoke-virtual {v0, v1}, Landroid/os/Handler;->post(Ljava/lang/Runnable;)Z

    :cond_0
    return-void
.end method

.method public final f(Lcom/daaw/ql7;)V
    .locals 2

    iget-object v0, p0, Lcom/daaw/dj8;->a:Landroid/os/Handler;

    if-eqz v0, :cond_0

    new-instance v1, Lcom/daaw/ni8;

    invoke-direct {v1, p0, p1}, Lcom/daaw/ni8;-><init>(Lcom/daaw/dj8;Lcom/daaw/ql7;)V

    invoke-virtual {v0, v1}, Landroid/os/Handler;->post(Ljava/lang/Runnable;)Z

    :cond_0
    return-void
.end method

.method public final g(Lcom/daaw/f92;Lcom/daaw/tm7;)V
    .locals 2

    iget-object v0, p0, Lcom/daaw/dj8;->a:Landroid/os/Handler;

    if-eqz v0, :cond_0

    new-instance v1, Lcom/daaw/zi8;

    invoke-direct {v1, p0, p1, p2}, Lcom/daaw/zi8;-><init>(Lcom/daaw/dj8;Lcom/daaw/f92;Lcom/daaw/tm7;)V

    invoke-virtual {v0, v1}, Landroid/os/Handler;->post(Ljava/lang/Runnable;)Z

    :cond_0
    return-void
.end method

.method public final synthetic h(Ljava/lang/Exception;)V
    .locals 2

    iget-object v0, p0, Lcom/daaw/dj8;->b:Lcom/daaw/fj8;

    sget v1, Lcom/daaw/it5;->a:I

    invoke-interface {v0, p1}, Lcom/daaw/fj8;->g(Ljava/lang/Exception;)V

    return-void
.end method

.method public final synthetic i(Ljava/lang/Exception;)V
    .locals 2

    iget-object v0, p0, Lcom/daaw/dj8;->b:Lcom/daaw/fj8;

    sget v1, Lcom/daaw/it5;->a:I

    invoke-interface {v0, p1}, Lcom/daaw/fj8;->j(Ljava/lang/Exception;)V

    return-void
.end method

.method public final synthetic j(Ljava/lang/String;JJ)V
    .locals 6

    iget-object v0, p0, Lcom/daaw/dj8;->b:Lcom/daaw/fj8;

    sget v1, Lcom/daaw/it5;->a:I

    move-object v1, p1

    move-wide v2, p2

    move-wide v4, p4

    invoke-interface/range {v0 .. v5}, Lcom/daaw/fj8;->i(Ljava/lang/String;JJ)V

    return-void
.end method

.method public final synthetic k(Ljava/lang/String;)V
    .locals 2

    iget-object v0, p0, Lcom/daaw/dj8;->b:Lcom/daaw/fj8;

    sget v1, Lcom/daaw/it5;->a:I

    invoke-interface {v0, p1}, Lcom/daaw/fj8;->l(Ljava/lang/String;)V

    return-void
.end method

.method public final synthetic l(Lcom/daaw/ql7;)V
    .locals 2

    invoke-virtual {p1}, Lcom/daaw/ql7;->a()V

    iget-object v0, p0, Lcom/daaw/dj8;->b:Lcom/daaw/fj8;

    sget v1, Lcom/daaw/it5;->a:I

    invoke-interface {v0, p1}, Lcom/daaw/fj8;->b(Lcom/daaw/ql7;)V

    return-void
.end method

.method public final synthetic m(Lcom/daaw/ql7;)V
    .locals 2

    iget-object v0, p0, Lcom/daaw/dj8;->b:Lcom/daaw/fj8;

    sget v1, Lcom/daaw/it5;->a:I

    invoke-interface {v0, p1}, Lcom/daaw/fj8;->h(Lcom/daaw/ql7;)V

    return-void
.end method

.method public final synthetic n(Lcom/daaw/f92;Lcom/daaw/tm7;)V
    .locals 1

    sget v0, Lcom/daaw/it5;->a:I

    iget-object v0, p0, Lcom/daaw/dj8;->b:Lcom/daaw/fj8;

    invoke-interface {v0, p1, p2}, Lcom/daaw/fj8;->m(Lcom/daaw/f92;Lcom/daaw/tm7;)V

    return-void
.end method

.method public final synthetic o(J)V
    .locals 2

    iget-object v0, p0, Lcom/daaw/dj8;->b:Lcom/daaw/fj8;

    sget v1, Lcom/daaw/it5;->a:I

    invoke-interface {v0, p1, p2}, Lcom/daaw/fj8;->s(J)V

    return-void
.end method

.method public final synthetic p(Z)V
    .locals 2

    iget-object v0, p0, Lcom/daaw/dj8;->b:Lcom/daaw/fj8;

    sget v1, Lcom/daaw/it5;->a:I

    invoke-interface {v0, p1}, Lcom/daaw/fj8;->c(Z)V

    return-void
.end method

.method public final synthetic q(IJJ)V
    .locals 6

    iget-object v0, p0, Lcom/daaw/dj8;->b:Lcom/daaw/fj8;

    sget v1, Lcom/daaw/it5;->a:I

    move v1, p1

    move-wide v2, p2

    move-wide v4, p4

    invoke-interface/range {v0 .. v5}, Lcom/daaw/fj8;->o(IJJ)V

    return-void
.end method

.method public final r(J)V
    .locals 2

    iget-object v0, p0, Lcom/daaw/dj8;->a:Landroid/os/Handler;

    if-eqz v0, :cond_0

    new-instance v1, Lcom/daaw/pi8;

    invoke-direct {v1, p0, p1, p2}, Lcom/daaw/pi8;-><init>(Lcom/daaw/dj8;J)V

    invoke-virtual {v0, v1}, Landroid/os/Handler;->post(Ljava/lang/Runnable;)Z

    :cond_0
    return-void
.end method

.method public final s(Z)V
    .locals 2

    iget-object v0, p0, Lcom/daaw/dj8;->a:Landroid/os/Handler;

    if-eqz v0, :cond_0

    new-instance v1, Lcom/daaw/ri8;

    invoke-direct {v1, p0, p1}, Lcom/daaw/ri8;-><init>(Lcom/daaw/dj8;Z)V

    invoke-virtual {v0, v1}, Landroid/os/Handler;->post(Ljava/lang/Runnable;)Z

    :cond_0
    return-void
.end method

.method public final t(IJJ)V
    .locals 9

    iget-object v0, p0, Lcom/daaw/dj8;->a:Landroid/os/Handler;

    if-eqz v0, :cond_0

    new-instance v8, Lcom/daaw/bj8;

    move-object v1, v8

    move-object v2, p0

    move v3, p1

    move-wide v4, p2

    move-wide v6, p4

    invoke-direct/range {v1 .. v7}, Lcom/daaw/bj8;-><init>(Lcom/daaw/dj8;IJJ)V

    invoke-virtual {v0, v8}, Landroid/os/Handler;->post(Ljava/lang/Runnable;)Z

    :cond_0
    return-void
.end method
