.class public final Lcom/daaw/gw1;
.super Ljava/lang/Object;
.source ""


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/daaw/gw1$a;
    }
.end annotation


# direct methods
.method public static a(Lcom/daaw/a00;)Lcom/daaw/fw1;
    .locals 19

    move-object/from16 v0, p0

    invoke-static/range {p0 .. p0}, Lcom/daaw/s6;->e(Ljava/lang/Object;)Ljava/lang/Object;

    new-instance v1, Lcom/daaw/rv0;

    const/16 v2, 0x10

    invoke-direct {v1, v2}, Lcom/daaw/rv0;-><init>(I)V

    invoke-static {v0, v1}, Lcom/daaw/gw1$a;->a(Lcom/daaw/a00;Lcom/daaw/rv0;)Lcom/daaw/gw1$a;

    move-result-object v3

    iget v3, v3, Lcom/daaw/gw1$a;->a:I

    const-string v4, "RIFF"

    invoke-static {v4}, Lcom/daaw/sq1;->v(Ljava/lang/String;)I

    move-result v4

    const/4 v5, 0x0

    if-eq v3, v4, :cond_0

    return-object v5

    :cond_0
    iget-object v3, v1, Lcom/daaw/rv0;->a:[B

    const/4 v4, 0x0

    const/4 v6, 0x4

    invoke-interface {v0, v3, v4, v6}, Lcom/daaw/a00;->k([BII)V

    invoke-virtual {v1, v4}, Lcom/daaw/rv0;->J(I)V

    invoke-virtual {v1}, Lcom/daaw/rv0;->i()I

    move-result v3

    const-string v7, "WAVE"

    invoke-static {v7}, Lcom/daaw/sq1;->v(Ljava/lang/String;)I

    move-result v7

    if-eq v3, v7, :cond_1

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "Unsupported RIFF format: "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, v3}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    return-object v5

    :cond_1
    :goto_0
    invoke-static {v0, v1}, Lcom/daaw/gw1$a;->a(Lcom/daaw/a00;Lcom/daaw/rv0;)Lcom/daaw/gw1$a;

    move-result-object v3

    iget v7, v3, Lcom/daaw/gw1$a;->a:I

    const-string v8, "fmt "

    invoke-static {v8}, Lcom/daaw/sq1;->v(Ljava/lang/String;)I

    move-result v8

    if-eq v7, v8, :cond_2

    iget-wide v7, v3, Lcom/daaw/gw1$a;->b:J

    long-to-int v3, v7

    invoke-interface {v0, v3}, Lcom/daaw/a00;->g(I)V

    goto :goto_0

    :cond_2
    iget-wide v7, v3, Lcom/daaw/gw1$a;->b:J

    const-wide/16 v9, 0x10

    const/4 v11, 0x1

    cmp-long v12, v7, v9

    if-ltz v12, :cond_3

    const/4 v7, 0x1

    goto :goto_1

    :cond_3
    const/4 v7, 0x0

    :goto_1
    invoke-static {v7}, Lcom/daaw/s6;->f(Z)V

    iget-object v7, v1, Lcom/daaw/rv0;->a:[B

    invoke-interface {v0, v7, v4, v2}, Lcom/daaw/a00;->k([BII)V

    invoke-virtual {v1, v4}, Lcom/daaw/rv0;->J(I)V

    invoke-virtual {v1}, Lcom/daaw/rv0;->p()I

    move-result v7

    invoke-virtual {v1}, Lcom/daaw/rv0;->p()I

    move-result v13

    invoke-virtual {v1}, Lcom/daaw/rv0;->o()I

    move-result v14

    invoke-virtual {v1}, Lcom/daaw/rv0;->o()I

    move-result v15

    invoke-virtual {v1}, Lcom/daaw/rv0;->p()I

    move-result v8

    invoke-virtual {v1}, Lcom/daaw/rv0;->p()I

    move-result v1

    mul-int v9, v13, v1

    div-int/lit8 v9, v9, 0x8

    if-ne v8, v9, :cond_8

    if-eq v7, v11, :cond_5

    const/4 v9, 0x3

    if-eq v7, v9, :cond_4

    const v4, 0xfffe

    if-eq v7, v4, :cond_5

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "Unsupported WAV format type: "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, v7}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    return-object v5

    :cond_4
    const/16 v9, 0x20

    if-ne v1, v9, :cond_6

    const/4 v4, 0x4

    goto :goto_2

    :cond_5
    invoke-static {v1}, Lcom/daaw/sq1;->x(I)I

    move-result v4

    :cond_6
    :goto_2
    move/from16 v18, v4

    if-nez v18, :cond_7

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "Unsupported WAV bit depth "

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v1, " for type "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, v7}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    return-object v5

    :cond_7
    iget-wide v3, v3, Lcom/daaw/gw1$a;->b:J

    long-to-int v4, v3

    sub-int/2addr v4, v2

    invoke-interface {v0, v4}, Lcom/daaw/a00;->g(I)V

    new-instance v0, Lcom/daaw/fw1;

    move-object v12, v0

    move/from16 v16, v8

    move/from16 v17, v1

    invoke-direct/range {v12 .. v18}, Lcom/daaw/fw1;-><init>(IIIIII)V

    return-object v0

    :cond_8
    new-instance v0, Lcom/daaw/tv0;

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "Expected block alignment: "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1, v9}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v2, "; got: "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1, v8}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-direct {v0, v1}, Lcom/daaw/tv0;-><init>(Ljava/lang/String;)V

    goto :goto_4

    :goto_3
    throw v0

    :goto_4
    goto :goto_3
.end method

.method public static b(Lcom/daaw/a00;Lcom/daaw/fw1;)V
    .locals 8

    invoke-static {p0}, Lcom/daaw/s6;->e(Ljava/lang/Object;)Ljava/lang/Object;

    invoke-static {p1}, Lcom/daaw/s6;->e(Ljava/lang/Object;)Ljava/lang/Object;

    invoke-interface {p0}, Lcom/daaw/a00;->i()V

    new-instance v0, Lcom/daaw/rv0;

    const/16 v1, 0x8

    invoke-direct {v0, v1}, Lcom/daaw/rv0;-><init>(I)V

    :goto_0
    invoke-static {p0, v0}, Lcom/daaw/gw1$a;->a(Lcom/daaw/a00;Lcom/daaw/rv0;)Lcom/daaw/gw1$a;

    move-result-object v2

    iget v3, v2, Lcom/daaw/gw1$a;->a:I

    const-string v4, "data"

    invoke-static {v4}, Lcom/daaw/sq1;->v(Ljava/lang/String;)I

    move-result v4

    if-eq v3, v4, :cond_2

    new-instance v3, Ljava/lang/StringBuilder;

    invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V

    const-string v4, "Ignoring unknown WAV chunk: "

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget v4, v2, Lcom/daaw/gw1$a;->a:I

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-wide/16 v3, 0x8

    iget-wide v5, v2, Lcom/daaw/gw1$a;->b:J

    add-long/2addr v5, v3

    iget v3, v2, Lcom/daaw/gw1$a;->a:I

    const-string v4, "RIFF"

    invoke-static {v4}, Lcom/daaw/sq1;->v(Ljava/lang/String;)I

    move-result v4

    if-ne v3, v4, :cond_0

    const-wide/16 v5, 0xc

    :cond_0
    const-wide/32 v3, 0x7fffffff

    cmp-long v7, v5, v3

    if-gtz v7, :cond_1

    long-to-int v2, v5

    invoke-interface {p0, v2}, Lcom/daaw/a00;->j(I)V

    goto :goto_0

    :cond_1
    new-instance p0, Lcom/daaw/tv0;

    new-instance p1, Ljava/lang/StringBuilder;

    invoke-direct {p1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v0, "Chunk is too large (~2GB+) to skip; id: "

    invoke-virtual {p1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget v0, v2, Lcom/daaw/gw1$a;->a:I

    invoke-virtual {p1, v0}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {p1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-direct {p0, p1}, Lcom/daaw/tv0;-><init>(Ljava/lang/String;)V

    throw p0

    :cond_2
    invoke-interface {p0, v1}, Lcom/daaw/a00;->j(I)V

    invoke-interface {p0}, Lcom/daaw/a00;->getPosition()J

    move-result-wide v0

    iget-wide v2, v2, Lcom/daaw/gw1$a;->b:J

    invoke-virtual {p1, v0, v1, v2, v3}, Lcom/daaw/fw1;->k(JJ)V

    return-void
.end method
