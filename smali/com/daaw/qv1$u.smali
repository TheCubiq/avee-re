.class public Lcom/daaw/qv1$u;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Lcom/daaw/vw1$a;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/daaw/qv1;-><init>(Lcom/daaw/pv1;Lcom/daaw/xw0;Lcom/daaw/vm0;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Lcom/daaw/vw1$a<",
        "Lcom/daaw/dv1$d;",
        ">;"
    }
.end annotation


# instance fields
.field public final synthetic a:Lcom/daaw/qv1;


# direct methods
.method public constructor <init>(Lcom/daaw/qv1;)V
    .locals 0

    iput-object p1, p0, Lcom/daaw/qv1$u;->a:Lcom/daaw/qv1;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public bridge synthetic a()Ljava/lang/Object;
    .locals 1

    invoke-virtual {p0}, Lcom/daaw/qv1$u;->b()Lcom/daaw/dv1$d;

    move-result-object v0

    return-object v0
.end method

.method public b()Lcom/daaw/dv1$d;
    .locals 27

    move-object/from16 v0, p0

    new-instance v1, Lcom/daaw/dv1$d;

    invoke-direct {v1}, Lcom/daaw/dv1$d;-><init>()V

    const/4 v2, 0x4

    new-array v3, v2, [Ljava/lang/Integer;

    iget-object v4, v0, Lcom/daaw/qv1$u;->a:Lcom/daaw/qv1;

    invoke-static {v4}, Lcom/daaw/qv1;->S(Lcom/daaw/qv1;)I

    move-result v4

    invoke-static {v4}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v4

    const/4 v5, 0x0

    aput-object v4, v3, v5

    iget-object v4, v0, Lcom/daaw/qv1$u;->a:Lcom/daaw/qv1;

    invoke-static {v4}, Lcom/daaw/qv1;->a(Lcom/daaw/qv1;)I

    move-result v4

    invoke-static {v4}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v4

    const/4 v6, 0x1

    aput-object v4, v3, v6

    sget v4, Landroid/os/Build$VERSION;->SDK_INT:I

    invoke-static {v4}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v4

    const/4 v7, 0x2

    aput-object v4, v3, v7

    invoke-static {v5}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v4

    const/4 v8, 0x3

    aput-object v4, v3, v8

    sget-object v4, Lcom/daaw/qv1;->P:Lcom/daaw/ww1;

    sget-object v9, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    invoke-virtual {v4, v3, v9}, Lcom/daaw/ww1;->a(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Ljava/lang/Boolean;

    invoke-virtual {v4}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v4

    if-eqz v4, :cond_0

    aget-object v4, v3, v7

    aget-object v3, v3, v8

    invoke-virtual {v4, v3}, Ljava/lang/Integer;->equals(Ljava/lang/Object;)Z

    move-result v3

    if-eqz v3, :cond_0

    iget-object v3, v0, Lcom/daaw/qv1$u;->a:Lcom/daaw/qv1;

    const/4 v4, 0x7

    new-array v4, v4, [Lcom/daaw/dv1$e;

    new-instance v17, Lcom/daaw/dv1$e;

    const/4 v10, 0x0

    const/16 v11, 0x870

    const/16 v12, 0x438

    const/16 v13, 0x3c

    const/high16 v14, 0x41a80000    # 21.0f

    const/4 v15, 0x1

    const/16 v16, 0x1

    move-object/from16 v9, v17

    invoke-direct/range {v9 .. v16}, Lcom/daaw/dv1$e;-><init>(IIIIFZI)V

    aput-object v17, v4, v5

    new-instance v9, Lcom/daaw/dv1$e;

    const/16 v19, 0x0

    const/16 v20, 0x780

    const/16 v21, 0x438

    const/16 v22, 0x3c

    const/high16 v15, 0x41900000    # 18.0f

    const/16 v24, 0x1

    const/16 v25, 0x1

    move-object/from16 v18, v9

    move/from16 v23, v15

    invoke-direct/range {v18 .. v25}, Lcom/daaw/dv1$e;-><init>(IIIIFZI)V

    aput-object v9, v4, v6

    new-instance v9, Lcom/daaw/dv1$e;

    const/4 v11, 0x1

    const/16 v12, 0x780

    const/16 v13, 0x438

    const/16 v14, 0x3c

    const/16 v17, 0x0

    move-object v10, v9

    invoke-direct/range {v10 .. v17}, Lcom/daaw/dv1$e;-><init>(IIIIFZI)V

    aput-object v9, v4, v7

    new-instance v9, Lcom/daaw/dv1$e;

    const/16 v19, 0x1

    const/16 v22, 0x1e

    const/high16 v26, 0x41400000    # 12.0f

    move-object/from16 v18, v9

    move/from16 v23, v26

    invoke-direct/range {v18 .. v25}, Lcom/daaw/dv1$e;-><init>(IIIIFZI)V

    aput-object v9, v4, v8

    new-instance v8, Lcom/daaw/dv1$e;

    const/16 v14, 0x1e

    move-object v10, v8

    move/from16 v15, v26

    invoke-direct/range {v10 .. v17}, Lcom/daaw/dv1$e;-><init>(IIIIFZI)V

    aput-object v8, v4, v2

    const/4 v2, 0x5

    new-instance v8, Lcom/daaw/dv1$e;

    const/4 v11, 0x0

    const/16 v12, 0x500

    const/16 v13, 0x2d0

    const/16 v14, 0x3c

    move-object v10, v8

    invoke-direct/range {v10 .. v17}, Lcom/daaw/dv1$e;-><init>(IIIIFZI)V

    aput-object v8, v4, v2

    const/4 v2, 0x6

    new-instance v16, Lcom/daaw/dv1$e;

    const/4 v9, 0x1

    const/16 v10, 0x500

    const/16 v11, 0x2d0

    const/16 v12, 0x1e

    const/high16 v13, 0x40f00000    # 7.5f

    const/4 v14, 0x1

    const/4 v15, 0x0

    move-object/from16 v8, v16

    invoke-direct/range {v8 .. v15}, Lcom/daaw/dv1$e;-><init>(IIIIFZI)V

    aput-object v16, v4, v2

    invoke-static {v3, v4}, Lcom/daaw/qv1;->d(Lcom/daaw/qv1;[Lcom/daaw/dv1$e;)[Lcom/daaw/dv1$e;

    iput v7, v1, Lcom/daaw/dv1$d;->b:I

    const/4 v2, 0x1

    goto :goto_0

    :cond_0
    iget-object v2, v0, Lcom/daaw/qv1$u;->a:Lcom/daaw/qv1;

    new-array v3, v7, [Lcom/daaw/dv1$e;

    new-instance v4, Lcom/daaw/dv1$e;

    const/4 v8, 0x0

    const/16 v9, 0x500

    const/16 v10, 0x2d0

    const/16 v11, 0x1e

    const/high16 v12, 0x40f00000    # 7.5f

    const/4 v13, 0x2

    const/high16 v14, 0x43000000    # 128.0f

    const/4 v15, 0x0

    move-object v7, v4

    invoke-direct/range {v7 .. v15}, Lcom/daaw/dv1$e;-><init>(IIIIFIFI)V

    aput-object v4, v3, v5

    new-instance v4, Lcom/daaw/dv1$e;

    const/16 v17, 0x0

    const/16 v18, 0x500

    const/16 v19, 0x2d0

    const/16 v20, 0x19

    const/high16 v21, 0x40c00000    # 6.0f

    const/16 v22, 0x2

    const/high16 v23, 0x43000000    # 128.0f

    const/16 v24, 0x0

    move-object/from16 v16, v4

    invoke-direct/range {v16 .. v24}, Lcom/daaw/dv1$e;-><init>(IIIIFIFI)V

    aput-object v4, v3, v6

    invoke-static {v2, v3}, Lcom/daaw/qv1;->d(Lcom/daaw/qv1;[Lcom/daaw/dv1$e;)[Lcom/daaw/dv1$e;

    iput v5, v1, Lcom/daaw/dv1$d;->b:I

    const/4 v2, 0x0

    :goto_0
    iget-object v3, v0, Lcom/daaw/qv1$u;->a:Lcom/daaw/qv1;

    invoke-static {v3}, Lcom/daaw/qv1;->c(Lcom/daaw/qv1;)[Lcom/daaw/dv1$e;

    move-result-object v3

    iput-object v3, v1, Lcom/daaw/dv1$d;->a:[Lcom/daaw/dv1$e;

    iget v3, v1, Lcom/daaw/dv1$d;->b:I

    invoke-virtual {v1, v3}, Lcom/daaw/dv1$d;->d(I)Lcom/daaw/dv1$e;

    move-result-object v3

    iput-object v3, v1, Lcom/daaw/dv1$d;->c:Lcom/daaw/dv1$e;

    if-nez v3, :cond_1

    new-instance v3, Lcom/daaw/dv1$e;

    const/4 v8, 0x0

    const/16 v9, 0x780

    const/16 v10, 0x438

    const/16 v11, 0x1e

    const/high16 v12, 0x41000000    # 8.0f

    const/4 v13, 0x1

    const/high16 v14, 0x43000000    # 128.0f

    const/4 v15, 0x0

    move-object v7, v3

    invoke-direct/range {v7 .. v15}, Lcom/daaw/dv1$e;-><init>(IIIIFIFI)V

    iput-object v3, v1, Lcom/daaw/dv1$d;->c:Lcom/daaw/dv1$e;

    :cond_1
    new-array v3, v6, [I

    aput v5, v3, v5

    invoke-static {v3}, Lcom/daaw/dx;->a([I)Ljava/util/List;

    move-result-object v4

    iput-object v4, v1, Lcom/daaw/dv1$d;->d:Ljava/util/List;

    aget v3, v3, v5

    iput v3, v1, Lcom/daaw/dv1$d;->e:I

    iget-object v3, v0, Lcom/daaw/qv1$u;->a:Lcom/daaw/qv1;

    const-string v4, "/"

    invoke-static {v3, v4}, Lcom/daaw/qv1;->e(Lcom/daaw/qv1;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v3

    iput-object v3, v1, Lcom/daaw/dv1$d;->f:Ljava/lang/String;

    const-string v3, ""

    iput-object v3, v1, Lcom/daaw/dv1$d;->g:Ljava/lang/String;

    iget-object v3, v0, Lcom/daaw/qv1$u;->a:Lcom/daaw/qv1;

    invoke-static {v3}, Lcom/daaw/qv1;->f(Lcom/daaw/qv1;)Lcom/daaw/tx0$b;

    move-result-object v3

    if-eqz v3, :cond_2

    new-instance v3, Ljava/lang/StringBuilder;

    invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V

    iget-object v4, v0, Lcom/daaw/qv1$u;->a:Lcom/daaw/qv1;

    invoke-static {v4}, Lcom/daaw/qv1;->f(Lcom/daaw/qv1;)Lcom/daaw/tx0$b;

    move-result-object v4

    iget-object v4, v4, Lcom/daaw/tx0$b;->e:Ljava/lang/String;

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v4, " exported"

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v3

    invoke-static {v3}, Lcom/daaw/cr1;->n(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v3

    iput-object v3, v1, Lcom/daaw/dv1$d;->g:Ljava/lang/String;

    :cond_2
    iget-object v3, v1, Lcom/daaw/dv1$d;->g:Ljava/lang/String;

    invoke-virtual {v3}, Ljava/lang/String;->length()I

    move-result v3

    if-ge v3, v6, :cond_3

    const-string v3, "exported"

    invoke-static {v3}, Lcom/daaw/cr1;->n(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v3

    iput-object v3, v1, Lcom/daaw/dv1$d;->g:Ljava/lang/String;

    :cond_3
    iput-boolean v6, v1, Lcom/daaw/dv1$d;->l:Z

    iput-boolean v5, v1, Lcom/daaw/dv1$d;->m:Z

    iput-boolean v5, v1, Lcom/daaw/dv1$d;->k:Z

    iput-boolean v6, v1, Lcom/daaw/dv1$d;->h:Z

    iput v5, v1, Lcom/daaw/dv1$d;->i:I

    iget-object v3, v0, Lcom/daaw/qv1$u;->a:Lcom/daaw/qv1;

    invoke-static {v3}, Lcom/daaw/qv1;->f(Lcom/daaw/qv1;)Lcom/daaw/tx0$b;

    move-result-object v3

    if-eqz v3, :cond_5

    if-eqz v2, :cond_4

    iget-object v2, v0, Lcom/daaw/qv1$u;->a:Lcom/daaw/qv1;

    invoke-static {v2}, Lcom/daaw/qv1;->f(Lcom/daaw/qv1;)Lcom/daaw/tx0$b;

    move-result-object v2

    iget v2, v2, Lcom/daaw/tx0$b;->j:I

    goto :goto_1

    :cond_4
    const v2, 0x927c0

    iget-object v3, v0, Lcom/daaw/qv1$u;->a:Lcom/daaw/qv1;

    invoke-static {v3}, Lcom/daaw/qv1;->f(Lcom/daaw/qv1;)Lcom/daaw/tx0$b;

    move-result-object v3

    iget v3, v3, Lcom/daaw/tx0$b;->j:I

    invoke-static {v2, v3}, Ljava/lang/Math;->min(II)I

    move-result v2

    :goto_1
    iput v2, v1, Lcom/daaw/dv1$d;->j:I

    goto :goto_2

    :cond_5
    iput v5, v1, Lcom/daaw/dv1$d;->j:I

    :goto_2
    invoke-static {}, Lcom/daaw/j5;->e()Lcom/daaw/j5;

    move-result-object v2

    sget v3, Lcom/daaw/j5;->w0:I

    invoke-virtual {v2, v3}, Lcom/daaw/j5;->t(I)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Lcom/daaw/dv1$d;->b(Ljava/lang/String;)V

    iget-object v2, v1, Lcom/daaw/dv1$d;->c:Lcom/daaw/dv1$e;

    invoke-static {}, Lcom/daaw/j5;->e()Lcom/daaw/j5;

    move-result-object v3

    sget v4, Lcom/daaw/j5;->x0:I

    invoke-virtual {v3, v4}, Lcom/daaw/j5;->t(I)Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v2, v3}, Lcom/daaw/dv1$e;->b(Ljava/lang/String;)V

    const/4 v2, -0x1

    iput v2, v1, Lcom/daaw/dv1$d;->b:I

    return-object v1
.end method
