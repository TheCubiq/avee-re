.class public Lcom/daaw/avee/Common/Vec3f;
.super Ljava/lang/Object;
.source "Vec3f.java"


# static fields
.field private static final edF:F = 1.0E-4f

.field private static final epsilonF:F = 1.1920929E-7f


# instance fields
.field public x:F

.field public y:F

.field public z:F


# direct methods
.method public constructor <init>(FFF)V
    .locals 0

    .line 13
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 14
    iput p1, p0, Lcom/daaw/avee/Common/Vec3f;->x:F

    .line 15
    iput p2, p0, Lcom/daaw/avee/Common/Vec3f;->y:F

    .line 16
    iput p3, p0, Lcom/daaw/avee/Common/Vec3f;->z:F

    return-void
.end method

.method public static cross(Lcom/daaw/avee/Common/Vec3f;Lcom/daaw/avee/Common/Vec3f;)Lcom/daaw/avee/Common/Vec3f;
    .locals 7

    .line 20
    new-instance v0, Lcom/daaw/avee/Common/Vec3f;

    iget v1, p0, Lcom/daaw/avee/Common/Vec3f;->y:F

    iget v2, p1, Lcom/daaw/avee/Common/Vec3f;->z:F

    mul-float v3, v1, v2

    iget v4, p0, Lcom/daaw/avee/Common/Vec3f;->z:F

    iget v5, p1, Lcom/daaw/avee/Common/Vec3f;->y:F

    mul-float v6, v4, v5

    sub-float/2addr v3, v6

    iget p1, p1, Lcom/daaw/avee/Common/Vec3f;->x:F

    mul-float v4, v4, p1

    iget p0, p0, Lcom/daaw/avee/Common/Vec3f;->x:F

    mul-float v2, v2, p0

    sub-float/2addr v4, v2

    mul-float p0, p0, v5

    mul-float v1, v1, p1

    sub-float/2addr p0, v1

    invoke-direct {v0, v3, v4, p0}, Lcom/daaw/avee/Common/Vec3f;-><init>(FFF)V

    return-object v0
.end method

.method public static length(FFF)F
    .locals 0

    mul-float p0, p0, p0

    mul-float p1, p1, p1

    add-float/2addr p0, p1

    mul-float p2, p2, p2

    add-float/2addr p0, p2

    float-to-double p0, p0

    .line 31
    invoke-static {p0, p1}, Ljava/lang/Math;->sqrt(D)D

    move-result-wide p0

    double-to-float p0, p0

    return p0
.end method


# virtual methods
.method public cross(Lcom/daaw/avee/Common/Vec3f;)Lcom/daaw/avee/Common/Vec3f;
    .locals 7

    .line 47
    new-instance v0, Lcom/daaw/avee/Common/Vec3f;

    iget v1, p0, Lcom/daaw/avee/Common/Vec3f;->y:F

    iget v2, p1, Lcom/daaw/avee/Common/Vec3f;->z:F

    mul-float v3, v1, v2

    iget v4, p0, Lcom/daaw/avee/Common/Vec3f;->z:F

    iget v5, p1, Lcom/daaw/avee/Common/Vec3f;->y:F

    mul-float v6, v4, v5

    sub-float/2addr v3, v6

    iget p1, p1, Lcom/daaw/avee/Common/Vec3f;->x:F

    mul-float v4, v4, p1

    iget v6, p0, Lcom/daaw/avee/Common/Vec3f;->x:F

    mul-float v2, v2, v6

    sub-float/2addr v4, v2

    mul-float v6, v6, v5

    mul-float v1, v1, p1

    sub-float/2addr v6, v1

    invoke-direct {v0, v3, v4, v6}, Lcom/daaw/avee/Common/Vec3f;-><init>(FFF)V

    return-object v0
.end method

.method public dot(Lcom/daaw/avee/Common/Vec3f;)F
    .locals 3

    .line 54
    iget v0, p0, Lcom/daaw/avee/Common/Vec3f;->x:F

    iget v1, p1, Lcom/daaw/avee/Common/Vec3f;->x:F

    mul-float v0, v0, v1

    iget v1, p0, Lcom/daaw/avee/Common/Vec3f;->y:F

    iget v2, p1, Lcom/daaw/avee/Common/Vec3f;->y:F

    mul-float v1, v1, v2

    add-float/2addr v0, v1

    iget v1, p0, Lcom/daaw/avee/Common/Vec3f;->z:F

    iget p1, p1, Lcom/daaw/avee/Common/Vec3f;->z:F

    mul-float v1, v1, p1

    add-float/2addr v0, v1

    return v0
.end method

.method public getAngle2d()F
    .locals 8

    .line 58
    invoke-virtual {p0}, Lcom/daaw/avee/Common/Vec3f;->length()F

    move-result v0

    const/4 v1, 0x0

    cmpl-float v2, v0, v1

    if-nez v2, :cond_0

    const/high16 v0, 0x34000000

    .line 60
    :cond_0
    iget v2, p0, Lcom/daaw/avee/Common/Vec3f;->x:F

    div-float/2addr v2, v0

    .line 61
    iget v3, p0, Lcom/daaw/avee/Common/Vec3f;->y:F

    div-float/2addr v3, v0

    const-wide/high16 v4, 0x3e80000000000000L

    cmpl-float v0, v3, v1

    if-nez v0, :cond_1

    move-wide v6, v4

    goto :goto_0

    :cond_1
    neg-float v0, v3

    float-to-double v6, v0

    :goto_0
    cmpl-float v0, v2, v1

    if-nez v0, :cond_2

    goto :goto_1

    :cond_2
    float-to-double v4, v2

    .line 63
    :goto_1
    invoke-static {v6, v7, v4, v5}, Ljava/lang/Math;->atan2(DD)D

    move-result-wide v2

    neg-double v2, v2

    double-to-float v0, v2

    cmpg-float v1, v0, v1

    if-gez v1, :cond_3

    const v1, 0x40c90fdb

    add-float/2addr v0, v1

    :cond_3
    return v0
.end method

.method public length()F
    .locals 2

    .line 27
    iget v0, p0, Lcom/daaw/avee/Common/Vec3f;->x:F

    mul-float v0, v0, v0

    iget v1, p0, Lcom/daaw/avee/Common/Vec3f;->y:F

    mul-float v1, v1, v1

    add-float/2addr v0, v1

    iget v1, p0, Lcom/daaw/avee/Common/Vec3f;->z:F

    mul-float v1, v1, v1

    add-float/2addr v0, v1

    float-to-double v0, v0

    invoke-static {v0, v1}, Ljava/lang/Math;->sqrt(D)D

    move-result-wide v0

    double-to-float v0, v0

    return v0
.end method

.method public normalize()V
    .locals 2

    .line 35
    invoke-virtual {p0}, Lcom/daaw/avee/Common/Vec3f;->length()F

    move-result v0

    .line 36
    iget v1, p0, Lcom/daaw/avee/Common/Vec3f;->x:F

    div-float/2addr v1, v0

    iput v1, p0, Lcom/daaw/avee/Common/Vec3f;->x:F

    .line 37
    iget v1, p0, Lcom/daaw/avee/Common/Vec3f;->y:F

    div-float/2addr v1, v0

    iput v1, p0, Lcom/daaw/avee/Common/Vec3f;->y:F

    .line 38
    iget v1, p0, Lcom/daaw/avee/Common/Vec3f;->z:F

    div-float/2addr v1, v0

    iput v1, p0, Lcom/daaw/avee/Common/Vec3f;->z:F

    return-void
.end method

.method public normalizedResult()Lcom/daaw/avee/Common/Vec3f;
    .locals 5

    .line 42
    invoke-virtual {p0}, Lcom/daaw/avee/Common/Vec3f;->length()F

    move-result v0

    .line 43
    new-instance v1, Lcom/daaw/avee/Common/Vec3f;

    iget v2, p0, Lcom/daaw/avee/Common/Vec3f;->x:F

    div-float/2addr v2, v0

    iget v3, p0, Lcom/daaw/avee/Common/Vec3f;->y:F

    div-float/2addr v3, v0

    iget v4, p0, Lcom/daaw/avee/Common/Vec3f;->z:F

    div-float/2addr v4, v0

    invoke-direct {v1, v2, v3, v4}, Lcom/daaw/avee/Common/Vec3f;-><init>(FFF)V

    return-object v1
.end method
