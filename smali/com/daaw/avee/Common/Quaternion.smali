.class public Lcom/daaw/avee/Common/Quaternion;
.super Ljava/lang/Object;
.source "Quaternion.java"


# static fields
.field public static final PI2:F = 6.2831855f

.field private static tmp2:Lcom/daaw/avee/Common/Quaternion;


# instance fields
.field private w:F

.field private x:F

.field private y:F

.field private z:F


# direct methods
.method static constructor <clinit>()V
    .locals 2

    .line 10
    new-instance v0, Lcom/daaw/avee/Common/Quaternion;

    const/4 v1, 0x0

    invoke-direct {v0, v1, v1, v1, v1}, Lcom/daaw/avee/Common/Quaternion;-><init>(FFFF)V

    sput-object v0, Lcom/daaw/avee/Common/Quaternion;->tmp2:Lcom/daaw/avee/Common/Quaternion;

    return-void
.end method

.method public constructor <init>(FFFF)V
    .locals 0

    .line 67
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 68
    iput p1, p0, Lcom/daaw/avee/Common/Quaternion;->x:F

    .line 69
    iput p2, p0, Lcom/daaw/avee/Common/Quaternion;->y:F

    .line 70
    iput p3, p0, Lcom/daaw/avee/Common/Quaternion;->z:F

    .line 71
    iput p4, p0, Lcom/daaw/avee/Common/Quaternion;->w:F

    return-void
.end method

.method private set(FFFF)V
    .locals 0

    .line 99
    iput p1, p0, Lcom/daaw/avee/Common/Quaternion;->x:F

    .line 100
    iput p2, p0, Lcom/daaw/avee/Common/Quaternion;->y:F

    .line 101
    iput p3, p0, Lcom/daaw/avee/Common/Quaternion;->z:F

    .line 102
    iput p4, p0, Lcom/daaw/avee/Common/Quaternion;->w:F

    return-void
.end method


# virtual methods
.method public _norm()F
    .locals 2

    .line 57
    iget v0, p0, Lcom/daaw/avee/Common/Quaternion;->w:F

    mul-float v0, v0, v0

    iget v1, p0, Lcom/daaw/avee/Common/Quaternion;->x:F

    mul-float v1, v1, v1

    add-float/2addr v0, v1

    iget v1, p0, Lcom/daaw/avee/Common/Quaternion;->y:F

    mul-float v1, v1, v1

    add-float/2addr v0, v1

    iget v1, p0, Lcom/daaw/avee/Common/Quaternion;->z:F

    mul-float v1, v1, v1

    add-float/2addr v0, v1

    return v0
.end method

.method public conjugate()Lcom/daaw/avee/Common/Quaternion;
    .locals 5

    .line 125
    new-instance v0, Lcom/daaw/avee/Common/Quaternion;

    iget v1, p0, Lcom/daaw/avee/Common/Quaternion;->x:F

    iget v2, p0, Lcom/daaw/avee/Common/Quaternion;->y:F

    neg-float v2, v2

    iget v3, p0, Lcom/daaw/avee/Common/Quaternion;->z:F

    neg-float v3, v3

    iget v4, p0, Lcom/daaw/avee/Common/Quaternion;->w:F

    neg-float v4, v4

    invoke-direct {v0, v1, v2, v3, v4}, Lcom/daaw/avee/Common/Quaternion;-><init>(FFFF)V

    return-object v0
.end method

.method public divides(Lcom/daaw/avee/Common/Quaternion;)Lcom/daaw/avee/Common/Quaternion;
    .locals 0

    .line 156
    invoke-virtual {p1}, Lcom/daaw/avee/Common/Quaternion;->inverse()Lcom/daaw/avee/Common/Quaternion;

    move-result-object p1

    invoke-virtual {p0, p1}, Lcom/daaw/avee/Common/Quaternion;->times(Lcom/daaw/avee/Common/Quaternion;)Lcom/daaw/avee/Common/Quaternion;

    move-result-object p1

    return-object p1
.end method

.method public fromAngles(FFF)Lcom/daaw/avee/Common/Quaternion;
    .locals 7

    const/high16 v0, 0x3f000000    # 0.5f

    mul-float p3, p3, v0

    float-to-double v1, p3

    .line 18
    invoke-static {v1, v2}, Ljava/lang/Math;->sin(D)D

    move-result-wide v3

    double-to-float p3, v3

    .line 19
    invoke-static {v1, v2}, Ljava/lang/Math;->cos(D)D

    move-result-wide v1

    double-to-float v1, v1

    mul-float p2, p2, v0

    float-to-double v2, p2

    .line 21
    invoke-static {v2, v3}, Ljava/lang/Math;->sin(D)D

    move-result-wide v4

    double-to-float p2, v4

    .line 22
    invoke-static {v2, v3}, Ljava/lang/Math;->cos(D)D

    move-result-wide v2

    double-to-float v2, v2

    mul-float p1, p1, v0

    float-to-double v3, p1

    .line 24
    invoke-static {v3, v4}, Ljava/lang/Math;->sin(D)D

    move-result-wide v5

    double-to-float p1, v5

    .line 25
    invoke-static {v3, v4}, Ljava/lang/Math;->cos(D)D

    move-result-wide v3

    double-to-float v0, v3

    mul-float v3, v2, v1

    mul-float v4, p2, p3

    mul-float v2, v2, p3

    mul-float p2, p2, v1

    mul-float p3, v3, v0

    mul-float v1, v4, p1

    sub-float/2addr p3, v1

    .line 33
    iput p3, p0, Lcom/daaw/avee/Common/Quaternion;->w:F

    mul-float v3, v3, p1

    mul-float v4, v4, v0

    add-float/2addr v3, v4

    .line 34
    iput v3, p0, Lcom/daaw/avee/Common/Quaternion;->x:F

    mul-float p3, p2, v0

    mul-float v1, v2, p1

    add-float/2addr p3, v1

    .line 35
    iput p3, p0, Lcom/daaw/avee/Common/Quaternion;->y:F

    mul-float v2, v2, v0

    mul-float p2, p2, p1

    sub-float/2addr v2, p2

    .line 36
    iput v2, p0, Lcom/daaw/avee/Common/Quaternion;->z:F

    .line 38
    invoke-virtual {p0}, Lcom/daaw/avee/Common/Quaternion;->normalize()V

    return-object p0
.end method

.method public idt()Lcom/daaw/avee/Common/Quaternion;
    .locals 2

    const/4 v0, 0x0

    const/high16 v1, 0x3f800000    # 1.0f

    .line 94
    invoke-direct {p0, v0, v0, v0, v1}, Lcom/daaw/avee/Common/Quaternion;->set(FFFF)V

    return-object p0
.end method

.method invSqrt(F)F
    .locals 2

    float-to-double v0, p1

    .line 62
    invoke-static {v0, v1}, Ljava/lang/Math;->sqrt(D)D

    move-result-wide v0

    double-to-float p1, v0

    const/high16 v0, 0x3f800000    # 1.0f

    div-float/2addr v0, p1

    return v0
.end method

.method public inverse()Lcom/daaw/avee/Common/Quaternion;
    .locals 6

    .line 147
    iget v0, p0, Lcom/daaw/avee/Common/Quaternion;->x:F

    mul-float v0, v0, v0

    iget v1, p0, Lcom/daaw/avee/Common/Quaternion;->y:F

    mul-float v1, v1, v1

    add-float/2addr v0, v1

    iget v1, p0, Lcom/daaw/avee/Common/Quaternion;->z:F

    mul-float v1, v1, v1

    add-float/2addr v0, v1

    iget v1, p0, Lcom/daaw/avee/Common/Quaternion;->w:F

    mul-float v1, v1, v1

    add-float/2addr v0, v1

    .line 148
    new-instance v1, Lcom/daaw/avee/Common/Quaternion;

    iget v2, p0, Lcom/daaw/avee/Common/Quaternion;->x:F

    div-float/2addr v2, v0

    iget v3, p0, Lcom/daaw/avee/Common/Quaternion;->y:F

    neg-float v3, v3

    div-float/2addr v3, v0

    iget v4, p0, Lcom/daaw/avee/Common/Quaternion;->z:F

    neg-float v4, v4

    div-float/2addr v4, v0

    iget v5, p0, Lcom/daaw/avee/Common/Quaternion;->w:F

    neg-float v5, v5

    div-float/2addr v5, v0

    invoke-direct {v1, v2, v3, v4, v5}, Lcom/daaw/avee/Common/Quaternion;-><init>(FFFF)V

    return-object v1
.end method

.method public mulLeft(FFFF)Lcom/daaw/avee/Common/Quaternion;
    .locals 8

    .line 180
    iget v0, p0, Lcom/daaw/avee/Common/Quaternion;->x:F

    mul-float v1, p4, v0

    iget v2, p0, Lcom/daaw/avee/Common/Quaternion;->w:F

    mul-float v3, p1, v2

    add-float/2addr v1, v3

    iget v3, p0, Lcom/daaw/avee/Common/Quaternion;->z:F

    mul-float v4, p2, v3

    add-float/2addr v1, v4

    iget v4, p0, Lcom/daaw/avee/Common/Quaternion;->y:F

    mul-float v5, p3, v4

    sub-float/2addr v1, v5

    mul-float v5, p4, v4

    mul-float v6, p2, v2

    add-float/2addr v5, v6

    mul-float v6, p3, v0

    add-float/2addr v5, v6

    mul-float v6, p1, v3

    sub-float/2addr v5, v6

    mul-float v6, p4, v3

    mul-float v7, p3, v2

    add-float/2addr v6, v7

    mul-float v7, p1, v4

    add-float/2addr v6, v7

    mul-float v7, p2, v0

    sub-float/2addr v6, v7

    mul-float p4, p4, v2

    mul-float p1, p1, v0

    sub-float/2addr p4, p1

    mul-float p2, p2, v4

    sub-float/2addr p4, p2

    mul-float p3, p3, v3

    sub-float/2addr p4, p3

    .line 184
    iput v1, p0, Lcom/daaw/avee/Common/Quaternion;->x:F

    .line 185
    iput v5, p0, Lcom/daaw/avee/Common/Quaternion;->y:F

    .line 186
    iput v6, p0, Lcom/daaw/avee/Common/Quaternion;->z:F

    .line 187
    iput p4, p0, Lcom/daaw/avee/Common/Quaternion;->w:F

    return-object p0
.end method

.method public norm()D
    .locals 2

    .line 120
    iget v0, p0, Lcom/daaw/avee/Common/Quaternion;->x:F

    mul-float v0, v0, v0

    iget v1, p0, Lcom/daaw/avee/Common/Quaternion;->y:F

    mul-float v1, v1, v1

    add-float/2addr v0, v1

    iget v1, p0, Lcom/daaw/avee/Common/Quaternion;->z:F

    mul-float v1, v1, v1

    add-float/2addr v0, v1

    iget v1, p0, Lcom/daaw/avee/Common/Quaternion;->w:F

    mul-float v1, v1, v1

    add-float/2addr v0, v1

    float-to-double v0, v0

    invoke-static {v0, v1}, Ljava/lang/Math;->sqrt(D)D

    move-result-wide v0

    return-wide v0
.end method

.method public normalize()V
    .locals 2

    .line 43
    invoke-virtual {p0}, Lcom/daaw/avee/Common/Quaternion;->_norm()F

    move-result v0

    invoke-virtual {p0, v0}, Lcom/daaw/avee/Common/Quaternion;->invSqrt(F)F

    move-result v0

    .line 44
    iget v1, p0, Lcom/daaw/avee/Common/Quaternion;->x:F

    mul-float v1, v1, v0

    iput v1, p0, Lcom/daaw/avee/Common/Quaternion;->x:F

    .line 45
    iget v1, p0, Lcom/daaw/avee/Common/Quaternion;->y:F

    mul-float v1, v1, v0

    iput v1, p0, Lcom/daaw/avee/Common/Quaternion;->y:F

    .line 46
    iget v1, p0, Lcom/daaw/avee/Common/Quaternion;->z:F

    mul-float v1, v1, v0

    iput v1, p0, Lcom/daaw/avee/Common/Quaternion;->z:F

    .line 47
    iget v1, p0, Lcom/daaw/avee/Common/Quaternion;->w:F

    mul-float v1, v1, v0

    iput v1, p0, Lcom/daaw/avee/Common/Quaternion;->w:F

    return-void
.end method

.method public plus(Lcom/daaw/avee/Common/Quaternion;)Lcom/daaw/avee/Common/Quaternion;
    .locals 5

    .line 131
    new-instance v0, Lcom/daaw/avee/Common/Quaternion;

    iget v1, p0, Lcom/daaw/avee/Common/Quaternion;->x:F

    iget v2, p1, Lcom/daaw/avee/Common/Quaternion;->x:F

    add-float/2addr v1, v2

    iget v2, p0, Lcom/daaw/avee/Common/Quaternion;->y:F

    iget v3, p1, Lcom/daaw/avee/Common/Quaternion;->y:F

    add-float/2addr v2, v3

    iget v3, p0, Lcom/daaw/avee/Common/Quaternion;->z:F

    iget v4, p1, Lcom/daaw/avee/Common/Quaternion;->z:F

    add-float/2addr v3, v4

    iget v4, p0, Lcom/daaw/avee/Common/Quaternion;->w:F

    iget p1, p1, Lcom/daaw/avee/Common/Quaternion;->w:F

    add-float/2addr v4, p1

    invoke-direct {v0, v1, v2, v3, v4}, Lcom/daaw/avee/Common/Quaternion;-><init>(FFFF)V

    return-object v0
.end method

.method public set(Lcom/daaw/avee/Common/Quaternion;)V
    .locals 1

    .line 112
    iget v0, p1, Lcom/daaw/avee/Common/Quaternion;->x:F

    iput v0, p0, Lcom/daaw/avee/Common/Quaternion;->x:F

    .line 113
    iget v0, p1, Lcom/daaw/avee/Common/Quaternion;->y:F

    iput v0, p0, Lcom/daaw/avee/Common/Quaternion;->y:F

    .line 114
    iget v0, p1, Lcom/daaw/avee/Common/Quaternion;->z:F

    iput v0, p0, Lcom/daaw/avee/Common/Quaternion;->z:F

    .line 115
    iget p1, p1, Lcom/daaw/avee/Common/Quaternion;->w:F

    iput p1, p0, Lcom/daaw/avee/Common/Quaternion;->w:F

    return-void
.end method

.method public setFromAxisRad(FFFF)Lcom/daaw/avee/Common/Quaternion;
    .locals 5

    .line 82
    invoke-static {p1, p2, p3}, Lcom/daaw/avee/Common/Vec3f;->length(FFF)F

    move-result v0

    const/4 v1, 0x0

    cmpl-float v2, v0, v1

    if-nez v2, :cond_0

    .line 83
    invoke-virtual {p0}, Lcom/daaw/avee/Common/Quaternion;->idt()Lcom/daaw/avee/Common/Quaternion;

    move-result-object p1

    return-object p1

    :cond_0
    const/high16 v2, 0x3f800000    # 1.0f

    div-float/2addr v2, v0

    const v0, 0x40c90fdb

    cmpg-float v1, p4, v1

    if-gez v1, :cond_1

    neg-float p4, p4

    rem-float/2addr p4, v0

    sub-float/2addr v0, p4

    goto :goto_0

    :cond_1
    rem-float v0, p4, v0

    :goto_0
    const/high16 p4, 0x40000000    # 2.0f

    div-float/2addr v0, p4

    float-to-double v0, v0

    .line 86
    invoke-static {v0, v1}, Ljava/lang/Math;->sin(D)D

    move-result-wide v3

    double-to-float p4, v3

    .line 87
    invoke-static {v0, v1}, Ljava/lang/Math;->cos(D)D

    move-result-wide v0

    double-to-float v0, v0

    mul-float p1, p1, v2

    mul-float p1, p1, p4

    mul-float p2, p2, v2

    mul-float p2, p2, p4

    mul-float v2, v2, p3

    mul-float v2, v2, p4

    .line 88
    invoke-direct {p0, p1, p2, v2, v0}, Lcom/daaw/avee/Common/Quaternion;->set(FFFF)V

    .line 89
    invoke-virtual {p0}, Lcom/daaw/avee/Common/Quaternion;->normalize()V

    return-object p0
.end method

.method public times(Lcom/daaw/avee/Common/Quaternion;)Lcom/daaw/avee/Common/Quaternion;
    .locals 11

    .line 138
    iget v0, p0, Lcom/daaw/avee/Common/Quaternion;->x:F

    iget v1, p1, Lcom/daaw/avee/Common/Quaternion;->x:F

    mul-float v2, v0, v1

    iget v3, p0, Lcom/daaw/avee/Common/Quaternion;->y:F

    iget v4, p1, Lcom/daaw/avee/Common/Quaternion;->y:F

    mul-float v5, v3, v4

    sub-float/2addr v2, v5

    iget v5, p0, Lcom/daaw/avee/Common/Quaternion;->z:F

    iget v6, p1, Lcom/daaw/avee/Common/Quaternion;->z:F

    mul-float v7, v5, v6

    sub-float/2addr v2, v7

    iget v7, p0, Lcom/daaw/avee/Common/Quaternion;->w:F

    iget p1, p1, Lcom/daaw/avee/Common/Quaternion;->w:F

    mul-float v8, v7, p1

    sub-float/2addr v2, v8

    mul-float v8, v0, v4

    mul-float v9, v3, v1

    add-float/2addr v8, v9

    mul-float v9, v5, p1

    add-float/2addr v8, v9

    mul-float v9, v7, v6

    sub-float/2addr v8, v9

    mul-float v9, v0, v6

    mul-float v10, v3, p1

    sub-float/2addr v9, v10

    mul-float v10, v5, v1

    add-float/2addr v9, v10

    mul-float v10, v7, v4

    add-float/2addr v9, v10

    mul-float v0, v0, p1

    mul-float v3, v3, v6

    add-float/2addr v0, v3

    mul-float v5, v5, v4

    sub-float/2addr v0, v5

    mul-float v7, v7, v1

    add-float/2addr v0, v7

    .line 142
    new-instance p1, Lcom/daaw/avee/Common/Quaternion;

    invoke-direct {p1, v2, v8, v9, v0}, Lcom/daaw/avee/Common/Quaternion;-><init>(FFFF)V

    return-object p1
.end method

.method public toString()Ljava/lang/String;
    .locals 2

    .line 107
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    iget v1, p0, Lcom/daaw/avee/Common/Quaternion;->x:F

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(F)Ljava/lang/StringBuilder;

    const-string v1, " + "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget v1, p0, Lcom/daaw/avee/Common/Quaternion;->y:F

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(F)Ljava/lang/StringBuilder;

    const-string v1, "i + "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget v1, p0, Lcom/daaw/avee/Common/Quaternion;->z:F

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(F)Ljava/lang/StringBuilder;

    const-string v1, "j + "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget v1, p0, Lcom/daaw/avee/Common/Quaternion;->w:F

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(F)Ljava/lang/StringBuilder;

    const-string v1, "k"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public transform(Lcom/daaw/avee/Common/Vec3f;)Lcom/daaw/avee/Common/Vec3f;
    .locals 5

    .line 162
    sget-object v0, Lcom/daaw/avee/Common/Quaternion;->tmp2:Lcom/daaw/avee/Common/Quaternion;

    invoke-virtual {v0, p0}, Lcom/daaw/avee/Common/Quaternion;->set(Lcom/daaw/avee/Common/Quaternion;)V

    .line 163
    sget-object v0, Lcom/daaw/avee/Common/Quaternion;->tmp2:Lcom/daaw/avee/Common/Quaternion;

    invoke-virtual {v0}, Lcom/daaw/avee/Common/Quaternion;->conjugate()Lcom/daaw/avee/Common/Quaternion;

    .line 164
    sget-object v0, Lcom/daaw/avee/Common/Quaternion;->tmp2:Lcom/daaw/avee/Common/Quaternion;

    iget v1, p1, Lcom/daaw/avee/Common/Vec3f;->x:F

    iget v2, p1, Lcom/daaw/avee/Common/Vec3f;->y:F

    iget v3, p1, Lcom/daaw/avee/Common/Vec3f;->z:F

    const/4 v4, 0x0

    invoke-virtual {v0, v1, v2, v3, v4}, Lcom/daaw/avee/Common/Quaternion;->mulLeft(FFFF)Lcom/daaw/avee/Common/Quaternion;

    move-result-object v0

    iget v1, p0, Lcom/daaw/avee/Common/Quaternion;->x:F

    iget v2, p0, Lcom/daaw/avee/Common/Quaternion;->y:F

    iget v3, p0, Lcom/daaw/avee/Common/Quaternion;->z:F

    iget v4, p0, Lcom/daaw/avee/Common/Quaternion;->w:F

    invoke-virtual {v0, v1, v2, v3, v4}, Lcom/daaw/avee/Common/Quaternion;->mulLeft(FFFF)Lcom/daaw/avee/Common/Quaternion;

    .line 166
    sget-object v0, Lcom/daaw/avee/Common/Quaternion;->tmp2:Lcom/daaw/avee/Common/Quaternion;

    iget v0, v0, Lcom/daaw/avee/Common/Quaternion;->x:F

    iput v0, p1, Lcom/daaw/avee/Common/Vec3f;->x:F

    .line 167
    sget-object v0, Lcom/daaw/avee/Common/Quaternion;->tmp2:Lcom/daaw/avee/Common/Quaternion;

    iget v0, v0, Lcom/daaw/avee/Common/Quaternion;->y:F

    iput v0, p1, Lcom/daaw/avee/Common/Vec3f;->y:F

    .line 168
    sget-object v0, Lcom/daaw/avee/Common/Quaternion;->tmp2:Lcom/daaw/avee/Common/Quaternion;

    iget v0, v0, Lcom/daaw/avee/Common/Quaternion;->z:F

    iput v0, p1, Lcom/daaw/avee/Common/Vec3f;->z:F

    return-object p1
.end method
