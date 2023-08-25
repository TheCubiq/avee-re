.class public Lcom/daaw/jq1;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Lcom/daaw/mq0;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "<T:",
        "Ljava/lang/Object;",
        ">",
        "Ljava/lang/Object;",
        "Lcom/daaw/mq0<",
        "Ljava/net/URL;",
        "TT;>;"
    }
.end annotation


# instance fields
.field public final a:Lcom/daaw/mq0;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lcom/daaw/mq0<",
            "Lcom/daaw/o70;",
            "TT;>;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>(Lcom/daaw/mq0;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/daaw/mq0<",
            "Lcom/daaw/o70;",
            "TT;>;)V"
        }
    .end annotation

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/daaw/jq1;->a:Lcom/daaw/mq0;

    return-void
.end method


# virtual methods
.method public bridge synthetic a(Ljava/lang/Object;II)Lcom/daaw/ip;
    .locals 0

    check-cast p1, Ljava/net/URL;

    invoke-virtual {p0, p1, p2, p3}, Lcom/daaw/jq1;->b(Ljava/net/URL;II)Lcom/daaw/ip;

    move-result-object p1

    return-object p1
.end method

.method public b(Ljava/net/URL;II)Lcom/daaw/ip;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/net/URL;",
            "II)",
            "Lcom/daaw/ip<",
            "TT;>;"
        }
    .end annotation

    iget-object v0, p0, Lcom/daaw/jq1;->a:Lcom/daaw/mq0;

    new-instance v1, Lcom/daaw/o70;

    invoke-direct {v1, p1}, Lcom/daaw/o70;-><init>(Ljava/net/URL;)V

    invoke-interface {v0, v1, p2, p3}, Lcom/daaw/mq0;->a(Ljava/lang/Object;II)Lcom/daaw/ip;

    move-result-object p1

    return-object p1
.end method
