.class public final Lcom/daaw/pg1;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Ljava/lang/Comparable;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Ljava/lang/Comparable<",
        "Lcom/daaw/pg1;",
        ">;"
    }
.end annotation


# instance fields
.field public final p:I

.field public final q:I


# virtual methods
.method public a(Lcom/daaw/pg1;)I
    .locals 2

    iget v0, p0, Lcom/daaw/pg1;->p:I

    iget v1, p1, Lcom/daaw/pg1;->p:I

    sub-int/2addr v0, v1

    if-nez v0, :cond_0

    iget v0, p0, Lcom/daaw/pg1;->q:I

    iget p1, p1, Lcom/daaw/pg1;->q:I

    sub-int/2addr v0, p1

    :cond_0
    return v0
.end method

.method public bridge synthetic compareTo(Ljava/lang/Object;)I
    .locals 0

    check-cast p1, Lcom/daaw/pg1;

    invoke-virtual {p0, p1}, Lcom/daaw/pg1;->a(Lcom/daaw/pg1;)I

    move-result p1

    return p1
.end method

.method public equals(Ljava/lang/Object;)Z
    .locals 4

    const/4 v0, 0x1

    if-ne p0, p1, :cond_0

    return v0

    :cond_0
    const/4 v1, 0x0

    if-eqz p1, :cond_3

    const-class v2, Lcom/daaw/pg1;

    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v3

    if-eq v2, v3, :cond_1

    goto :goto_1

    :cond_1
    check-cast p1, Lcom/daaw/pg1;

    iget v2, p0, Lcom/daaw/pg1;->p:I

    iget v3, p1, Lcom/daaw/pg1;->p:I

    if-ne v2, v3, :cond_2

    iget v2, p0, Lcom/daaw/pg1;->q:I

    iget p1, p1, Lcom/daaw/pg1;->q:I

    if-ne v2, p1, :cond_2

    goto :goto_0

    :cond_2
    const/4 v0, 0x0

    :goto_0
    return v0

    :cond_3
    :goto_1
    return v1
.end method

.method public hashCode()I
    .locals 2

    iget v0, p0, Lcom/daaw/pg1;->p:I

    mul-int/lit8 v0, v0, 0x1f

    iget v1, p0, Lcom/daaw/pg1;->q:I

    add-int/2addr v0, v1

    return v0
.end method

.method public toString()Ljava/lang/String;
    .locals 2

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    iget v1, p0, Lcom/daaw/pg1;->p:I

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v1, "."

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget v1, p0, Lcom/daaw/pg1;->q:I

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
