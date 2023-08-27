.class public Lcom/daaw/avee/Common/Vec2f;
.super Ljava/lang/Object;
.source "Vec2f.java"


# static fields
.field private static final edF:F = 1.0E-4f

.field private static final epsilonF:F = 1.1920929E-7f


# instance fields
.field public x:F

.field public y:F


# direct methods
.method public constructor <init>(FF)V
    .locals 0

    .line 46
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 47
    iput p1, p0, Lcom/daaw/avee/Common/Vec2f;->x:F

    .line 48
    iput p2, p0, Lcom/daaw/avee/Common/Vec2f;->y:F

    return-void
.end method

.method public static FromString(Ljava/lang/String;Lcom/daaw/avee/Common/Vec2f;)Lcom/daaw/avee/Common/Vec2f;
    .locals 2

    if-nez p0, :cond_0

    return-object p1

    :cond_0
    :try_start_0
    const-string v0, " "

    .line 36
    invoke-virtual {p0, v0}, Ljava/lang/String;->indexOf(Ljava/lang/String;)I

    move-result v0

    if-gez v0, :cond_1

    return-object p1

    :cond_1
    const/4 v1, 0x0

    .line 38
    invoke-virtual {p0, v1, v0}, Ljava/lang/String;->substring(II)Ljava/lang/String;

    move-result-object v1

    add-int/lit8 v0, v0, 0x1

    .line 39
    invoke-virtual {p0, v0}, Ljava/lang/String;->substring(I)Ljava/lang/String;

    move-result-object p0

    .line 40
    new-instance v0, Lcom/daaw/avee/Common/Vec2f;

    invoke-static {v1}, Ljava/lang/Float;->parseFloat(Ljava/lang/String;)F

    move-result v1

    invoke-static {p0}, Ljava/lang/Float;->parseFloat(Ljava/lang/String;)F

    move-result p0

    invoke-direct {v0, v1, p0}, Lcom/daaw/avee/Common/Vec2f;-><init>(FF)V
    :try_end_0
    .catch Ljava/lang/NumberFormatException; {:try_start_0 .. :try_end_0} :catch_0

    return-object v0

    :catch_0
    return-object p1
.end method

.method public static ccw90X(FF)F
    .locals 0

    neg-float p0, p1

    return p0
.end method

.method public static ccw90Y(FF)F
    .locals 0

    return p0
.end method

.method public static cross(Lcom/daaw/avee/Common/Vec2f;Lcom/daaw/avee/Common/Vec2f;)F
    .locals 2

    .line 98
    iget v0, p0, Lcom/daaw/avee/Common/Vec2f;->x:F

    iget v1, p1, Lcom/daaw/avee/Common/Vec2f;->y:F

    mul-float v0, v0, v1

    iget p0, p0, Lcom/daaw/avee/Common/Vec2f;->y:F

    iget p1, p1, Lcom/daaw/avee/Common/Vec2f;->x:F

    mul-float p0, p0, p1

    sub-float/2addr v0, p0

    return v0
.end method

.method public static cw90X(FF)F
    .locals 0

    return p1
.end method

.method public static cw90Y(FF)F
    .locals 0

    neg-float p0, p0

    return p0
.end method

.method public static dot(FFFF)F
    .locals 0

    mul-float p0, p0, p2

    mul-float p1, p1, p3

    add-float/2addr p0, p1

    return p0
.end method

.method public static dot(Lcom/daaw/avee/Common/Vec2f;Lcom/daaw/avee/Common/Vec2f;)F
    .locals 2

    .line 102
    iget v0, p0, Lcom/daaw/avee/Common/Vec2f;->x:F

    iget v1, p1, Lcom/daaw/avee/Common/Vec2f;->x:F

    mul-float v0, v0, v1

    iget p0, p0, Lcom/daaw/avee/Common/Vec2f;->y:F

    iget p1, p1, Lcom/daaw/avee/Common/Vec2f;->y:F

    mul-float p0, p0, p1

    add-float/2addr v0, p0

    return v0
.end method

.method public static fromAngle(F)Lcom/daaw/avee/Common/Vec2f;
    .locals 5

    .line 79
    new-instance v0, Lcom/daaw/avee/Common/Vec2f;

    float-to-double v1, p0

    invoke-static {v1, v2}, Ljava/lang/Math;->cos(D)D

    move-result-wide v3

    double-to-float p0, v3

    invoke-static {v1, v2}, Ljava/lang/Math;->sin(D)D

    move-result-wide v1

    double-to-float v1, v1

    invoke-direct {v0, p0, v1}, Lcom/daaw/avee/Common/Vec2f;-><init>(FF)V

    return-object v0
.end method

.method public static fromAngle(Lcom/daaw/avee/Common/Vec2f;F)V
    .locals 4

    float-to-double v0, p1

    .line 83
    invoke-static {v0, v1}, Ljava/lang/Math;->cos(D)D

    move-result-wide v2

    double-to-float p1, v2

    iput p1, p0, Lcom/daaw/avee/Common/Vec2f;->x:F

    .line 84
    invoke-static {v0, v1}, Ljava/lang/Math;->sin(D)D

    move-result-wide v0

    double-to-float p1, v0

    iput p1, p0, Lcom/daaw/avee/Common/Vec2f;->y:F

    return-void
.end method

.method public static fromAngleRad(F)Lcom/daaw/avee/Common/Vec2f;
    .locals 5

    float-to-double v0, p0

    .line 73
    invoke-static {v0, v1}, Ljava/lang/Math;->toRadians(D)D

    move-result-wide v0

    double-to-float p0, v0

    .line 74
    new-instance v0, Lcom/daaw/avee/Common/Vec2f;

    float-to-double v1, p0

    invoke-static {v1, v2}, Ljava/lang/Math;->cos(D)D

    move-result-wide v3

    double-to-float p0, v3

    invoke-static {v1, v2}, Ljava/lang/Math;->sin(D)D

    move-result-wide v1

    double-to-float v1, v1

    invoke-direct {v0, p0, v1}, Lcom/daaw/avee/Common/Vec2f;-><init>(FF)V

    return-object v0
.end method

.method public static fromAngleXY(Lcom/daaw/avee/Common/Vec3f;F)V
    .locals 4

    float-to-double v0, p1

    .line 88
    invoke-static {v0, v1}, Ljava/lang/Math;->cos(D)D

    move-result-wide v2

    double-to-float p1, v2

    iput p1, p0, Lcom/daaw/avee/Common/Vec3f;->x:F

    .line 89
    invoke-static {v0, v1}, Ljava/lang/Math;->sin(D)D

    move-result-wide v0

    double-to-float p1, v0

    iput p1, p0, Lcom/daaw/avee/Common/Vec3f;->y:F

    return-void
.end method

.method public static getAngle(FF)F
    .locals 6

    mul-float v0, p0, p0

    mul-float v1, p1, p1

    add-float/2addr v0, v1

    float-to-double v0, v0

    .line 198
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

    .line 203
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

.method public static interpolate(FLcom/daaw/avee/Common/Vec2f;Lcom/daaw/avee/Common/Vec2f;Lcom/daaw/avee/Common/Vec2f;)V
    .locals 2

    .line 136
    iget v0, p1, Lcom/daaw/avee/Common/Vec2f;->x:F

    iget v1, p2, Lcom/daaw/avee/Common/Vec2f;->x:F

    sub-float/2addr v1, v0

    mul-float v1, v1, p0

    add-float/2addr v0, v1

    iput v0, p3, Lcom/daaw/avee/Common/Vec2f;->x:F

    .line 137
    iget p1, p1, Lcom/daaw/avee/Common/Vec2f;->y:F

    iget p2, p2, Lcom/daaw/avee/Common/Vec2f;->y:F

    sub-float/2addr p2, p1

    mul-float p0, p0, p2

    add-float/2addr p1, p0

    iput p1, p3, Lcom/daaw/avee/Common/Vec2f;->y:F

    return-void
.end method

.method public static invalid()Lcom/daaw/avee/Common/Vec2f;
    .locals 2

    .line 17
    new-instance v0, Lcom/daaw/avee/Common/Vec2f;

    const v1, -0x800001

    invoke-direct {v0, v1, v1}, Lcom/daaw/avee/Common/Vec2f;-><init>(FF)V

    return-object v0
.end method

.method public static length(FF)F
    .locals 0

    mul-float p0, p0, p0

    mul-float p1, p1, p1

    add-float/2addr p0, p1

    float-to-double p0, p0

    .line 158
    invoke-static {p0, p1}, Ljava/lang/Math;->sqrt(D)D

    move-result-wide p0

    double-to-float p0, p0

    return p0
.end method

.method public static normalizeAndDot(FFFF)F
    .locals 2

    mul-float v0, p0, p0

    mul-float v1, p1, p1

    add-float/2addr v0, v1

    float-to-double v0, v0

    .line 124
    invoke-static {v0, v1}, Ljava/lang/Math;->sqrt(D)D

    move-result-wide v0

    double-to-float v0, v0

    div-float/2addr p0, v0

    div-float/2addr p1, v0

    mul-float v0, p2, p2

    mul-float v1, p3, p3

    add-float/2addr v0, v1

    float-to-double v0, v0

    .line 128
    invoke-static {v0, v1}, Ljava/lang/Math;->sqrt(D)D

    move-result-wide v0

    double-to-float v0, v0

    div-float/2addr p2, v0

    div-float/2addr p3, v0

    mul-float p0, p0, p2

    mul-float p1, p1, p3

    add-float/2addr p0, p1

    return p0
.end method

.method public static one()Lcom/daaw/avee/Common/Vec2f;
    .locals 2

    .line 27
    new-instance v0, Lcom/daaw/avee/Common/Vec2f;

    const/high16 v1, 0x3f800000    # 1.0f

    invoke-direct {v0, v1, v1}, Lcom/daaw/avee/Common/Vec2f;-><init>(FF)V

    return-object v0
.end method

.method public static rotate(Lcom/daaw/avee/Common/Vec2f;F)Lcom/daaw/avee/Common/Vec2f;
    .locals 5

    .line 93
    new-instance v0, Lcom/daaw/avee/Common/Vec2f;

    float-to-double v1, p1

    invoke-static {v1, v2}, Ljava/lang/Math;->cos(D)D

    move-result-wide v3

    double-to-float p1, v3

    iget v3, p0, Lcom/daaw/avee/Common/Vec2f;->x:F

    mul-float p1, p1, v3

    invoke-static {v1, v2}, Ljava/lang/Math;->sin(D)D

    move-result-wide v3

    double-to-float v3, v3

    iget v4, p0, Lcom/daaw/avee/Common/Vec2f;->y:F

    mul-float v3, v3, v4

    sub-float/2addr p1, v3

    .line 94
    invoke-static {v1, v2}, Ljava/lang/Math;->sin(D)D

    move-result-wide v3

    double-to-float v3, v3

    iget v4, p0, Lcom/daaw/avee/Common/Vec2f;->x:F

    mul-float v3, v3, v4

    invoke-static {v1, v2}, Ljava/lang/Math;->cos(D)D

    move-result-wide v1

    double-to-float v1, v1

    iget p0, p0, Lcom/daaw/avee/Common/Vec2f;->y:F

    mul-float v1, v1, p0

    add-float/2addr v3, v1

    invoke-direct {v0, p1, v3}, Lcom/daaw/avee/Common/Vec2f;-><init>(FF)V

    return-object v0
.end method

.method public static zero()Lcom/daaw/avee/Common/Vec2f;
    .locals 2

    .line 22
    new-instance v0, Lcom/daaw/avee/Common/Vec2f;

    const/4 v1, 0x0

    invoke-direct {v0, v1, v1}, Lcom/daaw/avee/Common/Vec2f;-><init>(FF)V

    return-object v0
.end method


# virtual methods
.method public abs()V
    .locals 1

    .line 153
    iget v0, p0, Lcom/daaw/avee/Common/Vec2f;->x:F

    invoke-static {v0}, Ljava/lang/Math;->abs(F)F

    move-result v0

    iput v0, p0, Lcom/daaw/avee/Common/Vec2f;->x:F

    .line 154
    iget v0, p0, Lcom/daaw/avee/Common/Vec2f;->y:F

    invoke-static {v0}, Ljava/lang/Math;->abs(F)F

    move-result v0

    iput v0, p0, Lcom/daaw/avee/Common/Vec2f;->y:F

    return-void
.end method

.method public compareValues(Lcom/daaw/avee/Common/Vec2f;)Z
    .locals 2

    .line 213
    iget v0, p0, Lcom/daaw/avee/Common/Vec2f;->x:F

    iget v1, p1, Lcom/daaw/avee/Common/Vec2f;->x:F

    sub-float/2addr v0, v1

    invoke-static {v0}, Ljava/lang/Math;->abs(F)F

    move-result v0

    const v1, 0x38d1b717    # 1.0E-4f

    cmpg-float v0, v0, v1

    if-gez v0, :cond_0

    iget v0, p0, Lcom/daaw/avee/Common/Vec2f;->y:F

    iget p1, p1, Lcom/daaw/avee/Common/Vec2f;->y:F

    sub-float/2addr v0, p1

    invoke-static {v0}, Ljava/lang/Math;->abs(F)F

    move-result p1

    cmpg-float p1, p1, v1

    if-gez p1, :cond_0

    const/4 p1, 0x1

    goto :goto_0

    :cond_0
    const/4 p1, 0x0

    :goto_0
    return p1
.end method

.method public distance(Lcom/daaw/avee/Common/Vec2f;)F
    .locals 2

    .line 166
    iget v0, p0, Lcom/daaw/avee/Common/Vec2f;->x:F

    iget v1, p1, Lcom/daaw/avee/Common/Vec2f;->x:F

    sub-float/2addr v0, v1

    .line 167
    iget v1, p0, Lcom/daaw/avee/Common/Vec2f;->y:F

    iget p1, p1, Lcom/daaw/avee/Common/Vec2f;->y:F

    sub-float/2addr v1, p1

    mul-float v0, v0, v0

    mul-float v1, v1, v1

    add-float/2addr v0, v1

    float-to-double v0, v0

    .line 168
    invoke-static {v0, v1}, Ljava/lang/Math;->sqrt(D)D

    move-result-wide v0

    double-to-float p1, v0

    return p1
.end method

.method public equals(Lcom/daaw/avee/Common/Vec2f;)Z
    .locals 2

    .line 149
    iget v0, p0, Lcom/daaw/avee/Common/Vec2f;->x:F

    iget v1, p1, Lcom/daaw/avee/Common/Vec2f;->x:F

    cmpl-float v0, v0, v1

    if-nez v0, :cond_0

    iget v0, p0, Lcom/daaw/avee/Common/Vec2f;->y:F

    iget p1, p1, Lcom/daaw/avee/Common/Vec2f;->y:F

    cmpl-float p1, v0, p1

    if-nez p1, :cond_0

    const/4 p1, 0x1

    goto :goto_0

    :cond_0
    const/4 p1, 0x0

    :goto_0
    return p1
.end method

.method public getAngle()F
    .locals 2

    .line 194
    iget v0, p0, Lcom/daaw/avee/Common/Vec2f;->x:F

    iget v1, p0, Lcom/daaw/avee/Common/Vec2f;->y:F

    invoke-static {v0, v1}, Lcom/daaw/avee/Common/Vec2f;->getAngle(FF)F

    move-result v0

    return v0
.end method

.method public length()F
    .locals 2

    .line 162
    iget v0, p0, Lcom/daaw/avee/Common/Vec2f;->x:F

    mul-float v0, v0, v0

    iget v1, p0, Lcom/daaw/avee/Common/Vec2f;->y:F

    mul-float v1, v1, v1

    add-float/2addr v0, v1

    float-to-double v0, v0

    invoke-static {v0, v1}, Ljava/lang/Math;->sqrt(D)D

    move-result-wide v0

    double-to-float v0, v0

    return v0
.end method

.method public multiplyByValueDividedByDotCapped(FFF)V
    .locals 1

    .line 117
    iget v0, p0, Lcom/daaw/avee/Common/Vec2f;->x:F

    mul-float v0, v0, p1

    iget p1, p0, Lcom/daaw/avee/Common/Vec2f;->y:F

    mul-float p1, p1, p2

    add-float/2addr v0, p1

    const/high16 p1, 0x3e800000    # 0.25f

    invoke-static {v0, p1}, Ljava/lang/Math;->max(FF)F

    move-result p1

    .line 118
    iget p2, p0, Lcom/daaw/avee/Common/Vec2f;->x:F

    div-float/2addr p3, p1

    mul-float p2, p2, p3

    iput p2, p0, Lcom/daaw/avee/Common/Vec2f;->x:F

    .line 119
    iget p1, p0, Lcom/daaw/avee/Common/Vec2f;->y:F

    mul-float p1, p1, p3

    iput p1, p0, Lcom/daaw/avee/Common/Vec2f;->y:F

    return-void
.end method

.method public multiplyByValueDividedByDotCapped(Lcom/daaw/avee/Common/Vec2f;F)V
    .locals 2

    .line 111
    iget v0, p0, Lcom/daaw/avee/Common/Vec2f;->x:F

    iget v1, p1, Lcom/daaw/avee/Common/Vec2f;->x:F

    mul-float v0, v0, v1

    iget v1, p0, Lcom/daaw/avee/Common/Vec2f;->y:F

    iget p1, p1, Lcom/daaw/avee/Common/Vec2f;->y:F

    mul-float v1, v1, p1

    add-float/2addr v0, v1

    const/high16 p1, 0x3e800000    # 0.25f

    invoke-static {v0, p1}, Ljava/lang/Math;->max(FF)F

    move-result p1

    .line 112
    iget v0, p0, Lcom/daaw/avee/Common/Vec2f;->x:F

    div-float/2addr p2, p1

    mul-float v0, v0, p2

    iput v0, p0, Lcom/daaw/avee/Common/Vec2f;->x:F

    .line 113
    iget p1, p0, Lcom/daaw/avee/Common/Vec2f;->y:F

    mul-float p1, p1, p2

    iput p1, p0, Lcom/daaw/avee/Common/Vec2f;->y:F

    return-void
.end method

.method public normalize()Lcom/daaw/avee/Common/Vec2f;
    .locals 2

    .line 172
    iget v0, p0, Lcom/daaw/avee/Common/Vec2f;->x:F

    mul-float v0, v0, v0

    iget v1, p0, Lcom/daaw/avee/Common/Vec2f;->y:F

    mul-float v1, v1, v1

    add-float/2addr v0, v1

    float-to-double v0, v0

    invoke-static {v0, v1}, Ljava/lang/Math;->sqrt(D)D

    move-result-wide v0

    double-to-float v0, v0

    .line 173
    iget v1, p0, Lcom/daaw/avee/Common/Vec2f;->x:F

    div-float/2addr v1, v0

    iput v1, p0, Lcom/daaw/avee/Common/Vec2f;->x:F

    .line 174
    iget v1, p0, Lcom/daaw/avee/Common/Vec2f;->y:F

    div-float/2addr v1, v0

    iput v1, p0, Lcom/daaw/avee/Common/Vec2f;->y:F

    return-object p0
.end method

.method public normalizeSafe()Lcom/daaw/avee/Common/Vec2f;
    .locals 2

    .line 179
    iget v0, p0, Lcom/daaw/avee/Common/Vec2f;->x:F

    mul-float v0, v0, v0

    iget v1, p0, Lcom/daaw/avee/Common/Vec2f;->y:F

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

    .line 181
    :cond_0
    iget v1, p0, Lcom/daaw/avee/Common/Vec2f;->x:F

    div-float/2addr v1, v0

    iput v1, p0, Lcom/daaw/avee/Common/Vec2f;->x:F

    .line 182
    iget v1, p0, Lcom/daaw/avee/Common/Vec2f;->y:F

    div-float/2addr v1, v0

    iput v1, p0, Lcom/daaw/avee/Common/Vec2f;->y:F

    return-object p0
.end method

.method public normalizedResult()Lcom/daaw/avee/Common/Vec2f;
    .locals 3

    .line 187
    invoke-virtual {p0}, Lcom/daaw/avee/Common/Vec2f;->length()F

    move-result v0

    .line 188
    iget v1, p0, Lcom/daaw/avee/Common/Vec2f;->x:F

    div-float/2addr v1, v0

    .line 189
    iget v2, p0, Lcom/daaw/avee/Common/Vec2f;->y:F

    div-float/2addr v2, v0

    .line 190
    new-instance v0, Lcom/daaw/avee/Common/Vec2f;

    invoke-direct {v0, v1, v2}, Lcom/daaw/avee/Common/Vec2f;-><init>(FF)V

    return-object v0
.end method

.method public rotate(F)V
    .locals 4

    float-to-double v0, p1

    .line 143
    invoke-static {v0, v1}, Ljava/lang/Math;->cos(D)D

    move-result-wide v2

    double-to-float p1, v2

    iget v2, p0, Lcom/daaw/avee/Common/Vec2f;->x:F

    mul-float p1, p1, v2

    invoke-static {v0, v1}, Ljava/lang/Math;->sin(D)D

    move-result-wide v2

    double-to-float v2, v2

    iget v3, p0, Lcom/daaw/avee/Common/Vec2f;->y:F

    mul-float v2, v2, v3

    sub-float/2addr p1, v2

    .line 144
    invoke-static {v0, v1}, Ljava/lang/Math;->sin(D)D

    move-result-wide v2

    double-to-float v2, v2

    iget v3, p0, Lcom/daaw/avee/Common/Vec2f;->x:F

    mul-float v2, v2, v3

    invoke-static {v0, v1}, Ljava/lang/Math;->cos(D)D

    move-result-wide v0

    double-to-float v0, v0

    iget v1, p0, Lcom/daaw/avee/Common/Vec2f;->y:F

    mul-float v0, v0, v1

    add-float/2addr v2, v0

    iput v2, p0, Lcom/daaw/avee/Common/Vec2f;->y:F

    .line 145
    iput p1, p0, Lcom/daaw/avee/Common/Vec2f;->x:F

    return-void
.end method

.method public toString()Ljava/lang/String;
    .locals 4

    .line 53
    sget-object v0, Ljava/util/Locale;->US:Ljava/util/Locale;

    const/4 v1, 0x2

    new-array v1, v1, [Ljava/lang/Object;

    iget v2, p0, Lcom/daaw/avee/Common/Vec2f;->x:F

    invoke-static {v2}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    iget v2, p0, Lcom/daaw/avee/Common/Vec2f;->y:F

    invoke-static {v2}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    move-result-object v2

    const/4 v3, 0x1

    aput-object v2, v1, v3

    const-string v2, "%f %f"

    invoke-static {v0, v2, v1}, Ljava/lang/String;->format(Ljava/util/Locale;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
