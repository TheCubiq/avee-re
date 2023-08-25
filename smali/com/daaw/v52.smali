.class public final Lcom/daaw/v52;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Lcom/daaw/j09;


# static fields
.field public static final q:Lcom/daaw/q09;


# instance fields
.field public final a:Lcom/daaw/ik5;

.field public final b:Lcom/daaw/ik5;

.field public final c:Lcom/daaw/ik5;

.field public final d:Lcom/daaw/ik5;

.field public final e:Lcom/daaw/w52;

.field public f:Lcom/daaw/m09;

.field public g:I

.field public h:Z

.field public i:J

.field public j:I

.field public k:I

.field public l:I

.field public m:J

.field public n:Z

.field public o:Lcom/daaw/t52;

.field public p:Lcom/daaw/z52;


# direct methods
.method public static constructor <clinit>()V
    .locals 1

    sget-object v0, Lcom/daaw/u52;->b:Lcom/daaw/u52;

    sput-object v0, Lcom/daaw/v52;->q:Lcom/daaw/q09;

    return-void
.end method

.method public constructor <init>()V
    .locals 2

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    new-instance v0, Lcom/daaw/ik5;

    const/4 v1, 0x4

    invoke-direct {v0, v1}, Lcom/daaw/ik5;-><init>(I)V

    iput-object v0, p0, Lcom/daaw/v52;->a:Lcom/daaw/ik5;

    new-instance v0, Lcom/daaw/ik5;

    const/16 v1, 0x9

    invoke-direct {v0, v1}, Lcom/daaw/ik5;-><init>(I)V

    iput-object v0, p0, Lcom/daaw/v52;->b:Lcom/daaw/ik5;

    new-instance v0, Lcom/daaw/ik5;

    const/16 v1, 0xb

    invoke-direct {v0, v1}, Lcom/daaw/ik5;-><init>(I)V

    iput-object v0, p0, Lcom/daaw/v52;->c:Lcom/daaw/ik5;

    new-instance v0, Lcom/daaw/ik5;

    invoke-direct {v0}, Lcom/daaw/ik5;-><init>()V

    iput-object v0, p0, Lcom/daaw/v52;->d:Lcom/daaw/ik5;

    new-instance v0, Lcom/daaw/w52;

    invoke-direct {v0}, Lcom/daaw/w52;-><init>()V

    iput-object v0, p0, Lcom/daaw/v52;->e:Lcom/daaw/w52;

    const/4 v0, 0x1

    iput v0, p0, Lcom/daaw/v52;->g:I

    return-void
.end method


# virtual methods
.method public final a(Lcom/daaw/k09;)Z
    .locals 4

    iget-object v0, p0, Lcom/daaw/v52;->a:Lcom/daaw/ik5;

    invoke-virtual {v0}, Lcom/daaw/ik5;->h()[B

    move-result-object v0

    move-object v1, p1

    check-cast v1, Lcom/daaw/rz8;

    const/4 v2, 0x0

    const/4 v3, 0x3

    invoke-virtual {v1, v0, v2, v3, v2}, Lcom/daaw/rz8;->h([BIIZ)Z

    iget-object v0, p0, Lcom/daaw/v52;->a:Lcom/daaw/ik5;

    invoke-virtual {v0, v2}, Lcom/daaw/ik5;->f(I)V

    iget-object v0, p0, Lcom/daaw/v52;->a:Lcom/daaw/ik5;

    invoke-virtual {v0}, Lcom/daaw/ik5;->u()I

    move-result v0

    const v3, 0x464c56

    if-eq v0, v3, :cond_0

    return v2

    :cond_0
    iget-object v0, p0, Lcom/daaw/v52;->a:Lcom/daaw/ik5;

    invoke-virtual {v0}, Lcom/daaw/ik5;->h()[B

    move-result-object v0

    const/4 v3, 0x2

    invoke-virtual {v1, v0, v2, v3, v2}, Lcom/daaw/rz8;->h([BIIZ)Z

    iget-object v0, p0, Lcom/daaw/v52;->a:Lcom/daaw/ik5;

    invoke-virtual {v0, v2}, Lcom/daaw/ik5;->f(I)V

    iget-object v0, p0, Lcom/daaw/v52;->a:Lcom/daaw/ik5;

    invoke-virtual {v0}, Lcom/daaw/ik5;->w()I

    move-result v0

    and-int/lit16 v0, v0, 0xfa

    if-eqz v0, :cond_1

    return v2

    :cond_1
    iget-object v0, p0, Lcom/daaw/v52;->a:Lcom/daaw/ik5;

    invoke-virtual {v0}, Lcom/daaw/ik5;->h()[B

    move-result-object v0

    const/4 v3, 0x4

    invoke-virtual {v1, v0, v2, v3, v2}, Lcom/daaw/rz8;->h([BIIZ)Z

    iget-object v0, p0, Lcom/daaw/v52;->a:Lcom/daaw/ik5;

    invoke-virtual {v0, v2}, Lcom/daaw/ik5;->f(I)V

    iget-object v0, p0, Lcom/daaw/v52;->a:Lcom/daaw/ik5;

    invoke-virtual {v0}, Lcom/daaw/ik5;->m()I

    move-result v0

    invoke-interface {p1}, Lcom/daaw/k09;->zzj()V

    check-cast p1, Lcom/daaw/rz8;

    invoke-virtual {p1, v0, v2}, Lcom/daaw/rz8;->k(IZ)Z

    iget-object v0, p0, Lcom/daaw/v52;->a:Lcom/daaw/ik5;

    invoke-virtual {v0}, Lcom/daaw/ik5;->h()[B

    move-result-object v0

    invoke-virtual {p1, v0, v2, v3, v2}, Lcom/daaw/rz8;->h([BIIZ)Z

    iget-object p1, p0, Lcom/daaw/v52;->a:Lcom/daaw/ik5;

    invoke-virtual {p1, v2}, Lcom/daaw/ik5;->f(I)V

    iget-object p1, p0, Lcom/daaw/v52;->a:Lcom/daaw/ik5;

    invoke-virtual {p1}, Lcom/daaw/ik5;->m()I

    move-result p1

    if-nez p1, :cond_2

    const/4 p1, 0x1

    return p1

    :cond_2
    return v2
.end method

.method public final b(Lcom/daaw/k09;)Lcom/daaw/ik5;
    .locals 4

    iget v0, p0, Lcom/daaw/v52;->l:I

    iget-object v1, p0, Lcom/daaw/v52;->d:Lcom/daaw/ik5;

    invoke-virtual {v1}, Lcom/daaw/ik5;->j()I

    move-result v1

    const/4 v2, 0x0

    if-le v0, v1, :cond_0

    iget-object v0, p0, Lcom/daaw/v52;->d:Lcom/daaw/ik5;

    invoke-virtual {v0}, Lcom/daaw/ik5;->j()I

    move-result v1

    add-int/2addr v1, v1

    iget v3, p0, Lcom/daaw/v52;->l:I

    invoke-static {v1, v3}, Ljava/lang/Math;->max(II)I

    move-result v1

    new-array v1, v1, [B

    invoke-virtual {v0, v1, v2}, Lcom/daaw/ik5;->d([BI)V

    goto :goto_0

    :cond_0
    iget-object v0, p0, Lcom/daaw/v52;->d:Lcom/daaw/ik5;

    invoke-virtual {v0, v2}, Lcom/daaw/ik5;->f(I)V

    :goto_0
    iget-object v0, p0, Lcom/daaw/v52;->d:Lcom/daaw/ik5;

    iget v1, p0, Lcom/daaw/v52;->l:I

    invoke-virtual {v0, v1}, Lcom/daaw/ik5;->e(I)V

    iget-object v0, p0, Lcom/daaw/v52;->d:Lcom/daaw/ik5;

    invoke-virtual {v0}, Lcom/daaw/ik5;->h()[B

    move-result-object v0

    iget v1, p0, Lcom/daaw/v52;->l:I

    check-cast p1, Lcom/daaw/rz8;

    invoke-virtual {p1, v0, v2, v1, v2}, Lcom/daaw/rz8;->e([BIIZ)Z

    iget-object p1, p0, Lcom/daaw/v52;->d:Lcom/daaw/ik5;

    return-object p1
.end method

.method public final c(Lcom/daaw/m09;)V
    .locals 0

    iput-object p1, p0, Lcom/daaw/v52;->f:Lcom/daaw/m09;

    return-void
.end method

.method public final d(Lcom/daaw/k09;Lcom/daaw/f42;)I
    .locals 16

    move-object/from16 v0, p0

    move-object/from16 v1, p1

    iget-object v2, v0, Lcom/daaw/v52;->f:Lcom/daaw/m09;

    invoke-static {v2}, Lcom/daaw/uo4;->b(Ljava/lang/Object;)Ljava/lang/Object;

    :cond_0
    :goto_0
    iget v2, v0, Lcom/daaw/v52;->g:I

    const/4 v3, -0x1

    const/16 v4, 0x8

    const/16 v5, 0x9

    const/4 v6, 0x2

    const/4 v7, 0x4

    const/4 v8, 0x0

    const/4 v9, 0x1

    if-eq v2, v9, :cond_e

    const/4 v10, 0x3

    if-eq v2, v6, :cond_d

    if-eq v2, v10, :cond_b

    if-ne v2, v7, :cond_a

    iget-boolean v2, v0, Lcom/daaw/v52;->h:Z

    const-wide v12, -0x7fffffffffffffffL    # -4.9E-324

    if-eqz v2, :cond_1

    iget-wide v2, v0, Lcom/daaw/v52;->i:J

    iget-wide v14, v0, Lcom/daaw/v52;->m:J

    add-long/2addr v2, v14

    goto :goto_1

    :cond_1
    iget-object v2, v0, Lcom/daaw/v52;->e:Lcom/daaw/w52;

    invoke-virtual {v2}, Lcom/daaw/w52;->d()J

    move-result-wide v2

    cmp-long v14, v2, v12

    if-nez v14, :cond_2

    const-wide/16 v2, 0x0

    goto :goto_1

    :cond_2
    iget-wide v2, v0, Lcom/daaw/v52;->m:J

    :goto_1
    iget v14, v0, Lcom/daaw/v52;->k:I

    if-ne v14, v4, :cond_4

    iget-object v14, v0, Lcom/daaw/v52;->o:Lcom/daaw/t52;

    if-eqz v14, :cond_5

    invoke-virtual/range {p0 .. p0}, Lcom/daaw/v52;->e()V

    iget-object v4, v0, Lcom/daaw/v52;->o:Lcom/daaw/t52;

    :goto_2
    invoke-virtual/range {p0 .. p1}, Lcom/daaw/v52;->b(Lcom/daaw/k09;)Lcom/daaw/ik5;

    move-result-object v5

    invoke-virtual {v4, v5, v2, v3}, Lcom/daaw/y52;->c(Lcom/daaw/ik5;J)Z

    move-result v2

    :cond_3
    :goto_3
    const/4 v3, 0x1

    goto :goto_4

    :cond_4
    move v4, v14

    :cond_5
    if-ne v4, v5, :cond_6

    iget-object v4, v0, Lcom/daaw/v52;->p:Lcom/daaw/z52;

    if-eqz v4, :cond_7

    invoke-virtual/range {p0 .. p0}, Lcom/daaw/v52;->e()V

    iget-object v4, v0, Lcom/daaw/v52;->p:Lcom/daaw/z52;

    goto :goto_2

    :cond_6
    const/16 v5, 0x12

    if-ne v4, v5, :cond_7

    iget-boolean v4, v0, Lcom/daaw/v52;->n:Z

    if-nez v4, :cond_7

    iget-object v4, v0, Lcom/daaw/v52;->e:Lcom/daaw/w52;

    invoke-virtual/range {p0 .. p1}, Lcom/daaw/v52;->b(Lcom/daaw/k09;)Lcom/daaw/ik5;

    move-result-object v5

    invoke-virtual {v4, v5, v2, v3}, Lcom/daaw/y52;->c(Lcom/daaw/ik5;J)Z

    move-result v2

    iget-object v3, v0, Lcom/daaw/v52;->e:Lcom/daaw/w52;

    invoke-virtual {v3}, Lcom/daaw/w52;->d()J

    move-result-wide v4

    cmp-long v14, v4, v12

    if-eqz v14, :cond_3

    iget-object v14, v0, Lcom/daaw/v52;->f:Lcom/daaw/m09;

    new-instance v15, Lcom/daaw/x32;

    invoke-virtual {v3}, Lcom/daaw/w52;->e()[J

    move-result-object v10

    invoke-virtual {v3}, Lcom/daaw/w52;->f()[J

    move-result-object v3

    invoke-direct {v15, v10, v3, v4, v5}, Lcom/daaw/x32;-><init>([J[JJ)V

    invoke-interface {v14, v15}, Lcom/daaw/m09;->i(Lcom/daaw/i42;)V

    iput-boolean v9, v0, Lcom/daaw/v52;->n:Z

    goto :goto_3

    :cond_7
    iget v2, v0, Lcom/daaw/v52;->l:I

    move-object v3, v1

    check-cast v3, Lcom/daaw/rz8;

    invoke-virtual {v3, v2, v8}, Lcom/daaw/rz8;->l(IZ)Z

    const/4 v2, 0x0

    const/4 v3, 0x0

    :goto_4
    iget-boolean v4, v0, Lcom/daaw/v52;->h:Z

    if-nez v4, :cond_9

    if-eqz v2, :cond_9

    iput-boolean v9, v0, Lcom/daaw/v52;->h:Z

    iget-object v2, v0, Lcom/daaw/v52;->e:Lcom/daaw/w52;

    invoke-virtual {v2}, Lcom/daaw/w52;->d()J

    move-result-wide v4

    cmp-long v2, v4, v12

    if-nez v2, :cond_8

    iget-wide v4, v0, Lcom/daaw/v52;->m:J

    neg-long v10, v4

    goto :goto_5

    :cond_8
    const-wide/16 v10, 0x0

    :goto_5
    iput-wide v10, v0, Lcom/daaw/v52;->i:J

    :cond_9
    iput v7, v0, Lcom/daaw/v52;->j:I

    iput v6, v0, Lcom/daaw/v52;->g:I

    if-eqz v3, :cond_0

    return v8

    :cond_a
    new-instance v1, Ljava/lang/IllegalStateException;

    invoke-direct {v1}, Ljava/lang/IllegalStateException;-><init>()V

    throw v1

    :cond_b
    iget-object v2, v0, Lcom/daaw/v52;->c:Lcom/daaw/ik5;

    invoke-virtual {v2}, Lcom/daaw/ik5;->h()[B

    move-result-object v2

    const/16 v4, 0xb

    invoke-interface {v1, v2, v8, v4, v9}, Lcom/daaw/k09;->e([BIIZ)Z

    move-result v2

    if-nez v2, :cond_c

    return v3

    :cond_c
    iget-object v2, v0, Lcom/daaw/v52;->c:Lcom/daaw/ik5;

    invoke-virtual {v2, v8}, Lcom/daaw/ik5;->f(I)V

    iget-object v2, v0, Lcom/daaw/v52;->c:Lcom/daaw/ik5;

    invoke-virtual {v2}, Lcom/daaw/ik5;->s()I

    move-result v2

    iput v2, v0, Lcom/daaw/v52;->k:I

    iget-object v2, v0, Lcom/daaw/v52;->c:Lcom/daaw/ik5;

    invoke-virtual {v2}, Lcom/daaw/ik5;->u()I

    move-result v2

    iput v2, v0, Lcom/daaw/v52;->l:I

    iget-object v2, v0, Lcom/daaw/v52;->c:Lcom/daaw/ik5;

    invoke-virtual {v2}, Lcom/daaw/ik5;->u()I

    move-result v2

    int-to-long v2, v2

    iput-wide v2, v0, Lcom/daaw/v52;->m:J

    iget-object v2, v0, Lcom/daaw/v52;->c:Lcom/daaw/ik5;

    invoke-virtual {v2}, Lcom/daaw/ik5;->s()I

    move-result v2

    shl-int/lit8 v2, v2, 0x18

    int-to-long v2, v2

    iget-wide v4, v0, Lcom/daaw/v52;->m:J

    or-long/2addr v2, v4

    const-wide/16 v4, 0x3e8

    mul-long v2, v2, v4

    iput-wide v2, v0, Lcom/daaw/v52;->m:J

    iget-object v2, v0, Lcom/daaw/v52;->c:Lcom/daaw/ik5;

    invoke-virtual {v2, v10}, Lcom/daaw/ik5;->g(I)V

    iput v7, v0, Lcom/daaw/v52;->g:I

    goto/16 :goto_0

    :cond_d
    iget v2, v0, Lcom/daaw/v52;->j:I

    move-object v3, v1

    check-cast v3, Lcom/daaw/rz8;

    invoke-virtual {v3, v2, v8}, Lcom/daaw/rz8;->l(IZ)Z

    iput v8, v0, Lcom/daaw/v52;->j:I

    iput v10, v0, Lcom/daaw/v52;->g:I

    goto/16 :goto_0

    :cond_e
    iget-object v2, v0, Lcom/daaw/v52;->b:Lcom/daaw/ik5;

    invoke-virtual {v2}, Lcom/daaw/ik5;->h()[B

    move-result-object v2

    invoke-interface {v1, v2, v8, v5, v9}, Lcom/daaw/k09;->e([BIIZ)Z

    move-result v2

    if-nez v2, :cond_f

    return v3

    :cond_f
    iget-object v2, v0, Lcom/daaw/v52;->b:Lcom/daaw/ik5;

    invoke-virtual {v2, v8}, Lcom/daaw/ik5;->f(I)V

    iget-object v2, v0, Lcom/daaw/v52;->b:Lcom/daaw/ik5;

    invoke-virtual {v2, v7}, Lcom/daaw/ik5;->g(I)V

    iget-object v2, v0, Lcom/daaw/v52;->b:Lcom/daaw/ik5;

    invoke-virtual {v2}, Lcom/daaw/ik5;->s()I

    move-result v2

    and-int/lit8 v3, v2, 0x1

    and-int/2addr v2, v7

    if-eqz v2, :cond_10

    iget-object v2, v0, Lcom/daaw/v52;->o:Lcom/daaw/t52;

    if-nez v2, :cond_10

    new-instance v2, Lcom/daaw/t52;

    iget-object v7, v0, Lcom/daaw/v52;->f:Lcom/daaw/m09;

    invoke-interface {v7, v4, v9}, Lcom/daaw/m09;->n(II)Lcom/daaw/m42;

    move-result-object v4

    invoke-direct {v2, v4}, Lcom/daaw/t52;-><init>(Lcom/daaw/m42;)V

    iput-object v2, v0, Lcom/daaw/v52;->o:Lcom/daaw/t52;

    :cond_10
    if-eqz v3, :cond_11

    iget-object v2, v0, Lcom/daaw/v52;->p:Lcom/daaw/z52;

    if-nez v2, :cond_11

    new-instance v2, Lcom/daaw/z52;

    iget-object v3, v0, Lcom/daaw/v52;->f:Lcom/daaw/m09;

    invoke-interface {v3, v5, v6}, Lcom/daaw/m09;->n(II)Lcom/daaw/m42;

    move-result-object v3

    invoke-direct {v2, v3}, Lcom/daaw/z52;-><init>(Lcom/daaw/m42;)V

    iput-object v2, v0, Lcom/daaw/v52;->p:Lcom/daaw/z52;

    :cond_11
    iget-object v2, v0, Lcom/daaw/v52;->f:Lcom/daaw/m09;

    invoke-interface {v2}, Lcom/daaw/m09;->zzC()V

    iget-object v2, v0, Lcom/daaw/v52;->b:Lcom/daaw/ik5;

    invoke-virtual {v2}, Lcom/daaw/ik5;->m()I

    move-result v2

    add-int/lit8 v2, v2, -0x5

    iput v2, v0, Lcom/daaw/v52;->j:I

    iput v6, v0, Lcom/daaw/v52;->g:I

    goto/16 :goto_0
.end method

.method public final e()V
    .locals 6
    .annotation runtime Lorg/checkerframework/checker/nullness/qual/RequiresNonNull;
        value = {
            "extractorOutput"
        }
    .end annotation

    iget-boolean v0, p0, Lcom/daaw/v52;->n:Z

    if-nez v0, :cond_0

    iget-object v0, p0, Lcom/daaw/v52;->f:Lcom/daaw/m09;

    new-instance v1, Lcom/daaw/h42;

    const-wide v2, -0x7fffffffffffffffL    # -4.9E-324

    const-wide/16 v4, 0x0

    invoke-direct {v1, v2, v3, v4, v5}, Lcom/daaw/h42;-><init>(JJ)V

    invoke-interface {v0, v1}, Lcom/daaw/m09;->i(Lcom/daaw/i42;)V

    const/4 v0, 0x1

    iput-boolean v0, p0, Lcom/daaw/v52;->n:Z

    :cond_0
    return-void
.end method

.method public final f(JJ)V
    .locals 2

    const/4 p3, 0x0

    const-wide/16 v0, 0x0

    cmp-long p4, p1, v0

    if-nez p4, :cond_0

    const/4 p1, 0x1

    iput p1, p0, Lcom/daaw/v52;->g:I

    iput-boolean p3, p0, Lcom/daaw/v52;->h:Z

    goto :goto_0

    :cond_0
    const/4 p1, 0x3

    iput p1, p0, Lcom/daaw/v52;->g:I

    :goto_0
    iput p3, p0, Lcom/daaw/v52;->j:I

    return-void
.end method
