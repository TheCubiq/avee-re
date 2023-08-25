.class public final Lcom/daaw/ja7;
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
    .locals 2

    check-cast p1, Lcom/daaw/aj7;

    new-instance v0, Lcom/daaw/no7;

    invoke-virtual {p1}, Lcom/daaw/aj7;->Q()Lcom/daaw/yq7;

    move-result-object v1

    invoke-virtual {v1}, Lcom/daaw/yq7;->j()[B

    move-result-object v1

    invoke-virtual {p1}, Lcom/daaw/aj7;->P()Lcom/daaw/gj7;

    move-result-object p1

    invoke-virtual {p1}, Lcom/daaw/gj7;->L()I

    move-result p1

    invoke-direct {v0, v1, p1}, Lcom/daaw/no7;-><init>([BI)V

    return-object v0
.end method
