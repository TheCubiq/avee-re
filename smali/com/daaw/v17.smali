.class public final Lcom/daaw/v17;
.super Lcom/daaw/r17;
.source ""


# direct methods
.method public constructor <init>()V
    .locals 1

    const/4 v0, 0x4

    invoke-direct {p0, v0}, Lcom/daaw/r17;-><init>(I)V

    return-void
.end method

.method public constructor <init>(I)V
    .locals 0

    const/4 p1, 0x4

    invoke-direct {p0, p1}, Lcom/daaw/r17;-><init>(I)V

    return-void
.end method


# virtual methods
.method public final synthetic a(Ljava/lang/Object;)Lcom/daaw/s17;
    .locals 0

    invoke-super {p0, p1}, Lcom/daaw/r17;->c(Ljava/lang/Object;)Lcom/daaw/r17;

    return-object p0
.end method

.method public final f(Ljava/lang/Object;)Lcom/daaw/v17;
    .locals 0

    invoke-super {p0, p1}, Lcom/daaw/r17;->c(Ljava/lang/Object;)Lcom/daaw/r17;

    return-object p0
.end method

.method public final g(Ljava/lang/Iterable;)Lcom/daaw/v17;
    .locals 0

    invoke-super {p0, p1}, Lcom/daaw/r17;->d(Ljava/lang/Iterable;)Lcom/daaw/s17;

    return-object p0
.end method

.method public final h()Lcom/daaw/y17;
    .locals 2

    const/4 v0, 0x1

    iput-boolean v0, p0, Lcom/daaw/r17;->c:Z

    iget-object v0, p0, Lcom/daaw/r17;->a:[Ljava/lang/Object;

    iget v1, p0, Lcom/daaw/r17;->b:I

    invoke-static {v0, v1}, Lcom/daaw/y17;->q([Ljava/lang/Object;I)Lcom/daaw/y17;

    move-result-object v0

    return-object v0
.end method
