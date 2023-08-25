.class public Lcom/daaw/pe0$a;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Lcom/daaw/gz1$a;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/daaw/pe0;->a()Lcom/daaw/oe0;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Lcom/daaw/gz1$a<",
        "Lcom/daaw/lo1<",
        "Lcom/daaw/tx0;",
        "Lcom/daaw/pf1;",
        ">;>;"
    }
.end annotation


# direct methods
.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public bridge synthetic a(Ljava/lang/String;Ljava/lang/String;ILjava/lang/String;)Ljava/lang/Object;
    .locals 0

    invoke-virtual {p0, p1, p2, p3, p4}, Lcom/daaw/pe0$a;->b(Ljava/lang/String;Ljava/lang/String;ILjava/lang/String;)Lcom/daaw/lo1;

    move-result-object p1

    return-object p1
.end method

.method public b(Ljava/lang/String;Ljava/lang/String;ILjava/lang/String;)Lcom/daaw/lo1;
    .locals 8
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            "I",
            "Ljava/lang/String;",
            ")",
            "Lcom/daaw/lo1<",
            "Lcom/daaw/tx0;",
            "Lcom/daaw/pf1;",
            ">;"
        }
    .end annotation

    new-instance v0, Lcom/daaw/lo1;

    new-instance v7, Lcom/daaw/tx0;

    const-wide/16 v2, -0x1

    const/4 v6, 0x0

    move-object v1, v7

    move-object v4, p2

    move-object v5, p1

    invoke-direct/range {v1 .. v6}, Lcom/daaw/tx0;-><init>(JLjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    new-instance v1, Lcom/daaw/pf1;

    invoke-direct {v1, p1, p2, p3, p4}, Lcom/daaw/pf1;-><init>(Ljava/lang/String;Ljava/lang/String;ILjava/lang/String;)V

    invoke-direct {v0, v7, v1}, Lcom/daaw/lo1;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    return-object v0
.end method
