.class public final Lcom/daaw/bw7;
.super Ljava/util/AbstractList;
.source ""

# interfaces
.implements Ljava/util/RandomAccess;
.implements Lcom/daaw/ct7;


# instance fields
.field public final p:Lcom/daaw/ct7;


# direct methods
.method public constructor <init>(Lcom/daaw/ct7;)V
    .locals 0

    invoke-direct {p0}, Ljava/util/AbstractList;-><init>()V

    iput-object p1, p0, Lcom/daaw/bw7;->p:Lcom/daaw/ct7;

    return-void
.end method

.method public static bridge synthetic d(Lcom/daaw/bw7;)Lcom/daaw/ct7;
    .locals 0

    iget-object p0, p0, Lcom/daaw/bw7;->p:Lcom/daaw/ct7;

    return-object p0
.end method


# virtual methods
.method public final bridge synthetic get(I)Ljava/lang/Object;
    .locals 1

    iget-object v0, p0, Lcom/daaw/bw7;->p:Lcom/daaw/ct7;

    check-cast v0, Lcom/daaw/bt7;

    invoke-virtual {v0, p1}, Lcom/daaw/bt7;->e(I)Ljava/lang/String;

    move-result-object p1

    return-object p1
.end method

.method public final iterator()Ljava/util/Iterator;
    .locals 1

    new-instance v0, Lcom/daaw/aw7;

    invoke-direct {v0, p0}, Lcom/daaw/aw7;-><init>(Lcom/daaw/bw7;)V

    return-object v0
.end method

.method public final l(Lcom/daaw/yq7;)V
    .locals 0

    new-instance p1, Ljava/lang/UnsupportedOperationException;

    invoke-direct {p1}, Ljava/lang/UnsupportedOperationException;-><init>()V

    throw p1
.end method

.method public final listIterator(I)Ljava/util/ListIterator;
    .locals 1

    new-instance v0, Lcom/daaw/zv7;

    invoke-direct {v0, p0, p1}, Lcom/daaw/zv7;-><init>(Lcom/daaw/bw7;I)V

    return-object v0
.end method

.method public final size()I
    .locals 1

    iget-object v0, p0, Lcom/daaw/bw7;->p:Lcom/daaw/ct7;

    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v0

    return v0
.end method

.method public final zze()Lcom/daaw/ct7;
    .locals 0

    return-object p0
.end method

.method public final zzf(I)Ljava/lang/Object;
    .locals 1

    iget-object v0, p0, Lcom/daaw/bw7;->p:Lcom/daaw/ct7;

    invoke-interface {v0, p1}, Lcom/daaw/ct7;->zzf(I)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final zzh()Ljava/util/List;
    .locals 1

    iget-object v0, p0, Lcom/daaw/bw7;->p:Lcom/daaw/ct7;

    invoke-interface {v0}, Lcom/daaw/ct7;->zzh()Ljava/util/List;

    move-result-object v0

    return-object v0
.end method
