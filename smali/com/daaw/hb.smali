.class public Lcom/daaw/hb;
.super Lcom/daaw/a;
.source ""


# instance fields
.field public A:F

.field public B:F

.field public C:F

.field public D:F

.field public final f:Ljava/util/Random;

.field public g:Ljava/lang/String;

.field public h:F

.field public i:F

.field public j:Lcom/daaw/bs1;

.field public k:Z

.field public l:[F

.field public m:[F

.field public n:F

.field public o:F

.field public p:F

.field public q:F

.field public r:F

.field public s:F

.field public t:F

.field public u:F

.field public v:F

.field public w:F

.field public x:[F

.field public y:[F

.field public z:F


# direct methods
.method public constructor <init>()V
    .locals 4

    invoke-direct {p0}, Lcom/daaw/a;-><init>()V

    new-instance v0, Ljava/util/Random;

    invoke-direct {v0}, Ljava/util/Random;-><init>()V

    iput-object v0, p0, Lcom/daaw/hb;->f:Ljava/util/Random;

    const/4 v0, 0x0

    iput-object v0, p0, Lcom/daaw/hb;->g:Ljava/lang/String;

    const/high16 v0, 0x3fc00000    # 1.5f

    iput v0, p0, Lcom/daaw/hb;->h:F

    const v0, 0x3dcccccd    # 0.1f

    iput v0, p0, Lcom/daaw/hb;->i:F

    new-instance v1, Lcom/daaw/bs1;

    const/4 v2, 0x0

    invoke-direct {v1, v2, v2}, Lcom/daaw/bs1;-><init>(FF)V

    iput-object v1, p0, Lcom/daaw/hb;->j:Lcom/daaw/bs1;

    const/4 v1, 0x1

    iput-boolean v1, p0, Lcom/daaw/hb;->k:Z

    const/4 v1, 0x4

    new-array v3, v1, [F

    fill-array-data v3, :array_0

    iput-object v3, p0, Lcom/daaw/hb;->l:[F

    new-array v3, v1, [F

    fill-array-data v3, :array_1

    iput-object v3, p0, Lcom/daaw/hb;->m:[F

    iput v2, p0, Lcom/daaw/hb;->n:F

    iput v2, p0, Lcom/daaw/hb;->o:F

    iput v2, p0, Lcom/daaw/hb;->p:F

    iput v2, p0, Lcom/daaw/hb;->q:F

    const/high16 v3, 0x3f800000    # 1.0f

    iput v3, p0, Lcom/daaw/hb;->r:F

    const/high16 v3, 0x40800000    # 4.0f

    iput v3, p0, Lcom/daaw/hb;->s:F

    iput v3, p0, Lcom/daaw/hb;->t:F

    iput v3, p0, Lcom/daaw/hb;->u:F

    iput v2, p0, Lcom/daaw/hb;->v:F

    iput v2, p0, Lcom/daaw/hb;->w:F

    new-array v2, v1, [F

    iput-object v2, p0, Lcom/daaw/hb;->x:[F

    new-array v1, v1, [F

    iput-object v1, p0, Lcom/daaw/hb;->y:[F

    iput v0, p0, Lcom/daaw/hb;->z:F

    iput v0, p0, Lcom/daaw/hb;->A:F

    iput v0, p0, Lcom/daaw/hb;->B:F

    iput v0, p0, Lcom/daaw/hb;->C:F

    invoke-virtual {p0, v0}, Lcom/daaw/hb;->v(F)V

    return-void

    :array_0
    .array-data 4
        0x3f800000    # 1.0f
        0x3f800000    # 1.0f
        0x3f800000    # 1.0f
        0x3f800000    # 1.0f
    .end array-data

    :array_1
    .array-data 4
        0x3f800000    # 1.0f
        0x3f800000    # 1.0f
        0x3f800000    # 1.0f
        0x3f800000    # 1.0f
    .end array-data
.end method


# virtual methods
.method public A(F)V
    .locals 0

    iput p1, p0, Lcom/daaw/hb;->s:F

    return-void
.end method

.method public a(Lcom/daaw/un;)V
    .locals 3

    invoke-super {p0, p1}, Lcom/daaw/a;->a(Lcom/daaw/un;)V

    const/4 v0, 0x4

    new-array v1, v0, [F

    fill-array-data v1, :array_0

    const-string v2, "ColorFrom"

    invoke-virtual {p1, v2, v1}, Lcom/daaw/un;->m(Ljava/lang/String;[F)[F

    move-result-object v1

    iput-object v1, p0, Lcom/daaw/hb;->l:[F

    new-array v0, v0, [F

    fill-array-data v0, :array_1

    const-string v1, "ColorTo"

    invoke-virtual {p1, v1, v0}, Lcom/daaw/un;->m(Ljava/lang/String;[F)[F

    move-result-object v0

    iput-object v0, p0, Lcom/daaw/hb;->m:[F

    const-string v0, "lifetime"

    const/high16 v1, 0x41000000    # 8.0f

    invoke-virtual {p1, v0, v1}, Lcom/daaw/un;->o(Ljava/lang/String;F)F

    move-result v0

    iput v0, p0, Lcom/daaw/hb;->h:F

    const-string v0, "fadeInAndOutTime"

    const v1, 0x3dcccccd    # 0.1f

    invoke-virtual {p1, v0, v1}, Lcom/daaw/un;->o(Ljava/lang/String;F)F

    move-result v0

    invoke-virtual {p0, v0}, Lcom/daaw/hb;->v(F)V

    new-instance v0, Lcom/daaw/bs1;

    const/4 v1, 0x0

    invoke-direct {v0, v1, v1}, Lcom/daaw/bs1;-><init>(FF)V

    const-string v2, "gravity"

    invoke-virtual {p1, v2, v0}, Lcom/daaw/un;->z(Ljava/lang/String;Lcom/daaw/bs1;)Lcom/daaw/bs1;

    move-result-object v0

    iput-object v0, p0, Lcom/daaw/hb;->j:Lcom/daaw/bs1;

    const-string v0, "velocityAngle"

    const/4 v2, 0x1

    invoke-virtual {p1, v0, v2}, Lcom/daaw/un;->n(Ljava/lang/String;Z)Z

    move-result v0

    iput-boolean v0, p0, Lcom/daaw/hb;->k:Z

    const-string v0, "sizeAspectRatio"

    const/high16 v2, 0x3f800000    # 1.0f

    invoke-virtual {p1, v0, v2}, Lcom/daaw/un;->o(Ljava/lang/String;F)F

    move-result v0

    iput v0, p0, Lcom/daaw/hb;->r:F

    const-string v0, "startSize"

    invoke-virtual {p1, v0, v1}, Lcom/daaw/un;->o(Ljava/lang/String;F)F

    move-result v0

    iput v0, p0, Lcom/daaw/hb;->s:F

    const-string v0, "fadeInSize"

    const/high16 v2, 0x40800000    # 4.0f

    invoke-virtual {p1, v0, v2}, Lcom/daaw/un;->o(Ljava/lang/String;F)F

    move-result v0

    iput v0, p0, Lcom/daaw/hb;->t:F

    const-string v0, "endSize"

    invoke-virtual {p1, v0, v2}, Lcom/daaw/un;->o(Ljava/lang/String;F)F

    move-result v0

    iput v0, p0, Lcom/daaw/hb;->u:F

    const-string v0, "endSizeRandom"

    const/high16 v2, 0x41200000    # 10.0f

    invoke-virtual {p1, v0, v2}, Lcom/daaw/un;->o(Ljava/lang/String;F)F

    move-result v0

    iput v0, p0, Lcom/daaw/hb;->v:F

    const-string v0, "endSizeZFactor"

    invoke-virtual {p1, v0, v1}, Lcom/daaw/un;->o(Ljava/lang/String;F)F

    move-result v0

    iput v0, p0, Lcom/daaw/hb;->w:F

    const-string v0, "sideSineWaveFreq"

    invoke-virtual {p1, v0, v1}, Lcom/daaw/un;->o(Ljava/lang/String;F)F

    move-result v0

    iput v0, p0, Lcom/daaw/hb;->n:F

    const-string v0, "sideSineWaveFreqRandom"

    invoke-virtual {p1, v0, v1}, Lcom/daaw/un;->o(Ljava/lang/String;F)F

    move-result v0

    iput v0, p0, Lcom/daaw/hb;->o:F

    const-string v0, "sideSineWaveMag"

    invoke-virtual {p1, v0, v1}, Lcom/daaw/un;->o(Ljava/lang/String;F)F

    move-result v0

    iput v0, p0, Lcom/daaw/hb;->p:F

    const-string v0, "sideSineWaveMagRandom"

    invoke-virtual {p1, v0, v1}, Lcom/daaw/un;->o(Ljava/lang/String;F)F

    move-result p1

    iput p1, p0, Lcom/daaw/hb;->q:F

    return-void

    :array_0
    .array-data 4
        0x3f800000    # 1.0f
        0x3f800000    # 1.0f
        0x3f800000    # 1.0f
        0x3f800000    # 1.0f
    .end array-data

    :array_1
    .array-data 4
        0x0
        0x0
        0x3f000000    # 0.5f
        0x3f000000    # 0.5f
    .end array-data
.end method

.method public g(Lcom/daaw/y31;Lcom/daaw/zd0;Lcom/daaw/ds1;Lcom/daaw/ds1;)Z
    .locals 11

    check-cast p2, Lcom/daaw/wv0;

    iget-object p1, p0, Lcom/daaw/hb;->f:Ljava/util/Random;

    invoke-virtual {p1}, Ljava/util/Random;->nextFloat()F

    move-result p1

    const/high16 v0, 0x3f800000    # 1.0f

    sub-float v1, v0, p1

    new-instance v2, Lcom/daaw/ds1;

    iget v3, p4, Lcom/daaw/ds1;->a:F

    const v4, 0x3e4ccccd    # 0.2f

    mul-float v3, v3, v4

    iget v5, p4, Lcom/daaw/ds1;->b:F

    mul-float v5, v5, v4

    iget p4, p4, Lcom/daaw/ds1;->c:F

    const v4, 0x3ca3d70a    # 0.02f

    mul-float p4, p4, v4

    invoke-direct {v2, v3, v5, p4}, Lcom/daaw/ds1;-><init>(FFF)V

    invoke-virtual {v2}, Lcom/daaw/ds1;->c()V

    iget p4, p0, Lcom/daaw/hb;->v:F

    mul-float p4, p4, p1

    iget v3, p0, Lcom/daaw/hb;->u:F

    iget v4, p0, Lcom/daaw/hb;->w:F

    iget v5, v2, Lcom/daaw/ds1;->c:F

    mul-float v4, v4, v5

    add-float/2addr v3, v4

    iput v3, p0, Lcom/daaw/hb;->D:F

    iget v3, p0, Lcom/daaw/a;->a:F

    iget v4, p0, Lcom/daaw/a;->b:F

    mul-float v4, v4, p1

    add-float/2addr v3, v4

    iput v3, p0, Lcom/daaw/a;->e:F

    const/4 v3, 0x4

    invoke-virtual {p2, v3}, Lcom/daaw/wv0;->h(I)V

    const/4 v3, 0x0

    invoke-virtual {p2, v3}, Lcom/daaw/wv0;->i(I)Lcom/daaw/xv0;

    move-result-object v4

    iget v5, p0, Lcom/daaw/hb;->n:F

    iget v6, p0, Lcom/daaw/hb;->o:F

    mul-float v6, v6, v1

    add-float/2addr v5, v6

    iput v5, v4, Lcom/daaw/xv0;->g:F

    invoke-virtual {p2, v3}, Lcom/daaw/wv0;->i(I)Lcom/daaw/xv0;

    move-result-object v4

    iget v5, p0, Lcom/daaw/hb;->p:F

    iget v6, p0, Lcom/daaw/hb;->q:F

    mul-float v6, v6, p1

    add-float/2addr v5, v6

    iput v5, v4, Lcom/daaw/xv0;->h:F

    const/4 v4, 0x1

    invoke-virtual {p2, v4}, Lcom/daaw/wv0;->i(I)Lcom/daaw/xv0;

    move-result-object v5

    iget v6, p0, Lcom/daaw/hb;->n:F

    iget v7, p0, Lcom/daaw/hb;->o:F

    mul-float v7, v7, v1

    add-float/2addr v6, v7

    iput v6, v5, Lcom/daaw/xv0;->g:F

    invoke-virtual {p2, v4}, Lcom/daaw/wv0;->i(I)Lcom/daaw/xv0;

    move-result-object v5

    iget v6, p0, Lcom/daaw/hb;->p:F

    iget v7, p0, Lcom/daaw/hb;->q:F

    mul-float v7, v7, p1

    add-float/2addr v6, v7

    iput v6, v5, Lcom/daaw/xv0;->h:F

    const/4 v5, 0x2

    invoke-virtual {p2, v5}, Lcom/daaw/wv0;->i(I)Lcom/daaw/xv0;

    move-result-object v6

    iget v7, p0, Lcom/daaw/hb;->n:F

    iget v8, p0, Lcom/daaw/hb;->o:F

    mul-float v8, v8, v1

    add-float/2addr v7, v8

    iput v7, v6, Lcom/daaw/xv0;->g:F

    invoke-virtual {p2, v5}, Lcom/daaw/wv0;->i(I)Lcom/daaw/xv0;

    move-result-object v6

    iget v7, p0, Lcom/daaw/hb;->p:F

    iget v8, p0, Lcom/daaw/hb;->q:F

    mul-float v8, v8, p1

    add-float/2addr v7, v8

    iput v7, v6, Lcom/daaw/xv0;->h:F

    const/4 v6, 0x3

    invoke-virtual {p2, v6}, Lcom/daaw/wv0;->i(I)Lcom/daaw/xv0;

    move-result-object v7

    iget v8, p0, Lcom/daaw/hb;->n:F

    iget v9, p0, Lcom/daaw/hb;->o:F

    mul-float v9, v9, v1

    add-float/2addr v8, v9

    iput v8, v7, Lcom/daaw/xv0;->g:F

    invoke-virtual {p2, v6}, Lcom/daaw/wv0;->i(I)Lcom/daaw/xv0;

    move-result-object v1

    iget v7, p0, Lcom/daaw/hb;->p:F

    iget v8, p0, Lcom/daaw/hb;->q:F

    mul-float v8, v8, p1

    add-float/2addr v7, v8

    iput v7, v1, Lcom/daaw/xv0;->h:F

    invoke-virtual {p2, v3}, Lcom/daaw/wv0;->i(I)Lcom/daaw/xv0;

    move-result-object v1

    const/4 v7, 0x0

    iput v7, v1, Lcom/daaw/xv0;->a:F

    invoke-virtual {p2, v4}, Lcom/daaw/wv0;->i(I)Lcom/daaw/xv0;

    move-result-object v1

    iget v8, p0, Lcom/daaw/hb;->z:F

    iput v8, v1, Lcom/daaw/xv0;->a:F

    invoke-virtual {p2, v5}, Lcom/daaw/wv0;->i(I)Lcom/daaw/xv0;

    move-result-object v1

    iget v8, p0, Lcom/daaw/hb;->A:F

    iput v8, v1, Lcom/daaw/xv0;->a:F

    invoke-virtual {p2, v6}, Lcom/daaw/wv0;->i(I)Lcom/daaw/xv0;

    move-result-object v1

    iput v0, v1, Lcom/daaw/xv0;->a:F

    invoke-virtual {p2, v3}, Lcom/daaw/wv0;->i(I)Lcom/daaw/xv0;

    move-result-object v0

    iget-boolean v1, p0, Lcom/daaw/hb;->k:Z

    iput-boolean v1, v0, Lcom/daaw/xv0;->e:Z

    invoke-virtual {p2, v4}, Lcom/daaw/wv0;->i(I)Lcom/daaw/xv0;

    move-result-object v0

    iget-boolean v1, p0, Lcom/daaw/hb;->k:Z

    iput-boolean v1, v0, Lcom/daaw/xv0;->e:Z

    invoke-virtual {p2, v5}, Lcom/daaw/wv0;->i(I)Lcom/daaw/xv0;

    move-result-object v0

    iget-boolean v1, p0, Lcom/daaw/hb;->k:Z

    iput-boolean v1, v0, Lcom/daaw/xv0;->e:Z

    invoke-virtual {p2, v6}, Lcom/daaw/wv0;->i(I)Lcom/daaw/xv0;

    move-result-object v0

    iget-boolean v1, p0, Lcom/daaw/hb;->k:Z

    iput-boolean v1, v0, Lcom/daaw/xv0;->e:Z

    invoke-virtual {p2, v3}, Lcom/daaw/wv0;->i(I)Lcom/daaw/xv0;

    move-result-object v0

    invoke-virtual {p2, v3}, Lcom/daaw/wv0;->i(I)Lcom/daaw/xv0;

    move-result-object v1

    iget v8, p0, Lcom/daaw/hb;->s:F

    add-float/2addr v8, p4

    iput v8, v1, Lcom/daaw/xv0;->c:F

    iput v8, v0, Lcom/daaw/xv0;->b:F

    invoke-virtual {p2, v4}, Lcom/daaw/wv0;->i(I)Lcom/daaw/xv0;

    move-result-object v0

    invoke-virtual {p2, v4}, Lcom/daaw/wv0;->i(I)Lcom/daaw/xv0;

    move-result-object v1

    iget v8, p0, Lcom/daaw/hb;->t:F

    add-float/2addr v8, p4

    iget v9, p0, Lcom/daaw/hb;->B:F

    mul-float v8, v8, v9

    iget v9, p0, Lcom/daaw/hb;->D:F

    iget v10, p0, Lcom/daaw/hb;->z:F

    mul-float v9, v9, v10

    add-float/2addr v8, v9

    iput v8, v1, Lcom/daaw/xv0;->c:F

    iput v8, v0, Lcom/daaw/xv0;->b:F

    invoke-virtual {p2, v5}, Lcom/daaw/wv0;->i(I)Lcom/daaw/xv0;

    move-result-object v0

    invoke-virtual {p2, v5}, Lcom/daaw/wv0;->i(I)Lcom/daaw/xv0;

    move-result-object v1

    iget v8, p0, Lcom/daaw/hb;->t:F

    add-float/2addr v8, p4

    iget v9, p0, Lcom/daaw/hb;->C:F

    mul-float v8, v8, v9

    iget v9, p0, Lcom/daaw/hb;->D:F

    iget v10, p0, Lcom/daaw/hb;->A:F

    mul-float v9, v9, v10

    add-float/2addr v8, v9

    iput v8, v1, Lcom/daaw/xv0;->c:F

    iput v8, v0, Lcom/daaw/xv0;->b:F

    invoke-virtual {p2, v6}, Lcom/daaw/wv0;->i(I)Lcom/daaw/xv0;

    move-result-object v0

    invoke-virtual {p2, v6}, Lcom/daaw/wv0;->i(I)Lcom/daaw/xv0;

    move-result-object v1

    iget v8, p0, Lcom/daaw/hb;->D:F

    add-float/2addr v8, p4

    iput v8, v1, Lcom/daaw/xv0;->c:F

    iput v8, v0, Lcom/daaw/xv0;->b:F

    invoke-virtual {p2, v3}, Lcom/daaw/wv0;->i(I)Lcom/daaw/xv0;

    move-result-object p4

    invoke-virtual {p2, v3}, Lcom/daaw/wv0;->i(I)Lcom/daaw/xv0;

    move-result-object v0

    iget v0, v0, Lcom/daaw/xv0;->c:F

    iget v1, p0, Lcom/daaw/hb;->r:F

    mul-float v0, v0, v1

    iput v0, p4, Lcom/daaw/xv0;->b:F

    invoke-virtual {p2, v4}, Lcom/daaw/wv0;->i(I)Lcom/daaw/xv0;

    move-result-object p4

    invoke-virtual {p2, v4}, Lcom/daaw/wv0;->i(I)Lcom/daaw/xv0;

    move-result-object v0

    iget v0, v0, Lcom/daaw/xv0;->c:F

    iget v1, p0, Lcom/daaw/hb;->r:F

    mul-float v0, v0, v1

    iput v0, p4, Lcom/daaw/xv0;->b:F

    invoke-virtual {p2, v5}, Lcom/daaw/wv0;->i(I)Lcom/daaw/xv0;

    move-result-object p4

    invoke-virtual {p2, v5}, Lcom/daaw/wv0;->i(I)Lcom/daaw/xv0;

    move-result-object v0

    iget v0, v0, Lcom/daaw/xv0;->c:F

    iget v1, p0, Lcom/daaw/hb;->r:F

    mul-float v0, v0, v1

    iput v0, p4, Lcom/daaw/xv0;->b:F

    invoke-virtual {p2, v6}, Lcom/daaw/wv0;->i(I)Lcom/daaw/xv0;

    move-result-object p4

    invoke-virtual {p2, v6}, Lcom/daaw/wv0;->i(I)Lcom/daaw/xv0;

    move-result-object v0

    iget v0, v0, Lcom/daaw/xv0;->c:F

    iget v1, p0, Lcom/daaw/hb;->r:F

    mul-float v0, v0, v1

    iput v0, p4, Lcom/daaw/xv0;->b:F

    iget-object p4, p0, Lcom/daaw/hb;->l:[F

    iget-object v0, p0, Lcom/daaw/hb;->m:[F

    iget-object v1, p0, Lcom/daaw/hb;->x:[F

    invoke-static {p4, v0, v1, p1}, Lcom/daaw/br1;->r([F[F[FF)V

    iget-object p1, p0, Lcom/daaw/hb;->x:[F

    iget-object p4, p0, Lcom/daaw/hb;->y:[F

    invoke-static {p1, p4}, Lcom/daaw/f80;->j([F[F)V

    invoke-virtual {p2, v3}, Lcom/daaw/wv0;->i(I)Lcom/daaw/xv0;

    move-result-object p1

    invoke-virtual {p1, v3}, Lcom/daaw/xv0;->c(I)V

    invoke-virtual {p2, v4}, Lcom/daaw/wv0;->i(I)Lcom/daaw/xv0;

    move-result-object p1

    iget-object p4, p0, Lcom/daaw/hb;->y:[F

    invoke-virtual {p1, p4}, Lcom/daaw/xv0;->d([F)V

    invoke-virtual {p2, v5}, Lcom/daaw/wv0;->i(I)Lcom/daaw/xv0;

    move-result-object p1

    iget-object p4, p0, Lcom/daaw/hb;->y:[F

    invoke-virtual {p1, p4}, Lcom/daaw/xv0;->d([F)V

    invoke-virtual {p2, v6}, Lcom/daaw/wv0;->i(I)Lcom/daaw/xv0;

    move-result-object p1

    invoke-virtual {p1, v3}, Lcom/daaw/xv0;->c(I)V

    iget-object p1, p2, Lcom/daaw/wv0;->o:Lcom/daaw/ds1;

    iget p4, p3, Lcom/daaw/ds1;->a:F

    iput p4, p1, Lcom/daaw/ds1;->a:F

    iget p4, p3, Lcom/daaw/ds1;->b:F

    iput p4, p1, Lcom/daaw/ds1;->b:F

    iget p3, p3, Lcom/daaw/ds1;->c:F

    iput p3, p1, Lcom/daaw/ds1;->c:F

    iget-object p1, p2, Lcom/daaw/wv0;->l:Lcom/daaw/ds1;

    iget p3, v2, Lcom/daaw/ds1;->a:F

    iget p4, p0, Lcom/daaw/a;->e:F

    mul-float p3, p3, p4

    iput p3, p1, Lcom/daaw/ds1;->a:F

    iget p3, v2, Lcom/daaw/ds1;->b:F

    mul-float p3, p3, p4

    iput p3, p1, Lcom/daaw/ds1;->b:F

    iget p3, v2, Lcom/daaw/ds1;->c:F

    mul-float p3, p3, p4

    iput p3, p1, Lcom/daaw/ds1;->c:F

    iget-object p1, p0, Lcom/daaw/hb;->j:Lcom/daaw/bs1;

    iput-object p1, p2, Lcom/daaw/wv0;->n:Lcom/daaw/bs1;

    invoke-static {}, Lcom/daaw/br1;->F()J

    move-result-wide p3

    iput-wide p3, p2, Lcom/daaw/wv0;->a:J

    iput v7, p2, Lcom/daaw/wv0;->b:F

    iput v7, p2, Lcom/daaw/wv0;->e:F

    iput v7, p2, Lcom/daaw/wv0;->f:F

    iget p1, p0, Lcom/daaw/hb;->h:F

    iput p1, p2, Lcom/daaw/wv0;->g:F

    iput-boolean v3, p2, Lcom/daaw/wv0;->i:Z

    iput-boolean v3, p2, Lcom/daaw/wv0;->h:Z

    const/4 p1, 0x0

    iput-object p1, p2, Lcom/daaw/wv0;->j:Lcom/daaw/z6;

    invoke-virtual {p2, v4}, Lcom/daaw/wv0;->j(Z)V

    return v4
.end method

.method public h()Lcom/daaw/zd0;
    .locals 1

    new-instance v0, Lcom/daaw/wv0;

    invoke-direct {v0}, Lcom/daaw/wv0;-><init>()V

    return-object v0
.end method

.method public o(Lcom/daaw/un;)V
    .locals 7

    invoke-super {p0, p1}, Lcom/daaw/a;->o(Lcom/daaw/un;)V

    iget-object v0, p0, Lcom/daaw/hb;->l:[F

    const-string v1, "ColorFrom"

    const-string v6, "appearance"

    invoke-virtual {p1, v1, v0, v6}, Lcom/daaw/un;->I(Ljava/lang/String;[FLjava/lang/String;)V

    iget-object v0, p0, Lcom/daaw/hb;->m:[F

    const-string v1, "ColorTo"

    invoke-virtual {p1, v1, v0, v6}, Lcom/daaw/un;->I(Ljava/lang/String;[FLjava/lang/String;)V

    iget v2, p0, Lcom/daaw/hb;->h:F

    const-string v1, "lifetime"

    const-string v3, "behaviour"

    const v4, 0x3dcccccd    # 0.1f

    const/high16 v5, 0x41200000    # 10.0f

    move-object v0, p1

    invoke-virtual/range {v0 .. v5}, Lcom/daaw/un;->O(Ljava/lang/String;FLjava/lang/String;FF)V

    iget v2, p0, Lcom/daaw/hb;->i:F

    const-string v1, "fadeInAndOutTime"

    const-string v3, "appearance"

    const/4 v4, 0x0

    const/high16 v5, 0x3f000000    # 0.5f

    invoke-virtual/range {v0 .. v5}, Lcom/daaw/un;->O(Ljava/lang/String;FLjava/lang/String;FF)V

    iget-object v2, p0, Lcom/daaw/hb;->j:Lcom/daaw/bs1;

    const-string v1, "gravity"

    const-string v3, "behaviour"

    const/high16 v4, -0x3c6a0000    # -300.0f

    const/high16 v5, 0x43960000    # 300.0f

    invoke-virtual/range {v0 .. v5}, Lcom/daaw/un;->k0(Ljava/lang/String;Lcom/daaw/bs1;Ljava/lang/String;FF)V

    iget-boolean v0, p0, Lcom/daaw/hb;->k:Z

    const-string v1, "velocityAngle"

    invoke-virtual {p1, v1, v0, v6}, Lcom/daaw/un;->L(Ljava/lang/String;ZLjava/lang/String;)V

    iget v2, p0, Lcom/daaw/hb;->r:F

    const-string v1, "sizeAspectRatio"

    const-string v3, "appearance"

    const v4, 0x3dcccccd    # 0.1f

    const/high16 v5, 0x41200000    # 10.0f

    move-object v0, p1

    invoke-virtual/range {v0 .. v5}, Lcom/daaw/un;->O(Ljava/lang/String;FLjava/lang/String;FF)V

    iget v2, p0, Lcom/daaw/hb;->s:F

    const-string v1, "startSize"

    const-string v3, "appearance"

    const/4 v4, 0x0

    const/high16 v5, 0x41a00000    # 20.0f

    invoke-virtual/range {v0 .. v5}, Lcom/daaw/un;->O(Ljava/lang/String;FLjava/lang/String;FF)V

    iget v2, p0, Lcom/daaw/hb;->t:F

    const-string v1, "fadeInSize"

    const-string v3, "appearance"

    invoke-virtual/range {v0 .. v5}, Lcom/daaw/un;->O(Ljava/lang/String;FLjava/lang/String;FF)V

    iget v2, p0, Lcom/daaw/hb;->u:F

    const-string v1, "endSize"

    const-string v3, "appearance"

    invoke-virtual/range {v0 .. v5}, Lcom/daaw/un;->O(Ljava/lang/String;FLjava/lang/String;FF)V

    iget v2, p0, Lcom/daaw/hb;->v:F

    const-string v1, "endSizeRandom"

    const-string v3, "appearance"

    invoke-virtual/range {v0 .. v5}, Lcom/daaw/un;->O(Ljava/lang/String;FLjava/lang/String;FF)V

    iget v2, p0, Lcom/daaw/hb;->w:F

    const-string v1, "endSizeZFactor"

    const-string v3, "appearance"

    const/high16 v5, 0x42200000    # 40.0f

    invoke-virtual/range {v0 .. v5}, Lcom/daaw/un;->O(Ljava/lang/String;FLjava/lang/String;FF)V

    iget v2, p0, Lcom/daaw/hb;->n:F

    const-string v1, "sideSineWaveFreq"

    const-string v3, "waveBehaviour"

    const/high16 v5, 0x41200000    # 10.0f

    invoke-virtual/range {v0 .. v5}, Lcom/daaw/un;->O(Ljava/lang/String;FLjava/lang/String;FF)V

    iget v2, p0, Lcom/daaw/hb;->o:F

    const-string v1, "sideSineWaveFreqRandom"

    const-string v3, "waveBehaviour"

    const/high16 v4, -0x3ee00000    # -10.0f

    invoke-virtual/range {v0 .. v5}, Lcom/daaw/un;->O(Ljava/lang/String;FLjava/lang/String;FF)V

    iget v2, p0, Lcom/daaw/hb;->p:F

    const-string v1, "sideSineWaveMag"

    const-string v3, "waveBehaviour"

    const/4 v4, 0x0

    invoke-virtual/range {v0 .. v5}, Lcom/daaw/un;->O(Ljava/lang/String;FLjava/lang/String;FF)V

    iget v2, p0, Lcom/daaw/hb;->q:F

    const-string v1, "sideSineWaveMagRandom"

    const-string v3, "waveBehaviour"

    const/high16 v4, -0x3ee00000    # -10.0f

    invoke-virtual/range {v0 .. v5}, Lcom/daaw/un;->O(Ljava/lang/String;FLjava/lang/String;FF)V

    return-void
.end method

.method public r(I)V
    .locals 1

    iget-object v0, p0, Lcom/daaw/hb;->l:[F

    invoke-static {v0, p1}, Lcom/daaw/f80;->p([FI)V

    return-void
.end method

.method public s(I)V
    .locals 1

    iget-object v0, p0, Lcom/daaw/hb;->m:[F

    invoke-static {v0, p1}, Lcom/daaw/f80;->p([FI)V

    return-void
.end method

.method public t(F)V
    .locals 0

    iput p1, p0, Lcom/daaw/hb;->u:F

    return-void
.end method

.method public u(F)V
    .locals 0

    iput p1, p0, Lcom/daaw/hb;->v:F

    return-void
.end method

.method public v(F)V
    .locals 2

    const/4 v0, 0x0

    invoke-static {v0, p1}, Ljava/lang/Math;->max(FF)F

    move-result p1

    const/high16 v0, 0x3f000000    # 0.5f

    invoke-static {p1, v0}, Ljava/lang/Math;->min(FF)F

    move-result p1

    iput p1, p0, Lcom/daaw/hb;->i:F

    iput p1, p0, Lcom/daaw/hb;->z:F

    const/high16 v0, 0x3f800000    # 1.0f

    sub-float v1, v0, p1

    iput v1, p0, Lcom/daaw/hb;->A:F

    sub-float p1, v0, p1

    iput p1, p0, Lcom/daaw/hb;->B:F

    sub-float/2addr v0, v1

    iput v0, p0, Lcom/daaw/hb;->C:F

    return-void
.end method

.method public w(F)V
    .locals 0

    iput p1, p0, Lcom/daaw/hb;->t:F

    return-void
.end method

.method public x(F)V
    .locals 0

    iput p1, p0, Lcom/daaw/hb;->h:F

    return-void
.end method

.method public y(F)V
    .locals 0

    iput p1, p0, Lcom/daaw/hb;->n:F

    return-void
.end method

.method public z(F)V
    .locals 0

    iput p1, p0, Lcom/daaw/hb;->p:F

    return-void
.end method
