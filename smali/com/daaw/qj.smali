.class public Lcom/daaw/qj;
.super Ljava/lang/Object;
.source ""


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/daaw/qj$b;
    }
.end annotation


# static fields
.field public static v0:F = 0.5f


# instance fields
.field public A:Z

.field public B:Lcom/daaw/lj;

.field public C:Lcom/daaw/lj;

.field public D:Lcom/daaw/lj;

.field public E:Lcom/daaw/lj;

.field public F:Lcom/daaw/lj;

.field public G:Lcom/daaw/lj;

.field public H:Lcom/daaw/lj;

.field public I:Lcom/daaw/lj;

.field public J:[Lcom/daaw/lj;

.field public K:Ljava/util/ArrayList;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/ArrayList<",
            "Lcom/daaw/lj;",
            ">;"
        }
    .end annotation
.end field

.field public L:[Z

.field public M:[Lcom/daaw/qj$b;

.field public N:Lcom/daaw/qj;

.field public O:I

.field public P:I

.field public Q:F

.field public R:I

.field public S:I

.field public T:I

.field public U:I

.field public V:I

.field public W:I

.field public X:I

.field public Y:I

.field public Z:I

.field public a:Z

.field public a0:I

.field public b:[Lcom/daaw/kx1;

.field public b0:F

.field public c:Lcom/daaw/se;

.field public c0:F

.field public d:Lcom/daaw/se;

.field public d0:Ljava/lang/Object;

.field public e:Lcom/daaw/sb0;

.field public e0:I

.field public f:Lcom/daaw/ms1;

.field public f0:I

.field public g:[Z

.field public g0:Ljava/lang/String;

.field public h:[I

.field public h0:Ljava/lang/String;

.field public i:Z

.field public i0:Z

.field public j:I

.field public j0:Z

.field public k:I

.field public k0:Z

.field public l:I

.field public l0:Z

.field public m:I

.field public m0:I

.field public n:[I

.field public n0:I

.field public o:I

.field public o0:Z

.field public p:I

.field public p0:Z

.field public q:F

.field public q0:[F

.field public r:I

.field public r0:[Lcom/daaw/qj;

.field public s:I

.field public s0:[Lcom/daaw/qj;

.field public t:F

.field public t0:Lcom/daaw/qj;

.field public u:I

.field public u0:Lcom/daaw/qj;

.field public v:F

.field public w:[I

.field public x:F

.field public y:Z

.field public z:Z


# direct methods
.method public static constructor <clinit>()V
    .locals 0

    return-void
.end method

.method public constructor <init>()V
    .locals 10

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const/4 v0, 0x0

    iput-boolean v0, p0, Lcom/daaw/qj;->a:Z

    const/4 v1, 0x2

    new-array v2, v1, [Lcom/daaw/kx1;

    iput-object v2, p0, Lcom/daaw/qj;->b:[Lcom/daaw/kx1;

    new-instance v2, Lcom/daaw/sb0;

    invoke-direct {v2, p0}, Lcom/daaw/sb0;-><init>(Lcom/daaw/qj;)V

    iput-object v2, p0, Lcom/daaw/qj;->e:Lcom/daaw/sb0;

    new-instance v2, Lcom/daaw/ms1;

    invoke-direct {v2, p0}, Lcom/daaw/ms1;-><init>(Lcom/daaw/qj;)V

    iput-object v2, p0, Lcom/daaw/qj;->f:Lcom/daaw/ms1;

    new-array v2, v1, [Z

    fill-array-data v2, :array_0

    iput-object v2, p0, Lcom/daaw/qj;->g:[Z

    const/4 v2, 0x4

    new-array v3, v2, [I

    fill-array-data v3, :array_1

    iput-object v3, p0, Lcom/daaw/qj;->h:[I

    iput-boolean v0, p0, Lcom/daaw/qj;->i:Z

    const/4 v3, -0x1

    iput v3, p0, Lcom/daaw/qj;->j:I

    iput v3, p0, Lcom/daaw/qj;->k:I

    iput v0, p0, Lcom/daaw/qj;->l:I

    iput v0, p0, Lcom/daaw/qj;->m:I

    new-array v4, v1, [I

    iput-object v4, p0, Lcom/daaw/qj;->n:[I

    iput v0, p0, Lcom/daaw/qj;->o:I

    iput v0, p0, Lcom/daaw/qj;->p:I

    const/high16 v4, 0x3f800000    # 1.0f

    iput v4, p0, Lcom/daaw/qj;->q:F

    iput v0, p0, Lcom/daaw/qj;->r:I

    iput v0, p0, Lcom/daaw/qj;->s:I

    iput v4, p0, Lcom/daaw/qj;->t:F

    iput v3, p0, Lcom/daaw/qj;->u:I

    iput v4, p0, Lcom/daaw/qj;->v:F

    new-array v4, v1, [I

    fill-array-data v4, :array_2

    iput-object v4, p0, Lcom/daaw/qj;->w:[I

    const/4 v4, 0x0

    iput v4, p0, Lcom/daaw/qj;->x:F

    iput-boolean v0, p0, Lcom/daaw/qj;->y:Z

    iput-boolean v0, p0, Lcom/daaw/qj;->A:Z

    new-instance v5, Lcom/daaw/lj;

    sget-object v6, Lcom/daaw/lj$b;->q:Lcom/daaw/lj$b;

    invoke-direct {v5, p0, v6}, Lcom/daaw/lj;-><init>(Lcom/daaw/qj;Lcom/daaw/lj$b;)V

    iput-object v5, p0, Lcom/daaw/qj;->B:Lcom/daaw/lj;

    new-instance v5, Lcom/daaw/lj;

    sget-object v6, Lcom/daaw/lj$b;->r:Lcom/daaw/lj$b;

    invoke-direct {v5, p0, v6}, Lcom/daaw/lj;-><init>(Lcom/daaw/qj;Lcom/daaw/lj$b;)V

    iput-object v5, p0, Lcom/daaw/qj;->C:Lcom/daaw/lj;

    new-instance v5, Lcom/daaw/lj;

    sget-object v6, Lcom/daaw/lj$b;->s:Lcom/daaw/lj$b;

    invoke-direct {v5, p0, v6}, Lcom/daaw/lj;-><init>(Lcom/daaw/qj;Lcom/daaw/lj$b;)V

    iput-object v5, p0, Lcom/daaw/qj;->D:Lcom/daaw/lj;

    new-instance v5, Lcom/daaw/lj;

    sget-object v6, Lcom/daaw/lj$b;->t:Lcom/daaw/lj$b;

    invoke-direct {v5, p0, v6}, Lcom/daaw/lj;-><init>(Lcom/daaw/qj;Lcom/daaw/lj$b;)V

    iput-object v5, p0, Lcom/daaw/qj;->E:Lcom/daaw/lj;

    new-instance v5, Lcom/daaw/lj;

    sget-object v6, Lcom/daaw/lj$b;->u:Lcom/daaw/lj$b;

    invoke-direct {v5, p0, v6}, Lcom/daaw/lj;-><init>(Lcom/daaw/qj;Lcom/daaw/lj$b;)V

    iput-object v5, p0, Lcom/daaw/qj;->F:Lcom/daaw/lj;

    new-instance v5, Lcom/daaw/lj;

    sget-object v6, Lcom/daaw/lj$b;->w:Lcom/daaw/lj$b;

    invoke-direct {v5, p0, v6}, Lcom/daaw/lj;-><init>(Lcom/daaw/qj;Lcom/daaw/lj$b;)V

    iput-object v5, p0, Lcom/daaw/qj;->G:Lcom/daaw/lj;

    new-instance v5, Lcom/daaw/lj;

    sget-object v6, Lcom/daaw/lj$b;->x:Lcom/daaw/lj$b;

    invoke-direct {v5, p0, v6}, Lcom/daaw/lj;-><init>(Lcom/daaw/qj;Lcom/daaw/lj$b;)V

    iput-object v5, p0, Lcom/daaw/qj;->H:Lcom/daaw/lj;

    new-instance v5, Lcom/daaw/lj;

    sget-object v6, Lcom/daaw/lj$b;->v:Lcom/daaw/lj$b;

    invoke-direct {v5, p0, v6}, Lcom/daaw/lj;-><init>(Lcom/daaw/qj;Lcom/daaw/lj$b;)V

    iput-object v5, p0, Lcom/daaw/qj;->I:Lcom/daaw/lj;

    const/4 v6, 0x6

    new-array v6, v6, [Lcom/daaw/lj;

    iget-object v7, p0, Lcom/daaw/qj;->B:Lcom/daaw/lj;

    aput-object v7, v6, v0

    iget-object v7, p0, Lcom/daaw/qj;->D:Lcom/daaw/lj;

    const/4 v8, 0x1

    aput-object v7, v6, v8

    iget-object v7, p0, Lcom/daaw/qj;->C:Lcom/daaw/lj;

    aput-object v7, v6, v1

    iget-object v7, p0, Lcom/daaw/qj;->E:Lcom/daaw/lj;

    const/4 v9, 0x3

    aput-object v7, v6, v9

    iget-object v7, p0, Lcom/daaw/qj;->F:Lcom/daaw/lj;

    aput-object v7, v6, v2

    const/4 v2, 0x5

    aput-object v5, v6, v2

    iput-object v6, p0, Lcom/daaw/qj;->J:[Lcom/daaw/lj;

    new-instance v2, Ljava/util/ArrayList;

    invoke-direct {v2}, Ljava/util/ArrayList;-><init>()V

    iput-object v2, p0, Lcom/daaw/qj;->K:Ljava/util/ArrayList;

    new-array v2, v1, [Z

    iput-object v2, p0, Lcom/daaw/qj;->L:[Z

    new-array v2, v1, [Lcom/daaw/qj$b;

    sget-object v5, Lcom/daaw/qj$b;->p:Lcom/daaw/qj$b;

    aput-object v5, v2, v0

    aput-object v5, v2, v8

    iput-object v2, p0, Lcom/daaw/qj;->M:[Lcom/daaw/qj$b;

    const/4 v2, 0x0

    iput-object v2, p0, Lcom/daaw/qj;->N:Lcom/daaw/qj;

    iput v0, p0, Lcom/daaw/qj;->O:I

    iput v0, p0, Lcom/daaw/qj;->P:I

    iput v4, p0, Lcom/daaw/qj;->Q:F

    iput v3, p0, Lcom/daaw/qj;->R:I

    iput v0, p0, Lcom/daaw/qj;->S:I

    iput v0, p0, Lcom/daaw/qj;->T:I

    iput v0, p0, Lcom/daaw/qj;->U:I

    iput v0, p0, Lcom/daaw/qj;->V:I

    iput v0, p0, Lcom/daaw/qj;->W:I

    iput v0, p0, Lcom/daaw/qj;->X:I

    iput v0, p0, Lcom/daaw/qj;->Y:I

    sget v3, Lcom/daaw/qj;->v0:F

    iput v3, p0, Lcom/daaw/qj;->b0:F

    iput v3, p0, Lcom/daaw/qj;->c0:F

    iput v0, p0, Lcom/daaw/qj;->e0:I

    iput v0, p0, Lcom/daaw/qj;->f0:I

    iput-object v2, p0, Lcom/daaw/qj;->g0:Ljava/lang/String;

    iput-object v2, p0, Lcom/daaw/qj;->h0:Ljava/lang/String;

    iput-boolean v0, p0, Lcom/daaw/qj;->k0:Z

    iput-boolean v0, p0, Lcom/daaw/qj;->l0:Z

    iput v0, p0, Lcom/daaw/qj;->m0:I

    iput v0, p0, Lcom/daaw/qj;->n0:I

    new-array v3, v1, [F

    fill-array-data v3, :array_3

    iput-object v3, p0, Lcom/daaw/qj;->q0:[F

    new-array v3, v1, [Lcom/daaw/qj;

    aput-object v2, v3, v0

    aput-object v2, v3, v8

    iput-object v3, p0, Lcom/daaw/qj;->r0:[Lcom/daaw/qj;

    new-array v1, v1, [Lcom/daaw/qj;

    aput-object v2, v1, v0

    aput-object v2, v1, v8

    iput-object v1, p0, Lcom/daaw/qj;->s0:[Lcom/daaw/qj;

    iput-object v2, p0, Lcom/daaw/qj;->t0:Lcom/daaw/qj;

    iput-object v2, p0, Lcom/daaw/qj;->u0:Lcom/daaw/qj;

    invoke-virtual {p0}, Lcom/daaw/qj;->d()V

    return-void

    :array_0
    .array-data 1
        0x1t
        0x1t
    .end array-data

    nop

    :array_1
    .array-data 4
        0x0
        0x0
        0x0
        0x0
    .end array-data

    :array_2
    .array-data 4
        0x7fffffff
        0x7fffffff
    .end array-data

    :array_3
    .array-data 4
        -0x40800000    # -1.0f
        -0x40800000    # -1.0f
    .end array-data
.end method


# virtual methods
.method public A()I
    .locals 2

    iget-object v0, p0, Lcom/daaw/qj;->w:[I

    const/4 v1, 0x0

    aget v0, v0, v1

    return v0
.end method

.method public A0(I)V
    .locals 0

    iput p1, p0, Lcom/daaw/qj;->f0:I

    return-void
.end method

.method public B()I
    .locals 1

    iget v0, p0, Lcom/daaw/qj;->a0:I

    return v0
.end method

.method public B0(I)V
    .locals 1

    iput p1, p0, Lcom/daaw/qj;->O:I

    iget v0, p0, Lcom/daaw/qj;->Z:I

    if-ge p1, v0, :cond_0

    iput v0, p0, Lcom/daaw/qj;->O:I

    :cond_0
    return-void
.end method

.method public C()I
    .locals 1

    iget v0, p0, Lcom/daaw/qj;->Z:I

    return v0
.end method

.method public C0(I)V
    .locals 0

    iput p1, p0, Lcom/daaw/qj;->S:I

    return-void
.end method

.method public D(I)Lcom/daaw/qj;
    .locals 2

    if-nez p1, :cond_0

    iget-object p1, p0, Lcom/daaw/qj;->D:Lcom/daaw/lj;

    iget-object v0, p1, Lcom/daaw/lj;->d:Lcom/daaw/lj;

    if-eqz v0, :cond_1

    iget-object v1, v0, Lcom/daaw/lj;->d:Lcom/daaw/lj;

    if-ne v1, p1, :cond_1

    iget-object p1, v0, Lcom/daaw/lj;->b:Lcom/daaw/qj;

    return-object p1

    :cond_0
    const/4 v0, 0x1

    if-ne p1, v0, :cond_1

    iget-object p1, p0, Lcom/daaw/qj;->E:Lcom/daaw/lj;

    iget-object v0, p1, Lcom/daaw/lj;->d:Lcom/daaw/lj;

    if-eqz v0, :cond_1

    iget-object v1, v0, Lcom/daaw/lj;->d:Lcom/daaw/lj;

    if-ne v1, p1, :cond_1

    iget-object p1, v0, Lcom/daaw/lj;->b:Lcom/daaw/qj;

    return-object p1

    :cond_1
    const/4 p1, 0x0

    return-object p1
.end method

.method public D0(I)V
    .locals 0

    iput p1, p0, Lcom/daaw/qj;->T:I

    return-void
.end method

.method public E()Lcom/daaw/qj;
    .locals 1

    iget-object v0, p0, Lcom/daaw/qj;->N:Lcom/daaw/qj;

    return-object v0
.end method

.method public E0(ZZZZ)V
    .locals 3

    iget p1, p0, Lcom/daaw/qj;->u:I

    const/high16 p2, 0x3f800000    # 1.0f

    const/4 v0, 0x0

    const/4 v1, -0x1

    const/4 v2, 0x1

    if-ne p1, v1, :cond_1

    if-eqz p3, :cond_0

    if-nez p4, :cond_0

    iput v0, p0, Lcom/daaw/qj;->u:I

    goto :goto_0

    :cond_0
    if-nez p3, :cond_1

    if-eqz p4, :cond_1

    iput v2, p0, Lcom/daaw/qj;->u:I

    iget p1, p0, Lcom/daaw/qj;->R:I

    if-ne p1, v1, :cond_1

    iget p1, p0, Lcom/daaw/qj;->v:F

    div-float p1, p2, p1

    iput p1, p0, Lcom/daaw/qj;->v:F

    :cond_1
    :goto_0
    iget p1, p0, Lcom/daaw/qj;->u:I

    if-nez p1, :cond_3

    iget-object p1, p0, Lcom/daaw/qj;->C:Lcom/daaw/lj;

    invoke-virtual {p1}, Lcom/daaw/lj;->i()Z

    move-result p1

    if-eqz p1, :cond_2

    iget-object p1, p0, Lcom/daaw/qj;->E:Lcom/daaw/lj;

    invoke-virtual {p1}, Lcom/daaw/lj;->i()Z

    move-result p1

    if-nez p1, :cond_3

    :cond_2
    iput v2, p0, Lcom/daaw/qj;->u:I

    goto :goto_1

    :cond_3
    iget p1, p0, Lcom/daaw/qj;->u:I

    if-ne p1, v2, :cond_5

    iget-object p1, p0, Lcom/daaw/qj;->B:Lcom/daaw/lj;

    invoke-virtual {p1}, Lcom/daaw/lj;->i()Z

    move-result p1

    if-eqz p1, :cond_4

    iget-object p1, p0, Lcom/daaw/qj;->D:Lcom/daaw/lj;

    invoke-virtual {p1}, Lcom/daaw/lj;->i()Z

    move-result p1

    if-nez p1, :cond_5

    :cond_4
    iput v0, p0, Lcom/daaw/qj;->u:I

    :cond_5
    :goto_1
    iget p1, p0, Lcom/daaw/qj;->u:I

    if-ne p1, v1, :cond_8

    iget-object p1, p0, Lcom/daaw/qj;->C:Lcom/daaw/lj;

    invoke-virtual {p1}, Lcom/daaw/lj;->i()Z

    move-result p1

    if-eqz p1, :cond_6

    iget-object p1, p0, Lcom/daaw/qj;->E:Lcom/daaw/lj;

    invoke-virtual {p1}, Lcom/daaw/lj;->i()Z

    move-result p1

    if-eqz p1, :cond_6

    iget-object p1, p0, Lcom/daaw/qj;->B:Lcom/daaw/lj;

    invoke-virtual {p1}, Lcom/daaw/lj;->i()Z

    move-result p1

    if-eqz p1, :cond_6

    iget-object p1, p0, Lcom/daaw/qj;->D:Lcom/daaw/lj;

    invoke-virtual {p1}, Lcom/daaw/lj;->i()Z

    move-result p1

    if-nez p1, :cond_8

    :cond_6
    iget-object p1, p0, Lcom/daaw/qj;->C:Lcom/daaw/lj;

    invoke-virtual {p1}, Lcom/daaw/lj;->i()Z

    move-result p1

    if-eqz p1, :cond_7

    iget-object p1, p0, Lcom/daaw/qj;->E:Lcom/daaw/lj;

    invoke-virtual {p1}, Lcom/daaw/lj;->i()Z

    move-result p1

    if-eqz p1, :cond_7

    iput v0, p0, Lcom/daaw/qj;->u:I

    goto :goto_2

    :cond_7
    iget-object p1, p0, Lcom/daaw/qj;->B:Lcom/daaw/lj;

    invoke-virtual {p1}, Lcom/daaw/lj;->i()Z

    move-result p1

    if-eqz p1, :cond_8

    iget-object p1, p0, Lcom/daaw/qj;->D:Lcom/daaw/lj;

    invoke-virtual {p1}, Lcom/daaw/lj;->i()Z

    move-result p1

    if-eqz p1, :cond_8

    iget p1, p0, Lcom/daaw/qj;->v:F

    div-float p1, p2, p1

    iput p1, p0, Lcom/daaw/qj;->v:F

    iput v2, p0, Lcom/daaw/qj;->u:I

    :cond_8
    :goto_2
    iget p1, p0, Lcom/daaw/qj;->u:I

    if-ne p1, v1, :cond_a

    iget p1, p0, Lcom/daaw/qj;->o:I

    if-lez p1, :cond_9

    iget p3, p0, Lcom/daaw/qj;->r:I

    if-nez p3, :cond_9

    iput v0, p0, Lcom/daaw/qj;->u:I

    goto :goto_3

    :cond_9
    if-nez p1, :cond_a

    iget p1, p0, Lcom/daaw/qj;->r:I

    if-lez p1, :cond_a

    iget p1, p0, Lcom/daaw/qj;->v:F

    div-float/2addr p2, p1

    iput p2, p0, Lcom/daaw/qj;->v:F

    iput v2, p0, Lcom/daaw/qj;->u:I

    :cond_a
    :goto_3
    return-void
.end method

.method public F(I)Lcom/daaw/qj;
    .locals 2

    if-nez p1, :cond_0

    iget-object p1, p0, Lcom/daaw/qj;->B:Lcom/daaw/lj;

    iget-object v0, p1, Lcom/daaw/lj;->d:Lcom/daaw/lj;

    if-eqz v0, :cond_1

    iget-object v1, v0, Lcom/daaw/lj;->d:Lcom/daaw/lj;

    if-ne v1, p1, :cond_1

    iget-object p1, v0, Lcom/daaw/lj;->b:Lcom/daaw/qj;

    return-object p1

    :cond_0
    const/4 v0, 0x1

    if-ne p1, v0, :cond_1

    iget-object p1, p0, Lcom/daaw/qj;->C:Lcom/daaw/lj;

    iget-object v0, p1, Lcom/daaw/lj;->d:Lcom/daaw/lj;

    if-eqz v0, :cond_1

    iget-object v1, v0, Lcom/daaw/lj;->d:Lcom/daaw/lj;

    if-ne v1, p1, :cond_1

    iget-object p1, v0, Lcom/daaw/lj;->b:Lcom/daaw/qj;

    return-object p1

    :cond_1
    const/4 p1, 0x0

    return-object p1
.end method

.method public F0(ZZ)V
    .locals 7

    iget-object v0, p0, Lcom/daaw/qj;->e:Lcom/daaw/sb0;

    invoke-virtual {v0}, Lcom/daaw/kx1;->k()Z

    move-result v0

    and-int/2addr p1, v0

    iget-object v0, p0, Lcom/daaw/qj;->f:Lcom/daaw/ms1;

    invoke-virtual {v0}, Lcom/daaw/kx1;->k()Z

    move-result v0

    and-int/2addr p2, v0

    iget-object v0, p0, Lcom/daaw/qj;->e:Lcom/daaw/sb0;

    iget-object v1, v0, Lcom/daaw/kx1;->h:Lcom/daaw/ft;

    iget v1, v1, Lcom/daaw/ft;->g:I

    iget-object v2, p0, Lcom/daaw/qj;->f:Lcom/daaw/ms1;

    iget-object v3, v2, Lcom/daaw/kx1;->h:Lcom/daaw/ft;

    iget v3, v3, Lcom/daaw/ft;->g:I

    iget-object v0, v0, Lcom/daaw/kx1;->i:Lcom/daaw/ft;

    iget v0, v0, Lcom/daaw/ft;->g:I

    iget-object v2, v2, Lcom/daaw/kx1;->i:Lcom/daaw/ft;

    iget v2, v2, Lcom/daaw/ft;->g:I

    sub-int v4, v0, v1

    sub-int v5, v2, v3

    const/4 v6, 0x0

    if-ltz v4, :cond_0

    if-ltz v5, :cond_0

    const/high16 v4, -0x80000000

    if-eq v1, v4, :cond_0

    const v5, 0x7fffffff

    if-eq v1, v5, :cond_0

    if-eq v3, v4, :cond_0

    if-eq v3, v5, :cond_0

    if-eq v0, v4, :cond_0

    if-eq v0, v5, :cond_0

    if-eq v2, v4, :cond_0

    if-ne v2, v5, :cond_1

    :cond_0
    const/4 v0, 0x0

    const/4 v1, 0x0

    const/4 v2, 0x0

    const/4 v3, 0x0

    :cond_1
    sub-int/2addr v0, v1

    sub-int/2addr v2, v3

    if-eqz p1, :cond_2

    iput v1, p0, Lcom/daaw/qj;->S:I

    :cond_2
    if-eqz p2, :cond_3

    iput v3, p0, Lcom/daaw/qj;->T:I

    :cond_3
    iget v1, p0, Lcom/daaw/qj;->f0:I

    const/16 v3, 0x8

    if-ne v1, v3, :cond_4

    iput v6, p0, Lcom/daaw/qj;->O:I

    iput v6, p0, Lcom/daaw/qj;->P:I

    return-void

    :cond_4
    if-eqz p1, :cond_6

    iget-object p1, p0, Lcom/daaw/qj;->M:[Lcom/daaw/qj$b;

    aget-object p1, p1, v6

    sget-object v1, Lcom/daaw/qj$b;->p:Lcom/daaw/qj$b;

    if-ne p1, v1, :cond_5

    iget p1, p0, Lcom/daaw/qj;->O:I

    if-ge v0, p1, :cond_5

    move v0, p1

    :cond_5
    iput v0, p0, Lcom/daaw/qj;->O:I

    iget p1, p0, Lcom/daaw/qj;->Z:I

    if-ge v0, p1, :cond_6

    iput p1, p0, Lcom/daaw/qj;->O:I

    :cond_6
    if-eqz p2, :cond_8

    iget-object p1, p0, Lcom/daaw/qj;->M:[Lcom/daaw/qj$b;

    const/4 p2, 0x1

    aget-object p1, p1, p2

    sget-object p2, Lcom/daaw/qj$b;->p:Lcom/daaw/qj$b;

    if-ne p1, p2, :cond_7

    iget p1, p0, Lcom/daaw/qj;->P:I

    if-ge v2, p1, :cond_7

    move v2, p1

    :cond_7
    iput v2, p0, Lcom/daaw/qj;->P:I

    iget p1, p0, Lcom/daaw/qj;->a0:I

    if-ge v2, p1, :cond_8

    iput p1, p0, Lcom/daaw/qj;->P:I

    :cond_8
    return-void
.end method

.method public G()I
    .locals 2

    invoke-virtual {p0}, Lcom/daaw/qj;->O()I

    move-result v0

    iget v1, p0, Lcom/daaw/qj;->O:I

    add-int/2addr v0, v1

    return v0
.end method

.method public G0(Lcom/daaw/ak0;)V
    .locals 6

    iget-object v0, p0, Lcom/daaw/qj;->B:Lcom/daaw/lj;

    invoke-virtual {p1, v0}, Lcom/daaw/ak0;->x(Ljava/lang/Object;)I

    move-result v0

    iget-object v1, p0, Lcom/daaw/qj;->C:Lcom/daaw/lj;

    invoke-virtual {p1, v1}, Lcom/daaw/ak0;->x(Ljava/lang/Object;)I

    move-result v1

    iget-object v2, p0, Lcom/daaw/qj;->D:Lcom/daaw/lj;

    invoke-virtual {p1, v2}, Lcom/daaw/ak0;->x(Ljava/lang/Object;)I

    move-result v2

    iget-object v3, p0, Lcom/daaw/qj;->E:Lcom/daaw/lj;

    invoke-virtual {p1, v3}, Lcom/daaw/ak0;->x(Ljava/lang/Object;)I

    move-result p1

    iget-object v3, p0, Lcom/daaw/qj;->e:Lcom/daaw/sb0;

    iget-object v4, v3, Lcom/daaw/kx1;->h:Lcom/daaw/ft;

    iget-boolean v5, v4, Lcom/daaw/ft;->j:Z

    if-eqz v5, :cond_0

    iget-object v3, v3, Lcom/daaw/kx1;->i:Lcom/daaw/ft;

    iget-boolean v5, v3, Lcom/daaw/ft;->j:Z

    if-eqz v5, :cond_0

    iget v0, v4, Lcom/daaw/ft;->g:I

    iget v2, v3, Lcom/daaw/ft;->g:I

    :cond_0
    iget-object v3, p0, Lcom/daaw/qj;->f:Lcom/daaw/ms1;

    iget-object v4, v3, Lcom/daaw/kx1;->h:Lcom/daaw/ft;

    iget-boolean v5, v4, Lcom/daaw/ft;->j:Z

    if-eqz v5, :cond_1

    iget-object v3, v3, Lcom/daaw/kx1;->i:Lcom/daaw/ft;

    iget-boolean v5, v3, Lcom/daaw/ft;->j:Z

    if-eqz v5, :cond_1

    iget v1, v4, Lcom/daaw/ft;->g:I

    iget p1, v3, Lcom/daaw/ft;->g:I

    :cond_1
    sub-int v3, v2, v0

    sub-int v4, p1, v1

    const/4 v5, 0x0

    if-ltz v3, :cond_2

    if-ltz v4, :cond_2

    const/high16 v3, -0x80000000

    if-eq v0, v3, :cond_2

    const v4, 0x7fffffff

    if-eq v0, v4, :cond_2

    if-eq v1, v3, :cond_2

    if-eq v1, v4, :cond_2

    if-eq v2, v3, :cond_2

    if-eq v2, v4, :cond_2

    if-eq p1, v3, :cond_2

    if-ne p1, v4, :cond_3

    :cond_2
    const/4 p1, 0x0

    const/4 v0, 0x0

    const/4 v1, 0x0

    const/4 v2, 0x0

    :cond_3
    invoke-virtual {p0, v0, v1, v2, p1}, Lcom/daaw/qj;->c0(IIII)V

    return-void
.end method

.method public H(I)Lcom/daaw/kx1;
    .locals 1

    if-nez p1, :cond_0

    iget-object p1, p0, Lcom/daaw/qj;->e:Lcom/daaw/sb0;

    return-object p1

    :cond_0
    const/4 v0, 0x1

    if-ne p1, v0, :cond_1

    iget-object p1, p0, Lcom/daaw/qj;->f:Lcom/daaw/ms1;

    return-object p1

    :cond_1
    const/4 p1, 0x0

    return-object p1
.end method

.method public I()F
    .locals 1

    iget v0, p0, Lcom/daaw/qj;->c0:F

    return v0
.end method

.method public J()I
    .locals 1

    iget v0, p0, Lcom/daaw/qj;->n0:I

    return v0
.end method

.method public K()Lcom/daaw/qj$b;
    .locals 2

    iget-object v0, p0, Lcom/daaw/qj;->M:[Lcom/daaw/qj$b;

    const/4 v1, 0x1

    aget-object v0, v0, v1

    return-object v0
.end method

.method public L()I
    .locals 2

    iget-object v0, p0, Lcom/daaw/qj;->B:Lcom/daaw/lj;

    const/4 v1, 0x0

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/daaw/qj;->C:Lcom/daaw/lj;

    iget v0, v0, Lcom/daaw/lj;->e:I

    add-int/2addr v1, v0

    :cond_0
    iget-object v0, p0, Lcom/daaw/qj;->D:Lcom/daaw/lj;

    if-eqz v0, :cond_1

    iget-object v0, p0, Lcom/daaw/qj;->E:Lcom/daaw/lj;

    iget v0, v0, Lcom/daaw/lj;->e:I

    add-int/2addr v1, v0

    :cond_1
    return v1
.end method

.method public M()I
    .locals 1

    iget v0, p0, Lcom/daaw/qj;->f0:I

    return v0
.end method

.method public N()I
    .locals 2

    iget v0, p0, Lcom/daaw/qj;->f0:I

    const/16 v1, 0x8

    if-ne v0, v1, :cond_0

    const/4 v0, 0x0

    return v0

    :cond_0
    iget v0, p0, Lcom/daaw/qj;->O:I

    return v0
.end method

.method public O()I
    .locals 2

    iget-object v0, p0, Lcom/daaw/qj;->N:Lcom/daaw/qj;

    if-eqz v0, :cond_0

    instance-of v1, v0, Lcom/daaw/rj;

    if-eqz v1, :cond_0

    check-cast v0, Lcom/daaw/rj;

    iget v0, v0, Lcom/daaw/rj;->C0:I

    iget v1, p0, Lcom/daaw/qj;->S:I

    add-int/2addr v0, v1

    return v0

    :cond_0
    iget v0, p0, Lcom/daaw/qj;->S:I

    return v0
.end method

.method public P()I
    .locals 2

    iget-object v0, p0, Lcom/daaw/qj;->N:Lcom/daaw/qj;

    if-eqz v0, :cond_0

    instance-of v1, v0, Lcom/daaw/rj;

    if-eqz v1, :cond_0

    check-cast v0, Lcom/daaw/rj;

    iget v0, v0, Lcom/daaw/rj;->D0:I

    iget v1, p0, Lcom/daaw/qj;->T:I

    add-int/2addr v0, v1

    return v0

    :cond_0
    iget v0, p0, Lcom/daaw/qj;->T:I

    return v0
.end method

.method public Q()Z
    .locals 1

    iget-boolean v0, p0, Lcom/daaw/qj;->y:Z

    return v0
.end method

.method public R(Lcom/daaw/lj$b;Lcom/daaw/qj;Lcom/daaw/lj$b;II)V
    .locals 0

    invoke-virtual {p0, p1}, Lcom/daaw/qj;->k(Lcom/daaw/lj$b;)Lcom/daaw/lj;

    move-result-object p1

    invoke-virtual {p2, p3}, Lcom/daaw/qj;->k(Lcom/daaw/lj$b;)Lcom/daaw/lj;

    move-result-object p2

    const/4 p3, 0x1

    invoke-virtual {p1, p2, p4, p5, p3}, Lcom/daaw/lj;->a(Lcom/daaw/lj;IIZ)Z

    return-void
.end method

.method public final S(I)Z
    .locals 4

    mul-int/lit8 p1, p1, 0x2

    iget-object v0, p0, Lcom/daaw/qj;->J:[Lcom/daaw/lj;

    aget-object v1, v0, p1

    iget-object v1, v1, Lcom/daaw/lj;->d:Lcom/daaw/lj;

    const/4 v2, 0x1

    if-eqz v1, :cond_0

    aget-object v1, v0, p1

    iget-object v1, v1, Lcom/daaw/lj;->d:Lcom/daaw/lj;

    iget-object v1, v1, Lcom/daaw/lj;->d:Lcom/daaw/lj;

    aget-object v3, v0, p1

    if-eq v1, v3, :cond_0

    add-int/2addr p1, v2

    aget-object v1, v0, p1

    iget-object v1, v1, Lcom/daaw/lj;->d:Lcom/daaw/lj;

    if-eqz v1, :cond_0

    aget-object v1, v0, p1

    iget-object v1, v1, Lcom/daaw/lj;->d:Lcom/daaw/lj;

    iget-object v1, v1, Lcom/daaw/lj;->d:Lcom/daaw/lj;

    aget-object p1, v0, p1

    if-ne v1, p1, :cond_0

    goto :goto_0

    :cond_0
    const/4 v2, 0x0

    :goto_0
    return v2
.end method

.method public T()Z
    .locals 2

    iget-object v0, p0, Lcom/daaw/qj;->B:Lcom/daaw/lj;

    iget-object v1, v0, Lcom/daaw/lj;->d:Lcom/daaw/lj;

    if-eqz v1, :cond_0

    iget-object v1, v1, Lcom/daaw/lj;->d:Lcom/daaw/lj;

    if-eq v1, v0, :cond_1

    :cond_0
    iget-object v0, p0, Lcom/daaw/qj;->D:Lcom/daaw/lj;

    iget-object v1, v0, Lcom/daaw/lj;->d:Lcom/daaw/lj;

    if-eqz v1, :cond_2

    iget-object v1, v1, Lcom/daaw/lj;->d:Lcom/daaw/lj;

    if-ne v1, v0, :cond_2

    :cond_1
    const/4 v0, 0x1

    return v0

    :cond_2
    const/4 v0, 0x0

    return v0
.end method

.method public U()Z
    .locals 1

    iget-boolean v0, p0, Lcom/daaw/qj;->z:Z

    return v0
.end method

.method public V()Z
    .locals 2

    iget-object v0, p0, Lcom/daaw/qj;->C:Lcom/daaw/lj;

    iget-object v1, v0, Lcom/daaw/lj;->d:Lcom/daaw/lj;

    if-eqz v1, :cond_0

    iget-object v1, v1, Lcom/daaw/lj;->d:Lcom/daaw/lj;

    if-eq v1, v0, :cond_1

    :cond_0
    iget-object v0, p0, Lcom/daaw/qj;->E:Lcom/daaw/lj;

    iget-object v1, v0, Lcom/daaw/lj;->d:Lcom/daaw/lj;

    if-eqz v1, :cond_2

    iget-object v1, v1, Lcom/daaw/lj;->d:Lcom/daaw/lj;

    if-ne v1, v0, :cond_2

    :cond_1
    const/4 v0, 0x1

    return v0

    :cond_2
    const/4 v0, 0x0

    return v0
.end method

.method public W()V
    .locals 6

    iget-object v0, p0, Lcom/daaw/qj;->B:Lcom/daaw/lj;

    invoke-virtual {v0}, Lcom/daaw/lj;->k()V

    iget-object v0, p0, Lcom/daaw/qj;->C:Lcom/daaw/lj;

    invoke-virtual {v0}, Lcom/daaw/lj;->k()V

    iget-object v0, p0, Lcom/daaw/qj;->D:Lcom/daaw/lj;

    invoke-virtual {v0}, Lcom/daaw/lj;->k()V

    iget-object v0, p0, Lcom/daaw/qj;->E:Lcom/daaw/lj;

    invoke-virtual {v0}, Lcom/daaw/lj;->k()V

    iget-object v0, p0, Lcom/daaw/qj;->F:Lcom/daaw/lj;

    invoke-virtual {v0}, Lcom/daaw/lj;->k()V

    iget-object v0, p0, Lcom/daaw/qj;->G:Lcom/daaw/lj;

    invoke-virtual {v0}, Lcom/daaw/lj;->k()V

    iget-object v0, p0, Lcom/daaw/qj;->H:Lcom/daaw/lj;

    invoke-virtual {v0}, Lcom/daaw/lj;->k()V

    iget-object v0, p0, Lcom/daaw/qj;->I:Lcom/daaw/lj;

    invoke-virtual {v0}, Lcom/daaw/lj;->k()V

    const/4 v0, 0x0

    iput-object v0, p0, Lcom/daaw/qj;->N:Lcom/daaw/qj;

    const/4 v1, 0x0

    iput v1, p0, Lcom/daaw/qj;->x:F

    const/4 v2, 0x0

    iput v2, p0, Lcom/daaw/qj;->O:I

    iput v2, p0, Lcom/daaw/qj;->P:I

    iput v1, p0, Lcom/daaw/qj;->Q:F

    const/4 v1, -0x1

    iput v1, p0, Lcom/daaw/qj;->R:I

    iput v2, p0, Lcom/daaw/qj;->S:I

    iput v2, p0, Lcom/daaw/qj;->T:I

    iput v2, p0, Lcom/daaw/qj;->W:I

    iput v2, p0, Lcom/daaw/qj;->X:I

    iput v2, p0, Lcom/daaw/qj;->Y:I

    iput v2, p0, Lcom/daaw/qj;->Z:I

    iput v2, p0, Lcom/daaw/qj;->a0:I

    sget v3, Lcom/daaw/qj;->v0:F

    iput v3, p0, Lcom/daaw/qj;->b0:F

    iput v3, p0, Lcom/daaw/qj;->c0:F

    iget-object v3, p0, Lcom/daaw/qj;->M:[Lcom/daaw/qj$b;

    sget-object v4, Lcom/daaw/qj$b;->p:Lcom/daaw/qj$b;

    aput-object v4, v3, v2

    const/4 v5, 0x1

    aput-object v4, v3, v5

    iput-object v0, p0, Lcom/daaw/qj;->d0:Ljava/lang/Object;

    iput v2, p0, Lcom/daaw/qj;->e0:I

    iput v2, p0, Lcom/daaw/qj;->f0:I

    iput-object v0, p0, Lcom/daaw/qj;->h0:Ljava/lang/String;

    iput-boolean v2, p0, Lcom/daaw/qj;->i0:Z

    iput-boolean v2, p0, Lcom/daaw/qj;->j0:Z

    iput v2, p0, Lcom/daaw/qj;->m0:I

    iput v2, p0, Lcom/daaw/qj;->n0:I

    iput-boolean v2, p0, Lcom/daaw/qj;->o0:Z

    iput-boolean v2, p0, Lcom/daaw/qj;->p0:Z

    iget-object v0, p0, Lcom/daaw/qj;->q0:[F

    const/high16 v3, -0x40800000    # -1.0f

    aput v3, v0, v2

    aput v3, v0, v5

    iput v1, p0, Lcom/daaw/qj;->j:I

    iput v1, p0, Lcom/daaw/qj;->k:I

    iget-object v0, p0, Lcom/daaw/qj;->w:[I

    const v3, 0x7fffffff

    aput v3, v0, v2

    aput v3, v0, v5

    iput v2, p0, Lcom/daaw/qj;->l:I

    iput v2, p0, Lcom/daaw/qj;->m:I

    const/high16 v0, 0x3f800000    # 1.0f

    iput v0, p0, Lcom/daaw/qj;->q:F

    iput v0, p0, Lcom/daaw/qj;->t:F

    iput v3, p0, Lcom/daaw/qj;->p:I

    iput v3, p0, Lcom/daaw/qj;->s:I

    iput v2, p0, Lcom/daaw/qj;->o:I

    iput v2, p0, Lcom/daaw/qj;->r:I

    iput-boolean v2, p0, Lcom/daaw/qj;->i:Z

    iput v1, p0, Lcom/daaw/qj;->u:I

    iput v0, p0, Lcom/daaw/qj;->v:F

    iput-boolean v2, p0, Lcom/daaw/qj;->k0:Z

    iput-boolean v2, p0, Lcom/daaw/qj;->l0:Z

    iget-object v0, p0, Lcom/daaw/qj;->g:[Z

    aput-boolean v5, v0, v2

    aput-boolean v5, v0, v5

    iput-boolean v2, p0, Lcom/daaw/qj;->A:Z

    iget-object v0, p0, Lcom/daaw/qj;->L:[Z

    aput-boolean v2, v0, v2

    aput-boolean v2, v0, v5

    return-void
.end method

.method public X(Lcom/daaw/gd;)V
    .locals 1

    iget-object v0, p0, Lcom/daaw/qj;->B:Lcom/daaw/lj;

    invoke-virtual {v0, p1}, Lcom/daaw/lj;->l(Lcom/daaw/gd;)V

    iget-object v0, p0, Lcom/daaw/qj;->C:Lcom/daaw/lj;

    invoke-virtual {v0, p1}, Lcom/daaw/lj;->l(Lcom/daaw/gd;)V

    iget-object v0, p0, Lcom/daaw/qj;->D:Lcom/daaw/lj;

    invoke-virtual {v0, p1}, Lcom/daaw/lj;->l(Lcom/daaw/gd;)V

    iget-object v0, p0, Lcom/daaw/qj;->E:Lcom/daaw/lj;

    invoke-virtual {v0, p1}, Lcom/daaw/lj;->l(Lcom/daaw/gd;)V

    iget-object v0, p0, Lcom/daaw/qj;->F:Lcom/daaw/lj;

    invoke-virtual {v0, p1}, Lcom/daaw/lj;->l(Lcom/daaw/gd;)V

    iget-object v0, p0, Lcom/daaw/qj;->I:Lcom/daaw/lj;

    invoke-virtual {v0, p1}, Lcom/daaw/lj;->l(Lcom/daaw/gd;)V

    iget-object v0, p0, Lcom/daaw/qj;->G:Lcom/daaw/lj;

    invoke-virtual {v0, p1}, Lcom/daaw/lj;->l(Lcom/daaw/gd;)V

    iget-object v0, p0, Lcom/daaw/qj;->H:Lcom/daaw/lj;

    invoke-virtual {v0, p1}, Lcom/daaw/lj;->l(Lcom/daaw/gd;)V

    return-void
.end method

.method public Y(I)V
    .locals 0

    iput p1, p0, Lcom/daaw/qj;->Y:I

    if-lez p1, :cond_0

    const/4 p1, 0x1

    goto :goto_0

    :cond_0
    const/4 p1, 0x0

    :goto_0
    iput-boolean p1, p0, Lcom/daaw/qj;->y:Z

    return-void
.end method

.method public Z(Ljava/lang/Object;)V
    .locals 0

    iput-object p1, p0, Lcom/daaw/qj;->d0:Ljava/lang/Object;

    return-void
.end method

.method public a0(Ljava/lang/String;)V
    .locals 0

    iput-object p1, p0, Lcom/daaw/qj;->g0:Ljava/lang/String;

    return-void
.end method

.method public b0(Ljava/lang/String;)V
    .locals 8

    const/4 v0, 0x0

    if-eqz p1, :cond_8

    invoke-virtual {p1}, Ljava/lang/String;->length()I

    move-result v1

    if-nez v1, :cond_0

    goto/16 :goto_2

    :cond_0
    const/4 v1, -0x1

    invoke-virtual {p1}, Ljava/lang/String;->length()I

    move-result v2

    const/16 v3, 0x2c

    invoke-virtual {p1, v3}, Ljava/lang/String;->indexOf(I)I

    move-result v3

    const/4 v4, 0x0

    const/4 v5, 0x1

    if-lez v3, :cond_3

    add-int/lit8 v6, v2, -0x1

    if-ge v3, v6, :cond_3

    invoke-virtual {p1, v4, v3}, Ljava/lang/String;->substring(II)Ljava/lang/String;

    move-result-object v6

    const-string v7, "W"

    invoke-virtual {v6, v7}, Ljava/lang/String;->equalsIgnoreCase(Ljava/lang/String;)Z

    move-result v7

    if-eqz v7, :cond_1

    const/4 v1, 0x0

    goto :goto_0

    :cond_1
    const-string v4, "H"

    invoke-virtual {v6, v4}, Ljava/lang/String;->equalsIgnoreCase(Ljava/lang/String;)Z

    move-result v4

    if-eqz v4, :cond_2

    const/4 v1, 0x1

    :cond_2
    :goto_0
    add-int/lit8 v4, v3, 0x1

    :cond_3
    const/16 v3, 0x3a

    invoke-virtual {p1, v3}, Ljava/lang/String;->indexOf(I)I

    move-result v3

    if-ltz v3, :cond_5

    sub-int/2addr v2, v5

    if-ge v3, v2, :cond_5

    invoke-virtual {p1, v4, v3}, Ljava/lang/String;->substring(II)Ljava/lang/String;

    move-result-object v2

    add-int/2addr v3, v5

    invoke-virtual {p1, v3}, Ljava/lang/String;->substring(I)Ljava/lang/String;

    move-result-object p1

    invoke-virtual {v2}, Ljava/lang/String;->length()I

    move-result v3

    if-lez v3, :cond_6

    invoke-virtual {p1}, Ljava/lang/String;->length()I

    move-result v3

    if-lez v3, :cond_6

    :try_start_0
    invoke-static {v2}, Ljava/lang/Float;->parseFloat(Ljava/lang/String;)F

    move-result v2

    invoke-static {p1}, Ljava/lang/Float;->parseFloat(Ljava/lang/String;)F

    move-result p1

    cmpl-float v3, v2, v0

    if-lez v3, :cond_6

    cmpl-float v3, p1, v0

    if-lez v3, :cond_6

    if-ne v1, v5, :cond_4

    div-float/2addr p1, v2

    invoke-static {p1}, Ljava/lang/Math;->abs(F)F

    move-result p1

    goto :goto_1

    :cond_4
    div-float/2addr v2, p1

    invoke-static {v2}, Ljava/lang/Math;->abs(F)F

    move-result p1
    :try_end_0
    .catch Ljava/lang/NumberFormatException; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_1

    :cond_5
    invoke-virtual {p1, v4}, Ljava/lang/String;->substring(I)Ljava/lang/String;

    move-result-object p1

    invoke-virtual {p1}, Ljava/lang/String;->length()I

    move-result v2

    if-lez v2, :cond_6

    :try_start_1
    invoke-static {p1}, Ljava/lang/Float;->parseFloat(Ljava/lang/String;)F

    move-result p1
    :try_end_1
    .catch Ljava/lang/NumberFormatException; {:try_start_1 .. :try_end_1} :catch_0

    goto :goto_1

    :catch_0
    :cond_6
    const/4 p1, 0x0

    :goto_1
    cmpl-float v0, p1, v0

    if-lez v0, :cond_7

    iput p1, p0, Lcom/daaw/qj;->Q:F

    iput v1, p0, Lcom/daaw/qj;->R:I

    :cond_7
    return-void

    :cond_8
    :goto_2
    iput v0, p0, Lcom/daaw/qj;->Q:F

    return-void
.end method

.method public c0(IIII)V
    .locals 1

    sub-int/2addr p3, p1

    sub-int/2addr p4, p2

    iput p1, p0, Lcom/daaw/qj;->S:I

    iput p2, p0, Lcom/daaw/qj;->T:I

    iget p1, p0, Lcom/daaw/qj;->f0:I

    const/4 p2, 0x0

    const/16 v0, 0x8

    if-ne p1, v0, :cond_0

    iput p2, p0, Lcom/daaw/qj;->O:I

    iput p2, p0, Lcom/daaw/qj;->P:I

    return-void

    :cond_0
    iget-object p1, p0, Lcom/daaw/qj;->M:[Lcom/daaw/qj$b;

    aget-object p2, p1, p2

    sget-object v0, Lcom/daaw/qj$b;->p:Lcom/daaw/qj$b;

    if-ne p2, v0, :cond_1

    iget p2, p0, Lcom/daaw/qj;->O:I

    if-ge p3, p2, :cond_1

    move p3, p2

    :cond_1
    const/4 p2, 0x1

    aget-object p1, p1, p2

    if-ne p1, v0, :cond_2

    iget p1, p0, Lcom/daaw/qj;->P:I

    if-ge p4, p1, :cond_2

    move p4, p1

    :cond_2
    iput p3, p0, Lcom/daaw/qj;->O:I

    iput p4, p0, Lcom/daaw/qj;->P:I

    iget p1, p0, Lcom/daaw/qj;->a0:I

    if-ge p4, p1, :cond_3

    iput p1, p0, Lcom/daaw/qj;->P:I

    :cond_3
    iget p1, p0, Lcom/daaw/qj;->Z:I

    if-ge p3, p1, :cond_4

    iput p1, p0, Lcom/daaw/qj;->O:I

    :cond_4
    return-void
.end method

.method public final d()V
    .locals 2

    iget-object v0, p0, Lcom/daaw/qj;->K:Ljava/util/ArrayList;

    iget-object v1, p0, Lcom/daaw/qj;->B:Lcom/daaw/lj;

    invoke-virtual {v0, v1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    iget-object v0, p0, Lcom/daaw/qj;->K:Ljava/util/ArrayList;

    iget-object v1, p0, Lcom/daaw/qj;->C:Lcom/daaw/lj;

    invoke-virtual {v0, v1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    iget-object v0, p0, Lcom/daaw/qj;->K:Ljava/util/ArrayList;

    iget-object v1, p0, Lcom/daaw/qj;->D:Lcom/daaw/lj;

    invoke-virtual {v0, v1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    iget-object v0, p0, Lcom/daaw/qj;->K:Ljava/util/ArrayList;

    iget-object v1, p0, Lcom/daaw/qj;->E:Lcom/daaw/lj;

    invoke-virtual {v0, v1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    iget-object v0, p0, Lcom/daaw/qj;->K:Ljava/util/ArrayList;

    iget-object v1, p0, Lcom/daaw/qj;->G:Lcom/daaw/lj;

    invoke-virtual {v0, v1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    iget-object v0, p0, Lcom/daaw/qj;->K:Ljava/util/ArrayList;

    iget-object v1, p0, Lcom/daaw/qj;->H:Lcom/daaw/lj;

    invoke-virtual {v0, v1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    iget-object v0, p0, Lcom/daaw/qj;->K:Ljava/util/ArrayList;

    iget-object v1, p0, Lcom/daaw/qj;->I:Lcom/daaw/lj;

    invoke-virtual {v0, v1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    iget-object v0, p0, Lcom/daaw/qj;->K:Ljava/util/ArrayList;

    iget-object v1, p0, Lcom/daaw/qj;->F:Lcom/daaw/lj;

    invoke-virtual {v0, v1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    return-void
.end method

.method public d0(Z)V
    .locals 0

    iput-boolean p1, p0, Lcom/daaw/qj;->y:Z

    return-void
.end method

.method public e()Z
    .locals 1

    instance-of v0, p0, Lcom/daaw/ru1;

    if-nez v0, :cond_1

    instance-of v0, p0, Lcom/daaw/k80;

    if-eqz v0, :cond_0

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    goto :goto_1

    :cond_1
    :goto_0
    const/4 v0, 0x1

    :goto_1
    return v0
.end method

.method public e0(I)V
    .locals 1

    iput p1, p0, Lcom/daaw/qj;->P:I

    iget v0, p0, Lcom/daaw/qj;->a0:I

    if-ge p1, v0, :cond_0

    iput v0, p0, Lcom/daaw/qj;->P:I

    :cond_0
    return-void
.end method

.method public f(Lcom/daaw/ak0;)V
    .locals 47

    move-object/from16 v13, p0

    move-object/from16 v9, p1

    iget-object v0, v13, Lcom/daaw/qj;->B:Lcom/daaw/lj;

    invoke-virtual {v9, v0}, Lcom/daaw/ak0;->q(Ljava/lang/Object;)Lcom/daaw/de1;

    move-result-object v7

    iget-object v0, v13, Lcom/daaw/qj;->D:Lcom/daaw/lj;

    invoke-virtual {v9, v0}, Lcom/daaw/ak0;->q(Ljava/lang/Object;)Lcom/daaw/de1;

    move-result-object v6

    iget-object v0, v13, Lcom/daaw/qj;->C:Lcom/daaw/lj;

    invoke-virtual {v9, v0}, Lcom/daaw/ak0;->q(Ljava/lang/Object;)Lcom/daaw/de1;

    move-result-object v4

    iget-object v0, v13, Lcom/daaw/qj;->E:Lcom/daaw/lj;

    invoke-virtual {v9, v0}, Lcom/daaw/ak0;->q(Ljava/lang/Object;)Lcom/daaw/de1;

    move-result-object v3

    iget-object v0, v13, Lcom/daaw/qj;->F:Lcom/daaw/lj;

    invoke-virtual {v9, v0}, Lcom/daaw/ak0;->q(Ljava/lang/Object;)Lcom/daaw/de1;

    move-result-object v1

    sget v0, Lcom/daaw/ak0;->q:I

    iget-object v0, v13, Lcom/daaw/qj;->e:Lcom/daaw/sb0;

    iget-object v2, v0, Lcom/daaw/kx1;->h:Lcom/daaw/ft;

    iget-boolean v5, v2, Lcom/daaw/ft;->j:Z

    const/16 v15, 0x8

    const/4 v14, 0x1

    const/4 v12, 0x0

    if-eqz v5, :cond_4

    iget-object v0, v0, Lcom/daaw/kx1;->i:Lcom/daaw/ft;

    iget-boolean v0, v0, Lcom/daaw/ft;->j:Z

    if-eqz v0, :cond_4

    iget-object v0, v13, Lcom/daaw/qj;->f:Lcom/daaw/ms1;

    iget-object v5, v0, Lcom/daaw/kx1;->h:Lcom/daaw/ft;

    iget-boolean v5, v5, Lcom/daaw/ft;->j:Z

    if-eqz v5, :cond_4

    iget-object v0, v0, Lcom/daaw/kx1;->i:Lcom/daaw/ft;

    iget-boolean v0, v0, Lcom/daaw/ft;->j:Z

    if-eqz v0, :cond_4

    iget v0, v2, Lcom/daaw/ft;->g:I

    invoke-virtual {v9, v7, v0}, Lcom/daaw/ak0;->f(Lcom/daaw/de1;I)V

    iget-object v0, v13, Lcom/daaw/qj;->e:Lcom/daaw/sb0;

    iget-object v0, v0, Lcom/daaw/kx1;->i:Lcom/daaw/ft;

    iget v0, v0, Lcom/daaw/ft;->g:I

    invoke-virtual {v9, v6, v0}, Lcom/daaw/ak0;->f(Lcom/daaw/de1;I)V

    iget-object v0, v13, Lcom/daaw/qj;->f:Lcom/daaw/ms1;

    iget-object v0, v0, Lcom/daaw/kx1;->h:Lcom/daaw/ft;

    iget v0, v0, Lcom/daaw/ft;->g:I

    invoke-virtual {v9, v4, v0}, Lcom/daaw/ak0;->f(Lcom/daaw/de1;I)V

    iget-object v0, v13, Lcom/daaw/qj;->f:Lcom/daaw/ms1;

    iget-object v0, v0, Lcom/daaw/kx1;->i:Lcom/daaw/ft;

    iget v0, v0, Lcom/daaw/ft;->g:I

    invoke-virtual {v9, v3, v0}, Lcom/daaw/ak0;->f(Lcom/daaw/de1;I)V

    iget-object v0, v13, Lcom/daaw/qj;->f:Lcom/daaw/ms1;

    iget-object v0, v0, Lcom/daaw/ms1;->k:Lcom/daaw/ft;

    iget v0, v0, Lcom/daaw/ft;->g:I

    invoke-virtual {v9, v1, v0}, Lcom/daaw/ak0;->f(Lcom/daaw/de1;I)V

    iget-object v0, v13, Lcom/daaw/qj;->N:Lcom/daaw/qj;

    if-eqz v0, :cond_3

    if-eqz v0, :cond_0

    iget-object v1, v0, Lcom/daaw/qj;->M:[Lcom/daaw/qj$b;

    aget-object v1, v1, v12

    sget-object v2, Lcom/daaw/qj$b;->q:Lcom/daaw/qj$b;

    if-ne v1, v2, :cond_0

    const/4 v1, 0x1

    goto :goto_0

    :cond_0
    const/4 v1, 0x0

    :goto_0
    if-eqz v0, :cond_1

    iget-object v0, v0, Lcom/daaw/qj;->M:[Lcom/daaw/qj$b;

    aget-object v0, v0, v14

    sget-object v2, Lcom/daaw/qj$b;->q:Lcom/daaw/qj$b;

    if-ne v0, v2, :cond_1

    const/4 v0, 0x1

    goto :goto_1

    :cond_1
    const/4 v0, 0x0

    :goto_1
    if-eqz v1, :cond_2

    iget-object v1, v13, Lcom/daaw/qj;->g:[Z

    aget-boolean v1, v1, v12

    if-eqz v1, :cond_2

    invoke-virtual/range {p0 .. p0}, Lcom/daaw/qj;->T()Z

    move-result v1

    if-nez v1, :cond_2

    iget-object v1, v13, Lcom/daaw/qj;->N:Lcom/daaw/qj;

    iget-object v1, v1, Lcom/daaw/qj;->D:Lcom/daaw/lj;

    invoke-virtual {v9, v1}, Lcom/daaw/ak0;->q(Ljava/lang/Object;)Lcom/daaw/de1;

    move-result-object v1

    invoke-virtual {v9, v1, v6, v12, v15}, Lcom/daaw/ak0;->h(Lcom/daaw/de1;Lcom/daaw/de1;II)V

    :cond_2
    if-eqz v0, :cond_3

    iget-object v0, v13, Lcom/daaw/qj;->g:[Z

    aget-boolean v0, v0, v14

    if-eqz v0, :cond_3

    invoke-virtual/range {p0 .. p0}, Lcom/daaw/qj;->V()Z

    move-result v0

    if-nez v0, :cond_3

    iget-object v0, v13, Lcom/daaw/qj;->N:Lcom/daaw/qj;

    iget-object v0, v0, Lcom/daaw/qj;->E:Lcom/daaw/lj;

    invoke-virtual {v9, v0}, Lcom/daaw/ak0;->q(Ljava/lang/Object;)Lcom/daaw/de1;

    move-result-object v0

    invoke-virtual {v9, v0, v3, v12, v15}, Lcom/daaw/ak0;->h(Lcom/daaw/de1;Lcom/daaw/de1;II)V

    :cond_3
    return-void

    :cond_4
    iget-object v0, v13, Lcom/daaw/qj;->N:Lcom/daaw/qj;

    if-eqz v0, :cond_b

    if-eqz v0, :cond_5

    iget-object v2, v0, Lcom/daaw/qj;->M:[Lcom/daaw/qj$b;

    aget-object v2, v2, v12

    sget-object v5, Lcom/daaw/qj$b;->q:Lcom/daaw/qj$b;

    if-ne v2, v5, :cond_5

    const/4 v2, 0x1

    goto :goto_2

    :cond_5
    const/4 v2, 0x0

    :goto_2
    if-eqz v0, :cond_6

    iget-object v0, v0, Lcom/daaw/qj;->M:[Lcom/daaw/qj$b;

    aget-object v0, v0, v14

    sget-object v5, Lcom/daaw/qj$b;->q:Lcom/daaw/qj$b;

    if-ne v0, v5, :cond_6

    const/4 v0, 0x1

    goto :goto_3

    :cond_6
    const/4 v0, 0x0

    :goto_3
    invoke-virtual {v13, v12}, Lcom/daaw/qj;->S(I)Z

    move-result v5

    if-eqz v5, :cond_7

    iget-object v5, v13, Lcom/daaw/qj;->N:Lcom/daaw/qj;

    check-cast v5, Lcom/daaw/rj;

    invoke-virtual {v5, v13, v12}, Lcom/daaw/rj;->K0(Lcom/daaw/qj;I)V

    const/4 v5, 0x1

    goto :goto_4

    :cond_7
    invoke-virtual/range {p0 .. p0}, Lcom/daaw/qj;->T()Z

    move-result v5

    :goto_4
    invoke-virtual {v13, v14}, Lcom/daaw/qj;->S(I)Z

    move-result v8

    if-eqz v8, :cond_8

    iget-object v8, v13, Lcom/daaw/qj;->N:Lcom/daaw/qj;

    check-cast v8, Lcom/daaw/rj;

    invoke-virtual {v8, v13, v14}, Lcom/daaw/rj;->K0(Lcom/daaw/qj;I)V

    const/4 v8, 0x1

    goto :goto_5

    :cond_8
    invoke-virtual/range {p0 .. p0}, Lcom/daaw/qj;->V()Z

    move-result v8

    :goto_5
    if-nez v5, :cond_9

    if-eqz v2, :cond_9

    iget v10, v13, Lcom/daaw/qj;->f0:I

    if-eq v10, v15, :cond_9

    iget-object v10, v13, Lcom/daaw/qj;->B:Lcom/daaw/lj;

    iget-object v10, v10, Lcom/daaw/lj;->d:Lcom/daaw/lj;

    if-nez v10, :cond_9

    iget-object v10, v13, Lcom/daaw/qj;->D:Lcom/daaw/lj;

    iget-object v10, v10, Lcom/daaw/lj;->d:Lcom/daaw/lj;

    if-nez v10, :cond_9

    iget-object v10, v13, Lcom/daaw/qj;->N:Lcom/daaw/qj;

    iget-object v10, v10, Lcom/daaw/qj;->D:Lcom/daaw/lj;

    invoke-virtual {v9, v10}, Lcom/daaw/ak0;->q(Ljava/lang/Object;)Lcom/daaw/de1;

    move-result-object v10

    invoke-virtual {v9, v10, v6, v12, v14}, Lcom/daaw/ak0;->h(Lcom/daaw/de1;Lcom/daaw/de1;II)V

    :cond_9
    if-nez v8, :cond_a

    if-eqz v0, :cond_a

    iget v10, v13, Lcom/daaw/qj;->f0:I

    if-eq v10, v15, :cond_a

    iget-object v10, v13, Lcom/daaw/qj;->C:Lcom/daaw/lj;

    iget-object v10, v10, Lcom/daaw/lj;->d:Lcom/daaw/lj;

    if-nez v10, :cond_a

    iget-object v10, v13, Lcom/daaw/qj;->E:Lcom/daaw/lj;

    iget-object v10, v10, Lcom/daaw/lj;->d:Lcom/daaw/lj;

    if-nez v10, :cond_a

    iget-object v10, v13, Lcom/daaw/qj;->F:Lcom/daaw/lj;

    if-nez v10, :cond_a

    iget-object v10, v13, Lcom/daaw/qj;->N:Lcom/daaw/qj;

    iget-object v10, v10, Lcom/daaw/qj;->E:Lcom/daaw/lj;

    invoke-virtual {v9, v10}, Lcom/daaw/ak0;->q(Ljava/lang/Object;)Lcom/daaw/de1;

    move-result-object v10

    invoke-virtual {v9, v10, v3, v12, v14}, Lcom/daaw/ak0;->h(Lcom/daaw/de1;Lcom/daaw/de1;II)V

    :cond_a
    move v11, v2

    move/from16 v28, v5

    move/from16 v27, v8

    goto :goto_6

    :cond_b
    const/4 v0, 0x0

    const/4 v11, 0x0

    const/16 v27, 0x0

    const/16 v28, 0x0

    :goto_6
    iget v2, v13, Lcom/daaw/qj;->O:I

    iget v5, v13, Lcom/daaw/qj;->Z:I

    if-ge v2, v5, :cond_c

    goto :goto_7

    :cond_c
    move v5, v2

    :goto_7
    iget v8, v13, Lcom/daaw/qj;->P:I

    iget v10, v13, Lcom/daaw/qj;->a0:I

    if-ge v8, v10, :cond_d

    goto :goto_8

    :cond_d
    move v10, v8

    :goto_8
    iget-object v15, v13, Lcom/daaw/qj;->M:[Lcom/daaw/qj$b;

    aget-object v14, v15, v12

    sget-object v12, Lcom/daaw/qj$b;->r:Lcom/daaw/qj$b;

    move-object/from16 v19, v1

    if-eq v14, v12, :cond_e

    const/4 v14, 0x1

    goto :goto_9

    :cond_e
    const/4 v14, 0x0

    :goto_9
    const/16 v17, 0x1

    aget-object v1, v15, v17

    move-object/from16 v20, v3

    if-eq v1, v12, :cond_f

    const/4 v1, 0x1

    goto :goto_a

    :cond_f
    const/4 v1, 0x0

    :goto_a
    iget v3, v13, Lcom/daaw/qj;->R:I

    iput v3, v13, Lcom/daaw/qj;->u:I

    move-object/from16 v21, v4

    iget v4, v13, Lcom/daaw/qj;->Q:F

    iput v4, v13, Lcom/daaw/qj;->v:F

    move/from16 v22, v5

    iget v5, v13, Lcom/daaw/qj;->l:I

    move/from16 v23, v10

    iget v10, v13, Lcom/daaw/qj;->m:I

    const/16 v24, 0x0

    const/16 v25, 0x4

    move-object/from16 v26, v6

    cmpl-float v24, v4, v24

    if-lez v24, :cond_19

    iget v6, v13, Lcom/daaw/qj;->f0:I

    move-object/from16 v30, v7

    const/16 v7, 0x8

    if-eq v6, v7, :cond_1a

    const/4 v6, 0x0

    aget-object v7, v15, v6

    if-ne v7, v12, :cond_10

    if-nez v5, :cond_10

    const/4 v5, 0x3

    :cond_10
    const/4 v7, 0x1

    aget-object v6, v15, v7

    if-ne v6, v12, :cond_11

    if-nez v10, :cond_11

    const/4 v6, 0x0

    const/4 v10, 0x3

    goto :goto_b

    :cond_11
    const/4 v6, 0x0

    :goto_b
    aget-object v9, v15, v6

    if-ne v9, v12, :cond_12

    aget-object v6, v15, v7

    if-ne v6, v12, :cond_12

    const/4 v6, 0x3

    if-ne v5, v6, :cond_13

    if-ne v10, v6, :cond_13

    invoke-virtual {v13, v11, v0, v14, v1}, Lcom/daaw/qj;->E0(ZZZZ)V

    goto :goto_c

    :cond_12
    const/4 v6, 0x3

    :cond_13
    const/4 v1, 0x0

    aget-object v7, v15, v1

    if-ne v7, v12, :cond_15

    if-ne v5, v6, :cond_15

    iput v1, v13, Lcom/daaw/qj;->u:I

    int-to-float v1, v8

    mul-float v4, v4, v1

    float-to-int v1, v4

    const/4 v6, 0x1

    aget-object v2, v15, v6

    if-eq v2, v12, :cond_14

    move v5, v1

    move/from16 v32, v10

    move/from16 v31, v23

    const/4 v9, 0x0

    const/16 v18, 0x0

    const/16 v33, 0x4

    goto :goto_e

    :cond_14
    move/from16 v33, v5

    move/from16 v32, v10

    move/from16 v31, v23

    const/4 v9, 0x1

    const/16 v18, 0x0

    move v5, v1

    goto :goto_e

    :cond_15
    const/4 v6, 0x1

    aget-object v1, v15, v6

    if-ne v1, v12, :cond_18

    const/4 v1, 0x3

    if-ne v10, v1, :cond_18

    iput v6, v13, Lcom/daaw/qj;->u:I

    const/4 v1, -0x1

    if-ne v3, v1, :cond_16

    const/high16 v1, 0x3f800000    # 1.0f

    div-float/2addr v1, v4

    iput v1, v13, Lcom/daaw/qj;->v:F

    :cond_16
    iget v1, v13, Lcom/daaw/qj;->v:F

    int-to-float v2, v2

    mul-float v1, v1, v2

    float-to-int v1, v1

    const/16 v18, 0x0

    aget-object v2, v15, v18

    move/from16 v31, v1

    move/from16 v33, v5

    if-eq v2, v12, :cond_17

    move/from16 v5, v22

    const/4 v9, 0x0

    const/16 v32, 0x4

    goto :goto_e

    :cond_17
    move/from16 v32, v10

    move/from16 v5, v22

    goto :goto_d

    :cond_18
    :goto_c
    const/16 v18, 0x0

    move/from16 v33, v5

    move/from16 v32, v10

    move/from16 v5, v22

    move/from16 v31, v23

    :goto_d
    const/4 v9, 0x1

    goto :goto_e

    :cond_19
    move-object/from16 v30, v7

    :cond_1a
    const/16 v18, 0x0

    move/from16 v33, v5

    move/from16 v32, v10

    move/from16 v5, v22

    move/from16 v31, v23

    const/4 v9, 0x0

    :goto_e
    iget-object v1, v13, Lcom/daaw/qj;->n:[I

    aput v33, v1, v18

    const/4 v2, 0x1

    aput v32, v1, v2

    iput-boolean v9, v13, Lcom/daaw/qj;->i:Z

    if-eqz v9, :cond_1c

    iget v1, v13, Lcom/daaw/qj;->u:I

    const/4 v6, -0x1

    if-eqz v1, :cond_1b

    if-ne v1, v6, :cond_1d

    :cond_1b
    const/16 v22, 0x1

    goto :goto_f

    :cond_1c
    const/4 v6, -0x1

    :cond_1d
    const/16 v22, 0x0

    :goto_f
    iget-object v1, v13, Lcom/daaw/qj;->M:[Lcom/daaw/qj$b;

    const/4 v2, 0x0

    aget-object v1, v1, v2

    sget-object v7, Lcom/daaw/qj$b;->q:Lcom/daaw/qj$b;

    if-ne v1, v7, :cond_1e

    instance-of v1, v13, Lcom/daaw/rj;

    if-eqz v1, :cond_1e

    const/16 v29, 0x1

    goto :goto_10

    :cond_1e
    const/16 v29, 0x0

    :goto_10
    if-eqz v29, :cond_1f

    const/16 v34, 0x0

    goto :goto_11

    :cond_1f
    move/from16 v34, v5

    :goto_11
    iget-object v1, v13, Lcom/daaw/qj;->I:Lcom/daaw/lj;

    invoke-virtual {v1}, Lcom/daaw/lj;->i()Z

    move-result v1

    const/4 v3, 0x1

    xor-int/lit8 v35, v1, 0x1

    iget-object v1, v13, Lcom/daaw/qj;->L:[Z

    const/4 v2, 0x0

    aget-boolean v36, v1, v2

    aget-boolean v37, v1, v3

    iget v1, v13, Lcom/daaw/qj;->j:I

    const/4 v4, 0x2

    const/16 v38, 0x0

    if-eq v1, v4, :cond_25

    iget-object v1, v13, Lcom/daaw/qj;->e:Lcom/daaw/sb0;

    iget-object v2, v1, Lcom/daaw/kx1;->h:Lcom/daaw/ft;

    iget-boolean v5, v2, Lcom/daaw/ft;->j:Z

    if-eqz v5, :cond_22

    iget-object v1, v1, Lcom/daaw/kx1;->i:Lcom/daaw/ft;

    iget-boolean v1, v1, Lcom/daaw/ft;->j:Z

    if-nez v1, :cond_20

    goto :goto_12

    :cond_20
    iget v1, v2, Lcom/daaw/ft;->g:I

    move-object/from16 v15, p1

    move-object/from16 v14, v30

    invoke-virtual {v15, v14, v1}, Lcom/daaw/ak0;->f(Lcom/daaw/de1;I)V

    iget-object v1, v13, Lcom/daaw/qj;->e:Lcom/daaw/sb0;

    iget-object v1, v1, Lcom/daaw/kx1;->i:Lcom/daaw/ft;

    iget v1, v1, Lcom/daaw/ft;->g:I

    move-object/from16 v12, v26

    invoke-virtual {v15, v12, v1}, Lcom/daaw/ak0;->f(Lcom/daaw/de1;I)V

    iget-object v1, v13, Lcom/daaw/qj;->N:Lcom/daaw/qj;

    if-eqz v1, :cond_21

    if-eqz v11, :cond_21

    iget-object v1, v13, Lcom/daaw/qj;->g:[Z

    const/4 v2, 0x0

    aget-boolean v1, v1, v2

    if-eqz v1, :cond_21

    invoke-virtual/range {p0 .. p0}, Lcom/daaw/qj;->T()Z

    move-result v1

    if-nez v1, :cond_21

    iget-object v1, v13, Lcom/daaw/qj;->N:Lcom/daaw/qj;

    iget-object v1, v1, Lcom/daaw/qj;->D:Lcom/daaw/lj;

    invoke-virtual {v15, v1}, Lcom/daaw/ak0;->q(Ljava/lang/Object;)Lcom/daaw/de1;

    move-result-object v1

    const/16 v10, 0x8

    invoke-virtual {v15, v1, v12, v2, v10}, Lcom/daaw/ak0;->h(Lcom/daaw/de1;Lcom/daaw/de1;II)V

    :cond_21
    move/from16 v41, v0

    move-object/from16 v45, v7

    move/from16 v46, v9

    move/from16 v30, v11

    move-object/from16 v39, v12

    move-object/from16 v40, v14

    move-object/from16 v42, v19

    move-object/from16 v43, v20

    move-object/from16 v44, v21

    goto/16 :goto_16

    :cond_22
    :goto_12
    move-object/from16 v15, p1

    move-object/from16 v12, v26

    move-object/from16 v14, v30

    const/16 v10, 0x8

    iget-object v1, v13, Lcom/daaw/qj;->N:Lcom/daaw/qj;

    if-eqz v1, :cond_23

    iget-object v1, v1, Lcom/daaw/qj;->D:Lcom/daaw/lj;

    invoke-virtual {v15, v1}, Lcom/daaw/ak0;->q(Ljava/lang/Object;)Lcom/daaw/de1;

    move-result-object v1

    move-object/from16 v17, v1

    goto :goto_13

    :cond_23
    move-object/from16 v17, v38

    :goto_13
    iget-object v1, v13, Lcom/daaw/qj;->N:Lcom/daaw/qj;

    if-eqz v1, :cond_24

    iget-object v1, v1, Lcom/daaw/qj;->B:Lcom/daaw/lj;

    invoke-virtual {v15, v1}, Lcom/daaw/ak0;->q(Ljava/lang/Object;)Lcom/daaw/de1;

    move-result-object v1

    move-object/from16 v26, v1

    goto :goto_14

    :cond_24
    move-object/from16 v26, v38

    :goto_14
    const/4 v2, 0x1

    iget-object v1, v13, Lcom/daaw/qj;->g:[Z

    const/16 v16, 0x0

    aget-boolean v5, v1, v16

    iget-object v1, v13, Lcom/daaw/qj;->M:[Lcom/daaw/qj$b;

    aget-object v8, v1, v16

    iget-object v1, v13, Lcom/daaw/qj;->B:Lcom/daaw/lj;

    const/16 v18, 0x8

    move-object v10, v1

    iget-object v1, v13, Lcom/daaw/qj;->D:Lcom/daaw/lj;

    move/from16 v30, v11

    move-object v11, v1

    iget v1, v13, Lcom/daaw/qj;->S:I

    move-object/from16 v39, v12

    const/4 v2, 0x0

    move v12, v1

    iget v1, v13, Lcom/daaw/qj;->Z:I

    move-object/from16 v40, v14

    move v14, v1

    iget-object v1, v13, Lcom/daaw/qj;->w:[I

    aget v1, v1, v2

    move v15, v1

    iget v1, v13, Lcom/daaw/qj;->b0:F

    move/from16 v16, v1

    iget v1, v13, Lcom/daaw/qj;->o:I

    move/from16 v23, v1

    iget v1, v13, Lcom/daaw/qj;->p:I

    move/from16 v24, v1

    iget v1, v13, Lcom/daaw/qj;->q:F

    move/from16 v25, v1

    move/from16 v41, v0

    move-object/from16 v0, p0

    move-object/from16 v42, v19

    move-object/from16 v1, p1

    move-object/from16 v43, v20

    move/from16 v3, v30

    move-object/from16 v44, v21

    move/from16 v4, v41

    move-object/from16 v6, v26

    move-object/from16 v45, v7

    move-object/from16 v7, v17

    move/from16 v46, v9

    move/from16 v9, v29

    move/from16 v13, v34

    move/from16 v17, v22

    move/from16 v18, v28

    move/from16 v19, v27

    move/from16 v20, v36

    move/from16 v21, v33

    move/from16 v22, v32

    move/from16 v26, v35

    const/4 v2, 0x1

    invoke-virtual/range {v0 .. v26}, Lcom/daaw/qj;->h(Lcom/daaw/ak0;ZZZZLcom/daaw/de1;Lcom/daaw/de1;Lcom/daaw/qj$b;ZLcom/daaw/lj;Lcom/daaw/lj;IIIIFZZZZIIIIFZ)V

    goto :goto_15

    :cond_25
    move/from16 v41, v0

    move-object/from16 v45, v7

    move/from16 v46, v9

    move-object/from16 v42, v19

    move-object/from16 v43, v20

    move-object/from16 v44, v21

    move-object/from16 v39, v26

    move-object/from16 v40, v30

    move/from16 v30, v11

    :goto_15
    move-object/from16 v13, p0

    :goto_16
    iget-object v0, v13, Lcom/daaw/qj;->f:Lcom/daaw/ms1;

    iget-object v1, v0, Lcom/daaw/kx1;->h:Lcom/daaw/ft;

    iget-boolean v2, v1, Lcom/daaw/ft;->j:Z

    if-eqz v2, :cond_28

    iget-object v0, v0, Lcom/daaw/kx1;->i:Lcom/daaw/ft;

    iget-boolean v0, v0, Lcom/daaw/ft;->j:Z

    if-eqz v0, :cond_28

    iget v0, v1, Lcom/daaw/ft;->g:I

    move-object/from16 v9, p1

    move-object/from16 v7, v44

    invoke-virtual {v9, v7, v0}, Lcom/daaw/ak0;->f(Lcom/daaw/de1;I)V

    iget-object v0, v13, Lcom/daaw/qj;->f:Lcom/daaw/ms1;

    iget-object v0, v0, Lcom/daaw/kx1;->i:Lcom/daaw/ft;

    iget v0, v0, Lcom/daaw/ft;->g:I

    move-object/from16 v6, v43

    invoke-virtual {v9, v6, v0}, Lcom/daaw/ak0;->f(Lcom/daaw/de1;I)V

    iget-object v0, v13, Lcom/daaw/qj;->f:Lcom/daaw/ms1;

    iget-object v0, v0, Lcom/daaw/ms1;->k:Lcom/daaw/ft;

    iget v0, v0, Lcom/daaw/ft;->g:I

    move-object/from16 v1, v42

    invoke-virtual {v9, v1, v0}, Lcom/daaw/ak0;->f(Lcom/daaw/de1;I)V

    iget-object v0, v13, Lcom/daaw/qj;->N:Lcom/daaw/qj;

    if-eqz v0, :cond_27

    if-nez v27, :cond_27

    if-eqz v41, :cond_27

    iget-object v2, v13, Lcom/daaw/qj;->g:[Z

    const/4 v4, 0x1

    aget-boolean v2, v2, v4

    if-eqz v2, :cond_26

    iget-object v0, v0, Lcom/daaw/qj;->E:Lcom/daaw/lj;

    invoke-virtual {v9, v0}, Lcom/daaw/ak0;->q(Ljava/lang/Object;)Lcom/daaw/de1;

    move-result-object v0

    const/16 v2, 0x8

    const/4 v3, 0x0

    invoke-virtual {v9, v0, v6, v3, v2}, Lcom/daaw/ak0;->h(Lcom/daaw/de1;Lcom/daaw/de1;II)V

    goto :goto_17

    :cond_26
    const/16 v2, 0x8

    const/4 v3, 0x0

    goto :goto_17

    :cond_27
    const/16 v2, 0x8

    const/4 v3, 0x0

    const/4 v4, 0x1

    :goto_17
    const/4 v14, 0x0

    goto :goto_18

    :cond_28
    move-object/from16 v9, p1

    move-object/from16 v1, v42

    move-object/from16 v6, v43

    move-object/from16 v7, v44

    const/16 v2, 0x8

    const/4 v3, 0x0

    const/4 v4, 0x1

    const/4 v14, 0x1

    :goto_18
    iget v0, v13, Lcom/daaw/qj;->k:I

    const/4 v5, 0x2

    if-ne v0, v5, :cond_29

    const/4 v12, 0x0

    goto :goto_19

    :cond_29
    move v12, v14

    :goto_19
    if-eqz v12, :cond_34

    iget-object v0, v13, Lcom/daaw/qj;->M:[Lcom/daaw/qj$b;

    aget-object v0, v0, v4

    move-object/from16 v5, v45

    if-ne v0, v5, :cond_2a

    instance-of v0, v13, Lcom/daaw/rj;

    if-eqz v0, :cond_2a

    const/16 v17, 0x1

    goto :goto_1a

    :cond_2a
    const/16 v17, 0x0

    :goto_1a
    if-eqz v17, :cond_2b

    const/16 v31, 0x0

    :cond_2b
    if-eqz v46, :cond_2d

    iget v0, v13, Lcom/daaw/qj;->u:I

    if-eq v0, v4, :cond_2c

    const/4 v5, -0x1

    if-ne v0, v5, :cond_2d

    :cond_2c
    const/16 v18, 0x1

    goto :goto_1b

    :cond_2d
    const/16 v18, 0x0

    :goto_1b
    iget-object v0, v13, Lcom/daaw/qj;->N:Lcom/daaw/qj;

    if-eqz v0, :cond_2e

    iget-object v0, v0, Lcom/daaw/qj;->E:Lcom/daaw/lj;

    invoke-virtual {v9, v0}, Lcom/daaw/ak0;->q(Ljava/lang/Object;)Lcom/daaw/de1;

    move-result-object v0

    goto :goto_1c

    :cond_2e
    move-object/from16 v0, v38

    :goto_1c
    iget-object v5, v13, Lcom/daaw/qj;->N:Lcom/daaw/qj;

    if-eqz v5, :cond_2f

    iget-object v5, v5, Lcom/daaw/qj;->C:Lcom/daaw/lj;

    invoke-virtual {v9, v5}, Lcom/daaw/ak0;->q(Ljava/lang/Object;)Lcom/daaw/de1;

    move-result-object v5

    move-object/from16 v38, v5

    :cond_2f
    iget v5, v13, Lcom/daaw/qj;->Y:I

    if-gtz v5, :cond_30

    iget v5, v13, Lcom/daaw/qj;->f0:I

    if-ne v5, v2, :cond_33

    :cond_30
    invoke-virtual/range {p0 .. p0}, Lcom/daaw/qj;->l()I

    move-result v5

    invoke-virtual {v9, v1, v7, v5, v2}, Lcom/daaw/ak0;->e(Lcom/daaw/de1;Lcom/daaw/de1;II)Lcom/daaw/i6;

    iget-object v5, v13, Lcom/daaw/qj;->F:Lcom/daaw/lj;

    iget-object v5, v5, Lcom/daaw/lj;->d:Lcom/daaw/lj;

    if-eqz v5, :cond_32

    invoke-virtual {v9, v5}, Lcom/daaw/ak0;->q(Ljava/lang/Object;)Lcom/daaw/de1;

    move-result-object v5

    invoke-virtual {v9, v1, v5, v3, v2}, Lcom/daaw/ak0;->e(Lcom/daaw/de1;Lcom/daaw/de1;II)Lcom/daaw/i6;

    if-eqz v41, :cond_31

    iget-object v1, v13, Lcom/daaw/qj;->E:Lcom/daaw/lj;

    invoke-virtual {v9, v1}, Lcom/daaw/ak0;->q(Ljava/lang/Object;)Lcom/daaw/de1;

    move-result-object v1

    const/4 v2, 0x5

    invoke-virtual {v9, v0, v1, v3, v2}, Lcom/daaw/ak0;->h(Lcom/daaw/de1;Lcom/daaw/de1;II)V

    :cond_31
    const/16 v26, 0x0

    goto :goto_1d

    :cond_32
    iget v5, v13, Lcom/daaw/qj;->f0:I

    if-ne v5, v2, :cond_33

    invoke-virtual {v9, v1, v7, v3, v2}, Lcom/daaw/ak0;->e(Lcom/daaw/de1;Lcom/daaw/de1;II)Lcom/daaw/i6;

    :cond_33
    move/from16 v26, v35

    :goto_1d
    const/4 v2, 0x0

    iget-object v1, v13, Lcom/daaw/qj;->g:[Z

    aget-boolean v5, v1, v4

    iget-object v1, v13, Lcom/daaw/qj;->M:[Lcom/daaw/qj$b;

    aget-object v8, v1, v4

    iget-object v10, v13, Lcom/daaw/qj;->C:Lcom/daaw/lj;

    iget-object v11, v13, Lcom/daaw/qj;->E:Lcom/daaw/lj;

    iget v12, v13, Lcom/daaw/qj;->T:I

    iget v14, v13, Lcom/daaw/qj;->a0:I

    iget-object v1, v13, Lcom/daaw/qj;->w:[I

    aget v15, v1, v4

    iget v1, v13, Lcom/daaw/qj;->c0:F

    move/from16 v16, v1

    iget v1, v13, Lcom/daaw/qj;->r:I

    move/from16 v23, v1

    iget v1, v13, Lcom/daaw/qj;->s:I

    move/from16 v24, v1

    iget v1, v13, Lcom/daaw/qj;->t:F

    move/from16 v25, v1

    move-object/from16 v19, v0

    move-object/from16 v0, p0

    move-object/from16 v1, p1

    move/from16 v3, v41

    move/from16 v4, v30

    move-object/from16 v29, v6

    move-object/from16 v6, v38

    move-object/from16 v30, v7

    move-object/from16 v7, v19

    move/from16 v9, v17

    move/from16 v13, v31

    move/from16 v17, v18

    move/from16 v18, v27

    move/from16 v19, v28

    move/from16 v20, v37

    move/from16 v21, v32

    move/from16 v22, v33

    invoke-virtual/range {v0 .. v26}, Lcom/daaw/qj;->h(Lcom/daaw/ak0;ZZZZLcom/daaw/de1;Lcom/daaw/de1;Lcom/daaw/qj$b;ZLcom/daaw/lj;Lcom/daaw/lj;IIIIFZZZZIIIIFZ)V

    goto :goto_1e

    :cond_34
    move-object/from16 v29, v6

    move-object/from16 v30, v7

    :goto_1e
    if-eqz v46, :cond_36

    const/16 v6, 0x8

    move-object/from16 v7, p0

    iget v0, v7, Lcom/daaw/qj;->u:I

    const/4 v1, 0x1

    iget v5, v7, Lcom/daaw/qj;->v:F

    if-ne v0, v1, :cond_35

    move-object/from16 v0, p1

    move-object/from16 v1, v29

    move-object/from16 v2, v30

    move-object/from16 v3, v39

    move-object/from16 v4, v40

    goto :goto_1f

    :cond_35
    const/16 v6, 0x8

    move-object/from16 v0, p1

    move-object/from16 v1, v39

    move-object/from16 v2, v40

    move-object/from16 v3, v29

    move-object/from16 v4, v30

    :goto_1f
    invoke-virtual/range {v0 .. v6}, Lcom/daaw/ak0;->k(Lcom/daaw/de1;Lcom/daaw/de1;Lcom/daaw/de1;Lcom/daaw/de1;FI)V

    goto :goto_20

    :cond_36
    move-object/from16 v7, p0

    :goto_20
    iget-object v0, v7, Lcom/daaw/qj;->I:Lcom/daaw/lj;

    invoke-virtual {v0}, Lcom/daaw/lj;->i()Z

    move-result v0

    if-eqz v0, :cond_37

    iget-object v0, v7, Lcom/daaw/qj;->I:Lcom/daaw/lj;

    invoke-virtual {v0}, Lcom/daaw/lj;->f()Lcom/daaw/lj;

    move-result-object v0

    invoke-virtual {v0}, Lcom/daaw/lj;->d()Lcom/daaw/qj;

    move-result-object v0

    iget v1, v7, Lcom/daaw/qj;->x:F

    const/high16 v2, 0x42b40000    # 90.0f

    add-float/2addr v1, v2

    float-to-double v1, v1

    invoke-static {v1, v2}, Ljava/lang/Math;->toRadians(D)D

    move-result-wide v1

    double-to-float v1, v1

    iget-object v2, v7, Lcom/daaw/qj;->I:Lcom/daaw/lj;

    invoke-virtual {v2}, Lcom/daaw/lj;->b()I

    move-result v2

    move-object/from16 v3, p1

    invoke-virtual {v3, v7, v0, v1, v2}, Lcom/daaw/ak0;->b(Lcom/daaw/qj;Lcom/daaw/qj;FI)V

    :cond_37
    return-void
.end method

.method public f0(F)V
    .locals 0

    iput p1, p0, Lcom/daaw/qj;->b0:F

    return-void
.end method

.method public g()Z
    .locals 2

    iget v0, p0, Lcom/daaw/qj;->f0:I

    const/16 v1, 0x8

    if-eq v0, v1, :cond_0

    const/4 v0, 0x1

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    return v0
.end method

.method public g0(I)V
    .locals 0

    iput p1, p0, Lcom/daaw/qj;->m0:I

    return-void
.end method

.method public final h(Lcom/daaw/ak0;ZZZZLcom/daaw/de1;Lcom/daaw/de1;Lcom/daaw/qj$b;ZLcom/daaw/lj;Lcom/daaw/lj;IIIIFZZZZIIIIFZ)V
    .locals 31

    move-object/from16 v0, p0

    move-object/from16 v10, p1

    move-object/from16 v11, p6

    move-object/from16 v12, p7

    move-object/from16 v13, p10

    move-object/from16 v14, p11

    move/from16 v15, p14

    move/from16 v1, p15

    move/from16 v2, p22

    move/from16 v3, p23

    move/from16 v4, p24

    invoke-virtual {v10, v13}, Lcom/daaw/ak0;->q(Ljava/lang/Object;)Lcom/daaw/de1;

    move-result-object v9

    invoke-virtual {v10, v14}, Lcom/daaw/ak0;->q(Ljava/lang/Object;)Lcom/daaw/de1;

    move-result-object v8

    invoke-virtual/range {p10 .. p10}, Lcom/daaw/lj;->f()Lcom/daaw/lj;

    move-result-object v5

    invoke-virtual {v10, v5}, Lcom/daaw/ak0;->q(Ljava/lang/Object;)Lcom/daaw/de1;

    move-result-object v7

    invoke-virtual/range {p11 .. p11}, Lcom/daaw/lj;->f()Lcom/daaw/lj;

    move-result-object v5

    invoke-virtual {v10, v5}, Lcom/daaw/ak0;->q(Ljava/lang/Object;)Lcom/daaw/de1;

    move-result-object v6

    invoke-static {}, Lcom/daaw/ak0;->w()Lcom/daaw/dq0;

    invoke-virtual/range {p10 .. p10}, Lcom/daaw/lj;->i()Z

    move-result v16

    invoke-virtual/range {p11 .. p11}, Lcom/daaw/lj;->i()Z

    move-result v17

    iget-object v5, v0, Lcom/daaw/qj;->I:Lcom/daaw/lj;

    invoke-virtual {v5}, Lcom/daaw/lj;->i()Z

    move-result v18

    if-eqz v17, :cond_0

    add-int/lit8 v5, v16, 0x1

    goto :goto_0

    :cond_0
    move/from16 v5, v16

    :goto_0
    if-eqz v18, :cond_1

    add-int/lit8 v5, v5, 0x1

    :cond_1
    if-eqz p17, :cond_2

    const/16 v19, 0x3

    goto :goto_1

    :cond_2
    move/from16 v19, p21

    :goto_1
    sget-object v20, Lcom/daaw/qj$a;->b:[I

    invoke-virtual/range {p8 .. p8}, Ljava/lang/Enum;->ordinal()I

    move-result v21

    aget v12, v20, v21

    const/4 v2, 0x1

    if-eq v12, v2, :cond_3

    const/4 v2, 0x2

    if-eq v12, v2, :cond_3

    const/4 v2, 0x3

    if-eq v12, v2, :cond_3

    const/4 v2, 0x4

    if-eq v12, v2, :cond_4

    :cond_3
    move/from16 v12, v19

    :goto_2
    const/16 v19, 0x0

    goto :goto_3

    :cond_4
    move/from16 v12, v19

    if-ne v12, v2, :cond_5

    goto :goto_2

    :cond_5
    const/16 v19, 0x1

    :goto_3
    iget v2, v0, Lcom/daaw/qj;->f0:I

    const/16 v14, 0x8

    if-ne v2, v14, :cond_6

    const/4 v2, 0x0

    const/16 v19, 0x0

    goto :goto_4

    :cond_6
    move/from16 v2, p13

    :goto_4
    if-eqz p26, :cond_8

    if-nez v16, :cond_7

    if-nez v17, :cond_7

    if-nez v18, :cond_7

    move/from16 v14, p12

    invoke-virtual {v10, v9, v14}, Lcom/daaw/ak0;->f(Lcom/daaw/de1;I)V

    goto :goto_5

    :cond_7
    if-eqz v16, :cond_8

    if-nez v17, :cond_8

    invoke-virtual/range {p10 .. p10}, Lcom/daaw/lj;->b()I

    move-result v14

    move-object/from16 v23, v6

    const/16 v6, 0x8

    invoke-virtual {v10, v9, v7, v14, v6}, Lcom/daaw/ak0;->e(Lcom/daaw/de1;Lcom/daaw/de1;II)Lcom/daaw/i6;

    goto :goto_6

    :cond_8
    :goto_5
    move-object/from16 v23, v6

    const/16 v6, 0x8

    :goto_6
    if-nez v19, :cond_c

    if-eqz p9, :cond_a

    const/4 v6, 0x0

    const/4 v14, 0x3

    invoke-virtual {v10, v8, v9, v6, v14}, Lcom/daaw/ak0;->e(Lcom/daaw/de1;Lcom/daaw/de1;II)Lcom/daaw/i6;

    const/16 v6, 0x8

    if-lez v15, :cond_9

    invoke-virtual {v10, v8, v9, v15, v6}, Lcom/daaw/ak0;->h(Lcom/daaw/de1;Lcom/daaw/de1;II)V

    :cond_9
    const v2, 0x7fffffff

    if-ge v1, v2, :cond_b

    invoke-virtual {v10, v8, v9, v1, v6}, Lcom/daaw/ak0;->j(Lcom/daaw/de1;Lcom/daaw/de1;II)V

    goto :goto_7

    :cond_a
    invoke-virtual {v10, v8, v9, v2, v6}, Lcom/daaw/ak0;->e(Lcom/daaw/de1;Lcom/daaw/de1;II)Lcom/daaw/i6;

    :cond_b
    :goto_7
    move/from16 v24, v3

    move v1, v4

    move-object v15, v7

    move-object v2, v8

    :goto_8
    move/from16 v25, v19

    move-object/from16 v14, v23

    move/from16 v19, p5

    :goto_9
    move/from16 v23, v5

    goto/16 :goto_12

    :cond_c
    const/4 v1, 0x2

    if-eq v5, v1, :cond_f

    if-nez p17, :cond_f

    const/4 v1, 0x1

    if-eq v12, v1, :cond_d

    if-nez v12, :cond_f

    :cond_d
    invoke-static {v3, v2}, Ljava/lang/Math;->max(II)I

    move-result v1

    if-lez v4, :cond_e

    invoke-static {v4, v1}, Ljava/lang/Math;->min(II)I

    move-result v1

    :cond_e
    const/16 v2, 0x8

    invoke-virtual {v10, v8, v9, v1, v2}, Lcom/daaw/ak0;->e(Lcom/daaw/de1;Lcom/daaw/de1;II)Lcom/daaw/i6;

    move/from16 v19, p5

    move/from16 v24, v3

    move v1, v4

    move-object v15, v7

    move-object v2, v8

    move-object/from16 v14, v23

    const/16 v25, 0x0

    goto :goto_9

    :cond_f
    const/4 v1, -0x2

    if-ne v3, v1, :cond_10

    move v14, v2

    goto :goto_a

    :cond_10
    move v14, v3

    :goto_a
    if-ne v4, v1, :cond_11

    move v1, v2

    goto :goto_b

    :cond_11
    move v1, v4

    :goto_b
    if-lez v2, :cond_12

    const/4 v3, 0x1

    if-eq v12, v3, :cond_12

    const/4 v2, 0x0

    :cond_12
    if-lez v14, :cond_13

    const/16 v3, 0x8

    invoke-virtual {v10, v8, v9, v14, v3}, Lcom/daaw/ak0;->h(Lcom/daaw/de1;Lcom/daaw/de1;II)V

    invoke-static {v2, v14}, Ljava/lang/Math;->max(II)I

    move-result v2

    :cond_13
    if-lez v1, :cond_16

    if-eqz p3, :cond_14

    const/4 v3, 0x1

    if-ne v12, v3, :cond_14

    const/4 v3, 0x0

    goto :goto_c

    :cond_14
    const/4 v3, 0x1

    :goto_c
    if-eqz v3, :cond_15

    const/16 v3, 0x8

    invoke-virtual {v10, v8, v9, v1, v3}, Lcom/daaw/ak0;->j(Lcom/daaw/de1;Lcom/daaw/de1;II)V

    goto :goto_d

    :cond_15
    const/16 v3, 0x8

    :goto_d
    invoke-static {v2, v1}, Ljava/lang/Math;->min(II)I

    move-result v2

    goto :goto_e

    :cond_16
    const/16 v3, 0x8

    :goto_e
    const/4 v4, 0x1

    if-ne v12, v4, :cond_18

    if-eqz p3, :cond_17

    invoke-virtual {v10, v8, v9, v2, v3}, Lcom/daaw/ak0;->e(Lcom/daaw/de1;Lcom/daaw/de1;II)Lcom/daaw/i6;

    goto :goto_f

    :cond_17
    const/4 v4, 0x5

    invoke-virtual {v10, v8, v9, v2, v4}, Lcom/daaw/ak0;->e(Lcom/daaw/de1;Lcom/daaw/de1;II)Lcom/daaw/i6;

    invoke-virtual {v10, v8, v9, v2, v3}, Lcom/daaw/ak0;->j(Lcom/daaw/de1;Lcom/daaw/de1;II)V

    :goto_f
    move-object v15, v7

    move-object v2, v8

    move/from16 v24, v14

    goto :goto_8

    :cond_18
    const/4 v2, 0x2

    if-ne v12, v2, :cond_1b

    invoke-virtual/range {p10 .. p10}, Lcom/daaw/lj;->g()Lcom/daaw/lj$b;

    move-result-object v3

    sget-object v4, Lcom/daaw/lj$b;->r:Lcom/daaw/lj$b;

    if-eq v3, v4, :cond_1a

    invoke-virtual/range {p10 .. p10}, Lcom/daaw/lj;->g()Lcom/daaw/lj$b;

    move-result-object v3

    sget-object v6, Lcom/daaw/lj$b;->t:Lcom/daaw/lj$b;

    if-ne v3, v6, :cond_19

    goto :goto_10

    :cond_19
    iget-object v3, v0, Lcom/daaw/qj;->N:Lcom/daaw/qj;

    sget-object v4, Lcom/daaw/lj$b;->q:Lcom/daaw/lj$b;

    invoke-virtual {v3, v4}, Lcom/daaw/qj;->k(Lcom/daaw/lj$b;)Lcom/daaw/lj;

    move-result-object v3

    invoke-virtual {v10, v3}, Lcom/daaw/ak0;->q(Ljava/lang/Object;)Lcom/daaw/de1;

    move-result-object v3

    iget-object v4, v0, Lcom/daaw/qj;->N:Lcom/daaw/qj;

    sget-object v6, Lcom/daaw/lj$b;->s:Lcom/daaw/lj$b;

    goto :goto_11

    :cond_1a
    :goto_10
    iget-object v3, v0, Lcom/daaw/qj;->N:Lcom/daaw/qj;

    invoke-virtual {v3, v4}, Lcom/daaw/qj;->k(Lcom/daaw/lj$b;)Lcom/daaw/lj;

    move-result-object v3

    invoke-virtual {v10, v3}, Lcom/daaw/ak0;->q(Ljava/lang/Object;)Lcom/daaw/de1;

    move-result-object v3

    iget-object v4, v0, Lcom/daaw/qj;->N:Lcom/daaw/qj;

    sget-object v6, Lcom/daaw/lj$b;->t:Lcom/daaw/lj$b;

    :goto_11
    invoke-virtual {v4, v6}, Lcom/daaw/qj;->k(Lcom/daaw/lj$b;)Lcom/daaw/lj;

    move-result-object v4

    invoke-virtual {v10, v4}, Lcom/daaw/ak0;->q(Ljava/lang/Object;)Lcom/daaw/de1;

    move-result-object v4

    move-object/from16 v19, v3

    move-object v6, v4

    invoke-virtual/range {p1 .. p1}, Lcom/daaw/ak0;->r()Lcom/daaw/i6;

    move-result-object v3

    move-object v4, v8

    move v2, v5

    move-object v5, v9

    move/from16 p9, v14

    move-object/from16 v14, v23

    move-object v15, v7

    move-object/from16 v7, v19

    move/from16 v23, v2

    move-object v2, v8

    move/from16 v8, p25

    invoke-virtual/range {v3 .. v8}, Lcom/daaw/i6;->k(Lcom/daaw/de1;Lcom/daaw/de1;Lcom/daaw/de1;Lcom/daaw/de1;F)Lcom/daaw/i6;

    move-result-object v3

    invoke-virtual {v10, v3}, Lcom/daaw/ak0;->d(Lcom/daaw/i6;)V

    move/from16 v19, p5

    move/from16 v24, p9

    const/16 v25, 0x0

    goto :goto_12

    :cond_1b
    move-object v15, v7

    move-object v2, v8

    move/from16 p9, v14

    move-object/from16 v14, v23

    move/from16 v23, v5

    move/from16 v24, p9

    move/from16 v25, v19

    const/16 v19, 0x1

    :goto_12
    if-eqz p26, :cond_4f

    if-eqz p18, :cond_1c

    move-object/from16 v3, p7

    move-object v5, v2

    move-object v4, v9

    move-object v1, v11

    move/from16 v6, v23

    const/16 v2, 0x8

    const/4 v7, 0x2

    const/16 v22, 0x1

    goto/16 :goto_2f

    :cond_1c
    if-nez v16, :cond_1d

    if-nez v17, :cond_1d

    if-nez v18, :cond_1d

    goto/16 :goto_2c

    :cond_1d
    if-eqz v16, :cond_1e

    if-nez v17, :cond_1e

    goto/16 :goto_2c

    :cond_1e
    if-nez v16, :cond_1f

    if-eqz v17, :cond_1f

    invoke-virtual/range {p11 .. p11}, Lcom/daaw/lj;->b()I

    move-result v1

    neg-int v1, v1

    const/16 v3, 0x8

    invoke-virtual {v10, v2, v14, v1, v3}, Lcom/daaw/ak0;->e(Lcom/daaw/de1;Lcom/daaw/de1;II)Lcom/daaw/i6;

    if-eqz p3, :cond_4b

    const/4 v1, 0x5

    const/4 v6, 0x0

    invoke-virtual {v10, v9, v11, v6, v1}, Lcom/daaw/ak0;->h(Lcom/daaw/de1;Lcom/daaw/de1;II)V

    goto/16 :goto_2c

    :cond_1f
    const/16 v3, 0x8

    const/4 v6, 0x0

    if-eqz v16, :cond_4b

    if-eqz v17, :cond_4b

    iget-object v4, v13, Lcom/daaw/lj;->d:Lcom/daaw/lj;

    iget-object v8, v4, Lcom/daaw/lj;->b:Lcom/daaw/qj;

    move-object/from16 v5, p11

    const/16 v7, 0x8

    iget-object v3, v5, Lcom/daaw/lj;->d:Lcom/daaw/lj;

    iget-object v4, v3, Lcom/daaw/lj;->b:Lcom/daaw/qj;

    invoke-virtual/range {p0 .. p0}, Lcom/daaw/qj;->E()Lcom/daaw/qj;

    move-result-object v3

    const/16 v16, 0x6

    if-eqz v25, :cond_31

    if-nez v12, :cond_23

    if-nez v1, :cond_20

    if-nez v24, :cond_20

    const/16 v1, 0x8

    const/16 v17, 0x8

    const/16 v18, 0x0

    const/16 v20, 0x1

    goto :goto_13

    :cond_20
    const/4 v1, 0x5

    const/16 v17, 0x5

    const/16 v18, 0x1

    const/16 v20, 0x0

    :goto_13
    instance-of v6, v8, Lcom/daaw/ja;

    if-nez v6, :cond_22

    instance-of v6, v4, Lcom/daaw/ja;

    if-eqz v6, :cond_21

    goto :goto_14

    :cond_21
    move/from16 v23, v1

    move/from16 v21, v18

    const/4 v1, 0x6

    const/4 v6, 0x0

    const/4 v7, 0x1

    move/from16 v18, v17

    goto/16 :goto_1f

    :cond_22
    :goto_14
    move/from16 v23, v1

    move/from16 v21, v18

    const/4 v1, 0x6

    const/4 v6, 0x0

    const/4 v7, 0x1

    const/16 v18, 0x4

    goto/16 :goto_1f

    :cond_23
    const/4 v6, 0x1

    if-ne v12, v6, :cond_24

    const/4 v1, 0x6

    const/4 v6, 0x1

    const/4 v7, 0x1

    const/16 v18, 0x4

    const/16 v20, 0x0

    :goto_15
    const/16 v21, 0x1

    const/16 v23, 0x8

    goto/16 :goto_1f

    :cond_24
    const/4 v6, 0x3

    if-ne v12, v6, :cond_30

    iget v6, v0, Lcom/daaw/qj;->u:I

    const/4 v7, -0x1

    if-ne v6, v7, :cond_27

    if-eqz p19, :cond_26

    if-eqz p3, :cond_25

    const/4 v1, 0x5

    goto :goto_16

    :cond_25
    const/4 v1, 0x4

    goto :goto_16

    :cond_26
    const/16 v1, 0x8

    :goto_16
    const/4 v6, 0x1

    const/4 v7, 0x1

    const/16 v18, 0x5

    const/16 v20, 0x1

    goto :goto_15

    :cond_27
    if-eqz p17, :cond_2b

    move/from16 v6, p22

    const/4 v7, 0x2

    if-eq v6, v7, :cond_29

    const/4 v7, 0x1

    if-ne v6, v7, :cond_28

    goto :goto_17

    :cond_28
    const/4 v6, 0x0

    goto :goto_18

    :cond_29
    const/4 v7, 0x1

    :goto_17
    const/4 v6, 0x1

    :goto_18
    if-nez v6, :cond_2a

    const/16 v1, 0x8

    const/4 v6, 0x5

    goto :goto_19

    :cond_2a
    const/4 v1, 0x5

    const/4 v6, 0x4

    :goto_19
    move/from16 v23, v1

    move/from16 v18, v6

    const/4 v1, 0x6

    const/4 v6, 0x1

    :goto_1a
    const/16 v20, 0x1

    const/16 v21, 0x1

    goto :goto_1f

    :cond_2b
    const/4 v7, 0x1

    if-lez v1, :cond_2c

    const/4 v1, 0x6

    const/4 v6, 0x1

    const/16 v18, 0x5

    goto :goto_1c

    :cond_2c
    if-nez v1, :cond_2f

    if-nez v24, :cond_2f

    if-nez p19, :cond_2d

    const/4 v1, 0x6

    const/4 v6, 0x1

    const/16 v18, 0x8

    goto :goto_1c

    :cond_2d
    if-eq v8, v3, :cond_2e

    if-eq v4, v3, :cond_2e

    const/4 v1, 0x4

    goto :goto_1b

    :cond_2e
    const/4 v1, 0x5

    :goto_1b
    move/from16 v23, v1

    const/4 v1, 0x6

    const/4 v6, 0x1

    const/16 v18, 0x4

    goto :goto_1a

    :cond_2f
    const/4 v1, 0x6

    const/4 v6, 0x1

    const/16 v18, 0x4

    :goto_1c
    const/16 v20, 0x1

    goto :goto_1d

    :cond_30
    const/4 v7, 0x1

    const/4 v1, 0x6

    const/4 v6, 0x0

    const/16 v18, 0x4

    const/16 v20, 0x0

    const/16 v21, 0x0

    goto :goto_1e

    :cond_31
    const/4 v7, 0x1

    const/4 v1, 0x6

    const/4 v6, 0x1

    const/16 v18, 0x4

    const/16 v20, 0x0

    :goto_1d
    const/16 v21, 0x1

    :goto_1e
    const/16 v23, 0x5

    :goto_1f
    if-eqz v6, :cond_32

    if-ne v15, v14, :cond_32

    if-eq v8, v3, :cond_32

    const/16 v26, 0x0

    const/16 v27, 0x0

    goto :goto_20

    :cond_32
    move/from16 v26, v6

    const/16 v27, 0x1

    :goto_20
    if-eqz v21, :cond_34

    iget v6, v0, Lcom/daaw/qj;->f0:I

    const/16 v7, 0x8

    if-ne v6, v7, :cond_33

    const/16 v17, 0x4

    goto :goto_21

    :cond_33
    move/from16 v17, v1

    :goto_21
    invoke-virtual/range {p10 .. p10}, Lcom/daaw/lj;->b()I

    move-result v6

    invoke-virtual/range {p11 .. p11}, Lcom/daaw/lj;->b()I

    move-result v28

    move-object/from16 v1, p1

    move-object/from16 p5, v2

    const/4 v13, 0x0

    const/16 v21, 0x4

    const/16 v22, 0x1

    move-object v2, v9

    move-object v13, v3

    move-object v3, v15

    move/from16 p21, v12

    move-object v12, v4

    move v4, v6

    move-object v6, v5

    move/from16 v5, p16

    move-object v6, v14

    const/16 v11, 0x8

    move-object/from16 v7, p5

    move-object/from16 v29, v8

    move/from16 v8, v28

    move-object/from16 v30, v9

    move/from16 v9, v17

    invoke-virtual/range {v1 .. v9}, Lcom/daaw/ak0;->c(Lcom/daaw/de1;Lcom/daaw/de1;IFLcom/daaw/de1;Lcom/daaw/de1;II)V

    goto :goto_22

    :cond_34
    move-object/from16 p5, v2

    move-object v13, v3

    move-object/from16 v29, v8

    move-object/from16 v30, v9

    move/from16 p21, v12

    const/16 v11, 0x8

    const/16 v21, 0x4

    const/16 v22, 0x1

    move-object v12, v4

    :goto_22
    iget v1, v0, Lcom/daaw/qj;->f0:I

    if-ne v1, v11, :cond_35

    return-void

    :cond_35
    if-eqz v26, :cond_39

    if-eqz p3, :cond_37

    if-eq v15, v14, :cond_37

    if-nez v25, :cond_37

    move-object/from16 v1, v29

    instance-of v2, v1, Lcom/daaw/ja;

    if-nez v2, :cond_36

    instance-of v2, v12, Lcom/daaw/ja;

    if-eqz v2, :cond_38

    :cond_36
    const/4 v2, 0x6

    goto :goto_23

    :cond_37
    move-object/from16 v1, v29

    :cond_38
    move/from16 v2, v23

    :goto_23
    invoke-virtual/range {p10 .. p10}, Lcom/daaw/lj;->b()I

    move-result v3

    move-object/from16 v4, v30

    invoke-virtual {v10, v4, v15, v3, v2}, Lcom/daaw/ak0;->h(Lcom/daaw/de1;Lcom/daaw/de1;II)V

    invoke-virtual/range {p11 .. p11}, Lcom/daaw/lj;->b()I

    move-result v3

    neg-int v3, v3

    move-object/from16 v5, p5

    invoke-virtual {v10, v5, v14, v3, v2}, Lcom/daaw/ak0;->j(Lcom/daaw/de1;Lcom/daaw/de1;II)V

    move/from16 v23, v2

    goto :goto_24

    :cond_39
    move-object/from16 v5, p5

    move-object/from16 v1, v29

    move-object/from16 v4, v30

    :goto_24
    if-eqz p3, :cond_3a

    if-eqz p20, :cond_3a

    instance-of v2, v1, Lcom/daaw/ja;

    if-nez v2, :cond_3a

    instance-of v2, v12, Lcom/daaw/ja;

    if-nez v2, :cond_3a

    const/4 v2, 0x1

    const/4 v3, 0x6

    const/4 v6, 0x6

    goto :goto_25

    :cond_3a
    move/from16 v3, v18

    move/from16 v6, v23

    move/from16 v2, v27

    :goto_25
    if-eqz v2, :cond_46

    if-eqz v20, :cond_43

    if-eqz p19, :cond_3b

    if-eqz p4, :cond_43

    :cond_3b
    if-eq v1, v13, :cond_3d

    if-ne v12, v13, :cond_3c

    goto :goto_26

    :cond_3c
    move/from16 v16, v3

    :cond_3d
    :goto_26
    instance-of v2, v1, Lcom/daaw/k80;

    if-nez v2, :cond_3e

    instance-of v2, v12, Lcom/daaw/k80;

    if-eqz v2, :cond_3f

    :cond_3e
    const/16 v16, 0x5

    :cond_3f
    instance-of v2, v1, Lcom/daaw/ja;

    if-nez v2, :cond_40

    instance-of v2, v12, Lcom/daaw/ja;

    if-eqz v2, :cond_41

    :cond_40
    const/16 v16, 0x5

    :cond_41
    if-eqz p19, :cond_42

    const/4 v2, 0x5

    goto :goto_27

    :cond_42
    move/from16 v2, v16

    :goto_27
    invoke-static {v2, v3}, Ljava/lang/Math;->max(II)I

    move-result v2

    goto :goto_28

    :cond_43
    move v2, v3

    :goto_28
    if-eqz p3, :cond_45

    invoke-static {v6, v2}, Ljava/lang/Math;->min(II)I

    move-result v2

    if-eqz p17, :cond_45

    if-nez p19, :cond_45

    if-eq v1, v13, :cond_44

    if-ne v12, v13, :cond_45

    :cond_44
    const/4 v2, 0x4

    :cond_45
    invoke-virtual/range {p10 .. p10}, Lcom/daaw/lj;->b()I

    move-result v1

    invoke-virtual {v10, v4, v15, v1, v2}, Lcom/daaw/ak0;->e(Lcom/daaw/de1;Lcom/daaw/de1;II)Lcom/daaw/i6;

    invoke-virtual/range {p11 .. p11}, Lcom/daaw/lj;->b()I

    move-result v1

    neg-int v1, v1

    invoke-virtual {v10, v5, v14, v1, v2}, Lcom/daaw/ak0;->e(Lcom/daaw/de1;Lcom/daaw/de1;II)Lcom/daaw/i6;

    :cond_46
    if-eqz p3, :cond_48

    move-object/from16 v1, p6

    const/16 v2, 0x8

    if-ne v1, v15, :cond_47

    invoke-virtual/range {p10 .. p10}, Lcom/daaw/lj;->b()I

    move-result v3

    goto :goto_29

    :cond_47
    const/4 v3, 0x0

    :goto_29
    if-eq v15, v1, :cond_49

    const/4 v6, 0x5

    invoke-virtual {v10, v4, v1, v3, v6}, Lcom/daaw/ak0;->h(Lcom/daaw/de1;Lcom/daaw/de1;II)V

    goto :goto_2a

    :cond_48
    const/16 v2, 0x8

    :cond_49
    :goto_2a
    if-eqz p3, :cond_4c

    if-eqz v25, :cond_4c

    if-nez p14, :cond_4c

    if-nez v24, :cond_4c

    if-eqz v25, :cond_4a

    move/from16 v12, p21

    const/4 v1, 0x3

    if-ne v12, v1, :cond_4a

    const/4 v1, 0x0

    goto :goto_2b

    :cond_4a
    const/4 v1, 0x0

    const/4 v2, 0x5

    :goto_2b
    invoke-virtual {v10, v5, v4, v1, v2}, Lcom/daaw/ak0;->h(Lcom/daaw/de1;Lcom/daaw/de1;II)V

    goto :goto_2d

    :cond_4b
    :goto_2c
    move-object v5, v2

    :cond_4c
    :goto_2d
    if-eqz p3, :cond_4e

    if-eqz v19, :cond_4e

    move-object/from16 v1, p11

    iget-object v2, v1, Lcom/daaw/lj;->d:Lcom/daaw/lj;

    if-eqz v2, :cond_4d

    invoke-virtual/range {p11 .. p11}, Lcom/daaw/lj;->b()I

    move-result v2

    move-object/from16 v3, p7

    goto :goto_2e

    :cond_4d
    move-object/from16 v3, p7

    const/4 v2, 0x0

    :goto_2e
    if-eq v14, v3, :cond_4e

    const/4 v1, 0x5

    invoke-virtual {v10, v3, v5, v2, v1}, Lcom/daaw/ak0;->h(Lcom/daaw/de1;Lcom/daaw/de1;II)V

    :cond_4e
    return-void

    :cond_4f
    move-object/from16 v3, p7

    move-object v5, v2

    move-object v4, v9

    move-object v1, v11

    const/16 v2, 0x8

    const/4 v7, 0x2

    const/16 v22, 0x1

    move/from16 v6, v23

    :goto_2f
    if-ge v6, v7, :cond_54

    if-eqz p3, :cond_54

    if-eqz v19, :cond_54

    const/4 v6, 0x0

    invoke-virtual {v10, v4, v1, v6, v2}, Lcom/daaw/ak0;->h(Lcom/daaw/de1;Lcom/daaw/de1;II)V

    if-nez p2, :cond_51

    iget-object v1, v0, Lcom/daaw/qj;->F:Lcom/daaw/lj;

    iget-object v1, v1, Lcom/daaw/lj;->d:Lcom/daaw/lj;

    if-nez v1, :cond_50

    goto :goto_30

    :cond_50
    const/4 v1, 0x0

    goto :goto_31

    :cond_51
    :goto_30
    const/4 v1, 0x1

    :goto_31
    if-nez p2, :cond_53

    iget-object v4, v0, Lcom/daaw/qj;->F:Lcom/daaw/lj;

    iget-object v4, v4, Lcom/daaw/lj;->d:Lcom/daaw/lj;

    if-eqz v4, :cond_53

    iget-object v1, v4, Lcom/daaw/lj;->b:Lcom/daaw/qj;

    iget v4, v1, Lcom/daaw/qj;->Q:F

    const/4 v6, 0x0

    cmpl-float v4, v4, v6

    if-eqz v4, :cond_52

    iget-object v1, v1, Lcom/daaw/qj;->M:[Lcom/daaw/qj$b;

    const/4 v4, 0x0

    aget-object v6, v1, v4

    sget-object v4, Lcom/daaw/qj$b;->r:Lcom/daaw/qj$b;

    if-ne v6, v4, :cond_52

    aget-object v1, v1, v22

    if-ne v1, v4, :cond_52

    goto :goto_32

    :cond_52
    const/16 v22, 0x0

    goto :goto_32

    :cond_53
    move/from16 v22, v1

    :goto_32
    if-eqz v22, :cond_54

    const/4 v1, 0x0

    invoke-virtual {v10, v3, v5, v1, v2}, Lcom/daaw/ak0;->h(Lcom/daaw/de1;Lcom/daaw/de1;II)V

    :cond_54
    return-void
.end method

.method public h0(II)V
    .locals 0

    iput p1, p0, Lcom/daaw/qj;->S:I

    sub-int/2addr p2, p1

    iput p2, p0, Lcom/daaw/qj;->O:I

    iget p1, p0, Lcom/daaw/qj;->Z:I

    if-ge p2, p1, :cond_0

    iput p1, p0, Lcom/daaw/qj;->O:I

    :cond_0
    return-void
.end method

.method public i(Lcom/daaw/qj;FI)V
    .locals 6

    sget-object v3, Lcom/daaw/lj$b;->v:Lcom/daaw/lj$b;

    const/4 v5, 0x0

    move-object v0, p0

    move-object v1, v3

    move-object v2, p1

    move v4, p3

    invoke-virtual/range {v0 .. v5}, Lcom/daaw/qj;->R(Lcom/daaw/lj$b;Lcom/daaw/qj;Lcom/daaw/lj$b;II)V

    iput p2, p0, Lcom/daaw/qj;->x:F

    return-void
.end method

.method public i0(Lcom/daaw/qj$b;)V
    .locals 2

    iget-object v0, p0, Lcom/daaw/qj;->M:[Lcom/daaw/qj$b;

    const/4 v1, 0x0

    aput-object p1, v0, v1

    return-void
.end method

.method public j(Lcom/daaw/ak0;)V
    .locals 1

    iget-object v0, p0, Lcom/daaw/qj;->B:Lcom/daaw/lj;

    invoke-virtual {p1, v0}, Lcom/daaw/ak0;->q(Ljava/lang/Object;)Lcom/daaw/de1;

    iget-object v0, p0, Lcom/daaw/qj;->C:Lcom/daaw/lj;

    invoke-virtual {p1, v0}, Lcom/daaw/ak0;->q(Ljava/lang/Object;)Lcom/daaw/de1;

    iget-object v0, p0, Lcom/daaw/qj;->D:Lcom/daaw/lj;

    invoke-virtual {p1, v0}, Lcom/daaw/ak0;->q(Ljava/lang/Object;)Lcom/daaw/de1;

    iget-object v0, p0, Lcom/daaw/qj;->E:Lcom/daaw/lj;

    invoke-virtual {p1, v0}, Lcom/daaw/ak0;->q(Ljava/lang/Object;)Lcom/daaw/de1;

    iget v0, p0, Lcom/daaw/qj;->Y:I

    if-lez v0, :cond_0

    iget-object v0, p0, Lcom/daaw/qj;->F:Lcom/daaw/lj;

    invoke-virtual {p1, v0}, Lcom/daaw/ak0;->q(Ljava/lang/Object;)Lcom/daaw/de1;

    :cond_0
    return-void
.end method

.method public j0(IIIF)V
    .locals 0

    iput p1, p0, Lcom/daaw/qj;->l:I

    iput p2, p0, Lcom/daaw/qj;->o:I

    const p2, 0x7fffffff

    if-ne p3, p2, :cond_0

    const/4 p3, 0x0

    :cond_0
    iput p3, p0, Lcom/daaw/qj;->p:I

    iput p4, p0, Lcom/daaw/qj;->q:F

    const/4 p2, 0x0

    cmpl-float p2, p4, p2

    if-lez p2, :cond_1

    const/high16 p2, 0x3f800000    # 1.0f

    cmpg-float p2, p4, p2

    if-gez p2, :cond_1

    if-nez p1, :cond_1

    const/4 p1, 0x2

    iput p1, p0, Lcom/daaw/qj;->l:I

    :cond_1
    return-void
.end method

.method public k(Lcom/daaw/lj$b;)Lcom/daaw/lj;
    .locals 2

    sget-object v0, Lcom/daaw/qj$a;->a:[I

    invoke-virtual {p1}, Ljava/lang/Enum;->ordinal()I

    move-result v1

    aget v0, v0, v1

    packed-switch v0, :pswitch_data_0

    new-instance v0, Ljava/lang/AssertionError;

    invoke-virtual {p1}, Ljava/lang/Enum;->name()Ljava/lang/String;

    move-result-object p1

    invoke-direct {v0, p1}, Ljava/lang/AssertionError;-><init>(Ljava/lang/Object;)V

    throw v0

    :pswitch_0
    const/4 p1, 0x0

    return-object p1

    :pswitch_1
    iget-object p1, p0, Lcom/daaw/qj;->H:Lcom/daaw/lj;

    return-object p1

    :pswitch_2
    iget-object p1, p0, Lcom/daaw/qj;->G:Lcom/daaw/lj;

    return-object p1

    :pswitch_3
    iget-object p1, p0, Lcom/daaw/qj;->I:Lcom/daaw/lj;

    return-object p1

    :pswitch_4
    iget-object p1, p0, Lcom/daaw/qj;->F:Lcom/daaw/lj;

    return-object p1

    :pswitch_5
    iget-object p1, p0, Lcom/daaw/qj;->E:Lcom/daaw/lj;

    return-object p1

    :pswitch_6
    iget-object p1, p0, Lcom/daaw/qj;->D:Lcom/daaw/lj;

    return-object p1

    :pswitch_7
    iget-object p1, p0, Lcom/daaw/qj;->C:Lcom/daaw/lj;

    return-object p1

    :pswitch_8
    iget-object p1, p0, Lcom/daaw/qj;->B:Lcom/daaw/lj;

    return-object p1

    nop

    :pswitch_data_0
    .packed-switch 0x1
        :pswitch_8
        :pswitch_7
        :pswitch_6
        :pswitch_5
        :pswitch_4
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method

.method public k0(F)V
    .locals 2

    iget-object v0, p0, Lcom/daaw/qj;->q0:[F

    const/4 v1, 0x0

    aput p1, v0, v1

    return-void
.end method

.method public l()I
    .locals 1

    iget v0, p0, Lcom/daaw/qj;->Y:I

    return v0
.end method

.method public l0(IZ)V
    .locals 1

    iget-object v0, p0, Lcom/daaw/qj;->L:[Z

    aput-boolean p2, v0, p1

    return-void
.end method

.method public m(I)F
    .locals 1

    if-nez p1, :cond_0

    iget p1, p0, Lcom/daaw/qj;->b0:F

    return p1

    :cond_0
    const/4 v0, 0x1

    if-ne p1, v0, :cond_1

    iget p1, p0, Lcom/daaw/qj;->c0:F

    return p1

    :cond_1
    const/high16 p1, -0x40800000    # -1.0f

    return p1
.end method

.method public m0(Z)V
    .locals 0

    iput-boolean p1, p0, Lcom/daaw/qj;->z:Z

    return-void
.end method

.method public n()I
    .locals 2

    invoke-virtual {p0}, Lcom/daaw/qj;->P()I

    move-result v0

    iget v1, p0, Lcom/daaw/qj;->P:I

    add-int/2addr v0, v1

    return v0
.end method

.method public n0(Z)V
    .locals 0

    iput-boolean p1, p0, Lcom/daaw/qj;->A:Z

    return-void
.end method

.method public o()Ljava/lang/Object;
    .locals 1

    iget-object v0, p0, Lcom/daaw/qj;->d0:Ljava/lang/Object;

    return-object v0
.end method

.method public o0(I)V
    .locals 2

    iget-object v0, p0, Lcom/daaw/qj;->w:[I

    const/4 v1, 0x1

    aput p1, v0, v1

    return-void
.end method

.method public p()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/daaw/qj;->g0:Ljava/lang/String;

    return-object v0
.end method

.method public p0(I)V
    .locals 2

    iget-object v0, p0, Lcom/daaw/qj;->w:[I

    const/4 v1, 0x0

    aput p1, v0, v1

    return-void
.end method

.method public q(I)Lcom/daaw/qj$b;
    .locals 1

    if-nez p1, :cond_0

    invoke-virtual {p0}, Lcom/daaw/qj;->w()Lcom/daaw/qj$b;

    move-result-object p1

    return-object p1

    :cond_0
    const/4 v0, 0x1

    if-ne p1, v0, :cond_1

    invoke-virtual {p0}, Lcom/daaw/qj;->K()Lcom/daaw/qj$b;

    move-result-object p1

    return-object p1

    :cond_1
    const/4 p1, 0x0

    return-object p1
.end method

.method public q0(I)V
    .locals 0

    if-gez p1, :cond_0

    const/4 p1, 0x0

    :cond_0
    iput p1, p0, Lcom/daaw/qj;->a0:I

    return-void
.end method

.method public r()F
    .locals 1

    iget v0, p0, Lcom/daaw/qj;->Q:F

    return v0
.end method

.method public r0(I)V
    .locals 0

    if-gez p1, :cond_0

    const/4 p1, 0x0

    :cond_0
    iput p1, p0, Lcom/daaw/qj;->Z:I

    return-void
.end method

.method public s()I
    .locals 1

    iget v0, p0, Lcom/daaw/qj;->R:I

    return v0
.end method

.method public s0(II)V
    .locals 0

    iput p1, p0, Lcom/daaw/qj;->S:I

    iput p2, p0, Lcom/daaw/qj;->T:I

    return-void
.end method

.method public t()I
    .locals 2

    iget v0, p0, Lcom/daaw/qj;->f0:I

    const/16 v1, 0x8

    if-ne v0, v1, :cond_0

    const/4 v0, 0x0

    return v0

    :cond_0
    iget v0, p0, Lcom/daaw/qj;->P:I

    return v0
.end method

.method public t0(Lcom/daaw/qj;)V
    .locals 0

    iput-object p1, p0, Lcom/daaw/qj;->N:Lcom/daaw/qj;

    return-void
.end method

.method public toString()Ljava/lang/String;
    .locals 5

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    iget-object v1, p0, Lcom/daaw/qj;->h0:Ljava/lang/String;

    const-string v2, " "

    const-string v3, ""

    if-eqz v1, :cond_0

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v4, "type: "

    invoke-virtual {v1, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v4, p0, Lcom/daaw/qj;->h0:Ljava/lang/String;

    invoke-virtual {v1, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    goto :goto_0

    :cond_0
    move-object v1, v3

    :goto_0
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Lcom/daaw/qj;->g0:Ljava/lang/String;

    if-eqz v1, :cond_1

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "id: "

    invoke-virtual {v1, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v3, p0, Lcom/daaw/qj;->g0:Ljava/lang/String;

    invoke-virtual {v1, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v3

    :cond_1
    invoke-virtual {v0, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, "("

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget v1, p0, Lcom/daaw/qj;->S:I

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v1, ", "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget v1, p0, Lcom/daaw/qj;->T:I

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v1, ") - ("

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget v1, p0, Lcom/daaw/qj;->O:I

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v1, " x "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget v1, p0, Lcom/daaw/qj;->P:I

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v1, ")"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public u()F
    .locals 1

    iget v0, p0, Lcom/daaw/qj;->b0:F

    return v0
.end method

.method public u0(F)V
    .locals 0

    iput p1, p0, Lcom/daaw/qj;->c0:F

    return-void
.end method

.method public v()I
    .locals 1

    iget v0, p0, Lcom/daaw/qj;->m0:I

    return v0
.end method

.method public v0(I)V
    .locals 0

    iput p1, p0, Lcom/daaw/qj;->n0:I

    return-void
.end method

.method public w()Lcom/daaw/qj$b;
    .locals 2

    iget-object v0, p0, Lcom/daaw/qj;->M:[Lcom/daaw/qj$b;

    const/4 v1, 0x0

    aget-object v0, v0, v1

    return-object v0
.end method

.method public w0(II)V
    .locals 0

    iput p1, p0, Lcom/daaw/qj;->T:I

    sub-int/2addr p2, p1

    iput p2, p0, Lcom/daaw/qj;->P:I

    iget p1, p0, Lcom/daaw/qj;->a0:I

    if-ge p2, p1, :cond_0

    iput p1, p0, Lcom/daaw/qj;->P:I

    :cond_0
    return-void
.end method

.method public x()I
    .locals 2

    iget-object v0, p0, Lcom/daaw/qj;->B:Lcom/daaw/lj;

    const/4 v1, 0x0

    if-eqz v0, :cond_0

    iget v0, v0, Lcom/daaw/lj;->e:I

    add-int/2addr v1, v0

    :cond_0
    iget-object v0, p0, Lcom/daaw/qj;->D:Lcom/daaw/lj;

    if-eqz v0, :cond_1

    iget v0, v0, Lcom/daaw/lj;->e:I

    add-int/2addr v1, v0

    :cond_1
    return v1
.end method

.method public x0(Lcom/daaw/qj$b;)V
    .locals 2

    iget-object v0, p0, Lcom/daaw/qj;->M:[Lcom/daaw/qj$b;

    const/4 v1, 0x1

    aput-object p1, v0, v1

    return-void
.end method

.method public y(I)I
    .locals 1

    if-nez p1, :cond_0

    invoke-virtual {p0}, Lcom/daaw/qj;->N()I

    move-result p1

    return p1

    :cond_0
    const/4 v0, 0x1

    if-ne p1, v0, :cond_1

    invoke-virtual {p0}, Lcom/daaw/qj;->t()I

    move-result p1

    return p1

    :cond_1
    const/4 p1, 0x0

    return p1
.end method

.method public y0(IIIF)V
    .locals 0

    iput p1, p0, Lcom/daaw/qj;->m:I

    iput p2, p0, Lcom/daaw/qj;->r:I

    const p2, 0x7fffffff

    if-ne p3, p2, :cond_0

    const/4 p3, 0x0

    :cond_0
    iput p3, p0, Lcom/daaw/qj;->s:I

    iput p4, p0, Lcom/daaw/qj;->t:F

    const/4 p2, 0x0

    cmpl-float p2, p4, p2

    if-lez p2, :cond_1

    const/high16 p2, 0x3f800000    # 1.0f

    cmpg-float p2, p4, p2

    if-gez p2, :cond_1

    if-nez p1, :cond_1

    const/4 p1, 0x2

    iput p1, p0, Lcom/daaw/qj;->m:I

    :cond_1
    return-void
.end method

.method public z()I
    .locals 2

    iget-object v0, p0, Lcom/daaw/qj;->w:[I

    const/4 v1, 0x1

    aget v0, v0, v1

    return v0
.end method

.method public z0(F)V
    .locals 2

    iget-object v0, p0, Lcom/daaw/qj;->q0:[F

    const/4 v1, 0x1

    aput p1, v0, v1

    return-void
.end method
