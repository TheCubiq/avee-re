.class public Lcom/daaw/r41$e;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Lcom/daaw/hj$a;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/daaw/r41;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x9
    name = "e"
.end annotation


# instance fields
.field public final a:Lcom/daaw/v41;


# direct methods
.method public constructor <init>(Lcom/daaw/v41;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/daaw/r41$e;->a:Lcom/daaw/v41;

    return-void
.end method


# virtual methods
.method public a(Z)V
    .locals 0

    if-eqz p1, :cond_0

    iget-object p1, p0, Lcom/daaw/r41$e;->a:Lcom/daaw/v41;

    invoke-virtual {p1}, Lcom/daaw/v41;->d()V

    :cond_0
    return-void
.end method
