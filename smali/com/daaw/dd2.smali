.class public final Lcom/daaw/dd2;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Ljava/util/concurrent/Callable;


# instance fields
.field public final synthetic a:Ljava/lang/String;

.field public final synthetic b:Lcom/daaw/f01;

.field public final synthetic c:Lcom/daaw/rb;


# direct methods
.method public constructor <init>(Lcom/daaw/rb;Ljava/lang/String;Lcom/daaw/f01;)V
    .locals 0

    iput-object p1, p0, Lcom/daaw/dd2;->c:Lcom/daaw/rb;

    iput-object p2, p0, Lcom/daaw/dd2;->a:Ljava/lang/String;

    iput-object p3, p0, Lcom/daaw/dd2;->b:Lcom/daaw/f01;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final bridge synthetic call()Ljava/lang/Object;
    .locals 3

    iget-object v0, p0, Lcom/daaw/dd2;->c:Lcom/daaw/rb;

    iget-object v1, p0, Lcom/daaw/dd2;->a:Ljava/lang/String;

    invoke-static {v0, v1}, Lcom/daaw/rb;->A(Lcom/daaw/rb;Ljava/lang/String;)Lcom/daaw/n63;

    move-result-object v0

    invoke-virtual {v0}, Lcom/daaw/n63;->b()Ljava/util/List;

    move-result-object v1

    if-eqz v1, :cond_0

    iget-object v1, p0, Lcom/daaw/dd2;->b:Lcom/daaw/f01;

    invoke-virtual {v0}, Lcom/daaw/n63;->a()Lcom/daaw/xb;

    move-result-object v2

    invoke-virtual {v0}, Lcom/daaw/n63;->b()Ljava/util/List;

    move-result-object v0

    invoke-interface {v1, v2, v0}, Lcom/daaw/f01;->c(Lcom/daaw/xb;Ljava/util/List;)V

    goto :goto_0

    :cond_0
    iget-object v1, p0, Lcom/daaw/dd2;->b:Lcom/daaw/f01;

    invoke-virtual {v0}, Lcom/daaw/n63;->a()Lcom/daaw/xb;

    move-result-object v0

    invoke-static {}, Lcom/daaw/rt8;->r()Lcom/daaw/rt8;

    move-result-object v2

    invoke-interface {v1, v0, v2}, Lcom/daaw/f01;->c(Lcom/daaw/xb;Ljava/util/List;)V

    :goto_0
    const/4 v0, 0x0

    return-object v0
.end method
