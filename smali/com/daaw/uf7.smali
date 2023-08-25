.class public final Lcom/daaw/uf7;
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
    .locals 3

    check-cast p1, Lcom/daaw/zh7;

    new-instance v0, Lcom/daaw/tp7;

    new-instance v1, Lcom/daaw/qp7;

    invoke-virtual {p1}, Lcom/daaw/zh7;->Q()Lcom/daaw/yq7;

    move-result-object v2

    invoke-virtual {v2}, Lcom/daaw/yq7;->j()[B

    move-result-object v2

    invoke-direct {v1, v2}, Lcom/daaw/qp7;-><init>([B)V

    invoke-virtual {p1}, Lcom/daaw/zh7;->P()Lcom/daaw/ii7;

    move-result-object p1

    invoke-virtual {p1}, Lcom/daaw/ii7;->L()I

    move-result p1

    invoke-direct {v0, v1, p1}, Lcom/daaw/tp7;-><init>(Lcom/daaw/wh7;I)V

    return-object v0
.end method
