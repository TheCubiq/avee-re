.class public final Lcom/daaw/je7;
.super Lcom/daaw/l97;
.source ""


# instance fields
.field public final a:Lcom/daaw/ff7;


# direct methods
.method public constructor <init>(Lcom/daaw/ff7;)V
    .locals 0

    invoke-direct {p0}, Lcom/daaw/l97;-><init>()V

    iput-object p1, p0, Lcom/daaw/je7;->a:Lcom/daaw/ff7;

    return-void
.end method


# virtual methods
.method public final a()Lcom/daaw/ff7;
    .locals 1

    iget-object v0, p0, Lcom/daaw/je7;->a:Lcom/daaw/ff7;

    return-object v0
.end method

.method public final equals(Ljava/lang/Object;)Z
    .locals 3

    instance-of v0, p1, Lcom/daaw/je7;

    const/4 v1, 0x0

    if-nez v0, :cond_0

    return v1

    :cond_0
    check-cast p1, Lcom/daaw/je7;

    iget-object p1, p1, Lcom/daaw/je7;->a:Lcom/daaw/ff7;

    iget-object v0, p0, Lcom/daaw/je7;->a:Lcom/daaw/ff7;

    invoke-virtual {v0}, Lcom/daaw/ff7;->b()Lcom/daaw/vm7;

    move-result-object v0

    invoke-virtual {v0}, Lcom/daaw/vm7;->O()Lcom/daaw/zn7;

    move-result-object v0

    invoke-virtual {p1}, Lcom/daaw/ff7;->b()Lcom/daaw/vm7;

    move-result-object v2

    invoke-virtual {v2}, Lcom/daaw/vm7;->O()Lcom/daaw/zn7;

    move-result-object v2

    invoke-virtual {v0, v2}, Ljava/lang/Enum;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_1

    iget-object v0, p0, Lcom/daaw/je7;->a:Lcom/daaw/ff7;

    invoke-virtual {v0}, Lcom/daaw/ff7;->b()Lcom/daaw/vm7;

    move-result-object v0

    invoke-virtual {v0}, Lcom/daaw/vm7;->Q()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p1}, Lcom/daaw/ff7;->b()Lcom/daaw/vm7;

    move-result-object v2

    invoke-virtual {v2}, Lcom/daaw/vm7;->Q()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v0, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_1

    iget-object v0, p0, Lcom/daaw/je7;->a:Lcom/daaw/ff7;

    invoke-virtual {v0}, Lcom/daaw/ff7;->b()Lcom/daaw/vm7;

    move-result-object v0

    invoke-virtual {v0}, Lcom/daaw/vm7;->P()Lcom/daaw/yq7;

    move-result-object v0

    invoke-virtual {p1}, Lcom/daaw/ff7;->b()Lcom/daaw/vm7;

    move-result-object p1

    invoke-virtual {p1}, Lcom/daaw/vm7;->P()Lcom/daaw/yq7;

    move-result-object p1

    invoke-virtual {v0, p1}, Lcom/daaw/yq7;->equals(Ljava/lang/Object;)Z

    move-result p1

    if-eqz p1, :cond_1

    const/4 p1, 0x1

    return p1

    :cond_1
    return v1
.end method

.method public final hashCode()I
    .locals 4

    const/4 v0, 0x2

    new-array v0, v0, [Ljava/lang/Object;

    iget-object v1, p0, Lcom/daaw/je7;->a:Lcom/daaw/ff7;

    invoke-virtual {v1}, Lcom/daaw/ff7;->b()Lcom/daaw/vm7;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v0, v3

    invoke-virtual {v1}, Lcom/daaw/ff7;->zzd()Lcom/daaw/dq7;

    move-result-object v1

    const/4 v2, 0x1

    aput-object v1, v0, v2

    invoke-static {v0}, Ljava/util/Arrays;->hashCode([Ljava/lang/Object;)I

    move-result v0

    return v0
.end method

.method public final toString()Ljava/lang/String;
    .locals 4

    const/4 v0, 0x2

    new-array v1, v0, [Ljava/lang/Object;

    iget-object v2, p0, Lcom/daaw/je7;->a:Lcom/daaw/ff7;

    invoke-virtual {v2}, Lcom/daaw/ff7;->b()Lcom/daaw/vm7;

    move-result-object v2

    invoke-virtual {v2}, Lcom/daaw/vm7;->Q()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    iget-object v2, p0, Lcom/daaw/je7;->a:Lcom/daaw/ff7;

    invoke-virtual {v2}, Lcom/daaw/ff7;->b()Lcom/daaw/vm7;

    move-result-object v2

    invoke-virtual {v2}, Lcom/daaw/vm7;->O()Lcom/daaw/zn7;

    move-result-object v2

    sget-object v3, Lcom/daaw/zn7;->q:Lcom/daaw/zn7;

    invoke-virtual {v2}, Ljava/lang/Enum;->ordinal()I

    move-result v2

    const/4 v3, 0x1

    if-eq v2, v3, :cond_3

    if-eq v2, v0, :cond_2

    const/4 v0, 0x3

    if-eq v2, v0, :cond_1

    const/4 v0, 0x4

    if-eq v2, v0, :cond_0

    const-string v0, "UNKNOWN"

    goto :goto_0

    :cond_0
    const-string v0, "CRUNCHY"

    goto :goto_0

    :cond_1
    const-string v0, "RAW"

    goto :goto_0

    :cond_2
    const-string v0, "LEGACY"

    goto :goto_0

    :cond_3
    const-string v0, "TINK"

    :goto_0
    aput-object v0, v1, v3

    const-string v0, "(typeUrl=%s, outputPrefixType=%s)"

    invoke-static {v0, v1}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
