.class public final Lcom/daaw/th7;
.super Ljava/lang/Object;
.source ""


# instance fields
.field public final a:Lcom/daaw/v87;

.field public final b:I

.field public final c:Lcom/daaw/l97;


# direct methods
.method public synthetic constructor <init>(Lcom/daaw/v87;ILcom/daaw/l97;Lcom/daaw/sh7;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/daaw/th7;->a:Lcom/daaw/v87;

    iput p2, p0, Lcom/daaw/th7;->b:I

    iput-object p3, p0, Lcom/daaw/th7;->c:Lcom/daaw/l97;

    return-void
.end method


# virtual methods
.method public final a()I
    .locals 1

    iget v0, p0, Lcom/daaw/th7;->b:I

    return v0
.end method

.method public final equals(Ljava/lang/Object;)Z
    .locals 3

    instance-of v0, p1, Lcom/daaw/th7;

    const/4 v1, 0x0

    if-nez v0, :cond_0

    return v1

    :cond_0
    check-cast p1, Lcom/daaw/th7;

    iget-object v0, p0, Lcom/daaw/th7;->a:Lcom/daaw/v87;

    iget-object v2, p1, Lcom/daaw/th7;->a:Lcom/daaw/v87;

    if-ne v0, v2, :cond_1

    iget v0, p0, Lcom/daaw/th7;->b:I

    iget v2, p1, Lcom/daaw/th7;->b:I

    if-ne v0, v2, :cond_1

    iget-object v0, p0, Lcom/daaw/th7;->c:Lcom/daaw/l97;

    iget-object p1, p1, Lcom/daaw/th7;->c:Lcom/daaw/l97;

    invoke-virtual {v0, p1}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result p1

    if-eqz p1, :cond_1

    const/4 p1, 0x1

    return p1

    :cond_1
    return v1
.end method

.method public final hashCode()I
    .locals 3

    const/4 v0, 0x3

    new-array v0, v0, [Ljava/lang/Object;

    iget-object v1, p0, Lcom/daaw/th7;->a:Lcom/daaw/v87;

    const/4 v2, 0x0

    aput-object v1, v0, v2

    iget v1, p0, Lcom/daaw/th7;->b:I

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    const/4 v2, 0x1

    aput-object v1, v0, v2

    iget-object v1, p0, Lcom/daaw/th7;->c:Lcom/daaw/l97;

    invoke-virtual {v1}, Ljava/lang/Object;->hashCode()I

    move-result v1

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    const/4 v2, 0x2

    aput-object v1, v0, v2

    invoke-static {v0}, Ljava/util/Arrays;->hashCode([Ljava/lang/Object;)I

    move-result v0

    return v0
.end method

.method public final toString()Ljava/lang/String;
    .locals 3

    const/4 v0, 0x3

    new-array v0, v0, [Ljava/lang/Object;

    iget-object v1, p0, Lcom/daaw/th7;->a:Lcom/daaw/v87;

    const/4 v2, 0x0

    aput-object v1, v0, v2

    iget v1, p0, Lcom/daaw/th7;->b:I

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    const/4 v2, 0x1

    aput-object v1, v0, v2

    iget-object v1, p0, Lcom/daaw/th7;->c:Lcom/daaw/l97;

    const/4 v2, 0x2

    aput-object v1, v0, v2

    const-string v1, "(status=%s, keyId=%s, parameters=\'%s\')"

    invoke-static {v1, v0}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
