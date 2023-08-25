.class public Lcom/daaw/pw0;
.super Ljava/lang/Object;
.source ""


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/daaw/pw0$a;
    }
.end annotation


# instance fields
.field public a:I

.field public b:[Lcom/daaw/pw0$a;

.field public c:I


# direct methods
.method public constructor <init>()V
    .locals 1

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const/4 v0, 0x0

    new-array v0, v0, [Lcom/daaw/pw0$a;

    iput-object v0, p0, Lcom/daaw/pw0;->b:[Lcom/daaw/pw0$a;

    return-void
.end method


# virtual methods
.method public a([FI)V
    .locals 7

    iget-object v0, p0, Lcom/daaw/pw0;->b:[Lcom/daaw/pw0$a;

    array-length v0, v0

    array-length v1, p1

    if-eq v0, v1, :cond_0

    array-length v0, p1

    new-array v0, v0, [Lcom/daaw/pw0$a;

    iput-object v0, p0, Lcom/daaw/pw0;->b:[Lcom/daaw/pw0$a;

    :cond_0
    iget-object v0, p0, Lcom/daaw/pw0;->b:[Lcom/daaw/pw0$a;

    array-length v0, v0

    iput v0, p0, Lcom/daaw/pw0;->c:I

    iget v0, p0, Lcom/daaw/pw0;->a:I

    int-to-float v0, v0

    const/high16 v1, 0x43c80000    # 400.0f

    div-float/2addr v0, v1

    invoke-static {v0}, Ljava/lang/Math;->round(F)I

    move-result v0

    iput p2, p0, Lcom/daaw/pw0;->a:I

    const/4 p2, 0x0

    :goto_0
    iget-object v1, p0, Lcom/daaw/pw0;->b:[Lcom/daaw/pw0$a;

    array-length v2, v1

    if-ge p2, v2, :cond_2

    aget v2, p1, p2

    const/high16 v3, 0x3f800000    # 1.0f

    cmpg-float v2, v2, v3

    if-gez v2, :cond_1

    const-wide/16 v2, 0x0

    goto :goto_1

    :cond_1
    iget v2, p0, Lcom/daaw/pw0;->a:I

    int-to-float v2, v2

    aget v3, p1, p2

    div-float/2addr v2, v3

    float-to-double v2, v2

    :goto_1
    new-instance v4, Lcom/daaw/pw0$a;

    int-to-double v5, v0

    invoke-static {v5, v6}, Ljava/lang/Double;->isNaN(D)Z

    div-double/2addr v5, v2

    invoke-static {v5, v6}, Ljava/lang/Math;->round(D)J

    move-result-wide v5

    long-to-int v6, v5

    const/4 v5, 0x1

    invoke-static {v6, v5}, Ljava/lang/Math;->max(II)I

    move-result v5

    invoke-direct {v4, p0, v2, v3, v5}, Lcom/daaw/pw0$a;-><init>(Lcom/daaw/pw0;DI)V

    aput-object v4, v1, p2

    add-int/lit8 p2, p2, 0x1

    goto :goto_0

    :cond_2
    return-void
.end method

.method public b([DII[DDD)V
    .locals 4

    array-length p5, p1

    :goto_0
    if-ge p2, p3, :cond_2

    iget-object p6, p0, Lcom/daaw/pw0;->b:[Lcom/daaw/pw0$a;

    aget-object p6, p6, p2

    invoke-virtual {p6}, Lcom/daaw/pw0$a;->d()V

    iget-object p6, p0, Lcom/daaw/pw0;->b:[Lcom/daaw/pw0$a;

    aget-object p7, p6, p2

    iget p7, p7, Lcom/daaw/pw0$a;->c:I

    const-wide/high16 v0, 0x3ff0000000000000L    # 1.0

    if-lez p7, :cond_1

    const/4 p6, 0x0

    :goto_1
    if-ge p6, p5, :cond_0

    aget-wide p7, p1, p6

    iget-object v2, p0, Lcom/daaw/pw0;->b:[Lcom/daaw/pw0$a;

    aget-object v3, v2, p2

    aget-object v2, v2, p2

    iget v2, v2, Lcom/daaw/pw0$a;->c:I

    rem-int v2, p6, v2

    invoke-virtual {v3, v2, p7, p8}, Lcom/daaw/pw0$a;->a(ID)V

    add-int/lit8 p6, p6, 0x1

    goto :goto_1

    :cond_0
    iget-object p6, p0, Lcom/daaw/pw0;->b:[Lcom/daaw/pw0$a;

    aget-object p6, p6, p2

    invoke-virtual {p6, v0, v1, p5}, Lcom/daaw/pw0$a;->c(DI)D

    move-result-wide p6

    aput-wide p6, p4, p2

    goto :goto_2

    :cond_1
    aget-object p6, p6, p2

    const/4 p7, 0x1

    invoke-virtual {p6, v0, v1, p7}, Lcom/daaw/pw0$a;->c(DI)D

    move-result-wide p6

    aput-wide p6, p4, p2

    :goto_2
    add-int/lit8 p2, p2, 0x1

    goto :goto_0

    :cond_2
    return-void
.end method
