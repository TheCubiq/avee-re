.class public final Lcom/daaw/r9;
.super Lcom/daaw/of1;
.source ""


# instance fields
.field public final a:Lcom/daaw/of1$a;

.field public final b:Lcom/daaw/of1$c;

.field public final c:Lcom/daaw/of1$b;


# direct methods
.method public constructor <init>(Lcom/daaw/of1$a;Lcom/daaw/of1$c;Lcom/daaw/of1$b;)V
    .locals 1

    invoke-direct {p0}, Lcom/daaw/of1;-><init>()V

    const-string v0, "Null appData"

    invoke-static {p1, v0}, Ljava/util/Objects;->requireNonNull(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/Object;

    iput-object p1, p0, Lcom/daaw/r9;->a:Lcom/daaw/of1$a;

    const-string p1, "Null osData"

    invoke-static {p2, p1}, Ljava/util/Objects;->requireNonNull(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/Object;

    iput-object p2, p0, Lcom/daaw/r9;->b:Lcom/daaw/of1$c;

    const-string p1, "Null deviceData"

    invoke-static {p3, p1}, Ljava/util/Objects;->requireNonNull(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/Object;

    iput-object p3, p0, Lcom/daaw/r9;->c:Lcom/daaw/of1$b;

    return-void
.end method


# virtual methods
.method public a()Lcom/daaw/of1$a;
    .locals 1

    iget-object v0, p0, Lcom/daaw/r9;->a:Lcom/daaw/of1$a;

    return-object v0
.end method

.method public c()Lcom/daaw/of1$b;
    .locals 1

    iget-object v0, p0, Lcom/daaw/r9;->c:Lcom/daaw/of1$b;

    return-object v0
.end method

.method public d()Lcom/daaw/of1$c;
    .locals 1

    iget-object v0, p0, Lcom/daaw/r9;->b:Lcom/daaw/of1$c;

    return-object v0
.end method

.method public equals(Ljava/lang/Object;)Z
    .locals 4

    const/4 v0, 0x1

    if-ne p1, p0, :cond_0

    return v0

    :cond_0
    instance-of v1, p1, Lcom/daaw/of1;

    const/4 v2, 0x0

    if-eqz v1, :cond_2

    check-cast p1, Lcom/daaw/of1;

    iget-object v1, p0, Lcom/daaw/r9;->a:Lcom/daaw/of1$a;

    invoke-virtual {p1}, Lcom/daaw/of1;->a()Lcom/daaw/of1$a;

    move-result-object v3

    invoke-virtual {v1, v3}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_1

    iget-object v1, p0, Lcom/daaw/r9;->b:Lcom/daaw/of1$c;

    invoke-virtual {p1}, Lcom/daaw/of1;->d()Lcom/daaw/of1$c;

    move-result-object v3

    invoke-virtual {v1, v3}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_1

    iget-object v1, p0, Lcom/daaw/r9;->c:Lcom/daaw/of1$b;

    invoke-virtual {p1}, Lcom/daaw/of1;->c()Lcom/daaw/of1$b;

    move-result-object p1

    invoke-virtual {v1, p1}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result p1

    if-eqz p1, :cond_1

    goto :goto_0

    :cond_1
    const/4 v0, 0x0

    :goto_0
    return v0

    :cond_2
    return v2
.end method

.method public hashCode()I
    .locals 3

    iget-object v0, p0, Lcom/daaw/r9;->a:Lcom/daaw/of1$a;

    invoke-virtual {v0}, Ljava/lang/Object;->hashCode()I

    move-result v0

    const v1, 0xf4243

    xor-int/2addr v0, v1

    mul-int v0, v0, v1

    iget-object v2, p0, Lcom/daaw/r9;->b:Lcom/daaw/of1$c;

    invoke-virtual {v2}, Ljava/lang/Object;->hashCode()I

    move-result v2

    xor-int/2addr v0, v2

    mul-int v0, v0, v1

    iget-object v1, p0, Lcom/daaw/r9;->c:Lcom/daaw/of1$b;

    invoke-virtual {v1}, Ljava/lang/Object;->hashCode()I

    move-result v1

    xor-int/2addr v0, v1

    return v0
.end method

.method public toString()Ljava/lang/String;
    .locals 2

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "StaticSessionData{appData="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Lcom/daaw/r9;->a:Lcom/daaw/of1$a;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ", osData="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Lcom/daaw/r9;->b:Lcom/daaw/of1$c;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ", deviceData="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Lcom/daaw/r9;->c:Lcom/daaw/of1$b;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, "}"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
