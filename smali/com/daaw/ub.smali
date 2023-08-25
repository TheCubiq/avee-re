.class public final synthetic Lcom/daaw/ub;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic p:Lcom/daaw/wb$e;


# direct methods
.method public synthetic constructor <init>(Lcom/daaw/wb$e;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/daaw/ub;->p:Lcom/daaw/wb$e;

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 1

    iget-object v0, p0, Lcom/daaw/ub;->p:Lcom/daaw/wb$e;

    invoke-interface {v0}, Lcom/daaw/wb$e;->a()V

    return-void
.end method
