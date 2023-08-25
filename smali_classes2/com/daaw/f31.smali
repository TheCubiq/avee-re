.class public Lcom/daaw/f31;
.super Lcom/daaw/e31;
.source ""


# direct methods
.method public static final a(II)I
    .locals 0

    if-ge p0, p1, :cond_0

    move p0, p1

    :cond_0
    return p0
.end method

.method public static final b(JJ)J
    .locals 1

    cmp-long v0, p0, p2

    if-gez v0, :cond_0

    move-wide p0, p2

    :cond_0
    return-wide p0
.end method

.method public static final c(II)I
    .locals 0

    if-le p0, p1, :cond_0

    move p0, p1

    :cond_0
    return p0
.end method

.method public static final d(JJ)J
    .locals 1

    cmp-long v0, p0, p2

    if-lez v0, :cond_0

    move-wide p0, p2

    :cond_0
    return-wide p0
.end method

.method public static final e(II)Lcom/daaw/ng0;
    .locals 2

    sget-object v0, Lcom/daaw/ng0;->s:Lcom/daaw/ng0$a;

    const/4 v1, -0x1

    invoke-virtual {v0, p0, p1, v1}, Lcom/daaw/ng0$a;->a(III)Lcom/daaw/ng0;

    move-result-object p0

    return-object p0
.end method

.method public static final f(II)Lcom/daaw/pg0;
    .locals 1

    const/high16 v0, -0x80000000

    if-gt p1, v0, :cond_0

    sget-object p0, Lcom/daaw/pg0;->t:Lcom/daaw/pg0$a;

    invoke-virtual {p0}, Lcom/daaw/pg0$a;->a()Lcom/daaw/pg0;

    move-result-object p0

    return-object p0

    :cond_0
    new-instance v0, Lcom/daaw/pg0;

    add-int/lit8 p1, p1, -0x1

    invoke-direct {v0, p0, p1}, Lcom/daaw/pg0;-><init>(II)V

    return-object v0
.end method
