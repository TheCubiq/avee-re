.class public Lcom/daaw/pl0$b;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Lcom/daaw/r40;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/daaw/pl0;-><init>()V
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
.field public final synthetic a:Lcom/daaw/pl0;


# direct methods
.method public constructor <init>(Lcom/daaw/pl0;)V
    .locals 0

    iput-object p1, p0, Lcom/daaw/pl0$b;->a:Lcom/daaw/pl0;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public bridge synthetic a(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, Lcom/daaw/de0;

    invoke-virtual {p0, p1}, Lcom/daaw/pl0$b;->b(Lcom/daaw/de0;)Lcom/daaw/i2;

    move-result-object p1

    return-object p1
.end method

.method public b(Lcom/daaw/de0;)Lcom/daaw/i2;
    .locals 0

    iget-object p1, p0, Lcom/daaw/pl0$b;->a:Lcom/daaw/pl0;

    invoke-static {p1}, Lcom/daaw/pl0;->m0(Lcom/daaw/pl0;)Lcom/daaw/i2;

    move-result-object p1

    return-object p1
.end method
