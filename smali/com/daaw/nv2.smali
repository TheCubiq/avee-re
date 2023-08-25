.class public final Lcom/daaw/nv2;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic p:Lcom/daaw/qv2;

.field public final synthetic q:Lcom/daaw/sv2;


# direct methods
.method public constructor <init>(Lcom/daaw/sv2;Lcom/daaw/qv2;)V
    .locals 0

    iput-object p1, p0, Lcom/daaw/nv2;->q:Lcom/daaw/sv2;

    iput-object p2, p0, Lcom/daaw/nv2;->p:Lcom/daaw/qv2;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 3

    iget-object v0, p0, Lcom/daaw/nv2;->p:Lcom/daaw/qv2;

    invoke-virtual {v0}, Lcom/daaw/qv2;->a()V

    iget-object v0, p0, Lcom/daaw/nv2;->q:Lcom/daaw/sv2;

    invoke-static {v0}, Lcom/daaw/sv2;->u(Lcom/daaw/sv2;)Landroid/util/SparseArray;

    move-result-object v0

    invoke-virtual {v0}, Landroid/util/SparseArray;->size()I

    move-result v0

    const/4 v1, 0x0

    :goto_0
    if-ge v1, v0, :cond_0

    iget-object v2, p0, Lcom/daaw/nv2;->q:Lcom/daaw/sv2;

    invoke-static {v2}, Lcom/daaw/sv2;->u(Lcom/daaw/sv2;)Landroid/util/SparseArray;

    move-result-object v2

    invoke-virtual {v2, v1}, Landroid/util/SparseArray;->valueAt(I)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lcom/daaw/hw2;

    invoke-virtual {v2}, Lcom/daaw/hw2;->i()V

    add-int/lit8 v1, v1, 0x1

    goto :goto_0

    :cond_0
    return-void
.end method
