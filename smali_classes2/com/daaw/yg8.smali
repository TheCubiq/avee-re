.class public final Lcom/daaw/yg8;
.super Ljava/util/AbstractList;
.source ""

# interfaces
.implements Ljava/util/RandomAccess;
.implements Lcom/daaw/ac8;


# instance fields
.field public final p:Lcom/daaw/ac8;


# direct methods
.method public constructor <init>(Lcom/daaw/ac8;)V
    .locals 0

    invoke-direct {p0}, Ljava/util/AbstractList;-><init>()V

    iput-object p1, p0, Lcom/daaw/yg8;->p:Lcom/daaw/ac8;

    return-void
.end method

.method public static bridge synthetic d(Lcom/daaw/yg8;)Lcom/daaw/ac8;
    .locals 0

    iget-object p0, p0, Lcom/daaw/yg8;->p:Lcom/daaw/ac8;

    return-object p0
.end method


# virtual methods
.method public final g(Lcom/daaw/y68;)V
    .locals 0

    new-instance p1, Ljava/lang/UnsupportedOperationException;

    invoke-direct {p1}, Ljava/lang/UnsupportedOperationException;-><init>()V

    throw p1
.end method

.method public final bridge synthetic get(I)Ljava/lang/Object;
    .locals 1

    iget-object v0, p0, Lcom/daaw/yg8;->p:Lcom/daaw/ac8;

    check-cast v0, Lcom/daaw/xb8;

    invoke-virtual {v0, p1}, Lcom/daaw/xb8;->e(I)Ljava/lang/String;

    move-result-object p1

    return-object p1
.end method

.method public final iterator()Ljava/util/Iterator;
    .locals 1

    new-instance v0, Lcom/daaw/wg8;

    invoke-direct {v0, p0}, Lcom/daaw/wg8;-><init>(Lcom/daaw/yg8;)V

    return-object v0
.end method

.method public final listIterator(I)Ljava/util/ListIterator;
    .locals 1

    new-instance v0, Lcom/daaw/ug8;

    invoke-direct {v0, p0, p1}, Lcom/daaw/ug8;-><init>(Lcom/daaw/yg8;I)V

    return-object v0
.end method

.method public final size()I
    .locals 1

    iget-object v0, p0, Lcom/daaw/yg8;->p:Lcom/daaw/ac8;

    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v0

    return v0
.end method

.method public final zze()Lcom/daaw/ac8;
    .locals 0

    return-object p0
.end method

.method public final zzf(I)Ljava/lang/Object;
    .locals 1

    iget-object v0, p0, Lcom/daaw/yg8;->p:Lcom/daaw/ac8;

    invoke-interface {v0, p1}, Lcom/daaw/ac8;->zzf(I)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final zzh()Ljava/util/List;
    .locals 1

    iget-object v0, p0, Lcom/daaw/yg8;->p:Lcom/daaw/ac8;

    invoke-interface {v0}, Lcom/daaw/ac8;->zzh()Ljava/util/List;

    move-result-object v0

    return-object v0
.end method
