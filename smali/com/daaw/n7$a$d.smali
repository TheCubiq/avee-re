.class public Lcom/daaw/n7$a$d;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Ljava/lang/Runnable;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/daaw/n7$a;->c(IJJ)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = null
.end annotation


# instance fields
.field public final synthetic p:I

.field public final synthetic q:J

.field public final synthetic r:J

.field public final synthetic s:Lcom/daaw/n7$a;


# direct methods
.method public constructor <init>(Lcom/daaw/n7$a;IJJ)V
    .locals 0

    iput-object p1, p0, Lcom/daaw/n7$a$d;->s:Lcom/daaw/n7$a;

    iput p2, p0, Lcom/daaw/n7$a$d;->p:I

    iput-wide p3, p0, Lcom/daaw/n7$a$d;->q:J

    iput-wide p5, p0, Lcom/daaw/n7$a$d;->r:J

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public run()V
    .locals 7

    iget-object v0, p0, Lcom/daaw/n7$a$d;->s:Lcom/daaw/n7$a;

    invoke-static {v0}, Lcom/daaw/n7$a;->a(Lcom/daaw/n7$a;)Lcom/daaw/n7;

    move-result-object v1

    iget v2, p0, Lcom/daaw/n7$a$d;->p:I

    iget-wide v3, p0, Lcom/daaw/n7$a$d;->q:J

    iget-wide v5, p0, Lcom/daaw/n7$a$d;->r:J

    invoke-interface/range {v1 .. v6}, Lcom/daaw/n7;->B(IJJ)V

    return-void
.end method
