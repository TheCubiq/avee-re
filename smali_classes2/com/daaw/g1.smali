.class public final Lcom/daaw/g1;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Lcom/daaw/ll;


# instance fields
.field public final a:Lcom/daaw/ll;

.field public final b:F


# direct methods
.method public constructor <init>(FLcom/daaw/ll;)V
    .locals 1

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    :goto_0
    instance-of v0, p2, Lcom/daaw/g1;

    if-eqz v0, :cond_0

    check-cast p2, Lcom/daaw/g1;

    iget-object p2, p2, Lcom/daaw/g1;->a:Lcom/daaw/ll;

    move-object v0, p2

    check-cast v0, Lcom/daaw/g1;

    iget v0, v0, Lcom/daaw/g1;->b:F

    add-float/2addr p1, v0

    goto :goto_0

    :cond_0
    iput-object p2, p0, Lcom/daaw/g1;->a:Lcom/daaw/ll;

    iput p1, p0, Lcom/daaw/g1;->b:F

    return-void
.end method


# virtual methods
.method public a(Landroid/graphics/RectF;)F
    .locals 1

    iget-object v0, p0, Lcom/daaw/g1;->a:Lcom/daaw/ll;

    invoke-interface {v0, p1}, Lcom/daaw/ll;->a(Landroid/graphics/RectF;)F

    move-result p1

    iget v0, p0, Lcom/daaw/g1;->b:F

    add-float/2addr p1, v0

    const/4 v0, 0x0

    invoke-static {v0, p1}, Ljava/lang/Math;->max(FF)F

    move-result p1

    return p1
.end method

.method public equals(Ljava/lang/Object;)Z
    .locals 4

    const/4 v0, 0x1

    if-ne p0, p1, :cond_0

    return v0

    :cond_0
    instance-of v1, p1, Lcom/daaw/g1;

    const/4 v2, 0x0

    if-nez v1, :cond_1

    return v2

    :cond_1
    check-cast p1, Lcom/daaw/g1;

    iget-object v1, p0, Lcom/daaw/g1;->a:Lcom/daaw/ll;

    iget-object v3, p1, Lcom/daaw/g1;->a:Lcom/daaw/ll;

    invoke-virtual {v1, v3}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_2

    iget v1, p0, Lcom/daaw/g1;->b:F

    iget p1, p1, Lcom/daaw/g1;->b:F

    cmpl-float p1, v1, p1

    if-nez p1, :cond_2

    goto :goto_0

    :cond_2
    const/4 v0, 0x0

    :goto_0
    return v0
.end method

.method public hashCode()I
    .locals 3

    const/4 v0, 0x2

    new-array v0, v0, [Ljava/lang/Object;

    iget-object v1, p0, Lcom/daaw/g1;->a:Lcom/daaw/ll;

    const/4 v2, 0x0

    aput-object v1, v0, v2

    iget v1, p0, Lcom/daaw/g1;->b:F

    invoke-static {v1}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    move-result-object v1

    const/4 v2, 0x1

    aput-object v1, v0, v2

    invoke-static {v0}, Ljava/util/Arrays;->hashCode([Ljava/lang/Object;)I

    move-result v0

    return v0
.end method
