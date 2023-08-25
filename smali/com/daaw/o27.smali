.class public final Lcom/daaw/o27;
.super Ljava/util/AbstractSequentialList;
.source ""

# interfaces
.implements Ljava/io/Serializable;


# instance fields
.field public final p:Ljava/util/List;

.field public final q:Lcom/daaw/ey6;


# direct methods
.method public constructor <init>(Ljava/util/List;Lcom/daaw/ey6;)V
    .locals 0

    invoke-direct {p0}, Ljava/util/AbstractSequentialList;-><init>()V

    iput-object p1, p0, Lcom/daaw/o27;->p:Ljava/util/List;

    iput-object p2, p0, Lcom/daaw/o27;->q:Lcom/daaw/ey6;

    return-void
.end method


# virtual methods
.method public final clear()V
    .locals 1

    iget-object v0, p0, Lcom/daaw/o27;->p:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->clear()V

    return-void
.end method

.method public final listIterator(I)Ljava/util/ListIterator;
    .locals 2

    new-instance v0, Lcom/daaw/n27;

    iget-object v1, p0, Lcom/daaw/o27;->p:Ljava/util/List;

    invoke-interface {v1, p1}, Ljava/util/List;->listIterator(I)Ljava/util/ListIterator;

    move-result-object p1

    invoke-direct {v0, p0, p1}, Lcom/daaw/n27;-><init>(Lcom/daaw/o27;Ljava/util/ListIterator;)V

    return-object v0
.end method

.method public final size()I
    .locals 1

    iget-object v0, p0, Lcom/daaw/o27;->p:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v0

    return v0
.end method
