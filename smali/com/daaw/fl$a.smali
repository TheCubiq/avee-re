.class public Lcom/daaw/fl$a;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Lcom/daaw/ww1$a;


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
        "Lcom/daaw/ww1$a<",
        "Lcom/daaw/jh0$a;",
        "Ljava/lang/Boolean;",
        ">;"
    }
.end annotation


# instance fields
.field public final synthetic a:Lcom/daaw/fl;


# direct methods
.method public constructor <init>(Lcom/daaw/fl;)V
    .locals 0

    iput-object p1, p0, Lcom/daaw/fl$a;->a:Lcom/daaw/fl;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public a(Lcom/daaw/jh0$a;)Ljava/lang/Boolean;
    .locals 1

    iget-object v0, p0, Lcom/daaw/fl$a;->a:Lcom/daaw/fl;

    invoke-virtual {v0, p1}, Lcom/daaw/fl;->d(Lcom/daaw/jh0$a;)Z

    move-result p1

    invoke-static {p1}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object p1

    return-object p1
.end method

.method public bridge synthetic b(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, Lcom/daaw/jh0$a;

    invoke-virtual {p0, p1}, Lcom/daaw/fl$a;->a(Lcom/daaw/jh0$a;)Ljava/lang/Boolean;

    move-result-object p1

    return-object p1
.end method
