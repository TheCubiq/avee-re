.class public final synthetic Lcom/daaw/vm5;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Ljava/util/concurrent/Callable;


# instance fields
.field public final synthetic a:Lcom/daaw/f77;

.field public final synthetic b:Lcom/daaw/f77;


# direct methods
.method public synthetic constructor <init>(Lcom/daaw/f77;Lcom/daaw/f77;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/daaw/vm5;->a:Lcom/daaw/f77;

    iput-object p2, p0, Lcom/daaw/vm5;->b:Lcom/daaw/f77;

    return-void
.end method


# virtual methods
.method public final call()Ljava/lang/Object;
    .locals 4

    iget-object v0, p0, Lcom/daaw/vm5;->a:Lcom/daaw/f77;

    iget-object v1, p0, Lcom/daaw/vm5;->b:Lcom/daaw/f77;

    new-instance v2, Lcom/daaw/bn5;

    invoke-interface {v0}, Ljava/util/concurrent/Future;->get()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/daaw/pn5;

    invoke-interface {v1}, Ljava/util/concurrent/Future;->get()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Lcom/daaw/zm5;

    iget-object v3, v3, Lcom/daaw/zm5;->b:Lorg/json/JSONObject;

    invoke-interface {v1}, Ljava/util/concurrent/Future;->get()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lcom/daaw/zm5;

    iget-object v1, v1, Lcom/daaw/zm5;->a:Lcom/daaw/pu3;

    invoke-direct {v2, v0, v3, v1}, Lcom/daaw/bn5;-><init>(Lcom/daaw/pn5;Lorg/json/JSONObject;Lcom/daaw/pu3;)V

    return-object v2
.end method
