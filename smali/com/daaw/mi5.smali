.class public final synthetic Lcom/daaw/mi5;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Ljava/util/concurrent/Callable;


# instance fields
.field public final synthetic a:Lcom/daaw/sl2;

.field public final synthetic b:Landroid/content/Context;


# direct methods
.method public synthetic constructor <init>(Lcom/daaw/sl2;Landroid/content/Context;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/daaw/mi5;->a:Lcom/daaw/sl2;

    iput-object p2, p0, Lcom/daaw/mi5;->b:Landroid/content/Context;

    return-void
.end method


# virtual methods
.method public final call()Ljava/lang/Object;
    .locals 2

    iget-object v0, p0, Lcom/daaw/mi5;->a:Lcom/daaw/sl2;

    iget-object v1, p0, Lcom/daaw/mi5;->b:Landroid/content/Context;

    invoke-virtual {v0}, Lcom/daaw/sl2;->c()Lcom/daaw/ol2;

    move-result-object v0

    invoke-interface {v0, v1}, Lcom/daaw/ol2;->zzg(Landroid/content/Context;)Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
