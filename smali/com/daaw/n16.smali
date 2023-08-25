.class public final synthetic Lcom/daaw/n16;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Ljava/util/concurrent/Callable;


# instance fields
.field public final synthetic a:Lcom/daaw/o16;


# direct methods
.method public synthetic constructor <init>(Lcom/daaw/o16;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/daaw/n16;->a:Lcom/daaw/o16;

    return-void
.end method


# virtual methods
.method public final call()Ljava/lang/Object;
    .locals 1

    iget-object v0, p0, Lcom/daaw/n16;->a:Lcom/daaw/o16;

    invoke-virtual {v0}, Lcom/daaw/o16;->a()Lcom/daaw/p16;

    move-result-object v0

    return-object v0
.end method
