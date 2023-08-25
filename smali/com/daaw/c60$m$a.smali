.class public Lcom/daaw/c60$m$a;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Ljava/lang/Runnable;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/daaw/c60$m;->a(Landroid/content/Context;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = null
.end annotation


# instance fields
.field public final synthetic p:Landroid/content/Context;

.field public final synthetic q:Lcom/daaw/c60$m;


# direct methods
.method public constructor <init>(Lcom/daaw/c60$m;Landroid/content/Context;)V
    .locals 0

    iput-object p1, p0, Lcom/daaw/c60$m$a;->q:Lcom/daaw/c60$m;

    iput-object p2, p0, Lcom/daaw/c60$m$a;->p:Landroid/content/Context;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public run()V
    .locals 2

    iget-object v0, p0, Lcom/daaw/c60$m$a;->q:Lcom/daaw/c60$m;

    iget-object v0, v0, Lcom/daaw/c60$m;->a:Lcom/daaw/c60;

    iget-object v1, p0, Lcom/daaw/c60$m$a;->p:Landroid/content/Context;

    invoke-static {v0, v1}, Lcom/daaw/c60;->e(Lcom/daaw/c60;Landroid/content/Context;)V

    return-void
.end method
