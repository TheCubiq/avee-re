.class public final Lcom/daaw/ha7;
.super Lcom/daaw/de7;
.source ""


# instance fields
.field public final synthetic b:Lcom/daaw/ia7;


# direct methods
.method public constructor <init>(Lcom/daaw/ia7;Ljava/lang/Class;)V
    .locals 0

    iput-object p1, p0, Lcom/daaw/ha7;->b:Lcom/daaw/ia7;

    invoke-direct {p0, p2}, Lcom/daaw/de7;-><init>(Ljava/lang/Class;)V

    return-void
.end method

.method public static final g(Lcom/daaw/ui7;)Lcom/daaw/ri7;
    .locals 2

    invoke-static {}, Lcom/daaw/ri7;->M()Lcom/daaw/qi7;

    move-result-object v0

    invoke-virtual {p0}, Lcom/daaw/ui7;->Q()Lcom/daaw/xi7;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/daaw/qi7;->t(Lcom/daaw/xi7;)Lcom/daaw/qi7;

    invoke-virtual {p0}, Lcom/daaw/ui7;->L()I

    move-result p0

    invoke-static {p0}, Lcom/daaw/vp7;->a(I)[B

    move-result-object p0

    invoke-static {p0}, Lcom/daaw/yq7;->F([B)Lcom/daaw/yq7;

    move-result-object p0

    invoke-virtual {v0, p0}, Lcom/daaw/qi7;->s(Lcom/daaw/yq7;)Lcom/daaw/qi7;

    const/4 p0, 0x0

    invoke-virtual {v0, p0}, Lcom/daaw/qi7;->u(I)Lcom/daaw/qi7;

    invoke-virtual {v0}, Lcom/daaw/fs7;->n()Lcom/daaw/ls7;

    move-result-object p0

    check-cast p0, Lcom/daaw/ri7;

    return-object p0
.end method


# virtual methods
.method public final bridge synthetic a(Lcom/daaw/xt7;)Lcom/daaw/xt7;
    .locals 0

    check-cast p1, Lcom/daaw/ui7;

    invoke-static {p1}, Lcom/daaw/ha7;->g(Lcom/daaw/ui7;)Lcom/daaw/ri7;

    move-result-object p1

    return-object p1
.end method

.method public final synthetic b(Lcom/daaw/yq7;)Lcom/daaw/xt7;
    .locals 1

    invoke-static {}, Lcom/daaw/vr7;->a()Lcom/daaw/vr7;

    move-result-object v0

    invoke-static {p1, v0}, Lcom/daaw/ui7;->P(Lcom/daaw/yq7;Lcom/daaw/vr7;)Lcom/daaw/ui7;

    move-result-object p1

    return-object p1
.end method

.method public final bridge synthetic d(Lcom/daaw/xt7;)V
    .locals 0

    check-cast p1, Lcom/daaw/ui7;

    invoke-virtual {p0, p1}, Lcom/daaw/ha7;->f(Lcom/daaw/ui7;)V

    return-void
.end method

.method public final f(Lcom/daaw/ui7;)V
    .locals 1

    invoke-virtual {p1}, Lcom/daaw/ui7;->L()I

    move-result v0

    invoke-static {v0}, Lcom/daaw/xp7;->a(I)V

    iget-object v0, p0, Lcom/daaw/ha7;->b:Lcom/daaw/ia7;

    invoke-virtual {p1}, Lcom/daaw/ui7;->Q()Lcom/daaw/xi7;

    move-result-object p1

    invoke-static {v0, p1}, Lcom/daaw/ia7;->k(Lcom/daaw/ia7;Lcom/daaw/xi7;)V

    return-void
.end method
