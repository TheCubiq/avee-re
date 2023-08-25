.class public final Lcom/daaw/lb8;
.super Ljava/lang/Object;
.source ""


# instance fields
.field public final a:Lcom/daaw/r32;

.field public final b:Landroid/util/SparseArray;


# direct methods
.method public constructor <init>(Lcom/daaw/r32;Landroid/util/SparseArray;)V
    .locals 4

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/daaw/lb8;->a:Lcom/daaw/r32;

    new-instance v0, Landroid/util/SparseArray;

    invoke-virtual {p1}, Lcom/daaw/r32;->b()I

    move-result v1

    invoke-direct {v0, v1}, Landroid/util/SparseArray;-><init>(I)V

    const/4 v1, 0x0

    :goto_0
    invoke-virtual {p1}, Lcom/daaw/r32;->b()I

    move-result v2

    if-ge v1, v2, :cond_0

    invoke-virtual {p1, v1}, Lcom/daaw/r32;->a(I)I

    move-result v2

    invoke-virtual {p2, v2}, Landroid/util/SparseArray;->get(I)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Lcom/daaw/ib8;

    invoke-static {v3}, Ljava/util/Objects;->requireNonNull(Ljava/lang/Object;)Ljava/lang/Object;

    invoke-virtual {v0, v2, v3}, Landroid/util/SparseArray;->append(ILjava/lang/Object;)V

    add-int/lit8 v1, v1, 0x1

    goto :goto_0

    :cond_0
    iput-object v0, p0, Lcom/daaw/lb8;->b:Landroid/util/SparseArray;

    return-void
.end method


# virtual methods
.method public final a(I)I
    .locals 1

    iget-object v0, p0, Lcom/daaw/lb8;->a:Lcom/daaw/r32;

    invoke-virtual {v0, p1}, Lcom/daaw/r32;->a(I)I

    move-result p1

    return p1
.end method

.method public final b()I
    .locals 1

    iget-object v0, p0, Lcom/daaw/lb8;->a:Lcom/daaw/r32;

    invoke-virtual {v0}, Lcom/daaw/r32;->b()I

    move-result v0

    return v0
.end method

.method public final c(I)Lcom/daaw/ib8;
    .locals 1

    iget-object v0, p0, Lcom/daaw/lb8;->b:Landroid/util/SparseArray;

    invoke-virtual {v0, p1}, Landroid/util/SparseArray;->get(I)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lcom/daaw/ib8;

    invoke-static {p1}, Ljava/util/Objects;->requireNonNull(Ljava/lang/Object;)Ljava/lang/Object;

    return-object p1
.end method

.method public final d(I)Z
    .locals 1

    iget-object v0, p0, Lcom/daaw/lb8;->a:Lcom/daaw/r32;

    invoke-virtual {v0, p1}, Lcom/daaw/r32;->c(I)Z

    move-result p1

    return p1
.end method
