.class public final Lcom/daaw/ax7;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic p:Ljava/lang/String;

.field public final synthetic q:Ljava/lang/String;

.field public final synthetic r:Ljava/lang/Object;

.field public final synthetic s:J

.field public final synthetic t:Lcom/daaw/p28;


# direct methods
.method public constructor <init>(Lcom/daaw/p28;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Object;J)V
    .locals 0

    iput-object p1, p0, Lcom/daaw/ax7;->t:Lcom/daaw/p28;

    iput-object p2, p0, Lcom/daaw/ax7;->p:Ljava/lang/String;

    iput-object p3, p0, Lcom/daaw/ax7;->q:Ljava/lang/String;

    iput-object p4, p0, Lcom/daaw/ax7;->r:Ljava/lang/Object;

    iput-wide p5, p0, Lcom/daaw/ax7;->s:J

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 6

    iget-object v0, p0, Lcom/daaw/ax7;->t:Lcom/daaw/p28;

    iget-object v1, p0, Lcom/daaw/ax7;->p:Ljava/lang/String;

    iget-object v2, p0, Lcom/daaw/ax7;->q:Ljava/lang/String;

    iget-object v3, p0, Lcom/daaw/ax7;->r:Ljava/lang/Object;

    iget-wide v4, p0, Lcom/daaw/ax7;->s:J

    invoke-virtual/range {v0 .. v5}, Lcom/daaw/p28;->M(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Object;J)V

    return-void
.end method
