.class public final Lcom/daaw/ra7;
.super Lcom/daaw/ee7;
.source ""


# direct methods
.method public constructor <init>()V
    .locals 3

    const/4 v0, 0x1

    new-array v0, v0, [Lcom/daaw/cf7;

    new-instance v1, Lcom/daaw/pa7;

    const-class v2, Lcom/daaw/a87;

    invoke-direct {v1, v2}, Lcom/daaw/pa7;-><init>(Ljava/lang/Class;)V

    const/4 v2, 0x0

    aput-object v1, v0, v2

    const-class v1, Lcom/daaw/mj7;

    invoke-direct {p0, v1, v0}, Lcom/daaw/ee7;-><init>(Ljava/lang/Class;[Lcom/daaw/cf7;)V

    return-void
.end method

.method public static bridge synthetic k(II)Lcom/daaw/ce7;
    .locals 1

    invoke-static {}, Lcom/daaw/pj7;->M()Lcom/daaw/oj7;

    move-result-object v0

    invoke-virtual {v0, p0}, Lcom/daaw/oj7;->s(I)Lcom/daaw/oj7;

    invoke-virtual {v0}, Lcom/daaw/fs7;->n()Lcom/daaw/ls7;

    move-result-object p0

    check-cast p0, Lcom/daaw/pj7;

    new-instance v0, Lcom/daaw/ce7;

    invoke-direct {v0, p0, p1}, Lcom/daaw/ce7;-><init>(Ljava/lang/Object;I)V

    return-object v0
.end method


# virtual methods
.method public final a()Lcom/daaw/de7;
    .locals 2

    new-instance v0, Lcom/daaw/qa7;

    const-class v1, Lcom/daaw/pj7;

    invoke-direct {v0, p0, v1}, Lcom/daaw/qa7;-><init>(Lcom/daaw/ra7;Ljava/lang/Class;)V

    return-object v0
.end method

.method public final b()Lcom/daaw/mm7;
    .locals 1

    sget-object v0, Lcom/daaw/mm7;->r:Lcom/daaw/mm7;

    return-object v0
.end method

.method public final synthetic c(Lcom/daaw/yq7;)Lcom/daaw/xt7;
    .locals 1

    invoke-static {}, Lcom/daaw/vr7;->a()Lcom/daaw/vr7;

    move-result-object v0

    invoke-static {p1, v0}, Lcom/daaw/mj7;->O(Lcom/daaw/yq7;Lcom/daaw/vr7;)Lcom/daaw/mj7;

    move-result-object p1

    return-object p1
.end method

.method public final d()Ljava/lang/String;
    .locals 1

    const-string v0, "type.googleapis.com/google.crypto.tink.AesGcmKey"

    return-object v0
.end method

.method public final bridge synthetic e(Lcom/daaw/xt7;)V
    .locals 2

    check-cast p1, Lcom/daaw/mj7;

    invoke-virtual {p1}, Lcom/daaw/mj7;->L()I

    move-result v0

    const/4 v1, 0x0

    invoke-static {v0, v1}, Lcom/daaw/xp7;->b(II)V

    invoke-virtual {p1}, Lcom/daaw/mj7;->P()Lcom/daaw/yq7;

    move-result-object p1

    invoke-virtual {p1}, Lcom/daaw/yq7;->o()I

    move-result p1

    invoke-static {p1}, Lcom/daaw/xp7;->a(I)V

    return-void
.end method

.method public final f()I
    .locals 1

    const/4 v0, 0x2

    return v0
.end method
