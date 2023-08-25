.class public Lcom/daaw/jm;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Lcom/daaw/v2;


# instance fields
.field public final a:Lcom/daaw/p2;


# direct methods
.method public constructor <init>(Lcom/daaw/p2;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/daaw/jm;->a:Lcom/daaw/p2;

    return-void
.end method


# virtual methods
.method public a(Ljava/lang/String;Landroid/os/Bundle;)V
    .locals 2

    iget-object v0, p0, Lcom/daaw/jm;->a:Lcom/daaw/p2;

    const-string v1, "clx"

    invoke-interface {v0, v1, p1, p2}, Lcom/daaw/p2;->b(Ljava/lang/String;Ljava/lang/String;Landroid/os/Bundle;)V

    return-void
.end method
