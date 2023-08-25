.class public final Lcom/daaw/dv8;
.super Lcom/daaw/bd4;
.source ""


# instance fields
.field public q:Z

.field public r:Z

.field public s:Z

.field public t:Z

.field public u:Z

.field public v:Z

.field public final w:Landroid/util/SparseArray;

.field public final x:Landroid/util/SparseBooleanArray;


# direct methods
.method public constructor <init>()V
    .locals 1
    .annotation runtime Ljava/lang/Deprecated;
    .end annotation

    invoke-direct {p0}, Lcom/daaw/bd4;-><init>()V

    new-instance v0, Landroid/util/SparseArray;

    invoke-direct {v0}, Landroid/util/SparseArray;-><init>()V

    iput-object v0, p0, Lcom/daaw/dv8;->w:Landroid/util/SparseArray;

    new-instance v0, Landroid/util/SparseBooleanArray;

    invoke-direct {v0}, Landroid/util/SparseBooleanArray;-><init>()V

    iput-object v0, p0, Lcom/daaw/dv8;->x:Landroid/util/SparseBooleanArray;

    invoke-virtual {p0}, Lcom/daaw/dv8;->v()V

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;)V
    .locals 2

    invoke-direct {p0}, Lcom/daaw/bd4;-><init>()V

    invoke-super {p0, p1}, Lcom/daaw/bd4;->d(Landroid/content/Context;)Lcom/daaw/bd4;

    invoke-static {p1}, Lcom/daaw/it5;->b(Landroid/content/Context;)Landroid/graphics/Point;

    move-result-object p1

    iget v0, p1, Landroid/graphics/Point;->x:I

    iget p1, p1, Landroid/graphics/Point;->y:I

    const/4 v1, 0x1

    invoke-virtual {p0, v0, p1, v1}, Lcom/daaw/bd4;->e(IIZ)Lcom/daaw/bd4;

    new-instance p1, Landroid/util/SparseArray;

    invoke-direct {p1}, Landroid/util/SparseArray;-><init>()V

    iput-object p1, p0, Lcom/daaw/dv8;->w:Landroid/util/SparseArray;

    new-instance p1, Landroid/util/SparseBooleanArray;

    invoke-direct {p1}, Landroid/util/SparseBooleanArray;-><init>()V

    iput-object p1, p0, Lcom/daaw/dv8;->x:Landroid/util/SparseBooleanArray;

    invoke-virtual {p0}, Lcom/daaw/dv8;->v()V

    return-void
.end method

.method public synthetic constructor <init>(Lcom/daaw/fv8;Lcom/daaw/cv8;)V
    .locals 5

    invoke-direct {p0, p1}, Lcom/daaw/bd4;-><init>(Lcom/daaw/de4;)V

    iget-boolean p2, p1, Lcom/daaw/fv8;->D:Z

    iput-boolean p2, p0, Lcom/daaw/dv8;->q:Z

    iget-boolean p2, p1, Lcom/daaw/fv8;->F:Z

    iput-boolean p2, p0, Lcom/daaw/dv8;->r:Z

    iget-boolean p2, p1, Lcom/daaw/fv8;->H:Z

    iput-boolean p2, p0, Lcom/daaw/dv8;->s:Z

    iget-boolean p2, p1, Lcom/daaw/fv8;->M:Z

    iput-boolean p2, p0, Lcom/daaw/dv8;->t:Z

    iget-boolean p2, p1, Lcom/daaw/fv8;->N:Z

    iput-boolean p2, p0, Lcom/daaw/dv8;->u:Z

    iget-boolean p2, p1, Lcom/daaw/fv8;->P:Z

    iput-boolean p2, p0, Lcom/daaw/dv8;->v:Z

    invoke-static {p1}, Lcom/daaw/fv8;->a(Lcom/daaw/fv8;)Landroid/util/SparseArray;

    move-result-object p2

    new-instance v0, Landroid/util/SparseArray;

    invoke-direct {v0}, Landroid/util/SparseArray;-><init>()V

    const/4 v1, 0x0

    :goto_0
    invoke-virtual {p2}, Landroid/util/SparseArray;->size()I

    move-result v2

    if-ge v1, v2, :cond_0

    invoke-virtual {p2, v1}, Landroid/util/SparseArray;->keyAt(I)I

    move-result v2

    new-instance v3, Ljava/util/HashMap;

    invoke-virtual {p2, v1}, Landroid/util/SparseArray;->valueAt(I)Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Ljava/util/Map;

    invoke-direct {v3, v4}, Ljava/util/HashMap;-><init>(Ljava/util/Map;)V

    invoke-virtual {v0, v2, v3}, Landroid/util/SparseArray;->put(ILjava/lang/Object;)V

    add-int/lit8 v1, v1, 0x1

    goto :goto_0

    :cond_0
    iput-object v0, p0, Lcom/daaw/dv8;->w:Landroid/util/SparseArray;

    invoke-static {p1}, Lcom/daaw/fv8;->b(Lcom/daaw/fv8;)Landroid/util/SparseBooleanArray;

    move-result-object p1

    invoke-virtual {p1}, Landroid/util/SparseBooleanArray;->clone()Landroid/util/SparseBooleanArray;

    move-result-object p1

    iput-object p1, p0, Lcom/daaw/dv8;->x:Landroid/util/SparseBooleanArray;

    return-void
.end method

.method public static bridge synthetic m(Lcom/daaw/dv8;)Landroid/util/SparseArray;
    .locals 0

    iget-object p0, p0, Lcom/daaw/dv8;->w:Landroid/util/SparseArray;

    return-object p0
.end method

.method public static bridge synthetic n(Lcom/daaw/dv8;)Landroid/util/SparseBooleanArray;
    .locals 0

    iget-object p0, p0, Lcom/daaw/dv8;->x:Landroid/util/SparseBooleanArray;

    return-object p0
.end method

.method public static bridge synthetic p(Lcom/daaw/dv8;)Z
    .locals 0

    iget-boolean p0, p0, Lcom/daaw/dv8;->v:Z

    return p0
.end method

.method public static bridge synthetic q(Lcom/daaw/dv8;)Z
    .locals 0

    iget-boolean p0, p0, Lcom/daaw/dv8;->r:Z

    return p0
.end method

.method public static bridge synthetic r(Lcom/daaw/dv8;)Z
    .locals 0

    iget-boolean p0, p0, Lcom/daaw/dv8;->t:Z

    return p0
.end method

.method public static bridge synthetic s(Lcom/daaw/dv8;)Z
    .locals 0

    iget-boolean p0, p0, Lcom/daaw/dv8;->s:Z

    return p0
.end method

.method public static bridge synthetic t(Lcom/daaw/dv8;)Z
    .locals 0

    iget-boolean p0, p0, Lcom/daaw/dv8;->u:Z

    return p0
.end method

.method public static bridge synthetic u(Lcom/daaw/dv8;)Z
    .locals 0

    iget-boolean p0, p0, Lcom/daaw/dv8;->q:Z

    return p0
.end method


# virtual methods
.method public final synthetic e(IIZ)Lcom/daaw/bd4;
    .locals 0

    const/4 p3, 0x1

    invoke-super {p0, p1, p2, p3}, Lcom/daaw/bd4;->e(IIZ)Lcom/daaw/bd4;

    return-object p0
.end method

.method public final o(IZ)Lcom/daaw/dv8;
    .locals 1

    iget-object v0, p0, Lcom/daaw/dv8;->x:Landroid/util/SparseBooleanArray;

    invoke-virtual {v0, p1}, Landroid/util/SparseBooleanArray;->get(I)Z

    move-result v0

    if-ne v0, p2, :cond_0

    return-object p0

    :cond_0
    if-eqz p2, :cond_1

    iget-object p2, p0, Lcom/daaw/dv8;->x:Landroid/util/SparseBooleanArray;

    const/4 v0, 0x1

    invoke-virtual {p2, p1, v0}, Landroid/util/SparseBooleanArray;->put(IZ)V

    goto :goto_0

    :cond_1
    iget-object p2, p0, Lcom/daaw/dv8;->x:Landroid/util/SparseBooleanArray;

    invoke-virtual {p2, p1}, Landroid/util/SparseBooleanArray;->delete(I)V

    :goto_0
    return-object p0
.end method

.method public final v()V
    .locals 1

    const/4 v0, 0x1

    iput-boolean v0, p0, Lcom/daaw/dv8;->q:Z

    iput-boolean v0, p0, Lcom/daaw/dv8;->r:Z

    iput-boolean v0, p0, Lcom/daaw/dv8;->s:Z

    iput-boolean v0, p0, Lcom/daaw/dv8;->t:Z

    iput-boolean v0, p0, Lcom/daaw/dv8;->u:Z

    iput-boolean v0, p0, Lcom/daaw/dv8;->v:Z

    return-void
.end method
