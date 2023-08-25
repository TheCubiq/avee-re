.class public final synthetic Lcom/daaw/w44;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Ljava/util/concurrent/Callable;


# instance fields
.field public final synthetic a:Lcom/daaw/y44;


# direct methods
.method public synthetic constructor <init>(Lcom/daaw/y44;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/daaw/w44;->a:Lcom/daaw/y44;

    return-void
.end method


# virtual methods
.method public final call()Ljava/lang/Object;
    .locals 1

    iget-object v0, p0, Lcom/daaw/w44;->a:Lcom/daaw/y44;

    invoke-virtual {v0}, Lcom/daaw/y44;->b()Ljava/lang/Boolean;

    move-result-object v0

    return-object v0
.end method
