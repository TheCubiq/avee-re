.class public Lcom/daaw/la1;
.super Ljava/lang/Object;
.source ""


# instance fields
.field public a:[Lcom/daaw/es1;


# direct methods
.method public constructor <init>(Ljava/util/List;)V
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "Lcom/daaw/es1;",
            ">;)V"
        }
    .end annotation

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    invoke-interface {p1}, Ljava/util/List;->size()I

    move-result v0

    new-array v0, v0, [Lcom/daaw/es1;

    iput-object v0, p0, Lcom/daaw/la1;->a:[Lcom/daaw/es1;

    const/4 v0, 0x0

    :goto_0
    iget-object v1, p0, Lcom/daaw/la1;->a:[Lcom/daaw/es1;

    array-length v2, v1

    if-ge v0, v2, :cond_0

    invoke-interface {p1, v0}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lcom/daaw/es1;

    aput-object v2, v1, v0

    add-int/lit8 v0, v0, 0x1

    goto :goto_0

    :cond_0
    return-void
.end method


# virtual methods
.method public a()F
    .locals 5

    const/4 v0, 0x0

    const/4 v1, 0x0

    :goto_0
    iget-object v2, p0, Lcom/daaw/la1;->a:[Lcom/daaw/es1;

    array-length v3, v2

    if-ge v1, v3, :cond_0

    aget-object v2, v2, v1

    iget v3, v2, Lcom/daaw/es1;->a:F

    iget v4, v2, Lcom/daaw/es1;->c:F

    sub-float/2addr v3, v4

    iget v4, v2, Lcom/daaw/es1;->b:F

    iget v2, v2, Lcom/daaw/es1;->d:F

    sub-float/2addr v4, v2

    invoke-static {v3, v4}, Lcom/daaw/bs1;->l(FF)F

    move-result v2

    add-float/2addr v0, v2

    add-int/lit8 v1, v1, 0x1

    goto :goto_0

    :cond_0
    return v0
.end method

.method public b(F[F[F)Z
    .locals 9

    const/4 v0, 0x2

    if-eqz p2, :cond_0

    array-length v1, p2

    if-lt v1, v0, :cond_1

    :cond_0
    if-eqz p3, :cond_2

    array-length v1, p3

    if-lt v1, v0, :cond_1

    goto :goto_0

    :cond_1
    new-instance p1, Ljava/lang/ArrayIndexOutOfBoundsException;

    invoke-direct {p1}, Ljava/lang/ArrayIndexOutOfBoundsException;-><init>()V

    throw p1

    :cond_2
    :goto_0
    const/4 v0, 0x0

    const/4 v1, 0x0

    const/4 v2, 0x0

    :goto_1
    iget-object v3, p0, Lcom/daaw/la1;->a:[Lcom/daaw/es1;

    array-length v4, v3

    const/4 v5, 0x1

    if-ge v2, v4, :cond_4

    aget-object v3, v3, v2

    new-instance v4, Lcom/daaw/bs1;

    iget v6, v3, Lcom/daaw/es1;->c:F

    iget v7, v3, Lcom/daaw/es1;->a:F

    sub-float/2addr v6, v7

    iget v7, v3, Lcom/daaw/es1;->d:F

    iget v8, v3, Lcom/daaw/es1;->b:F

    sub-float/2addr v7, v8

    invoke-direct {v4, v6, v7}, Lcom/daaw/bs1;-><init>(FF)V

    iget v6, v4, Lcom/daaw/bs1;->a:F

    iget v7, v4, Lcom/daaw/bs1;->b:F

    invoke-static {v6, v7}, Lcom/daaw/bs1;->l(FF)F

    move-result v6

    add-float/2addr v6, v0

    cmpg-float v7, p1, v6

    if-gez v7, :cond_3

    sub-float/2addr p1, v0

    invoke-virtual {v4}, Lcom/daaw/bs1;->o()Lcom/daaw/bs1;

    iget v0, v4, Lcom/daaw/bs1;->a:F

    aput v0, p3, v1

    iget v2, v4, Lcom/daaw/bs1;->b:F

    aput v2, p3, v5

    iget p3, v3, Lcom/daaw/es1;->a:F

    mul-float v0, v0, p1

    add-float/2addr p3, v0

    aput p3, p2, v1

    iget p3, v3, Lcom/daaw/es1;->b:F

    mul-float v2, v2, p1

    add-float/2addr p3, v2

    aput p3, p2, v5

    return v5

    :cond_3
    add-int/lit8 v2, v2, 0x1

    move v0, v6

    goto :goto_1

    :cond_4
    return v5
.end method
