.class public final Lcom/daaw/fv8;
.super Lcom/daaw/de4;
.source ""


# static fields
.field public static final S:Lcom/daaw/fv8;

.field public static final T:Lcom/daaw/fv8;
    .annotation runtime Ljava/lang/Deprecated;
    .end annotation
.end field

.field public static final U:Lcom/daaw/th8;


# instance fields
.field public final D:Z

.field public final E:Z

.field public final F:Z

.field public final G:Z

.field public final H:Z

.field public final I:Z

.field public final J:Z

.field public final K:Z

.field public final L:Z

.field public final M:Z

.field public final N:Z

.field public final O:Z

.field public final P:Z

.field public final Q:Landroid/util/SparseArray;

.field public final R:Landroid/util/SparseBooleanArray;


# direct methods
.method public static constructor <clinit>()V
    .locals 2

    new-instance v0, Lcom/daaw/dv8;

    invoke-direct {v0}, Lcom/daaw/dv8;-><init>()V

    new-instance v1, Lcom/daaw/fv8;

    invoke-direct {v1, v0}, Lcom/daaw/fv8;-><init>(Lcom/daaw/dv8;)V

    sput-object v1, Lcom/daaw/fv8;->S:Lcom/daaw/fv8;

    sput-object v1, Lcom/daaw/fv8;->T:Lcom/daaw/fv8;

    sget-object v0, Lcom/daaw/bv8;->a:Lcom/daaw/bv8;

    sput-object v0, Lcom/daaw/fv8;->U:Lcom/daaw/th8;

    return-void
.end method

.method public constructor <init>(Lcom/daaw/dv8;)V
    .locals 2

    invoke-direct {p0, p1}, Lcom/daaw/de4;-><init>(Lcom/daaw/bd4;)V

    invoke-static {p1}, Lcom/daaw/dv8;->u(Lcom/daaw/dv8;)Z

    move-result v0

    iput-boolean v0, p0, Lcom/daaw/fv8;->D:Z

    const/4 v0, 0x0

    iput-boolean v0, p0, Lcom/daaw/fv8;->E:Z

    invoke-static {p1}, Lcom/daaw/dv8;->q(Lcom/daaw/dv8;)Z

    move-result v1

    iput-boolean v1, p0, Lcom/daaw/fv8;->F:Z

    iput-boolean v0, p0, Lcom/daaw/fv8;->G:Z

    invoke-static {p1}, Lcom/daaw/dv8;->s(Lcom/daaw/dv8;)Z

    move-result v1

    iput-boolean v1, p0, Lcom/daaw/fv8;->H:Z

    iput-boolean v0, p0, Lcom/daaw/fv8;->I:Z

    iput-boolean v0, p0, Lcom/daaw/fv8;->J:Z

    iput-boolean v0, p0, Lcom/daaw/fv8;->K:Z

    iput-boolean v0, p0, Lcom/daaw/fv8;->L:Z

    invoke-static {p1}, Lcom/daaw/dv8;->r(Lcom/daaw/dv8;)Z

    move-result v1

    iput-boolean v1, p0, Lcom/daaw/fv8;->M:Z

    invoke-static {p1}, Lcom/daaw/dv8;->t(Lcom/daaw/dv8;)Z

    move-result v1

    iput-boolean v1, p0, Lcom/daaw/fv8;->N:Z

    iput-boolean v0, p0, Lcom/daaw/fv8;->O:Z

    invoke-static {p1}, Lcom/daaw/dv8;->p(Lcom/daaw/dv8;)Z

    move-result v0

    iput-boolean v0, p0, Lcom/daaw/fv8;->P:Z

    invoke-static {p1}, Lcom/daaw/dv8;->m(Lcom/daaw/dv8;)Landroid/util/SparseArray;

    move-result-object v0

    iput-object v0, p0, Lcom/daaw/fv8;->Q:Landroid/util/SparseArray;

    invoke-static {p1}, Lcom/daaw/dv8;->n(Lcom/daaw/dv8;)Landroid/util/SparseBooleanArray;

    move-result-object p1

    iput-object p1, p0, Lcom/daaw/fv8;->R:Landroid/util/SparseBooleanArray;

    return-void
.end method

.method public synthetic constructor <init>(Lcom/daaw/dv8;Lcom/daaw/ev8;)V
    .locals 0

    invoke-direct {p0, p1}, Lcom/daaw/fv8;-><init>(Lcom/daaw/dv8;)V

    return-void
.end method

.method public static bridge synthetic a(Lcom/daaw/fv8;)Landroid/util/SparseArray;
    .locals 0

    iget-object p0, p0, Lcom/daaw/fv8;->Q:Landroid/util/SparseArray;

    return-object p0
.end method

.method public static bridge synthetic b(Lcom/daaw/fv8;)Landroid/util/SparseBooleanArray;
    .locals 0

    iget-object p0, p0, Lcom/daaw/fv8;->R:Landroid/util/SparseBooleanArray;

    return-object p0
.end method

.method public static d(Landroid/content/Context;)Lcom/daaw/fv8;
    .locals 1

    new-instance v0, Lcom/daaw/dv8;

    invoke-direct {v0, p0}, Lcom/daaw/dv8;-><init>(Landroid/content/Context;)V

    new-instance p0, Lcom/daaw/fv8;

    invoke-direct {p0, v0}, Lcom/daaw/fv8;-><init>(Lcom/daaw/dv8;)V

    return-object p0
.end method


# virtual methods
.method public final c()Lcom/daaw/dv8;
    .locals 2

    new-instance v0, Lcom/daaw/dv8;

    const/4 v1, 0x0

    invoke-direct {v0, p0, v1}, Lcom/daaw/dv8;-><init>(Lcom/daaw/fv8;Lcom/daaw/cv8;)V

    return-object v0
.end method

.method public final e(ILcom/daaw/au8;)Lcom/daaw/hv8;
    .locals 1
    .annotation runtime Ljava/lang/Deprecated;
    .end annotation

    iget-object v0, p0, Lcom/daaw/fv8;->Q:Landroid/util/SparseArray;

    invoke-virtual {v0, p1}, Landroid/util/SparseArray;->get(I)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ljava/util/Map;

    if-eqz p1, :cond_0

    invoke-interface {p1, p2}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lcom/daaw/hv8;

    return-object p1

    :cond_0
    const/4 p1, 0x0

    return-object p1
.end method

.method public final equals(Ljava/lang/Object;)Z
    .locals 10

    const/4 v0, 0x1

    if-ne p0, p1, :cond_0

    return v0

    :cond_0
    const/4 v1, 0x0

    if-eqz p1, :cond_7

    const-class v2, Lcom/daaw/fv8;

    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v3

    if-eq v2, v3, :cond_1

    goto/16 :goto_2

    :cond_1
    check-cast p1, Lcom/daaw/fv8;

    invoke-super {p0, p1}, Lcom/daaw/de4;->equals(Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_7

    iget-boolean v2, p0, Lcom/daaw/fv8;->D:Z

    iget-boolean v3, p1, Lcom/daaw/fv8;->D:Z

    if-ne v2, v3, :cond_7

    iget-boolean v2, p0, Lcom/daaw/fv8;->F:Z

    iget-boolean v3, p1, Lcom/daaw/fv8;->F:Z

    if-ne v2, v3, :cond_7

    iget-boolean v2, p0, Lcom/daaw/fv8;->H:Z

    iget-boolean v3, p1, Lcom/daaw/fv8;->H:Z

    if-ne v2, v3, :cond_7

    iget-boolean v2, p0, Lcom/daaw/fv8;->M:Z

    iget-boolean v3, p1, Lcom/daaw/fv8;->M:Z

    if-ne v2, v3, :cond_7

    iget-boolean v2, p0, Lcom/daaw/fv8;->N:Z

    iget-boolean v3, p1, Lcom/daaw/fv8;->N:Z

    if-ne v2, v3, :cond_7

    iget-boolean v2, p0, Lcom/daaw/fv8;->P:Z

    iget-boolean v3, p1, Lcom/daaw/fv8;->P:Z

    if-ne v2, v3, :cond_7

    iget-object v2, p0, Lcom/daaw/fv8;->R:Landroid/util/SparseBooleanArray;

    iget-object v3, p1, Lcom/daaw/fv8;->R:Landroid/util/SparseBooleanArray;

    invoke-virtual {v2}, Landroid/util/SparseBooleanArray;->size()I

    move-result v4

    invoke-virtual {v3}, Landroid/util/SparseBooleanArray;->size()I

    move-result v5

    if-ne v5, v4, :cond_7

    const/4 v5, 0x0

    :goto_0
    if-ge v5, v4, :cond_3

    invoke-virtual {v2, v5}, Landroid/util/SparseBooleanArray;->keyAt(I)I

    move-result v6

    invoke-virtual {v3, v6}, Landroid/util/SparseBooleanArray;->indexOfKey(I)I

    move-result v6

    if-gez v6, :cond_2

    goto :goto_2

    :cond_2
    add-int/lit8 v5, v5, 0x1

    goto :goto_0

    :cond_3
    iget-object v2, p0, Lcom/daaw/fv8;->Q:Landroid/util/SparseArray;

    iget-object p1, p1, Lcom/daaw/fv8;->Q:Landroid/util/SparseArray;

    invoke-virtual {v2}, Landroid/util/SparseArray;->size()I

    move-result v3

    invoke-virtual {p1}, Landroid/util/SparseArray;->size()I

    move-result v4

    if-ne v4, v3, :cond_7

    const/4 v4, 0x0

    :goto_1
    if-ge v4, v3, :cond_6

    invoke-virtual {v2, v4}, Landroid/util/SparseArray;->keyAt(I)I

    move-result v5

    invoke-virtual {p1, v5}, Landroid/util/SparseArray;->indexOfKey(I)I

    move-result v5

    if-ltz v5, :cond_7

    invoke-virtual {v2, v4}, Landroid/util/SparseArray;->valueAt(I)Ljava/lang/Object;

    move-result-object v6

    check-cast v6, Ljava/util/Map;

    invoke-virtual {p1, v5}, Landroid/util/SparseArray;->valueAt(I)Ljava/lang/Object;

    move-result-object v5

    check-cast v5, Ljava/util/Map;

    invoke-interface {v6}, Ljava/util/Map;->size()I

    move-result v7

    invoke-interface {v5}, Ljava/util/Map;->size()I

    move-result v8

    if-ne v8, v7, :cond_7

    invoke-interface {v6}, Ljava/util/Map;->entrySet()Ljava/util/Set;

    move-result-object v6

    invoke-interface {v6}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object v6

    :cond_4
    invoke-interface {v6}, Ljava/util/Iterator;->hasNext()Z

    move-result v7

    if-eqz v7, :cond_5

    invoke-interface {v6}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v7

    check-cast v7, Ljava/util/Map$Entry;

    invoke-interface {v7}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    move-result-object v8

    check-cast v8, Lcom/daaw/au8;

    invoke-interface {v5, v8}, Ljava/util/Map;->containsKey(Ljava/lang/Object;)Z

    move-result v9

    if-eqz v9, :cond_7

    invoke-interface {v7}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    move-result-object v7

    invoke-interface {v5, v8}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v8

    invoke-static {v7, v8}, Lcom/daaw/it5;->t(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v7

    if-nez v7, :cond_4

    goto :goto_2

    :cond_5
    add-int/lit8 v4, v4, 0x1

    goto :goto_1

    :cond_6
    return v0

    :cond_7
    :goto_2
    return v1
.end method

.method public final f(I)Z
    .locals 1

    iget-object v0, p0, Lcom/daaw/fv8;->R:Landroid/util/SparseBooleanArray;

    invoke-virtual {v0, p1}, Landroid/util/SparseBooleanArray;->get(I)Z

    move-result p1

    return p1
.end method

.method public final g(ILcom/daaw/au8;)Z
    .locals 1
    .annotation runtime Ljava/lang/Deprecated;
    .end annotation

    iget-object v0, p0, Lcom/daaw/fv8;->Q:Landroid/util/SparseArray;

    invoke-virtual {v0, p1}, Landroid/util/SparseArray;->get(I)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ljava/util/Map;

    if-eqz p1, :cond_0

    invoke-interface {p1, p2}, Ljava/util/Map;->containsKey(Ljava/lang/Object;)Z

    move-result p1

    if-eqz p1, :cond_0

    const/4 p1, 0x1

    return p1

    :cond_0
    const/4 p1, 0x0

    return p1
.end method

.method public final hashCode()I
    .locals 2

    invoke-super {p0}, Lcom/daaw/de4;->hashCode()I

    move-result v0

    add-int/lit8 v0, v0, 0x1f

    mul-int/lit8 v0, v0, 0x1f

    iget-boolean v1, p0, Lcom/daaw/fv8;->D:Z

    add-int/2addr v0, v1

    mul-int/lit16 v0, v0, 0x3c1

    iget-boolean v1, p0, Lcom/daaw/fv8;->F:Z

    add-int/2addr v0, v1

    mul-int/lit16 v0, v0, 0x3c1

    iget-boolean v1, p0, Lcom/daaw/fv8;->H:Z

    add-int/2addr v0, v1

    const v1, 0x1b4d89f

    mul-int v0, v0, v1

    iget-boolean v1, p0, Lcom/daaw/fv8;->M:Z

    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget-boolean v1, p0, Lcom/daaw/fv8;->N:Z

    add-int/2addr v0, v1

    mul-int/lit16 v0, v0, 0x3c1

    iget-boolean v1, p0, Lcom/daaw/fv8;->P:Z

    add-int/2addr v0, v1

    return v0
.end method
