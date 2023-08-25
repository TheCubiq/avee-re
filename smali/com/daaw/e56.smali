.class public final synthetic Lcom/daaw/e56;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Ljava/util/concurrent/Callable;


# instance fields
.field public final synthetic a:Lcom/daaw/f56;


# direct methods
.method public synthetic constructor <init>(Lcom/daaw/f56;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/daaw/e56;->a:Lcom/daaw/f56;

    return-void
.end method


# virtual methods
.method public final call()Ljava/lang/Object;
    .locals 1

    iget-object v0, p0, Lcom/daaw/e56;->a:Lcom/daaw/f56;

    invoke-virtual {v0}, Lcom/daaw/f56;->a()Lcom/daaw/g56;

    move-result-object v0

    return-object v0
.end method
