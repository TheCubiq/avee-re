.class public final synthetic Lcom/daaw/xx2;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Ljava/util/concurrent/Callable;


# instance fields
.field public final synthetic a:Lcom/daaw/tr3;


# direct methods
.method public synthetic constructor <init>(Lcom/daaw/tr3;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/daaw/xx2;->a:Lcom/daaw/tr3;

    return-void
.end method


# virtual methods
.method public final call()Ljava/lang/Object;
    .locals 2

    iget-object v0, p0, Lcom/daaw/xx2;->a:Lcom/daaw/tr3;

    new-instance v1, Lcom/daaw/q98;

    iget-object v0, v0, Lcom/daaw/tr3;->c:Lcom/daaw/z42;

    invoke-direct {v1, v0}, Lcom/daaw/q98;-><init>(Lcom/daaw/z42;)V

    return-object v1
.end method
