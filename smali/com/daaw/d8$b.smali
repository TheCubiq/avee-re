.class public final Lcom/daaw/d8$b;
.super Lcom/daaw/uf$a;
.source ""


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/daaw/d8;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "b"
.end annotation


# instance fields
.field public a:Lcom/daaw/uf$b;

.field public b:Lcom/daaw/z2;


# direct methods
.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Lcom/daaw/uf$a;-><init>()V

    return-void
.end method


# virtual methods
.method public a()Lcom/daaw/uf;
    .locals 4

    new-instance v0, Lcom/daaw/d8;

    iget-object v1, p0, Lcom/daaw/d8$b;->a:Lcom/daaw/uf$b;

    iget-object v2, p0, Lcom/daaw/d8$b;->b:Lcom/daaw/z2;

    const/4 v3, 0x0

    invoke-direct {v0, v1, v2, v3}, Lcom/daaw/d8;-><init>(Lcom/daaw/uf$b;Lcom/daaw/z2;Lcom/daaw/d8$a;)V

    return-object v0
.end method

.method public b(Lcom/daaw/z2;)Lcom/daaw/uf$a;
    .locals 0

    iput-object p1, p0, Lcom/daaw/d8$b;->b:Lcom/daaw/z2;

    return-object p0
.end method

.method public c(Lcom/daaw/uf$b;)Lcom/daaw/uf$a;
    .locals 0

    iput-object p1, p0, Lcom/daaw/d8$b;->a:Lcom/daaw/uf$b;

    return-object p0
.end method
