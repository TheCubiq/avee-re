.class public final Lcom/daaw/sa7;
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
    .locals 1

    check-cast p1, Lcom/daaw/sj7;

    new-instance v0, Lcom/daaw/wb7;

    invoke-virtual {p1}, Lcom/daaw/sj7;->P()Lcom/daaw/yq7;

    move-result-object p1

    invoke-virtual {p1}, Lcom/daaw/yq7;->j()[B

    move-result-object p1

    invoke-direct {v0, p1}, Lcom/daaw/wb7;-><init>([B)V

    return-object v0
.end method
