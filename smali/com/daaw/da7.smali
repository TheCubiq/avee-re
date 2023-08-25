.class public final Lcom/daaw/da7;
.super Lcom/daaw/cf7;
.source ""


# direct methods
.method public constructor <init>(Ljava/lang/Class;)V
    .locals 0

    invoke-direct {p0, p1}, Lcom/daaw/cf7;-><init>(Ljava/lang/Class;)V

    return-void
.end method


# virtual methods
.method public final bridge synthetic a(Lcom/daaw/xt7;)Ljava/lang/Object;
    .locals 5

    check-cast p1, Lcom/daaw/li7;

    new-instance v0, Lcom/daaw/dp7;

    new-instance v1, Lcom/daaw/ia7;

    invoke-direct {v1}, Lcom/daaw/ia7;-><init>()V

    invoke-virtual {p1}, Lcom/daaw/li7;->P()Lcom/daaw/ri7;

    move-result-object v2

    const-class v3, Lcom/daaw/pp7;

    invoke-virtual {v1, v2, v3}, Lcom/daaw/ee7;->i(Lcom/daaw/xt7;Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lcom/daaw/pp7;

    new-instance v2, Lcom/daaw/qg7;

    invoke-direct {v2}, Lcom/daaw/qg7;-><init>()V

    invoke-virtual {p1}, Lcom/daaw/li7;->Q()Lcom/daaw/ll7;

    move-result-object v3

    const-class v4, Lcom/daaw/g97;

    invoke-virtual {v2, v3, v4}, Lcom/daaw/ee7;->i(Lcom/daaw/xt7;Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lcom/daaw/g97;

    invoke-virtual {p1}, Lcom/daaw/li7;->Q()Lcom/daaw/ll7;

    move-result-object p1

    invoke-virtual {p1}, Lcom/daaw/ll7;->Q()Lcom/daaw/ul7;

    move-result-object p1

    invoke-virtual {p1}, Lcom/daaw/ul7;->L()I

    move-result p1

    invoke-direct {v0, v1, v2, p1}, Lcom/daaw/dp7;-><init>(Lcom/daaw/pp7;Lcom/daaw/g97;I)V

    return-object v0
.end method
