.class public Lcom/daaw/lg1;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Lcom/daaw/mq0;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/daaw/lg1$a;
    }
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Lcom/daaw/mq0;"
    }
.end annotation


# instance fields
.field public final a:Ljava/lang/String;


# direct methods
.method public constructor <init>()V
    .locals 1

    const-string v0, ""

    invoke-direct {p0, v0}, Lcom/daaw/lg1;-><init>(Ljava/lang/String;)V

    return-void
.end method

.method public constructor <init>(Ljava/lang/String;)V
    .locals 0
    .annotation runtime Ljava/lang/Deprecated;
    .end annotation

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/daaw/lg1;->a:Ljava/lang/String;

    return-void
.end method


# virtual methods
.method public bridge synthetic a(Ljava/lang/Object;II)Lcom/daaw/ip;
    .locals 0

    check-cast p1, [B

    invoke-virtual {p0, p1, p2, p3}, Lcom/daaw/lg1;->b([BII)Lcom/daaw/ip;

    move-result-object p1

    return-object p1
.end method

.method public b([BII)Lcom/daaw/ip;
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "([BII)",
            "Lcom/daaw/ip<",
            "Ljava/io/InputStream;",
            ">;"
        }
    .end annotation

    new-instance p2, Lcom/daaw/ad;

    iget-object p3, p0, Lcom/daaw/lg1;->a:Ljava/lang/String;

    invoke-direct {p2, p1, p3}, Lcom/daaw/ad;-><init>([BLjava/lang/String;)V

    return-object p2
.end method
