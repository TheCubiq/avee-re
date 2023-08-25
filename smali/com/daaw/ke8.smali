.class public final synthetic Lcom/daaw/ke8;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Lcom/daaw/c35;


# instance fields
.field public final synthetic a:Lcom/daaw/ib8;

.field public final synthetic b:Lcom/daaw/jn3;


# direct methods
.method public synthetic constructor <init>(Lcom/daaw/ib8;Lcom/daaw/jn3;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/daaw/ke8;->a:Lcom/daaw/ib8;

    iput-object p2, p0, Lcom/daaw/ke8;->b:Lcom/daaw/jn3;

    return-void
.end method


# virtual methods
.method public final zza(Ljava/lang/Object;)V
    .locals 2

    iget-object v0, p0, Lcom/daaw/ke8;->a:Lcom/daaw/ib8;

    iget-object v1, p0, Lcom/daaw/ke8;->b:Lcom/daaw/jn3;

    check-cast p1, Lcom/daaw/ob8;

    invoke-interface {p1, v0, v1}, Lcom/daaw/ob8;->x(Lcom/daaw/ib8;Lcom/daaw/jn3;)V

    return-void
.end method
