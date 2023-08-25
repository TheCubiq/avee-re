.class public Lcom/daaw/pv1$f$a;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Lcom/daaw/ir1$c;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/daaw/pv1$f;->a(Ljava/util/List;)Lcom/daaw/ir1;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Lcom/daaw/ir1$c<",
        "Ljava/util/List<",
        "Landroid/graphics/Bitmap;",
        ">;>;"
    }
.end annotation


# instance fields
.field public final synthetic a:Ljava/util/List;

.field public final synthetic b:Lcom/daaw/pv1$f;


# direct methods
.method public constructor <init>(Lcom/daaw/pv1$f;Ljava/util/List;)V
    .locals 0

    iput-object p1, p0, Lcom/daaw/pv1$f$a;->b:Lcom/daaw/pv1$f;

    iput-object p2, p0, Lcom/daaw/pv1$f$a;->a:Ljava/util/List;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public bridge synthetic a(Lcom/daaw/ir1;)Ljava/lang/Object;
    .locals 0

    invoke-virtual {p0, p1}, Lcom/daaw/pv1$f$a;->b(Lcom/daaw/ir1;)Ljava/util/List;

    move-result-object p1

    return-object p1
.end method

.method public b(Lcom/daaw/ir1;)Ljava/util/List;
    .locals 13
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/daaw/ir1<",
            "Ljava/util/List<",
            "Landroid/graphics/Bitmap;",
            ">;>;)",
            "Ljava/util/List<",
            "Landroid/graphics/Bitmap;",
            ">;"
        }
    .end annotation

    new-instance p1, Ljava/util/ArrayList;

    iget-object v0, p0, Lcom/daaw/pv1$f$a;->a:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v0

    invoke-direct {p1, v0}, Ljava/util/ArrayList;-><init>(I)V

    const/4 v0, 0x1

    new-array v1, v0, [I

    new-instance v2, Ljava/util/HashMap;

    iget-object v3, p0, Lcom/daaw/pv1$f$a;->a:Ljava/util/List;

    invoke-interface {v3}, Ljava/util/List;->size()I

    move-result v3

    invoke-direct {v2, v3}, Ljava/util/HashMap;-><init>(I)V

    invoke-static {}, Lcom/daaw/tv1;->i()Lcom/daaw/tv1;

    move-result-object v3

    const/4 v4, 0x0

    const-string v5, ""

    invoke-virtual {v3, v4, v4, v5}, Lcom/daaw/tv1;->e(IZLjava/lang/String;)Lcom/daaw/f61;

    move-result-object v3

    const/4 v5, 0x0

    :goto_0
    iget-object v6, p0, Lcom/daaw/pv1$f$a;->a:Ljava/util/List;

    invoke-interface {v6}, Ljava/util/List;->size()I

    move-result v6

    if-ge v5, v6, :cond_4

    iget-object v6, p0, Lcom/daaw/pv1$f$a;->a:Ljava/util/List;

    invoke-interface {v6, v5}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v6

    check-cast v6, Lcom/daaw/sv1;

    iget v9, v6, Lcom/daaw/sv1;->a:I

    invoke-static {v9, v1}, Lcom/daaw/pv1;->O(I[I)Lcom/daaw/vn;

    move-result-object v11

    iget-object v6, p0, Lcom/daaw/pv1$f$a;->b:Lcom/daaw/pv1$f;

    iget-object v6, v6, Lcom/daaw/pv1$f;->a:Lcom/daaw/pv1;

    iget-object v6, v6, Lcom/daaw/pv1;->s:Ljava/util/HashMap;

    aget v7, v1, v4

    invoke-static {v7}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v7

    invoke-virtual {v6, v7}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v6

    check-cast v6, Landroid/graphics/Bitmap;

    if-eqz v6, :cond_0

    aget v7, v1, v4

    if-nez v7, :cond_3

    :cond_0
    sget-object v6, Landroid/graphics/Bitmap$Config;->ARGB_8888:Landroid/graphics/Bitmap$Config;

    const/16 v7, 0xc0

    invoke-static {v7, v7, v6}, Landroid/graphics/Bitmap;->createBitmap(IILandroid/graphics/Bitmap$Config;)Landroid/graphics/Bitmap;

    move-result-object v12

    iget-object v6, p0, Lcom/daaw/pv1$f$a;->b:Lcom/daaw/pv1$f;

    iget-object v6, v6, Lcom/daaw/pv1$f;->a:Lcom/daaw/pv1;

    const/4 v7, 0x0

    const/4 v10, 0x1

    move-object v8, v3

    invoke-static/range {v6 .. v11}, Lcom/daaw/pv1;->n(Lcom/daaw/pv1;Lcom/daaw/avee/comp/Visualizer/VisualizerViewCore;Lcom/daaw/f61;IZLcom/daaw/vn;)V

    if-eqz v3, :cond_2

    iget-object v6, p0, Lcom/daaw/pv1$f$a;->b:Lcom/daaw/pv1$f;

    iget-object v6, v6, Lcom/daaw/pv1$f;->a:Lcom/daaw/pv1;

    iget-object v6, v6, Lcom/daaw/pv1;->t:Lcom/daaw/z31;

    invoke-virtual {v6}, Lcom/daaw/z31;->m()V

    iget-object v6, p0, Lcom/daaw/pv1$f$a;->b:Lcom/daaw/pv1$f;

    iget-object v6, v6, Lcom/daaw/pv1$f;->a:Lcom/daaw/pv1;

    iget-object v6, v6, Lcom/daaw/pv1;->t:Lcom/daaw/z31;

    invoke-virtual {v6, v12}, Lcom/daaw/z31;->n(Landroid/graphics/Bitmap;)V

    const/4 v6, 0x0

    :goto_1
    const/4 v7, 0x0

    if-ge v6, v0, :cond_1

    iget-object v8, p0, Lcom/daaw/pv1$f$a;->b:Lcom/daaw/pv1$f;

    iget-object v8, v8, Lcom/daaw/pv1$f;->a:Lcom/daaw/pv1;

    iget-object v8, v8, Lcom/daaw/pv1;->t:Lcom/daaw/z31;

    invoke-virtual {v3, v8, v7, v7}, Lcom/daaw/uv;->y(Lcom/daaw/de0;Lcom/daaw/e40;Lcom/daaw/vc0;)V

    add-int/lit8 v6, v6, 0x1

    goto :goto_1

    :cond_1
    iget-object v6, p0, Lcom/daaw/pv1$f$a;->b:Lcom/daaw/pv1$f;

    iget-object v6, v6, Lcom/daaw/pv1$f;->a:Lcom/daaw/pv1;

    iget-object v6, v6, Lcom/daaw/pv1;->t:Lcom/daaw/z31;

    invoke-virtual {v3, v6, v7}, Lcom/daaw/uv;->G(Lcom/daaw/de0;Lcom/daaw/e40;)V

    :cond_2
    move-object v6, v12

    :cond_3
    aget v7, v1, v4

    invoke-static {v7}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v7

    invoke-virtual {v2, v7, v6}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    invoke-interface {p1, v6}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    add-int/lit8 v5, v5, 0x1

    goto :goto_0

    :cond_4
    iget-object v0, p0, Lcom/daaw/pv1$f$a;->b:Lcom/daaw/pv1$f;

    iget-object v0, v0, Lcom/daaw/pv1$f;->a:Lcom/daaw/pv1;

    iput-object v2, v0, Lcom/daaw/pv1;->s:Ljava/util/HashMap;

    return-object p1
.end method
