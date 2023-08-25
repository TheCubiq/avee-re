.class public Lcom/daaw/bs1;
.super Ljava/lang/Object;
.source ""


# instance fields
.field public a:F

.field public b:F


# direct methods
.method public constructor <init>(FF)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput p1, p0, Lcom/daaw/bs1;->a:F

    iput p2, p0, Lcom/daaw/bs1;->b:F

    return-void
.end method

.method public static a(Ljava/lang/String;Lcom/daaw/bs1;)Lcom/daaw/bs1;
    .locals 2

    if-nez p0, :cond_0

    return-object p1

    :cond_0
    :try_start_0
    const-string v0, " "

    invoke-virtual {p0, v0}, Ljava/lang/String;->indexOf(Ljava/lang/String;)I

    move-result v0

    if-gez v0, :cond_1

    return-object p1

    :cond_1
    const/4 v1, 0x0

    invoke-virtual {p0, v1, v0}, Ljava/lang/String;->substring(II)Ljava/lang/String;

    move-result-object v1

    add-int/lit8 v0, v0, 0x1

    invoke-virtual {p0, v0}, Ljava/lang/String;->substring(I)Ljava/lang/String;

    move-result-object p0

    new-instance v0, Lcom/daaw/bs1;

    invoke-static {v1}, Ljava/lang/Float;->parseFloat(Ljava/lang/String;)F

    move-result v1

    invoke-static {p0}, Ljava/lang/Float;->parseFloat(Ljava/lang/String;)F

    move-result p0

    invoke-direct {v0, v1, p0}, Lcom/daaw/bs1;-><init>(FF)V
    :try_end_0
    .catch Ljava/lang/NumberFormatException; {:try_start_0 .. :try_end_0} :catch_0

    return-object v0

    :catch_0
    return-object p1
.end method

.method public static b(FF)F
    .locals 0

    neg-float p0, p1

    return p0
.end method

.method public static c(FF)F
    .locals 0

    return p0
.end method

.method public static d(FF)F
    .locals 0

    return p1
.end method

.method public static e(FF)F
    .locals 0

    neg-float p0, p0

    return p0
.end method

.method public static g(FFFF)F
    .locals 0

    mul-float p0, p0, p2

    mul-float p1, p1, p3

    add-float/2addr p0, p1

    return p0
.end method

.method public static h(F)Lcom/daaw/bs1;
    .locals 5

    float-to-double v0, p0

    invoke-static {v0, v1}, Ljava/lang/Math;->toRadians(D)D

    move-result-wide v0

    double-to-float p0, v0

    new-instance v0, Lcom/daaw/bs1;

    float-to-double v1, p0

    invoke-static {v1, v2}, Ljava/lang/Math;->cos(D)D

    move-result-wide v3

    double-to-float p0, v3

    invoke-static {v1, v2}, Ljava/lang/Math;->sin(D)D

    move-result-wide v1

    double-to-float v1, v1

    invoke-direct {v0, p0, v1}, Lcom/daaw/bs1;-><init>(FF)V

    return-object v0
.end method

.method public static i(Lcom/daaw/ds1;F)V
    .locals 4

    float-to-double v0, p1

    invoke-static {v0, v1}, Ljava/lang/Math;->cos(D)D

    move-result-wide v2

    double-to-float p1, v2

    iput p1, p0, Lcom/daaw/ds1;->a:F

    invoke-static {v0, v1}, Ljava/lang/Math;->sin(D)D

    move-result-wide v0

    double-to-float p1, v0

    iput p1, p0, Lcom/daaw/ds1;->b:F

    return-void
.end method

.method public static j(FF)F
    .locals 6

    mul-float v0, p0, p0

    mul-float v1, p1, p1

    add-float/2addr v0, v1

    float-to-double v0, v0

    invoke-static {v0, v1}, Ljava/lang/Math;->sqrt(D)D

    move-result-wide v0

    double-to-float v0, v0

    const/4 v1, 0x0

    cmpl-float v2, v0, v1

    if-nez v2, :cond_0

    const/high16 v0, 0x34000000

    :cond_0
    div-float/2addr p0, v0

    div-float/2addr p1, v0

    const-wide/high16 v2, 0x3e80000000000000L

    cmpl-float v0, p1, v1

    if-nez v0, :cond_1

    move-wide v4, v2

    goto :goto_0

    :cond_1
    neg-float p1, p1

    float-to-double v4, p1

    :goto_0
    cmpl-float p1, p0, v1

    if-nez p1, :cond_2

    goto :goto_1

    :cond_2
    float-to-double v2, p0

    :goto_1
    invoke-static {v4, v5, v2, v3}, Ljava/lang/Math;->atan2(DD)D

    move-result-wide p0

    neg-double p0, p0

    double-to-float p0, p0

    cmpg-float p1, p0, v1

    if-gez p1, :cond_3

    const p1, 0x40c90fdb

    add-float/2addr p0, p1

    :cond_3
    return p0
.end method

.method public static l(FF)F
    .locals 0

    mul-float p0, p0, p0

    mul-float p1, p1, p1

    add-float/2addr p0, p1

    float-to-double p0, p0

    invoke-static {p0, p1}, Ljava/lang/Math;->sqrt(D)D

    move-result-wide p0

    double-to-float p0, p0

    return p0
.end method

.method public static q()Lcom/daaw/bs1;
    .locals 2

    new-instance v0, Lcom/daaw/bs1;

    const/high16 v1, 0x3f800000    # 1.0f

    invoke-direct {v0, v1, v1}, Lcom/daaw/bs1;-><init>(FF)V

    return-object v0
.end method

.method public static s()Lcom/daaw/bs1;
    .locals 2

    new-instance v0, Lcom/daaw/bs1;

    const/4 v1, 0x0

    invoke-direct {v0, v1, v1}, Lcom/daaw/bs1;-><init>(FF)V

    return-object v0
.end method


# virtual methods
.method public f(Lcom/daaw/bs1;)F
    .locals 2

    iget v0, p0, Lcom/daaw/bs1;->a:F

    iget v1, p1, Lcom/daaw/bs1;->a:F

    sub-float/2addr v0, v1

    iget v1, p0, Lcom/daaw/bs1;->b:F

    iget p1, p1, Lcom/daaw/bs1;->b:F

    sub-float/2addr v1, p1

    mul-float v0, v0, v0

    mul-float v1, v1, v1

    add-float/2addr v0, v1

    float-to-double v0, v0

    invoke-static {v0, v1}, Ljava/lang/Math;->sqrt(D)D

    move-result-wide v0

    double-to-float p1, v0

    return p1
.end method

.method public k()F
    .locals 2

    iget v0, p0, Lcom/daaw/bs1;->a:F

    mul-float v0, v0, v0

    iget v1, p0, Lcom/daaw/bs1;->b:F

    mul-float v1, v1, v1

    add-float/2addr v0, v1

    float-to-double v0, v0

    invoke-static {v0, v1}, Ljava/lang/Math;->sqrt(D)D

    move-result-wide v0

    double-to-float v0, v0

    return v0
.end method

.method public m(FFF)V
    .locals 1

    iget v0, p0, Lcom/daaw/bs1;->a:F

    mul-float v0, v0, p1

    iget p1, p0, Lcom/daaw/bs1;->b:F

    mul-float p1, p1, p2

    add-float/2addr v0, p1

    const/high16 p1, 0x3e800000    # 0.25f

    invoke-static {v0, p1}, Ljava/lang/Math;->max(FF)F

    move-result p1

    iget p2, p0, Lcom/daaw/bs1;->a:F

    div-float/2addr p3, p1

    mul-float p2, p2, p3

    iput p2, p0, Lcom/daaw/bs1;->a:F

    iget p1, p0, Lcom/daaw/bs1;->b:F

    mul-float p1, p1, p3

    iput p1, p0, Lcom/daaw/bs1;->b:F

    return-void
.end method

.method public n(Lcom/daaw/bs1;F)V
    .locals 2

    iget v0, p0, Lcom/daaw/bs1;->a:F

    iget v1, p1, Lcom/daaw/bs1;->a:F

    mul-float v0, v0, v1

    iget v1, p0, Lcom/daaw/bs1;->b:F

    iget p1, p1, Lcom/daaw/bs1;->b:F

    mul-float v1, v1, p1

    add-float/2addr v0, v1

    const/high16 p1, 0x3e800000    # 0.25f

    invoke-static {v0, p1}, Ljava/lang/Math;->max(FF)F

    move-result p1

    iget v0, p0, Lcom/daaw/bs1;->a:F

    div-float/2addr p2, p1

    mul-float v0, v0, p2

    iput v0, p0, Lcom/daaw/bs1;->a:F

    iget p1, p0, Lcom/daaw/bs1;->b:F

    mul-float p1, p1, p2

    iput p1, p0, Lcom/daaw/bs1;->b:F

    return-void
.end method

.method public o()Lcom/daaw/bs1;
    .locals 2

    iget v0, p0, Lcom/daaw/bs1;->a:F

    mul-float v0, v0, v0

    iget v1, p0, Lcom/daaw/bs1;->b:F

    mul-float v1, v1, v1

    add-float/2addr v0, v1

    float-to-double v0, v0

    invoke-static {v0, v1}, Ljava/lang/Math;->sqrt(D)D

    move-result-wide v0

    double-to-float v0, v0

    iget v1, p0, Lcom/daaw/bs1;->a:F

    div-float/2addr v1, v0

    iput v1, p0, Lcom/daaw/bs1;->a:F

    iget v1, p0, Lcom/daaw/bs1;->b:F

    div-float/2addr v1, v0

    iput v1, p0, Lcom/daaw/bs1;->b:F

    return-object p0
.end method

.method public p()Lcom/daaw/bs1;
    .locals 2

    iget v0, p0, Lcom/daaw/bs1;->a:F

    mul-float v0, v0, v0

    iget v1, p0, Lcom/daaw/bs1;->b:F

    mul-float v1, v1, v1

    add-float/2addr v0, v1

    float-to-double v0, v0

    invoke-static {v0, v1}, Ljava/lang/Math;->sqrt(D)D

    move-result-wide v0

    double-to-float v0, v0

    const/4 v1, 0x0

    cmpl-float v1, v0, v1

    if-nez v1, :cond_0

    const/high16 v0, 0x34000000

    :cond_0
    iget v1, p0, Lcom/daaw/bs1;->a:F

    div-float/2addr v1, v0

    iput v1, p0, Lcom/daaw/bs1;->a:F

    iget v1, p0, Lcom/daaw/bs1;->b:F

    div-float/2addr v1, v0

    iput v1, p0, Lcom/daaw/bs1;->b:F

    return-object p0
.end method

.method public r(F)V
    .locals 4

    float-to-double v0, p1

    invoke-static {v0, v1}, Ljava/lang/Math;->cos(D)D

    move-result-wide v2

    double-to-float p1, v2

    iget v2, p0, Lcom/daaw/bs1;->a:F

    mul-float p1, p1, v2

    invoke-static {v0, v1}, Ljava/lang/Math;->sin(D)D

    move-result-wide v2

    double-to-float v2, v2

    iget v3, p0, Lcom/daaw/bs1;->b:F

    mul-float v2, v2, v3

    sub-float/2addr p1, v2

    invoke-static {v0, v1}, Ljava/lang/Math;->sin(D)D

    move-result-wide v2

    double-to-float v2, v2

    iget v3, p0, Lcom/daaw/bs1;->a:F

    mul-float v2, v2, v3

    invoke-static {v0, v1}, Ljava/lang/Math;->cos(D)D

    move-result-wide v0

    double-to-float v0, v0

    iget v1, p0, Lcom/daaw/bs1;->b:F

    mul-float v0, v0, v1

    add-float/2addr v2, v0

    iput v2, p0, Lcom/daaw/bs1;->b:F

    iput p1, p0, Lcom/daaw/bs1;->a:F

    return-void
.end method

.method public toString()Ljava/lang/String;
    .locals 4

    sget-object v0, Ljava/util/Locale;->US:Ljava/util/Locale;

    const/4 v1, 0x2

    new-array v1, v1, [Ljava/lang/Object;

    iget v2, p0, Lcom/daaw/bs1;->a:F

    invoke-static {v2}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    iget v2, p0, Lcom/daaw/bs1;->b:F

    invoke-static {v2}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    move-result-object v2

    const/4 v3, 0x1

    aput-object v2, v1, v3

    const-string v2, "%f %f"

    invoke-static {v0, v2, v1}, Ljava/lang/String;->format(Ljava/util/Locale;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
