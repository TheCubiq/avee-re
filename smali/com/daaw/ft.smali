.class public Lcom/daaw/ft;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Lcom/daaw/zs;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/daaw/ft$a;
    }
.end annotation


# instance fields
.field public a:Lcom/daaw/zs;

.field public b:Z

.field public c:Z

.field public d:Lcom/daaw/kx1;

.field public e:Lcom/daaw/ft$a;

.field public f:I

.field public g:I

.field public h:I

.field public i:Lcom/daaw/pt;

.field public j:Z

.field public k:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Lcom/daaw/zs;",
            ">;"
        }
    .end annotation
.end field

.field public l:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Lcom/daaw/ft;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>(Lcom/daaw/kx1;)V
    .locals 3

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const/4 v0, 0x0

    iput-object v0, p0, Lcom/daaw/ft;->a:Lcom/daaw/zs;

    const/4 v1, 0x0

    iput-boolean v1, p0, Lcom/daaw/ft;->b:Z

    iput-boolean v1, p0, Lcom/daaw/ft;->c:Z

    sget-object v2, Lcom/daaw/ft$a;->p:Lcom/daaw/ft$a;

    iput-object v2, p0, Lcom/daaw/ft;->e:Lcom/daaw/ft$a;

    const/4 v2, 0x1

    iput v2, p0, Lcom/daaw/ft;->h:I

    iput-object v0, p0, Lcom/daaw/ft;->i:Lcom/daaw/pt;

    iput-boolean v1, p0, Lcom/daaw/ft;->j:Z

    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iput-object v0, p0, Lcom/daaw/ft;->k:Ljava/util/List;

    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iput-object v0, p0, Lcom/daaw/ft;->l:Ljava/util/List;

    iput-object p1, p0, Lcom/daaw/ft;->d:Lcom/daaw/kx1;

    return-void
.end method


# virtual methods
.method public a(Lcom/daaw/zs;)V
    .locals 5

    iget-object p1, p0, Lcom/daaw/ft;->l:Ljava/util/List;

    invoke-interface {p1}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object p1

    :cond_0
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_1

    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/daaw/ft;

    iget-boolean v0, v0, Lcom/daaw/ft;->j:Z

    if-nez v0, :cond_0

    return-void

    :cond_1
    const/4 p1, 0x1

    iput-boolean p1, p0, Lcom/daaw/ft;->c:Z

    iget-object v0, p0, Lcom/daaw/ft;->a:Lcom/daaw/zs;

    if-eqz v0, :cond_2

    invoke-interface {v0, p0}, Lcom/daaw/zs;->a(Lcom/daaw/zs;)V

    :cond_2
    iget-boolean v0, p0, Lcom/daaw/ft;->b:Z

    if-eqz v0, :cond_3

    iget-object p1, p0, Lcom/daaw/ft;->d:Lcom/daaw/kx1;

    invoke-virtual {p1, p0}, Lcom/daaw/kx1;->a(Lcom/daaw/zs;)V

    return-void

    :cond_3
    const/4 v0, 0x0

    const/4 v1, 0x0

    iget-object v2, p0, Lcom/daaw/ft;->l:Ljava/util/List;

    invoke-interface {v2}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v2

    :goto_0
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    move-result v3

    if-eqz v3, :cond_5

    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Lcom/daaw/ft;

    instance-of v4, v3, Lcom/daaw/pt;

    if-eqz v4, :cond_4

    goto :goto_0

    :cond_4
    add-int/lit8 v1, v1, 0x1

    move-object v0, v3

    goto :goto_0

    :cond_5
    if-eqz v0, :cond_8

    if-ne v1, p1, :cond_8

    iget-boolean p1, v0, Lcom/daaw/ft;->j:Z

    if-eqz p1, :cond_8

    iget-object p1, p0, Lcom/daaw/ft;->i:Lcom/daaw/pt;

    if-eqz p1, :cond_7

    iget-boolean v1, p1, Lcom/daaw/ft;->j:Z

    if-eqz v1, :cond_6

    iget v1, p0, Lcom/daaw/ft;->h:I

    iget p1, p1, Lcom/daaw/ft;->g:I

    mul-int v1, v1, p1

    iput v1, p0, Lcom/daaw/ft;->f:I

    goto :goto_1

    :cond_6
    return-void

    :cond_7
    :goto_1
    iget p1, v0, Lcom/daaw/ft;->g:I

    iget v0, p0, Lcom/daaw/ft;->f:I

    add-int/2addr p1, v0

    invoke-virtual {p0, p1}, Lcom/daaw/ft;->d(I)V

    :cond_8
    iget-object p1, p0, Lcom/daaw/ft;->a:Lcom/daaw/zs;

    if-eqz p1, :cond_9

    invoke-interface {p1, p0}, Lcom/daaw/zs;->a(Lcom/daaw/zs;)V

    :cond_9
    return-void
.end method

.method public b(Lcom/daaw/zs;)V
    .locals 1

    iget-object v0, p0, Lcom/daaw/ft;->k:Ljava/util/List;

    invoke-interface {v0, p1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    iget-boolean v0, p0, Lcom/daaw/ft;->j:Z

    if-eqz v0, :cond_0

    invoke-interface {p1, p1}, Lcom/daaw/zs;->a(Lcom/daaw/zs;)V

    :cond_0
    return-void
.end method

.method public c()V
    .locals 1

    iget-object v0, p0, Lcom/daaw/ft;->l:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->clear()V

    iget-object v0, p0, Lcom/daaw/ft;->k:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->clear()V

    const/4 v0, 0x0

    iput-boolean v0, p0, Lcom/daaw/ft;->j:Z

    iput v0, p0, Lcom/daaw/ft;->g:I

    iput-boolean v0, p0, Lcom/daaw/ft;->c:Z

    iput-boolean v0, p0, Lcom/daaw/ft;->b:Z

    return-void
.end method

.method public d(I)V
    .locals 1

    iget-boolean v0, p0, Lcom/daaw/ft;->j:Z

    if-eqz v0, :cond_0

    return-void

    :cond_0
    const/4 v0, 0x1

    iput-boolean v0, p0, Lcom/daaw/ft;->j:Z

    iput p1, p0, Lcom/daaw/ft;->g:I

    iget-object p1, p0, Lcom/daaw/ft;->k:Ljava/util/List;

    invoke-interface {p1}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object p1

    :goto_0
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_1

    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/daaw/zs;

    invoke-interface {v0, v0}, Lcom/daaw/zs;->a(Lcom/daaw/zs;)V

    goto :goto_0

    :cond_1
    return-void
.end method

.method public toString()Ljava/lang/String;
    .locals 2

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    iget-object v1, p0, Lcom/daaw/ft;->d:Lcom/daaw/kx1;

    iget-object v1, v1, Lcom/daaw/kx1;->b:Lcom/daaw/qj;

    invoke-virtual {v1}, Lcom/daaw/qj;->p()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, ":"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Lcom/daaw/ft;->e:Lcom/daaw/ft$a;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, "("

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-boolean v1, p0, Lcom/daaw/ft;->j:Z

    if-eqz v1, :cond_0

    iget v1, p0, Lcom/daaw/ft;->g:I

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    goto :goto_0

    :cond_0
    const-string v1, "unresolved"

    :goto_0
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ") <t="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Lcom/daaw/ft;->l:Ljava/util/List;

    invoke-interface {v1}, Ljava/util/List;->size()I

    move-result v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v1, ":d="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Lcom/daaw/ft;->k:Ljava/util/List;

    invoke-interface {v1}, Ljava/util/List;->size()I

    move-result v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v1, ">"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
