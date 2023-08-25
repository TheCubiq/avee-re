.class public final synthetic Lcom/daaw/hg8;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Lcom/daaw/c35;


# instance fields
.field public final synthetic a:Lcom/daaw/ib8;

.field public final synthetic b:Ljava/lang/Object;

.field public final synthetic c:J


# direct methods
.method public synthetic constructor <init>(Lcom/daaw/ib8;Ljava/lang/Object;J)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/daaw/hg8;->a:Lcom/daaw/ib8;

    iput-object p2, p0, Lcom/daaw/hg8;->b:Ljava/lang/Object;

    iput-wide p3, p0, Lcom/daaw/hg8;->c:J

    return-void
.end method


# virtual methods
.method public final zza(Ljava/lang/Object;)V
    .locals 4

    iget-object v0, p0, Lcom/daaw/hg8;->a:Lcom/daaw/ib8;

    iget-object v1, p0, Lcom/daaw/hg8;->b:Ljava/lang/Object;

    iget-wide v2, p0, Lcom/daaw/hg8;->c:J

    check-cast p1, Lcom/daaw/ob8;

    invoke-interface {p1, v0, v1, v2, v3}, Lcom/daaw/ob8;->n(Lcom/daaw/ib8;Ljava/lang/Object;J)V

    return-void
.end method
