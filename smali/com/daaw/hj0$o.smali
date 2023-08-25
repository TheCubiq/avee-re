.class public Lcom/daaw/hj0$o;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Lcom/daaw/qw1$a;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/daaw/hj0;-><init>()V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Lcom/daaw/qw1$a<",
        "Lcom/daaw/sd0;",
        ">;"
    }
.end annotation


# instance fields
.field public final synthetic a:Lcom/daaw/hj0;


# direct methods
.method public constructor <init>(Lcom/daaw/hj0;)V
    .locals 0

    iput-object p1, p0, Lcom/daaw/hj0$o;->a:Lcom/daaw/hj0;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public a(Lcom/daaw/sd0;)V
    .locals 1

    iget-object v0, p0, Lcom/daaw/hj0$o;->a:Lcom/daaw/hj0;

    invoke-static {v0, p1}, Lcom/daaw/hj0;->n(Lcom/daaw/hj0;Lcom/daaw/sd0;)V

    return-void
.end method

.method public bridge synthetic b(Ljava/lang/Object;)V
    .locals 0

    check-cast p1, Lcom/daaw/sd0;

    invoke-virtual {p0, p1}, Lcom/daaw/hj0$o;->a(Lcom/daaw/sd0;)V

    return-void
.end method
