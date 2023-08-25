.class public final Lcom/daaw/dv6;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Ljava/util/concurrent/Callable;


# instance fields
.field public final synthetic a:Ljava/lang/String;

.field public final synthetic b:Ljava/lang/String;

.field public final synthetic c:Ljava/lang/String;

.field public final synthetic d:Lcom/daaw/ob7;


# direct methods
.method public constructor <init>(Lcom/daaw/ob7;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V
    .locals 0

    iput-object p1, p0, Lcom/daaw/dv6;->d:Lcom/daaw/ob7;

    iput-object p2, p0, Lcom/daaw/dv6;->a:Ljava/lang/String;

    iput-object p3, p0, Lcom/daaw/dv6;->b:Ljava/lang/String;

    iput-object p4, p0, Lcom/daaw/dv6;->c:Ljava/lang/String;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final bridge synthetic call()Ljava/lang/Object;
    .locals 4

    iget-object v0, p0, Lcom/daaw/dv6;->d:Lcom/daaw/ob7;

    invoke-static {v0}, Lcom/daaw/ob7;->g3(Lcom/daaw/ob7;)Lcom/daaw/yb8;

    move-result-object v0

    invoke-virtual {v0}, Lcom/daaw/yb8;->c()V

    iget-object v0, p0, Lcom/daaw/dv6;->d:Lcom/daaw/ob7;

    invoke-static {v0}, Lcom/daaw/ob7;->g3(Lcom/daaw/ob7;)Lcom/daaw/yb8;

    move-result-object v0

    invoke-virtual {v0}, Lcom/daaw/yb8;->W()Lcom/daaw/uh2;

    move-result-object v0

    iget-object v1, p0, Lcom/daaw/dv6;->a:Ljava/lang/String;

    iget-object v2, p0, Lcom/daaw/dv6;->b:Ljava/lang/String;

    iget-object v3, p0, Lcom/daaw/dv6;->c:Ljava/lang/String;

    invoke-virtual {v0, v1, v2, v3}, Lcom/daaw/uh2;->d0(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/util/List;

    move-result-object v0

    return-object v0
.end method
