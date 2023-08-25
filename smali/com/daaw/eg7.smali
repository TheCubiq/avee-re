.class public final Lcom/daaw/eg7;
.super Lcom/daaw/hh7;
.source ""


# instance fields
.field public final a:I

.field public final b:I

.field public final c:Lcom/daaw/cg7;


# direct methods
.method public synthetic constructor <init>(IILcom/daaw/cg7;Lcom/daaw/dg7;)V
    .locals 0

    invoke-direct {p0}, Lcom/daaw/hh7;-><init>()V

    iput p1, p0, Lcom/daaw/eg7;->a:I

    iput p2, p0, Lcom/daaw/eg7;->b:I

    iput-object p3, p0, Lcom/daaw/eg7;->c:Lcom/daaw/cg7;

    return-void
.end method


# virtual methods
.method public final a()I
    .locals 1

    iget v0, p0, Lcom/daaw/eg7;->a:I

    return v0
.end method

.method public final b()I
    .locals 2

    iget-object v0, p0, Lcom/daaw/eg7;->c:Lcom/daaw/cg7;

    sget-object v1, Lcom/daaw/cg7;->e:Lcom/daaw/cg7;

    if-ne v0, v1, :cond_0

    iget v0, p0, Lcom/daaw/eg7;->b:I

    return v0

    :cond_0
    sget-object v1, Lcom/daaw/cg7;->b:Lcom/daaw/cg7;

    if-ne v0, v1, :cond_1

    :goto_0
    iget v0, p0, Lcom/daaw/eg7;->b:I

    add-int/lit8 v0, v0, 0x5

    return v0

    :cond_1
    sget-object v1, Lcom/daaw/cg7;->c:Lcom/daaw/cg7;

    if-ne v0, v1, :cond_2

    goto :goto_0

    :cond_2
    sget-object v1, Lcom/daaw/cg7;->d:Lcom/daaw/cg7;

    if-ne v0, v1, :cond_3

    goto :goto_0

    :cond_3
    new-instance v0, Ljava/lang/IllegalStateException;

    const-string v1, "Unknown variant"

    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    goto :goto_2

    :goto_1
    throw v0

    :goto_2
    goto :goto_1
.end method

.method public final c()Lcom/daaw/cg7;
    .locals 1

    iget-object v0, p0, Lcom/daaw/eg7;->c:Lcom/daaw/cg7;

    return-object v0
.end method

.method public final d()Z
    .locals 2

    iget-object v0, p0, Lcom/daaw/eg7;->c:Lcom/daaw/cg7;

    sget-object v1, Lcom/daaw/cg7;->e:Lcom/daaw/cg7;

    if-eq v0, v1, :cond_0

    const/4 v0, 0x1

    return v0

    :cond_0
    const/4 v0, 0x0

    return v0
.end method

.method public final equals(Ljava/lang/Object;)Z
    .locals 3

    instance-of v0, p1, Lcom/daaw/eg7;

    const/4 v1, 0x0

    if-nez v0, :cond_0

    return v1

    :cond_0
    check-cast p1, Lcom/daaw/eg7;

    iget v0, p1, Lcom/daaw/eg7;->a:I

    iget v2, p0, Lcom/daaw/eg7;->a:I

    if-ne v0, v2, :cond_1

    invoke-virtual {p1}, Lcom/daaw/eg7;->b()I

    move-result v0

    invoke-virtual {p0}, Lcom/daaw/eg7;->b()I

    move-result v2

    if-ne v0, v2, :cond_1

    iget-object p1, p1, Lcom/daaw/eg7;->c:Lcom/daaw/cg7;

    iget-object v0, p0, Lcom/daaw/eg7;->c:Lcom/daaw/cg7;

    if-ne p1, v0, :cond_1

    const/4 p1, 0x1

    return p1

    :cond_1
    return v1
.end method

.method public final hashCode()I
    .locals 3

    const/4 v0, 0x2

    new-array v0, v0, [Ljava/lang/Object;

    iget v1, p0, Lcom/daaw/eg7;->b:I

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    const/4 v2, 0x0

    aput-object v1, v0, v2

    iget-object v1, p0, Lcom/daaw/eg7;->c:Lcom/daaw/cg7;

    const/4 v2, 0x1

    aput-object v1, v0, v2

    invoke-static {v0}, Ljava/util/Arrays;->hashCode([Ljava/lang/Object;)I

    move-result v0

    return v0
.end method

.method public final toString()Ljava/lang/String;
    .locals 5

    iget-object v0, p0, Lcom/daaw/eg7;->c:Lcom/daaw/cg7;

    invoke-static {v0}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v0

    iget v1, p0, Lcom/daaw/eg7;->b:I

    iget v2, p0, Lcom/daaw/eg7;->a:I

    new-instance v3, Ljava/lang/StringBuilder;

    invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V

    const-string v4, "AES-CMAC Parameters (variant: "

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v0, ", "

    invoke-virtual {v3, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v0, "-byte tags, and "

    invoke-virtual {v3, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3, v2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v0, "-byte key)"

    invoke-virtual {v3, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
