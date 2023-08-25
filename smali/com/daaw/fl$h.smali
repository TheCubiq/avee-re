.class public Lcom/daaw/fl$h;
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
        "Lcom/daaw/al;",
        ">;"
    }
.end annotation


# instance fields
.field public final synthetic a:Lcom/daaw/fl;


# direct methods
.method public constructor <init>(Lcom/daaw/fl;)V
    .locals 0

    iput-object p1, p0, Lcom/daaw/fl$h;->a:Lcom/daaw/fl;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public a(Lcom/daaw/al;)V
    .locals 0

    invoke-static {}, Lcom/daaw/el;->j()Lcom/daaw/el;

    move-result-object p1

    if-eqz p1, :cond_0

    invoke-virtual {p1}, Lcom/daaw/el;->k()V

    :cond_0
    return-void
.end method

.method public bridge synthetic b(Ljava/lang/Object;)V
    .locals 0

    check-cast p1, Lcom/daaw/al;

    invoke-virtual {p0, p1}, Lcom/daaw/fl$h;->a(Lcom/daaw/al;)V

    return-void
.end method
