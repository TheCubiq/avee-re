.class public final synthetic Lcom/daaw/x36;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Ljava/util/concurrent/Callable;


# instance fields
.field public final synthetic a:Lcom/daaw/y36;


# direct methods
.method public synthetic constructor <init>(Lcom/daaw/y36;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/daaw/x36;->a:Lcom/daaw/y36;

    return-void
.end method


# virtual methods
.method public final call()Ljava/lang/Object;
    .locals 1

    iget-object v0, p0, Lcom/daaw/x36;->a:Lcom/daaw/y36;

    invoke-virtual {v0}, Lcom/daaw/y36;->a()Lcom/daaw/z36;

    move-result-object v0

    return-object v0
.end method
