.class public final Lcom/daaw/oq7;
.super Lcom/daaw/qq7;
.source ""


# instance fields
.field public p:I

.field public final q:I

.field public final synthetic r:Lcom/daaw/yq7;


# direct methods
.method public constructor <init>(Lcom/daaw/yq7;)V
    .locals 1

    iput-object p1, p0, Lcom/daaw/oq7;->r:Lcom/daaw/yq7;

    invoke-direct {p0}, Lcom/daaw/qq7;-><init>()V

    const/4 v0, 0x0

    iput v0, p0, Lcom/daaw/oq7;->p:I

    invoke-virtual {p1}, Lcom/daaw/yq7;->o()I

    move-result p1

    iput p1, p0, Lcom/daaw/oq7;->q:I

    return-void
.end method


# virtual methods
.method public final hasNext()Z
    .locals 2

    iget v0, p0, Lcom/daaw/oq7;->p:I

    iget v1, p0, Lcom/daaw/oq7;->q:I

    if-ge v0, v1, :cond_0

    const/4 v0, 0x1

    return v0

    :cond_0
    const/4 v0, 0x0

    return v0
.end method

.method public final zza()B
    .locals 2

    iget v0, p0, Lcom/daaw/oq7;->p:I

    iget v1, p0, Lcom/daaw/oq7;->q:I

    if-ge v0, v1, :cond_0

    add-int/lit8 v1, v0, 0x1

    iput v1, p0, Lcom/daaw/oq7;->p:I

    iget-object v1, p0, Lcom/daaw/oq7;->r:Lcom/daaw/yq7;

    invoke-virtual {v1, v0}, Lcom/daaw/yq7;->m(I)B

    move-result v0

    return v0

    :cond_0
    new-instance v0, Ljava/util/NoSuchElementException;

    invoke-direct {v0}, Ljava/util/NoSuchElementException;-><init>()V

    throw v0
.end method
