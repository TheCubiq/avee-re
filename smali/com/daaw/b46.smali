.class public final synthetic Lcom/daaw/b46;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Ljava/util/concurrent/Callable;


# instance fields
.field public final synthetic a:Lcom/daaw/c46;


# direct methods
.method public synthetic constructor <init>(Lcom/daaw/c46;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/daaw/b46;->a:Lcom/daaw/c46;

    return-void
.end method


# virtual methods
.method public final call()Ljava/lang/Object;
    .locals 1

    iget-object v0, p0, Lcom/daaw/b46;->a:Lcom/daaw/c46;

    invoke-virtual {v0}, Lcom/daaw/c46;->a()Lcom/daaw/d46;

    move-result-object v0

    return-object v0
.end method
