.class public Lcom/daaw/rs1$a$e;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Ljava/lang/Runnable;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/daaw/rs1$a;->h(IIIF)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = null
.end annotation


# instance fields
.field public final synthetic p:I

.field public final synthetic q:I

.field public final synthetic r:I

.field public final synthetic s:F

.field public final synthetic t:Lcom/daaw/rs1$a;


# direct methods
.method public constructor <init>(Lcom/daaw/rs1$a;IIIF)V
    .locals 0

    iput-object p1, p0, Lcom/daaw/rs1$a$e;->t:Lcom/daaw/rs1$a;

    iput p2, p0, Lcom/daaw/rs1$a$e;->p:I

    iput p3, p0, Lcom/daaw/rs1$a$e;->q:I

    iput p4, p0, Lcom/daaw/rs1$a$e;->r:I

    iput p5, p0, Lcom/daaw/rs1$a$e;->s:F

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public run()V
    .locals 5

    iget-object v0, p0, Lcom/daaw/rs1$a$e;->t:Lcom/daaw/rs1$a;

    invoke-static {v0}, Lcom/daaw/rs1$a;->a(Lcom/daaw/rs1$a;)Lcom/daaw/rs1;

    move-result-object v0

    iget v1, p0, Lcom/daaw/rs1$a$e;->p:I

    iget v2, p0, Lcom/daaw/rs1$a$e;->q:I

    iget v3, p0, Lcom/daaw/rs1$a$e;->r:I

    iget v4, p0, Lcom/daaw/rs1$a$e;->s:F

    invoke-interface {v0, v1, v2, v3, v4}, Lcom/daaw/rs1;->b(IIIF)V

    return-void
.end method
