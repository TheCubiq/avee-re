.class public final synthetic Lcom/daaw/h36;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Ljava/util/concurrent/Callable;


# instance fields
.field public final synthetic a:Lcom/daaw/n36;


# direct methods
.method public synthetic constructor <init>(Lcom/daaw/n36;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/daaw/h36;->a:Lcom/daaw/n36;

    return-void
.end method


# virtual methods
.method public final call()Ljava/lang/Object;
    .locals 1

    iget-object v0, p0, Lcom/daaw/h36;->a:Lcom/daaw/n36;

    invoke-virtual {v0}, Lcom/daaw/n36;->a()Lcom/daaw/j36;

    move-result-object v0

    return-object v0
.end method
