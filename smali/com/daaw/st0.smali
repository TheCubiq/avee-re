.class public final Lcom/daaw/st0;
.super Ljava/lang/Object;
.source ""


# instance fields
.field public final a:Lcom/daaw/tt0;

.field public final b:Lcom/daaw/rv0;

.field public c:I

.field public d:I

.field public e:Z


# direct methods
.method public constructor <init>()V
    .locals 3

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    new-instance v0, Lcom/daaw/tt0;

    invoke-direct {v0}, Lcom/daaw/tt0;-><init>()V

    iput-object v0, p0, Lcom/daaw/st0;->a:Lcom/daaw/tt0;

    new-instance v0, Lcom/daaw/rv0;

    const v1, 0xfe01

    new-array v1, v1, [B

    const/4 v2, 0x0

    invoke-direct {v0, v1, v2}, Lcom/daaw/rv0;-><init>([BI)V

    iput-object v0, p0, Lcom/daaw/st0;->b:Lcom/daaw/rv0;

    const/4 v0, -0x1

    iput v0, p0, Lcom/daaw/st0;->c:I

    return-void
.end method


# virtual methods
.method public final a(I)I
    .locals 5

    const/4 v0, 0x0

    iput v0, p0, Lcom/daaw/st0;->d:I

    :cond_0
    iget v1, p0, Lcom/daaw/st0;->d:I

    add-int v2, p1, v1

    iget-object v3, p0, Lcom/daaw/st0;->a:Lcom/daaw/tt0;

    iget v4, v3, Lcom/daaw/tt0;->g:I

    if-ge v2, v4, :cond_1

    iget-object v2, v3, Lcom/daaw/tt0;->j:[I

    add-int/lit8 v3, v1, 0x1

    iput v3, p0, Lcom/daaw/st0;->d:I

    add-int/2addr v1, p1

    aget v1, v2, v1

    add-int/2addr v0, v1

    const/16 v2, 0xff

    if-eq v1, v2, :cond_0

    :cond_1
    return v0
.end method

.method public b()Lcom/daaw/tt0;
    .locals 1

    iget-object v0, p0, Lcom/daaw/st0;->a:Lcom/daaw/tt0;

    return-object v0
.end method

.method public c()Lcom/daaw/rv0;
    .locals 1

    iget-object v0, p0, Lcom/daaw/st0;->b:Lcom/daaw/rv0;

    return-object v0
.end method

.method public d(Lcom/daaw/a00;)Z
    .locals 7

    const/4 v0, 0x0

    const/4 v1, 0x1

    if-eqz p1, :cond_0

    const/4 v2, 0x1

    goto :goto_0

    :cond_0
    const/4 v2, 0x0

    :goto_0
    invoke-static {v2}, Lcom/daaw/s6;->f(Z)V

    iget-boolean v2, p0, Lcom/daaw/st0;->e:Z

    if-eqz v2, :cond_1

    iput-boolean v0, p0, Lcom/daaw/st0;->e:Z

    iget-object v2, p0, Lcom/daaw/st0;->b:Lcom/daaw/rv0;

    invoke-virtual {v2}, Lcom/daaw/rv0;->F()V

    :cond_1
    :goto_1
    iget-boolean v2, p0, Lcom/daaw/st0;->e:Z

    if-nez v2, :cond_9

    iget v2, p0, Lcom/daaw/st0;->c:I

    if-gez v2, :cond_4

    iget-object v2, p0, Lcom/daaw/st0;->a:Lcom/daaw/tt0;

    invoke-virtual {v2, p1, v1}, Lcom/daaw/tt0;->a(Lcom/daaw/a00;Z)Z

    move-result v2

    if-nez v2, :cond_2

    return v0

    :cond_2
    iget-object v2, p0, Lcom/daaw/st0;->a:Lcom/daaw/tt0;

    iget v3, v2, Lcom/daaw/tt0;->h:I

    iget v2, v2, Lcom/daaw/tt0;->b:I

    and-int/2addr v2, v1

    if-ne v2, v1, :cond_3

    iget-object v2, p0, Lcom/daaw/st0;->b:Lcom/daaw/rv0;

    invoke-virtual {v2}, Lcom/daaw/rv0;->d()I

    move-result v2

    if-nez v2, :cond_3

    invoke-virtual {p0, v0}, Lcom/daaw/st0;->a(I)I

    move-result v2

    add-int/2addr v3, v2

    iget v2, p0, Lcom/daaw/st0;->d:I

    add-int/2addr v2, v0

    goto :goto_2

    :cond_3
    const/4 v2, 0x0

    :goto_2
    invoke-interface {p1, v3}, Lcom/daaw/a00;->j(I)V

    iput v2, p0, Lcom/daaw/st0;->c:I

    :cond_4
    iget v2, p0, Lcom/daaw/st0;->c:I

    invoke-virtual {p0, v2}, Lcom/daaw/st0;->a(I)I

    move-result v2

    iget v3, p0, Lcom/daaw/st0;->c:I

    iget v4, p0, Lcom/daaw/st0;->d:I

    add-int/2addr v3, v4

    if-lez v2, :cond_7

    iget-object v4, p0, Lcom/daaw/st0;->b:Lcom/daaw/rv0;

    invoke-virtual {v4}, Lcom/daaw/rv0;->b()I

    move-result v4

    iget-object v5, p0, Lcom/daaw/st0;->b:Lcom/daaw/rv0;

    invoke-virtual {v5}, Lcom/daaw/rv0;->d()I

    move-result v5

    add-int/2addr v5, v2

    if-ge v4, v5, :cond_5

    iget-object v4, p0, Lcom/daaw/st0;->b:Lcom/daaw/rv0;

    iget-object v5, v4, Lcom/daaw/rv0;->a:[B

    invoke-virtual {v4}, Lcom/daaw/rv0;->d()I

    move-result v6

    add-int/2addr v6, v2

    invoke-static {v5, v6}, Ljava/util/Arrays;->copyOf([BI)[B

    move-result-object v5

    iput-object v5, v4, Lcom/daaw/rv0;->a:[B

    :cond_5
    iget-object v4, p0, Lcom/daaw/st0;->b:Lcom/daaw/rv0;

    iget-object v5, v4, Lcom/daaw/rv0;->a:[B

    invoke-virtual {v4}, Lcom/daaw/rv0;->d()I

    move-result v4

    invoke-interface {p1, v5, v4, v2}, Lcom/daaw/a00;->f([BII)V

    iget-object v4, p0, Lcom/daaw/st0;->b:Lcom/daaw/rv0;

    invoke-virtual {v4}, Lcom/daaw/rv0;->d()I

    move-result v5

    add-int/2addr v5, v2

    invoke-virtual {v4, v5}, Lcom/daaw/rv0;->I(I)V

    iget-object v2, p0, Lcom/daaw/st0;->a:Lcom/daaw/tt0;

    iget-object v2, v2, Lcom/daaw/tt0;->j:[I

    add-int/lit8 v4, v3, -0x1

    aget v2, v2, v4

    const/16 v4, 0xff

    if-eq v2, v4, :cond_6

    const/4 v2, 0x1

    goto :goto_3

    :cond_6
    const/4 v2, 0x0

    :goto_3
    iput-boolean v2, p0, Lcom/daaw/st0;->e:Z

    :cond_7
    iget-object v2, p0, Lcom/daaw/st0;->a:Lcom/daaw/tt0;

    iget v2, v2, Lcom/daaw/tt0;->g:I

    if-ne v3, v2, :cond_8

    const/4 v3, -0x1

    :cond_8
    iput v3, p0, Lcom/daaw/st0;->c:I

    goto/16 :goto_1

    :cond_9
    return v1
.end method

.method public e()V
    .locals 1

    iget-object v0, p0, Lcom/daaw/st0;->a:Lcom/daaw/tt0;

    invoke-virtual {v0}, Lcom/daaw/tt0;->b()V

    iget-object v0, p0, Lcom/daaw/st0;->b:Lcom/daaw/rv0;

    invoke-virtual {v0}, Lcom/daaw/rv0;->F()V

    const/4 v0, -0x1

    iput v0, p0, Lcom/daaw/st0;->c:I

    const/4 v0, 0x0

    iput-boolean v0, p0, Lcom/daaw/st0;->e:Z

    return-void
.end method

.method public f()V
    .locals 4

    iget-object v0, p0, Lcom/daaw/st0;->b:Lcom/daaw/rv0;

    iget-object v1, v0, Lcom/daaw/rv0;->a:[B

    array-length v2, v1

    const v3, 0xfe01

    if-ne v2, v3, :cond_0

    return-void

    :cond_0
    invoke-virtual {v0}, Lcom/daaw/rv0;->d()I

    move-result v2

    invoke-static {v3, v2}, Ljava/lang/Math;->max(II)I

    move-result v2

    invoke-static {v1, v2}, Ljava/util/Arrays;->copyOf([BI)[B

    move-result-object v1

    iput-object v1, v0, Lcom/daaw/rv0;->a:[B

    return-void
.end method
