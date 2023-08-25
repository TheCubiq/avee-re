.class public final synthetic Lcom/daaw/uc6;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Ljava/util/concurrent/Callable;


# instance fields
.field public final synthetic a:Lcom/daaw/gh6;


# direct methods
.method public synthetic constructor <init>(Lcom/daaw/gh6;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/daaw/uc6;->a:Lcom/daaw/gh6;

    return-void
.end method


# virtual methods
.method public final call()Ljava/lang/Object;
    .locals 2

    iget-object v0, p0, Lcom/daaw/uc6;->a:Lcom/daaw/gh6;

    new-instance v1, Lcom/daaw/js8;

    iget-object v0, v0, Lcom/daaw/gh6;->k:Lcom/daaw/zp8;

    invoke-direct {v1, v0}, Lcom/daaw/js8;-><init>(Lcom/daaw/zp8;)V

    return-object v1
.end method
