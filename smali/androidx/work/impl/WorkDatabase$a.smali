.class public Landroidx/work/impl/WorkDatabase$a;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Lcom/daaw/ki1$c;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Landroidx/work/impl/WorkDatabase;->s(Landroid/content/Context;Ljava/util/concurrent/Executor;Z)Landroidx/work/impl/WorkDatabase;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = null
.end annotation


# instance fields
.field public final synthetic a:Landroid/content/Context;


# direct methods
.method public constructor <init>(Landroid/content/Context;)V
    .locals 0

    iput-object p1, p0, Landroidx/work/impl/WorkDatabase$a;->a:Landroid/content/Context;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public a(Lcom/daaw/ki1$b;)Lcom/daaw/ki1;
    .locals 2

    iget-object v0, p0, Landroidx/work/impl/WorkDatabase$a;->a:Landroid/content/Context;

    invoke-static {v0}, Lcom/daaw/ki1$b;->a(Landroid/content/Context;)Lcom/daaw/ki1$b$a;

    move-result-object v0

    iget-object v1, p1, Lcom/daaw/ki1$b;->b:Ljava/lang/String;

    invoke-virtual {v0, v1}, Lcom/daaw/ki1$b$a;->c(Ljava/lang/String;)Lcom/daaw/ki1$b$a;

    move-result-object v1

    iget-object p1, p1, Lcom/daaw/ki1$b;->c:Lcom/daaw/ki1$a;

    invoke-virtual {v1, p1}, Lcom/daaw/ki1$b$a;->b(Lcom/daaw/ki1$a;)Lcom/daaw/ki1$b$a;

    move-result-object p1

    const/4 v1, 0x1

    invoke-virtual {p1, v1}, Lcom/daaw/ki1$b$a;->d(Z)Lcom/daaw/ki1$b$a;

    new-instance p1, Lcom/daaw/l40;

    invoke-direct {p1}, Lcom/daaw/l40;-><init>()V

    invoke-virtual {v0}, Lcom/daaw/ki1$b$a;->a()Lcom/daaw/ki1$b;

    move-result-object v0

    invoke-virtual {p1, v0}, Lcom/daaw/l40;->a(Lcom/daaw/ki1$b;)Lcom/daaw/ki1;

    move-result-object p1

    return-object p1
.end method
