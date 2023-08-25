.class public final Lcom/daaw/w87;
.super Ljava/lang/Object;
.source ""


# instance fields
.field public final a:Lcom/daaw/vm7;


# direct methods
.method public constructor <init>(Lcom/daaw/vm7;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/daaw/w87;->a:Lcom/daaw/vm7;

    return-void
.end method

.method public static e(Ljava/lang/String;[BI)Lcom/daaw/w87;
    .locals 2

    new-instance v0, Lcom/daaw/w87;

    invoke-static {}, Lcom/daaw/vm7;->L()Lcom/daaw/um7;

    move-result-object v1

    invoke-virtual {v1, p0}, Lcom/daaw/um7;->t(Ljava/lang/String;)Lcom/daaw/um7;

    invoke-static {p1}, Lcom/daaw/yq7;->F([B)Lcom/daaw/yq7;

    move-result-object p0

    invoke-virtual {v1, p0}, Lcom/daaw/um7;->u(Lcom/daaw/yq7;)Lcom/daaw/um7;

    add-int/lit8 p2, p2, -0x1

    if-eqz p2, :cond_1

    const/4 p0, 0x1

    if-eq p2, p0, :cond_0

    sget-object p0, Lcom/daaw/zn7;->t:Lcom/daaw/zn7;

    goto :goto_0

    :cond_0
    sget-object p0, Lcom/daaw/zn7;->s:Lcom/daaw/zn7;

    goto :goto_0

    :cond_1
    sget-object p0, Lcom/daaw/zn7;->r:Lcom/daaw/zn7;

    :goto_0
    invoke-virtual {v1, p0}, Lcom/daaw/um7;->s(Lcom/daaw/zn7;)Lcom/daaw/um7;

    invoke-virtual {v1}, Lcom/daaw/fs7;->n()Lcom/daaw/ls7;

    move-result-object p0

    check-cast p0, Lcom/daaw/vm7;

    invoke-direct {v0, p0}, Lcom/daaw/w87;-><init>(Lcom/daaw/vm7;)V

    return-object v0
.end method


# virtual methods
.method public final a()Lcom/daaw/vm7;
    .locals 1

    iget-object v0, p0, Lcom/daaw/w87;->a:Lcom/daaw/vm7;

    return-object v0
.end method

.method public final b()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/daaw/w87;->a:Lcom/daaw/vm7;

    invoke-virtual {v0}, Lcom/daaw/vm7;->Q()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public final c()[B
    .locals 1

    iget-object v0, p0, Lcom/daaw/w87;->a:Lcom/daaw/vm7;

    invoke-virtual {v0}, Lcom/daaw/vm7;->P()Lcom/daaw/yq7;

    move-result-object v0

    invoke-virtual {v0}, Lcom/daaw/yq7;->j()[B

    move-result-object v0

    return-object v0
.end method

.method public final d()I
    .locals 2

    iget-object v0, p0, Lcom/daaw/w87;->a:Lcom/daaw/vm7;

    invoke-virtual {v0}, Lcom/daaw/vm7;->O()Lcom/daaw/zn7;

    move-result-object v0

    sget-object v1, Lcom/daaw/zn7;->q:Lcom/daaw/zn7;

    invoke-virtual {v0}, Ljava/lang/Enum;->ordinal()I

    move-result v0

    const/4 v1, 0x1

    if-eq v0, v1, :cond_1

    const/4 v1, 0x2

    if-eq v0, v1, :cond_1

    const/4 v1, 0x3

    if-eq v0, v1, :cond_1

    const/4 v1, 0x4

    if-ne v0, v1, :cond_0

    return v1

    :cond_0
    new-instance v0, Ljava/lang/IllegalArgumentException;

    const-string v1, "Unknown output prefix type"

    invoke-direct {v0, v1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_1
    return v1
.end method
