.class public Lcom/daaw/xe0$b;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Lcom/daaw/r40;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/daaw/xe0;->Z(Lcom/daaw/s40;Lcom/daaw/s40;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Lcom/daaw/r40<",
        "Lcom/daaw/de0;",
        "Lcom/daaw/i2;",
        ">;"
    }
.end annotation


# instance fields
.field public final synthetic a:Lcom/daaw/xe0;


# direct methods
.method public constructor <init>(Lcom/daaw/xe0;)V
    .locals 0

    iput-object p1, p0, Lcom/daaw/xe0$b;->a:Lcom/daaw/xe0;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public bridge synthetic a(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, Lcom/daaw/de0;

    invoke-virtual {p0, p1}, Lcom/daaw/xe0$b;->b(Lcom/daaw/de0;)Lcom/daaw/i2;

    move-result-object p1

    return-object p1
.end method

.method public b(Lcom/daaw/de0;)Lcom/daaw/i2;
    .locals 1

    if-eqz p1, :cond_0

    iget-object v0, p0, Lcom/daaw/xe0$b;->a:Lcom/daaw/xe0;

    invoke-interface {p1}, Lcom/daaw/de0;->b()Lcom/daaw/de0$a;

    move-result-object p1

    invoke-interface {p1}, Lcom/daaw/de0$a;->b()Lcom/daaw/sg0;

    move-result-object p1

    invoke-interface {p1}, Lcom/daaw/sg0;->k()Lcom/daaw/i2;

    move-result-object p1

    iput-object p1, v0, Lcom/daaw/xe0;->H:Lcom/daaw/i2;

    :cond_0
    iget-object p1, p0, Lcom/daaw/xe0$b;->a:Lcom/daaw/xe0;

    iget-object p1, p1, Lcom/daaw/xe0;->H:Lcom/daaw/i2;

    return-object p1
.end method
