.class public final Lcom/daaw/eb7;
.super Lcom/daaw/ee7;
.source ""


# direct methods
.method public constructor <init>()V
    .locals 3

    const/4 v0, 0x1

    new-array v0, v0, [Lcom/daaw/cf7;

    new-instance v1, Lcom/daaw/cb7;

    const-class v2, Lcom/daaw/a87;

    invoke-direct {v1, v2}, Lcom/daaw/cb7;-><init>(Ljava/lang/Class;)V

    const/4 v2, 0x0

    aput-object v1, v0, v2

    const-class v1, Lcom/daaw/rn7;

    invoke-direct {p0, v1, v0}, Lcom/daaw/ee7;-><init>(Ljava/lang/Class;[Lcom/daaw/cf7;)V

    return-void
.end method


# virtual methods
.method public final a()Lcom/daaw/de7;
    .locals 2

    new-instance v0, Lcom/daaw/db7;

    const-class v1, Lcom/daaw/xn7;

    invoke-direct {v0, p0, v1}, Lcom/daaw/db7;-><init>(Lcom/daaw/eb7;Ljava/lang/Class;)V

    return-object v0
.end method

.method public final b()Lcom/daaw/mm7;
    .locals 1

    sget-object v0, Lcom/daaw/mm7;->u:Lcom/daaw/mm7;

    return-object v0
.end method

.method public final synthetic c(Lcom/daaw/yq7;)Lcom/daaw/xt7;
    .locals 1

    invoke-static {}, Lcom/daaw/vr7;->a()Lcom/daaw/vr7;

    move-result-object v0

    invoke-static {p1, v0}, Lcom/daaw/rn7;->O(Lcom/daaw/yq7;Lcom/daaw/vr7;)Lcom/daaw/rn7;

    move-result-object p1

    return-object p1
.end method

.method public final d()Ljava/lang/String;
    .locals 1

    const-string v0, "type.googleapis.com/google.crypto.tink.KmsEnvelopeAeadKey"

    return-object v0
.end method

.method public final bridge synthetic e(Lcom/daaw/xt7;)V
    .locals 1

    check-cast p1, Lcom/daaw/rn7;

    invoke-virtual {p1}, Lcom/daaw/rn7;->L()I

    move-result p1

    const/4 v0, 0x0

    invoke-static {p1, v0}, Lcom/daaw/xp7;->b(II)V

    return-void
.end method
