.class public final Lcom/daaw/jo1;
.super Ljava/lang/Object;
.source ""


# instance fields
.field public a:Ljava/lang/String;

.field public b:I

.field public c:Z

.field public d:I

.field public e:Z

.field public f:I

.field public g:I

.field public h:I

.field public i:I

.field public j:I

.field public k:F

.field public l:Ljava/lang/String;

.field public m:Lcom/daaw/jo1;

.field public n:Landroid/text/Layout$Alignment;


# direct methods
.method public constructor <init>()V
    .locals 1

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const/4 v0, -0x1

    iput v0, p0, Lcom/daaw/jo1;->f:I

    iput v0, p0, Lcom/daaw/jo1;->g:I

    iput v0, p0, Lcom/daaw/jo1;->h:I

    iput v0, p0, Lcom/daaw/jo1;->i:I

    iput v0, p0, Lcom/daaw/jo1;->j:I

    return-void
.end method


# virtual methods
.method public a(Lcom/daaw/jo1;)Lcom/daaw/jo1;
    .locals 1

    const/4 v0, 0x1

    invoke-virtual {p0, p1, v0}, Lcom/daaw/jo1;->l(Lcom/daaw/jo1;Z)Lcom/daaw/jo1;

    move-result-object p1

    return-object p1
.end method

.method public b()I
    .locals 2

    iget-boolean v0, p0, Lcom/daaw/jo1;->e:Z

    if-eqz v0, :cond_0

    iget v0, p0, Lcom/daaw/jo1;->d:I

    return v0

    :cond_0
    new-instance v0, Ljava/lang/IllegalStateException;

    const-string v1, "Background color has not been defined."

    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0
.end method

.method public c()I
    .locals 2

    iget-boolean v0, p0, Lcom/daaw/jo1;->c:Z

    if-eqz v0, :cond_0

    iget v0, p0, Lcom/daaw/jo1;->b:I

    return v0

    :cond_0
    new-instance v0, Ljava/lang/IllegalStateException;

    const-string v1, "Font color has not been defined."

    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0
.end method

.method public d()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/daaw/jo1;->a:Ljava/lang/String;

    return-object v0
.end method

.method public e()F
    .locals 1

    iget v0, p0, Lcom/daaw/jo1;->k:F

    return v0
.end method

.method public f()I
    .locals 1

    iget v0, p0, Lcom/daaw/jo1;->j:I

    return v0
.end method

.method public g()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/daaw/jo1;->l:Ljava/lang/String;

    return-object v0
.end method

.method public h()I
    .locals 4

    iget v0, p0, Lcom/daaw/jo1;->h:I

    const/4 v1, -0x1

    if-ne v0, v1, :cond_0

    iget v2, p0, Lcom/daaw/jo1;->i:I

    if-ne v2, v1, :cond_0

    return v1

    :cond_0
    const/4 v1, 0x0

    const/4 v2, 0x1

    if-ne v0, v2, :cond_1

    const/4 v0, 0x1

    goto :goto_0

    :cond_1
    const/4 v0, 0x0

    :goto_0
    iget v3, p0, Lcom/daaw/jo1;->i:I

    if-ne v3, v2, :cond_2

    const/4 v1, 0x2

    :cond_2
    or-int/2addr v0, v1

    return v0
.end method

.method public i()Landroid/text/Layout$Alignment;
    .locals 1

    iget-object v0, p0, Lcom/daaw/jo1;->n:Landroid/text/Layout$Alignment;

    return-object v0
.end method

.method public j()Z
    .locals 1

    iget-boolean v0, p0, Lcom/daaw/jo1;->e:Z

    return v0
.end method

.method public k()Z
    .locals 1

    iget-boolean v0, p0, Lcom/daaw/jo1;->c:Z

    return v0
.end method

.method public final l(Lcom/daaw/jo1;Z)Lcom/daaw/jo1;
    .locals 2

    if-eqz p1, :cond_8

    iget-boolean v0, p0, Lcom/daaw/jo1;->c:Z

    if-nez v0, :cond_0

    iget-boolean v0, p1, Lcom/daaw/jo1;->c:Z

    if-eqz v0, :cond_0

    iget v0, p1, Lcom/daaw/jo1;->b:I

    invoke-virtual {p0, v0}, Lcom/daaw/jo1;->q(I)Lcom/daaw/jo1;

    :cond_0
    iget v0, p0, Lcom/daaw/jo1;->h:I

    const/4 v1, -0x1

    if-ne v0, v1, :cond_1

    iget v0, p1, Lcom/daaw/jo1;->h:I

    iput v0, p0, Lcom/daaw/jo1;->h:I

    :cond_1
    iget v0, p0, Lcom/daaw/jo1;->i:I

    if-ne v0, v1, :cond_2

    iget v0, p1, Lcom/daaw/jo1;->i:I

    iput v0, p0, Lcom/daaw/jo1;->i:I

    :cond_2
    iget-object v0, p0, Lcom/daaw/jo1;->a:Ljava/lang/String;

    if-nez v0, :cond_3

    iget-object v0, p1, Lcom/daaw/jo1;->a:Ljava/lang/String;

    iput-object v0, p0, Lcom/daaw/jo1;->a:Ljava/lang/String;

    :cond_3
    iget v0, p0, Lcom/daaw/jo1;->f:I

    if-ne v0, v1, :cond_4

    iget v0, p1, Lcom/daaw/jo1;->f:I

    iput v0, p0, Lcom/daaw/jo1;->f:I

    :cond_4
    iget v0, p0, Lcom/daaw/jo1;->g:I

    if-ne v0, v1, :cond_5

    iget v0, p1, Lcom/daaw/jo1;->g:I

    iput v0, p0, Lcom/daaw/jo1;->g:I

    :cond_5
    iget-object v0, p0, Lcom/daaw/jo1;->n:Landroid/text/Layout$Alignment;

    if-nez v0, :cond_6

    iget-object v0, p1, Lcom/daaw/jo1;->n:Landroid/text/Layout$Alignment;

    iput-object v0, p0, Lcom/daaw/jo1;->n:Landroid/text/Layout$Alignment;

    :cond_6
    iget v0, p0, Lcom/daaw/jo1;->j:I

    if-ne v0, v1, :cond_7

    iget v0, p1, Lcom/daaw/jo1;->j:I

    iput v0, p0, Lcom/daaw/jo1;->j:I

    iget v0, p1, Lcom/daaw/jo1;->k:F

    iput v0, p0, Lcom/daaw/jo1;->k:F

    :cond_7
    if-eqz p2, :cond_8

    iget-boolean p2, p0, Lcom/daaw/jo1;->e:Z

    if-nez p2, :cond_8

    iget-boolean p2, p1, Lcom/daaw/jo1;->e:Z

    if-eqz p2, :cond_8

    iget p1, p1, Lcom/daaw/jo1;->d:I

    invoke-virtual {p0, p1}, Lcom/daaw/jo1;->o(I)Lcom/daaw/jo1;

    :cond_8
    return-object p0
.end method

.method public m()Z
    .locals 2

    iget v0, p0, Lcom/daaw/jo1;->f:I

    const/4 v1, 0x1

    if-ne v0, v1, :cond_0

    goto :goto_0

    :cond_0
    const/4 v1, 0x0

    :goto_0
    return v1
.end method

.method public n()Z
    .locals 2

    iget v0, p0, Lcom/daaw/jo1;->g:I

    const/4 v1, 0x1

    if-ne v0, v1, :cond_0

    goto :goto_0

    :cond_0
    const/4 v1, 0x0

    :goto_0
    return v1
.end method

.method public o(I)Lcom/daaw/jo1;
    .locals 0

    iput p1, p0, Lcom/daaw/jo1;->d:I

    const/4 p1, 0x1

    iput-boolean p1, p0, Lcom/daaw/jo1;->e:Z

    return-object p0
.end method

.method public p(Z)Lcom/daaw/jo1;
    .locals 1

    iget-object v0, p0, Lcom/daaw/jo1;->m:Lcom/daaw/jo1;

    if-nez v0, :cond_0

    const/4 v0, 0x1

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    invoke-static {v0}, Lcom/daaw/s6;->f(Z)V

    iput p1, p0, Lcom/daaw/jo1;->h:I

    return-object p0
.end method

.method public q(I)Lcom/daaw/jo1;
    .locals 2

    iget-object v0, p0, Lcom/daaw/jo1;->m:Lcom/daaw/jo1;

    const/4 v1, 0x1

    if-nez v0, :cond_0

    const/4 v0, 0x1

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    invoke-static {v0}, Lcom/daaw/s6;->f(Z)V

    iput p1, p0, Lcom/daaw/jo1;->b:I

    iput-boolean v1, p0, Lcom/daaw/jo1;->c:Z

    return-object p0
.end method

.method public r(Ljava/lang/String;)Lcom/daaw/jo1;
    .locals 1

    iget-object v0, p0, Lcom/daaw/jo1;->m:Lcom/daaw/jo1;

    if-nez v0, :cond_0

    const/4 v0, 0x1

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    invoke-static {v0}, Lcom/daaw/s6;->f(Z)V

    iput-object p1, p0, Lcom/daaw/jo1;->a:Ljava/lang/String;

    return-object p0
.end method

.method public s(F)Lcom/daaw/jo1;
    .locals 0

    iput p1, p0, Lcom/daaw/jo1;->k:F

    return-object p0
.end method

.method public t(I)Lcom/daaw/jo1;
    .locals 0

    iput p1, p0, Lcom/daaw/jo1;->j:I

    return-object p0
.end method

.method public u(Ljava/lang/String;)Lcom/daaw/jo1;
    .locals 0

    iput-object p1, p0, Lcom/daaw/jo1;->l:Ljava/lang/String;

    return-object p0
.end method

.method public v(Z)Lcom/daaw/jo1;
    .locals 1

    iget-object v0, p0, Lcom/daaw/jo1;->m:Lcom/daaw/jo1;

    if-nez v0, :cond_0

    const/4 v0, 0x1

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    invoke-static {v0}, Lcom/daaw/s6;->f(Z)V

    iput p1, p0, Lcom/daaw/jo1;->i:I

    return-object p0
.end method

.method public w(Z)Lcom/daaw/jo1;
    .locals 1

    iget-object v0, p0, Lcom/daaw/jo1;->m:Lcom/daaw/jo1;

    if-nez v0, :cond_0

    const/4 v0, 0x1

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    invoke-static {v0}, Lcom/daaw/s6;->f(Z)V

    iput p1, p0, Lcom/daaw/jo1;->f:I

    return-object p0
.end method

.method public x(Landroid/text/Layout$Alignment;)Lcom/daaw/jo1;
    .locals 0

    iput-object p1, p0, Lcom/daaw/jo1;->n:Landroid/text/Layout$Alignment;

    return-object p0
.end method

.method public y(Z)Lcom/daaw/jo1;
    .locals 1

    iget-object v0, p0, Lcom/daaw/jo1;->m:Lcom/daaw/jo1;

    if-nez v0, :cond_0

    const/4 v0, 0x1

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    invoke-static {v0}, Lcom/daaw/s6;->f(Z)V

    iput p1, p0, Lcom/daaw/jo1;->g:I

    return-object p0
.end method
