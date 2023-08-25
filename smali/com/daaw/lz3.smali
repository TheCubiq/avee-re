.class public final synthetic Lcom/daaw/lz3;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Ljava/util/concurrent/Callable;


# instance fields
.field public final synthetic a:Lcom/daaw/qz3;


# direct methods
.method public synthetic constructor <init>(Lcom/daaw/qz3;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/daaw/lz3;->a:Lcom/daaw/qz3;

    return-void
.end method


# virtual methods
.method public final call()Ljava/lang/Object;
    .locals 1

    iget-object v0, p0, Lcom/daaw/lz3;->a:Lcom/daaw/qz3;

    invoke-virtual {v0}, Lcom/daaw/qz3;->n()Ljava/util/ArrayList;

    move-result-object v0

    return-object v0
.end method
