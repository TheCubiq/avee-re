.class public Lcom/daaw/fl$e;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Lcom/daaw/qw1$a;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/daaw/fl;-><init>()V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Lcom/daaw/qw1$a<",
        "Lcom/daaw/sd0;",
        ">;"
    }
.end annotation


# instance fields
.field public final synthetic a:Lcom/daaw/fl;


# direct methods
.method public constructor <init>(Lcom/daaw/fl;)V
    .locals 0

    iput-object p1, p0, Lcom/daaw/fl$e;->a:Lcom/daaw/fl;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public a(Lcom/daaw/sd0;)V
    .locals 1

    iget-object v0, p0, Lcom/daaw/fl$e;->a:Lcom/daaw/fl;

    invoke-static {v0}, Lcom/daaw/fl;->c(Lcom/daaw/fl;)Ljava/util/HashMap;

    move-result-object v0

    invoke-virtual {v0, p1}, Ljava/util/HashMap;->remove(Ljava/lang/Object;)Ljava/lang/Object;

    return-void
.end method

.method public bridge synthetic b(Ljava/lang/Object;)V
    .locals 0

    check-cast p1, Lcom/daaw/sd0;

    invoke-virtual {p0, p1}, Lcom/daaw/fl$e;->a(Lcom/daaw/sd0;)V

    return-void
.end method
