.class public Lcom/daaw/if0$a;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Lcom/daaw/ip;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/daaw/if0;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x9
    name = "a"
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Lcom/daaw/ip<",
        "Lcom/daaw/jf0;",
        ">;"
    }
.end annotation


# instance fields
.field public final a:Lcom/daaw/ip;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lcom/daaw/ip<",
            "Ljava/io/InputStream;",
            ">;"
        }
    .end annotation
.end field

.field public final b:Lcom/daaw/ip;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lcom/daaw/ip<",
            "Landroid/os/ParcelFileDescriptor;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>(Lcom/daaw/ip;Lcom/daaw/ip;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/daaw/ip<",
            "Ljava/io/InputStream;",
            ">;",
            "Lcom/daaw/ip<",
            "Landroid/os/ParcelFileDescriptor;",
            ">;)V"
        }
    .end annotation

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/daaw/if0$a;->a:Lcom/daaw/ip;

    iput-object p2, p0, Lcom/daaw/if0$a;->b:Lcom/daaw/ip;

    return-void
.end method


# virtual methods
.method public bridge synthetic a(Lcom/daaw/dz0;)Ljava/lang/Object;
    .locals 0

    invoke-virtual {p0, p1}, Lcom/daaw/if0$a;->c(Lcom/daaw/dz0;)Lcom/daaw/jf0;

    move-result-object p1

    return-object p1
.end method

.method public b()V
    .locals 1

    iget-object v0, p0, Lcom/daaw/if0$a;->a:Lcom/daaw/ip;

    if-eqz v0, :cond_0

    invoke-interface {v0}, Lcom/daaw/ip;->b()V

    :cond_0
    iget-object v0, p0, Lcom/daaw/if0$a;->b:Lcom/daaw/ip;

    if-eqz v0, :cond_1

    invoke-interface {v0}, Lcom/daaw/ip;->b()V

    :cond_1
    return-void
.end method

.method public c(Lcom/daaw/dz0;)Lcom/daaw/jf0;
    .locals 3

    iget-object v0, p0, Lcom/daaw/if0$a;->a:Lcom/daaw/ip;

    const/4 v1, 0x0

    if-eqz v0, :cond_1

    :try_start_0
    invoke-interface {v0, p1}, Lcom/daaw/ip;->a(Lcom/daaw/dz0;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/io/InputStream;
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_1

    :catch_0
    move-exception v0

    iget-object v2, p0, Lcom/daaw/if0$a;->b:Lcom/daaw/ip;

    if-eqz v2, :cond_0

    goto :goto_0

    :cond_0
    throw v0

    :cond_1
    :goto_0
    move-object v0, v1

    :goto_1
    iget-object v2, p0, Lcom/daaw/if0$a;->b:Lcom/daaw/ip;

    if-eqz v2, :cond_3

    :try_start_1
    invoke-interface {v2, p1}, Lcom/daaw/ip;->a(Lcom/daaw/dz0;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Landroid/os/ParcelFileDescriptor;
    :try_end_1
    .catch Ljava/lang/Exception; {:try_start_1 .. :try_end_1} :catch_1

    move-object v1, p1

    goto :goto_2

    :catch_1
    move-exception p1

    if-eqz v0, :cond_2

    goto :goto_2

    :cond_2
    throw p1

    :cond_3
    :goto_2
    new-instance p1, Lcom/daaw/jf0;

    invoke-direct {p1, v0, v1}, Lcom/daaw/jf0;-><init>(Ljava/io/InputStream;Landroid/os/ParcelFileDescriptor;)V

    return-object p1
.end method

.method public cancel()V
    .locals 1

    iget-object v0, p0, Lcom/daaw/if0$a;->a:Lcom/daaw/ip;

    if-eqz v0, :cond_0

    invoke-interface {v0}, Lcom/daaw/ip;->cancel()V

    :cond_0
    iget-object v0, p0, Lcom/daaw/if0$a;->b:Lcom/daaw/ip;

    if-eqz v0, :cond_1

    invoke-interface {v0}, Lcom/daaw/ip;->cancel()V

    :cond_1
    return-void
.end method

.method public getId()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/daaw/if0$a;->a:Lcom/daaw/ip;

    if-eqz v0, :cond_0

    invoke-interface {v0}, Lcom/daaw/ip;->getId()Ljava/lang/String;

    move-result-object v0

    return-object v0

    :cond_0
    iget-object v0, p0, Lcom/daaw/if0$a;->b:Lcom/daaw/ip;

    invoke-interface {v0}, Lcom/daaw/ip;->getId()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
