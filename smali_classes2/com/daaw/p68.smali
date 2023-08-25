.class public Lcom/daaw/p68;
.super Lcom/daaw/m68;
.source ""


# instance fields
.field public final t:[B


# direct methods
.method public constructor <init>([B)V
    .locals 0

    invoke-direct {p0}, Lcom/daaw/m68;-><init>()V

    invoke-static {p1}, Ljava/util/Objects;->requireNonNull(Ljava/lang/Object;)Ljava/lang/Object;

    iput-object p1, p0, Lcom/daaw/p68;->t:[B

    return-void
.end method


# virtual methods
.method public d(I)B
    .locals 1

    iget-object v0, p0, Lcom/daaw/p68;->t:[B

    aget-byte p1, v0, p1

    return p1
.end method

.method public e(I)B
    .locals 1

    iget-object v0, p0, Lcom/daaw/p68;->t:[B

    aget-byte p1, v0, p1

    return p1
.end method

.method public final equals(Ljava/lang/Object;)Z
    .locals 8

    const/4 v0, 0x1

    if-ne p1, p0, :cond_0

    return v0

    :cond_0
    instance-of v1, p1, Lcom/daaw/y68;

    const/4 v2, 0x0

    if-nez v1, :cond_1

    return v2

    :cond_1
    invoke-virtual {p0}, Lcom/daaw/p68;->f()I

    move-result v1

    move-object v3, p1

    check-cast v3, Lcom/daaw/y68;

    invoke-virtual {v3}, Lcom/daaw/y68;->f()I

    move-result v3

    if-eq v1, v3, :cond_2

    return v2

    :cond_2
    invoke-virtual {p0}, Lcom/daaw/p68;->f()I

    move-result v1

    if-nez v1, :cond_3

    return v0

    :cond_3
    instance-of v1, p1, Lcom/daaw/p68;

    if-eqz v1, :cond_a

    check-cast p1, Lcom/daaw/p68;

    invoke-virtual {p0}, Lcom/daaw/y68;->p()I

    move-result v1

    invoke-virtual {p1}, Lcom/daaw/y68;->p()I

    move-result v3

    if-eqz v1, :cond_5

    if-eqz v3, :cond_5

    if-ne v1, v3, :cond_4

    goto :goto_0

    :cond_4
    return v2

    :cond_5
    :goto_0
    invoke-virtual {p0}, Lcom/daaw/p68;->f()I

    move-result v1

    invoke-virtual {p1}, Lcom/daaw/y68;->f()I

    move-result v3

    if-gt v1, v3, :cond_9

    invoke-virtual {p1}, Lcom/daaw/y68;->f()I

    move-result v3

    if-gt v1, v3, :cond_8

    iget-object v3, p0, Lcom/daaw/p68;->t:[B

    iget-object v4, p1, Lcom/daaw/p68;->t:[B

    invoke-virtual {p1}, Lcom/daaw/p68;->t()I

    const/4 p1, 0x0

    const/4 v5, 0x0

    :goto_1
    if-ge p1, v1, :cond_7

    aget-byte v6, v3, p1

    aget-byte v7, v4, v5

    if-eq v6, v7, :cond_6

    const/4 v0, 0x0

    goto :goto_2

    :cond_6
    add-int/lit8 p1, p1, 0x1

    add-int/lit8 v5, v5, 0x1

    goto :goto_1

    :cond_7
    :goto_2
    return v0

    :cond_8
    new-instance v0, Ljava/lang/IllegalArgumentException;

    invoke-virtual {p1}, Lcom/daaw/y68;->f()I

    move-result p1

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "Ran off end of other: 0, "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v1, ", "

    invoke-virtual {v2, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2, p1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-direct {v0, p1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_9
    new-instance p1, Ljava/lang/IllegalArgumentException;

    invoke-virtual {p0}, Lcom/daaw/p68;->f()I

    move-result v0

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "Length too large: "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-direct {p1, v0}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_a
    invoke-virtual {p1, p0}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result p1

    return p1
.end method

.method public f()I
    .locals 1

    iget-object v0, p0, Lcom/daaw/p68;->t:[B

    array-length v0, v0

    return v0
.end method

.method public final h(III)I
    .locals 1

    iget-object p2, p0, Lcom/daaw/p68;->t:[B

    const/4 v0, 0x0

    invoke-static {p1, p2, v0, p3}, Lcom/daaw/gb8;->d(I[BII)I

    move-result p1

    return p1
.end method

.method public final j(II)Lcom/daaw/y68;
    .locals 2

    invoke-virtual {p0}, Lcom/daaw/p68;->f()I

    move-result p1

    const/4 v0, 0x0

    invoke-static {v0, p2, p1}, Lcom/daaw/y68;->o(III)I

    move-result p1

    if-nez p1, :cond_0

    sget-object p1, Lcom/daaw/y68;->q:Lcom/daaw/y68;

    return-object p1

    :cond_0
    new-instance p2, Lcom/daaw/z58;

    iget-object v1, p0, Lcom/daaw/p68;->t:[B

    invoke-direct {p2, v1, v0, p1}, Lcom/daaw/z58;-><init>([BII)V

    return-object p2
.end method

.method public final k(Ljava/nio/charset/Charset;)Ljava/lang/String;
    .locals 4

    new-instance v0, Ljava/lang/String;

    iget-object v1, p0, Lcom/daaw/p68;->t:[B

    invoke-virtual {p0}, Lcom/daaw/p68;->f()I

    move-result v2

    const/4 v3, 0x0

    invoke-direct {v0, v1, v3, v2, p1}, Ljava/lang/String;-><init>([BIILjava/nio/charset/Charset;)V

    return-object v0
.end method

.method public final m(Lcom/daaw/n58;)V
    .locals 3

    iget-object v0, p0, Lcom/daaw/p68;->t:[B

    invoke-virtual {p0}, Lcom/daaw/p68;->f()I

    move-result v1

    check-cast p1, Lcom/daaw/n78;

    const/4 v2, 0x0

    invoke-virtual {p1, v0, v2, v1}, Lcom/daaw/n78;->E([BII)V

    return-void
.end method

.method public final n()Z
    .locals 3

    iget-object v0, p0, Lcom/daaw/p68;->t:[B

    invoke-virtual {p0}, Lcom/daaw/p68;->f()I

    move-result v1

    const/4 v2, 0x0

    invoke-static {v0, v2, v1}, Lcom/daaw/ei8;->f([BII)Z

    move-result v0

    return v0
.end method

.method public t()I
    .locals 1

    const/4 v0, 0x0

    return v0
.end method
