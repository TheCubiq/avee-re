.class public final Lcom/daaw/fa7;
.super Lcom/daaw/ee7;
.source ""


# direct methods
.method public constructor <init>()V
    .locals 3

    const/4 v0, 0x1

    new-array v0, v0, [Lcom/daaw/cf7;

    new-instance v1, Lcom/daaw/da7;

    const-class v2, Lcom/daaw/a87;

    invoke-direct {v1, v2}, Lcom/daaw/da7;-><init>(Ljava/lang/Class;)V

    const/4 v2, 0x0

    aput-object v1, v0, v2

    const-class v1, Lcom/daaw/li7;

    invoke-direct {p0, v1, v0}, Lcom/daaw/ee7;-><init>(Ljava/lang/Class;[Lcom/daaw/cf7;)V

    return-void
.end method

.method public static bridge synthetic k(IIIIII)Lcom/daaw/ce7;
    .locals 1

    new-instance p1, Lcom/daaw/ce7;

    invoke-static {}, Lcom/daaw/ui7;->M()Lcom/daaw/ti7;

    move-result-object p2

    invoke-static {}, Lcom/daaw/xi7;->M()Lcom/daaw/wi7;

    move-result-object p4

    const/16 v0, 0x10

    invoke-virtual {p4, v0}, Lcom/daaw/wi7;->s(I)Lcom/daaw/wi7;

    invoke-virtual {p4}, Lcom/daaw/fs7;->n()Lcom/daaw/ls7;

    move-result-object p4

    check-cast p4, Lcom/daaw/xi7;

    invoke-virtual {p2, p4}, Lcom/daaw/ti7;->t(Lcom/daaw/xi7;)Lcom/daaw/ti7;

    invoke-virtual {p2, p0}, Lcom/daaw/ti7;->s(I)Lcom/daaw/ti7;

    invoke-virtual {p2}, Lcom/daaw/fs7;->n()Lcom/daaw/ls7;

    move-result-object p0

    check-cast p0, Lcom/daaw/ui7;

    invoke-static {}, Lcom/daaw/rl7;->M()Lcom/daaw/nl7;

    move-result-object p2

    invoke-static {}, Lcom/daaw/ul7;->M()Lcom/daaw/tl7;

    move-result-object p4

    const/4 v0, 0x5

    invoke-virtual {p4, v0}, Lcom/daaw/tl7;->t(I)Lcom/daaw/tl7;

    invoke-virtual {p4, p3}, Lcom/daaw/tl7;->s(I)Lcom/daaw/tl7;

    invoke-virtual {p4}, Lcom/daaw/fs7;->n()Lcom/daaw/ls7;

    move-result-object p3

    check-cast p3, Lcom/daaw/ul7;

    invoke-virtual {p2, p3}, Lcom/daaw/nl7;->t(Lcom/daaw/ul7;)Lcom/daaw/nl7;

    const/16 p3, 0x20

    invoke-virtual {p2, p3}, Lcom/daaw/nl7;->s(I)Lcom/daaw/nl7;

    invoke-virtual {p2}, Lcom/daaw/fs7;->n()Lcom/daaw/ls7;

    move-result-object p2

    check-cast p2, Lcom/daaw/rl7;

    invoke-static {}, Lcom/daaw/oi7;->L()Lcom/daaw/ni7;

    move-result-object p3

    invoke-virtual {p3, p0}, Lcom/daaw/ni7;->s(Lcom/daaw/ui7;)Lcom/daaw/ni7;

    invoke-virtual {p3, p2}, Lcom/daaw/ni7;->t(Lcom/daaw/rl7;)Lcom/daaw/ni7;

    invoke-virtual {p3}, Lcom/daaw/fs7;->n()Lcom/daaw/ls7;

    move-result-object p0

    check-cast p0, Lcom/daaw/oi7;

    invoke-direct {p1, p0, p5}, Lcom/daaw/ce7;-><init>(Ljava/lang/Object;I)V

    return-object p1
.end method


# virtual methods
.method public final a()Lcom/daaw/de7;
    .locals 2

    new-instance v0, Lcom/daaw/ea7;

    const-class v1, Lcom/daaw/oi7;

    invoke-direct {v0, p0, v1}, Lcom/daaw/ea7;-><init>(Lcom/daaw/fa7;Ljava/lang/Class;)V

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

    invoke-static {p1, v0}, Lcom/daaw/li7;->O(Lcom/daaw/yq7;Lcom/daaw/vr7;)Lcom/daaw/li7;

    move-result-object p1

    return-object p1
.end method

.method public final d()Ljava/lang/String;
    .locals 1

    const-string v0, "type.googleapis.com/google.crypto.tink.AesCtrHmacAeadKey"

    return-object v0
.end method

.method public final bridge synthetic e(Lcom/daaw/xt7;)V
    .locals 2

    check-cast p1, Lcom/daaw/li7;

    invoke-virtual {p1}, Lcom/daaw/li7;->L()I

    move-result v0

    const/4 v1, 0x0

    invoke-static {v0, v1}, Lcom/daaw/xp7;->b(II)V

    new-instance v0, Lcom/daaw/ia7;

    invoke-direct {v0}, Lcom/daaw/ia7;-><init>()V

    invoke-virtual {p1}, Lcom/daaw/li7;->P()Lcom/daaw/ri7;

    move-result-object v0

    invoke-static {v0}, Lcom/daaw/ia7;->l(Lcom/daaw/ri7;)V

    new-instance v0, Lcom/daaw/qg7;

    invoke-direct {v0}, Lcom/daaw/qg7;-><init>()V

    invoke-virtual {p1}, Lcom/daaw/li7;->Q()Lcom/daaw/ll7;

    move-result-object p1

    invoke-static {p1}, Lcom/daaw/qg7;->l(Lcom/daaw/ll7;)V

    return-void
.end method

.method public final f()I
    .locals 1

    const/4 v0, 0x2

    return v0
.end method
