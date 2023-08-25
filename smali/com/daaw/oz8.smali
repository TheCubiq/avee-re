.class public final Lcom/daaw/oz8;
.super Ljava/lang/Object;
.source ""


# direct methods
.method public static a(JLcom/daaw/ik5;[Lcom/daaw/m42;)V
    .locals 10

    :goto_0
    invoke-virtual {p2}, Lcom/daaw/ik5;->i()I

    move-result v0

    const/4 v1, 0x1

    if-le v0, v1, :cond_9

    invoke-static {p2}, Lcom/daaw/oz8;->c(Lcom/daaw/ik5;)I

    move-result v0

    invoke-static {p2}, Lcom/daaw/oz8;->c(Lcom/daaw/ik5;)I

    move-result v2

    invoke-virtual {p2}, Lcom/daaw/ik5;->k()I

    move-result v3

    add-int/2addr v3, v2

    const/4 v4, -0x1

    if-eq v2, v4, :cond_7

    invoke-virtual {p2}, Lcom/daaw/ik5;->i()I

    move-result v4

    if-le v2, v4, :cond_0

    goto :goto_4

    :cond_0
    const/4 v4, 0x4

    if-ne v0, v4, :cond_8

    const/16 v0, 0x8

    if-lt v2, v0, :cond_8

    invoke-virtual {p2}, Lcom/daaw/ik5;->s()I

    move-result v0

    invoke-virtual {p2}, Lcom/daaw/ik5;->w()I

    move-result v2

    const/16 v4, 0x31

    const/4 v5, 0x0

    if-ne v2, v4, :cond_1

    invoke-virtual {p2}, Lcom/daaw/ik5;->m()I

    move-result v2

    move v6, v2

    const/16 v2, 0x31

    goto :goto_1

    :cond_1
    const/4 v6, 0x0

    :goto_1
    invoke-virtual {p2}, Lcom/daaw/ik5;->s()I

    move-result v7

    const/16 v8, 0x2f

    if-ne v2, v8, :cond_2

    invoke-virtual {p2, v1}, Lcom/daaw/ik5;->g(I)V

    const/16 v2, 0x2f

    :cond_2
    const/16 v9, 0xb5

    if-ne v0, v9, :cond_4

    if-eq v2, v4, :cond_3

    if-ne v2, v8, :cond_4

    :cond_3
    const/4 v0, 0x3

    if-ne v7, v0, :cond_4

    const/4 v0, 0x1

    goto :goto_2

    :cond_4
    const/4 v0, 0x0

    :goto_2
    if-ne v2, v4, :cond_6

    const v2, 0x47413934

    if-ne v6, v2, :cond_5

    goto :goto_3

    :cond_5
    const/4 v1, 0x0

    :goto_3
    and-int/2addr v0, v1

    :cond_6
    if-eqz v0, :cond_8

    invoke-static {p0, p1, p2, p3}, Lcom/daaw/oz8;->b(JLcom/daaw/ik5;[Lcom/daaw/m42;)V

    goto :goto_5

    :cond_7
    :goto_4
    const-string v0, "CeaUtil"

    const-string v1, "Skipping remainder of malformed SEI NAL unit."

    invoke-static {v0, v1}, Lcom/daaw/s95;->e(Ljava/lang/String;Ljava/lang/String;)V

    invoke-virtual {p2}, Lcom/daaw/ik5;->l()I

    move-result v3

    :cond_8
    :goto_5
    invoke-virtual {p2, v3}, Lcom/daaw/ik5;->f(I)V

    goto :goto_0

    :cond_9
    return-void
.end method

.method public static b(JLcom/daaw/ik5;[Lcom/daaw/m42;)V
    .locals 11

    invoke-virtual {p2}, Lcom/daaw/ik5;->s()I

    move-result v0

    and-int/lit8 v1, v0, 0x40

    if-eqz v1, :cond_1

    const/4 v1, 0x1

    invoke-virtual {p2, v1}, Lcom/daaw/ik5;->g(I)V

    and-int/lit8 v0, v0, 0x1f

    mul-int/lit8 v0, v0, 0x3

    invoke-virtual {p2}, Lcom/daaw/ik5;->k()I

    move-result v8

    array-length v9, p3

    const/4 v1, 0x0

    const/4 v10, 0x0

    :goto_0
    if-ge v10, v9, :cond_1

    aget-object v1, p3, v10

    invoke-virtual {p2, v8}, Lcom/daaw/ik5;->f(I)V

    invoke-interface {v1, p2, v0}, Lcom/daaw/m42;->c(Lcom/daaw/ik5;I)V

    const-wide v2, -0x7fffffffffffffffL    # -4.9E-324

    cmp-long v4, p0, v2

    if-eqz v4, :cond_0

    const/4 v4, 0x1

    const/4 v6, 0x0

    const/4 v7, 0x0

    move-wide v2, p0

    move v5, v0

    invoke-interface/range {v1 .. v7}, Lcom/daaw/m42;->b(JIIILcom/daaw/l42;)V

    :cond_0
    add-int/lit8 v10, v10, 0x1

    goto :goto_0

    :cond_1
    return-void
.end method

.method public static c(Lcom/daaw/ik5;)I
    .locals 3

    const/4 v0, 0x0

    :cond_0
    invoke-virtual {p0}, Lcom/daaw/ik5;->i()I

    move-result v1

    if-nez v1, :cond_1

    const/4 p0, -0x1

    return p0

    :cond_1
    invoke-virtual {p0}, Lcom/daaw/ik5;->s()I

    move-result v1

    add-int/2addr v0, v1

    const/16 v2, 0xff

    if-eq v1, v2, :cond_0

    return v0
.end method
