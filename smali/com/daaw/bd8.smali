.class public final synthetic Lcom/daaw/bd8;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Lcom/daaw/c35;


# instance fields
.field public final synthetic a:Lcom/daaw/ib8;

.field public final synthetic b:I

.field public final synthetic c:J

.field public final synthetic d:J


# direct methods
.method public synthetic constructor <init>(Lcom/daaw/ib8;IJJ)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/daaw/bd8;->a:Lcom/daaw/ib8;

    iput p2, p0, Lcom/daaw/bd8;->b:I

    iput-wide p3, p0, Lcom/daaw/bd8;->c:J

    iput-wide p5, p0, Lcom/daaw/bd8;->d:J

    return-void
.end method


# virtual methods
.method public final zza(Ljava/lang/Object;)V
    .locals 7

    iget-object v1, p0, Lcom/daaw/bd8;->a:Lcom/daaw/ib8;

    iget v2, p0, Lcom/daaw/bd8;->b:I

    iget-wide v3, p0, Lcom/daaw/bd8;->c:J

    iget-wide v5, p0, Lcom/daaw/bd8;->d:J

    move-object v0, p1

    check-cast v0, Lcom/daaw/ob8;

    invoke-interface/range {v0 .. v6}, Lcom/daaw/ob8;->b(Lcom/daaw/ib8;IJJ)V

    return-void
.end method
