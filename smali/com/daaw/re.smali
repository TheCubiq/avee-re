.class public Lcom/daaw/re;
.super Ljava/lang/Object;
.source ""


# instance fields
.field public a:Lcom/daaw/qj;

.field public b:Lcom/daaw/qj;

.field public c:Lcom/daaw/qj;

.field public d:Lcom/daaw/qj;

.field public e:Lcom/daaw/qj;

.field public f:Lcom/daaw/qj;

.field public g:Lcom/daaw/qj;

.field public h:Ljava/util/ArrayList;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/ArrayList<",
            "Lcom/daaw/qj;",
            ">;"
        }
    .end annotation
.end field

.field public i:I

.field public j:I

.field public k:F

.field public l:I

.field public m:I

.field public n:I

.field public o:Z

.field public p:I

.field public q:Z

.field public r:Z

.field public s:Z

.field public t:Z

.field public u:Z

.field public v:Z


# direct methods
.method public constructor <init>(Lcom/daaw/qj;IZ)V
    .locals 1

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const/4 v0, 0x0

    iput v0, p0, Lcom/daaw/re;->k:F

    iput-object p1, p0, Lcom/daaw/re;->a:Lcom/daaw/qj;

    iput p2, p0, Lcom/daaw/re;->p:I

    iput-boolean p3, p0, Lcom/daaw/re;->q:Z

    return-void
.end method

.method public static c(Lcom/daaw/qj;I)Z
    .locals 2

    invoke-virtual {p0}, Lcom/daaw/qj;->M()I

    move-result v0

    const/16 v1, 0x8

    if-eq v0, v1, :cond_1

    iget-object v0, p0, Lcom/daaw/qj;->M:[Lcom/daaw/qj$b;

    aget-object v0, v0, p1

    sget-object v1, Lcom/daaw/qj$b;->r:Lcom/daaw/qj$b;

    if-ne v0, v1, :cond_1

    iget-object p0, p0, Lcom/daaw/qj;->n:[I

    aget v0, p0, p1

    if-eqz v0, :cond_0

    aget p0, p0, p1

    const/4 p1, 0x3

    if-ne p0, p1, :cond_1

    :cond_0
    const/4 p0, 0x1

    goto :goto_0

    :cond_1
    const/4 p0, 0x0

    :goto_0
    return p0
.end method


# virtual methods
.method public a()V
    .locals 1

    iget-boolean v0, p0, Lcom/daaw/re;->v:Z

    if-nez v0, :cond_0

    invoke-virtual {p0}, Lcom/daaw/re;->b()V

    :cond_0
    const/4 v0, 0x1

    iput-boolean v0, p0, Lcom/daaw/re;->v:Z

    return-void
.end method

.method public final b()V
    .locals 13

    iget v0, p0, Lcom/daaw/re;->p:I

    const/4 v1, 0x2

    mul-int/lit8 v0, v0, 0x2

    iget-object v2, p0, Lcom/daaw/re;->a:Lcom/daaw/qj;

    const/4 v3, 0x1

    iput-boolean v3, p0, Lcom/daaw/re;->o:Z

    const/4 v4, 0x0

    move-object v5, v2

    const/4 v6, 0x0

    :goto_0
    if-nez v6, :cond_14

    iget v7, p0, Lcom/daaw/re;->i:I

    add-int/2addr v7, v3

    iput v7, p0, Lcom/daaw/re;->i:I

    iget-object v7, v2, Lcom/daaw/qj;->s0:[Lcom/daaw/qj;

    iget v8, p0, Lcom/daaw/re;->p:I

    const/4 v9, 0x0

    aput-object v9, v7, v8

    iget-object v7, v2, Lcom/daaw/qj;->r0:[Lcom/daaw/qj;

    aput-object v9, v7, v8

    invoke-virtual {v2}, Lcom/daaw/qj;->M()I

    move-result v7

    const/16 v8, 0x8

    if-eq v7, v8, :cond_f

    iget v7, p0, Lcom/daaw/re;->l:I

    add-int/2addr v7, v3

    iput v7, p0, Lcom/daaw/re;->l:I

    iget v7, p0, Lcom/daaw/re;->p:I

    invoke-virtual {v2, v7}, Lcom/daaw/qj;->q(I)Lcom/daaw/qj$b;

    move-result-object v7

    sget-object v8, Lcom/daaw/qj$b;->r:Lcom/daaw/qj$b;

    if-eq v7, v8, :cond_0

    iget v7, p0, Lcom/daaw/re;->m:I

    iget v10, p0, Lcom/daaw/re;->p:I

    invoke-virtual {v2, v10}, Lcom/daaw/qj;->y(I)I

    move-result v10

    add-int/2addr v7, v10

    iput v7, p0, Lcom/daaw/re;->m:I

    :cond_0
    iget v7, p0, Lcom/daaw/re;->m:I

    iget-object v10, v2, Lcom/daaw/qj;->J:[Lcom/daaw/lj;

    aget-object v10, v10, v0

    invoke-virtual {v10}, Lcom/daaw/lj;->b()I

    move-result v10

    add-int/2addr v7, v10

    iput v7, p0, Lcom/daaw/re;->m:I

    iget-object v10, v2, Lcom/daaw/qj;->J:[Lcom/daaw/lj;

    add-int/lit8 v11, v0, 0x1

    aget-object v10, v10, v11

    invoke-virtual {v10}, Lcom/daaw/lj;->b()I

    move-result v10

    add-int/2addr v7, v10

    iput v7, p0, Lcom/daaw/re;->m:I

    iget v7, p0, Lcom/daaw/re;->n:I

    iget-object v10, v2, Lcom/daaw/qj;->J:[Lcom/daaw/lj;

    aget-object v10, v10, v0

    invoke-virtual {v10}, Lcom/daaw/lj;->b()I

    move-result v10

    add-int/2addr v7, v10

    iput v7, p0, Lcom/daaw/re;->n:I

    iget-object v10, v2, Lcom/daaw/qj;->J:[Lcom/daaw/lj;

    aget-object v10, v10, v11

    invoke-virtual {v10}, Lcom/daaw/lj;->b()I

    move-result v10

    add-int/2addr v7, v10

    iput v7, p0, Lcom/daaw/re;->n:I

    iget-object v7, p0, Lcom/daaw/re;->b:Lcom/daaw/qj;

    if-nez v7, :cond_1

    iput-object v2, p0, Lcom/daaw/re;->b:Lcom/daaw/qj;

    :cond_1
    iput-object v2, p0, Lcom/daaw/re;->d:Lcom/daaw/qj;

    iget-object v7, v2, Lcom/daaw/qj;->M:[Lcom/daaw/qj$b;

    iget v10, p0, Lcom/daaw/re;->p:I

    aget-object v7, v7, v10

    if-ne v7, v8, :cond_f

    iget-object v7, v2, Lcom/daaw/qj;->n:[I

    aget v8, v7, v10

    const/4 v11, 0x0

    if-eqz v8, :cond_2

    aget v8, v7, v10

    const/4 v12, 0x3

    if-eq v8, v12, :cond_2

    aget v7, v7, v10

    if-ne v7, v1, :cond_9

    :cond_2
    iget v7, p0, Lcom/daaw/re;->j:I

    add-int/2addr v7, v3

    iput v7, p0, Lcom/daaw/re;->j:I

    iget-object v7, v2, Lcom/daaw/qj;->q0:[F

    aget v8, v7, v10

    cmpl-float v12, v8, v11

    if-lez v12, :cond_3

    iget v12, p0, Lcom/daaw/re;->k:F

    aget v7, v7, v10

    add-float/2addr v12, v7

    iput v12, p0, Lcom/daaw/re;->k:F

    :cond_3
    invoke-static {v2, v10}, Lcom/daaw/re;->c(Lcom/daaw/qj;I)Z

    move-result v7

    if-eqz v7, :cond_6

    cmpg-float v7, v8, v11

    if-gez v7, :cond_4

    iput-boolean v3, p0, Lcom/daaw/re;->r:Z

    goto :goto_1

    :cond_4
    iput-boolean v3, p0, Lcom/daaw/re;->s:Z

    :goto_1
    iget-object v7, p0, Lcom/daaw/re;->h:Ljava/util/ArrayList;

    if-nez v7, :cond_5

    new-instance v7, Ljava/util/ArrayList;

    invoke-direct {v7}, Ljava/util/ArrayList;-><init>()V

    iput-object v7, p0, Lcom/daaw/re;->h:Ljava/util/ArrayList;

    :cond_5
    iget-object v7, p0, Lcom/daaw/re;->h:Ljava/util/ArrayList;

    invoke-virtual {v7, v2}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    :cond_6
    iget-object v7, p0, Lcom/daaw/re;->f:Lcom/daaw/qj;

    if-nez v7, :cond_7

    iput-object v2, p0, Lcom/daaw/re;->f:Lcom/daaw/qj;

    :cond_7
    iget-object v7, p0, Lcom/daaw/re;->g:Lcom/daaw/qj;

    if-eqz v7, :cond_8

    iget-object v7, v7, Lcom/daaw/qj;->r0:[Lcom/daaw/qj;

    iget v8, p0, Lcom/daaw/re;->p:I

    aput-object v2, v7, v8

    :cond_8
    iput-object v2, p0, Lcom/daaw/re;->g:Lcom/daaw/qj;

    :cond_9
    iget v7, p0, Lcom/daaw/re;->p:I

    if-nez v7, :cond_b

    iget v7, v2, Lcom/daaw/qj;->l:I

    if-eqz v7, :cond_a

    goto :goto_2

    :cond_a
    iget v7, v2, Lcom/daaw/qj;->o:I

    if-nez v7, :cond_c

    iget v7, v2, Lcom/daaw/qj;->p:I

    if-eqz v7, :cond_e

    goto :goto_2

    :cond_b
    iget v7, v2, Lcom/daaw/qj;->m:I

    if-eqz v7, :cond_d

    :cond_c
    :goto_2
    iput-boolean v4, p0, Lcom/daaw/re;->o:Z

    goto :goto_3

    :cond_d
    iget v7, v2, Lcom/daaw/qj;->r:I

    if-nez v7, :cond_c

    iget v7, v2, Lcom/daaw/qj;->s:I

    if-eqz v7, :cond_e

    goto :goto_2

    :cond_e
    :goto_3
    iget v7, v2, Lcom/daaw/qj;->Q:F

    cmpl-float v7, v7, v11

    if-eqz v7, :cond_f

    iput-boolean v4, p0, Lcom/daaw/re;->o:Z

    iput-boolean v3, p0, Lcom/daaw/re;->u:Z

    :cond_f
    if-eq v5, v2, :cond_10

    iget-object v5, v5, Lcom/daaw/qj;->s0:[Lcom/daaw/qj;

    iget v7, p0, Lcom/daaw/re;->p:I

    aput-object v2, v5, v7

    :cond_10
    iget-object v5, v2, Lcom/daaw/qj;->J:[Lcom/daaw/lj;

    add-int/lit8 v7, v0, 0x1

    aget-object v5, v5, v7

    iget-object v5, v5, Lcom/daaw/lj;->d:Lcom/daaw/lj;

    if-eqz v5, :cond_12

    iget-object v5, v5, Lcom/daaw/lj;->b:Lcom/daaw/qj;

    iget-object v7, v5, Lcom/daaw/qj;->J:[Lcom/daaw/lj;

    aget-object v8, v7, v0

    iget-object v8, v8, Lcom/daaw/lj;->d:Lcom/daaw/lj;

    if-eqz v8, :cond_12

    aget-object v7, v7, v0

    iget-object v7, v7, Lcom/daaw/lj;->d:Lcom/daaw/lj;

    iget-object v7, v7, Lcom/daaw/lj;->b:Lcom/daaw/qj;

    if-eq v7, v2, :cond_11

    goto :goto_4

    :cond_11
    move-object v9, v5

    :cond_12
    :goto_4
    if-eqz v9, :cond_13

    goto :goto_5

    :cond_13
    move-object v9, v2

    const/4 v6, 0x1

    :goto_5
    move-object v5, v2

    move-object v2, v9

    goto/16 :goto_0

    :cond_14
    iget-object v1, p0, Lcom/daaw/re;->b:Lcom/daaw/qj;

    if-eqz v1, :cond_15

    iget v5, p0, Lcom/daaw/re;->m:I

    iget-object v1, v1, Lcom/daaw/qj;->J:[Lcom/daaw/lj;

    aget-object v1, v1, v0

    invoke-virtual {v1}, Lcom/daaw/lj;->b()I

    move-result v1

    sub-int/2addr v5, v1

    iput v5, p0, Lcom/daaw/re;->m:I

    :cond_15
    iget-object v1, p0, Lcom/daaw/re;->d:Lcom/daaw/qj;

    if-eqz v1, :cond_16

    iget v5, p0, Lcom/daaw/re;->m:I

    iget-object v1, v1, Lcom/daaw/qj;->J:[Lcom/daaw/lj;

    add-int/2addr v0, v3

    aget-object v0, v1, v0

    invoke-virtual {v0}, Lcom/daaw/lj;->b()I

    move-result v0

    sub-int/2addr v5, v0

    iput v5, p0, Lcom/daaw/re;->m:I

    :cond_16
    iput-object v2, p0, Lcom/daaw/re;->c:Lcom/daaw/qj;

    iget v0, p0, Lcom/daaw/re;->p:I

    if-nez v0, :cond_17

    iget-boolean v0, p0, Lcom/daaw/re;->q:Z

    if-eqz v0, :cond_17

    iput-object v2, p0, Lcom/daaw/re;->e:Lcom/daaw/qj;

    goto :goto_6

    :cond_17
    iget-object v0, p0, Lcom/daaw/re;->a:Lcom/daaw/qj;

    iput-object v0, p0, Lcom/daaw/re;->e:Lcom/daaw/qj;

    :goto_6
    iget-boolean v0, p0, Lcom/daaw/re;->s:Z

    if-eqz v0, :cond_18

    iget-boolean v0, p0, Lcom/daaw/re;->r:Z

    if-eqz v0, :cond_18

    goto :goto_7

    :cond_18
    const/4 v3, 0x0

    :goto_7
    iput-boolean v3, p0, Lcom/daaw/re;->t:Z

    return-void
.end method
