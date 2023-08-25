.class public final Lcom/daaw/x17;
.super Lcom/daaw/y17;
.source ""


# instance fields
.field public final transient r:I

.field public final transient s:I

.field public final synthetic t:Lcom/daaw/y17;


# direct methods
.method public constructor <init>(Lcom/daaw/y17;II)V
    .locals 0

    iput-object p1, p0, Lcom/daaw/x17;->t:Lcom/daaw/y17;

    invoke-direct {p0}, Lcom/daaw/y17;-><init>()V

    iput p2, p0, Lcom/daaw/x17;->r:I

    iput p3, p0, Lcom/daaw/x17;->s:I

    return-void
.end method


# virtual methods
.method public final e()I
    .locals 2

    iget-object v0, p0, Lcom/daaw/x17;->t:Lcom/daaw/y17;

    invoke-virtual {v0}, Lcom/daaw/t17;->f()I

    move-result v0

    iget v1, p0, Lcom/daaw/x17;->r:I

    add-int/2addr v0, v1

    iget v1, p0, Lcom/daaw/x17;->s:I

    add-int/2addr v0, v1

    return v0
.end method

.method public final f()I
    .locals 2

    iget-object v0, p0, Lcom/daaw/x17;->t:Lcom/daaw/y17;

    invoke-virtual {v0}, Lcom/daaw/t17;->f()I

    move-result v0

    iget v1, p0, Lcom/daaw/x17;->r:I

    add-int/2addr v0, v1

    return v0
.end method

.method public final get(I)Ljava/lang/Object;
    .locals 2

    iget v0, p0, Lcom/daaw/x17;->s:I

    const-string v1, "index"

    invoke-static {p1, v0, v1}, Lcom/daaw/sy6;->a(IILjava/lang/String;)I

    iget-object v0, p0, Lcom/daaw/x17;->t:Lcom/daaw/y17;

    iget v1, p0, Lcom/daaw/x17;->r:I

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

    iget-object v0, p0, Lcom/daaw/x17;->t:Lcom/daaw/y17;

    invoke-virtual {v0}, Lcom/daaw/t17;->m()[Ljava/lang/Object;

    move-result-object v0

    return-object v0
.end method

.method public final n(II)Lcom/daaw/y17;
    .locals 2

    iget v0, p0, Lcom/daaw/x17;->s:I

    invoke-static {p1, p2, v0}, Lcom/daaw/sy6;->g(III)V

    iget-object v0, p0, Lcom/daaw/x17;->t:Lcom/daaw/y17;

    iget v1, p0, Lcom/daaw/x17;->r:I

    add-int/2addr p1, v1

    add-int/2addr p2, v1

    invoke-virtual {v0, p1, p2}, Lcom/daaw/y17;->n(II)Lcom/daaw/y17;

    move-result-object p1

    return-object p1
.end method

.method public final size()I
    .locals 1

    iget v0, p0, Lcom/daaw/x17;->s:I

    return v0
.end method

.method public final bridge synthetic subList(II)Ljava/util/List;
    .locals 0

    invoke-virtual {p0, p1, p2}, Lcom/daaw/y17;->n(II)Lcom/daaw/y17;

    move-result-object p1

    return-object p1
.end method
