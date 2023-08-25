.class public Lcom/daaw/rs1$a$b;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Ljava/lang/Runnable;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/daaw/rs1$a;->b(Ljava/lang/String;JJ)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = null
.end annotation


# instance fields
.field public final synthetic p:Ljava/lang/String;

.field public final synthetic q:J

.field public final synthetic r:J

.field public final synthetic s:Lcom/daaw/rs1$a;


# direct methods
.method public constructor <init>(Lcom/daaw/rs1$a;Ljava/lang/String;JJ)V
    .locals 0

    iput-object p1, p0, Lcom/daaw/rs1$a$b;->s:Lcom/daaw/rs1$a;

    iput-object p2, p0, Lcom/daaw/rs1$a$b;->p:Ljava/lang/String;

    iput-wide p3, p0, Lcom/daaw/rs1$a$b;->q:J

    iput-wide p5, p0, Lcom/daaw/rs1$a$b;->r:J

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public run()V
    .locals 7

    iget-object v0, p0, Lcom/daaw/rs1$a$b;->s:Lcom/daaw/rs1$a;

    invoke-static {v0}, Lcom/daaw/rs1$a;->a(Lcom/daaw/rs1$a;)Lcom/daaw/rs1;

    move-result-object v1

    iget-object v2, p0, Lcom/daaw/rs1$a$b;->p:Ljava/lang/String;

    iget-wide v3, p0, Lcom/daaw/rs1$a$b;->q:J

    iget-wide v5, p0, Lcom/daaw/rs1$a$b;->r:J

    invoke-interface/range {v1 .. v6}, Lcom/daaw/rs1;->f(Ljava/lang/String;JJ)V

    return-void
.end method
