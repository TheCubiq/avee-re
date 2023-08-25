.class public final Lcom/daaw/ff;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Lcom/daaw/d00;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/daaw/ff$a;,
        Lcom/daaw/ff$b;
    }
.end annotation


# instance fields
.field public final p:Lcom/daaw/zz;

.field public final q:I

.field public final r:Lcom/google/android/exoplayer2/Format;

.field public final s:Landroid/util/SparseArray;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Landroid/util/SparseArray<",
            "Lcom/daaw/ff$a;",
            ">;"
        }
    .end annotation
.end field

.field public t:Z

.field public u:Lcom/daaw/ff$b;

.field public v:Lcom/daaw/da1;

.field public w:[Lcom/google/android/exoplayer2/Format;


# direct methods
.method public constructor <init>(Lcom/daaw/zz;ILcom/google/android/exoplayer2/Format;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/daaw/ff;->p:Lcom/daaw/zz;

    iput p2, p0, Lcom/daaw/ff;->q:I

    iput-object p3, p0, Lcom/daaw/ff;->r:Lcom/google/android/exoplayer2/Format;

    new-instance p1, Landroid/util/SparseArray;

    invoke-direct {p1}, Landroid/util/SparseArray;-><init>()V

    iput-object p1, p0, Lcom/daaw/ff;->s:Landroid/util/SparseArray;

    return-void
.end method


# virtual methods
.method public a(II)Lcom/daaw/sm1;
    .locals 2

    iget-object v0, p0, Lcom/daaw/ff;->s:Landroid/util/SparseArray;

    invoke-virtual {v0, p1}, Landroid/util/SparseArray;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/daaw/ff$a;

    if-nez v0, :cond_2

    iget-object v0, p0, Lcom/daaw/ff;->w:[Lcom/google/android/exoplayer2/Format;

    if-nez v0, :cond_0

    const/4 v0, 0x1

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    invoke-static {v0}, Lcom/daaw/s6;->f(Z)V

    new-instance v0, Lcom/daaw/ff$a;

    iget v1, p0, Lcom/daaw/ff;->q:I

    if-ne p2, v1, :cond_1

    iget-object v1, p0, Lcom/daaw/ff;->r:Lcom/google/android/exoplayer2/Format;

    goto :goto_1

    :cond_1
    const/4 v1, 0x0

    :goto_1
    invoke-direct {v0, p1, p2, v1}, Lcom/daaw/ff$a;-><init>(IILcom/google/android/exoplayer2/Format;)V

    iget-object p2, p0, Lcom/daaw/ff;->u:Lcom/daaw/ff$b;

    invoke-virtual {v0, p2}, Lcom/daaw/ff$a;->e(Lcom/daaw/ff$b;)V

    iget-object p2, p0, Lcom/daaw/ff;->s:Landroid/util/SparseArray;

    invoke-virtual {p2, p1, v0}, Landroid/util/SparseArray;->put(ILjava/lang/Object;)V

    :cond_2
    return-object v0
.end method

.method public b()[Lcom/google/android/exoplayer2/Format;
    .locals 1

    iget-object v0, p0, Lcom/daaw/ff;->w:[Lcom/google/android/exoplayer2/Format;

    return-object v0
.end method

.method public c()Lcom/daaw/da1;
    .locals 1

    iget-object v0, p0, Lcom/daaw/ff;->v:Lcom/daaw/da1;

    return-object v0
.end method

.method public d(Lcom/daaw/da1;)V
    .locals 0

    iput-object p1, p0, Lcom/daaw/ff;->v:Lcom/daaw/da1;

    return-void
.end method

.method public e(Lcom/daaw/ff$b;J)V
    .locals 6

    iput-object p1, p0, Lcom/daaw/ff;->u:Lcom/daaw/ff$b;

    iget-boolean v0, p0, Lcom/daaw/ff;->t:Z

    const-wide v1, -0x7fffffffffffffffL    # -4.9E-324

    const-wide/16 v3, 0x0

    if-nez v0, :cond_1

    iget-object p1, p0, Lcom/daaw/ff;->p:Lcom/daaw/zz;

    invoke-interface {p1, p0}, Lcom/daaw/zz;->i(Lcom/daaw/d00;)V

    cmp-long p1, p2, v1

    if-eqz p1, :cond_0

    iget-object p1, p0, Lcom/daaw/ff;->p:Lcom/daaw/zz;

    invoke-interface {p1, v3, v4, p2, p3}, Lcom/daaw/zz;->f(JJ)V

    :cond_0
    const/4 p1, 0x1

    iput-boolean p1, p0, Lcom/daaw/ff;->t:Z

    goto :goto_1

    :cond_1
    iget-object v0, p0, Lcom/daaw/ff;->p:Lcom/daaw/zz;

    cmp-long v5, p2, v1

    if-nez v5, :cond_2

    move-wide p2, v3

    :cond_2
    invoke-interface {v0, v3, v4, p2, p3}, Lcom/daaw/zz;->f(JJ)V

    const/4 p2, 0x0

    :goto_0
    iget-object p3, p0, Lcom/daaw/ff;->s:Landroid/util/SparseArray;

    invoke-virtual {p3}, Landroid/util/SparseArray;->size()I

    move-result p3

    if-ge p2, p3, :cond_3

    iget-object p3, p0, Lcom/daaw/ff;->s:Landroid/util/SparseArray;

    invoke-virtual {p3, p2}, Landroid/util/SparseArray;->valueAt(I)Ljava/lang/Object;

    move-result-object p3

    check-cast p3, Lcom/daaw/ff$a;

    invoke-virtual {p3, p1}, Lcom/daaw/ff$a;->e(Lcom/daaw/ff$b;)V

    add-int/lit8 p2, p2, 0x1

    goto :goto_0

    :cond_3
    :goto_1
    return-void
.end method

.method public n()V
    .locals 3

    iget-object v0, p0, Lcom/daaw/ff;->s:Landroid/util/SparseArray;

    invoke-virtual {v0}, Landroid/util/SparseArray;->size()I

    move-result v0

    new-array v0, v0, [Lcom/google/android/exoplayer2/Format;

    const/4 v1, 0x0

    :goto_0
    iget-object v2, p0, Lcom/daaw/ff;->s:Landroid/util/SparseArray;

    invoke-virtual {v2}, Landroid/util/SparseArray;->size()I

    move-result v2

    if-ge v1, v2, :cond_0

    iget-object v2, p0, Lcom/daaw/ff;->s:Landroid/util/SparseArray;

    invoke-virtual {v2, v1}, Landroid/util/SparseArray;->valueAt(I)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lcom/daaw/ff$a;

    iget-object v2, v2, Lcom/daaw/ff$a;->d:Lcom/google/android/exoplayer2/Format;

    aput-object v2, v0, v1

    add-int/lit8 v1, v1, 0x1

    goto :goto_0

    :cond_0
    iput-object v0, p0, Lcom/daaw/ff;->w:[Lcom/google/android/exoplayer2/Format;

    return-void
.end method
