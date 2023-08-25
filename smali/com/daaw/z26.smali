.class public final synthetic Lcom/daaw/z26;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Ljava/util/concurrent/Callable;


# instance fields
.field public final synthetic a:Lcom/daaw/a36;


# direct methods
.method public synthetic constructor <init>(Lcom/daaw/a36;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/daaw/z26;->a:Lcom/daaw/a36;

    return-void
.end method


# virtual methods
.method public final call()Ljava/lang/Object;
    .locals 1

    iget-object v0, p0, Lcom/daaw/z26;->a:Lcom/daaw/a36;

    invoke-virtual {v0}, Lcom/daaw/a36;->a()Lcom/daaw/b36;

    move-result-object v0

    return-object v0
.end method
