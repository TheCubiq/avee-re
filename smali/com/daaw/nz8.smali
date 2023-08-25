.class public Lcom/daaw/nz8;
.super Ljava/lang/Object;
.source ""


# instance fields
.field public final a:Lcom/daaw/hz8;

.field public final b:Lcom/daaw/mz8;

.field public c:Lcom/daaw/jz8;

.field public final d:I


# direct methods
.method public constructor <init>(Lcom/daaw/kz8;Lcom/daaw/mz8;JJJJJJI)V
    .locals 16

    move-object/from16 v0, p0

    invoke-direct/range {p0 .. p0}, Ljava/lang/Object;-><init>()V

    move-object/from16 v1, p2

    iput-object v1, v0, Lcom/daaw/nz8;->b:Lcom/daaw/mz8;

    move/from16 v1, p15

    iput v1, v0, Lcom/daaw/nz8;->d:I

    new-instance v15, Lcom/daaw/hz8;

    const-wide/16 v5, 0x0

    move-object v1, v15

    move-object/from16 v2, p1

    move-wide/from16 v3, p3

    move-wide/from16 v7, p7

    move-wide/from16 v9, p9

    move-wide/from16 v11, p11

    move-wide/from16 v13, p13

    invoke-direct/range {v1 .. v14}, Lcom/daaw/hz8;-><init>(Lcom/daaw/kz8;JJJJJJ)V

    iput-object v15, v0, Lcom/daaw/nz8;->a:Lcom/daaw/hz8;

    return-void
.end method

.method public static final f(Lcom/daaw/k09;JLcom/daaw/f42;)I
    .locals 2

    invoke-interface {p0}, Lcom/daaw/k09;->zzf()J

    move-result-wide v0

    cmp-long p0, p1, v0

    if-nez p0, :cond_0

    const/4 p0, 0x0

    return p0

    :cond_0
    iput-wide p1, p3, Lcom/daaw/f42;->a:J

    const/4 p0, 0x1

    return p0
.end method

.method public static final g(Lcom/daaw/k09;J)Z
    .locals 4

    invoke-interface {p0}, Lcom/daaw/k09;->zzf()J

    move-result-wide v0

    sub-long/2addr p1, v0

    const/4 v0, 0x0

    const-wide/16 v1, 0x0

    cmp-long v3, p1, v1

    if-ltz v3, :cond_0

    const-wide/32 v1, 0x40000

    cmp-long v3, p1, v1

    if-gtz v3, :cond_0

    check-cast p0, Lcom/daaw/rz8;

    long-to-int p2, p1

    invoke-virtual {p0, p2, v0}, Lcom/daaw/rz8;->l(IZ)Z

    const/4 p0, 0x1

    return p0

    :cond_0
    return v0
.end method


# virtual methods
.method public final a(Lcom/daaw/k09;Lcom/daaw/f42;)I
    .locals 11

    :goto_0
    iget-object v0, p0, Lcom/daaw/nz8;->c:Lcom/daaw/jz8;

    invoke-static {v0}, Lcom/daaw/uo4;->b(Ljava/lang/Object;)Ljava/lang/Object;

    invoke-static {v0}, Lcom/daaw/jz8;->b(Lcom/daaw/jz8;)J

    move-result-wide v1

    invoke-static {v0}, Lcom/daaw/jz8;->a(Lcom/daaw/jz8;)J

    move-result-wide v3

    invoke-static {v0}, Lcom/daaw/jz8;->c(Lcom/daaw/jz8;)J

    move-result-wide v5

    sub-long/2addr v3, v1

    iget v7, p0, Lcom/daaw/nz8;->d:I

    int-to-long v7, v7

    const/4 v9, 0x0

    cmp-long v10, v3, v7

    if-gtz v10, :cond_0

    invoke-virtual {p0, v9, v1, v2}, Lcom/daaw/nz8;->c(ZJ)V

    invoke-static {p1, v1, v2, p2}, Lcom/daaw/nz8;->f(Lcom/daaw/k09;JLcom/daaw/f42;)I

    move-result p1

    return p1

    :cond_0
    invoke-static {p1, v5, v6}, Lcom/daaw/nz8;->g(Lcom/daaw/k09;J)Z

    move-result v1

    if-nez v1, :cond_1

    invoke-static {p1, v5, v6, p2}, Lcom/daaw/nz8;->f(Lcom/daaw/k09;JLcom/daaw/f42;)I

    move-result p1

    return p1

    :cond_1
    invoke-interface {p1}, Lcom/daaw/k09;->zzj()V

    iget-object v1, p0, Lcom/daaw/nz8;->b:Lcom/daaw/mz8;

    invoke-static {v0}, Lcom/daaw/jz8;->e(Lcom/daaw/jz8;)J

    move-result-wide v2

    invoke-interface {v1, p1, v2, v3}, Lcom/daaw/mz8;->a(Lcom/daaw/k09;J)Lcom/daaw/lz8;

    move-result-object v1

    invoke-static {v1}, Lcom/daaw/lz8;->a(Lcom/daaw/lz8;)I

    move-result v2

    const/4 v3, -0x3

    if-eq v2, v3, :cond_4

    const/4 v3, -0x2

    if-eq v2, v3, :cond_3

    const/4 v3, -0x1

    if-eq v2, v3, :cond_2

    invoke-static {v1}, Lcom/daaw/lz8;->b(Lcom/daaw/lz8;)J

    move-result-wide v2

    invoke-static {p1, v2, v3}, Lcom/daaw/nz8;->g(Lcom/daaw/k09;J)Z

    const/4 v0, 0x1

    invoke-static {v1}, Lcom/daaw/lz8;->b(Lcom/daaw/lz8;)J

    move-result-wide v2

    invoke-virtual {p0, v0, v2, v3}, Lcom/daaw/nz8;->c(ZJ)V

    invoke-static {v1}, Lcom/daaw/lz8;->b(Lcom/daaw/lz8;)J

    move-result-wide v0

    invoke-static {p1, v0, v1, p2}, Lcom/daaw/nz8;->f(Lcom/daaw/k09;JLcom/daaw/f42;)I

    move-result p1

    return p1

    :cond_2
    invoke-static {v1}, Lcom/daaw/lz8;->c(Lcom/daaw/lz8;)J

    move-result-wide v2

    invoke-static {v1}, Lcom/daaw/lz8;->b(Lcom/daaw/lz8;)J

    move-result-wide v4

    invoke-static {v0, v2, v3, v4, v5}, Lcom/daaw/jz8;->g(Lcom/daaw/jz8;JJ)V

    goto :goto_0

    :cond_3
    invoke-static {v1}, Lcom/daaw/lz8;->c(Lcom/daaw/lz8;)J

    move-result-wide v2

    invoke-static {v1}, Lcom/daaw/lz8;->b(Lcom/daaw/lz8;)J

    move-result-wide v4

    invoke-static {v0, v2, v3, v4, v5}, Lcom/daaw/jz8;->h(Lcom/daaw/jz8;JJ)V

    goto :goto_0

    :cond_4
    invoke-virtual {p0, v9, v5, v6}, Lcom/daaw/nz8;->c(ZJ)V

    invoke-static {p1, v5, v6, p2}, Lcom/daaw/nz8;->f(Lcom/daaw/k09;JLcom/daaw/f42;)I

    move-result p1

    return p1
.end method

.method public final b()Lcom/daaw/i42;
    .locals 1

    iget-object v0, p0, Lcom/daaw/nz8;->a:Lcom/daaw/hz8;

    return-object v0
.end method

.method public final c(ZJ)V
    .locals 0

    const/4 p1, 0x0

    iput-object p1, p0, Lcom/daaw/nz8;->c:Lcom/daaw/jz8;

    iget-object p1, p0, Lcom/daaw/nz8;->b:Lcom/daaw/mz8;

    invoke-interface {p1}, Lcom/daaw/mz8;->zzb()V

    return-void
.end method

.method public final d(J)V
    .locals 18

    move-object/from16 v0, p0

    move-wide/from16 v2, p1

    iget-object v1, v0, Lcom/daaw/nz8;->c:Lcom/daaw/jz8;

    if-eqz v1, :cond_0

    invoke-static {v1}, Lcom/daaw/jz8;->d(Lcom/daaw/jz8;)J

    move-result-wide v4

    cmp-long v1, v4, v2

    if-nez v1, :cond_0

    return-void

    :cond_0
    new-instance v14, Lcom/daaw/jz8;

    iget-object v1, v0, Lcom/daaw/nz8;->a:Lcom/daaw/hz8;

    invoke-virtual {v1, v2, v3}, Lcom/daaw/hz8;->g(J)J

    move-result-wide v4

    iget-object v1, v0, Lcom/daaw/nz8;->a:Lcom/daaw/hz8;

    const-wide/16 v6, 0x0

    invoke-static {v1}, Lcom/daaw/hz8;->d(Lcom/daaw/hz8;)J

    move-result-wide v8

    invoke-static {v1}, Lcom/daaw/hz8;->f(Lcom/daaw/hz8;)J

    move-result-wide v10

    invoke-static {v1}, Lcom/daaw/hz8;->c(Lcom/daaw/hz8;)J

    move-result-wide v12

    invoke-static {v1}, Lcom/daaw/hz8;->a(Lcom/daaw/hz8;)J

    move-result-wide v15

    move-object v1, v14

    move-wide/from16 v2, p1

    move-object/from16 v17, v14

    move-wide v14, v15

    invoke-direct/range {v1 .. v15}, Lcom/daaw/jz8;-><init>(JJJJJJJ)V

    move-object/from16 v1, v17

    iput-object v1, v0, Lcom/daaw/nz8;->c:Lcom/daaw/jz8;

    return-void
.end method

.method public final e()Z
    .locals 1

    iget-object v0, p0, Lcom/daaw/nz8;->c:Lcom/daaw/jz8;

    if-eqz v0, :cond_0

    const/4 v0, 0x1

    return v0

    :cond_0
    const/4 v0, 0x0

    return v0
.end method
