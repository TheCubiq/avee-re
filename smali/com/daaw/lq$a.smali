.class public Lcom/daaw/lq$a;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Ljava/lang/Runnable;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/daaw/lq;->f(IJJ)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = null
.end annotation


# instance fields
.field public final synthetic p:I

.field public final synthetic q:J

.field public final synthetic r:J

.field public final synthetic s:Lcom/daaw/lq;


# direct methods
.method public constructor <init>(Lcom/daaw/lq;IJJ)V
    .locals 0

    iput-object p1, p0, Lcom/daaw/lq$a;->s:Lcom/daaw/lq;

    iput p2, p0, Lcom/daaw/lq$a;->p:I

    iput-wide p3, p0, Lcom/daaw/lq$a;->q:J

    iput-wide p5, p0, Lcom/daaw/lq$a;->r:J

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public run()V
    .locals 7

    iget-object v0, p0, Lcom/daaw/lq$a;->s:Lcom/daaw/lq;

    invoke-static {v0}, Lcom/daaw/lq;->e(Lcom/daaw/lq;)Lcom/daaw/ia$a;

    move-result-object v1

    iget v2, p0, Lcom/daaw/lq$a;->p:I

    iget-wide v3, p0, Lcom/daaw/lq$a;->q:J

    iget-wide v5, p0, Lcom/daaw/lq$a;->r:J

    invoke-interface/range {v1 .. v6}, Lcom/daaw/ia$a;->k(IJJ)V

    return-void
.end method
