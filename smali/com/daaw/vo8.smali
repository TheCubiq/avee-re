.class public final Lcom/daaw/vo8;
.super Lcom/daaw/ma7;
.source ""


# instance fields
.field public h:J

.field public i:I

.field public j:I


# direct methods
.method public constructor <init>()V
    .locals 2

    const/4 v0, 0x2

    const/4 v1, 0x0

    invoke-direct {p0, v0, v1}, Lcom/daaw/ma7;-><init>(II)V

    const/16 v0, 0x20

    iput v0, p0, Lcom/daaw/vo8;->j:I

    return-void
.end method


# virtual methods
.method public final b()V
    .locals 1

    invoke-super {p0}, Lcom/daaw/ma7;->b()V

    const/4 v0, 0x0

    iput v0, p0, Lcom/daaw/vo8;->i:I

    return-void
.end method

.method public final m()I
    .locals 1

    iget v0, p0, Lcom/daaw/vo8;->i:I

    return v0
.end method

.method public final n()J
    .locals 2

    iget-wide v0, p0, Lcom/daaw/vo8;->h:J

    return-wide v0
.end method

.method public final o(I)V
    .locals 0

    iput p1, p0, Lcom/daaw/vo8;->j:I

    return-void
.end method

.method public final p(Lcom/daaw/ma7;)Z
    .locals 5

    const/high16 v0, 0x40000000    # 2.0f

    invoke-virtual {p1, v0}, Lcom/daaw/i37;->d(I)Z

    move-result v0

    const/4 v1, 0x1

    xor-int/2addr v0, v1

    invoke-static {v0}, Lcom/daaw/uo4;->d(Z)V

    const/high16 v0, 0x10000000

    invoke-virtual {p1, v0}, Lcom/daaw/i37;->d(I)Z

    move-result v0

    xor-int/2addr v0, v1

    invoke-static {v0}, Lcom/daaw/uo4;->d(Z)V

    const/4 v0, 0x4

    invoke-virtual {p1, v0}, Lcom/daaw/i37;->d(I)Z

    move-result v0

    xor-int/2addr v0, v1

    invoke-static {v0}, Lcom/daaw/uo4;->d(Z)V

    invoke-virtual {p0}, Lcom/daaw/vo8;->q()Z

    move-result v0

    const/high16 v2, -0x80000000

    if-nez v0, :cond_0

    goto :goto_0

    :cond_0
    iget v0, p0, Lcom/daaw/vo8;->i:I

    iget v3, p0, Lcom/daaw/vo8;->j:I

    if-lt v0, v3, :cond_1

    goto :goto_1

    :cond_1
    invoke-virtual {p1, v2}, Lcom/daaw/i37;->d(I)Z

    move-result v0

    invoke-virtual {p0, v2}, Lcom/daaw/i37;->d(I)Z

    move-result v3

    if-ne v0, v3, :cond_6

    iget-object v0, p1, Lcom/daaw/ma7;->c:Ljava/nio/ByteBuffer;

    if-eqz v0, :cond_2

    iget-object v3, p0, Lcom/daaw/ma7;->c:Ljava/nio/ByteBuffer;

    if-eqz v3, :cond_2

    invoke-virtual {v3}, Ljava/nio/ByteBuffer;->position()I

    move-result v3

    invoke-virtual {v0}, Ljava/nio/ByteBuffer;->remaining()I

    move-result v0

    add-int/2addr v3, v0

    const v0, 0x2ee000

    if-le v3, v0, :cond_2

    goto :goto_1

    :cond_2
    :goto_0
    iget v0, p0, Lcom/daaw/vo8;->i:I

    add-int/lit8 v3, v0, 0x1

    iput v3, p0, Lcom/daaw/vo8;->i:I

    if-nez v0, :cond_3

    iget-wide v3, p1, Lcom/daaw/ma7;->e:J

    iput-wide v3, p0, Lcom/daaw/ma7;->e:J

    invoke-virtual {p1, v1}, Lcom/daaw/i37;->d(I)Z

    move-result v0

    if-eqz v0, :cond_3

    invoke-virtual {p0, v1}, Lcom/daaw/i37;->c(I)V

    :cond_3
    invoke-virtual {p1, v2}, Lcom/daaw/i37;->d(I)Z

    move-result v0

    if-eqz v0, :cond_4

    invoke-virtual {p0, v2}, Lcom/daaw/i37;->c(I)V

    :cond_4
    iget-object v0, p1, Lcom/daaw/ma7;->c:Ljava/nio/ByteBuffer;

    if-eqz v0, :cond_5

    invoke-virtual {v0}, Ljava/nio/ByteBuffer;->remaining()I

    move-result v2

    invoke-virtual {p0, v2}, Lcom/daaw/ma7;->i(I)V

    iget-object v2, p0, Lcom/daaw/ma7;->c:Ljava/nio/ByteBuffer;

    invoke-virtual {v2, v0}, Ljava/nio/ByteBuffer;->put(Ljava/nio/ByteBuffer;)Ljava/nio/ByteBuffer;

    :cond_5
    iget-wide v2, p1, Lcom/daaw/ma7;->e:J

    iput-wide v2, p0, Lcom/daaw/vo8;->h:J

    return v1

    :cond_6
    :goto_1
    const/4 p1, 0x0

    return p1
.end method

.method public final q()Z
    .locals 1

    iget v0, p0, Lcom/daaw/vo8;->i:I

    if-lez v0, :cond_0

    const/4 v0, 0x1

    return v0

    :cond_0
    const/4 v0, 0x0

    return v0
.end method
