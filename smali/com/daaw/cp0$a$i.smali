.class public Lcom/daaw/cp0$a$i;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Ljava/lang/Runnable;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/daaw/cp0$a;->d(Lcom/daaw/cp0$c;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = null
.end annotation


# instance fields
.field public final synthetic p:Lcom/daaw/cp0;

.field public final synthetic q:Lcom/daaw/cp0$c;

.field public final synthetic r:Lcom/daaw/cp0$a;


# direct methods
.method public constructor <init>(Lcom/daaw/cp0$a;Lcom/daaw/cp0;Lcom/daaw/cp0$c;)V
    .locals 0

    iput-object p1, p0, Lcom/daaw/cp0$a$i;->r:Lcom/daaw/cp0$a;

    iput-object p2, p0, Lcom/daaw/cp0$a$i;->p:Lcom/daaw/cp0;

    iput-object p3, p0, Lcom/daaw/cp0$a$i;->q:Lcom/daaw/cp0$c;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public run()V
    .locals 4

    iget-object v0, p0, Lcom/daaw/cp0$a$i;->p:Lcom/daaw/cp0;

    iget-object v1, p0, Lcom/daaw/cp0$a$i;->r:Lcom/daaw/cp0$a;

    iget v2, v1, Lcom/daaw/cp0$a;->a:I

    iget-object v1, v1, Lcom/daaw/cp0$a;->b:Lcom/daaw/bp0$a;

    iget-object v3, p0, Lcom/daaw/cp0$a$i;->q:Lcom/daaw/cp0$c;

    invoke-interface {v0, v2, v1, v3}, Lcom/daaw/cp0;->C(ILcom/daaw/bp0$a;Lcom/daaw/cp0$c;)V

    return-void
.end method
