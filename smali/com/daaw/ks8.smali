.class public final Lcom/daaw/ks8;
.super Lcom/daaw/rt8;
.source ""


# instance fields
.field public final transient r:I

.field public final transient s:I

.field public final synthetic t:Lcom/daaw/rt8;


# direct methods
.method public constructor <init>(Lcom/daaw/rt8;II)V
    .locals 0

    iput-object p1, p0, Lcom/daaw/ks8;->t:Lcom/daaw/rt8;

    invoke-direct {p0}, Lcom/daaw/rt8;-><init>()V

    iput p2, p0, Lcom/daaw/ks8;->r:I

    iput p3, p0, Lcom/daaw/ks8;->s:I

    return-void
.end method


# virtual methods
.method public final e()I
    .locals 2

    iget-object v0, p0, Lcom/daaw/ks8;->t:Lcom/daaw/rt8;

    invoke-virtual {v0}, Lcom/daaw/aq8;->f()I

    move-result v0

    iget v1, p0, Lcom/daaw/ks8;->r:I

    add-int/2addr v0, v1

    iget v1, p0, Lcom/daaw/ks8;->s:I

    add-int/2addr v0, v1

    return v0
.end method

.method public final f()I
    .locals 2

    iget-object v0, p0, Lcom/daaw/ks8;->t:Lcom/daaw/rt8;

    invoke-virtual {v0}, Lcom/daaw/aq8;->f()I

    move-result v0

    iget v1, p0, Lcom/daaw/ks8;->r:I

    add-int/2addr v0, v1

    return v0
.end method

.method public final get(I)Ljava/lang/Object;
    .locals 2

    iget v0, p0, Lcom/daaw/ks8;->s:I

    const-string v1, "index"

    invoke-static {p1, v0, v1}, Lcom/daaw/jf8;->a(IILjava/lang/String;)I

    iget-object v0, p0, Lcom/daaw/ks8;->t:Lcom/daaw/rt8;

    iget v1, p0, Lcom/daaw/ks8;->r:I

    add-int/2addr p1, v1

    invoke-interface {v0, p1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final k()Z
    .locals 1

    const/4 v0, 0x1

    return v0
.end method

.method public final m()[Ljava/lang/Object;
    .locals 1
    .annotation runtime Ljavax/annotation/CheckForNull;
    .end annotation

    iget-object v0, p0, Lcom/daaw/ks8;->t:Lcom/daaw/rt8;

    invoke-virtual {v0}, Lcom/daaw/aq8;->m()[Ljava/lang/Object;

    move-result-object v0

    return-object v0
.end method

.method public final n(II)Lcom/daaw/rt8;
    .locals 2

    iget v0, p0, Lcom/daaw/ks8;->s:I

    invoke-static {p1, p2, v0}, Lcom/daaw/jf8;->d(III)V

    iget-object v0, p0, Lcom/daaw/ks8;->t:Lcom/daaw/rt8;

    iget v1, p0, Lcom/daaw/ks8;->r:I

    add-int/2addr p1, v1

    add-int/2addr p2, v1

    invoke-virtual {v0, p1, p2}, Lcom/daaw/rt8;->n(II)Lcom/daaw/rt8;

    move-result-object p1

    return-object p1
.end method

.method public final size()I
    .locals 1

    iget v0, p0, Lcom/daaw/ks8;->s:I

    return v0
.end method

.method public final bridge synthetic subList(II)Ljava/util/List;
    .locals 0

    invoke-virtual {p0, p1, p2}, Lcom/daaw/rt8;->n(II)Lcom/daaw/rt8;

    move-result-object p1

    return-object p1
.end method
