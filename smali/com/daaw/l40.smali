.class public final Lcom/daaw/l40;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Lcom/daaw/ki1$c;


# direct methods
.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public a(Lcom/daaw/ki1$b;)Lcom/daaw/ki1;
    .locals 4

    new-instance v0, Lcom/daaw/k40;

    iget-object v1, p1, Lcom/daaw/ki1$b;->a:Landroid/content/Context;

    iget-object v2, p1, Lcom/daaw/ki1$b;->b:Ljava/lang/String;

    iget-object v3, p1, Lcom/daaw/ki1$b;->c:Lcom/daaw/ki1$a;

    iget-boolean p1, p1, Lcom/daaw/ki1$b;->d:Z

    invoke-direct {v0, v1, v2, v3, p1}, Lcom/daaw/k40;-><init>(Landroid/content/Context;Ljava/lang/String;Lcom/daaw/ki1$a;Z)V

    return-object v0
.end method
