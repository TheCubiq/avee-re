.class public final Lcom/daaw/pw4;
.super Ljava/lang/Object;
.source ""


# instance fields
.field public final a:Ljava/util/Set;

.field public final b:Ljava/util/Set;

.field public final c:Ljava/util/Set;

.field public final d:Ljava/util/Set;

.field public final e:Ljava/util/Set;

.field public final f:Ljava/util/Set;

.field public final g:Ljava/util/Set;

.field public final h:Ljava/util/Set;

.field public final i:Ljava/util/Set;

.field public final j:Ljava/util/Set;

.field public final k:Ljava/util/Set;

.field public final l:Ljava/util/Set;

.field public final m:Ljava/util/Set;

.field public final n:Ljava/util/Set;

.field public final o:Lcom/daaw/we6;

.field public p:Lcom/daaw/nq4;

.field public q:Lcom/daaw/vu5;


# direct methods
.method public synthetic constructor <init>(Lcom/daaw/lw4;Lcom/daaw/mw4;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    invoke-static {p1}, Lcom/daaw/lw4;->s(Lcom/daaw/lw4;)Ljava/util/Set;

    move-result-object p2

    iput-object p2, p0, Lcom/daaw/pw4;->a:Ljava/util/Set;

    invoke-static {p1}, Lcom/daaw/lw4;->c(Lcom/daaw/lw4;)Ljava/util/Set;

    move-result-object p2

    iput-object p2, p0, Lcom/daaw/pw4;->b:Ljava/util/Set;

    invoke-static {p1}, Lcom/daaw/lw4;->v(Lcom/daaw/lw4;)Ljava/util/Set;

    move-result-object p2

    iput-object p2, p0, Lcom/daaw/pw4;->d:Ljava/util/Set;

    invoke-static {p1}, Lcom/daaw/lw4;->A(Lcom/daaw/lw4;)Ljava/util/Set;

    move-result-object p2

    iput-object p2, p0, Lcom/daaw/pw4;->e:Ljava/util/Set;

    invoke-static {p1}, Lcom/daaw/lw4;->w(Lcom/daaw/lw4;)Ljava/util/Set;

    move-result-object p2

    iput-object p2, p0, Lcom/daaw/pw4;->c:Ljava/util/Set;

    invoke-static {p1}, Lcom/daaw/lw4;->x(Lcom/daaw/lw4;)Ljava/util/Set;

    move-result-object p2

    iput-object p2, p0, Lcom/daaw/pw4;->f:Ljava/util/Set;

    invoke-static {p1}, Lcom/daaw/lw4;->y(Lcom/daaw/lw4;)Ljava/util/Set;

    move-result-object p2

    iput-object p2, p0, Lcom/daaw/pw4;->g:Ljava/util/Set;

    invoke-static {p1}, Lcom/daaw/lw4;->t(Lcom/daaw/lw4;)Ljava/util/Set;

    move-result-object p2

    iput-object p2, p0, Lcom/daaw/pw4;->h:Ljava/util/Set;

    invoke-static {p1}, Lcom/daaw/lw4;->u(Lcom/daaw/lw4;)Ljava/util/Set;

    move-result-object p2

    iput-object p2, p0, Lcom/daaw/pw4;->i:Ljava/util/Set;

    invoke-static {p1}, Lcom/daaw/lw4;->z(Lcom/daaw/lw4;)Ljava/util/Set;

    move-result-object p2

    iput-object p2, p0, Lcom/daaw/pw4;->j:Ljava/util/Set;

    invoke-static {p1}, Lcom/daaw/lw4;->b(Lcom/daaw/lw4;)Ljava/util/Set;

    move-result-object p2

    iput-object p2, p0, Lcom/daaw/pw4;->k:Ljava/util/Set;

    invoke-static {p1}, Lcom/daaw/lw4;->C(Lcom/daaw/lw4;)Ljava/util/Set;

    move-result-object p2

    iput-object p2, p0, Lcom/daaw/pw4;->l:Ljava/util/Set;

    invoke-static {p1}, Lcom/daaw/lw4;->r(Lcom/daaw/lw4;)Lcom/daaw/we6;

    move-result-object p2

    iput-object p2, p0, Lcom/daaw/pw4;->o:Lcom/daaw/we6;

    invoke-static {p1}, Lcom/daaw/lw4;->B(Lcom/daaw/lw4;)Ljava/util/Set;

    move-result-object p2

    iput-object p2, p0, Lcom/daaw/pw4;->m:Ljava/util/Set;

    invoke-static {p1}, Lcom/daaw/lw4;->a(Lcom/daaw/lw4;)Ljava/util/Set;

    move-result-object p1

    iput-object p1, p0, Lcom/daaw/pw4;->n:Ljava/util/Set;

    return-void
.end method


# virtual methods
.method public final a(Ljava/util/Set;)Lcom/daaw/nq4;
    .locals 1

    iget-object v0, p0, Lcom/daaw/pw4;->p:Lcom/daaw/nq4;

    if-nez v0, :cond_0

    new-instance v0, Lcom/daaw/nq4;

    invoke-direct {v0, p1}, Lcom/daaw/nq4;-><init>(Ljava/util/Set;)V

    iput-object v0, p0, Lcom/daaw/pw4;->p:Lcom/daaw/nq4;

    :cond_0
    iget-object p1, p0, Lcom/daaw/pw4;->p:Lcom/daaw/nq4;

    return-object p1
.end method

.method public final b(Lcom/daaw/ag;Lcom/daaw/wu5;Lcom/daaw/vq5;Lcom/daaw/op6;)Lcom/daaw/vu5;
    .locals 1

    iget-object v0, p0, Lcom/daaw/pw4;->q:Lcom/daaw/vu5;

    if-nez v0, :cond_0

    new-instance v0, Lcom/daaw/vu5;

    invoke-direct {v0, p1, p2, p3, p4}, Lcom/daaw/vu5;-><init>(Lcom/daaw/ag;Lcom/daaw/wu5;Lcom/daaw/vq5;Lcom/daaw/op6;)V

    iput-object v0, p0, Lcom/daaw/pw4;->q:Lcom/daaw/vu5;

    :cond_0
    iget-object p1, p0, Lcom/daaw/pw4;->q:Lcom/daaw/vu5;

    return-object p1
.end method

.method public final c()Lcom/daaw/we6;
    .locals 1

    iget-object v0, p0, Lcom/daaw/pw4;->o:Lcom/daaw/we6;

    return-object v0
.end method

.method public final d()Ljava/util/Set;
    .locals 1

    iget-object v0, p0, Lcom/daaw/pw4;->m:Ljava/util/Set;

    return-object v0
.end method

.method public final e()Ljava/util/Set;
    .locals 1

    iget-object v0, p0, Lcom/daaw/pw4;->a:Ljava/util/Set;

    return-object v0
.end method

.method public final f()Ljava/util/Set;
    .locals 1

    iget-object v0, p0, Lcom/daaw/pw4;->h:Ljava/util/Set;

    return-object v0
.end method

.method public final g()Ljava/util/Set;
    .locals 1

    iget-object v0, p0, Lcom/daaw/pw4;->i:Ljava/util/Set;

    return-object v0
.end method

.method public final h()Ljava/util/Set;
    .locals 1

    iget-object v0, p0, Lcom/daaw/pw4;->d:Ljava/util/Set;

    return-object v0
.end method

.method public final i()Ljava/util/Set;
    .locals 1

    iget-object v0, p0, Lcom/daaw/pw4;->c:Ljava/util/Set;

    return-object v0
.end method

.method public final j()Ljava/util/Set;
    .locals 1

    iget-object v0, p0, Lcom/daaw/pw4;->f:Ljava/util/Set;

    return-object v0
.end method

.method public final k()Ljava/util/Set;
    .locals 1

    iget-object v0, p0, Lcom/daaw/pw4;->g:Ljava/util/Set;

    return-object v0
.end method

.method public final l()Ljava/util/Set;
    .locals 1

    iget-object v0, p0, Lcom/daaw/pw4;->j:Ljava/util/Set;

    return-object v0
.end method

.method public final m()Ljava/util/Set;
    .locals 1

    iget-object v0, p0, Lcom/daaw/pw4;->e:Ljava/util/Set;

    return-object v0
.end method

.method public final n()Ljava/util/Set;
    .locals 1

    iget-object v0, p0, Lcom/daaw/pw4;->l:Ljava/util/Set;

    return-object v0
.end method

.method public final o()Ljava/util/Set;
    .locals 1

    iget-object v0, p0, Lcom/daaw/pw4;->n:Ljava/util/Set;

    return-object v0
.end method

.method public final p()Ljava/util/Set;
    .locals 1

    iget-object v0, p0, Lcom/daaw/pw4;->k:Ljava/util/Set;

    return-object v0
.end method

.method public final q()Ljava/util/Set;
    .locals 1

    iget-object v0, p0, Lcom/daaw/pw4;->b:Ljava/util/Set;

    return-object v0
.end method
