.class public final synthetic Lcom/daaw/ns8;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic p:Lcom/daaw/lz0;


# direct methods
.method public synthetic constructor <init>(Lcom/daaw/lz0;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/daaw/ns8;->p:Lcom/daaw/lz0;

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 3

    iget-object v0, p0, Lcom/daaw/ns8;->p:Lcom/daaw/lz0;

    sget-object v1, Lcom/daaw/uz2;->n:Lcom/daaw/xb;

    new-instance v2, Ljava/util/ArrayList;

    invoke-direct {v2}, Ljava/util/ArrayList;-><init>()V

    invoke-interface {v0, v1, v2}, Lcom/daaw/lz0;->a(Lcom/daaw/xb;Ljava/util/List;)V

    return-void
.end method
