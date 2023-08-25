.class public Lcom/daaw/v51$d;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Lcom/daaw/f0;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/daaw/v51;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Lcom/daaw/f0<",
        "Lcom/daaw/y31;",
        "Lcom/daaw/sr1;",
        ">;"
    }
.end annotation


# instance fields
.field public final synthetic a:Lcom/daaw/v51;


# direct methods
.method public constructor <init>(Lcom/daaw/v51;)V
    .locals 0

    iput-object p1, p0, Lcom/daaw/v51$d;->a:Lcom/daaw/v51;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public bridge synthetic a(Ljava/lang/Object;Ljava/lang/Object;)V
    .locals 0

    check-cast p1, Lcom/daaw/y31;

    check-cast p2, Lcom/daaw/sr1;

    invoke-virtual {p0, p1, p2}, Lcom/daaw/v51$d;->b(Lcom/daaw/y31;Lcom/daaw/sr1;)V

    return-void
.end method

.method public b(Lcom/daaw/y31;Lcom/daaw/sr1;)V
    .locals 0

    return-void
.end method
