.class public final synthetic Lcom/daaw/tb8;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Lcom/daaw/c35;


# instance fields
.field public final synthetic a:Lcom/daaw/ib8;

.field public final synthetic b:Lcom/daaw/f92;

.field public final synthetic c:Lcom/daaw/tm7;


# direct methods
.method public synthetic constructor <init>(Lcom/daaw/ib8;Lcom/daaw/f92;Lcom/daaw/tm7;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/daaw/tb8;->a:Lcom/daaw/ib8;

    iput-object p2, p0, Lcom/daaw/tb8;->b:Lcom/daaw/f92;

    iput-object p3, p0, Lcom/daaw/tb8;->c:Lcom/daaw/tm7;

    return-void
.end method


# virtual methods
.method public final zza(Ljava/lang/Object;)V
    .locals 3

    iget-object v0, p0, Lcom/daaw/tb8;->a:Lcom/daaw/ib8;

    iget-object v1, p0, Lcom/daaw/tb8;->b:Lcom/daaw/f92;

    iget-object v2, p0, Lcom/daaw/tb8;->c:Lcom/daaw/tm7;

    check-cast p1, Lcom/daaw/ob8;

    invoke-interface {p1, v0, v1, v2}, Lcom/daaw/ob8;->e(Lcom/daaw/ib8;Lcom/daaw/f92;Lcom/daaw/tm7;)V

    return-void
.end method
