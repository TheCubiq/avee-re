.class public Lcom/daaw/ap$b;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Ljava/lang/Runnable;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/daaw/ap;-><init>(Lcom/daaw/wo;Landroid/net/Uri;Lcom/daaw/mp$a;Lcom/daaw/vv0$a;Lcom/daaw/vo$a;Lcom/daaw/wi;IJLjava/lang/Object;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = null
.end annotation


# instance fields
.field public final synthetic p:Lcom/daaw/ap;


# direct methods
.method public constructor <init>(Lcom/daaw/ap;)V
    .locals 0

    iput-object p1, p0, Lcom/daaw/ap$b;->p:Lcom/daaw/ap;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public run()V
    .locals 2

    iget-object v0, p0, Lcom/daaw/ap$b;->p:Lcom/daaw/ap;

    const/4 v1, 0x0

    invoke-static {v0, v1}, Lcom/daaw/ap;->s(Lcom/daaw/ap;Z)V

    return-void
.end method
