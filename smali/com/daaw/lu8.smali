.class public final synthetic Lcom/daaw/lu8;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Lcom/daaw/mv8;


# instance fields
.field public final synthetic a:Lcom/daaw/rv8;

.field public final synthetic b:Lcom/daaw/fv8;

.field public final synthetic c:Z


# direct methods
.method public synthetic constructor <init>(Lcom/daaw/rv8;Lcom/daaw/fv8;Z)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/daaw/lu8;->a:Lcom/daaw/rv8;

    iput-object p2, p0, Lcom/daaw/lu8;->b:Lcom/daaw/fv8;

    iput-boolean p3, p0, Lcom/daaw/lu8;->c:Z

    return-void
.end method


# virtual methods
.method public final a(ILcom/daaw/r84;[I)Ljava/util/List;
    .locals 16

    move-object/from16 v0, p0

    iget-object v1, v0, Lcom/daaw/lu8;->a:Lcom/daaw/rv8;

    iget-object v10, v0, Lcom/daaw/lu8;->b:Lcom/daaw/fv8;

    iget-boolean v11, v0, Lcom/daaw/lu8;->c:Z

    new-instance v12, Lcom/daaw/ku8;

    invoke-direct {v12, v1}, Lcom/daaw/ku8;-><init>(Lcom/daaw/rv8;)V

    invoke-static {}, Lcom/daaw/y17;->o()Lcom/daaw/v17;

    move-result-object v1

    const/4 v2, 0x0

    move-object/from16 v14, p2

    const/4 v13, 0x0

    :goto_0
    iget v2, v14, Lcom/daaw/r84;->a:I

    if-gtz v13, :cond_0

    new-instance v15, Lcom/daaw/tu8;

    aget v7, p3, v13

    move-object v2, v15

    move/from16 v3, p1

    move-object/from16 v4, p2

    move v5, v13

    move-object v6, v10

    move v8, v11

    move-object v9, v12

    invoke-direct/range {v2 .. v9}, Lcom/daaw/tu8;-><init>(ILcom/daaw/r84;ILcom/daaw/fv8;IZLcom/daaw/ty6;)V

    invoke-virtual {v1, v15}, Lcom/daaw/v17;->f(Ljava/lang/Object;)Lcom/daaw/v17;

    add-int/lit8 v13, v13, 0x1

    goto :goto_0

    :cond_0
    invoke-virtual {v1}, Lcom/daaw/v17;->h()Lcom/daaw/y17;

    move-result-object v1

    return-object v1
.end method
