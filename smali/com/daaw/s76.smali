.class public final synthetic Lcom/daaw/s76;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Ljava/util/concurrent/Callable;


# instance fields
.field public final synthetic a:Lcom/daaw/t76;


# direct methods
.method public synthetic constructor <init>(Lcom/daaw/t76;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/daaw/s76;->a:Lcom/daaw/t76;

    return-void
.end method


# virtual methods
.method public final call()Ljava/lang/Object;
    .locals 1

    iget-object v0, p0, Lcom/daaw/s76;->a:Lcom/daaw/t76;

    invoke-virtual {v0}, Lcom/daaw/t76;->a()Lcom/daaw/r76;

    move-result-object v0

    return-object v0
.end method
