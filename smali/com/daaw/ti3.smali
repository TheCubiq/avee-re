.class public final Lcom/daaw/ti3;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Lcom/daaw/pa$a;


# instance fields
.field public final synthetic a:Lcom/daaw/e14;

.field public final synthetic b:Lcom/daaw/vi3;


# direct methods
.method public constructor <init>(Lcom/daaw/vi3;Lcom/daaw/e14;)V
    .locals 0

    iput-object p1, p0, Lcom/daaw/ti3;->b:Lcom/daaw/vi3;

    iput-object p2, p0, Lcom/daaw/ti3;->a:Lcom/daaw/e14;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final D(I)V
    .locals 4

    iget-object v0, p0, Lcom/daaw/ti3;->a:Lcom/daaw/e14;

    new-instance v1, Ljava/lang/RuntimeException;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "onConnectionSuspended: "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2, p1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-direct {v1, p1}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/String;)V

    invoke-virtual {v0, v1}, Lcom/daaw/e14;->c(Ljava/lang/Throwable;)Z

    return-void
.end method

.method public final M(Landroid/os/Bundle;)V
    .locals 1

    :try_start_0
    iget-object p1, p0, Lcom/daaw/ti3;->a:Lcom/daaw/e14;

    iget-object v0, p0, Lcom/daaw/ti3;->b:Lcom/daaw/vi3;

    invoke-static {v0}, Lcom/daaw/vi3;->a(Lcom/daaw/vi3;)Lcom/daaw/ki3;

    move-result-object v0

    invoke-virtual {v0}, Lcom/daaw/ki3;->J()Lcom/daaw/pi3;

    move-result-object v0

    invoke-virtual {p1, v0}, Lcom/daaw/e14;->b(Ljava/lang/Object;)Z
    :try_end_0
    .catch Landroid/os/DeadObjectException; {:try_start_0 .. :try_end_0} :catch_0

    return-void

    :catch_0
    move-exception p1

    iget-object v0, p0, Lcom/daaw/ti3;->a:Lcom/daaw/e14;

    invoke-virtual {v0, p1}, Lcom/daaw/e14;->c(Ljava/lang/Throwable;)Z

    return-void
.end method
