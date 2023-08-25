.class public Lcom/daaw/jv1$a;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Lcom/daaw/ww1$a;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/daaw/jv1;-><init>()V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Lcom/daaw/ww1$a<",
        "Lcom/daaw/ho;",
        "Ljava/lang/Boolean;",
        ">;"
    }
.end annotation


# instance fields
.field public final synthetic a:Lcom/daaw/jv1;


# direct methods
.method public constructor <init>(Lcom/daaw/jv1;)V
    .locals 0

    iput-object p1, p0, Lcom/daaw/jv1$a;->a:Lcom/daaw/jv1;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public a(Lcom/daaw/ho;)Ljava/lang/Boolean;
    .locals 1

    if-eqz p1, :cond_1

    invoke-virtual {p1}, Lcom/daaw/ho;->i()Z

    move-result v0

    if-eqz v0, :cond_0

    sget-object p1, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    return-object p1

    :cond_0
    const/4 v0, 0x0

    invoke-virtual {p1, v0}, Lcom/daaw/ho;->m(I)Z

    move-result p1

    if-eqz p1, :cond_1

    sget-object p1, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    return-object p1

    :cond_1
    sget-object p1, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    return-object p1
.end method

.method public bridge synthetic b(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, Lcom/daaw/ho;

    invoke-virtual {p0, p1}, Lcom/daaw/jv1$a;->a(Lcom/daaw/ho;)Ljava/lang/Boolean;

    move-result-object p1

    return-object p1
.end method
