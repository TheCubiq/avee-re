.class public final Lcom/daaw/g42;
.super Ljava/lang/Object;
.source ""


# instance fields
.field public final a:Lcom/daaw/j42;

.field public final b:Lcom/daaw/j42;


# direct methods
.method public constructor <init>(Lcom/daaw/j42;Lcom/daaw/j42;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/daaw/g42;->a:Lcom/daaw/j42;

    iput-object p2, p0, Lcom/daaw/g42;->b:Lcom/daaw/j42;

    return-void
.end method


# virtual methods
.method public final equals(Ljava/lang/Object;)Z
    .locals 4

    const/4 v0, 0x1

    if-ne p0, p1, :cond_0

    return v0

    :cond_0
    const/4 v1, 0x0

    if-eqz p1, :cond_2

    const-class v2, Lcom/daaw/g42;

    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v3

    if-eq v2, v3, :cond_1

    goto :goto_0

    :cond_1
    check-cast p1, Lcom/daaw/g42;

    iget-object v2, p0, Lcom/daaw/g42;->a:Lcom/daaw/j42;

    iget-object v3, p1, Lcom/daaw/g42;->a:Lcom/daaw/j42;

    invoke-virtual {v2, v3}, Lcom/daaw/j42;->equals(Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_2

    iget-object v2, p0, Lcom/daaw/g42;->b:Lcom/daaw/j42;

    iget-object p1, p1, Lcom/daaw/g42;->b:Lcom/daaw/j42;

    invoke-virtual {v2, p1}, Lcom/daaw/j42;->equals(Ljava/lang/Object;)Z

    move-result p1

    if-eqz p1, :cond_2

    return v0

    :cond_2
    :goto_0
    return v1
.end method

.method public final hashCode()I
    .locals 2

    iget-object v0, p0, Lcom/daaw/g42;->a:Lcom/daaw/j42;

    invoke-virtual {v0}, Lcom/daaw/j42;->hashCode()I

    move-result v0

    mul-int/lit8 v0, v0, 0x1f

    iget-object v1, p0, Lcom/daaw/g42;->b:Lcom/daaw/j42;

    invoke-virtual {v1}, Lcom/daaw/j42;->hashCode()I

    move-result v1

    add-int/2addr v0, v1

    return v0
.end method

.method public final toString()Ljava/lang/String;
    .locals 4

    iget-object v0, p0, Lcom/daaw/g42;->a:Lcom/daaw/j42;

    invoke-virtual {v0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v0

    iget-object v1, p0, Lcom/daaw/g42;->a:Lcom/daaw/j42;

    iget-object v2, p0, Lcom/daaw/g42;->b:Lcom/daaw/j42;

    invoke-virtual {v1, v2}, Lcom/daaw/j42;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_0

    const-string v1, ""

    goto :goto_0

    :cond_0
    iget-object v1, p0, Lcom/daaw/g42;->b:Lcom/daaw/j42;

    invoke-virtual {v1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v1

    const-string v2, ", "

    invoke-virtual {v2, v1}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    :goto_0
    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "["

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v0, "]"

    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
