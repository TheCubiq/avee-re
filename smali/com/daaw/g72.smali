.class public final synthetic Lcom/daaw/g72;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic p:Lcom/daaw/f01;


# direct methods
.method public synthetic constructor <init>(Lcom/daaw/f01;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/daaw/g72;->p:Lcom/daaw/f01;

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 3

    iget-object v0, p0, Lcom/daaw/g72;->p:Lcom/daaw/f01;

    sget-object v1, Lcom/daaw/uz2;->n:Lcom/daaw/xb;

    invoke-static {}, Lcom/daaw/rt8;->r()Lcom/daaw/rt8;

    move-result-object v2

    invoke-interface {v0, v1, v2}, Lcom/daaw/f01;->c(Lcom/daaw/xb;Ljava/util/List;)V

    return-void
.end method
