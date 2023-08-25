.class public final Lcom/daaw/e33;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Lcom/daaw/m13;


# instance fields
.field public final synthetic a:Lcom/daaw/h33;


# direct methods
.method public constructor <init>(Lcom/daaw/h33;)V
    .locals 0

    iput-object p1, p0, Lcom/daaw/e33;->a:Lcom/daaw/h33;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final zza(Z)V
    .locals 0

    if-eqz p1, :cond_0

    iget-object p1, p0, Lcom/daaw/e33;->a:Lcom/daaw/h33;

    invoke-static {p1}, Lcom/daaw/h33;->g(Lcom/daaw/h33;)V

    return-void

    :cond_0
    iget-object p1, p0, Lcom/daaw/e33;->a:Lcom/daaw/h33;

    invoke-static {p1}, Lcom/daaw/h33;->h(Lcom/daaw/h33;)V

    return-void
.end method
