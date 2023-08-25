.class public final Lcom/daaw/za2;
.super Ljava/lang/Object;
.source ""


# instance fields
.field public final a:Lcom/daaw/ab2;

.field public final b:Lcom/daaw/ik5;

.field public c:I

.field public d:I

.field public e:Z


# direct methods
.method public constructor <init>()V
    .locals 3

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    new-instance v0, Lcom/daaw/ab2;

    invoke-direct {v0}, Lcom/daaw/ab2;-><init>()V

    iput-object v0, p0, Lcom/daaw/za2;->a:Lcom/daaw/ab2;

    new-instance v0, Lcom/daaw/ik5;

    const v1, 0xfe01

    new-array v1, v1, [B

    const/4 v2, 0x0

    invoke-direct {v0, v1, v2}, Lcom/daaw/ik5;-><init>([BI)V

    iput-object v0, p0, Lcom/daaw/za2;->b:Lcom/daaw/ik5;

    const/4 v0, -0x1

    iput v0, p0, Lcom/daaw/za2;->c:I

    return-void
.end method


# virtual methods
.method public final a()Lcom/daaw/ik5;
    .locals 1

    iget-object v0, p0, Lcom/daaw/za2;->b:Lcom/daaw/ik5;

    return-object v0
.end method

.method public final b()Lcom/daaw/ab2;
    .locals 1

    iget-object v0, p0, Lcom/daaw/za2;->a:Lcom/daaw/ab2;

    return-object v0
.end method

.method public final c()V
    .locals 2

    iget-object v0, p0, Lcom/daaw/za2;->a:Lcom/daaw/ab2;

    invoke-virtual {v0}, Lcom/daaw/ab2;->a()V

    iget-object v0, p0, Lcom/daaw/za2;->b:Lcom/daaw/ik5;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Lcom/daaw/ik5;->c(I)V

    const/4 v0, -0x1

    iput v0, p0, Lcom/daaw/za2;->c:I

    iput-boolean v1, p0, Lcom/daaw/za2;->e:Z

    return-void
.end method

.method public final d()V
    .locals 4

    iget-object v0, p0, Lcom/daaw/za2;->b:Lcom/daaw/ik5;

    invoke-virtual {v0}, Lcom/daaw/ik5;->h()[B

    move-result-object v1

    array-length v1, v1

    const v2, 0xfe01

    if-ne v1, v2, :cond_0

    return-void

    :cond_0
    invoke-virtual {v0}, Lcom/daaw/ik5;->h()[B

    move-result-object v1

    invoke-virtual {v0}, Lcom/daaw/ik5;->l()I

    move-result v3

    invoke-static {v2, v3}, Ljava/lang/Math;->max(II)I

    move-result v2

    invoke-static {v1, v2}, Ljava/util/Arrays;->copyOf([BI)[B

    move-result-object v1

    iget-object v2, p0, Lcom/daaw/za2;->b:Lcom/daaw/ik5;

    invoke-virtual {v2}, Lcom/daaw/ik5;->l()I

    move-result v2

    invoke-virtual {v0, v1, v2}, Lcom/daaw/ik5;->d([BI)V

    return-void
.end method

.method public final e(Lcom/daaw/k09;)Z
    .locals 6

    iget-boolean v0, p0, Lcom/daaw/za2;->e:Z

    const/4 v1, 0x0

    if-nez v0, :cond_0

    goto :goto_0

    :cond_0
    iput-boolean v1, p0, Lcom/daaw/za2;->e:Z

    iget-object v0, p0, Lcom/daaw/za2;->b:Lcom/daaw/ik5;

    invoke-virtual {v0, v1}, Lcom/daaw/ik5;->c(I)V

    :goto_0
    iget-boolean v0, p0, Lcom/daaw/za2;->e:Z

    const/4 v2, 0x1

    if-nez v0, :cond_a

    iget v0, p0, Lcom/daaw/za2;->c:I

    if-gez v0, :cond_5

    iget-object v0, p0, Lcom/daaw/za2;->a:Lcom/daaw/ab2;

    const-wide/16 v3, -0x1

    invoke-virtual {v0, p1, v3, v4}, Lcom/daaw/ab2;->c(Lcom/daaw/k09;J)Z

    move-result v0

    if-eqz v0, :cond_4

    iget-object v0, p0, Lcom/daaw/za2;->a:Lcom/daaw/ab2;

    invoke-virtual {v0, p1, v2}, Lcom/daaw/ab2;->b(Lcom/daaw/k09;Z)Z

    move-result v0

    if-nez v0, :cond_1

    goto :goto_2

    :cond_1
    iget-object v0, p0, Lcom/daaw/za2;->a:Lcom/daaw/ab2;

    iget v3, v0, Lcom/daaw/ab2;->d:I

    iget v0, v0, Lcom/daaw/ab2;->a:I

    and-int/2addr v0, v2

    if-ne v0, v2, :cond_2

    iget-object v0, p0, Lcom/daaw/za2;->b:Lcom/daaw/ik5;

    invoke-virtual {v0}, Lcom/daaw/ik5;->l()I

    move-result v0

    if-nez v0, :cond_2

    invoke-virtual {p0, v1}, Lcom/daaw/za2;->f(I)I

    move-result v0

    add-int/2addr v3, v0

    iget v0, p0, Lcom/daaw/za2;->d:I

    goto :goto_1

    :cond_2
    const/4 v0, 0x0

    :goto_1
    invoke-static {p1, v3}, Lcom/daaw/n09;->e(Lcom/daaw/k09;I)Z

    move-result v3

    if-nez v3, :cond_3

    return v1

    :cond_3
    iput v0, p0, Lcom/daaw/za2;->c:I

    goto :goto_3

    :cond_4
    :goto_2
    return v1

    :cond_5
    :goto_3
    invoke-virtual {p0, v0}, Lcom/daaw/za2;->f(I)I

    move-result v0

    iget v3, p0, Lcom/daaw/za2;->c:I

    iget v4, p0, Lcom/daaw/za2;->d:I

    add-int/2addr v3, v4

    if-lez v0, :cond_8

    iget-object v4, p0, Lcom/daaw/za2;->b:Lcom/daaw/ik5;

    invoke-virtual {v4}, Lcom/daaw/ik5;->l()I

    move-result v5

    add-int/2addr v5, v0

    invoke-virtual {v4, v5}, Lcom/daaw/ik5;->H(I)V

    iget-object v4, p0, Lcom/daaw/za2;->b:Lcom/daaw/ik5;

    invoke-virtual {v4}, Lcom/daaw/ik5;->h()[B

    move-result-object v5

    invoke-virtual {v4}, Lcom/daaw/ik5;->l()I

    move-result v4

    invoke-static {p1, v5, v4, v0}, Lcom/daaw/n09;->d(Lcom/daaw/k09;[BII)Z

    move-result v4

    if-nez v4, :cond_6

    return v1

    :cond_6
    iget-object v4, p0, Lcom/daaw/za2;->b:Lcom/daaw/ik5;

    invoke-virtual {v4}, Lcom/daaw/ik5;->l()I

    move-result v5

    add-int/2addr v5, v0

    invoke-virtual {v4, v5}, Lcom/daaw/ik5;->e(I)V

    iget-object v0, p0, Lcom/daaw/za2;->a:Lcom/daaw/ab2;

    iget-object v0, v0, Lcom/daaw/ab2;->f:[I

    add-int/lit8 v4, v3, -0x1

    aget v0, v0, v4

    const/16 v4, 0xff

    if-eq v0, v4, :cond_7

    goto :goto_4

    :cond_7
    const/4 v2, 0x0

    :goto_4
    iput-boolean v2, p0, Lcom/daaw/za2;->e:Z

    :cond_8
    iget-object v0, p0, Lcom/daaw/za2;->a:Lcom/daaw/ab2;

    iget v0, v0, Lcom/daaw/ab2;->c:I

    if-ne v3, v0, :cond_9

    const/4 v3, -0x1

    :cond_9
    iput v3, p0, Lcom/daaw/za2;->c:I

    goto/16 :goto_0

    :cond_a
    return v2
.end method

.method public final f(I)I
    .locals 5

    const/4 v0, 0x0

    iput v0, p0, Lcom/daaw/za2;->d:I

    :cond_0
    iget v1, p0, Lcom/daaw/za2;->d:I

    add-int v2, p1, v1

    iget-object v3, p0, Lcom/daaw/za2;->a:Lcom/daaw/ab2;

    iget v4, v3, Lcom/daaw/ab2;->c:I

    if-ge v2, v4, :cond_1

    iget-object v3, v3, Lcom/daaw/ab2;->f:[I

    add-int/lit8 v1, v1, 0x1

    iput v1, p0, Lcom/daaw/za2;->d:I

    aget v1, v3, v2

    add-int/2addr v0, v1

    const/16 v2, 0xff

    if-eq v1, v2, :cond_0

    :cond_1
    return v0
.end method
