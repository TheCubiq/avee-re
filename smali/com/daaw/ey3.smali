.class public final synthetic Lcom/daaw/ey3;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Ljava/util/concurrent/Callable;


# instance fields
.field public final synthetic a:Lcom/daaw/ky3;


# direct methods
.method public synthetic constructor <init>(Lcom/daaw/ky3;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/daaw/ey3;->a:Lcom/daaw/ky3;

    return-void
.end method


# virtual methods
.method public final call()Ljava/lang/Object;
    .locals 1

    iget-object v0, p0, Lcom/daaw/ey3;->a:Lcom/daaw/ky3;

    invoke-virtual {v0}, Lcom/daaw/ky3;->k()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
