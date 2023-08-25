.class public final Lcom/daaw/mo6;
.super Ljava/lang/Object;
.source ""


# instance fields
.field public final a:J

.field public final b:Z

.field public final c:I

.field public final d:Ljava/lang/String;

.field public final e:Ljava/lang/String;

.field public final f:Ljava/lang/String;

.field public final g:Ljava/lang/String;

.field public final h:Ljava/lang/String;

.field public final i:Ljava/lang/String;

.field public final j:Ljava/lang/String;

.field public final k:I

.field public final l:I

.field public final m:I


# direct methods
.method public synthetic constructor <init>(Lcom/daaw/ko6;Lcom/daaw/lo6;)V
    .locals 4

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    invoke-static {p1}, Lcom/daaw/ko6;->p(Lcom/daaw/ko6;)I

    move-result p2

    iput p2, p0, Lcom/daaw/mo6;->k:I

    invoke-static {p1}, Lcom/daaw/ko6;->u(Lcom/daaw/ko6;)J

    move-result-wide v0

    invoke-static {p1}, Lcom/daaw/ko6;->t(Lcom/daaw/ko6;)J

    move-result-wide v2

    sub-long/2addr v0, v2

    iput-wide v0, p0, Lcom/daaw/mo6;->a:J

    invoke-static {p1}, Lcom/daaw/ko6;->n(Lcom/daaw/ko6;)Z

    move-result p2

    iput-boolean p2, p0, Lcom/daaw/mo6;->b:Z

    invoke-static {p1}, Lcom/daaw/ko6;->q(Lcom/daaw/ko6;)I

    move-result p2

    iput p2, p0, Lcom/daaw/mo6;->l:I

    invoke-static {p1}, Lcom/daaw/ko6;->r(Lcom/daaw/ko6;)I

    move-result p2

    iput p2, p0, Lcom/daaw/mo6;->m:I

    invoke-static {p1}, Lcom/daaw/ko6;->s(Lcom/daaw/ko6;)I

    move-result p2

    iput p2, p0, Lcom/daaw/mo6;->c:I

    invoke-static {p1}, Lcom/daaw/ko6;->E(Lcom/daaw/ko6;)Ljava/lang/String;

    move-result-object p2

    iput-object p2, p0, Lcom/daaw/mo6;->d:Ljava/lang/String;

    invoke-static {p1}, Lcom/daaw/ko6;->g(Lcom/daaw/ko6;)Ljava/lang/String;

    move-result-object p2

    iput-object p2, p0, Lcom/daaw/mo6;->e:Ljava/lang/String;

    invoke-static {p1}, Lcom/daaw/ko6;->h(Lcom/daaw/ko6;)Ljava/lang/String;

    move-result-object p2

    iput-object p2, p0, Lcom/daaw/mo6;->f:Ljava/lang/String;

    invoke-static {p1}, Lcom/daaw/ko6;->i(Lcom/daaw/ko6;)Ljava/lang/String;

    move-result-object p2

    iput-object p2, p0, Lcom/daaw/mo6;->g:Ljava/lang/String;

    invoke-static {p1}, Lcom/daaw/ko6;->k(Lcom/daaw/ko6;)Ljava/lang/String;

    move-result-object p2

    iput-object p2, p0, Lcom/daaw/mo6;->h:Ljava/lang/String;

    invoke-static {p1}, Lcom/daaw/ko6;->j(Lcom/daaw/ko6;)Ljava/lang/String;

    move-result-object p2

    iput-object p2, p0, Lcom/daaw/mo6;->i:Ljava/lang/String;

    invoke-static {p1}, Lcom/daaw/ko6;->f(Lcom/daaw/ko6;)Ljava/lang/String;

    move-result-object p1

    iput-object p1, p0, Lcom/daaw/mo6;->j:Ljava/lang/String;

    return-void
.end method


# virtual methods
.method public final a()I
    .locals 1

    iget v0, p0, Lcom/daaw/mo6;->c:I

    return v0
.end method

.method public final b()J
    .locals 2

    iget-wide v0, p0, Lcom/daaw/mo6;->a:J

    return-wide v0
.end method

.method public final c()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/daaw/mo6;->d:Ljava/lang/String;

    return-object v0
.end method

.method public final d()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/daaw/mo6;->j:Ljava/lang/String;

    return-object v0
.end method

.method public final e()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/daaw/mo6;->e:Ljava/lang/String;

    return-object v0
.end method

.method public final f()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/daaw/mo6;->f:Ljava/lang/String;

    return-object v0
.end method

.method public final g()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/daaw/mo6;->g:Ljava/lang/String;

    return-object v0
.end method

.method public final h()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/daaw/mo6;->i:Ljava/lang/String;

    return-object v0
.end method

.method public final i()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/daaw/mo6;->h:Ljava/lang/String;

    return-object v0
.end method

.method public final j()Z
    .locals 1

    iget-boolean v0, p0, Lcom/daaw/mo6;->b:Z

    return v0
.end method

.method public final k()I
    .locals 1

    iget v0, p0, Lcom/daaw/mo6;->k:I

    return v0
.end method

.method public final l()I
    .locals 1

    iget v0, p0, Lcom/daaw/mo6;->l:I

    return v0
.end method

.method public final m()I
    .locals 1

    iget v0, p0, Lcom/daaw/mo6;->m:I

    return v0
.end method
