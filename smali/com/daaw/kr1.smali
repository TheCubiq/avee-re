.class public Lcom/daaw/kr1;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Lcom/daaw/me0;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "<FromResult:",
        "Ljava/lang/Object;",
        "Result:",
        "Ljava/lang/Object;",
        ">",
        "Ljava/lang/Object;",
        "Lcom/daaw/me0<",
        "TResult;>;"
    }
.end annotation


# instance fields
.field public a:Lcom/daaw/ir1;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lcom/daaw/ir1<",
            "TFromResult;>;"
        }
    .end annotation
.end field

.field public b:Lcom/daaw/r40;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lcom/daaw/r40<",
            "TFromResult;TResult;>;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>(Lcom/daaw/ir1;Lcom/daaw/r40;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/daaw/ir1<",
            "TFromResult;>;",
            "Lcom/daaw/r40<",
            "TFromResult;TResult;>;)V"
        }
    .end annotation

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/daaw/kr1;->a:Lcom/daaw/ir1;

    iput-object p2, p0, Lcom/daaw/kr1;->b:Lcom/daaw/r40;

    return-void
.end method

.method public static synthetic b(Lcom/daaw/kr1;)Lcom/daaw/r40;
    .locals 0

    iget-object p0, p0, Lcom/daaw/kr1;->b:Lcom/daaw/r40;

    return-object p0
.end method


# virtual methods
.method public a(Lcom/daaw/ir1$b;)V
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/daaw/ir1$b<",
            "TResult;>;)V"
        }
    .end annotation

    iget-object v0, p0, Lcom/daaw/kr1;->a:Lcom/daaw/ir1;

    new-instance v1, Lcom/daaw/kr1$a;

    invoke-direct {v1, p0, p1}, Lcom/daaw/kr1$a;-><init>(Lcom/daaw/kr1;Lcom/daaw/ir1$b;)V

    invoke-virtual {v0, v1}, Lcom/daaw/ir1;->a(Lcom/daaw/ir1$b;)V

    return-void
.end method

.method public cancel(Z)Z
    .locals 1

    iget-object v0, p0, Lcom/daaw/kr1;->a:Lcom/daaw/ir1;

    invoke-virtual {v0, p1}, Landroid/os/AsyncTask;->cancel(Z)Z

    move-result p1

    return p1
.end method

.method public getStatus()Landroid/os/AsyncTask$Status;
    .locals 1

    iget-object v0, p0, Lcom/daaw/kr1;->a:Lcom/daaw/ir1;

    invoke-virtual {v0}, Landroid/os/AsyncTask;->getStatus()Landroid/os/AsyncTask$Status;

    move-result-object v0

    return-object v0
.end method
