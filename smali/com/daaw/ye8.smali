.class public final synthetic Lcom/daaw/ye8;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Lcom/daaw/c35;


# instance fields
.field public final synthetic a:Lcom/daaw/ib8;

.field public final synthetic b:I


# direct methods
.method public synthetic constructor <init>(Lcom/daaw/ib8;I)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/daaw/ye8;->a:Lcom/daaw/ib8;

    iput p2, p0, Lcom/daaw/ye8;->b:I

    return-void
.end method


# virtual methods
.method public final zza(Ljava/lang/Object;)V
    .locals 2

    iget-object v0, p0, Lcom/daaw/ye8;->a:Lcom/daaw/ib8;

    iget v1, p0, Lcom/daaw/ye8;->b:I

    check-cast p1, Lcom/daaw/ob8;

    invoke-interface {p1, v0, v1}, Lcom/daaw/ob8;->u(Lcom/daaw/ib8;I)V

    return-void
.end method
