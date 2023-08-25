.class public final Lcom/daaw/to0;
.super Ljava/lang/Object;
.source ""


# instance fields
.field public final a:Lcom/daaw/nl1$b;

.field public final b:Lcom/daaw/nl1$c;

.field public c:J

.field public d:Lcom/daaw/nl1;

.field public e:I

.field public f:Z

.field public g:Lcom/daaw/ro0;

.field public h:Lcom/daaw/ro0;

.field public i:Lcom/daaw/ro0;

.field public j:I

.field public k:Ljava/lang/Object;

.field public l:J


# direct methods
.method public constructor <init>()V
    .locals 1

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    new-instance v0, Lcom/daaw/nl1$b;

    invoke-direct {v0}, Lcom/daaw/nl1$b;-><init>()V

    iput-object v0, p0, Lcom/daaw/to0;->a:Lcom/daaw/nl1$b;

    new-instance v0, Lcom/daaw/nl1$c;

    invoke-direct {v0}, Lcom/daaw/nl1$c;-><init>()V

    iput-object v0, p0, Lcom/daaw/to0;->b:Lcom/daaw/nl1$c;

    return-void
.end method


# virtual methods
.method public A(Lcom/daaw/nl1;)V
    .locals 0

    iput-object p1, p0, Lcom/daaw/to0;->d:Lcom/daaw/nl1;

    return-void
.end method

.method public B()Z
    .locals 5

    iget-object v0, p0, Lcom/daaw/to0;->i:Lcom/daaw/ro0;

    if-eqz v0, :cond_1

    iget-object v1, v0, Lcom/daaw/ro0;->h:Lcom/daaw/so0;

    iget-boolean v1, v1, Lcom/daaw/so0;->g:Z

    if-nez v1, :cond_0

    invoke-virtual {v0}, Lcom/daaw/ro0;->l()Z

    move-result v0

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/daaw/to0;->i:Lcom/daaw/ro0;

    iget-object v0, v0, Lcom/daaw/ro0;->h:Lcom/daaw/so0;

    iget-wide v0, v0, Lcom/daaw/so0;->e:J

    const-wide v2, -0x7fffffffffffffffL    # -4.9E-324

    cmp-long v4, v0, v2

    if-eqz v4, :cond_0

    iget v0, p0, Lcom/daaw/to0;->j:I

    const/16 v1, 0x64

    if-ge v0, v1, :cond_0

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    goto :goto_1

    :cond_1
    :goto_0
    const/4 v0, 0x1

    :goto_1
    return v0
.end method

.method public final C()Z
    .locals 8

    invoke-virtual {p0}, Lcom/daaw/to0;->h()Lcom/daaw/ro0;

    move-result-object v0

    const/4 v1, 0x1

    if-nez v0, :cond_0

    return v1

    :cond_0
    :goto_0
    iget-object v2, p0, Lcom/daaw/to0;->d:Lcom/daaw/nl1;

    iget-object v3, v0, Lcom/daaw/ro0;->h:Lcom/daaw/so0;

    iget-object v3, v3, Lcom/daaw/so0;->a:Lcom/daaw/bp0$a;

    iget v3, v3, Lcom/daaw/bp0$a;->a:I

    iget-object v4, p0, Lcom/daaw/to0;->a:Lcom/daaw/nl1$b;

    iget-object v5, p0, Lcom/daaw/to0;->b:Lcom/daaw/nl1$c;

    iget v6, p0, Lcom/daaw/to0;->e:I

    iget-boolean v7, p0, Lcom/daaw/to0;->f:Z

    invoke-virtual/range {v2 .. v7}, Lcom/daaw/nl1;->d(ILcom/daaw/nl1$b;Lcom/daaw/nl1$c;IZ)I

    move-result v2

    :goto_1
    iget-object v3, v0, Lcom/daaw/ro0;->i:Lcom/daaw/ro0;

    if-eqz v3, :cond_1

    iget-object v4, v0, Lcom/daaw/ro0;->h:Lcom/daaw/so0;

    iget-boolean v4, v4, Lcom/daaw/so0;->f:Z

    if-nez v4, :cond_1

    move-object v0, v3

    goto :goto_1

    :cond_1
    const/4 v4, -0x1

    if-eq v2, v4, :cond_3

    if-eqz v3, :cond_3

    iget-object v4, v3, Lcom/daaw/ro0;->h:Lcom/daaw/so0;

    iget-object v4, v4, Lcom/daaw/so0;->a:Lcom/daaw/bp0$a;

    iget v4, v4, Lcom/daaw/bp0$a;->a:I

    if-eq v4, v2, :cond_2

    goto :goto_2

    :cond_2
    move-object v0, v3

    goto :goto_0

    :cond_3
    :goto_2
    invoke-virtual {p0, v0}, Lcom/daaw/to0;->w(Lcom/daaw/ro0;)Z

    move-result v2

    iget-object v3, v0, Lcom/daaw/ro0;->h:Lcom/daaw/so0;

    iget-object v4, v3, Lcom/daaw/so0;->a:Lcom/daaw/bp0$a;

    invoke-virtual {p0, v3, v4}, Lcom/daaw/to0;->q(Lcom/daaw/so0;Lcom/daaw/bp0$a;)Lcom/daaw/so0;

    move-result-object v3

    iput-object v3, v0, Lcom/daaw/ro0;->h:Lcom/daaw/so0;

    if-eqz v2, :cond_5

    invoke-virtual {p0}, Lcom/daaw/to0;->r()Z

    move-result v0

    if-nez v0, :cond_4

    goto :goto_3

    :cond_4
    const/4 v1, 0x0

    :cond_5
    :goto_3
    return v1
.end method

.method public D(Lcom/daaw/bp0$a;J)Z
    .locals 8

    iget p1, p1, Lcom/daaw/bp0$a;->a:I

    invoke-virtual {p0}, Lcom/daaw/to0;->h()Lcom/daaw/ro0;

    move-result-object v0

    const/4 v1, 0x0

    move v3, p1

    :goto_0
    const/4 p1, 0x1

    if-eqz v0, :cond_6

    if-nez v1, :cond_0

    iget-object p1, v0, Lcom/daaw/ro0;->h:Lcom/daaw/so0;

    invoke-virtual {p0, p1, v3}, Lcom/daaw/to0;->p(Lcom/daaw/so0;I)Lcom/daaw/so0;

    move-result-object p1

    iput-object p1, v0, Lcom/daaw/ro0;->h:Lcom/daaw/so0;

    goto :goto_1

    :cond_0
    const/4 v2, -0x1

    if-eq v3, v2, :cond_5

    iget-object v2, v0, Lcom/daaw/ro0;->b:Ljava/lang/Object;

    iget-object v4, p0, Lcom/daaw/to0;->d:Lcom/daaw/nl1;

    iget-object v5, p0, Lcom/daaw/to0;->a:Lcom/daaw/nl1$b;

    invoke-virtual {v4, v3, v5, p1}, Lcom/daaw/nl1;->g(ILcom/daaw/nl1$b;Z)Lcom/daaw/nl1$b;

    move-result-object v4

    iget-object v4, v4, Lcom/daaw/nl1$b;->b:Ljava/lang/Object;

    invoke-virtual {v2, v4}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result v2

    if-nez v2, :cond_1

    goto :goto_2

    :cond_1
    invoke-virtual {p0, v1, p2, p3}, Lcom/daaw/to0;->g(Lcom/daaw/ro0;J)Lcom/daaw/so0;

    move-result-object v2

    if-nez v2, :cond_2

    invoke-virtual {p0, v1}, Lcom/daaw/to0;->w(Lcom/daaw/ro0;)Z

    move-result p2

    xor-int/2addr p1, p2

    return p1

    :cond_2
    iget-object v4, v0, Lcom/daaw/ro0;->h:Lcom/daaw/so0;

    invoke-virtual {p0, v4, v3}, Lcom/daaw/to0;->p(Lcom/daaw/so0;I)Lcom/daaw/so0;

    move-result-object v4

    iput-object v4, v0, Lcom/daaw/ro0;->h:Lcom/daaw/so0;

    invoke-virtual {p0, v0, v2}, Lcom/daaw/to0;->c(Lcom/daaw/ro0;Lcom/daaw/so0;)Z

    move-result v2

    if-nez v2, :cond_3

    invoke-virtual {p0, v1}, Lcom/daaw/to0;->w(Lcom/daaw/ro0;)Z

    move-result p2

    xor-int/2addr p1, p2

    return p1

    :cond_3
    :goto_1
    iget-object p1, v0, Lcom/daaw/ro0;->h:Lcom/daaw/so0;

    iget-boolean p1, p1, Lcom/daaw/so0;->f:Z

    if-eqz p1, :cond_4

    iget-object v2, p0, Lcom/daaw/to0;->d:Lcom/daaw/nl1;

    iget-object v4, p0, Lcom/daaw/to0;->a:Lcom/daaw/nl1$b;

    iget-object v5, p0, Lcom/daaw/to0;->b:Lcom/daaw/nl1$c;

    iget v6, p0, Lcom/daaw/to0;->e:I

    iget-boolean v7, p0, Lcom/daaw/to0;->f:Z

    invoke-virtual/range {v2 .. v7}, Lcom/daaw/nl1;->d(ILcom/daaw/nl1$b;Lcom/daaw/nl1$c;IZ)I

    move-result p1

    move v3, p1

    :cond_4
    iget-object p1, v0, Lcom/daaw/ro0;->i:Lcom/daaw/ro0;

    move-object v1, v0

    move-object v0, p1

    goto :goto_0

    :cond_5
    :goto_2
    invoke-virtual {p0, v1}, Lcom/daaw/to0;->w(Lcom/daaw/ro0;)Z

    move-result p2

    xor-int/2addr p1, p2

    :cond_6
    return p1
.end method

.method public E(I)Z
    .locals 0

    iput p1, p0, Lcom/daaw/to0;->e:I

    invoke-virtual {p0}, Lcom/daaw/to0;->C()Z

    move-result p1

    return p1
.end method

.method public F(Z)Z
    .locals 0

    iput-boolean p1, p0, Lcom/daaw/to0;->f:Z

    invoke-virtual {p0}, Lcom/daaw/to0;->C()Z

    move-result p1

    return p1
.end method

.method public a()Lcom/daaw/ro0;
    .locals 2

    iget-object v0, p0, Lcom/daaw/to0;->g:Lcom/daaw/ro0;

    if-eqz v0, :cond_1

    iget-object v1, p0, Lcom/daaw/to0;->h:Lcom/daaw/ro0;

    if-ne v0, v1, :cond_0

    iget-object v1, v0, Lcom/daaw/ro0;->i:Lcom/daaw/ro0;

    iput-object v1, p0, Lcom/daaw/to0;->h:Lcom/daaw/ro0;

    :cond_0
    invoke-virtual {v0}, Lcom/daaw/ro0;->n()V

    iget-object v0, p0, Lcom/daaw/to0;->g:Lcom/daaw/ro0;

    iget-object v0, v0, Lcom/daaw/ro0;->i:Lcom/daaw/ro0;

    iput-object v0, p0, Lcom/daaw/to0;->g:Lcom/daaw/ro0;

    iget v0, p0, Lcom/daaw/to0;->j:I

    add-int/lit8 v0, v0, -0x1

    iput v0, p0, Lcom/daaw/to0;->j:I

    if-nez v0, :cond_2

    const/4 v0, 0x0

    iput-object v0, p0, Lcom/daaw/to0;->i:Lcom/daaw/ro0;

    goto :goto_0

    :cond_1
    iget-object v0, p0, Lcom/daaw/to0;->i:Lcom/daaw/ro0;

    iput-object v0, p0, Lcom/daaw/to0;->g:Lcom/daaw/ro0;

    iput-object v0, p0, Lcom/daaw/to0;->h:Lcom/daaw/ro0;

    :cond_2
    :goto_0
    iget-object v0, p0, Lcom/daaw/to0;->g:Lcom/daaw/ro0;

    return-object v0
.end method

.method public b()Lcom/daaw/ro0;
    .locals 1

    iget-object v0, p0, Lcom/daaw/to0;->h:Lcom/daaw/ro0;

    if-eqz v0, :cond_0

    iget-object v0, v0, Lcom/daaw/ro0;->i:Lcom/daaw/ro0;

    if-eqz v0, :cond_0

    const/4 v0, 0x1

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    invoke-static {v0}, Lcom/daaw/s6;->f(Z)V

    iget-object v0, p0, Lcom/daaw/to0;->h:Lcom/daaw/ro0;

    iget-object v0, v0, Lcom/daaw/ro0;->i:Lcom/daaw/ro0;

    iput-object v0, p0, Lcom/daaw/to0;->h:Lcom/daaw/ro0;

    return-object v0
.end method

.method public final c(Lcom/daaw/ro0;Lcom/daaw/so0;)Z
    .locals 5

    iget-object p1, p1, Lcom/daaw/ro0;->h:Lcom/daaw/so0;

    iget-wide v0, p1, Lcom/daaw/so0;->b:J

    iget-wide v2, p2, Lcom/daaw/so0;->b:J

    cmp-long v4, v0, v2

    if-nez v4, :cond_0

    iget-wide v0, p1, Lcom/daaw/so0;->c:J

    iget-wide v2, p2, Lcom/daaw/so0;->c:J

    cmp-long v4, v0, v2

    if-nez v4, :cond_0

    iget-object p1, p1, Lcom/daaw/so0;->a:Lcom/daaw/bp0$a;

    iget-object p2, p2, Lcom/daaw/so0;->a:Lcom/daaw/bp0$a;

    invoke-virtual {p1, p2}, Lcom/daaw/bp0$a;->equals(Ljava/lang/Object;)Z

    move-result p1

    if-eqz p1, :cond_0

    const/4 p1, 0x1

    goto :goto_0

    :cond_0
    const/4 p1, 0x0

    :goto_0
    return p1
.end method

.method public d(Z)V
    .locals 4

    invoke-virtual {p0}, Lcom/daaw/to0;->h()Lcom/daaw/ro0;

    move-result-object v0

    const/4 v1, 0x0

    if-eqz v0, :cond_1

    if-eqz p1, :cond_0

    iget-object p1, v0, Lcom/daaw/ro0;->b:Ljava/lang/Object;

    goto :goto_0

    :cond_0
    move-object p1, v1

    :goto_0
    iput-object p1, p0, Lcom/daaw/to0;->k:Ljava/lang/Object;

    iget-object p1, v0, Lcom/daaw/ro0;->h:Lcom/daaw/so0;

    iget-object p1, p1, Lcom/daaw/so0;->a:Lcom/daaw/bp0$a;

    iget-wide v2, p1, Lcom/daaw/bp0$a;->d:J

    iput-wide v2, p0, Lcom/daaw/to0;->l:J

    invoke-virtual {v0}, Lcom/daaw/ro0;->n()V

    invoke-virtual {p0, v0}, Lcom/daaw/to0;->w(Lcom/daaw/ro0;)Z

    goto :goto_1

    :cond_1
    if-nez p1, :cond_2

    iput-object v1, p0, Lcom/daaw/to0;->k:Ljava/lang/Object;

    :cond_2
    :goto_1
    iput-object v1, p0, Lcom/daaw/to0;->g:Lcom/daaw/ro0;

    iput-object v1, p0, Lcom/daaw/to0;->i:Lcom/daaw/ro0;

    iput-object v1, p0, Lcom/daaw/to0;->h:Lcom/daaw/ro0;

    const/4 p1, 0x0

    iput p1, p0, Lcom/daaw/to0;->j:I

    return-void
.end method

.method public e([Lcom/daaw/b41;Lcom/daaw/wm1;Lcom/daaw/l2;Lcom/daaw/bp0;Ljava/lang/Object;Lcom/daaw/so0;)Lcom/daaw/qo0;
    .locals 11

    move-object v0, p0

    iget-object v1, v0, Lcom/daaw/to0;->i:Lcom/daaw/ro0;

    move-object/from16 v10, p6

    if-nez v1, :cond_0

    iget-wide v1, v10, Lcom/daaw/so0;->b:J

    goto :goto_0

    :cond_0
    invoke-virtual {v1}, Lcom/daaw/ro0;->j()J

    move-result-wide v1

    iget-object v3, v0, Lcom/daaw/to0;->i:Lcom/daaw/ro0;

    iget-object v3, v3, Lcom/daaw/ro0;->h:Lcom/daaw/so0;

    iget-wide v3, v3, Lcom/daaw/so0;->e:J

    add-long/2addr v1, v3

    :goto_0
    move-wide v4, v1

    new-instance v1, Lcom/daaw/ro0;

    move-object v2, v1

    move-object v3, p1

    move-object v6, p2

    move-object v7, p3

    move-object v8, p4

    move-object/from16 v9, p5

    move-object/from16 v10, p6

    invoke-direct/range {v2 .. v10}, Lcom/daaw/ro0;-><init>([Lcom/daaw/b41;JLcom/daaw/wm1;Lcom/daaw/l2;Lcom/daaw/bp0;Ljava/lang/Object;Lcom/daaw/so0;)V

    iget-object v2, v0, Lcom/daaw/to0;->i:Lcom/daaw/ro0;

    if-eqz v2, :cond_1

    invoke-virtual {p0}, Lcom/daaw/to0;->r()Z

    move-result v2

    invoke-static {v2}, Lcom/daaw/s6;->f(Z)V

    iget-object v2, v0, Lcom/daaw/to0;->i:Lcom/daaw/ro0;

    iput-object v1, v2, Lcom/daaw/ro0;->i:Lcom/daaw/ro0;

    :cond_1
    const/4 v2, 0x0

    iput-object v2, v0, Lcom/daaw/to0;->k:Ljava/lang/Object;

    iput-object v1, v0, Lcom/daaw/to0;->i:Lcom/daaw/ro0;

    iget v2, v0, Lcom/daaw/to0;->j:I

    add-int/lit8 v2, v2, 0x1

    iput v2, v0, Lcom/daaw/to0;->j:I

    iget-object v1, v1, Lcom/daaw/ro0;->a:Lcom/daaw/qo0;

    return-object v1
.end method

.method public final f(Lcom/daaw/yw0;)Lcom/daaw/so0;
    .locals 6

    iget-object v1, p1, Lcom/daaw/yw0;->c:Lcom/daaw/bp0$a;

    iget-wide v2, p1, Lcom/daaw/yw0;->e:J

    iget-wide v4, p1, Lcom/daaw/yw0;->d:J

    move-object v0, p0

    invoke-virtual/range {v0 .. v5}, Lcom/daaw/to0;->j(Lcom/daaw/bp0$a;JJ)Lcom/daaw/so0;

    move-result-object p1

    return-object p1
.end method

.method public final g(Lcom/daaw/ro0;J)Lcom/daaw/so0;
    .locals 17

    move-object/from16 v8, p0

    move-object/from16 v0, p1

    iget-object v1, v0, Lcom/daaw/ro0;->h:Lcom/daaw/so0;

    iget-boolean v2, v1, Lcom/daaw/so0;->f:Z

    const/4 v3, 0x1

    const/4 v4, -0x1

    const/4 v5, 0x0

    if-eqz v2, :cond_4

    iget-object v9, v8, Lcom/daaw/to0;->d:Lcom/daaw/nl1;

    iget-object v2, v1, Lcom/daaw/so0;->a:Lcom/daaw/bp0$a;

    iget v10, v2, Lcom/daaw/bp0$a;->a:I

    iget-object v11, v8, Lcom/daaw/to0;->a:Lcom/daaw/nl1$b;

    iget-object v12, v8, Lcom/daaw/to0;->b:Lcom/daaw/nl1$c;

    iget v13, v8, Lcom/daaw/to0;->e:I

    iget-boolean v14, v8, Lcom/daaw/to0;->f:Z

    invoke-virtual/range {v9 .. v14}, Lcom/daaw/nl1;->d(ILcom/daaw/nl1$b;Lcom/daaw/nl1$c;IZ)I

    move-result v2

    if-ne v2, v4, :cond_0

    return-object v5

    :cond_0
    iget-object v4, v8, Lcom/daaw/to0;->d:Lcom/daaw/nl1;

    iget-object v6, v8, Lcom/daaw/to0;->a:Lcom/daaw/nl1$b;

    invoke-virtual {v4, v2, v6, v3}, Lcom/daaw/nl1;->g(ILcom/daaw/nl1$b;Z)Lcom/daaw/nl1$b;

    move-result-object v3

    iget v12, v3, Lcom/daaw/nl1$b;->c:I

    iget-object v3, v8, Lcom/daaw/to0;->a:Lcom/daaw/nl1$b;

    iget-object v3, v3, Lcom/daaw/nl1$b;->b:Ljava/lang/Object;

    iget-object v4, v1, Lcom/daaw/so0;->a:Lcom/daaw/bp0$a;

    iget-wide v6, v4, Lcom/daaw/bp0$a;->d:J

    iget-object v4, v8, Lcom/daaw/to0;->d:Lcom/daaw/nl1;

    iget-object v9, v8, Lcom/daaw/to0;->b:Lcom/daaw/nl1$c;

    invoke-virtual {v4, v12, v9}, Lcom/daaw/nl1;->k(ILcom/daaw/nl1$c;)Lcom/daaw/nl1$c;

    move-result-object v4

    iget v4, v4, Lcom/daaw/nl1$c;->f:I

    const-wide/16 v9, 0x0

    if-ne v4, v2, :cond_3

    invoke-virtual/range {p1 .. p1}, Lcom/daaw/ro0;->j()J

    move-result-wide v6

    iget-wide v1, v1, Lcom/daaw/so0;->e:J

    add-long/2addr v6, v1

    sub-long v6, v6, p2

    iget-object v1, v8, Lcom/daaw/to0;->d:Lcom/daaw/nl1;

    iget-object v2, v8, Lcom/daaw/to0;->b:Lcom/daaw/nl1$c;

    iget-object v11, v8, Lcom/daaw/to0;->a:Lcom/daaw/nl1$b;

    const-wide v13, -0x7fffffffffffffffL    # -4.9E-324

    invoke-static {v9, v10, v6, v7}, Ljava/lang/Math;->max(JJ)J

    move-result-wide v15

    move-object v9, v1

    move-object v10, v2

    invoke-virtual/range {v9 .. v16}, Lcom/daaw/nl1;->j(Lcom/daaw/nl1$c;Lcom/daaw/nl1$b;IJJ)Landroid/util/Pair;

    move-result-object v1

    if-nez v1, :cond_1

    return-object v5

    :cond_1
    iget-object v2, v1, Landroid/util/Pair;->first:Ljava/lang/Object;

    check-cast v2, Ljava/lang/Integer;

    invoke-virtual {v2}, Ljava/lang/Integer;->intValue()I

    move-result v2

    iget-object v1, v1, Landroid/util/Pair;->second:Ljava/lang/Object;

    check-cast v1, Ljava/lang/Long;

    invoke-virtual {v1}, Ljava/lang/Long;->longValue()J

    move-result-wide v4

    iget-object v1, v0, Lcom/daaw/ro0;->i:Lcom/daaw/ro0;

    if-eqz v1, :cond_2

    iget-object v1, v1, Lcom/daaw/ro0;->b:Ljava/lang/Object;

    invoke-virtual {v1, v3}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_2

    iget-object v0, v0, Lcom/daaw/ro0;->i:Lcom/daaw/ro0;

    iget-object v0, v0, Lcom/daaw/ro0;->h:Lcom/daaw/so0;

    iget-object v0, v0, Lcom/daaw/so0;->a:Lcom/daaw/bp0$a;

    iget-wide v0, v0, Lcom/daaw/bp0$a;->d:J

    goto :goto_0

    :cond_2
    iget-wide v0, v8, Lcom/daaw/to0;->c:J

    const-wide/16 v6, 0x1

    add-long/2addr v6, v0

    iput-wide v6, v8, Lcom/daaw/to0;->c:J

    :goto_0
    move-wide v9, v4

    move-wide v4, v0

    move v1, v2

    goto :goto_1

    :cond_3
    move v1, v2

    move-wide v4, v6

    :goto_1
    move-object/from16 v0, p0

    move-wide v2, v9

    invoke-virtual/range {v0 .. v5}, Lcom/daaw/to0;->y(IJJ)Lcom/daaw/bp0$a;

    move-result-object v1

    move-wide v4, v9

    invoke-virtual/range {v0 .. v5}, Lcom/daaw/to0;->j(Lcom/daaw/bp0$a;JJ)Lcom/daaw/so0;

    move-result-object v0

    return-object v0

    :cond_4
    iget-object v0, v1, Lcom/daaw/so0;->a:Lcom/daaw/bp0$a;

    iget-object v2, v8, Lcom/daaw/to0;->d:Lcom/daaw/nl1;

    iget v6, v0, Lcom/daaw/bp0$a;->a:I

    iget-object v7, v8, Lcom/daaw/to0;->a:Lcom/daaw/nl1$b;

    invoke-virtual {v2, v6, v7}, Lcom/daaw/nl1;->f(ILcom/daaw/nl1$b;)Lcom/daaw/nl1$b;

    invoke-virtual {v0}, Lcom/daaw/bp0$a;->b()Z

    move-result v2

    if-eqz v2, :cond_8

    iget v2, v0, Lcom/daaw/bp0$a;->b:I

    iget-object v3, v8, Lcom/daaw/to0;->a:Lcom/daaw/nl1$b;

    invoke-virtual {v3, v2}, Lcom/daaw/nl1$b;->a(I)I

    move-result v3

    if-ne v3, v4, :cond_5

    return-object v5

    :cond_5
    iget-object v4, v8, Lcom/daaw/to0;->a:Lcom/daaw/nl1$b;

    iget v6, v0, Lcom/daaw/bp0$a;->c:I

    invoke-virtual {v4, v2, v6}, Lcom/daaw/nl1$b;->k(II)I

    move-result v4

    if-ge v4, v3, :cond_7

    iget-object v3, v8, Lcom/daaw/to0;->a:Lcom/daaw/nl1$b;

    invoke-virtual {v3, v2, v4}, Lcom/daaw/nl1$b;->n(II)Z

    move-result v3

    if-nez v3, :cond_6

    goto :goto_2

    :cond_6
    iget v3, v0, Lcom/daaw/bp0$a;->a:I

    iget-wide v5, v1, Lcom/daaw/so0;->d:J

    iget-wide v9, v0, Lcom/daaw/bp0$a;->d:J

    move-object/from16 v0, p0

    move v1, v3

    move v3, v4

    move-wide v4, v5

    move-wide v6, v9

    invoke-virtual/range {v0 .. v7}, Lcom/daaw/to0;->k(IIIJJ)Lcom/daaw/so0;

    move-result-object v5

    :goto_2
    return-object v5

    :cond_7
    iget v2, v0, Lcom/daaw/bp0$a;->a:I

    iget-wide v3, v1, Lcom/daaw/so0;->d:J

    iget-wide v5, v0, Lcom/daaw/bp0$a;->d:J

    move-object/from16 v0, p0

    move v1, v2

    move-wide v2, v3

    move-wide v4, v5

    invoke-virtual/range {v0 .. v5}, Lcom/daaw/to0;->l(IJJ)Lcom/daaw/so0;

    move-result-object v0

    return-object v0

    :cond_8
    iget-wide v6, v1, Lcom/daaw/so0;->c:J

    const-wide/high16 v9, -0x8000000000000000L

    cmp-long v2, v6, v9

    if-eqz v2, :cond_b

    iget-object v2, v8, Lcom/daaw/to0;->a:Lcom/daaw/nl1$b;

    invoke-virtual {v2, v6, v7}, Lcom/daaw/nl1$b;->e(J)I

    move-result v2

    if-ne v2, v4, :cond_9

    iget v2, v0, Lcom/daaw/bp0$a;->a:I

    iget-wide v3, v1, Lcom/daaw/so0;->c:J

    iget-wide v5, v0, Lcom/daaw/bp0$a;->d:J

    move-object/from16 v0, p0

    move v1, v2

    move-wide v2, v3

    move-wide v4, v5

    invoke-virtual/range {v0 .. v5}, Lcom/daaw/to0;->l(IJJ)Lcom/daaw/so0;

    move-result-object v0

    return-object v0

    :cond_9
    iget-object v3, v8, Lcom/daaw/to0;->a:Lcom/daaw/nl1$b;

    invoke-virtual {v3, v2}, Lcom/daaw/nl1$b;->j(I)I

    move-result v3

    iget-object v4, v8, Lcom/daaw/to0;->a:Lcom/daaw/nl1$b;

    invoke-virtual {v4, v2, v3}, Lcom/daaw/nl1$b;->n(II)Z

    move-result v4

    if-nez v4, :cond_a

    goto :goto_3

    :cond_a
    iget v4, v0, Lcom/daaw/bp0$a;->a:I

    iget-wide v5, v1, Lcom/daaw/so0;->c:J

    iget-wide v9, v0, Lcom/daaw/bp0$a;->d:J

    move-object/from16 v0, p0

    move v1, v4

    move-wide v4, v5

    move-wide v6, v9

    invoke-virtual/range {v0 .. v7}, Lcom/daaw/to0;->k(IIIJJ)Lcom/daaw/so0;

    move-result-object v5

    :goto_3
    return-object v5

    :cond_b
    iget-object v1, v8, Lcom/daaw/to0;->a:Lcom/daaw/nl1$b;

    invoke-virtual {v1}, Lcom/daaw/nl1$b;->c()I

    move-result v1

    if-nez v1, :cond_c

    return-object v5

    :cond_c
    add-int/lit8 v2, v1, -0x1

    iget-object v1, v8, Lcom/daaw/to0;->a:Lcom/daaw/nl1$b;

    invoke-virtual {v1, v2}, Lcom/daaw/nl1$b;->f(I)J

    move-result-wide v3

    cmp-long v1, v3, v9

    if-nez v1, :cond_f

    iget-object v1, v8, Lcom/daaw/to0;->a:Lcom/daaw/nl1$b;

    invoke-virtual {v1, v2}, Lcom/daaw/nl1$b;->m(I)Z

    move-result v1

    if-eqz v1, :cond_d

    goto :goto_4

    :cond_d
    iget-object v1, v8, Lcom/daaw/to0;->a:Lcom/daaw/nl1$b;

    invoke-virtual {v1, v2}, Lcom/daaw/nl1$b;->j(I)I

    move-result v3

    iget-object v1, v8, Lcom/daaw/to0;->a:Lcom/daaw/nl1$b;

    invoke-virtual {v1, v2, v3}, Lcom/daaw/nl1$b;->n(II)Z

    move-result v1

    if-nez v1, :cond_e

    return-object v5

    :cond_e
    iget-object v1, v8, Lcom/daaw/to0;->a:Lcom/daaw/nl1$b;

    invoke-virtual {v1}, Lcom/daaw/nl1$b;->i()J

    move-result-wide v4

    iget v1, v0, Lcom/daaw/bp0$a;->a:I

    iget-wide v6, v0, Lcom/daaw/bp0$a;->d:J

    move-object/from16 v0, p0

    invoke-virtual/range {v0 .. v7}, Lcom/daaw/to0;->k(IIIJJ)Lcom/daaw/so0;

    move-result-object v0

    return-object v0

    :cond_f
    :goto_4
    return-object v5
.end method

.method public h()Lcom/daaw/ro0;
    .locals 1

    invoke-virtual {p0}, Lcom/daaw/to0;->r()Z

    move-result v0

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/daaw/to0;->g:Lcom/daaw/ro0;

    goto :goto_0

    :cond_0
    iget-object v0, p0, Lcom/daaw/to0;->i:Lcom/daaw/ro0;

    :goto_0
    return-object v0
.end method

.method public i()Lcom/daaw/ro0;
    .locals 1

    iget-object v0, p0, Lcom/daaw/to0;->i:Lcom/daaw/ro0;

    return-object v0
.end method

.method public final j(Lcom/daaw/bp0$a;JJ)Lcom/daaw/so0;
    .locals 8

    iget-object v0, p0, Lcom/daaw/to0;->d:Lcom/daaw/nl1;

    iget v1, p1, Lcom/daaw/bp0$a;->a:I

    iget-object v2, p0, Lcom/daaw/to0;->a:Lcom/daaw/nl1$b;

    invoke-virtual {v0, v1, v2}, Lcom/daaw/nl1;->f(ILcom/daaw/nl1$b;)Lcom/daaw/nl1$b;

    invoke-virtual {p1}, Lcom/daaw/bp0$a;->b()Z

    move-result v0

    if-eqz v0, :cond_1

    iget-object p4, p0, Lcom/daaw/to0;->a:Lcom/daaw/nl1$b;

    iget p5, p1, Lcom/daaw/bp0$a;->b:I

    iget v0, p1, Lcom/daaw/bp0$a;->c:I

    invoke-virtual {p4, p5, v0}, Lcom/daaw/nl1$b;->n(II)Z

    move-result p4

    if-nez p4, :cond_0

    const/4 p1, 0x0

    return-object p1

    :cond_0
    iget v1, p1, Lcom/daaw/bp0$a;->a:I

    iget v2, p1, Lcom/daaw/bp0$a;->b:I

    iget v3, p1, Lcom/daaw/bp0$a;->c:I

    iget-wide v6, p1, Lcom/daaw/bp0$a;->d:J

    move-object v0, p0

    move-wide v4, p2

    invoke-virtual/range {v0 .. v7}, Lcom/daaw/to0;->k(IIIJJ)Lcom/daaw/so0;

    move-result-object p1

    return-object p1

    :cond_1
    iget v1, p1, Lcom/daaw/bp0$a;->a:I

    iget-wide v4, p1, Lcom/daaw/bp0$a;->d:J

    move-object v0, p0

    move-wide v2, p4

    invoke-virtual/range {v0 .. v5}, Lcom/daaw/to0;->l(IJJ)Lcom/daaw/so0;

    move-result-object p1

    return-object p1
.end method

.method public final k(IIIJJ)Lcom/daaw/so0;
    .locals 14

    move-object v0, p0

    new-instance v7, Lcom/daaw/bp0$a;

    move-object v1, v7

    move v2, p1

    move/from16 v3, p2

    move/from16 v4, p3

    move-wide/from16 v5, p6

    invoke-direct/range {v1 .. v6}, Lcom/daaw/bp0$a;-><init>(IIIJ)V

    const-wide/high16 v1, -0x8000000000000000L

    invoke-virtual {p0, v7, v1, v2}, Lcom/daaw/to0;->s(Lcom/daaw/bp0$a;J)Z

    move-result v11

    invoke-virtual {p0, v7, v11}, Lcom/daaw/to0;->t(Lcom/daaw/bp0$a;Z)Z

    move-result v12

    iget-object v1, v0, Lcom/daaw/to0;->d:Lcom/daaw/nl1;

    iget v2, v7, Lcom/daaw/bp0$a;->a:I

    iget-object v3, v0, Lcom/daaw/to0;->a:Lcom/daaw/nl1$b;

    invoke-virtual {v1, v2, v3}, Lcom/daaw/nl1;->f(ILcom/daaw/nl1$b;)Lcom/daaw/nl1$b;

    move-result-object v1

    iget v2, v7, Lcom/daaw/bp0$a;->b:I

    iget v3, v7, Lcom/daaw/bp0$a;->c:I

    invoke-virtual {v1, v2, v3}, Lcom/daaw/nl1$b;->b(II)J

    move-result-wide v9

    iget-object v1, v0, Lcom/daaw/to0;->a:Lcom/daaw/nl1$b;

    move/from16 v2, p2

    invoke-virtual {v1, v2}, Lcom/daaw/nl1$b;->j(I)I

    move-result v1

    move/from16 v2, p3

    if-ne v2, v1, :cond_0

    iget-object v1, v0, Lcom/daaw/to0;->a:Lcom/daaw/nl1$b;

    invoke-virtual {v1}, Lcom/daaw/nl1$b;->g()J

    move-result-wide v1

    goto :goto_0

    :cond_0
    const-wide/16 v1, 0x0

    :goto_0
    move-wide v3, v1

    new-instance v13, Lcom/daaw/so0;

    const-wide/high16 v5, -0x8000000000000000L

    move-object v1, v13

    move-object v2, v7

    move-wide/from16 v7, p4

    invoke-direct/range {v1 .. v12}, Lcom/daaw/so0;-><init>(Lcom/daaw/bp0$a;JJJJZZ)V

    return-object v13
.end method

.method public final l(IJJ)Lcom/daaw/so0;
    .locals 16

    move-object/from16 v0, p0

    new-instance v2, Lcom/daaw/bp0$a;

    move/from16 v1, p1

    move-wide/from16 v3, p4

    invoke-direct {v2, v1, v3, v4}, Lcom/daaw/bp0$a;-><init>(IJ)V

    iget-object v1, v0, Lcom/daaw/to0;->d:Lcom/daaw/nl1;

    iget v3, v2, Lcom/daaw/bp0$a;->a:I

    iget-object v4, v0, Lcom/daaw/to0;->a:Lcom/daaw/nl1$b;

    invoke-virtual {v1, v3, v4}, Lcom/daaw/nl1;->f(ILcom/daaw/nl1$b;)Lcom/daaw/nl1$b;

    iget-object v1, v0, Lcom/daaw/to0;->a:Lcom/daaw/nl1$b;

    move-wide/from16 v3, p2

    invoke-virtual {v1, v3, v4}, Lcom/daaw/nl1$b;->d(J)I

    move-result v1

    const-wide/high16 v5, -0x8000000000000000L

    const/4 v7, -0x1

    if-ne v1, v7, :cond_0

    move-wide v7, v5

    goto :goto_0

    :cond_0
    iget-object v7, v0, Lcom/daaw/to0;->a:Lcom/daaw/nl1$b;

    invoke-virtual {v7, v1}, Lcom/daaw/nl1$b;->f(I)J

    move-result-wide v7

    :goto_0
    invoke-virtual {v0, v2, v7, v8}, Lcom/daaw/to0;->s(Lcom/daaw/bp0$a;J)Z

    move-result v11

    invoke-virtual {v0, v2, v11}, Lcom/daaw/to0;->t(Lcom/daaw/bp0$a;Z)Z

    move-result v12

    cmp-long v1, v7, v5

    if-nez v1, :cond_1

    iget-object v1, v0, Lcom/daaw/to0;->a:Lcom/daaw/nl1$b;

    invoke-virtual {v1}, Lcom/daaw/nl1$b;->i()J

    move-result-wide v5

    move-wide v9, v5

    goto :goto_1

    :cond_1
    move-wide v9, v7

    :goto_1
    new-instance v13, Lcom/daaw/so0;

    const-wide v14, -0x7fffffffffffffffL    # -4.9E-324

    move-object v1, v13

    move-wide/from16 v3, p2

    move-wide v5, v7

    move-wide v7, v14

    invoke-direct/range {v1 .. v12}, Lcom/daaw/so0;-><init>(Lcom/daaw/bp0$a;JJJJZZ)V

    return-object v13
.end method

.method public m(JLcom/daaw/yw0;)Lcom/daaw/so0;
    .locals 1

    iget-object v0, p0, Lcom/daaw/to0;->i:Lcom/daaw/ro0;

    if-nez v0, :cond_0

    invoke-virtual {p0, p3}, Lcom/daaw/to0;->f(Lcom/daaw/yw0;)Lcom/daaw/so0;

    move-result-object p1

    goto :goto_0

    :cond_0
    invoke-virtual {p0, v0, p1, p2}, Lcom/daaw/to0;->g(Lcom/daaw/ro0;J)Lcom/daaw/so0;

    move-result-object p1

    :goto_0
    return-object p1
.end method

.method public n()Lcom/daaw/ro0;
    .locals 1

    iget-object v0, p0, Lcom/daaw/to0;->g:Lcom/daaw/ro0;

    return-object v0
.end method

.method public o()Lcom/daaw/ro0;
    .locals 1

    iget-object v0, p0, Lcom/daaw/to0;->h:Lcom/daaw/ro0;

    return-object v0
.end method

.method public p(Lcom/daaw/so0;I)Lcom/daaw/so0;
    .locals 1

    iget-object v0, p1, Lcom/daaw/so0;->a:Lcom/daaw/bp0$a;

    invoke-virtual {v0, p2}, Lcom/daaw/bp0$a;->a(I)Lcom/daaw/bp0$a;

    move-result-object p2

    invoke-virtual {p0, p1, p2}, Lcom/daaw/to0;->q(Lcom/daaw/so0;Lcom/daaw/bp0$a;)Lcom/daaw/so0;

    move-result-object p1

    return-object p1
.end method

.method public final q(Lcom/daaw/so0;Lcom/daaw/bp0$a;)Lcom/daaw/so0;
    .locals 13

    iget-wide v2, p1, Lcom/daaw/so0;->b:J

    iget-wide v4, p1, Lcom/daaw/so0;->c:J

    invoke-virtual {p0, p2, v4, v5}, Lcom/daaw/to0;->s(Lcom/daaw/bp0$a;J)Z

    move-result v10

    invoke-virtual {p0, p2, v10}, Lcom/daaw/to0;->t(Lcom/daaw/bp0$a;Z)Z

    move-result v11

    iget-object v0, p0, Lcom/daaw/to0;->d:Lcom/daaw/nl1;

    iget v1, p2, Lcom/daaw/bp0$a;->a:I

    iget-object v6, p0, Lcom/daaw/to0;->a:Lcom/daaw/nl1$b;

    invoke-virtual {v0, v1, v6}, Lcom/daaw/nl1;->f(ILcom/daaw/nl1$b;)Lcom/daaw/nl1$b;

    invoke-virtual {p2}, Lcom/daaw/bp0$a;->b()Z

    move-result v0

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/daaw/to0;->a:Lcom/daaw/nl1$b;

    iget v1, p2, Lcom/daaw/bp0$a;->b:I

    iget v6, p2, Lcom/daaw/bp0$a;->c:I

    invoke-virtual {v0, v1, v6}, Lcom/daaw/nl1$b;->b(II)J

    move-result-wide v0

    :goto_0
    move-wide v8, v0

    goto :goto_1

    :cond_0
    const-wide/high16 v0, -0x8000000000000000L

    cmp-long v6, v4, v0

    if-nez v6, :cond_1

    iget-object v0, p0, Lcom/daaw/to0;->a:Lcom/daaw/nl1$b;

    invoke-virtual {v0}, Lcom/daaw/nl1$b;->i()J

    move-result-wide v0

    goto :goto_0

    :cond_1
    move-wide v8, v4

    :goto_1
    new-instance v12, Lcom/daaw/so0;

    iget-wide v6, p1, Lcom/daaw/so0;->d:J

    move-object v0, v12

    move-object v1, p2

    invoke-direct/range {v0 .. v11}, Lcom/daaw/so0;-><init>(Lcom/daaw/bp0$a;JJJJZZ)V

    return-object v12
.end method

.method public r()Z
    .locals 1

    iget-object v0, p0, Lcom/daaw/to0;->g:Lcom/daaw/ro0;

    if-eqz v0, :cond_0

    const/4 v0, 0x1

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    return v0
.end method

.method public final s(Lcom/daaw/bp0$a;J)Z
    .locals 9

    iget-object v0, p0, Lcom/daaw/to0;->d:Lcom/daaw/nl1;

    iget v1, p1, Lcom/daaw/bp0$a;->a:I

    iget-object v2, p0, Lcom/daaw/to0;->a:Lcom/daaw/nl1$b;

    invoke-virtual {v0, v1, v2}, Lcom/daaw/nl1;->f(ILcom/daaw/nl1$b;)Lcom/daaw/nl1$b;

    move-result-object v0

    invoke-virtual {v0}, Lcom/daaw/nl1$b;->c()I

    move-result v0

    const/4 v1, 0x1

    if-nez v0, :cond_0

    return v1

    :cond_0
    sub-int/2addr v0, v1

    invoke-virtual {p1}, Lcom/daaw/bp0$a;->b()Z

    move-result v2

    iget-object v3, p0, Lcom/daaw/to0;->a:Lcom/daaw/nl1$b;

    invoke-virtual {v3, v0}, Lcom/daaw/nl1$b;->f(I)J

    move-result-wide v3

    const-wide/high16 v5, -0x8000000000000000L

    const/4 v7, 0x0

    cmp-long v8, v3, v5

    if-eqz v8, :cond_2

    if-nez v2, :cond_1

    cmp-long p1, p2, v5

    if-nez p1, :cond_1

    goto :goto_0

    :cond_1
    const/4 v1, 0x0

    :goto_0
    return v1

    :cond_2
    iget-object p2, p0, Lcom/daaw/to0;->a:Lcom/daaw/nl1$b;

    invoke-virtual {p2, v0}, Lcom/daaw/nl1$b;->a(I)I

    move-result p2

    const/4 p3, -0x1

    if-ne p2, p3, :cond_3

    return v7

    :cond_3
    if-eqz v2, :cond_4

    iget p3, p1, Lcom/daaw/bp0$a;->b:I

    if-ne p3, v0, :cond_4

    iget p1, p1, Lcom/daaw/bp0$a;->c:I

    add-int/lit8 p3, p2, -0x1

    if-ne p1, p3, :cond_4

    const/4 p1, 0x1

    goto :goto_1

    :cond_4
    const/4 p1, 0x0

    :goto_1
    if-nez p1, :cond_6

    if-nez v2, :cond_5

    iget-object p1, p0, Lcom/daaw/to0;->a:Lcom/daaw/nl1$b;

    invoke-virtual {p1, v0}, Lcom/daaw/nl1$b;->j(I)I

    move-result p1

    if-ne p1, p2, :cond_5

    goto :goto_2

    :cond_5
    const/4 v1, 0x0

    :cond_6
    :goto_2
    return v1
.end method

.method public final t(Lcom/daaw/bp0$a;Z)Z
    .locals 7

    iget-object v0, p0, Lcom/daaw/to0;->d:Lcom/daaw/nl1;

    iget v1, p1, Lcom/daaw/bp0$a;->a:I

    iget-object v2, p0, Lcom/daaw/to0;->a:Lcom/daaw/nl1$b;

    invoke-virtual {v0, v1, v2}, Lcom/daaw/nl1;->f(ILcom/daaw/nl1$b;)Lcom/daaw/nl1$b;

    move-result-object v0

    iget v0, v0, Lcom/daaw/nl1$b;->c:I

    iget-object v1, p0, Lcom/daaw/to0;->d:Lcom/daaw/nl1;

    iget-object v2, p0, Lcom/daaw/to0;->b:Lcom/daaw/nl1$c;

    invoke-virtual {v1, v0, v2}, Lcom/daaw/nl1;->k(ILcom/daaw/nl1$c;)Lcom/daaw/nl1$c;

    move-result-object v0

    iget-boolean v0, v0, Lcom/daaw/nl1$c;->e:Z

    if-nez v0, :cond_0

    iget-object v1, p0, Lcom/daaw/to0;->d:Lcom/daaw/nl1;

    iget v2, p1, Lcom/daaw/bp0$a;->a:I

    iget-object v3, p0, Lcom/daaw/to0;->a:Lcom/daaw/nl1$b;

    iget-object v4, p0, Lcom/daaw/to0;->b:Lcom/daaw/nl1$c;

    iget v5, p0, Lcom/daaw/to0;->e:I

    iget-boolean v6, p0, Lcom/daaw/to0;->f:Z

    invoke-virtual/range {v1 .. v6}, Lcom/daaw/nl1;->p(ILcom/daaw/nl1$b;Lcom/daaw/nl1$c;IZ)Z

    move-result p1

    if-eqz p1, :cond_0

    if-eqz p2, :cond_0

    const/4 p1, 0x1

    goto :goto_0

    :cond_0
    const/4 p1, 0x0

    :goto_0
    return p1
.end method

.method public u(Lcom/daaw/qo0;)Z
    .locals 1

    iget-object v0, p0, Lcom/daaw/to0;->i:Lcom/daaw/ro0;

    if-eqz v0, :cond_0

    iget-object v0, v0, Lcom/daaw/ro0;->a:Lcom/daaw/qo0;

    if-ne v0, p1, :cond_0

    const/4 p1, 0x1

    goto :goto_0

    :cond_0
    const/4 p1, 0x0

    :goto_0
    return p1
.end method

.method public v(J)V
    .locals 1

    iget-object v0, p0, Lcom/daaw/to0;->i:Lcom/daaw/ro0;

    if-eqz v0, :cond_0

    invoke-virtual {v0, p1, p2}, Lcom/daaw/ro0;->m(J)V

    :cond_0
    return-void
.end method

.method public w(Lcom/daaw/ro0;)Z
    .locals 3

    const/4 v0, 0x0

    const/4 v1, 0x1

    if-eqz p1, :cond_0

    const/4 v2, 0x1

    goto :goto_0

    :cond_0
    const/4 v2, 0x0

    :goto_0
    invoke-static {v2}, Lcom/daaw/s6;->f(Z)V

    iput-object p1, p0, Lcom/daaw/to0;->i:Lcom/daaw/ro0;

    :goto_1
    iget-object p1, p1, Lcom/daaw/ro0;->i:Lcom/daaw/ro0;

    if-eqz p1, :cond_2

    iget-object v2, p0, Lcom/daaw/to0;->h:Lcom/daaw/ro0;

    if-ne p1, v2, :cond_1

    iget-object v0, p0, Lcom/daaw/to0;->g:Lcom/daaw/ro0;

    iput-object v0, p0, Lcom/daaw/to0;->h:Lcom/daaw/ro0;

    const/4 v0, 0x1

    :cond_1
    invoke-virtual {p1}, Lcom/daaw/ro0;->n()V

    iget v2, p0, Lcom/daaw/to0;->j:I

    sub-int/2addr v2, v1

    iput v2, p0, Lcom/daaw/to0;->j:I

    goto :goto_1

    :cond_2
    iget-object p1, p0, Lcom/daaw/to0;->i:Lcom/daaw/ro0;

    const/4 v1, 0x0

    iput-object v1, p1, Lcom/daaw/ro0;->i:Lcom/daaw/ro0;

    return v0
.end method

.method public x(IJ)Lcom/daaw/bp0$a;
    .locals 6

    invoke-virtual {p0, p1}, Lcom/daaw/to0;->z(I)J

    move-result-wide v4

    move-object v0, p0

    move v1, p1

    move-wide v2, p2

    invoke-virtual/range {v0 .. v5}, Lcom/daaw/to0;->y(IJJ)Lcom/daaw/bp0$a;

    move-result-object p1

    return-object p1
.end method

.method public final y(IJJ)Lcom/daaw/bp0$a;
    .locals 7

    iget-object v0, p0, Lcom/daaw/to0;->d:Lcom/daaw/nl1;

    iget-object v1, p0, Lcom/daaw/to0;->a:Lcom/daaw/nl1$b;

    invoke-virtual {v0, p1, v1}, Lcom/daaw/nl1;->f(ILcom/daaw/nl1$b;)Lcom/daaw/nl1$b;

    iget-object v0, p0, Lcom/daaw/to0;->a:Lcom/daaw/nl1$b;

    invoke-virtual {v0, p2, p3}, Lcom/daaw/nl1$b;->e(J)I

    move-result v3

    const/4 p2, -0x1

    if-ne v3, p2, :cond_0

    new-instance p2, Lcom/daaw/bp0$a;

    invoke-direct {p2, p1, p4, p5}, Lcom/daaw/bp0$a;-><init>(IJ)V

    return-object p2

    :cond_0
    iget-object p2, p0, Lcom/daaw/to0;->a:Lcom/daaw/nl1$b;

    invoke-virtual {p2, v3}, Lcom/daaw/nl1$b;->j(I)I

    move-result v4

    new-instance p2, Lcom/daaw/bp0$a;

    move-object v1, p2

    move v2, p1

    move-wide v5, p4

    invoke-direct/range {v1 .. v6}, Lcom/daaw/bp0$a;-><init>(IIIJ)V

    return-object p2
.end method

.method public final z(I)J
    .locals 5

    iget-object v0, p0, Lcom/daaw/to0;->d:Lcom/daaw/nl1;

    iget-object v1, p0, Lcom/daaw/to0;->a:Lcom/daaw/nl1$b;

    const/4 v2, 0x1

    invoke-virtual {v0, p1, v1, v2}, Lcom/daaw/nl1;->g(ILcom/daaw/nl1$b;Z)Lcom/daaw/nl1$b;

    move-result-object p1

    iget-object p1, p1, Lcom/daaw/nl1$b;->b:Ljava/lang/Object;

    iget-object v0, p0, Lcom/daaw/to0;->a:Lcom/daaw/nl1$b;

    iget v0, v0, Lcom/daaw/nl1$b;->c:I

    iget-object v1, p0, Lcom/daaw/to0;->k:Ljava/lang/Object;

    const/4 v2, -0x1

    if-eqz v1, :cond_0

    iget-object v3, p0, Lcom/daaw/to0;->d:Lcom/daaw/nl1;

    invoke-virtual {v3, v1}, Lcom/daaw/nl1;->b(Ljava/lang/Object;)I

    move-result v1

    if-eq v1, v2, :cond_0

    iget-object v3, p0, Lcom/daaw/to0;->d:Lcom/daaw/nl1;

    iget-object v4, p0, Lcom/daaw/to0;->a:Lcom/daaw/nl1$b;

    invoke-virtual {v3, v1, v4}, Lcom/daaw/nl1;->f(ILcom/daaw/nl1$b;)Lcom/daaw/nl1$b;

    move-result-object v1

    iget v1, v1, Lcom/daaw/nl1$b;->c:I

    if-ne v1, v0, :cond_0

    iget-wide v0, p0, Lcom/daaw/to0;->l:J

    return-wide v0

    :cond_0
    invoke-virtual {p0}, Lcom/daaw/to0;->h()Lcom/daaw/ro0;

    move-result-object v1

    :goto_0
    if-eqz v1, :cond_2

    iget-object v3, v1, Lcom/daaw/ro0;->b:Ljava/lang/Object;

    invoke-virtual {v3, p1}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result v3

    if-eqz v3, :cond_1

    iget-object p1, v1, Lcom/daaw/ro0;->h:Lcom/daaw/so0;

    iget-object p1, p1, Lcom/daaw/so0;->a:Lcom/daaw/bp0$a;

    iget-wide v0, p1, Lcom/daaw/bp0$a;->d:J

    return-wide v0

    :cond_1
    iget-object v1, v1, Lcom/daaw/ro0;->i:Lcom/daaw/ro0;

    goto :goto_0

    :cond_2
    invoke-virtual {p0}, Lcom/daaw/to0;->h()Lcom/daaw/ro0;

    move-result-object p1

    :goto_1
    if-eqz p1, :cond_4

    iget-object v1, p0, Lcom/daaw/to0;->d:Lcom/daaw/nl1;

    iget-object v3, p1, Lcom/daaw/ro0;->b:Ljava/lang/Object;

    invoke-virtual {v1, v3}, Lcom/daaw/nl1;->b(Ljava/lang/Object;)I

    move-result v1

    if-eq v1, v2, :cond_3

    iget-object v3, p0, Lcom/daaw/to0;->d:Lcom/daaw/nl1;

    iget-object v4, p0, Lcom/daaw/to0;->a:Lcom/daaw/nl1$b;

    invoke-virtual {v3, v1, v4}, Lcom/daaw/nl1;->f(ILcom/daaw/nl1$b;)Lcom/daaw/nl1$b;

    move-result-object v1

    iget v1, v1, Lcom/daaw/nl1$b;->c:I

    if-ne v1, v0, :cond_3

    iget-object p1, p1, Lcom/daaw/ro0;->h:Lcom/daaw/so0;

    iget-object p1, p1, Lcom/daaw/so0;->a:Lcom/daaw/bp0$a;

    iget-wide v0, p1, Lcom/daaw/bp0$a;->d:J

    return-wide v0

    :cond_3
    iget-object p1, p1, Lcom/daaw/ro0;->i:Lcom/daaw/ro0;

    goto :goto_1

    :cond_4
    iget-wide v0, p0, Lcom/daaw/to0;->c:J

    const-wide/16 v2, 0x1

    add-long/2addr v2, v0

    iput-wide v2, p0, Lcom/daaw/to0;->c:J

    return-wide v0
.end method
