.class public final Lcom/daaw/q97;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Ljava/lang/Comparable;


# instance fields
.field public final p:[B


# direct methods
.method public synthetic constructor <init>([BLcom/daaw/p97;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    array-length p2, p1

    invoke-static {p1, p2}, Ljava/util/Arrays;->copyOf([BI)[B

    move-result-object p1

    iput-object p1, p0, Lcom/daaw/q97;->p:[B

    return-void
.end method


# virtual methods
.method public final bridge synthetic compareTo(Ljava/lang/Object;)I
    .locals 4

    check-cast p1, Lcom/daaw/q97;

    iget-object v0, p0, Lcom/daaw/q97;->p:[B

    array-length v0, v0

    iget-object v1, p1, Lcom/daaw/q97;->p:[B

    array-length v1, v1

    const/4 v2, 0x0

    if-eq v0, v1, :cond_0

    sub-int v2, v0, v1

    goto :goto_1

    :cond_0
    const/4 v0, 0x0

    :goto_0
    iget-object v1, p0, Lcom/daaw/q97;->p:[B

    array-length v3, v1

    if-ge v0, v3, :cond_2

    aget-byte v1, v1, v0

    iget-object v3, p1, Lcom/daaw/q97;->p:[B

    aget-byte v3, v3, v0

    if-eq v1, v3, :cond_1

    sub-int v2, v1, v3

    goto :goto_1

    :cond_1
    add-int/lit8 v0, v0, 0x1

    goto :goto_0

    :cond_2
    :goto_1
    return v2
.end method

.method public final equals(Ljava/lang/Object;)Z
    .locals 1

    instance-of v0, p1, Lcom/daaw/q97;

    if-nez v0, :cond_0

    const/4 p1, 0x0

    return p1

    :cond_0
    check-cast p1, Lcom/daaw/q97;

    iget-object v0, p0, Lcom/daaw/q97;->p:[B

    iget-object p1, p1, Lcom/daaw/q97;->p:[B

    invoke-static {v0, p1}, Ljava/util/Arrays;->equals([B[B)Z

    move-result p1

    return p1
.end method

.method public final hashCode()I
    .locals 1

    iget-object v0, p0, Lcom/daaw/q97;->p:[B

    invoke-static {v0}, Ljava/util/Arrays;->hashCode([B)I

    move-result v0

    return v0
.end method

.method public final toString()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/daaw/q97;->p:[B

    invoke-static {v0}, Lcom/daaw/op7;->a([B)Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
