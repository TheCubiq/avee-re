.class public final Lcom/daaw/c72;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Ljava/util/Iterator;


# instance fields
.field public p:I

.field public final synthetic q:Lcom/daaw/z72;


# direct methods
.method public constructor <init>(Lcom/daaw/z72;)V
    .locals 0

    iput-object p1, p0, Lcom/daaw/c72;->q:Lcom/daaw/z72;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const/4 p1, 0x0

    iput p1, p0, Lcom/daaw/c72;->p:I

    return-void
.end method


# virtual methods
.method public final hasNext()Z
    .locals 2

    iget v0, p0, Lcom/daaw/c72;->p:I

    iget-object v1, p0, Lcom/daaw/c72;->q:Lcom/daaw/z72;

    invoke-virtual {v1}, Lcom/daaw/z72;->j()I

    move-result v1

    if-ge v0, v1, :cond_0

    const/4 v0, 0x1

    return v0

    :cond_0
    const/4 v0, 0x0

    return v0
.end method

.method public final bridge synthetic next()Ljava/lang/Object;
    .locals 4

    iget v0, p0, Lcom/daaw/c72;->p:I

    iget-object v1, p0, Lcom/daaw/c72;->q:Lcom/daaw/z72;

    invoke-virtual {v1}, Lcom/daaw/z72;->j()I

    move-result v1

    if-ge v0, v1, :cond_0

    iget-object v0, p0, Lcom/daaw/c72;->q:Lcom/daaw/z72;

    iget v1, p0, Lcom/daaw/c72;->p:I

    add-int/lit8 v2, v1, 0x1

    iput v2, p0, Lcom/daaw/c72;->p:I

    invoke-virtual {v0, v1}, Lcom/daaw/z72;->k(I)Lcom/daaw/gl2;

    move-result-object v0

    return-object v0

    :cond_0
    new-instance v0, Ljava/util/NoSuchElementException;

    iget v1, p0, Lcom/daaw/c72;->p:I

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "Out of bounds index: "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-direct {v0, v1}, Ljava/util/NoSuchElementException;-><init>(Ljava/lang/String;)V

    throw v0
.end method
