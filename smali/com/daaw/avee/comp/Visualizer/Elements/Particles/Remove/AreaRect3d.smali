.class public Lcom/daaw/avee/comp/Visualizer/Elements/Particles/Remove/AreaRect3d;
.super Ljava/lang/Object;
.source "AreaRect3d.java"

# interfaces
.implements Lcom/daaw/avee/comp/Visualizer/Elements/Base/IArea;


# static fields
.field public static final typeName:Ljava/lang/String; = "Rectangle3D"


# instance fields
.field private randomGenerator:Ljava/util/Random;

.field private use3dVectorInstead:Z

.field private useRandomVectorInstead:Z

.field private vector:Lcom/daaw/avee/Common/Vec3f;

.field private vectorAngle:F

.field private vectorAngleZ:F


# direct methods
.method public constructor <init>()V
    .locals 2

    .line 29
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 20
    new-instance v0, Ljava/util/Random;

    invoke-direct {v0}, Ljava/util/Random;-><init>()V

    iput-object v0, p0, Lcom/daaw/avee/comp/Visualizer/Elements/Particles/Remove/AreaRect3d;->randomGenerator:Ljava/util/Random;

    const/4 v0, 0x0

    .line 22
    iput v0, p0, Lcom/daaw/avee/comp/Visualizer/Elements/Particles/Remove/AreaRect3d;->vectorAngle:F

    const/high16 v1, 0x3f800000    # 1.0f

    .line 23
    iput v1, p0, Lcom/daaw/avee/comp/Visualizer/Elements/Particles/Remove/AreaRect3d;->vectorAngleZ:F

    .line 24
    new-instance v1, Lcom/daaw/avee/Common/Vec3f;

    invoke-direct {v1, v0, v0, v0}, Lcom/daaw/avee/Common/Vec3f;-><init>(FFF)V

    iput-object v1, p0, Lcom/daaw/avee/comp/Visualizer/Elements/Particles/Remove/AreaRect3d;->vector:Lcom/daaw/avee/Common/Vec3f;

    const/4 v0, 0x0

    .line 25
    iput-boolean v0, p0, Lcom/daaw/avee/comp/Visualizer/Elements/Particles/Remove/AreaRect3d;->useRandomVectorInstead:Z

    .line 26
    iput-boolean v0, p0, Lcom/daaw/avee/comp/Visualizer/Elements/Particles/Remove/AreaRect3d;->use3dVectorInstead:Z

    const/high16 v0, 0x43870000    # 270.0f

    .line 30
    invoke-virtual {p0, v0}, Lcom/daaw/avee/comp/Visualizer/Elements/Particles/Remove/AreaRect3d;->setVectorAngle(F)Lcom/daaw/avee/comp/Visualizer/Elements/Particles/Remove/AreaRect3d;

    return-void
.end method

.method private updateVector()V
    .locals 4

    .line 57
    iget v0, p0, Lcom/daaw/avee/comp/Visualizer/Elements/Particles/Remove/AreaRect3d;->vectorAngle:F

    invoke-static {v0}, Lcom/daaw/avee/Common/Vec2f;->fromAngleRad(F)Lcom/daaw/avee/Common/Vec2f;

    move-result-object v0

    .line 58
    iget v1, p0, Lcom/daaw/avee/comp/Visualizer/Elements/Particles/Remove/AreaRect3d;->vectorAngleZ:F

    invoke-static {v1}, Ljava/lang/Math;->abs(F)F

    move-result v1

    const/high16 v2, 0x3f800000    # 1.0f

    sub-float/2addr v2, v1

    .line 60
    new-instance v1, Lcom/daaw/avee/Common/Vec3f;

    iget v3, v0, Lcom/daaw/avee/Common/Vec2f;->x:F

    mul-float v3, v3, v2

    iget v0, v0, Lcom/daaw/avee/Common/Vec2f;->y:F

    mul-float v0, v0, v2

    iget v2, p0, Lcom/daaw/avee/comp/Visualizer/Elements/Particles/Remove/AreaRect3d;->vectorAngleZ:F

    invoke-direct {v1, v3, v0, v2}, Lcom/daaw/avee/Common/Vec3f;-><init>(FFF)V

    iput-object v1, p0, Lcom/daaw/avee/comp/Visualizer/Elements/Particles/Remove/AreaRect3d;->vector:Lcom/daaw/avee/Common/Vec3f;

    .line 61
    invoke-virtual {v1}, Lcom/daaw/avee/Common/Vec3f;->normalize()V

    return-void
.end method


# virtual methods
.method public getRandomPointInArea(Landroid/graphics/RectF;Lcom/daaw/avee/Common/Vec3f;Lcom/daaw/avee/Common/Vec3f;Z)V
    .locals 3

    .line 75
    iget-object p4, p0, Lcom/daaw/avee/comp/Visualizer/Elements/Particles/Remove/AreaRect3d;->randomGenerator:Ljava/util/Random;

    invoke-virtual {p4}, Ljava/util/Random;->nextFloat()F

    move-result p4

    .line 76
    iget-object v0, p0, Lcom/daaw/avee/comp/Visualizer/Elements/Particles/Remove/AreaRect3d;->randomGenerator:Ljava/util/Random;

    invoke-virtual {v0}, Ljava/util/Random;->nextFloat()F

    move-result v0

    .line 77
    iget v1, p1, Landroid/graphics/RectF;->left:F

    invoke-virtual {p1}, Landroid/graphics/RectF;->width()F

    move-result v2

    mul-float v2, v2, p4

    add-float/2addr v1, v2

    iput v1, p2, Lcom/daaw/avee/Common/Vec3f;->x:F

    .line 78
    iget v1, p1, Landroid/graphics/RectF;->top:F

    invoke-virtual {p1}, Landroid/graphics/RectF;->height()F

    move-result p1

    mul-float p1, p1, v0

    add-float/2addr v1, p1

    iput v1, p2, Lcom/daaw/avee/Common/Vec3f;->y:F

    const/4 p1, 0x0

    .line 79
    iput p1, p2, Lcom/daaw/avee/Common/Vec3f;->z:F

    .line 81
    iget-object p1, p0, Lcom/daaw/avee/comp/Visualizer/Elements/Particles/Remove/AreaRect3d;->vector:Lcom/daaw/avee/Common/Vec3f;

    iget p1, p1, Lcom/daaw/avee/Common/Vec3f;->z:F

    iput p1, p3, Lcom/daaw/avee/Common/Vec3f;->z:F

    .line 83
    iget-boolean p1, p0, Lcom/daaw/avee/comp/Visualizer/Elements/Particles/Remove/AreaRect3d;->use3dVectorInstead:Z

    const/high16 p2, 0x3f800000    # 1.0f

    const/high16 v1, 0x40000000    # 2.0f

    if-eqz p1, :cond_0

    mul-float p4, p4, v1

    sub-float/2addr p4, p2

    .line 84
    iput p4, p3, Lcom/daaw/avee/Common/Vec3f;->x:F

    mul-float v0, v0, v1

    sub-float/2addr v0, p2

    .line 85
    iput v0, p3, Lcom/daaw/avee/Common/Vec3f;->y:F

    goto :goto_0

    .line 86
    :cond_0
    iget-boolean p1, p0, Lcom/daaw/avee/comp/Visualizer/Elements/Particles/Remove/AreaRect3d;->useRandomVectorInstead:Z

    if-eqz p1, :cond_1

    .line 87
    iget-object p1, p0, Lcom/daaw/avee/comp/Visualizer/Elements/Particles/Remove/AreaRect3d;->randomGenerator:Ljava/util/Random;

    invoke-virtual {p1}, Ljava/util/Random;->nextFloat()F

    move-result p1

    .line 88
    iget-object p4, p0, Lcom/daaw/avee/comp/Visualizer/Elements/Particles/Remove/AreaRect3d;->randomGenerator:Ljava/util/Random;

    invoke-virtual {p4}, Ljava/util/Random;->nextFloat()F

    move-result p4

    mul-float p1, p1, v1

    sub-float/2addr p1, p2

    .line 89
    iput p1, p3, Lcom/daaw/avee/Common/Vec3f;->x:F

    mul-float p4, p4, v1

    sub-float/2addr p4, p2

    .line 90
    iput p4, p3, Lcom/daaw/avee/Common/Vec3f;->y:F

    goto :goto_0

    .line 92
    :cond_1
    iget-object p1, p0, Lcom/daaw/avee/comp/Visualizer/Elements/Particles/Remove/AreaRect3d;->vector:Lcom/daaw/avee/Common/Vec3f;

    iget p1, p1, Lcom/daaw/avee/Common/Vec3f;->x:F

    iput p1, p3, Lcom/daaw/avee/Common/Vec3f;->x:F

    .line 93
    iget-object p1, p0, Lcom/daaw/avee/comp/Visualizer/Elements/Particles/Remove/AreaRect3d;->vector:Lcom/daaw/avee/Common/Vec3f;

    iget p1, p1, Lcom/daaw/avee/Common/Vec3f;->y:F

    iput p1, p3, Lcom/daaw/avee/Common/Vec3f;->y:F

    :goto_0
    return-void
.end method

.method public getVectorAngle()F
    .locals 1

    .line 65
    iget v0, p0, Lcom/daaw/avee/comp/Visualizer/Elements/Particles/Remove/AreaRect3d;->vectorAngle:F

    return v0
.end method

.method public getVectorZ()F
    .locals 1

    .line 69
    iget v0, p0, Lcom/daaw/avee/comp/Visualizer/Elements/Particles/Remove/AreaRect3d;->vectorAngleZ:F

    return v0
.end method

.method public onApplyCustomization(Lcom/daaw/avee/comp/Visualizer/CustomPropertiesList;)V
    .locals 2

    .line 100
    iget-boolean v0, p0, Lcom/daaw/avee/comp/Visualizer/Elements/Particles/Remove/AreaRect3d;->use3dVectorInstead:Z

    const-string v1, "use3dVectorInstead"

    invoke-virtual {p1, v1, v0}, Lcom/daaw/avee/comp/Visualizer/CustomPropertiesList;->getPropertyBool(Ljava/lang/String;Z)Z

    move-result v0

    iput-boolean v0, p0, Lcom/daaw/avee/comp/Visualizer/Elements/Particles/Remove/AreaRect3d;->use3dVectorInstead:Z

    .line 101
    iget-boolean v0, p0, Lcom/daaw/avee/comp/Visualizer/Elements/Particles/Remove/AreaRect3d;->useRandomVectorInstead:Z

    const-string v1, "useRandomVectorInstead"

    invoke-virtual {p1, v1, v0}, Lcom/daaw/avee/comp/Visualizer/CustomPropertiesList;->getPropertyBool(Ljava/lang/String;Z)Z

    move-result v0

    iput-boolean v0, p0, Lcom/daaw/avee/comp/Visualizer/Elements/Particles/Remove/AreaRect3d;->useRandomVectorInstead:Z

    .line 102
    invoke-virtual {p0}, Lcom/daaw/avee/comp/Visualizer/Elements/Particles/Remove/AreaRect3d;->getVectorAngle()F

    move-result v0

    const-string v1, "vectorAngle"

    invoke-virtual {p1, v1, v0}, Lcom/daaw/avee/comp/Visualizer/CustomPropertiesList;->getPropertyFloat(Ljava/lang/String;F)F

    move-result v0

    invoke-virtual {p0, v0}, Lcom/daaw/avee/comp/Visualizer/Elements/Particles/Remove/AreaRect3d;->setVectorAngle(F)Lcom/daaw/avee/comp/Visualizer/Elements/Particles/Remove/AreaRect3d;

    .line 103
    invoke-virtual {p0}, Lcom/daaw/avee/comp/Visualizer/Elements/Particles/Remove/AreaRect3d;->getVectorZ()F

    move-result v0

    const-string v1, "vectorAngleZ"

    invoke-virtual {p1, v1, v0}, Lcom/daaw/avee/comp/Visualizer/CustomPropertiesList;->getPropertyFloat(Ljava/lang/String;F)F

    move-result p1

    invoke-virtual {p0, p1}, Lcom/daaw/avee/comp/Visualizer/Elements/Particles/Remove/AreaRect3d;->setVectorZ(F)Lcom/daaw/avee/comp/Visualizer/Elements/Particles/Remove/AreaRect3d;

    return-void
.end method

.method public onReadCustomization(Lcom/daaw/avee/comp/Visualizer/CustomPropertiesList;)V
    .locals 6

    .line 109
    iget-boolean v0, p0, Lcom/daaw/avee/comp/Visualizer/Elements/Particles/Remove/AreaRect3d;->use3dVectorInstead:Z

    const-string v1, "misc"

    const-string v2, "use3dVectorInstead"

    invoke-virtual {p1, v2, v0, v1}, Lcom/daaw/avee/comp/Visualizer/CustomPropertiesList;->putPropertyBool(Ljava/lang/String;ZLjava/lang/String;)V

    .line 110
    iget-boolean v0, p0, Lcom/daaw/avee/comp/Visualizer/Elements/Particles/Remove/AreaRect3d;->useRandomVectorInstead:Z

    const-string v2, "useRandomVectorInstead"

    invoke-virtual {p1, v2, v0, v1}, Lcom/daaw/avee/comp/Visualizer/CustomPropertiesList;->putPropertyBool(Ljava/lang/String;ZLjava/lang/String;)V

    .line 111
    invoke-virtual {p0}, Lcom/daaw/avee/comp/Visualizer/Elements/Particles/Remove/AreaRect3d;->getVectorAngle()F

    move-result v2

    const-string v1, "vectorAngle"

    const-string v3, "misc"

    const/4 v4, 0x0

    const/high16 v5, 0x43b40000    # 360.0f

    move-object v0, p1

    invoke-virtual/range {v0 .. v5}, Lcom/daaw/avee/comp/Visualizer/CustomPropertiesList;->putPropertyFloatAsRange(Ljava/lang/String;FLjava/lang/String;FF)V

    .line 112
    invoke-virtual {p0}, Lcom/daaw/avee/comp/Visualizer/Elements/Particles/Remove/AreaRect3d;->getVectorZ()F

    move-result v2

    const-string v1, "vectorAngleZ"

    const-string v3, "misc"

    const/high16 v4, -0x40800000    # -1.0f

    const/high16 v5, 0x3f800000    # 1.0f

    invoke-virtual/range {v0 .. v5}, Lcom/daaw/avee/comp/Visualizer/CustomPropertiesList;->putPropertyFloatAsRange(Ljava/lang/String;FLjava/lang/String;FF)V

    return-void
.end method

.method public setUse3dVectorInstead(Z)Lcom/daaw/avee/comp/Visualizer/Elements/Particles/Remove/AreaRect3d;
    .locals 0

    .line 39
    iput-boolean p1, p0, Lcom/daaw/avee/comp/Visualizer/Elements/Particles/Remove/AreaRect3d;->use3dVectorInstead:Z

    return-object p0
.end method

.method public setUseRandomVectorInstead(Z)Lcom/daaw/avee/comp/Visualizer/Elements/Particles/Remove/AreaRect3d;
    .locals 0

    .line 34
    iput-boolean p1, p0, Lcom/daaw/avee/comp/Visualizer/Elements/Particles/Remove/AreaRect3d;->useRandomVectorInstead:Z

    return-object p0
.end method

.method public setVectorAngle(F)Lcom/daaw/avee/comp/Visualizer/Elements/Particles/Remove/AreaRect3d;
    .locals 0

    .line 44
    iput p1, p0, Lcom/daaw/avee/comp/Visualizer/Elements/Particles/Remove/AreaRect3d;->vectorAngle:F

    .line 45
    invoke-direct {p0}, Lcom/daaw/avee/comp/Visualizer/Elements/Particles/Remove/AreaRect3d;->updateVector()V

    return-object p0
.end method

.method public setVectorZ(F)Lcom/daaw/avee/comp/Visualizer/Elements/Particles/Remove/AreaRect3d;
    .locals 0

    .line 50
    iput p1, p0, Lcom/daaw/avee/comp/Visualizer/Elements/Particles/Remove/AreaRect3d;->vectorAngleZ:F

    .line 51
    invoke-direct {p0}, Lcom/daaw/avee/comp/Visualizer/Elements/Particles/Remove/AreaRect3d;->updateVector()V

    return-object p0
.end method
