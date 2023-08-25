.class public final Lcom/daaw/k9$b;
.super Lcom/daaw/ls0$a;
.source ""


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/daaw/k9;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "b"
.end annotation


# instance fields
.field public a:Lcom/daaw/ls0$c;

.field public b:Lcom/daaw/ls0$b;


# direct methods
.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Lcom/daaw/ls0$a;-><init>()V

    return-void
.end method


# virtual methods
.method public a()Lcom/daaw/ls0;
    .locals 4

    new-instance v0, Lcom/daaw/k9;

    iget-object v1, p0, Lcom/daaw/k9$b;->a:Lcom/daaw/ls0$c;

    iget-object v2, p0, Lcom/daaw/k9$b;->b:Lcom/daaw/ls0$b;

    const/4 v3, 0x0

    invoke-direct {v0, v1, v2, v3}, Lcom/daaw/k9;-><init>(Lcom/daaw/ls0$c;Lcom/daaw/ls0$b;Lcom/daaw/k9$a;)V

    return-object v0
.end method

.method public b(Lcom/daaw/ls0$b;)Lcom/daaw/ls0$a;
    .locals 0

    iput-object p1, p0, Lcom/daaw/k9$b;->b:Lcom/daaw/ls0$b;

    return-object p0
.end method

.method public c(Lcom/daaw/ls0$c;)Lcom/daaw/ls0$a;
    .locals 0

    iput-object p1, p0, Lcom/daaw/k9$b;->a:Lcom/daaw/ls0$c;

    return-object p0
.end method
