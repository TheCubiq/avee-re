.class public final Lcom/daaw/ea2;
.super Ljava/lang/Object;
.source ""


# direct methods
.method public static a([B)Ljava/util/UUID;
    .locals 9

    new-instance v0, Lcom/daaw/ik5;

    invoke-direct {v0, p0}, Lcom/daaw/ik5;-><init>([B)V

    invoke-virtual {v0}, Lcom/daaw/ik5;->l()I

    move-result p0

    const/4 v1, 0x0

    const/16 v2, 0x20

    if-ge p0, v2, :cond_0

    :goto_0
    move-object p0, v1

    goto :goto_1

    :cond_0
    const/4 p0, 0x0

    invoke-virtual {v0, p0}, Lcom/daaw/ik5;->f(I)V

    invoke-virtual {v0}, Lcom/daaw/ik5;->m()I

    move-result v2

    invoke-virtual {v0}, Lcom/daaw/ik5;->i()I

    move-result v3

    add-int/lit8 v3, v3, 0x4

    if-eq v2, v3, :cond_1

    goto :goto_0

    :cond_1
    invoke-virtual {v0}, Lcom/daaw/ik5;->m()I

    move-result v2

    const v3, 0x70737368    # 3.013775E29f

    if-eq v2, v3, :cond_2

    goto :goto_0

    :cond_2
    invoke-virtual {v0}, Lcom/daaw/ik5;->m()I

    move-result v2

    invoke-static {v2}, Lcom/daaw/c92;->a(I)I

    move-result v2

    const/4 v3, 0x1

    if-le v2, v3, :cond_3

    new-instance p0, Ljava/lang/StringBuilder;

    invoke-direct {p0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v0, "Unsupported pssh version: "

    invoke-virtual {p0, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p0, v2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {p0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p0

    const-string v0, "PsshAtomUtil"

    invoke-static {v0, p0}, Lcom/daaw/s95;->e(Ljava/lang/String;Ljava/lang/String;)V

    goto :goto_0

    :cond_3
    new-instance v4, Ljava/util/UUID;

    invoke-virtual {v0}, Lcom/daaw/ik5;->z()J

    move-result-wide v5

    invoke-virtual {v0}, Lcom/daaw/ik5;->z()J

    move-result-wide v7

    invoke-direct {v4, v5, v6, v7, v8}, Ljava/util/UUID;-><init>(JJ)V

    if-ne v2, v3, :cond_4

    invoke-virtual {v0}, Lcom/daaw/ik5;->v()I

    move-result v3

    mul-int/lit8 v3, v3, 0x10

    invoke-virtual {v0, v3}, Lcom/daaw/ik5;->g(I)V

    :cond_4
    invoke-virtual {v0}, Lcom/daaw/ik5;->v()I

    move-result v3

    invoke-virtual {v0}, Lcom/daaw/ik5;->i()I

    move-result v5

    if-eq v3, v5, :cond_5

    goto :goto_0

    :cond_5
    new-array v5, v3, [B

    invoke-virtual {v0, v5, p0, v3}, Lcom/daaw/ik5;->b([BII)V

    new-instance p0, Lcom/daaw/da2;

    invoke-direct {p0, v4, v2, v5}, Lcom/daaw/da2;-><init>(Ljava/util/UUID;I[B)V

    :goto_1
    if-nez p0, :cond_6

    return-object v1

    :cond_6
    invoke-static {p0}, Lcom/daaw/da2;->a(Lcom/daaw/da2;)Ljava/util/UUID;

    move-result-object p0

    return-object p0
.end method
