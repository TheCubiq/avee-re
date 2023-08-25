.class public final Lcom/daaw/g02;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic p:Lcom/daaw/h02;


# direct methods
.method public constructor <init>(Lcom/daaw/h02;)V
    .locals 0

    iput-object p1, p0, Lcom/daaw/g02;->p:Lcom/daaw/h02;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 3

    iget-object v0, p0, Lcom/daaw/g02;->p:Lcom/daaw/h02;

    iget-object v0, v0, Lcom/daaw/h02;->a:Lcom/daaw/i02;

    invoke-static {v0}, Lcom/daaw/i02;->r(Lcom/daaw/i02;)Lcom/daaw/k3$f;

    move-result-object v1

    invoke-static {v0}, Lcom/daaw/i02;->r(Lcom/daaw/i02;)Lcom/daaw/k3$f;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/Class;->getName()Ljava/lang/String;

    move-result-object v0

    const-string v2, " disconnecting because it was signed out."

    invoke-virtual {v0, v2}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    invoke-interface {v1, v0}, Lcom/daaw/k3$f;->disconnect(Ljava/lang/String;)V

    return-void
.end method
