.class public final synthetic Lcom/daaw/q46;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Ljava/util/concurrent/Callable;


# instance fields
.field public final synthetic a:Lcom/daaw/r46;


# direct methods
.method public synthetic constructor <init>(Lcom/daaw/r46;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/daaw/q46;->a:Lcom/daaw/r46;

    return-void
.end method


# virtual methods
.method public final call()Ljava/lang/Object;
    .locals 1

    iget-object v0, p0, Lcom/daaw/q46;->a:Lcom/daaw/r46;

    invoke-virtual {v0}, Lcom/daaw/r46;->a()Lcom/daaw/s46;

    move-result-object v0

    return-object v0
.end method
