.class public final synthetic Lcom/daaw/uj5;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic p:Lcom/daaw/vj5;


# direct methods
.method public synthetic constructor <init>(Lcom/daaw/vj5;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/daaw/uj5;->p:Lcom/daaw/vj5;

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 1

    iget-object v0, p0, Lcom/daaw/uj5;->p:Lcom/daaw/vj5;

    invoke-virtual {v0}, Lcom/daaw/xj5;->a()V

    return-void
.end method
