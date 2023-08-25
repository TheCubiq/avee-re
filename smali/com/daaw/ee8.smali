.class public final synthetic Lcom/daaw/ee8;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Lcom/daaw/c35;


# instance fields
.field public final synthetic a:Lcom/daaw/ib8;

.field public final synthetic b:I

.field public final synthetic c:J


# direct methods
.method public synthetic constructor <init>(Lcom/daaw/ib8;IJ)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/daaw/ee8;->a:Lcom/daaw/ib8;

    iput p2, p0, Lcom/daaw/ee8;->b:I

    iput-wide p3, p0, Lcom/daaw/ee8;->c:J

    return-void
.end method


# virtual methods
.method public final zza(Ljava/lang/Object;)V
    .locals 4

    iget-object v0, p0, Lcom/daaw/ee8;->a:Lcom/daaw/ib8;

    iget v1, p0, Lcom/daaw/ee8;->b:I

    iget-wide v2, p0, Lcom/daaw/ee8;->c:J

    check-cast p1, Lcom/daaw/ob8;

    invoke-interface {p1, v0, v1, v2, v3}, Lcom/daaw/ob8;->q(Lcom/daaw/ib8;IJ)V

    return-void
.end method
