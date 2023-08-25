.class public Lcom/daaw/rs1$a$d;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Ljava/lang/Runnable;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/daaw/rs1$a;->d(IJ)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = null
.end annotation


# instance fields
.field public final synthetic p:I

.field public final synthetic q:J

.field public final synthetic r:Lcom/daaw/rs1$a;


# direct methods
.method public constructor <init>(Lcom/daaw/rs1$a;IJ)V
    .locals 0

    iput-object p1, p0, Lcom/daaw/rs1$a$d;->r:Lcom/daaw/rs1$a;

    iput p2, p0, Lcom/daaw/rs1$a$d;->p:I

    iput-wide p3, p0, Lcom/daaw/rs1$a$d;->q:J

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public run()V
    .locals 4

    iget-object v0, p0, Lcom/daaw/rs1$a$d;->r:Lcom/daaw/rs1$a;

    invoke-static {v0}, Lcom/daaw/rs1$a;->a(Lcom/daaw/rs1$a;)Lcom/daaw/rs1;

    move-result-object v0

    iget v1, p0, Lcom/daaw/rs1$a$d;->p:I

    iget-wide v2, p0, Lcom/daaw/rs1$a$d;->q:J

    invoke-interface {v0, v1, v2, v3}, Lcom/daaw/rs1;->q(IJ)V

    return-void
.end method
