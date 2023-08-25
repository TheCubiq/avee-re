.class public Lcom/daaw/dv1$d;
.super Ljava/lang/Object;
.source ""


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/daaw/dv1;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x9
    name = "d"
.end annotation


# instance fields
.field public a:[Lcom/daaw/dv1$e;

.field public b:I

.field public c:Lcom/daaw/dv1$e;

.field public d:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Lcom/daaw/dx$a;",
            ">;"
        }
    .end annotation
.end field

.field public e:I

.field public f:Ljava/lang/String;

.field public g:Ljava/lang/String;

.field public h:Z

.field public i:I

.field public j:I

.field public k:Z

.field public l:Z

.field public m:Z


# direct methods
.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public static synthetic a(Lcom/daaw/dv1$d;Ljava/lang/String;)[Ljava/lang/String;
    .locals 0

    invoke-virtual {p0, p1}, Lcom/daaw/dv1$d;->e(Ljava/lang/String;)[Ljava/lang/String;

    move-result-object p0

    return-object p0
.end method


# virtual methods
.method public b(Ljava/lang/String;)V
    .locals 2

    const-string v0, ";"

    invoke-static {v0, p1}, Lcom/daaw/er1;->a(Ljava/lang/String;Ljava/lang/String;)[Ljava/lang/String;

    move-result-object p1

    array-length v0, p1

    const/16 v1, 0x9

    if-eq v0, v1, :cond_0

    return-void

    :cond_0
    const/4 v0, 0x0

    aget-object v0, p1, v0

    iget v1, p0, Lcom/daaw/dv1$d;->b:I

    invoke-static {v0, v1}, Lcom/daaw/br1;->x(Ljava/lang/String;I)I

    move-result v0

    iput v0, p0, Lcom/daaw/dv1$d;->b:I

    const/4 v0, 0x1

    aget-object v0, p1, v0

    iget v1, p0, Lcom/daaw/dv1$d;->e:I

    invoke-static {v0, v1}, Lcom/daaw/br1;->x(Ljava/lang/String;I)I

    move-result v0

    iput v0, p0, Lcom/daaw/dv1$d;->e:I

    const/4 v0, 0x2

    aget-object v0, p1, v0

    iget-object v1, p0, Lcom/daaw/dv1$d;->f:Ljava/lang/String;

    invoke-static {v0, v1}, Lcom/daaw/br1;->A(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lcom/daaw/dv1$d;->f:Ljava/lang/String;

    const/4 v0, 0x4

    aget-object v0, p1, v0

    iget-boolean v1, p0, Lcom/daaw/dv1$d;->h:Z

    invoke-static {v0, v1}, Lcom/daaw/br1;->t(Ljava/lang/String;Z)Z

    move-result v0

    iput-boolean v0, p0, Lcom/daaw/dv1$d;->h:Z

    const/4 v0, 0x7

    aget-object v0, p1, v0

    iget-boolean v1, p0, Lcom/daaw/dv1$d;->k:Z

    invoke-static {v0, v1}, Lcom/daaw/br1;->t(Ljava/lang/String;Z)Z

    move-result v0

    iput-boolean v0, p0, Lcom/daaw/dv1$d;->k:Z

    const/16 v0, 0x8

    aget-object p1, p1, v0

    iget-boolean v0, p0, Lcom/daaw/dv1$d;->l:Z

    invoke-static {p1, v0}, Lcom/daaw/br1;->t(Ljava/lang/String;Z)Z

    move-result p1

    iput-boolean p1, p0, Lcom/daaw/dv1$d;->l:Z

    return-void
.end method

.method public c(I)Lcom/daaw/dv1$e;
    .locals 2

    if-ltz p1, :cond_1

    iget-object v0, p0, Lcom/daaw/dv1$d;->a:[Lcom/daaw/dv1$e;

    array-length v1, v0

    if-lt p1, v1, :cond_0

    goto :goto_0

    :cond_0
    aget-object p1, v0, p1

    return-object p1

    :cond_1
    :goto_0
    const/4 p1, 0x0

    return-object p1
.end method

.method public d(I)Lcom/daaw/dv1$e;
    .locals 0

    invoke-virtual {p0, p1}, Lcom/daaw/dv1$d;->c(I)Lcom/daaw/dv1$e;

    move-result-object p1

    if-eqz p1, :cond_0

    invoke-virtual {p1}, Lcom/daaw/dv1$e;->a()Lcom/daaw/dv1$e;

    move-result-object p1

    return-object p1

    :cond_0
    const/4 p1, 0x0

    return-object p1
.end method

.method public final e(Ljava/lang/String;)[Ljava/lang/String;
    .locals 4

    iget-object v0, p0, Lcom/daaw/dv1$d;->a:[Lcom/daaw/dv1$e;

    array-length v0, v0

    const/4 v1, 0x1

    const/4 v2, 0x0

    if-eqz p1, :cond_0

    const/4 v3, 0x1

    goto :goto_0

    :cond_0
    const/4 v3, 0x0

    :goto_0
    add-int/2addr v0, v3

    new-array v0, v0, [Ljava/lang/String;

    if-eqz p1, :cond_1

    aput-object p1, v0, v2

    goto :goto_1

    :cond_1
    const/4 v1, 0x0

    :goto_1
    iget-object p1, p0, Lcom/daaw/dv1$d;->a:[Lcom/daaw/dv1$e;

    array-length v3, p1

    if-ge v2, v3, :cond_2

    add-int v3, v2, v1

    aget-object p1, p1, v2

    iget-object p1, p1, Lcom/daaw/dv1$e;->b:Ljava/lang/String;

    aput-object p1, v0, v3

    add-int/lit8 v2, v2, 0x1

    goto :goto_1

    :cond_2
    return-object v0
.end method

.method public f(I)Lcom/daaw/dx$a;
    .locals 2

    iget-object v0, p0, Lcom/daaw/dv1$d;->d:Ljava/util/List;

    const/4 v1, 0x0

    if-nez v0, :cond_0

    return-object v1

    :cond_0
    if-ltz p1, :cond_2

    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v0

    if-lt p1, v0, :cond_1

    goto :goto_0

    :cond_1
    iget-object v0, p0, Lcom/daaw/dv1$d;->d:Ljava/util/List;

    invoke-interface {v0, p1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lcom/daaw/dx$a;

    return-object p1

    :cond_2
    :goto_0
    return-object v1
.end method

.method public g()Ljava/lang/String;
    .locals 5

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    iget v1, p0, Lcom/daaw/dv1$d;->b:I

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v1, ";"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget v2, p0, Lcom/daaw/dv1$d;->e:I

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v2, p0, Lcom/daaw/dv1$d;->f:Ljava/lang/String;

    const/16 v3, 0x3b

    const/16 v4, 0x5f

    invoke-static {v3, v4, v2}, Lcom/daaw/er1;->c(CCLjava/lang/String;)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v2, p0, Lcom/daaw/dv1$d;->g:Ljava/lang/String;

    invoke-static {v3, v4, v2}, Lcom/daaw/er1;->c(CCLjava/lang/String;)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-boolean v2, p0, Lcom/daaw/dv1$d;->h:Z

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget v2, p0, Lcom/daaw/dv1$d;->i:I

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget v2, p0, Lcom/daaw/dv1$d;->j:I

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-boolean v2, p0, Lcom/daaw/dv1$d;->k:Z

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-boolean v1, p0, Lcom/daaw/dv1$d;->l:Z

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
