.class public Lcom/daaw/vs1;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Lcom/daaw/g70;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "<R:",
        "Ljava/lang/Object;",
        ">",
        "Ljava/lang/Object;",
        "Lcom/daaw/g70<",
        "TR;>;"
    }
.end annotation


# instance fields
.field public final a:Lcom/daaw/us1$a;

.field public b:Lcom/daaw/f70;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lcom/daaw/f70<",
            "TR;>;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>(Lcom/daaw/us1$a;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/daaw/vs1;->a:Lcom/daaw/us1$a;

    return-void
.end method


# virtual methods
.method public a(ZZ)Lcom/daaw/f70;
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(ZZ)",
            "Lcom/daaw/f70<",
            "TR;>;"
        }
    .end annotation

    if-nez p1, :cond_2

    if-nez p2, :cond_0

    goto :goto_0

    :cond_0
    iget-object p1, p0, Lcom/daaw/vs1;->b:Lcom/daaw/f70;

    if-nez p1, :cond_1

    new-instance p1, Lcom/daaw/us1;

    iget-object p2, p0, Lcom/daaw/vs1;->a:Lcom/daaw/us1$a;

    invoke-direct {p1, p2}, Lcom/daaw/us1;-><init>(Lcom/daaw/us1$a;)V

    iput-object p1, p0, Lcom/daaw/vs1;->b:Lcom/daaw/f70;

    :cond_1
    iget-object p1, p0, Lcom/daaw/vs1;->b:Lcom/daaw/f70;

    return-object p1

    :cond_2
    :goto_0
    invoke-static {}, Lcom/daaw/vs0;->c()Lcom/daaw/f70;

    move-result-object p1

    return-object p1
.end method
