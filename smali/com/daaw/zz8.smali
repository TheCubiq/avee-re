.class public final synthetic Lcom/daaw/zz8;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic p:Lcom/daaw/d0;


# direct methods
.method public synthetic constructor <init>(Lcom/daaw/d0;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/daaw/zz8;->p:Lcom/daaw/d0;

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 2

    iget-object v0, p0, Lcom/daaw/zz8;->p:Lcom/daaw/d0;

    sget-object v1, Lcom/daaw/uz2;->n:Lcom/daaw/xb;

    invoke-interface {v0, v1}, Lcom/daaw/d0;->a(Lcom/daaw/xb;)V

    return-void
.end method
