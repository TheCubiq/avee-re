.class public Lcom/daaw/d90$a;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Lcom/daaw/oc0;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/daaw/d90;-><init>(Lcom/daaw/ts1$a;Lcom/daaw/wc0;II)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = null
.end annotation


# instance fields
.field public final synthetic a:Lcom/daaw/d90;


# direct methods
.method public constructor <init>(Lcom/daaw/d90;)V
    .locals 0

    iput-object p1, p0, Lcom/daaw/d90$a;->a:Lcom/daaw/d90;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public a()V
    .locals 1

    iget-object v0, p0, Lcom/daaw/d90$a;->a:Lcom/daaw/d90;

    invoke-virtual {v0}, Lcom/daaw/d90;->b()Lcom/daaw/oc0;

    move-result-object v0

    if-eqz v0, :cond_0

    invoke-interface {v0}, Lcom/daaw/oc0;->a()V

    :cond_0
    return-void
.end method
