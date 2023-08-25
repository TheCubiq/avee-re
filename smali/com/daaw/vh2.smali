.class public final synthetic Lcom/daaw/vh2;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Ljava/util/concurrent/Callable;


# instance fields
.field public final synthetic a:Lcom/daaw/il2;


# direct methods
.method public synthetic constructor <init>(Lcom/daaw/il2;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/daaw/vh2;->a:Lcom/daaw/il2;

    return-void
.end method


# virtual methods
.method public final call()Ljava/lang/Object;
    .locals 1

    iget-object v0, p0, Lcom/daaw/vh2;->a:Lcom/daaw/il2;

    invoke-virtual {v0}, Lcom/daaw/il2;->a()Ljava/lang/Object;

    const/4 v0, 0x0

    return-object v0
.end method
