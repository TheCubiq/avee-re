.class public Lcom/daaw/cp0$a$a;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Ljava/lang/Runnable;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/daaw/cp0$a;->q()V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = null
.end annotation


# instance fields
.field public final synthetic p:Lcom/daaw/cp0;

.field public final synthetic q:Lcom/daaw/cp0$a;


# direct methods
.method public constructor <init>(Lcom/daaw/cp0$a;Lcom/daaw/cp0;)V
    .locals 0

    iput-object p1, p0, Lcom/daaw/cp0$a$a;->q:Lcom/daaw/cp0$a;

    iput-object p2, p0, Lcom/daaw/cp0$a$a;->p:Lcom/daaw/cp0;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public run()V
    .locals 3

    iget-object v0, p0, Lcom/daaw/cp0$a$a;->p:Lcom/daaw/cp0;

    iget-object v1, p0, Lcom/daaw/cp0$a$a;->q:Lcom/daaw/cp0$a;

    iget v2, v1, Lcom/daaw/cp0$a;->a:I

    iget-object v1, v1, Lcom/daaw/cp0$a;->b:Lcom/daaw/bp0$a;

    invoke-interface {v0, v2, v1}, Lcom/daaw/cp0;->r(ILcom/daaw/bp0$a;)V

    return-void
.end method
