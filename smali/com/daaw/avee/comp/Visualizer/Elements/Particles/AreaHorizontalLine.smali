.class public Lcom/daaw/avee/comp/Visualizer/Elements/Particles/AreaHorizontalLine;
.super Ljava/lang/Object;
.source "AreaHorizontalLine.java"

# interfaces
.implements Lcom/daaw/avee/comp/Visualizer/Elements/Base/IArea;


# static fields
.field public static final typeName:Ljava/lang/String; = "HorizontalLine"


# instance fields
.field private randomGenerator:Ljava/util/Random;

.field private useRandomVectorInstead:Z

.field private vector:Lcom/daaw/avee/Common/Vec2f;

.field private vectorAngle:F

.field private vectorAngleZ:F

.field private verticalOrientation:Z


# direct methods
.method public constructor <init>()V
    .locals 2

    .line 28
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 19
    new-instance v0, Ljava/util/Random;

    invoke-direct {v0}, Ljava/util/Random;-><init>()V

    iput-object v0, p0, Lcom/daaw/avee/comp/Visualizer/Elements/Particles/AreaHorizontalLine;->randomGenerator:Ljava/util/Random;

    const/4 v0, 0x0

    .line 21
    iput v0, p0, Lcom/daaw/avee/comp/Visualizer/Elements/Particles/AreaHorizontalLine;->vectorAngle:F

    const/high16 v1, 0x3f800000    # 1.0f

    .line 22
    iput v1, p0, Lcom/daaw/avee/comp/Visualizer/Elements/Particles/AreaHorizontalLine;->vectorAngleZ:F

    .line 23
    new-instance v1, Lcom/daaw/avee/Common/Vec2f;

    invoke-direct {v1, v0, v0}, Lcom/daaw/avee/Common/Vec2f;-><init>(FF)V

    iput-object v1, p0, Lcom/daaw/avee/comp/Visualizer/Elements/Particles/AreaHorizontalLine;->vector:Lcom/daaw/avee/Common/Vec2f;

    const/4 v0, 0x1

    .line 24
    iput-boolean v0, p0, Lcom/daaw/avee/comp/Visualizer/Elements/Particles/AreaHorizontalLine;->useRandomVectorInstead:Z

    const/4 v0, 0x0

    .line 25
    iput-boolean v0, p0, Lcom/daaw/avee/comp/Visualizer/Elements/Particles/AreaHorizontalLine;->verticalOrientation:Z

    const/high16 v0, 0x43870000    # 270.0f

    .line 29
    invoke-virtual {p0, v0}, Lcom/daaw/avee/comp/Visualizer/Elements/Particles/AreaHorizontalLine;->setVectorAngle(F)Lcom/daaw/avee/comp/Visualizer/Elements/Particles/AreaHorizontalLine;

    return-void
.end method


# virtual methods
.method public getRandomPointInArea(Landroid/graphics/RectF;Lcom/daaw/avee/Common/Vec3f;Lcom/daaw/avee/Common/Vec3f;Z)V
    .locals 4

    .line 69
    iget-object v0, p0, Lcom/daaw/avee/comp/Visualizer/Elements/Particles/AreaHorizontalLine;->randomGenerator:Ljava/util/Random;

    invoke-virtual {v0}, Ljava/util/Random;->nextFloat()F

    move-result v0

    const/4 v1, 0x0

    .line 70
    iput v1, p3, Lcom/daaw/avee/Common/Vec3f;->z:F

    .line 72
    iget-boolean v2, p0, Lcom/daaw/avee/comp/Visualizer/Elements/Particles/AreaHorizontalLine;->verticalOrientation:Z

    if-eqz v2, :cond_0

    .line 74
    invoke-virtual {p1}, Landroid/graphics/RectF;->centerX()F

    move-result v2

    iput v2, p2, Lcom/daaw/avee/Common/Vec3f;->x:F

    .line 75
    iget v2, p1, Landroid/graphics/RectF;->top:F

    invoke-virtual {p1}, Landroid/graphics/RectF;->height()F

    move-result p1

    mul-float p1, p1, v0

    add-float/2addr v2, p1

    iput v2, p2, Lcom/daaw/avee/Common/Vec3f;->y:F

    .line 76
    iput v1, p2, Lcom/daaw/avee/Common/Vec3f;->z:F

    goto :goto_0

    .line 80
    :cond_0
    iget v2, p1, Landroid/graphics/RectF;->left:F

    invoke-virtual {p1}, Landroid/graphics/RectF;->width()F

    move-result v3

    mul-float v3, v3, v0

    add-float/2addr v2, v3

    iput v2, p2, Lcom/daaw/avee/Common/Vec3f;->x:F

    .line 81
    invoke-virtual {p1}, Landroid/graphics/RectF;->centerY()F

    move-result p1

    iput p1, p2, Lcom/daaw/avee/Common/Vec3f;->y:F

    .line 82
    iput v1, p2, Lcom/daaw/avee/Common/Vec3f;->z:F

    .line 87
    :goto_0
    iget-boolean p1, p0, Lcom/daaw/avee/comp/Visualizer/Elements/Particles/AreaHorizontalLine;->useRandomVectorInstead:Z

    const/high16 p2, 0x3f800000    # 1.0f

    if-eqz p1, :cond_1

    .line 89
    iget-object p1, p0, Lcom/daaw/avee/comp/Visualizer/Elements/Particles/AreaHorizontalLine;->randomGenerator:Ljava/util/Random;

    invoke-virtual {p1}, Ljava/util/Random;->nextFloat()F

    move-result p1

    .line 90
    iget-object v0, p0, Lcom/daaw/avee/comp/Visualizer/Elements/Particles/AreaHorizontalLine;->randomGenerator:Ljava/util/Random;

    invoke-virtual {v0}, Ljava/util/Random;->nextFloat()F

    move-result v0

    const/high16 v1, 0x40000000    # 2.0f

    mul-float p1, p1, v1

    sub-float/2addr p1, p2

    .line 92
    iput p1, p3, Lcom/daaw/avee/Common/Vec3f;->x:F

    mul-float v0, v0, v1

    sub-float/2addr v0, p2

    .line 93
    iput v0, p3, Lcom/daaw/avee/Common/Vec3f;->y:F

    goto :goto_1

    .line 95
    :cond_1
    iget-object p1, p0, Lcom/daaw/avee/comp/Visualizer/Elements/Particles/AreaHorizontalLine;->vector:Lcom/daaw/avee/Common/Vec2f;

    iget p1, p1, Lcom/daaw/avee/Common/Vec2f;->x:F

    iput p1, p3, Lcom/daaw/avee/Common/Vec3f;->x:F

    .line 96
    iget-object p1, p0, Lcom/daaw/avee/comp/Visualizer/Elements/Particles/AreaHorizontalLine;->vector:Lcom/daaw/avee/Common/Vec2f;

    iget p1, p1, Lcom/daaw/avee/Common/Vec2f;->y:F

    iput p1, p3, Lcom/daaw/avee/Common/Vec3f;->y:F

    :goto_1
    if-eqz p4, :cond_2

    .line 100
    iget p1, p0, Lcom/daaw/avee/comp/Visualizer/Elements/Particles/AreaHorizontalLine;->vectorAngleZ:F

    invoke-static {p1}, Ljava/lang/Math;->abs(F)F

    move-result p1

    sub-float/2addr p2, p1

    .line 102
    iget p1, p3, Lcom/daaw/avee/Common/Vec3f;->x:F

    mul-float p1, p1, p2

    iput p1, p3, Lcom/daaw/avee/Common/Vec3f;->x:F

    .line 103
    iget p1, p3, Lcom/daaw/avee/Common/Vec3f;->y:F

    mul-float p1, p1, p2

    iput p1, p3, Lcom/daaw/avee/Common/Vec3f;->y:F

    .line 104
    iget p1, p0, Lcom/daaw/avee/comp/Visualizer/Elements/Particles/AreaHorizontalLine;->vectorAngleZ:F

    iput p1, p3, Lcom/daaw/avee/Common/Vec3f;->z:F

    .line 105
    invoke-virtual {p3}, Lcom/daaw/avee/Common/Vec3f;->normalize()V

    :cond_2
    return-void
.end method

.method public getVectorAngle()F
    .locals 1

    .line 44
    iget v0, p0, Lcom/daaw/avee/comp/Visualizer/Elements/Particles/AreaHorizontalLine;->vectorAngle:F

    return v0
.end method

.method public getVectorZ()F
    .locals 1

    .line 63
    iget v0, p0, Lcom/daaw/avee/comp/Visualizer/Elements/Particles/AreaHorizontalLine;->vectorAngleZ:F

    return v0
.end method

.method public getVerticalOrientation()Z
    .locals 1

    .line 54
    iget-boolean v0, p0, Lcom/daaw/avee/comp/Visualizer/Elements/Particles/AreaHorizontalLine;->verticalOrientation:Z

    return v0
.end method

.method public onApplyCustomization(Lcom/daaw/avee/comp/Visualizer/CustomPropertiesList;)V
    .locals 2

    const-string v0, "verticalOrientation"

    const/4 v1, 0x0

    .line 112
    invoke-virtual {p1, v0, v1}, Lcom/daaw/avee/comp/Visualizer/CustomPropertiesList;->getPropertyBool(Ljava/lang/String;Z)Z

    move-result v0

    invoke-virtual {p0, v0}, Lcom/daaw/avee/comp/Visualizer/Elements/Particles/AreaHorizontalLine;->setVerticalOrientation(Z)Lcom/daaw/avee/comp/Visualizer/Elements/Particles/AreaHorizontalLine;

    const-string v0, "useRandomVectorInstead"

    const/4 v1, 0x1

    .line 113
    invoke-virtual {p1, v0, v1}, Lcom/daaw/avee/comp/Visualizer/CustomPropertiesList;->getPropertyBool(Ljava/lang/String;Z)Z

    move-result v0

    iput-boolean v0, p0, Lcom/daaw/avee/comp/Visualizer/Elements/Particles/AreaHorizontalLine;->useRandomVectorInstead:Z

    const-string v0, "vectorAngle"

    const/high16 v1, 0x43870000    # 270.0f

    .line 114
    invoke-virtual {p1, v0, v1}, Lcom/daaw/avee/comp/Visualizer/CustomPropertiesList;->getPropertyFloat(Ljava/lang/String;F)F

    move-result v0

    invoke-virtual {p0, v0}, Lcom/daaw/avee/comp/Visualizer/Elements/Particles/AreaHorizontalLine;->setVectorAngle(F)Lcom/daaw/avee/comp/Visualizer/Elements/Particles/AreaHorizontalLine;

    const-string v0, "vectorAngleZ"

    const/high16 v1, 0x3f800000    # 1.0f

    .line 115
    invoke-virtual {p1, v0, v1}, Lcom/daaw/avee/comp/Visualizer/CustomPropertiesList;->getPropertyFloat(Ljava/lang/String;F)F

    move-result p1

    invoke-virtual {p0, p1}, Lcom/daaw/avee/comp/Visualizer/Elements/Particles/AreaHorizontalLine;->setVectorZ(F)Lcom/daaw/avee/comp/Visualizer/Elements/Particles/AreaHorizontalLine;

    return-void
.end method

.method public onReadCustomization(Lcom/daaw/avee/comp/Visualizer/CustomPropertiesList;)V
    .locals 6

    .line 121
    invoke-virtual {p0}, Lcom/daaw/avee/comp/Visualizer/Elements/Particles/AreaHorizontalLine;->getVerticalOrientation()Z

    move-result v0

    const-string v1, "misc"

    const-string v2, "verticalOrientation"

    invoke-virtual {p1, v2, v0, v1}, Lcom/daaw/avee/comp/Visualizer/CustomPropertiesList;->putPropertyBool(Ljava/lang/String;ZLjava/lang/String;)V

    .line 122
    iget-boolean v0, p0, Lcom/daaw/avee/comp/Visualizer/Elements/Particles/AreaHorizontalLine;->useRandomVectorInstead:Z

    const-string v2, "useRandomVectorInstead"

    invoke-virtual {p1, v2, v0, v1}, Lcom/daaw/avee/comp/Visualizer/CustomPropertiesList;->putPropertyBool(Ljava/lang/String;ZLjava/lang/String;)V

    .line 123
    invoke-virtual {p0}, Lcom/daaw/avee/comp/Visualizer/Elements/Particles/AreaHorizontalLine;->getVectorAngle()F

    move-result v2

    const-string v1, "vectorAngle"

    const-string v3, "misc"

    const/4 v4, 0x0

    const/high16 v5, 0x43b40000    # 360.0f

    move-object v0, p1

    invoke-virtual/range {v0 .. v5}, Lcom/daaw/avee/comp/Visualizer/CustomPropertiesList;->putPropertyFloatAsRange(Ljava/lang/String;FLjava/lang/String;FF)V

    .line 124
    invoke-virtual {p0}, Lcom/daaw/avee/comp/Visualizer/Elements/Particles/AreaHorizontalLine;->getVectorZ()F

    move-result v2

    const-string v1, "vectorAngleZ"

    const-string v3, "misc"

    const/high16 v4, -0x40800000    # -1.0f

    const/high16 v5, 0x3f800000    # 1.0f

    invoke-virtual/range {v0 .. v5}, Lcom/daaw/avee/comp/Visualizer/CustomPropertiesList;->putPropertyFloatAsRange(Ljava/lang/String;FLjava/lang/String;FF)V

    return-void
.end method

.method public setUseRandomVectorInstead(Z)Lcom/daaw/avee/comp/Visualizer/Elements/Particles/AreaHorizontalLine;
    .locals 0

    .line 33
    iput-boolean p1, p0, Lcom/daaw/avee/comp/Visualizer/Elements/Particles/AreaHorizontalLine;->useRandomVectorInstead:Z

    return-object p0
.end method

.method public setVectorAngle(F)Lcom/daaw/avee/comp/Visualizer/Elements/Particles/AreaHorizontalLine;
    .locals 0

    .line 38
    iput p1, p0, Lcom/daaw/avee/comp/Visualizer/Elements/Particles/AreaHorizontalLine;->vectorAngle:F

    .line 39
    invoke-static {p1}, Lcom/daaw/avee/Common/Vec2f;->fromAngleRad(F)Lcom/daaw/avee/Common/Vec2f;

    move-result-object p1

    iput-object p1, p0, Lcom/daaw/avee/comp/Visualizer/Elements/Particles/AreaHorizontalLine;->vector:Lcom/daaw/avee/Common/Vec2f;

    return-object p0
.end method

.method public setVectorZ(F)Lcom/daaw/avee/comp/Visualizer/Elements/Particles/AreaHorizontalLine;
    .locals 0

    .line 58
    iput p1, p0, Lcom/daaw/avee/comp/Visualizer/Elements/Particles/AreaHorizontalLine;->vectorAngleZ:F

    return-object p0
.end method

.method public setVerticalOrientation(Z)Lcom/daaw/avee/comp/Visualizer/Elements/Particles/AreaHorizontalLine;
    .locals 0

    .line 49
    iput-boolean p1, p0, Lcom/daaw/avee/comp/Visualizer/Elements/Particles/AreaHorizontalLine;->verticalOrientation:Z

    return-object p0
.end method
