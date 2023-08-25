.class public final synthetic Lcom/daaw/d76;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Ljava/util/concurrent/Callable;


# instance fields
.field public final synthetic a:Lcom/daaw/f76;


# direct methods
.method public synthetic constructor <init>(Lcom/daaw/f76;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/daaw/d76;->a:Lcom/daaw/f76;

    return-void
.end method


# virtual methods
.method public final call()Ljava/lang/Object;
    .locals 1

    iget-object v0, p0, Lcom/daaw/d76;->a:Lcom/daaw/f76;

    invoke-virtual {v0}, Lcom/daaw/f76;->b()Lcom/daaw/h76;

    move-result-object v0

    return-object v0
.end method
