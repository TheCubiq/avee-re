.class public final synthetic Lcom/daaw/j62;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Ljava/util/concurrent/Callable;


# instance fields
.field public final synthetic a:Lcom/daaw/rb;

.field public final synthetic b:Ljava/lang/String;

.field public final synthetic c:Ljava/lang/String;


# direct methods
.method public synthetic constructor <init>(Lcom/daaw/rb;Ljava/lang/String;Ljava/lang/String;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/daaw/j62;->a:Lcom/daaw/rb;

    iput-object p2, p0, Lcom/daaw/j62;->b:Ljava/lang/String;

    iput-object p3, p0, Lcom/daaw/j62;->c:Ljava/lang/String;

    return-void
.end method


# virtual methods
.method public final call()Ljava/lang/Object;
    .locals 3

    iget-object v0, p0, Lcom/daaw/j62;->a:Lcom/daaw/rb;

    iget-object v1, p0, Lcom/daaw/j62;->b:Ljava/lang/String;

    iget-object v2, p0, Lcom/daaw/j62;->c:Ljava/lang/String;

    invoke-virtual {v0, v1, v2}, Lcom/daaw/rb;->x(Ljava/lang/String;Ljava/lang/String;)Landroid/os/Bundle;

    move-result-object v0

    return-object v0
.end method
