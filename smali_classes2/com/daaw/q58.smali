.class public final Lcom/daaw/q58;
.super Lcom/daaw/w58;
.source ""


# instance fields
.field public p:I

.field public final q:I

.field public final synthetic r:Lcom/daaw/y68;


# direct methods
.method public constructor <init>(Lcom/daaw/y68;)V
    .locals 1

    iput-object p1, p0, Lcom/daaw/q58;->r:Lcom/daaw/y68;

    invoke-direct {p0}, Lcom/daaw/w58;-><init>()V

    const/4 v0, 0x0

    iput v0, p0, Lcom/daaw/q58;->p:I

    invoke-virtual {p1}, Lcom/daaw/y68;->f()I

    move-result p1

    iput p1, p0, Lcom/daaw/q58;->q:I

    return-void
.end method


# virtual methods
.method public final hasNext()Z
    .locals 2

    iget v0, p0, Lcom/daaw/q58;->p:I

    iget v1, p0, Lcom/daaw/q58;->q:I

    if-ge v0, v1, :cond_0

    const/4 v0, 0x1

    return v0

    :cond_0
    const/4 v0, 0x0

    return v0
.end method

.method public final zza()B
    .locals 2

    iget v0, p0, Lcom/daaw/q58;->p:I

    iget v1, p0, Lcom/daaw/q58;->q:I

    if-ge v0, v1, :cond_0

    add-int/lit8 v1, v0, 0x1

    iput v1, p0, Lcom/daaw/q58;->p:I

    iget-object v1, p0, Lcom/daaw/q58;->r:Lcom/daaw/y68;

    invoke-virtual {v1, v0}, Lcom/daaw/y68;->e(I)B

    move-result v0

    return v0

    :cond_0
    new-instance v0, Ljava/util/NoSuchElementException;

    invoke-direct {v0}, Ljava/util/NoSuchElementException;-><init>()V

    throw v0
.end method
