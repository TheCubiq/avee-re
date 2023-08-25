.class public final synthetic Lcom/daaw/cn4;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Ljava/util/concurrent/Callable;


# instance fields
.field public final synthetic a:Lcom/daaw/jn4;

.field public final synthetic b:Lcom/daaw/f77;

.field public final synthetic c:Lcom/daaw/f77;

.field public final synthetic d:Lcom/daaw/f77;


# direct methods
.method public synthetic constructor <init>(Lcom/daaw/jn4;Lcom/daaw/f77;Lcom/daaw/f77;Lcom/daaw/f77;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/daaw/cn4;->a:Lcom/daaw/jn4;

    iput-object p2, p0, Lcom/daaw/cn4;->b:Lcom/daaw/f77;

    iput-object p3, p0, Lcom/daaw/cn4;->c:Lcom/daaw/f77;

    iput-object p4, p0, Lcom/daaw/cn4;->d:Lcom/daaw/f77;

    return-void
.end method


# virtual methods
.method public final call()Ljava/lang/Object;
    .locals 4

    iget-object v0, p0, Lcom/daaw/cn4;->a:Lcom/daaw/jn4;

    iget-object v1, p0, Lcom/daaw/cn4;->b:Lcom/daaw/f77;

    iget-object v2, p0, Lcom/daaw/cn4;->c:Lcom/daaw/f77;

    iget-object v3, p0, Lcom/daaw/cn4;->d:Lcom/daaw/f77;

    invoke-virtual {v0, v1, v2, v3}, Lcom/daaw/jn4;->g(Lcom/daaw/f77;Lcom/daaw/f77;Lcom/daaw/f77;)Lcom/daaw/f77;

    move-result-object v0

    return-object v0
.end method
