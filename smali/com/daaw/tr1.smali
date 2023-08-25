.class public Lcom/daaw/tr1;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Lcom/daaw/me0;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "<Result:",
        "Ljava/lang/Object;",
        ">",
        "Ljava/lang/Object;",
        "Lcom/daaw/me0<",
        "TResult;>;"
    }
.end annotation


# instance fields
.field public a:Ljava/lang/Object;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "TResult;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>(Ljava/lang/Object;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(TResult;)V"
        }
    .end annotation

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/daaw/tr1;->a:Ljava/lang/Object;

    return-void
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

    iget-object v0, p0, Lcom/daaw/tr1;->a:Ljava/lang/Object;

    const/4 v1, 0x0

    invoke-interface {p1, v0, v1}, Lcom/daaw/ir1$b;->a(Ljava/lang/Object;Z)V

    return-void
.end method

.method public cancel(Z)Z
    .locals 0

    const/4 p1, 0x0

    return p1
.end method

.method public getStatus()Landroid/os/AsyncTask$Status;
    .locals 1

    const/4 v0, 0x0

    return-object v0
.end method
