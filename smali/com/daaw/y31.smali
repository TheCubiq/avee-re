.class public Lcom/daaw/y31;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Lcom/daaw/de0;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/daaw/y31$c;
    }
.end annotation


# instance fields
.field public final A:Lcom/daaw/pr1;

.field public final B:Lcom/daaw/pr1;

.field public final C:Lcom/daaw/pr1;

.field public final D:Lcom/daaw/pr1;

.field public final E:Lcom/daaw/pr1;

.field public final a:F

.field public final b:[F

.field public final c:[F

.field public final d:[F

.field public e:F

.field public f:F

.field public g:I

.field public h:J

.field public i:J

.field public j:J

.field public k:F

.field public l:I

.field public m:I

.field public n:I

.field public o:I

.field public p:I

.field public q:I

.field public r:I

.field public s:Lcom/daaw/g40;

.field public t:Lcom/daaw/e40;

.field public final u:Lcom/daaw/y31$c;

.field public v:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Lcom/daaw/or1;",
            ">;"
        }
    .end annotation
.end field

.field public w:Z

.field public x:Z

.field public y:I

.field public z:I


# direct methods
.method public constructor <init>(Lcom/daaw/sg0;)V
    .locals 6

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const/high16 v0, -0x3ee00000    # -10.0f

    iput v0, p0, Lcom/daaw/y31;->a:F

    const/16 v1, 0x10

    new-array v2, v1, [F

    iput-object v2, p0, Lcom/daaw/y31;->b:[F

    new-array v2, v1, [F

    iput-object v2, p0, Lcom/daaw/y31;->c:[F

    new-array v1, v1, [F

    iput-object v1, p0, Lcom/daaw/y31;->d:[F

    const/4 v2, 0x0

    iput v2, p0, Lcom/daaw/y31;->e:F

    iput v2, p0, Lcom/daaw/y31;->f:F

    const/4 v3, 0x0

    iput v3, p0, Lcom/daaw/y31;->g:I

    const-wide/16 v4, 0x0

    iput-wide v4, p0, Lcom/daaw/y31;->h:J

    iput-wide v4, p0, Lcom/daaw/y31;->i:J

    iput-wide v4, p0, Lcom/daaw/y31;->j:J

    iput v2, p0, Lcom/daaw/y31;->k:F

    const/4 v4, 0x2

    iput v4, p0, Lcom/daaw/y31;->l:I

    iput v4, p0, Lcom/daaw/y31;->m:I

    iput v4, p0, Lcom/daaw/y31;->n:I

    iput v4, p0, Lcom/daaw/y31;->o:I

    iput v3, p0, Lcom/daaw/y31;->p:I

    iput v3, p0, Lcom/daaw/y31;->q:I

    const/4 v4, -0x1

    iput v4, p0, Lcom/daaw/y31;->r:I

    new-instance v4, Lcom/daaw/g40;

    invoke-direct {v4}, Lcom/daaw/g40;-><init>()V

    iput-object v4, p0, Lcom/daaw/y31;->s:Lcom/daaw/g40;

    const/4 v4, 0x0

    iput-object v4, p0, Lcom/daaw/y31;->t:Lcom/daaw/e40;

    new-instance v4, Ljava/util/ArrayList;

    invoke-direct {v4}, Ljava/util/ArrayList;-><init>()V

    iput-object v4, p0, Lcom/daaw/y31;->v:Ljava/util/List;

    iput-boolean v3, p0, Lcom/daaw/y31;->w:Z

    const/4 v4, 0x1

    iput-boolean v4, p0, Lcom/daaw/y31;->x:Z

    iput v3, p0, Lcom/daaw/y31;->y:I

    iput v3, p0, Lcom/daaw/y31;->z:I

    new-instance v4, Lcom/daaw/pr1;

    invoke-direct {v4}, Lcom/daaw/pr1;-><init>()V

    iput-object v4, p0, Lcom/daaw/y31;->A:Lcom/daaw/pr1;

    new-instance v4, Lcom/daaw/pr1;

    invoke-direct {v4}, Lcom/daaw/pr1;-><init>()V

    iput-object v4, p0, Lcom/daaw/y31;->B:Lcom/daaw/pr1;

    new-instance v4, Lcom/daaw/pr1;

    invoke-direct {v4}, Lcom/daaw/pr1;-><init>()V

    iput-object v4, p0, Lcom/daaw/y31;->C:Lcom/daaw/pr1;

    new-instance v4, Lcom/daaw/pr1;

    invoke-direct {v4}, Lcom/daaw/pr1;-><init>()V

    iput-object v4, p0, Lcom/daaw/y31;->D:Lcom/daaw/pr1;

    new-instance v4, Lcom/daaw/pr1;

    invoke-direct {v4}, Lcom/daaw/pr1;-><init>()V

    iput-object v4, p0, Lcom/daaw/y31;->E:Lcom/daaw/pr1;

    new-instance v4, Lcom/daaw/y31$c;

    invoke-direct {v4, p0, p1}, Lcom/daaw/y31$c;-><init>(Lcom/daaw/y31;Lcom/daaw/sg0;)V

    iput-object v4, p0, Lcom/daaw/y31;->u:Lcom/daaw/y31$c;

    invoke-static {v1, v3}, Landroid/opengl/Matrix;->setIdentityM([FI)V

    invoke-static {v1, v3, v2, v2, v0}, Landroid/opengl/Matrix;->translateM([FIFFF)V

    return-void
.end method


# virtual methods
.method public A()Lcom/daaw/tc;
    .locals 1

    iget-object v0, p0, Lcom/daaw/y31;->u:Lcom/daaw/y31$c;

    invoke-virtual {v0}, Lcom/daaw/y31$c;->o()Lcom/daaw/tc;

    move-result-object v0

    return-object v0
.end method

.method public B(I)Lcom/daaw/or1;
    .locals 1

    iget-object v0, p0, Lcom/daaw/y31;->v:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v0

    if-ge p1, v0, :cond_0

    iget-object v0, p0, Lcom/daaw/y31;->v:Ljava/util/List;

    invoke-interface {v0, p1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lcom/daaw/or1;

    return-object p1

    :cond_0
    const/4 p1, 0x0

    return-object p1
.end method

.method public C()Lcom/daaw/g40;
    .locals 1

    iget-object v0, p0, Lcom/daaw/y31;->s:Lcom/daaw/g40;

    return-object v0
.end method

.method public D()I
    .locals 1

    iget v0, p0, Lcom/daaw/y31;->g:I

    return v0
.end method

.method public E()F
    .locals 1

    iget v0, p0, Lcom/daaw/y31;->f:F

    return v0
.end method

.method public F()I
    .locals 2

    iget v0, p0, Lcom/daaw/y31;->q:I

    const/4 v1, 0x2

    if-ge v0, v1, :cond_0

    iget v0, p0, Lcom/daaw/y31;->m:I

    :cond_0
    return v0
.end method

.method public G()I
    .locals 2

    iget v0, p0, Lcom/daaw/y31;->p:I

    const/4 v1, 0x2

    if-ge v0, v1, :cond_0

    iget v0, p0, Lcom/daaw/y31;->l:I

    :cond_0
    return v0
.end method

.method public H()Z
    .locals 1

    const/4 v0, 0x1

    return v0
.end method

.method public I()Lcom/daaw/cs1;
    .locals 4

    const/4 v0, 0x1

    new-array v0, v0, [I

    const v1, 0x84e8

    const/4 v2, 0x0

    invoke-static {v1, v0, v2}, Landroid/opengl/GLES20;->glGetIntegerv(I[II)V

    aget v0, v0, v2

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "OGL Max render buffer size: "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-static {v1}, Lcom/daaw/lz1;->a(Ljava/lang/String;)V

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "fullscreen size: "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p0}, Lcom/daaw/y31;->G()I

    move-result v2

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v2, "; "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p0}, Lcom/daaw/y31;->F()I

    move-result v2

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-static {v1}, Lcom/daaw/lz1;->a(Ljava/lang/String;)V

    invoke-virtual {p0}, Lcom/daaw/y31;->G()I

    move-result v1

    invoke-virtual {p0}, Lcom/daaw/y31;->F()I

    move-result v2

    new-instance v3, Lcom/daaw/cs1;

    invoke-static {v1, v0}, Ljava/lang/Math;->min(II)I

    move-result v1

    invoke-static {v2, v0}, Ljava/lang/Math;->min(II)I

    move-result v0

    invoke-direct {v3, v1, v0}, Lcom/daaw/cs1;-><init>(II)V

    return-object v3
.end method

.method public J()I
    .locals 1

    iget v0, p0, Lcom/daaw/y31;->z:I

    return v0
.end method

.method public K()[F
    .locals 1

    iget-object v0, p0, Lcom/daaw/y31;->b:[F

    return-object v0
.end method

.method public L(Lcom/daaw/bs1;F)Z
    .locals 0

    const/4 p1, 0x1

    return p1
.end method

.method public M()V
    .locals 1

    iget-object v0, p0, Lcom/daaw/y31;->u:Lcom/daaw/y31$c;

    invoke-static {v0}, Lcom/daaw/y31$c;->h(Lcom/daaw/y31$c;)Lcom/daaw/tc;

    move-result-object v0

    invoke-virtual {v0, p0}, Lcom/daaw/tc;->r(Lcom/daaw/y31;)V

    const/4 v0, 0x0

    iput v0, p0, Lcom/daaw/y31;->z:I

    return-void
.end method

.method public N(III)V
    .locals 11

    iget-object v0, p0, Lcom/daaw/y31;->s:Lcom/daaw/g40;

    iget v1, v0, Lcom/daaw/g40;->e:I

    iput v1, v0, Lcom/daaw/g40;->d:I

    const/4 v1, 0x0

    iput v1, v0, Lcom/daaw/g40;->e:I

    iget v2, v0, Lcom/daaw/g40;->g:I

    iput v2, v0, Lcom/daaw/g40;->f:I

    iput v1, v0, Lcom/daaw/g40;->g:I

    iget v2, v0, Lcom/daaw/g40;->i:I

    iput v2, v0, Lcom/daaw/g40;->h:I

    iput v1, v0, Lcom/daaw/g40;->i:I

    iget v2, v0, Lcom/daaw/g40;->j:I

    iput v2, v0, Lcom/daaw/g40;->k:I

    iput v1, v0, Lcom/daaw/g40;->j:I

    iput p2, p0, Lcom/daaw/y31;->p:I

    iput p3, p0, Lcom/daaw/y31;->q:I

    const p2, 0x3a83126f    # 0.001f

    const/high16 p3, 0x3f800000    # 1.0f

    const/4 v2, 0x1

    if-lez p1, :cond_0

    iput p1, p0, Lcom/daaw/y31;->g:I

    const-wide/16 v3, 0x0

    iput-wide v3, p0, Lcom/daaw/y31;->i:J

    int-to-float p1, p1

    mul-float p1, p1, p2

    iput p1, p0, Lcom/daaw/y31;->e:F

    iput p1, p0, Lcom/daaw/y31;->f:F

    div-float p1, p3, p1

    float-to-int p1, p1

    iput p1, v0, Lcom/daaw/g40;->b:I

    goto :goto_0

    :cond_0
    invoke-static {}, Landroid/os/SystemClock;->uptimeMillis()J

    move-result-wide v3

    iget-wide v5, p0, Lcom/daaw/y31;->i:J

    sub-long v5, v3, v5

    long-to-int p1, v5

    iput p1, p0, Lcom/daaw/y31;->g:I

    iget-object v0, p0, Lcom/daaw/y31;->s:Lcom/daaw/g40;

    iget v5, v0, Lcom/daaw/g40;->c:I

    add-int/2addr v5, v2

    iput v5, v0, Lcom/daaw/g40;->c:I

    iget-wide v6, p0, Lcom/daaw/y31;->h:J

    sub-long v6, v3, v6

    const-wide/16 v8, 0x3e8

    cmp-long v10, v6, v8

    if-ltz v10, :cond_1

    iput v5, v0, Lcom/daaw/g40;->b:I

    iput v1, v0, Lcom/daaw/g40;->c:I

    iput-wide v3, p0, Lcom/daaw/y31;->h:J

    :cond_1
    iput-wide v3, p0, Lcom/daaw/y31;->i:J

    if-gez p1, :cond_2

    iput v1, p0, Lcom/daaw/y31;->g:I

    :cond_2
    iget p1, p0, Lcom/daaw/y31;->g:I

    const/16 v0, 0xc8

    if-le p1, v0, :cond_3

    iput v0, p0, Lcom/daaw/y31;->g:I

    :cond_3
    iget p1, p0, Lcom/daaw/y31;->g:I

    int-to-float p1, p1

    mul-float p1, p1, p2

    iput p1, p0, Lcom/daaw/y31;->e:F

    iget v0, p0, Lcom/daaw/y31;->f:F

    const/high16 v3, 0x3f000000    # 0.5f

    mul-float v0, v0, v3

    mul-float p1, p1, v3

    add-float/2addr v0, p1

    iput v0, p0, Lcom/daaw/y31;->f:F

    :goto_0
    iget-wide v3, p0, Lcom/daaw/y31;->j:J

    iget p1, p0, Lcom/daaw/y31;->g:I

    int-to-long v5, p1

    add-long/2addr v3, v5

    iput-wide v3, p0, Lcom/daaw/y31;->j:J

    long-to-float p1, v3

    mul-float p1, p1, p2

    iput p1, p0, Lcom/daaw/y31;->k:F

    iget-object p1, p0, Lcom/daaw/y31;->s:Lcom/daaw/g40;

    iput v1, p1, Lcom/daaw/g40;->a:I

    iget-object p1, p0, Lcom/daaw/y31;->u:Lcom/daaw/y31$c;

    iget-object p1, p1, Lcom/daaw/y31$c;->a:Lcom/daaw/sg0;

    invoke-interface {p1}, Lcom/daaw/sg0;->l()I

    move-result p1

    if-lez p1, :cond_4

    const/4 p1, 0x1

    goto :goto_1

    :cond_4
    const/4 p1, 0x0

    :goto_1
    iput-boolean p1, p0, Lcom/daaw/y31;->w:Z

    iget-object p1, p0, Lcom/daaw/y31;->u:Lcom/daaw/y31$c;

    iget-object p1, p1, Lcom/daaw/y31$c;->a:Lcom/daaw/sg0;

    invoke-interface {p1}, Lcom/daaw/sg0;->g()I

    move-result p1

    and-int/2addr p1, v2

    if-eqz p1, :cond_5

    const/4 p1, 0x1

    goto :goto_2

    :cond_5
    const/4 p1, 0x0

    :goto_2
    iput-boolean p1, p0, Lcom/daaw/y31;->x:Z

    invoke-virtual {p0}, Lcom/daaw/y31;->q()V

    const/4 p1, 0x0

    invoke-virtual {p0, p1, v2}, Lcom/daaw/y31;->o(Lcom/daaw/e40;Z)V

    iget-object p1, p0, Lcom/daaw/y31;->u:Lcom/daaw/y31$c;

    invoke-virtual {p1}, Lcom/daaw/y31$c;->r()Lcom/daaw/qr1;

    move-result-object p1

    new-instance p2, Lcom/daaw/y31$a;

    invoke-direct {p2, p0}, Lcom/daaw/y31$a;-><init>(Lcom/daaw/y31;)V

    invoke-virtual {p1, v2, p2}, Lcom/daaw/qr1;->c(ZLcom/daaw/f0;)V

    iget-object p1, p0, Lcom/daaw/y31;->u:Lcom/daaw/y31$c;

    invoke-virtual {p1}, Lcom/daaw/y31$c;->t()Lcom/daaw/qr1;

    move-result-object p1

    new-instance p2, Lcom/daaw/y31$b;

    invoke-direct {p2, p0}, Lcom/daaw/y31$b;-><init>(Lcom/daaw/y31;)V

    invoke-virtual {p1, v2, p2}, Lcom/daaw/qr1;->c(ZLcom/daaw/f0;)V

    iget-object p1, p0, Lcom/daaw/y31;->u:Lcom/daaw/y31$c;

    invoke-virtual {p1}, Lcom/daaw/y31$c;->j()Lcom/daaw/sr1;

    move-result-object p1

    invoke-virtual {p0, p1}, Lcom/daaw/y31;->p(Lcom/daaw/dc1;)V

    iget-object p1, p0, Lcom/daaw/y31;->u:Lcom/daaw/y31$c;

    invoke-virtual {p1}, Lcom/daaw/y31$c;->j()Lcom/daaw/sr1;

    move-result-object p1

    invoke-virtual {p0}, Lcom/daaw/y31;->K()[F

    move-result-object p2

    const-string v0, "u_projView"

    invoke-virtual {p1, v0, v1, p2}, Lcom/daaw/sr1;->E(Ljava/lang/String;Z[F)V

    iget-object p1, p0, Lcom/daaw/y31;->u:Lcom/daaw/y31$c;

    invoke-virtual {p1}, Lcom/daaw/y31$c;->j()Lcom/daaw/sr1;

    move-result-object p1

    const-string p2, "u_texture"

    invoke-virtual {p1, p2, v1}, Lcom/daaw/dc1;->x(Ljava/lang/String;I)V

    iget-object p1, p0, Lcom/daaw/y31;->u:Lcom/daaw/y31$c;

    invoke-virtual {p1}, Lcom/daaw/y31$c;->j()Lcom/daaw/sr1;

    move-result-object p1

    const-string p2, "u_texture2"

    invoke-virtual {p1, p2, v2}, Lcom/daaw/dc1;->x(Ljava/lang/String;I)V

    iget-object p1, p0, Lcom/daaw/y31;->u:Lcom/daaw/y31$c;

    invoke-virtual {p1}, Lcom/daaw/y31$c;->j()Lcom/daaw/sr1;

    move-result-object p1

    const-string p2, "maskadd"

    const/4 v0, 0x0

    invoke-virtual {p1, p2, v0}, Lcom/daaw/dc1;->s(Ljava/lang/String;F)V

    iget-object p1, p0, Lcom/daaw/y31;->u:Lcom/daaw/y31$c;

    invoke-virtual {p1}, Lcom/daaw/y31$c;->j()Lcom/daaw/sr1;

    move-result-object p1

    const-string p2, "maskmul"

    invoke-virtual {p1, p2, p3}, Lcom/daaw/dc1;->s(Ljava/lang/String;F)V

    iget-object p1, p0, Lcom/daaw/y31;->u:Lcom/daaw/y31$c;

    invoke-virtual {p1}, Lcom/daaw/y31$c;->j()Lcom/daaw/sr1;

    move-result-object p1

    const-string p2, "mask_l_add"

    invoke-virtual {p1, p2, p3}, Lcom/daaw/dc1;->s(Ljava/lang/String;F)V

    iget-object p1, p0, Lcom/daaw/y31;->u:Lcom/daaw/y31$c;

    invoke-virtual {p1}, Lcom/daaw/y31$c;->j()Lcom/daaw/sr1;

    move-result-object p1

    const-string p2, "mask_l_mul"

    invoke-virtual {p1, p2, v0}, Lcom/daaw/dc1;->s(Ljava/lang/String;F)V

    iget-object p1, p0, Lcom/daaw/y31;->u:Lcom/daaw/y31$c;

    invoke-virtual {p1}, Lcom/daaw/y31$c;->j()Lcom/daaw/sr1;

    move-result-object p1

    const-string p2, "tex2_y_add"

    invoke-virtual {p1, p2, v0}, Lcom/daaw/dc1;->s(Ljava/lang/String;F)V

    iget-object p1, p0, Lcom/daaw/y31;->u:Lcom/daaw/y31$c;

    invoke-virtual {p1}, Lcom/daaw/y31$c;->j()Lcom/daaw/sr1;

    move-result-object p1

    const-string p2, "tex2_y_mul"

    invoke-virtual {p1, p2, p3}, Lcom/daaw/dc1;->s(Ljava/lang/String;F)V

    iget-object p1, p0, Lcom/daaw/y31;->u:Lcom/daaw/y31$c;

    invoke-virtual {p1}, Lcom/daaw/y31$c;->j()Lcom/daaw/sr1;

    move-result-object v0

    const/4 v2, 0x0

    const/4 v3, 0x0

    const/4 v4, 0x0

    const/high16 v5, 0x3f800000    # 1.0f

    const-string v1, "Color2"

    invoke-virtual/range {v0 .. v5}, Lcom/daaw/dc1;->v(Ljava/lang/String;FFFF)V

    iget-object p1, p0, Lcom/daaw/y31;->u:Lcom/daaw/y31$c;

    invoke-virtual {p1}, Lcom/daaw/y31$c;->j()Lcom/daaw/sr1;

    move-result-object p1

    const-string p2, "saturation"

    invoke-virtual {p1, p2, p3}, Lcom/daaw/dc1;->s(Ljava/lang/String;F)V

    iget-object p1, p0, Lcom/daaw/y31;->u:Lcom/daaw/y31$c;

    invoke-static {p1}, Lcom/daaw/y31$c;->g(Lcom/daaw/y31$c;)Lcom/daaw/ok0;

    move-result-object p1

    if-eqz p1, :cond_6

    iget-object p1, p0, Lcom/daaw/y31;->u:Lcom/daaw/y31$c;

    invoke-static {p1}, Lcom/daaw/y31$c;->g(Lcom/daaw/y31$c;)Lcom/daaw/ok0;

    move-result-object p1

    iget p2, p0, Lcom/daaw/y31;->e:F

    invoke-virtual {p1, p2}, Lcom/daaw/ok0;->j(F)V

    :cond_6
    iget-object p1, p0, Lcom/daaw/y31;->u:Lcom/daaw/y31$c;

    invoke-static {p1}, Lcom/daaw/y31$c;->h(Lcom/daaw/y31$c;)Lcom/daaw/tc;

    move-result-object p1

    invoke-virtual {p1, p0}, Lcom/daaw/tc;->s(Lcom/daaw/y31;)V

    iget-object p1, p0, Lcom/daaw/y31;->u:Lcom/daaw/y31$c;

    invoke-virtual {p1}, Lcom/daaw/y31$c;->a()Lcom/daaw/aq0;

    move-result-object p1

    invoke-virtual {p1}, Lcom/daaw/aq0;->o()V

    return-void
.end method

.method public O(Lcom/daaw/vk1;)V
    .locals 3

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, ""

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Lcom/daaw/y31;->s:Lcom/daaw/g40;

    iget v1, v1, Lcom/daaw/g40;->a:I

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v1, " / "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v2, p0, Lcom/daaw/y31;->s:Lcom/daaw/g40;

    iget v2, v2, Lcom/daaw/g40;->f:I

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Lcom/daaw/y31;->s:Lcom/daaw/g40;

    iget v1, v1, Lcom/daaw/g40;->h:I

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    iget-object v1, p0, Lcom/daaw/y31;->u:Lcom/daaw/y31$c;

    iget-object v1, v1, Lcom/daaw/y31$c;->a:Lcom/daaw/sg0;

    iget-object v2, p0, Lcom/daaw/y31;->s:Lcom/daaw/g40;

    invoke-virtual {v2}, Lcom/daaw/g40;->b()I

    move-result v2

    if-lez v2, :cond_0

    const/4 v2, 0x1

    goto :goto_0

    :cond_0
    const/4 v2, 0x0

    :goto_0
    invoke-interface {v1, p1, v2, v0}, Lcom/daaw/sg0;->h(Lcom/daaw/vk1;ZLjava/lang/String;)V

    return-void
.end method

.method public P(Landroid/content/res/Resources;)V
    .locals 1

    iget-object v0, p0, Lcom/daaw/y31;->u:Lcom/daaw/y31$c;

    invoke-virtual {v0, p1}, Lcom/daaw/y31$c;->A(Landroid/content/res/Resources;)V

    return-void
.end method

.method public Q(Landroid/content/Context;II)Z
    .locals 0

    iget p1, p0, Lcom/daaw/y31;->n:I

    if-ne p1, p2, :cond_0

    iget p1, p0, Lcom/daaw/y31;->o:I

    if-ne p1, p3, :cond_0

    const/4 p1, 0x0

    return p1

    :cond_0
    iput p2, p0, Lcom/daaw/y31;->n:I

    iput p3, p0, Lcom/daaw/y31;->o:I

    iput p2, p0, Lcom/daaw/y31;->l:I

    iput p3, p0, Lcom/daaw/y31;->m:I

    const/4 p1, 0x1

    return p1
.end method

.method public R()V
    .locals 1

    invoke-virtual {p0}, Lcom/daaw/y31;->W()V

    const/16 v0, 0xbe2

    invoke-static {v0}, Landroid/opengl/GLES20;->glEnable(I)V

    iget-object v0, p0, Lcom/daaw/y31;->u:Lcom/daaw/y31$c;

    invoke-virtual {v0}, Lcom/daaw/y31$c;->B()V

    return-void
.end method

.method public S(ILcom/daaw/or1;)V
    .locals 2

    :goto_0
    iget-object v0, p0, Lcom/daaw/y31;->v:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v0

    if-lt p1, v0, :cond_0

    iget-object v0, p0, Lcom/daaw/y31;->v:Ljava/util/List;

    const/4 v1, 0x0

    invoke-interface {v0, v1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    goto :goto_0

    :cond_0
    iget-object v0, p0, Lcom/daaw/y31;->v:Ljava/util/List;

    invoke-interface {v0, p1, p2}, Ljava/util/List;->set(ILjava/lang/Object;)Ljava/lang/Object;

    return-void
.end method

.method public T(I)V
    .locals 4

    const/16 v0, 0x2803

    const/16 v1, 0x2802

    const/16 v2, 0xde1

    const/4 v3, 0x2

    if-ne p1, v3, :cond_0

    const p1, 0x812f

    :goto_0
    invoke-static {v2, v1, p1}, Landroid/opengl/GLES20;->glTexParameteri(III)V

    invoke-static {v2, v0, p1}, Landroid/opengl/GLES20;->glTexParameteri(III)V

    goto :goto_1

    :cond_0
    const/4 v3, 0x1

    if-ne p1, v3, :cond_1

    const p1, 0x8370

    goto :goto_0

    :cond_1
    :goto_1
    return-void
.end method

.method public U(I)V
    .locals 0

    iput p1, p0, Lcom/daaw/y31;->z:I

    return-void
.end method

.method public V()V
    .locals 0

    return-void
.end method

.method public W()V
    .locals 1

    const/4 v0, -0x1

    iput v0, p0, Lcom/daaw/y31;->r:I

    return-void
.end method

.method public a()I
    .locals 2

    iget v0, p0, Lcom/daaw/y31;->q:I

    const/4 v1, 0x2

    if-ge v0, v1, :cond_0

    iget v0, p0, Lcom/daaw/y31;->m:I

    :cond_0
    return v0
.end method

.method public b()Lcom/daaw/de0$a;
    .locals 1

    iget-object v0, p0, Lcom/daaw/y31;->u:Lcom/daaw/y31$c;

    return-object v0
.end method

.method public c()Z
    .locals 1

    iget-boolean v0, p0, Lcom/daaw/y31;->x:Z

    return v0
.end method

.method public d()F
    .locals 1

    iget v0, p0, Lcom/daaw/y31;->e:F

    return v0
.end method

.method public e(I)V
    .locals 4

    iget v0, p0, Lcom/daaw/y31;->r:I

    if-ne v0, p1, :cond_0

    return-void

    :cond_0
    iget-object v0, p0, Lcom/daaw/y31;->u:Lcom/daaw/y31$c;

    invoke-static {v0}, Lcom/daaw/y31$c;->h(Lcom/daaw/y31$c;)Lcom/daaw/tc;

    move-result-object v0

    invoke-virtual {v0, p0}, Lcom/daaw/tc;->r(Lcom/daaw/y31;)V

    const/16 v0, 0x303

    const/16 v1, 0x302

    if-eqz p1, :cond_6

    const/4 v2, 0x1

    if-eq p1, v2, :cond_4

    const/4 v3, 0x2

    if-eq p1, v3, :cond_3

    const/4 v3, 0x3

    if-eq p1, v3, :cond_2

    const/4 v3, 0x4

    if-eq p1, v3, :cond_5

    const/4 v0, 0x5

    if-eq p1, v0, :cond_1

    goto :goto_1

    :cond_1
    invoke-static {v1, v2}, Landroid/opengl/GLES20;->glBlendFunc(II)V

    goto :goto_1

    :cond_2
    const/4 v0, 0x0

    goto :goto_0

    :cond_3
    invoke-static {v2, v2}, Landroid/opengl/GLES20;->glBlendFunc(II)V

    goto :goto_1

    :cond_4
    const/16 v0, 0x301

    :cond_5
    :goto_0
    invoke-static {v2, v0}, Landroid/opengl/GLES20;->glBlendFunc(II)V

    goto :goto_1

    :cond_6
    invoke-static {v1, v0}, Landroid/opengl/GLES20;->glBlendFunc(II)V

    :goto_1
    iput p1, p0, Lcom/daaw/y31;->r:I

    return-void
.end method

.method public f()I
    .locals 2

    iget v0, p0, Lcom/daaw/y31;->p:I

    const/4 v1, 0x2

    if-ge v0, v1, :cond_0

    iget v0, p0, Lcom/daaw/y31;->l:I

    :cond_0
    return v0
.end method

.method public g()F
    .locals 1

    iget v0, p0, Lcom/daaw/y31;->k:F

    return v0
.end method

.method public h()Z
    .locals 1

    iget-boolean v0, p0, Lcom/daaw/y31;->w:Z

    return v0
.end method

.method public i(Lcom/daaw/e40;)V
    .locals 1

    const/4 v0, 0x0

    invoke-virtual {p0, p1, v0}, Lcom/daaw/y31;->o(Lcom/daaw/e40;Z)V

    return-void
.end method

.method public bridge synthetic j()Lcom/daaw/sc0;
    .locals 1

    invoke-virtual {p0}, Lcom/daaw/y31;->A()Lcom/daaw/tc;

    move-result-object v0

    return-object v0
.end method

.method public k()V
    .locals 2

    iget-object v0, p0, Lcom/daaw/y31;->s:Lcom/daaw/g40;

    iget v1, v0, Lcom/daaw/g40;->e:I

    add-int/lit8 v1, v1, 0x1

    iput v1, v0, Lcom/daaw/g40;->e:I

    return-void
.end method

.method public l()V
    .locals 2

    iget-object v0, p0, Lcom/daaw/y31;->s:Lcom/daaw/g40;

    iget v1, v0, Lcom/daaw/g40;->i:I

    add-int/lit8 v1, v1, 0x1

    iput v1, v0, Lcom/daaw/g40;->i:I

    return-void
.end method

.method public m()V
    .locals 2

    iget-object v0, p0, Lcom/daaw/y31;->s:Lcom/daaw/g40;

    iget v1, v0, Lcom/daaw/g40;->j:I

    add-int/lit8 v1, v1, 0x1

    iput v1, v0, Lcom/daaw/g40;->j:I

    return-void
.end method

.method public n()V
    .locals 2

    iget-object v0, p0, Lcom/daaw/y31;->s:Lcom/daaw/g40;

    iget v1, v0, Lcom/daaw/g40;->g:I

    add-int/lit8 v1, v1, 0x1

    iput v1, v0, Lcom/daaw/g40;->g:I

    return-void
.end method

.method public o(Lcom/daaw/e40;Z)V
    .locals 18

    move-object/from16 v0, p0

    move-object/from16 v1, p1

    if-nez p2, :cond_0

    iget-object v2, v0, Lcom/daaw/y31;->t:Lcom/daaw/e40;

    if-ne v2, v1, :cond_0

    return-void

    :cond_0
    iput-object v1, v0, Lcom/daaw/y31;->t:Lcom/daaw/e40;

    invoke-virtual/range {p0 .. p0}, Lcom/daaw/y31;->m()V

    iget-object v2, v0, Lcom/daaw/y31;->u:Lcom/daaw/y31$c;

    invoke-static {v2}, Lcom/daaw/y31$c;->h(Lcom/daaw/y31$c;)Lcom/daaw/tc;

    move-result-object v2

    invoke-virtual {v2, v0}, Lcom/daaw/tc;->r(Lcom/daaw/y31;)V

    if-nez v1, :cond_1

    invoke-virtual/range {p0 .. p0}, Lcom/daaw/y31;->f()I

    move-result v1

    invoke-virtual/range {p0 .. p0}, Lcom/daaw/y31;->a()I

    move-result v2

    const/4 v3, 0x0

    invoke-static {v3, v3, v1, v2}, Landroid/opengl/GLES20;->glViewport(IIII)V

    const v1, 0x8d40

    invoke-static {v1, v3}, Landroid/opengl/GLES20;->glBindFramebuffer(II)V

    iget-object v4, v0, Lcom/daaw/y31;->c:[F

    const/4 v5, 0x0

    const/4 v6, 0x0

    invoke-virtual/range {p0 .. p0}, Lcom/daaw/y31;->f()I

    move-result v1

    int-to-float v7, v1

    invoke-virtual/range {p0 .. p0}, Lcom/daaw/y31;->a()I

    move-result v1

    int-to-float v8, v1

    const/4 v9, 0x0

    const v10, 0x3c23d70a    # 0.01f

    const/high16 v11, 0x42c80000    # 100.0f

    invoke-static/range {v4 .. v11}, Landroid/opengl/Matrix;->orthoM([FIFFFFFF)V

    iget-object v12, v0, Lcom/daaw/y31;->b:[F

    const/4 v13, 0x0

    iget-object v14, v0, Lcom/daaw/y31;->c:[F

    const/4 v15, 0x0

    iget-object v1, v0, Lcom/daaw/y31;->d:[F

    const/16 v17, 0x0

    move-object/from16 v16, v1

    invoke-static/range {v12 .. v17}, Landroid/opengl/Matrix;->multiplyMM([FI[FI[FI)V

    goto :goto_0

    :cond_1
    invoke-virtual/range {p1 .. p1}, Lcom/daaw/e40;->c()V

    iget-object v2, v0, Lcom/daaw/y31;->c:[F

    const/4 v3, 0x0

    const/4 v4, 0x0

    invoke-virtual/range {p1 .. p1}, Lcom/daaw/e40;->getWidth()I

    move-result v5

    int-to-float v5, v5

    invoke-virtual/range {p1 .. p1}, Lcom/daaw/e40;->getHeight()I

    move-result v1

    int-to-float v6, v1

    const/4 v7, 0x0

    const v8, 0x3c23d70a    # 0.01f

    const/high16 v9, 0x42c80000    # 100.0f

    invoke-static/range {v2 .. v9}, Landroid/opengl/Matrix;->orthoM([FIFFFFFF)V

    iget-object v10, v0, Lcom/daaw/y31;->b:[F

    const/4 v11, 0x0

    iget-object v12, v0, Lcom/daaw/y31;->c:[F

    const/4 v13, 0x0

    iget-object v14, v0, Lcom/daaw/y31;->d:[F

    const/4 v15, 0x0

    invoke-static/range {v10 .. v15}, Landroid/opengl/Matrix;->multiplyMM([FI[FI[FI)V

    :goto_0
    return-void
.end method

.method public p(Lcom/daaw/dc1;)V
    .locals 1

    iget-object v0, p0, Lcom/daaw/y31;->u:Lcom/daaw/y31$c;

    invoke-static {v0}, Lcom/daaw/y31$c;->h(Lcom/daaw/y31$c;)Lcom/daaw/tc;

    move-result-object v0

    invoke-virtual {v0, p0}, Lcom/daaw/tc;->r(Lcom/daaw/y31;)V

    if-eqz p1, :cond_0

    invoke-virtual {p1}, Lcom/daaw/dc1;->z()V

    :cond_0
    return-void
.end method

.method public q()V
    .locals 3

    const/4 v0, 0x0

    :goto_0
    iget-object v1, p0, Lcom/daaw/y31;->v:Ljava/util/List;

    invoke-interface {v1}, Ljava/util/List;->size()I

    move-result v1

    if-ge v0, v1, :cond_0

    iget-object v1, p0, Lcom/daaw/y31;->v:Ljava/util/List;

    const/4 v2, 0x0

    invoke-interface {v1, v0, v2}, Ljava/util/List;->set(ILjava/lang/Object;)Ljava/lang/Object;

    add-int/lit8 v0, v0, 0x1

    goto :goto_0

    :cond_0
    return-void
.end method

.method public r(Lcom/daaw/pr1;Lcom/daaw/pr1;)V
    .locals 6

    invoke-virtual {p1}, Lcom/daaw/pr1;->a()[F

    move-result-object v0

    iget-object v2, p0, Lcom/daaw/y31;->c:[F

    invoke-virtual {p2}, Lcom/daaw/pr1;->a()[F

    move-result-object v4

    const/4 v1, 0x0

    const/4 v3, 0x0

    const/4 v5, 0x0

    invoke-static/range {v0 .. v5}, Landroid/opengl/Matrix;->multiplyMM([FI[FI[FI)V

    return-void
.end method

.method public s(Lcom/daaw/pr1;Lcom/daaw/bs1;Lcom/daaw/e40;FFFFFF)V
    .locals 12

    move-object v0, p0

    move-object v1, p2

    if-nez p3, :cond_0

    invoke-virtual {p0}, Lcom/daaw/y31;->f()I

    move-result v2

    int-to-float v2, v2

    invoke-virtual {p0}, Lcom/daaw/y31;->a()I

    move-result v3

    goto :goto_0

    :cond_0
    invoke-virtual {p3}, Lcom/daaw/e40;->getWidth()I

    move-result v2

    int-to-float v2, v2

    invoke-virtual {p3}, Lcom/daaw/e40;->getHeight()I

    move-result v3

    :goto_0
    int-to-float v3, v3

    iput v2, v1, Lcom/daaw/bs1;->a:F

    iput v3, v1, Lcom/daaw/bs1;->b:F

    iget-object v1, v0, Lcom/daaw/y31;->D:Lcom/daaw/pr1;

    invoke-virtual {v1}, Lcom/daaw/pr1;->d()V

    iget-object v1, v0, Lcom/daaw/y31;->D:Lcom/daaw/pr1;

    mul-float v4, v2, p7

    mul-float v5, v3, p8

    move/from16 v6, p9

    invoke-virtual {v1, v4, v5, v6}, Lcom/daaw/pr1;->e(FFF)V

    div-float v9, v2, v3

    iget-object v1, v0, Lcom/daaw/y31;->E:Lcom/daaw/pr1;

    invoke-virtual {v1}, Lcom/daaw/pr1;->a()[F

    move-result-object v6

    const/4 v7, 0x0

    move/from16 v8, p4

    move/from16 v10, p5

    move/from16 v11, p6

    invoke-static/range {v6 .. v11}, Landroid/opengl/Matrix;->perspectiveM([FIFFFF)V

    invoke-virtual {p1}, Lcom/daaw/pr1;->a()[F

    move-result-object v1

    const/4 v2, 0x0

    iget-object v3, v0, Lcom/daaw/y31;->E:Lcom/daaw/pr1;

    invoke-virtual {v3}, Lcom/daaw/pr1;->a()[F

    move-result-object v3

    const/4 v4, 0x0

    iget-object v5, v0, Lcom/daaw/y31;->D:Lcom/daaw/pr1;

    invoke-virtual {v5}, Lcom/daaw/pr1;->a()[F

    move-result-object v5

    const/4 v6, 0x0

    move-object p1, v1

    move p2, v2

    move-object p3, v3

    move/from16 p4, v4

    move-object/from16 p5, v5

    move/from16 p6, v6

    invoke-static/range {p1 .. p6}, Landroid/opengl/Matrix;->multiplyMM([FI[FI[FI)V

    return-void
.end method

.method public t(Lcom/daaw/bs1;FLcom/daaw/e40;FF)V
    .locals 2

    float-to-double p2, p2

    const/high16 v0, 0x3f000000    # 0.5f

    mul-float p5, p5, v0

    float-to-double v0, p5

    invoke-static {v0, v1}, Ljava/lang/Math;->toRadians(D)D

    move-result-wide v0

    invoke-static {v0, v1}, Ljava/lang/Math;->tan(D)D

    move-result-wide v0

    invoke-static {p2, p3}, Ljava/lang/Double;->isNaN(D)Z

    mul-double p2, p2, v0

    invoke-static {p2, p3}, Ljava/lang/Math;->abs(D)D

    move-result-wide p2

    double-to-float p2, p2

    iput p2, p1, Lcom/daaw/bs1;->b:F

    mul-float p2, p2, p4

    iput p2, p1, Lcom/daaw/bs1;->a:F

    return-void
.end method

.method public u(FFILcom/daaw/w31;)V
    .locals 13

    move-object v12, p0

    iget-object v0, v12, Lcom/daaw/y31;->u:Lcom/daaw/y31$c;

    invoke-static {v0}, Lcom/daaw/y31$c;->h(Lcom/daaw/y31$c;)Lcom/daaw/tc;

    move-result-object v0

    invoke-virtual {p0}, Lcom/daaw/y31;->f()I

    move-result v1

    int-to-float v5, v1

    invoke-virtual {p0}, Lcom/daaw/y31;->a()I

    move-result v1

    int-to-float v6, v1

    invoke-static {}, Lcom/daaw/bs1;->s()Lcom/daaw/bs1;

    move-result-object v8

    invoke-static {}, Lcom/daaw/bs1;->q()Lcom/daaw/bs1;

    move-result-object v9

    const/4 v4, 0x0

    const/4 v11, 0x1

    move-object v1, p0

    move v2, p1

    move v3, p2

    move/from16 v7, p3

    move-object/from16 v10, p4

    invoke-virtual/range {v0 .. v11}, Lcom/daaw/tc;->o(Lcom/daaw/de0;FFFFFILcom/daaw/bs1;Lcom/daaw/bs1;Lcom/daaw/w31;Z)V

    return-void
.end method

.method public v(FFILcom/daaw/bs1;Lcom/daaw/bs1;Lcom/daaw/w31;)V
    .locals 13

    move-object v12, p0

    iget-object v0, v12, Lcom/daaw/y31;->u:Lcom/daaw/y31$c;

    invoke-static {v0}, Lcom/daaw/y31$c;->h(Lcom/daaw/y31$c;)Lcom/daaw/tc;

    move-result-object v0

    invoke-virtual {p0}, Lcom/daaw/y31;->f()I

    move-result v1

    int-to-float v5, v1

    invoke-virtual {p0}, Lcom/daaw/y31;->a()I

    move-result v1

    int-to-float v6, v1

    const/4 v4, 0x0

    const/4 v11, 0x0

    move-object v1, p0

    move v2, p1

    move v3, p2

    move/from16 v7, p3

    move-object/from16 v8, p4

    move-object/from16 v9, p5

    move-object/from16 v10, p6

    invoke-virtual/range {v0 .. v11}, Lcom/daaw/tc;->o(Lcom/daaw/de0;FFFFFILcom/daaw/bs1;Lcom/daaw/bs1;Lcom/daaw/w31;Z)V

    return-void
.end method

.method public w(ILcom/daaw/qc0;I)V
    .locals 13

    move-object v12, p0

    iget-object v0, v12, Lcom/daaw/y31;->u:Lcom/daaw/y31$c;

    invoke-static {v0}, Lcom/daaw/y31$c;->h(Lcom/daaw/y31$c;)Lcom/daaw/tc;

    move-result-object v0

    invoke-virtual {p0}, Lcom/daaw/y31;->f()I

    move-result v1

    int-to-float v5, v1

    invoke-virtual {p0}, Lcom/daaw/y31;->a()I

    move-result v1

    int-to-float v6, v1

    invoke-static {}, Lcom/daaw/bs1;->s()Lcom/daaw/bs1;

    move-result-object v8

    invoke-static {}, Lcom/daaw/bs1;->q()Lcom/daaw/bs1;

    move-result-object v9

    new-instance v10, Lcom/daaw/w31;

    const/4 v1, 0x0

    move-object v2, p2

    move/from16 v3, p3

    invoke-direct {v10, v3, p2, v1, v1}, Lcom/daaw/w31;-><init>(ILcom/daaw/qc0;Lcom/daaw/qr1;Lcom/daaw/g0;)V

    const/4 v2, 0x0

    const/4 v3, 0x0

    const/4 v4, 0x0

    const/4 v11, 0x0

    move-object v1, p0

    move v7, p1

    invoke-virtual/range {v0 .. v11}, Lcom/daaw/tc;->o(Lcom/daaw/de0;FFFFFILcom/daaw/bs1;Lcom/daaw/bs1;Lcom/daaw/w31;Z)V

    return-void
.end method

.method public x(ILcom/daaw/w31;)V
    .locals 1

    const/4 v0, 0x0

    invoke-virtual {p0, v0, v0, p1, p2}, Lcom/daaw/y31;->u(FFILcom/daaw/w31;)V

    return-void
.end method

.method public y(ILcom/daaw/bs1;Lcom/daaw/bs1;Lcom/daaw/w31;)V
    .locals 13

    move-object v12, p0

    iget-object v0, v12, Lcom/daaw/y31;->u:Lcom/daaw/y31$c;

    invoke-static {v0}, Lcom/daaw/y31$c;->h(Lcom/daaw/y31$c;)Lcom/daaw/tc;

    move-result-object v0

    const/high16 v2, -0x40800000    # -1.0f

    const/high16 v3, -0x40800000    # -1.0f

    const/4 v4, 0x0

    const/high16 v5, 0x40000000    # 2.0f

    const/high16 v6, 0x40000000    # 2.0f

    const/4 v11, 0x0

    move-object v1, p0

    move v7, p1

    move-object v8, p2

    move-object/from16 v9, p3

    move-object/from16 v10, p4

    invoke-virtual/range {v0 .. v11}, Lcom/daaw/tc;->o(Lcom/daaw/de0;FFFFFILcom/daaw/bs1;Lcom/daaw/bs1;Lcom/daaw/w31;Z)V

    return-void
.end method

.method public z()V
    .locals 2

    iget-object v0, p0, Lcom/daaw/y31;->s:Lcom/daaw/g40;

    iget v1, v0, Lcom/daaw/g40;->a:I

    add-int/lit8 v1, v1, 0x1

    iput v1, v0, Lcom/daaw/g40;->a:I

    return-void
.end method
