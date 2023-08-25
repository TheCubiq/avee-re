.class public final Lcom/daaw/n80$b;
.super Ljava/lang/Object;
.source ""


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/daaw/n80;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "b"
.end annotation

.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/daaw/n80$b$a;
    }
.end annotation


# instance fields
.field public final a:Lcom/daaw/sm1;

.field public final b:Z

.field public final c:Z

.field public final d:Landroid/util/SparseArray;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Landroid/util/SparseArray<",
            "Lcom/daaw/sr0$b;",
            ">;"
        }
    .end annotation
.end field

.field public final e:Landroid/util/SparseArray;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Landroid/util/SparseArray<",
            "Lcom/daaw/sr0$a;",
            ">;"
        }
    .end annotation
.end field

.field public final f:Lcom/daaw/sv0;

.field public g:[B

.field public h:I

.field public i:I

.field public j:J

.field public k:Z

.field public l:J

.field public m:Lcom/daaw/n80$b$a;

.field public n:Lcom/daaw/n80$b$a;

.field public o:Z

.field public p:J

.field public q:J

.field public r:Z


# direct methods
.method public constructor <init>(Lcom/daaw/sm1;ZZ)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/daaw/n80$b;->a:Lcom/daaw/sm1;

    iput-boolean p2, p0, Lcom/daaw/n80$b;->b:Z

    iput-boolean p3, p0, Lcom/daaw/n80$b;->c:Z

    new-instance p1, Landroid/util/SparseArray;

    invoke-direct {p1}, Landroid/util/SparseArray;-><init>()V

    iput-object p1, p0, Lcom/daaw/n80$b;->d:Landroid/util/SparseArray;

    new-instance p1, Landroid/util/SparseArray;

    invoke-direct {p1}, Landroid/util/SparseArray;-><init>()V

    iput-object p1, p0, Lcom/daaw/n80$b;->e:Landroid/util/SparseArray;

    new-instance p1, Lcom/daaw/n80$b$a;

    const/4 p2, 0x0

    invoke-direct {p1, p2}, Lcom/daaw/n80$b$a;-><init>(Lcom/daaw/n80$a;)V

    iput-object p1, p0, Lcom/daaw/n80$b;->m:Lcom/daaw/n80$b$a;

    new-instance p1, Lcom/daaw/n80$b$a;

    invoke-direct {p1, p2}, Lcom/daaw/n80$b$a;-><init>(Lcom/daaw/n80$a;)V

    iput-object p1, p0, Lcom/daaw/n80$b;->n:Lcom/daaw/n80$b$a;

    const/16 p1, 0x80

    new-array p1, p1, [B

    iput-object p1, p0, Lcom/daaw/n80$b;->g:[B

    new-instance p2, Lcom/daaw/sv0;

    const/4 p3, 0x0

    invoke-direct {p2, p1, p3, p3}, Lcom/daaw/sv0;-><init>([BII)V

    iput-object p2, p0, Lcom/daaw/n80$b;->f:Lcom/daaw/sv0;

    invoke-virtual {p0}, Lcom/daaw/n80$b;->g()V

    return-void
.end method


# virtual methods
.method public a([BII)V
    .locals 23

    move-object/from16 v0, p0

    move/from16 v1, p2

    iget-boolean v2, v0, Lcom/daaw/n80$b;->k:Z

    if-nez v2, :cond_0

    return-void

    :cond_0
    sub-int v2, p3, v1

    iget-object v3, v0, Lcom/daaw/n80$b;->g:[B

    array-length v4, v3

    iget v5, v0, Lcom/daaw/n80$b;->h:I

    add-int v6, v5, v2

    const/4 v7, 0x2

    if-ge v4, v6, :cond_1

    add-int/2addr v5, v2

    mul-int/lit8 v5, v5, 0x2

    invoke-static {v3, v5}, Ljava/util/Arrays;->copyOf([BI)[B

    move-result-object v3

    iput-object v3, v0, Lcom/daaw/n80$b;->g:[B

    :cond_1
    iget-object v3, v0, Lcom/daaw/n80$b;->g:[B

    iget v4, v0, Lcom/daaw/n80$b;->h:I

    move-object/from16 v5, p1

    invoke-static {v5, v1, v3, v4, v2}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    iget v1, v0, Lcom/daaw/n80$b;->h:I

    add-int/2addr v1, v2

    iput v1, v0, Lcom/daaw/n80$b;->h:I

    iget-object v2, v0, Lcom/daaw/n80$b;->f:Lcom/daaw/sv0;

    iget-object v3, v0, Lcom/daaw/n80$b;->g:[B

    const/4 v4, 0x0

    invoke-virtual {v2, v3, v4, v1}, Lcom/daaw/sv0;->i([BII)V

    iget-object v1, v0, Lcom/daaw/n80$b;->f:Lcom/daaw/sv0;

    const/16 v2, 0x8

    invoke-virtual {v1, v2}, Lcom/daaw/sv0;->b(I)Z

    move-result v1

    if-nez v1, :cond_2

    return-void

    :cond_2
    iget-object v1, v0, Lcom/daaw/n80$b;->f:Lcom/daaw/sv0;

    invoke-virtual {v1}, Lcom/daaw/sv0;->k()V

    iget-object v1, v0, Lcom/daaw/n80$b;->f:Lcom/daaw/sv0;

    invoke-virtual {v1, v7}, Lcom/daaw/sv0;->e(I)I

    move-result v10

    iget-object v1, v0, Lcom/daaw/n80$b;->f:Lcom/daaw/sv0;

    const/4 v2, 0x5

    invoke-virtual {v1, v2}, Lcom/daaw/sv0;->l(I)V

    iget-object v1, v0, Lcom/daaw/n80$b;->f:Lcom/daaw/sv0;

    invoke-virtual {v1}, Lcom/daaw/sv0;->c()Z

    move-result v1

    if-nez v1, :cond_3

    return-void

    :cond_3
    iget-object v1, v0, Lcom/daaw/n80$b;->f:Lcom/daaw/sv0;

    invoke-virtual {v1}, Lcom/daaw/sv0;->h()I

    iget-object v1, v0, Lcom/daaw/n80$b;->f:Lcom/daaw/sv0;

    invoke-virtual {v1}, Lcom/daaw/sv0;->c()Z

    move-result v1

    if-nez v1, :cond_4

    return-void

    :cond_4
    iget-object v1, v0, Lcom/daaw/n80$b;->f:Lcom/daaw/sv0;

    invoke-virtual {v1}, Lcom/daaw/sv0;->h()I

    move-result v11

    iget-boolean v1, v0, Lcom/daaw/n80$b;->c:Z

    if-nez v1, :cond_5

    iput-boolean v4, v0, Lcom/daaw/n80$b;->k:Z

    iget-object v1, v0, Lcom/daaw/n80$b;->n:Lcom/daaw/n80$b$a;

    invoke-virtual {v1, v11}, Lcom/daaw/n80$b$a;->f(I)V

    return-void

    :cond_5
    iget-object v1, v0, Lcom/daaw/n80$b;->f:Lcom/daaw/sv0;

    invoke-virtual {v1}, Lcom/daaw/sv0;->c()Z

    move-result v1

    if-nez v1, :cond_6

    return-void

    :cond_6
    iget-object v1, v0, Lcom/daaw/n80$b;->f:Lcom/daaw/sv0;

    invoke-virtual {v1}, Lcom/daaw/sv0;->h()I

    move-result v13

    iget-object v1, v0, Lcom/daaw/n80$b;->e:Landroid/util/SparseArray;

    invoke-virtual {v1, v13}, Landroid/util/SparseArray;->indexOfKey(I)I

    move-result v1

    if-gez v1, :cond_7

    iput-boolean v4, v0, Lcom/daaw/n80$b;->k:Z

    return-void

    :cond_7
    iget-object v1, v0, Lcom/daaw/n80$b;->e:Landroid/util/SparseArray;

    invoke-virtual {v1, v13}, Landroid/util/SparseArray;->get(I)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lcom/daaw/sr0$a;

    iget-object v3, v0, Lcom/daaw/n80$b;->d:Landroid/util/SparseArray;

    iget v5, v1, Lcom/daaw/sr0$a;->b:I

    invoke-virtual {v3, v5}, Landroid/util/SparseArray;->get(I)Ljava/lang/Object;

    move-result-object v3

    move-object v9, v3

    check-cast v9, Lcom/daaw/sr0$b;

    iget-boolean v3, v9, Lcom/daaw/sr0$b;->e:Z

    if-eqz v3, :cond_9

    iget-object v3, v0, Lcom/daaw/n80$b;->f:Lcom/daaw/sv0;

    invoke-virtual {v3, v7}, Lcom/daaw/sv0;->b(I)Z

    move-result v3

    if-nez v3, :cond_8

    return-void

    :cond_8
    iget-object v3, v0, Lcom/daaw/n80$b;->f:Lcom/daaw/sv0;

    invoke-virtual {v3, v7}, Lcom/daaw/sv0;->l(I)V

    :cond_9
    iget-object v3, v0, Lcom/daaw/n80$b;->f:Lcom/daaw/sv0;

    iget v5, v9, Lcom/daaw/sr0$b;->g:I

    invoke-virtual {v3, v5}, Lcom/daaw/sv0;->b(I)Z

    move-result v3

    if-nez v3, :cond_a

    return-void

    :cond_a
    iget-object v3, v0, Lcom/daaw/n80$b;->f:Lcom/daaw/sv0;

    iget v5, v9, Lcom/daaw/sr0$b;->g:I

    invoke-virtual {v3, v5}, Lcom/daaw/sv0;->e(I)I

    move-result v12

    iget-boolean v3, v9, Lcom/daaw/sr0$b;->f:Z

    const/4 v5, 0x1

    if-nez v3, :cond_e

    iget-object v3, v0, Lcom/daaw/n80$b;->f:Lcom/daaw/sv0;

    invoke-virtual {v3, v5}, Lcom/daaw/sv0;->b(I)Z

    move-result v3

    if-nez v3, :cond_b

    return-void

    :cond_b
    iget-object v3, v0, Lcom/daaw/n80$b;->f:Lcom/daaw/sv0;

    invoke-virtual {v3}, Lcom/daaw/sv0;->d()Z

    move-result v3

    if-eqz v3, :cond_d

    iget-object v6, v0, Lcom/daaw/n80$b;->f:Lcom/daaw/sv0;

    invoke-virtual {v6, v5}, Lcom/daaw/sv0;->b(I)Z

    move-result v6

    if-nez v6, :cond_c

    return-void

    :cond_c
    iget-object v6, v0, Lcom/daaw/n80$b;->f:Lcom/daaw/sv0;

    invoke-virtual {v6}, Lcom/daaw/sv0;->d()Z

    move-result v6

    move v14, v3

    move/from16 v16, v6

    const/4 v15, 0x1

    goto :goto_1

    :cond_d
    move v14, v3

    goto :goto_0

    :cond_e
    const/4 v14, 0x0

    :goto_0
    const/4 v15, 0x0

    const/16 v16, 0x0

    :goto_1
    iget v3, v0, Lcom/daaw/n80$b;->i:I

    if-ne v3, v2, :cond_f

    const/16 v17, 0x1

    goto :goto_2

    :cond_f
    const/16 v17, 0x0

    :goto_2
    if-eqz v17, :cond_11

    iget-object v2, v0, Lcom/daaw/n80$b;->f:Lcom/daaw/sv0;

    invoke-virtual {v2}, Lcom/daaw/sv0;->c()Z

    move-result v2

    if-nez v2, :cond_10

    return-void

    :cond_10
    iget-object v2, v0, Lcom/daaw/n80$b;->f:Lcom/daaw/sv0;

    invoke-virtual {v2}, Lcom/daaw/sv0;->h()I

    move-result v2

    move/from16 v18, v2

    goto :goto_3

    :cond_11
    const/16 v18, 0x0

    :goto_3
    iget v2, v9, Lcom/daaw/sr0$b;->h:I

    if-nez v2, :cond_15

    iget-object v2, v0, Lcom/daaw/n80$b;->f:Lcom/daaw/sv0;

    iget v3, v9, Lcom/daaw/sr0$b;->i:I

    invoke-virtual {v2, v3}, Lcom/daaw/sv0;->b(I)Z

    move-result v2

    if-nez v2, :cond_12

    return-void

    :cond_12
    iget-object v2, v0, Lcom/daaw/n80$b;->f:Lcom/daaw/sv0;

    iget v3, v9, Lcom/daaw/sr0$b;->i:I

    invoke-virtual {v2, v3}, Lcom/daaw/sv0;->e(I)I

    move-result v2

    iget-boolean v1, v1, Lcom/daaw/sr0$a;->c:Z

    if-eqz v1, :cond_14

    if-nez v14, :cond_14

    iget-object v1, v0, Lcom/daaw/n80$b;->f:Lcom/daaw/sv0;

    invoke-virtual {v1}, Lcom/daaw/sv0;->c()Z

    move-result v1

    if-nez v1, :cond_13

    return-void

    :cond_13
    iget-object v1, v0, Lcom/daaw/n80$b;->f:Lcom/daaw/sv0;

    invoke-virtual {v1}, Lcom/daaw/sv0;->g()I

    move-result v1

    move/from16 v20, v1

    move/from16 v19, v2

    goto :goto_5

    :cond_14
    move/from16 v19, v2

    goto :goto_4

    :cond_15
    if-ne v2, v5, :cond_19

    iget-boolean v2, v9, Lcom/daaw/sr0$b;->j:Z

    if-nez v2, :cond_19

    iget-object v2, v0, Lcom/daaw/n80$b;->f:Lcom/daaw/sv0;

    invoke-virtual {v2}, Lcom/daaw/sv0;->c()Z

    move-result v2

    if-nez v2, :cond_16

    return-void

    :cond_16
    iget-object v2, v0, Lcom/daaw/n80$b;->f:Lcom/daaw/sv0;

    invoke-virtual {v2}, Lcom/daaw/sv0;->g()I

    move-result v2

    iget-boolean v1, v1, Lcom/daaw/sr0$a;->c:Z

    if-eqz v1, :cond_18

    if-nez v14, :cond_18

    iget-object v1, v0, Lcom/daaw/n80$b;->f:Lcom/daaw/sv0;

    invoke-virtual {v1}, Lcom/daaw/sv0;->c()Z

    move-result v1

    if-nez v1, :cond_17

    return-void

    :cond_17
    iget-object v1, v0, Lcom/daaw/n80$b;->f:Lcom/daaw/sv0;

    invoke-virtual {v1}, Lcom/daaw/sv0;->g()I

    move-result v1

    move/from16 v22, v1

    move/from16 v21, v2

    const/16 v19, 0x0

    const/16 v20, 0x0

    goto :goto_7

    :cond_18
    move/from16 v21, v2

    const/16 v19, 0x0

    const/16 v20, 0x0

    goto :goto_6

    :cond_19
    const/16 v19, 0x0

    :goto_4
    const/16 v20, 0x0

    :goto_5
    const/16 v21, 0x0

    :goto_6
    const/16 v22, 0x0

    :goto_7
    iget-object v8, v0, Lcom/daaw/n80$b;->n:Lcom/daaw/n80$b$a;

    invoke-virtual/range {v8 .. v22}, Lcom/daaw/n80$b$a;->e(Lcom/daaw/sr0$b;IIIIZZZZIIIII)V

    iput-boolean v4, v0, Lcom/daaw/n80$b;->k:Z

    return-void
.end method

.method public b(JI)V
    .locals 5

    iget v0, p0, Lcom/daaw/n80$b;->i:I

    const/4 v1, 0x0

    const/4 v2, 0x1

    const/16 v3, 0x9

    if-eq v0, v3, :cond_0

    iget-boolean v0, p0, Lcom/daaw/n80$b;->c:Z

    if-eqz v0, :cond_2

    iget-object v0, p0, Lcom/daaw/n80$b;->n:Lcom/daaw/n80$b$a;

    iget-object v3, p0, Lcom/daaw/n80$b;->m:Lcom/daaw/n80$b$a;

    invoke-static {v0, v3}, Lcom/daaw/n80$b$a;->a(Lcom/daaw/n80$b$a;Lcom/daaw/n80$b$a;)Z

    move-result v0

    if-eqz v0, :cond_2

    :cond_0
    iget-boolean v0, p0, Lcom/daaw/n80$b;->o:Z

    if-eqz v0, :cond_1

    iget-wide v3, p0, Lcom/daaw/n80$b;->j:J

    sub-long/2addr p1, v3

    long-to-int p2, p1

    add-int/2addr p3, p2

    invoke-virtual {p0, p3}, Lcom/daaw/n80$b;->d(I)V

    :cond_1
    iget-wide p1, p0, Lcom/daaw/n80$b;->j:J

    iput-wide p1, p0, Lcom/daaw/n80$b;->p:J

    iget-wide p1, p0, Lcom/daaw/n80$b;->l:J

    iput-wide p1, p0, Lcom/daaw/n80$b;->q:J

    iput-boolean v1, p0, Lcom/daaw/n80$b;->r:Z

    iput-boolean v2, p0, Lcom/daaw/n80$b;->o:Z

    :cond_2
    iget-boolean p1, p0, Lcom/daaw/n80$b;->r:Z

    iget p2, p0, Lcom/daaw/n80$b;->i:I

    const/4 p3, 0x5

    if-eq p2, p3, :cond_3

    iget-boolean p3, p0, Lcom/daaw/n80$b;->b:Z

    if-eqz p3, :cond_4

    if-ne p2, v2, :cond_4

    iget-object p2, p0, Lcom/daaw/n80$b;->n:Lcom/daaw/n80$b$a;

    invoke-virtual {p2}, Lcom/daaw/n80$b$a;->d()Z

    move-result p2

    if-eqz p2, :cond_4

    :cond_3
    const/4 v1, 0x1

    :cond_4
    or-int/2addr p1, v1

    iput-boolean p1, p0, Lcom/daaw/n80$b;->r:Z

    return-void
.end method

.method public c()Z
    .locals 1

    iget-boolean v0, p0, Lcom/daaw/n80$b;->c:Z

    return v0
.end method

.method public final d(I)V
    .locals 7

    iget-boolean v3, p0, Lcom/daaw/n80$b;->r:Z

    iget-wide v0, p0, Lcom/daaw/n80$b;->j:J

    iget-wide v4, p0, Lcom/daaw/n80$b;->p:J

    sub-long/2addr v0, v4

    long-to-int v4, v0

    iget-object v0, p0, Lcom/daaw/n80$b;->a:Lcom/daaw/sm1;

    iget-wide v1, p0, Lcom/daaw/n80$b;->q:J

    const/4 v6, 0x0

    move v5, p1

    invoke-interface/range {v0 .. v6}, Lcom/daaw/sm1;->a(JIIILcom/daaw/sm1$a;)V

    return-void
.end method

.method public e(Lcom/daaw/sr0$a;)V
    .locals 2

    iget-object v0, p0, Lcom/daaw/n80$b;->e:Landroid/util/SparseArray;

    iget v1, p1, Lcom/daaw/sr0$a;->a:I

    invoke-virtual {v0, v1, p1}, Landroid/util/SparseArray;->append(ILjava/lang/Object;)V

    return-void
.end method

.method public f(Lcom/daaw/sr0$b;)V
    .locals 2

    iget-object v0, p0, Lcom/daaw/n80$b;->d:Landroid/util/SparseArray;

    iget v1, p1, Lcom/daaw/sr0$b;->a:I

    invoke-virtual {v0, v1, p1}, Landroid/util/SparseArray;->append(ILjava/lang/Object;)V

    return-void
.end method

.method public g()V
    .locals 1

    const/4 v0, 0x0

    iput-boolean v0, p0, Lcom/daaw/n80$b;->k:Z

    iput-boolean v0, p0, Lcom/daaw/n80$b;->o:Z

    iget-object v0, p0, Lcom/daaw/n80$b;->n:Lcom/daaw/n80$b$a;

    invoke-virtual {v0}, Lcom/daaw/n80$b$a;->b()V

    return-void
.end method

.method public h(JIJ)V
    .locals 0

    iput p3, p0, Lcom/daaw/n80$b;->i:I

    iput-wide p4, p0, Lcom/daaw/n80$b;->l:J

    iput-wide p1, p0, Lcom/daaw/n80$b;->j:J

    iget-boolean p1, p0, Lcom/daaw/n80$b;->b:Z

    const/4 p2, 0x1

    if-eqz p1, :cond_0

    if-eq p3, p2, :cond_1

    :cond_0
    iget-boolean p1, p0, Lcom/daaw/n80$b;->c:Z

    if-eqz p1, :cond_2

    const/4 p1, 0x5

    if-eq p3, p1, :cond_1

    if-eq p3, p2, :cond_1

    const/4 p1, 0x2

    if-ne p3, p1, :cond_2

    :cond_1
    iget-object p1, p0, Lcom/daaw/n80$b;->m:Lcom/daaw/n80$b$a;

    iget-object p3, p0, Lcom/daaw/n80$b;->n:Lcom/daaw/n80$b$a;

    iput-object p3, p0, Lcom/daaw/n80$b;->m:Lcom/daaw/n80$b$a;

    iput-object p1, p0, Lcom/daaw/n80$b;->n:Lcom/daaw/n80$b$a;

    invoke-virtual {p1}, Lcom/daaw/n80$b$a;->b()V

    const/4 p1, 0x0

    iput p1, p0, Lcom/daaw/n80$b;->h:I

    iput-boolean p2, p0, Lcom/daaw/n80$b;->k:Z

    :cond_2
    return-void
.end method
