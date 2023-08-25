.class public final synthetic Lcom/daaw/id8;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Lcom/daaw/c35;


# instance fields
.field public final synthetic a:Lcom/daaw/ib8;

.field public final synthetic b:I

.field public final synthetic c:Lcom/daaw/nx3;

.field public final synthetic d:Lcom/daaw/nx3;


# direct methods
.method public synthetic constructor <init>(Lcom/daaw/ib8;ILcom/daaw/nx3;Lcom/daaw/nx3;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/daaw/id8;->a:Lcom/daaw/ib8;

    iput p2, p0, Lcom/daaw/id8;->b:I

    iput-object p3, p0, Lcom/daaw/id8;->c:Lcom/daaw/nx3;

    iput-object p4, p0, Lcom/daaw/id8;->d:Lcom/daaw/nx3;

    return-void
.end method


# virtual methods
.method public final zza(Ljava/lang/Object;)V
    .locals 4

    iget-object v0, p0, Lcom/daaw/id8;->a:Lcom/daaw/ib8;

    iget v1, p0, Lcom/daaw/id8;->b:I

    iget-object v2, p0, Lcom/daaw/id8;->c:Lcom/daaw/nx3;

    iget-object v3, p0, Lcom/daaw/id8;->d:Lcom/daaw/nx3;

    check-cast p1, Lcom/daaw/ob8;

    invoke-interface {p1, v0, v2, v3, v1}, Lcom/daaw/ob8;->p(Lcom/daaw/ib8;Lcom/daaw/nx3;Lcom/daaw/nx3;I)V

    return-void
.end method
