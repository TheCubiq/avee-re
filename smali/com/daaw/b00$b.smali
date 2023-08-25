.class public Lcom/daaw/b00$b;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Ljava/lang/Runnable;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/daaw/b00;-><init>(Landroid/net/Uri;Lcom/daaw/mp;[Lcom/daaw/zz;ILcom/daaw/cp0$a;Lcom/daaw/b00$e;Lcom/daaw/l2;Ljava/lang/String;I)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = null
.end annotation


# instance fields
.field public final synthetic p:Lcom/daaw/b00;


# direct methods
.method public constructor <init>(Lcom/daaw/b00;)V
    .locals 0

    iput-object p1, p0, Lcom/daaw/b00$b;->p:Lcom/daaw/b00;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public run()V
    .locals 2

    iget-object v0, p0, Lcom/daaw/b00$b;->p:Lcom/daaw/b00;

    invoke-static {v0}, Lcom/daaw/b00;->v(Lcom/daaw/b00;)Z

    move-result v0

    if-nez v0, :cond_0

    iget-object v0, p0, Lcom/daaw/b00$b;->p:Lcom/daaw/b00;

    invoke-static {v0}, Lcom/daaw/b00;->y(Lcom/daaw/b00;)Lcom/daaw/qo0$a;

    move-result-object v0

    iget-object v1, p0, Lcom/daaw/b00$b;->p:Lcom/daaw/b00;

    invoke-interface {v0, v1}, Lcom/daaw/gb1$a;->n(Lcom/daaw/gb1;)V

    :cond_0
    return-void
.end method
