.class public final Lcom/daaw/ik6;
.super Ljava/lang/Object;
.source ""


# instance fields
.field public final a:Lcom/daaw/hk6;

.field public b:I

.field public c:I

.field public d:I

.field public e:I

.field public f:I


# direct methods
.method public constructor <init>()V
    .locals 1

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    new-instance v0, Lcom/daaw/hk6;

    invoke-direct {v0}, Lcom/daaw/hk6;-><init>()V

    iput-object v0, p0, Lcom/daaw/ik6;->a:Lcom/daaw/hk6;

    return-void
.end method


# virtual methods
.method public final a()Lcom/daaw/hk6;
    .locals 3

    iget-object v0, p0, Lcom/daaw/ik6;->a:Lcom/daaw/hk6;

    invoke-virtual {v0}, Lcom/daaw/hk6;->a()Lcom/daaw/hk6;

    move-result-object v0

    iget-object v1, p0, Lcom/daaw/ik6;->a:Lcom/daaw/hk6;

    const/4 v2, 0x0

    iput-boolean v2, v1, Lcom/daaw/hk6;->p:Z

    iput-boolean v2, v1, Lcom/daaw/hk6;->q:Z

    return-object v0
.end method

.method public final b()Ljava/lang/String;
    .locals 2

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "\n\tPool does not exist: "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget v1, p0, Lcom/daaw/ik6;->d:I

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v1, "\n\tNew pools created: "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget v1, p0, Lcom/daaw/ik6;->b:I

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v1, "\n\tPools removed: "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget v1, p0, Lcom/daaw/ik6;->c:I

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v1, "\n\tEntries added: "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget v1, p0, Lcom/daaw/ik6;->f:I

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v1, "\n\tNo entries retrieved: "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget v1, p0, Lcom/daaw/ik6;->e:I

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v1, "\n"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public final c()V
    .locals 1

    iget v0, p0, Lcom/daaw/ik6;->f:I

    add-int/lit8 v0, v0, 0x1

    iput v0, p0, Lcom/daaw/ik6;->f:I

    return-void
.end method

.method public final d()V
    .locals 2

    iget v0, p0, Lcom/daaw/ik6;->b:I

    const/4 v1, 0x1

    add-int/2addr v0, v1

    iput v0, p0, Lcom/daaw/ik6;->b:I

    iget-object v0, p0, Lcom/daaw/ik6;->a:Lcom/daaw/hk6;

    iput-boolean v1, v0, Lcom/daaw/hk6;->p:Z

    return-void
.end method

.method public final e()V
    .locals 1

    iget v0, p0, Lcom/daaw/ik6;->e:I

    add-int/lit8 v0, v0, 0x1

    iput v0, p0, Lcom/daaw/ik6;->e:I

    return-void
.end method

.method public final f()V
    .locals 1

    iget v0, p0, Lcom/daaw/ik6;->d:I

    add-int/lit8 v0, v0, 0x1

    iput v0, p0, Lcom/daaw/ik6;->d:I

    return-void
.end method

.method public final g()V
    .locals 2

    iget v0, p0, Lcom/daaw/ik6;->c:I

    const/4 v1, 0x1

    add-int/2addr v0, v1

    iput v0, p0, Lcom/daaw/ik6;->c:I

    iget-object v0, p0, Lcom/daaw/ik6;->a:Lcom/daaw/hk6;

    iput-boolean v1, v0, Lcom/daaw/hk6;->q:Z

    return-void
.end method
