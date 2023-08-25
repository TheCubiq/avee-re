.class public abstract Lcom/daaw/a;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Lcom/daaw/ae0;


# instance fields
.field public a:F

.field public b:F

.field public c:F

.field public d:F

.field public e:F


# direct methods
.method public constructor <init>()V
    .locals 1

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const/high16 v0, 0x3f800000    # 1.0f

    iput v0, p0, Lcom/daaw/a;->a:F

    const/4 v0, 0x0

    iput v0, p0, Lcom/daaw/a;->b:F

    iput v0, p0, Lcom/daaw/a;->c:F

    iput v0, p0, Lcom/daaw/a;->d:F

    return-void
.end method


# virtual methods
.method public a(Lcom/daaw/un;)V
    .locals 2

    const-string v0, "Speed"

    const/high16 v1, 0x42c80000    # 100.0f

    invoke-virtual {p1, v0, v1}, Lcom/daaw/un;->o(Ljava/lang/String;F)F

    move-result v0

    iput v0, p0, Lcom/daaw/a;->a:F

    const-string v0, "speedRandom"

    const/high16 v1, 0x42700000    # 60.0f

    invoke-virtual {p1, v0, v1}, Lcom/daaw/un;->o(Ljava/lang/String;F)F

    move-result v0

    iput v0, p0, Lcom/daaw/a;->b:F

    const-string v0, "trailLength"

    const/4 v1, 0x0

    invoke-virtual {p1, v0, v1}, Lcom/daaw/un;->o(Ljava/lang/String;F)F

    move-result p1

    iput p1, p0, Lcom/daaw/a;->d:F

    return-void
.end method

.method public b()F
    .locals 1

    iget v0, p0, Lcom/daaw/a;->d:F

    return v0
.end method

.method public c(F)V
    .locals 0

    iput p1, p0, Lcom/daaw/a;->a:F

    return-void
.end method

.method public j(F)V
    .locals 0

    iput p1, p0, Lcom/daaw/a;->b:F

    return-void
.end method

.method public o(Lcom/daaw/un;)V
    .locals 12

    iget v2, p0, Lcom/daaw/a;->a:F

    const-string v1, "Speed"

    const-string v3, "behaviour"

    const/high16 v4, -0x3c6a0000    # -300.0f

    const/high16 v5, 0x43960000    # 300.0f

    move-object v0, p1

    invoke-virtual/range {v0 .. v5}, Lcom/daaw/un;->O(Ljava/lang/String;FLjava/lang/String;FF)V

    iget v8, p0, Lcom/daaw/a;->b:F

    const-string v7, "speedRandom"

    const-string v9, "behaviour"

    const/high16 v10, -0x3c6a0000    # -300.0f

    const/high16 v11, 0x43960000    # 300.0f

    move-object v6, p1

    invoke-virtual/range {v6 .. v11}, Lcom/daaw/un;->O(Ljava/lang/String;FLjava/lang/String;FF)V

    iget v2, p0, Lcom/daaw/a;->d:F

    const-string v1, "trailLength"

    const-string v3, "appearance"

    const/4 v4, 0x0

    const/high16 v5, 0x3f800000    # 1.0f

    invoke-virtual/range {v0 .. v5}, Lcom/daaw/un;->O(Ljava/lang/String;FLjava/lang/String;FF)V

    return-void
.end method

.method public q(F)V
    .locals 0

    iput p1, p0, Lcom/daaw/a;->d:F

    return-void
.end method
