.class public final synthetic Lcom/daaw/pu8;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Lcom/daaw/mv8;


# instance fields
.field public final synthetic a:Lcom/daaw/fv8;

.field public final synthetic b:Ljava/lang/String;


# direct methods
.method public synthetic constructor <init>(Lcom/daaw/fv8;Ljava/lang/String;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/daaw/pu8;->a:Lcom/daaw/fv8;

    iput-object p2, p0, Lcom/daaw/pu8;->b:Ljava/lang/String;

    return-void
.end method


# virtual methods
.method public final a(ILcom/daaw/r84;[I)Ljava/util/List;
    .locals 12

    iget-object v7, p0, Lcom/daaw/pu8;->a:Lcom/daaw/fv8;

    iget-object v8, p0, Lcom/daaw/pu8;->b:Ljava/lang/String;

    sget v0, Lcom/daaw/rv8;->m:I

    invoke-static {}, Lcom/daaw/y17;->o()Lcom/daaw/v17;

    move-result-object v9

    const/4 v0, 0x0

    const/4 v10, 0x0

    :goto_0
    iget v0, p2, Lcom/daaw/r84;->a:I

    if-gtz v10, :cond_0

    new-instance v11, Lcom/daaw/lv8;

    aget v5, p3, v10

    move-object v0, v11

    move v1, p1

    move-object v2, p2

    move v3, v10

    move-object v4, v7

    move-object v6, v8

    invoke-direct/range {v0 .. v6}, Lcom/daaw/lv8;-><init>(ILcom/daaw/r84;ILcom/daaw/fv8;ILjava/lang/String;)V

    invoke-virtual {v9, v11}, Lcom/daaw/v17;->f(Ljava/lang/Object;)Lcom/daaw/v17;

    add-int/lit8 v10, v10, 0x1

    goto :goto_0

    :cond_0
    invoke-virtual {v9}, Lcom/daaw/v17;->h()Lcom/daaw/y17;

    move-result-object p1

    return-object p1
.end method
