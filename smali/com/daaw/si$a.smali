.class public Lcom/daaw/si$a;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Lcom/daaw/oc0;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/daaw/si;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = "a"
.end annotation


# instance fields
.field public a:I

.field public final synthetic b:Lcom/daaw/si;


# direct methods
.method public constructor <init>(Lcom/daaw/si;I)V
    .locals 0

    iput-object p1, p0, Lcom/daaw/si$a;->b:Lcom/daaw/si;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput p2, p0, Lcom/daaw/si$a;->a:I

    return-void
.end method


# virtual methods
.method public a()V
    .locals 1

    iget-object v0, p0, Lcom/daaw/si$a;->b:Lcom/daaw/si;

    invoke-virtual {v0}, Lcom/daaw/si;->b()Lcom/daaw/oc0;

    move-result-object v0

    if-eqz v0, :cond_0

    invoke-interface {v0}, Lcom/daaw/oc0;->a()V

    :cond_0
    return-void
.end method
