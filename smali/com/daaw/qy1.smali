.class public final Lcom/daaw/qy1;
.super Ljava/lang/Object;
.source ""


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/daaw/qy1$b;
    }
.end annotation


# static fields
.field public static final s:Ljava/lang/String;

.field public static final t:Lcom/daaw/v50;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lcom/daaw/v50<",
            "Ljava/util/List<",
            "Ljava/lang/Object;",
            ">;",
            "Ljava/util/List<",
            "Ljava/lang/Object;",
            ">;>;"
        }
    .end annotation
.end field


# instance fields
.field public a:Ljava/lang/String;

.field public b:Lcom/daaw/yx1;

.field public c:Ljava/lang/String;

.field public d:Ljava/lang/String;

.field public e:Landroidx/work/b;

.field public f:Landroidx/work/b;

.field public g:J

.field public h:J

.field public i:J

.field public j:Lcom/daaw/sj;

.field public k:I

.field public l:Lcom/daaw/ha;

.field public m:J

.field public n:J

.field public o:J

.field public p:J

.field public q:Z

.field public r:Lcom/daaw/zu0;


# direct methods
.method public static constructor <clinit>()V
    .locals 1

    const-string v0, "WorkSpec"

    invoke-static {v0}, Lcom/daaw/ll0;->f(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    sput-object v0, Lcom/daaw/qy1;->s:Ljava/lang/String;

    new-instance v0, Lcom/daaw/qy1$a;

    invoke-direct {v0}, Lcom/daaw/qy1$a;-><init>()V

    sput-object v0, Lcom/daaw/qy1;->t:Lcom/daaw/v50;

    return-void
.end method

.method public constructor <init>(Lcom/daaw/qy1;)V
    .locals 2

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    sget-object v0, Lcom/daaw/yx1;->p:Lcom/daaw/yx1;

    iput-object v0, p0, Lcom/daaw/qy1;->b:Lcom/daaw/yx1;

    sget-object v0, Landroidx/work/b;->c:Landroidx/work/b;

    iput-object v0, p0, Lcom/daaw/qy1;->e:Landroidx/work/b;

    iput-object v0, p0, Lcom/daaw/qy1;->f:Landroidx/work/b;

    sget-object v0, Lcom/daaw/sj;->i:Lcom/daaw/sj;

    iput-object v0, p0, Lcom/daaw/qy1;->j:Lcom/daaw/sj;

    sget-object v0, Lcom/daaw/ha;->p:Lcom/daaw/ha;

    iput-object v0, p0, Lcom/daaw/qy1;->l:Lcom/daaw/ha;

    const-wide/16 v0, 0x7530

    iput-wide v0, p0, Lcom/daaw/qy1;->m:J

    const-wide/16 v0, -0x1

    iput-wide v0, p0, Lcom/daaw/qy1;->p:J

    sget-object v0, Lcom/daaw/zu0;->p:Lcom/daaw/zu0;

    iput-object v0, p0, Lcom/daaw/qy1;->r:Lcom/daaw/zu0;

    iget-object v0, p1, Lcom/daaw/qy1;->a:Ljava/lang/String;

    iput-object v0, p0, Lcom/daaw/qy1;->a:Ljava/lang/String;

    iget-object v0, p1, Lcom/daaw/qy1;->c:Ljava/lang/String;

    iput-object v0, p0, Lcom/daaw/qy1;->c:Ljava/lang/String;

    iget-object v0, p1, Lcom/daaw/qy1;->b:Lcom/daaw/yx1;

    iput-object v0, p0, Lcom/daaw/qy1;->b:Lcom/daaw/yx1;

    iget-object v0, p1, Lcom/daaw/qy1;->d:Ljava/lang/String;

    iput-object v0, p0, Lcom/daaw/qy1;->d:Ljava/lang/String;

    new-instance v0, Landroidx/work/b;

    iget-object v1, p1, Lcom/daaw/qy1;->e:Landroidx/work/b;

    invoke-direct {v0, v1}, Landroidx/work/b;-><init>(Landroidx/work/b;)V

    iput-object v0, p0, Lcom/daaw/qy1;->e:Landroidx/work/b;

    new-instance v0, Landroidx/work/b;

    iget-object v1, p1, Lcom/daaw/qy1;->f:Landroidx/work/b;

    invoke-direct {v0, v1}, Landroidx/work/b;-><init>(Landroidx/work/b;)V

    iput-object v0, p0, Lcom/daaw/qy1;->f:Landroidx/work/b;

    iget-wide v0, p1, Lcom/daaw/qy1;->g:J

    iput-wide v0, p0, Lcom/daaw/qy1;->g:J

    iget-wide v0, p1, Lcom/daaw/qy1;->h:J

    iput-wide v0, p0, Lcom/daaw/qy1;->h:J

    iget-wide v0, p1, Lcom/daaw/qy1;->i:J

    iput-wide v0, p0, Lcom/daaw/qy1;->i:J

    new-instance v0, Lcom/daaw/sj;

    iget-object v1, p1, Lcom/daaw/qy1;->j:Lcom/daaw/sj;

    invoke-direct {v0, v1}, Lcom/daaw/sj;-><init>(Lcom/daaw/sj;)V

    iput-object v0, p0, Lcom/daaw/qy1;->j:Lcom/daaw/sj;

    iget v0, p1, Lcom/daaw/qy1;->k:I

    iput v0, p0, Lcom/daaw/qy1;->k:I

    iget-object v0, p1, Lcom/daaw/qy1;->l:Lcom/daaw/ha;

    iput-object v0, p0, Lcom/daaw/qy1;->l:Lcom/daaw/ha;

    iget-wide v0, p1, Lcom/daaw/qy1;->m:J

    iput-wide v0, p0, Lcom/daaw/qy1;->m:J

    iget-wide v0, p1, Lcom/daaw/qy1;->n:J

    iput-wide v0, p0, Lcom/daaw/qy1;->n:J

    iget-wide v0, p1, Lcom/daaw/qy1;->o:J

    iput-wide v0, p0, Lcom/daaw/qy1;->o:J

    iget-wide v0, p1, Lcom/daaw/qy1;->p:J

    iput-wide v0, p0, Lcom/daaw/qy1;->p:J

    iget-boolean v0, p1, Lcom/daaw/qy1;->q:Z

    iput-boolean v0, p0, Lcom/daaw/qy1;->q:Z

    iget-object p1, p1, Lcom/daaw/qy1;->r:Lcom/daaw/zu0;

    iput-object p1, p0, Lcom/daaw/qy1;->r:Lcom/daaw/zu0;

    return-void
.end method

.method public constructor <init>(Ljava/lang/String;Ljava/lang/String;)V
    .locals 2

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    sget-object v0, Lcom/daaw/yx1;->p:Lcom/daaw/yx1;

    iput-object v0, p0, Lcom/daaw/qy1;->b:Lcom/daaw/yx1;

    sget-object v0, Landroidx/work/b;->c:Landroidx/work/b;

    iput-object v0, p0, Lcom/daaw/qy1;->e:Landroidx/work/b;

    iput-object v0, p0, Lcom/daaw/qy1;->f:Landroidx/work/b;

    sget-object v0, Lcom/daaw/sj;->i:Lcom/daaw/sj;

    iput-object v0, p0, Lcom/daaw/qy1;->j:Lcom/daaw/sj;

    sget-object v0, Lcom/daaw/ha;->p:Lcom/daaw/ha;

    iput-object v0, p0, Lcom/daaw/qy1;->l:Lcom/daaw/ha;

    const-wide/16 v0, 0x7530

    iput-wide v0, p0, Lcom/daaw/qy1;->m:J

    const-wide/16 v0, -0x1

    iput-wide v0, p0, Lcom/daaw/qy1;->p:J

    sget-object v0, Lcom/daaw/zu0;->p:Lcom/daaw/zu0;

    iput-object v0, p0, Lcom/daaw/qy1;->r:Lcom/daaw/zu0;

    iput-object p1, p0, Lcom/daaw/qy1;->a:Ljava/lang/String;

    iput-object p2, p0, Lcom/daaw/qy1;->c:Ljava/lang/String;

    return-void
.end method


# virtual methods
.method public a()J
    .locals 13

    invoke-virtual {p0}, Lcom/daaw/qy1;->c()Z

    move-result v0

    const/4 v1, 0x0

    const/4 v2, 0x1

    if-eqz v0, :cond_2

    iget-object v0, p0, Lcom/daaw/qy1;->l:Lcom/daaw/ha;

    sget-object v3, Lcom/daaw/ha;->q:Lcom/daaw/ha;

    if-ne v0, v3, :cond_0

    const/4 v1, 0x1

    :cond_0
    if-eqz v1, :cond_1

    iget-wide v0, p0, Lcom/daaw/qy1;->m:J

    iget v2, p0, Lcom/daaw/qy1;->k:I

    int-to-long v2, v2

    mul-long v0, v0, v2

    goto :goto_0

    :cond_1
    iget-wide v0, p0, Lcom/daaw/qy1;->m:J

    long-to-float v0, v0

    iget v1, p0, Lcom/daaw/qy1;->k:I

    sub-int/2addr v1, v2

    invoke-static {v0, v1}, Ljava/lang/Math;->scalb(FI)F

    move-result v0

    float-to-long v0, v0

    :goto_0
    iget-wide v2, p0, Lcom/daaw/qy1;->n:J

    const-wide/32 v4, 0x112a880

    invoke-static {v4, v5, v0, v1}, Ljava/lang/Math;->min(JJ)J

    move-result-wide v0

    add-long/2addr v2, v0

    return-wide v2

    :cond_2
    invoke-virtual {p0}, Lcom/daaw/qy1;->d()Z

    move-result v0

    const-wide/16 v3, 0x0

    if-eqz v0, :cond_8

    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v5

    iget-wide v7, p0, Lcom/daaw/qy1;->n:J

    cmp-long v0, v7, v3

    if-nez v0, :cond_3

    iget-wide v9, p0, Lcom/daaw/qy1;->g:J

    add-long/2addr v5, v9

    goto :goto_1

    :cond_3
    move-wide v5, v7

    :goto_1
    iget-wide v9, p0, Lcom/daaw/qy1;->i:J

    iget-wide v11, p0, Lcom/daaw/qy1;->h:J

    cmp-long v0, v9, v11

    if-eqz v0, :cond_4

    const/4 v1, 0x1

    :cond_4
    cmp-long v0, v7, v3

    if-eqz v1, :cond_6

    if-nez v0, :cond_5

    const-wide/16 v0, -0x1

    mul-long v3, v9, v0

    :cond_5
    add-long/2addr v5, v11

    add-long/2addr v5, v3

    return-wide v5

    :cond_6
    if-nez v0, :cond_7

    goto :goto_2

    :cond_7
    move-wide v3, v11

    :goto_2
    add-long/2addr v5, v3

    return-wide v5

    :cond_8
    iget-wide v0, p0, Lcom/daaw/qy1;->n:J

    cmp-long v2, v0, v3

    if-nez v2, :cond_9

    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v0

    :cond_9
    iget-wide v2, p0, Lcom/daaw/qy1;->g:J

    add-long/2addr v0, v2

    return-wide v0
.end method

.method public b()Z
    .locals 2

    sget-object v0, Lcom/daaw/sj;->i:Lcom/daaw/sj;

    iget-object v1, p0, Lcom/daaw/qy1;->j:Lcom/daaw/sj;

    invoke-virtual {v0, v1}, Lcom/daaw/sj;->equals(Ljava/lang/Object;)Z

    move-result v0

    xor-int/lit8 v0, v0, 0x1

    return v0
.end method

.method public c()Z
    .locals 2

    iget-object v0, p0, Lcom/daaw/qy1;->b:Lcom/daaw/yx1;

    sget-object v1, Lcom/daaw/yx1;->p:Lcom/daaw/yx1;

    if-ne v0, v1, :cond_0

    iget v0, p0, Lcom/daaw/qy1;->k:I

    if-lez v0, :cond_0

    const/4 v0, 0x1

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    return v0
.end method

.method public d()Z
    .locals 5

    iget-wide v0, p0, Lcom/daaw/qy1;->h:J

    const-wide/16 v2, 0x0

    cmp-long v4, v0, v2

    if-eqz v4, :cond_0

    const/4 v0, 0x1

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    return v0
.end method

.method public equals(Ljava/lang/Object;)Z
    .locals 7

    const/4 v0, 0x1

    if-ne p0, p1, :cond_0

    return v0

    :cond_0
    const/4 v1, 0x0

    if-eqz p1, :cond_15

    const-class v2, Lcom/daaw/qy1;

    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v3

    if-eq v2, v3, :cond_1

    goto/16 :goto_2

    :cond_1
    check-cast p1, Lcom/daaw/qy1;

    iget-wide v2, p0, Lcom/daaw/qy1;->g:J

    iget-wide v4, p1, Lcom/daaw/qy1;->g:J

    cmp-long v6, v2, v4

    if-eqz v6, :cond_2

    return v1

    :cond_2
    iget-wide v2, p0, Lcom/daaw/qy1;->h:J

    iget-wide v4, p1, Lcom/daaw/qy1;->h:J

    cmp-long v6, v2, v4

    if-eqz v6, :cond_3

    return v1

    :cond_3
    iget-wide v2, p0, Lcom/daaw/qy1;->i:J

    iget-wide v4, p1, Lcom/daaw/qy1;->i:J

    cmp-long v6, v2, v4

    if-eqz v6, :cond_4

    return v1

    :cond_4
    iget v2, p0, Lcom/daaw/qy1;->k:I

    iget v3, p1, Lcom/daaw/qy1;->k:I

    if-eq v2, v3, :cond_5

    return v1

    :cond_5
    iget-wide v2, p0, Lcom/daaw/qy1;->m:J

    iget-wide v4, p1, Lcom/daaw/qy1;->m:J

    cmp-long v6, v2, v4

    if-eqz v6, :cond_6

    return v1

    :cond_6
    iget-wide v2, p0, Lcom/daaw/qy1;->n:J

    iget-wide v4, p1, Lcom/daaw/qy1;->n:J

    cmp-long v6, v2, v4

    if-eqz v6, :cond_7

    return v1

    :cond_7
    iget-wide v2, p0, Lcom/daaw/qy1;->o:J

    iget-wide v4, p1, Lcom/daaw/qy1;->o:J

    cmp-long v6, v2, v4

    if-eqz v6, :cond_8

    return v1

    :cond_8
    iget-wide v2, p0, Lcom/daaw/qy1;->p:J

    iget-wide v4, p1, Lcom/daaw/qy1;->p:J

    cmp-long v6, v2, v4

    if-eqz v6, :cond_9

    return v1

    :cond_9
    iget-boolean v2, p0, Lcom/daaw/qy1;->q:Z

    iget-boolean v3, p1, Lcom/daaw/qy1;->q:Z

    if-eq v2, v3, :cond_a

    return v1

    :cond_a
    iget-object v2, p0, Lcom/daaw/qy1;->a:Ljava/lang/String;

    iget-object v3, p1, Lcom/daaw/qy1;->a:Ljava/lang/String;

    invoke-virtual {v2, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v2

    if-nez v2, :cond_b

    return v1

    :cond_b
    iget-object v2, p0, Lcom/daaw/qy1;->b:Lcom/daaw/yx1;

    iget-object v3, p1, Lcom/daaw/qy1;->b:Lcom/daaw/yx1;

    if-eq v2, v3, :cond_c

    return v1

    :cond_c
    iget-object v2, p0, Lcom/daaw/qy1;->c:Ljava/lang/String;

    iget-object v3, p1, Lcom/daaw/qy1;->c:Ljava/lang/String;

    invoke-virtual {v2, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v2

    if-nez v2, :cond_d

    return v1

    :cond_d
    iget-object v2, p0, Lcom/daaw/qy1;->d:Ljava/lang/String;

    if-eqz v2, :cond_e

    iget-object v3, p1, Lcom/daaw/qy1;->d:Ljava/lang/String;

    invoke-virtual {v2, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v2

    if-nez v2, :cond_f

    goto :goto_0

    :cond_e
    iget-object v2, p1, Lcom/daaw/qy1;->d:Ljava/lang/String;

    if-eqz v2, :cond_f

    :goto_0
    return v1

    :cond_f
    iget-object v2, p0, Lcom/daaw/qy1;->e:Landroidx/work/b;

    iget-object v3, p1, Lcom/daaw/qy1;->e:Landroidx/work/b;

    invoke-virtual {v2, v3}, Landroidx/work/b;->equals(Ljava/lang/Object;)Z

    move-result v2

    if-nez v2, :cond_10

    return v1

    :cond_10
    iget-object v2, p0, Lcom/daaw/qy1;->f:Landroidx/work/b;

    iget-object v3, p1, Lcom/daaw/qy1;->f:Landroidx/work/b;

    invoke-virtual {v2, v3}, Landroidx/work/b;->equals(Ljava/lang/Object;)Z

    move-result v2

    if-nez v2, :cond_11

    return v1

    :cond_11
    iget-object v2, p0, Lcom/daaw/qy1;->j:Lcom/daaw/sj;

    iget-object v3, p1, Lcom/daaw/qy1;->j:Lcom/daaw/sj;

    invoke-virtual {v2, v3}, Lcom/daaw/sj;->equals(Ljava/lang/Object;)Z

    move-result v2

    if-nez v2, :cond_12

    return v1

    :cond_12
    iget-object v2, p0, Lcom/daaw/qy1;->l:Lcom/daaw/ha;

    iget-object v3, p1, Lcom/daaw/qy1;->l:Lcom/daaw/ha;

    if-eq v2, v3, :cond_13

    return v1

    :cond_13
    iget-object v2, p0, Lcom/daaw/qy1;->r:Lcom/daaw/zu0;

    iget-object p1, p1, Lcom/daaw/qy1;->r:Lcom/daaw/zu0;

    if-ne v2, p1, :cond_14

    goto :goto_1

    :cond_14
    const/4 v0, 0x0

    :goto_1
    return v0

    :cond_15
    :goto_2
    return v1
.end method

.method public hashCode()I
    .locals 6

    iget-object v0, p0, Lcom/daaw/qy1;->a:Ljava/lang/String;

    invoke-virtual {v0}, Ljava/lang/String;->hashCode()I

    move-result v0

    mul-int/lit8 v0, v0, 0x1f

    iget-object v1, p0, Lcom/daaw/qy1;->b:Lcom/daaw/yx1;

    invoke-virtual {v1}, Ljava/lang/Enum;->hashCode()I

    move-result v1

    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget-object v1, p0, Lcom/daaw/qy1;->c:Ljava/lang/String;

    invoke-virtual {v1}, Ljava/lang/String;->hashCode()I

    move-result v1

    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget-object v1, p0, Lcom/daaw/qy1;->d:Ljava/lang/String;

    if-eqz v1, :cond_0

    invoke-virtual {v1}, Ljava/lang/String;->hashCode()I

    move-result v1

    goto :goto_0

    :cond_0
    const/4 v1, 0x0

    :goto_0
    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget-object v1, p0, Lcom/daaw/qy1;->e:Landroidx/work/b;

    invoke-virtual {v1}, Landroidx/work/b;->hashCode()I

    move-result v1

    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget-object v1, p0, Lcom/daaw/qy1;->f:Landroidx/work/b;

    invoke-virtual {v1}, Landroidx/work/b;->hashCode()I

    move-result v1

    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget-wide v1, p0, Lcom/daaw/qy1;->g:J

    const/16 v3, 0x20

    ushr-long v4, v1, v3

    xor-long/2addr v1, v4

    long-to-int v2, v1

    add-int/2addr v0, v2

    mul-int/lit8 v0, v0, 0x1f

    iget-wide v1, p0, Lcom/daaw/qy1;->h:J

    ushr-long v4, v1, v3

    xor-long/2addr v1, v4

    long-to-int v2, v1

    add-int/2addr v0, v2

    mul-int/lit8 v0, v0, 0x1f

    iget-wide v1, p0, Lcom/daaw/qy1;->i:J

    ushr-long v4, v1, v3

    xor-long/2addr v1, v4

    long-to-int v2, v1

    add-int/2addr v0, v2

    mul-int/lit8 v0, v0, 0x1f

    iget-object v1, p0, Lcom/daaw/qy1;->j:Lcom/daaw/sj;

    invoke-virtual {v1}, Lcom/daaw/sj;->hashCode()I

    move-result v1

    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget v1, p0, Lcom/daaw/qy1;->k:I

    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget-object v1, p0, Lcom/daaw/qy1;->l:Lcom/daaw/ha;

    invoke-virtual {v1}, Ljava/lang/Enum;->hashCode()I

    move-result v1

    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget-wide v1, p0, Lcom/daaw/qy1;->m:J

    ushr-long v4, v1, v3

    xor-long/2addr v1, v4

    long-to-int v2, v1

    add-int/2addr v0, v2

    mul-int/lit8 v0, v0, 0x1f

    iget-wide v1, p0, Lcom/daaw/qy1;->n:J

    ushr-long v4, v1, v3

    xor-long/2addr v1, v4

    long-to-int v2, v1

    add-int/2addr v0, v2

    mul-int/lit8 v0, v0, 0x1f

    iget-wide v1, p0, Lcom/daaw/qy1;->o:J

    ushr-long v4, v1, v3

    xor-long/2addr v1, v4

    long-to-int v2, v1

    add-int/2addr v0, v2

    mul-int/lit8 v0, v0, 0x1f

    iget-wide v1, p0, Lcom/daaw/qy1;->p:J

    ushr-long v3, v1, v3

    xor-long/2addr v1, v3

    long-to-int v2, v1

    add-int/2addr v0, v2

    mul-int/lit8 v0, v0, 0x1f

    iget-boolean v1, p0, Lcom/daaw/qy1;->q:Z

    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget-object v1, p0, Lcom/daaw/qy1;->r:Lcom/daaw/zu0;

    invoke-virtual {v1}, Ljava/lang/Enum;->hashCode()I

    move-result v1

    add-int/2addr v0, v1

    return v0
.end method

.method public toString()Ljava/lang/String;
    .locals 2

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "{WorkSpec: "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Lcom/daaw/qy1;->a:Ljava/lang/String;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, "}"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
