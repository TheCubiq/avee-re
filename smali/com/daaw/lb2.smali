.class public final Lcom/daaw/lb2;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Lcom/daaw/ac2;


# instance fields
.field public final a:Lcom/daaw/cj5;

.field public final b:Lcom/daaw/ik5;

.field public final c:Ljava/lang/String;

.field public d:Ljava/lang/String;

.field public e:Lcom/daaw/m42;

.field public f:I

.field public g:I

.field public h:Z

.field public i:J

.field public j:Lcom/daaw/f92;

.field public k:I

.field public l:J


# direct methods
.method public constructor <init>(Ljava/lang/String;)V
    .locals 3

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    new-instance v0, Lcom/daaw/cj5;

    const/16 v1, 0x80

    new-array v2, v1, [B

    invoke-direct {v0, v2, v1}, Lcom/daaw/cj5;-><init>([BI)V

    iput-object v0, p0, Lcom/daaw/lb2;->a:Lcom/daaw/cj5;

    new-instance v1, Lcom/daaw/ik5;

    iget-object v0, v0, Lcom/daaw/cj5;->a:[B

    invoke-direct {v1, v0}, Lcom/daaw/ik5;-><init>([B)V

    iput-object v1, p0, Lcom/daaw/lb2;->b:Lcom/daaw/ik5;

    const/4 v0, 0x0

    iput v0, p0, Lcom/daaw/lb2;->f:I

    const-wide v0, -0x7fffffffffffffffL    # -4.9E-324

    iput-wide v0, p0, Lcom/daaw/lb2;->l:J

    iput-object p1, p0, Lcom/daaw/lb2;->c:Ljava/lang/String;

    return-void
.end method


# virtual methods
.method public final a(Lcom/daaw/ik5;)V
    .locals 11

    iget-object v0, p0, Lcom/daaw/lb2;->e:Lcom/daaw/m42;

    invoke-static {v0}, Lcom/daaw/uo4;->b(Ljava/lang/Object;)Ljava/lang/Object;

    :cond_0
    :goto_0
    invoke-virtual {p1}, Lcom/daaw/ik5;->i()I

    move-result v0

    if-lez v0, :cond_9

    iget v0, p0, Lcom/daaw/lb2;->f:I

    const/4 v1, 0x2

    const/4 v2, 0x1

    const/4 v3, 0x0

    if-eqz v0, :cond_5

    if-eq v0, v2, :cond_2

    invoke-virtual {p1}, Lcom/daaw/ik5;->i()I

    move-result v0

    iget v1, p0, Lcom/daaw/lb2;->k:I

    iget v2, p0, Lcom/daaw/lb2;->g:I

    sub-int/2addr v1, v2

    invoke-static {v0, v1}, Ljava/lang/Math;->min(II)I

    move-result v0

    iget-object v1, p0, Lcom/daaw/lb2;->e:Lcom/daaw/m42;

    invoke-interface {v1, p1, v0}, Lcom/daaw/m42;->c(Lcom/daaw/ik5;I)V

    iget v1, p0, Lcom/daaw/lb2;->g:I

    add-int/2addr v1, v0

    iput v1, p0, Lcom/daaw/lb2;->g:I

    iget v8, p0, Lcom/daaw/lb2;->k:I

    if-ne v1, v8, :cond_0

    iget-wide v5, p0, Lcom/daaw/lb2;->l:J

    const-wide v0, -0x7fffffffffffffffL    # -4.9E-324

    cmp-long v2, v5, v0

    if-eqz v2, :cond_1

    iget-object v4, p0, Lcom/daaw/lb2;->e:Lcom/daaw/m42;

    const/4 v7, 0x1

    const/4 v9, 0x0

    const/4 v10, 0x0

    invoke-interface/range {v4 .. v10}, Lcom/daaw/m42;->b(JIIILcom/daaw/l42;)V

    iget-wide v0, p0, Lcom/daaw/lb2;->l:J

    iget-wide v4, p0, Lcom/daaw/lb2;->i:J

    add-long/2addr v0, v4

    iput-wide v0, p0, Lcom/daaw/lb2;->l:J

    :cond_1
    iput v3, p0, Lcom/daaw/lb2;->f:I

    goto :goto_0

    :cond_2
    iget-object v0, p0, Lcom/daaw/lb2;->b:Lcom/daaw/ik5;

    invoke-virtual {v0}, Lcom/daaw/ik5;->h()[B

    move-result-object v0

    invoke-virtual {p1}, Lcom/daaw/ik5;->i()I

    move-result v2

    iget v4, p0, Lcom/daaw/lb2;->g:I

    const/16 v5, 0x80

    rsub-int v4, v4, 0x80

    invoke-static {v2, v4}, Ljava/lang/Math;->min(II)I

    move-result v2

    iget v4, p0, Lcom/daaw/lb2;->g:I

    invoke-virtual {p1, v0, v4, v2}, Lcom/daaw/ik5;->b([BII)V

    iget v0, p0, Lcom/daaw/lb2;->g:I

    add-int/2addr v0, v2

    iput v0, p0, Lcom/daaw/lb2;->g:I

    if-ne v0, v5, :cond_0

    iget-object v0, p0, Lcom/daaw/lb2;->a:Lcom/daaw/cj5;

    invoke-virtual {v0, v3}, Lcom/daaw/cj5;->h(I)V

    iget-object v0, p0, Lcom/daaw/lb2;->a:Lcom/daaw/cj5;

    invoke-static {v0}, Lcom/daaw/cz8;->e(Lcom/daaw/cj5;)Lcom/daaw/bz8;

    move-result-object v0

    iget-object v2, p0, Lcom/daaw/lb2;->j:Lcom/daaw/f92;

    if-eqz v2, :cond_3

    iget v4, v0, Lcom/daaw/bz8;->c:I

    iget v6, v2, Lcom/daaw/f92;->y:I

    if-ne v4, v6, :cond_3

    iget v4, v0, Lcom/daaw/bz8;->b:I

    iget v6, v2, Lcom/daaw/f92;->z:I

    if-ne v4, v6, :cond_3

    iget-object v4, v0, Lcom/daaw/bz8;->a:Ljava/lang/String;

    iget-object v2, v2, Lcom/daaw/f92;->l:Ljava/lang/String;

    invoke-static {v4, v2}, Lcom/daaw/it5;->t(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v2

    if-nez v2, :cond_4

    :cond_3
    new-instance v2, Lcom/daaw/b72;

    invoke-direct {v2}, Lcom/daaw/b72;-><init>()V

    iget-object v4, p0, Lcom/daaw/lb2;->d:Ljava/lang/String;

    invoke-virtual {v2, v4}, Lcom/daaw/b72;->h(Ljava/lang/String;)Lcom/daaw/b72;

    iget-object v4, v0, Lcom/daaw/bz8;->a:Ljava/lang/String;

    invoke-virtual {v2, v4}, Lcom/daaw/b72;->s(Ljava/lang/String;)Lcom/daaw/b72;

    iget v4, v0, Lcom/daaw/bz8;->c:I

    invoke-virtual {v2, v4}, Lcom/daaw/b72;->e0(I)Lcom/daaw/b72;

    iget v4, v0, Lcom/daaw/bz8;->b:I

    invoke-virtual {v2, v4}, Lcom/daaw/b72;->t(I)Lcom/daaw/b72;

    iget-object v4, p0, Lcom/daaw/lb2;->c:Ljava/lang/String;

    invoke-virtual {v2, v4}, Lcom/daaw/b72;->k(Ljava/lang/String;)Lcom/daaw/b72;

    invoke-virtual {v2}, Lcom/daaw/b72;->y()Lcom/daaw/f92;

    move-result-object v2

    iput-object v2, p0, Lcom/daaw/lb2;->j:Lcom/daaw/f92;

    iget-object v4, p0, Lcom/daaw/lb2;->e:Lcom/daaw/m42;

    invoke-interface {v4, v2}, Lcom/daaw/m42;->f(Lcom/daaw/f92;)V

    :cond_4
    iget v2, v0, Lcom/daaw/bz8;->d:I

    iput v2, p0, Lcom/daaw/lb2;->k:I

    iget v0, v0, Lcom/daaw/bz8;->e:I

    int-to-long v6, v0

    const-wide/32 v8, 0xf4240

    mul-long v6, v6, v8

    iget-object v0, p0, Lcom/daaw/lb2;->j:Lcom/daaw/f92;

    iget v0, v0, Lcom/daaw/f92;->z:I

    int-to-long v8, v0

    div-long/2addr v6, v8

    iput-wide v6, p0, Lcom/daaw/lb2;->i:J

    iget-object v0, p0, Lcom/daaw/lb2;->b:Lcom/daaw/ik5;

    invoke-virtual {v0, v3}, Lcom/daaw/ik5;->f(I)V

    iget-object v0, p0, Lcom/daaw/lb2;->e:Lcom/daaw/m42;

    iget-object v2, p0, Lcom/daaw/lb2;->b:Lcom/daaw/ik5;

    invoke-interface {v0, v2, v5}, Lcom/daaw/m42;->c(Lcom/daaw/ik5;I)V

    iput v1, p0, Lcom/daaw/lb2;->f:I

    goto/16 :goto_0

    :cond_5
    :goto_1
    invoke-virtual {p1}, Lcom/daaw/ik5;->i()I

    move-result v0

    if-lez v0, :cond_0

    iget-boolean v0, p0, Lcom/daaw/lb2;->h:Z

    const/16 v4, 0xb

    if-nez v0, :cond_7

    invoke-virtual {p1}, Lcom/daaw/ik5;->s()I

    move-result v0

    if-ne v0, v4, :cond_6

    :goto_2
    const/4 v0, 0x1

    goto :goto_3

    :cond_6
    const/4 v0, 0x0

    :goto_3
    iput-boolean v0, p0, Lcom/daaw/lb2;->h:Z

    goto :goto_1

    :cond_7
    invoke-virtual {p1}, Lcom/daaw/ik5;->s()I

    move-result v0

    const/16 v5, 0x77

    if-ne v0, v5, :cond_8

    iput-boolean v3, p0, Lcom/daaw/lb2;->h:Z

    iput v2, p0, Lcom/daaw/lb2;->f:I

    iget-object v0, p0, Lcom/daaw/lb2;->b:Lcom/daaw/ik5;

    invoke-virtual {v0}, Lcom/daaw/ik5;->h()[B

    move-result-object v6

    aput-byte v4, v6, v3

    invoke-virtual {v0}, Lcom/daaw/ik5;->h()[B

    move-result-object v0

    aput-byte v5, v0, v2

    iput v1, p0, Lcom/daaw/lb2;->g:I

    goto/16 :goto_0

    :cond_8
    if-ne v0, v4, :cond_6

    goto :goto_2

    :cond_9
    return-void
.end method

.method public final b(Lcom/daaw/m09;Lcom/daaw/td2;)V
    .locals 1

    invoke-virtual {p2}, Lcom/daaw/td2;->c()V

    invoke-virtual {p2}, Lcom/daaw/td2;->b()Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lcom/daaw/lb2;->d:Ljava/lang/String;

    invoke-virtual {p2}, Lcom/daaw/td2;->a()I

    move-result p2

    const/4 v0, 0x1

    invoke-interface {p1, p2, v0}, Lcom/daaw/m09;->n(II)Lcom/daaw/m42;

    move-result-object p1

    iput-object p1, p0, Lcom/daaw/lb2;->e:Lcom/daaw/m42;

    return-void
.end method

.method public final c(JI)V
    .locals 2

    const-wide v0, -0x7fffffffffffffffL    # -4.9E-324

    cmp-long p3, p1, v0

    if-eqz p3, :cond_0

    iput-wide p1, p0, Lcom/daaw/lb2;->l:J

    :cond_0
    return-void
.end method

.method public final zzc()V
    .locals 0

    return-void
.end method

.method public final zze()V
    .locals 2

    const/4 v0, 0x0

    iput v0, p0, Lcom/daaw/lb2;->f:I

    iput v0, p0, Lcom/daaw/lb2;->g:I

    iput-boolean v0, p0, Lcom/daaw/lb2;->h:Z

    const-wide v0, -0x7fffffffffffffffL    # -4.9E-324

    iput-wide v0, p0, Lcom/daaw/lb2;->l:J

    return-void
.end method
